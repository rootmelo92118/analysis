package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import android.os.TransactionTooLargeException;
import android.support.annotation.NonNull;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C0815b;
import com.google.android.gms.common.util.C0979o;

/* renamed from: com.google.android.gms.common.api.internal.l */
public abstract class C0829l {

    /* renamed from: a */
    private final int f908a;

    public C0829l(int i) {
        this.f908a = i;
    }

    /* renamed from: a */
    public abstract void mo9624a(@NonNull Status status);

    /* renamed from: a */
    public abstract void mo9625a(C0815b.C0816a<?> aVar);

    /* renamed from: a */
    public abstract void mo9626a(@NonNull C0826i iVar, boolean z);

    /* renamed from: a */
    public abstract void mo9627a(@NonNull RuntimeException runtimeException);

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static Status m1080b(RemoteException remoteException) {
        StringBuilder sb = new StringBuilder();
        if (C0979o.m1501b() && (remoteException instanceof TransactionTooLargeException)) {
            sb.append("TransactionTooLargeException: ");
        }
        sb.append(remoteException.getLocalizedMessage());
        return new Status(8, sb.toString());
    }
}
