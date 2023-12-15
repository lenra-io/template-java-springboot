package io.lenra.app.classes;

import java.util.List;

public class TypedCollection<D extends Data, T extends Class<D>> {
    private final Collection collection;
    private final T collClass;

    public TypedCollection(AbstractDataApi api, T collClass) {
        this.collection = new Collection(api, DataApi.collectionName(collClass));
        this.collClass = collClass;
    }

    public D getDoc(String id) {
        Object resp = collection.getDoc(id);
        return AbstractDataApi.fromJson(collClass, resp.data);
    }

    public D createDoc(D doc) {
        Object resp = collection.createDoc(doc);
        return AbstractDataApi.fromJson(collClass, resp.data);
    }

    public D updateDoc(D doc) {
        Object resp = collection.updateDoc(doc);
        return AbstractDataApi.fromJson(collClass, resp.data);
    }

    public void deleteDoc(D doc) {
        collection.deleteDoc(doc._id);
    }

    public List<D> find(Object query) {
        Object resp = collection.find(query, {});
        return resp.data.map((d) => AbstractDataApi.fromJson(collClass, d));
    }

    public void updateMany(Object filter, Object update) {
        collection.updateMany(filter, update);
    }
}
