package io.lenra.app;

import java.util.List;
import java.util.Map;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import io.lenra.app.annotation.AppManifest;
import io.lenra.app.components.View;
import io.lenra.app.components.view.definitions.Find;
import io.lenra.app.exception.NotFoundException;
import io.lenra.app.view.ViewName;
import jakarta.inject.Inject;

@RestController
@SpringBootApplication
public class App {
	@Inject
	private RequestHandler handler;

	@AppManifest
	public static Manifest manifest() {
		return new Manifest()
				.json(
						new Exposer(
								List.of(
										new Route(
												"/counter/global",
												new View(ViewName.LENRA_COUNTER.value)
														.find(new Find("counter", Map.of("user", "global"))))
												.roles(List.of("guest", "user")),
										new Route(
												"/counter/me",
												new View(ViewName.LENRA_COUNTER.value)
														.find(new Find("counter", Map.of("user", "@me")))))));
	}

	@PostMapping(value = "/**", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
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
