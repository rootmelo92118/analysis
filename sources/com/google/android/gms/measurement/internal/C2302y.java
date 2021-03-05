package com.google.android.gms.measurement.internal;

import android.support.annotation.WorkerThread;
import com.google.android.gms.common.internal.C0926p;
import java.util.List;
import java.util.Map;

@WorkerThread
/* renamed from: com.google.android.gms.measurement.internal.y */
final class C2302y implements Runnable {

    /* renamed from: a */
    private final C2301x f8639a;

    /* renamed from: b */
    private final int f8640b;

    /* renamed from: c */
    private final Throwable f8641c;

    /* renamed from: d */
    private final byte[] f8642d;

    /* renamed from: e */
    private final String f8643e;

    /* renamed from: f */
    private final Map<String, List<String>> f8644f;

    private C2302y(String str, C2301x xVar, int i, Throwable th, byte[] bArr, Map<String, List<String>> map) {
        C0926p.m1306a(xVar);
        this.f8639a = xVar;
        this.f8640b = i;
        this.f8641c = th;
        this.f8642d = bArr;
        this.f8643e = str;
        this.f8644f = map;
    }

    public final void run() {
        this.f8639a.mo14544a(this.f8643e, this.f8640b, this.f8641c, this.f8642d, this.f8644f);
    }
}
