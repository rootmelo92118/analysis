package com.google.android.gms.internal.ads;

import android.media.AudioTrack;

final class bba extends Thread {

    /* renamed from: a */
    private final /* synthetic */ AudioTrack f3400a;

    /* renamed from: b */
    private final /* synthetic */ baz f3401b;

    bba(baz baz, AudioTrack audioTrack) {
        this.f3401b = baz;
        this.f3400a = audioTrack;
    }

    public final void run() {
        try {
            this.f3400a.flush();
            this.f3400a.release();
        } finally {
            this.f3401b.f3362h.open();
        }
    }
}
