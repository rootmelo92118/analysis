package com.google.firebase.iid;

import android.content.BroadcastReceiver;
import android.content.Intent;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.firebase.iid.ae */
final class C2370ae {

    /* renamed from: a */
    final Intent f8835a;

    /* renamed from: b */
    private final BroadcastReceiver.PendingResult f8836b;

    /* renamed from: c */
    private boolean f8837c = false;

    /* renamed from: d */
    private final ScheduledFuture<?> f8838d;

    C2370ae(Intent intent, BroadcastReceiver.PendingResult pendingResult, ScheduledExecutorService scheduledExecutorService) {
        this.f8835a = intent;
        this.f8836b = pendingResult;
        this.f8838d = scheduledExecutorService.schedule(new C2371af(this, intent), 9000, TimeUnit.MILLISECONDS);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized void mo14984a() {
        if (!this.f8837c) {
            this.f8836b.finish();
            this.f8838d.cancel(false);
            this.f8837c = true;
        }
    }
}
