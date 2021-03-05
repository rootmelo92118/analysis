package com.google.android.gms.ads.internal;

import android.support.annotation.Nullable;
import com.google.android.gms.internal.ads.C1598qn;
import com.google.android.gms.internal.ads.C1772wz;
import com.google.android.gms.internal.ads.C1782xi;
import com.google.android.gms.internal.ads.zzwb;
import java.lang.ref.WeakReference;
import javax.annotation.ParametersAreNonnullByDefault;

@C1598qn
@ParametersAreNonnullByDefault
public final class zzbl {
    private final zzbn zzbqn;
    /* access modifiers changed from: private */
    @Nullable
    public zzwb zzbqo;
    /* access modifiers changed from: private */
    public boolean zzbqp;
    private boolean zzbqq;
    private long zzbqr;
    private final Runnable zzy;

    public zzbl(zza zza) {
        this(zza, new zzbn(C1782xi.f6838a));
    }

    private zzbl(zza zza, zzbn zzbn) {
        this.zzbqp = false;
        this.zzbqq = false;
        this.zzbqr = 0;
        this.zzbqn = zzbn;
        this.zzy = new zzbm(this, new WeakReference(zza));
    }

    public final void zzf(zzwb zzwb) {
        this.zzbqo = zzwb;
    }

    public final void cancel() {
        this.zzbqp = false;
        this.zzbqn.removeCallbacks(this.zzy);
    }

    public final void pause() {
        this.zzbqq = true;
        if (this.zzbqp) {
            this.zzbqn.removeCallbacks(this.zzy);
        }
    }

    public final void resume() {
        this.zzbqq = false;
        if (this.zzbqp) {
            this.zzbqp = false;
            zza(this.zzbqo, this.zzbqr);
        }
    }

    public final void zzku() {
        this.zzbqq = false;
        this.zzbqp = false;
        if (!(this.zzbqo == null || this.zzbqo.f7273c == null)) {
            this.zzbqo.f7273c.remove("_ad");
        }
        zza(this.zzbqo, 0);
    }

    public final boolean zzkv() {
        return this.zzbqp;
    }

    public final void zzg(zzwb zzwb) {
        zza(zzwb, 60000);
    }

    public final void zza(zzwb zzwb, long j) {
        if (this.zzbqp) {
            C1772wz.m1630e("An ad refresh is already scheduled.");
            return;
        }
        this.zzbqo = zzwb;
        this.zzbqp = true;
        this.zzbqr = j;
        if (!this.zzbqq) {
            StringBuilder sb = new StringBuilder(65);
            sb.append("Scheduling ad refresh ");
            sb.append(j);
            sb.append(" milliseconds from now.");
            C1772wz.m1628d(sb.toString());
            this.zzbqn.postDelayed(this.zzy, j);
        }
    }
}
