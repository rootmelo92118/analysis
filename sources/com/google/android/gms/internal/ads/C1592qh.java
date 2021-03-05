package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Looper;
import android.support.p034v4.p036os.EnvironmentCompat;
import android.text.TextUtils;
import com.google.android.gms.common.p041a.C0771c;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import javax.annotation.ParametersAreNonnullByDefault;

@C1598qn
@ParametersAreNonnullByDefault
/* renamed from: com.google.android.gms.internal.ads.qh */
public final class C1592qh implements C1596ql {

    /* renamed from: a */
    private static final Object f6245a = new Object();

    /* renamed from: b */
    private static C1596ql f6246b = null;

    /* renamed from: c */
    private static C1596ql f6247c = null;

    /* renamed from: d */
    private final Object f6248d;

    /* renamed from: e */
    private final Context f6249e;

    /* renamed from: f */
    private final WeakHashMap<Thread, Boolean> f6250f;

    /* renamed from: g */
    private final ExecutorService f6251g;

    /* renamed from: h */
    private final zzbbi f6252h;

    /* renamed from: a */
    public static C1596ql m7800a(Context context) {
        synchronized (f6245a) {
            if (f6246b == null) {
                if (((Boolean) bre.m6321e().mo12778a(C1557p.f5998c)).booleanValue()) {
                    f6246b = new C1592qh(context);
                } else {
                    f6246b = new C1597qm();
                }
            }
        }
        return f6246b;
    }

    /* renamed from: a */
    public static C1596ql m7801a(Context context, zzbbi zzbbi) {
        synchronized (f6245a) {
            if (f6247c == null) {
                if (((Boolean) bre.m6321e().mo12778a(C1557p.f5998c)).booleanValue()) {
                    C1592qh qhVar = new C1592qh(context, zzbbi);
                    Thread thread = Looper.getMainLooper().getThread();
                    if (thread != null) {
                        synchronized (qhVar.f6248d) {
                            qhVar.f6250f.put(thread, true);
                        }
                        thread.setUncaughtExceptionHandler(new C1594qj(qhVar, thread.getUncaughtExceptionHandler()));
                    }
                    Thread.setDefaultUncaughtExceptionHandler(new C1593qi(qhVar, Thread.getDefaultUncaughtExceptionHandler()));
                    f6247c = qhVar;
                } else {
                    f6247c = new C1597qm();
                }
            }
        }
        return f6247c;
    }

    private C1592qh(Context context) {
        this(context, zzbbi.m8618a());
    }

