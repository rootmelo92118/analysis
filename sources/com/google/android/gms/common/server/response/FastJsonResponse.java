package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C0924o;
import com.google.android.gms.common.internal.C0926p;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C0932b;
import com.google.android.gms.common.server.converter.zaa;
import com.google.android.gms.common.util.C0967c;
import com.google.android.gms.common.util.C0976l;
import com.google.android.gms.common.util.C0977m;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public abstract class FastJsonResponse {

    /* renamed from: com.google.android.gms.common.server.response.FastJsonResponse$a */
    public interface C0953a<I, O> {
        /* renamed from: a */
        I mo9936a(O o);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract Object mo9947a(String str);

    /* renamed from: a */
    public abstract Map<String, Field<?, ?>> mo9948a();

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract boolean mo9951b(String str);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo9949a(Field field) {
        if (field.f1158c != 11) {
            return mo9951b(field.f1160e);
        }
        if (field.f1159d) {
            String str = field.f1160e;
            throw new UnsupportedOperationException("Concrete type arrays not supported");
        }
        String str2 = field.f1160e;
        throw new UnsupportedOperationException("Concrete types not supported");
    }

    public static class Field<I, O> extends AbstractSafeParcelable {
        public static final C0954a CREATOR = new C0954a();

        /* renamed from: a */
        protected final int f1156a;

        /* renamed from: b */
        protected final boolean f1157b;

        /* renamed from: c */
        protected final int f1158c;

        /* renamed from: d */
        protected final boolean f1159d;

        /* renamed from: e */
        protected final String f1160e;

        /* renamed from: f */
        protected final int f1161f;

        /* renamed from: g */
        protected final Class<? extends FastJsonResponse> f1162g;

        /* renamed from: h */
        private final int f1163h;

        /* renamed from: i */
        private final String f1164i;

        /* renamed from: j */
        private zak f1165j;
        /* access modifiers changed from: private */

        /* renamed from: k */
        public C0953a<I, O> f1166k;

        Field(int i, int i2, boolean z, int i3, boolean z2, String str, int i4, String str2, zaa zaa) {
            this.f1163h = i;
            this.f1156a = i2;
            this.f1157b = z;
            this.f1158c = i3;
            this.f1159d = z2;
            this.f1160e = str;
            this.f1161f = i4;
            if (str2 == null) {
                this.f1162g = null;
                this.f1164i = null;
            } else {
                this.f1162g = SafeParcelResponse.class;
                this.f1164i = str2;
            }
            if (zaa == null) {
                this.f1166k = null;
            } else {
                this.f1166k = zaa.mo9945a();
            }
        }

        /* renamed from: a */
        public int mo9953a() {
            return this.f1161f;
        }

        /* renamed from: d */
        private final String m1419d() {
            if (this.f1164i == null) {
                return null;
            }
            return this.f1164i;
        }

        /* renamed from: b */
        public final boolean mo9956b() {
            return this.f1166k != null;
        }

        /* renamed from: a */
        public final void mo9955a(zak zak) {
            this.f1165j = zak;
        }

        /* renamed from: e */
        private final zaa m1420e() {
            if (this.f1166k == null) {
                return null;
            }
            return zaa.m1409a(this.f1166k);
        }

        /* renamed from: c */
        public final Map<String, Field<?, ?>> mo9957c() {
            C0926p.m1306a(this.f1164i);
            C0926p.m1306a(this.f1165j);
            return this.f1165j.mo9974a(this.f1164i);
        }

        /* renamed from: a */
        public final I mo9954a(O o) {
            return this.f1166k.mo9936a(o);
        }

        public void writeToParcel(Parcel parcel, int i) {
            int a = C0932b.m1364a(parcel);
            C0932b.m1367a(parcel, 1, this.f1163h);
            C0932b.m1367a(parcel, 2, this.f1156a);
            C0932b.m1379a(parcel, 3, this.f1157b);
            C0932b.m1367a(parcel, 4, this.f1158c);
            C0932b.m1379a(parcel, 5, this.f1159d);
            C0932b.m1377a(parcel, 6, this.f1160e, false);
            C0932b.m1367a(parcel, 7, mo9953a());
            C0932b.m1377a(parcel, 8, m1419d(), false);
            C0932b.m1372a(parcel, 9, (Parcelable) m1420e(), i, false);
            C0932b.m1365a(parcel, a);
        }

        public String toString() {
            C0924o.C0925a a = C0924o.m1302a((Object) this).mo9911a("versionCode", Integer.valueOf(this.f1163h)).mo9911a("typeIn", Integer.valueOf(this.f1156a)).mo9911a("typeInArray", Boolean.valueOf(this.f1157b)).mo9911a("typeOut", Integer.valueOf(this.f1158c)).mo9911a("typeOutArray", Boolean.valueOf(this.f1159d)).mo9911a("outputFieldName", this.f1160e).mo9911a("safeParcelFieldId", Integer.valueOf(this.f1161f)).mo9911a("concreteTypeName", m1419d());
            Class<? extends FastJsonResponse> cls = this.f1162g;
            if (cls != null) {
                a.mo9911a("concreteType.class", cls.getCanonicalName());
            }
            if (this.f1166k != null) {
                a.mo9911a("converterName", this.f1166k.getClass().getCanonicalName());
            }
            return a.toString();
        }
    }

    /* renamed from: a */
    protected static <O, I> I m1411a(Field<I, O> field, Object obj) {
        return field.f1166k != null ? field.mo9954a(obj) : obj;
    }

    public String toString() {
        Map<String, Field<?, ?>> a = mo9948a();
        StringBuilder sb = new StringBuilder(100);
        for (String next : a.keySet()) {
            Field field = a.get(next);
            if (mo9949a(field)) {
                Object a2 = m1411a(field, mo9950b(field));
                if (sb.length() == 0) {
                    sb.append("{");
                } else {
                    sb.append(",");
                }
                sb.append("\"");
                sb.append(next);
                sb.append("\":");
                if (a2 != null) {
                    switch (field.f1158c) {
                        case 8:
                            sb.append("\"");
                            sb.append(C0967c.m1462a((byte[]) a2));
                            sb.append("\"");
                            break;
                        case 9:
                            sb.append("\"");
                            sb.append(C0967c.m1463b((byte[]) a2));
                            sb.append("\"");
                            break;
                        case 10:
                            C0977m.m1498a(sb, (HashMap) a2);
                            break;
                        default:
                            if (!field.f1157b) {
                                m1412a(sb, field, a2);
                                break;
                            } else {
                                ArrayList arrayList = (ArrayList) a2;
                                sb.append("[");
                                int size = arrayList.size();
                                for (int i = 0; i < size; i++) {
                                    if (i > 0) {
                                        sb.append(",");
                                    }
                                    Object obj = arrayList.get(i);
                                    if (obj != null) {
                                        m1412a(sb, field, obj);
                                    }
                                }
                                sb.append("]");
                                break;
                            }
                    }
                } else {
                    sb.append("null");
                }
            }
        }
        if (sb.length() > 0) {
            sb.append("}");
        } else {
            sb.append("{}");
        }
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public Object mo9950b(Field field) {
        String str = field.f1160e;
        if (field.f1162g == null) {
            return mo9947a(field.f1160e);
        }
        C0926p.m1314a(mo9947a(field.f1160e) == null, "Concrete field shouldn't be value object: %s", field.f1160e);
        boolean z = field.f1159d;
        try {
            char upperCase = Character.toUpperCase(str.charAt(0));
            String substring = str.substring(1);
            StringBuilder sb = new StringBuilder(String.valueOf(substring).length() + 4);
            sb.append("get");
            sb.append(upperCase);
            sb.append(substring);
            return getClass().getMethod(sb.toString(), new Class[0]).invoke(this, new Object[0]);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: a */
    private static void m1412a(StringBuilder sb, Field field, Object obj) {
        if (field.f1156a == 11) {
            sb.append(((FastJsonResponse) field.f1162g.cast(obj)).toString());
        } else if (field.f1156a == 7) {
            sb.append("\"");
            sb.append(C0976l.m1497a((String) obj));
            sb.append("\"");
        } else {
            sb.append(obj);
        }
    }
}
