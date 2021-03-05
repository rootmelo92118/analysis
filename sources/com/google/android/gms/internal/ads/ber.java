package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;

@TargetApi(21)
final class ber implements bep {

    /* renamed from: a */
    private final int f3992a;

    /* renamed from: b */
    private MediaCodecInfo[] f3993b;

    public ber(boolean z) {
        this.f3992a = z ? 1 : 0;
    }

    /* renamed from: b */
    public final boolean mo11755b() {
        return true;
    }

    /* renamed from: a */
    public final int mo11752a() {
        m5153c();
        return this.f3993b.length;
    }

    /* renamed from: a */
    public final MediaCodecInfo mo11753a(int i) {
        m5153c();
        return this.f3993b[i];
    }

    /* renamed from: a */
    public final boolean mo11754a(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("secure-playback");
    }

    /* renamed from: c */
    private final void m5153c() {
        if (this.f3993b == null) {
            this.f3993b = new MediaCodecList(this.f3992a).getCodecInfos();
        }
    }
}
