package io.lenra.app.view.lenra;

import java.util.List;

import io.lenra.app.annotation.AppView;
import io.lenra.app.components.Flex;
import io.lenra.app.components.Flex.CrossAxisAlignment;
import io.lenra.app.components.LenraComponent;
import io.lenra.app.components.View;
import io.lenra.app.components.styles.Direction;
import io.lenra.app.view.ViewName;

public class Main {
	@AppView(prefix = "lenra.")
	public static LenraComponent main() {
		return new Flex(
				List.of(
						new View(ViewName.LENRA_MENU),
						new View(ViewName.LENRA_HOME)))
				.direction(Direction.VERTICAL)
				.scroll(true)
				.spacing(4d)
				.crossAxisAlignment(CrossAxisAlignment.CENTER);
	}
}
