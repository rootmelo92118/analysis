package com.p051vm.p053b.p054a;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: com.vm.b.a.a */
/* compiled from: DBGetSet */
public class C2513a {

    /* renamed from: a */
    private static C2513a f8971a;

    /* renamed from: b */
    private static SharedPreferences f8972b;

    private C2513a() {
    }

    /* renamed from: a */
    public static C2513a m11818a(Context context) {
        if (f8971a == null) {
            f8971a = new C2513a();
            f8972b = context.getSharedPreferences("data", 4);
        }
        return f8971a;
    }

    /* renamed from: a */
    public String mo15481a(String str) {
        return f8972b.getString(str, (String) null);
    }

    /* renamed from: a */
    public String mo15482a(String str, String str2) {
        String string = f8972b.getString(str, (String) null);
        return string == null ? "" : string;
    }

    /* renamed from: b */
    public void mo15483b(String str, String str2) {
        SharedPreferences.Editor edit = f8972b.edit();
        edit.putString(str, str2);
        edit.commit();
    }
}
