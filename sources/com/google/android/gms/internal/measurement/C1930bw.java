package com.google.android.gms.internal.measurement;

import android.database.ContentObserver;
import android.os.Handler;

/* renamed from: com.google.android.gms.internal.measurement.bw */
final class C1930bw extends ContentObserver {

    /* renamed from: a */
    private final /* synthetic */ C1928bu f7547a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C1930bw(C1928bu buVar, Handler handler) {
        super((Handler) null);
        this.f7547a = buVar;
    }

    public final void onChange(boolean z) {
        this.f7547a.mo13548b();
    }
}
