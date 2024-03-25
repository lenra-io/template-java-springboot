package io.lenra.app.listener;

import java.util.Map;

import io.lenra.api.internal.ApiException;
import io.lenra.app.annotation.AppListener;
import io.lenra.app.api.Api;
import io.lenra.app.data.Counter;

public class SystemEvents {
	@AppListener
	public static void onEnvStart(Api api) throws ApiException {
		createCounter(api, "global");
	}

	@AppListener
	public static void onUserFirstJoin(Api api) throws ApiException {
		createCounter(api, "@me");
	}

	private static void createCounter(Api api, String user) throws ApiException {
		var coll = api.data().coll(Counter.class);
		var counters = coll.find(Map.of("user", user));
		if (counters.isEmpty()) {
			coll.createDoc(new Counter(user, 0));
		}
	}
}
