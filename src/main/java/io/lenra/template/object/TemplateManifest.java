package io.lenra.template.object;

import com.google.gson.JsonObject;

import io.lenra.application.Manifest;

public class TemplateManifest {

    public static JsonObject getManifest() {
        JsonObject root = new JsonObject();
        root.addProperty("rootWidget", Manifest.rootWidget);
        JsonObject manifest = new JsonObject();
        manifest.add("manifest", root);
        return manifest;
    }

}
