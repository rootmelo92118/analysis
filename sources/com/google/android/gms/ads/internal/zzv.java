package com.google.android.gms.ads.internal;

import android.content.Context;
import com.google.android.gms.internal.ads.C1598qn;
import com.google.android.gms.internal.ads.C1732vm;
import com.google.android.gms.internal.ads.C1733vn;
import com.google.android.gms.internal.ads.C1737vr;
import com.google.android.gms.internal.ads.acn;
import com.google.android.gms.internal.ads.acu;
import com.google.android.gms.internal.ads.aeh;
import com.google.android.gms.internal.ads.aev;
import com.google.android.gms.internal.ads.bpc;

@C1598qn
public final class zzv {
    public final aev zzbms;
    public final acn zzbmt;
    public final C1737vr zzbmu;
    public final bpc zzbmv;

    private zzv(aev aev, acn acn, C1737vr vrVar, bpc bpc) {
        this.zzbms = aev;
        this.zzbmt = acn;
        this.zzbmu = vrVar;
        this.zzbmv = bpc;
    }

    public static zzv zzd(Context context) {
        return new zzv(new aeh(), new acu(), new C1732vm(new C1733vn()), new bpc(context));
    }
}
