package com.google.android.gms.internal.ads;

import java.io.InputStream;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.pb */
public final class C1559pb {

    /* renamed from: a */
    private final int f6153a;

    /* renamed from: b */
    private final List<bff> f6154b;

    /* renamed from: c */
    private final int f6155c;

    /* renamed from: d */
    private final InputStream f6156d;

    public C1559pb(int i, List<bff> list) {
        this(i, list, -1, (InputStream) null);
    }

    public C1559pb(int i, List<bff> list, int i2, InputStream inputStream) {
        this.f6153a = i;
        this.f6154b = list;
        this.f6155c = i2;
        this.f6156d = inputStream;
    }

    /* renamed from: a */
    public final int mo12868a() {
        return this.f6153a;
    }

    /* renamed from: b */
    public final List<bff> mo12869b() {
        return Collections.unmodifiableList(this.f6154b);
    }

    /* renamed from: c */
    public final int mo12870c() {
        return this.f6155c;
    }

    /* renamed from: d */
    public final InputStream mo12871d() {
        return this.f6156d;
    }
}
