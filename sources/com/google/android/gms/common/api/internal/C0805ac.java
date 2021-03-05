package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import android.support.annotation.NonNull;
import com.google.android.gms.common.api.C0788b;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C0815b;
import com.google.android.gms.p040b.C0742h;

/* renamed from: com.google.android.gms.common.api.internal.ac */
abstract class C0805ac<T> extends C0839v {

    /* renamed from: a */
    protected final C0742h<T> f831a;

    public C0805ac(int i, C0742h<T> hVar) {
        super(i);
        this.f831a = hVar;
    }

    /* renamed from: a */
    public void mo9626a(@NonNull C0826i iVar, boolean z) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract void mo9628d(C0815b.C0816a<?> aVar);

    /* renamed from: a */
    public void mo9624a(@NonNull Status status) {
        this.f831a.mo9488b((Exception) new C0788b(status));
    }

    /* renamed from: a */
    public void mo9627a(@NonNull RuntimeException runtimeException) {
        this.f831a.mo9488b((Exception) runtimeException);
    }

    /* renamed from: a */
    public final void mo9625a(C0815b.C0816a<?> aVar) {
        try {
            mo9628d(aVar);
        } catch (DeadObjectException e) {
            mo9624a(C0829l.m1080b(e));
            throw e;
        } catch (RemoteException e2) {
            mo9624a(C0829l.m1080b(e2));
        } catch (RuntimeException e3) {
            mo9627a(e3);
        }
    }
}
