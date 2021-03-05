package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import com.google.android.gms.common.util.C0979o;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;

@TargetApi(21)
@C1598qn
@ParametersAreNonnullByDefault
/* renamed from: com.google.android.gms.internal.ads.vt */
final class C1739vt {

    /* renamed from: a */
    private static final Map<String, String> f6649a;

    /* renamed from: b */
    private final Context f6650b;

    /* renamed from: c */
    private final List<String> f6651c;

    /* renamed from: d */
    private final C1726vg f6652d;

    C1739vt(Context context, List<String> list, C1726vg vgVar) {
        this.f6650b = context;
        this.f6651c = list;
        this.f6652d = vgVar;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0025, code lost:
        r5 = true;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<java.lang.String> mo13069a(java.lang.String[] r11) {
        /*
            r10 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            int r1 = r11.length
            r2 = 0
            r3 = 0
        L_0x0008:
            if (r3 >= r1) goto L_0x007c
            r4 = r11[r3]
            java.util.List<java.lang.String> r5 = r10.f6651c
            java.util.Iterator r5 = r5.iterator()
        L_0x0012:
            boolean r6 = r5.hasNext()
            r7 = 1
            if (r6 == 0) goto L_0x0048
            java.lang.Object r6 = r5.next()
            java.lang.String r6 = (java.lang.String) r6
            boolean r8 = r6.equals(r4)
            if (r8 == 0) goto L_0x0027
        L_0x0025:
            r5 = 1
            goto L_0x0049
        L_0x0027:
            java.lang.String r8 = "android.webkit.resource."
            java.lang.String r8 = java.lang.String.valueOf(r8)
            java.lang.String r6 = java.lang.String.valueOf(r6)
            int r9 = r6.length()
            if (r9 == 0) goto L_0x003c
            java.lang.String r6 = r8.concat(r6)
            goto L_0x0041
        L_0x003c:
            java.lang.String r6 = new java.lang.String
            r6.<init>(r8)
        L_0x0041:
            boolean r6 = r6.equals(r4)
            if (r6 == 0) goto L_0x0012
            goto L_0x0025
        L_0x0048:
            r5 = 0
        L_0x0049:
            if (r5 == 0) goto L_0x0074
            java.util.Map<java.lang.String, java.lang.String> r5 = f6649a
            boolean r5 = r5.containsKey(r4)
            if (r5 == 0) goto L_0x0068
            com.google.android.gms.ads.internal.zzbv.zzlf()
            android.content.Context r5 = r10.f6650b
            java.util.Map<java.lang.String, java.lang.String> r6 = f6649a
            java.lang.Object r6 = r6.get(r4)
            java.lang.String r6 = (java.lang.String) r6
            boolean r5 = com.google.android.gms.internal.ads.C1782xi.m8381a((android.content.Context) r5, (java.lang.String) r6)
            if (r5 == 0) goto L_0x0067
            goto L_0x0068
        L_0x0067:
            r7 = 0
        L_0x0068:
            if (r7 == 0) goto L_0x006e
            r0.add(r4)
            goto L_0x0079
        L_0x006e:
            com.google.android.gms.internal.ads.vg r5 = r10.f6652d
            r5.mo13061c(r4)
            goto L_0x0079
        L_0x0074:
            com.google.android.gms.internal.ads.vg r5 = r10.f6652d
            r5.mo13058b((java.lang.String) r4)
        L_0x0079:
            int r3 = r3 + 1
            goto L_0x0008
        L_0x007c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1739vt.mo13069a(java.lang.String[]):java.util.List");
    }

    static {
        HashMap hashMap = new HashMap();
        if (C0979o.m1507h()) {
            hashMap.put("android.webkit.resource.AUDIO_CAPTURE", "android.permission.RECORD_AUDIO");
            hashMap.put("android.webkit.resource.VIDEO_CAPTURE", "android.permission.CAMERA");
        }
        f6649a = hashMap;
    }
}
