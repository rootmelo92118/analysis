package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

public final class bpl {

    /* renamed from: a */
    private final AtomicInteger f5015a;

    /* renamed from: b */
    private final Set<blj<?>> f5016b;

    /* renamed from: c */
    private final PriorityBlockingQueue<blj<?>> f5017c;

    /* renamed from: d */
    private final PriorityBlockingQueue<blj<?>> f5018d;

    /* renamed from: e */
    private final C1830zc f5019e;

    /* renamed from: f */
    private final bgg f5020f;

    /* renamed from: g */
    private final C1125b f5021g;

    /* renamed from: h */
    private final bhh[] f5022h;

    /* renamed from: i */
    private axe f5023i;

    /* renamed from: j */
    private final List<bql> f5024j;

    private bpl(C1830zc zcVar, bgg bgg, int i, C1125b bVar) {
        this.f5015a = new AtomicInteger();
        this.f5016b = new HashSet();
        this.f5017c = new PriorityBlockingQueue<>();
        this.f5018d = new PriorityBlockingQueue<>();
        this.f5024j = new ArrayList();
        this.f5019e = zcVar;
        this.f5020f = bgg;
        this.f5022h = new bhh[4];
        this.f5021g = bVar;
    }

    private bpl(C1830zc zcVar, bgg bgg, int i) {
        this(zcVar, bgg, 4, new bch(new Handler(Looper.getMainLooper())));
    }

    public bpl(C1830zc zcVar, bgg bgg) {
        this(zcVar, bgg, 4);
    }

    /* renamed from: a */
    public final void mo12291a() {
        if (this.f5023i != null) {
            this.f5023i.mo11367a();
        }
        for (bhh bhh : this.f5022h) {
            if (bhh != null) {
                bhh.mo11939a();
            }
        }
        this.f5023i = new axe(this.f5017c, this.f5018d, this.f5019e, this.f5021g);
        this.f5023i.start();
        for (int i = 0; i < this.f5022h.length; i++) {
            bhh bhh2 = new bhh(this.f5018d, this.f5020f, this.f5019e, this.f5021g);
            this.f5022h[i] = bhh2;
            bhh2.start();
        }
    }

    /* renamed from: a */
    public final <T> blj<T> mo12290a(blj<T> blj) {
        blj.mo12109a(this);
        synchronized (this.f5016b) {
            this.f5016b.add(blj);
        }
        blj.mo12107a(this.f5015a.incrementAndGet());
        blj.mo12117b("add-to-queue");
        if (!blj.mo12126i()) {
            this.f5018d.add(blj);
            return blj;
        }
        this.f5017c.add(blj);
        return blj;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final <T> void mo12292b(blj<T> blj) {
        synchronized (this.f5016b) {
            this.f5016b.remove(blj);
        }
        synchronized (this.f5024j) {
            for (bql a : this.f5024j) {
                a.mo12306a(blj);
            }
        }
    }
}
