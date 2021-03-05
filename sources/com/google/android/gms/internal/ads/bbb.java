package com.google.android.gms.internal.ads;

import android.media.AudioTrack;
import android.os.SystemClock;

class bbb {

    /* renamed from: a */
    protected AudioTrack f3402a;

    /* renamed from: b */
    private boolean f3403b;

    /* renamed from: c */
    private int f3404c;

    /* renamed from: d */
    private long f3405d;

    /* renamed from: e */
    private long f3406e;

    /* renamed from: f */
    private long f3407f;

    /* renamed from: g */
    private long f3408g;

    /* renamed from: h */
    private long f3409h;

    /* renamed from: i */
    private long f3410i;

    private bbb() {
    }

    /* renamed from: d */
    public boolean mo11616d() {
        return false;
    }

    /* renamed from: a */
    public void mo11613a(AudioTrack audioTrack, boolean z) {
        this.f3402a = audioTrack;
        this.f3403b = z;
        this.f3408g = -9223372036854775807L;
        this.f3405d = 0;
        this.f3406e = 0;
        this.f3407f = 0;
        if (audioTrack != null) {
            this.f3404c = audioTrack.getSampleRate();
        }
    }

    /* renamed from: a */
    public final void mo11612a(long j) {
        this.f3409h = mo11614b();
        this.f3408g = SystemClock.elapsedRealtime() * 1000;
        this.f3410i = j;
        this.f3402a.stop();
    }

    /* renamed from: a */
    public final void mo11611a() {
        if (this.f3408g == -9223372036854775807L) {
            this.f3402a.pause();
        }
    }

    /* renamed from: b */
    public final long mo11614b() {
        if (this.f3408g != -9223372036854775807L) {
            return Math.min(this.f3410i, this.f3409h + ((((SystemClock.elapsedRealtime() * 1000) - this.f3408g) * ((long) this.f3404c)) / 1000000));
        }
        int playState = this.f3402a.getPlayState();
        if (playState == 1) {
            return 0;
        }
        long playbackHeadPosition = 4294967295L & ((long) this.f3402a.getPlaybackHeadPosition());
        if (this.f3403b) {
            if (playState == 2 && playbackHeadPosition == 0) {
                this.f3407f = this.f3405d;
            }
            playbackHeadPosition += this.f3407f;
        }
        if (this.f3405d > playbackHeadPosition) {
            this.f3406e++;
        }
        this.f3405d = playbackHeadPosition;
        return playbackHeadPosition + (this.f3406e << 32);
    }

    /* renamed from: c */
    public final long mo11615c() {
        return (mo11614b() * 1000000) / ((long) this.f3404c);
    }

    /* renamed from: e */
    public long mo11617e() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: f */
    public long mo11618f() {
        throw new UnsupportedOperationException();
    }

    /* synthetic */ bbb(bba bba) {
        this();
    }
}
