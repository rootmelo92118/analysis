package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import org.json.JSONObject;

@C1598qn
/* renamed from: com.google.android.gms.internal.ads.e */
public abstract class C1259e<T> {

    /* renamed from: a */
    private final int f5327a;

    /* renamed from: b */
    private final String f5328b;

    /* renamed from: c */
    private final T f5329c;

    private C1259e(int i, String str, T t) {
        this.f5327a = i;
        this.f5328b = str;
        this.f5329c = t;
        bre.m6320d().mo12646a(this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract T mo12508a(SharedPreferences sharedPreferences);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract T mo12509a(JSONObject jSONObject);

    /* renamed from: a */
    public abstract void mo12511a(SharedPreferences.Editor editor, T t);

    /* renamed from: a */
    public final String mo12510a() {
        return this.f5328b;
    }

    /* renamed from: b */
    public final T mo12512b() {
        return this.f5329c;
    }

    /* renamed from: a */
    public static C1259e<Boolean> m6751a(int i, String str, Boolean bool) {
        return new C1287f(i, str, bool);
    }

    /* renamed from: a */
    public static C1259e<Integer> m6749a(int i, String str, int i2) {
        return new C1314g(i, str, Integer.valueOf(i2));
    }

    /* renamed from: a */
    public static C1259e<Long> m6750a(int i, String str, long j) {
        return new C1341h(i, str, Long.valueOf(j));
    }

    /* renamed from: a */
    public static C1259e<Float> m6748a(int i, String str, float f) {
        return new C1368i(i, str, Float.valueOf(f));
    }

    /* renamed from: a */
    public static C1259e<String> m6752a(int i, String str, String str2) {
        return new C1395j(i, str, str2);
    }

    /* renamed from: a */
    public static C1259e<String> m6747a(int i, String str) {
        C1259e<String> a = m6752a(i, str, (String) null);
        bre.m6320d().mo12648b(a);
        return a;
    }

    /* renamed from: b */
    public static C1259e<String> m6753b(int i, String str) {
        C1259e<String> a = m6752a(i, str, (String) null);
        bre.m6320d().mo12649c(a);
        return a;
    }

    /* renamed from: c */
    public final int mo12513c() {
        return this.f5327a;
    }

    /* synthetic */ C1259e(int i, String str, Object obj, C1287f fVar) {
        this(i, str, obj);
    }
}
