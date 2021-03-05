package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

final class azs implements azn {

    /* renamed from: a */
    private final baf[] f3179a;

    /* renamed from: b */
    private final biy f3180b;

    /* renamed from: c */
    private final bix f3181c;

    /* renamed from: d */
    private final Handler f3182d;

    /* renamed from: e */
    private final azu f3183e;

    /* renamed from: f */
    private final CopyOnWriteArraySet<azo> f3184f;

    /* renamed from: g */
    private final bam f3185g;

    /* renamed from: h */
    private final bal f3186h;

    /* renamed from: i */
    private boolean f3187i;

    /* renamed from: j */
    private boolean f3188j;

    /* renamed from: k */
    private int f3189k;

    /* renamed from: l */
    private int f3190l;

    /* renamed from: m */
    private int f3191m;

    /* renamed from: n */
    private int f3192n;

    /* renamed from: o */
    private boolean f3193o;

    /* renamed from: p */
    private baj f3194p;

    /* renamed from: q */
    private Object f3195q;

    /* renamed from: r */
    private bgh f3196r;

    /* renamed from: s */
    private bix f3197s;

    /* renamed from: t */
    private bae f3198t;

    /* renamed from: u */
    private azw f3199u;

    /* renamed from: v */
    private int f3200v;

    /* renamed from: w */
    private int f3201w;

    /* renamed from: x */
    private long f3202x;

    @SuppressLint({"HandlerLeak"})
    public azs(baf[] bafArr, biy biy, bac bac) {
        String str = bkp.f4574e;
        StringBuilder sb = new StringBuilder(String.valueOf("Init ExoPlayerLib/2.4.2 [").length() + 1 + String.valueOf(str).length());
        sb.append("Init ExoPlayerLib/2.4.2 [");
        sb.append(str);
        sb.append("]");
        Log.i("ExoPlayerImpl", sb.toString());
        bjy.m5691b(bafArr.length > 0);
        this.f3179a = (baf[]) bjy.m5688a(bafArr);
        this.f3180b = (biy) bjy.m5688a(biy);
        this.f3188j = false;
        this.f3189k = 0;
        this.f3190l = 1;
        this.f3184f = new CopyOnWriteArraySet<>();
        this.f3181c = new bix(new biv[bafArr.length]);
        this.f3194p = baj.f3278a;
        this.f3185g = new bam();
        this.f3186h = new bal();
        this.f3196r = bgh.f4180a;
        this.f3197s = this.f3181c;
        this.f3198t = bae.f3272a;
        this.f3182d = new azt(this, Looper.myLooper() != null ? Looper.myLooper() : Looper.getMainLooper());
        this.f3199u = new azw(0, 0);
        this.f3183e = new azu(bafArr, biy, bac, this.f3188j, 0, this.f3182d, this.f3199u, this);
    }

    /* renamed from: a */
    public final void mo11475a(azo azo) {
        this.f3184f.add(azo);
    }

    /* renamed from: b */
    public final void mo11479b(azo azo) {
        this.f3184f.remove(azo);
    }

    /* renamed from: a */
    public final int mo11473a() {
        return this.f3190l;
    }

    /* renamed from: a */
    public final void mo11476a(bfu bfu) {
        if (!this.f3194p.mo11528a() || this.f3195q != null) {
            this.f3194p = baj.f3278a;
            this.f3195q = null;
            Iterator<azo> it = this.f3184f.iterator();
            while (it.hasNext()) {
                it.next().mo10240a(this.f3194p, this.f3195q);
            }
        }
        if (this.f3187i) {
            this.f3187i = false;
            this.f3196r = bgh.f4180a;
            this.f3197s = this.f3181c;
            this.f3180b.mo11994a((Object) null);
            Iterator<azo> it2 = this.f3184f.iterator();
            while (it2.hasNext()) {
                it2.next().mo10242a(this.f3196r, this.f3197s);
            }
        }
        this.f3192n++;
        this.f3183e.mo11494a(bfu, true);
    }

    /* renamed from: a */
    public final void mo11477a(boolean z) {
        if (this.f3188j != z) {
            this.f3188j = z;
            this.f3183e.mo11496a(z);
            Iterator<azo> it = this.f3184f.iterator();
            while (it.hasNext()) {
                it.next().mo10250a(z, this.f3190l);
            }
        }
    }

    /* renamed from: b */
    public final boolean mo11481b() {
        return this.f3188j;
    }

    /* renamed from: a */
    public final void mo11474a(long j) {
        long j2;
        int i = m4585i();
        if (i < 0 || (!this.f3194p.mo11528a() && i >= this.f3194p.mo11529b())) {
            throw new bab(this.f3194p, i, j);
        }
        this.f3191m++;
        this.f3200v = i;
        if (this.f3194p.mo11528a()) {
            this.f3201w = 0;
        } else {
            this.f3194p.mo11527a(i, this.f3185g, false, 0);
            if (j == -9223372036854775807L) {
                j2 = this.f3185g.f3288d;
            } else {
                j2 = azl.m4557b(j);
            }
            long j3 = this.f3185g.f3290f + j2;
            long j4 = this.f3194p.mo11526a(0, this.f3186h, false).f3281c;
            int i2 = 0;
            while (j4 != -9223372036854775807L && j3 >= j4 && i2 < this.f3185g.f3287c) {
                j3 -= j4;
                i2++;
                j4 = this.f3194p.mo11526a(i2, this.f3186h, false).f3281c;
            }
            this.f3201w = i2;
        }
        if (j == -9223372036854775807L) {
            this.f3202x = 0;
            this.f3183e.mo11491a(this.f3194p, i, -9223372036854775807L);
            return;
        }
        this.f3202x = j;
        this.f3183e.mo11491a(this.f3194p, i, azl.m4557b(j));
        Iterator<azo> it = this.f3184f.iterator();
        while (it.hasNext()) {
            it.next().mo10258g();
        }
    }

