package com.crashlytics.android.answers;

import android.content.Context;
import java.util.Map;
import java.util.UUID;
import p000a.p001a.p002a.p003a.p004a.p006b.C0020i;
import p000a.p001a.p002a.p003a.p004a.p006b.C0036r;

class SessionMetadataCollector {
    private final Context context;
    private final C0036r idManager;
    private final String versionCode;
    private final String versionName;

    public SessionMetadataCollector(Context context2, C0036r rVar, String str, String str2) {
        this.context = context2;
        this.idManager = rVar;
        this.versionCode = str;
        this.versionName = str2;
    }

    public SessionEventMetadata getMetadata() {
        Map<C0036r.C0037a, String> h = this.idManager.mo70h();
        String m = C0020i.m82m(this.context);
        String d = this.idManager.mo66d();
        String g = this.idManager.mo69g();
        return new SessionEventMetadata(this.idManager.mo65c(), UUID.randomUUID().toString(), this.idManager.mo64b(), this.idManager.mo72j(), h.get(C0036r.C0037a.FONT_TOKEN), m, d, g, this.versionCode, this.versionName);
    }
}
