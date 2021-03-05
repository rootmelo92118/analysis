package com.google.android.gms.internal.ads;

import java.util.NoSuchElementException;

final class apd implements apj {

    /* renamed from: a */
    private int f2178a = 0;

    /* renamed from: b */
    private final int f2179b = this.f2180c.mo10792a();

    /* renamed from: c */
    private final /* synthetic */ apc f2180c;

    apd(apc apc) {
        this.f2180c = apc;
    }

    public final boolean hasNext() {
        return this.f2178a < this.f2179b;
    }

    /* renamed from: a */
    public final byte mo10807a() {
        try {
            apc apc = this.f2180c;
            int i = this.f2178a;
            this.f2178a = i + 1;
            return apc.mo10791a(i);
        } catch (IndexOutOfBoundsException e) {
            throw new NoSuchElementException(e.getMessage());
        }
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public final /* synthetic */ Object next() {
        return Byte.valueOf(mo10807a());
    }
}
