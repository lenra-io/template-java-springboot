package io.lenra.app.classes;

import java.util.List;
import java.util.stream.Stream;

import io.lenra.api.internal.ApiException;

public class TypedCollection<D extends Data, T extends Class<D>> {
    private final Collection collection;
    private final T collClass;

    public TypedCollection(AbstractDataApi api, T collClass) {
        this.collection = new Collection(api, DataApi.collectionName(collClass));
        this.collClass = collClass;
    }

    public D getDoc(String id) throws ApiException {
        Object resp = collection.getDoc(id);
        return AbstractDataApi.fromJson(collClass, resp);
    }

    public D createDoc(D doc) throws ApiException {
        Object resp = collection.createDoc(doc);
        return AbstractDataApi.fromJson(collClass, resp);
    }

    public D updateDoc(D doc) throws ApiException {
        Object resp = collection.updateDoc(doc);
        return AbstractDataApi.fromJson(collClass, resp);
    }

    public void deleteDoc(D doc) throws ApiException {
        collection.deleteDoc(doc._id);
    }

    public List<D> find(Object query) throws ApiException {
        Object resp = collection.find(query, new Object());
        // return resp.map((d) => AbstractDataApi.fromJson(collClass, d));
        return null;
    }

    public void updateMany(Object filter, Object update) throws ApiException {
        collection.updateMany(filter, update);
    }
}
