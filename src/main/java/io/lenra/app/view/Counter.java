package io.lenra.app.view;

import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonInclude;
import io.lenra.app.annotation.AppView;
import io.lenra.app.components.Listener;
import lombok.AllArgsConstructor;
import lombok.Getter;

public class Counter {
	@AppView
	public static CounterView counter(List<io.lenra.app.data.Counter> counters) {
		var counter = counters.get(0);
		return new CounterView(counter.getCount(),
				new Listener("increment")
						.props(Map.of("_id", counter.getId())));
	}

	@JsonInclude(JsonInclude.Include.NON_NULL)
	@Getter
	@AllArgsConstructor
	public static class CounterView {
		private int value;
		private Listener onIncrement;
	}

}
