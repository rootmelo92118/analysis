package com.google.android.gms.internal.p045c;

/* renamed from: com.google.android.gms.internal.c.g */
final class C1873g extends C1870d {

    /* renamed from: a */
    private final C1871e f7324a = new C1871e();

    C1873g() {
    }

    /* renamed from: a */
    public final void mo13486a(Throwable th, Throwable th2) {
        if (th2 == th) {
            throw new IllegalArgumentException("Self suppression is not allowed.", th2);
        } else if (th2 != null) {
            this.f7324a.mo13487a(th, true).add(th2);
        } else {
            throw new NullPointerException("The suppressed exception cannot be null.");
        }
    }
}
