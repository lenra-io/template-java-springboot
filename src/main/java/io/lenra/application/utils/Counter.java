package io.lenra.application.Resources;

public class Counter {
    private String _id;
    private int count;
    private String user;

    public Counter(int count, String user) {
        this.count = count;
        this.user = user;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getCount() {
        return this.count;
    }

    public String getId() {
        return this._id;
    }

    public String toString() {
        return "{\"_id\" => " + _id + ", \"count\" => " + count
                + ", \"user\" => "
                + user + "}";
    }

}
