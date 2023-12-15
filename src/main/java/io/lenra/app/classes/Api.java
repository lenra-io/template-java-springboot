package io.lenra.app.classes;

import io.lenra.app.request.ListenerRequest;
import lombok.Data;

@Data
public class Api {
    String url;
    String token;
    DataApi data;

    ListenerRequest req;
    Object client;
}
