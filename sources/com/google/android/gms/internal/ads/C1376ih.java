package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.gmsg.zzu;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.ih */
final class C1376ih implements zzu<C1392ix> {

    /* renamed from: a */
    private final /* synthetic */ awy f5482a;

    /* renamed from: b */
    private final /* synthetic */ C1355hn f5483b;

    /* renamed from: c */
    private final /* synthetic */ C1841zn f5484c;

    /* renamed from: d */
    private final /* synthetic */ C1366hy f5485d;

    C1376ih(C1366hy hyVar, awy awy, C1355hn hnVar, C1841zn znVar) {
        this.f5485d = hyVar;
        this.f5482a = awy;
        this.f5483b = hnVar;
        this.f5484c = znVar;
    }

    public final /* synthetic */ void zza(Object obj, Map map) {
        synchronized (this.f5485d.f5455a) {
            C1772wz.m1628d("JS Engine is requesting an update");
            if (this.f5485d.f5462h == 0) {
                C1772wz.m1628d("Starting reload.");
                int unused = this.f5485d.f5462h = 2;
                this.f5485d.mo12613a(this.f5482a);
            }
            this.f5483b.mo12607b("/requestReload", (zzu) this.f5484c.mo13288a());
        }
    }
}
