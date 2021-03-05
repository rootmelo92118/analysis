package p000a.p001a.p002a.p003a.p004a.p011f;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import p000a.p001a.p002a.p003a.C0150i;

/* renamed from: a.a.a.a.a.f.d */
/* compiled from: PreferenceStoreImpl */
public class C0110d implements C0109c {

    /* renamed from: a */
    private final SharedPreferences f202a;

    /* renamed from: b */
    private final String f203b;

    /* renamed from: c */
    private final Context f204c;

    public C0110d(Context context, String str) {
        if (context != null) {
            this.f204c = context;
            this.f203b = str;
            this.f202a = this.f204c.getSharedPreferences(this.f203b, 0);
            return;
        }
        throw new IllegalStateException("Cannot get directory before context has been set. Call Fabric.with() first");
    }

    @Deprecated
    public C0110d(C0150i iVar) {
        this(iVar.getContext(), iVar.getClass().getName());
    }

    /* renamed from: a */
    public SharedPreferences mo256a() {
        return this.f202a;
    }

    /* renamed from: b */
    public SharedPreferences.Editor mo258b() {
        return this.f202a.edit();
    }

    @TargetApi(9)
    /* renamed from: a */
    public boolean mo257a(SharedPreferences.Editor editor) {
        if (Build.VERSION.SDK_INT < 9) {
            return editor.commit();
        }
        editor.apply();
        return true;
    }
}
