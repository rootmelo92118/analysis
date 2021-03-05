package com.google.android.gms.internal.ads;

@C1598qn
/* renamed from: com.google.android.gms.internal.ads.wv */
public abstract class C1768wv implements C1804yd<abg> {
    /* access modifiers changed from: private */
    public volatile Thread zzeke;
    private boolean zzekf = false;
    private final Runnable zzy = new C1769ww(this);

    public C1768wv() {
    }

    public abstract void onStop();

    public abstract void zzki();

    public C1768wv(boolean z) {
    }

    public final abg zzyz() {
        if (!this.zzekf) {
            return C1780xg.m8353a(this.zzy);
        }
        return C1780xg.f6834b.mo10038a(this.zzy);
    }

    public final void cancel() {
        onStop();
        if (this.zzeke != null) {
            this.zzeke.interrupt();
        }
    }

    public final /* synthetic */ Object zzwa() {
        if (!this.zzekf) {
            return C1780xg.m8353a(this.zzy);
        }
        return C1780xg.f6834b.mo10038a(this.zzy);
    }
}
