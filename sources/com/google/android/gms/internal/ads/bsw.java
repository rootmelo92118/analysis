package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.MuteThisAdListener;

public final class bsw extends bsu {

    /* renamed from: a */
    private final MuteThisAdListener f5189a;

    public bsw(MuteThisAdListener muteThisAdListener) {
        this.f5189a = muteThisAdListener;
    }

    /* renamed from: a */
    public final void mo12335a() {
        this.f5189a.onAdMuted();
    }
}
