package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzbv;

@C1598qn
public final class ael extends C1768wv {

    /* renamed from: a */
    final adc f1519a;

    /* renamed from: b */
    final aeo f1520b;

    /* renamed from: c */
    private final String f1521c;

    ael(adc adc, aeo aeo, String str) {
        this.f1519a = adc;
        this.f1520b = aeo;
        this.f1521c = str;
        zzbv.zzmd().mo10285a(this);
    }

    public final void zzki() {
        try {
            this.f1520b.mo10293a(this.f1521c);
        } finally {
            C1782xi.f6838a.post(new aem(this));
        }
    }

    public final void onStop() {
        this.f1520b.mo10295b();
    }
}
