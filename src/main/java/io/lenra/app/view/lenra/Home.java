package io.lenra.app.view.lenra;

import static io.lenra.app.components.Components.flex;
import static io.lenra.app.components.Components.view;
import java.util.List;
import java.util.Map;
import io.lenra.app.annotation.AppView;
import io.lenra.app.components.Flex.CrossAxisAlignment;
import io.lenra.app.components.Flex.MainAxisAlignment;
import io.lenra.app.components.Flex;
import io.lenra.app.components.LenraComponent;
import io.lenra.app.components.View;
import io.lenra.app.components.styles.Direction;
import io.lenra.app.components.view.definitions.Find;
import io.lenra.app.view.ViewName;

public class Home {
	@AppView(prefix = "lenra.")
	public static LenraComponent home() {
		return new Flex(List.of(
				new View(ViewName.LENRA_COUNTER)
						.find(new Find(io.lenra.app.data.Counter.class, Map.of("user", "@me")))
						.props(new Counter.Props("My personnal counter")),
				new View(ViewName.LENRA_COUNTER)
						.find(new Find(io.lenra.app.data.Counter.class, Map.of("user", "global")))
						.props(new Counter.Props("The common counter"))))
				.direction(Direction.VERTICAL)
				.spacing(16d)
				.mainAxisAlignment(MainAxisAlignment.SPACE_EVENLY)
				.crossAxisAlignment(CrossAxisAlignment.CENTER);
	}
}
