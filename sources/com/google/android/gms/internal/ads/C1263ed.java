package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.MuteThisAdListener;
import com.google.android.gms.ads.MuteThisAdReason;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.formats.NativeAd;
import com.google.android.gms.ads.formats.UnifiedNativeAd;
import com.google.android.gms.p039a.C0719a;
import com.google.android.gms.p039a.C0722b;
import java.util.ArrayList;
import java.util.List;

@C1598qn
/* renamed from: com.google.android.gms.internal.ads.ed */
public final class C1263ed extends UnifiedNativeAd {

    /* renamed from: a */
    private final C1260ea f5330a;

    /* renamed from: b */
    private final List<NativeAd.Image> f5331b = new ArrayList();

    /* renamed from: c */
    private final C1213ch f5332c;

    /* renamed from: d */
    private final VideoController f5333d = new VideoController();

    /* renamed from: e */
    private final NativeAd.AdChoicesInfo f5334e;

    /* renamed from: f */
    private final List<MuteThisAdReason> f5335f = new ArrayList();

    /* JADX WARNING: type inference failed for: r2v5, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00b6 A[Catch:{ RemoteException -> 0x00c3 }] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C1263ed(com.google.android.gms.internal.ads.C1260ea r5) {
        /*
            r4 = this;
            r4.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r4.f5331b = r0
            com.google.android.gms.ads.VideoController r0 = new com.google.android.gms.ads.VideoController
            r0.<init>()
            r4.f5333d = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r4.f5335f = r0
            r4.f5330a = r5
            r5 = 0
            com.google.android.gms.internal.ads.ea r0 = r4.f5330a     // Catch:{ RemoteException -> 0x005c }
            java.util.List r0 = r0.mo11236f()     // Catch:{ RemoteException -> 0x005c }
            if (r0 == 0) goto L_0x0062
            java.util.Iterator r0 = r0.iterator()     // Catch:{ RemoteException -> 0x005c }
        L_0x0027:
            boolean r1 = r0.hasNext()     // Catch:{ RemoteException -> 0x005c }
            if (r1 == 0) goto L_0x0062
            java.lang.Object r1 = r0.next()     // Catch:{ RemoteException -> 0x005c }
            boolean r2 = r1 instanceof android.os.IBinder     // Catch:{ RemoteException -> 0x005c }
            if (r2 == 0) goto L_0x004e
            android.os.IBinder r1 = (android.os.IBinder) r1     // Catch:{ RemoteException -> 0x005c }
            if (r1 == 0) goto L_0x004e
            java.lang.String r2 = "com.google.android.gms.ads.internal.formats.client.INativeAdImage"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)     // Catch:{ RemoteException -> 0x005c }
            boolean r3 = r2 instanceof com.google.android.gms.internal.ads.C1210ce     // Catch:{ RemoteException -> 0x005c }
            if (r3 == 0) goto L_0x0047
            r1 = r2
            com.google.android.gms.internal.ads.ce r1 = (com.google.android.gms.internal.ads.C1210ce) r1     // Catch:{ RemoteException -> 0x005c }
            goto L_0x004f
        L_0x0047:
            com.google.android.gms.internal.ads.cg r2 = new com.google.android.gms.internal.ads.cg     // Catch:{ RemoteException -> 0x005c }
            r2.<init>(r1)     // Catch:{ RemoteException -> 0x005c }
            r1 = r2
            goto L_0x004f
        L_0x004e:
            r1 = r5
        L_0x004f:
            if (r1 == 0) goto L_0x0027
            java.util.List<com.google.android.gms.ads.formats.NativeAd$Image> r2 = r4.f5331b     // Catch:{ RemoteException -> 0x005c }
            com.google.android.gms.internal.ads.ch r3 = new com.google.android.gms.internal.ads.ch     // Catch:{ RemoteException -> 0x005c }
            r3.<init>(r1)     // Catch:{ RemoteException -> 0x005c }
            r2.add(r3)     // Catch:{ RemoteException -> 0x005c }
            goto L_0x0027
        L_0x005c:
            r0 = move-exception
            java.lang.String r1 = ""
            com.google.android.gms.internal.ads.aai.m1625b(r1, r0)
        L_0x0062:
            com.google.android.gms.internal.ads.ea r0 = r4.f5330a     // Catch:{ RemoteException -> 0x0091 }
            java.util.List r0 = r0.mo11591g()     // Catch:{ RemoteException -> 0x0091 }
            if (r0 == 0) goto L_0x0097
            java.util.Iterator r0 = r0.iterator()     // Catch:{ RemoteException -> 0x0091 }
        L_0x006e:
            boolean r1 = r0.hasNext()     // Catch:{ RemoteException -> 0x0091 }
            if (r1 == 0) goto L_0x0097
            java.lang.Object r1 = r0.next()     // Catch:{ RemoteException -> 0x0091 }
            boolean r2 = r1 instanceof android.os.IBinder     // Catch:{ RemoteException -> 0x0091 }
            if (r2 == 0) goto L_0x0083
            android.os.IBinder r1 = (android.os.IBinder) r1     // Catch:{ RemoteException -> 0x0091 }
            com.google.android.gms.internal.ads.bsx r1 = com.google.android.gms.internal.ads.bsy.m6366a(r1)     // Catch:{ RemoteException -> 0x0091 }
            goto L_0x0084
        L_0x0083:
            r1 = r5
        L_0x0084:
            if (r1 == 0) goto L_0x006e
            java.util.List<com.google.android.gms.ads.MuteThisAdReason> r2 = r4.f5335f     // Catch:{ RemoteException -> 0x0091 }
            com.google.android.gms.internal.ads.bta r3 = new com.google.android.gms.internal.ads.bta     // Catch:{ RemoteException -> 0x0091 }
            r3.<init>(r1)     // Catch:{ RemoteException -> 0x0091 }
            r2.add(r3)     // Catch:{ RemoteException -> 0x0091 }
            goto L_0x006e
        L_0x0091:
            r0 = move-exception
            java.lang.String r1 = ""
            com.google.android.gms.internal.ads.aai.m1625b(r1, r0)
        L_0x0097:
            com.google.android.gms.internal.ads.ea r0 = r4.f5330a     // Catch:{ RemoteException -> 0x00a5 }
            com.google.android.gms.internal.ads.ce r0 = r0.mo11594j()     // Catch:{ RemoteException -> 0x00a5 }
            if (r0 == 0) goto L_0x00ab
            com.google.android.gms.internal.ads.ch r1 = new com.google.android.gms.internal.ads.ch     // Catch:{ RemoteException -> 0x00a5 }
            r1.<init>(r0)     // Catch:{ RemoteException -> 0x00a5 }
            goto L_0x00ac
        L_0x00a5:
            r0 = move-exception
            java.lang.String r1 = ""
            com.google.android.gms.internal.ads.aai.m1625b(r1, r0)
        L_0x00ab:
            r1 = r5
        L_0x00ac:
            r4.f5332c = r1
            com.google.android.gms.internal.ads.ea r0 = r4.f5330a     // Catch:{ RemoteException -> 0x00c3 }
            com.google.android.gms.internal.ads.bz r0 = r0.mo11605u()     // Catch:{ RemoteException -> 0x00c3 }
            if (r0 == 0) goto L_0x00c9
            com.google.android.gms.internal.ads.cd r0 = new com.google.android.gms.internal.ads.cd     // Catch:{ RemoteException -> 0x00c3 }
            com.google.android.gms.internal.ads.ea r1 = r4.f5330a     // Catch:{ RemoteException -> 0x00c3 }
            com.google.android.gms.internal.ads.bz r1 = r1.mo11605u()     // Catch:{ RemoteException -> 0x00c3 }
            r0.<init>(r1)     // Catch:{ RemoteException -> 0x00c3 }
            r5 = r0
            goto L_0x00c9
        L_0x00c3:
            r0 = move-exception
            java.lang.String r1 = ""
            com.google.android.gms.internal.ads.aai.m1625b(r1, r0)
        L_0x00c9:
            r4.f5334e = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1263ed.<init>(com.google.android.gms.internal.ads.ea):void");
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final C0719a zzhy() {
        try {
            return this.f5330a.mo11601q();
        } catch (RemoteException e) {
            aai.m1625b("", e);
            return null;
        }
    }

    public final Object zzic() {
        try {
            C0719a r = this.f5330a.mo11602r();
            if (r != null) {
                return C0722b.m770a(r);
            }
            return null;
        } catch (RemoteException e) {
            aai.m1625b("", e);
            return null;
        }
    }

    public final void performClick(Bundle bundle) {
        try {
            this.f5330a.mo11584a(bundle);
        } catch (RemoteException e) {
            aai.m1625b("", e);
        }
    }

    public final boolean recordImpression(Bundle bundle) {
        try {
            return this.f5330a.mo11588b(bundle);
        } catch (RemoteException e) {
            aai.m1625b("", e);
            return false;
        }
    }

    public final void reportTouchEvent(Bundle bundle) {
        try {
            this.f5330a.mo11589c(bundle);
        } catch (RemoteException e) {
            aai.m1625b("", e);
        }
    }

    public final String getHeadline() {
        try {
            return this.f5330a.mo11590e();
        } catch (RemoteException e) {
            aai.m1625b("", e);
            return null;
        }
    }

    public final List<NativeAd.Image> getImages() {
        return this.f5331b;
    }

    public final String getBody() {
        try {
            return this.f5330a.mo11593i();
        } catch (RemoteException e) {
            aai.m1625b("", e);
            return null;
        }
    }

    public final NativeAd.Image getIcon() {
        return this.f5332c;
    }

    public final String getCallToAction() {
        try {
            return this.f5330a.mo11595k();
        } catch (RemoteException e) {
            aai.m1625b("", e);
            return null;
        }
    }

    public final Double getStarRating() {
        try {
            double m = this.f5330a.mo11597m();
            if (m == -1.0d) {
                return null;
            }
            return Double.valueOf(m);
        } catch (RemoteException e) {
            aai.m1625b("", e);
            return null;
        }
    }

    public final String getStore() {
        try {
            return this.f5330a.mo11598n();
        } catch (RemoteException e) {
            aai.m1625b("", e);
            return null;
        }
    }

    public final String getPrice() {
        try {
            return this.f5330a.mo11599o();
        } catch (RemoteException e) {
            aai.m1625b("", e);
            return null;
        }
    }

    public final VideoController getVideoController() {
        try {
            if (this.f5330a.mo11600p() != null) {
                this.f5333d.zza(this.f5330a.mo11600p());
            }
        } catch (RemoteException e) {
            aai.m1625b("Exception occurred while getting video controller", e);
        }
        return this.f5333d;
    }

    public final NativeAd.AdChoicesInfo getAdChoicesInfo() {
        return this.f5334e;
    }

    public final String getMediationAdapterClassName() {
        try {
            return this.f5330a.mo11603s();
        } catch (RemoteException e) {
            aai.m1625b("", e);
            return null;
        }
    }

    public final Bundle getExtras() {
        try {
            Bundle t = this.f5330a.mo11604t();
            if (t != null) {
                return t;
            }
        } catch (RemoteException e) {
            aai.m1625b("", e);
        }
        return new Bundle();
    }

    public final void enableCustomClickGesture() {
        try {
            this.f5330a.mo11607w();
        } catch (RemoteException e) {
            aai.m1625b("", e);
        }
    }

    public final void recordCustomClickGesture() {
        try {
            this.f5330a.mo11608x();
        } catch (RemoteException e) {
            aai.m1625b("", e);
        }
    }

    public final List<MuteThisAdReason> getMuteThisAdReasons() {
        return this.f5335f;
    }

    public final boolean isCustomMuteThisAdEnabled() {
        try {
            return this.f5330a.mo11592h();
        } catch (RemoteException e) {
            aai.m1625b("", e);
            return false;
        }
    }

    public final void destroy() {
        try {
            this.f5330a.mo11606v();
        } catch (RemoteException e) {
            aai.m1625b("", e);
        }
    }

    public final void setUnconfirmedClickListener(UnifiedNativeAd.UnconfirmedClickListener unconfirmedClickListener) {
        try {
            this.f5330a.mo11587a((C1256dx) new C1275eo(unconfirmedClickListener));
        } catch (RemoteException e) {
            aai.m1625b("Failed to setUnconfirmedClickListener", e);
        }
    }

    public final void muteThisAd(MuteThisAdReason muteThisAdReason) {
        try {
            if (!isCustomMuteThisAdEnabled()) {
                aai.m1626c("Ad is not custom mute enabled");
            } else if (muteThisAdReason == null) {
                this.f5330a.mo11586a((bsx) null);
            } else if (muteThisAdReason instanceof bta) {
                this.f5330a.mo11586a(((bta) muteThisAdReason).mo12349a());
            } else {
                aai.m1626c("Use mute reason from UnifiedNativeAd.getMuteThisAdReasons() or null");
            }
        } catch (RemoteException e) {
            aai.m1625b("", e);
        }
    }

    public final void setMuteThisAdListener(MuteThisAdListener muteThisAdListener) {
        try {
            this.f5330a.mo11585a((bst) new bsw(muteThisAdListener));
        } catch (RemoteException e) {
            aai.m1625b("", e);
        }
    }

    public final void cancelUnconfirmedClick() {
        try {
            this.f5330a.mo11609y();
        } catch (RemoteException e) {
            aai.m1625b("Failed to cancelUnconfirmedClick", e);
        }
    }

    public final String getAdvertiser() {
        try {
            return this.f5330a.mo11596l();
        } catch (RemoteException e) {
            aai.m1625b("", e);
            return null;
        }
    }
}
