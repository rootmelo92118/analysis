package com.google.android.gms.internal.ads;

public abstract class avv {
    /* renamed from: a */
    public abstract void mo11314a(String str);

    /* renamed from: a */
    public static avv m4301a(Class cls) {
        if (System.getProperty("java.vm.name").equalsIgnoreCase("Dalvik")) {
            return new avq(cls.getSimpleName());
        }
        return new avs(cls.getSimpleName());
    }
}
