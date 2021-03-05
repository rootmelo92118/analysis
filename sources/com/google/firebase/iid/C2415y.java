package com.google.firebase.iid;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.annotation.GuardedBy;
import android.support.p034v4.content.ContextCompat;
import android.support.p034v4.util.ArrayMap;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.Map;

/* renamed from: com.google.firebase.iid.y */
final class C2415y {

    /* renamed from: a */
    private final SharedPreferences f8930a;

    /* renamed from: b */
    private final Context f8931b;

    /* renamed from: c */
    private final C2390ay f8932c;
    @GuardedBy("this")

    /* renamed from: d */
    private final Map<String, C2391az> f8933d;

    public C2415y(Context context) {
        this(context, new C2390ay());
    }

    private C2415y(Context context, C2390ay ayVar) {
        this.f8933d = new ArrayMap();
        this.f8931b = context;
        this.f8930a = context.getSharedPreferences("com.google.android.gms.appid", 0);
        this.f8932c = ayVar;
        File file = new File(ContextCompat.getNoBackupFilesDir(this.f8931b), "com.google.android.gms.appid-no-backup");
        if (!file.exists()) {
            try {
                if (file.createNewFile() && !m11767c()) {
                    Log.i("FirebaseInstanceId", "App restored, clearing state");
                    mo15046b();
                    FirebaseInstanceId.m11607a().mo14965g();
                }
            } catch (IOException e) {
                if (Log.isLoggable("FirebaseInstanceId", 3)) {
                    String valueOf = String.valueOf(e.getMessage());
                    Log.d("FirebaseInstanceId", valueOf.length() != 0 ? "Error creating file in no backup dir: ".concat(valueOf) : new String("Error creating file in no backup dir: "));
                }
            }
        }
    }

    /* renamed from: a */
    public final synchronized String mo15042a() {
        return this.f8930a.getString("topic_operaion_queue", "");
    }

    /* renamed from: a */
    public final synchronized void mo15043a(String str) {
        this.f8930a.edit().putString("topic_operaion_queue", str).apply();
    }

    /* renamed from: c */
    private final synchronized boolean m11767c() {
        return this.f8930a.getAll().isEmpty();
    }

    /* renamed from: b */
    private static String m11766b(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 4 + String.valueOf(str2).length() + String.valueOf(str3).length());
        sb.append(str);
        sb.append("|T|");
        sb.append(str2);
        sb.append("|");
        sb.append(str3);
        return sb.toString();
    }

    /* renamed from: a */
    static String m11765a(String str, String str2) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 3 + String.valueOf(str2).length());
        sb.append(str);
        sb.append("|S|");
        sb.append(str2);
        return sb.toString();
    }

    /* renamed from: b */
    public final synchronized void mo15046b() {
        this.f8933d.clear();
        C2390ay.m11691a(this.f8931b);
        this.f8930a.edit().clear().commit();
    }

    /* renamed from: a */
    public final synchronized C2416z mo15041a(String str, String str2, String str3) {
        return C2416z.m11775a(this.f8930a.getString(m11766b(str, str2, str3), (String) null));
    }

    /* renamed from: a */
    public final synchronized void mo15044a(String str, String str2, String str3, String str4, String str5) {
        String a = C2416z.m11777a(str4, str5, System.currentTimeMillis());
        if (a != null) {
            SharedPreferences.Editor edit = this.f8930a.edit();
            edit.putString(m11766b(str, str2, str3), a);
            edit.commit();
        }
    }

    /* renamed from: b */
    public final synchronized C2391az mo15045b(String str) {
        C2391az azVar;
        C2391az azVar2 = this.f8933d.get(str);
        if (azVar2 != null) {
            return azVar2;
        }
        try {
            azVar = this.f8932c.mo15007a(this.f8931b, str);
        } catch (C2394d unused) {
            Log.w("FirebaseInstanceId", "Stored data is corrupt, generating new identity");
            FirebaseInstanceId.m11607a().mo14965g();
            azVar = this.f8932c.mo15008b(this.f8931b, str);
        }
        this.f8933d.put(str, azVar);
        return azVar;
    }

    /* renamed from: c */
    public final synchronized void mo15047c(String str) {
        String concat = String.valueOf(str).concat("|T|");
        SharedPreferences.Editor edit = this.f8930a.edit();
        for (String next : this.f8930a.getAll().keySet()) {
            if (next.startsWith(concat)) {
                edit.remove(next);
            }
        }
        edit.commit();
    }
}
