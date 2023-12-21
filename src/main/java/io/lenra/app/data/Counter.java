package io.lenra.app.data;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=false)
public class Counter extends io.lenra.app.data.Data {
    private int count;
    private String user;
}
