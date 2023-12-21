package io.lenra.app.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.lenra.app.LenraApplication;
import io.lenra.app.classes.Api;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=false)
public class ListenerRequest extends AppRequest<Object> {
     @JsonProperty(required = true)
    private String listener;
    private Object props;

    public Api api;

    @Override
    public Object handle(LenraApplication application) {
        var listener = application.getListeners().get(this.getListener());
        return listener.apply(this);
    }
}
