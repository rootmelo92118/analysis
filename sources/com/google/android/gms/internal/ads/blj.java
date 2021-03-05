package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.support.annotation.GuardedBy;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.C1264ee;
import java.util.Collections;
import java.util.Map;

public abstract class blj<T> implements Comparable<blj<T>> {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C1264ee.C1265a f4662a;

    /* renamed from: b */
    private final int f4663b;

    /* renamed from: c */
    private final String f4664c;

    /* renamed from: d */
    private final int f4665d;

    /* renamed from: e */
    private final Object f4666e;
    @Nullable
    @GuardedBy("mLock")

    /* renamed from: f */
    private bsl f4667f;

    /* renamed from: g */
    private Integer f4668g;

    /* renamed from: h */
    private bpl f4669h;

    /* renamed from: i */
    private boolean f4670i;
    @GuardedBy("mLock")

    /* renamed from: j */
    private boolean f4671j;
    @GuardedBy("mLock")

    /* renamed from: k */
    private boolean f4672k;

    /* renamed from: l */
    private boolean f4673l;

    /* renamed from: m */
    private C1018ac f4674m;

    /* renamed from: n */
    private awd f4675n;
    @GuardedBy("mLock")

    /* renamed from: o */
    private bnl f4676o;

    public blj(int i, String str, @Nullable bsl bsl) {
        Uri parse;
        String host;
        this.f4662a = C1264ee.C1265a.f5339a ? new C1264ee.C1265a() : null;
        this.f4666e = new Object();
        this.f4670i = true;
        int i2 = 0;
        this.f4671j = false;
        this.f4672k = false;
        this.f4673l = false;
        this.f4675n = null;
        this.f4663b = i;
        this.f4664c = str;
        this.f4667f = bsl;
        this.f4674m = new bbh();
        if (!(TextUtils.isEmpty(str) || (parse = Uri.parse(str)) == null || (host = parse.getHost()) == null)) {
            i2 = host.hashCode();
        }
        this.f4665d = i2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract brk<T> mo12110a(bjj bjj);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo12114a(T t);

    /* renamed from: a */
    public byte[] mo12115a() {
        return null;
    }

    /* renamed from: c */
    public final int mo12118c() {
        return this.f4663b;
    }

    /* renamed from: d */
    public final int mo12121d() {
        return this.f4665d;
    }

    /* renamed from: b */
    public final void mo12117b(String str) {
        if (C1264ee.C1265a.f5339a) {
            this.f4662a.mo12515a(str, Thread.currentThread().getId());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo12119c(String str) {
        if (this.f4669h != null) {
            this.f4669h.mo12292b(this);
        }
        if (C1264ee.C1265a.f5339a) {
            long id = Thread.currentThread().getId();
            if (Looper.myLooper() != Looper.getMainLooper()) {
                new Handler(Looper.getMainLooper()).post(new bmk(this, str, id));
                return;
            }
            this.f4662a.mo12515a(str, id);
            this.f4662a.mo12514a(toString());
        }
    }

    /* renamed from: a */
    public final blj<?> mo12109a(bpl bpl) {
        this.f4669h = bpl;
        return this;
    }

    /* renamed from: a */
    public final blj<?> mo12107a(int i) {
        this.f4668g = Integer.valueOf(i);
        return this;
    }

    /* renamed from: e */
    public final String mo12122e() {
        return this.f4664c;
    }

    /* renamed from: f */
    public final String mo12123f() {
        String str = this.f4664c;
        int i = this.f4663b;
        if (i == 0 || i == -1) {
            return str;
        }
        String num = Integer.toString(i);
        StringBuilder sb = new StringBuilder(String.valueOf(num).length() + 1 + String.valueOf(str).length());
        sb.append(num);
        sb.append('-');
        sb.append(str);
        return sb.toString();
    }

    /* renamed from: a */
    public final blj<?> mo12108a(awd awd) {
        this.f4675n = awd;
        return this;
    }

    /* renamed from: g */
    public final awd mo12124g() {
        return this.f4675n;
    }

    /* renamed from: h */
    public final boolean mo12125h() {
        synchronized (this.f4666e) {
        }
        return false;
    }

    /* renamed from: b */
    public Map<String, String> mo12116b() {
        return Collections.emptyMap();
    }

    /* renamed from: i */
    public final boolean mo12126i() {
        return this.f4670i;
    }

    /* renamed from: j */
    public final int mo12127j() {
        return this.f4674m.mo10102a();
    }

    /* renamed from: k */
    public final C1018ac mo12128k() {
        return this.f4674m;
    }

    /* renamed from: l */
    public final void mo12129l() {
        synchronized (this.f4666e) {
            this.f4672k = true;
        }
    }

    /* renamed from: m */
    public final boolean mo12130m() {
        boolean z;
        synchronized (this.f4666e) {
            z = this.f4672k;
        }
        return z;
    }

    /* renamed from: a */
    public final void mo12113a(C1236dd ddVar) {
        bsl bsl;
        synchronized (this.f4666e) {
            bsl = this.f4667f;
        }
        if (bsl != null) {
            bsl.mo12333a(ddVar);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo12111a(bnl bnl) {
        synchronized (this.f4666e) {
            this.f4676o = bnl;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo12112a(brk<?> brk) {
        bnl bnl;
        synchronized (this.f4666e) {
            bnl = this.f4676o;
        }
        if (bnl != null) {
            bnl.mo11436a(this, brk);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public final void mo12131n() {
        bnl bnl;
        synchronized (this.f4666e) {
            bnl = this.f4676o;
        }
        if (bnl != null) {
            bnl.mo11435a(this);
        }
    }

    public String toString() {
        String valueOf = String.valueOf(Integer.toHexString(this.f4665d));
        String concat = valueOf.length() != 0 ? "0x".concat(valueOf) : new String("0x");
        mo12125h();
        String str = this.f4664c;
        String valueOf2 = String.valueOf(bok.NORMAL);
        String valueOf3 = String.valueOf(this.f4668g);
        StringBuilder sb = new StringBuilder(String.valueOf("[ ] ").length() + 3 + String.valueOf(str).length() + String.valueOf(concat).length() + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length());
        sb.append("[ ] ");
        sb.append(str);
        sb.append(" ");
        sb.append(concat);
        sb.append(" ");
        sb.append(valueOf2);
        sb.append(" ");
        sb.append(valueOf3);
        return sb.toString();
    }

    public /* synthetic */ int compareTo(Object obj) {
        blj blj = (blj) obj;
        bok bok = bok.NORMAL;
        bok bok2 = bok.NORMAL;
        return bok == bok2 ? this.f4668g.intValue() - blj.f4668g.intValue() : bok2.ordinal() - bok.ordinal();
    }
}
