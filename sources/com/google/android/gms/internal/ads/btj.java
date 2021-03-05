package com.google.android.gms.internal.ads;

import android.location.Location;
import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.mediation.MediationAdapter;
import com.google.android.gms.ads.mediation.NetworkExtras;
import com.google.android.gms.ads.mediation.admob.AdMobExtras;
import com.google.android.gms.ads.mediation.customevent.CustomEvent;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;

public final class btj {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final HashSet<String> f5223a = new HashSet<>();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Bundle f5224b = new Bundle();
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final HashMap<Class<? extends NetworkExtras>, NetworkExtras> f5225c = new HashMap<>();
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final HashSet<String> f5226d = new HashSet<>();
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final Bundle f5227e = new Bundle();
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final HashSet<String> f5228f = new HashSet<>();
    /* access modifiers changed from: private */

    /* renamed from: g */
    public Date f5229g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public String f5230h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public int f5231i = -1;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public Location f5232j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public boolean f5233k = false;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public String f5234l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public String f5235m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public int f5236n = -1;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public boolean f5237o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public int f5238p = -1;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public String f5239q;

    /* renamed from: a */
    public final void mo12382a(String str) {
        this.f5223a.add(str);
    }

    @Deprecated
    /* renamed from: a */
    public final void mo12380a(NetworkExtras networkExtras) {
        if (networkExtras instanceof AdMobExtras) {
            mo12381a((Class<? extends MediationAdapter>) AdMobAdapter.class, ((AdMobExtras) networkExtras).getExtras());
        } else {
            this.f5225c.put(networkExtras.getClass(), networkExtras);
        }
    }

    /* renamed from: a */
    public final void mo12381a(Class<? extends MediationAdapter> cls, Bundle bundle) {
        this.f5224b.putBundle(cls.getName(), bundle);
    }

    /* renamed from: b */
    public final void mo12387b(Class<? extends CustomEvent> cls, Bundle bundle) {
        if (this.f5224b.getBundle("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter") == null) {
            this.f5224b.putBundle("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter", new Bundle());
        }
        this.f5224b.getBundle("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter").putBundle(cls.getName(), bundle);
    }

    /* renamed from: b */
    public final void mo12388b(String str) {
        this.f5226d.add(str);
    }

    /* renamed from: c */
    public final void mo12390c(String str) {
        this.f5226d.remove(str);
    }

    @Deprecated
    /* renamed from: a */
    public final void mo12384a(Date date) {
        this.f5229g = date;
    }

    /* renamed from: d */
    public final void mo12392d(String str) {
        this.f5230h = str;
    }

    @Deprecated
    /* renamed from: a */
    public final void mo12378a(int i) {
        this.f5231i = i;
    }

    /* renamed from: a */
    public final void mo12379a(Location location) {
        this.f5232j = location;
    }

    /* renamed from: a */
    public final void mo12385a(boolean z) {
        this.f5233k = z;
    }

    /* renamed from: e */
    public final void mo12393e(String str) {
        this.f5234l = str;
    }

    /* renamed from: f */
    public final void mo12394f(String str) {
        this.f5235m = str;
    }

    /* renamed from: b */
    public final void mo12389b(boolean z) {
        this.f5236n = z ? 1 : 0;
    }

    /* renamed from: a */
    public final void mo12383a(String str, String str2) {
        this.f5227e.putString(str, str2);
    }

    /* renamed from: g */
    public final void mo12395g(String str) {
        this.f5228f.add(str);
    }

    @Deprecated
    /* renamed from: c */
    public final void mo12391c(boolean z) {
        this.f5237o = z;
    }

    /* renamed from: b */
    public final void mo12386b(int i) {
        if (i == -1 || i == 0 || i == 1) {
            this.f5238p = i;
        }
    }

    /* renamed from: h */
    public final void mo12396h(String str) {
        if ("G".equals(str) || "PG".equals(str) || "T".equals(str) || "MA".equals(str)) {
            this.f5239q = str;
        }
    }
}
