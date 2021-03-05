package com.google.android.gms.internal.measurement;

import android.net.Uri;

/* renamed from: com.google.android.gms.internal.measurement.cm */
public final class C1947cm {

    /* renamed from: a */
    private final String f7562a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Uri f7563b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final String f7564c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final String f7565d;

    /* renamed from: e */
    private final boolean f7566e;

    /* renamed from: f */
    private final boolean f7567f;

    /* renamed from: g */
    private final boolean f7568g;

    public C1947cm(Uri uri) {
        this((String) null, uri, "", "", false, false, false);
    }

    private C1947cm(String str, Uri uri, String str2, String str3, boolean z, boolean z2, boolean z3) {
        this.f7562a = null;
        this.f7563b = uri;
        this.f7564c = str2;
        this.f7565d = str3;
        this.f7566e = false;
        this.f7567f = false;
        this.f7568g = false;
    }

    /* renamed from: a */
    public final C1941cg<Long> mo13561a(String str, long j) {
        return C1941cg.m9027b(this, str, j);
    }

    /* renamed from: a */
    public final C1941cg<Boolean> mo13563a(String str, boolean z) {
        return C1941cg.m9029b(this, str, z);
    }

    /* renamed from: a */
    public final C1941cg<Integer> mo13560a(String str, int i) {
        return C1941cg.m9026b(this, str, i);
    }

    /* renamed from: a */
    public final C1941cg<Double> mo13559a(String str, double d) {
        return C1941cg.m9025b(this, str, d);
    }

    /* renamed from: a */
    public final C1941cg<String> mo13562a(String str, String str2) {
        return C1941cg.m9028b(this, str, str2);
    }
}
