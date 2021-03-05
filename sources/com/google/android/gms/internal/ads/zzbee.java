package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.net.Uri;
import android.view.Surface;
import android.view.TextureView;
import com.google.android.gms.ads.internal.zzbv;
import java.nio.ByteBuffer;

@TargetApi(16)
@C1598qn
public final class zzbee extends zzbdi implements TextureView.SurfaceTextureListener, aec {

    /* renamed from: c */
    private final adc f7174c;

    /* renamed from: d */
    private final ade f7175d;

    /* renamed from: e */
    private final boolean f7176e;

    /* renamed from: f */
    private final adb f7177f;

    /* renamed from: g */
    private acm f7178g;

    /* renamed from: h */
    private Surface f7179h;

    /* renamed from: i */
    private adv f7180i;

    /* renamed from: j */
    private String f7181j;

    /* renamed from: k */
    private boolean f7182k;

    /* renamed from: l */
    private int f7183l = 1;

    /* renamed from: m */
    private ada f7184m;

    /* renamed from: n */
    private final boolean f7185n;

    /* renamed from: o */
    private boolean f7186o;

    /* renamed from: p */
    private boolean f7187p;

    /* renamed from: q */
    private int f7188q;

    /* renamed from: r */
    private int f7189r;

    /* renamed from: s */
    private int f7190s;

    /* renamed from: t */
    private int f7191t;

    /* renamed from: u */
    private float f7192u;

    public zzbee(Context context, ade ade, adc adc, boolean z, boolean z2, adb adb) {
        super(context);
        this.f7176e = z2;
        this.f7174c = adc;
        this.f7175d = ade;
        this.f7185n = z;
        this.f7177f = adb;
        setSurfaceTextureListener(this);
        this.f7175d.mo10186a(this);
    }

    /* renamed from: l */
    private final adv m8683l() {
        return new adv(this.f7174c.getContext(), this.f7177f);
    }

    /* renamed from: m */
    private final String m8684m() {
        return zzbv.zzlf().mo13207b(this.f7174c.getContext(), this.f7174c.mo10180i().f7135a);
    }

    /* renamed from: n */
    private final boolean m8685n() {
        return this.f7180i != null && !this.f7182k;
    }

    /* renamed from: o */
    private final boolean m8686o() {
        return m8685n() && this.f7183l != 1;
    }

    /* renamed from: p */
    private final void m8687p() {
        if (this.f7180i == null && this.f7181j != null && this.f7179h != null) {
            if (this.f7181j.startsWith("cache:")) {
                aeo a = this.f7174c.mo10167a(this.f7181j);
                if (a instanceof afa) {
                    this.f7180i = ((afa) a).mo10309c();
                } else if (a instanceof aez) {
                    aez aez = (aez) a;
                    String m = m8684m();
                    ByteBuffer e = aez.mo10308e();
                    boolean d = aez.mo10307d();
                    String c = aez.mo10306c();
                    if (c == null) {
                        C1772wz.m1630e("Stream cache URL is null.");
                        return;
                    } else {
                        this.f7180i = m8683l();
                        this.f7180i.mo10234a(Uri.parse(c), m, e, d);
                    }
                } else {
                    String valueOf = String.valueOf(this.f7181j);
                    C1772wz.m1630e(valueOf.length() != 0 ? "Stream cache miss: ".concat(valueOf) : new String("Stream cache miss: "));
                    return;
                }
            } else {
                this.f7180i = m8683l();
                this.f7180i.mo10233a(Uri.parse(this.f7181j), m8684m());
            }
            this.f7180i.mo10237a((aec) this);
            m8682a(this.f7179h, false);
            this.f7183l = this.f7180i.mo10227a().mo11473a();
            if (this.f7183l == 3) {
                m8688q();
            }
        }
    }

    /* renamed from: a */
    private final void m8682a(Surface surface, boolean z) {
        if (this.f7180i != null) {
            this.f7180i.mo10236a(surface, z);
        } else {
            C1772wz.m1630e("Trying to set surface before player is initalized.");
        }
    }

    /* renamed from: a */
    private final void m8681a(float f, boolean z) {
        if (this.f7180i != null) {
            this.f7180i.mo10230a(f, z);
        } else {
            C1772wz.m1630e("Trying to set volume before player is initalized.");
        }
    }

