package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.os.Handler;
import android.support.annotation.GuardedBy;
import android.support.p034v4.content.PermissionChecker;
import android.util.Log;

/* renamed from: com.google.android.gms.internal.measurement.cc */
final class C1937cc implements C1933bz {
    @GuardedBy("GservicesLoader.class")

    /* renamed from: a */
    static C1937cc f7549a;

    /* renamed from: b */
    private final Context f7550b;

    /* renamed from: a */
    static C1937cc m9011a(Context context) {
        C1937cc ccVar;
        synchronized (C1937cc.class) {
            if (f7549a == null) {
                f7549a = PermissionChecker.checkSelfPermission(context, "com.google.android.providers.gsf.permission.READ_GSERVICES") == 0 ? new C1937cc(context) : new C1937cc();
            }
            ccVar = f7549a;
        }
        return ccVar;
    }

    private C1937cc(Context context) {
        this.f7550b = context;
        this.f7550b.getContentResolver().registerContentObserver(C1925br.f7524a, true, new C1939ce(this, (Handler) null));
    }

    private C1937cc() {
        this.f7550b = null;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public final String mo13546a(String str) {
        if (this.f7550b == null) {
            return null;
        }
        try {
            return (String) C1935ca.m9009a(new C1938cd(this, str));
        } catch (SecurityException e) {
            String valueOf = String.valueOf(str);
            Log.e("GservicesLoader", valueOf.length() != 0 ? "Unable to read GServices for: ".concat(valueOf) : new String("Unable to read GServices for: "), e);
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final /* synthetic */ String mo13553b(String str) {
        return C1925br.m8984a(this.f7550b.getContentResolver(), str, (String) null);
    }
}
