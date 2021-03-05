package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.List;

public final class bia extends bhx {

    /* renamed from: e */
    private final Uri f4374e;

    /* renamed from: f */
    private final long f4375f;

    /* renamed from: g */
    private final String f4376g;

    /* renamed from: h */
    private final bhw f4377h;

    /* renamed from: i */
    private final bih f4378i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bia(String str, long j, zzfs zzfs, String str2, big big, List<bhu> list, String str3, long j2) {
        super(str, -1, zzfs, str2, big, list);
        bhw bhw;
        String str4;
        String str5 = str;
        big big2 = big;
        this.f4374e = Uri.parse(str2);
        bih bih = null;
        if (big2.f4391e <= 0) {
            bhw = null;
        } else {
            bhw = new bhw((String) null, big2.f4390d, big2.f4391e);
        }
        this.f4377h = bhw;
        if (str5 != null) {
            String str6 = zzfs.f7205a;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 22 + String.valueOf(str6).length());
            sb.append(str);
            sb.append(".");
            sb.append(str6);
            sb.append(".-1");
            str4 = sb.toString();
        } else {
            str4 = null;
        }
        this.f4376g = str4;
        this.f4375f = -1;
        this.f4378i = this.f4377h == null ? new bih(new bhw((String) null, 0, -1)) : bih;
    }

    /* renamed from: d */
    public final bhw mo11965d() {
        return this.f4377h;
    }

    /* renamed from: e */
    public final bhl mo11966e() {
        return this.f4378i;
    }

    /* renamed from: f */
    public final String mo11967f() {
        return this.f4376g;
    }
}
