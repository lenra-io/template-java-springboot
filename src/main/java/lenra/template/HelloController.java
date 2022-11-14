package lenra.template;

import java.util.Map;

import org.springframework.boot.json.GsonJsonParser;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

import lenra.template.object.TemplateManifest;

@RestController
public class HelloController {
	private TemplateManifest manifest = new TemplateManifest();

	@PostMapping(value = "/", consumes = "application/json", produces = "application/json")
	public Object index(@RequestBody String payload) {
		System.out.println(payload);
		JsonObject body = new Gson().fromJson(payload, JsonObject.class);
		if (body.has("widget")) {
			return handleWidget(body);
		} else if (body.has("action")) {
			handleListeners(body);
			return "ok";
		} else if (body.has("resource")) {
			return handleResources(body);
		} else {
			return manifest;
		}
	}

	public Object handleWidget(JsonObject body) {
		String widget_name = body.get("widget").getAsString();
		JsonArray data = body.get("data").getAsJsonArray();
		JsonObject props = body.get("props").getAsJsonObject();
		JsonObject context = body.get("context").getAsJsonObject();

		return this.manifest.widgets.get(widget_name).render(data, props, context);
	}

	public void handleListeners(JsonObject body) {
		String action = body.get("action").getAsString();
		JsonObject props = body.get("props").getAsJsonObject();
		JsonObject event = body.get("event").getAsJsonObject();
		JsonObject api = body.get("api").getAsJsonObject();

		this.manifest.listeners.get(action).run(props, event, api);
	}

	public String handleResources(JsonObject body) {
		return "";
	}

}