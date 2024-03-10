package io.lenra.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import io.lenra.api.AppRequest;
import jakarta.inject.Inject;

@RestController
@SpringBootApplication
public class MyApp {
	@Inject
	private RequestHandler handler;

	@PostMapping(value = "/**", produces = MediaType.APPLICATION_JSON_VALUE,
			consumes = MediaType.APPLICATION_JSON_VALUE)
	public Object index(@RequestBody AppRequest request) {
		System.err.println(request);
		return handler.handle(request);
	}

	public static void main(String[] args) {
		SpringApplication.run(MyApp.class, args);
	}
}
