package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.Message;
import android.support.p034v4.p036os.EnvironmentCompat;
import android.util.Log;
import com.google.android.gms.common.internal.C0911h;
import com.google.android.gms.common.stats.C0959a;
import com.google.android.gms.internal.p044b.C1858e;
import java.util.HashMap;
import javax.annotation.concurrent.GuardedBy;

/* renamed from: com.google.android.gms.common.internal.ah */
final class C0877ah extends C0911h implements Handler.Callback {
    /* access modifiers changed from: private */
    @GuardedBy("mConnectionStatus")

    /* renamed from: a */
    public final HashMap<C0911h.C0912a, C0878ai> f1043a = new HashMap<>();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Context f1044b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final Handler f1045c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C0959a f1046d;

    /* renamed from: e */
    private final long f1047e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final long f1048f;

    C0877ah(Context context) {
        this.f1044b = context.getApplicationContext();
        this.f1045c = new C1858e(context.getMainLooper(), this);
        this.f1046d = C0959a.m1447a();
        this.f1047e = 5000;
        this.f1048f = 300000;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo9802a(C0911h.C0912a aVar, ServiceConnection serviceConnection, String str) {
        boolean a;
        C0926p.m1307a(serviceConnection, (Object) "ServiceConnection must not be null");
        synchronized (this.f1043a) {
            C0878ai aiVar = this.f1043a.get(aVar);
            if (aiVar == null) {
                aiVar = new C0878ai(this, aVar);
                aiVar.mo9805a(serviceConnection, str);
                aiVar.mo9806a(str);
                this.f1043a.put(aVar, aiVar);
            } else {
                this.f1045c.removeMessages(0, aVar);
                if (!aiVar.mo9808a(serviceConnection)) {
                    aiVar.mo9805a(serviceConnection, str);
                    switch (aiVar.mo9809b()) {
                        case 1:
                            serviceConnection.onServiceConnected(aiVar.mo9814e(), aiVar.mo9813d());
                            break;
                        case 2:
                            aiVar.mo9806a(str);
                            break;
                    }
                } else {
                    String valueOf = String.valueOf(aVar);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 81);
                    sb.append("Trying to bind a GmsServiceConnection that was already connected before.  config=");
                    sb.append(valueOf);
                    throw new IllegalStateException(sb.toString());
                }
            }
            a = aiVar.mo9807a();
        }
        return a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo9803b(C0911h.C0912a aVar, ServiceConnection serviceConnection, String str) {
        C0926p.m1307a(serviceConnection, (Object) "ServiceConnection must not be null");
        synchronized (this.f1043a) {
            C0878ai aiVar = this.f1043a.get(aVar);
            if (aiVar == null) {
                String valueOf = String.valueOf(aVar);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 50);
                sb.append("Nonexistent connection status for service config: ");
                sb.append(valueOf);
                throw new IllegalStateException(sb.toString());
            } else if (aiVar.mo9808a(serviceConnection)) {
                aiVar.mo9810b(serviceConnection, str);
                if (aiVar.mo9812c()) {
                    this.f1045c.sendMessageDelayed(this.f1045c.obtainMessage(0, aVar), this.f1047e);
                }
            } else {
                String valueOf2 = String.valueOf(aVar);
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 76);
                sb2.append("Trying to unbind a GmsServiceConnection  that was not bound before.  config=");
                sb2.append(valueOf2);
                throw new IllegalStateException(sb2.toString());
            }
        }
    }

    public final boolean handleMessage(Message message) {
        switch (message.what) {
            case 0:
                synchronized (this.f1043a) {
                    C0911h.C0912a aVar = (C0911h.C0912a) message.obj;
                    C0878ai aiVar = this.f1043a.get(aVar);
                    if (aiVar != null && aiVar.mo9812c()) {
                        if (aiVar.mo9807a()) {
                            aiVar.mo9811b("GmsClientSupervisor");
                        }
                        this.f1043a.remove(aVar);
                    }
                }
                return true;
            case 1:
                synchronized (this.f1043a) {
                    C0911h.C0912a aVar2 = (C0911h.C0912a) message.obj;
                    C0878ai aiVar2 = this.f1043a.get(aVar2);
                    if (aiVar2 != null && aiVar2.mo9809b() == 3) {
                        String valueOf = String.valueOf(aVar2);
                        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 47);
                        sb.append("Timeout waiting for ServiceConnection callback ");
                        sb.append(valueOf);
                        Log.wtf("GmsClientSupervisor", sb.toString(), new Exception());
                        ComponentName e = aiVar2.mo9814e();
                        if (e == null) {
                            e = aVar2.mo9901b();
                        }
                        if (e == null) {
                            e = new ComponentName(aVar2.mo9900a(), EnvironmentCompat.MEDIA_UNKNOWN);
                        }
                        aiVar2.onServiceDisconnected(e);
                    }
                }
                return true;
            default:
                return false;
        }
    }
}
