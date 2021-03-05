package com.google.android.gms.internal.measurement;

import android.content.ContentResolver;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.Handler;
import android.support.annotation.GuardedBy;
import android.support.p034v4.util.ArrayMap;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.bu */
public final class C1928bu implements C1933bz {
    @GuardedBy("ConfigurationContentLoader.class")

    /* renamed from: a */
    static final Map<Uri, C1928bu> f7539a = new ArrayMap();

    /* renamed from: g */
    private static final String[] f7540g = {"key", "value"};

    /* renamed from: b */
    private final ContentResolver f7541b;

    /* renamed from: c */
    private final Uri f7542c;

    /* renamed from: d */
    private final Object f7543d = new Object();

    /* renamed from: e */
    private volatile Map<String, String> f7544e;
    @GuardedBy("this")

    /* renamed from: f */
    private final List<C1932by> f7545f = new ArrayList();

    private C1928bu(ContentResolver contentResolver, Uri uri) {
        this.f7541b = contentResolver;
        this.f7542c = uri;
        this.f7541b.registerContentObserver(uri, false, new C1930bw(this, (Handler) null));
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:2|3|(5:5|6|7|8|9)|11|12) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0018 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.gms.internal.measurement.C1928bu m8993a(android.content.ContentResolver r3, android.net.Uri r4) {
        /*
            java.lang.Class<com.google.android.gms.internal.measurement.bu> r0 = com.google.android.gms.internal.measurement.C1928bu.class
            monitor-enter(r0)
            java.util.Map<android.net.Uri, com.google.android.gms.internal.measurement.bu> r1 = f7539a     // Catch:{ all -> 0x001a }
            java.lang.Object r1 = r1.get(r4)     // Catch:{ all -> 0x001a }
            com.google.android.gms.internal.measurement.bu r1 = (com.google.android.gms.internal.measurement.C1928bu) r1     // Catch:{ all -> 0x001a }
            if (r1 != 0) goto L_0x0018
            com.google.android.gms.internal.measurement.bu r2 = new com.google.android.gms.internal.measurement.bu     // Catch:{ SecurityException -> 0x0018 }
            r2.<init>(r3, r4)     // Catch:{ SecurityException -> 0x0018 }
            java.util.Map<android.net.Uri, com.google.android.gms.internal.measurement.bu> r3 = f7539a     // Catch:{ SecurityException -> 0x0017 }
            r3.put(r4, r2)     // Catch:{ SecurityException -> 0x0017 }
        L_0x0017:
            r1 = r2
        L_0x0018:
            monitor-exit(r0)     // Catch:{ all -> 0x001a }
            return r1
        L_0x001a:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x001a }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C1928bu.m8993a(android.content.ContentResolver, android.net.Uri):com.google.android.gms.internal.measurement.bu");
    }

    /* renamed from: a */
    public final Map<String, String> mo13547a() {
        Map<String, String> map = this.f7544e;
        if (map == null) {
            synchronized (this.f7543d) {
                map = this.f7544e;
                if (map == null) {
                    map = m8994d();
                    this.f7544e = map;
                }
            }
        }
        if (map != null) {
            return map;
        }
        return Collections.emptyMap();
    }

    /* renamed from: b */
    public final void mo13548b() {
        synchronized (this.f7543d) {
            this.f7544e = null;
            C1941cg.m9023a();
        }
        synchronized (this) {
            for (C1932by a : this.f7545f) {
                a.mo13552a();
            }
        }
    }

    /* renamed from: d */
    private final Map<String, String> m8994d() {
        try {
            return (Map) C1935ca.m9009a(new C1929bv(this));
        } catch (SQLiteException | SecurityException unused) {
            Log.e("ConfigurationContentLoader", "PhenotypeFlag unable to load ContentProvider, using default values");
            return null;
        }
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo13546a(String str) {
        return mo13547a().get(str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final /* synthetic */ Map mo13549c() {
        Map map;
        Cursor query = this.f7541b.query(this.f7542c, f7540g, (String) null, (String[]) null, (String) null);
        if (query == null) {
            return Collections.emptyMap();
        }
        try {
            int count = query.getCount();
            if (count == 0) {
                return Collections.emptyMap();
            }
            if (count <= 256) {
                map = new ArrayMap(count);
            } else {
                map = new HashMap(count, 1.0f);
            }
            while (query.moveToNext()) {
                map.put(query.getString(0), query.getString(1));
            }
            query.close();
            return map;
        } finally {
            query.close();
        }
    }
}
