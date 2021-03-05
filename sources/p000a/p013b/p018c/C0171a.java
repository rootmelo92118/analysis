package p000a.p013b.p018c;

import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;

/* renamed from: a.b.c.a */
/* compiled from: CompositeException */
public final class C0171a extends RuntimeException {
    private static final long serialVersionUID = 3026362227162912146L;

    /* renamed from: a */
    private final List<Throwable> f360a;

    /* renamed from: b */
    private final String f361b;

    /* renamed from: c */
    private Throwable f362c;

    public C0171a(Iterable<? extends Throwable> iterable) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        ArrayList arrayList = new ArrayList();
        if (iterable != null) {
            for (Throwable th : iterable) {
                if (th instanceof C0171a) {
                    linkedHashSet.addAll(((C0171a) th).mo365a());
                } else if (th != null) {
                    linkedHashSet.add(th);
                } else {
                    linkedHashSet.add(new NullPointerException("Throwable was null!"));
                }
            }
        } else {
            linkedHashSet.add(new NullPointerException("errors was null"));
        }
        if (!linkedHashSet.isEmpty()) {
            arrayList.addAll(linkedHashSet);
            this.f360a = Collections.unmodifiableList(arrayList);
            this.f361b = this.f360a.size() + " exceptions occurred. ";
            return;
        }
        throw new IllegalArgumentException("errors is empty");
    }

    /* renamed from: a */
    public List<Throwable> mo365a() {
        return this.f360a;
    }

    public String getMessage() {
        return this.f361b;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:10|(4:13|(2:15|33)(2:16|34)|32|11)|17|18|19|20|31) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0055 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized java.lang.Throwable getCause() {
        /*
            r8 = this;
            monitor-enter(r8)
            java.lang.Throwable r0 = r8.f362c     // Catch:{ all -> 0x0060 }
            if (r0 != 0) goto L_0x005c
            a.b.c.a$a r0 = new a.b.c.a$a     // Catch:{ all -> 0x0060 }
            r0.<init>()     // Catch:{ all -> 0x0060 }
            java.util.HashSet r1 = new java.util.HashSet     // Catch:{ all -> 0x0060 }
            r1.<init>()     // Catch:{ all -> 0x0060 }
            java.util.List<java.lang.Throwable> r2 = r8.f360a     // Catch:{ all -> 0x0060 }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x0060 }
            r3 = r0
        L_0x0016:
            boolean r4 = r2.hasNext()     // Catch:{ all -> 0x0060 }
            if (r4 == 0) goto L_0x005a
            java.lang.Object r4 = r2.next()     // Catch:{ all -> 0x0060 }
            java.lang.Throwable r4 = (java.lang.Throwable) r4     // Catch:{ all -> 0x0060 }
            boolean r5 = r1.contains(r4)     // Catch:{ all -> 0x0060 }
            if (r5 == 0) goto L_0x0029
            goto L_0x0016
        L_0x0029:
            r1.add(r4)     // Catch:{ all -> 0x0060 }
            java.util.List r5 = r8.m488a((java.lang.Throwable) r4)     // Catch:{ all -> 0x0060 }
            java.util.Iterator r5 = r5.iterator()     // Catch:{ all -> 0x0060 }
        L_0x0034:
            boolean r6 = r5.hasNext()     // Catch:{ all -> 0x0060 }
            if (r6 == 0) goto L_0x0052
            java.lang.Object r6 = r5.next()     // Catch:{ all -> 0x0060 }
            java.lang.Throwable r6 = (java.lang.Throwable) r6     // Catch:{ all -> 0x0060 }
            boolean r7 = r1.contains(r6)     // Catch:{ all -> 0x0060 }
            if (r7 == 0) goto L_0x004e
            java.lang.RuntimeException r4 = new java.lang.RuntimeException     // Catch:{ all -> 0x0060 }
            java.lang.String r6 = "Duplicate found in causal chain so cropping to prevent loop ..."
            r4.<init>(r6)     // Catch:{ all -> 0x0060 }
            goto L_0x0034
        L_0x004e:
            r1.add(r6)     // Catch:{ all -> 0x0060 }
            goto L_0x0034
        L_0x0052:
            r3.initCause(r4)     // Catch:{ Throwable -> 0x0055 }
        L_0x0055:
            java.lang.Throwable r3 = r8.m491b(r3)     // Catch:{ all -> 0x0060 }
            goto L_0x0016
        L_0x005a:
            r8.f362c = r0     // Catch:{ all -> 0x0060 }
        L_0x005c:
            java.lang.Throwable r0 = r8.f362c     // Catch:{ all -> 0x0060 }
            monitor-exit(r8)
            return r0
        L_0x0060:
            r0 = move-exception
            monitor-exit(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p013b.p018c.C0171a.getCause():java.lang.Throwable");
    }

    public void printStackTrace() {
        printStackTrace(System.err);
    }

    public void printStackTrace(PrintStream printStream) {
        m489a((C0173b) new C0174c(printStream));
    }

    public void printStackTrace(PrintWriter printWriter) {
        m489a((C0173b) new C0175d(printWriter));
    }

    /* renamed from: a */
    private void m489a(C0173b bVar) {
        StringBuilder sb = new StringBuilder(128);
        sb.append(this);
        sb.append(10);
        for (StackTraceElement append : getStackTrace()) {
            sb.append("\tat ");
            sb.append(append);
            sb.append(10);
        }
        int i = 1;
        for (Throwable a : this.f360a) {
            sb.append("  ComposedException ");
            sb.append(i);
            sb.append(" :\n");
            m490a(sb, a, "\t");
            i++;
        }
        bVar.mo372a(sb.toString());
    }

    /* renamed from: a */
    private void m490a(StringBuilder sb, Throwable th, String str) {
        sb.append(str);
        sb.append(th);
        sb.append(10);
        for (StackTraceElement append : th.getStackTrace()) {
            sb.append("\t\tat ");
            sb.append(append);
            sb.append(10);
        }
        if (th.getCause() != null) {
            sb.append("\tCaused by: ");
            m490a(sb, th.getCause(), "");
        }
    }

    /* renamed from: a.b.c.a$b */
    /* compiled from: CompositeException */
    static abstract class C0173b {
        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public abstract void mo372a(Object obj);

        C0173b() {
        }
    }

    /* renamed from: a.b.c.a$c */
    /* compiled from: CompositeException */
    static final class C0174c extends C0173b {

        /* renamed from: a */
        private final PrintStream f363a;

        C0174c(PrintStream printStream) {
            this.f363a = printStream;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo372a(Object obj) {
            this.f363a.println(obj);
        }
    }

    /* renamed from: a.b.c.a$d */
    /* compiled from: CompositeException */
    static final class C0175d extends C0173b {

        /* renamed from: a */
        private final PrintWriter f364a;

        C0175d(PrintWriter printWriter) {
            this.f364a = printWriter;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo372a(Object obj) {
            this.f364a.println(obj);
        }
    }

    /* renamed from: a.b.c.a$a */
    /* compiled from: CompositeException */
    static final class C0172a extends RuntimeException {
        private static final long serialVersionUID = 3875212506787802066L;

        public String getMessage() {
            return "Chain of Causes for CompositeException In Order Received =>";
        }

        C0172a() {
        }
    }

    /* renamed from: a */
    private List<Throwable> m488a(Throwable th) {
        ArrayList arrayList = new ArrayList();
        Throwable cause = th.getCause();
        if (cause == null || cause == th) {
            return arrayList;
        }
        while (true) {
            arrayList.add(cause);
            Throwable cause2 = cause.getCause();
            if (cause2 == null || cause2 == cause) {
                return arrayList;
            }
            cause = cause2;
        }
        return arrayList;
    }

    /* renamed from: b */
    private Throwable m491b(Throwable th) {
        Throwable cause = th.getCause();
        if (cause == null || this.f362c == cause) {
            return th;
        }
        while (true) {
            Throwable cause2 = cause.getCause();
            if (cause2 == null || cause2 == cause) {
                return cause;
            }
            cause = cause2;
        }
        return cause;
    }
}
