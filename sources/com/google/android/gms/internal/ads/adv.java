package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.view.Surface;
import java.io.IOException;
import java.nio.ByteBuffer;

@C1598qn
public final class adv implements azo, bfr, bjx<bje>, bld {

    /* renamed from: a */
    private static int f1471a;

    /* renamed from: b */
    private static int f1472b;

    /* renamed from: c */
    private final Context f1473c;

    /* renamed from: d */
    private final adu f1474d = new adu();

    /* renamed from: e */
    private final baf f1475e = new bkx(this.f1473c, bek.f3982a, 0, C1782xi.f6838a, this, -1);

    /* renamed from: f */
    private final baf f1476f = new bbl(bek.f3982a);

    /* renamed from: g */
    private final bis f1477g = new bip();

    /* renamed from: h */
    private final adb f1478h;

    /* renamed from: i */
    private azn f1479i;

    /* renamed from: j */
    private ByteBuffer f1480j;

    /* renamed from: k */
    private boolean f1481k;

    /* renamed from: l */
    private aec f1482l;

    /* renamed from: m */
    private int f1483m;

    public adv(Context context, adb adb) {
        this.f1473c = context;
        this.f1478h = adb;
        if (C1772wz.m8288a()) {
            String valueOf = String.valueOf(this);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 28);
            sb.append("ExoPlayerAdapter initialize ");
            sb.append(valueOf);
            C1772wz.m8287a(sb.toString());
        }
        f1471a++;
        this.f1479i = azr.m4584a(new baf[]{this.f1476f, this.f1475e}, this.f1477g, this.f1474d);
        this.f1479i.mo11475a((azo) this);
    }

    /* renamed from: a */
    public final void mo10232a(int i, long j) {
    }

    /* renamed from: a */
    public final void mo10235a(Surface surface) {
    }

    /* renamed from: a */
    public final void mo10239a(bae bae) {
    }

    /* renamed from: a */
    public final void mo10240a(baj baj, Object obj) {
    }

    /* renamed from: a */
    public final void mo10241a(bbv bbv) {
    }

    /* renamed from: a */
    public final void mo10242a(bgh bgh, bix bix) {
    }

    /* renamed from: a */
    public final void mo10243a(zzfs zzfs) {
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo10245a(Object obj) {
    }

    /* renamed from: a */
    public final void mo10248a(String str, long j, long j2) {
    }

    /* renamed from: a */
    public final void mo10249a(boolean z) {
    }

    /* renamed from: b */
    public final void mo10252b(bbv bbv) {
    }

    /* renamed from: g */
    public final void mo10258g() {
    }

    /* renamed from: a */
    public final azn mo10227a() {
        return this.f1479i;
    }

    /* renamed from: b */
    public static int m1804b() {
        return f1471a;
    }

    /* renamed from: c */
    public static int m1806c() {
        return f1472b;
    }

    /* renamed from: a */
    public final void mo10237a(aec aec) {
        this.f1482l = aec;
    }

    /* renamed from: d */
    public final adu mo10254d() {
        return this.f1474d;
    }

    /* renamed from: a */
    public final void mo10233a(Uri uri, String str) {
        mo10234a(uri, str, ByteBuffer.allocate(0), false);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v0, resolved type: com.google.android.gms.internal.ads.bhb} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: com.google.android.gms.internal.ads.bfq} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: com.google.android.gms.internal.ads.bhb} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: com.google.android.gms.internal.ads.bhb} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo10234a(android.net.Uri r11, java.lang.String r12, java.nio.ByteBuffer r13, boolean r14) {
        /*
            r10 = this;
            r10.f1480j = r13
            r10.f1481k = r14
            com.google.android.gms.internal.ads.adb r1 = r10.f1478h
            boolean r1 = r1.f1415j
            if (r1 == 0) goto L_0x001e
            com.google.android.gms.internal.ads.bjf r4 = r10.m1805b((java.lang.String) r12)
            com.google.android.gms.internal.ads.bhb r0 = new com.google.android.gms.internal.ads.bhb
            com.google.android.gms.internal.ads.bho r5 = new com.google.android.gms.internal.ads.bho
            r5.<init>(r4)
            android.os.Handler r6 = com.google.android.gms.internal.ads.C1782xi.f6838a
            r7 = 0
            r2 = r0
            r3 = r11
            r2.<init>(r3, r4, r5, r6, r7)
            goto L_0x0034
        L_0x001e:
            com.google.android.gms.internal.ads.bfq r9 = new com.google.android.gms.internal.ads.bfq
            com.google.android.gms.internal.ads.bjf r2 = r10.m1805b((java.lang.String) r12)
            com.google.android.gms.internal.ads.bck r3 = com.google.android.gms.internal.ads.aea.f1494a
            r4 = -1
            android.os.Handler r5 = com.google.android.gms.internal.ads.C1782xi.f6838a
            r7 = 0
            com.google.android.gms.internal.ads.adb r0 = r10.f1478h
            int r8 = r0.f1412g
            r0 = r9
            r1 = r11
            r6 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
        L_0x0034:
            com.google.android.gms.internal.ads.azn r1 = r10.f1479i
            r1.mo11476a((com.google.android.gms.internal.ads.bfu) r0)
            int r0 = f1472b
            int r0 = r0 + 1
            f1472b = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.adv.mo10234a(android.net.Uri, java.lang.String, java.nio.ByteBuffer, boolean):void");
    }

    /* renamed from: e */
    public final void mo10255e() {
        if (this.f1479i != null) {
            this.f1479i.mo11479b((azo) this);
            this.f1479i.mo11483d();
            this.f1479i = null;
            f1472b--;
        }
    }

    /* renamed from: f */
    public final long mo10256f() {
        return (long) this.f1483m;
    }

    /* renamed from: a */
    public final void mo10244a(IOException iOException) {
        if (this.f1482l != null) {
            this.f1482l.mo10267a("onLoadError", (Exception) iOException);
        }
    }

    /* renamed from: a */
    public final void mo10231a(int i, int i2, int i3, float f) {
        if (this.f1482l != null) {
            this.f1482l.mo10266a(i, i2);
        }
    }

    /* renamed from: a */
    public final void mo10250a(boolean z, int i) {
        if (this.f1482l != null) {
            this.f1482l.mo10269b(i);
        }
    }

    /* renamed from: a */
    public final void mo10238a(azm azm) {
        if (this.f1482l != null) {
            this.f1482l.mo10267a("onPlayerError", (Exception) azm);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo10236a(Surface surface, boolean z) {
        azq azq = new azq(this.f1475e, 1, surface);
        if (z) {
            this.f1479i.mo11480b(azq);
            return;
        }
        this.f1479i.mo11478a(azq);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo10230a(float f, boolean z) {
        azq azq = new azq(this.f1476f, 2, Float.valueOf(f));
        if (z) {
            this.f1479i.mo11480b(azq);
            return;
        }
        this.f1479i.mo11478a(azq);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo10253b(boolean z) {
        for (int i = 0; i < this.f1479i.mo11484e(); i++) {
            this.f1477g.mo11993a(i, !z);
        }
    }

    /* renamed from: b */
    private final bjf m1805b(String str) {
        if (!this.f1481k || this.f1480j.limit() <= 0) {
            adx adx = new adx(this, str);
            bjf ady = this.f1478h.f1414i ? new ady(this, adx) : adx;
            if (this.f1480j.limit() <= 0) {
                return ady;
            }
            byte[] bArr = new byte[this.f1480j.limit()];
            this.f1480j.get(bArr);
            return new adz(ady, bArr);
        }
        byte[] bArr2 = new byte[this.f1480j.limit()];
        this.f1480j.get(bArr2);
        return new adw(bArr2);
    }

    public final void finalize() {
        f1471a--;
        if (C1772wz.m8288a()) {
            String valueOf = String.valueOf(this);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 26);
            sb.append("ExoPlayerAdapter finalize ");
            sb.append(valueOf);
            C1772wz.m8287a(sb.toString());
        }
    }

    /* renamed from: a */
    public final /* synthetic */ void mo10246a(Object obj, int i) {
        this.f1483m += i;
    }

    /* renamed from: a */
    public final /* synthetic */ void mo10247a(Object obj, bji bji) {
        this.f1483m = 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ bje mo10228a(bjf bjf) {
        return new C1020ads(this.f1473c, bjf.mo10259a(), this, new aeb(this));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void mo10251a(boolean z, long j) {
        if (this.f1482l != null) {
            this.f1482l.mo10268a(z, j);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ bje mo10229a(String str) {
        return new bjl(str, (bkj<String>) null, this.f1478h.f1414i ? null : this, this.f1478h.f1409d, this.f1478h.f1411f, true, (bjo) null);
    }
}
