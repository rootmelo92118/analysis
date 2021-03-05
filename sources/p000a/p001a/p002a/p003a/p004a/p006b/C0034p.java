package p000a.p001a.p002a.p003a.p004a.p006b;

import android.content.Context;
import java.lang.reflect.Method;
import p000a.p001a.p002a.p003a.C0139c;
import p000a.p001a.p002a.p003a.C0153l;

/* renamed from: a.a.a.a.a.b.p */
/* compiled from: FirebaseAppImpl */
final class C0034p implements C0033o {

    /* renamed from: a */
    private final Method f51a;

    /* renamed from: b */
    private final Object f52b;

    /* renamed from: a */
    public static C0033o m98a(Context context) {
        try {
            Class<?> loadClass = context.getClassLoader().loadClass("com.google.firebase.FirebaseApp");
            return new C0034p(loadClass, loadClass.getDeclaredMethod("getInstance", new Class[0]).invoke(loadClass, new Object[0]));
        } catch (ClassNotFoundException unused) {
            C0139c.m394g().mo281a("Fabric", "Could not find class: com.google.firebase.FirebaseApp");
            return null;
        } catch (NoSuchMethodException e) {
            C0153l g = C0139c.m394g();
            g.mo281a("Fabric", "Could not find method: " + e.getMessage());
            return null;
        } catch (Exception e2) {
            C0139c.m394g().mo282a("Fabric", "Unexpected error loading FirebaseApp instance.", (Throwable) e2);
            return null;
        }
    }

    private C0034p(Class cls, Object obj) {
        this.f52b = obj;
        this.f51a = cls.getDeclaredMethod("isDataCollectionDefaultEnabled", new Class[0]);
    }

    /* renamed from: a */
    public boolean mo55a() {
        try {
            return ((Boolean) this.f51a.invoke(this.f52b, new Object[0])).booleanValue();
        } catch (Exception e) {
            C0139c.m394g().mo282a("Fabric", "Cannot check isDataCollectionDefaultEnabled on FirebaseApp.", (Throwable) e);
            return false;
        }
    }
}
