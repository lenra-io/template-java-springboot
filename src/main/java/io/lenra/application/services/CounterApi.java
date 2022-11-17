package io.lenra.application.services;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.web.client.RestTemplate;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

import io.lenra.application.Resources.Counter;

public class CounterApi {
    private final RestTemplate restTemplate;

    public CounterApi() {
        this.restTemplate = new RestTemplateBuilder().build();
    }

    public Counter getCounter(JsonObject api, String id) {
        String url = api.get("url").getAsString() + "/app/colls/counter/docs/" + id;
        return this.restTemplate.exchange(url, HttpMethod.GET, createHeader(api, ""), Counter.class)
                .getBody();
    }

    public JsonObject createCounter(JsonObject api, JsonObject newCounter) {
        Gson gson = new Gson();
        String url = api.get("url").getAsString() + "/app/colls/counter/docs";
        return this.restTemplate
                .exchange(url, HttpMethod.POST, createHeader(api, gson.toJson(newCounter, JsonObject.class)),
                        JsonObject.class)
                .getBody();
    }

    public Counter updateCounter(JsonObject api, Counter newCounter) {
        Gson gson = new Gson();
        String url = api.get("url").getAsString() + "/app/colls/counter/docs/" + newCounter.getId();
        return this.restTemplate
                .exchange(url, HttpMethod.PUT, createHeader(api, gson.toJson(newCounter, Counter.class)), Counter.class)
                .getBody();
    }

    public JsonArray executeQuery(JsonObject api, String coll, JsonObject query) {
        String url = api.get("url").getAsString() + "/app/colls/" + coll + "/docs/find";
        return this.restTemplate.exchange(url, HttpMethod.POST, createHeader(api, query.toString()), JsonArray.class)
                .getBody();
    }

    private HttpEntity<String> createHeader(JsonObject api, String body) {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.add("Authorization", "Bearer " + api.get("token").getAsString());
        HttpEntity<String> entity = new HttpEntity<String>(body, headers);
        return entity;
    }
}