    /* renamed from: e */
    public final void mo10200e() {
        m8681a(this.f7157b.mo10194a(), false);
    }

    /* renamed from: q */
    private final void m8688q() {
        if (!this.f7186o) {
            this.f7186o = true;
            C1782xi.f6838a.post(new adi(this));
            mo10200e();
            this.f7175d.mo10185a();
            if (this.f7187p) {
                mo13331c();
            }
        }
    }

    /* renamed from: a */
    public final String mo13325a() {
        String valueOf = String.valueOf("ExoPlayer/3");
        String valueOf2 = String.valueOf(this.f7185n ? " spherical" : "");
        return valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
    }

    /* renamed from: a */
    public final void mo13328a(acm acm) {
        this.f7178g = acm;
    }

    public final void setVideoPath(String str) {
        if (str != null) {
            this.f7181j = str;
            m8687p();
        }
    }

    /* renamed from: c */
    public final void mo13331c() {
        if (m8686o()) {
            if (this.f7177f.f1406a) {
                m8690s();
            }
            this.f7180i.mo10227a().mo11477a(true);
            this.f7175d.mo10189c();
            this.f7157b.mo10197b();
            this.f7156a.mo10138a();
            C1782xi.f6838a.post(new adl(this));
            return;
        }
        this.f7187p = true;
    }

    /* renamed from: b */
    public final void mo13329b() {
        if (m8685n()) {
            this.f7180i.mo10227a().mo11482c();
            if (this.f7180i != null) {
                m8682a((Surface) null, true);
                if (this.f7180i != null) {
                    this.f7180i.mo10237a((aec) null);
                    this.f7180i.mo10255e();
                    this.f7180i = null;
                }
                this.f7183l = 1;
                this.f7182k = false;
                this.f7186o = false;
                this.f7187p = false;
            }
        }
        this.f7175d.mo10190d();
        this.f7157b.mo10198c();
        this.f7175d.mo10187b();
    }

    /* renamed from: d */
    public final void mo13332d() {
        if (m8686o()) {
            if (this.f7177f.f1406a) {
                m8691t();
            }
            this.f7180i.mo10227a().mo11477a(false);
            this.f7175d.mo10190d();
            this.f7157b.mo10198c();
            C1782xi.f6838a.post(new adm(this));
        }
    }

    /* renamed from: a */
    public final void mo13327a(int i) {
        if (m8686o()) {
            this.f7180i.mo10227a().mo11474a((long) i);
        }
    }

    /* renamed from: c */
    public final void mo13351c(int i) {
        if (this.f7180i != null) {
            this.f7180i.mo10254d().mo10217a(i);
        }
    }

    /* renamed from: d */
    public final void mo13352d(int i) {
        if (this.f7180i != null) {
            this.f7180i.mo10254d().mo10222b(i);
        }
    }

    /* renamed from: e */
    public final void mo13353e(int i) {
        if (this.f7180i != null) {
            this.f7180i.mo10254d().mo10224c(i);
        }
    }

    /* renamed from: f */
    public final void mo13354f(int i) {
        if (this.f7180i != null) {
            this.f7180i.mo10254d().mo10226d(i);
        }
    }

    /* renamed from: a */
    public final void mo13326a(float f, float f2) {
        if (this.f7184m != null) {
            this.f7184m.mo10159a(f, f2);
        }
    }

    public final int getCurrentPosition() {
        if (m8686o()) {
            return (int) this.f7180i.mo10227a().mo11486g();
        }
        return 0;
    }

    public final int getDuration() {
        if (m8686o()) {
            return (int) this.f7180i.mo10227a().mo11485f();
        }
        return 0;
    }

    public final int getVideoWidth() {
        return this.f7188q;
    }

