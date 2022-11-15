package io.lenra.application;

import io.lenra.application.listeners.Increment;
import io.lenra.application.listeners.OnEnvStart;
import io.lenra.application.listeners.OnUserFirstJoin;
import io.lenra.application.widgets.*;
import io.lenra.template.object.Listener;
import io.lenra.template.object.Widget;;

public class Manifest {
        public static Widget[] widgets_list = { (Widget) new UserData(), (Widget) new Menu(), (Widget) new Main(),
                        (Widget) new Home(), (Widget) new Counter() };
        public static Listener[] listeners_list = { (Listener) new Increment(), (Listener) new OnEnvStart(),
                        (Listener) new OnUserFirstJoin() };
        public static String rootWidget = "main";

}
