package com.google.firebase.iid;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcelable;
import android.support.p034v4.util.SimpleArrayMap;
import android.util.Log;
import com.google.android.gms.p040b.C0742h;
import com.google.android.gms.p040b.C0745j;
import com.google.firebase.iid.zzl;
import java.util.concurrent.ExecutionException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.annotation.concurrent.GuardedBy;

/* renamed from: com.google.firebase.iid.v */
final class C2412v {

    /* renamed from: a */
    private static int f8916a;

    /* renamed from: b */
    private static PendingIntent f8917b;
    @GuardedBy("responseCallbacks")

    /* renamed from: c */
    private final SimpleArrayMap<String, C0742h<Bundle>> f8918c = new SimpleArrayMap<>();

    /* renamed from: d */
    private final Context f8919d;

    /* renamed from: e */
    private final C2406p f8920e;

    /* renamed from: f */
    private Messenger f8921f;

    /* renamed from: g */
    private Messenger f8922g;

    /* renamed from: h */
    private zzl f8923h;

    public C2412v(Context context, C2406p pVar) {
        this.f8919d = context;
        this.f8920e = pVar;
        this.f8921f = new Messenger(new C2413w(this, Looper.getMainLooper()));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m11753a(Message message) {
        if (message == null || !(message.obj instanceof Intent)) {
            Log.w("FirebaseInstanceId", "Dropping invalid message");
            return;
        }
        Intent intent = (Intent) message.obj;
        intent.setExtrasClassLoader(new zzl.C2417a());
        if (intent.hasExtra("google.messenger")) {
            Parcelable parcelableExtra = intent.getParcelableExtra("google.messenger");
            if (parcelableExtra instanceof zzl) {
                this.f8923h = (zzl) parcelableExtra;
            }
            if (parcelableExtra instanceof Messenger) {
                this.f8922g = (Messenger) parcelableExtra;
            }
        }
        Intent intent2 = (Intent) message.obj;
        String action = intent2.getAction();
        if ("com.google.android.c2dm.intent.REGISTRATION".equals(action)) {
            String stringExtra = intent2.getStringExtra("registration_id");
            if (stringExtra == null) {
                stringExtra = intent2.getStringExtra("unregistered");
            }
            if (stringExtra == null) {
                String stringExtra2 = intent2.getStringExtra("error");
                if (stringExtra2 == null) {
                    String valueOf = String.valueOf(intent2.getExtras());
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 49);
                    sb.append("Unexpected response, no error or registration id ");
                    sb.append(valueOf);
                    Log.w("FirebaseInstanceId", sb.toString());
                    return;
                }
                if (Log.isLoggable("FirebaseInstanceId", 3)) {
                    String valueOf2 = String.valueOf(stringExtra2);
                    Log.d("FirebaseInstanceId", valueOf2.length() != 0 ? "Received InstanceID error ".concat(valueOf2) : new String("Received InstanceID error "));
                }
                if (stringExtra2.startsWith("|")) {
                    String[] split = stringExtra2.split("\\|");
                    if (split.length <= 2 || !"ID".equals(split[1])) {
                        String valueOf3 = String.valueOf(stringExtra2);
                        Log.w("FirebaseInstanceId", valueOf3.length() != 0 ? "Unexpected structured response ".concat(valueOf3) : new String("Unexpected structured response "));
                        return;
                    }
                    String str = split[2];
                    String str2 = split[3];
                    if (str2.startsWith(":")) {
                        str2 = str2.substring(1);
                    }
                    m11755a(str, intent2.putExtra("error", str2).getExtras());
                    return;
                }
                synchronized (this.f8918c) {
                    for (int i = 0; i < this.f8918c.size(); i++) {
                        m11755a(this.f8918c.keyAt(i), intent2.getExtras());
                    }
                }
                return;
            }
            Matcher matcher = Pattern.compile("\\|ID\\|([^|]+)\\|:?+(.*)").matcher(stringExtra);
            if (matcher.matches()) {
                String group = matcher.group(1);
                String group2 = matcher.group(2);
                Bundle extras = intent2.getExtras();
                extras.putString("registration_id", group2);
                m11755a(group, extras);
            } else if (Log.isLoggable("FirebaseInstanceId", 3)) {
                String valueOf4 = String.valueOf(stringExtra);
                Log.d("FirebaseInstanceId", valueOf4.length() != 0 ? "Unexpected response string: ".concat(valueOf4) : new String("Unexpected response string: "));
            }
        } else if (Log.isLoggable("FirebaseInstanceId", 3)) {
            String valueOf5 = String.valueOf(action);
            Log.d("FirebaseInstanceId", valueOf5.length() != 0 ? "Unexpected response action: ".concat(valueOf5) : new String("Unexpected response action: "));
        }
    }

    /* renamed from: a */
    private static synchronized void m11752a(Context context, Intent intent) {
        synchronized (C2412v.class) {
            if (f8917b == null) {
                Intent intent2 = new Intent();
                intent2.setPackage("com.google.example.invalidpackage");
                f8917b = PendingIntent.getBroadcast(context, 0, intent2, 0);
            }
            intent.putExtra("app", f8917b);
        }
    }

