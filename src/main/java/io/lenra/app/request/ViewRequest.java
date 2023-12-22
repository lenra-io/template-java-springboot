package io.lenra.app.request;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import io.lenra.app.LenraApplication;
import io.lenra.app.data.Counter;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class ViewRequest extends AppRequest<Object> {
    @JsonProperty(required = true)
    private String view;
    private Object data;
    private Object props;

    @Override
    public Object handle(LenraApplication application) {
        ObjectMapper mapper = new ObjectMapper();
        this.data = mapper.convertValue(this.data, new TypeReference<List<Counter>>(){});
        var view = application.getViews().get(this.getView());
        return view.handle(this);
    }
}