    /* renamed from: c */
    public final void mo11482c() {
        this.f3183e.mo11490a();
    }

    /* renamed from: d */
    public final void mo11483d() {
        this.f3183e.mo11498b();
        this.f3182d.removeCallbacksAndMessages((Object) null);
    }

    /* renamed from: a */
    public final void mo11478a(azq... azqArr) {
        this.f3183e.mo11497a(azqArr);
    }

    /* renamed from: b */
    public final void mo11480b(azq... azqArr) {
        this.f3183e.mo11499b(azqArr);
    }

    /* renamed from: i */
    private final int m4585i() {
        if (this.f3194p.mo11528a() || this.f3191m > 0) {
            return this.f3200v;
        }
        this.f3194p.mo11526a(this.f3199u.f3256a, this.f3186h, false);
        return 0;
    }

    /* renamed from: f */
    public final long mo11485f() {
        if (this.f3194p.mo11528a()) {
            return -9223372036854775807L;
        }
        return azl.m4556a(this.f3194p.mo11527a(m4585i(), this.f3185g, false, 0).f3289e);
    }

    /* renamed from: g */
    public final long mo11486g() {
        if (this.f3194p.mo11528a() || this.f3191m > 0) {
            return this.f3202x;
        }
        this.f3194p.mo11526a(this.f3199u.f3256a, this.f3186h, false);
        return this.f3186h.mo11531a() + azl.m4556a(this.f3199u.f3258c);
    }

    /* renamed from: h */
    public final long mo11487h() {
        if (this.f3194p.mo11528a() || this.f3191m > 0) {
            return this.f3202x;
        }
        this.f3194p.mo11526a(this.f3199u.f3256a, this.f3186h, false);
        return this.f3186h.mo11531a() + azl.m4556a(this.f3199u.f3259d);
    }

    /* renamed from: e */
    public final int mo11484e() {
        return this.f3179a.length;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo11488a(Message message) {
        boolean z = true;
        switch (message.what) {
            case 0:
                this.f3192n--;
                return;
            case 1:
                this.f3190l = message.arg1;
                Iterator<azo> it = this.f3184f.iterator();
                while (it.hasNext()) {
                    it.next().mo10250a(this.f3188j, this.f3190l);
                }
                return;
            case 2:
                if (message.arg1 == 0) {
                    z = false;
                }
                this.f3193o = z;
                Iterator<azo> it2 = this.f3184f.iterator();
                while (it2.hasNext()) {
                    it2.next().mo10249a(this.f3193o);
                }
                return;
            case 3:
                if (this.f3192n == 0) {
                    bja bja = (bja) message.obj;
                    this.f3187i = true;
                    this.f3196r = bja.f4436a;
                    this.f3197s = bja.f4437b;
                    this.f3180b.mo11994a(bja.f4438c);
                    Iterator<azo> it3 = this.f3184f.iterator();
                    while (it3.hasNext()) {
                        it3.next().mo10242a(this.f3196r, this.f3197s);
                    }
                    return;
                }
                return;
            case 4:
                int i = this.f3191m - 1;
                this.f3191m = i;
                if (i == 0) {
                    this.f3199u = (azw) message.obj;
                    if (message.arg1 != 0) {
                        Iterator<azo> it4 = this.f3184f.iterator();
                        while (it4.hasNext()) {
                            it4.next().mo10258g();
                        }
                        return;
                    }
                    return;
                }
                return;
            case 5:
                if (this.f3191m == 0) {
                    this.f3199u = (azw) message.obj;
                    Iterator<azo> it5 = this.f3184f.iterator();
                    while (it5.hasNext()) {
                        it5.next().mo10258g();
                    }
                    return;
                }
                return;
            case 6:
                azy azy = (azy) message.obj;
                this.f3191m -= azy.f3266d;
                if (this.f3192n == 0) {
                    this.f3194p = azy.f3263a;
                    this.f3195q = azy.f3264b;
                    this.f3199u = azy.f3265c;
                    Iterator<azo> it6 = this.f3184f.iterator();
                    while (it6.hasNext()) {
                        it6.next().mo10240a(this.f3194p, this.f3195q);
                    }
                    return;
                }
                return;
            case 7:
                bae bae = (bae) message.obj;
                if (!this.f3198t.equals(bae)) {
                    this.f3198t = bae;
                    Iterator<azo> it7 = this.f3184f.iterator();
                    while (it7.hasNext()) {
                        it7.next().mo10239a(bae);
                    }
                    return;
                }
                return;
            case 8:
                azm azm = (azm) message.obj;
                Iterator<azo> it8 = this.f3184f.iterator();
                while (it8.hasNext()) {
                    it8.next().mo10238a(azm);
                }
                return;
            default:
                throw new IllegalStateException();
        }
    }
}
