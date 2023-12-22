package io.lenra.app.controller;

import java.io.IOException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JacksonException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;

import io.lenra.app.LenraApplication;
import io.lenra.app.request.AppRequest;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Controller
public class HelloWorldController {
    @PostMapping(value = "/hello", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public Object index(@RequestBody TestViewRequest request) {
        // String view = (String) request.get("view");
        // System.out.println("view: " + view);
        // ObjectMapper mapper = new ObjectMapper();
        // var viewRequest = mapper.convertValue(request, mapper.getTypeFactory().constructParametricType(ViewRequest.class, ArrayList<Counter>, Object>>() {});
        System.out.println("request: " + request);
        return request.handle(null);
    }

    @Data
    @JsonDeserialize(using = ViewRequestDeserializer.class)
    public static class TestViewRequest {
        @JsonProperty(required = true)
        private String view;
        private Object data;
        // private Object props;

        public Object handle(LenraApplication application) {
            System.out.println("ViewRequest.handle");
            System.out.println("data: " + this.data);
            System.out.println("data class: " + this.data.getClass());
            // System.out.println("props: " + this.props);
            return Map.of("test", "coucou");
        }
    }

    @Component
    public static class ViewRequestDeserializer extends StdDeserializer<TestViewRequest> {
        @Autowired
        private LenraApplication app;

        public ViewRequestDeserializer() {
            super(TestViewRequest.class);
        }

        @Override
        public TestViewRequest deserialize(JsonParser p, DeserializationContext ctxt) throws IOException, JacksonException {
            JsonNode node = p.getCodec().readTree(p);
            String view = node.get("view").asText();
            System.out.println("view: " + view);
            // TODO: récupération du type de data et props
            System.out.println("app: " + app);
            var handler = app.getViews().get(view);
            if (handler == null) {
                throw new NullPointerException("View not found: " + view);
            }
            Type superClass = handler.getClass().getGenericSuperclass();
            System.out.println("handler: " + superClass);
            System.out.println("handler: " + List.of(((ParameterizedType) superClass).getActualTypeArguments()));
            System.out.println("data: " + node.get("data"));
            var ret = new TestViewRequest();
            ret.setView(view);
            ret.setData(handler.dataClass.map(new ObjectMapper(), node.get("data")));
            return ret;
        }
    }
}
