package com.google.android.gms.common.internal;

import android.content.Context;
import android.support.annotation.NonNull;
import android.util.SparseIntArray;
import com.google.android.gms.common.C0849c;
import com.google.android.gms.common.C0851d;
import com.google.android.gms.common.api.C0772a;

/* renamed from: com.google.android.gms.common.internal.i */
public class C0913i {

    /* renamed from: a */
    private final SparseIntArray f1110a;

    /* renamed from: b */
    private C0851d f1111b;

    public C0913i() {
        this(C0849c.m1108a());
    }

    public C0913i(@NonNull C0851d dVar) {
        this.f1110a = new SparseIntArray();
        C0926p.m1306a(dVar);
        this.f1111b = dVar;
    }

    /* renamed from: a */
    public int mo9906a(@NonNull Context context, @NonNull C0772a.C0783f fVar) {
        C0926p.m1306a(context);
        C0926p.m1306a(fVar);
        if (!fVar.requiresGooglePlayServices()) {
            return 0;
        }
        int minApkVersion = fVar.getMinApkVersion();
        int i = this.f1110a.get(minApkVersion, -1);
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        while (true) {
            if (i2 < this.f1110a.size()) {
                int keyAt = this.f1110a.keyAt(i2);
                if (keyAt > minApkVersion && this.f1110a.get(keyAt) == 0) {
                    i = 0;
                    break;
                }
                i2++;
            } else {
                break;
            }
        }
        if (i == -1) {
            i = this.f1111b.mo9722b(context, minApkVersion);
        }
        this.f1110a.put(minApkVersion, i);
        return i;
    }

    /* renamed from: a */
    public void mo9907a() {
        this.f1110a.clear();
    }
}
