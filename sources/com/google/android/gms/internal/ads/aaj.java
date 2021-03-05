package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;

@C1598qn
public final class aaj {
    /* renamed from: a */
    public static <T> T m1633a(Context context, String str, aak<IBinder, T> aak) {
        try {
            return aak.mo10035a(m1634b(context).mo10004a(str));
        } catch (Exception e) {
            throw new aal(e);
        }
    }

    /* renamed from: a */
    public static Context m1632a(Context context) {
        return m1634b(context).mo10003a();
    }

    /* renamed from: b */
    private static DynamiteModule m1634b(Context context) {
        try {
            return DynamiteModule.m1533a(context, DynamiteModule.f1239a, ModuleDescriptor.MODULE_ID);
        } catch (Exception e) {
            throw new aal(e);
        }
    }
}
