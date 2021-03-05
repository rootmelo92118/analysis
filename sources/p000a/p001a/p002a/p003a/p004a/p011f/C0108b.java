package p000a.p001a.p002a.p003a.p004a.p011f;

import android.content.Context;
import java.io.File;
import p000a.p001a.p002a.p003a.C0139c;
import p000a.p001a.p002a.p003a.C0150i;

/* renamed from: a.a.a.a.a.f.b */
/* compiled from: FileStoreImpl */
public class C0108b implements C0107a {

    /* renamed from: a */
    private final Context f199a;

    /* renamed from: b */
    private final String f200b;

    /* renamed from: c */
    private final String f201c;

    public C0108b(C0150i iVar) {
        if (iVar.getContext() != null) {
            this.f199a = iVar.getContext();
            this.f200b = iVar.getPath();
            this.f201c = "Android/" + this.f199a.getPackageName();
            return;
        }
        throw new IllegalStateException("Cannot get directory before context has been set. Call Fabric.with() first");
    }

    /* renamed from: a */
    public File mo254a() {
        return mo255a(this.f199a.getFilesDir());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public File mo255a(File file) {
        if (file == null) {
            C0139c.m394g().mo281a("Fabric", "Null File");
            return null;
        } else if (file.exists() || file.mkdirs()) {
            return file;
        } else {
            C0139c.m394g().mo288d("Fabric", "Couldn't create file");
            return null;
        }
    }
}
