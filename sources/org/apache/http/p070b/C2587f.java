package org.apache.http.p070b;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.apache.http.C2581b;

/* renamed from: org.apache.http.b.f */
/* compiled from: HeaderGroup */
public class C2587f implements Serializable, Cloneable {
    private static final long serialVersionUID = 2608834160639271617L;

    /* renamed from: a */
    private final C2581b[] f9138a = new C2581b[0];

    /* renamed from: b */
    private final List<C2581b> f9139b = new ArrayList(16);

    /* renamed from: a */
    public void mo15826a() {
        this.f9139b.clear();
    }

    /* renamed from: a */
    public void mo15827a(C2581b[] bVarArr) {
        mo15826a();
        if (bVarArr != null) {
            Collections.addAll(this.f9139b, bVarArr);
        }
    }

    /* renamed from: b */
    public C2581b[] mo15828b() {
        return (C2581b[]) this.f9139b.toArray(new C2581b[this.f9139b.size()]);
    }

    public Object clone() {
        return super.clone();
    }

    public String toString() {
        return this.f9139b.toString();
    }
}
