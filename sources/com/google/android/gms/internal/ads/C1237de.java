package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.formats.MediaView;
import com.google.android.gms.ads.formats.NativeAd;
import com.google.android.gms.ads.formats.NativeCustomTemplateAd;
import com.google.android.gms.p039a.C0722b;
import java.util.List;
import java.util.WeakHashMap;

@C1598qn
/* renamed from: com.google.android.gms.internal.ads.de */
public final class C1237de implements NativeCustomTemplateAd {

    /* renamed from: a */
    private static WeakHashMap<IBinder, C1237de> f5323a = new WeakHashMap<>();

    /* renamed from: b */
    private final C1233da f5324b;

    /* renamed from: c */
    private final MediaView f5325c;

    /* renamed from: d */
    private final VideoController f5326d = new VideoController();

    private C1237de(C1233da daVar) {
        Context context;
        this.f5324b = daVar;
        MediaView mediaView = null;
        try {
            context = (Context) C0722b.m770a(daVar.mo11414i());
        } catch (RemoteException | NullPointerException e) {
            aai.m1625b("", e);
            context = null;
        }
        if (context != null) {
            MediaView mediaView2 = new MediaView(context);
            try {
                if (this.f5324b.mo11407a(C0722b.m769a(mediaView2))) {
                    mediaView = mediaView2;
                }
            } catch (RemoteException e2) {
                aai.m1625b("", e2);
            }
        }
        this.f5325c = mediaView;
    }

    /* renamed from: a */
    public static C1237de m6723a(C1233da daVar) {
        synchronized (f5323a) {
            C1237de deVar = f5323a.get(daVar.asBinder());
            if (deVar != null) {
                return deVar;
            }
            C1237de deVar2 = new C1237de(daVar);
            f5323a.put(daVar.asBinder(), deVar2);
            return deVar2;
        }
    }

    /* renamed from: a */
    public final C1233da mo12499a() {
        return this.f5324b;
    }

    public final CharSequence getText(String str) {
        try {
            return this.f5324b.mo11406a(str);
        } catch (RemoteException e) {
            aai.m1625b("", e);
            return null;
        }
    }

    public final NativeAd.Image getImage(String str) {
        try {
            C1210ce b = this.f5324b.mo11408b(str);
            if (b != null) {
                return new C1213ch(b);
            }
            return null;
        } catch (RemoteException e) {
            aai.m1625b("", e);
            return null;
        }
    }

    public final VideoController getVideoController() {
        try {
            btb g = this.f5324b.mo11412g();
            if (g != null) {
                this.f5326d.zza(g);
            }
        } catch (RemoteException e) {
            aai.m1625b("Exception occurred while getting video controller", e);
        }
        return this.f5326d;
    }

    public final MediaView getVideoMediaView() {
        return this.f5325c;
    }

    public final List<String> getAvailableAssetNames() {
        try {
            return this.f5324b.mo11410e();
        } catch (RemoteException e) {
            aai.m1625b("", e);
            return null;
        }
    }

    public final String getCustomTemplateId() {
        try {
            return this.f5324b.mo11093b();
        } catch (RemoteException e) {
            aai.m1625b("", e);
            return null;
        }
    }

    public final void performClick(String str) {
        try {
            this.f5324b.mo11409c(str);
        } catch (RemoteException e) {
            aai.m1625b("", e);
        }
    }

    public final void recordImpression() {
        try {
            this.f5324b.mo11413h();
        } catch (RemoteException e) {
            aai.m1625b("", e);
        }
    }

    public final void destroy() {
        try {
            this.f5324b.mo11415j();
        } catch (RemoteException e) {
            aai.m1625b("", e);
        }
    }
}
