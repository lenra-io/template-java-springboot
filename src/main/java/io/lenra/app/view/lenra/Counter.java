package io.lenra.app.view.lenra;

import java.util.List;
import java.util.Map;

import io.lenra.app.annotation.AppView;
import io.lenra.app.components.Button;
import io.lenra.app.components.Flex;
import io.lenra.app.components.Listener;
import io.lenra.app.components.Text;
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
		return new Flex(
				List.of(
						new Text(props.getText() + ": " + counter.getCount()),
						new Button("+")
								.onPressed(new Listener(ListenerName.INCREMENT.value, Map.of("id", counter.getId())))))
				.spacing(16d)
				.mainAxisAlignment(Flex.MainAxisAlignment.SPACE_EVENLY)
				.crossAxisAlignment(Flex.CrossAxisAlignment.CENTER);
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
