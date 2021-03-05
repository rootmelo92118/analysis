package com.google.android.gms.common.server.response;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import com.google.android.gms.common.internal.C0926p;
import com.google.android.gms.common.internal.safeparcel.C0930a;
import com.google.android.gms.common.internal.safeparcel.C0932b;
import com.google.android.gms.common.server.response.FastJsonResponse;
import com.google.android.gms.common.util.C0966b;
import com.google.android.gms.common.util.C0967c;
import com.google.android.gms.common.util.C0976l;
import com.google.android.gms.common.util.C0977m;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class SafeParcelResponse extends FastSafeParcelableJsonResponse {
    public static final Parcelable.Creator<SafeParcelResponse> CREATOR = new C0958e();

    /* renamed from: a */
    private final int f1167a;

    /* renamed from: b */
    private final Parcel f1168b;

    /* renamed from: c */
    private final int f1169c = 2;

    /* renamed from: d */
    private final zak f1170d;

    /* renamed from: e */
    private final String f1171e;

    /* renamed from: f */
    private int f1172f;

    /* renamed from: g */
    private int f1173g;

    SafeParcelResponse(int i, Parcel parcel, zak zak) {
        this.f1167a = i;
        this.f1168b = (Parcel) C0926p.m1306a(parcel);
        this.f1170d = zak;
        if (this.f1170d == null) {
            this.f1171e = null;
        } else {
            this.f1171e = this.f1170d.mo9976b();
        }
        this.f1172f = 2;
    }

    public void writeToParcel(Parcel parcel, int i) {
        zak zak;
        int a = C0932b.m1364a(parcel);
        C0932b.m1367a(parcel, 1, this.f1167a);
        C0932b.m1371a(parcel, 2, m1432b(), false);
        switch (this.f1169c) {
            case 0:
                zak = null;
                break;
            case 1:
                zak = this.f1170d;
                break;
            case 2:
                zak = this.f1170d;
                break;
            default:
                int i2 = this.f1169c;
                StringBuilder sb = new StringBuilder(34);
                sb.append("Invalid creation type: ");
                sb.append(i2);
                throw new IllegalStateException(sb.toString());
        }
        C0932b.m1372a(parcel, 3, (Parcelable) zak, i, false);
        C0932b.m1365a(parcel, a);
    }

    /* renamed from: b */
    private final Parcel m1432b() {
        switch (this.f1172f) {
            case 0:
                this.f1173g = C0932b.m1364a(this.f1168b);
                break;
            case 1:
                break;
        }
        C0932b.m1365a(this.f1168b, this.f1173g);
        this.f1172f = 2;
        return this.f1168b;
    }

    /* renamed from: a */
    public Map<String, FastJsonResponse.Field<?, ?>> mo9948a() {
        if (this.f1170d == null) {
            return null;
        }
        return this.f1170d.mo9974a(this.f1171e);
    }

    /* renamed from: a */
    public Object mo9947a(String str) {
        throw new UnsupportedOperationException("Converting to JSON does not require this method.");
    }

    /* renamed from: b */
    public boolean mo9951b(String str) {
        throw new UnsupportedOperationException("Converting to JSON does not require this method.");
    }

    public String toString() {
        C0926p.m1307a(this.f1170d, (Object) "Cannot convert to JSON on client side.");
        Parcel b = m1432b();
        b.setDataPosition(0);
        StringBuilder sb = new StringBuilder(100);
        m1431a(sb, this.f1170d.mo9974a(this.f1171e), b);
        return sb.toString();
    }

    /* renamed from: a */
    private final void m1431a(StringBuilder sb, Map<String, FastJsonResponse.Field<?, ?>> map, Parcel parcel) {
        SparseArray sparseArray = new SparseArray();
        for (Map.Entry next : map.entrySet()) {
            sparseArray.put(((FastJsonResponse.Field) next.getValue()).mo9953a(), next);
        }
        sb.append('{');
        int b = C0930a.m1336b(parcel);
        boolean z = false;
        while (parcel.dataPosition() < b) {
            int a = C0930a.m1331a(parcel);
            Map.Entry entry = (Map.Entry) sparseArray.get(C0930a.m1330a(a));
            if (entry != null) {
                if (z) {
                    sb.append(",");
                }
                FastJsonResponse.Field field = (FastJsonResponse.Field) entry.getValue();
                sb.append("\"");
                sb.append((String) entry.getKey());
                sb.append("\":");
                if (field.mo9956b()) {
                    switch (field.f1158c) {
                        case 0:
                            m1430a(sb, (FastJsonResponse.Field<?, ?>) field, m1411a(field, Integer.valueOf(C0930a.m1341d(parcel, a))));
                            break;
                        case 1:
                            m1430a(sb, (FastJsonResponse.Field<?, ?>) field, m1411a(field, C0930a.m1345h(parcel, a)));
                            break;
                        case 2:
                            m1430a(sb, (FastJsonResponse.Field<?, ?>) field, m1411a(field, Long.valueOf(C0930a.m1343f(parcel, a))));
                            break;
                        case 3:
                            m1430a(sb, (FastJsonResponse.Field<?, ?>) field, m1411a(field, Float.valueOf(C0930a.m1346i(parcel, a))));
                            break;
                        case 4:
                            m1430a(sb, (FastJsonResponse.Field<?, ?>) field, m1411a(field, Double.valueOf(C0930a.m1348k(parcel, a))));
                            break;
                        case 5:
                            m1430a(sb, (FastJsonResponse.Field<?, ?>) field, m1411a(field, C0930a.m1350m(parcel, a)));
                            break;
                        case 6:
                            m1430a(sb, (FastJsonResponse.Field<?, ?>) field, m1411a(field, Boolean.valueOf(C0930a.m1340c(parcel, a))));
                            break;
                        case 7:
                            m1430a(sb, (FastJsonResponse.Field<?, ?>) field, m1411a(field, C0930a.m1351n(parcel, a)));
                            break;
                        case 8:
                        case 9:
                            m1430a(sb, (FastJsonResponse.Field<?, ?>) field, m1411a(field, C0930a.m1354q(parcel, a)));
                            break;
                        case 10:
                            Bundle p = C0930a.m1353p(parcel, a);
                            HashMap hashMap = new HashMap();
                            for (String str : p.keySet()) {
                                hashMap.put(str, p.getString(str));
                            }
                            m1430a(sb, (FastJsonResponse.Field<?, ?>) field, m1411a(field, hashMap));
                            break;
                        case 11:
                            throw new IllegalArgumentException("Method does not accept concrete type.");
                        default:
                            int i = field.f1158c;
                            StringBuilder sb2 = new StringBuilder(36);
                            sb2.append("Unknown field out type = ");
                            sb2.append(i);
                            throw new IllegalArgumentException(sb2.toString());
                    }
                } else if (field.f1159d) {
                    sb.append("[");
                    switch (field.f1158c) {
                        case 0:
                            C0966b.m1455a(sb, C0930a.m1356s(parcel, a));
                            break;
                        case 1:
                            C0966b.m1457a(sb, (T[]) C0930a.m1358u(parcel, a));
                            break;
                        case 2:
                            C0966b.m1456a(sb, C0930a.m1357t(parcel, a));
                            break;
                        case 3:
                            C0966b.m1454a(sb, C0930a.m1359v(parcel, a));
                            break;
                        case 4:
                            C0966b.m1453a(sb, C0930a.m1360w(parcel, a));
                            break;
                        case 5:
                            C0966b.m1457a(sb, (T[]) C0930a.m1361x(parcel, a));
                            break;
                        case 6:
                            C0966b.m1459a(sb, C0930a.m1355r(parcel, a));
                            break;
                        case 7:
                            C0966b.m1458a(sb, C0930a.m1362y(parcel, a));
                            break;
                        case 8:
                        case 9:
                        case 10:
                            throw new UnsupportedOperationException("List of type BASE64, BASE64_URL_SAFE, or STRING_MAP is not supported");
                        case 11:
                            Parcel[] C = C0930a.m1328C(parcel, a);
                            int length = C.length;
                            for (int i2 = 0; i2 < length; i2++) {
                                if (i2 > 0) {
                                    sb.append(",");
                                }
                                C[i2].setDataPosition(0);
                                m1431a(sb, field.mo9957c(), C[i2]);
                            }
                            break;
                        default:
                            throw new IllegalStateException("Unknown field type out.");
                    }
                    sb.append("]");
                } else {
                    switch (field.f1158c) {
                        case 0:
                            sb.append(C0930a.m1341d(parcel, a));
                            break;
                        case 1:
                            sb.append(C0930a.m1345h(parcel, a));
                            break;
                        case 2:
                            sb.append(C0930a.m1343f(parcel, a));
                            break;
                        case 3:
                            sb.append(C0930a.m1346i(parcel, a));
                            break;
                        case 4:
                            sb.append(C0930a.m1348k(parcel, a));
                            break;
                        case 5:
                            sb.append(C0930a.m1350m(parcel, a));
                            break;
                        case 6:
                            sb.append(C0930a.m1340c(parcel, a));
                            break;
                        case 7:
                            String n = C0930a.m1351n(parcel, a);
                            sb.append("\"");
                            sb.append(C0976l.m1497a(n));
                            sb.append("\"");
                            break;
                        case 8:
                            byte[] q = C0930a.m1354q(parcel, a);
                            sb.append("\"");
                            sb.append(C0967c.m1462a(q));
                            sb.append("\"");
                            break;
                        case 9:
                            byte[] q2 = C0930a.m1354q(parcel, a);
                            sb.append("\"");
                            sb.append(C0967c.m1463b(q2));
                            sb.append("\"");
                            break;
                        case 10:
                            Bundle p2 = C0930a.m1353p(parcel, a);
                            Set<String> keySet = p2.keySet();
                            keySet.size();
                            sb.append("{");
                            boolean z2 = true;
                            for (String str2 : keySet) {
                                if (!z2) {
                                    sb.append(",");
                                }
                                sb.append("\"");
                                sb.append(str2);
                                sb.append("\"");
                                sb.append(":");
                                sb.append("\"");
                                sb.append(C0976l.m1497a(p2.getString(str2)));
                                sb.append("\"");
                                z2 = false;
                            }
                            sb.append("}");
                            break;
                        case 11:
                            Parcel B = C0930a.m1327B(parcel, a);
                            B.setDataPosition(0);
                            m1431a(sb, field.mo9957c(), B);
                            break;
                        default:
                            throw new IllegalStateException("Unknown field type out");
                    }
                }
                z = true;
            }
        }
        if (parcel.dataPosition() == b) {
            sb.append('}');
            return;
        }
        StringBuilder sb3 = new StringBuilder(37);
        sb3.append("Overread allowed size end=");
        sb3.append(b);
        throw new C0930a.C0931a(sb3.toString(), parcel);
    }

    /* renamed from: a */
    private final void m1430a(StringBuilder sb, FastJsonResponse.Field<?, ?> field, Object obj) {
        if (field.f1157b) {
            ArrayList arrayList = (ArrayList) obj;
            sb.append("[");
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (i != 0) {
                    sb.append(",");
                }
                m1429a(sb, field.f1156a, arrayList.get(i));
            }
            sb.append("]");
            return;
        }
        m1429a(sb, field.f1156a, obj);
    }

    /* renamed from: a */
    private static void m1429a(StringBuilder sb, int i, Object obj) {
        switch (i) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                sb.append(obj);
                return;
            case 7:
                sb.append("\"");
                sb.append(C0976l.m1497a(obj.toString()));
                sb.append("\"");
                return;
            case 8:
                sb.append("\"");
                sb.append(C0967c.m1462a((byte[]) obj));
                sb.append("\"");
                return;
            case 9:
                sb.append("\"");
                sb.append(C0967c.m1463b((byte[]) obj));
                sb.append("\"");
                return;
            case 10:
                C0977m.m1498a(sb, (HashMap) obj);
                return;
            case 11:
                throw new IllegalArgumentException("Method does not accept concrete type.");
            default:
                StringBuilder sb2 = new StringBuilder(26);
                sb2.append("Unknown type = ");
                sb2.append(i);
                throw new IllegalArgumentException(sb2.toString());
        }
    }
}