    private C1592qh(Context context, zzbbi zzbbi) {
        this.f6248d = new Object();
        this.f6250f = new WeakHashMap<>();
        this.f6251g = Executors.newCachedThreadPool();
        this.f6249e = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.f6252h = zzbbi;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003f, code lost:
        if (r3 == false) goto L_0x0043;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo12897a(java.lang.Thread r10, java.lang.Throwable r11) {
        /*
            r9 = this;
            r10 = 1
            r0 = 0
            if (r11 == 0) goto L_0x0042
            r1 = r11
            r2 = 0
            r3 = 0
        L_0x0007:
            if (r1 == 0) goto L_0x003d
            java.lang.StackTraceElement[] r4 = r1.getStackTrace()
            int r5 = r4.length
            r6 = r3
            r3 = r2
            r2 = 0
        L_0x0011:
            if (r2 >= r5) goto L_0x0036
            r7 = r4[r2]
            java.lang.String r8 = r7.getClassName()
            boolean r8 = com.google.android.gms.internal.ads.C1851zx.m8596b((java.lang.String) r8)
            if (r8 == 0) goto L_0x0020
            r3 = 1
        L_0x0020:
            java.lang.Class r8 = r9.getClass()
            java.lang.String r8 = r8.getName()
            java.lang.String r7 = r7.getClassName()
            boolean r7 = r8.equals(r7)
            if (r7 == 0) goto L_0x0033
            r6 = 1
        L_0x0033:
            int r2 = r2 + 1
            goto L_0x0011
        L_0x0036:
            java.lang.Throwable r1 = r1.getCause()
            r2 = r3
            r3 = r6
            goto L_0x0007
        L_0x003d:
            if (r2 == 0) goto L_0x0042
            if (r3 != 0) goto L_0x0042
            goto L_0x0043
        L_0x0042:
            r10 = 0
        L_0x0043:
            if (r10 == 0) goto L_0x004c
            java.lang.String r10 = ""
            r0 = 1065353216(0x3f800000, float:1.0)
            r9.mo12899a(r11, r10, r0)
        L_0x004c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1592qh.mo12897a(java.lang.Thread, java.lang.Throwable):void");
    }

    /* renamed from: a */
    public final void mo12898a(Throwable th, String str) {
        mo12899a(th, str, 1.0f);
    }

    /* renamed from: a */
    public final void mo12899a(Throwable th, String str, float f) {
        if (C1851zx.m8587a(th) != null) {
            String name = th.getClass().getName();
            StringWriter stringWriter = new StringWriter();
            aom.m2931a(th, new PrintWriter(stringWriter));
            String stringWriter2 = stringWriter.toString();
            int i = 0;
            int i2 = 1;
            boolean z = Math.random() < ((double) f);
            if (f > 0.0f) {
                i2 = (int) (1.0f / f);
            }
            if (z) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(m7799a(name, stringWriter2, str, i2).toString());
                ArrayList arrayList2 = arrayList;
                int size = arrayList2.size();
                while (i < size) {
                    Object obj = arrayList2.get(i);
                    i++;
                    this.f6251g.submit(new C1595qk(this, new aam(), (String) obj));
                }
            }
        }
    }

    /* renamed from: a */
    private final Uri.Builder m7799a(String str, String str2, String str3, int i) {
        boolean z;
        try {
            z = C0771c.m904a(this.f6249e).mo9537a();
        } catch (Throwable th) {
            aai.m1625b("Error fetching instant app info", th);
            z = false;
        }
        String str4 = EnvironmentCompat.MEDIA_UNKNOWN;
        try {
            str4 = this.f6249e.getPackageName();
        } catch (Throwable unused) {
            aai.m1630e("Cannot obtain package name, proceeding.");
        }
        Uri.Builder appendQueryParameter = new Uri.Builder().scheme("https").path("//pagead2.googlesyndication.com/pagead/gen_204").appendQueryParameter("is_aia", Boolean.toString(z)).appendQueryParameter("id", "gmob-apps-report-exception").appendQueryParameter("os", Build.VERSION.RELEASE).appendQueryParameter("api", String.valueOf(Build.VERSION.SDK_INT));
        String str5 = Build.MANUFACTURER;
        String str6 = Build.MODEL;
        if (!str6.startsWith(str5)) {
            StringBuilder sb = new StringBuilder(String.valueOf(str5).length() + 1 + String.valueOf(str6).length());
            sb.append(str5);
            sb.append(" ");
            sb.append(str6);
            str6 = sb.toString();
        }
        return appendQueryParameter.appendQueryParameter("device", str6).appendQueryParameter("js", this.f6252h.f7135a).appendQueryParameter("appid", str4).appendQueryParameter("exceptiontype", str).appendQueryParameter("stacktrace", str2).appendQueryParameter("eids", TextUtils.join(",", C1557p.m7740a())).appendQueryParameter("exceptionkey", str3).appendQueryParameter("cl", "221522000").appendQueryParameter("rc", "dev").appendQueryParameter("session_id", bre.m6322f()).appendQueryParameter("sampling_rate", Integer.toString(i)).appendQueryParameter("pb_tm", String.valueOf(bre.m6321e().mo12778a(C1557p.f6008cJ)));
    }
}
