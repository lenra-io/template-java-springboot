package io.lenra.app;

import java.util.function.Function;

import com.fasterxml.jackson.core.type.ResolvedType;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;

import io.lenra.app.request.ViewRequest;


public class ViewHandler<D, P> {
    public final DataMapper<D> dataClass;
    public final DataMapper<P> propsClass;
    public final Function<ViewReq<D, P>, Object> handler;
    public ViewHandler(Function<ViewReq<D, P>, Object> handler, DataMapper<D> dataClass, DataMapper<P> propsClass) {
        this.dataClass = dataClass;
        this.propsClass = propsClass;
        this.handler = handler;
    }

    public Object handle(ViewRequest request) {
        ObjectMapper mapper = new ObjectMapper();
        D data = dataClass.map(mapper, request.getData());
        P props = propsClass.map(mapper, request.getProps());
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

    public static interface DataMapper<T> {
        public T map(ObjectMapper mapper, Object data);
    }

    public static class JavaTypeDataMapper<T> implements DataMapper<T> {
        public final JavaType type;
        public JavaTypeDataMapper(JavaType type) {
            this.type = type;
        }
        public T map(ObjectMapper mapper, Object data) {
            return mapper.convertValue(data, type);
        }
    }

    public static class TypeReferenceDataMapper<T> implements DataMapper<T> {
        public final TypeReference<T> type;
        public TypeReferenceDataMapper(TypeReference<T> type) {
            this.type = type;
        }
        public T map(ObjectMapper mapper, Object data) {
            return mapper.convertValue(data, type);
        }
    }
}