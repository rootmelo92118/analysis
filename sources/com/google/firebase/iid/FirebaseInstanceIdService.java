package com.google.firebase.iid;

import android.content.Intent;
import android.support.annotation.WorkerThread;
import android.util.Log;

@Deprecated
public class FirebaseInstanceIdService extends zzb {
    @WorkerThread
    @Deprecated
    /* renamed from: a */
    public void mo14973a() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Intent mo14972a(Intent intent) {
        return C2414x.m11759a().f8926a.poll();
    }

    /* renamed from: b */
    public final void mo14974b(Intent intent) {
        if ("com.google.firebase.iid.TOKEN_REFRESH".equals(intent.getAction())) {
            mo14973a();
            return;
        }
        String stringExtra = intent.getStringExtra("CMD");
        if (stringExtra != null) {
            if (Log.isLoggable("FirebaseInstanceId", 3)) {
                String valueOf = String.valueOf(intent.getExtras());
                StringBuilder sb = new StringBuilder(String.valueOf(stringExtra).length() + 21 + String.valueOf(valueOf).length());
                sb.append("Received command: ");
                sb.append(stringExtra);
                sb.append(" - ");
                sb.append(valueOf);
                Log.d("FirebaseInstanceId", sb.toString());
            }
            if ("RST".equals(stringExtra) || "RST_FULL".equals(stringExtra)) {
                FirebaseInstanceId.m11607a().mo14965g();
            } else if ("SYNC".equals(stringExtra)) {
                FirebaseInstanceId.m11607a().mo14969k();
            }
        }
    }
}
