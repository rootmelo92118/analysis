package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.media.AudioTimestamp;
import android.media.AudioTrack;

@TargetApi(19)
final class bbc extends bbb {

    /* renamed from: b */
    private final AudioTimestamp f3411b = new AudioTimestamp();

    /* renamed from: c */
    private long f3412c;

    /* renamed from: d */
    private long f3413d;

    /* renamed from: e */
    private long f3414e;

    public bbc() {
        super((bba) null);
    }

    /* renamed from: a */
    public final void mo11613a(AudioTrack audioTrack, boolean z) {
        super.mo11613a(audioTrack, z);
        this.f3412c = 0;
        this.f3413d = 0;
        this.f3414e = 0;
    }

    /* renamed from: d */
    public final boolean mo11616d() {
        boolean timestamp = this.f3402a.getTimestamp(this.f3411b);
        if (timestamp) {
            long j = this.f3411b.framePosition;
            if (this.f3413d > j) {
                this.f3412c++;
            }
            this.f3413d = j;
            this.f3414e = j + (this.f3412c << 32);
        }
        return timestamp;
    }

    /* renamed from: e */
    public final long mo11617e() {
        return this.f3411b.nanoTime;
    }

    /* renamed from: f */
    public final long mo11618f() {
        return this.f3414e;
    }
}
