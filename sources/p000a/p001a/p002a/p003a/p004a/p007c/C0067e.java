package p000a.p001a.p002a.p003a.p004a.p007c;

/* renamed from: a.a.a.a.a.c.e */
/* compiled from: Priority */
public enum C0067e {
    LOW,
    NORMAL,
    HIGH,
    IMMEDIATE;

    /* renamed from: a */
    static <Y> int m192a(C0073i iVar, Y y) {
        C0067e eVar;
        if (y instanceof C0073i) {
            eVar = ((C0073i) y).getPriority();
        } else {
            eVar = NORMAL;
        }
        return eVar.ordinal() - iVar.getPriority().ordinal();
    }
}
