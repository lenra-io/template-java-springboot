package io.lenra.app.data;

import lombok.Data;

@Data
public class Counter extends io.lenra.app.data.Data {
    private int count;
    private String user;
}
