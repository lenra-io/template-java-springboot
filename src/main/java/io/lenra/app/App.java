package io.lenra.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import io.lenra.api.AppRequest;
import io.lenra.app.exception.NotFoundException;
import jakarta.inject.Inject;

@RestController
@SpringBootApplication
public class App {
	@Inject
	private RequestHandler handler;

	@PostMapping(value = "/**", produces = MediaType.APPLICATION_JSON_VALUE,
			consumes = MediaType.APPLICATION_JSON_VALUE)
	public Object index(@RequestBody AppRequest request) {
		System.err.println(request);
		var result = handler.handle(request);
		if (result instanceof RequestHandler.Resource) {
			var resource = (RequestHandler.Resource) result;
			return ResponseEntity.ok().contentType(MediaType.valueOf(resource.getMimetype()))
					.body(resource.getData());
		}
		return result;
	}

	@ExceptionHandler(NotFoundException.class)
	public ResponseEntity<Object> handleResourceNotFoundException(NotFoundException ex) {
		return new ResponseEntity<>(ex.getMessage(), HttpStatus.NOT_FOUND);
	}

	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}
}
