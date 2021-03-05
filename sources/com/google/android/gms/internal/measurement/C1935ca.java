package com.google.android.gms.internal.measurement;

import android.os.Binder;

/* renamed from: com.google.android.gms.internal.measurement.ca */
public final /* synthetic */ class C1935ca {
    /* renamed from: a */
    public static <V> V m9009a(C1936cb<V> cbVar) {
        long clearCallingIdentity;
        try {
            return cbVar.mo13550a();
        } catch (SecurityException unused) {
            clearCallingIdentity = Binder.clearCallingIdentity();
            V a = cbVar.mo13550a();
            Binder.restoreCallingIdentity(clearCallingIdentity);
            return a;
        } catch (Throwable th) {
            Binder.restoreCallingIdentity(clearCallingIdentity);
            throw th;
        }
    }
}
