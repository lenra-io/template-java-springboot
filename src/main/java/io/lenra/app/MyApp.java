package io.lenra.app;

import java.util.List;
import java.util.Map;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import io.lenra.api.AppRequest;
import io.lenra.api.Exposer;
import io.lenra.api.Route;
import io.lenra.api.Manifest;
import io.lenra.api.components.View;
import io.lenra.api.components.view.definitions.Find;
import jakarta.inject.Named;

@Named
@RestController
@SpringBootApplication
public class MyApp extends LenraApplication {
	@Override
	protected Manifest manifest() {
		return new Manifest(null,
				new Exposer(null, List.of(new Route("/counter/global", new View("counter") {
					{
						setFind(new Find("counter", Map.of("user", "global")));
					}
				}, List.of("guest", "user")), new Route("/counter/me", new View("counter") {
					{
						setFind(new Find("counter", Map.of("user", "@me")));
					}
				}))));
	}

	///////////// Spring Boot app

	@PostMapping(value = "/**", produces = MediaType.APPLICATION_JSON_VALUE,
			consumes = MediaType.APPLICATION_JSON_VALUE)
	public Object index(@RequestBody AppRequest request) {
		System.err.println(request);
		return handle(request);
		// try {
		// return request.handle(this);
		// } catch (NullPointerException e) {
		// throw new ResponseStatusException(
		// HttpStatus.NOT_FOUND, e.getMessage(), e);

		// }
	}

	public static void main(String[] args) {
		SpringApplication.run(MyApp.class, args);
	}
}
