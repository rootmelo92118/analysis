package p000a.p001a.p002a.p003a.p004a.p006b;

/* renamed from: a.a.a.a.a.b.b */
/* compiled from: AdvertisingInfo */
class C0009b {

    /* renamed from: a */
    public final String f8a;

    /* renamed from: b */
    public final boolean f9b;

    C0009b(String str, boolean z) {
        this.f8a = str;
        this.f9b = z;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C0009b bVar = (C0009b) obj;
        if (this.f9b != bVar.f9b) {
            return false;
        }
        return this.f8a == null ? bVar.f8a == null : this.f8a.equals(bVar.f8a);
    }

    public int hashCode() {
        return ((this.f8a != null ? this.f8a.hashCode() : 0) * 31) + (this.f9b ? 1 : 0);
    }
}
