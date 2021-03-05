package com.google.android.gms.internal.ads;

import android.database.ContentObserver;
import android.os.Handler;

final class blt extends ContentObserver {

    /* renamed from: a */
    private final /* synthetic */ blq f4724a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public blt(blq blq, Handler handler) {
        super(handler);
        this.f4724a = blq;
    }

    public final void onChange(boolean z) {
        super.onChange(z);
        this.f4724a.mo12152a();
    }
}
