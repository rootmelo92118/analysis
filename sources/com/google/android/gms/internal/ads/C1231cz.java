package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.formats.NativeAd;
import com.google.android.gms.ads.formats.NativeContentAd;
import com.google.android.gms.p039a.C0719a;
import java.util.ArrayList;
import java.util.List;

@C1598qn
/* renamed from: com.google.android.gms.internal.ads.cz */
public final class C1231cz extends NativeContentAd {

    /* renamed from: a */
    private final C1228cw f5316a;

    /* renamed from: b */
    private final List<NativeAd.Image> f5317b = new ArrayList();

    /* renamed from: c */
    private final C1213ch f5318c;

    /* renamed from: d */
    private final VideoController f5319d = new VideoController();

    /* renamed from: e */
    private final NativeAd.AdChoicesInfo f5320e;

    /* JADX WARNING: type inference failed for: r2v3, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x007a A[Catch:{ RemoteException -> 0x0087 }] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C1231cz(com.google.android.gms.internal.ads.C1228cw r5) {
        /*
            r4 = this;
            r4.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r4.f5317b = r0
            com.google.android.gms.ads.VideoController r0 = new com.google.android.gms.ads.VideoController
            r0.<init>()
            r4.f5319d = r0
            r4.f5316a = r5
            r5 = 0
            com.google.android.gms.internal.ads.cw r0 = r4.f5316a     // Catch:{ RemoteException -> 0x0055 }
            java.util.List r0 = r0.mo11236f()     // Catch:{ RemoteException -> 0x0055 }
            if (r0 == 0) goto L_0x005b
            java.util.Iterator r0 = r0.iterator()     // Catch:{ RemoteException -> 0x0055 }
        L_0x0020:
            boolean r1 = r0.hasNext()     // Catch:{ RemoteException -> 0x0055 }
            if (r1 == 0) goto L_0x005b
            java.lang.Object r1 = r0.next()     // Catch:{ RemoteException -> 0x0055 }
            boolean r2 = r1 instanceof android.os.IBinder     // Catch:{ RemoteException -> 0x0055 }
            if (r2 == 0) goto L_0x0047
            android.os.IBinder r1 = (android.os.IBinder) r1     // Catch:{ RemoteException -> 0x0055 }
            if (r1 == 0) goto L_0x0047
            java.lang.String r2 = "com.google.android.gms.ads.internal.formats.client.INativeAdImage"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)     // Catch:{ RemoteException -> 0x0055 }
            boolean r3 = r2 instanceof com.google.android.gms.internal.ads.C1210ce     // Catch:{ RemoteException -> 0x0055 }
            if (r3 == 0) goto L_0x0040
            r1 = r2
            com.google.android.gms.internal.ads.ce r1 = (com.google.android.gms.internal.ads.C1210ce) r1     // Catch:{ RemoteException -> 0x0055 }
            goto L_0x0048
        L_0x0040:
            com.google.android.gms.internal.ads.cg r2 = new com.google.android.gms.internal.ads.cg     // Catch:{ RemoteException -> 0x0055 }
            r2.<init>(r1)     // Catch:{ RemoteException -> 0x0055 }
            r1 = r2
            goto L_0x0048
        L_0x0047:
            r1 = r5
        L_0x0048:
            if (r1 == 0) goto L_0x0020
            java.util.List<com.google.android.gms.ads.formats.NativeAd$Image> r2 = r4.f5317b     // Catch:{ RemoteException -> 0x0055 }
            com.google.android.gms.internal.ads.ch r3 = new com.google.android.gms.internal.ads.ch     // Catch:{ RemoteException -> 0x0055 }
            r3.<init>(r1)     // Catch:{ RemoteException -> 0x0055 }
            r2.add(r3)     // Catch:{ RemoteException -> 0x0055 }
            goto L_0x0020
        L_0x0055:
            r0 = move-exception
            java.lang.String r1 = ""
            com.google.android.gms.internal.ads.aai.m1625b(r1, r0)
        L_0x005b:
            com.google.android.gms.internal.ads.cw r0 = r4.f5316a     // Catch:{ RemoteException -> 0x0069 }
            com.google.android.gms.internal.ads.ce r0 = r0.mo11332j()     // Catch:{ RemoteException -> 0x0069 }
            if (r0 == 0) goto L_0x006f
            com.google.android.gms.internal.ads.ch r1 = new com.google.android.gms.internal.ads.ch     // Catch:{ RemoteException -> 0x0069 }
            r1.<init>(r0)     // Catch:{ RemoteException -> 0x0069 }
            goto L_0x0070
        L_0x0069:
            r0 = move-exception
            java.lang.String r1 = ""
            com.google.android.gms.internal.ads.aai.m1625b(r1, r0)
        L_0x006f:
            r1 = r5
        L_0x0070:
            r4.f5318c = r1
            com.google.android.gms.internal.ads.cw r0 = r4.f5316a     // Catch:{ RemoteException -> 0x0087 }
            com.google.android.gms.internal.ads.bz r0 = r0.mo11338p()     // Catch:{ RemoteException -> 0x0087 }
            if (r0 == 0) goto L_0x008d
            com.google.android.gms.internal.ads.cd r0 = new com.google.android.gms.internal.ads.cd     // Catch:{ RemoteException -> 0x0087 }
            com.google.android.gms.internal.ads.cw r1 = r4.f5316a     // Catch:{ RemoteException -> 0x0087 }
            com.google.android.gms.internal.ads.bz r1 = r1.mo11338p()     // Catch:{ RemoteException -> 0x0087 }
            r0.<init>(r1)     // Catch:{ RemoteException -> 0x0087 }
            r5 = r0
            goto L_0x008d
        L_0x0087:
            r0 = move-exception
            java.lang.String r1 = ""
            com.google.android.gms.internal.ads.aai.m1625b(r1, r0)
        L_0x008d:
            r4.f5320e = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1231cz.<init>(com.google.android.gms.internal.ads.cw):void");
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final C0719a zzhy() {
        try {
            return this.f5316a.mo11336n();
        } catch (RemoteException e) {
            aai.m1625b("", e);
            return null;
        }
    }

    public final void performClick(Bundle bundle) {
        try {
            this.f5316a.mo11325a(bundle);
        } catch (RemoteException e) {
            aai.m1625b("", e);
        }
    }

    public final boolean recordImpression(Bundle bundle) {
        try {
            return this.f5316a.mo11326b(bundle);
        } catch (RemoteException e) {
            aai.m1625b("", e);
            return false;
        }
    }

    public final void reportTouchEvent(Bundle bundle) {
        try {
            this.f5316a.mo11327c(bundle);
        } catch (RemoteException e) {
            aai.m1625b("", e);
        }
    }

    public final CharSequence getHeadline() {
        try {
            return this.f5316a.mo11328e();
        } catch (RemoteException e) {
            aai.m1625b("", e);
            return null;
        }
    }

    public final List<NativeAd.Image> getImages() {
        return this.f5317b;
    }

    public final CharSequence getBody() {
        try {
            return this.f5316a.mo11331i();
        } catch (RemoteException e) {
            aai.m1625b("", e);
            return null;
        }
    }

    public final NativeAd.Image getLogo() {
        return this.f5318c;
    }

    public final CharSequence getCallToAction() {
        try {
            return this.f5316a.mo11333k();
        } catch (RemoteException e) {
            aai.m1625b("", e);
            return null;
        }
    }

    public final CharSequence getAdvertiser() {
        try {
            return this.f5316a.mo11334l();
        } catch (RemoteException e) {
            aai.m1625b("", e);
            return null;
        }
    }

    public final VideoController getVideoController() {
        try {
            if (this.f5316a.mo11335m() != null) {
                this.f5319d.zza(this.f5316a.mo11335m());
            }
        } catch (RemoteException e) {
            aai.m1625b("Exception occurred while getting video controller", e);
        }
        return this.f5319d;
    }

    public final Bundle getExtras() {
        try {
            return this.f5316a.mo11337o();
        } catch (RemoteException e) {
            aai.m1625b("", e);
            return null;
        }
    }

    public final NativeAd.AdChoicesInfo getAdChoicesInfo() {
        return this.f5320e;
    }

    public final CharSequence getMediationAdapterClassName() {
        try {
            return this.f5316a.mo11330h();
        } catch (RemoteException e) {
            aai.m1625b("", e);
            return null;
        }
    }

    public final void destroy() {
        try {
            this.f5316a.mo11339q();
        } catch (RemoteException e) {
            aai.m1625b("", e);
        }
    }
}
