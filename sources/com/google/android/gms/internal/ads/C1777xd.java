package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Looper;
import android.security.NetworkSecurityPolicy;
import com.google.android.gms.ads.internal.zzbv;
import com.google.android.gms.common.util.C0979o;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@C1598qn
/* renamed from: com.google.android.gms.internal.ads.xd */
public final class C1777xd implements C1776xc {

    /* renamed from: a */
    private final Object f6807a = new Object();

    /* renamed from: b */
    private boolean f6808b;

    /* renamed from: c */
    private final List<Runnable> f6809c = new ArrayList();

    /* renamed from: d */
    private abg<?> f6810d;
    @GuardedBy("mLock")
    @Nullable

    /* renamed from: e */
    private bni f6811e = null;
    @GuardedBy("mLock")
    @Nullable

    /* renamed from: f */
    private SharedPreferences f6812f;
    @GuardedBy("mLock")
    @Nullable

    /* renamed from: g */
    private SharedPreferences.Editor f6813g;
    @GuardedBy("mLock")

    /* renamed from: h */
    private boolean f6814h = false;
    @GuardedBy("mLock")

    /* renamed from: i */
    private boolean f6815i = true;
    @GuardedBy("mLock")
    @Nullable

    /* renamed from: j */
    private String f6816j;
    @GuardedBy("mLock")
    @Nullable

    /* renamed from: k */
    private String f6817k;
    @GuardedBy("mLock")

    /* renamed from: l */
    private boolean f6818l = false;
    @GuardedBy("mLock")

    /* renamed from: m */
    private String f6819m = "";
    @GuardedBy("mLock")

    /* renamed from: n */
    private long f6820n = 0;
    @GuardedBy("mLock")

    /* renamed from: o */
    private long f6821o = 0;
    @GuardedBy("mLock")

    /* renamed from: p */
    private long f6822p = 0;
    @GuardedBy("mLock")

    /* renamed from: q */
    private int f6823q = -1;
    @GuardedBy("mLock")

    /* renamed from: r */
    private int f6824r = 0;
    @GuardedBy("mLock")

    /* renamed from: s */
    private Set<String> f6825s = Collections.emptySet();
    @GuardedBy("mLock")

    /* renamed from: t */
    private JSONObject f6826t = new JSONObject();
    @GuardedBy("mLock")

    /* renamed from: u */
    private boolean f6827u = true;
    @GuardedBy("mLock")

    /* renamed from: v */
    private boolean f6828v = true;

    /* renamed from: a */
    public final void mo13195a(Context context, String str, boolean z) {
        this.f6810d = C1780xg.m8353a((Runnable) new C1778xe(this, context, "admob"));
        this.f6808b = true;
    }

    /* renamed from: o */
    private final void m8320o() {
        if (this.f6810d != null && !this.f6810d.isDone()) {
            try {
                this.f6810d.get(1, TimeUnit.SECONDS);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                C1772wz.m1627c("Interrupted while waiting for preferences loaded.", e);
            } catch (CancellationException | ExecutionException | TimeoutException e2) {
                C1772wz.m1625b("Fail to initialize AdSharedPreferenceManager.", e2);
            }
        }
    }

    /* renamed from: p */
    private final Bundle m8321p() {
        Bundle bundle = new Bundle();
        bundle.putBoolean("listener_registration_bundle", true);
        synchronized (this.f6807a) {
            bundle.putBoolean("use_https", this.f6815i);
            bundle.putBoolean("content_url_opted_out", this.f6827u);
            bundle.putBoolean("content_vertical_opted_out", this.f6828v);
            bundle.putBoolean("auto_collect_location", this.f6818l);
            bundle.putInt("version_code", this.f6824r);
            bundle.putStringArray("never_pool_slots", (String[]) this.f6825s.toArray(new String[this.f6825s.size()]));
            bundle.putString("app_settings_json", this.f6819m);
            bundle.putLong("app_settings_last_update_ms", this.f6820n);
            bundle.putLong("app_last_background_time_ms", this.f6821o);
            bundle.putInt("request_in_session_count", this.f6823q);
            bundle.putLong("first_ad_req_time_ms", this.f6822p);
            bundle.putString("native_advanced_settings", this.f6826t.toString());
            if (this.f6816j != null) {
                bundle.putString("content_url_hashes", this.f6816j);
            }
            if (this.f6817k != null) {
                bundle.putString("content_vertical_hashes", this.f6817k);
            }
        }
        return bundle;
    }

