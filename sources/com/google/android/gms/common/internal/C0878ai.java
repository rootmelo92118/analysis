package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.google.android.gms.common.internal.C0911h;
import com.google.android.gms.common.stats.C0959a;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.google.android.gms.common.internal.ai */
final class C0878ai implements ServiceConnection {

    /* renamed from: a */
    private final Set<ServiceConnection> f1049a = new HashSet();

    /* renamed from: b */
    private int f1050b = 2;

    /* renamed from: c */
    private boolean f1051c;

    /* renamed from: d */
    private IBinder f1052d;

    /* renamed from: e */
    private final C0911h.C0912a f1053e;

    /* renamed from: f */
    private ComponentName f1054f;

    /* renamed from: g */
    private final /* synthetic */ C0877ah f1055g;

    public C0878ai(C0877ah ahVar, C0911h.C0912a aVar) {
        this.f1055g = ahVar;
        this.f1053e = aVar;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this.f1055g.f1043a) {
            this.f1055g.f1045c.removeMessages(1, this.f1053e);
            this.f1052d = iBinder;
            this.f1054f = componentName;
            for (ServiceConnection onServiceConnected : this.f1049a) {
                onServiceConnected.onServiceConnected(componentName, iBinder);
            }
            this.f1050b = 1;
        }
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.f1055g.f1043a) {
            this.f1055g.f1045c.removeMessages(1, this.f1053e);
            this.f1052d = null;
            this.f1054f = componentName;
            for (ServiceConnection onServiceDisconnected : this.f1049a) {
                onServiceDisconnected.onServiceDisconnected(componentName);
            }
            this.f1050b = 2;
        }
    }

    /* renamed from: a */
    public final void mo9806a(String str) {
        this.f1050b = 3;
        this.f1051c = this.f1055g.f1046d.mo9989a(this.f1055g.f1044b, str, this.f1053e.mo9899a(this.f1055g.f1044b), this, this.f1053e.mo9902c());
        if (this.f1051c) {
            this.f1055g.f1045c.sendMessageDelayed(this.f1055g.f1045c.obtainMessage(1, this.f1053e), this.f1055g.f1048f);
            return;
        }
        this.f1050b = 2;
        try {
            this.f1055g.f1046d.mo9987a(this.f1055g.f1044b, this);
        } catch (IllegalArgumentException unused) {
        }
    }

    /* renamed from: b */
    public final void mo9811b(String str) {
        this.f1055g.f1045c.removeMessages(1, this.f1053e);
        this.f1055g.f1046d.mo9987a(this.f1055g.f1044b, this);
        this.f1051c = false;
        this.f1050b = 2;
    }

    /* renamed from: a */
    public final void mo9805a(ServiceConnection serviceConnection, String str) {
        C0959a unused = this.f1055g.f1046d;
        Context unused2 = this.f1055g.f1044b;
        this.f1053e.mo9899a(this.f1055g.f1044b);
        this.f1049a.add(serviceConnection);
    }

    /* renamed from: b */
    public final void mo9810b(ServiceConnection serviceConnection, String str) {
        C0959a unused = this.f1055g.f1046d;
        Context unused2 = this.f1055g.f1044b;
        this.f1049a.remove(serviceConnection);
    }

    /* renamed from: a */
    public final boolean mo9807a() {
        return this.f1051c;
    }

    /* renamed from: b */
    public final int mo9809b() {
        return this.f1050b;
    }

    /* renamed from: a */
    public final boolean mo9808a(ServiceConnection serviceConnection) {
        return this.f1049a.contains(serviceConnection);
    }

    /* renamed from: c */
    public final boolean mo9812c() {
        return this.f1049a.isEmpty();
    }

    /* renamed from: d */
    public final IBinder mo9813d() {
        return this.f1052d;
    }

    /* renamed from: e */
    public final ComponentName mo9814e() {
        return this.f1054f;
    }
}
