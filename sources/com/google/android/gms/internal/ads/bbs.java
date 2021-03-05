package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.media.MediaCodec;

public final class bbs {

    /* renamed from: a */
    public byte[] f3487a;

    /* renamed from: b */
    public int[] f3488b;

    /* renamed from: c */
    public int[] f3489c;

    /* renamed from: d */
    private byte[] f3490d;

    /* renamed from: e */
    private int f3491e;

    /* renamed from: f */
    private int f3492f;

    /* renamed from: g */
    private int f3493g;

    /* renamed from: h */
    private int f3494h;

    /* renamed from: i */
    private final MediaCodec.CryptoInfo f3495i;

    /* renamed from: j */
    private final bbu f3496j;

    public bbs() {
        this.f3495i = bkp.f4570a >= 16 ? new MediaCodec.CryptoInfo() : null;
        this.f3496j = bkp.f4570a >= 24 ? new bbu(this.f3495i) : null;
    }

    /* renamed from: a */
    public final void mo11652a(int i, int[] iArr, int[] iArr2, byte[] bArr, byte[] bArr2, int i2) {
        this.f3492f = i;
        this.f3488b = iArr;
        this.f3489c = iArr2;
        this.f3490d = bArr;
        this.f3487a = bArr2;
        this.f3491e = i2;
        this.f3493g = 0;
        this.f3494h = 0;
        if (bkp.f4570a >= 16) {
            this.f3495i.numSubSamples = this.f3492f;
            this.f3495i.numBytesOfClearData = this.f3488b;
            this.f3495i.numBytesOfEncryptedData = this.f3489c;
            this.f3495i.key = this.f3490d;
            this.f3495i.iv = this.f3487a;
            this.f3495i.mode = this.f3491e;
            if (bkp.f4570a >= 24) {
                this.f3496j.m4895a(0, 0);
            }
        }
    }

    @TargetApi(16)
    /* renamed from: a */
    public final MediaCodec.CryptoInfo mo11651a() {
        return this.f3495i;
    }
}
