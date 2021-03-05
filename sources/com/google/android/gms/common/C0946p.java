package com.google.android.gms.common;

import java.lang.ref.WeakReference;

/* renamed from: com.google.android.gms.common.p */
abstract class C0946p extends C0944n {

    /* renamed from: b */
    private static final WeakReference<byte[]> f1141b = new WeakReference<>((Object) null);

    /* renamed from: a */
    private WeakReference<byte[]> f1142a = f1141b;

    C0946p(byte[] bArr) {
        super(bArr);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract byte[] mo9931d();

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final byte[] mo9928c() {
        byte[] bArr;
        synchronized (this) {
            bArr = (byte[]) this.f1142a.get();
            if (bArr == null) {
                bArr = mo9931d();
                this.f1142a = new WeakReference<>(bArr);
            }
        }
        return bArr;
    }
}
