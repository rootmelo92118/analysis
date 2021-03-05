package p000a.p001a.p002a.p003a.p004a.p012g;

import android.content.Context;
import android.graphics.BitmapFactory;
import p000a.p001a.p002a.p003a.C0139c;
import p000a.p001a.p002a.p003a.C0153l;
import p000a.p001a.p002a.p003a.p004a.p006b.C0020i;

/* renamed from: a.a.a.a.a.g.n */
/* compiled from: IconRequest */
public class C0124n {

    /* renamed from: a */
    public final String f252a;

    /* renamed from: b */
    public final int f253b;

    /* renamed from: c */
    public final int f254c;

    /* renamed from: d */
    public final int f255d;

    public C0124n(String str, int i, int i2, int i3) {
        this.f252a = str;
        this.f253b = i;
        this.f254c = i2;
        this.f255d = i3;
    }

    /* renamed from: a */
    public static C0124n m356a(Context context, String str) {
        if (str != null) {
            try {
                int l = C0020i.m81l(context);
                C0153l g = C0139c.m394g();
                g.mo281a("Fabric", "App icon resource ID is " + l);
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeResource(context.getResources(), l, options);
                return new C0124n(str, l, options.outWidth, options.outHeight);
            } catch (Exception e) {
                C0139c.m394g().mo291e("Fabric", "Failed to load icon", e);
            }
        }
        return null;
    }
}
