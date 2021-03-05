package com.google.android.gms.common.api.internal;

/* renamed from: com.google.android.gms.common.api.internal.f */
public final class C0822f<L> {

    /* renamed from: a */
    private volatile L f896a;

    /* renamed from: com.google.android.gms.common.api.internal.f$a */
    public static final class C0823a<L> {

        /* renamed from: a */
        private final L f897a;

        /* renamed from: b */
        private final String f898b;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0823a)) {
                return false;
            }
            C0823a aVar = (C0823a) obj;
            return this.f897a == aVar.f897a && this.f898b.equals(aVar.f898b);
        }

        public final int hashCode() {
            return (System.identityHashCode(this.f897a) * 31) + this.f898b.hashCode();
        }
    }

    /* renamed from: a */
    public final void mo9676a() {
        this.f896a = null;
    }
}
