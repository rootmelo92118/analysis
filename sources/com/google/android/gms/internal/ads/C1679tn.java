package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.zzv;
import com.google.android.gms.p039a.C0719a;
import com.google.android.gms.p039a.C0722b;
import javax.annotation.concurrent.GuardedBy;

@C1598qn
/* renamed from: com.google.android.gms.internal.ads.tn */
public final class C1679tn extends C1689tx {

    /* renamed from: a */
    private final Context f6556a;

    /* renamed from: b */
    private final Object f6557b;

    /* renamed from: c */
    private final zzbbi f6558c;
    @GuardedBy("mLock")

    /* renamed from: d */
    private final C1680to f6559d;

    public C1679tn(Context context, zzv zzv, C1437ko koVar, zzbbi zzbbi) {
        this(context, zzbbi, new C1680to(context, zzv, zzwf.m8829a(), koVar, zzbbi));
    }

    private C1679tn(Context context, zzbbi zzbbi, C1680to toVar) {
        this.f6557b = new Object();
        this.f6556a = context;
        this.f6558c = zzbbi;
        this.f6559d = toVar;
    }

    /* renamed from: a */
    public final void mo12467a(String str) {
        if (this.f6556a instanceof C1678tm) {
            try {
                ((C1678tm) this.f6556a).mo12988a(str);
            } catch (PackageManager.NameNotFoundException unused) {
                if (Build.VERSION.SDK_INT > 15) {
                    throw new RemoteException(PackageManager.NameNotFoundException.class.getSimpleName());
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo12466a(zzavh zzavh) {
        synchronized (this.f6557b) {
            this.f6559d.mo12996a(zzavh);
        }
    }

    /* renamed from: a */
    public final void mo12461a() {
        synchronized (this.f6557b) {
            this.f6559d.mo12997b();
        }
    }

    /* renamed from: a */
    public final synchronized void mo12462a(C0719a aVar) {
        if (this.f6556a instanceof C1678tm) {
            ((C1678tm) this.f6556a).mo12987a((Activity) C0722b.m770a(aVar));
        }
        mo12461a();
    }

    /* renamed from: a */
    public final void mo12465a(C1695uc ucVar) {
        synchronized (this.f6557b) {
            this.f6559d.zza(ucVar);
        }
    }

    /* renamed from: a */
    public final void mo12464a(C1686tu tuVar) {
        synchronized (this.f6557b) {
            this.f6559d.zza(tuVar);
        }
    }

    /* renamed from: a */
    public final void mo12463a(bsb bsb) {
        if (((Boolean) bre.m6321e().mo12778a(C1557p.f5937as)).booleanValue()) {
            synchronized (this.f6557b) {
                this.f6559d.zza(bsb);
            }
        }
    }

    /* renamed from: b */
    public final Bundle mo12469b() {
        Bundle adMetadata;
        if (!((Boolean) bre.m6321e().mo12778a(C1557p.f5937as)).booleanValue()) {
            return new Bundle();
        }
        synchronized (this.f6557b) {
            adMetadata = this.f6559d.getAdMetadata();
        }
        return adMetadata;
    }

    /* renamed from: b */
    public final void mo12471b(String str) {
        synchronized (this.f6557b) {
            this.f6559d.setUserId(str);
        }
    }

    /* renamed from: c */
    public final void mo12473c(String str) {
        if (((Boolean) bre.m6321e().mo12778a(C1557p.f5938at)).booleanValue()) {
            synchronized (this.f6557b) {
                this.f6559d.zzap(str);
            }
        }
    }

    /* renamed from: c */
    public final boolean mo12474c() {
        boolean c;
        synchronized (this.f6557b) {
            c = this.f6559d.mo12998c();
        }
        return c;
    }

    /* renamed from: d */
    public final void mo12475d() {
        mo12470b((C0719a) null);
    }

    /* renamed from: b */
    public final void mo12470b(C0719a aVar) {
        synchronized (this.f6557b) {
            this.f6559d.pause();
        }
    }

    /* renamed from: e */
    public final void mo12477e() {
        mo12472c((C0719a) null);
    }

    /* renamed from: c */
    public final void mo12472c(C0719a aVar) {
        Context context;
        synchronized (this.f6557b) {
            if (aVar == null) {
                context = null;
            } else {
                try {
                    context = (Context) C0722b.m770a(aVar);
                } catch (Exception e) {
                    C1772wz.m1627c("Unable to extract updated context.", e);
                }
            }
            if (context != null) {
                this.f6559d.mo12995a(context);
            }
            this.f6559d.resume();
        }
    }

    /* renamed from: f */
    public final void mo12478f() {
        mo12476d((C0719a) null);
    }

    /* renamed from: d */
    public final void mo12476d(C0719a aVar) {
        synchronized (this.f6557b) {
            this.f6559d.destroy();
        }
    }

    /* renamed from: g */
    public final String mo12479g() {
        String mediationAdapterClassName;
        synchronized (this.f6557b) {
            mediationAdapterClassName = this.f6559d.getMediationAdapterClassName();
        }
        return mediationAdapterClassName;
    }

    /* renamed from: a */
    public final void mo12468a(boolean z) {
        synchronized (this.f6557b) {
            this.f6559d.setImmersiveMode(z);
        }
    }
}
