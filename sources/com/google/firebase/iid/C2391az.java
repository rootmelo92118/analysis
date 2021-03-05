package com.google.firebase.iid;

import android.util.Base64;
import com.google.android.gms.common.internal.C0924o;
import java.security.KeyPair;

/* renamed from: com.google.firebase.iid.az */
final class C2391az {

    /* renamed from: a */
    private final KeyPair f8880a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final long f8881b;

    C2391az(KeyPair keyPair, long j) {
        this.f8880a = keyPair;
        this.f8881b = j;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final KeyPair mo15009a() {
        return this.f8880a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C2391az)) {
            return false;
        }
        C2391az azVar = (C2391az) obj;
        if (this.f8881b != azVar.f8881b || !this.f8880a.getPublic().equals(azVar.f8880a.getPublic()) || !this.f8880a.getPrivate().equals(azVar.f8880a.getPrivate())) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C0924o.m1301a(this.f8880a.getPublic(), this.f8880a.getPrivate(), Long.valueOf(this.f8881b));
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final String m11704b() {
        return Base64.encodeToString(this.f8880a.getPublic().getEncoded(), 11);
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public final String m11707c() {
        return Base64.encodeToString(this.f8880a.getPrivate().getEncoded(), 11);
    }
}
