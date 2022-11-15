package io.lenra.application.Resources;

public class Counter {
    private int count;
    private String user;

    public void setCount(int count) {
        this.count = count;
    }

    public int getCount() {
        return this.count;
    }

    public String toString() {
        return "{count = " + count + ", user = " + user + "}";
    }

}
