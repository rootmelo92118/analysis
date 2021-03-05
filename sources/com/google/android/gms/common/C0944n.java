package com.google.android.gms.common;

import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.C0881al;
import com.google.android.gms.common.internal.C0882am;
import com.google.android.gms.common.internal.C0926p;
import com.google.android.gms.p039a.C0719a;
import com.google.android.gms.p039a.C0722b;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/* renamed from: com.google.android.gms.common.n */
abstract class C0944n extends C0882am {

    /* renamed from: a */
    private int f1139a;

    protected C0944n(byte[] bArr) {
        C0926p.m1316b(bArr.length == 25);
        this.f1139a = Arrays.hashCode(bArr);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public abstract byte[] mo9928c();

    public int hashCode() {
        return this.f1139a;
    }

    public boolean equals(Object obj) {
        C0719a a;
        if (obj == null || !(obj instanceof C0881al)) {
            return false;
        }
        try {
            C0881al alVar = (C0881al) obj;
            if (alVar.mo9821b() != hashCode() || (a = alVar.mo9820a()) == null) {
                return false;
            }
            return Arrays.equals(mo9928c(), (byte[]) C0722b.m770a(a));
        } catch (RemoteException e) {
            Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e);
            return false;
        }
    }

    /* renamed from: a */
    public final C0719a mo9820a() {
        return C0722b.m769a(mo9928c());
    }

    /* renamed from: b */
    public final int mo9821b() {
        return hashCode();
    }

    /* renamed from: a */
    protected static byte[] m1399a(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e) {
            throw new AssertionError(e);
        }
    }
}
