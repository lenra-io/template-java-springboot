package io.lenra.app.listener;

import java.util.Map;
import io.lenra.api.internal.ApiException;
import io.lenra.app.annotation.AppListener;
import io.lenra.app.api.Api;
import io.lenra.app.data.Counter;

public class Increment {
	@AppListener
	public static void increment(Api api, Map<String, Object> props) throws ApiException {
		var coll = api.data().coll(Counter.class);
		var counters = coll.find(Map.of("_id", props.get("id")));
		var counter = counters.get(0);
		counter.setCount(counter.getCount() + 1);
		coll.updateDoc(counter);
	}
}
