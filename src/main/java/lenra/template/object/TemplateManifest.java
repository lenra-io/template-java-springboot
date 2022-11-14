package lenra.template.object;

import java.util.HashMap;
import java.util.Map;

import lenra.application.Manifest;

public class TemplateManifest {
    public static Map<String, Widget> widgets = new HashMap<String, Widget>();
    public static Map<String, Listener> listeners = new HashMap<String, Listener>();
    public String rootWidget;

    public TemplateManifest() {
        for (Widget widget : Manifest.widgets_list) {
            widgets.put(widget.toString(), widget);
        }

        for (Listener listener : Manifest.listeners_list) {
            listeners.put(listener.toString(), listener);
        }

        rootWidget = Manifest.rootWidget;
    }

}
