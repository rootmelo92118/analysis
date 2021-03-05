package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.interfaces.ECPublicKey;

public final class anj implements aiu {

    /* renamed from: a */
    private static final byte[] f2088a = new byte[0];

    /* renamed from: b */
    private final anl f2089b;

    /* renamed from: c */
    private final String f2090c;

    /* renamed from: d */
    private final byte[] f2091d;

    /* renamed from: e */
    private final anq f2092e;

    /* renamed from: f */
    private final anh f2093f;

    public anj(ECPublicKey eCPublicKey, byte[] bArr, String str, anq anq, anh anh) {
        ann.m2888a(eCPublicKey.getW(), eCPublicKey.getParams().getCurve());
        this.f2089b = new anl(eCPublicKey);
        this.f2091d = bArr;
        this.f2090c = str;
        this.f2092e = anq;
        this.f2093f = anh;
    }

    /* renamed from: a */
    public final byte[] mo10590a(byte[] bArr, byte[] bArr2) {
        anm a = this.f2089b.mo10737a(this.f2090c, this.f2091d, bArr2, this.f2093f.mo10610a(), this.f2092e);
        byte[] a2 = this.f2093f.mo10611a(a.mo10739b()).mo10588a(bArr, f2088a);
        byte[] a3 = a.mo10738a();
        return ByteBuffer.allocate(a3.length + a2.length).put(a3).put(a2).array();
    }
}
