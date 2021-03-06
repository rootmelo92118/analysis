package p000a.p001a.p002a.p003a.p004a.p012g;

import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.InputStream;
import org.json.JSONObject;
import p000a.p001a.p002a.p003a.C0139c;
import p000a.p001a.p002a.p003a.C0150i;
import p000a.p001a.p002a.p003a.p004a.p006b.C0020i;
import p000a.p001a.p002a.p003a.p004a.p011f.C0108b;

/* renamed from: a.a.a.a.a.g.i */
/* compiled from: DefaultCachedSettingsIo */
class C0119i implements C0117g {

    /* renamed from: a */
    private final C0150i f239a;

    public C0119i(C0150i iVar) {
        this.f239a = iVar;
    }

    /* renamed from: a */
    public JSONObject mo262a() {
        Throwable th;
        FileInputStream fileInputStream;
        JSONObject jSONObject;
        C0139c.m394g().mo281a("Fabric", "Reading cached settings...");
        FileInputStream fileInputStream2 = null;
        try {
            File file = new File(new C0108b(this.f239a).mo254a(), "com.crashlytics.settings.json");
            if (file.exists()) {
                fileInputStream = new FileInputStream(file);
                try {
                    jSONObject = new JSONObject(C0020i.m47a((InputStream) fileInputStream));
                    fileInputStream2 = fileInputStream;
                } catch (Exception e) {
                    e = e;
                    try {
                        C0139c.m394g().mo291e("Fabric", "Failed to fetch cached settings", e);
                        C0020i.m58a((Closeable) fileInputStream, "Error while closing settings cache file.");
                        return null;
                    } catch (Throwable th2) {
                        th = th2;
                        fileInputStream2 = fileInputStream;
                        C0020i.m58a((Closeable) fileInputStream2, "Error while closing settings cache file.");
                        throw th;
                    }
                }
            } else {
                C0139c.m394g().mo281a("Fabric", "No cached settings found.");
                jSONObject = null;
            }
            C0020i.m58a((Closeable) fileInputStream2, "Error while closing settings cache file.");
            return jSONObject;
        } catch (Exception e2) {
            e = e2;
            fileInputStream = null;
            C0139c.m394g().mo291e("Fabric", "Failed to fetch cached settings", e);
            C0020i.m58a((Closeable) fileInputStream, "Error while closing settings cache file.");
            return null;
        } catch (Throwable th3) {
            th = th3;
            C0020i.m58a((Closeable) fileInputStream2, "Error while closing settings cache file.");
            throw th;
        }
    }

    /* renamed from: a */
    public void mo263a(long j, JSONObject jSONObject) {
        C0139c.m394g().mo281a("Fabric", "Writing settings to cache file...");
        if (jSONObject != null) {
            FileWriter fileWriter = null;
            try {
                jSONObject.put("expires_at", j);
                FileWriter fileWriter2 = new FileWriter(new File(new C0108b(this.f239a).mo254a(), "com.crashlytics.settings.json"));
                try {
                    fileWriter2.write(jSONObject.toString());
                    fileWriter2.flush();
                    C0020i.m58a((Closeable) fileWriter2, "Failed to close settings writer.");
                } catch (Exception e) {
                    e = e;
                    fileWriter = fileWriter2;
                    try {
                        C0139c.m394g().mo291e("Fabric", "Failed to cache settings", e);
                        C0020i.m58a((Closeable) fileWriter, "Failed to close settings writer.");
                    } catch (Throwable th) {
                        th = th;
                        C0020i.m58a((Closeable) fileWriter, "Failed to close settings writer.");
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    fileWriter = fileWriter2;
                    C0020i.m58a((Closeable) fileWriter, "Failed to close settings writer.");
                    throw th;
                }
            } catch (Exception e2) {
                e = e2;
                C0139c.m394g().mo291e("Fabric", "Failed to cache settings", e);
                C0020i.m58a((Closeable) fileWriter, "Failed to close settings writer.");
            }
        }
    }
}
