package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zzal;
import com.google.android.gms.ads.internal.zzv;

@C1598qn
/* renamed from: com.google.android.gms.internal.ads.fl */
public final class C1299fl {

    /* renamed from: a */
    private final Context f5363a;

    /* renamed from: b */
    private final C1437ko f5364b;

    /* renamed from: c */
    private final zzbbi f5365c;

    /* renamed from: d */
    private final zzv f5366d;

    C1299fl(Context context, C1437ko koVar, zzbbi zzbbi, zzv zzv) {
        this.f5363a = context;
        this.f5364b = koVar;
        this.f5365c = zzbbi;
        this.f5366d = zzv;
    }

    /* renamed from: a */
    public final zzal mo12535a(String str) {
        return new zzal(this.f5363a, new zzwf(), str, this.f5364b, this.f5365c, this.f5366d);
    }

    /* renamed from: b */
    public final zzal mo12536b(String str) {
        return new zzal(this.f5363a.getApplicationContext(), new zzwf(), str, this.f5364b, this.f5365c, this.f5366d);
    }

    /* renamed from: a */
    public final Context mo12534a() {
        return this.f5363a.getApplicationContext();
    }

    /* renamed from: b */
    public final C1299fl mo12537b() {
        return new C1299fl(this.f5363a.getApplicationContext(), this.f5364b, this.f5365c, this.f5366d);
    }
}
