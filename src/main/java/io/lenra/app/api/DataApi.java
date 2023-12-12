package io.lenra.app.api;

public class DataApi extends AbstractDataApi {

    DataApi(Api api) {
        super(api);
    }

    @Override
    public Collection coll(String name) {
        throw new UnsupportedOperationException("Unimplemented method 'coll'");
    }
    
}
