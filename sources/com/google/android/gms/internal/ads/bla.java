package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.os.Handler;
import android.support.annotation.NonNull;

@TargetApi(23)
final class bla implements MediaCodec.OnFrameRenderedListener {

    /* renamed from: a */
    private final /* synthetic */ bkx f4631a;

    private bla(bkx bkx, MediaCodec mediaCodec) {
        this.f4631a = bkx;
        mediaCodec.setOnFrameRenderedListener(this, new Handler());
    }

    public final void onFrameRendered(@NonNull MediaCodec mediaCodec, long j, long j2) {
        if (this == this.f4631a.f4602b) {
            this.f4631a.mo12087v();
        }
    }
}
