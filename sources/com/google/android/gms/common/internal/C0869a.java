package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Binder;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.C0914j;

/* renamed from: com.google.android.gms.common.internal.a */
public class C0869a extends C0914j.C0915a {
    /* renamed from: a */
    public static Account m1181a(C0914j jVar) {
        if (jVar != null) {
            long clearCallingIdentity = Binder.clearCallingIdentity();
            try {
                return jVar.mo9787a();
            } catch (RemoteException unused) {
                Log.w("AccountAccessor", "Remote account accessor probably died");
            } finally {
                Binder.restoreCallingIdentity(clearCallingIdentity);
            }
        }
        return null;
    }

    /* renamed from: a */
    public final Account mo9787a() {
        throw new NoSuchMethodError();
    }

    public boolean equals(Object obj) {
        throw new NoSuchMethodError();
    }
}
