package io.lenra.app.classes;

import java.util.Map;

import io.lenra.api.internal.ApiException;
import io.lenra.api.internal.client.model.DataDocument;
import io.lenra.api.internal.client.model.FindDocumentsRequest;
import io.lenra.api.internal.client.model.UpdateManyDocumentsRequest;

public class Collection {
    private final AbstractDataApi api;
    private final String name;

    public Collection(AbstractDataApi api, String name) {
        this.api = api;
        this.name = name;
    }

    public Object getDoc(String id) throws ApiException {
        return api.getApi().getDocumentById(this.name, id);
    }

    public Object createDoc(Object doc) throws ApiException {
        return api.getApi().createDocument(this.name, doc);
    }

    public Object updateDoc(Object doc) throws ApiException {
        DataDocument dataDoc = (DataDocument) doc;
        return api.getApi().updateDocumentById(this.name, dataDoc.getId(), dataDoc);
    }

    public Object deleteDoc(String id) throws ApiException {
        return api.getApi().deleteDocumentById(this.name, id);
    }

    public Object find(Map<String, Object> query, Map<String, Object> projection) throws ApiException {
        FindDocumentsRequest req = new FindDocumentsRequest();
        req.setQuery(query);
        req.setProjection(projection);

        return api.getApi().findDocuments(this.name, req);
    }

    public Object updateMany(Object filter, Object update) throws ApiException {
        UpdateManyDocumentsRequest req = new UpdateManyDocumentsRequest();
        req.setFilter((Map<String, Object>) filter);
        req.setUpdate((Map<String, Object>) update);

        return api.getApi().updateManyDocuments(this.name, req);
    }
}