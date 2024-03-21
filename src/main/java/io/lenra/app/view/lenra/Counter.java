package io.lenra.app.view.lenra;

import static io.lenra.app.components.Components.button;
import static io.lenra.app.components.Components.flex;
import static io.lenra.app.components.Components.text;
import java.util.List;
import java.util.Map;
import io.lenra.app.annotation.AppView;
import io.lenra.app.components.Flex;
import io.lenra.app.components.Flex.CrossAxisAlignment;
import io.lenra.app.components.Flex.MainAxisAlignment;
import io.lenra.app.components.Listener;
import io.lenra.app.listener.ListenerName;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;

public class Counter {
  @AppView(prefix = "lenra.")
  public static Flex counter(List<io.lenra.app.data.Counter> counters, Props props) {
    var counter = counters.get(0);
    return flex(
        List.of(text(props.getText() + ": " + counter.getCount()),
            button("+",
                b -> b.setOnPressed(new Listener(ListenerName.INCREMENT.value, Map.of("id", counter.getId()))))),
        f -> {
          f.setSpacing(16d);
          f.setMainAxisAlignment(MainAxisAlignment.SPACE_EVENLY);
          f.setCrossAxisAlignment(CrossAxisAlignment.CENTER);
        });
  }

  @Getter
  @Setter
  @AllArgsConstructor
  @NoArgsConstructor
  public static class Props {
    @NonNull
    private String text;
  }
}
