package com.google.android.gms.dynamite;

import android.content.Context;
import android.database.Cursor;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.C0926p;
import com.google.android.gms.common.util.C0971g;
import com.google.android.gms.common.util.DynamiteApi;
import com.google.android.gms.p039a.C0719a;
import com.google.android.gms.p039a.C0722b;
import java.lang.reflect.Field;
import javax.annotation.concurrent.GuardedBy;

public final class DynamiteModule {

    /* renamed from: a */
    public static final C0991b f1239a = new C0997b();

    /* renamed from: b */
    public static final C0991b f1240b = new C0999d();

    /* renamed from: c */
    public static final C0991b f1241c = new C1000e();

    /* renamed from: d */
    public static final C0991b f1242d = new C1001f();
    @GuardedBy("DynamiteModule.class")

    /* renamed from: e */
    private static Boolean f1243e = null;
    @GuardedBy("DynamiteModule.class")

    /* renamed from: f */
    private static C1004i f1244f = null;
    @GuardedBy("DynamiteModule.class")

    /* renamed from: g */
    private static C1006k f1245g = null;
    @GuardedBy("DynamiteModule.class")

    /* renamed from: h */
    private static String f1246h = null;
    @GuardedBy("DynamiteModule.class")

    /* renamed from: i */
    private static int f1247i = -1;

    /* renamed from: j */
    private static final ThreadLocal<C0994c> f1248j = new ThreadLocal<>();

    /* renamed from: k */
    private static final C0991b.C0992a f1249k = new C0996a();

    /* renamed from: l */
    private static final C0991b f1250l = new C0998c();

    /* renamed from: m */
    private static final C0991b f1251m = new C1002g();

    /* renamed from: n */
    private final Context f1252n;

    @DynamiteApi
    public static class DynamiteLoaderClassLoader {
        @GuardedBy("DynamiteLoaderClassLoader.class")
        public static ClassLoader sClassLoader;
    }

    /* renamed from: com.google.android.gms.dynamite.DynamiteModule$b */
    public interface C0991b {

        /* renamed from: com.google.android.gms.dynamite.DynamiteModule$b$a */
        public interface C0992a {
            /* renamed from: a */
            int mo10006a(Context context, String str);

            /* renamed from: a */
            int mo10007a(Context context, String str, boolean z);
        }

        /* renamed from: com.google.android.gms.dynamite.DynamiteModule$b$b */
        public static class C0993b {

            /* renamed from: a */
            public int f1253a = 0;

            /* renamed from: b */
            public int f1254b = 0;

            /* renamed from: c */
            public int f1255c = 0;
        }

        /* renamed from: a */
        C0993b mo10005a(Context context, String str, C0992a aVar);
    }

    /* renamed from: com.google.android.gms.dynamite.DynamiteModule$c */
    private static class C0994c {

        /* renamed from: a */
        public Cursor f1256a;

        private C0994c() {
        }

        /* synthetic */ C0994c(C0996a aVar) {
            this();
        }
    }

