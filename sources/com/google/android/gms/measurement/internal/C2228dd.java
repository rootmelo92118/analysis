package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import android.text.TextUtils;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.measurement.internal.dd */
final class C2228dd implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ AtomicReference f8347a;

    /* renamed from: b */
    private final /* synthetic */ String f8348b;

    /* renamed from: c */
    private final /* synthetic */ String f8349c;

    /* renamed from: d */
    private final /* synthetic */ String f8350d;

    /* renamed from: e */
    private final /* synthetic */ boolean f8351e;

    /* renamed from: f */
    private final /* synthetic */ zzk f8352f;

    /* renamed from: g */
    private final /* synthetic */ C2217ct f8353g;

    C2228dd(C2217ct ctVar, AtomicReference atomicReference, String str, String str2, String str3, boolean z, zzk zzk) {
        this.f8353g = ctVar;
        this.f8347a = atomicReference;
        this.f8348b = str;
        this.f8349c = str2;
        this.f8350d = str3;
        this.f8351e = z;
        this.f8352f = zzk;
    }

    public final void run() {
        synchronized (this.f8347a) {
            try {
                C2286i d = this.f8353g.f8302b;
                if (d == null) {
                    this.f8353g.mo14235r().mo14830d_().mo14844a("Failed to get user properties", C2295r.m11413a(this.f8348b), this.f8349c, this.f8350d);
                    this.f8347a.set(Collections.emptyList());
                    this.f8347a.notify();
                    return;
                }
                if (TextUtils.isEmpty(this.f8348b)) {
                    this.f8347a.set(d.mo14342a(this.f8349c, this.f8350d, this.f8351e, this.f8352f));
                } else {
                    this.f8347a.set(d.mo14341a(this.f8348b, this.f8349c, this.f8350d, this.f8351e));
                }
                this.f8353g.m10753I();
                this.f8347a.notify();
            } catch (RemoteException e) {
                try {
                    this.f8353g.mo14235r().mo14830d_().mo14844a("Failed to get user properties", C2295r.m11413a(this.f8348b), this.f8349c, e);
                    this.f8347a.set(Collections.emptyList());
                    this.f8347a.notify();
                } catch (Throwable th) {
                    this.f8347a.notify();
                    throw th;
                }
            }
        }
    }
}
