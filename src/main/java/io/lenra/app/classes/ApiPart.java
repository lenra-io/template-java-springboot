package io.lenra.app.classes;

import java.util.HashMap;
import java.util.Map;

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
