package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.VideoController;

public final class bue extends btf {

    /* renamed from: a */
    private final VideoController.VideoLifecycleCallbacks f5287a;

    public bue(VideoController.VideoLifecycleCallbacks videoLifecycleCallbacks) {
        this.f5287a = videoLifecycleCallbacks;
    }

    /* renamed from: a */
    public final void mo12350a() {
        this.f5287a.onVideoStart();
    }

    /* renamed from: b */
    public final void mo12352b() {
        this.f5287a.onVideoPlay();
    }

    /* renamed from: c */
    public final void mo12353c() {
        this.f5287a.onVideoPause();
    }

    /* renamed from: d */
    public final void mo12354d() {
        this.f5287a.onVideoEnd();
    }

    /* renamed from: a */
    public final void mo12351a(boolean z) {
        this.f5287a.onVideoMute(z);
    }
}
