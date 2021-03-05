package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C0926p;
import java.util.Iterator;

/* renamed from: com.google.android.gms.measurement.internal.c */
public final class C2197c {

    /* renamed from: a */
    final String f8230a;

    /* renamed from: b */
    final String f8231b;

    /* renamed from: c */
    final long f8232c;

    /* renamed from: d */
    final long f8233d;

    /* renamed from: e */
    final zzad f8234e;

    /* renamed from: f */
    private final String f8235f;

    private C2197c(C2166aw awVar, String str, String str2, String str3, long j, long j2, zzad zzad) {
        C0926p.m1308a(str2);
        C0926p.m1308a(str3);
        C0926p.m1306a(zzad);
        this.f8230a = str2;
        this.f8231b = str3;
        this.f8235f = TextUtils.isEmpty(str) ? null : str;
        this.f8232c = j;
        this.f8233d = j2;
        if (this.f8233d != 0 && this.f8233d > this.f8232c) {
            awVar.mo14235r().mo14833i().mo14843a("Event created with reverse previous/current timestamps. appId, name", C2295r.m11413a(str2), C2295r.m11413a(str3));
        }
        this.f8234e = zzad;
    }

    C2197c(C2166aw awVar, String str, String str2, String str3, long j, long j2, Bundle bundle) {
        zzad zzad;
        C0926p.m1308a(str2);
        C0926p.m1308a(str3);
        this.f8230a = str2;
        this.f8231b = str3;
        this.f8235f = TextUtils.isEmpty(str) ? null : str;
        this.f8232c = j;
        this.f8233d = j2;
        if (this.f8233d != 0 && this.f8233d > this.f8232c) {
            awVar.mo14235r().mo14833i().mo14842a("Event created with reverse previous/current timestamps. appId", C2295r.m11413a(str2));
        }
        if (bundle == null || bundle.isEmpty()) {
            zzad = new zzad(new Bundle());
        } else {
            Bundle bundle2 = new Bundle(bundle);
            Iterator it = bundle2.keySet().iterator();
            while (it.hasNext()) {
                String str4 = (String) it.next();
                if (str4 == null) {
                    awVar.mo14235r().mo14830d_().mo14841a("Param name can't be null");
                    it.remove();
                } else {
                    Object a = awVar.mo14325j().mo14566a(str4, bundle2.get(str4));
                    if (a == null) {
                        awVar.mo14235r().mo14833i().mo14842a("Param value can't be null", awVar.mo14326k().mo14825b(str4));
                        it.remove();
                    } else {
                        awVar.mo14325j().mo14569a(bundle2, str4, a);
                    }
                }
            }
            zzad = new zzad(bundle2);
        }
        this.f8234e = zzad;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final C2197c mo14382a(C2166aw awVar, long j) {
        return new C2197c(awVar, this.f8235f, this.f8230a, this.f8231b, this.f8232c, j, this.f8234e);
    }

    public final String toString() {
        String str = this.f8230a;
        String str2 = this.f8231b;
        String valueOf = String.valueOf(this.f8234e);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 33 + String.valueOf(str2).length() + String.valueOf(valueOf).length());
        sb.append("Event{appId='");
        sb.append(str);
        sb.append("', name='");
        sb.append(str2);
        sb.append("', params=");
        sb.append(valueOf);
        sb.append('}');
        return sb.toString();
    }
}
