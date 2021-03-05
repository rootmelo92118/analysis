package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.C2109hy;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.hz */
public final class C2110hz<M extends C2109hy<M>, T> {

    /* renamed from: a */
    protected final Class<T> f7940a;

    /* renamed from: b */
    public final int f7941b;

    /* renamed from: c */
    protected final boolean f7942c;

    /* renamed from: d */
    private final int f7943d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2110hz)) {
            return false;
        }
        C2110hz hzVar = (C2110hz) obj;
        return this.f7943d == hzVar.f7943d && this.f7940a == hzVar.f7940a && this.f7941b == hzVar.f7941b && this.f7942c == hzVar.f7942c;
    }

    public final int hashCode() {
        return ((((((this.f7943d + 1147) * 31) + this.f7940a.hashCode()) * 31) + this.f7941b) * 31) + (this.f7942c ? 1 : 0);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final T mo14086a(List<C2118ig> list) {
        if (list == null) {
            return null;
        }
        if (this.f7942c) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < list.size(); i++) {
                C2118ig igVar = list.get(i);
                if (igVar.f7957b.length != 0) {
                    arrayList.add(m10249a(C2106hv.m10190a(igVar.f7957b)));
                }
            }
            int size = arrayList.size();
            if (size == 0) {
                return null;
            }
            T cast = this.f7940a.cast(Array.newInstance(this.f7940a.getComponentType(), size));
            for (int i2 = 0; i2 < size; i2++) {
                Array.set(cast, i2, arrayList.get(i2));
            }
            return cast;
        } else if (list.isEmpty()) {
            return null;
        } else {
            return this.f7940a.cast(m10249a(C2106hv.m10190a(list.get(list.size() - 1).f7957b)));
        }
    }

    /* renamed from: a */
    private final Object m10249a(C2106hv hvVar) {
        Class componentType = this.f7942c ? this.f7940a.getComponentType() : this.f7940a;
        try {
            switch (this.f7943d) {
                case 10:
                    C2116ie ieVar = (C2116ie) componentType.newInstance();
                    hvVar.mo14053a(ieVar, this.f7941b >>> 3);
                    return ieVar;
                case 11:
                    C2116ie ieVar2 = (C2116ie) componentType.newInstance();
                    hvVar.mo14052a(ieVar2);
                    return ieVar2;
                default:
                    int i = this.f7943d;
                    StringBuilder sb = new StringBuilder(24);
                    sb.append("Unknown type ");
                    sb.append(i);
                    throw new IllegalArgumentException(sb.toString());
            }
        } catch (InstantiationException e) {
            String valueOf = String.valueOf(componentType);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 33);
            sb2.append("Error creating instance of class ");
            sb2.append(valueOf);
            throw new IllegalArgumentException(sb2.toString(), e);
        } catch (IllegalAccessException e2) {
            String valueOf2 = String.valueOf(componentType);
            StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf2).length() + 33);
            sb3.append("Error creating instance of class ");
            sb3.append(valueOf2);
            throw new IllegalArgumentException(sb3.toString(), e2);
        } catch (IOException e3) {
            throw new IllegalArgumentException("Error reading extension field", e3);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo14087a(Object obj, C2107hw hwVar) {
        try {
            hwVar.mo14080c(this.f7941b);
            switch (this.f7943d) {
                case 10:
                    ((C2116ie) obj).mo13499a(hwVar);
                    hwVar.mo14081c(this.f7941b >>> 3, 4);
                    return;
                case 11:
                    hwVar.mo14077a((C2116ie) obj);
                    return;
                default:
                    int i = this.f7943d;
                    StringBuilder sb = new StringBuilder(24);
                    sb.append("Unknown type ");
                    sb.append(i);
                    throw new IllegalArgumentException(sb.toString());
            }
        } catch (IOException e) {
            throw new IllegalStateException(e);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo14085a(Object obj) {
        int i = this.f7941b >>> 3;
        switch (this.f7943d) {
            case 10:
                return (C2107hw.m10222b(i) << 1) + ((C2116ie) obj).mo14106e();
            case 11:
                return C2107hw.m10224b(i, (C2116ie) obj);
            default:
                int i2 = this.f7943d;
                StringBuilder sb = new StringBuilder(24);
                sb.append("Unknown type ");
                sb.append(i2);
                throw new IllegalArgumentException(sb.toString());
        }
    }
}
