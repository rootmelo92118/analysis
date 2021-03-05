package com.google.android.gms.common.internal;

import android.support.annotation.Nullable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.google.android.gms.common.internal.o */
public final class C0924o {
    /* renamed from: a */
    public static boolean m1303a(@Nullable Object obj, @Nullable Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    /* renamed from: a */
    public static int m1301a(Object... objArr) {
        return Arrays.hashCode(objArr);
    }

    /* renamed from: a */
    public static C0925a m1302a(Object obj) {
        return new C0925a(obj);
    }

    /* renamed from: com.google.android.gms.common.internal.o$a */
    public static final class C0925a {

        /* renamed from: a */
        private final List<String> f1113a;

        /* renamed from: b */
        private final Object f1114b;

        private C0925a(Object obj) {
            this.f1114b = C0926p.m1306a(obj);
            this.f1113a = new ArrayList();
        }

        /* renamed from: a */
        public final C0925a mo9911a(String str, @Nullable Object obj) {
            List<String> list = this.f1113a;
            String str2 = (String) C0926p.m1306a(str);
            String valueOf = String.valueOf(obj);
            StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 1 + String.valueOf(valueOf).length());
            sb.append(str2);
            sb.append("=");
            sb.append(valueOf);
            list.add(sb.toString());
            return this;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder(100);
            sb.append(this.f1114b.getClass().getSimpleName());
            sb.append('{');
            int size = this.f1113a.size();
            for (int i = 0; i < size; i++) {
                sb.append(this.f1113a.get(i));
                if (i < size - 1) {
                    sb.append(", ");
                }
            }
            sb.append('}');
            return sb.toString();
        }
    }
}
