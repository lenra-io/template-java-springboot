package io.lenra.app;

import java.lang.reflect.Type;
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
import io.lenra.api.Manifest;
import io.lenra.api.Route;
import io.lenra.api.components.View;
import io.lenra.api.components.view.definitions.Find;
import io.lenra.api.internal.ApiException;
import io.lenra.app.api.Collection;
import io.lenra.app.data.Counter;
import io.lenra.app.handlers.HandlerMap;
import io.lenra.app.handlers.ListenerHandler;
import io.lenra.app.handlers.ViewHandler;
import io.lenra.app.handlers.ViewHandlerNew;
import io.lenra.app.listener.IncrementListener;
import io.lenra.app.request.ListenerRequest;
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

	// @Override
	// protected Map<String, ViewHandler<?, ?, ?>> views() {
	// return Map.of("counter", new ViewHandler<>(CounterView::handle) {}, "lenra.counter",
	// new ViewHandler<>(CounterView::handle) {});
	// }

	// @Override
	// protected HandlerMap viewsNew() {
	// var map = new HandlerMap();
	// // map.put("counter", (List<Counter> data, Map<String, Object> props) -> data.get(0));

	// var handler = CounterView.handleNew;

	// System.out.println("Handler: " + handler);
	// System.out.println("Handler class: " + handler.getClass());
	// Type[] interfaces = handler.getClass().getGenericInterfaces();
	// Type superClass = handler.getClass().getGenericSuperclass();
	// System.out.println("Handler superClass: " + superClass);
	// System.out.println("Handler interfaces: " + java.util.List.of(interfaces));
	// // if (superClass instanceof Class<?>) { // sanity check, should never happen
	// // throw new IllegalArgumentException("Internal error: ViewHandler constructed without actual
	// type information");
	// // }
	// // Type[] typeArgs = ((java.lang.reflect.ParameterizedType)
	// superClass).getActualTypeArguments();
	// Type handlerInterface = interfaces[0];
	// System.out.println("Handler interface: " + handlerInterface);
	// System.out.println("Handler sub interfaces: " +
	// List.of(((Class<ViewHandlerNew>)handlerInterface).getGenericInterfaces()));
	// System.out.println("Handler sub class: " +
	// ((Class<ViewHandlerNew>)handlerInterface).getGenericSuperclass());
	// Type[] typeArgs = ((java.lang.reflect.ParameterizedType)
	// handlerInterface).getActualTypeArguments();
	// System.out.println("Type args: " + typeArgs[0] + ", " + typeArgs[1]);
	// // var data = mapper.convertValue(request.getData(), handler.dataType);
	// // var props = mapper.convertValue(request.getProps(), handler.propsType);
	// // System.out.println("Data: " + data);
	// // System.out.println("Props: " + props);

	// map.put("counter2", handler);
	// return map;
	// }

	// // private <T> Class<T> getType() {
	// // ObjectMapper mapper = new ObjectMapper();
	// // var l = new ArrayList<T>();
	// // var t = ((ParameterizedType)
	// l.getClass().getGenericSuperclass()).getActualTypeArguments()[0];
	// // System.out.println(t);
	// // var type = mapper.constructType(t);
	// // return (Class<T>) t;
	// // }

	// // private static class Test<T> {
	// // List<T> value;
	// // Test(T test) {
	// // this.value = new ArrayList<T>();
	// // this.value.add(test);
	// // }

	// // void displayType() {
	// // System.out.println(value);
	// // System.out.println(value.getClass());
	// // System.out.println(value.getClass().getGenericSuperclass());
	// // System.err.println(((ParameterizedType)
	// // value.getClass().getGenericSuperclass()).getActualTypeArguments()[0]);
	// // }
	// // }

	// @Override
	// protected Map<String, ListenerHandler<?>> listeners() {
	// return Map.of("increment", new ListenerHandler<>(IncrementListener::handle) {}, "onEnvStart",
	// new ListenerHandler<>((ListenerRequest<Object> props) -> {
	// try {
	// createCounter(props, "global");
	// } catch (ApiException e) {
	// e.printStackTrace();
	// }
	// return null;
	// }) {}, "onUserFirstJoin", new ListenerHandler<>((ListenerRequest<Object> props) -> {
	// try {
	// createCounter(props, "@me");
	// } catch (ApiException e) {
	// e.printStackTrace();
	// }
	// return null;
	// }) {}, "onSessionStart", new ListenerHandler<>((ListenerRequest<Object> props) -> null) {});
	// }

	// void createCounter(ListenerRequest<Object> request, String user) throws ApiException {
	// var counterColl = request.getApi().data().coll(Counter.class);
	// List<Map<String, Object>> counters = counterColl.find(Map.of("user", user), Map.of());

	// if (counters.size() == 0) {
	// counterColl.createDoc(new Counter(user, 0));
	// }
	// }

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
