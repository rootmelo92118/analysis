package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import java.io.ByteArrayOutputStream;

/* renamed from: com.google.android.gms.internal.ads.vj */
final class C1729vj implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ Bitmap f6645a;

    /* renamed from: b */
    private final /* synthetic */ C1726vg f6646b;

    C1729vj(C1726vg vgVar, Bitmap bitmap) {
        this.f6646b = vgVar;
        this.f6645a = bitmap;
    }

    public final void run() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        this.f6645a.compress(Bitmap.CompressFormat.PNG, 0, byteArrayOutputStream);
        synchronized (this.f6646b.f6638l) {
            this.f6646b.f6629c.f2647g = new avg();
            this.f6646b.f6629c.f2647g.f2676c = byteArrayOutputStream.toByteArray();
            this.f6646b.f6629c.f2647g.f2675b = "image/png";
            this.f6646b.f6629c.f2647g.f2674a = 1;
        }
    }
}
