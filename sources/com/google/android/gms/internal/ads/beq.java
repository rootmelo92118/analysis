package com.google.android.gms.internal.ads;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;

final class beq implements bep {
    private beq() {
    }

    /* renamed from: b */
    public final boolean mo11755b() {
        return false;
    }

    /* renamed from: a */
    public final int mo11752a() {
        return MediaCodecList.getCodecCount();
    }

    /* renamed from: a */
    public final MediaCodecInfo mo11753a(int i) {
        return MediaCodecList.getCodecInfoAt(i);
    }

    /* renamed from: a */
    public final boolean mo11754a(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return "video/avc".equals(str);
    }
}
