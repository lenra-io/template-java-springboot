package io.lenra.app.api;

import java.util.HashMap;
import java.util.Map;

public abstract class AbstractDataApi extends ApiPart {
    AbstractDataApi(Api api) {
        super(api);
    }
    
    private Map<String, Collection>  collections = new HashMap<>();
    // private Map<String, TypedCollection<String>> typedCollections = new HashMap<>();

    public abstract Collection coll(String name);
    // public abstract <D extends Data> TypedCollection<D, Class<D>> coll(Class<D> collClass);

    // public static <T extends Data> T fromJson(Class<T> dataClass, Data data) {
    //     // Class<T> result = new Class<T>();
    // }
}
