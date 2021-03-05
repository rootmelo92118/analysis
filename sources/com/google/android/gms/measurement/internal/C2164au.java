package com.google.android.gms.measurement.internal;

import android.support.annotation.NonNull;
import com.google.android.gms.common.internal.C0926p;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/* renamed from: com.google.android.gms.measurement.internal.au */
final class C2164au<V> extends FutureTask<V> implements Comparable<C2164au> {

    /* renamed from: a */
    final boolean f8117a;

    /* renamed from: b */
    private final long f8118b = C2161ar.f8105j.getAndIncrement();

    /* renamed from: c */
    private final String f8119c;

    /* renamed from: d */
    private final /* synthetic */ C2161ar f8120d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C2164au(C2161ar arVar, Callable<V> callable, boolean z, String str) {
        super(callable);
        this.f8120d = arVar;
        C0926p.m1306a(str);
        this.f8119c = str;
        this.f8117a = z;
        if (this.f8118b == Long.MAX_VALUE) {
            arVar.mo14235r().mo14830d_().mo14841a("Tasks index overflow");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C2164au(C2161ar arVar, Runnable runnable, boolean z, String str) {
        super(runnable, (Object) null);
        this.f8120d = arVar;
        C0926p.m1306a(str);
        this.f8119c = str;
        this.f8117a = false;
        if (this.f8118b == Long.MAX_VALUE) {
            arVar.mo14235r().mo14830d_().mo14841a("Tasks index overflow");
        }
    }

    /* access modifiers changed from: protected */
    public final void setException(Throwable th) {
        this.f8120d.mo14235r().mo14830d_().mo14842a(this.f8119c, th);
        if (th instanceof C2162as) {
            Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
        }
        super.setException(th);
    }

    public final /* synthetic */ int compareTo(@NonNull Object obj) {
        C2164au auVar = (C2164au) obj;
        if (this.f8117a != auVar.f8117a) {
            return this.f8117a ? -1 : 1;
        }
        if (this.f8118b < auVar.f8118b) {
            return -1;
        }
        if (this.f8118b > auVar.f8118b) {
            return 1;
        }
        this.f8120d.mo14235r().mo14831g().mo14842a("Two tasks share the same index. index", Long.valueOf(this.f8118b));
        return 0;
    }
}
