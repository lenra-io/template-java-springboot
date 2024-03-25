package io.lenra.app.view.lenra;

import java.util.List;
import java.util.Map;

import io.lenra.app.annotation.AppView;
import io.lenra.app.components.Flex;
import io.lenra.app.components.Flex.CrossAxisAlignment;
import io.lenra.app.components.Flex.MainAxisAlignment;
import io.lenra.app.components.LenraComponent;
import io.lenra.app.components.View;
import io.lenra.app.components.styles.Direction;
import io.lenra.app.components.view.definitions.Find;
import io.lenra.app.data.Counter;
import io.lenra.app.data.Data;
import io.lenra.app.view.ViewName;

public class Home {
	private static final Class<? extends Data> COUNTER = Counter.class;

	@AppView(prefix = "lenra.")
	public static LenraComponent home() {
		return new Flex(List.of(
				new View(ViewName.LENRA_COUNTER)
						.find(new Find(COUNTER, Map.of("user", "@me")))
						.props(new CounterView.Props("My personnal counter")),
				new View(ViewName.LENRA_COUNTER)
						.find(new Find(COUNTER, Map.of("user", "global")))
						.props(new CounterView.Props("The common counter"))))
				.direction(Direction.VERTICAL)
				.spacing(16d)
				.mainAxisAlignment(MainAxisAlignment.SPACE_EVENLY)
				.crossAxisAlignment(CrossAxisAlignment.CENTER);
	}
}
