package com.google.android.gms.internal.ads;

import android.text.TextUtils;

public final class bff {

    /* renamed from: a */
    private final String f4059a;

    /* renamed from: b */
    private final String f4060b;

    public bff(String str, String str2) {
        this.f4059a = str;
        this.f4060b = str2;
    }

    /* renamed from: a */
    public final String mo11807a() {
        return this.f4059a;
    }

    /* renamed from: b */
    public final String mo11808b() {
        return this.f4060b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        bff bff = (bff) obj;
        return TextUtils.equals(this.f4059a, bff.f4059a) && TextUtils.equals(this.f4060b, bff.f4060b);
    }

    public final int hashCode() {
        return (this.f4059a.hashCode() * 31) + this.f4060b.hashCode();
    }

    public final String toString() {
        String str = this.f4059a;
        String str2 = this.f4060b;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 20 + String.valueOf(str2).length());
        sb.append("Header[name=");
        sb.append(str);
        sb.append(",value=");
        sb.append(str2);
        sb.append("]");
        return sb.toString();
    }
}
