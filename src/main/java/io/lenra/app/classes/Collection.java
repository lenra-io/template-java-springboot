package io.lenra.app.classes;

import java.util.HashMap;
import java.util.Map;

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