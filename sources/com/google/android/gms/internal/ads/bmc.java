package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.gmsg.zzaa;
import com.google.android.gms.ads.internal.gmsg.zzu;
import com.google.android.gms.ads.internal.zzbv;
import org.json.JSONObject;

@C1598qn
public final class bmc implements bmm {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final blq f4740a;

    /* renamed from: b */
    private final Context f4741b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final zzaa f4742c;

    /* renamed from: d */
    private C1383io f4743d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public boolean f4744e;

    /* renamed from: f */
    private final zzu<C1392ix> f4745f = new bmh(this);

    /* renamed from: g */
    private final zzu<C1392ix> f4746g = new bmi(this);

    /* renamed from: h */
    private final zzu<C1392ix> f4747h = new bmj(this);

    /* renamed from: i */
    private final zzu<C1392ix> f4748i = new bml(this);

    public bmc(blq blq, C1366hy hyVar, Context context) {
        this.f4740a = blq;
        this.f4741b = context;
        this.f4742c = new zzaa(this.f4741b);
        this.f4743d = hyVar.mo12617b((awy) null);
        this.f4743d.mo10093a(new bmd(this), new bme(this));
        String valueOf = String.valueOf(this.f4740a.f4698a.mo12140d());
        C1772wz.m1624b(valueOf.length() != 0 ? "Core JS tracking ad unit: ".concat(valueOf) : new String("Core JS tracking ad unit: "));
    }

    /* renamed from: a */
    public final void mo12173a(JSONObject jSONObject, boolean z) {
        this.f4743d.mo10093a(new bmf(this, jSONObject), new abu());
    }

    /* renamed from: a */
    public final boolean mo12174a() {
        return this.f4744e;
    }

    /* renamed from: b */
    public final void mo12175b() {
        this.f4743d.mo10093a(new bmg(this), new abu());
        this.f4743d.mo12624a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo12177a(C1392ix ixVar) {
        ixVar.mo12606a("/updateActiveView", this.f4745f);
        ixVar.mo12606a("/untrackActiveViewUnit", this.f4746g);
        ixVar.mo12606a("/visibilityChanged", this.f4747h);
        if (zzbv.zzmf().mo13075a(this.f4741b)) {
            ixVar.mo12606a("/logScionEvent", this.f4748i);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo12178b(C1392ix ixVar) {
        ixVar.mo12607b("/visibilityChanged", this.f4747h);
        ixVar.mo12607b("/untrackActiveViewUnit", this.f4746g);
        ixVar.mo12607b("/updateActiveView", this.f4745f);
        if (zzbv.zzmf().mo13075a(this.f4741b)) {
            ixVar.mo12607b("/logScionEvent", this.f4748i);
        }
    }
}
