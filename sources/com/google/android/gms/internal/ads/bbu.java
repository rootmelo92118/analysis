package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.media.MediaCodec;

@TargetApi(24)
final class bbu {

    /* renamed from: a */
    private final MediaCodec.CryptoInfo f3497a;

    /* renamed from: b */
    private final MediaCodec.CryptoInfo.Pattern f3498b;

    private bbu(MediaCodec.CryptoInfo cryptoInfo) {
        this.f3497a = cryptoInfo;
        this.f3498b = new MediaCodec.CryptoInfo.Pattern(0, 0);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m4895a(int i, int i2) {
        this.f3498b.set(i, i2);
        this.f3497a.setPattern(this.f3498b);
    }
}
