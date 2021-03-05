package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.common.api.C0772a;

/* renamed from: com.google.android.gms.common.internal.r */
public class C0928r<T extends IInterface> extends C0910g<T> {

    /* renamed from: a */
    private final C0772a.C0785h<T> f1116a;

    /* access modifiers changed from: protected */
    public String getStartServiceAction() {
        return this.f1116a.mo9577a();
    }

    /* access modifiers changed from: protected */
    public String getServiceDescriptor() {
        return this.f1116a.mo9579b();
    }

    /* access modifiers changed from: protected */
    public T createServiceInterface(IBinder iBinder) {
        return this.f1116a.mo9576a(iBinder);
    }

    /* access modifiers changed from: protected */
    public void onSetConnectState(int i, T t) {
        this.f1116a.mo9578a(i, t);
    }

    /* renamed from: a */
    public C0772a.C0785h<T> mo9914a() {
        return this.f1116a;
    }

    public int getMinApkVersion() {
        return super.getMinApkVersion();
    }
}
