package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.support.annotation.Nullable;
import com.google.android.gms.common.util.C0970f;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.concurrent.GuardedBy;

@C1598qn
public final class aga extends btc {

    /* renamed from: a */
    private final adc f1691a;

    /* renamed from: b */
    private final Object f1692b = new Object();

    /* renamed from: c */
    private final boolean f1693c;

    /* renamed from: d */
    private final boolean f1694d;
    @GuardedBy("lock")

    /* renamed from: e */
    private int f1695e;
    @GuardedBy("lock")

    /* renamed from: f */
    private bte f1696f;
    @GuardedBy("lock")

    /* renamed from: g */
    private boolean f1697g;
    @GuardedBy("lock")

    /* renamed from: h */
    private boolean f1698h = true;
    @GuardedBy("lock")

    /* renamed from: i */
    private float f1699i;
    @GuardedBy("lock")

    /* renamed from: j */
    private float f1700j;
    @GuardedBy("lock")

    /* renamed from: k */
    private float f1701k;
    @GuardedBy("lock")

    /* renamed from: l */
    private boolean f1702l;
    @GuardedBy("lock")

    /* renamed from: m */
    private boolean f1703m;

    public aga(adc adc, float f, boolean z, boolean z2) {
        this.f1691a = adc;
        this.f1699i = f;
        this.f1693c = z;
        this.f1694d = z2;
    }

    /* renamed from: a */
    public final void mo10461a() {
        m2111a("play", (Map<String, String>) null);
    }

    /* renamed from: b */
    public final void mo10470b() {
        m2111a("pause", (Map<String, String>) null);
    }

    /* renamed from: a */
    public final void mo10468a(boolean z) {
        m2111a(z ? "mute" : "unmute", (Map<String, String>) null);
    }

    /* renamed from: a */
    public final void mo10466a(zzzw zzzw) {
        mo10469a(zzzw.f7304a, zzzw.f7305b, zzzw.f7306c);
    }

    /* renamed from: a */
    public final void mo10469a(boolean z, boolean z2, boolean z3) {
        synchronized (this.f1692b) {
            this.f1702l = z2;
            this.f1703m = z3;
        }
        m2111a("initialState", C0970f.m1474a("muteStart", z ? "1" : "0", "customControlsRequested", z2 ? "1" : "0", "clickToExpandRequested", z3 ? "1" : "0"));
    }

    /* renamed from: a */
    private final void m2111a(String str, @Nullable Map<String, String> map) {
        HashMap hashMap = map == null ? new HashMap() : new HashMap(map);
        hashMap.put("action", str);
        abl.f1313a.execute(new agb(this, hashMap));
    }

    /* renamed from: c */
    public final boolean mo10471c() {
        boolean z;
        synchronized (this.f1692b) {
            z = this.f1698h;
        }
        return z;
    }

    /* renamed from: d */
    public final int mo10472d() {
        int i;
        synchronized (this.f1692b) {
            i = this.f1695e;
        }
        return i;
    }

    /* renamed from: h */
    public final float mo10476h() {
        float f;
        synchronized (this.f1692b) {
            f = this.f1701k;
        }
        return f;
    }

    /* renamed from: e */
    public final float mo10473e() {
        float f;
        synchronized (this.f1692b) {
            f = this.f1699i;
        }
        return f;
    }

    /* renamed from: f */
    public final float mo10474f() {
        float f;
        synchronized (this.f1692b) {
            f = this.f1700j;
        }
        return f;
    }

    /* renamed from: a */
    public final void mo10465a(bte bte) {
        synchronized (this.f1692b) {
            this.f1696f = bte;
        }
    }

    /* renamed from: g */
    public final bte mo10475g() {
        bte bte;
        synchronized (this.f1692b) {
            bte = this.f1696f;
        }
        return bte;
    }

    /* renamed from: i */
    public final boolean mo10477i() {
        boolean z;
        synchronized (this.f1692b) {
            z = this.f1693c && this.f1702l;
        }
        return z;
    }

    /* renamed from: j */
    public final boolean mo10478j() {
        boolean z;
        boolean i = mo10477i();
        synchronized (this.f1692b) {
            if (!i) {
                try {
                    if (this.f1703m && this.f1694d) {
                        z = true;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            z = false;
        }
        return z;
    }

    /* renamed from: a */
    public final void mo10462a(float f) {
        synchronized (this.f1692b) {
            this.f1700j = f;
        }
    }

    /* renamed from: k */
    public final void mo10479k() {
        boolean z;
        int i;
        synchronized (this.f1692b) {
            z = this.f1698h;
            i = this.f1695e;
            this.f1695e = 3;
        }
        m2112b(i, 3, z, z);
    }

    /* renamed from: a */
    public final void mo10463a(float f, float f2, int i, boolean z, float f3) {
        boolean z2;
        int i2;
        synchronized (this.f1692b) {
            this.f1699i = f2;
            this.f1700j = f;
            z2 = this.f1698h;
            this.f1698h = z;
            i2 = this.f1695e;
            this.f1695e = i;
            float f4 = this.f1701k;
            this.f1701k = f3;
            if (Math.abs(this.f1701k - f4) > 1.0E-4f) {
                this.f1691a.getView().invalidate();
            }
        }
        m2112b(i2, i, z2, z);
    }

    /* renamed from: b */
    private final void m2112b(int i, int i2, boolean z, boolean z2) {
        abl.f1313a.execute(new agc(this, i, i2, z, z2));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void mo10464a(int i, int i2, boolean z, boolean z2) {
        synchronized (this.f1692b) {
            boolean z3 = false;
            boolean z4 = i != i2;
            boolean z5 = !this.f1697g && i2 == 1;
            boolean z6 = z4 && i2 == 1;
            boolean z7 = z4 && i2 == 2;
            boolean z8 = z4 && i2 == 3;
            boolean z9 = z != z2;
            if (this.f1697g || z5) {
                z3 = true;
            }
            this.f1697g = z3;
            if (this.f1696f != null) {
                if (z5) {
                    try {
                        this.f1696f.mo12350a();
                    } catch (RemoteException e) {
                        C1772wz.m1627c("Unable to call onVideoStart()", e);
                    }
                }
                if (z6) {
                    try {
                        this.f1696f.mo12352b();
                    } catch (RemoteException e2) {
                        C1772wz.m1627c("Unable to call onVideoPlay()", e2);
                    }
                }
                if (z7) {
                    try {
                        this.f1696f.mo12353c();
                    } catch (RemoteException e3) {
                        C1772wz.m1627c("Unable to call onVideoPause()", e3);
                    }
                }
                if (z8) {
                    try {
                        this.f1696f.mo12354d();
                    } catch (RemoteException e4) {
                        C1772wz.m1627c("Unable to call onVideoEnd()", e4);
                    }
                    this.f1691a.mo10183l();
                }
                if (z9) {
                    try {
                        this.f1696f.mo12351a(z2);
                    } catch (RemoteException e5) {
                        C1772wz.m1627c("Unable to call onVideoMute()", e5);
                    }
                }
            } else {
                return;
            }
        }
        return;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void mo10467a(Map map) {
        this.f1691a.mo10443a("pubVideoCmd", (Map<String, ?>) map);
    }
}
