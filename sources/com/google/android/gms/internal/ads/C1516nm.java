package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.support.annotation.Nullable;
import android.view.View;
import android.webkit.WebView;
import com.google.android.gms.p039a.C0719a;
import com.google.android.gms.p039a.C0722b;
import javax.annotation.concurrent.GuardedBy;

@C1598qn
/* renamed from: com.google.android.gms.internal.ads.nm */
public final class C1516nm {

    /* renamed from: a */
    private static final Object f5797a = new Object();
    @GuardedBy("sLock")

    /* renamed from: b */
    private static boolean f5798b = false;
    @GuardedBy("sLock")

    /* renamed from: c */
    private static boolean f5799c = false;

    /* renamed from: d */
    private aic f5800d;

    /* renamed from: a */
    public final boolean mo12836a(Context context) {
        synchronized (f5797a) {
            if (!((Boolean) bre.m6321e().mo12778a(C1557p.f6001cC)).booleanValue()) {
                return false;
            }
            if (f5798b) {
                return true;
            }
            try {
                m7677c(context);
                boolean a = this.f5800d.mo10578a(C0722b.m769a(context));
                f5798b = a;
                return a;
            } catch (RemoteException | NullPointerException e) {
                aai.m1629d("#007 Could not call remote method.", e);
                return false;
            }
        }
    }

    /* renamed from: c */
    private final void m7677c(Context context) {
        synchronized (f5797a) {
            if (((Boolean) bre.m6321e().mo12778a(C1557p.f6001cC)).booleanValue() && !f5799c) {
                try {
                    f5799c = true;
                    this.f5800d = (aic) aaj.m1633a(context, "com.google.android.gms.ads.omid.DynamiteOmid", C1517nn.f5801a);
                } catch (aal e) {
                    aai.m1629d("#007 Could not call remote method.", e);
                }
            }
        }
    }

    @Nullable
    /* renamed from: b */
    public final String mo12837b(Context context) {
        if (!((Boolean) bre.m6321e().mo12778a(C1557p.f6001cC)).booleanValue()) {
            return null;
        }
        try {
            m7677c(context);
            String valueOf = String.valueOf(this.f5800d.mo10576a());
            return valueOf.length() != 0 ? "a.".concat(valueOf) : new String("a.");
        } catch (RemoteException | NullPointerException e) {
            aai.m1629d("#007 Could not call remote method.", e);
            return null;
        }
    }

    @Nullable
    /* renamed from: a */
    public final C0719a mo12832a(String str, WebView webView, String str2, String str3, String str4) {
        return mo12833a(str, webView, str2, str3, str4, "Google");
    }

    @Nullable
    /* renamed from: a */
    public final C0719a mo12833a(String str, WebView webView, String str2, String str3, String str4, String str5) {
        synchronized (f5797a) {
            try {
                if (((Boolean) bre.m6321e().mo12778a(C1557p.f6001cC)).booleanValue()) {
                    if (f5798b) {
                        try {
                            return this.f5800d.mo10575a(str, C0722b.m769a(webView), str2, str3, str4, str5);
                        } catch (RemoteException | NullPointerException e) {
                            aai.m1629d("#007 Could not call remote method.", e);
                            return null;
                        }
                    }
                }
                return null;
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        }
    }

    /* renamed from: a */
    public final void mo12834a(C0719a aVar) {
        synchronized (f5797a) {
            if (((Boolean) bre.m6321e().mo12778a(C1557p.f6001cC)).booleanValue()) {
                if (f5798b) {
                    try {
                        this.f5800d.mo10579b(aVar);
                    } catch (RemoteException | NullPointerException e) {
                        aai.m1629d("#007 Could not call remote method.", e);
                    }
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo12838b(C0719a aVar) {
        synchronized (f5797a) {
            if (((Boolean) bre.m6321e().mo12778a(C1557p.f6001cC)).booleanValue()) {
                if (f5798b) {
                    try {
                        this.f5800d.mo10580c(aVar);
                    } catch (RemoteException | NullPointerException e) {
                        aai.m1629d("#007 Could not call remote method.", e);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo12835a(C0719a aVar, View view) {
        synchronized (f5797a) {
            if (((Boolean) bre.m6321e().mo12778a(C1557p.f6001cC)).booleanValue()) {
                if (f5798b) {
                    try {
                        this.f5800d.mo10577a(aVar, C0722b.m769a(view));
                    } catch (RemoteException | NullPointerException e) {
                        aai.m1629d("#007 Could not call remote method.", e);
                    }
                }
            }
        }
    }
}
