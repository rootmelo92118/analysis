package com.google.android.gms.internal.ads;

@C1598qn
public final class aex extends aeo {
    public aex(adc adc) {
        super(adc);
    }

    /* renamed from: b */
    public final void mo10295b() {
    }

    /* renamed from: a */
    public final boolean mo10293a(String str) {
        adc adc = (adc) this.f1526c.get();
        if (adc != null) {
            adc.mo10169a(mo10294b(str), (aeo) this);
        }
        C1772wz.m1630e("VideoStreamNoopCache is doing nothing.");
        mo10292a(str, mo10294b(str), "noop", "Noop cache is a noop.");
        return false;
    }
}
