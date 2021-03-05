package com.crashlytics.android.core;

import java.io.File;
import java.io.IOException;
import p000a.p001a.p002a.p003a.C0139c;
import p000a.p001a.p002a.p003a.C0153l;
import p000a.p001a.p002a.p003a.p004a.p011f.C0107a;

class CrashlyticsFileMarker {
    private final C0107a fileStore;
    private final String markerName;

    public CrashlyticsFileMarker(String str, C0107a aVar) {
        this.markerName = str;
        this.fileStore = aVar;
    }

    public boolean create() {
        try {
            return getMarkerFile().createNewFile();
        } catch (IOException e) {
            C0153l g = C0139c.m394g();
            g.mo291e(CrashlyticsCore.TAG, "Error creating marker: " + this.markerName, e);
            return false;
        }
    }

    public boolean isPresent() {
        return getMarkerFile().exists();
    }

    public boolean remove() {
        return getMarkerFile().delete();
    }

    private File getMarkerFile() {
        return new File(this.fileStore.mo254a(), this.markerName);
    }
}
