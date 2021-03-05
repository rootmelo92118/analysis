package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zzbv;
import com.google.android.gms.internal.ads.boz;
import javax.annotation.concurrent.GuardedBy;
import org.json.JSONObject;

@C1598qn
/* renamed from: com.google.android.gms.internal.ads.qq */
public final class C1601qq extends C1768wv implements C1616re {

    /* renamed from: a */
    private final C1600qp f6259a;

    /* renamed from: b */
    private final C1624rm f6260b;

    /* renamed from: c */
    private final Object f6261c = new Object();

    /* renamed from: d */
    private final Context f6262d;

    /* renamed from: e */
    private final box f6263e;

    /* renamed from: f */
    private final bpc f6264f;

    /* renamed from: g */
    private zzasi f6265g;

    /* renamed from: h */
    private Runnable f6266h;
    @GuardedBy("mCancelLock")

    /* renamed from: i */
    private boolean f6267i;
    @GuardedBy("mCancelLock")

    /* renamed from: j */
    private C1804yd f6268j;

    /* renamed from: k */
    private zzasm f6269k;

    /* renamed from: l */
    private C1420jy f6270l;

    public C1601qq(Context context, C1624rm rmVar, C1600qp qpVar, bpc bpc) {
        this.f6259a = qpVar;
        this.f6262d = context;
        this.f6260b = rmVar;
        this.f6264f = bpc;
        this.f6263e = new box(this.f6264f);
        this.f6263e.mo12284a((boy) new C1602qr(this));
        bqc bqc = new bqc();
        bqc.f5076a = Integer.valueOf(this.f6260b.f6339j.f7136b);
        bqc.f5077b = Integer.valueOf(this.f6260b.f6339j.f7137c);
        bqc.f5078c = Integer.valueOf(this.f6260b.f6339j.f7138d ? 0 : 2);
        this.f6263e.mo12284a((boy) new C1603qs(bqc));
        if (this.f6260b.f6335f != null) {
            this.f6263e.mo12284a((boy) new C1604qt(this));
        }
        zzwf zzwf = this.f6260b.f6332c;
        if (zzwf.f7295d && "interstitial_mb".equals(zzwf.f7292a)) {
            this.f6263e.mo12284a(C1605qu.f6274a);
        } else if (zzwf.f7295d && "reward_mb".equals(zzwf.f7292a)) {
            this.f6263e.mo12284a(C1606qv.f6275a);
        } else if (zzwf.f7299h || zzwf.f7295d) {
            this.f6263e.mo12284a(C1608qx.f6277a);
        } else {
            this.f6263e.mo12284a(C1607qw.f6276a);
        }
        this.f6263e.mo12285a(boz.C1142a.C1144b.AD_REQUEST);
    }

    public final void zzki() {
        String string;
        C1772wz.m1624b("AdLoaderBackgroundTask started.");
        this.f6266h = new C1609qy(this);
        C1782xi.f6838a.postDelayed(this.f6266h, ((Long) bre.m6321e().mo12778a(C1557p.f5973bb)).longValue());
        long b = zzbv.zzlm().mo9997b();
        if (this.f6260b.f6331b.f7273c == null || (string = this.f6260b.f6331b.f7273c.getString("_ad")) == null) {
            abw abw = new abw();
            C1780xg.m8353a((Runnable) new C1610qz(this, abw));
            this.f6265g = new zzasi(this.f6260b, b, zzbv.zzmf().mo13078c(this.f6262d), zzbv.zzmf().mo13080d(this.f6262d), zzbv.zzmf().mo13082e(this.f6262d), zzbv.zzmf().mo13084f(this.f6262d));
            abw.mo10094a(this.f6265g);
            return;
        }
        this.f6265g = new zzasi(this.f6260b, b, (String) null, (String) null, (String) null, (String) null);
        mo12906a(C1659su.m7888a(this.f6262d, this.f6265g, string));
    }

