package com.crashlytics.android.core;

import java.io.InputStream;
import p000a.p001a.p002a.p003a.p004a.p010e.C0104g;

class CrashlyticsPinningInfoProvider implements C0104g {
    private final PinningInfoProvider pinningInfo;

    public long getPinCreationTimeInMillis() {
        return -1;
    }

    public CrashlyticsPinningInfoProvider(PinningInfoProvider pinningInfoProvider) {
        this.pinningInfo = pinningInfoProvider;
    }

    public InputStream getKeyStoreStream() {
        return this.pinningInfo.getKeyStoreStream();
    }

    public String getKeyStorePassword() {
        return this.pinningInfo.getKeyStorePassword();
    }

    public String[] getPins() {
        return this.pinningInfo.getPins();
    }
}
