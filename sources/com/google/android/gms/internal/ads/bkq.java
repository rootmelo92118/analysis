package com.google.android.gms.internal.ads;

import android.support.annotation.NonNull;
import java.util.concurrent.ThreadFactory;

final class bkq implements ThreadFactory {

    /* renamed from: a */
    private final /* synthetic */ String f4579a;

    bkq(String str) {
        this.f4579a = str;
    }

    public final Thread newThread(@NonNull Runnable runnable) {
        return new Thread(runnable, this.f4579a);
    }
}