    /* renamed from: a */
    private final void m11755a(String str, Bundle bundle) {
        synchronized (this.f8918c) {
            C0742h remove = this.f8918c.remove(str);
            if (remove == null) {
                String valueOf = String.valueOf(str);
                Log.w("FirebaseInstanceId", valueOf.length() != 0 ? "Missing callback for ".concat(valueOf) : new String("Missing callback for "));
                return;
            }
            remove.mo9487a(bundle);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final Bundle mo15038a(Bundle bundle) {
        if (this.f8920e.mo15035d() < 12000000) {
            return m11756b(bundle);
        }
        try {
            return (Bundle) C0745j.m829a(C2395e.m11719a(this.f8919d).mo15012a(1, bundle));
        } catch (InterruptedException | ExecutionException e) {
            if (Log.isLoggable("FirebaseInstanceId", 3)) {
                String valueOf = String.valueOf(e);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 22);
                sb.append("Error making request: ");
                sb.append(valueOf);
                Log.d("FirebaseInstanceId", sb.toString());
            }
            if (!(e.getCause() instanceof C2404n) || ((C2404n) e.getCause()).mo15031a() != 4) {
                return null;
            }
            return m11756b(bundle);
        }
    }

    /* renamed from: b */
    private final Bundle m11756b(Bundle bundle) {
        Bundle c = m11757c(bundle);
        if (c == null || !c.containsKey("google.messenger")) {
            return c;
        }
        Bundle c2 = m11757c(bundle);
        if (c2 == null || !c2.containsKey("google.messenger")) {
            return c2;
        }
        return null;
    }

    /* renamed from: a */
    private static synchronized String m11751a() {
        String num;
        synchronized (C2412v.class) {
            int i = f8916a;
            f8916a = i + 1;
            num = Integer.toString(i);
        }
        return num;
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* renamed from: c */
    private final android.os.Bundle m11757c(android.os.Bundle r9) {
        /*
            r8 = this;
            java.lang.String r0 = m11751a()
            com.google.android.gms.b.h r1 = new com.google.android.gms.b.h
            r1.<init>()
            android.support.v4.util.SimpleArrayMap<java.lang.String, com.google.android.gms.b.h<android.os.Bundle>> r2 = r8.f8918c
            monitor-enter(r2)
            android.support.v4.util.SimpleArrayMap<java.lang.String, com.google.android.gms.b.h<android.os.Bundle>> r3 = r8.f8918c     // Catch:{ all -> 0x0126 }
            r3.put(r0, r1)     // Catch:{ all -> 0x0126 }
            monitor-exit(r2)     // Catch:{ all -> 0x0126 }
            com.google.firebase.iid.p r2 = r8.f8920e
            int r2 = r2.mo15032a()
            if (r2 == 0) goto L_0x011e
            android.content.Intent r2 = new android.content.Intent
            r2.<init>()
            java.lang.String r3 = "com.google.android.gms"
            r2.setPackage(r3)
            com.google.firebase.iid.p r3 = r8.f8920e
            int r3 = r3.mo15032a()
            r4 = 2
            if (r3 != r4) goto L_0x0033
            java.lang.String r3 = "com.google.iid.TOKEN_REQUEST"
            r2.setAction(r3)
            goto L_0x0038
        L_0x0033:
            java.lang.String r3 = "com.google.android.c2dm.intent.REGISTER"
            r2.setAction(r3)
        L_0x0038:
            r2.putExtras(r9)
            android.content.Context r9 = r8.f8919d
            m11752a((android.content.Context) r9, (android.content.Intent) r2)
            java.lang.String r9 = "kid"
            java.lang.String r3 = java.lang.String.valueOf(r0)
            int r3 = r3.length()
            int r3 = r3 + 5
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r3)
            java.lang.String r3 = "|ID|"
            r5.append(r3)
            r5.append(r0)
            java.lang.String r3 = "|"
            r5.append(r3)
            java.lang.String r3 = r5.toString()
            r2.putExtra(r9, r3)
            java.lang.String r9 = "FirebaseInstanceId"
            r3 = 3
            boolean r9 = android.util.Log.isLoggable(r9, r3)
            if (r9 == 0) goto L_0x0096
            java.lang.String r9 = "FirebaseInstanceId"
            android.os.Bundle r5 = r2.getExtras()
            java.lang.String r5 = java.lang.String.valueOf(r5)
            java.lang.String r6 = java.lang.String.valueOf(r5)
            int r6 = r6.length()
            int r6 = r6 + 8
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>(r6)
            java.lang.String r6 = "Sending "
            r7.append(r6)
            r7.append(r5)
            java.lang.String r5 = r7.toString()
            android.util.Log.d(r9, r5)
        L_0x0096:
            java.lang.String r9 = "google.messenger"
            android.os.Messenger r5 = r8.f8921f
            r2.putExtra(r9, r5)
            android.os.Messenger r9 = r8.f8922g
            if (r9 != 0) goto L_0x00a5
            com.google.firebase.iid.zzl r9 = r8.f8923h
            if (r9 == 0) goto L_0x00cb
        L_0x00a5:
            android.os.Message r9 = android.os.Message.obtain()
            r9.obj = r2
            android.os.Messenger r5 = r8.f8922g     // Catch:{ RemoteException -> 0x00bb }
            if (r5 == 0) goto L_0x00b5
            android.os.Messenger r5 = r8.f8922g     // Catch:{ RemoteException -> 0x00bb }
            r5.send(r9)     // Catch:{ RemoteException -> 0x00bb }
            goto L_0x00de
        L_0x00b5:
            com.google.firebase.iid.zzl r5 = r8.f8923h     // Catch:{ RemoteException -> 0x00bb }
            r5.mo15052a(r9)     // Catch:{ RemoteException -> 0x00bb }
            goto L_0x00de
        L_0x00bb:
            java.lang.String r9 = "FirebaseInstanceId"
            boolean r9 = android.util.Log.isLoggable(r9, r3)
            if (r9 == 0) goto L_0x00cb
            java.lang.String r9 = "FirebaseInstanceId"
            java.lang.String r3 = "Messenger failed, fallback to startService"
            android.util.Log.d(r9, r3)
        L_0x00cb:
            com.google.firebase.iid.p r9 = r8.f8920e
            int r9 = r9.mo15032a()
            if (r9 != r4) goto L_0x00d9
            android.content.Context r9 = r8.f8919d
            r9.sendBroadcast(r2)
            goto L_0x00de
        L_0x00d9:
            android.content.Context r9 = r8.f8919d
            r9.startService(r2)
        L_0x00de:
            com.google.android.gms.b.g r9 = r1.mo9485a()     // Catch:{ InterruptedException | TimeoutException -> 0x0102, ExecutionException -> 0x00fb }
            r1 = 30000(0x7530, double:1.4822E-319)
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ InterruptedException | TimeoutException -> 0x0102, ExecutionException -> 0x00fb }
            java.lang.Object r9 = com.google.android.gms.p040b.C0745j.m830a(r9, r1, r3)     // Catch:{ InterruptedException | TimeoutException -> 0x0102, ExecutionException -> 0x00fb }
            android.os.Bundle r9 = (android.os.Bundle) r9     // Catch:{ InterruptedException | TimeoutException -> 0x0102, ExecutionException -> 0x00fb }
            android.support.v4.util.SimpleArrayMap<java.lang.String, com.google.android.gms.b.h<android.os.Bundle>> r1 = r8.f8918c
            monitor-enter(r1)
            android.support.v4.util.SimpleArrayMap<java.lang.String, com.google.android.gms.b.h<android.os.Bundle>> r2 = r8.f8918c     // Catch:{ all -> 0x00f6 }
            r2.remove(r0)     // Catch:{ all -> 0x00f6 }
            monitor-exit(r1)     // Catch:{ all -> 0x00f6 }
            return r9
        L_0x00f6:
            r9 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x00f6 }
            throw r9
        L_0x00f9:
            r9 = move-exception
            goto L_0x0111
        L_0x00fb:
            r9 = move-exception
            java.io.IOException r1 = new java.io.IOException     // Catch:{ all -> 0x00f9 }
            r1.<init>(r9)     // Catch:{ all -> 0x00f9 }
            throw r1     // Catch:{ all -> 0x00f9 }
        L_0x0102:
            java.lang.String r9 = "FirebaseInstanceId"
            java.lang.String r1 = "No response"
            android.util.Log.w(r9, r1)     // Catch:{ all -> 0x00f9 }
            java.io.IOException r9 = new java.io.IOException     // Catch:{ all -> 0x00f9 }
            java.lang.String r1 = "TIMEOUT"
            r9.<init>(r1)     // Catch:{ all -> 0x00f9 }
            throw r9     // Catch:{ all -> 0x00f9 }
        L_0x0111:
            android.support.v4.util.SimpleArrayMap<java.lang.String, com.google.android.gms.b.h<android.os.Bundle>> r1 = r8.f8918c
            monitor-enter(r1)
            android.support.v4.util.SimpleArrayMap<java.lang.String, com.google.android.gms.b.h<android.os.Bundle>> r2 = r8.f8918c     // Catch:{ all -> 0x011b }
            r2.remove(r0)     // Catch:{ all -> 0x011b }
            monitor-exit(r1)     // Catch:{ all -> 0x011b }
            throw r9
        L_0x011b:
            r9 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x011b }
            throw r9
        L_0x011e:
            java.io.IOException r9 = new java.io.IOException
            java.lang.String r0 = "MISSING_INSTANCEID_SERVICE"
            r9.<init>(r0)
            throw r9
        L_0x0126:
            r9 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0126 }
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.iid.C2412v.m11757c(android.os.Bundle):android.os.Bundle");
    }
}
