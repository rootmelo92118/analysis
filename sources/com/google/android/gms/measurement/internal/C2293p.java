package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import com.google.android.gms.common.internal.C0926p;
import com.google.android.gms.common.util.C0969e;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.measurement.internal.p */
public final class C2293p extends C2190bt {

    /* renamed from: a */
    private static final AtomicReference<String[]> f8612a = new AtomicReference<>();

    /* renamed from: b */
    private static final AtomicReference<String[]> f8613b = new AtomicReference<>();

    /* renamed from: c */
    private static final AtomicReference<String[]> f8614c = new AtomicReference<>();

    C2293p(C2166aw awVar) {
        super(awVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final boolean mo14253e() {
        return false;
    }

    /* renamed from: g */
    private final boolean m11387g() {
        mo14238u();
        return this.f8222q.mo14328o() && this.f8222q.mo14235r().mo14829a(3);
    }

    /* access modifiers changed from: protected */
    @Nullable
    /* renamed from: a */
    public final String mo14824a(String str) {
        if (str == null) {
            return null;
        }
        if (!m11387g()) {
            return str;
        }
        return m11386a(str, C2192bv.f8225b, C2192bv.f8224a, f8612a);
    }

    /* access modifiers changed from: protected */
    @Nullable
    /* renamed from: b */
    public final String mo14825b(String str) {
        if (str == null) {
            return null;
        }
        if (!m11387g()) {
            return str;
        }
        return m11386a(str, C2193bw.f8227b, C2193bw.f8226a, f8613b);
    }

    /* access modifiers changed from: protected */
    @Nullable
    /* renamed from: c */
    public final String mo14826c(String str) {
        if (str == null) {
            return null;
        }
        if (!m11387g()) {
            return str;
        }
        if (!str.startsWith("_exp_")) {
            return m11386a(str, C2194bx.f8229b, C2194bx.f8228a, f8614c);
        }
        return "experiment_id" + "(" + str + ")";
    }

    @Nullable
    /* renamed from: a */
    private static String m11386a(String str, String[] strArr, String[] strArr2, AtomicReference<String[]> atomicReference) {
        String str2;
        C0926p.m1306a(strArr);
        C0926p.m1306a(strArr2);
        C0926p.m1306a(atomicReference);
        C0926p.m1316b(strArr.length == strArr2.length);
        for (int i = 0; i < strArr.length; i++) {
            if (C2264el.m11033c(str, strArr[i])) {
                synchronized (atomicReference) {
                    String[] strArr3 = atomicReference.get();
                    if (strArr3 == null) {
                        strArr3 = new String[strArr2.length];
                        atomicReference.set(strArr3);
                    }
                    if (strArr3[i] == null) {
                        strArr3[i] = strArr2[i] + "(" + strArr[i] + ")";
                    }
                    str2 = strArr3[i];
                }
                return str2;
            }
        }
        return str;
    }

    /* access modifiers changed from: protected */
    @Nullable
    /* renamed from: a */
    public final String mo14823a(zzag zzag) {
        if (zzag == null) {
            return null;
        }
        if (!m11387g()) {
            return zzag.toString();
        }
        return "origin=" + zzag.f8651c + ",name=" + mo14824a(zzag.f8649a) + ",params=" + m11385a(zzag.f8650b);
    }

    /* access modifiers changed from: protected */
    @Nullable
    /* renamed from: a */
    public final String mo14822a(C2197c cVar) {
        if (cVar == null) {
            return null;
        }
        if (!m11387g()) {
            return cVar.toString();
        }
        return "Event{appId='" + cVar.f8230a + "', name='" + mo14824a(cVar.f8231b) + "', params=" + m11385a(cVar.f8234e) + "}";
    }

    @Nullable
    /* renamed from: a */
    private final String m11385a(zzad zzad) {
        if (zzad == null) {
            return null;
        }
        if (!m11387g()) {
            return zzad.toString();
        }
        return mo14821a(zzad.mo14851b());
    }

    /* access modifiers changed from: protected */
    @Nullable
    /* renamed from: a */
    public final String mo14821a(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        if (!m11387g()) {
            return bundle.toString();
        }
        StringBuilder sb = new StringBuilder();
        for (String str : bundle.keySet()) {
            if (sb.length() != 0) {
                sb.append(", ");
            } else {
                sb.append("Bundle[{");
            }
            sb.append(mo14825b(str));
            sb.append("=");
            sb.append(bundle.get(str));
        }
        sb.append("}]");
        return sb.toString();
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo14215a() {
        super.mo14215a();
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo14218b() {
        super.mo14218b();
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo14220c() {
        super.mo14220c();
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo14221d() {
        super.mo14221d();
    }

    /* renamed from: l */
    public final /* bridge */ /* synthetic */ C2170b mo14229l() {
        return super.mo14229l();
    }

    /* renamed from: m */
    public final /* bridge */ /* synthetic */ C0969e mo14230m() {
        return super.mo14230m();
    }

    /* renamed from: n */
    public final /* bridge */ /* synthetic */ Context mo14231n() {
        return super.mo14231n();
    }

    /* renamed from: o */
    public final /* bridge */ /* synthetic */ C2293p mo14232o() {
        return super.mo14232o();
    }

    /* renamed from: p */
    public final /* bridge */ /* synthetic */ C2264el mo14233p() {
        return super.mo14233p();
    }

    /* renamed from: q */
    public final /* bridge */ /* synthetic */ C2161ar mo14234q() {
        return super.mo14234q();
    }

    /* renamed from: r */
    public final /* bridge */ /* synthetic */ C2295r mo14235r() {
        return super.mo14235r();
    }

    /* renamed from: s */
    public final /* bridge */ /* synthetic */ C2147ad mo14236s() {
        return super.mo14236s();
    }

    /* renamed from: t */
    public final /* bridge */ /* synthetic */ C2272et mo14237t() {
        return super.mo14237t();
    }

    /* renamed from: u */
    public final /* bridge */ /* synthetic */ C2270er mo14238u() {
        return super.mo14238u();
    }
}
