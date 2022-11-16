package io.lenra.template;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import io.lenra.application.Manifest;
import io.lenra.template.object.LenraBody;
import io.lenra.template.object.Listener;
import io.lenra.template.object.TemplateManifest;

@RestController
public class TemplateController {

	@PostMapping(value = "/function/{appUuid}", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	// TODO: take Lenra classes
	public Object index(@RequestBody(required = false) LenraBody body,
			@PathVariable(value = "appUuid") String appUuid) {
		if (body == null) {
			System.out.println("Handle manifest");
			return TemplateManifest.getManifest();
		} else {
			if (body.widget != null) {
				System.out.println("Handle widget: " + body.widget);
				return handleWidget(body);
			} else if (body.action != null) {
				System.out.println("Handle listener: " + body.action);
				handleListeners(body);
				return "ok";
			} else if (body.resource != null) {
				System.out.println("Handle resource: " + body.resource);
				return handleResources(body);
			} else {
				return "error";
			}
		}

	}

	public Object handleWidget(LenraBody body) {
		System.out.println(body.toString());
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

	public String handleResources(LenraBody body) {
		return "";
	}

}