package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.BinderThread;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.WorkerThread;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C0772a;
import com.google.android.gms.common.api.C0792f;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.C0905d;
import com.google.android.gms.common.internal.C0926p;
import com.google.android.gms.common.internal.ResolveAccountResponse;
import com.google.android.gms.signin.C2304a;
import com.google.android.gms.signin.C2306b;
import com.google.android.gms.signin.C2309e;
import com.google.android.gms.signin.internal.C2312c;
import com.google.android.gms.signin.internal.zaj;
import java.util.Set;

/* renamed from: com.google.android.gms.common.api.internal.w */
public final class C0840w extends C2312c implements C0792f.C0793a, C0792f.C0794b {

    /* renamed from: a */
    private static C0772a.C0773a<? extends C2309e, C2304a> f921a = C2306b.f8699a;

    /* renamed from: b */
    private final Context f922b;

    /* renamed from: c */
    private final Handler f923c;

    /* renamed from: d */
    private final C0772a.C0773a<? extends C2309e, C2304a> f924d;

    /* renamed from: e */
    private Set<Scope> f925e;

    /* renamed from: f */
    private C0905d f926f;

    /* renamed from: g */
    private C2309e f927g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public C0843z f928h;

    @WorkerThread
    public C0840w(Context context, Handler handler, @NonNull C0905d dVar) {
        this(context, handler, dVar, f921a);
    }

    @WorkerThread
    public C0840w(Context context, Handler handler, @NonNull C0905d dVar, C0772a.C0773a<? extends C2309e, C2304a> aVar) {
        this.f922b = context;
        this.f923c = handler;
        this.f926f = (C0905d) C0926p.m1307a(dVar, (Object) "ClientSettings must not be null");
        this.f925e = dVar.mo9884c();
        this.f924d = aVar;
    }

    @WorkerThread
    /* renamed from: a */
    public final void mo9696a(C0843z zVar) {
        if (this.f927g != null) {
            this.f927g.disconnect();
        }
        this.f926f.mo9882a(Integer.valueOf(System.identityHashCode(this)));
        this.f927g = (C2309e) this.f924d.mo9562a(this.f922b, this.f923c.getLooper(), this.f926f, this.f926f.mo9888g(), this, this);
        this.f928h = zVar;
        if (this.f925e == null || this.f925e.isEmpty()) {
            this.f923c.post(new C0841x(this));
        } else {
            this.f927g.mo14872a();
        }
    }

    /* renamed from: a */
    public final void mo9695a() {
        if (this.f927g != null) {
            this.f927g.disconnect();
        }
    }

    @WorkerThread
    /* renamed from: a */
    public final void mo9589a(@Nullable Bundle bundle) {
        this.f927g.mo14873a(this);
    }

    @WorkerThread
    /* renamed from: a */
    public final void mo9588a(int i) {
        this.f927g.disconnect();
    }

    @WorkerThread
    /* renamed from: a */
    public final void mo9590a(@NonNull ConnectionResult connectionResult) {
        this.f928h.mo9673b(connectionResult);
    }

    @BinderThread
    /* renamed from: a */
    public final void mo9697a(zaj zaj) {
        this.f923c.post(new C0842y(this, zaj));
    }

    /* access modifiers changed from: private */
    @WorkerThread
    /* renamed from: b */
    public final void m1092b(zaj zaj) {
        ConnectionResult a = zaj.mo14887a();
        if (a.mo9509b()) {
            ResolveAccountResponse b = zaj.mo14888b();
            ConnectionResult b2 = b.mo9777b();
            if (!b2.mo9509b()) {
                String valueOf = String.valueOf(b2);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 48);
                sb.append("Sign-in succeeded with resolve account failure: ");
                sb.append(valueOf);
                Log.wtf("SignInCoordinator", sb.toString(), new Exception());
                this.f928h.mo9673b(b2);
                this.f927g.disconnect();
                return;
            }
            this.f928h.mo9672a(b.mo9776a(), this.f925e);
        } else {
            this.f928h.mo9673b(a);
        }
        this.f927g.disconnect();
    }
}
