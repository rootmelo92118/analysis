package com.google.android.gms.internal.measurement;

import android.database.ContentObserver;
import android.os.Handler;

/* renamed from: com.google.android.gms.internal.measurement.bs */
final class C1926bs extends ContentObserver {
    C1926bs(Handler handler) {
        super((Handler) null);
    }

    public final void onChange(boolean z) {
        C1925br.f7528e.set(true);
    }
}
