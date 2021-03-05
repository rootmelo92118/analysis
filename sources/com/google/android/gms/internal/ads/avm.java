package com.google.android.gms.internal.ads;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class avm implements ace, Closeable, Iterator<abe> {

    /* renamed from: f */
    private static final abe f2707f = new avn("eof ");

    /* renamed from: g */
    private static avv f2708g = avv.m4301a(avm.class);

    /* renamed from: a */
    protected C1802yb f2709a;

    /* renamed from: b */
    protected avp f2710b;

    /* renamed from: c */
    long f2711c = 0;

    /* renamed from: d */
    long f2712d = 0;

    /* renamed from: e */
    long f2713e = 0;

    /* renamed from: h */
    private abe f2714h = null;

    /* renamed from: i */
    private List<abe> f2715i = new ArrayList();

    /* renamed from: b */
    public final List<abe> mo11308b() {
        if (this.f2710b == null || this.f2714h == f2707f) {
            return this.f2715i;
        }
        return new avt(this.f2715i, this);
    }

    /* renamed from: a */
    public void mo11305a(avp avp, long j, C1802yb ybVar) {
        this.f2710b = avp;
        long b = avp.mo10278b();
        this.f2712d = b;
        this.f2711c = b;
        avp.mo10277a(avp.mo10278b() + j);
        this.f2713e = avp.mo10278b();
        this.f2709a = ybVar;
    }

    public void remove() {
        throw new UnsupportedOperationException();
    }

    public boolean hasNext() {
        if (this.f2714h == f2707f) {
            return false;
        }
        if (this.f2714h != null) {
            return true;
        }
        try {
            this.f2714h = (abe) next();
            return true;
        } catch (NoSuchElementException unused) {
            this.f2714h = f2707f;
            return false;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final abe next() {
        abe a;
        if (this.f2714h != null && this.f2714h != f2707f) {
            abe abe = this.f2714h;
            this.f2714h = null;
            return abe;
        } else if (this.f2710b == null || this.f2711c >= this.f2713e) {
            this.f2714h = f2707f;
            throw new NoSuchElementException();
        } else {
            try {
                synchronized (this.f2710b) {
                    this.f2710b.mo10277a(this.f2711c);
                    a = this.f2709a.mo13089a(this.f2710b, this);
                    this.f2711c = this.f2710b.mo10278b();
                }
                return a;
            } catch (EOFException unused) {
                throw new NoSuchElementException();
            } catch (IOException unused2) {
                throw new NoSuchElementException();
            }
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("[");
        for (int i = 0; i < this.f2715i.size(); i++) {
            if (i > 0) {
                sb.append(";");
            }
            sb.append(this.f2715i.get(i).toString());
        }
        sb.append("]");
        return sb.toString();
    }

    public void close() {
        this.f2710b.close();
    }
}
