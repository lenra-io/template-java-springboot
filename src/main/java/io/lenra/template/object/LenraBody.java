package io.lenra.template.object;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

public class LenraBody {
    public String widget;
    public String action;
    public String resource;
    public JsonArray data;
    public JsonObject props;
    public JsonObject context;
    public JsonObject event;
    public JsonObject api;

    public LenraBody() {
    }

    @Override
    public String toString() {
        return "{" +
                " widget='" + widget + "'" +
                ", action='" + action + "'" +
                ", resource='" + resource + "'" +
                ", data='" + data + "'" +
                ", props='" + props + "'" +
                ", context='" + context + "'" +
                ", event='" + event + "'" +
                ", api='" + api + "'" +
                "}";
    }

}
