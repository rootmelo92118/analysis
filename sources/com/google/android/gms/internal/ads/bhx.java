package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;

public abstract class bhx {

    /* renamed from: a */
    public final zzfs f4366a;

    /* renamed from: b */
    public final String f4367b;

    /* renamed from: c */
    public final long f4368c;

    /* renamed from: d */
    public final List<bhu> f4369d;

    /* renamed from: e */
    private final String f4370e;

    /* renamed from: f */
    private final long f4371f;

    /* renamed from: g */
    private final bhw f4372g;

    private bhx(String str, long j, zzfs zzfs, String str2, bib bib, List<bhu> list) {
        List<bhu> list2;
        this.f4370e = str;
        this.f4371f = j;
        this.f4366a = zzfs;
        this.f4367b = str2;
        if (list == null) {
            list2 = Collections.emptyList();
        } else {
            list2 = Collections.unmodifiableList(list);
        }
        this.f4369d = list2;
        this.f4372g = bib.mo11968a(this);
        this.f4368c = bkp.m5813a(bib.f4381c, 1000000, bib.f4380b);
    }

    /* renamed from: d */
    public abstract bhw mo11965d();

    /* renamed from: e */
    public abstract bhl mo11966e();

    /* renamed from: f */
    public abstract String mo11967f();

    /* renamed from: c */
    public final bhw mo11964c() {
        return this.f4372g;
    }
}
