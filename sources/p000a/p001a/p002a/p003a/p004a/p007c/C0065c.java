package p000a.p001a.p002a.p003a.p004a.p007c;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;
import p000a.p001a.p002a.p003a.p004a.p007c.C0064b;
import p000a.p001a.p002a.p003a.p004a.p007c.C0073i;
import p000a.p001a.p002a.p003a.p004a.p007c.C0077l;

/* renamed from: a.a.a.a.a.c.c */
/* compiled from: DependencyPriorityBlockingQueue */
public class C0065c<E extends C0064b & C0077l & C0073i> extends PriorityBlockingQueue<E> {

    /* renamed from: a */
    final Queue<E> f135a = new LinkedList();

    /* renamed from: b */
    private final ReentrantLock f136b = new ReentrantLock();

    /* renamed from: a */
    public E take() {
        return mo124b(0, (Long) null, (TimeUnit) null);
    }

    /* renamed from: b */
    public E peek() {
        try {
            return mo124b(1, (Long) null, (TimeUnit) null);
        } catch (InterruptedException unused) {
            return null;
        }
    }

    /* renamed from: a */
    public E poll(long j, TimeUnit timeUnit) {
        return mo124b(3, Long.valueOf(j), timeUnit);
    }

    /* renamed from: c */
    public E poll() {
        try {
            return mo124b(2, (Long) null, (TimeUnit) null);
        } catch (InterruptedException unused) {
            return null;
        }
    }

    public int size() {
        try {
            this.f136b.lock();
            return this.f135a.size() + super.size();
        } finally {
            this.f136b.unlock();
        }
    }

    public <T> T[] toArray(T[] tArr) {
        try {
            this.f136b.lock();
            return mo122a((T[]) super.toArray(tArr), (T[]) this.f135a.toArray(tArr));
        } finally {
            this.f136b.unlock();
        }
    }

    public Object[] toArray() {
        try {
            this.f136b.lock();
            return mo122a((T[]) super.toArray(), (T[]) this.f135a.toArray());
        } finally {
            this.f136b.unlock();
        }
    }

    public int drainTo(Collection<? super E> collection) {
        try {
            this.f136b.lock();
            int drainTo = super.drainTo(collection) + this.f135a.size();
            while (!this.f135a.isEmpty()) {
                collection.add(this.f135a.poll());
            }
            return drainTo;
        } finally {
            this.f136b.unlock();
        }
    }

    public int drainTo(Collection<? super E> collection, int i) {
        try {
            this.f136b.lock();
            int drainTo = super.drainTo(collection, i);
            while (!this.f135a.isEmpty() && drainTo <= i) {
                collection.add(this.f135a.poll());
                drainTo++;
            }
            return drainTo;
        } finally {
            this.f136b.unlock();
        }
    }

    public boolean contains(Object obj) {
        try {
            this.f136b.lock();
            return super.contains(obj) || this.f135a.contains(obj);
        } finally {
            this.f136b.unlock();
        }
    }

    public void clear() {
        try {
            this.f136b.lock();
            this.f135a.clear();
            super.clear();
        } finally {
            this.f136b.unlock();
        }
    }

    public boolean remove(Object obj) {
        try {
            this.f136b.lock();
            return super.remove(obj) || this.f135a.remove(obj);
        } finally {
            this.f136b.unlock();
        }
    }

    public boolean removeAll(Collection<?> collection) {
        try {
            this.f136b.lock();
            return this.f135a.removeAll(collection) | super.removeAll(collection);
        } finally {
            this.f136b.unlock();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public E mo118a(int i, Long l, TimeUnit timeUnit) {
        switch (i) {
            case 0:
                return (C0064b) super.take();
            case 1:
                return (C0064b) super.peek();
            case 2:
                return (C0064b) super.poll();
            case 3:
                return (C0064b) super.poll(l.longValue(), timeUnit);
            default:
                return null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo120a(int i, E e) {
        try {
            this.f136b.lock();
            if (i == 1) {
                super.remove(e);
            }
            return this.f135a.offer(e);
        } finally {
            this.f136b.unlock();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public E mo124b(int i, Long l, TimeUnit timeUnit) {
        E a;
        while (true) {
            a = mo118a(i, l, timeUnit);
            if (a == null || mo121a(a)) {
                return a;
            }
            mo120a(i, a);
        }
        return a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo121a(E e) {
        return e.areDependenciesMet();
    }

    /* renamed from: d */
    public void mo128d() {
        try {
            this.f136b.lock();
            Iterator it = this.f135a.iterator();
            while (it.hasNext()) {
                C0064b bVar = (C0064b) it.next();
                if (mo121a(bVar)) {
                    super.offer(bVar);
                    it.remove();
                }
            }
        } finally {
            this.f136b.unlock();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public <T> T[] mo122a(T[] tArr, T[] tArr2) {
        int length = tArr.length;
        int length2 = tArr2.length;
        T[] tArr3 = (Object[]) Array.newInstance(tArr.getClass().getComponentType(), length + length2);
        System.arraycopy(tArr, 0, tArr3, 0, length);
        System.arraycopy(tArr2, 0, tArr3, length, length2);
        return tArr3;
    }
}
