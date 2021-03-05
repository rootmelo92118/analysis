package com.google.android.gms.ads;

import com.google.android.gms.internal.ads.C1598qn;
import com.google.android.gms.internal.ads.zzzw;

@C1598qn
public final class VideoOptions {
    private final boolean zzwd;
    private final boolean zzwe;
    private final boolean zzwf;

    public VideoOptions(zzzw zzzw) {
        this.zzwd = zzzw.f7304a;
        this.zzwe = zzzw.f7305b;
        this.zzwf = zzzw.f7306c;
    }

    public static final class Builder {
        /* access modifiers changed from: private */
        public boolean zzwd = true;
        /* access modifiers changed from: private */
        public boolean zzwe = false;
        /* access modifiers changed from: private */
        public boolean zzwf = false;

        public final Builder setStartMuted(boolean z) {
            this.zzwd = z;
            return this;
        }

        public final Builder setCustomControlsRequested(boolean z) {
            this.zzwe = z;
            return this;
        }

        public final Builder setClickToExpandRequested(boolean z) {
            this.zzwf = z;
            return this;
        }

        public final VideoOptions build() {
            return new VideoOptions(this);
        }
    }

    private VideoOptions(Builder builder) {
        this.zzwd = builder.zzwd;
        this.zzwe = builder.zzwe;
        this.zzwf = builder.zzwf;
    }

    public final boolean getStartMuted() {
        return this.zzwd;
    }

    public final boolean getCustomControlsRequested() {
        return this.zzwe;
    }

    public final boolean getClickToExpandRequested() {
        return this.zzwf;
    }
}
