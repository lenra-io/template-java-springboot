package io.lenra.app.view.lenra;

import static io.lenra.app.components.Components.flex;
import static io.lenra.app.components.Components.view;
import java.util.List;
import java.util.Map;
import io.lenra.app.annotation.AppView;
import io.lenra.app.components.Flex.CrossAxisAlignment;
import io.lenra.app.components.Flex.MainAxisAlignment;
import io.lenra.app.components.LenraComponent;
import io.lenra.app.components.styles.Direction;
import io.lenra.app.components.view.definitions.Find;
import io.lenra.app.view.ViewName;

public class Home {
  @AppView(prefix = "lenra.")
  public static LenraComponent home() {
    return flex(List.of(view(ViewName.LENRA_COUNTER.value, v -> {
      v.setFind(new Find("counter", Map.of("user", "@me")));
      v.setProps(new Counter.Props("My personnal counter"));
    }), view(ViewName.LENRA_COUNTER.value, v -> {
      v.setFind(new Find("counter", Map.of("user", "global")));
      v.setProps(new Counter.Props("The common counter"));
    })), f -> {
      f.setDirection(Direction.VERTICAL);
      f.setSpacing(16d);
      f.setMainAxisAlignment(MainAxisAlignment.SPACE_EVENLY);
      f.setCrossAxisAlignment(CrossAxisAlignment.CENTER);
    });
  }
}
