package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.yy */
final class C1825yy implements bsl {

    /* renamed from: a */
    private final /* synthetic */ String f6918a;

    /* renamed from: b */
    private final /* synthetic */ C1829zb f6919b;

    C1825yy(C1821yu yuVar, String str, C1829zb zbVar) {
        this.f6918a = str;
        this.f6919b = zbVar;
    }

    /* renamed from: a */
    public final void mo12333a(C1236dd ddVar) {
        String str = this.f6918a;
        String ddVar2 = ddVar.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 21 + String.valueOf(ddVar2).length());
        sb.append("Failed to load URL: ");
        sb.append(str);
        sb.append("\n");
        sb.append(ddVar2);
        C1772wz.m1630e(sb.toString());
        this.f6919b.mo12424a(null);
    }
}
