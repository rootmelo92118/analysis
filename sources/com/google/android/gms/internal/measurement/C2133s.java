package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.internal.measurement.C2128r;
import com.google.android.gms.p039a.C0722b;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.s */
final class C2133s extends C2128r.C2130b {

    /* renamed from: c */
    private final /* synthetic */ Context f7989c;

    /* renamed from: d */
    private final /* synthetic */ String f7990d;

    /* renamed from: e */
    private final /* synthetic */ String f7991e;

    /* renamed from: f */
    private final /* synthetic */ Bundle f7992f;

    /* renamed from: g */
    private final /* synthetic */ C2128r f7993g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C2133s(C2128r rVar, Context context, String str, String str2, Bundle bundle) {
        super(rVar);
        this.f7993g = rVar;
        this.f7989c = context;
        this.f7990d = str;
        this.f7991e = str2;
        this.f7992f = bundle;
    }

    /* renamed from: b */
    public final void mo13491b() {
        String str;
        String str2;
        String str3;
        try {
            Map unused = this.f7993g.f7975f = new HashMap();
            C2026f unused2 = this.f7993g.f7979j = this.f7993g.mo14115a(this.f7989c);
            if (this.f7993g.f7979j == null) {
                Log.w(this.f7993g.f7972c, "Failed to connect to measurement client.");
                return;
            }
            if (C2128r.m10306b(this.f7990d, this.f7991e)) {
                String str4 = this.f7991e;
                str2 = this.f7990d;
                str = str4;
                str3 = this.f7993g.f7972c;
            } else {
                str3 = null;
                str2 = null;
                str = null;
            }
            int b = C2128r.m10312f(this.f7989c);
            int c = C2128r.m10311e(this.f7989c);
            this.f7993g.f7979j.mo13863a(C0722b.m769a(this.f7989c), new zzdy(13001, (long) Math.max(b, c), c < b, str3, str2, str, this.f7992f), this.f7983a);
        } catch (RemoteException e) {
            this.f7993g.m10300a((Exception) e, true, false);
        }
    }
}
