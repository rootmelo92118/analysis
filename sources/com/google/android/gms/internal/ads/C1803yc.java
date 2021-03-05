package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioManager;

@C1598qn
/* renamed from: com.google.android.gms.internal.ads.yc */
public final class C1803yc {

    /* renamed from: a */
    private boolean f6860a = false;

    /* renamed from: b */
    private float f6861b = 1.0f;

    /* renamed from: a */
    public final synchronized void mo13245a(float f) {
        this.f6861b = f;
    }

    /* renamed from: a */
    public final synchronized float mo13244a() {
        if (!m8488c()) {
            return 1.0f;
        }
        return this.f6861b;
    }

    /* renamed from: a */
    public final synchronized void mo13246a(boolean z) {
        this.f6860a = z;
    }

    /* renamed from: b */
    public final synchronized boolean mo13247b() {
        return this.f6860a;
    }

    /* renamed from: c */
    private final synchronized boolean m8488c() {
        return this.f6861b >= 0.0f;
    }

    /* renamed from: a */
    public static float m8487a(Context context) {
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        if (audioManager == null) {
            return 0.0f;
        }
        int streamMaxVolume = audioManager.getStreamMaxVolume(3);
        int streamVolume = audioManager.getStreamVolume(3);
        if (streamMaxVolume == 0) {
            return 0.0f;
        }
        return ((float) streamVolume) / ((float) streamMaxVolume);
    }
}
