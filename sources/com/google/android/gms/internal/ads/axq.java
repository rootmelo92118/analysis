package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.support.annotation.VisibleForTesting;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.C0856e;
import com.google.android.gms.common.C0857f;
import dalvik.system.DexClassLoader;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class axq {

    /* renamed from: b */
    private static final String f3045b = "axq";

    /* renamed from: a */
    protected Context f3046a;

    /* renamed from: c */
    private ExecutorService f3047c;

    /* renamed from: d */
    private DexClassLoader f3048d;

    /* renamed from: e */
    private axa f3049e;

    /* renamed from: f */
    private byte[] f3050f;

    /* renamed from: g */
    private volatile AdvertisingIdClient f3051g = null;

    /* renamed from: h */
    private volatile boolean f3052h = false;

    /* renamed from: i */
    private Future f3053i = null;

    /* renamed from: j */
    private boolean f3054j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public volatile akd f3055k = null;

    /* renamed from: l */
    private Future f3056l = null;

    /* renamed from: m */
    private aws f3057m;

    /* renamed from: n */
    private boolean f3058n = false;

    /* renamed from: o */
    private boolean f3059o = false;

    /* renamed from: p */
    private Map<Pair<String, String>, ayy> f3060p;

    /* renamed from: q */
    private boolean f3061q = false;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public boolean f3062r;

    /* renamed from: s */
    private boolean f3063s;

    /* renamed from: com.google.android.gms.internal.ads.axq$a */
    final class C1122a extends BroadcastReceiver {
        private C1122a() {
        }

        public final void onReceive(Context context, Intent intent) {
            if ("android.intent.action.USER_PRESENT".equals(intent.getAction())) {
                boolean unused = axq.this.f3062r = true;
            } else if ("android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
                boolean unused2 = axq.this.f3062r = false;
            }
        }

        /* synthetic */ C1122a(axq axq, axr axr) {
            this();
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(31:1|2|(1:4)|5|6|7|8|(1:10)(1:11)|12|(1:14)(1:15)|16|17|18|(2:20|(1:22)(2:23|24))|25|26|27|28|29|(2:31|(1:33)(2:34|35))|36|(1:38)|39|40|41|42|43|44|45|(1:47)|48) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x004b */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0054 A[Catch:{ axb -> 0x0152, axn -> 0x0159 }] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0087 A[Catch:{ all -> 0x011f, FileNotFoundException -> 0x014b, IOException -> 0x0144, axb -> 0x013d, NullPointerException -> 0x0136 }] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00b2 A[Catch:{ all -> 0x011f, FileNotFoundException -> 0x014b, IOException -> 0x0144, axb -> 0x013d, NullPointerException -> 0x0136 }] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00fa A[Catch:{ axb -> 0x0152, axn -> 0x0159 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.gms.internal.ads.axq m4398a(android.content.Context r8, java.lang.String r9, java.lang.String r10, boolean r11) {
        /*
            com.google.android.gms.internal.ads.axq r0 = new com.google.android.gms.internal.ads.axq
            r0.<init>(r8)
            com.google.android.gms.internal.ads.axr r8 = new com.google.android.gms.internal.ads.axr     // Catch:{ axn -> 0x0159 }
            r8.<init>()     // Catch:{ axn -> 0x0159 }
            java.util.concurrent.ExecutorService r8 = java.util.concurrent.Executors.newCachedThreadPool(r8)     // Catch:{ axn -> 0x0159 }
            r0.f3047c = r8     // Catch:{ axn -> 0x0159 }
            r0.f3052h = r11     // Catch:{ axn -> 0x0159 }
            if (r11 == 0) goto L_0x0021
            java.util.concurrent.ExecutorService r8 = r0.f3047c     // Catch:{ axn -> 0x0159 }
            com.google.android.gms.internal.ads.axs r11 = new com.google.android.gms.internal.ads.axs     // Catch:{ axn -> 0x0159 }
            r11.<init>(r0)     // Catch:{ axn -> 0x0159 }
            java.util.concurrent.Future r8 = r8.submit(r11)     // Catch:{ axn -> 0x0159 }
            r0.f3053i = r8     // Catch:{ axn -> 0x0159 }
        L_0x0021:
            java.util.concurrent.ExecutorService r8 = r0.f3047c     // Catch:{ axn -> 0x0159 }
            com.google.android.gms.internal.ads.axu r11 = new com.google.android.gms.internal.ads.axu     // Catch:{ axn -> 0x0159 }
            r11.<init>(r0)     // Catch:{ axn -> 0x0159 }
            r8.execute(r11)     // Catch:{ axn -> 0x0159 }
            r8 = 1
            r11 = 0
            com.google.android.gms.common.d r1 = com.google.android.gms.common.C0851d.m1126b()     // Catch:{ Throwable -> 0x004b }
            android.content.Context r2 = r0.f3046a     // Catch:{ Throwable -> 0x004b }
            int r2 = r1.mo9729c(r2)     // Catch:{ Throwable -> 0x004b }
            if (r2 <= 0) goto L_0x003b
            r2 = 1
            goto L_0x003c
        L_0x003b:
            r2 = 0
        L_0x003c:
            r0.f3058n = r2     // Catch:{ Throwable -> 0x004b }
            android.content.Context r2 = r0.f3046a     // Catch:{ Throwable -> 0x004b }
            int r1 = r1.mo9712a((android.content.Context) r2)     // Catch:{ Throwable -> 0x004b }
            if (r1 != 0) goto L_0x0048
            r1 = 1
            goto L_0x0049
        L_0x0048:
            r1 = 0
        L_0x0049:
            r0.f3059o = r1     // Catch:{ Throwable -> 0x004b }
        L_0x004b:
            r0.mo11372a((int) r11, (boolean) r8)     // Catch:{ axn -> 0x0159 }
            boolean r1 = com.google.android.gms.internal.ads.axx.m4434a()     // Catch:{ axn -> 0x0159 }
            if (r1 == 0) goto L_0x006f
            com.google.android.gms.internal.ads.e<java.lang.Boolean> r1 = com.google.android.gms.internal.ads.C1557p.f5986bo     // Catch:{ axn -> 0x0159 }
            com.google.android.gms.internal.ads.m r2 = com.google.android.gms.internal.ads.bre.m6321e()     // Catch:{ axn -> 0x0159 }
            java.lang.Object r1 = r2.mo12778a(r1)     // Catch:{ axn -> 0x0159 }
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch:{ axn -> 0x0159 }
            boolean r1 = r1.booleanValue()     // Catch:{ axn -> 0x0159 }
            if (r1 != 0) goto L_0x0067
            goto L_0x006f
        L_0x0067:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException     // Catch:{ axn -> 0x0159 }
            java.lang.String r9 = "Task Context initialization must not be called from the UI thread."
            r8.<init>(r9)     // Catch:{ axn -> 0x0159 }
            throw r8     // Catch:{ axn -> 0x0159 }
        L_0x006f:
            com.google.android.gms.internal.ads.axa r1 = new com.google.android.gms.internal.ads.axa     // Catch:{ axn -> 0x0159 }
            r2 = 0
            r1.<init>(r2)     // Catch:{ axn -> 0x0159 }
            r0.f3049e = r1     // Catch:{ axn -> 0x0159 }
            com.google.android.gms.internal.ads.axa r1 = r0.f3049e     // Catch:{ axb -> 0x0152 }
            byte[] r9 = r1.mo11358a(r9)     // Catch:{ axb -> 0x0152 }
            r0.f3050f = r9     // Catch:{ axb -> 0x0152 }
            android.content.Context r9 = r0.f3046a     // Catch:{ FileNotFoundException -> 0x014b, IOException -> 0x0144, axb -> 0x013d, NullPointerException -> 0x0136 }
            java.io.File r9 = r9.getCacheDir()     // Catch:{ FileNotFoundException -> 0x014b, IOException -> 0x0144, axb -> 0x013d, NullPointerException -> 0x0136 }
            if (r9 != 0) goto L_0x0098
            android.content.Context r9 = r0.f3046a     // Catch:{ FileNotFoundException -> 0x014b, IOException -> 0x0144, axb -> 0x013d, NullPointerException -> 0x0136 }
            java.lang.String r1 = "dex"
            java.io.File r9 = r9.getDir(r1, r11)     // Catch:{ FileNotFoundException -> 0x014b, IOException -> 0x0144, axb -> 0x013d, NullPointerException -> 0x0136 }
            if (r9 == 0) goto L_0x0092
            goto L_0x0098
        L_0x0092:
            com.google.android.gms.internal.ads.axn r8 = new com.google.android.gms.internal.ads.axn     // Catch:{ FileNotFoundException -> 0x014b, IOException -> 0x0144, axb -> 0x013d, NullPointerException -> 0x0136 }
            r8.<init>()     // Catch:{ FileNotFoundException -> 0x014b, IOException -> 0x0144, axb -> 0x013d, NullPointerException -> 0x0136 }
            throw r8     // Catch:{ FileNotFoundException -> 0x014b, IOException -> 0x0144, axb -> 0x013d, NullPointerException -> 0x0136 }
        L_0x0098:
            java.lang.String r1 = "1529567361524"
            java.io.File r3 = new java.io.File     // Catch:{ FileNotFoundException -> 0x014b, IOException -> 0x0144, axb -> 0x013d, NullPointerException -> 0x0136 }
            java.lang.String r4 = "%s/%s.jar"
            r5 = 2
            java.lang.Object[] r6 = new java.lang.Object[r5]     // Catch:{ FileNotFoundException -> 0x014b, IOException -> 0x0144, axb -> 0x013d, NullPointerException -> 0x0136 }
            r6[r11] = r9     // Catch:{ FileNotFoundException -> 0x014b, IOException -> 0x0144, axb -> 0x013d, NullPointerException -> 0x0136 }
            r6[r8] = r1     // Catch:{ FileNotFoundException -> 0x014b, IOException -> 0x0144, axb -> 0x013d, NullPointerException -> 0x0136 }
            java.lang.String r4 = java.lang.String.format(r4, r6)     // Catch:{ FileNotFoundException -> 0x014b, IOException -> 0x0144, axb -> 0x013d, NullPointerException -> 0x0136 }
            r3.<init>(r4)     // Catch:{ FileNotFoundException -> 0x014b, IOException -> 0x0144, axb -> 0x013d, NullPointerException -> 0x0136 }
            boolean r4 = r3.exists()     // Catch:{ FileNotFoundException -> 0x014b, IOException -> 0x0144, axb -> 0x013d, NullPointerException -> 0x0136 }
            if (r4 != 0) goto L_0x00c9
            com.google.android.gms.internal.ads.axa r4 = r0.f3049e     // Catch:{ FileNotFoundException -> 0x014b, IOException -> 0x0144, axb -> 0x013d, NullPointerException -> 0x0136 }
            byte[] r6 = r0.f3050f     // Catch:{ FileNotFoundException -> 0x014b, IOException -> 0x0144, axb -> 0x013d, NullPointerException -> 0x0136 }
            byte[] r10 = r4.mo11359a((byte[]) r6, (java.lang.String) r10)     // Catch:{ FileNotFoundException -> 0x014b, IOException -> 0x0144, axb -> 0x013d, NullPointerException -> 0x0136 }
            r3.createNewFile()     // Catch:{ FileNotFoundException -> 0x014b, IOException -> 0x0144, axb -> 0x013d, NullPointerException -> 0x0136 }
            java.io.FileOutputStream r4 = new java.io.FileOutputStream     // Catch:{ FileNotFoundException -> 0x014b, IOException -> 0x0144, axb -> 0x013d, NullPointerException -> 0x0136 }
            r4.<init>(r3)     // Catch:{ FileNotFoundException -> 0x014b, IOException -> 0x0144, axb -> 0x013d, NullPointerException -> 0x0136 }
            int r6 = r10.length     // Catch:{ FileNotFoundException -> 0x014b, IOException -> 0x0144, axb -> 0x013d, NullPointerException -> 0x0136 }
            r4.write(r10, r11, r6)     // Catch:{ FileNotFoundException -> 0x014b, IOException -> 0x0144, axb -> 0x013d, NullPointerException -> 0x0136 }
            r4.close()     // Catch:{ FileNotFoundException -> 0x014b, IOException -> 0x0144, axb -> 0x013d, NullPointerException -> 0x0136 }
        L_0x00c9:
            r0.m4406b((java.io.File) r9, (java.lang.String) r1)     // Catch:{ FileNotFoundException -> 0x014b, IOException -> 0x0144, axb -> 0x013d, NullPointerException -> 0x0136 }
            dalvik.system.DexClassLoader r10 = new dalvik.system.DexClassLoader     // Catch:{ all -> 0x011f }
            java.lang.String r4 = r3.getAbsolutePath()     // Catch:{ all -> 0x011f }
            java.lang.String r6 = r9.getAbsolutePath()     // Catch:{ all -> 0x011f }
            android.content.Context r7 = r0.f3046a     // Catch:{ all -> 0x011f }
            java.lang.ClassLoader r7 = r7.getClassLoader()     // Catch:{ all -> 0x011f }
            r10.<init>(r4, r6, r2, r7)     // Catch:{ all -> 0x011f }
            r0.f3048d = r10     // Catch:{ all -> 0x011f }
            m4400a((java.io.File) r3)     // Catch:{ FileNotFoundException -> 0x014b, IOException -> 0x0144, axb -> 0x013d, NullPointerException -> 0x0136 }
            r0.m4401a((java.io.File) r9, (java.lang.String) r1)     // Catch:{ FileNotFoundException -> 0x014b, IOException -> 0x0144, axb -> 0x013d, NullPointerException -> 0x0136 }
            java.lang.String r10 = "%s/%s.dex"
            java.lang.Object[] r3 = new java.lang.Object[r5]     // Catch:{ FileNotFoundException -> 0x014b, IOException -> 0x0144, axb -> 0x013d, NullPointerException -> 0x0136 }
            r3[r11] = r9     // Catch:{ FileNotFoundException -> 0x014b, IOException -> 0x0144, axb -> 0x013d, NullPointerException -> 0x0136 }
            r3[r8] = r1     // Catch:{ FileNotFoundException -> 0x014b, IOException -> 0x0144, axb -> 0x013d, NullPointerException -> 0x0136 }
            java.lang.String r9 = java.lang.String.format(r10, r3)     // Catch:{ FileNotFoundException -> 0x014b, IOException -> 0x0144, axb -> 0x013d, NullPointerException -> 0x0136 }
            m4402a((java.lang.String) r9)     // Catch:{ FileNotFoundException -> 0x014b, IOException -> 0x0144, axb -> 0x013d, NullPointerException -> 0x0136 }
            boolean r9 = r0.f3063s     // Catch:{ axn -> 0x0159 }
            if (r9 != 0) goto L_0x0115
            android.content.IntentFilter r9 = new android.content.IntentFilter     // Catch:{ axn -> 0x0159 }
            r9.<init>()     // Catch:{ axn -> 0x0159 }
            java.lang.String r10 = "android.intent.action.USER_PRESENT"
            r9.addAction(r10)     // Catch:{ axn -> 0x0159 }
            java.lang.String r10 = "android.intent.action.SCREEN_OFF"
            r9.addAction(r10)     // Catch:{ axn -> 0x0159 }
            android.content.Context r10 = r0.f3046a     // Catch:{ axn -> 0x0159 }
            com.google.android.gms.internal.ads.axq$a r11 = new com.google.android.gms.internal.ads.axq$a     // Catch:{ axn -> 0x0159 }
            r11.<init>(r0, r2)     // Catch:{ axn -> 0x0159 }
            r10.registerReceiver(r11, r9)     // Catch:{ axn -> 0x0159 }
            r0.f3063s = r8     // Catch:{ axn -> 0x0159 }
        L_0x0115:
            com.google.android.gms.internal.ads.aws r9 = new com.google.android.gms.internal.ads.aws     // Catch:{ axn -> 0x0159 }
            r9.<init>(r0)     // Catch:{ axn -> 0x0159 }
            r0.f3057m = r9     // Catch:{ axn -> 0x0159 }
            r0.f3061q = r8     // Catch:{ axn -> 0x0159 }
            goto L_0x0159
        L_0x011f:
            r10 = move-exception
            m4400a((java.io.File) r3)     // Catch:{ FileNotFoundException -> 0x014b, IOException -> 0x0144, axb -> 0x013d, NullPointerException -> 0x0136 }
            r0.m4401a((java.io.File) r9, (java.lang.String) r1)     // Catch:{ FileNotFoundException -> 0x014b, IOException -> 0x0144, axb -> 0x013d, NullPointerException -> 0x0136 }
            java.lang.String r2 = "%s/%s.dex"
            java.lang.Object[] r3 = new java.lang.Object[r5]     // Catch:{ FileNotFoundException -> 0x014b, IOException -> 0x0144, axb -> 0x013d, NullPointerException -> 0x0136 }
            r3[r11] = r9     // Catch:{ FileNotFoundException -> 0x014b, IOException -> 0x0144, axb -> 0x013d, NullPointerException -> 0x0136 }
            r3[r8] = r1     // Catch:{ FileNotFoundException -> 0x014b, IOException -> 0x0144, axb -> 0x013d, NullPointerException -> 0x0136 }
            java.lang.String r8 = java.lang.String.format(r2, r3)     // Catch:{ FileNotFoundException -> 0x014b, IOException -> 0x0144, axb -> 0x013d, NullPointerException -> 0x0136 }
            m4402a((java.lang.String) r8)     // Catch:{ FileNotFoundException -> 0x014b, IOException -> 0x0144, axb -> 0x013d, NullPointerException -> 0x0136 }
            throw r10     // Catch:{ FileNotFoundException -> 0x014b, IOException -> 0x0144, axb -> 0x013d, NullPointerException -> 0x0136 }
        L_0x0136:
            r8 = move-exception
            com.google.android.gms.internal.ads.axn r9 = new com.google.android.gms.internal.ads.axn     // Catch:{ axn -> 0x0159 }
            r9.<init>(r8)     // Catch:{ axn -> 0x0159 }
            throw r9     // Catch:{ axn -> 0x0159 }
        L_0x013d:
            r8 = move-exception
            com.google.android.gms.internal.ads.axn r9 = new com.google.android.gms.internal.ads.axn     // Catch:{ axn -> 0x0159 }
            r9.<init>(r8)     // Catch:{ axn -> 0x0159 }
            throw r9     // Catch:{ axn -> 0x0159 }
        L_0x0144:
            r8 = move-exception
            com.google.android.gms.internal.ads.axn r9 = new com.google.android.gms.internal.ads.axn     // Catch:{ axn -> 0x0159 }
            r9.<init>(r8)     // Catch:{ axn -> 0x0159 }
            throw r9     // Catch:{ axn -> 0x0159 }
        L_0x014b:
            r8 = move-exception
            com.google.android.gms.internal.ads.axn r9 = new com.google.android.gms.internal.ads.axn     // Catch:{ axn -> 0x0159 }
            r9.<init>(r8)     // Catch:{ axn -> 0x0159 }
            throw r9     // Catch:{ axn -> 0x0159 }
        L_0x0152:
            r8 = move-exception
            com.google.android.gms.internal.ads.axn r9 = new com.google.android.gms.internal.ads.axn     // Catch:{ axn -> 0x0159 }
            r9.<init>(r8)     // Catch:{ axn -> 0x0159 }
            throw r9     // Catch:{ axn -> 0x0159 }
        L_0x0159:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.axq.m4398a(android.content.Context, java.lang.String, java.lang.String, boolean):com.google.android.gms.internal.ads.axq");
    }

    /* renamed from: a */
    public final Context mo11370a() {
        return this.f3046a;
    }

    /* renamed from: b */
    public final boolean mo11375b() {
        return this.f3061q;
    }

    /* renamed from: c */
    public final ExecutorService mo11376c() {
        return this.f3047c;
    }

    /* renamed from: d */
    public final DexClassLoader mo11377d() {
        return this.f3048d;
    }

    /* renamed from: e */
    public final axa mo11378e() {
        return this.f3049e;
    }

    /* renamed from: f */
    public final byte[] mo11379f() {
        return this.f3050f;
    }

    /* renamed from: g */
    public final boolean mo11380g() {
        return this.f3058n;
    }

    /* renamed from: h */
    public final aws mo11381h() {
        return this.f3057m;
    }

    /* renamed from: i */
    public final boolean mo11382i() {
        return this.f3059o;
    }

    /* renamed from: j */
    public final boolean mo11383j() {
        return this.f3062r;
    }

    /* renamed from: k */
    public final akd mo11384k() {
        return this.f3055k;
    }

    /* renamed from: l */
    public final Future mo11385l() {
        return this.f3056l;
    }

    private axq(Context context) {
        boolean z = true;
        this.f3062r = true;
        this.f3063s = false;
        Context applicationContext = context.getApplicationContext();
        this.f3054j = applicationContext == null ? false : z;
        this.f3046a = this.f3054j ? applicationContext : context;
        this.f3060p = new HashMap();
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(10:20|21|22|23|24|25|26|27|28|30) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:26:0x0091 */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00a3 A[SYNTHETIC, Splitter:B:39:0x00a3] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00a8 A[SYNTHETIC, Splitter:B:43:0x00a8] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00b2 A[SYNTHETIC, Splitter:B:52:0x00b2] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00b7 A[SYNTHETIC, Splitter:B:56:0x00b7] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m4401a(java.io.File r8, java.lang.String r9) {
        /*
            r7 = this;
            java.io.File r0 = new java.io.File
            java.lang.String r1 = "%s/%s.tmp"
            r2 = 2
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r4 = 0
            r3[r4] = r8
            r5 = 1
            r3[r5] = r9
            java.lang.String r1 = java.lang.String.format(r1, r3)
            r0.<init>(r1)
            boolean r1 = r0.exists()
            if (r1 == 0) goto L_0x001b
            return
        L_0x001b:
            java.io.File r1 = new java.io.File
            java.lang.String r3 = "%s/%s.dex"
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r4] = r8
            r2[r5] = r9
            java.lang.String r8 = java.lang.String.format(r3, r2)
            r1.<init>(r8)
            boolean r8 = r1.exists()
            if (r8 != 0) goto L_0x0033
            return
        L_0x0033:
            long r2 = r1.length()
            r5 = 0
            int r8 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r8 > 0) goto L_0x003e
            return
        L_0x003e:
            int r8 = (int) r2
            byte[] r8 = new byte[r8]
            r2 = 0
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch:{ axb | IOException | NoSuchAlgorithmException -> 0x00af, all -> 0x009f }
            r3.<init>(r1)     // Catch:{ axb | IOException | NoSuchAlgorithmException -> 0x00af, all -> 0x009f }
            int r5 = r3.read(r8)     // Catch:{ axb | IOException | NoSuchAlgorithmException -> 0x00b0, all -> 0x009d }
            if (r5 > 0) goto L_0x0054
            r3.close()     // Catch:{ IOException -> 0x0050 }
        L_0x0050:
            m4400a((java.io.File) r1)
            return
        L_0x0054:
            com.google.android.gms.internal.ads.aoh r5 = new com.google.android.gms.internal.ads.aoh     // Catch:{ axb | IOException | NoSuchAlgorithmException -> 0x00b0, all -> 0x009d }
            r5.<init>()     // Catch:{ axb | IOException | NoSuchAlgorithmException -> 0x00b0, all -> 0x009d }
            java.lang.String r6 = android.os.Build.VERSION.SDK     // Catch:{ axb | IOException | NoSuchAlgorithmException -> 0x00b0, all -> 0x009d }
            byte[] r6 = r6.getBytes()     // Catch:{ axb | IOException | NoSuchAlgorithmException -> 0x00b0, all -> 0x009d }
            r5.f2132d = r6     // Catch:{ axb | IOException | NoSuchAlgorithmException -> 0x00b0, all -> 0x009d }
            byte[] r9 = r9.getBytes()     // Catch:{ axb | IOException | NoSuchAlgorithmException -> 0x00b0, all -> 0x009d }
            r5.f2131c = r9     // Catch:{ axb | IOException | NoSuchAlgorithmException -> 0x00b0, all -> 0x009d }
            com.google.android.gms.internal.ads.axa r9 = r7.f3049e     // Catch:{ axb | IOException | NoSuchAlgorithmException -> 0x00b0, all -> 0x009d }
            byte[] r6 = r7.f3050f     // Catch:{ axb | IOException | NoSuchAlgorithmException -> 0x00b0, all -> 0x009d }
            java.lang.String r8 = r9.mo11357a((byte[]) r6, (byte[]) r8)     // Catch:{ axb | IOException | NoSuchAlgorithmException -> 0x00b0, all -> 0x009d }
            byte[] r8 = r8.getBytes()     // Catch:{ axb | IOException | NoSuchAlgorithmException -> 0x00b0, all -> 0x009d }
            r5.f2129a = r8     // Catch:{ axb | IOException | NoSuchAlgorithmException -> 0x00b0, all -> 0x009d }
            byte[] r8 = com.google.android.gms.internal.ads.avo.m4290a((byte[]) r8)     // Catch:{ axb | IOException | NoSuchAlgorithmException -> 0x00b0, all -> 0x009d }
            r5.f2130b = r8     // Catch:{ axb | IOException | NoSuchAlgorithmException -> 0x00b0, all -> 0x009d }
            r0.createNewFile()     // Catch:{ axb | IOException | NoSuchAlgorithmException -> 0x00b0, all -> 0x009d }
            java.io.FileOutputStream r8 = new java.io.FileOutputStream     // Catch:{ axb | IOException | NoSuchAlgorithmException -> 0x00b0, all -> 0x009d }
            r8.<init>(r0)     // Catch:{ axb | IOException | NoSuchAlgorithmException -> 0x00b0, all -> 0x009d }
            byte[] r9 = com.google.android.gms.internal.ads.aum.m4186a((com.google.android.gms.internal.ads.aum) r5)     // Catch:{ axb | IOException | NoSuchAlgorithmException -> 0x009b, all -> 0x0098 }
            int r0 = r9.length     // Catch:{ axb | IOException | NoSuchAlgorithmException -> 0x009b, all -> 0x0098 }
            r8.write(r9, r4, r0)     // Catch:{ axb | IOException | NoSuchAlgorithmException -> 0x009b, all -> 0x0098 }
            r8.close()     // Catch:{ axb | IOException | NoSuchAlgorithmException -> 0x009b, all -> 0x0098 }
            r3.close()     // Catch:{ IOException -> 0x0091 }
        L_0x0091:
            r8.close()     // Catch:{ IOException -> 0x0094 }
        L_0x0094:
            m4400a((java.io.File) r1)
            return
        L_0x0098:
            r9 = move-exception
            r2 = r8
            goto L_0x00a1
        L_0x009b:
            r2 = r8
            goto L_0x00b0
        L_0x009d:
            r9 = move-exception
            goto L_0x00a1
        L_0x009f:
            r9 = move-exception
            r3 = r2
        L_0x00a1:
            if (r3 == 0) goto L_0x00a6
            r3.close()     // Catch:{ IOException -> 0x00a6 }
        L_0x00a6:
            if (r2 == 0) goto L_0x00ab
            r2.close()     // Catch:{ IOException -> 0x00ab }
        L_0x00ab:
            m4400a((java.io.File) r1)
            throw r9
        L_0x00af:
            r3 = r2
        L_0x00b0:
            if (r3 == 0) goto L_0x00b5
            r3.close()     // Catch:{ IOException -> 0x00b5 }
        L_0x00b5:
            if (r2 == 0) goto L_0x00ba
            r2.close()     // Catch:{ IOException -> 0x00ba }
        L_0x00ba:
            m4400a((java.io.File) r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.axq.m4401a(java.io.File, java.lang.String):void");
    }

    /* renamed from: a */
    private static void m4402a(String str) {
        m4400a(new File(str));
    }

    /* renamed from: a */
    private static void m4400a(File file) {
        if (!file.exists()) {
            Log.d(f3045b, String.format("File %s not found. No need for deletion", new Object[]{file.getAbsolutePath()}));
            return;
        }
        file.delete();
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(8:29|30|31|32|33|34|35|36) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:34:0x00b1 */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00c7 A[SYNTHETIC, Splitter:B:52:0x00c7] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00cc A[SYNTHETIC, Splitter:B:56:0x00cc] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00d3 A[SYNTHETIC, Splitter:B:64:0x00d3] */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00d8 A[SYNTHETIC, Splitter:B:68:0x00d8] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean m4406b(java.io.File r10, java.lang.String r11) {
        /*
            r9 = this;
            java.io.File r0 = new java.io.File
            java.lang.String r1 = "%s/%s.tmp"
            r2 = 2
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r4 = 0
            r3[r4] = r10
            r5 = 1
            r3[r5] = r11
            java.lang.String r1 = java.lang.String.format(r1, r3)
            r0.<init>(r1)
            boolean r1 = r0.exists()
            if (r1 != 0) goto L_0x001b
            return r4
        L_0x001b:
            java.io.File r1 = new java.io.File
            java.lang.String r3 = "%s/%s.dex"
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r4] = r10
            r2[r5] = r11
            java.lang.String r10 = java.lang.String.format(r3, r2)
            r1.<init>(r10)
            boolean r10 = r1.exists()
            if (r10 == 0) goto L_0x0033
            return r4
        L_0x0033:
            r10 = 0
            long r2 = r0.length()     // Catch:{ axb | IOException | NoSuchAlgorithmException -> 0x00d0, all -> 0x00c3 }
            r6 = 0
            int r8 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r8 > 0) goto L_0x0042
            m4400a((java.io.File) r0)     // Catch:{ axb | IOException | NoSuchAlgorithmException -> 0x00d0, all -> 0x00c3 }
            return r4
        L_0x0042:
            int r2 = (int) r2     // Catch:{ axb | IOException | NoSuchAlgorithmException -> 0x00d0, all -> 0x00c3 }
            byte[] r2 = new byte[r2]     // Catch:{ axb | IOException | NoSuchAlgorithmException -> 0x00d0, all -> 0x00c3 }
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch:{ axb | IOException | NoSuchAlgorithmException -> 0x00d0, all -> 0x00c3 }
            r3.<init>(r0)     // Catch:{ axb | IOException | NoSuchAlgorithmException -> 0x00d0, all -> 0x00c3 }
            int r6 = r3.read(r2)     // Catch:{ axb | IOException | NoSuchAlgorithmException -> 0x00d1, all -> 0x00c1 }
            if (r6 > 0) goto L_0x005e
            java.lang.String r11 = f3045b     // Catch:{ axb | IOException | NoSuchAlgorithmException -> 0x00d1, all -> 0x00c1 }
            java.lang.String r1 = "Cannot read the cache data."
            android.util.Log.d(r11, r1)     // Catch:{ axb | IOException | NoSuchAlgorithmException -> 0x00d1, all -> 0x00c1 }
            m4400a((java.io.File) r0)     // Catch:{ axb | IOException | NoSuchAlgorithmException -> 0x00d1, all -> 0x00c1 }
            r3.close()     // Catch:{ IOException -> 0x005d }
        L_0x005d:
            return r4
        L_0x005e:
            com.google.android.gms.internal.ads.aoh r6 = new com.google.android.gms.internal.ads.aoh     // Catch:{ axb | IOException | NoSuchAlgorithmException -> 0x00d1, all -> 0x00c1 }
            r6.<init>()     // Catch:{ axb | IOException | NoSuchAlgorithmException -> 0x00d1, all -> 0x00c1 }
            com.google.android.gms.internal.ads.aum r2 = com.google.android.gms.internal.ads.aum.m4184a(r6, r2)     // Catch:{ axb | IOException | NoSuchAlgorithmException -> 0x00d1, all -> 0x00c1 }
            com.google.android.gms.internal.ads.aoh r2 = (com.google.android.gms.internal.ads.aoh) r2     // Catch:{ axb | IOException | NoSuchAlgorithmException -> 0x00d1, all -> 0x00c1 }
            java.lang.String r6 = new java.lang.String     // Catch:{ axb | IOException | NoSuchAlgorithmException -> 0x00d1, all -> 0x00c1 }
            byte[] r7 = r2.f2131c     // Catch:{ axb | IOException | NoSuchAlgorithmException -> 0x00d1, all -> 0x00c1 }
            r6.<init>(r7)     // Catch:{ axb | IOException | NoSuchAlgorithmException -> 0x00d1, all -> 0x00c1 }
            boolean r11 = r11.equals(r6)     // Catch:{ axb | IOException | NoSuchAlgorithmException -> 0x00d1, all -> 0x00c1 }
            if (r11 == 0) goto L_0x00ba
            byte[] r11 = r2.f2130b     // Catch:{ axb | IOException | NoSuchAlgorithmException -> 0x00d1, all -> 0x00c1 }
            byte[] r6 = r2.f2129a     // Catch:{ axb | IOException | NoSuchAlgorithmException -> 0x00d1, all -> 0x00c1 }
            byte[] r6 = com.google.android.gms.internal.ads.avo.m4290a((byte[]) r6)     // Catch:{ axb | IOException | NoSuchAlgorithmException -> 0x00d1, all -> 0x00c1 }
            boolean r11 = java.util.Arrays.equals(r11, r6)     // Catch:{ axb | IOException | NoSuchAlgorithmException -> 0x00d1, all -> 0x00c1 }
            if (r11 == 0) goto L_0x00ba
            byte[] r11 = r2.f2132d     // Catch:{ axb | IOException | NoSuchAlgorithmException -> 0x00d1, all -> 0x00c1 }
            java.lang.String r6 = android.os.Build.VERSION.SDK     // Catch:{ axb | IOException | NoSuchAlgorithmException -> 0x00d1, all -> 0x00c1 }
            byte[] r6 = r6.getBytes()     // Catch:{ axb | IOException | NoSuchAlgorithmException -> 0x00d1, all -> 0x00c1 }
            boolean r11 = java.util.Arrays.equals(r11, r6)     // Catch:{ axb | IOException | NoSuchAlgorithmException -> 0x00d1, all -> 0x00c1 }
            if (r11 != 0) goto L_0x0093
            goto L_0x00ba
        L_0x0093:
            com.google.android.gms.internal.ads.axa r11 = r9.f3049e     // Catch:{ axb | IOException | NoSuchAlgorithmException -> 0x00d1, all -> 0x00c1 }
            byte[] r0 = r9.f3050f     // Catch:{ axb | IOException | NoSuchAlgorithmException -> 0x00d1, all -> 0x00c1 }
            java.lang.String r6 = new java.lang.String     // Catch:{ axb | IOException | NoSuchAlgorithmException -> 0x00d1, all -> 0x00c1 }
            byte[] r2 = r2.f2129a     // Catch:{ axb | IOException | NoSuchAlgorithmException -> 0x00d1, all -> 0x00c1 }
            r6.<init>(r2)     // Catch:{ axb | IOException | NoSuchAlgorithmException -> 0x00d1, all -> 0x00c1 }
            byte[] r11 = r11.mo11359a((byte[]) r0, (java.lang.String) r6)     // Catch:{ axb | IOException | NoSuchAlgorithmException -> 0x00d1, all -> 0x00c1 }
            r1.createNewFile()     // Catch:{ axb | IOException | NoSuchAlgorithmException -> 0x00d1, all -> 0x00c1 }
            java.io.FileOutputStream r0 = new java.io.FileOutputStream     // Catch:{ axb | IOException | NoSuchAlgorithmException -> 0x00d1, all -> 0x00c1 }
            r0.<init>(r1)     // Catch:{ axb | IOException | NoSuchAlgorithmException -> 0x00d1, all -> 0x00c1 }
            int r10 = r11.length     // Catch:{ axb | IOException | NoSuchAlgorithmException -> 0x00b8, all -> 0x00b5 }
            r0.write(r11, r4, r10)     // Catch:{ axb | IOException | NoSuchAlgorithmException -> 0x00b8, all -> 0x00b5 }
            r3.close()     // Catch:{ IOException -> 0x00b1 }
        L_0x00b1:
            r0.close()     // Catch:{ IOException -> 0x00b4 }
        L_0x00b4:
            return r5
        L_0x00b5:
            r11 = move-exception
            r10 = r0
            goto L_0x00c5
        L_0x00b8:
            r10 = r0
            goto L_0x00d1
        L_0x00ba:
            m4400a((java.io.File) r0)     // Catch:{ axb | IOException | NoSuchAlgorithmException -> 0x00d1, all -> 0x00c1 }
            r3.close()     // Catch:{ IOException -> 0x00c0 }
        L_0x00c0:
            return r4
        L_0x00c1:
            r11 = move-exception
            goto L_0x00c5
        L_0x00c3:
            r11 = move-exception
            r3 = r10
        L_0x00c5:
            if (r3 == 0) goto L_0x00ca
            r3.close()     // Catch:{ IOException -> 0x00ca }
        L_0x00ca:
            if (r10 == 0) goto L_0x00cf
            r10.close()     // Catch:{ IOException -> 0x00cf }
        L_0x00cf:
            throw r11
        L_0x00d0:
            r3 = r10
        L_0x00d1:
            if (r3 == 0) goto L_0x00d6
            r3.close()     // Catch:{ IOException -> 0x00d6 }
        L_0x00d6:
            if (r10 == 0) goto L_0x00db
            r10.close()     // Catch:{ IOException -> 0x00db }
        L_0x00db:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.axq.m4406b(java.io.File, java.lang.String):boolean");
    }

    /* renamed from: a */
    public final boolean mo11373a(String str, String str2, Class<?>... clsArr) {
        if (this.f3060p.containsKey(new Pair(str, str2))) {
            return false;
        }
        this.f3060p.put(new Pair(str, str2), new ayy(this, str, str2, clsArr));
        return true;
    }

    /* renamed from: a */
    public final Method mo11371a(String str, String str2) {
        ayy ayy = this.f3060p.get(new Pair(str, str2));
        if (ayy == null) {
            return null;
        }
        return ayy.mo11423a();
    }

    /* access modifiers changed from: private */
    /* renamed from: o */
    public final void m4407o() {
        try {
            if (this.f3051g == null && this.f3054j) {
                AdvertisingIdClient advertisingIdClient = new AdvertisingIdClient(this.f3046a);
                advertisingIdClient.start();
                this.f3051g = advertisingIdClient;
            }
        } catch (C0856e | C0857f | IOException unused) {
            this.f3051g = null;
        }
    }

    /* access modifiers changed from: package-private */
    @VisibleForTesting
    /* renamed from: a */
    public final void mo11372a(int i, boolean z) {
        if (this.f3059o) {
            Future<?> submit = this.f3047c.submit(new axt(this, i, z));
            if (i == 0) {
                this.f3056l = submit;
            }
        }
    }

    /* access modifiers changed from: package-private */
    @VisibleForTesting
    /* renamed from: b */
    public final akd mo11374b(int i, boolean z) {
        if (i > 0 && z) {
            try {
                Thread.sleep((long) (i * 1000));
            } catch (InterruptedException unused) {
            }
        }
        return m4408p();
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static boolean m4405b(int i, akd akd) {
        if (i >= 4) {
            return false;
        }
        if (akd == null) {
            return true;
        }
        if (((Boolean) bre.m6321e().mo12778a(C1557p.f5989br)).booleanValue() && (akd.f1939n == null || akd.f1939n.equals("0000000000000000000000000000000000000000000000000000000000000000"))) {
            return true;
        }
        if (!((Boolean) bre.m6321e().mo12778a(C1557p.f5990bs)).booleanValue()) {
            return false;
        }
        if (akd.f1905Y == null || akd.f1905Y.f2183a == null || akd.f1905Y.f2183a.longValue() == -2) {
            return true;
        }
        return false;
    }

    @VisibleForTesting
    /* renamed from: p */
    private final akd m4408p() {
        try {
            return aih.m2361a(this.f3046a, this.f3046a.getPackageName(), Integer.toString(this.f3046a.getPackageManager().getPackageInfo(this.f3046a.getPackageName(), 0).versionCode));
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: m */
    public final AdvertisingIdClient mo11386m() {
        if (!this.f3052h) {
            return null;
        }
        if (this.f3051g != null) {
            return this.f3051g;
        }
        if (this.f3053i != null) {
            try {
                this.f3053i.get(2000, TimeUnit.MILLISECONDS);
                this.f3053i = null;
            } catch (InterruptedException | ExecutionException unused) {
            } catch (TimeoutException unused2) {
                this.f3053i.cancel(true);
            }
        }
        return this.f3051g;
    }

    /* renamed from: n */
    public final int mo11387n() {
        if (this.f3057m != null) {
            return aws.m4345a();
        }
        return Integer.MIN_VALUE;
    }
}
