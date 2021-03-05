package com.google.android.gms.internal.ads;

import java.util.HashMap;

public final class aun extends asl<Integer, Object> {

    /* renamed from: a */
    public String f2583a;

    /* renamed from: b */
    public long f2584b;

    /* renamed from: c */
    public String f2585c;

    /* renamed from: d */
    public String f2586d;

    /* renamed from: e */
    public String f2587e;

    public aun(String str) {
        this();
        mo11117a(str);
    }

    public aun() {
        this.f2583a = "E";
        this.f2584b = -1;
        this.f2585c = "E";
        this.f2586d = "E";
        this.f2587e = "E";
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo11117a(String str) {
        String str2;
        long j;
        String str3;
        String str4;
        String str5;
        HashMap b = m3703b(str);
        if (b != null) {
            if (b.get(0) == null) {
                str2 = "E";
            } else {
                str2 = (String) b.get(0);
            }
            this.f2583a = str2;
            if (b.get(1) == null) {
                j = -1;
            } else {
                j = ((Long) b.get(1)).longValue();
            }
            this.f2584b = j;
            if (b.get(2) == null) {
                str3 = "E";
            } else {
                str3 = (String) b.get(2);
            }
            this.f2585c = str3;
            if (b.get(3) == null) {
                str4 = "E";
            } else {
                str4 = (String) b.get(3);
            }
            this.f2586d = str4;
            if (b.get(4) == null) {
                str5 = "E";
            } else {
                str5 = (String) b.get(4);
            }
            this.f2587e = str5;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final HashMap<Integer, Object> mo11116a() {
        HashMap<Integer, Object> hashMap = new HashMap<>();
        hashMap.put(0, this.f2583a);
        hashMap.put(4, this.f2587e);
        hashMap.put(3, this.f2586d);
        hashMap.put(2, this.f2585c);
        hashMap.put(1, Long.valueOf(this.f2584b));
        return hashMap;
    }
}
