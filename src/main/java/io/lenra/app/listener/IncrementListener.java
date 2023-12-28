package io.lenra.app.listener;

import io.lenra.api.internal.ApiException;
import io.lenra.app.classes.Api;
import io.lenra.app.request.ListenerRequest;

public class IncrementListener {
    public IncrementListener() {
    }

    public static IncrementListener handle(ListenerRequest<Object> request) {
        // Execute the listener with the request's props.
        // Where is the listener executed from ?

        // TODO: How can I use the API object here ?

        System.out.println("IncrementListener.handle() called");

        Object query = new Object();

        try {
            Object response = request.getApi().getData().coll("test").find(query, query);
            System.out.println(response.toString());
        } catch (ApiException e) {
            e.printStackTrace();
        }

        return null;
    }
}
