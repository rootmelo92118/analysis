package p000a.p001a.p002a.p003a;

import android.os.SystemClock;
import android.text.TextUtils;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.Callable;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import p000a.p001a.p002a.p003a.p004a.p006b.C0020i;

/* renamed from: a.a.a.a.e */
/* compiled from: FabricKitsFinder */
class C0144e implements Callable<Map<String, C0152k>> {

    /* renamed from: a */
    final String f329a;

    C0144e(String str) {
        this.f329a = str;
    }

    /* renamed from: a */
    public Map<String, C0152k> call() {
        HashMap hashMap = new HashMap();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        hashMap.putAll(m412c());
        hashMap.putAll(m413d());
        C0153l g = C0139c.m394g();
        g.mo284b("Fabric", "finish scanning in " + (SystemClock.elapsedRealtime() - elapsedRealtime));
        return hashMap;
    }

    /* renamed from: c */
    private Map<String, C0152k> m412c() {
        HashMap hashMap = new HashMap();
        try {
            Class.forName("com.google.android.gms.ads.AdView");
            C0152k kVar = new C0152k("com.google.firebase.firebase-ads", "0.0.0", "binary");
            hashMap.put(kVar.mo336a(), kVar);
            C0139c.m394g().mo284b("Fabric", "Found kit: com.google.firebase.firebase-ads");
        } catch (Exception unused) {
        }
        return hashMap;
    }

    /* renamed from: d */
    private Map<String, C0152k> m413d() {
        C0152k a;
        HashMap hashMap = new HashMap();
        ZipFile b = mo315b();
        Enumeration<? extends ZipEntry> entries = b.entries();
        while (entries.hasMoreElements()) {
            ZipEntry zipEntry = (ZipEntry) entries.nextElement();
            if (zipEntry.getName().startsWith("fabric/") && zipEntry.getName().length() > "fabric/".length() && (a = m411a(zipEntry, b)) != null) {
                hashMap.put(a.mo336a(), a);
                C0139c.m394g().mo284b("Fabric", String.format("Found kit:[%s] version:[%s]", new Object[]{a.mo336a(), a.mo337b()}));
            }
        }
        if (b != null) {
            try {
                b.close();
            } catch (IOException unused) {
            }
        }
        return hashMap;
    }

    /* renamed from: a */
    private C0152k m411a(ZipEntry zipEntry, ZipFile zipFile) {
        InputStream inputStream;
        try {
            inputStream = zipFile.getInputStream(zipEntry);
            try {
                Properties properties = new Properties();
                properties.load(inputStream);
                String property = properties.getProperty("fabric-identifier");
                String property2 = properties.getProperty("fabric-version");
                String property3 = properties.getProperty("fabric-build-type");
                if (TextUtils.isEmpty(property) || TextUtils.isEmpty(property2)) {
                    throw new IllegalStateException("Invalid format of fabric file," + zipEntry.getName());
                }
                C0152k kVar = new C0152k(property, property2, property3);
                C0020i.m57a((Closeable) inputStream);
                return kVar;
            } catch (IOException e) {
                e = e;
                try {
                    C0139c.m394g().mo291e("Fabric", "Error when parsing fabric properties " + zipEntry.getName(), e);
                    C0020i.m57a((Closeable) inputStream);
                    return null;
                } catch (Throwable th) {
                    th = th;
                    C0020i.m57a((Closeable) inputStream);
                    throw th;
                }
            }
        } catch (IOException e2) {
            e = e2;
            inputStream = null;
            C0139c.m394g().mo291e("Fabric", "Error when parsing fabric properties " + zipEntry.getName(), e);
            C0020i.m57a((Closeable) inputStream);
            return null;
        } catch (Throwable th2) {
            th = th2;
            inputStream = null;
            C0020i.m57a((Closeable) inputStream);
            throw th;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public ZipFile mo315b() {
        return new ZipFile(this.f329a);
    }
}
