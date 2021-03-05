package com.google.firebase.iid;

import android.os.Binder;
import android.os.Process;
import android.util.Log;

/* renamed from: com.google.firebase.iid.ag */
public final class C2372ag extends Binder {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final zzb f8841a;

    C2372ag(zzb zzb) {
        this.f8841a = zzb;
    }

    /* renamed from: a */
    public final void mo14986a(C2370ae aeVar) {
        if (Binder.getCallingUid() == Process.myUid()) {
            if (Log.isLoggable("EnhancedIntentService", 3)) {
                Log.d("EnhancedIntentService", "service received new intent via bind strategy");
            }
            if (this.f8841a.mo15049c(aeVar.f8835a)) {
                aeVar.mo14984a();
                return;
            }
            if (Log.isLoggable("EnhancedIntentService", 3)) {
                Log.d("EnhancedIntentService", "intent being queued for bg execution");
            }
            this.f8841a.f8938a.execute(new C2373ah(this, aeVar));
            return;
        }
        throw new SecurityException("Binding only allowed within app");
    }
}
