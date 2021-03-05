package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import android.text.TextUtils;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.measurement.internal.dc */
final class C2227dc implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ AtomicReference f8341a;

    /* renamed from: b */
    private final /* synthetic */ String f8342b;

    /* renamed from: c */
    private final /* synthetic */ String f8343c;

    /* renamed from: d */
    private final /* synthetic */ String f8344d;

    /* renamed from: e */
    private final /* synthetic */ zzk f8345e;

    /* renamed from: f */
    private final /* synthetic */ C2217ct f8346f;

    C2227dc(C2217ct ctVar, AtomicReference atomicReference, String str, String str2, String str3, zzk zzk) {
        this.f8346f = ctVar;
        this.f8341a = atomicReference;
        this.f8342b = str;
        this.f8343c = str2;
        this.f8344d = str3;
        this.f8345e = zzk;
    }

    public final void run() {
        synchronized (this.f8341a) {
            try {
                C2286i d = this.f8346f.f8302b;
                if (d == null) {
                    this.f8346f.mo14235r().mo14830d_().mo14844a("Failed to get conditional properties", C2295r.m11413a(this.f8342b), this.f8343c, this.f8344d);
                    this.f8341a.set(Collections.emptyList());
                    this.f8341a.notify();
                    return;
                }
                if (TextUtils.isEmpty(this.f8342b)) {
                    this.f8341a.set(d.mo14339a(this.f8343c, this.f8344d, this.f8345e));
                } else {
                    this.f8341a.set(d.mo14340a(this.f8342b, this.f8343c, this.f8344d));
                }
                this.f8346f.m10753I();
                this.f8341a.notify();
            } catch (RemoteException e) {
                try {
                    this.f8346f.mo14235r().mo14830d_().mo14844a("Failed to get conditional properties", C2295r.m11413a(this.f8342b), this.f8343c, e);
                    this.f8341a.set(Collections.emptyList());
                    this.f8341a.notify();
                } catch (Throwable th) {
                    this.f8341a.notify();
                    throw th;
                }
            }
        }
    }
}
