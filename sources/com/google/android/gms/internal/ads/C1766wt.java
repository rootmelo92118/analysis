package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.internal.zzbv;
import com.google.android.gms.common.util.C0969e;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

@C1598qn
/* renamed from: com.google.android.gms.internal.ads.wt */
public final class C1766wt implements bnh {

    /* renamed from: a */
    private final Object f6798a = new Object();

    /* renamed from: b */
    private final C1776xc f6799b;

    /* renamed from: c */
    private final C1764wr f6800c;

    /* renamed from: d */
    private final C1762wp f6801d;

    /* renamed from: e */
    private final HashSet<C1754wh> f6802e = new HashSet<>();

    /* renamed from: f */
    private final HashSet<C1765ws> f6803f = new HashSet<>();

    public C1766wt(String str, C1776xc xcVar) {
        this.f6801d = new C1762wp(str, xcVar);
        this.f6799b = xcVar;
        this.f6800c = new C1764wr();
    }

    /* renamed from: a */
    public final void mo13156a(C1765ws wsVar) {
        synchronized (this.f6798a) {
            this.f6803f.add(wsVar);
        }
    }

    /* renamed from: a */
    public final void mo13155a(C1754wh whVar) {
        synchronized (this.f6798a) {
            this.f6802e.add(whVar);
        }
    }

    /* renamed from: a */
    public final void mo13158a(HashSet<C1754wh> hashSet) {
        synchronized (this.f6798a) {
            this.f6802e.addAll(hashSet);
        }
    }

    /* renamed from: a */
    public final Bundle mo13152a(Context context, C1763wq wqVar) {
        HashSet hashSet = new HashSet();
        synchronized (this.f6798a) {
            hashSet.addAll(this.f6802e);
            this.f6802e.clear();
        }
        Bundle bundle = new Bundle();
        bundle.putBundle("app", this.f6801d.mo13141a(context, this.f6800c.mo13146b()));
        Bundle bundle2 = new Bundle();
        Iterator<C1765ws> it = this.f6803f.iterator();
        while (it.hasNext()) {
            C1765ws next = it.next();
            bundle2.putBundle(next.mo13147a(), next.mo13149b());
        }
        bundle.putBundle("slots", bundle2);
        ArrayList arrayList = new ArrayList();
        Iterator it2 = hashSet.iterator();
        while (it2.hasNext()) {
            arrayList.add(((C1754wh) it2.next()).mo13105d());
        }
        bundle.putParcelableArrayList("ads", arrayList);
        wqVar.zza(hashSet);
        return bundle;
    }

    /* renamed from: a */
    public final void mo12240a(boolean z) {
        long a = zzbv.zzlm().mo9996a();
        if (z) {
            if (a - this.f6799b.mo13188i() > ((Long) bre.m6321e().mo12778a(C1557p.f5940av)).longValue()) {
                this.f6801d.f6781a = -1;
                return;
            }
            this.f6801d.f6781a = this.f6799b.mo13189j();
            return;
        }
        this.f6799b.mo13166a(a);
        this.f6799b.mo13171b(this.f6801d.f6781a);
    }

    /* renamed from: a */
    public final void mo13154a() {
        synchronized (this.f6798a) {
            this.f6801d.mo13142a();
        }
    }

    /* renamed from: b */
    public final void mo13159b() {
        synchronized (this.f6798a) {
            this.f6801d.mo13144b();
        }
    }

    /* renamed from: a */
    public final void mo13157a(zzwb zzwb, long j) {
        synchronized (this.f6798a) {
            this.f6801d.mo13143a(zzwb, j);
        }
    }

    /* renamed from: a */
    public final C1754wh mo13153a(C0969e eVar, String str) {
        return new C1754wh(eVar, this, this.f6800c.mo13145a(), str);
    }
}
