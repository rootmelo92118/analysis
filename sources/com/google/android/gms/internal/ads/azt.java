package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

final class azt extends Handler {

    /* renamed from: a */
    private final /* synthetic */ azs f3203a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    azt(azs azs, Looper looper) {
        super(looper);
        this.f3203a = azs;
    }

    public final void handleMessage(Message message) {
        this.f3203a.mo11488a(message);
    }
}
