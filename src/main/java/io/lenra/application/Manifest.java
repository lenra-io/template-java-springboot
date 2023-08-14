package io.lenra.application;

import java.util.HashMap;
import java.util.Map;

import io.lenra.application.listeners.Increment;
import io.lenra.application.listeners.OnEnvStart;
import io.lenra.application.listeners.OnUserFirstJoin;
import io.lenra.application.widgets.*;
import io.lenra.template.object.Listener;
import io.lenra.template.object.Widget;;

public class Manifest {
        public static Map<String, Widget> widgets = new HashMap<String, Widget>() {
                {
                        put("userData", new UserData());
                        put("menu", new Menu());
                        put("main", new Main());
                        put("home", new Home());
                        put("counter", new Counter());
                }
        };

        public static Map<String, Listener> listeners = new HashMap<String, Listener>() {
                {
                        put("increment", new Increment());
                        put("onEnvStart", new OnEnvStart());
                        put("onUserFirstJoin", new OnUserFirstJoin());
                }
        };

        public static String rootWidget = "main";

}
