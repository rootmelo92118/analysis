package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import com.google.android.gms.ads.internal.zzbv;
import com.google.android.gms.common.internal.C0926p;
import com.google.android.gms.p039a.C0719a;
import com.google.android.gms.p039a.C0722b;
import java.util.Collections;
import javax.annotation.ParametersAreNonnullByDefault;

@C1598qn
@ParametersAreNonnullByDefault
/* renamed from: com.google.android.gms.internal.ads.as */
public final class C1084as extends C1293ff implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, C1135bi {

    /* renamed from: a */
    private afl f2398a;

    /* renamed from: b */
    private C1133bg f2399b;

    /* renamed from: c */
    private boolean f2400c = false;

    /* renamed from: d */
    private boolean f2401d = false;

    public C1084as(afl afl) {
        this.f2398a = afl;
    }

    /* renamed from: a */
    public final String mo11090a() {
        return "";
    }

    /* renamed from: b */
    public final String mo11093b() {
        return "";
    }

    /* renamed from: c */
    public final C1068ap mo11094c() {
        return null;
    }

    /* renamed from: a */
    public final void mo11092a(C1133bg bgVar) {
        this.f2399b = bgVar;
    }

    /* renamed from: d */
    public final View mo11095d() {
        if (this.f2398a == null) {
            return null;
        }
        return this.f2398a.getView();
    }

    public final void onGlobalLayout() {
        m3616h();
    }

    public final void onScrollChanged() {
        m3616h();
    }

    /* renamed from: a */
    public final void mo11091a(C0719a aVar, C1294fg fgVar) {
        C0926p.m1315b("#008 Must be called on the main UI thread.");
        if (this.f2400c) {
            C1772wz.m1626c("Instream ad is destroyed already.");
            m3614a(fgVar, 2);
        } else if (this.f2398a.mo10172b() == null) {
            C1772wz.m1626c("Instream internal error: can not get video controller.");
            m3614a(fgVar, 0);
        } else if (this.f2401d) {
            C1772wz.m1626c("Instream ad should not be used again.");
            m3614a(fgVar, 1);
        } else {
            this.f2401d = true;
            m3615g();
            ((ViewGroup) C0722b.m770a(aVar)).addView(this.f2398a.getView(), new ViewGroup.LayoutParams(-1, -1));
            zzbv.zzme();
            aby.m1688a(this.f2398a.getView(), (ViewTreeObserver.OnGlobalLayoutListener) this);
            zzbv.zzme();
            aby.m1689a(this.f2398a.getView(), (ViewTreeObserver.OnScrollChangedListener) this);
            m3616h();
            try {
                fgVar.mo12530a();
            } catch (RemoteException e) {
                C1772wz.m1629d("#007 Could not call remote method.", e);
            }
        }
    }

    /* renamed from: e */
    public final btb mo11096e() {
        C0926p.m1315b("#008 Must be called on the main UI thread.");
        if (this.f2400c) {
            C1772wz.m1626c("Instream ad is destroyed already.");
            return null;
        } else if (this.f2398a == null) {
            return null;
        } else {
            return this.f2398a.mo10172b();
        }
    }

    /* renamed from: f */
    public final void mo11097f() {
        C0926p.m1315b("#008 Must be called on the main UI thread.");
        if (!this.f2400c) {
            m3615g();
            if (this.f2399b != null) {
                this.f2399b.mo11800l();
                this.f2399b.mo11799k();
            }
            this.f2399b = null;
            this.f2398a = null;
            this.f2400c = true;
        }
    }

    /* renamed from: g */
    private final void m3615g() {
        if (this.f2398a != null) {
            ViewParent parent = this.f2398a.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView((View) this.f2398a);
            }
        }
    }

    /* renamed from: h */
    private final void m3616h() {
        if (this.f2399b != null && this.f2398a != null) {
            this.f2399b.mo11885c(this.f2398a.getView(), Collections.emptyMap());
        }
    }

    /* renamed from: a */
    private static void m3614a(C1294fg fgVar, int i) {
        try {
            fgVar.mo12531a(i);
        } catch (RemoteException e) {
            C1772wz.m1629d("#007 Could not call remote method.", e);
        }
    }
}
