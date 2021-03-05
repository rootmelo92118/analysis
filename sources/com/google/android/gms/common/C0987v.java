package com.google.android.gms.common;

import android.support.annotation.NonNull;
import android.util.Log;
import com.google.android.gms.common.util.C0963a;
import com.google.android.gms.common.util.C0974j;
import java.util.concurrent.Callable;
import javax.annotation.CheckReturnValue;
import javax.annotation.Nullable;

@CheckReturnValue
/* renamed from: com.google.android.gms.common.v */
class C0987v {

    /* renamed from: b */
    private static final C0987v f1231b = new C0987v(true, (String) null, (Throwable) null);

    /* renamed from: a */
    final boolean f1232a;

    /* renamed from: c */
    private final String f1233c;

    /* renamed from: d */
    private final Throwable f1234d;

    C0987v(boolean z, @Nullable String str, @Nullable Throwable th) {
        this.f1232a = z;
        this.f1233c = str;
        this.f1234d = th;
    }

    /* renamed from: a */
    static C0987v m1521a() {
        return f1231b;
    }

    /* renamed from: a */
    static C0987v m1524a(Callable<String> callable) {
        return new C0989x(callable);
    }

    /* renamed from: a */
    static C0987v m1522a(@NonNull String str) {
        return new C0987v(false, str, (Throwable) null);
    }

    /* renamed from: a */
    static C0987v m1523a(@NonNull String str, @NonNull Throwable th) {
        return new C0987v(false, str, th);
    }

    /* access modifiers changed from: package-private */
    @Nullable
    /* renamed from: b */
    public String mo10000b() {
        return this.f1233c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo10001c() {
        if (!this.f1232a && Log.isLoggable("GoogleCertificatesRslt", 3)) {
            if (this.f1234d != null) {
                Log.d("GoogleCertificatesRslt", mo10000b(), this.f1234d);
            } else {
                Log.d("GoogleCertificatesRslt", mo10000b());
            }
        }
    }

    /* renamed from: a */
    static String m1525a(String str, C0944n nVar, boolean z, boolean z2) {
        return String.format("%s: pkg=%s, sha1=%s, atk=%s, ver=%s", new Object[]{z2 ? "debug cert rejected" : "not whitelisted", str, C0974j.m1492a(C0963a.m1452a("SHA-1").digest(nVar.mo9928c())), Boolean.valueOf(z), "12451009.false"});
    }
}
