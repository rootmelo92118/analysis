package com.google.android.gms.common.util;

import java.util.HashMap;

/* renamed from: com.google.android.gms.common.util.m */
public class C0977m {
    /* renamed from: a */
    public static void m1498a(StringBuilder sb, HashMap<String, String> hashMap) {
        sb.append("{");
        boolean z = true;
        for (String next : hashMap.keySet()) {
            if (!z) {
                sb.append(",");
            } else {
                z = false;
            }
            String str = hashMap.get(next);
            sb.append("\"");
            sb.append(next);
            sb.append("\":");
            if (str == null) {
                sb.append("null");
            } else {
                sb.append("\"");
                sb.append(str);
                sb.append("\"");
            }
        }
        sb.append("}");
    }
}
