package p000a.p013b.p020e.p029h;

/* renamed from: a.b.e.h.a */
/* compiled from: ExceptionHelper */
public final class C0224a {

    /* renamed from: a */
    public static final Throwable f467a = new Throwable("No further exceptions") {
        private static final long serialVersionUID = -4649703670690200604L;

        public Throwable fillInStackTrace() {
            return this;
        }
    };

    /* renamed from: a */
    public static RuntimeException m615a(Throwable th) {
        if (th instanceof Error) {
            throw ((Error) th);
        } else if (th instanceof RuntimeException) {
            return (RuntimeException) th;
        } else {
            return new RuntimeException(th);
        }
    }
}
