package lenra.application;

import lenra.application.listeners.increment;
import lenra.application.listeners.onEnvStart;
import lenra.application.listeners.onUserFirstJoin;
import lenra.application.widgets.*;

import lenra.template.object.Listener;
import lenra.template.object.Widget;;

public class Manifest {
    public static Widget[] widgets_list = { (Widget) new userData(), (Widget) new menu(), (Widget) new main(),
            (Widget) new home(), (Widget) new counter() };
    public static Listener[] listeners_list = { (Listener) new increment(), (Listener) new onEnvStart(),
            (Listener) new onUserFirstJoin() };
    public static String rootWidget = "main";

}
