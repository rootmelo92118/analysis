package com.google.android.gms.internal.ads;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import android.support.annotation.Nullable;
import com.google.android.gms.ads.mediation.MediationAdapter;
import com.google.android.gms.ads.mediation.NetworkExtras;
import com.google.android.gms.ads.mediation.customevent.CustomEvent;
import com.google.android.gms.ads.search.SearchAdRequest;
import java.util.Collections;
import java.util.Date;
import java.util.Map;
import java.util.Set;

@C1598qn
public final class bti {

    /* renamed from: a */
    private final Date f5204a;

    /* renamed from: b */
    private final String f5205b;

    /* renamed from: c */
    private final int f5206c;

    /* renamed from: d */
    private final Set<String> f5207d;

    /* renamed from: e */
    private final Location f5208e;

    /* renamed from: f */
    private final boolean f5209f;

    /* renamed from: g */
    private final Bundle f5210g;

    /* renamed from: h */
    private final Map<Class<? extends NetworkExtras>, NetworkExtras> f5211h;

    /* renamed from: i */
    private final String f5212i;

    /* renamed from: j */
    private final String f5213j;

    /* renamed from: k */
    private final SearchAdRequest f5214k;

    /* renamed from: l */
    private final int f5215l;

    /* renamed from: m */
    private final Set<String> f5216m;

    /* renamed from: n */
    private final Bundle f5217n;

    /* renamed from: o */
    private final Set<String> f5218o;

    /* renamed from: p */
    private final boolean f5219p;

    /* renamed from: q */
    private final aig f5220q;

    /* renamed from: r */
    private final int f5221r;

    /* renamed from: s */
    private final String f5222s;

    public bti(btj btj) {
        this(btj, (SearchAdRequest) null);
    }

    public bti(btj btj, SearchAdRequest searchAdRequest) {
        this.f5204a = btj.f5229g;
        this.f5205b = btj.f5230h;
        this.f5206c = btj.f5231i;
        this.f5207d = Collections.unmodifiableSet(btj.f5223a);
        this.f5208e = btj.f5232j;
        this.f5209f = btj.f5233k;
        this.f5210g = btj.f5224b;
        this.f5211h = Collections.unmodifiableMap(btj.f5225c);
        this.f5212i = btj.f5234l;
        this.f5213j = btj.f5235m;
        this.f5214k = searchAdRequest;
        this.f5215l = btj.f5236n;
        this.f5216m = Collections.unmodifiableSet(btj.f5226d);
        this.f5217n = btj.f5227e;
        this.f5218o = Collections.unmodifiableSet(btj.f5228f);
        this.f5219p = btj.f5237o;
        this.f5220q = null;
        this.f5221r = btj.f5238p;
        this.f5222s = btj.f5239q;
    }

    @Deprecated
    /* renamed from: a */
    public final Date mo12358a() {
        return this.f5204a;
    }

    /* renamed from: b */
    public final String mo12361b() {
        return this.f5205b;
    }

    @Deprecated
    /* renamed from: c */
    public final int mo12362c() {
        return this.f5206c;
    }

    /* renamed from: d */
    public final Set<String> mo12364d() {
        return this.f5207d;
    }

    /* renamed from: e */
    public final Location mo12365e() {
        return this.f5208e;
    }

    /* renamed from: f */
    public final boolean mo12366f() {
        return this.f5209f;
    }

    @Deprecated
    /* renamed from: a */
    public final <T extends NetworkExtras> T mo12357a(Class<T> cls) {
        return (NetworkExtras) this.f5211h.get(cls);
    }

    /* renamed from: b */
    public final Bundle mo12360b(Class<? extends MediationAdapter> cls) {
        return this.f5210g.getBundle(cls.getName());
    }

    /* renamed from: c */
    public final Bundle mo12363c(Class<? extends CustomEvent> cls) {
        Bundle bundle = this.f5210g.getBundle("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter");
        if (bundle != null) {
            return bundle.getBundle(cls.getName());
        }
        return null;
    }

    /* renamed from: g */
    public final String mo12367g() {
        return this.f5212i;
    }

    /* renamed from: h */
    public final String mo12368h() {
        return this.f5213j;
    }

    /* renamed from: i */
    public final SearchAdRequest mo12369i() {
        return this.f5214k;
    }

    /* renamed from: a */
    public final boolean mo12359a(Context context) {
        Set<String> set = this.f5216m;
        bre.m6317a();
        return set.contains(C1851zx.m8584a(context));
    }

    /* renamed from: j */
    public final Map<Class<? extends NetworkExtras>, NetworkExtras> mo12370j() {
        return this.f5211h;
    }

    /* renamed from: k */
    public final Bundle mo12371k() {
        return this.f5210g;
    }

    /* renamed from: l */
    public final int mo12372l() {
        return this.f5215l;
    }

    /* renamed from: m */
    public final Bundle mo12373m() {
        return this.f5217n;
    }

    /* renamed from: n */
    public final Set<String> mo12374n() {
        return this.f5218o;
    }

    @Deprecated
    /* renamed from: o */
    public final boolean mo12375o() {
        return this.f5219p;
    }

    /* renamed from: p */
    public final int mo12376p() {
        return this.f5221r;
    }

    @Nullable
    /* renamed from: q */
    public final String mo12377q() {
        return this.f5222s;
    }
}
