package io.lenra.app.listener;

import io.lenra.app.request.ListenerRequest;

public class IncrementListener {
    public IncrementListener() {
    }

    public static IncrementListener handle(ListenerRequest request) {
        // Execute the listener with the request's props. 
        // Where is the listener executed from ?

        // TODO: How can I use the API object here ? 

        System.out.println("IncrementListener.handle() called");

        return null;
    }
}
