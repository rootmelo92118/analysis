package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Parcel;
import android.support.annotation.Nullable;
import android.util.Base64;
import com.google.android.gms.ads.internal.zzbv;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.annotation.ParametersAreNonnullByDefault;

@C1598qn
@ParametersAreNonnullByDefault
/* renamed from: com.google.android.gms.internal.ads.gq */
public final class C1331gq {

    /* renamed from: a */
    private final Map<C1332gr, C1333gs> f5390a = new HashMap();

    /* renamed from: b */
    private final LinkedList<C1332gr> f5391b = new LinkedList<>();
    @Nullable

    /* renamed from: c */
    private C1299fl f5392c;

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo12554a(C1299fl flVar) {
        if (this.f5392c == null) {
            this.f5392c = flVar.mo12537b();
            if (this.f5392c != null) {
                SharedPreferences sharedPreferences = this.f5392c.mo12534a().getSharedPreferences("com.google.android.gms.ads.internal.interstitial.InterstitialAdPool", 0);
                while (this.f5391b.size() > 0) {
                    C1332gr remove = this.f5391b.remove();
                    C1333gs gsVar = this.f5390a.get(remove);
                    m6919a("Flushing interstitial queue for %s.", remove);
                    while (gsVar.mo12565d() > 0) {
                        gsVar.mo12559a((zzwb) null).f5399a.zzke();
                    }
                    this.f5390a.remove(remove);
                }
                try {
                    HashMap hashMap = new HashMap();
                    for (Map.Entry next : sharedPreferences.getAll().entrySet()) {
                        if (!((String) next.getKey()).equals("PoolKeys")) {
                            C1337gw a = C1337gw.m6957a((String) next.getValue());
                            C1332gr grVar = new C1332gr(a.f5417a, a.f5418b, a.f5419c);
                            if (!this.f5390a.containsKey(grVar)) {
                                this.f5390a.put(grVar, new C1333gs(a.f5417a, a.f5418b, a.f5419c));
                                hashMap.put(grVar.toString(), grVar);
                                m6919a("Restored interstitial queue for %s.", grVar);
                            }
                        }
                    }
                    for (String str : m6920a(sharedPreferences.getString("PoolKeys", ""))) {
                        C1332gr grVar2 = (C1332gr) hashMap.get(str);
                        if (this.f5390a.containsKey(grVar2)) {
                            this.f5391b.add(grVar2);
                        }
                    }
                } catch (IOException | RuntimeException e) {
                    zzbv.zzlj().mo13119a(e, "InterstitialAdPool.restore");
                    C1772wz.m1627c("Malformed preferences value for InterstitialAdPool.", e);
                    this.f5390a.clear();
                    this.f5391b.clear();
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Nullable
    /* renamed from: a */
    public final C1334gt mo12552a(zzwb zzwb, String str) {
        if (m6923b(str)) {
            return null;
        }
        int i = new C1666ta(this.f5392c.mo12534a()).mo12965a().f6493o;
        zzwb c = m6924c(zzwb);
        String c2 = m6925c(str);
        C1332gr grVar = new C1332gr(c, c2, i);
        C1333gs gsVar = this.f5390a.get(grVar);
        if (gsVar == null) {
            m6919a("Interstitial pool created at %s.", grVar);
            gsVar = new C1333gs(c, c2, i);
            this.f5390a.put(grVar, gsVar);
        }
        this.f5391b.remove(grVar);
        this.f5391b.add(grVar);
        gsVar.mo12568g();
        while (true) {
            if (this.f5391b.size() <= ((Integer) bre.m6321e().mo12778a(C1557p.f5899aG)).intValue()) {
                break;
            }
            C1332gr remove = this.f5391b.remove();
            C1333gs gsVar2 = this.f5390a.get(remove);
            m6919a("Evicting interstitial queue for %s.", remove);
            while (gsVar2.mo12565d() > 0) {
                C1334gt a = gsVar2.mo12559a((zzwb) null);
                if (a.f5403e) {
                    C1335gu.m6945a().mo12573c();
                }
                a.f5399a.zzke();
            }
            this.f5390a.remove(remove);
        }
        while (gsVar.mo12565d() > 0) {
            C1334gt a2 = gsVar.mo12559a(c);
            if (a2.f5403e) {
                if (zzbv.zzlm().mo9996a() - a2.f5402d > ((long) ((Integer) bre.m6321e().mo12778a(C1557p.f5901aI)).intValue()) * 1000) {
                    m6919a("Expired interstitial at %s.", grVar);
                    C1335gu.m6945a().mo12572b();
                }
            }
            String str2 = a2.f5400b != null ? " (inline) " : " ";
            StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 34);
            sb.append("Pooled interstitial");
            sb.append(str2);
            sb.append("returned at %s.");
            m6919a(sb.toString(), grVar);
            return a2;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo12555b(zzwb zzwb, String str) {
        if (this.f5392c != null) {
            int i = new C1666ta(this.f5392c.mo12534a()).mo12965a().f6493o;
            zzwb c = m6924c(zzwb);
            String c2 = m6925c(str);
            C1332gr grVar = new C1332gr(c, c2, i);
            C1333gs gsVar = this.f5390a.get(grVar);
            if (gsVar == null) {
                m6919a("Interstitial pool created at %s.", grVar);
                gsVar = new C1333gs(c, c2, i);
                this.f5390a.put(grVar, gsVar);
            }
            gsVar.mo12561a(this.f5392c, zzwb);
            gsVar.mo12568g();
            m6919a("Inline entry added to the queue at %s.", grVar);
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002f, code lost:
        r5 = r1.mo12565d();
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo12553a() {
        /*
            r9 = this;
            com.google.android.gms.internal.ads.fl r0 = r9.f5392c
            if (r0 != 0) goto L_0x0005
            return
        L_0x0005:
            java.util.Map<com.google.android.gms.internal.ads.gr, com.google.android.gms.internal.ads.gs> r0 = r9.f5390a
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x000f:
            boolean r1 = r0.hasNext()
            r2 = 0
            if (r1 == 0) goto L_0x0089
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r3 = r1.getKey()
            com.google.android.gms.internal.ads.gr r3 = (com.google.android.gms.internal.ads.C1332gr) r3
            java.lang.Object r1 = r1.getValue()
            com.google.android.gms.internal.ads.gs r1 = (com.google.android.gms.internal.ads.C1333gs) r1
            r4 = 2
            boolean r5 = com.google.android.gms.internal.ads.C1772wz.m1623a((int) r4)
            if (r5 == 0) goto L_0x0056
            int r5 = r1.mo12565d()
            int r6 = r1.mo12566e()
            if (r6 >= r5) goto L_0x0056
            java.lang.String r7 = "Loading %s/%s pooled interstitials for %s."
            r8 = 3
            java.lang.Object[] r8 = new java.lang.Object[r8]
            int r6 = r5 - r6
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r8[r2] = r6
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r6 = 1
            r8[r6] = r5
            r8[r4] = r3
            java.lang.String r4 = java.lang.String.format(r7, r8)
            com.google.android.gms.internal.ads.C1772wz.m8287a(r4)
        L_0x0056:
            int r4 = r1.mo12567f()
            int r4 = r4 + r2
        L_0x005b:
            int r2 = r1.mo12565d()
            com.google.android.gms.internal.ads.e<java.lang.Integer> r5 = com.google.android.gms.internal.ads.C1557p.f5900aH
            com.google.android.gms.internal.ads.m r6 = com.google.android.gms.internal.ads.bre.m6321e()
            java.lang.Object r5 = r6.mo12778a(r5)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            if (r2 >= r5) goto L_0x0081
            java.lang.String r2 = "Pooling and loading one new interstitial for %s."
            m6919a((java.lang.String) r2, (com.google.android.gms.internal.ads.C1332gr) r3)
            com.google.android.gms.internal.ads.fl r2 = r9.f5392c
            boolean r2 = r1.mo12562a((com.google.android.gms.internal.ads.C1299fl) r2)
            if (r2 == 0) goto L_0x005b
            int r4 = r4 + 1
            goto L_0x005b
        L_0x0081:
            com.google.android.gms.internal.ads.gu r1 = com.google.android.gms.internal.ads.C1335gu.m6945a()
            r1.mo12571a(r4)
            goto L_0x000f
        L_0x0089:
            com.google.android.gms.internal.ads.fl r0 = r9.f5392c
            if (r0 == 0) goto L_0x00ea
            com.google.android.gms.internal.ads.fl r0 = r9.f5392c
            android.content.Context r0 = r0.mo12534a()
            java.lang.String r1 = "com.google.android.gms.ads.internal.interstitial.InterstitialAdPool"
            android.content.SharedPreferences r0 = r0.getSharedPreferences(r1, r2)
            android.content.SharedPreferences$Editor r0 = r0.edit()
            r0.clear()
            java.util.Map<com.google.android.gms.internal.ads.gr, com.google.android.gms.internal.ads.gs> r1 = r9.f5390a
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L_0x00aa:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x00de
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getKey()
            com.google.android.gms.internal.ads.gr r3 = (com.google.android.gms.internal.ads.C1332gr) r3
            java.lang.Object r2 = r2.getValue()
            com.google.android.gms.internal.ads.gs r2 = (com.google.android.gms.internal.ads.C1333gs) r2
            boolean r4 = r2.mo12569h()
            if (r4 == 0) goto L_0x00aa
            com.google.android.gms.internal.ads.gw r4 = new com.google.android.gms.internal.ads.gw
            r4.<init>(r2)
            java.lang.String r2 = r4.mo12581a()
            java.lang.String r4 = r3.toString()
            r0.putString(r4, r2)
            java.lang.String r2 = "Saved interstitial queue for %s."
            m6919a((java.lang.String) r2, (com.google.android.gms.internal.ads.C1332gr) r3)
            goto L_0x00aa
        L_0x00de:
            java.lang.String r1 = "PoolKeys"
            java.lang.String r2 = r9.m6922b()
            r0.putString(r1, r2)
            r0.apply()
        L_0x00ea:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1331gq.mo12553a():void");
    }

    /* renamed from: b */
    private final String m6922b() {
        try {
            StringBuilder sb = new StringBuilder();
            Iterator it = this.f5391b.iterator();
            while (it.hasNext()) {
                sb.append(Base64.encodeToString(((C1332gr) it.next()).toString().getBytes("UTF-8"), 0));
                if (it.hasNext()) {
                    sb.append("\u0000");
                }
            }
            return sb.toString();
        } catch (UnsupportedEncodingException unused) {
            return "";
        }
    }

    /* renamed from: a */
    private static String[] m6920a(String str) {
        try {
            String[] split = str.split("\u0000");
            for (int i = 0; i < split.length; i++) {
                split[i] = new String(Base64.decode(split[i], 0), "UTF-8");
            }
            return split;
        } catch (UnsupportedEncodingException unused) {
            return new String[0];
        }
    }

    /* renamed from: b */
    private static boolean m6923b(String str) {
        try {
            return Pattern.matches((String) bre.m6321e().mo12778a(C1557p.f5902aJ), str);
        } catch (RuntimeException e) {
            zzbv.zzlj().mo13119a((Throwable) e, "InterstitialAdPool.isExcludedAdUnit");
            return false;
        }
    }

    /* renamed from: a */
    static Set<String> m6917a(zzwb zzwb) {
        HashSet hashSet = new HashSet();
        hashSet.addAll(zzwb.f7273c.keySet());
        Bundle bundle = zzwb.f7283m.getBundle("com.google.ads.mediation.admob.AdMobAdapter");
        if (bundle != null) {
            hashSet.addAll(bundle.keySet());
        }
        return hashSet;
    }

    /* renamed from: b */
    static zzwb m6921b(zzwb zzwb) {
        zzwb d = m6926d(zzwb);
        Bundle bundle = d.f7283m.getBundle("com.google.ads.mediation.admob.AdMobAdapter");
        if (bundle != null) {
            bundle.putBoolean("_skipMediation", true);
        }
        d.f7273c.putBoolean("_skipMediation", true);
        return d;
    }

    /* renamed from: c */
    private static zzwb m6924c(zzwb zzwb) {
        zzwb d = m6926d(zzwb);
        for (String str : ((String) bre.m6321e().mo12778a(C1557p.f5898aF)).split(",")) {
            m6918a(d.f7283m, str);
            if (str.startsWith("com.google.ads.mediation.admob.AdMobAdapter/")) {
                m6918a(d.f7273c, str.replaceFirst("com.google.ads.mediation.admob.AdMobAdapter/", ""));
            }
        }
        return d;
    }

    /* renamed from: c */
    private static String m6925c(String str) {
        try {
            Matcher matcher = Pattern.compile("([^/]+/[0-9]+).*").matcher(str);
            if (matcher.matches()) {
                return matcher.group(1);
            }
        } catch (RuntimeException unused) {
        }
        return str;
    }

    /* renamed from: d */
    private static zzwb m6926d(zzwb zzwb) {
        Parcel obtain = Parcel.obtain();
        zzwb.writeToParcel(obtain, 0);
        obtain.setDataPosition(0);
        obtain.recycle();
        return zzwb.CREATOR.createFromParcel(obtain).mo13454a();
    }

    /* renamed from: a */
    private static void m6918a(Bundle bundle, String str) {
        while (true) {
            String[] split = str.split("/", 2);
            if (split.length != 0) {
                String str2 = split[0];
                if (split.length == 1) {
                    bundle.remove(str2);
                    return;
                }
                bundle = bundle.getBundle(str2);
                if (bundle != null) {
                    str = split[1];
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    private static void m6919a(String str, C1332gr grVar) {
        if (C1772wz.m1623a(2)) {
            C1772wz.m8287a(String.format(str, new Object[]{grVar}));
        }
    }
}
