package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.annotation.WorkerThread;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C0926p;
import com.google.android.gms.common.util.C0969e;
import com.google.android.gms.internal.measurement.C1905ay;
import com.google.android.gms.internal.measurement.C1906az;
import com.google.android.gms.internal.measurement.C1908ba;
import com.google.android.gms.internal.measurement.C1909bb;
import com.google.android.gms.internal.measurement.C1910bc;
import com.google.android.gms.internal.measurement.C1914bg;
import com.google.android.gms.internal.measurement.C1915bh;
import com.google.android.gms.internal.measurement.C1916bi;
import com.google.android.gms.internal.measurement.C1917bj;
import com.google.android.gms.internal.measurement.C1918bk;
import com.google.android.gms.internal.measurement.C1919bl;
import com.google.android.gms.internal.measurement.C1920bm;
import com.google.android.gms.internal.measurement.C1921bn;
import com.google.android.gms.internal.measurement.C1922bo;
import com.google.android.gms.internal.measurement.C2107hw;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Iterator;
import java.util.Map;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

/* renamed from: com.google.android.gms.measurement.internal.ei */
public final class C2261ei extends C2253eb {
    C2261ei(C2254ec ecVar) {
        super(ecVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final boolean mo14289e() {
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo14550a(C1922bo boVar, Object obj) {
        C0926p.m1306a(obj);
        boVar.f7517c = null;
        boVar.f7518d = null;
        boVar.f7519e = null;
        if (obj instanceof String) {
            boVar.f7517c = (String) obj;
        } else if (obj instanceof Long) {
            boVar.f7518d = (Long) obj;
        } else if (obj instanceof Double) {
            boVar.f7519e = (Double) obj;
        } else {
            mo14235r().mo14830d_().mo14842a("Ignoring invalid (type) user attribute value", obj);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo14549a(C1917bj bjVar, Object obj) {
        C0926p.m1306a(obj);
        bjVar.f7460b = null;
        bjVar.f7461c = null;
        bjVar.f7462d = null;
        if (obj instanceof String) {
            bjVar.f7460b = (String) obj;
        } else if (obj instanceof Long) {
            bjVar.f7461c = (Long) obj;
        } else if (obj instanceof Double) {
            bjVar.f7462d = (Double) obj;
        } else {
            mo14235r().mo14830d_().mo14842a("Ignoring invalid (type) event param value", obj);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final byte[] mo14553a(C1918bk bkVar) {
        try {
            byte[] bArr = new byte[bkVar.mo14106e()];
            C2107hw a = C2107hw.m10220a(bArr, 0, bArr.length);
            bkVar.mo13499a(a);
            a.mo14068a();
            return bArr;
        } catch (IOException e) {
            mo14235r().mo14830d_().mo14842a("Data loss. Failed to serialize batch", e);
            return null;
        }
    }

    /* renamed from: a */
    static C1917bj m10976a(C1916bi biVar, String str) {
        for (C1917bj bjVar : biVar.f7453a) {
            if (bjVar.f7459a.equals(str)) {
                return bjVar;
            }
        }
        return null;
    }

    /* renamed from: b */
    static Object m10986b(C1916bi biVar, String str) {
        C1917bj a = m10976a(biVar, str);
        if (a == null) {
            return null;
        }
        if (a.f7460b != null) {
            return a.f7460b;
        }
        if (a.f7461c != null) {
            return a.f7461c;
        }
        if (a.f7462d != null) {
            return a.f7462d;
        }
        return null;
    }

    /* renamed from: a */
    static C1917bj[] m10985a(C1917bj[] bjVarArr, String str, Object obj) {
        for (C1917bj bjVar : bjVarArr) {
            if (str.equals(bjVar.f7459a)) {
                bjVar.f7461c = null;
                bjVar.f7460b = null;
                bjVar.f7462d = null;
                if (obj instanceof Long) {
                    bjVar.f7461c = (Long) obj;
                } else if (obj instanceof String) {
                    bjVar.f7460b = (String) obj;
                } else if (obj instanceof Double) {
                    bjVar.f7462d = (Double) obj;
                }
                return bjVarArr;
            }
        }
        C1917bj[] bjVarArr2 = new C1917bj[(bjVarArr.length + 1)];
        System.arraycopy(bjVarArr, 0, bjVarArr2, 0, bjVarArr.length);
        C1917bj bjVar2 = new C1917bj();
        bjVar2.f7459a = str;
        if (obj instanceof Long) {
            bjVar2.f7461c = (Long) obj;
        } else if (obj instanceof String) {
            bjVar2.f7460b = (String) obj;
        } else if (obj instanceof Double) {
            bjVar2.f7462d = (Double) obj;
        }
        bjVarArr2[bjVarArr.length] = bjVar2;
        return bjVarArr2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final String mo14555b(C1918bk bkVar) {
        int i;
        int i2;
        C1918bk bkVar2 = bkVar;
        StringBuilder sb = new StringBuilder();
        sb.append("\nbatch {\n");
        if (bkVar2.f7464a != null) {
            for (C1919bl blVar : bkVar2.f7464a) {
                if (!(blVar == null || blVar == null)) {
                    m10977a(sb, 1);
                    sb.append("bundle {\n");
                    m10981a(sb, 1, "protocol_version", (Object) blVar.f7481a);
                    m10981a(sb, 1, "platform", (Object) blVar.f7489i);
                    m10981a(sb, 1, "gmp_version", (Object) blVar.f7497q);
                    m10981a(sb, 1, "uploading_gmp_version", (Object) blVar.f7498r);
                    m10981a(sb, 1, "config_version", (Object) blVar.f7470E);
                    m10981a(sb, 1, "gmp_app_id", (Object) blVar.f7505y);
                    m10981a(sb, 1, "admob_app_id", (Object) blVar.f7474I);
                    m10981a(sb, 1, "app_id", (Object) blVar.f7495o);
                    m10981a(sb, 1, "app_version", (Object) blVar.f7496p);
                    m10981a(sb, 1, "app_version_major", (Object) blVar.f7468C);
                    m10981a(sb, 1, "firebase_instance_id", (Object) blVar.f7467B);
                    m10981a(sb, 1, "dev_cert_hash", (Object) blVar.f7502v);
                    m10981a(sb, 1, "app_store", (Object) blVar.f7494n);
                    m10981a(sb, 1, "upload_timestamp_millis", (Object) blVar.f7484d);
                    m10981a(sb, 1, "start_timestamp_millis", (Object) blVar.f7485e);
                    m10981a(sb, 1, "end_timestamp_millis", (Object) blVar.f7486f);
                    m10981a(sb, 1, "previous_bundle_start_timestamp_millis", (Object) blVar.f7487g);
                    m10981a(sb, 1, "previous_bundle_end_timestamp_millis", (Object) blVar.f7488h);
                    m10981a(sb, 1, "app_instance_id", (Object) blVar.f7501u);
                    m10981a(sb, 1, "resettable_device_id", (Object) blVar.f7499s);
                    m10981a(sb, 1, "device_id", (Object) blVar.f7469D);
                    m10981a(sb, 1, "ds_id", (Object) blVar.f7472G);
                    m10981a(sb, 1, "limited_ad_tracking", (Object) blVar.f7500t);
                    m10981a(sb, 1, "os_version", (Object) blVar.f7490j);
                    m10981a(sb, 1, "device_model", (Object) blVar.f7491k);
                    m10981a(sb, 1, "user_default_language", (Object) blVar.f7492l);
                    m10981a(sb, 1, "time_zone_offset_minutes", (Object) blVar.f7493m);
                    m10981a(sb, 1, "bundle_sequential_index", (Object) blVar.f7503w);
                    m10981a(sb, 1, "service_upload", (Object) blVar.f7506z);
                    m10981a(sb, 1, "health_monitor", (Object) blVar.f7504x);
                    if (!(blVar.f7471F == null || blVar.f7471F.longValue() == 0)) {
                        m10981a(sb, 1, "android_id", (Object) blVar.f7471F);
                    }
                    if (blVar.f7473H != null) {
                        m10981a(sb, 1, "retry_counter", (Object) blVar.f7473H);
                    }
                    C1922bo[] boVarArr = blVar.f7483c;
                    if (boVarArr != null) {
                        for (C1922bo boVar : boVarArr) {
                            if (boVar != null) {
                                m10977a(sb, 2);
                                sb.append("user_property {\n");
                                m10981a(sb, 2, "set_timestamp_millis", (Object) boVar.f7515a);
                                m10981a(sb, 2, "name", (Object) mo14232o().mo14826c(boVar.f7516b));
                                m10981a(sb, 2, "string_value", (Object) boVar.f7517c);
                                m10981a(sb, 2, "int_value", (Object) boVar.f7518d);
                                m10981a(sb, 2, "double_value", (Object) boVar.f7519e);
                                m10977a(sb, 2);
                                sb.append("}\n");
                            }
                        }
                    }
                    C1914bg[] bgVarArr = blVar.f7466A;
                    String str = blVar.f7495o;
                    if (bgVarArr != null) {
                        int length = bgVarArr.length;
                        int i3 = 0;
                        while (i3 < length) {
                            C1914bg bgVar = bgVarArr[i3];
                            if (bgVar != null) {
                                m10977a(sb, 2);
                                sb.append("audience_membership {\n");
                                m10981a(sb, 2, "audience_id", (Object) bgVar.f7445a);
                                m10981a(sb, 2, "new_audience", (Object) bgVar.f7448d);
                                StringBuilder sb2 = sb;
                                i2 = i3;
                                i = length;
                                String str2 = str;
                                m10980a(sb2, 2, "current_data", bgVar.f7446b, str2);
                                m10980a(sb2, 2, "previous_data", bgVar.f7447c, str2);
                                m10977a(sb, 2);
                                sb.append("}\n");
                            } else {
                                i2 = i3;
                                i = length;
                            }
                            i3 = i2 + 1;
                            length = i;
                        }
                    }
                    C1916bi[] biVarArr = blVar.f7482b;
                    if (biVarArr != null) {
                        for (C1916bi biVar : biVarArr) {
                            if (biVar != null) {
                                m10977a(sb, 2);
                                sb.append("event {\n");
                                m10981a(sb, 2, "name", (Object) mo14232o().mo14824a(biVar.f7454b));
                                m10981a(sb, 2, "timestamp_millis", (Object) biVar.f7455c);
                                m10981a(sb, 2, "previous_timestamp_millis", (Object) biVar.f7456d);
                                m10981a(sb, 2, "count", (Object) biVar.f7457e);
                                C1917bj[] bjVarArr = biVar.f7453a;
                                if (bjVarArr != null) {
                                    for (C1917bj bjVar : bjVarArr) {
                                        if (bjVar != null) {
                                            m10977a(sb, 3);
                                            sb.append("param {\n");
                                            m10981a(sb, 3, "name", (Object) mo14232o().mo14825b(bjVar.f7459a));
                                            m10981a(sb, 3, "string_value", (Object) bjVar.f7460b);
                                            m10981a(sb, 3, "int_value", (Object) bjVar.f7461c);
                                            m10981a(sb, 3, "double_value", (Object) bjVar.f7462d);
                                            m10977a(sb, 3);
                                            sb.append("}\n");
                                        }
                                    }
                                }
                                m10977a(sb, 2);
                                sb.append("}\n");
                            }
                        }
                    }
                    m10977a(sb, 1);
                    sb.append("}\n");
                }
            }
        }
        sb.append("}\n");
        return sb.toString();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final String mo14547a(C1905ay ayVar) {
        if (ayVar == null) {
            return "null";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("\nevent_filter {\n");
        m10981a(sb, 0, "filter_id", (Object) ayVar.f7400a);
        m10981a(sb, 0, "event_name", (Object) mo14232o().mo14824a(ayVar.f7401b));
        m10979a(sb, 1, "event_count_filter", ayVar.f7403d);
        sb.append("  filters {\n");
        for (C1906az a : ayVar.f7402c) {
            m10978a(sb, 2, a);
        }
        m10977a(sb, 1);
        sb.append("}\n}\n");
        return sb.toString();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final String mo14548a(C1909bb bbVar) {
        if (bbVar == null) {
            return "null";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("\nproperty_filter {\n");
        m10981a(sb, 0, "filter_id", (Object) bbVar.f7419a);
        m10981a(sb, 0, "property_name", (Object) mo14232o().mo14826c(bbVar.f7420b));
        m10978a(sb, 1, bbVar.f7421c);
        sb.append("}\n");
        return sb.toString();
    }

    /* renamed from: a */
    private final void m10980a(StringBuilder sb, int i, String str, C1920bm bmVar, String str2) {
        if (bmVar != null) {
            m10977a(sb, 3);
            sb.append(str);
            sb.append(" {\n");
            if (bmVar.f7508b != null) {
                m10977a(sb, 4);
                sb.append("results: ");
                long[] jArr = bmVar.f7508b;
                int length = jArr.length;
                int i2 = 0;
                int i3 = 0;
                while (i2 < length) {
                    Long valueOf = Long.valueOf(jArr[i2]);
                    int i4 = i3 + 1;
                    if (i3 != 0) {
                        sb.append(", ");
                    }
                    sb.append(valueOf);
                    i2++;
                    i3 = i4;
                }
                sb.append(10);
            }
            if (bmVar.f7507a != null) {
                m10977a(sb, 4);
                sb.append("status: ");
                long[] jArr2 = bmVar.f7507a;
                int length2 = jArr2.length;
                int i5 = 0;
                int i6 = 0;
                while (i5 < length2) {
                    Long valueOf2 = Long.valueOf(jArr2[i5]);
                    int i7 = i6 + 1;
                    if (i6 != 0) {
                        sb.append(", ");
                    }
                    sb.append(valueOf2);
                    i5++;
                    i6 = i7;
                }
                sb.append(10);
            }
            if (mo14237t().mo14734k(str2)) {
                if (bmVar.f7509c != null) {
                    m10977a(sb, 4);
                    sb.append("dynamic_filter_timestamps: {");
                    C1915bh[] bhVarArr = bmVar.f7509c;
                    int length3 = bhVarArr.length;
                    int i8 = 0;
                    int i9 = 0;
                    while (i8 < length3) {
                        C1915bh bhVar = bhVarArr[i8];
                        int i10 = i9 + 1;
                        if (i9 != 0) {
                            sb.append(", ");
                        }
                        sb.append(bhVar.f7450a);
                        sb.append(":");
                        sb.append(bhVar.f7451b);
                        i8++;
                        i9 = i10;
                    }
                    sb.append("}\n");
                }
                if (bmVar.f7510d != null) {
                    m10977a(sb, 4);
                    sb.append("sequence_filter_timestamps: {");
                    C1921bn[] bnVarArr = bmVar.f7510d;
                    int length4 = bnVarArr.length;
                    int i11 = 0;
                    int i12 = 0;
                    while (i11 < length4) {
                        C1921bn bnVar = bnVarArr[i11];
                        int i13 = i12 + 1;
                        if (i12 != 0) {
                            sb.append(", ");
                        }
                        sb.append(bnVar.f7512a);
                        sb.append(": [");
                        long[] jArr3 = bnVar.f7513b;
                        int length5 = jArr3.length;
                        int i14 = 0;
                        int i15 = 0;
                        while (i14 < length5) {
                            long j = jArr3[i14];
                            int i16 = i15 + 1;
                            if (i15 != 0) {
                                sb.append(", ");
                            }
                            sb.append(j);
                            i14++;
                            i15 = i16;
                        }
                        sb.append("]");
                        i11++;
                        i12 = i13;
                    }
                    sb.append("}\n");
                }
            }
            m10977a(sb, 3);
            sb.append("}\n");
        }
    }

    /* renamed from: a */
    private final void m10979a(StringBuilder sb, int i, String str, C1908ba baVar) {
        if (baVar != null) {
            m10977a(sb, i);
            sb.append(str);
            sb.append(" {\n");
            if (baVar.f7413a != null) {
                String str2 = "UNKNOWN_COMPARISON_TYPE";
                switch (baVar.f7413a.intValue()) {
                    case 1:
                        str2 = "LESS_THAN";
                        break;
                    case 2:
                        str2 = "GREATER_THAN";
                        break;
                    case 3:
                        str2 = "EQUAL";
                        break;
                    case 4:
                        str2 = "BETWEEN";
                        break;
                }
                m10981a(sb, i, "comparison_type", (Object) str2);
            }
            m10981a(sb, i, "match_as_float", (Object) baVar.f7414b);
            m10981a(sb, i, "comparison_value", (Object) baVar.f7415c);
            m10981a(sb, i, "min_comparison_value", (Object) baVar.f7416d);
            m10981a(sb, i, "max_comparison_value", (Object) baVar.f7417e);
            m10977a(sb, i);
            sb.append("}\n");
        }
    }

    /* renamed from: a */
    private final void m10978a(StringBuilder sb, int i, C1906az azVar) {
        if (azVar != null) {
            m10977a(sb, i);
            sb.append("filter {\n");
            m10981a(sb, i, "complement", (Object) azVar.f7410c);
            m10981a(sb, i, "param_name", (Object) mo14232o().mo14825b(azVar.f7411d));
            int i2 = i + 1;
            C1910bc bcVar = azVar.f7408a;
            if (bcVar != null) {
                m10977a(sb, i2);
                sb.append("string_filter");
                sb.append(" {\n");
                if (bcVar.f7424a != null) {
                    String str = "UNKNOWN_MATCH_TYPE";
                    switch (bcVar.f7424a.intValue()) {
                        case 1:
                            str = "REGEXP";
                            break;
                        case 2:
                            str = "BEGINS_WITH";
                            break;
                        case 3:
                            str = "ENDS_WITH";
                            break;
                        case 4:
                            str = "PARTIAL";
                            break;
                        case 5:
                            str = "EXACT";
                            break;
                        case 6:
                            str = "IN_LIST";
                            break;
                    }
                    m10981a(sb, i2, "match_type", (Object) str);
                }
                m10981a(sb, i2, "expression", (Object) bcVar.f7425b);
                m10981a(sb, i2, "case_sensitive", (Object) bcVar.f7426c);
                if (bcVar.f7427d.length > 0) {
                    m10977a(sb, i2 + 1);
                    sb.append("expression_list {\n");
                    for (String append : bcVar.f7427d) {
                        m10977a(sb, i2 + 2);
                        sb.append(append);
                        sb.append("\n");
                    }
                    sb.append("}\n");
                }
                m10977a(sb, i2);
                sb.append("}\n");
            }
            m10979a(sb, i2, "number_filter", azVar.f7409b);
            m10977a(sb, i);
            sb.append("}\n");
        }
    }

    /* renamed from: a */
    private static void m10977a(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            sb.append("  ");
        }
    }

    /* renamed from: a */
    private static void m10981a(StringBuilder sb, int i, String str, Object obj) {
        if (obj != null) {
            m10977a(sb, i + 1);
            sb.append(str);
            sb.append(": ");
            sb.append(obj);
            sb.append(10);
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
        mo14235r().mo14830d_().mo14841a("Failed to load parcelable from buffer");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002c, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002d, code lost:
        r1.recycle();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0030, code lost:
        throw r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001a, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x001c */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final <T extends android.os.Parcelable> T mo14546a(byte[] r5, android.os.Parcelable.Creator<T> r6) {
        /*
            r4 = this;
            r0 = 0
            if (r5 != 0) goto L_0x0004
            return r0
        L_0x0004:
            android.os.Parcel r1 = android.os.Parcel.obtain()
            int r2 = r5.length     // Catch:{ a -> 0x001c }
            r3 = 0
            r1.unmarshall(r5, r3, r2)     // Catch:{ a -> 0x001c }
            r1.setDataPosition(r3)     // Catch:{ a -> 0x001c }
            java.lang.Object r5 = r6.createFromParcel(r1)     // Catch:{ a -> 0x001c }
            android.os.Parcelable r5 = (android.os.Parcelable) r5     // Catch:{ a -> 0x001c }
            r1.recycle()
            return r5
        L_0x001a:
            r5 = move-exception
            goto L_0x002d
        L_0x001c:
            com.google.android.gms.measurement.internal.r r5 = r4.mo14235r()     // Catch:{ all -> 0x001a }
            com.google.android.gms.measurement.internal.t r5 = r5.mo14830d_()     // Catch:{ all -> 0x001a }
            java.lang.String r6 = "Failed to load parcelable from buffer"
            r5.mo14841a(r6)     // Catch:{ all -> 0x001a }
            r1.recycle()
            return r0
        L_0x002d:
            r1.recycle()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C2261ei.mo14546a(byte[], android.os.Parcelable$Creator):android.os.Parcelable");
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: a */
    public final boolean mo14552a(zzag zzag, zzk zzk) {
        C0926p.m1306a(zzag);
        C0926p.m1306a(zzk);
        if (!TextUtils.isEmpty(zzk.f8662b) || !TextUtils.isEmpty(zzk.f8678r)) {
            return true;
        }
        mo14238u();
        return false;
    }

    /* renamed from: a */
    static boolean m10982a(String str) {
        return str != null && str.matches("([+-])?([0-9]+\\.?[0-9]*|[0-9]*\\.?[0-9]+)") && str.length() <= 310;
    }

    /* renamed from: a */
    static boolean m10983a(long[] jArr, int i) {
        if (i >= (jArr.length << 6)) {
            return false;
        }
        if (((1 << (i % 64)) & jArr[i / 64]) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    static long[] m10984a(BitSet bitSet) {
        int length = (bitSet.length() + 63) / 64;
        long[] jArr = new long[length];
        for (int i = 0; i < length; i++) {
            jArr[i] = 0;
            for (int i2 = 0; i2 < 64; i2++) {
                int i3 = (i << 6) + i2;
                if (i3 >= bitSet.length()) {
                    break;
                }
                if (bitSet.get(i3)) {
                    jArr[i] = jArr[i] | (1 << i2);
                }
            }
        }
        return jArr;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo14551a(long j, long j2) {
        return j == 0 || j2 <= 0 || Math.abs(mo14230m().mo9996a() - j) > j2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final byte[] mo14554a(byte[] bArr) {
        try {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            GZIPInputStream gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr2 = new byte[1024];
            while (true) {
                int read = gZIPInputStream.read(bArr2);
                if (read > 0) {
                    byteArrayOutputStream.write(bArr2, 0, read);
                } else {
                    gZIPInputStream.close();
                    byteArrayInputStream.close();
                    return byteArrayOutputStream.toByteArray();
                }
            }
        } catch (IOException e) {
            mo14235r().mo14830d_().mo14842a("Failed to ungzip content", e);
            throw e;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final byte[] mo14556b(byte[] bArr) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(bArr);
            gZIPOutputStream.close();
            byteArrayOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            mo14235r().mo14830d_().mo14842a("Failed to gzip content", e);
            throw e;
        }
    }

    /* access modifiers changed from: package-private */
    @Nullable
    /* renamed from: f */
    public final int[] mo14557f() {
        Map<String, String> a = C2284h.m11277a(this.f8402a.mo14231n());
        if (a == null || a.size() == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int intValue = C2284h.f8528U.mo14804b().intValue();
        Iterator<Map.Entry<String, String>> it = a.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Map.Entry next = it.next();
            if (((String) next.getKey()).startsWith("measurement.id.")) {
                try {
                    int parseInt = Integer.parseInt((String) next.getValue());
                    if (parseInt != 0) {
                        arrayList.add(Integer.valueOf(parseInt));
                        if (arrayList.size() >= intValue) {
                            mo14235r().mo14833i().mo14842a("Too many experiment IDs. Number of IDs", Integer.valueOf(arrayList.size()));
                            break;
                        }
                    } else {
                        continue;
                    }
                } catch (NumberFormatException e) {
                    mo14235r().mo14833i().mo14842a("Experiment ID NumberFormatException", e);
                }
            }
        }
        if (arrayList.size() == 0) {
            return null;
        }
        int[] iArr = new int[arrayList.size()];
        ArrayList arrayList2 = arrayList;
        int size = arrayList2.size();
        int i = 0;
        int i2 = 0;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            iArr[i2] = ((Integer) obj).intValue();
            i2++;
        }
        return iArr;
    }

    /* renamed from: g */
    public final /* bridge */ /* synthetic */ C2261ei mo14291g() {
        return super.mo14291g();
    }

    /* renamed from: h */
    public final /* bridge */ /* synthetic */ C2269eq mo14293h() {
        return super.mo14293h();
    }

    /* renamed from: i */
    public final /* bridge */ /* synthetic */ C2275ew mo14294i() {
        return super.mo14294i();
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
