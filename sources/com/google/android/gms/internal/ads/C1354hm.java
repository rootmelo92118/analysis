package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.gmsg.zzu;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.hm */
final /* synthetic */ class C1354hm implements Runnable {

    /* renamed from: a */
    private final C1353hl f5438a;

    /* renamed from: b */
    private final zzu f5439b;

    /* renamed from: c */
    private final Map f5440c;

    C1354hm(C1353hl hlVar, zzu zzu, Map map) {
        this.f5438a = hlVar;
        this.f5439b = zzu;
        this.f5440c = map;
    }

    public final void run() {
        this.f5438a.mo12597a(this.f5439b, this.f5440c);
    }
}
