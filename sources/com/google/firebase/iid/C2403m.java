package com.google.firebase.iid;

import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.p040b.C0742h;

/* renamed from: com.google.firebase.iid.m */
abstract class C2403m<T> {

    /* renamed from: a */
    final int f8900a;

    /* renamed from: b */
    final C0742h<T> f8901b = new C0742h<>();

    /* renamed from: c */
    final int f8902c;

    /* renamed from: d */
    final Bundle f8903d;

    C2403m(int i, int i2, Bundle bundle) {
        this.f8900a = i;
        this.f8902c = i2;
        this.f8903d = bundle;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract void mo15026a(Bundle bundle);

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract boolean mo15029a();

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo15028a(T t) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String valueOf = String.valueOf(this);
            String valueOf2 = String.valueOf(t);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 16 + String.valueOf(valueOf2).length());
            sb.append("Finishing ");
            sb.append(valueOf);
            sb.append(" with ");
            sb.append(valueOf2);
            Log.d("MessengerIpcClient", sb.toString());
        }
        this.f8901b.mo9487a(t);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo15027a(C2404n nVar) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String valueOf = String.valueOf(this);
            String valueOf2 = String.valueOf(nVar);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 14 + String.valueOf(valueOf2).length());
            sb.append("Failing ");
            sb.append(valueOf);
            sb.append(" with ");
            sb.append(valueOf2);
            Log.d("MessengerIpcClient", sb.toString());
        }
        this.f8901b.mo9486a((Exception) nVar);
    }

    public String toString() {
        int i = this.f8902c;
        int i2 = this.f8900a;
        boolean a = mo15029a();
        StringBuilder sb = new StringBuilder(55);
        sb.append("Request { what=");
        sb.append(i);
        sb.append(" id=");
        sb.append(i2);
        sb.append(" oneWay=");
        sb.append(a);
        sb.append("}");
        return sb.toString();
    }
}
