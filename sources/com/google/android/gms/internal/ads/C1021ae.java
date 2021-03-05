package com.google.android.gms.internal.ads;

import android.support.annotation.Nullable;
import android.view.View;
import com.google.android.gms.ads.internal.zzaf;
import com.google.android.gms.p039a.C0719a;
import com.google.android.gms.p039a.C0722b;
import javax.annotation.ParametersAreNonnullByDefault;

@C1598qn
@ParametersAreNonnullByDefault
/* renamed from: com.google.android.gms.internal.ads.ae */
public final class C1021ae extends C1024ah {

    /* renamed from: a */
    private final zzaf f1491a;
    @Nullable

    /* renamed from: b */
    private final String f1492b;

    /* renamed from: c */
    private final String f1493c;

    public C1021ae(zzaf zzaf, @Nullable String str, String str2) {
        this.f1491a = zzaf;
        this.f1492b = str;
        this.f1493c = str2;
    }

    /* renamed from: a */
    public final String mo10260a() {
        return this.f1492b;
    }

    /* renamed from: b */
    public final String mo10262b() {
        return this.f1493c;
    }

    /* renamed from: a */
    public final void mo10261a(@Nullable C0719a aVar) {
        if (aVar != null) {
            this.f1491a.zzh((View) C0722b.m770a(aVar));
        }
    }

    /* renamed from: c */
    public final void mo10263c() {
        this.f1491a.zzjh();
    }

    /* renamed from: d */
    public final void mo10264d() {
        this.f1491a.zzji();
    }
}