    public final int getVideoHeight() {
        return this.f7189r;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0086 A[LOOP:0: B:32:0x0086->B:37:0x00a1, LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onMeasure(int r11, int r12) {
        /*
            r10 = this;
            super.onMeasure(r11, r12)
            int r11 = r10.getMeasuredWidth()
            int r12 = r10.getMeasuredHeight()
            float r0 = r10.f7192u
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0030
            com.google.android.gms.internal.ads.ada r0 = r10.f7184m
            if (r0 != 0) goto L_0x0030
            float r0 = (float) r11
            float r2 = (float) r12
            float r2 = r0 / r2
            float r3 = r10.f7192u
            int r3 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r3 <= 0) goto L_0x0024
            float r12 = r10.f7192u
            float r0 = r0 / r12
            int r12 = (int) r0
        L_0x0024:
            float r0 = r10.f7192u
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 >= 0) goto L_0x0030
            float r11 = (float) r12
            float r0 = r10.f7192u
            float r11 = r11 * r0
            int r11 = (int) r11
        L_0x0030:
            r10.setMeasuredDimension(r11, r12)
            com.google.android.gms.internal.ads.ada r0 = r10.f7184m
            if (r0 == 0) goto L_0x003c
            com.google.android.gms.internal.ads.ada r0 = r10.f7184m
            r0.mo10160a((int) r11, (int) r12)
        L_0x003c:
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = 16
            if (r0 != r2) goto L_0x00ae
            int r0 = r10.f7190s
            if (r0 <= 0) goto L_0x004a
            int r0 = r10.f7190s
            if (r0 != r11) goto L_0x0052
        L_0x004a:
            int r0 = r10.f7191t
            if (r0 <= 0) goto L_0x00aa
            int r0 = r10.f7191t
            if (r0 == r12) goto L_0x00aa
        L_0x0052:
            boolean r0 = r10.f7176e
            if (r0 == 0) goto L_0x00aa
            boolean r0 = r10.m8685n()
            if (r0 == 0) goto L_0x00aa
            com.google.android.gms.internal.ads.adv r0 = r10.f7180i
            com.google.android.gms.internal.ads.azn r0 = r0.mo10227a()
            long r2 = r0.mo11486g()
            r4 = 0
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 <= 0) goto L_0x00aa
            boolean r2 = r0.mo11481b()
            if (r2 == 0) goto L_0x0073
            goto L_0x00aa
        L_0x0073:
            r2 = 1
            r10.m8681a((float) r1, (boolean) r2)
            r0.mo11477a((boolean) r2)
            long r1 = r0.mo11486g()
            com.google.android.gms.common.util.e r3 = com.google.android.gms.ads.internal.zzbv.zzlm()
            long r3 = r3.mo9996a()
        L_0x0086:
            boolean r5 = r10.m8685n()
            if (r5 == 0) goto L_0x00a3
            long r5 = r0.mo11486g()
            int r7 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r7 != 0) goto L_0x00a3
            com.google.android.gms.common.util.e r5 = com.google.android.gms.ads.internal.zzbv.zzlm()
            long r5 = r5.mo9996a()
            long r5 = r5 - r3
            r7 = 250(0xfa, double:1.235E-321)
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 <= 0) goto L_0x0086
        L_0x00a3:
            r1 = 0
            r0.mo11477a((boolean) r1)
            r10.mo10200e()
        L_0x00aa:
            r10.f7190s = r11
            r10.f7191t = r12
        L_0x00ae:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbee.onMeasure(int, int):void");
    }

    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        if (this.f7185n) {
            this.f7184m = new ada(getContext());
            this.f7184m.mo10161a(surfaceTexture, i, i2);
            this.f7184m.start();
            SurfaceTexture c = this.f7184m.mo10163c();
            if (c != null) {
                surfaceTexture = c;
            } else {
                this.f7184m.mo10162b();
                this.f7184m = null;
            }
        }
        this.f7179h = new Surface(surfaceTexture);
        if (this.f7180i == null) {
            m8687p();
        } else {
            m8682a(this.f7179h, true);
            if (!this.f7177f.f1406a) {
                m8690s();
            }
        }
        m8689r();
        C1782xi.f6838a.post(new adn(this));
    }

    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        if (this.f7184m != null) {
            this.f7184m.mo10160a(i, i2);
        }
        C1782xi.f6838a.post(new ado(this, i, i2));
    }

    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        this.f7175d.mo10188b(this);
        this.f7156a.mo10139a(surfaceTexture, this.f7178g);
    }

    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        mo13332d();
        if (this.f7184m != null) {
            this.f7184m.mo10162b();
            this.f7184m = null;
        }
        if (this.f7180i != null) {
            m8691t();
            if (this.f7179h != null) {
                this.f7179h.release();
            }
            this.f7179h = null;
            m8682a((Surface) null, true);
        }
        C1782xi.f6838a.post(new adp(this));
        return true;
    }

    /* access modifiers changed from: protected */
    public final void onWindowVisibilityChanged(int i) {
        StringBuilder sb = new StringBuilder(57);
        sb.append("AdExoPlayerView3 window visibility changed to ");
        sb.append(i);
        C1772wz.m8287a(sb.toString());
        C1782xi.f6838a.post(new adq(this, i));
        super.onWindowVisibilityChanged(i);
    }

    /* renamed from: a */
    public final void mo10268a(boolean z, long j) {
        if (this.f7174c != null) {
            abl.f1313a.execute(new adr(this, z, j));
        }
    }

    /* renamed from: b */
    public final void mo10269b(int i) {
        if (this.f7183l != i) {
            this.f7183l = i;
            switch (i) {
                case 3:
                    m8688q();
                    return;
                case 4:
                    if (this.f7177f.f1406a) {
                        m8691t();
                    }
                    this.f7175d.mo10190d();
                    this.f7157b.mo10198c();
                    C1782xi.f6838a.post(new adj(this));
                    return;
                default:
                    return;
            }
        }
    }

    /* renamed from: a */
    public final void mo10266a(int i, int i2) {
        this.f7188q = i;
        this.f7189r = i2;
        m8689r();
    }

    /* renamed from: a */
    public final void mo10267a(String str, Exception exc) {
        String canonicalName = exc.getClass().getCanonicalName();
        String message = exc.getMessage();
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 2 + String.valueOf(canonicalName).length() + String.valueOf(message).length());
        sb.append(str);
        sb.append("/");
        sb.append(canonicalName);
        sb.append(":");
        sb.append(message);
        String sb2 = sb.toString();
        String valueOf = String.valueOf(sb2);
        C1772wz.m1630e(valueOf.length() != 0 ? "ExoPlayerAdapter error: ".concat(valueOf) : new String("ExoPlayerAdapter error: "));
        this.f7182k = true;
        if (this.f7177f.f1406a) {
            m8691t();
        }
        C1782xi.f6838a.post(new adk(this, sb2));
    }

    /* renamed from: r */
    private final void m8689r() {
        float f = this.f7189r > 0 ? ((float) this.f7188q) / ((float) this.f7189r) : 1.0f;
        if (this.f7192u != f) {
            this.f7192u = f;
            requestLayout();
        }
    }

    /* renamed from: s */
    private final void m8690s() {
        if (this.f7180i != null) {
            this.f7180i.mo10253b(true);
        }
    }

    /* renamed from: t */
    private final void m8691t() {
        if (this.f7180i != null) {
            this.f7180i.mo10253b(false);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final /* synthetic */ void mo13378b(boolean z, long j) {
        this.f7174c.mo10171a(z, j);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final /* synthetic */ void mo13381g(int i) {
        if (this.f7178g != null) {
            this.f7178g.onWindowVisibilityChanged(i);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final /* synthetic */ void mo13379f() {
        if (this.f7178g != null) {
            this.f7178g.mo10124f();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final /* synthetic */ void mo13377b(int i, int i2) {
        if (this.f7178g != null) {
            this.f7178g.mo10118a(i, i2);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final /* synthetic */ void mo13380g() {
        if (this.f7178g != null) {
            this.f7178g.mo10117a();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final /* synthetic */ void mo13382h() {
        if (this.f7178g != null) {
            this.f7178g.mo10122d();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final /* synthetic */ void mo13383i() {
        if (this.f7178g != null) {
            this.f7178g.mo10121c();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void mo13376a(String str) {
        if (this.f7178g != null) {
            this.f7178g.mo10119a("ExoPlayerAdapter error", str);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final /* synthetic */ void mo13384j() {
        if (this.f7178g != null) {
            this.f7178g.mo10123e();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public final /* synthetic */ void mo13385k() {
        if (this.f7178g != null) {
            this.f7178g.mo10120b();
        }
    }
}