    /* renamed from: a */
    private final void m7810a(int i, String str) {
        zzasi zzasi;
        int i2 = i;
        if (i2 == 3 || i2 == -1) {
            C1772wz.m1628d(str);
        } else {
            C1772wz.m1630e(str);
        }
        if (this.f6269k == null) {
            this.f6269k = new zzasm(i2);
        } else {
            this.f6269k = new zzasm(i2, this.f6269k.f7091j);
        }
        if (this.f6265g != null) {
            zzasi = this.f6265g;
        } else {
            zzasi = new zzasi(this.f6260b, -1, (String) null, (String) null, (String) null, (String) null);
        }
        this.f6259a.zza(new C1753wg(zzasi, this.f6269k, this.f6270l, (zzwf) null, i, -1, this.f6269k.f7094m, (JSONObject) null, this.f6263e, (Boolean) null));
    }

    /* JADX WARNING: Removed duplicated region for block: B:63:0x0195  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x01ba  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x01da  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo12906a(@android.support.annotation.NonNull com.google.android.gms.internal.ads.zzasm r14) {
        /*
            r13 = this;
            java.lang.String r0 = "Received ad response."
            com.google.android.gms.internal.ads.C1772wz.m1624b(r0)
            r13.f6269k = r14
            com.google.android.gms.internal.ads.zzasm r14 = r13.f6269k
            java.lang.String r14 = r14.f7076U
            boolean r0 = android.text.TextUtils.isEmpty(r14)
            if (r0 != 0) goto L_0x001a
            com.google.android.gms.internal.ads.vv r0 = com.google.android.gms.ads.internal.zzbv.zzmf()
            android.content.Context r1 = r13.f6262d
            r0.mo13085f(r1, r14)
        L_0x001a:
            com.google.android.gms.common.util.e r14 = com.google.android.gms.ads.internal.zzbv.zzlm()
            long r6 = r14.mo9997b()
            java.lang.Object r14 = r13.f6261c
            monitor-enter(r14)
            r0 = 0
            r13.f6268j = r0     // Catch:{ all -> 0x022d }
            monitor-exit(r14)     // Catch:{ all -> 0x022d }
            com.google.android.gms.internal.ads.wk r14 = com.google.android.gms.ads.internal.zzbv.zzlj()
            com.google.android.gms.internal.ads.xc r14 = r14.mo13131k()
            com.google.android.gms.internal.ads.zzasm r1 = r13.f6269k
            boolean r1 = r1.f7061F
            r14.mo13180d((boolean) r1)
            com.google.android.gms.internal.ads.e<java.lang.Boolean> r14 = com.google.android.gms.internal.ads.C1557p.f5895aC
            com.google.android.gms.internal.ads.m r1 = com.google.android.gms.internal.ads.bre.m6321e()
            java.lang.Object r14 = r1.mo12778a(r14)
            java.lang.Boolean r14 = (java.lang.Boolean) r14
            boolean r14 = r14.booleanValue()
            if (r14 == 0) goto L_0x006f
            com.google.android.gms.internal.ads.zzasm r14 = r13.f6269k
            boolean r14 = r14.f7069N
            if (r14 == 0) goto L_0x0060
            com.google.android.gms.internal.ads.wk r14 = com.google.android.gms.ads.internal.zzbv.zzlj()
            com.google.android.gms.internal.ads.xc r14 = r14.mo13131k()
            com.google.android.gms.internal.ads.zzasi r1 = r13.f6265g
            java.lang.String r1 = r1.f7034e
            r14.mo13177c((java.lang.String) r1)
            goto L_0x006f
        L_0x0060:
            com.google.android.gms.internal.ads.wk r14 = com.google.android.gms.ads.internal.zzbv.zzlj()
            com.google.android.gms.internal.ads.xc r14 = r14.mo13131k()
            com.google.android.gms.internal.ads.zzasi r1 = r13.f6265g
            java.lang.String r1 = r1.f7034e
            r14.mo13179d((java.lang.String) r1)
        L_0x006f:
            com.google.android.gms.internal.ads.zzasm r14 = r13.f6269k     // Catch:{ ra -> 0x0219 }
            int r14 = r14.f7085d     // Catch:{ ra -> 0x0219 }
            r1 = -2
            r2 = -3
            if (r14 == r1) goto L_0x009f
            com.google.android.gms.internal.ads.zzasm r14 = r13.f6269k     // Catch:{ ra -> 0x0219 }
            int r14 = r14.f7085d     // Catch:{ ra -> 0x0219 }
            if (r14 != r2) goto L_0x007e
            goto L_0x009f
        L_0x007e:
            com.google.android.gms.internal.ads.ra r14 = new com.google.android.gms.internal.ads.ra     // Catch:{ ra -> 0x0219 }
            com.google.android.gms.internal.ads.zzasm r0 = r13.f6269k     // Catch:{ ra -> 0x0219 }
            int r0 = r0.f7085d     // Catch:{ ra -> 0x0219 }
            r1 = 66
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ ra -> 0x0219 }
            r2.<init>(r1)     // Catch:{ ra -> 0x0219 }
            java.lang.String r1 = "There was a problem getting an ad response. ErrorCode: "
            r2.append(r1)     // Catch:{ ra -> 0x0219 }
            r2.append(r0)     // Catch:{ ra -> 0x0219 }
            java.lang.String r0 = r2.toString()     // Catch:{ ra -> 0x0219 }
            com.google.android.gms.internal.ads.zzasm r1 = r13.f6269k     // Catch:{ ra -> 0x0219 }
            int r1 = r1.f7085d     // Catch:{ ra -> 0x0219 }
            r14.<init>(r0, r1)     // Catch:{ ra -> 0x0219 }
            throw r14     // Catch:{ ra -> 0x0219 }
        L_0x009f:
            com.google.android.gms.internal.ads.zzasm r14 = r13.f6269k     // Catch:{ ra -> 0x0219 }
            int r14 = r14.f7085d     // Catch:{ ra -> 0x0219 }
            r1 = 0
            if (r14 == r2) goto L_0x013c
            com.google.android.gms.internal.ads.zzasm r14 = r13.f6269k     // Catch:{ ra -> 0x0219 }
            java.lang.String r14 = r14.f7083b     // Catch:{ ra -> 0x0219 }
            boolean r14 = android.text.TextUtils.isEmpty(r14)     // Catch:{ ra -> 0x0219 }
            if (r14 != 0) goto L_0x0133
            com.google.android.gms.internal.ads.wk r14 = com.google.android.gms.ads.internal.zzbv.zzlj()     // Catch:{ ra -> 0x0219 }
            com.google.android.gms.internal.ads.xc r14 = r14.mo13131k()     // Catch:{ ra -> 0x0219 }
            com.google.android.gms.internal.ads.zzasm r2 = r13.f6269k     // Catch:{ ra -> 0x0219 }
            boolean r2 = r2.f7101t     // Catch:{ ra -> 0x0219 }
            r14.mo13169a((boolean) r2)     // Catch:{ ra -> 0x0219 }
            com.google.android.gms.internal.ads.zzasm r14 = r13.f6269k     // Catch:{ ra -> 0x0219 }
            boolean r14 = r14.f7088g     // Catch:{ ra -> 0x0219 }
            if (r14 == 0) goto L_0x0103
            com.google.android.gms.internal.ads.jy r14 = new com.google.android.gms.internal.ads.jy     // Catch:{ JSONException -> 0x00dc }
            com.google.android.gms.internal.ads.zzasm r2 = r13.f6269k     // Catch:{ JSONException -> 0x00dc }
            java.lang.String r2 = r2.f7083b     // Catch:{ JSONException -> 0x00dc }
            r14.<init>((java.lang.String) r2)     // Catch:{ JSONException -> 0x00dc }
            r13.f6270l = r14     // Catch:{ JSONException -> 0x00dc }
            com.google.android.gms.internal.ads.wk r14 = com.google.android.gms.ads.internal.zzbv.zzlj()     // Catch:{ JSONException -> 0x00dc }
            com.google.android.gms.internal.ads.jy r2 = r13.f6270l     // Catch:{ JSONException -> 0x00dc }
            boolean r2 = r2.f5573h     // Catch:{ JSONException -> 0x00dc }
            r14.mo13120a((boolean) r2)     // Catch:{ JSONException -> 0x00dc }
            goto L_0x010e
        L_0x00dc:
            r14 = move-exception
            java.lang.String r0 = "Could not parse mediation config."
            com.google.android.gms.internal.ads.C1772wz.m1625b(r0, r14)     // Catch:{ ra -> 0x0219 }
            com.google.android.gms.internal.ads.ra r14 = new com.google.android.gms.internal.ads.ra     // Catch:{ ra -> 0x0219 }
            java.lang.String r0 = "Could not parse mediation config: "
            com.google.android.gms.internal.ads.zzasm r2 = r13.f6269k     // Catch:{ ra -> 0x0219 }
            java.lang.String r2 = r2.f7083b     // Catch:{ ra -> 0x0219 }
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch:{ ra -> 0x0219 }
            int r3 = r2.length()     // Catch:{ ra -> 0x0219 }
            if (r3 == 0) goto L_0x00f9
            java.lang.String r0 = r0.concat(r2)     // Catch:{ ra -> 0x0219 }
            goto L_0x00ff
        L_0x00f9:
            java.lang.String r2 = new java.lang.String     // Catch:{ ra -> 0x0219 }
            r2.<init>(r0)     // Catch:{ ra -> 0x0219 }
            r0 = r2
        L_0x00ff:
            r14.<init>(r0, r1)     // Catch:{ ra -> 0x0219 }
            throw r14     // Catch:{ ra -> 0x0219 }
        L_0x0103:
            com.google.android.gms.internal.ads.wk r14 = com.google.android.gms.ads.internal.zzbv.zzlj()     // Catch:{ ra -> 0x0219 }
            com.google.android.gms.internal.ads.zzasm r2 = r13.f6269k     // Catch:{ ra -> 0x0219 }
            boolean r2 = r2.f7064I     // Catch:{ ra -> 0x0219 }
            r14.mo13120a((boolean) r2)     // Catch:{ ra -> 0x0219 }
        L_0x010e:
            com.google.android.gms.internal.ads.zzasm r14 = r13.f6269k     // Catch:{ ra -> 0x0219 }
            java.lang.String r14 = r14.f7062G     // Catch:{ ra -> 0x0219 }
            boolean r14 = android.text.TextUtils.isEmpty(r14)     // Catch:{ ra -> 0x0219 }
            if (r14 != 0) goto L_0x013c
            java.lang.String r14 = "Received cookie from server. Setting webview cookie in CookieManager."
            com.google.android.gms.internal.ads.C1772wz.m1624b(r14)     // Catch:{ ra -> 0x0219 }
            com.google.android.gms.internal.ads.xq r14 = com.google.android.gms.ads.internal.zzbv.zzlh()     // Catch:{ ra -> 0x0219 }
            android.content.Context r2 = r13.f6262d     // Catch:{ ra -> 0x0219 }
            android.webkit.CookieManager r14 = r14.mo13239c((android.content.Context) r2)     // Catch:{ ra -> 0x0219 }
            if (r14 == 0) goto L_0x013c
            java.lang.String r2 = "googleads.g.doubleclick.net"
            com.google.android.gms.internal.ads.zzasm r3 = r13.f6269k     // Catch:{ ra -> 0x0219 }
            java.lang.String r3 = r3.f7062G     // Catch:{ ra -> 0x0219 }
            r14.setCookie(r2, r3)     // Catch:{ ra -> 0x0219 }
            goto L_0x013c
        L_0x0133:
            com.google.android.gms.internal.ads.ra r14 = new com.google.android.gms.internal.ads.ra     // Catch:{ ra -> 0x0219 }
            java.lang.String r0 = "No fill from ad server."
            r1 = 3
            r14.<init>(r0, r1)     // Catch:{ ra -> 0x0219 }
            throw r14     // Catch:{ ra -> 0x0219 }
        L_0x013c:
            com.google.android.gms.internal.ads.zzasi r14 = r13.f6265g     // Catch:{ ra -> 0x0219 }
            com.google.android.gms.internal.ads.zzwf r14 = r14.f7033d     // Catch:{ ra -> 0x0219 }
            com.google.android.gms.internal.ads.zzwf[] r14 = r14.f7298g     // Catch:{ ra -> 0x0219 }
            if (r14 == 0) goto L_0x014c
            com.google.android.gms.internal.ads.zzasi r14 = r13.f6265g     // Catch:{ ra -> 0x0219 }
            com.google.android.gms.internal.ads.zzwf r14 = r13.m7809a((com.google.android.gms.internal.ads.zzasi) r14)     // Catch:{ ra -> 0x0219 }
            r4 = r14
            goto L_0x014d
        L_0x014c:
            r4 = r0
        L_0x014d:
            com.google.android.gms.internal.ads.wk r14 = com.google.android.gms.ads.internal.zzbv.zzlj()
            com.google.android.gms.internal.ads.xc r14 = r14.mo13131k()
            com.google.android.gms.internal.ads.zzasm r2 = r13.f6269k
            boolean r2 = r2.f7102u
            r14.mo13174b((boolean) r2)
            com.google.android.gms.internal.ads.wk r14 = com.google.android.gms.ads.internal.zzbv.zzlj()
            com.google.android.gms.internal.ads.xc r14 = r14.mo13131k()
            com.google.android.gms.internal.ads.zzasm r2 = r13.f6269k
            boolean r2 = r2.f7068M
            r14.mo13178c((boolean) r2)
            com.google.android.gms.internal.ads.zzasm r14 = r13.f6269k
            java.lang.String r14 = r14.f7098q
            boolean r14 = android.text.TextUtils.isEmpty(r14)
            if (r14 != 0) goto L_0x0186
            org.json.JSONObject r14 = new org.json.JSONObject     // Catch:{ Exception -> 0x0180 }
            com.google.android.gms.internal.ads.zzasm r2 = r13.f6269k     // Catch:{ Exception -> 0x0180 }
            java.lang.String r2 = r2.f7098q     // Catch:{ Exception -> 0x0180 }
            r14.<init>(r2)     // Catch:{ Exception -> 0x0180 }
            r10 = r14
            goto L_0x0187
        L_0x0180:
            r14 = move-exception
            java.lang.String r2 = "Error parsing the JSON for Active View."
            com.google.android.gms.internal.ads.C1772wz.m1625b(r2, r14)
        L_0x0186:
            r10 = r0
        L_0x0187:
            com.google.android.gms.internal.ads.zzasi r14 = r13.f6265g
            com.google.android.gms.internal.ads.zzwb r14 = r14.f7032c
            android.os.Bundle r14 = r14.f7283m
            com.google.android.gms.internal.ads.zzasm r2 = r13.f6269k
            int r2 = r2.f7071P
            r3 = 2
            r5 = 1
            if (r2 != r3) goto L_0x01ba
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r5)
            java.lang.Class<com.google.ads.mediation.admob.AdMobAdapter> r1 = com.google.ads.mediation.admob.AdMobAdapter.class
            java.lang.String r1 = r1.getName()
            android.os.Bundle r1 = r14.getBundle(r1)
            if (r1 != 0) goto L_0x01b3
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            java.lang.Class<com.google.ads.mediation.admob.AdMobAdapter> r2 = com.google.ads.mediation.admob.AdMobAdapter.class
            java.lang.String r2 = r2.getName()
            r14.putBundle(r2, r1)
        L_0x01b3:
            java.lang.String r2 = "render_test_ad_label"
            r1.putBoolean(r2, r5)
        L_0x01b8:
            r12 = r0
            goto L_0x01d4
        L_0x01ba:
            com.google.android.gms.internal.ads.zzasm r2 = r13.f6269k
            int r2 = r2.f7071P
            if (r2 != r5) goto L_0x01c5
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            goto L_0x01b8
        L_0x01c5:
            com.google.android.gms.internal.ads.zzasm r1 = r13.f6269k
            int r1 = r1.f7071P
            if (r1 != 0) goto L_0x01b8
            boolean r0 = com.google.android.gms.internal.ads.C1843zp.m8565a(r14)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            goto L_0x01b8
        L_0x01d4:
            com.google.android.gms.internal.ads.zzasm r0 = r13.f6269k
            boolean r0 = r0.f7077V
            if (r0 == 0) goto L_0x01f9
            java.lang.Class<com.google.ads.mediation.admob.AdMobAdapter> r0 = com.google.ads.mediation.admob.AdMobAdapter.class
            java.lang.String r0 = r0.getName()
            android.os.Bundle r0 = r14.getBundle(r0)
            if (r0 != 0) goto L_0x01f4
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            java.lang.Class<com.google.ads.mediation.admob.AdMobAdapter> r1 = com.google.ads.mediation.admob.AdMobAdapter.class
            java.lang.String r1 = r1.getName()
            r14.putBundle(r1, r0)
        L_0x01f4:
            java.lang.String r14 = "is_analytics_logging_enabled"
            r0.putBoolean(r14, r5)
        L_0x01f9:
            com.google.android.gms.internal.ads.wg r14 = new com.google.android.gms.internal.ads.wg
            com.google.android.gms.internal.ads.zzasi r1 = r13.f6265g
            com.google.android.gms.internal.ads.zzasm r2 = r13.f6269k
            com.google.android.gms.internal.ads.jy r3 = r13.f6270l
            r5 = -2
            com.google.android.gms.internal.ads.zzasm r0 = r13.f6269k
            long r8 = r0.f7094m
            com.google.android.gms.internal.ads.box r11 = r13.f6263e
            r0 = r14
            r0.<init>(r1, r2, r3, r4, r5, r6, r8, r10, r11, r12)
            com.google.android.gms.internal.ads.qp r0 = r13.f6259a
            r0.zza(r14)
            android.os.Handler r14 = com.google.android.gms.internal.ads.C1782xi.f6838a
            java.lang.Runnable r0 = r13.f6266h
            r14.removeCallbacks(r0)
            return
        L_0x0219:
            r14 = move-exception
            int r0 = r14.mo12914a()
            java.lang.String r14 = r14.getMessage()
            r13.m7810a(r0, r14)
            android.os.Handler r14 = com.google.android.gms.internal.ads.C1782xi.f6838a
            java.lang.Runnable r0 = r13.f6266h
            r14.removeCallbacks(r0)
            return
        L_0x022d:
            r0 = move-exception
            monitor-exit(r14)     // Catch:{ all -> 0x022d }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1601qq.mo12906a(com.google.android.gms.internal.ads.zzasm):void");
    }

    public final void onStop() {
        synchronized (this.f6261c) {
            if (this.f6268j != null) {
                this.f6268j.cancel();
            }
        }
    }

    /* renamed from: a */
    private final zzwf m7809a(zzasi zzasi) {
        int i;
        if (((this.f6265g == null || this.f6265g.f7018V == null || this.f6265g.f7018V.size() <= 1) ? false : true) && this.f6270l != null && !this.f6270l.f5586u) {
            return null;
        }
        if (this.f6269k.f7106y) {
            for (zzwf zzwf : zzasi.f7033d.f7298g) {
                if (zzwf.f7300i) {
                    return new zzwf(zzwf, zzasi.f7033d.f7298g);
                }
            }
        }
        if (this.f6269k.f7093l != null) {
            String[] split = this.f6269k.f7093l.split("x");
            if (split.length != 2) {
                String valueOf = String.valueOf(this.f6269k.f7093l);
                throw new C1612ra(valueOf.length() != 0 ? "Invalid ad size format from the ad response: ".concat(valueOf) : new String("Invalid ad size format from the ad response: "), 0);
            }
            try {
                int parseInt = Integer.parseInt(split[0]);
                int parseInt2 = Integer.parseInt(split[1]);
                for (zzwf zzwf2 : zzasi.f7033d.f7298g) {
                    float f = this.f6262d.getResources().getDisplayMetrics().density;
                    int i2 = zzwf2.f7296e == -1 ? (int) (((float) zzwf2.f7297f) / f) : zzwf2.f7296e;
                    if (zzwf2.f7293b == -2) {
                        i = (int) (((float) zzwf2.f7294c) / f);
                    } else {
                        i = zzwf2.f7293b;
                    }
                    if (parseInt == i2 && parseInt2 == i && !zzwf2.f7300i) {
                        return new zzwf(zzwf2, zzasi.f7033d.f7298g);
                    }
                }
                String valueOf2 = String.valueOf(this.f6269k.f7093l);
                throw new C1612ra(valueOf2.length() != 0 ? "The ad size from the ad response was not one of the requested sizes: ".concat(valueOf2) : new String("The ad size from the ad response was not one of the requested sizes: "), 0);
            } catch (NumberFormatException unused) {
                String valueOf3 = String.valueOf(this.f6269k.f7093l);
                throw new C1612ra(valueOf3.length() != 0 ? "Invalid ad size number from the ad response: ".concat(valueOf3) : new String("Invalid ad size number from the ad response: "), 0);
            }
        } else {
            throw new C1612ra("The ad response must specify one of the supported ad sizes.", 0);
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x005f, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ void mo12904a(com.google.android.gms.internal.ads.abs r5) {
        /*
            r4 = this;
            java.lang.Object r0 = r4.f6261c
            monitor-enter(r0)
            boolean r1 = r4.f6267i     // Catch:{ all -> 0x0060 }
            if (r1 == 0) goto L_0x000e
            java.lang.String r5 = "Request task was already canceled"
            com.google.android.gms.internal.ads.C1772wz.m1630e(r5)     // Catch:{ all -> 0x0060 }
            monitor-exit(r0)     // Catch:{ all -> 0x0060 }
            return
        L_0x000e:
            com.google.android.gms.internal.ads.rm r1 = r4.f6260b     // Catch:{ all -> 0x0060 }
            com.google.android.gms.internal.ads.zzbbi r1 = r1.f6339j     // Catch:{ all -> 0x0060 }
            android.content.Context r2 = r4.f6262d     // Catch:{ all -> 0x0060 }
            com.google.android.gms.internal.ads.rc r3 = new com.google.android.gms.internal.ads.rc     // Catch:{ all -> 0x0060 }
            r3.<init>(r2)     // Catch:{ all -> 0x0060 }
            boolean r3 = r3.mo12915a(r1)     // Catch:{ all -> 0x0060 }
            if (r3 == 0) goto L_0x002d
            java.lang.String r1 = "Fetching ad response from local ad request service."
            com.google.android.gms.internal.ads.C1772wz.m1624b(r1)     // Catch:{ all -> 0x0060 }
            com.google.android.gms.internal.ads.rj r1 = new com.google.android.gms.internal.ads.rj     // Catch:{ all -> 0x0060 }
            r1.<init>(r2, r5, r4)     // Catch:{ all -> 0x0060 }
            r1.zzwa()     // Catch:{ all -> 0x0060 }
            goto L_0x004b
        L_0x002d:
            java.lang.String r3 = "Fetching ad response from remote ad request service."
            com.google.android.gms.internal.ads.C1772wz.m1624b(r3)     // Catch:{ all -> 0x0060 }
            com.google.android.gms.internal.ads.bre.m6317a()     // Catch:{ all -> 0x0060 }
            r3 = 12451000(0xbdfcb8, float:1.7447567E-38)
            boolean r3 = com.google.android.gms.internal.ads.C1851zx.m8599c(r2, r3)     // Catch:{ all -> 0x0060 }
            if (r3 != 0) goto L_0x0045
            java.lang.String r5 = "Failed to connect to remote ad request service."
            com.google.android.gms.internal.ads.C1772wz.m1630e(r5)     // Catch:{ all -> 0x0060 }
            r1 = 0
            goto L_0x004b
        L_0x0045:
            com.google.android.gms.internal.ads.rk r3 = new com.google.android.gms.internal.ads.rk     // Catch:{ all -> 0x0060 }
            r3.<init>(r2, r1, r5, r4)     // Catch:{ all -> 0x0060 }
            r1 = r3
        L_0x004b:
            r4.f6268j = r1     // Catch:{ all -> 0x0060 }
            com.google.android.gms.internal.ads.yd r5 = r4.f6268j     // Catch:{ all -> 0x0060 }
            if (r5 != 0) goto L_0x005e
            r5 = 0
            java.lang.String r1 = "Could not start the ad request service."
            r4.m7810a(r5, r1)     // Catch:{ all -> 0x0060 }
            android.os.Handler r5 = com.google.android.gms.internal.ads.C1782xi.f6838a     // Catch:{ all -> 0x0060 }
            java.lang.Runnable r1 = r4.f6266h     // Catch:{ all -> 0x0060 }
            r5.removeCallbacks(r1)     // Catch:{ all -> 0x0060 }
        L_0x005e:
            monitor-exit(r0)     // Catch:{ all -> 0x0060 }
            return
        L_0x0060:
            r5 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0060 }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1601qq.mo12904a(com.google.android.gms.internal.ads.abs):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void mo12903a() {
        synchronized (this.f6261c) {
            this.f6267i = true;
            if (this.f6268j != null) {
                onStop();
            }
            m7810a(2, "Timed out waiting for ad response.");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void mo12905a(bqb bqb) {
        bqb.f5068c.f5052a = this.f6260b.f6335f.packageName;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final /* synthetic */ void mo12907b(bqb bqb) {
        bqb.f5066a = this.f6260b.f6351v;
    }
}
