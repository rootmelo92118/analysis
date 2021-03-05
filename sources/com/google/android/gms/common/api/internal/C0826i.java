package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.C0788b;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.p040b.C0742h;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: com.google.android.gms.common.api.internal.i */
public final class C0826i {

    /* renamed from: a */
    private final Map<BasePendingResult<?>, Boolean> f902a = Collections.synchronizedMap(new WeakHashMap());

    /* renamed from: b */
    private final Map<C0742h<?>, Boolean> f903b = Collections.synchronizedMap(new WeakHashMap());

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo9684a() {
        return !this.f902a.isEmpty() || !this.f903b.isEmpty();
    }

    /* renamed from: b */
    public final void mo9685b() {
        m1066a(false, C0815b.f852a);
    }

    /* renamed from: c */
    public final void mo9686c() {
        m1066a(true, C0803aa.f829a);
    }

    /* renamed from: a */
    private final void m1066a(boolean z, Status status) {
        HashMap hashMap;
        HashMap hashMap2;
        synchronized (this.f902a) {
            hashMap = new HashMap(this.f902a);
        }
        synchronized (this.f903b) {
            hashMap2 = new HashMap(this.f903b);
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            if (z || ((Boolean) entry.getValue()).booleanValue()) {
                ((BasePendingResult) entry.getKey()).mo9593a(status);
            }
        }
        for (Map.Entry entry2 : hashMap2.entrySet()) {
            if (z || ((Boolean) entry2.getValue()).booleanValue()) {
                ((C0742h) entry2.getKey()).mo9488b((Exception) new C0788b(status));
            }
        }
    }
}
