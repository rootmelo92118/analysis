package com.google.firebase.iid;

import android.util.Log;

/* renamed from: com.google.firebase.iid.ah */
final class C2373ah implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C2370ae f8842a;

    /* renamed from: b */
    private final /* synthetic */ C2372ag f8843b;

    C2373ah(C2372ag agVar, C2370ae aeVar) {
        this.f8843b = agVar;
        this.f8842a = aeVar;
    }

    public final void run() {
        if (Log.isLoggable("EnhancedIntentService", 3)) {
            Log.d("EnhancedIntentService", "bg processing of the intent starting now");
        }
        this.f8843b.f8841a.mo14974b(this.f8842a.f8835a);
        this.f8842a.mo14984a();
    }
}
