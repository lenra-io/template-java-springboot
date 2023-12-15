package io.lenra.app.classes;

import java.util.HashMap;
import java.util.Map;

public abstract class AbstractDataApi extends ApiPart {
    public AbstractDataApi(Api api) {
        super(api);
    }

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
