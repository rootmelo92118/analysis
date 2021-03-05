package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.zzbv;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@C1598qn
/* renamed from: com.google.android.gms.internal.ads.kl */
public final class C1434kl implements C1418jw {

    /* renamed from: a */
    private final zzasi f5642a;

    /* renamed from: b */
    private final C1437ko f5643b;

    /* renamed from: c */
    private final Context f5644c;

    /* renamed from: d */
    private final Object f5645d = new Object();

    /* renamed from: e */
    private final C1420jy f5646e;

    /* renamed from: f */
    private final boolean f5647f;

    /* renamed from: g */
    private final long f5648g;

    /* renamed from: h */
    private final long f5649h;

    /* renamed from: i */
    private final C1019ad f5650i;

    /* renamed from: j */
    private final boolean f5651j;

    /* renamed from: k */
    private final String f5652k;

    /* renamed from: l */
    private boolean f5653l = false;

    /* renamed from: m */
    private C1424kb f5654m;

    /* renamed from: n */
    private List<C1427ke> f5655n = new ArrayList();

    /* renamed from: o */
    private final boolean f5656o;

    public C1434kl(Context context, zzasi zzasi, C1437ko koVar, C1420jy jyVar, boolean z, boolean z2, String str, long j, long j2, C1019ad adVar, boolean z3) {
        this.f5644c = context;
        this.f5642a = zzasi;
        this.f5643b = koVar;
        this.f5646e = jyVar;
        this.f5647f = z;
        this.f5651j = z2;
        this.f5652k = str;
        this.f5648g = j;
        this.f5649h = j2;
        this.f5650i = adVar;
        this.f5656o = z3;
    }

    /* renamed from: a */
    public final C1427ke mo12639a(List<C1419jx> list) {
        Object obj;
        C1427ke keVar;
        C1772wz.m1624b("Starting mediation.");
        ArrayList arrayList = new ArrayList();
        C1016aa a = this.f5650i.mo10149a();
        zzwf zzwf = this.f5642a.f7033d;
        int[] iArr = new int[2];
        if (zzwf.f7298g != null) {
            zzbv.zzlz();
            if (C1429kg.m7188a(this.f5652k, iArr)) {
                int i = iArr[0];
                int i2 = iArr[1];
                zzwf[] zzwfArr = zzwf.f7298g;
                int length = zzwfArr.length;
                int i3 = 0;
                while (true) {
                    if (i3 >= length) {
                        break;
                    }
                    zzwf zzwf2 = zzwfArr[i3];
                    if (i == zzwf2.f7296e && i2 == zzwf2.f7293b) {
                        zzwf = zzwf2;
                        break;
                    }
                    i3++;
                }
            }
        }
        Iterator<C1419jx> it = list.iterator();
        int i4 = 1;
        while (it.hasNext()) {
            C1419jx next = it.next();
            String valueOf = String.valueOf(next.f5546b);
            C1772wz.m1628d(valueOf.length() != 0 ? "Trying mediation network: ".concat(valueOf) : new String("Trying mediation network: "));
            Iterator<String> it2 = next.f5547c.iterator();
            while (true) {
                if (it2.hasNext()) {
                    String next2 = it2.next();
                    C1016aa a2 = this.f5650i.mo10149a();
                    Object obj2 = this.f5645d;
                    synchronized (obj2) {
                        try {
                            if (this.f5653l) {
                                keVar = new C1427ke(-1);
                            } else {
                                Iterator<C1419jx> it3 = it;
                                Iterator<String> it4 = it2;
                                C1016aa aaVar = a;
                                C1016aa aaVar2 = a2;
                                C1424kb kbVar = r11;
                                obj = obj2;
                                try {
                                    C1424kb kbVar2 = new C1424kb(this.f5644c, next2, this.f5643b, this.f5646e, next, this.f5642a.f7032c, zzwf, this.f5642a.f7040k, this.f5647f, this.f5651j, this.f5642a.f7054y, this.f5642a.f7043n, this.f5642a.f7055z, this.f5642a.f7020X, this.f5656o);
                                    this.f5654m = kbVar;
                                    C1427ke a3 = this.f5654m.mo12667a(this.f5648g, this.f5649h);
                                    this.f5655n.add(a3);
                                    if (a3.f5616a == 0) {
                                        C1772wz.m1624b("Adapter succeeded.");
                                        this.f5650i.mo10153a("mediation_network_succeed", next2);
                                        if (!arrayList.isEmpty()) {
                                            this.f5650i.mo10153a("mediation_networks_fail", TextUtils.join(",", arrayList));
                                        }
                                        this.f5650i.mo10155a(aaVar2, "mls");
                                        this.f5650i.mo10155a(aaVar, "ttm");
                                        return a3;
                                    }
                                    C1016aa aaVar3 = aaVar;
                                    int i5 = a3.f5616a;
                                    arrayList.add(next2);
                                    this.f5650i.mo10155a(aaVar2, "mlf");
                                    if (a3.f5618c != null) {
                                        C1782xi.f6838a.post(new C1435km(this, a3));
                                    }
                                    a = aaVar3;
                                    i4 = i5;
                                    it = it3;
                                    it2 = it4;
                                } catch (Throwable th) {
                                    th = th;
                                    throw th;
                                }
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            obj = obj2;
                            throw th;
                        }
                    }
                    return keVar;
                }
            }
        }
        if (!arrayList.isEmpty()) {
            this.f5650i.mo10153a("mediation_networks_fail", TextUtils.join(",", arrayList));
        }
        if (((Boolean) bre.m6321e().mo12778a(C1557p.f6004cF)).booleanValue()) {
            return new C1427ke(i4);
        }
        return new C1427ke(1);
    }

    /* renamed from: a */
    public final void mo12640a() {
        synchronized (this.f5645d) {
            this.f5653l = true;
            if (this.f5654m != null) {
                this.f5654m.mo12668a();
            }
        }
    }

    /* renamed from: b */
    public final List<C1427ke> mo12641b() {
        return this.f5655n;
    }
}
