package com.google.android.gms.internal.ads;

import android.support.annotation.Nullable;
import com.google.android.gms.ads.internal.zzbv;
import java.util.ArrayList;
import javax.annotation.ParametersAreNonnullByDefault;

@C1598qn
@ParametersAreNonnullByDefault
public final class bnc {

    /* renamed from: a */
    private final int f4805a;

    /* renamed from: b */
    private final int f4806b;

    /* renamed from: c */
    private final int f4807c;

    /* renamed from: d */
    private final bnq f4808d;

    /* renamed from: e */
    private final bnz f4809e;

    /* renamed from: f */
    private final Object f4810f = new Object();

    /* renamed from: g */
    private ArrayList<String> f4811g = new ArrayList<>();

    /* renamed from: h */
    private ArrayList<String> f4812h = new ArrayList<>();

    /* renamed from: i */
    private ArrayList<bno> f4813i = new ArrayList<>();

    /* renamed from: j */
    private int f4814j = 0;

    /* renamed from: k */
    private int f4815k = 0;

    /* renamed from: l */
    private int f4816l = 0;

    /* renamed from: m */
    private int f4817m;

    /* renamed from: n */
    private String f4818n = "";

    /* renamed from: o */
    private String f4819o = "";

    /* renamed from: p */
    private String f4820p = "";

    public bnc(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        this.f4805a = i;
        this.f4806b = i2;
        this.f4807c = i3;
        this.f4808d = new bnq(i4);
        this.f4809e = new bnz(i5, i6, i7);
    }

    /* renamed from: a */
    public final boolean mo12206a() {
        boolean z;
        synchronized (this.f4810f) {
            z = this.f4816l == 0;
        }
        return z;
    }

    /* renamed from: b */
    public final String mo12207b() {
        return this.f4818n;
    }

    /* renamed from: c */
    public final String mo12209c() {
        return this.f4819o;
    }

    /* renamed from: d */
    public final String mo12210d() {
        return this.f4820p;
    }

    /* renamed from: e */
    public final void mo12211e() {
        synchronized (this.f4810f) {
            this.f4817m -= 100;
        }
    }

    /* renamed from: f */
    public final void mo12213f() {
        synchronized (this.f4810f) {
            this.f4816l--;
        }
    }

    /* renamed from: g */
    public final void mo12214g() {
        synchronized (this.f4810f) {
            this.f4816l++;
        }
    }

    /* renamed from: a */
    public final void mo12205a(String str, boolean z, float f, float f2, float f3, float f4) {
        m6019c(str, z, f, f2, f3, f4);
        synchronized (this.f4810f) {
            if (this.f4816l < 0) {
                C1772wz.m1624b("ActivityContent: negative number of WebViews.");
            }
            mo12215h();
        }
    }

    /* renamed from: b */
    public final void mo12208b(String str, boolean z, float f, float f2, float f3, float f4) {
        m6019c(str, z, f, f2, f3, f4);
    }

    /* renamed from: c */
    private final void m6019c(@Nullable String str, boolean z, float f, float f2, float f3, float f4) {
        if (str != null && str.length() >= this.f4807c) {
            synchronized (this.f4810f) {
                this.f4811g.add(str);
                this.f4814j += str.length();
                if (z) {
                    this.f4812h.add(str);
                    this.f4813i.add(new bno(f, f2, f3, f4, this.f4812h.size() - 1));
                }
            }
        }
    }

    /* renamed from: h */
    public final void mo12215h() {
        synchronized (this.f4810f) {
            int i = (this.f4814j * this.f4805a) + (this.f4815k * this.f4806b);
            if (i > this.f4817m) {
                this.f4817m = i;
                if (!zzbv.zzlj().mo13131k().mo13175b()) {
                    this.f4818n = this.f4808d.mo12258a(this.f4811g);
                    this.f4819o = this.f4808d.mo12258a(this.f4812h);
                }
                if (!zzbv.zzlj().mo13131k().mo13181d()) {
                    this.f4820p = this.f4809e.mo12267a(this.f4812h, this.f4813i);
                }
            }
        }
    }

    /* renamed from: i */
    public final int mo12217i() {
        return this.f4817m;
    }

    /* renamed from: a */
    public final void mo12204a(int i) {
        this.f4815k = i;
    }

    /* renamed from: a */
    private static String m6018a(ArrayList<String> arrayList, int i) {
        if (arrayList.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        ArrayList arrayList2 = arrayList;
        int size = arrayList2.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList2.get(i2);
            i2++;
            sb.append((String) obj);
            sb.append(' ');
            if (sb.length() > 100) {
                break;
            }
        }
        sb.deleteCharAt(sb.length() - 1);
        String sb2 = sb.toString();
        if (sb2.length() < 100) {
            return sb2;
        }
        return sb2.substring(0, 100);
    }

    public final String toString() {
        int i = this.f4815k;
        int i2 = this.f4817m;
        int i3 = this.f4814j;
        String a = m6018a(this.f4811g, 100);
        String a2 = m6018a(this.f4812h, 100);
        String str = this.f4818n;
        String str2 = this.f4819o;
        String str3 = this.f4820p;
        StringBuilder sb = new StringBuilder(String.valueOf(a).length() + 165 + String.valueOf(a2).length() + String.valueOf(str).length() + String.valueOf(str2).length() + String.valueOf(str3).length());
        sb.append("ActivityContent fetchId: ");
        sb.append(i);
        sb.append(" score:");
        sb.append(i2);
        sb.append(" total_length:");
        sb.append(i3);
        sb.append("\n text: ");
        sb.append(a);
        sb.append("\n viewableText");
        sb.append(a2);
        sb.append("\n signture: ");
        sb.append(str);
        sb.append("\n viewableSignture: ");
        sb.append(str2);
        sb.append("\n viewableSignatureForVertical: ");
        sb.append(str3);
        return sb.toString();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final int mo12218j() {
        return this.f4814j;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof bnc)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        bnc bnc = (bnc) obj;
        return bnc.f4818n != null && bnc.f4818n.equals(this.f4818n);
    }

    public final int hashCode() {
        return this.f4818n.hashCode();
    }
}
