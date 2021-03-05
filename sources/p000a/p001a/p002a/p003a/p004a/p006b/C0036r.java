package p000a.p001a.p002a.p003a.p004a.p006b;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.text.TextUtils;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.locks.ReentrantLock;
import java.util.regex.Pattern;
import p000a.p001a.p002a.p003a.C0139c;
import p000a.p001a.p002a.p003a.C0150i;
import p000a.p001a.p002a.p003a.C0153l;

/* renamed from: a.a.a.a.a.b.r */
/* compiled from: IdManager */
public class C0036r {

    /* renamed from: e */
    private static final Pattern f53e = Pattern.compile("[^\\p{Alnum}]");

    /* renamed from: f */
    private static final String f54f = Pattern.quote("/");

    /* renamed from: a */
    C0010c f55a;

    /* renamed from: b */
    C0009b f56b;

    /* renamed from: c */
    boolean f57c;

    /* renamed from: d */
    C0035q f58d;

    /* renamed from: g */
    private final ReentrantLock f59g = new ReentrantLock();

    /* renamed from: h */
    private final C0038s f60h;

    /* renamed from: i */
    private final boolean f61i;

    /* renamed from: j */
    private final boolean f62j;

    /* renamed from: k */
    private final Context f63k;

    /* renamed from: l */
    private final String f64l;

    /* renamed from: m */
    private final String f65m;

    /* renamed from: n */
    private final Collection<C0150i> f66n;

    /* renamed from: a.a.a.a.a.b.r$a */
    /* compiled from: IdManager */
    public enum C0037a {
        WIFI_MAC_ADDRESS(1),
        BLUETOOTH_MAC_ADDRESS(2),
        FONT_TOKEN(53),
        ANDROID_ID(100),
        ANDROID_DEVICE_ID(101),
        ANDROID_SERIAL(102),
        ANDROID_ADVERTISING_ID(103);
        

        /* renamed from: h */
        public final int f75h;

        private C0037a(int i) {
            this.f75h = i;
        }
    }

    public C0036r(Context context, String str, String str2, Collection<C0150i> collection) {
        if (context == null) {
            throw new IllegalArgumentException("appContext must not be null");
        } else if (str == null) {
            throw new IllegalArgumentException("appIdentifier must not be null");
        } else if (collection != null) {
            this.f63k = context;
            this.f64l = str;
            this.f65m = str2;
            this.f66n = collection;
            this.f60h = new C0038s();
            this.f55a = new C0010c(context);
            this.f58d = new C0035q();
            this.f61i = C0020i.m61a(context, "com.crashlytics.CollectDeviceIdentifiers", true);
            if (!this.f61i) {
                C0153l g = C0139c.m394g();
                g.mo281a("Fabric", "Device ID collection disabled for " + context.getPackageName());
            }
            this.f62j = C0020i.m61a(context, "com.crashlytics.CollectUserIdentifiers", true);
            if (!this.f62j) {
                C0153l g2 = C0139c.m394g();
                g2.mo281a("Fabric", "User information collection disabled for " + context.getPackageName());
            }
        } else {
            throw new IllegalArgumentException("kits must not be null");
        }
    }

    /* renamed from: a */
    public boolean mo63a() {
        return this.f62j;
    }

    /* renamed from: a */
    private String m108a(String str) {
        if (str == null) {
            return null;
        }
        return f53e.matcher(str).replaceAll("").toLowerCase(Locale.US);
    }

    /* renamed from: b */
    public String mo64b() {
        String str = this.f65m;
        if (str != null) {
            return str;
        }
        SharedPreferences a = C0020i.m44a(this.f63k);
        m112b(a);
        String string = a.getString("crashlytics.installation.id", (String) null);
        return string == null ? m107a(a) : string;
    }

    /* renamed from: c */
    public String mo65c() {
        return this.f64l;
    }

    /* renamed from: d */
    public String mo66d() {
        return mo67e() + "/" + mo68f();
    }

    /* renamed from: e */
    public String mo67e() {
        return m111b(Build.VERSION.RELEASE);
    }

    /* renamed from: f */
    public String mo68f() {
        return m111b(Build.VERSION.INCREMENTAL);
    }

    /* renamed from: g */
    public String mo69g() {
        return String.format(Locale.US, "%s/%s", new Object[]{m111b(Build.MANUFACTURER), m111b(Build.MODEL)});
    }

    /* renamed from: b */
    private String m111b(String str) {
        return str.replaceAll(f54f, "");
    }

    @SuppressLint({"CommitPrefEdits"})
    /* renamed from: a */
    private String m107a(SharedPreferences sharedPreferences) {
        this.f59g.lock();
        try {
            String string = sharedPreferences.getString("crashlytics.installation.id", (String) null);
            if (string == null) {
                string = m108a(UUID.randomUUID().toString());
                sharedPreferences.edit().putString("crashlytics.installation.id", string).commit();
            }
            return string;
        } finally {
            this.f59g.unlock();
        }
    }

    /* renamed from: b */
    private void m112b(SharedPreferences sharedPreferences) {
        C0009b l = mo74l();
        if (l != null) {
            m109a(sharedPreferences, l.f8a);
        }
    }

    @SuppressLint({"CommitPrefEdits"})
    /* renamed from: a */
    private void m109a(SharedPreferences sharedPreferences, String str) {
        this.f59g.lock();
        try {
            if (!TextUtils.isEmpty(str)) {
                String string = sharedPreferences.getString("crashlytics.advertising.id", (String) null);
                if (TextUtils.isEmpty(string)) {
                    sharedPreferences.edit().putString("crashlytics.advertising.id", str).commit();
                } else if (!string.equals(str)) {
                    sharedPreferences.edit().remove("crashlytics.installation.id").putString("crashlytics.advertising.id", str).commit();
                }
                this.f59g.unlock();
            }
        } finally {
            this.f59g.unlock();
        }
    }

    /* renamed from: h */
    public Map<C0037a, String> mo70h() {
        HashMap hashMap = new HashMap();
        for (C0150i next : this.f66n) {
            if (next instanceof C0028m) {
                for (Map.Entry next2 : ((C0028m) next).getDeviceIdentifiers().entrySet()) {
                    m110a(hashMap, (C0037a) next2.getKey(), (String) next2.getValue());
                }
            }
        }
        return Collections.unmodifiableMap(hashMap);
    }

    /* renamed from: i */
    public String mo71i() {
        return this.f60h.mo75a(this.f63k);
    }

    /* renamed from: j */
    public Boolean mo72j() {
        if (mo73k()) {
            return m113m();
        }
        return null;
    }

    /* renamed from: a */
    private void m110a(Map<C0037a, String> map, C0037a aVar, String str) {
        if (str != null) {
            map.put(aVar, str);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public boolean mo73k() {
        return this.f61i && !this.f58d.mo58b(this.f63k);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public synchronized C0009b mo74l() {
        if (!this.f57c) {
            this.f56b = this.f55a.mo26a();
            this.f57c = true;
        }
        return this.f56b;
    }

    /* renamed from: m */
    private Boolean m113m() {
        C0009b l = mo74l();
        if (l != null) {
            return Boolean.valueOf(l.f9b);
        }
        return null;
    }
}
