package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.media.AudioManager;

@TargetApi(14)
@C1598qn
public final class adg implements AudioManager.OnAudioFocusChangeListener {

    /* renamed from: a */
    private final AudioManager f1435a;

    /* renamed from: b */
    private final adh f1436b;

    /* renamed from: c */
    private boolean f1437c;

    /* renamed from: d */
    private boolean f1438d;

    /* renamed from: e */
    private boolean f1439e;

    /* renamed from: f */
    private float f1440f = 1.0f;

    public adg(Context context, adh adh) {
        this.f1435a = (AudioManager) context.getSystemService("audio");
        this.f1436b = adh;
    }

    /* renamed from: a */
    public final void mo10196a(boolean z) {
        this.f1439e = z;
        m1780d();
    }

    /* renamed from: a */
    public final void mo10195a(float f) {
        this.f1440f = f;
        m1780d();
    }

    /* renamed from: a */
    public final float mo10194a() {
        float f = this.f1439e ? 0.0f : this.f1440f;
        if (this.f1437c) {
            return f;
        }
        return 0.0f;
    }

    /* renamed from: b */
    public final void mo10197b() {
        this.f1438d = true;
        m1780d();
    }

    /* renamed from: c */
    public final void mo10198c() {
        this.f1438d = false;
        m1780d();
    }

    public final void onAudioFocusChange(int i) {
        this.f1437c = i > 0;
        this.f1436b.mo10200e();
    }

    /* renamed from: d */
    private final void m1780d() {
        boolean z = false;
        boolean z2 = this.f1438d && !this.f1439e && this.f1440f > 0.0f;
        if (z2 && !this.f1437c) {
            if (this.f1435a != null && !this.f1437c) {
                if (this.f1435a.requestAudioFocus(this, 3, 2) == 1) {
                    z = true;
                }
                this.f1437c = z;
            }
            this.f1436b.mo10200e();
        } else if (!z2 && this.f1437c) {
            if (this.f1435a != null && this.f1437c) {
                if (this.f1435a.abandonAudioFocus(this) == 0) {
                    z = true;
                }
                this.f1437c = z;
            }
            this.f1436b.mo10200e();
        }
    }
}
