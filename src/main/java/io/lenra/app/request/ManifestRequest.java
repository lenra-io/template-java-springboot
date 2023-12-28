package io.lenra.app.request;

import io.lenra.app.LenraApplication;
import io.lenra.app.Manifest;
import io.lenra.app.classes.Api;

public class ManifestRequest extends AppRequest<Manifest> {

    @Override
    public Manifest handle(LenraApplication application) {
        return application.getManifest();
    }

}
