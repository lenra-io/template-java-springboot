package io.lenra.app;

import java.util.function.Function;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import io.lenra.app.request.ViewRequest;


public class ViewHandler<D, P> {
    public final TypeReference<?> dataClass;
    public final TypeReference<?> propsClass;
    public final Function<ViewReq<D, P>, Object> handler;
    public ViewHandler(Function<ViewReq<D, P>, Object> handler, TypeReference dataClass, TypeReference propsClass) {
        this.dataClass = dataClass;
        this.propsClass = propsClass;
        this.handler = handler;
    }

    public Object handle(ViewRequest request) {
        ObjectMapper mapper = new ObjectMapper();
        D data = (D) mapper.convertValue(request.getData(), dataClass);
        P props = (P) mapper.convertValue(request.getProps(), propsClass);
        return handler.apply(new ViewReq<D, P>(data, props));
    }

    public static class ViewReq<D, P> {
        public D data;
        public P params;
        public ViewReq(D data, P params) {
            this.data = data;
            this.params = params;
        }
    }
}