package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.NonNull;
import android.support.annotation.WorkerThread;
import android.support.p034v4.app.NotificationCompat;
import android.text.TextUtils;
import com.google.android.gms.common.C0851d;
import com.google.android.gms.common.C0858g;
import com.google.android.gms.common.internal.C0926p;
import com.google.android.gms.common.p041a.C0771c;
import com.google.android.gms.common.util.C0969e;
import com.google.android.gms.common.util.C0970f;
import java.io.ByteArrayInputStream;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.concurrent.atomic.AtomicLong;
import javax.security.auth.x500.X500Principal;
import p000a.p001a.p002a.p003a.p004a.p009d.C0080b;

/* renamed from: com.google.android.gms.measurement.internal.el */
public final class C2264el extends C2190bt {

    /* renamed from: a */
    private static final String[] f8447a = {"firebase_", "google_", "ga_"};

    /* renamed from: b */
    private SecureRandom f8448b;

    /* renamed from: c */
    private final AtomicLong f8449c = new AtomicLong(0);

    /* renamed from: d */
    private int f8450d;

    /* renamed from: e */
    private Integer f8451e = null;

    C2264el(C2166aw awVar) {
        super(awVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final boolean mo14253e() {
        return true;
    }

    /* access modifiers changed from: protected */
    @WorkerThread
    /* renamed from: f */
    public final void mo14254f() {
        mo14221d();
        SecureRandom secureRandom = new SecureRandom();
        long nextLong = secureRandom.nextLong();
        if (nextLong == 0) {
            nextLong = secureRandom.nextLong();
            if (nextLong == 0) {
                mo14235r().mo14833i().mo14841a("Utils falling back to Random for random id");
            }
        }
        this.f8449c.set(nextLong);
    }

    /* renamed from: g */
    public final long mo14581g() {
        long andIncrement;
        long j;
        if (this.f8449c.get() == 0) {
            synchronized (this.f8449c) {
                long nextLong = new Random(System.nanoTime() ^ mo14230m().mo9996a()).nextLong();
                int i = this.f8450d + 1;
                this.f8450d = i;
                j = nextLong + ((long) i);
            }
            return j;
        }
        synchronized (this.f8449c) {
            this.f8449c.compareAndSet(-1, 1);
            andIncrement = this.f8449c.getAndIncrement();
        }
        return andIncrement;
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: h */
    public final SecureRandom mo14582h() {
        mo14221d();
        if (this.f8448b == null) {
            this.f8448b = new SecureRandom();
        }
        return this.f8448b;
    }

    /* renamed from: a */
    static boolean m11025a(String str) {
        C0926p.m1308a(str);
        if (str.charAt(0) != '_' || str.equals("_ep")) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final Bundle mo14562a(@NonNull Uri uri) {
        String str;
        String str2;
        String str3;
        String str4;
        if (uri == null) {
            return null;
        }
        try {
            if (uri.isHierarchical()) {
                str4 = uri.getQueryParameter("utm_campaign");
                str3 = uri.getQueryParameter("utm_source");
                str2 = uri.getQueryParameter("utm_medium");
                str = uri.getQueryParameter("gclid");
            } else {
                str4 = null;
                str3 = null;
                str2 = null;
                str = null;
            }
            if (TextUtils.isEmpty(str4) && TextUtils.isEmpty(str3) && TextUtils.isEmpty(str2) && TextUtils.isEmpty(str)) {
                return null;
            }
            Bundle bundle = new Bundle();
            if (!TextUtils.isEmpty(str4)) {
                bundle.putString("campaign", str4);
            }
            if (!TextUtils.isEmpty(str3)) {
                bundle.putString("source", str3);
            }
            if (!TextUtils.isEmpty(str2)) {
                bundle.putString("medium", str2);
            }
            if (!TextUtils.isEmpty(str)) {
                bundle.putString("gclid", str);
            }
            String queryParameter = uri.getQueryParameter("utm_term");
            if (!TextUtils.isEmpty(queryParameter)) {
                bundle.putString("term", queryParameter);
            }
            String queryParameter2 = uri.getQueryParameter("utm_content");
            if (!TextUtils.isEmpty(queryParameter2)) {
                bundle.putString("content", queryParameter2);
            }
            String queryParameter3 = uri.getQueryParameter("aclid");
            if (!TextUtils.isEmpty(queryParameter3)) {
                bundle.putString("aclid", queryParameter3);
            }
            String queryParameter4 = uri.getQueryParameter("cp1");
            if (!TextUtils.isEmpty(queryParameter4)) {
                bundle.putString("cp1", queryParameter4);
            }
            String queryParameter5 = uri.getQueryParameter("anid");
            if (!TextUtils.isEmpty(queryParameter5)) {
                bundle.putString("anid", queryParameter5);
            }
            return bundle;
        } catch (UnsupportedOperationException e) {
            mo14235r().mo14833i().mo14842a("Install referrer url isn't a hierarchical URI", e);
            return null;
        }
    }

    /* renamed from: a */
    static boolean m11023a(Intent intent) {
        String stringExtra = intent.getStringExtra("android.intent.extra.REFERRER_NAME");
        return "android-app://com.google.android.googlequicksearchbox/https/www.google.com".equals(stringExtra) || "https://www.google.com".equals(stringExtra) || "android-app://com.google.appcrawler".equals(stringExtra);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo14572a(String str, String str2) {
        if (str2 == null) {
            mo14235r().mo14830d_().mo14842a("Name is required and can't be null. Type", str);
            return false;
        } else if (str2.length() == 0) {
            mo14235r().mo14830d_().mo14842a("Name is required and can't be empty. Type", str);
            return false;
        } else {
            int codePointAt = str2.codePointAt(0);
            if (!Character.isLetter(codePointAt)) {
                mo14235r().mo14830d_().mo14843a("Name must start with a letter. Type, name", str, str2);
                return false;
            }
            int length = str2.length();
            int charCount = Character.charCount(codePointAt);
            while (charCount < length) {
                int codePointAt2 = str2.codePointAt(charCount);
                if (codePointAt2 == 95 || Character.isLetterOrDigit(codePointAt2)) {
                    charCount += Character.charCount(codePointAt2);
                } else {
                    mo14235r().mo14830d_().mo14843a("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                    return false;
                }
            }
            return true;
        }
    }

    /* renamed from: d */
    private final boolean m11034d(String str, String str2) {
        if (str2 == null) {
            mo14235r().mo14830d_().mo14842a("Name is required and can't be null. Type", str);
            return false;
        } else if (str2.length() == 0) {
            mo14235r().mo14830d_().mo14842a("Name is required and can't be empty. Type", str);
            return false;
        } else {
            int codePointAt = str2.codePointAt(0);
            if (Character.isLetter(codePointAt) || codePointAt == 95) {
                int length = str2.length();
                int charCount = Character.charCount(codePointAt);
                while (charCount < length) {
                    int codePointAt2 = str2.codePointAt(charCount);
                    if (codePointAt2 == 95 || Character.isLetterOrDigit(codePointAt2)) {
                        charCount += Character.charCount(codePointAt2);
                    } else {
                        mo14235r().mo14830d_().mo14843a("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                        return false;
                    }
                }
                return true;
            }
            mo14235r().mo14830d_().mo14843a("Name must start with a letter or _ (underscore). Type, name", str, str2);
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo14573a(String str, String[] strArr, String str2) {
        boolean z;
        boolean z2;
        if (str2 == null) {
            mo14235r().mo14830d_().mo14842a("Name is required and can't be null. Type", str);
            return false;
        }
        C0926p.m1306a(str2);
        String[] strArr2 = f8447a;
        int length = strArr2.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                z = false;
                break;
            } else if (str2.startsWith(strArr2[i])) {
                z = true;
                break;
            } else {
                i++;
            }
        }
        if (z) {
            mo14235r().mo14830d_().mo14843a("Name starts with reserved prefix. Type, name", str, str2);
            return false;
        }
        if (strArr != null) {
            C0926p.m1306a(strArr);
            int length2 = strArr.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length2) {
                    z2 = false;
                    break;
                } else if (m11033c(str2, strArr[i2])) {
                    z2 = true;
                    break;
                } else {
                    i2++;
                }
            }
            if (z2) {
                mo14235r().mo14830d_().mo14843a("Name is reserved. Type, name", str, str2);
                return false;
            }
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo14571a(String str, int i, String str2) {
        if (str2 == null) {
            mo14235r().mo14830d_().mo14842a("Name is required and can't be null. Type", str);
            return false;
        } else if (str2.codePointCount(0, str2.length()) <= i) {
            return true;
        } else {
            mo14235r().mo14830d_().mo14844a("Name is too long. Type, maximum supported length, name", str, Integer.valueOf(i), str2);
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final int mo14574b(String str) {
        if (!m11034d(NotificationCompat.CATEGORY_EVENT, str)) {
            return 2;
        }
        if (!mo14573a(NotificationCompat.CATEGORY_EVENT, C2192bv.f8224a, str)) {
            return 13;
        }
        if (!mo14571a(NotificationCompat.CATEGORY_EVENT, 40, str)) {
            return 2;
        }
        return 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final int mo14577c(String str) {
        if (!m11034d("user property", str)) {
            return 6;
        }
        if (!mo14573a("user property", C2194bx.f8228a, str)) {
            return 15;
        }
        if (!mo14571a("user property", 24, str)) {
            return 6;
        }
        return 0;
    }

    /* renamed from: a */
    private final boolean m11026a(String str, String str2, int i, Object obj, boolean z) {
        if (obj == null || (obj instanceof Long) || (obj instanceof Float) || (obj instanceof Integer) || (obj instanceof Byte) || (obj instanceof Short) || (obj instanceof Boolean) || (obj instanceof Double)) {
            return true;
        }
        if ((obj instanceof String) || (obj instanceof Character) || (obj instanceof CharSequence)) {
            String valueOf = String.valueOf(obj);
            if (valueOf.codePointCount(0, valueOf.length()) <= i) {
                return true;
            }
            mo14235r().mo14833i().mo14844a("Value is too long; discarded. Value kind, name, value length", str, str2, Integer.valueOf(valueOf.length()));
            return false;
        } else if ((obj instanceof Bundle) && z) {
            return true;
        } else {
            if ((obj instanceof Parcelable[]) && z) {
                for (Parcelable parcelable : (Parcelable[]) obj) {
                    if (!(parcelable instanceof Bundle)) {
                        mo14235r().mo14833i().mo14843a("All Parcelable[] elements must be of type Bundle. Value type, name", parcelable.getClass(), str2);
                        return false;
                    }
                }
                return true;
            } else if (!(obj instanceof ArrayList) || !z) {
                return false;
            } else {
                ArrayList arrayList = (ArrayList) obj;
                int size = arrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj2 = arrayList.get(i2);
                    i2++;
                    if (!(obj2 instanceof Bundle)) {
                        mo14235r().mo14833i().mo14843a("All ArrayList elements must be of type Bundle. Value type, name", obj2.getClass(), str2);
                        return false;
                    }
                }
                return true;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final boolean mo14576b(String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            if (m11036g(str)) {
                return true;
            }
            if (this.f8222q.mo14328o()) {
                mo14235r().mo14830d_().mo14842a("Invalid google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI. provided id", C2295r.m11413a(str));
            }
            return false;
        } else if (TextUtils.isEmpty(str2)) {
            if (this.f8222q.mo14328o()) {
                mo14235r().mo14830d_().mo14841a("Missing google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI");
            }
            return false;
        } else if (m11036g(str2)) {
            return true;
        } else {
            mo14235r().mo14830d_().mo14842a("Invalid admob_app_id. Analytics disabled.", C2295r.m11413a(str2));
            return false;
        }
    }

    /* renamed from: a */
    static boolean m11027a(String str, String str2, String str3, String str4) {
        boolean isEmpty = TextUtils.isEmpty(str);
        boolean isEmpty2 = TextUtils.isEmpty(str2);
        if (!isEmpty && !isEmpty2) {
            return !str.equals(str2);
        }
        if (isEmpty && isEmpty2) {
            return (TextUtils.isEmpty(str3) || TextUtils.isEmpty(str4)) ? !TextUtils.isEmpty(str4) : !str3.equals(str4);
        }
        if (isEmpty || !isEmpty2) {
            return TextUtils.isEmpty(str3) || !str3.equals(str4);
        }
        if (TextUtils.isEmpty(str4)) {
            return false;
        }
        return TextUtils.isEmpty(str3) || !str3.equals(str4);
    }

    /* renamed from: g */
    private static boolean m11036g(String str) {
        C0926p.m1306a(str);
        return str.matches("^(1:\\d+:android:[a-f0-9]+|ca-app-pub-.*)$");
    }

    /* renamed from: a */
    private static Object m11019a(int i, Object obj, boolean z) {
        if (obj == null) {
            return null;
        }
        if ((obj instanceof Long) || (obj instanceof Double)) {
            return obj;
        }
        if (obj instanceof Integer) {
            return Long.valueOf((long) ((Integer) obj).intValue());
        }
        if (obj instanceof Byte) {
            return Long.valueOf((long) ((Byte) obj).byteValue());
        }
        if (obj instanceof Short) {
            return Long.valueOf((long) ((Short) obj).shortValue());
        }
        if (obj instanceof Boolean) {
            return Long.valueOf(((Boolean) obj).booleanValue() ? 1 : 0);
        } else if (obj instanceof Float) {
            return Double.valueOf(((Float) obj).doubleValue());
        } else {
            if ((obj instanceof String) || (obj instanceof Character) || (obj instanceof CharSequence)) {
                return m11020a(String.valueOf(obj), i, z);
            }
            return null;
        }
    }

    /* renamed from: a */
    public static String m11020a(String str, int i, boolean z) {
        if (str == null) {
            return null;
        }
        if (str.codePointCount(0, str.length()) <= i) {
            return str;
        }
        if (z) {
            return String.valueOf(str.substring(0, str.offsetByCodePoints(0, i))).concat("...");
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final Object mo14566a(String str, Object obj) {
        int i = 256;
        if ("_ev".equals(str)) {
            return m11019a(256, obj, true);
        }
        if (!m11035e(str)) {
            i = 100;
        }
        return m11019a(i, obj, false);
    }

    /* renamed from: a */
    static Bundle[] m11029a(Object obj) {
        if (obj instanceof Bundle) {
            return new Bundle[]{(Bundle) obj};
        } else if (obj instanceof Parcelable[]) {
            Parcelable[] parcelableArr = (Parcelable[]) obj;
            return (Bundle[]) Arrays.copyOf(parcelableArr, parcelableArr.length, Bundle[].class);
        } else if (!(obj instanceof ArrayList)) {
            return null;
        } else {
            ArrayList arrayList = (ArrayList) obj;
            return (Bundle[]) arrayList.toArray(new Bundle[arrayList.size()]);
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0052, code lost:
        if (mo14571a("event param", 40, r14) == false) goto L_0x003f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0071, code lost:
        if (mo14571a("event param", 40, r14) == false) goto L_0x0060;
     */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0114  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0130  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.os.Bundle mo14564a(java.lang.String r18, java.lang.String r19, android.os.Bundle r20, @android.support.annotation.Nullable java.util.List<java.lang.String> r21, boolean r22, boolean r23) {
        /*
            r17 = this;
            r6 = r17
            r7 = r20
            r8 = r21
            r9 = 0
            if (r7 == 0) goto L_0x0174
            android.os.Bundle r10 = new android.os.Bundle
            r10.<init>(r7)
            java.util.Set r0 = r20.keySet()
            java.util.Iterator r11 = r0.iterator()
            r12 = 0
            r13 = 0
        L_0x0018:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x0175
            java.lang.Object r0 = r11.next()
            r14 = r0
            java.lang.String r14 = (java.lang.String) r14
            r15 = 40
            r0 = 3
            if (r8 == 0) goto L_0x0033
            boolean r1 = r8.contains(r14)
            if (r1 != 0) goto L_0x0031
            goto L_0x0033
        L_0x0031:
            r1 = 0
            goto L_0x0075
        L_0x0033:
            r1 = 14
            if (r22 == 0) goto L_0x0055
            java.lang.String r2 = "event param"
            boolean r2 = r6.mo14572a((java.lang.String) r2, (java.lang.String) r14)
            if (r2 != 0) goto L_0x0041
        L_0x003f:
            r2 = 3
            goto L_0x0056
        L_0x0041:
            java.lang.String r2 = "event param"
            boolean r2 = r6.mo14573a((java.lang.String) r2, (java.lang.String[]) r9, (java.lang.String) r14)
            if (r2 != 0) goto L_0x004c
            r2 = 14
            goto L_0x0056
        L_0x004c:
            java.lang.String r2 = "event param"
            boolean r2 = r6.mo14571a((java.lang.String) r2, (int) r15, (java.lang.String) r14)
            if (r2 != 0) goto L_0x0055
            goto L_0x003f
        L_0x0055:
            r2 = 0
        L_0x0056:
            if (r2 != 0) goto L_0x0074
            java.lang.String r2 = "event param"
            boolean r2 = r6.m11034d(r2, r14)
            if (r2 != 0) goto L_0x0062
        L_0x0060:
            r1 = 3
            goto L_0x0075
        L_0x0062:
            java.lang.String r2 = "event param"
            boolean r2 = r6.mo14573a((java.lang.String) r2, (java.lang.String[]) r9, (java.lang.String) r14)
            if (r2 != 0) goto L_0x006b
            goto L_0x0075
        L_0x006b:
            java.lang.String r1 = "event param"
            boolean r1 = r6.mo14571a((java.lang.String) r1, (int) r15, (java.lang.String) r14)
            if (r1 != 0) goto L_0x0031
            goto L_0x0060
        L_0x0074:
            r1 = r2
        L_0x0075:
            r5 = 1
            if (r1 == 0) goto L_0x0091
            boolean r2 = m11024a((android.os.Bundle) r10, (int) r1)
            if (r2 == 0) goto L_0x008c
            java.lang.String r2 = m11020a((java.lang.String) r14, (int) r15, (boolean) r5)
            java.lang.String r3 = "_ev"
            r10.putString(r3, r2)
            if (r1 != r0) goto L_0x008c
            m11021a((android.os.Bundle) r10, (java.lang.Object) r14)
        L_0x008c:
            r10.remove(r14)
            goto L_0x012d
        L_0x0091:
            java.lang.Object r4 = r7.get(r14)
            r17.mo14221d()
            if (r23 == 0) goto L_0x00ce
            java.lang.String r0 = "param"
            boolean r1 = r4 instanceof android.os.Parcelable[]
            if (r1 == 0) goto L_0x00a5
            r1 = r4
            android.os.Parcelable[] r1 = (android.os.Parcelable[]) r1
            int r1 = r1.length
            goto L_0x00b0
        L_0x00a5:
            boolean r1 = r4 instanceof java.util.ArrayList
            if (r1 == 0) goto L_0x00c7
            r1 = r4
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            int r1 = r1.size()
        L_0x00b0:
            r2 = 1000(0x3e8, float:1.401E-42)
            if (r1 <= r2) goto L_0x00c7
            com.google.android.gms.measurement.internal.r r2 = r17.mo14235r()
            com.google.android.gms.measurement.internal.t r2 = r2.mo14833i()
            java.lang.String r3 = "Parameter array is too long; discarded. Value kind, name, array length"
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2.mo14844a(r3, r0, r14, r1)
            r0 = 0
            goto L_0x00c8
        L_0x00c7:
            r0 = 1
        L_0x00c8:
            if (r0 != 0) goto L_0x00ce
            r0 = 17
            r9 = 1
            goto L_0x010a
        L_0x00ce:
            com.google.android.gms.measurement.internal.et r0 = r17.mo14237t()
            r3 = r18
            boolean r0 = r0.mo14726f(r3)
            if (r0 == 0) goto L_0x00e0
            boolean r0 = m11035e(r19)
            if (r0 != 0) goto L_0x00e6
        L_0x00e0:
            boolean r0 = m11035e(r14)
            if (r0 == 0) goto L_0x00f7
        L_0x00e6:
            java.lang.String r1 = "param"
            r16 = 256(0x100, float:3.59E-43)
            r0 = r17
            r2 = r14
            r3 = r16
            r9 = 1
            r5 = r23
            boolean r0 = r0.m11026a((java.lang.String) r1, (java.lang.String) r2, (int) r3, (java.lang.Object) r4, (boolean) r5)
            goto L_0x0105
        L_0x00f7:
            r9 = 1
            java.lang.String r1 = "param"
            r3 = 100
            r0 = r17
            r2 = r14
            r5 = r23
            boolean r0 = r0.m11026a((java.lang.String) r1, (java.lang.String) r2, (int) r3, (java.lang.Object) r4, (boolean) r5)
        L_0x0105:
            if (r0 == 0) goto L_0x0109
            r0 = 0
            goto L_0x010a
        L_0x0109:
            r0 = 4
        L_0x010a:
            if (r0 == 0) goto L_0x0130
            java.lang.String r1 = "_ev"
            boolean r1 = r1.equals(r14)
            if (r1 != 0) goto L_0x0130
            boolean r0 = m11024a((android.os.Bundle) r10, (int) r0)
            if (r0 == 0) goto L_0x012a
            java.lang.String r0 = m11020a((java.lang.String) r14, (int) r15, (boolean) r9)
            java.lang.String r1 = "_ev"
            r10.putString(r1, r0)
            java.lang.Object r0 = r7.get(r14)
            m11021a((android.os.Bundle) r10, (java.lang.Object) r0)
        L_0x012a:
            r10.remove(r14)
        L_0x012d:
            r9 = 0
            goto L_0x0018
        L_0x0130:
            boolean r0 = m11025a((java.lang.String) r14)
            if (r0 == 0) goto L_0x0171
            int r13 = r13 + 1
            r0 = 25
            if (r13 <= r0) goto L_0x0171
            r0 = 48
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            java.lang.String r0 = "Event can't contain more than 25 params"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.google.android.gms.measurement.internal.r r1 = r17.mo14235r()
            com.google.android.gms.measurement.internal.t r1 = r1.mo14830d_()
            com.google.android.gms.measurement.internal.p r2 = r17.mo14232o()
            r3 = r19
            java.lang.String r2 = r2.mo14824a((java.lang.String) r3)
            com.google.android.gms.measurement.internal.p r4 = r17.mo14232o()
            java.lang.String r4 = r4.mo14821a((android.os.Bundle) r7)
            r1.mo14843a(r0, r2, r4)
            r0 = 5
            m11024a((android.os.Bundle) r10, (int) r0)
            r10.remove(r14)
            goto L_0x012d
        L_0x0171:
            r3 = r19
            goto L_0x012d
        L_0x0174:
            r10 = 0
        L_0x0175:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C2264el.mo14564a(java.lang.String, java.lang.String, android.os.Bundle, java.util.List, boolean, boolean):android.os.Bundle");
    }

    /* renamed from: a */
    private static boolean m11024a(Bundle bundle, int i) {
        if (bundle.getLong("_err") != 0) {
            return false;
        }
        bundle.putLong("_err", (long) i);
        return true;
    }

    /* renamed from: a */
    private static void m11021a(Bundle bundle, Object obj) {
        C0926p.m1306a(bundle);
        if (obj == null) {
            return;
        }
        if ((obj instanceof String) || (obj instanceof CharSequence)) {
            bundle.putLong("_el", (long) String.valueOf(obj).length());
        }
    }

    /* renamed from: h */
    private static int m11037h(String str) {
        if ("_ldl".equals(str)) {
            return 2048;
        }
        return "_id".equals(str) ? 256 : 36;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final int mo14575b(String str, Object obj) {
        boolean z;
        if ("_ldl".equals(str)) {
            z = m11026a("user property referrer", str, m11037h(str), obj, false);
        } else {
            z = m11026a("user property", str, m11037h(str), obj, false);
        }
        return z ? 0 : 7;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final Object mo14578c(String str, Object obj) {
        if ("_ldl".equals(str)) {
            return m11019a(m11037h(str), obj, true);
        }
        return m11019a(m11037h(str), obj, false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo14569a(Bundle bundle, String str, Object obj) {
        if (bundle != null) {
            if (obj instanceof Long) {
                bundle.putLong(str, ((Long) obj).longValue());
            } else if (obj instanceof String) {
                bundle.putString(str, String.valueOf(obj));
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Double) obj).doubleValue());
            } else if (str != null) {
                mo14235r().mo14835k().mo14843a("Not putting event parameter. Invalid value type. name, type", mo14232o().mo14825b(str), obj != null ? obj.getClass().getSimpleName() : null);
            }
        }
    }

    /* renamed from: a */
    public final void mo14567a(int i, String str, String str2, int i2) {
        mo14570a((String) null, i, str, str2, i2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo14570a(String str, int i, String str2, String str3, int i2) {
        Bundle bundle = new Bundle();
        m11024a(bundle, i);
        if (mo14237t().mo14723d(str, C2284h.f8556au)) {
            if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
                bundle.putString(str2, str3);
            }
        } else if (!TextUtils.isEmpty(str2)) {
            bundle.putString(str2, str3);
        }
        if (i == 6 || i == 7 || i == 2) {
            bundle.putLong("_el", (long) i2);
        }
        this.f8222q.mo14238u();
        this.f8222q.mo14323h().mo14395a("auto", "_err", bundle);
    }

    /* renamed from: i */
    static MessageDigest m11038i() {
        int i = 0;
        while (i < 2) {
            try {
                MessageDigest instance = MessageDigest.getInstance("MD5");
                if (instance != null) {
                    return instance;
                }
                i++;
            } catch (NoSuchAlgorithmException unused) {
            }
        }
        return null;
    }

    /* renamed from: a */
    static long m11018a(byte[] bArr) {
        C0926p.m1306a(bArr);
        int i = 0;
        C0926p.m1312a(bArr.length > 0);
        long j = 0;
        int length = bArr.length - 1;
        while (length >= 0 && length >= bArr.length - 8) {
            j += (((long) bArr[length]) & 255) << i;
            i += 8;
            length--;
        }
        return j;
    }

    /* renamed from: a */
    static boolean m11022a(Context context, boolean z) {
        C0926p.m1306a(context);
        if (Build.VERSION.SDK_INT >= 24) {
            return m11031b(context, "com.google.android.gms.measurement.AppMeasurementJobService");
        }
        return m11031b(context, "com.google.android.gms.measurement.AppMeasurementService");
    }

    /* renamed from: b */
    private static boolean m11031b(Context context, String str) {
        ServiceInfo serviceInfo;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null || (serviceInfo = packageManager.getServiceInfo(new ComponentName(context, str), 0)) == null || !serviceInfo.enabled) {
                return false;
            }
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: d */
    public final boolean mo14579d(String str) {
        mo14221d();
        if (C0771c.m904a(mo14231n()).mo9533a(str) == 0) {
            return true;
        }
        mo14235r().mo14837w().mo14842a("Permission not granted", str);
        return false;
    }

    /* renamed from: e */
    static boolean m11035e(String str) {
        return !TextUtils.isEmpty(str) && str.startsWith(C0080b.ROLL_OVER_FILE_NAME_SEPARATOR);
    }

    /* renamed from: c */
    static boolean m11033c(String str, String str2) {
        if (str == null && str2 == null) {
            return true;
        }
        if (str == null) {
            return false;
        }
        return str.equals(str2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final boolean mo14580f(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String v = mo14237t().mo14744v();
        mo14238u();
        return v.equals(str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final Bundle mo14563a(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            for (String str : bundle.keySet()) {
                Object a = mo14566a(str, bundle.get(str));
                if (a == null) {
                    mo14235r().mo14833i().mo14842a("Param value can't be null", mo14232o().mo14825b(str));
                } else {
                    mo14569a(bundle2, str, a);
                }
            }
        }
        return bundle2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final zzag mo14565a(String str, String str2, Bundle bundle, String str3, long j, boolean z, boolean z2) {
        if (TextUtils.isEmpty(str2)) {
            return null;
        }
        if (mo14574b(str2) == 0) {
            Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
            bundle2.putString("_o", str3);
            return new zzag(str2, new zzad(mo14563a(mo14564a(str, str2, bundle2, C0970f.m1472a("_o"), false, false))), str3, j);
        }
        mo14235r().mo14830d_().mo14842a("Invalid conditional property event name", mo14232o().mo14826c(str2));
        throw new IllegalArgumentException();
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: a */
    public final long mo14561a(Context context, String str) {
        mo14221d();
        C0926p.m1306a(context);
        C0926p.m1308a(str);
        PackageManager packageManager = context.getPackageManager();
        MessageDigest i = m11038i();
        if (i == null) {
            mo14235r().mo14830d_().mo14841a("Could not get MD5 instance");
            return -1;
        }
        if (packageManager != null) {
            try {
                if (!m11032c(context, str)) {
                    PackageInfo b = C0771c.m904a(context).mo9540b(mo14231n().getPackageName(), 64);
                    if (b.signatures != null && b.signatures.length > 0) {
                        return m11018a(i.digest(b.signatures[0].toByteArray()));
                    }
                    mo14235r().mo14833i().mo14841a("Could not get signatures");
                    return -1;
                }
            } catch (PackageManager.NameNotFoundException e) {
                mo14235r().mo14830d_().mo14842a("Package name not found", e);
            }
        }
        return 0;
    }

    /* renamed from: c */
    private final boolean m11032c(Context context, String str) {
        X500Principal x500Principal = new X500Principal("CN=Android Debug,O=Android,C=US");
        try {
            PackageInfo b = C0771c.m904a(context).mo9540b(str, 64);
            if (b == null || b.signatures == null || b.signatures.length <= 0) {
                return true;
            }
            return ((X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(b.signatures[0].toByteArray()))).getSubjectX500Principal().equals(x500Principal);
        } catch (CertificateException e) {
            mo14235r().mo14830d_().mo14842a("Error obtaining certificate", e);
            return true;
        } catch (PackageManager.NameNotFoundException e2) {
            mo14235r().mo14830d_().mo14842a("Package name not found", e2);
            return true;
        }
    }

    /* renamed from: a */
    static byte[] m11028a(Parcelable parcelable) {
        if (parcelable == null) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        try {
            parcelable.writeToParcel(obtain, 0);
            return obtain.marshall();
        } finally {
            obtain.recycle();
        }
    }

    /* renamed from: b */
    public static Bundle m11030b(Bundle bundle) {
        if (bundle == null) {
            return new Bundle();
        }
        Bundle bundle2 = new Bundle(bundle);
        for (String str : bundle2.keySet()) {
            Object obj = bundle2.get(str);
            if (obj instanceof Bundle) {
                bundle2.putBundle(str, new Bundle((Bundle) obj));
            } else {
                int i = 0;
                if (obj instanceof Parcelable[]) {
                    Parcelable[] parcelableArr = (Parcelable[]) obj;
                    while (i < parcelableArr.length) {
                        if (parcelableArr[i] instanceof Bundle) {
                            parcelableArr[i] = new Bundle((Bundle) parcelableArr[i]);
                        }
                        i++;
                    }
                } else if (obj instanceof List) {
                    List list = (List) obj;
                    while (i < list.size()) {
                        Object obj2 = list.get(i);
                        if (obj2 instanceof Bundle) {
                            list.set(i, new Bundle((Bundle) obj2));
                        }
                        i++;
                    }
                }
            }
        }
        return bundle2;
    }

    /* renamed from: j */
    public final int mo14583j() {
        if (this.f8451e == null) {
            this.f8451e = Integer.valueOf(C0851d.m1126b().mo9729c(mo14231n()) / 1000);
        }
        return this.f8451e.intValue();
    }

    /* renamed from: a */
    public final int mo14560a(int i) {
        return C0851d.m1126b().mo9722b(mo14231n(), (int) C0858g.GOOGLE_PLAY_SERVICES_VERSION_CODE);
    }

    /* renamed from: a */
    public static long m11017a(long j, long j2) {
        return (j + (j2 * 60000)) / 86400000;
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: k */
    public final String mo14584k() {
        byte[] bArr = new byte[16];
        mo14582h().nextBytes(bArr);
        return String.format(Locale.US, "%032x", new Object[]{new BigInteger(1, bArr)});
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: a */
    public final void mo14568a(Bundle bundle, long j) {
        long j2 = bundle.getLong("_et");
        if (j2 != 0) {
            mo14235r().mo14833i().mo14842a("Params already contained engagement", Long.valueOf(j2));
        }
        bundle.putLong("_et", j + j2);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo14215a() {
        super.mo14215a();
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo14218b() {
        super.mo14218b();
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo14220c() {
        super.mo14220c();
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo14221d() {
        super.mo14221d();
    }

    /* renamed from: l */
    public final /* bridge */ /* synthetic */ C2170b mo14229l() {
        return super.mo14229l();
    }

    /* renamed from: m */
    public final /* bridge */ /* synthetic */ C0969e mo14230m() {
        return super.mo14230m();
    }

    /* renamed from: n */
    public final /* bridge */ /* synthetic */ Context mo14231n() {
        return super.mo14231n();
    }

    /* renamed from: o */
    public final /* bridge */ /* synthetic */ C2293p mo14232o() {
        return super.mo14232o();
    }

    /* renamed from: p */
    public final /* bridge */ /* synthetic */ C2264el mo14233p() {
        return super.mo14233p();
    }

    /* renamed from: q */
    public final /* bridge */ /* synthetic */ C2161ar mo14234q() {
        return super.mo14234q();
    }

    /* renamed from: r */
    public final /* bridge */ /* synthetic */ C2295r mo14235r() {
        return super.mo14235r();
    }

    /* renamed from: s */
    public final /* bridge */ /* synthetic */ C2147ad mo14236s() {
        return super.mo14236s();
    }

    /* renamed from: t */
    public final /* bridge */ /* synthetic */ C2272et mo14237t() {
        return super.mo14237t();
    }

    /* renamed from: u */
    public final /* bridge */ /* synthetic */ C2270er mo14238u() {
        return super.mo14238u();
    }
}