    /* renamed from: a */
    private final void m8319a(Bundle bundle) {
        C1780xg.f6833a.execute(new C1779xf(this));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0030, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo13169a(boolean r4) {
        /*
            r3 = this;
            r3.m8320o()
            java.lang.Object r0 = r3.f6807a
            monitor-enter(r0)
            boolean r1 = r3.f6815i     // Catch:{ all -> 0x0031 }
            if (r1 != r4) goto L_0x000c
            monitor-exit(r0)     // Catch:{ all -> 0x0031 }
            return
        L_0x000c:
            r3.f6815i = r4     // Catch:{ all -> 0x0031 }
            android.content.SharedPreferences$Editor r1 = r3.f6813g     // Catch:{ all -> 0x0031 }
            if (r1 == 0) goto L_0x001e
            android.content.SharedPreferences$Editor r1 = r3.f6813g     // Catch:{ all -> 0x0031 }
            java.lang.String r2 = "use_https"
            r1.putBoolean(r2, r4)     // Catch:{ all -> 0x0031 }
            android.content.SharedPreferences$Editor r1 = r3.f6813g     // Catch:{ all -> 0x0031 }
            r1.apply()     // Catch:{ all -> 0x0031 }
        L_0x001e:
            boolean r1 = r3.f6814h     // Catch:{ all -> 0x0031 }
            if (r1 != 0) goto L_0x002f
            android.os.Bundle r1 = new android.os.Bundle     // Catch:{ all -> 0x0031 }
            r1.<init>()     // Catch:{ all -> 0x0031 }
            java.lang.String r2 = "use_https"
            r1.putBoolean(r2, r4)     // Catch:{ all -> 0x0031 }
            r3.m8319a((android.os.Bundle) r1)     // Catch:{ all -> 0x0031 }
        L_0x002f:
            monitor-exit(r0)     // Catch:{ all -> 0x0031 }
            return
        L_0x0031:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0031 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1777xd.mo13169a(boolean):void");
    }

    /* renamed from: a */
    public final boolean mo13170a() {
        boolean z;
        m8320o();
        synchronized (this.f6807a) {
            if (!this.f6815i) {
                if (!this.f6814h) {
                    z = false;
                }
            }
            z = true;
        }
        return z;
    }

    /* renamed from: b */
    public final void mo13174b(boolean z) {
        m8320o();
        synchronized (this.f6807a) {
            if (this.f6827u != z) {
                this.f6827u = z;
                if (this.f6813g != null) {
                    this.f6813g.putBoolean("content_url_opted_out", z);
                    this.f6813g.apply();
                }
                Bundle bundle = new Bundle();
                bundle.putBoolean("content_url_opted_out", this.f6827u);
                bundle.putBoolean("content_vertical_opted_out", this.f6828v);
                m8319a(bundle);
            }
        }
    }

    /* renamed from: b */
    public final boolean mo13175b() {
        boolean z;
        m8320o();
        synchronized (this.f6807a) {
            z = this.f6827u;
        }
        return z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0035, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo13167a(@javax.annotation.Nullable java.lang.String r4) {
        /*
            r3 = this;
            r3.m8320o()
            java.lang.Object r0 = r3.f6807a
            monitor-enter(r0)
            if (r4 == 0) goto L_0x0034
            java.lang.String r1 = r3.f6816j     // Catch:{ all -> 0x0032 }
            boolean r1 = r4.equals(r1)     // Catch:{ all -> 0x0032 }
            if (r1 == 0) goto L_0x0011
            goto L_0x0034
        L_0x0011:
            r3.f6816j = r4     // Catch:{ all -> 0x0032 }
            android.content.SharedPreferences$Editor r1 = r3.f6813g     // Catch:{ all -> 0x0032 }
            if (r1 == 0) goto L_0x0023
            android.content.SharedPreferences$Editor r1 = r3.f6813g     // Catch:{ all -> 0x0032 }
            java.lang.String r2 = "content_url_hashes"
            r1.putString(r2, r4)     // Catch:{ all -> 0x0032 }
            android.content.SharedPreferences$Editor r1 = r3.f6813g     // Catch:{ all -> 0x0032 }
            r1.apply()     // Catch:{ all -> 0x0032 }
        L_0x0023:
            android.os.Bundle r1 = new android.os.Bundle     // Catch:{ all -> 0x0032 }
            r1.<init>()     // Catch:{ all -> 0x0032 }
            java.lang.String r2 = "content_url_hashes"
            r1.putString(r2, r4)     // Catch:{ all -> 0x0032 }
            r3.m8319a((android.os.Bundle) r1)     // Catch:{ all -> 0x0032 }
            monitor-exit(r0)     // Catch:{ all -> 0x0032 }
            return
        L_0x0032:
            r4 = move-exception
            goto L_0x0036
        L_0x0034:
            monitor-exit(r0)     // Catch:{ all -> 0x0032 }
            return
        L_0x0036:
            monitor-exit(r0)     // Catch:{ all -> 0x0032 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1777xd.mo13167a(java.lang.String):void");
    }

    @Nullable
    /* renamed from: c */
    public final String mo13176c() {
        String str;
        m8320o();
        synchronized (this.f6807a) {
            str = this.f6816j;
        }
        return str;
    }

    /* renamed from: c */
    public final void mo13178c(boolean z) {
        m8320o();
        synchronized (this.f6807a) {
            if (this.f6828v != z) {
                this.f6828v = z;
                if (this.f6813g != null) {
                    this.f6813g.putBoolean("content_vertical_opted_out", z);
                    this.f6813g.apply();
                }
                Bundle bundle = new Bundle();
                bundle.putBoolean("content_url_opted_out", this.f6827u);
                bundle.putBoolean("content_vertical_opted_out", this.f6828v);
                m8319a(bundle);
            }
        }
    }

    /* renamed from: d */
    public final boolean mo13181d() {
        boolean z;
        m8320o();
        synchronized (this.f6807a) {
            z = this.f6828v;
        }
        return z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0035, code lost:
        return;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo13173b(@javax.annotation.Nullable java.lang.String r4) {
        /*
            r3 = this;
            r3.m8320o()
            java.lang.Object r0 = r3.f6807a
            monitor-enter(r0)
            if (r4 == 0) goto L_0x0034
            java.lang.String r1 = r3.f6817k     // Catch:{ all -> 0x0032 }
            boolean r1 = r4.equals(r1)     // Catch:{ all -> 0x0032 }
            if (r1 == 0) goto L_0x0011
            goto L_0x0034
        L_0x0011:
            r3.f6817k = r4     // Catch:{ all -> 0x0032 }
            android.content.SharedPreferences$Editor r1 = r3.f6813g     // Catch:{ all -> 0x0032 }
            if (r1 == 0) goto L_0x0023
            android.content.SharedPreferences$Editor r1 = r3.f6813g     // Catch:{ all -> 0x0032 }
            java.lang.String r2 = "content_vertical_hashes"
            r1.putString(r2, r4)     // Catch:{ all -> 0x0032 }
            android.content.SharedPreferences$Editor r1 = r3.f6813g     // Catch:{ all -> 0x0032 }
            r1.apply()     // Catch:{ all -> 0x0032 }
        L_0x0023:
            android.os.Bundle r1 = new android.os.Bundle     // Catch:{ all -> 0x0032 }
            r1.<init>()     // Catch:{ all -> 0x0032 }
            java.lang.String r2 = "content_vertical_hashes"
            r1.putString(r2, r4)     // Catch:{ all -> 0x0032 }
            r3.m8319a((android.os.Bundle) r1)     // Catch:{ all -> 0x0032 }
            monitor-exit(r0)     // Catch:{ all -> 0x0032 }
            return
        L_0x0032:
            r4 = move-exception
            goto L_0x0036
        L_0x0034:
            monitor-exit(r0)     // Catch:{ all -> 0x0032 }
            return
        L_0x0036:
            monitor-exit(r0)     // Catch:{ all -> 0x0032 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1777xd.mo13173b(java.lang.String):void");
    }

    @Nullable
    /* renamed from: e */
    public final String mo13182e() {
        String str;
        m8320o();
        synchronized (this.f6807a) {
            str = this.f6817k;
        }
        return str;
    }

    /* renamed from: d */
    public final void mo13180d(boolean z) {
        m8320o();
        synchronized (this.f6807a) {
            if (this.f6818l != z) {
                this.f6818l = z;
                if (this.f6813g != null) {
                    this.f6813g.putBoolean("auto_collect_location", z);
                    this.f6813g.apply();
                }
                Bundle bundle = new Bundle();
                bundle.putBoolean("auto_collect_location", z);
                m8319a(bundle);
            }
        }
    }

    /* renamed from: f */
    public final boolean mo13185f() {
        boolean z;
        m8320o();
        synchronized (this.f6807a) {
            z = this.f6818l;
        }
        return z;
    }

    /* renamed from: a */
    public final void mo13165a(int i) {
        m8320o();
        synchronized (this.f6807a) {
            if (this.f6824r != i) {
                this.f6824r = i;
                if (this.f6813g != null) {
                    this.f6813g.putInt("version_code", i);
                    this.f6813g.apply();
                }
                Bundle bundle = new Bundle();
                bundle.putInt("version_code", i);
                m8319a(bundle);
            }
        }
    }

    /* renamed from: g */
    public final int mo13186g() {
        int i;
        m8320o();
        synchronized (this.f6807a) {
            i = this.f6824r;
        }
        return i;
    }

    /* renamed from: c */
    public final void mo13177c(String str) {
        m8320o();
        synchronized (this.f6807a) {
            if (!this.f6825s.contains(str)) {
                this.f6825s.add(str);
                if (this.f6813g != null) {
                    this.f6813g.putStringSet("never_pool_slots", this.f6825s);
                    this.f6813g.apply();
                }
                Bundle bundle = new Bundle();
                bundle.putStringArray("never_pool_slots", (String[]) this.f6825s.toArray(new String[this.f6825s.size()]));
                m8319a(bundle);
            }
        }
    }

    /* renamed from: d */
    public final void mo13179d(String str) {
        m8320o();
        synchronized (this.f6807a) {
            if (this.f6825s.contains(str)) {
                this.f6825s.remove(str);
                if (this.f6813g != null) {
                    this.f6813g.putStringSet("never_pool_slots", this.f6825s);
                    this.f6813g.apply();
                }
                Bundle bundle = new Bundle();
                bundle.putStringArray("never_pool_slots", (String[]) this.f6825s.toArray(new String[this.f6825s.size()]));
                m8319a(bundle);
            }
        }
    }

    /* renamed from: e */
    public final boolean mo13183e(String str) {
        boolean contains;
        m8320o();
        synchronized (this.f6807a) {
            contains = this.f6825s.contains(str);
        }
        return contains;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x005f, code lost:
        return;
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo13184f(java.lang.String r6) {
        /*
            r5 = this;
            r5.m8320o()
            java.lang.Object r0 = r5.f6807a
            monitor-enter(r0)
            com.google.android.gms.common.util.e r1 = com.google.android.gms.ads.internal.zzbv.zzlm()     // Catch:{ all -> 0x0060 }
            long r1 = r1.mo9996a()     // Catch:{ all -> 0x0060 }
            r5.f6820n = r1     // Catch:{ all -> 0x0060 }
            if (r6 == 0) goto L_0x005e
            java.lang.String r3 = r5.f6819m     // Catch:{ all -> 0x0060 }
            boolean r3 = r6.equals(r3)     // Catch:{ all -> 0x0060 }
            if (r3 == 0) goto L_0x001b
            goto L_0x005e
        L_0x001b:
            r5.f6819m = r6     // Catch:{ all -> 0x0060 }
            android.content.SharedPreferences$Editor r3 = r5.f6813g     // Catch:{ all -> 0x0060 }
            if (r3 == 0) goto L_0x0034
            android.content.SharedPreferences$Editor r3 = r5.f6813g     // Catch:{ all -> 0x0060 }
            java.lang.String r4 = "app_settings_json"
            r3.putString(r4, r6)     // Catch:{ all -> 0x0060 }
            android.content.SharedPreferences$Editor r3 = r5.f6813g     // Catch:{ all -> 0x0060 }
            java.lang.String r4 = "app_settings_last_update_ms"
            r3.putLong(r4, r1)     // Catch:{ all -> 0x0060 }
            android.content.SharedPreferences$Editor r3 = r5.f6813g     // Catch:{ all -> 0x0060 }
            r3.apply()     // Catch:{ all -> 0x0060 }
        L_0x0034:
            android.os.Bundle r3 = new android.os.Bundle     // Catch:{ all -> 0x0060 }
            r3.<init>()     // Catch:{ all -> 0x0060 }
            java.lang.String r4 = "app_settings_json"
            r3.putString(r4, r6)     // Catch:{ all -> 0x0060 }
            java.lang.String r6 = "app_settings_last_update_ms"
            r3.putLong(r6, r1)     // Catch:{ all -> 0x0060 }
            r5.m8319a((android.os.Bundle) r3)     // Catch:{ all -> 0x0060 }
            java.util.List<java.lang.Runnable> r6 = r5.f6809c     // Catch:{ all -> 0x0060 }
            java.util.Iterator r6 = r6.iterator()     // Catch:{ all -> 0x0060 }
        L_0x004c:
            boolean r1 = r6.hasNext()     // Catch:{ all -> 0x0060 }
            if (r1 == 0) goto L_0x005c
            java.lang.Object r1 = r6.next()     // Catch:{ all -> 0x0060 }
            java.lang.Runnable r1 = (java.lang.Runnable) r1     // Catch:{ all -> 0x0060 }
            r1.run()     // Catch:{ all -> 0x0060 }
            goto L_0x004c
        L_0x005c:
            monitor-exit(r0)     // Catch:{ all -> 0x0060 }
            return
        L_0x005e:
            monitor-exit(r0)     // Catch:{ all -> 0x0060 }
            return
        L_0x0060:
            r6 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0060 }
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1777xd.mo13184f(java.lang.String):void");
    }

    /* renamed from: h */
    public final C1756wj mo13187h() {
        C1756wj wjVar;
        m8320o();
        synchronized (this.f6807a) {
            wjVar = new C1756wj(this.f6819m, this.f6820n);
        }
        return wjVar;
    }

    /* renamed from: a */
    public final void mo13166a(long j) {
        m8320o();
        synchronized (this.f6807a) {
            if (this.f6821o != j) {
                this.f6821o = j;
                if (this.f6813g != null) {
                    this.f6813g.putLong("app_last_background_time_ms", j);
                    this.f6813g.apply();
                }
                Bundle bundle = new Bundle();
                bundle.putLong("app_last_background_time_ms", j);
                m8319a(bundle);
            }
        }
    }

    /* renamed from: i */
    public final long mo13188i() {
        long j;
        m8320o();
        synchronized (this.f6807a) {
            j = this.f6821o;
        }
        return j;
    }

    /* renamed from: b */
    public final void mo13171b(int i) {
        m8320o();
        synchronized (this.f6807a) {
            if (this.f6823q != i) {
                this.f6823q = i;
                if (this.f6813g != null) {
                    this.f6813g.putInt("request_in_session_count", i);
                    this.f6813g.apply();
                }
                Bundle bundle = new Bundle();
                bundle.putInt("request_in_session_count", i);
                m8319a(bundle);
            }
        }
    }

    /* renamed from: j */
    public final int mo13189j() {
        int i;
        m8320o();
        synchronized (this.f6807a) {
            i = this.f6823q;
        }
        return i;
    }

    /* renamed from: b */
    public final void mo13172b(long j) {
        m8320o();
        synchronized (this.f6807a) {
            if (this.f6822p != j) {
                this.f6822p = j;
                if (this.f6813g != null) {
                    this.f6813g.putLong("first_ad_req_time_ms", j);
                    this.f6813g.apply();
                }
                Bundle bundle = new Bundle();
                bundle.putLong("first_ad_req_time_ms", j);
                m8319a(bundle);
            }
        }
    }

    /* renamed from: k */
    public final long mo13190k() {
        long j;
        m8320o();
        synchronized (this.f6807a) {
            j = this.f6822p;
        }
        return j;
    }

    /* renamed from: a */
    public final void mo13168a(String str, String str2, boolean z) {
        m8320o();
        synchronized (this.f6807a) {
            JSONArray optJSONArray = this.f6826t.optJSONArray(str);
            if (optJSONArray == null) {
                optJSONArray = new JSONArray();
            }
            int length = optJSONArray.length();
            int i = 0;
            while (true) {
                if (i < optJSONArray.length()) {
                    JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                    if (optJSONObject != null) {
                        if (!str2.equals(optJSONObject.optString("template_id"))) {
                            i++;
                        } else if (!z || optJSONObject.optBoolean("uses_media_view", false) != z) {
                            length = i;
                        } else {
                            return;
                        }
                    } else {
                        return;
                    }
                }
            }
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("template_id", str2);
                jSONObject.put("uses_media_view", z);
                jSONObject.put("timestamp_ms", zzbv.zzlm().mo9996a());
                optJSONArray.put(length, jSONObject);
                this.f6826t.put(str, optJSONArray);
            } catch (JSONException e) {
                C1772wz.m1627c("Could not update native advanced settings", e);
            }
            if (this.f6813g != null) {
                this.f6813g.putString("native_advanced_settings", this.f6826t.toString());
                this.f6813g.apply();
            }
            Bundle bundle = new Bundle();
            bundle.putString("native_advanced_settings", this.f6826t.toString());
            m8319a(bundle);
        }
    }

    /* renamed from: l */
    public final JSONObject mo13191l() {
        JSONObject jSONObject;
        m8320o();
        synchronized (this.f6807a) {
            jSONObject = this.f6826t;
        }
        return jSONObject;
    }

    /* renamed from: m */
    public final void mo13192m() {
        m8320o();
        synchronized (this.f6807a) {
            this.f6826t = new JSONObject();
            if (this.f6813g != null) {
                this.f6813g.remove("native_advanced_settings");
                this.f6813g.apply();
            }
            Bundle bundle = new Bundle();
            bundle.putString("native_advanced_settings", "{}");
            m8319a(bundle);
        }
    }

    @Nullable
    /* renamed from: n */
    public final bni mo13193n() {
        if (!this.f6808b || !C0979o.m1500a()) {
            return null;
        }
        if (mo13175b() && mo13181d()) {
            return null;
        }
        if (!((Boolean) bre.m6321e().mo12778a(C1557p.f5879N)).booleanValue()) {
            return null;
        }
        synchronized (this.f6807a) {
            if (Looper.getMainLooper() == null) {
                return null;
            }
            if (this.f6811e == null) {
                this.f6811e = new bni();
            }
            this.f6811e.mo12241a();
            C1772wz.m1628d("start fetching content...");
            bni bni = this.f6811e;
            return bni;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void mo13194a(Context context, String str) {
        boolean z = false;
        SharedPreferences sharedPreferences = context.getSharedPreferences(str, 0);
        SharedPreferences.Editor edit = sharedPreferences.edit();
        synchronized (this.f6807a) {
            this.f6812f = sharedPreferences;
            this.f6813g = edit;
            if (C0979o.m1508i() && !NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted()) {
                z = true;
            }
            this.f6814h = z;
            this.f6815i = this.f6812f.getBoolean("use_https", this.f6815i);
            this.f6827u = this.f6812f.getBoolean("content_url_opted_out", this.f6827u);
            this.f6816j = this.f6812f.getString("content_url_hashes", this.f6816j);
            this.f6818l = this.f6812f.getBoolean("auto_collect_location", this.f6818l);
            this.f6828v = this.f6812f.getBoolean("content_vertical_opted_out", this.f6828v);
            this.f6817k = this.f6812f.getString("content_vertical_hashes", this.f6817k);
            this.f6824r = this.f6812f.getInt("version_code", this.f6824r);
            this.f6819m = this.f6812f.getString("app_settings_json", this.f6819m);
            this.f6820n = this.f6812f.getLong("app_settings_last_update_ms", this.f6820n);
            this.f6821o = this.f6812f.getLong("app_last_background_time_ms", this.f6821o);
            this.f6823q = this.f6812f.getInt("request_in_session_count", this.f6823q);
            this.f6822p = this.f6812f.getLong("first_ad_req_time_ms", this.f6822p);
            this.f6825s = this.f6812f.getStringSet("never_pool_slots", this.f6825s);
            try {
                this.f6826t = new JSONObject(this.f6812f.getString("native_advanced_settings", "{}"));
            } catch (JSONException e) {
                C1772wz.m1627c("Could not convert native advanced settings to json object", e);
            }
            m8319a(m8321p());
        }
    }
}
