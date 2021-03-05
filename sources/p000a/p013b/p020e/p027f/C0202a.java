package p000a.p013b.p020e.p027f;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;
import p000a.p013b.p020e.p023c.C0191c;
import p000a.p013b.p020e.p029h.C0227c;

/* renamed from: a.b.e.f.a */
/* compiled from: SpscLinkedArrayQueue */
public final class C0202a<T> implements C0191c<T> {

    /* renamed from: a */
    static final int f395a = Integer.getInteger("jctools.spsc.max.lookahead.step", 4096).intValue();

    /* renamed from: j */
    private static final Object f396j = new Object();

    /* renamed from: b */
    final AtomicLong f397b = new AtomicLong();

    /* renamed from: c */
    int f398c;

    /* renamed from: d */
    long f399d;

    /* renamed from: e */
    final int f400e;

    /* renamed from: f */
    AtomicReferenceArray<Object> f401f;

    /* renamed from: g */
    final int f402g;

    /* renamed from: h */
    AtomicReferenceArray<Object> f403h;

    /* renamed from: i */
    final AtomicLong f404i = new AtomicLong();

    /* renamed from: b */
    private static int m560b(int i) {
        return i;
    }

    public C0202a(int i) {
        int a = C0227c.m622a(Math.max(8, i));
        int i2 = a - 1;
        AtomicReferenceArray<Object> atomicReferenceArray = new AtomicReferenceArray<>(a + 1);
        this.f401f = atomicReferenceArray;
        this.f400e = i2;
        m554a(a);
        this.f403h = atomicReferenceArray;
        this.f402g = i2;
        this.f399d = (long) (i2 - 1);
        m555a(0);
    }

    /* renamed from: a */
    public boolean mo378a(T t) {
        if (t != null) {
            AtomicReferenceArray<Object> atomicReferenceArray = this.f401f;
            long f = m563f();
            int i = this.f400e;
            int a = m549a(f, i);
            if (f < this.f399d) {
                return m559a(atomicReferenceArray, t, f, a);
            }
            long j = ((long) this.f398c) + f;
            if (m551a(atomicReferenceArray, m549a(j, i)) == null) {
                this.f399d = j - 1;
                return m559a(atomicReferenceArray, t, f, a);
            } else if (m551a(atomicReferenceArray, m549a(1 + f, i)) == null) {
                return m559a(atomicReferenceArray, t, f, a);
            } else {
                m557a(atomicReferenceArray, f, a, t, (long) i);
                return true;
            }
        } else {
            throw new NullPointerException("Null is not a valid element");
        }
    }

    /* renamed from: a */
    private boolean m559a(AtomicReferenceArray<Object> atomicReferenceArray, T t, long j, int i) {
        m556a(atomicReferenceArray, i, (Object) t);
        m555a(j + 1);
        return true;
    }

    /* renamed from: a */
    private void m557a(AtomicReferenceArray<Object> atomicReferenceArray, long j, int i, T t, long j2) {
        AtomicReferenceArray<Object> atomicReferenceArray2 = new AtomicReferenceArray<>(atomicReferenceArray.length());
        this.f401f = atomicReferenceArray2;
        this.f399d = (j2 + j) - 1;
        m556a(atomicReferenceArray2, i, (Object) t);
        m558a(atomicReferenceArray, atomicReferenceArray2);
        m556a(atomicReferenceArray, i, f396j);
        m555a(j + 1);
    }

    /* renamed from: a */
    private void m558a(AtomicReferenceArray<Object> atomicReferenceArray, AtomicReferenceArray<Object> atomicReferenceArray2) {
        m556a(atomicReferenceArray, m560b(atomicReferenceArray.length() - 1), (Object) atomicReferenceArray2);
    }

    /* renamed from: a */
    private AtomicReferenceArray<Object> m553a(AtomicReferenceArray<Object> atomicReferenceArray) {
        return (AtomicReferenceArray) m551a(atomicReferenceArray, m560b(atomicReferenceArray.length() - 1));
    }

    /* renamed from: b */
    public T mo379b() {
        AtomicReferenceArray<Object> atomicReferenceArray = this.f403h;
        long g = m564g();
        int i = this.f402g;
        int a = m549a(g, i);
        T a2 = m551a(atomicReferenceArray, a);
        boolean z = a2 == f396j;
        if (a2 != null && !z) {
            m556a(atomicReferenceArray, a, (Object) null);
            m561b(g + 1);
            return a2;
        } else if (z) {
            return m552a(m553a(atomicReferenceArray), g, i);
        } else {
            return null;
        }
    }

    /* renamed from: a */
    private T m552a(AtomicReferenceArray<Object> atomicReferenceArray, long j, int i) {
        this.f403h = atomicReferenceArray;
        int a = m549a(j, i);
        T a2 = m551a(atomicReferenceArray, a);
        if (a2 != null) {
            m556a(atomicReferenceArray, a, (Object) null);
            m561b(j + 1);
        }
        return a2;
    }

    /* renamed from: d */
    public void mo381d() {
        while (true) {
            if (mo379b() == null && mo380c()) {
                return;
            }
        }
    }

    /* renamed from: c */
    public boolean mo380c() {
        return m550a() == m562e();
    }

    /* renamed from: a */
    private void m554a(int i) {
        this.f398c = Math.min(i / 4, f395a);
    }

    /* renamed from: a */
    private long m550a() {
        return this.f397b.get();
    }

    /* renamed from: e */
    private long m562e() {
        return this.f404i.get();
    }

    /* renamed from: f */
    private long m563f() {
        return this.f397b.get();
    }

    /* renamed from: g */
    private long m564g() {
        return this.f404i.get();
    }

    /* renamed from: a */
    private void m555a(long j) {
        this.f397b.lazySet(j);
    }

    /* renamed from: b */
    private void m561b(long j) {
        this.f404i.lazySet(j);
    }

    /* renamed from: a */
    private static int m549a(long j, int i) {
        return m560b(((int) j) & i);
    }

    /* renamed from: a */
    private static void m556a(AtomicReferenceArray<Object> atomicReferenceArray, int i, Object obj) {
        atomicReferenceArray.lazySet(i, obj);
    }

    /* renamed from: a */
    private static <E> Object m551a(AtomicReferenceArray<Object> atomicReferenceArray, int i) {
        return atomicReferenceArray.get(i);
    }
}
