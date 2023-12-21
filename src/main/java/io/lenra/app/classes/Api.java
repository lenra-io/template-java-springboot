package io.lenra.app.classes;

import io.lenra.app.request.ListenerRequest;
import io.lenra.api.internal.ApiClient;
import lombok.Data;

@Data
public class Api {
    String url;
    String token;
    DataApi data;

    ApiClient client;

    public Api(Object request, ApiClient client) {
        this.data = new DataApi(this);
        this.client = client;
    }

    public Api(Object request) {
        this.data = new DataApi(this);

        ApiClient client = new ApiClient();
        client.setBasePath(url);

        this.client = client;
    }
}
