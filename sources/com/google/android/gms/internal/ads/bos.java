package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.io.IOException;

final /* synthetic */ class bos implements Runnable {

    /* renamed from: a */
    private final bor f4917a;

    /* renamed from: b */
    private final boi f4918b;

    /* renamed from: c */
    private final zzty f4919c;

    /* renamed from: d */
    private final abq f4920d;

    bos(bor bor, boi boi, zzty zzty, abq abq) {
        this.f4917a = bor;
        this.f4918b = boi;
        this.f4919c = zzty;
        this.f4920d = abq;
    }

    public final void run() {
        bor bor = this.f4917a;
        boi boi = this.f4918b;
        zzty zzty = this.f4919c;
        abq abq = this.f4920d;
        try {
            zztv a = boi.mo12275a().mo12279a(zzty);
            if (!a.mo13449a()) {
                abq.mo10086a(new RuntimeException("No entry contents."));
                bor.f4914a.m6106a();
                return;
            }
            bou bou = new bou(bor, a.mo13450b(), 1);
            int read = bou.read();
            if (read != -1) {
                bou.unread(read);
                abq.mo10087b(bou);
                return;
            }
            throw new IOException("Unable to read from cache.");
        } catch (RemoteException | IOException e) {
            C1772wz.m1625b("Unable to obtain a cache service instance.", e);
            abq.mo10086a(e);
            bor.f4914a.m6106a();
        }
    }
}
