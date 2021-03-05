package com.crashlytics.android.core;

import android.content.Context;
import p000a.p001a.p002a.p003a.p004a.p006b.C0020i;

class ResourceUnityVersionProvider implements UnityVersionProvider {
    private final Context context;
    private final UnityVersionProvider fallback;
    private boolean hasRead = false;
    private String unityVersion;

    public ResourceUnityVersionProvider(Context context2, UnityVersionProvider unityVersionProvider) {
        this.context = context2;
        this.fallback = unityVersionProvider;
    }

    public String getUnityVersion() {
        if (!this.hasRead) {
            this.unityVersion = C0020i.m83n(this.context);
            this.hasRead = true;
        }
        if (this.unityVersion != null) {
            return this.unityVersion;
        }
        if (this.fallback != null) {
            return this.fallback.getUnityVersion();
        }
        return null;
    }
}
