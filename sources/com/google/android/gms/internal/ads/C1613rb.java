package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;

@C1598qn
/* renamed from: com.google.android.gms.internal.ads.rb */
public final class C1613rb {
    /* access modifiers changed from: private */
    /* renamed from: b */
    public static boolean m7822b(Context context, boolean z) {
        if (!z) {
            return true;
        }
        int b = DynamiteModule.m1537b(context, ModuleDescriptor.MODULE_ID);
        return b != 0 && b <= DynamiteModule.m1530a(context, ModuleDescriptor.MODULE_ID);
    }
}
