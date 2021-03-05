package com.google.android.gms.internal.ads;

final class apy {

    /* renamed from: a */
    private static final Class<?> f2230a = m3373c();

    /* renamed from: c */
    private static Class<?> m3373c() {
        try {
            return Class.forName("com.google.protobuf.ExtensionRegistry");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static apz m3370a() {
        if (f2230a != null) {
            try {
                return m3371a("getEmptyRegistry");
            } catch (Exception unused) {
            }
        }
        return apz.f2231a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0014  */
    /* JADX WARNING: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x000e  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static com.google.android.gms.internal.ads.apz m3372b() {
        /*
            java.lang.Class<?> r0 = f2230a
            if (r0 == 0) goto L_0x000b
            java.lang.String r0 = "loadGeneratedRegistry"
            com.google.android.gms.internal.ads.apz r0 = m3371a(r0)     // Catch:{ Exception -> 0x000b }
            goto L_0x000c
        L_0x000b:
            r0 = 0
        L_0x000c:
            if (r0 != 0) goto L_0x0012
            com.google.android.gms.internal.ads.apz r0 = com.google.android.gms.internal.ads.apz.m3376c()
        L_0x0012:
            if (r0 != 0) goto L_0x0018
            com.google.android.gms.internal.ads.apz r0 = m3370a()
        L_0x0018:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.apy.m3372b():com.google.android.gms.internal.ads.apz");
    }

    /* renamed from: a */
    private static final apz m3371a(String str) {
        return (apz) f2230a.getDeclaredMethod(str, new Class[0]).invoke((Object) null, new Object[0]);
    }
}
