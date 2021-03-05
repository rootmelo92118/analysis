package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.common.util.C0969e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import javax.annotation.concurrent.GuardedBy;

@C1598qn
/* renamed from: com.google.android.gms.internal.ads.wh */
public final class C1754wh {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C0969e f6734a;

    /* renamed from: b */
    private final C1766wt f6735b;
    @GuardedBy("mLock")

    /* renamed from: c */
    private final LinkedList<C1755wi> f6736c;

    /* renamed from: d */
    private final Object f6737d = new Object();

    /* renamed from: e */
    private final String f6738e;

    /* renamed from: f */
    private final String f6739f;
    @GuardedBy("mLock")

    /* renamed from: g */
    private long f6740g = -1;
    @GuardedBy("mLock")

    /* renamed from: h */
    private long f6741h = -1;
    @GuardedBy("mLock")

    /* renamed from: i */
    private boolean f6742i = false;
    @GuardedBy("mLock")

    /* renamed from: j */
    private long f6743j = -1;
    @GuardedBy("mLock")

    /* renamed from: k */
    private long f6744k = 0;
    @GuardedBy("mLock")

    /* renamed from: l */
    private long f6745l = -1;
    @GuardedBy("mLock")

    /* renamed from: m */
    private long f6746m = -1;

    C1754wh(C0969e eVar, C1766wt wtVar, String str, String str2) {
        this.f6734a = eVar;
        this.f6735b = wtVar;
        this.f6738e = str;
        this.f6739f = str2;
        this.f6736c = new LinkedList<>();
    }

    /* renamed from: a */
    public final void mo13099a(zzwb zzwb) {
        synchronized (this.f6737d) {
            this.f6745l = this.f6734a.mo9997b();
            this.f6735b.mo13157a(zzwb, this.f6745l);
        }
    }

    /* renamed from: a */
    public final void mo13098a(long j) {
        synchronized (this.f6737d) {
            this.f6746m = j;
            if (this.f6746m != -1) {
                this.f6735b.mo13155a(this);
            }
        }
    }

    /* renamed from: b */
    public final void mo13102b(long j) {
        synchronized (this.f6737d) {
            if (this.f6746m != -1) {
                this.f6740g = j;
                this.f6735b.mo13155a(this);
            }
        }
    }

    /* renamed from: a */
    public final void mo13097a() {
        synchronized (this.f6737d) {
            if (this.f6746m != -1 && this.f6741h == -1) {
                this.f6741h = this.f6734a.mo9997b();
                this.f6735b.mo13155a(this);
            }
            this.f6735b.mo13159b();
        }
    }

    /* renamed from: b */
    public final void mo13101b() {
        synchronized (this.f6737d) {
            if (this.f6746m != -1) {
                C1755wi wiVar = new C1755wi(this);
                wiVar.mo13109c();
                this.f6736c.add(wiVar);
                this.f6744k++;
                this.f6735b.mo13154a();
                this.f6735b.mo13155a(this);
            }
        }
    }

    /* renamed from: c */
    public final void mo13104c() {
        synchronized (this.f6737d) {
            if (this.f6746m != -1 && !this.f6736c.isEmpty()) {
                C1755wi last = this.f6736c.getLast();
                if (last.mo13107a() == -1) {
                    last.mo13108b();
                    this.f6735b.mo13155a(this);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo13100a(boolean z) {
        synchronized (this.f6737d) {
            if (this.f6746m != -1) {
                this.f6743j = this.f6734a.mo9997b();
                if (!z) {
                    this.f6741h = this.f6743j;
                    this.f6735b.mo13155a(this);
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo13103b(boolean z) {
        synchronized (this.f6737d) {
            if (this.f6746m != -1) {
                this.f6742i = z;
                this.f6735b.mo13155a(this);
            }
        }
    }

    /* renamed from: d */
    public final Bundle mo13105d() {
        Bundle bundle;
        synchronized (this.f6737d) {
            bundle = new Bundle();
            bundle.putString("seq_num", this.f6738e);
            bundle.putString("slotid", this.f6739f);
            bundle.putBoolean("ismediation", this.f6742i);
            bundle.putLong("treq", this.f6745l);
            bundle.putLong("tresponse", this.f6746m);
            bundle.putLong("timp", this.f6741h);
            bundle.putLong("tload", this.f6743j);
            bundle.putLong("pcc", this.f6744k);
            bundle.putLong("tfetch", this.f6740g);
            ArrayList arrayList = new ArrayList();
            Iterator it = this.f6736c.iterator();
            while (it.hasNext()) {
                arrayList.add(((C1755wi) it.next()).mo13110d());
            }
            bundle.putParcelableArrayList("tclick", arrayList);
        }
        return bundle;
    }

    /* renamed from: e */
    public final String mo13106e() {
        return this.f6738e;
    }
}
