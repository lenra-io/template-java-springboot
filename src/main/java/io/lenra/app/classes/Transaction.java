package io.lenra.app.classes;

import java.util.HashMap;
import java.util.Map;

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

    // TODO: Fix the following methods

    public void commit() {
        // api.getClient().POST("/app-api/v1/data/transaction/commit", headers());
    }

    public void abort() {
        // api.getClient().POST("/app-api/v1/data/transaction/abort", headers());
    }
}
