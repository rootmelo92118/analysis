package com.google.firebase.iid;

import android.content.Intent;
import android.util.Log;

/* renamed from: com.google.firebase.iid.af */
final /* synthetic */ class C2371af implements Runnable {

    /* renamed from: a */
    private final C2370ae f8839a;

    /* renamed from: b */
    private final Intent f8840b;

    C2371af(C2370ae aeVar, Intent intent) {
        this.f8839a = aeVar;
        this.f8840b = intent;
    }

    public final void run() {
        C2370ae aeVar = this.f8839a;
        String action = this.f8840b.getAction();
        StringBuilder sb = new StringBuilder(String.valueOf(action).length() + 61);
        sb.append("Service took too long to process intent: ");
        sb.append(action);
        sb.append(" App may get closed.");
        Log.w("EnhancedIntentService", sb.toString());
        aeVar.mo14984a();
    }
}
