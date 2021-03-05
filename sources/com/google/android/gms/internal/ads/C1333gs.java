package com.google.android.gms.internal.ads;

import android.support.annotation.Nullable;
import com.google.android.gms.common.internal.C0926p;
import java.util.Iterator;
import java.util.LinkedList;
import javax.annotation.ParametersAreNonnullByDefault;

@C1598qn
@ParametersAreNonnullByDefault
/* renamed from: com.google.android.gms.internal.ads.gs */
final class C1333gs {

    /* renamed from: a */
    private final LinkedList<C1334gt> f5394a = new LinkedList<>();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public zzwb f5395b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final String f5396c;

    /* renamed from: d */
    private final int f5397d;

    /* renamed from: e */
    private boolean f5398e;

    C1333gs(zzwb zzwb, String str, int i) {
        C0926p.m1306a(zzwb);
        C0926p.m1306a(str);
        this.f5395b = zzwb;
        this.f5396c = str;
        this.f5397d = i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final zzwb mo12560a() {
        return this.f5395b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final int mo12563b() {
        return this.f5397d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final String mo12564c() {
        return this.f5396c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final C1334gt mo12559a(@Nullable zzwb zzwb) {
        if (zzwb != null) {
            this.f5395b = zzwb;
        }
        return this.f5394a.remove();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final int mo12565d() {
        return this.f5394a.size();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final int mo12566e() {
        Iterator it = this.f5394a.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (((C1334gt) it.next()).f5403e) {
                i++;
            }
        }
        return i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo12562a(C1299fl flVar) {
        C1334gt gtVar = new C1334gt(this, flVar);
        this.f5394a.add(gtVar);
        return gtVar.mo12570a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final int mo12567f() {
        Iterator it = this.f5394a.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (((C1334gt) it.next()).mo12570a()) {
                i++;
            }
        }
        return i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo12561a(C1299fl flVar, zzwb zzwb) {
        this.f5394a.add(new C1334gt(this, flVar, zzwb));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final void mo12568g() {
        this.f5398e = true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final boolean mo12569h() {
        return this.f5398e;
    }
}
