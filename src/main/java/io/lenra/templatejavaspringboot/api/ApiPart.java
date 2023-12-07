package io.lenra.templatejavaspringboot.api;

import com.google.gson.JsonObject;

public abstract class ApiPart {
    public Api api;

    ApiPart(Api api) {
        this.api = api;
    }

    public JsonObject headers(){
        JsonObject jo = new JsonObject();
        jo.addProperty("Authorization", String.format("Bearer %s", this.api.token));
        return jo;
    }
}