    /* renamed from: a */
    public static DynamiteModule m1533a(Context context, C0991b bVar, String str) {
        C0991b.C0993b a;
        C0994c cVar = f1248j.get();
        C0994c cVar2 = new C0994c((C0996a) null);
        f1248j.set(cVar2);
        try {
            a = bVar.mo10005a(context, str, f1249k);
            int i = a.f1253a;
            int i2 = a.f1254b;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 68 + String.valueOf(str).length());
            sb.append("Considering local module ");
            sb.append(str);
            sb.append(":");
            sb.append(i);
            sb.append(" and remote module ");
            sb.append(str);
            sb.append(":");
            sb.append(i2);
            Log.i("DynamiteModule", sb.toString());
            if (a.f1255c == 0 || ((a.f1255c == -1 && a.f1253a == 0) || (a.f1255c == 1 && a.f1254b == 0))) {
                int i3 = a.f1253a;
                int i4 = a.f1254b;
                StringBuilder sb2 = new StringBuilder(91);
                sb2.append("No acceptable module found. Local version is ");
                sb2.append(i3);
                sb2.append(" and remote version is ");
                sb2.append(i4);
                sb2.append(".");
                throw new C0990a(sb2.toString(), (C0996a) null);
            } else if (a.f1255c == -1) {
                DynamiteModule c = m1542c(context, str);
                if (cVar2.f1256a != null) {
                    cVar2.f1256a.close();
                }
                f1248j.set(cVar);
                return c;
            } else if (a.f1255c == 1) {
                DynamiteModule a2 = m1534a(context, str, a.f1254b);
                if (cVar2.f1256a != null) {
                    cVar2.f1256a.close();
                }
                f1248j.set(cVar);
                return a2;
            } else {
                int i5 = a.f1255c;
                StringBuilder sb3 = new StringBuilder(47);
                sb3.append("VersionPolicy returned invalid code:");
                sb3.append(i5);
                throw new C0990a(sb3.toString(), (C0996a) null);
            }
        } catch (C0990a e) {
            String valueOf = String.valueOf(e.getMessage());
            Log.w("DynamiteModule", valueOf.length() != 0 ? "Failed to load remote module: ".concat(valueOf) : new String("Failed to load remote module: "));
            if (a.f1253a == 0 || bVar.mo10005a(context, str, new C0995d(a.f1253a, 0)).f1255c != -1) {
                throw new C0990a("Remote load failed. No local fallback found.", e, (C0996a) null);
            }
            DynamiteModule c2 = m1542c(context, str);
            if (cVar2.f1256a != null) {
                cVar2.f1256a.close();
            }
            f1248j.set(cVar);
            return c2;
        } catch (Throwable th) {
            if (cVar2.f1256a != null) {
                cVar2.f1256a.close();
            }
            f1248j.set(cVar);
            throw th;
        }
    }

    /* renamed from: com.google.android.gms.dynamite.DynamiteModule$a */
    public static class C0990a extends Exception {
        private C0990a(String str) {
            super(str);
        }

        private C0990a(String str, Throwable th) {
            super(str, th);
        }

        /* synthetic */ C0990a(String str, C0996a aVar) {
            this(str);
        }

        /* synthetic */ C0990a(String str, Throwable th, C0996a aVar) {
            this(str, th);
        }
    }

    /* renamed from: com.google.android.gms.dynamite.DynamiteModule$d */
    private static class C0995d implements C0991b.C0992a {

        /* renamed from: a */
        private final int f1257a;

        /* renamed from: b */
        private final int f1258b = 0;

        public C0995d(int i, int i2) {
            this.f1257a = i;
        }

        /* renamed from: a */
        public final int mo10007a(Context context, String str, boolean z) {
            return 0;
        }

        /* renamed from: a */
        public final int mo10006a(Context context, String str) {
            return this.f1257a;
        }
    }

    /* renamed from: a */
    public static int m1530a(Context context, String str) {
        try {
            ClassLoader classLoader = context.getApplicationContext().getClassLoader();
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 61);
            sb.append("com.google.android.gms.dynamite.descriptors.");
            sb.append(str);
            sb.append(".ModuleDescriptor");
            Class<?> loadClass = classLoader.loadClass(sb.toString());
            Field declaredField = loadClass.getDeclaredField("MODULE_ID");
            Field declaredField2 = loadClass.getDeclaredField("MODULE_VERSION");
            if (declaredField.get((Object) null).equals(str)) {
                return declaredField2.getInt((Object) null);
            }
            String valueOf = String.valueOf(declaredField.get((Object) null));
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 51 + String.valueOf(str).length());
            sb2.append("Module descriptor id '");
            sb2.append(valueOf);
            sb2.append("' didn't match expected id '");
            sb2.append(str);
            sb2.append("'");
            Log.e("DynamiteModule", sb2.toString());
            return 0;
        } catch (ClassNotFoundException unused) {
            StringBuilder sb3 = new StringBuilder(String.valueOf(str).length() + 45);
            sb3.append("Local module descriptor class for ");
            sb3.append(str);
            sb3.append(" not found.");
            Log.w("DynamiteModule", sb3.toString());
            return 0;
        } catch (Exception e) {
            String valueOf2 = String.valueOf(e.getMessage());
            Log.e("DynamiteModule", valueOf2.length() != 0 ? "Failed to load module descriptor class: ".concat(valueOf2) : new String("Failed to load module descriptor class: "));
            return 0;
        }
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        	at java.base/java.util.Objects.checkIndex(Objects.java:372)
        	at java.base/java.util.ArrayList.get(ArrayList.java:458)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:23:0x0052=Splitter:B:23:0x0052, B:18:0x0035=Splitter:B:18:0x0035, B:35:0x007b=Splitter:B:35:0x007b} */
    /* renamed from: a */
    public static int m1531a(android.content.Context r8, java.lang.String r9, boolean r10) {
        /*
            java.lang.Class<com.google.android.gms.dynamite.DynamiteModule> r0 = com.google.android.gms.dynamite.DynamiteModule.class
            monitor-enter(r0)     // Catch:{ Throwable -> 0x00ec }
            java.lang.Boolean r1 = f1243e     // Catch:{ all -> 0x00e9 }
            if (r1 != 0) goto L_0x00b6
            android.content.Context r1 = r8.getApplicationContext()     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchFieldException -> 0x008d }
            java.lang.ClassLoader r1 = r1.getClassLoader()     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchFieldException -> 0x008d }
            java.lang.Class<com.google.android.gms.dynamite.DynamiteModule$DynamiteLoaderClassLoader> r2 = com.google.android.gms.dynamite.DynamiteModule.DynamiteLoaderClassLoader.class
            java.lang.String r2 = r2.getName()     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchFieldException -> 0x008d }
            java.lang.Class r1 = r1.loadClass(r2)     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchFieldException -> 0x008d }
            java.lang.String r2 = "sClassLoader"
            java.lang.reflect.Field r2 = r1.getDeclaredField(r2)     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchFieldException -> 0x008d }
            monitor-enter(r1)     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchFieldException -> 0x008d }
            r3 = 0
            java.lang.Object r4 = r2.get(r3)     // Catch:{ all -> 0x008a }
            java.lang.ClassLoader r4 = (java.lang.ClassLoader) r4     // Catch:{ all -> 0x008a }
            if (r4 == 0) goto L_0x0038
            java.lang.ClassLoader r2 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ all -> 0x008a }
            if (r4 != r2) goto L_0x0032
            java.lang.Boolean r2 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x008a }
            goto L_0x0087
        L_0x0032:
            m1536a((java.lang.ClassLoader) r4)     // Catch:{ a -> 0x0035 }
        L_0x0035:
            java.lang.Boolean r2 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x008a }
            goto L_0x0087
        L_0x0038:
            java.lang.String r4 = "com.google.android.gms"
            android.content.Context r5 = r8.getApplicationContext()     // Catch:{ all -> 0x008a }
            java.lang.String r5 = r5.getPackageName()     // Catch:{ all -> 0x008a }
            boolean r4 = r4.equals(r5)     // Catch:{ all -> 0x008a }
            if (r4 == 0) goto L_0x0052
            java.lang.ClassLoader r4 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ all -> 0x008a }
            r2.set(r3, r4)     // Catch:{ all -> 0x008a }
            java.lang.Boolean r2 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x008a }
            goto L_0x0087
        L_0x0052:
            int r4 = m1541c((android.content.Context) r8, (java.lang.String) r9, (boolean) r10)     // Catch:{ a -> 0x007e }
            java.lang.String r5 = f1246h     // Catch:{ a -> 0x007e }
            if (r5 == 0) goto L_0x007b
            java.lang.String r5 = f1246h     // Catch:{ a -> 0x007e }
            boolean r5 = r5.isEmpty()     // Catch:{ a -> 0x007e }
            if (r5 == 0) goto L_0x0063
            goto L_0x007b
        L_0x0063:
            com.google.android.gms.dynamite.h r5 = new com.google.android.gms.dynamite.h     // Catch:{ a -> 0x007e }
            java.lang.String r6 = f1246h     // Catch:{ a -> 0x007e }
            java.lang.ClassLoader r7 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ a -> 0x007e }
            r5.<init>(r6, r7)     // Catch:{ a -> 0x007e }
            m1536a((java.lang.ClassLoader) r5)     // Catch:{ a -> 0x007e }
            r2.set(r3, r5)     // Catch:{ a -> 0x007e }
            java.lang.Boolean r5 = java.lang.Boolean.TRUE     // Catch:{ a -> 0x007e }
            f1243e = r5     // Catch:{ a -> 0x007e }
            monitor-exit(r1)     // Catch:{ all -> 0x008a }
            monitor-exit(r0)     // Catch:{ all -> 0x00e9 }
            return r4
        L_0x007b:
            monitor-exit(r1)     // Catch:{ all -> 0x008a }
            monitor-exit(r0)     // Catch:{ all -> 0x00e9 }
            return r4
        L_0x007e:
            java.lang.ClassLoader r4 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ all -> 0x008a }
            r2.set(r3, r4)     // Catch:{ all -> 0x008a }
            java.lang.Boolean r2 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x008a }
        L_0x0087:
            monitor-exit(r1)     // Catch:{ all -> 0x008a }
            r1 = r2
            goto L_0x00b4
        L_0x008a:
            r2 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x008a }
            throw r2     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchFieldException -> 0x008d }
        L_0x008d:
            r1 = move-exception
            java.lang.String r2 = "DynamiteModule"
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ all -> 0x00e9 }
            java.lang.String r3 = java.lang.String.valueOf(r1)     // Catch:{ all -> 0x00e9 }
            int r3 = r3.length()     // Catch:{ all -> 0x00e9 }
            int r3 = r3 + 30
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x00e9 }
            r4.<init>(r3)     // Catch:{ all -> 0x00e9 }
            java.lang.String r3 = "Failed to load module via V2: "
            r4.append(r3)     // Catch:{ all -> 0x00e9 }
            r4.append(r1)     // Catch:{ all -> 0x00e9 }
            java.lang.String r1 = r4.toString()     // Catch:{ all -> 0x00e9 }
            android.util.Log.w(r2, r1)     // Catch:{ all -> 0x00e9 }
            java.lang.Boolean r1 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x00e9 }
        L_0x00b4:
            f1243e = r1     // Catch:{ all -> 0x00e9 }
        L_0x00b6:
            monitor-exit(r0)     // Catch:{ all -> 0x00e9 }
            boolean r0 = r1.booleanValue()     // Catch:{ Throwable -> 0x00ec }
            if (r0 == 0) goto L_0x00e4
            int r9 = m1541c((android.content.Context) r8, (java.lang.String) r9, (boolean) r10)     // Catch:{ a -> 0x00c2 }
            return r9
        L_0x00c2:
            r9 = move-exception
            java.lang.String r10 = "DynamiteModule"
            java.lang.String r0 = "Failed to retrieve remote module version: "
            java.lang.String r9 = r9.getMessage()     // Catch:{ Throwable -> 0x00ec }
            java.lang.String r9 = java.lang.String.valueOf(r9)     // Catch:{ Throwable -> 0x00ec }
            int r1 = r9.length()     // Catch:{ Throwable -> 0x00ec }
            if (r1 == 0) goto L_0x00da
            java.lang.String r9 = r0.concat(r9)     // Catch:{ Throwable -> 0x00ec }
            goto L_0x00df
        L_0x00da:
            java.lang.String r9 = new java.lang.String     // Catch:{ Throwable -> 0x00ec }
            r9.<init>(r0)     // Catch:{ Throwable -> 0x00ec }
        L_0x00df:
            android.util.Log.w(r10, r9)     // Catch:{ Throwable -> 0x00ec }
            r8 = 0
            return r8
        L_0x00e4:
            int r9 = m1538b((android.content.Context) r8, (java.lang.String) r9, (boolean) r10)     // Catch:{ Throwable -> 0x00ec }
            return r9
        L_0x00e9:
            r9 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00e9 }
            throw r9     // Catch:{ Throwable -> 0x00ec }
        L_0x00ec:
            r9 = move-exception
            com.google.android.gms.common.util.C0971g.m1480a(r8, r9)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.m1531a(android.content.Context, java.lang.String, boolean):int");
    }

    /* renamed from: b */
    private static int m1538b(Context context, String str, boolean z) {
        C1004i a = m1535a(context);
        if (a == null) {
            return 0;
        }
        try {
            if (a.mo10009a() >= 2) {
                return a.mo10012b(C0722b.m769a(context), str, z);
            }
            Log.w("DynamiteModule", "IDynamite loader version < 2, falling back to getModuleVersion2");
            return a.mo10010a(C0722b.m769a(context), str, z);
        } catch (RemoteException e) {
            String valueOf = String.valueOf(e.getMessage());
            Log.w("DynamiteModule", valueOf.length() != 0 ? "Failed to retrieve remote module version: ".concat(valueOf) : new String("Failed to retrieve remote module version: "));
            return 0;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:56:0x00b4  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int m1541c(android.content.Context r8, java.lang.String r9, boolean r10) {
        /*
            r0 = 0
            android.content.ContentResolver r1 = r8.getContentResolver()     // Catch:{ Exception -> 0x00a1, all -> 0x009f }
            if (r10 == 0) goto L_0x000a
            java.lang.String r8 = "api_force_staging"
            goto L_0x000c
        L_0x000a:
            java.lang.String r8 = "api"
        L_0x000c:
            java.lang.String r10 = java.lang.String.valueOf(r8)     // Catch:{ Exception -> 0x00a1, all -> 0x009f }
            int r10 = r10.length()     // Catch:{ Exception -> 0x00a1, all -> 0x009f }
            int r10 = r10 + 42
            java.lang.String r2 = java.lang.String.valueOf(r9)     // Catch:{ Exception -> 0x00a1, all -> 0x009f }
            int r2 = r2.length()     // Catch:{ Exception -> 0x00a1, all -> 0x009f }
            int r10 = r10 + r2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00a1, all -> 0x009f }
            r2.<init>(r10)     // Catch:{ Exception -> 0x00a1, all -> 0x009f }
            java.lang.String r10 = "content://com.google.android.gms.chimera/"
            r2.append(r10)     // Catch:{ Exception -> 0x00a1, all -> 0x009f }
            r2.append(r8)     // Catch:{ Exception -> 0x00a1, all -> 0x009f }
            java.lang.String r8 = "/"
            r2.append(r8)     // Catch:{ Exception -> 0x00a1, all -> 0x009f }
            r2.append(r9)     // Catch:{ Exception -> 0x00a1, all -> 0x009f }
            java.lang.String r8 = r2.toString()     // Catch:{ Exception -> 0x00a1, all -> 0x009f }
            android.net.Uri r2 = android.net.Uri.parse(r8)     // Catch:{ Exception -> 0x00a1, all -> 0x009f }
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            android.database.Cursor r8 = r1.query(r2, r3, r4, r5, r6)     // Catch:{ Exception -> 0x00a1, all -> 0x009f }
            if (r8 == 0) goto L_0x0090
            boolean r9 = r8.moveToFirst()     // Catch:{ Exception -> 0x008b, all -> 0x0087 }
            if (r9 == 0) goto L_0x0090
            r9 = 0
            int r9 = r8.getInt(r9)     // Catch:{ Exception -> 0x008b, all -> 0x0087 }
            if (r9 <= 0) goto L_0x0081
            java.lang.Class<com.google.android.gms.dynamite.DynamiteModule> r10 = com.google.android.gms.dynamite.DynamiteModule.class
            monitor-enter(r10)     // Catch:{ Exception -> 0x008b, all -> 0x0087 }
            r1 = 2
            java.lang.String r1 = r8.getString(r1)     // Catch:{ all -> 0x007e }
            f1246h = r1     // Catch:{ all -> 0x007e }
            java.lang.String r1 = "loaderVersion"
            int r1 = r8.getColumnIndex(r1)     // Catch:{ all -> 0x007e }
            if (r1 < 0) goto L_0x006b
            int r1 = r8.getInt(r1)     // Catch:{ all -> 0x007e }
            f1247i = r1     // Catch:{ all -> 0x007e }
        L_0x006b:
            monitor-exit(r10)     // Catch:{ all -> 0x007e }
            java.lang.ThreadLocal<com.google.android.gms.dynamite.DynamiteModule$c> r10 = f1248j     // Catch:{ Exception -> 0x008b, all -> 0x0087 }
            java.lang.Object r10 = r10.get()     // Catch:{ Exception -> 0x008b, all -> 0x0087 }
            com.google.android.gms.dynamite.DynamiteModule$c r10 = (com.google.android.gms.dynamite.DynamiteModule.C0994c) r10     // Catch:{ Exception -> 0x008b, all -> 0x0087 }
            if (r10 == 0) goto L_0x0081
            android.database.Cursor r1 = r10.f1256a     // Catch:{ Exception -> 0x008b, all -> 0x0087 }
            if (r1 != 0) goto L_0x0081
            r10.f1256a = r8     // Catch:{ Exception -> 0x008b, all -> 0x0087 }
            r8 = r0
            goto L_0x0081
        L_0x007e:
            r9 = move-exception
            monitor-exit(r10)     // Catch:{ all -> 0x007e }
            throw r9     // Catch:{ Exception -> 0x008b, all -> 0x0087 }
        L_0x0081:
            if (r8 == 0) goto L_0x0086
            r8.close()
        L_0x0086:
            return r9
        L_0x0087:
            r9 = move-exception
            r0 = r8
            r8 = r9
            goto L_0x00b2
        L_0x008b:
            r9 = move-exception
            r7 = r9
            r9 = r8
            r8 = r7
            goto L_0x00a3
        L_0x0090:
            java.lang.String r9 = "DynamiteModule"
            java.lang.String r10 = "Failed to retrieve remote module version."
            android.util.Log.w(r9, r10)     // Catch:{ Exception -> 0x008b, all -> 0x0087 }
            com.google.android.gms.dynamite.DynamiteModule$a r9 = new com.google.android.gms.dynamite.DynamiteModule$a     // Catch:{ Exception -> 0x008b, all -> 0x0087 }
            java.lang.String r10 = "Failed to connect to dynamite module ContentResolver."
            r9.<init>((java.lang.String) r10, (com.google.android.gms.dynamite.C0996a) r0)     // Catch:{ Exception -> 0x008b, all -> 0x0087 }
            throw r9     // Catch:{ Exception -> 0x008b, all -> 0x0087 }
        L_0x009f:
            r8 = move-exception
            goto L_0x00b2
        L_0x00a1:
            r8 = move-exception
            r9 = r0
        L_0x00a3:
            boolean r10 = r8 instanceof com.google.android.gms.dynamite.DynamiteModule.C0990a     // Catch:{ all -> 0x00b0 }
            if (r10 == 0) goto L_0x00a8
            throw r8     // Catch:{ all -> 0x00b0 }
        L_0x00a8:
            com.google.android.gms.dynamite.DynamiteModule$a r10 = new com.google.android.gms.dynamite.DynamiteModule$a     // Catch:{ all -> 0x00b0 }
            java.lang.String r1 = "V2 version check failed"
            r10.<init>(r1, r8, r0)     // Catch:{ all -> 0x00b0 }
            throw r10     // Catch:{ all -> 0x00b0 }
        L_0x00b0:
            r8 = move-exception
            r0 = r9
        L_0x00b2:
            if (r0 == 0) goto L_0x00b7
            r0.close()
        L_0x00b7:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.m1541c(android.content.Context, java.lang.String, boolean):int");
    }

    /* renamed from: b */
    public static int m1537b(Context context, String str) {
        return m1531a(context, str, false);
    }

    /* renamed from: c */
    private static DynamiteModule m1542c(Context context, String str) {
        String valueOf = String.valueOf(str);
        Log.i("DynamiteModule", valueOf.length() != 0 ? "Selected local version of ".concat(valueOf) : new String("Selected local version of "));
        return new DynamiteModule(context.getApplicationContext());
    }

    /* renamed from: a */
    private static DynamiteModule m1534a(Context context, String str, int i) {
        Boolean bool;
        try {
            synchronized (DynamiteModule.class) {
                bool = f1243e;
            }
            if (bool == null) {
                throw new C0990a("Failed to determine which loading route to use.", (C0996a) null);
            } else if (bool.booleanValue()) {
                return m1543c(context, str, i);
            } else {
                return m1539b(context, str, i);
            }
        } catch (Throwable th) {
            C0971g.m1480a(context, th);
            throw th;
        }
    }

    /* renamed from: b */
    private static DynamiteModule m1539b(Context context, String str, int i) {
        C0719a aVar;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 51);
        sb.append("Selected remote version of ");
        sb.append(str);
        sb.append(", version >= ");
        sb.append(i);
        Log.i("DynamiteModule", sb.toString());
        C1004i a = m1535a(context);
        if (a != null) {
            try {
                if (a.mo10009a() >= 2) {
                    aVar = a.mo10013b(C0722b.m769a(context), str, i);
                } else {
                    Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to createModuleContext");
                    aVar = a.mo10011a(C0722b.m769a(context), str, i);
                }
                if (C0722b.m770a(aVar) != null) {
                    return new DynamiteModule((Context) C0722b.m770a(aVar));
                }
                throw new C0990a("Failed to load remote module.", (C0996a) null);
            } catch (RemoteException e) {
                throw new C0990a("Failed to load remote module.", e, (C0996a) null);
            }
        } else {
            throw new C0990a("Failed to create IDynamiteLoader.", (C0996a) null);
        }
    }

    /* JADX WARNING: type inference failed for: r1v7, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.google.android.gms.dynamite.C1004i m1535a(android.content.Context r5) {
        /*
            java.lang.Class<com.google.android.gms.dynamite.DynamiteModule> r0 = com.google.android.gms.dynamite.DynamiteModule.class
            monitor-enter(r0)
            com.google.android.gms.dynamite.i r1 = f1244f     // Catch:{ all -> 0x006f }
            if (r1 == 0) goto L_0x000b
            com.google.android.gms.dynamite.i r5 = f1244f     // Catch:{ all -> 0x006f }
            monitor-exit(r0)     // Catch:{ all -> 0x006f }
            return r5
        L_0x000b:
            com.google.android.gms.common.d r1 = com.google.android.gms.common.C0851d.m1126b()     // Catch:{ all -> 0x006f }
            int r1 = r1.mo9712a((android.content.Context) r5)     // Catch:{ all -> 0x006f }
            r2 = 0
            if (r1 == 0) goto L_0x0018
            monitor-exit(r0)     // Catch:{ all -> 0x006f }
            return r2
        L_0x0018:
            java.lang.String r1 = "com.google.android.gms"
            r3 = 3
            android.content.Context r5 = r5.createPackageContext(r1, r3)     // Catch:{ Exception -> 0x004d }
            java.lang.ClassLoader r5 = r5.getClassLoader()     // Catch:{ Exception -> 0x004d }
            java.lang.String r1 = "com.google.android.gms.chimera.container.DynamiteLoaderImpl"
            java.lang.Class r5 = r5.loadClass(r1)     // Catch:{ Exception -> 0x004d }
            java.lang.Object r5 = r5.newInstance()     // Catch:{ Exception -> 0x004d }
            android.os.IBinder r5 = (android.os.IBinder) r5     // Catch:{ Exception -> 0x004d }
            if (r5 != 0) goto L_0x0033
            r5 = r2
            goto L_0x0047
        L_0x0033:
            java.lang.String r1 = "com.google.android.gms.dynamite.IDynamiteLoader"
            android.os.IInterface r1 = r5.queryLocalInterface(r1)     // Catch:{ Exception -> 0x004d }
            boolean r3 = r1 instanceof com.google.android.gms.dynamite.C1004i     // Catch:{ Exception -> 0x004d }
            if (r3 == 0) goto L_0x0041
            r5 = r1
            com.google.android.gms.dynamite.i r5 = (com.google.android.gms.dynamite.C1004i) r5     // Catch:{ Exception -> 0x004d }
            goto L_0x0047
        L_0x0041:
            com.google.android.gms.dynamite.j r1 = new com.google.android.gms.dynamite.j     // Catch:{ Exception -> 0x004d }
            r1.<init>(r5)     // Catch:{ Exception -> 0x004d }
            r5 = r1
        L_0x0047:
            if (r5 == 0) goto L_0x006d
            f1244f = r5     // Catch:{ Exception -> 0x004d }
            monitor-exit(r0)     // Catch:{ all -> 0x006f }
            return r5
        L_0x004d:
            r5 = move-exception
            java.lang.String r1 = "DynamiteModule"
            java.lang.String r3 = "Failed to load IDynamiteLoader from GmsCore: "
            java.lang.String r5 = r5.getMessage()     // Catch:{ all -> 0x006f }
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch:{ all -> 0x006f }
            int r4 = r5.length()     // Catch:{ all -> 0x006f }
            if (r4 == 0) goto L_0x0065
            java.lang.String r5 = r3.concat(r5)     // Catch:{ all -> 0x006f }
            goto L_0x006a
        L_0x0065:
            java.lang.String r5 = new java.lang.String     // Catch:{ all -> 0x006f }
            r5.<init>(r3)     // Catch:{ all -> 0x006f }
        L_0x006a:
            android.util.Log.e(r1, r5)     // Catch:{ all -> 0x006f }
        L_0x006d:
            monitor-exit(r0)     // Catch:{ all -> 0x006f }
            return r2
        L_0x006f:
            r5 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x006f }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.m1535a(android.content.Context):com.google.android.gms.dynamite.i");
    }

    /* renamed from: a */
    public final Context mo10003a() {
        return this.f1252n;
    }

    /* renamed from: c */
    private static DynamiteModule m1543c(Context context, String str, int i) {
        C1006k kVar;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 51);
        sb.append("Selected remote version of ");
        sb.append(str);
        sb.append(", version >= ");
        sb.append(i);
        Log.i("DynamiteModule", sb.toString());
        synchronized (DynamiteModule.class) {
            kVar = f1245g;
        }
        if (kVar != null) {
            C0994c cVar = f1248j.get();
            if (cVar == null || cVar.f1256a == null) {
                throw new C0990a("No result cursor", (C0996a) null);
            }
            Context a = m1532a(context.getApplicationContext(), str, i, cVar.f1256a, kVar);
            if (a != null) {
                return new DynamiteModule(a);
            }
            throw new C0990a("Failed to get module context", (C0996a) null);
        }
        throw new C0990a("DynamiteLoaderV2 was not cached.", (C0996a) null);
    }

    /* renamed from: b */
    private static Boolean m1540b() {
        Boolean valueOf;
        synchronized (DynamiteModule.class) {
            valueOf = Boolean.valueOf(f1247i >= 2);
        }
        return valueOf;
    }

    /* renamed from: a */
    private static Context m1532a(Context context, String str, int i, Cursor cursor, C1006k kVar) {
        C0719a aVar;
        try {
            C0722b.m769a(null);
            if (m1540b().booleanValue()) {
                Log.v("DynamiteModule", "Dynamite loader version >= 2, using loadModule2NoCrashUtils");
                aVar = kVar.mo10015b(C0722b.m769a(context), str, i, C0722b.m769a(cursor));
            } else {
                Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to loadModule2");
                aVar = kVar.mo10014a(C0722b.m769a(context), str, i, C0722b.m769a(cursor));
            }
            return (Context) C0722b.m770a(aVar);
        } catch (Exception e) {
            String valueOf = String.valueOf(e.toString());
            Log.e("DynamiteModule", valueOf.length() != 0 ? "Failed to load DynamiteLoader: ".concat(valueOf) : new String("Failed to load DynamiteLoader: "));
            return null;
        }
    }

    /* JADX WARNING: type inference failed for: r1v5, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    @javax.annotation.concurrent.GuardedBy("DynamiteModule.class")
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m1536a(java.lang.ClassLoader r3) {
        /*
            r0 = 0
            java.lang.String r1 = "com.google.android.gms.dynamiteloader.DynamiteLoaderV2"
            java.lang.Class r3 = r3.loadClass(r1)     // Catch:{ ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException -> 0x0031 }
            r1 = 0
            java.lang.Class[] r2 = new java.lang.Class[r1]     // Catch:{ ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException -> 0x0031 }
            java.lang.reflect.Constructor r3 = r3.getConstructor(r2)     // Catch:{ ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException -> 0x0031 }
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException -> 0x0031 }
            java.lang.Object r3 = r3.newInstance(r1)     // Catch:{ ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException -> 0x0031 }
            android.os.IBinder r3 = (android.os.IBinder) r3     // Catch:{ ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException -> 0x0031 }
            if (r3 != 0) goto L_0x001a
            r3 = r0
            goto L_0x002e
        L_0x001a:
            java.lang.String r1 = "com.google.android.gms.dynamite.IDynamiteLoaderV2"
            android.os.IInterface r1 = r3.queryLocalInterface(r1)     // Catch:{ ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException -> 0x0031 }
            boolean r2 = r1 instanceof com.google.android.gms.dynamite.C1006k     // Catch:{ ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException -> 0x0031 }
            if (r2 == 0) goto L_0x0028
            r3 = r1
            com.google.android.gms.dynamite.k r3 = (com.google.android.gms.dynamite.C1006k) r3     // Catch:{ ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException -> 0x0031 }
            goto L_0x002e
        L_0x0028:
            com.google.android.gms.dynamite.l r1 = new com.google.android.gms.dynamite.l     // Catch:{ ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException -> 0x0031 }
            r1.<init>(r3)     // Catch:{ ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException -> 0x0031 }
            r3 = r1
        L_0x002e:
            f1245g = r3     // Catch:{ ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException -> 0x0031 }
            return
        L_0x0031:
            r3 = move-exception
            com.google.android.gms.dynamite.DynamiteModule$a r1 = new com.google.android.gms.dynamite.DynamiteModule$a
            java.lang.String r2 = "Failed to instantiate dynamite loader"
            r1.<init>(r2, r3, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.m1536a(java.lang.ClassLoader):void");
    }

    /* renamed from: a */
    public final IBinder mo10004a(String str) {
        try {
            return (IBinder) this.f1252n.getClassLoader().loadClass(str).newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e) {
            String valueOf = String.valueOf(str);
            throw new C0990a(valueOf.length() != 0 ? "Failed to instantiate module class: ".concat(valueOf) : new String("Failed to instantiate module class: "), e, (C0996a) null);
        }
    }

    private DynamiteModule(Context context) {
        this.f1252n = (Context) C0926p.m1306a(context);
    }
}
