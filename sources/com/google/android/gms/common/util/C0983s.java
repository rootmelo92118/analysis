package com.google.android.gms.common.util;

import android.support.annotation.Nullable;
import java.util.regex.Pattern;

/* renamed from: com.google.android.gms.common.util.s */
public class C0983s {

    /* renamed from: a */
    private static final Pattern f1229a = Pattern.compile("\\$\\{(.*?)\\}");

    /* renamed from: a */
    public static boolean m1516a(@Nullable String str) {
        return str == null || str.trim().isEmpty();
    }
}
