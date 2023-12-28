package io.lenra.app.controller;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import io.lenra.app.LenraApplication;
import io.lenra.app.request.AppRequest;

@RestController
public class ServerController {
    @Autowired
    private LenraApplication app;

    @PostMapping(value = "/", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public Object index(@RequestBody AppRequest<?> request) {
        // TODO: Find a way to pass the api to the handle when it is a listener request
        Type type = request.getClass().getGenericSuperclass();

        if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            Type[] typeArguments = parameterizedType.getActualTypeArguments();

            if (typeArguments.length > 0) {
                Type typeArgument = typeArguments[0];
                System.out.println("Type of the wildcard: " + typeArgument.getTypeName());
            }
        }
        
        return request.handle(app);
    }
}