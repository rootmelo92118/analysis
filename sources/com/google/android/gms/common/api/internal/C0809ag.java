package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import com.google.android.gms.common.C0849c;
import com.google.android.gms.common.ConnectionResult;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.common.api.internal.ag */
public abstract class C0809ag extends LifecycleCallback implements DialogInterface.OnCancelListener {

    /* renamed from: b */
    protected volatile boolean f842b;

    /* renamed from: c */
    protected final AtomicReference<C0810ah> f843c;

    /* renamed from: d */
    protected final C0849c f844d;

    /* renamed from: e */
    private final Handler f845e;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo9636a(ConnectionResult connectionResult, int i);

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public abstract void mo9638f();

    public void onCancel(DialogInterface dialogInterface) {
        mo9636a(new ConnectionResult(13, (PendingIntent) null), m975a(this.f843c.get()));
        mo9639h();
    }

    /* renamed from: a */
    public void mo9602a(Bundle bundle) {
        super.mo9602a(bundle);
        if (bundle != null) {
            this.f843c.set(bundle.getBoolean("resolving_error", false) ? new C0810ah(new ConnectionResult(bundle.getInt("failed_status"), (PendingIntent) bundle.getParcelable("failed_resolution")), bundle.getInt("failed_client_id", -1)) : null);
        }
    }

    /* renamed from: b */
    public void mo9605b(Bundle bundle) {
        super.mo9605b(bundle);
        C0810ah ahVar = this.f843c.get();
        if (ahVar != null) {
            bundle.putBoolean("resolving_error", true);
            bundle.putInt("failed_client_id", ahVar.mo9641a());
            bundle.putInt("failed_status", ahVar.mo9642b().mo9510c());
            bundle.putParcelable("failed_resolution", ahVar.mo9642b().mo9511d());
        }
    }

    /* renamed from: b */
    public void mo9604b() {
        super.mo9604b();
        this.f842b = true;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo9601a(int r4, int r5, android.content.Intent r6) {
        /*
            r3 = this;
            java.util.concurrent.atomic.AtomicReference<com.google.android.gms.common.api.internal.ah> r0 = r3.f843c
            java.lang.Object r0 = r0.get()
            com.google.android.gms.common.api.internal.ah r0 = (com.google.android.gms.common.api.internal.C0810ah) r0
            r1 = 1
            r2 = 0
            switch(r4) {
                case 1: goto L_0x002e;
                case 2: goto L_0x000e;
                default: goto L_0x000d;
            }
        L_0x000d:
            goto L_0x0053
        L_0x000e:
            com.google.android.gms.common.c r4 = r3.f844d
            android.app.Activity r5 = r3.mo9600a()
            int r4 = r4.mo9712a((android.content.Context) r5)
            if (r4 != 0) goto L_0x001b
            goto L_0x001c
        L_0x001b:
            r1 = 0
        L_0x001c:
            if (r0 != 0) goto L_0x001f
            return
        L_0x001f:
            com.google.android.gms.common.ConnectionResult r5 = r0.mo9642b()
            int r5 = r5.mo9510c()
            r6 = 18
            if (r5 != r6) goto L_0x0054
            if (r4 != r6) goto L_0x0054
            return
        L_0x002e:
            r4 = -1
            if (r5 != r4) goto L_0x0032
            goto L_0x0054
        L_0x0032:
            if (r5 != 0) goto L_0x0053
            r4 = 13
            if (r6 == 0) goto L_0x003e
            java.lang.String r5 = "<<ResolutionFailureErrorDetail>>"
            int r4 = r6.getIntExtra(r5, r4)
        L_0x003e:
            com.google.android.gms.common.api.internal.ah r5 = new com.google.android.gms.common.api.internal.ah
            com.google.android.gms.common.ConnectionResult r6 = new com.google.android.gms.common.ConnectionResult
            r1 = 0
            r6.<init>(r4, r1)
            int r4 = m975a((com.google.android.gms.common.api.internal.C0810ah) r0)
            r5.<init>(r6, r4)
            java.util.concurrent.atomic.AtomicReference<com.google.android.gms.common.api.internal.ah> r4 = r3.f843c
            r4.set(r5)
            r0 = r5
        L_0x0053:
            r1 = 0
        L_0x0054:
            if (r1 == 0) goto L_0x005a
            r3.mo9639h()
            return
        L_0x005a:
            if (r0 == 0) goto L_0x0067
            com.google.android.gms.common.ConnectionResult r4 = r0.mo9642b()
            int r5 = r0.mo9641a()
            r3.mo9636a(r4, r5)
        L_0x0067:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.C0809ag.mo9601a(int, int, android.content.Intent):void");
    }

    /* renamed from: d */
    public void mo9607d() {
        super.mo9607d();
        this.f842b = false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final void mo9639h() {
        this.f843c.set((Object) null);
        mo9638f();
    }

    /* renamed from: b */
    public final void mo9637b(ConnectionResult connectionResult, int i) {
        C0810ah ahVar = new C0810ah(connectionResult, i);
        if (this.f843c.compareAndSet((Object) null, ahVar)) {
            this.f845e.post(new C0811ai(this, ahVar));
        }
    }

    /* renamed from: a */
    private static int m975a(@Nullable C0810ah ahVar) {
        if (ahVar == null) {
            return -1;
        }
        return ahVar.mo9641a();
    }
}
