package com.google.ads.mediation;

import com.google.android.gms.internal.ads.aai;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

@Deprecated
/* renamed from: com.google.ads.mediation.e */
public class C0713e {

    /* renamed from: com.google.ads.mediation.e$a */
    public static final class C0714a extends Exception {
        public C0714a(String str) {
            super(str);
        }
    }

    @Target({ElementType.FIELD})
    @Retention(RetentionPolicy.RUNTIME)
    /* renamed from: com.google.ads.mediation.e$b */
    public @interface C0715b {
        /* renamed from: a */
        String mo8395a();

        /* renamed from: b */
        boolean mo8396b() default true;
    }

    /* renamed from: a */
    public void mo8394a(Map<String, String> map) {
        HashMap hashMap = new HashMap();
        for (Field field : getClass().getFields()) {
            C0715b bVar = (C0715b) field.getAnnotation(C0715b.class);
            if (bVar != null) {
                hashMap.put(bVar.mo8395a(), field);
            }
        }
        if (hashMap.isEmpty()) {
            aai.m1630e("No server options fields detected. To suppress this message either add a field with the @Parameter annotation, or override the load() method.");
        }
        for (Map.Entry next : map.entrySet()) {
            Field field2 = (Field) hashMap.remove(next.getKey());
            if (field2 != null) {
                try {
                    field2.set(this, next.getValue());
                } catch (IllegalAccessException unused) {
                    String str = (String) next.getKey();
                    StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 49);
                    sb.append("Server option \"");
                    sb.append(str);
                    sb.append("\" could not be set: Illegal Access");
                    aai.m1630e(sb.toString());
                } catch (IllegalArgumentException unused2) {
                    String str2 = (String) next.getKey();
                    StringBuilder sb2 = new StringBuilder(String.valueOf(str2).length() + 43);
                    sb2.append("Server option \"");
                    sb2.append(str2);
                    sb2.append("\" could not be set: Bad Type");
                    aai.m1630e(sb2.toString());
                }
            } else {
                String str3 = (String) next.getKey();
                String str4 = (String) next.getValue();
                StringBuilder sb3 = new StringBuilder(String.valueOf(str3).length() + 31 + String.valueOf(str4).length());
                sb3.append("Unexpected server option: ");
                sb3.append(str3);
                sb3.append(" = \"");
                sb3.append(str4);
                sb3.append("\"");
                aai.m1624b(sb3.toString());
            }
        }
        StringBuilder sb4 = new StringBuilder();
        for (Field field3 : hashMap.values()) {
            if (((C0715b) field3.getAnnotation(C0715b.class)).mo8396b()) {
                String valueOf = String.valueOf(((C0715b) field3.getAnnotation(C0715b.class)).mo8395a());
                aai.m1630e(valueOf.length() != 0 ? "Required server option missing: ".concat(valueOf) : new String("Required server option missing: "));
                if (sb4.length() > 0) {
                    sb4.append(", ");
                }
                sb4.append(((C0715b) field3.getAnnotation(C0715b.class)).mo8395a());
            }
        }
        if (sb4.length() > 0) {
            String valueOf2 = String.valueOf(sb4.toString());
            throw new C0714a(valueOf2.length() != 0 ? "Required server option(s) missing: ".concat(valueOf2) : new String("Required server option(s) missing: "));
        }
    }
}
