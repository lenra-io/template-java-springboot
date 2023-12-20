package io.lenra.app.classes;

import io.lenra.app.request.ListenerRequest;
import io.lenra.api.internal.ApiClient;
import lombok.Data;

@Data
public class Api {
    String url;
    String token;
    DataApi data;

    ListenerRequest req;
    ApiClient client;

    public Api(ListenerRequest request, ApiClient client) {
        this.url = request.getUrl();
        this.token = request.getToken();
        this.data = new DataApi(this);
    }
}
