package com.google.android.gms.ads.internal;

import com.google.android.gms.internal.ads.C1135bi;
import com.google.android.gms.internal.ads.C1419jx;
import com.google.android.gms.internal.ads.C1423ka;
import com.google.android.gms.internal.ads.C1440kr;
import com.google.android.gms.internal.ads.C1752wf;
import com.google.android.gms.internal.ads.C1753wg;
import com.google.android.gms.internal.ads.afl;

final class zzj implements Runnable {
    private final /* synthetic */ C1753wg zzblz;
    private final /* synthetic */ zzh zzbmf;

    zzj(zzh zzh, C1753wg wgVar) {
        this.zzbmf = zzh;
        this.zzblz = wgVar;
    }

    public final void run() {
        this.zzbmf.zzb(new C1752wf(this.zzblz, (afl) null, (C1419jx) null, (C1440kr) null, (String) null, (C1423ka) null, (C1135bi) null, (String) null));
    }
}
