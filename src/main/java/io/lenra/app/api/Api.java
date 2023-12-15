import java.util.HashMap;
import java.util.Map;

public interface Api {
    String getUrl();
    String getToken();
    DataApi getData();
}

public abstract class ApiPart {
    private final Api api;

    public ApiPart(Api api) {
        this.api = api;
    }

    protected Map<String, String> headers() {
        Map<String, String> headers = new HashMap<>();
        headers.put("Authorization", "Bearer " + api.getToken());
        return headers;
    }
}

public class Collection {
    private final AbstractDataApi api;
    private final String name;

    public Collection(AbstractDataApi api, String name) {
        this.api = api;
        this.name = name;
    }

    public Object getDoc(String id) {
        Map<String, Object> params = new HashMap<>();
        params.put("coll", name);
        params.put("id", id);

        Map<String, Object> request = new HashMap<>();
        request.put("params", params);
        request.put("headers", api.headers());

        return api.getClient().GET("/app-api/v1/data/colls/{coll}/docs/{id}", request);
    }

    public Object createDoc(Object doc) {
        Map<String, Object> params = new HashMap<>();
        params.put("coll", name);

        Map<String, Object> request = new HashMap<>();
        request.put("params", params);
        request.put("body", doc);
        request.put("headers", api.headers());

        return api.getClient().POST("/app-api/v1/data/colls/{coll}/docs", request);
    }

    public Object updateDoc(Object doc) {
        Map<String, Object> params = new HashMap<>();
        params.put("coll", name);
        params.put("id", doc._id);

        Map<String, Object> request = new HashMap<>();
        request.put("params", params);
        request.put("body", doc);
        request.put("headers", api.headers());

        return api.getClient().PUT("/app-api/v1/data/colls/{coll}/docs/{id}", request);
    }

    public Object deleteDoc(String id) {
        Map<String, Object> params = new HashMap<>();
        params.put("coll", name);
        params.put("id", id);

        Map<String, Object> request = new HashMap<>();
        request.put("params", params);
        request.put("headers", api.headers());

        return api.getClient().DELETE("/app-api/v1/data/colls/{coll}/docs/{id}", request);
    }

    public Object find(Object query, Object projection) {
        Map<String, Object> params = new HashMap<>();
        params.put("coll", name);

        Map<String, Object> body = new HashMap<>();
        body.put("query", query);
        body.put("projection", projection);

        Map<String, Object> request = new HashMap<>();
        request.put("params", params);
        request.put("body", body);
        request.put("headers", api.headers());

        return api.getClient().POST("/app-api/v1/data/colls/{coll}/find", request);
    }

    public Object updateMany(Object filter, Object update) {
        Map<String, Object> params = new HashMap<>();
        params.put("coll", name);

        Map<String, Object> body = new HashMap<>();
        body.put("filter", filter);
        body.put("update", update);

        Map<String, Object> request = new HashMap<>();
        request.put("params", params);
        request.put("body", body);
        request.put("headers", api.headers());

        return api.getClient().POST("/app-api/v1/data/colls/{coll}/updateMany", request);
    }
}

public class TypedCollection<D extends Data, T extends Class<D>> {
    private final Collection collection;
    private final T collClass;

    public TypedCollection(AbstractDataApi api, T collClass) {
        this.collection = new Collection(api, DataApi.collectionName(collClass));
        this.collClass = collClass;
    }

    public D getDoc(String id) {
        Object resp = collection.getDoc(id);
        return AbstractDataApi.fromJson(collClass, resp.data);
    }

    public D createDoc(D doc) {
        Object resp = collection.createDoc(doc);
        return AbstractDataApi.fromJson(collClass, resp.data);
    }

    public D updateDoc(D doc) {
        Object resp = collection.updateDoc(doc);
        return AbstractDataApi.fromJson(collClass, resp.data);
    }

    public void deleteDoc(D doc) {
        collection.deleteDoc(doc._id);
    }

    public List<D> find(Object query) {
        Object resp = collection.find(query, {});
        return resp.data.map((d) => AbstractDataApi.fromJson(collClass, d));
    }

    public void updateMany(Object filter, Object update) {
        collection.updateMany(filter, update);
    }
}

public abstract class AbstractDataApi extends ApiPart {
    private final Map<String, Collection> collections = new HashMap<>();
    private final Map<String, TypedCollection<Data, Class<Data>>> typedCollections = new HashMap<>();

    public Collection coll(String name) {
        if (!collections.containsKey(name)) {
            collections.put(name, new Collection(this, name));
        }
        return collections.get(name);
    }

    public TypedCollection<D, Class<D>> coll<D extends Data>(Class<D> collClass) {
        String name = DataApi.collectionName(collClass);
        if (!typedCollections.containsKey(name)) {
            typedCollections.put(name, new TypedCollection<>(this, collClass));
        }
        return typedCollections.get(name);
    }

    public static <T extends Data> T fromJson(Class<T> dataClass, Object data) {
        T result = new dataClass();
        for (String index : data.keySet()) {
            if (result.containsKey(index)) {
                result.put(index, data.get(index));
            }
        }
        return result;
    }
}

public class DataApi extends AbstractDataApi {
    private final Api api;

    public DataApi(Api api) {
        super(api);
        this.api = api;
    }

    public Transaction startTransaction() {
        Object resp = api.getClient().POST("/app-api/v1/data/transaction", headers());
        return new Transaction(api, resp.data);
    }

    public static String dataCollection(Data data) {
        return collectionName(data.getClass());
    }

    public static String collectionName(Class<? extends Data> dataClass) {
        return dataClass.getSimpleName().toLowerCase();
    }
}

public class Transaction extends AbstractDataApi {
    private final Api api;
    private final String token;

    public Transaction(Api api, String token) {
        super(api);
        this.api = api;
        this.token = token;
    }

    protected Map<String, String> headers() {
        Map<String, String> headers = new HashMap<>();
        headers.put("Authorization", "Bearer " + token);
        return headers;
    }

    public void commit() {
        api.getClient().POST("/app-api/v1/data/transaction/commit", headers());
    }

    public void abort() {
        api.getClient().POST("/app-api/v1/data/transaction/abort", headers());
    }
}
