package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Arrays;

public final class bji {

    /* renamed from: a */
    public final Uri f4453a;

    /* renamed from: b */
    public final byte[] f4454b;

    /* renamed from: c */
    public final long f4455c;

    /* renamed from: d */
    public final long f4456d;

    /* renamed from: e */
    public final long f4457e;

    /* renamed from: f */
    public final String f4458f;

    /* renamed from: g */
    public final int f4459g;

    public bji(Uri uri) {
        this(uri, 0);
    }

    public bji(Uri uri, int i) {
        this(uri, 0, -1, (String) null, i);
    }

    public bji(Uri uri, long j, long j2, String str) {
        this(uri, j, j, j2, str, 0);
    }

    public bji(Uri uri, long j, long j2, String str, int i) {
        this(uri, j, j, j2, str, i);
    }

    private bji(Uri uri, long j, long j2, long j3, String str, int i) {
        this(uri, (byte[]) null, j, j2, j3, str, i);
    }

    public bji(Uri uri, byte[] bArr, long j, long j2, long j3, String str, int i) {
        boolean z = false;
        bjy.m5689a(j >= 0);
        bjy.m5689a(j2 >= 0);
        bjy.m5689a((j3 > 0 || j3 == -1) ? true : z);
        this.f4453a = uri;
        this.f4454b = bArr;
        this.f4455c = j;
        this.f4456d = j2;
        this.f4457e = j3;
        this.f4458f = str;
        this.f4459g = i;
    }

    /* renamed from: a */
    public final boolean mo12014a(int i) {
        return (this.f4459g & 1) == 1;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f4453a);
        String arrays = Arrays.toString(this.f4454b);
        long j = this.f4455c;
        long j2 = this.f4456d;
        long j3 = this.f4457e;
        String str = this.f4458f;
        int i = this.f4459g;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 93 + String.valueOf(arrays).length() + String.valueOf(str).length());
        sb.append("DataSpec[");
        sb.append(valueOf);
        sb.append(", ");
        sb.append(arrays);
        sb.append(", ");
        sb.append(j);
        sb.append(", ");
        sb.append(j2);
        sb.append(", ");
        sb.append(j3);
        sb.append(", ");
        sb.append(str);
        sb.append(", ");
        sb.append(i);
        sb.append("]");
        return sb.toString();
    }
}
