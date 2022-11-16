package io.lenra.application.Resources;

public class Counter {
    private String datastore;
    private int _id;
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

    public int getId() {
        return this._id;
    }

    public String toString() {
        return "{\"datastore\" => " + datastore + ", \"_id\" => " + _id + ", \"count\" => " + count + ", \"user\" => "
                + user + "}";
    }

}
