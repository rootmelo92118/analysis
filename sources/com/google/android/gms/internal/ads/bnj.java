package com.google.android.gms.internal.ads;

import android.view.View;

final class bnj implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ View f4853a;

    /* renamed from: b */
    private final /* synthetic */ bni f4854b;

    bnj(bni bni, View view) {
        this.f4854b = bni;
        this.f4853a = view;
    }

    public final void run() {
        this.f4854b.mo12242a(this.f4853a);
    }
}
