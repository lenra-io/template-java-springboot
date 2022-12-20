package io.lenra.template;

import java.io.FileNotFoundException;

import org.springframework.core.io.InputStreamResource;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import io.lenra.application.Manifest;
import io.lenra.template.object.LenraBody;
import io.lenra.template.object.Listener;
import io.lenra.template.object.TemplateManifest;

@RestController
public class TemplateController {

	@PostMapping(value = "/**", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public Object index(@RequestBody(required = false) LenraBody body)
			throws FileNotFoundException {
		if (body != null) {
			if (body.widget != null) {
				System.out.println("Handle widget: " + body.widget);
				Object widget = handleWidget(body);
				System.out.println("return widget: " + widget.toString());
				return widget;
			} else if (body.action != null) {
				System.out.println("Handle listener: " + body.action);
				handleListeners(body);
				return "ok";
			} else if (body.resource != null) {
				System.out.println("Handle resource: " + body.resource);
				return handleResources(body);
			}
		}
		System.out.println("Handle manifest");
		return TemplateManifest.getManifest();

	}

	public Object handleWidget(LenraBody body) {
		Object widget = Manifest.widgets.get(body.widget).render(body.data, body.props, body.context);
		return widget;
	}

	public Object handleListeners(LenraBody body) {
		Listener listener = Manifest.listeners.get(body.action);
		if (listener != null) {
			listener.run(body.props, body.event, body.api);
			return "ok";
		} else {
			return "Error";
		}
	}

	public ResponseEntity<InputStreamResource> handleResources(LenraBody body) throws FileNotFoundException {
		InputStreamResource resource = new InputStreamResource(
				TemplateController.class.getResourceAsStream("/" + body.resource));
		System.out.println(resource);
		return ResponseEntity.ok()
				.contentType(MediaType.APPLICATION_OCTET_STREAM)
				.body(resource);

	}

}