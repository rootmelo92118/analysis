package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.support.annotation.GuardedBy;
import com.google.android.gms.ads.internal.zzbv;
import com.google.android.gms.common.p041a.C0771c;
import com.google.android.gms.common.util.C0979o;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;

@C1598qn
@ParametersAreNonnullByDefault
/* renamed from: com.google.android.gms.internal.ads.wk */
public final class C1757wk {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final Object f6758a = new Object();

    /* renamed from: b */
    private blp f6759b;

    /* renamed from: c */
    private final C1777xd f6760c = new C1777xd();

    /* renamed from: d */
    private final C1766wt f6761d = new C1766wt(bre.m6322f(), this.f6760c);

    /* renamed from: e */
    private boolean f6762e = false;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public Context f6763f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public zzbbi f6764g;
    /* access modifiers changed from: private */
    @Nullable

    /* renamed from: h */
    public C1638s f6765h = null;
    @Nullable

    /* renamed from: i */
    private Boolean f6766i = null;

    /* renamed from: j */
    private String f6767j;

    /* renamed from: k */
    private final AtomicInteger f6768k = new AtomicInteger(0);

    /* renamed from: l */
    private final C1760wn f6769l = new C1760wn((C1759wm) null);

    /* renamed from: m */
    private final Object f6770m = new Object();
    @GuardedBy("mGrantedPermissionLock")

    /* renamed from: n */
    private abg<ArrayList<String>> f6771n;

    @Nullable
    /* renamed from: a */
    public final C1638s mo13116a() {
        C1638s sVar;
        synchronized (this.f6758a) {
            sVar = this.f6765h;
        }
        return sVar;
    }

    /* renamed from: a */
    public final void mo13118a(Boolean bool) {
        synchronized (this.f6758a) {
            this.f6766i = bool;
        }
    }

    /* renamed from: b */
    public final Boolean mo13121b() {
        Boolean bool;
        synchronized (this.f6758a) {
            bool = this.f6766i;
        }
        return bool;
    }

    /* renamed from: a */
    public final void mo13120a(boolean z) {
        this.f6769l.mo13137a(z);
    }

    /* renamed from: c */
    public final boolean mo13123c() {
        return this.f6769l.mo13138a();
    }

    /* renamed from: d */
    public final boolean mo13124d() {
        return this.f6769l.mo13139b();
    }

    /* renamed from: e */
    public final void mo13125e() {
        this.f6769l.mo13140c();
    }

    @TargetApi(23)
    /* renamed from: a */
    public final void mo13117a(Context context, zzbbi zzbbi) {
        synchronized (this.f6758a) {
            if (!this.f6762e) {
                this.f6763f = context.getApplicationContext();
                this.f6764g = zzbbi;
                zzbv.zzli().mo12226a((bnh) this.f6761d);
                C1638s sVar = null;
                this.f6760c.mo13195a(this.f6763f, (String) null, true);
                C1592qh.m7801a(this.f6763f, this.f6764g);
                this.f6767j = zzbv.zzlf().mo13207b(context, zzbbi.f7135a);
                this.f6759b = new blp(context.getApplicationContext(), this.f6764g);
                zzbv.zzlo();
                if (!((Boolean) bre.m6321e().mo12778a(C1557p.f5876K)).booleanValue()) {
                    C1772wz.m8287a("CsiReporterFactory: CSI is not enabled. No CSI reporter created.");
                } else {
                    sVar = new C1638s();
                }
                this.f6765h = sVar;
                if (this.f6765h != null) {
                    aas.m1642a((abg) new C1759wm(this).zzwa(), "AppState.registerCsiReporter");
                }
                this.f6762e = true;
                mo13133m();
            }
        }
    }

    /* renamed from: f */
    public final blp mo13126f() {
        return this.f6759b;
    }

    @Nullable
    /* renamed from: g */
    public final Resources mo13127g() {
        if (this.f6764g.f7138d) {
            return this.f6763f.getResources();
        }
        try {
            aaj.m1632a(this.f6763f).getResources();
            return null;
        } catch (aal e) {
            C1772wz.m1627c("Cannot load resource from dynamite apk or local jar", e);
            return null;
        }
    }

    /* renamed from: a */
    public final void mo13119a(Throwable th, String str) {
        C1592qh.m7801a(this.f6763f, this.f6764g).mo12898a(th, str);
    }

    /* renamed from: b */
    public final void mo13122b(Throwable th, String str) {
        C1592qh.m7801a(this.f6763f, this.f6764g).mo12899a(th, str, ((Float) bre.m6321e().mo12778a(C1557p.f6130g)).floatValue());
    }

    /* renamed from: h */
    public final void mo13128h() {
        this.f6768k.incrementAndGet();
    }

    /* renamed from: i */
    public final void mo13129i() {
        this.f6768k.decrementAndGet();
    }

    /* renamed from: j */
    public final int mo13130j() {
        return this.f6768k.get();
    }

    @Deprecated
    /* renamed from: k */
    public final C1776xc mo13131k() {
        C1777xd xdVar;
        synchronized (this.f6758a) {
            xdVar = this.f6760c;
        }
        return xdVar;
    }

    @Nullable
    /* renamed from: l */
    public final Context mo13132l() {
        return this.f6763f;
    }

    /* renamed from: m */
    public final abg<ArrayList<String>> mo13133m() {
        if (C0979o.m1502c() && this.f6763f != null) {
            if (!((Boolean) bre.m6321e().mo12778a(C1557p.f5981bj)).booleanValue()) {
                synchronized (this.f6770m) {
                    if (this.f6771n != null) {
                        abg<ArrayList<String>> abg = this.f6771n;
                        return abg;
                    }
                    abg<ArrayList<String>> a = C1780xg.m8354a(new C1758wl(this));
                    this.f6771n = a;
                    return a;
                }
            }
        }
        return aau.m1646a(new ArrayList());
    }

    @TargetApi(16)
    /* renamed from: a */
    private static ArrayList<String> m8236a(Context context) {
        ArrayList<String> arrayList = new ArrayList<>();
        try {
            PackageInfo b = C0771c.m904a(context).mo9540b(context.getApplicationInfo().packageName, 4096);
            if (b.requestedPermissions == null || b.requestedPermissionsFlags == null) {
                return arrayList;
            }
            for (int i = 0; i < b.requestedPermissions.length; i++) {
                if ((b.requestedPermissionsFlags[i] & 2) != 0) {
                    arrayList.add(b.requestedPermissions[i]);
                }
            }
            return arrayList;
        } catch (PackageManager.NameNotFoundException unused) {
            return arrayList;
        }
    }

    /* renamed from: n */
    public final C1766wt mo13134n() {
        return this.f6761d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public final /* synthetic */ ArrayList mo13135o() {
        return m8236a(C1678tm.m7946a(this.f6763f));
    }
}
