package com.google.android.gms.internal.ads;

import android.support.annotation.Nullable;
import com.google.android.gms.ads.internal.zzal;
import com.google.android.gms.ads.internal.zzbv;

/* renamed from: com.google.android.gms.internal.ads.gt */
final class C1334gt {

    /* renamed from: a */
    zzal f5399a;
    @Nullable

    /* renamed from: b */
    zzwb f5400b;

    /* renamed from: c */
    C1300fm f5401c;

    /* renamed from: d */
    long f5402d;

    /* renamed from: e */
    boolean f5403e;

    /* renamed from: f */
    boolean f5404f;

    /* renamed from: g */
    private final /* synthetic */ C1333gs f5405g;

    C1334gt(C1333gs gsVar, C1299fl flVar) {
        this.f5405g = gsVar;
        this.f5399a = flVar.mo12536b(gsVar.f5396c);
        this.f5401c = new C1300fm();
        C1300fm fmVar = this.f5401c;
        zzal zzal = this.f5399a;
        zzal.zza((brl) new C1301fn(fmVar));
        zzal.zza((bse) new C1309fv(fmVar));
        zzal.zza((C1026aj) new C1311fx(fmVar));
        zzal.zza((brh) new C1313fz(fmVar));
        zzal.zza((C1695uc) new C1316gb(fmVar));
    }

    C1334gt(C1333gs gsVar, C1299fl flVar, zzwb zzwb) {
        this(gsVar, flVar);
        this.f5400b = zzwb;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo12570a() {
        if (this.f5403e) {
            return false;
        }
        this.f5404f = this.f5399a.zzb(C1331gq.m6921b(this.f5400b != null ? this.f5400b : this.f5405g.f5395b));
        this.f5403e = true;
        this.f5402d = zzbv.zzlm().mo9996a();
        return true;
    }
}
