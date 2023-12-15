package io.lenra.app.classes;

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
