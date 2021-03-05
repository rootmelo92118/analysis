package com.google.android.gms.measurement.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.os.Bundle;

/* renamed from: com.google.android.gms.measurement.internal.ao */
final class C2158ao implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C2166aw f8091a;

    /* renamed from: b */
    private final /* synthetic */ long f8092b;

    /* renamed from: c */
    private final /* synthetic */ Bundle f8093c;

    /* renamed from: d */
    private final /* synthetic */ Context f8094d;

    /* renamed from: e */
    private final /* synthetic */ C2295r f8095e;

    /* renamed from: f */
    private final /* synthetic */ BroadcastReceiver.PendingResult f8096f;

    C2158ao(C2156am amVar, C2166aw awVar, long j, Bundle bundle, Context context, C2295r rVar, BroadcastReceiver.PendingResult pendingResult) {
        this.f8091a = awVar;
        this.f8092b = j;
        this.f8093c = bundle;
        this.f8094d = context;
        this.f8095e = rVar;
        this.f8096f = pendingResult;
    }

    public final void run() {
        long a = this.f8091a.mo14318c().f8049h.mo14265a();
        long j = this.f8092b;
        if (a > 0 && (j >= a || j <= 0)) {
            j = a - 1;
        }
        if (j > 0) {
            this.f8093c.putLong("click_timestamp", j);
        }
        this.f8093c.putString("_cis", "referrer broadcast");
        C2166aw.m10527a(this.f8094d, (C2290m) null).mo14323h().mo14395a("auto", "_cmp", this.f8093c);
        this.f8095e.mo14838x().mo14841a("Install campaign recorded");
        if (this.f8096f != null) {
            this.f8096f.finish();
        }
    }
}
