package com.google.android.gms.ads.internal;

import android.os.RemoteException;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.internal.ads.C1557p;
import com.google.android.gms.internal.ads.C1772wz;
import com.google.android.gms.internal.ads.bre;

final class zzbq extends WebViewClient {
    private final /* synthetic */ zzbp zzbra;

    zzbq(zzbp zzbp) {
        this.zzbra = zzbp;
    }

    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        if (str.startsWith(this.zzbra.zzkx())) {
            return false;
        }
        if (str.startsWith((String) bre.m6321e().mo12778a(C1557p.f5959bN))) {
            if (this.zzbra.zzbnn != null) {
                try {
                    this.zzbra.zzbnn.mo12297a(3);
                } catch (RemoteException e) {
                    C1772wz.m1629d("#007 Could not call remote method.", e);
                }
            }
            this.zzbra.zzbt(0);
            return true;
        }
        if (str.startsWith((String) bre.m6321e().mo12778a(C1557p.f5960bO))) {
            if (this.zzbra.zzbnn != null) {
                try {
                    this.zzbra.zzbnn.mo12297a(0);
                } catch (RemoteException e2) {
                    C1772wz.m1629d("#007 Could not call remote method.", e2);
                }
            }
            this.zzbra.zzbt(0);
            return true;
        }
        if (str.startsWith((String) bre.m6321e().mo12778a(C1557p.f5961bP))) {
            if (this.zzbra.zzbnn != null) {
                try {
                    this.zzbra.zzbnn.mo12299c();
                } catch (RemoteException e3) {
                    C1772wz.m1629d("#007 Could not call remote method.", e3);
                }
            }
            this.zzbra.zzbt(this.zzbra.zzav(str));
            return true;
        } else if (str.startsWith("gmsg://")) {
            return true;
        } else {
            if (this.zzbra.zzbnn != null) {
                try {
                    this.zzbra.zzbnn.mo12298b();
                } catch (RemoteException e4) {
                    C1772wz.m1629d("#007 Could not call remote method.", e4);
                }
            }
            this.zzbra.zzax(this.zzbra.zzaw(str));
            return true;
        }
    }

    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        if (this.zzbra.zzbnn != null) {
            try {
                this.zzbra.zzbnn.mo12297a(0);
            } catch (RemoteException e) {
                C1772wz.m1629d("#007 Could not call remote method.", e);
            }
        }
    }
}
