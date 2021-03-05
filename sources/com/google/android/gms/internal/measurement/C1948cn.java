package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.annotation.GuardedBy;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.cn */
public final class C1948cn implements C1933bz {
    @GuardedBy("SharedPreferencesLoader.class")

    /* renamed from: a */
    static final Map<String, C1948cn> f7569a = new HashMap();

    /* renamed from: b */
    private final SharedPreferences f7570b;

    /* renamed from: c */
    private final SharedPreferences.OnSharedPreferenceChangeListener f7571c = new C1949co(this);

    /* renamed from: d */
    private final Object f7572d = new Object();

    /* renamed from: e */
    private volatile Map<String, ?> f7573e;
    @GuardedBy("this")

    /* renamed from: f */
    private final List<C1932by> f7574f = new ArrayList();

    /* renamed from: a */
    static C1948cn m9052a(Context context, String str) {
        C1948cn cnVar;
        SharedPreferences sharedPreferences;
        if (!((!C1927bt.m8989a() || str.startsWith("direct_boot:")) ? true : C1927bt.m8990a(context))) {
            return null;
        }
        synchronized (C1948cn.class) {
            cnVar = f7569a.get(str);
            if (cnVar == null) {
                if (str.startsWith("direct_boot:")) {
                    if (C1927bt.m8989a()) {
                        context = context.createDeviceProtectedStorageContext();
                    }
                    sharedPreferences = context.getSharedPreferences(str.substring(12), 0);
                } else {
                    sharedPreferences = context.getSharedPreferences(str, 0);
                }
                cnVar = new C1948cn(sharedPreferences);
                f7569a.put(str, cnVar);
            }
        }
        return cnVar;
    }

    private C1948cn(SharedPreferences sharedPreferences) {
        this.f7570b = sharedPreferences;
        this.f7570b.registerOnSharedPreferenceChangeListener(this.f7571c);
    }

    /* renamed from: a */
    public final Object mo13546a(String str) {
        Map<String, ?> map = this.f7573e;
        if (map == null) {
            synchronized (this.f7572d) {
                map = this.f7573e;
                if (map == null) {
                    map = this.f7570b.getAll();
                    this.f7573e = map;
                }
            }
        }
        if (map != null) {
            return map.get(str);
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void mo13564a(SharedPreferences sharedPreferences, String str) {
        synchronized (this.f7572d) {
            this.f7573e = null;
            C1941cg.m9023a();
        }
        synchronized (this) {
            for (C1932by a : this.f7574f) {
                a.mo13552a();
            }
        }
    }
}
