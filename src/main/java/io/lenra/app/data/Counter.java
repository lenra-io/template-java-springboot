package io.lenra.app.data;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper=false)
public class Counter extends Data {
    private String user;
    private int count;

    public Counter(String user, int count) {
        this.user = user;
        this.count = count;
    }
}
