package io.lenra.app.classes;

import org.springframework.beans.factory.annotation.Autowired;

import io.lenra.api.internal.ApiClient;
import lombok.Data;

@Data
public class Api {
    String url;
    String token;
    DataApi data;

    public Api(Object request) {
        this.data = new DataApi(this);

        ApiClient client = new ApiClient();
        client.setBasePath(url);
    }
}
