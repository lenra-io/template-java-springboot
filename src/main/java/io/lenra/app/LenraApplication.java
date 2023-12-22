package io.lenra.app;

import java.util.Collections;
import java.util.Map;
import java.util.function.Function;

import io.lenra.app.request.ListenerRequest;
import io.lenra.app.request.ViewRequest;

public abstract class LenraApplication {
    private final Manifest manifest;
    private final Map<String, ViewHandler> views;
    private final Map<String, Function<ListenerRequest, Object>> listeners;

    public LenraApplication() {
        this.manifest = manifest();
        this.views = Collections.unmodifiableMap(views());
        this.listeners = Collections.unmodifiableMap(listeners());
    }

    public Manifest getManifest() {
        return manifest;
    }

    public Map<String, ViewHandler> getViews() {
        return views;
    }

    public Map<String, Function<ListenerRequest, Object>> getListeners() {
        return listeners;
    }

    abstract Manifest manifest();
    abstract Map<String, ViewHandler> views();
    abstract Map<String, Function<ListenerRequest, Object>> listeners();
}
