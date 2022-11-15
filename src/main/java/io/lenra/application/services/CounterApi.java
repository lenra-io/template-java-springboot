package io.lenra.application.services;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.web.client.RestTemplate;

import com.google.gson.JsonObject;

import io.lenra.application.Resources.Counter;

public class CounterApi {
    private final RestTemplate restTemplate;

    public CounterApi() {
        this.restTemplate = new RestTemplateBuilder().build();
    }

    public Counter getCounter(JsonObject api, int id) {
        String url = api.get("url").getAsString() + "/app/colls/Counter/docs/" + id;
        return this.restTemplate.exchange(url, HttpMethod.GET, createHeader(api), Counter.class).getBody();
    }

    public Counter createCounter(JsonObject api, int id, Counter newCounter) {
        String url = api.get("url").getAsString() + "/app/colls/Counter/docs";
        return this.restTemplate.exchange(url, HttpMethod.POST, createHeader(api), Counter.class).getBody();
    }

    public void updateCounter(JsonObject api, int id, Counter newCounter) {
        String url = api.get("url").getAsString() + "/app/colls/Counter/docs";
        return this.restTemplate.put(url, newCounter);
    }

    private HttpEntity<String> createHeader(JsonObject api) {
        HttpHeaders headers = new HttpHeaders();
        headers.add("Authorization", "Bearer " + api.get("token").getAsString());
        HttpEntity<String> entity = new HttpEntity<String>("parameters", headers);
        return entity;
    }
}
