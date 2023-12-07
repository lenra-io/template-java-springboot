package io.lenra.templatejavaspringboot.controller;

import org.springframework.core.io.InputStreamResource;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import io.lenra.templatejavaspringboot.api.LenraBody;

@RestController
public class ServerController {
    public static final String RESOURCE_TYPE = "resource";
    public static final String LISTENER_TYPE = "listener";
    public static final String VIEW_TYPE = "view";
    public static final String MANIFEST_TYPE = "manifest";

    @PostMapping(value = "/*", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public Object index(@RequestBody LenraBody body) {
        if (body.resource != null) {
            return this.handleResource(body);
        } else if (body.listener != null) {
            return null;
            // return this.handleListener(body);
        } else if (body.view != null) {
            return null;
            // return this.handleView(body);
        } else {
            return null;
            // return this.handleManifest();
        }
    }

    private Object handleResource(LenraBody body) {
        InputStreamResource resource = new InputStreamResource(
                ServerController.class.getResourceAsStream("/" + body.resource));

        return ResponseEntity.ok()
                .contentType(MediaType.APPLICATION_OCTET_STREAM)
                .body(resource);
    }
}