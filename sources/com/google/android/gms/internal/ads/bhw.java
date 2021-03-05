package com.google.android.gms.internal.ads;

import android.net.Uri;

public final class bhw {

    /* renamed from: a */
    public final long f4362a;

    /* renamed from: b */
    public final long f4363b;

    /* renamed from: c */
    private final String f4364c;

    /* renamed from: d */
    private int f4365d;

    public bhw(String str, long j, long j2) {
        this.f4364c = str == null ? "" : str;
        this.f4362a = j;
        this.f4363b = j2;
    }

    /* renamed from: a */
    public final Uri mo11960a(String str) {
        return Uri.parse(bko.m5804a(str, this.f4364c));
    }

    /* renamed from: b */
    private final String m5533b(String str) {
        return bko.m5804a(str, this.f4364c);
    }

    /* renamed from: a */
    public final bhw mo11961a(bhw bhw, String str) {
        String b = m5533b(str);
        if (bhw == null || !b.equals(bhw.m5533b(str))) {
            return null;
        }
        long j = -1;
        if (this.f4363b != -1 && this.f4362a + this.f4363b == bhw.f4362a) {
            long j2 = this.f4362a;
            if (bhw.f4363b != -1) {
                j = this.f4363b + bhw.f4363b;
            }
            return new bhw(b, j2, j);
        } else if (bhw.f4363b == -1 || bhw.f4362a + bhw.f4363b != this.f4362a) {
            return null;
        } else {
            long j3 = bhw.f4362a;
            if (this.f4363b != -1) {
                j = bhw.f4363b + this.f4363b;
            }
            return new bhw(b, j3, j);
        }
    }

    public final int hashCode() {
        if (this.f4365d == 0) {
            this.f4365d = ((((((int) this.f4362a) + 527) * 31) + ((int) this.f4363b)) * 31) + this.f4364c.hashCode();
        }
        return this.f4365d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        bhw bhw = (bhw) obj;
        return this.f4362a == bhw.f4362a && this.f4363b == bhw.f4363b && this.f4364c.equals(bhw.f4364c);
    }
}
