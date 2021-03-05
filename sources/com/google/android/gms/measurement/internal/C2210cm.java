package com.google.android.gms.measurement.internal;

import android.os.Build;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Size;
import android.support.annotation.WorkerThread;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.common.internal.C0926p;
import com.google.android.gms.internal.measurement.C1895at;
import com.google.android.gms.internal.measurement.C1916bi;
import com.google.android.gms.internal.measurement.C1917bj;
import com.google.android.gms.internal.measurement.C1918bk;
import com.google.android.gms.internal.measurement.C1919bl;
import com.google.android.gms.internal.measurement.C1922bo;
import com.google.android.gms.internal.measurement.C2003ei;
import com.google.android.gms.internal.measurement.C2107hw;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import p000a.p001a.p002a.p003a.p004a.p006b.C0008a;

/* renamed from: com.google.android.gms.measurement.internal.cm */
final class C2210cm extends C2253eb {
    public C2210cm(C2254ec ecVar) {
        super(ecVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final boolean mo14289e() {
        return false;
    }

    @WorkerThread
    /* renamed from: a */
    public final byte[] mo14425a(@NonNull zzag zzag, @Size(min = 1) String str) {
        Integer num;
        C2266en enVar;
        C1918bk bkVar;
        C1919bl blVar;
        Bundle bundle;
        C2224d dVar;
        long j;
        C2263ek ekVar;
        zzag zzag2 = zzag;
        String str2 = str;
        mo14221d();
        this.f8222q.mo14310F();
        C0926p.m1306a(zzag);
        C0926p.m1308a(str);
        if (!mo14237t().mo14723d(str2, C2284h.f8555at)) {
            mo14235r().mo14837w().mo14842a("Generating ScionPayload disabled. packageName", str2);
            return new byte[0];
        } else if ("_iap".equals(zzag2.f8649a) || "_iapx".equals(zzag2.f8649a)) {
            C1918bk bkVar2 = new C1918bk();
            mo14294i().mo14782f();
            try {
                C2266en b = mo14294i().mo14771b(str2);
                if (b == null) {
                    mo14235r().mo14837w().mo14842a("Log and bundle not available. package_name", str2);
                    return new byte[0];
                } else if (!b.mo14637o()) {
                    mo14235r().mo14837w().mo14842a("Log and bundle disabled. package_name", str2);
                    byte[] bArr = new byte[0];
                    mo14294i().mo14786x();
                    return bArr;
                } else {
                    C1919bl blVar2 = new C1919bl();
                    bkVar2.f7464a = new C1919bl[]{blVar2};
                    blVar2.f7481a = 1;
                    blVar2.f7489i = C0008a.ANDROID_CLIENT_TYPE;
                    blVar2.f7495o = b.mo14601b();
                    blVar2.f7494n = b.mo14630l();
                    blVar2.f7496p = b.mo14626j();
                    long k = b.mo14628k();
                    if (k == -2147483648L) {
                        num = null;
                    } else {
                        num = Integer.valueOf((int) k);
                    }
                    blVar2.f7468C = num;
                    blVar2.f7497q = Long.valueOf(b.mo14632m());
                    blVar2.f7505y = b.mo14609d();
                    if (TextUtils.isEmpty(blVar2.f7505y)) {
                        blVar2.f7474I = b.mo14612e();
                    }
                    blVar2.f7502v = Long.valueOf(b.mo14634n());
                    if (this.f8222q.mo14307C() && C2272et.m11155w() && mo14237t().mo14720c(blVar2.f7495o)) {
                        blVar2.f7472G = null;
                    }
                    Pair<String, Boolean> a = mo14236s().mo14244a(b.mo14601b());
                    if (b.mo14595C() && a != null && !TextUtils.isEmpty((CharSequence) a.first)) {
                        blVar2.f7499s = m10699a((String) a.first, Long.toString(zzag2.f8652d));
                        blVar2.f7500t = (Boolean) a.second;
                    }
                    mo14229l().mo14377A();
                    blVar2.f7491k = Build.MODEL;
                    mo14229l().mo14377A();
                    blVar2.f7490j = Build.VERSION.RELEASE;
                    blVar2.f7493m = Integer.valueOf((int) mo14229l().mo14357c_());
                    blVar2.f7492l = mo14229l().mo14358g();
                    try {
                        blVar2.f7501u = m10699a(b.mo14605c(), Long.toString(zzag2.f8652d));
                        blVar2.f7467B = b.mo14618g();
                        String str3 = blVar2.f7495o;
                        List<C2263ek> a2 = mo14294i().mo14758a(str3);
                        if (mo14237t().mo14724e(str2)) {
                            Iterator<C2263ek> it = a2.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    ekVar = null;
                                    break;
                                }
                                ekVar = it.next();
                                if ("_lte".equals(ekVar.f8444c)) {
                                    break;
                                }
                            }
                            if (ekVar == null || ekVar.f8446e == null) {
                                C2263ek ekVar2 = new C2263ek(str3, "auto", "_lte", mo14230m().mo9996a(), 0L);
                                a2.add(ekVar2);
                                mo14294i().mo14768a(ekVar2);
                            }
                        }
                        C1922bo[] boVarArr = new C1922bo[a2.size()];
                        for (int i = 0; i < a2.size(); i++) {
                            C1922bo boVar = new C1922bo();
                            boVarArr[i] = boVar;
                            boVar.f7516b = a2.get(i).f8444c;
                            boVar.f7515a = Long.valueOf(a2.get(i).f8445d);
                            mo14291g().mo14550a(boVar, a2.get(i).f8446e);
                        }
                        blVar2.f7483c = boVarArr;
                        Bundle b2 = zzag2.f8650b.mo14851b();
                        b2.putLong("_c", 1);
                        mo14235r().mo14837w().mo14841a("Marking in-app purchase as real-time");
                        b2.putLong("_r", 1);
                        b2.putString("_o", zzag2.f8651c);
                        if (mo14233p().mo14580f(blVar2.f7495o)) {
                            mo14233p().mo14569a(b2, "_dbg", (Object) 1L);
                            mo14233p().mo14569a(b2, "_r", (Object) 1L);
                        }
                        C2224d a3 = mo14294i().mo14755a(str2, zzag2.f8649a);
                        if (a3 == null) {
                            bundle = b2;
                            blVar = blVar2;
                            bkVar = bkVar2;
                            enVar = b;
                            dVar = new C2224d(str, zzag2.f8649a, 0, 0, zzag2.f8652d, 0, (Long) null, (Long) null, (Long) null, (Boolean) null);
                            j = 0;
                        } else {
                            bundle = b2;
                            blVar = blVar2;
                            bkVar = bkVar2;
                            enVar = b;
                            j = a3.f8323e;
                            dVar = a3.mo14457a(zzag2.f8652d);
                        }
                        mo14294i().mo14762a(dVar);
                        C2197c cVar = new C2197c(this.f8222q, zzag2.f8651c, str, zzag2.f8649a, zzag2.f8652d, j, bundle);
                        C1916bi biVar = new C1916bi();
                        C1919bl blVar3 = blVar;
                        blVar3.f7482b = new C1916bi[]{biVar};
                        biVar.f7455c = Long.valueOf(cVar.f8232c);
                        biVar.f7454b = cVar.f8231b;
                        biVar.f7456d = Long.valueOf(cVar.f8233d);
                        biVar.f7453a = new C1917bj[cVar.f8234e.mo14849a()];
                        Iterator<String> it2 = cVar.f8234e.iterator();
                        int i2 = 0;
                        while (it2.hasNext()) {
                            String next = it2.next();
                            C1917bj bjVar = new C1917bj();
                            biVar.f7453a[i2] = bjVar;
                            bjVar.f7459a = next;
                            mo14291g().mo14549a(bjVar, cVar.f8234e.mo14850a(next));
                            i2++;
                        }
                        blVar3.f7475J = (C1895at.C1898b) ((C2003ei) C1895at.C1898b.m8899a().mo13495a((C1895at.C1896a) ((C2003ei) C1895at.C1896a.m8890a().mo13493a(dVar.f8321c).mo13494a(zzag2.f8649a).mo13828g())).mo13828g());
                        blVar3.f7466A = mo14293h().mo14711a(enVar.mo14601b(), (C1916bi[]) null, blVar3.f7483c);
                        blVar3.f7485e = biVar.f7455c;
                        blVar3.f7486f = biVar.f7455c;
                        long i3 = enVar.mo14624i();
                        blVar3.f7488h = i3 != 0 ? Long.valueOf(i3) : null;
                        long h = enVar.mo14621h();
                        if (h != 0) {
                            i3 = h;
                        }
                        blVar3.f7487g = i3 != 0 ? Long.valueOf(i3) : null;
                        enVar.mo14641s();
                        blVar3.f7503w = Integer.valueOf((int) enVar.mo14638p());
                        blVar3.f7498r = Long.valueOf(mo14237t().mo14725f());
                        blVar3.f7484d = Long.valueOf(mo14230m().mo9996a());
                        blVar3.f7506z = Boolean.TRUE;
                        C2266en enVar2 = enVar;
                        enVar2.mo14598a(blVar3.f7485e.longValue());
                        enVar2.mo14602b(blVar3.f7486f.longValue());
                        mo14294i().mo14763a(enVar2);
                        mo14294i().mo14785w();
                        mo14294i().mo14786x();
                        try {
                            byte[] bArr2 = new byte[bkVar.mo14106e()];
                            C2107hw a4 = C2107hw.m10220a(bArr2, 0, bArr2.length);
                            bkVar.mo13499a(a4);
                            a4.mo14068a();
                            return mo14291g().mo14556b(bArr2);
                        } catch (IOException e) {
                            mo14235r().mo14830d_().mo14843a("Data loss. Failed to bundle and serialize. appId", C2295r.m11413a(str), e);
                            return null;
                        }
                    } catch (SecurityException e2) {
                        mo14235r().mo14837w().mo14842a("app instance id encryption failed", e2.getMessage());
                        byte[] bArr3 = new byte[0];
                        mo14294i().mo14786x();
                        return bArr3;
                    }
                }
            } catch (SecurityException e3) {
                mo14235r().mo14837w().mo14842a("Resettable device id encryption failed", e3.getMessage());
                return new byte[0];
            } finally {
                mo14294i().mo14786x();
            }
        } else {
            mo14235r().mo14837w().mo14843a("Generating a payload for this event is not available. package_name, event_name", str2, zzag2.f8649a);
            return null;
        }
    }

    /* renamed from: a */
    private static String m10699a(String str, String str2) {
        throw new SecurityException("This implementation should not be used.");
    }
}
