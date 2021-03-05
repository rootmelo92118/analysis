package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.du */
final class C1987du {

    /* renamed from: a */
    private static final Class<?> f7637a = m9453c();

    /* renamed from: c */
    private static Class<?> m9453c() {
        try {
            return Class.forName("com.google.protobuf.ExtensionRegistry");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static C1988dv m9450a() {
        if (f7637a != null) {
            try {
                return m9451a("getEmptyRegistry");
            } catch (Exception unused) {
            }
        }
        return C1988dv.f7638a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0014  */
    /* JADX WARNING: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x000e  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static com.google.android.gms.internal.measurement.C1988dv m9452b() {
        /*
            java.lang.Class<?> r0 = f7637a
            if (r0 == 0) goto L_0x000b
            java.lang.String r0 = "loadGeneratedRegistry"
            com.google.android.gms.internal.measurement.dv r0 = m9451a(r0)     // Catch:{ Exception -> 0x000b }
            goto L_0x000c
        L_0x000b:
            r0 = 0
        L_0x000c:
            if (r0 != 0) goto L_0x0012
            com.google.android.gms.internal.measurement.dv r0 = com.google.android.gms.internal.measurement.C1988dv.m9456c()
        L_0x0012:
            if (r0 != 0) goto L_0x0018
            com.google.android.gms.internal.measurement.dv r0 = m9450a()
        L_0x0018:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C1987du.m9452b():com.google.android.gms.internal.measurement.dv");
    }

    /* renamed from: a */
    private static final C1988dv m9451a(String str) {
        return (C1988dv) f7637a.getDeclaredMethod(str, new Class[0]).invoke((Object) null, new Object[0]);
    }
}
