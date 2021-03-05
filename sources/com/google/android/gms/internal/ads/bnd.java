package com.google.android.gms.internal.ads;

import android.support.annotation.Nullable;
import com.google.android.gms.ads.internal.zzbv;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;

@C1598qn
@ParametersAreNonnullByDefault
public final class bnd {

    /* renamed from: a */
    private final Object f4821a = new Object();

    /* renamed from: b */
    private int f4822b;

    /* renamed from: c */
    private List<bnc> f4823c = new LinkedList();

    @Nullable
    /* renamed from: a */
    public final bnc mo12220a() {
        synchronized (this.f4821a) {
            bnc bnc = null;
            if (this.f4823c.size() == 0) {
                C1772wz.m1624b("Queue empty");
                return null;
            }
            int i = 0;
            if (this.f4823c.size() >= 2) {
                int i2 = Integer.MIN_VALUE;
                int i3 = 0;
                for (bnc next : this.f4823c) {
                    int i4 = next.mo12217i();
                    if (i4 > i2) {
                        i = i3;
                        bnc = next;
                        i2 = i4;
                    }
                    i3++;
                }
                this.f4823c.remove(i);
                return bnc;
            }
            bnc bnc2 = this.f4823c.get(0);
            bnc2.mo12211e();
            return bnc2;
        }
    }

    /* renamed from: a */
    public final boolean mo12221a(bnc bnc) {
        synchronized (this.f4821a) {
            if (this.f4823c.contains(bnc)) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: b */
    public final boolean mo12222b(bnc bnc) {
        synchronized (this.f4821a) {
            Iterator<bnc> it = this.f4823c.iterator();
            while (it.hasNext()) {
                bnc next = it.next();
                if (!zzbv.zzlj().mo13131k().mo13175b()) {
                    if (bnc != next && next.mo12207b().equals(bnc.mo12207b())) {
                        it.remove();
                        return true;
                    }
                } else if (!zzbv.zzlj().mo13131k().mo13181d() && bnc != next && next.mo12210d().equals(bnc.mo12210d())) {
                    it.remove();
                    return true;
                }
            }
            return false;
        }
    }

    /* renamed from: c */
    public final void mo12223c(bnc bnc) {
        synchronized (this.f4821a) {
            if (this.f4823c.size() >= 10) {
                int size = this.f4823c.size();
                StringBuilder sb = new StringBuilder(41);
                sb.append("Queue is full, current size = ");
                sb.append(size);
                C1772wz.m1624b(sb.toString());
                this.f4823c.remove(0);
            }
            int i = this.f4822b;
            this.f4822b = i + 1;
            bnc.mo12204a(i);
            this.f4823c.add(bnc);
        }
    }
}
