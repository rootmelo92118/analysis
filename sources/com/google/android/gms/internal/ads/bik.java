package com.google.android.gms.internal.ads;

public final class bik {

    /* renamed from: a */
    public final String f4397a;

    /* renamed from: b */
    public final String f4398b;

    public bik(String str, String str2) {
        this.f4397a = str;
        this.f4398b = str2;
    }

    public final String toString() {
        String str = this.f4397a;
        String str2 = this.f4398b;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 2 + String.valueOf(str2).length());
        sb.append(str);
        sb.append(", ");
        sb.append(str2);
        return sb.toString();
    }
}
