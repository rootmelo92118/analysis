package com.crashlytics.android.beta;

import java.util.Collections;
import java.util.Map;
import p000a.p001a.p002a.p003a.C0139c;
import p000a.p001a.p002a.p003a.C0150i;
import p000a.p001a.p002a.p003a.p004a.p006b.C0028m;
import p000a.p001a.p002a.p003a.p004a.p006b.C0036r;

public class Beta extends C0150i<Boolean> implements C0028m {
    public static final String TAG = "Beta";

    public String getIdentifier() {
        return "com.crashlytics.sdk.android:beta";
    }

    public String getVersion() {
        return "1.2.10.27";
    }

    public static Beta getInstance() {
        return (Beta) C0139c.m385a(Beta.class);
    }

    /* access modifiers changed from: protected */
    public Boolean doInBackground() {
        C0139c.m394g().mo281a(TAG, "Beta kit initializing...");
        return true;
    }

    public Map<C0036r.C0037a, String> getDeviceIdentifiers() {
        return Collections.emptyMap();
    }
}
