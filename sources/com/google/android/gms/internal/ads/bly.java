package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.gmsg.zzu;
import org.json.JSONObject;

@C1598qn
public final class bly implements bmm {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final blq f4730a;

    /* renamed from: b */
    private final afl f4731b;

    /* renamed from: c */
    private final zzu<afl> f4732c = new blz(this);

    /* renamed from: d */
    private final zzu<afl> f4733d = new bma(this);

    /* renamed from: e */
    private final zzu<afl> f4734e = new bmb(this);

    public bly(blq blq, afl afl) {
        this.f4730a = blq;
        this.f4731b = afl;
        afl afl2 = this.f4731b;
        afl2.mo10347a("/updateActiveView", (zzu<? super afl>) this.f4732c);
        afl2.mo10347a("/untrackActiveViewUnit", (zzu<? super afl>) this.f4733d);
        afl2.mo10347a("/visibilityChanged", (zzu<? super afl>) this.f4734e);
        String valueOf = String.valueOf(this.f4730a.f4698a.mo12140d());
        C1772wz.m1624b(valueOf.length() != 0 ? "Custom JS tracking ad unit: ".concat(valueOf) : new String("Custom JS tracking ad unit: "));
    }

    /* renamed from: a */
    public final boolean mo12174a() {
        return true;
    }

    /* renamed from: a */
    public final void mo12173a(JSONObject jSONObject, boolean z) {
        if (!z) {
            this.f4731b.mo10448b("AFMA_updateActiveView", jSONObject);
        } else {
            this.f4730a.mo12159b((bmm) this);
        }
    }

    /* renamed from: b */
    public final void mo12175b() {
        afl afl = this.f4731b;
        afl.mo10352b("/visibilityChanged", this.f4734e);
        afl.mo10352b("/untrackActiveViewUnit", this.f4733d);
        afl.mo10352b("/updateActiveView", this.f4732c);
    }
}
