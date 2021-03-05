package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzbv;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@C1598qn
public final class aen implements Iterable<ael> {

    /* renamed from: a */
    private final List<ael> f1523a = new ArrayList();

    /* renamed from: a */
    public static boolean m1870a(adc adc) {
        ael b = m1871b(adc);
        if (b == null) {
            return false;
        }
        b.f1520b.mo10295b();
        return true;
    }

    /* renamed from: b */
    static ael m1871b(adc adc) {
        Iterator<ael> it = zzbv.zzmd().iterator();
        while (it.hasNext()) {
            ael next = it.next();
            if (next.f1519a == adc) {
                return next;
            }
        }
        return null;
    }

    /* renamed from: a */
    public final void mo10285a(ael ael) {
        this.f1523a.add(ael);
    }

    /* renamed from: b */
    public final void mo10286b(ael ael) {
        this.f1523a.remove(ael);
    }

    public final Iterator<ael> iterator() {
        return this.f1523a.iterator();
    }

    /* renamed from: a */
    public final int mo10284a() {
        return this.f1523a.size();
    }
}
