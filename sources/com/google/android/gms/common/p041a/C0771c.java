package com.google.android.gms.common.p041a;

import android.content.Context;

/* renamed from: com.google.android.gms.common.a.c */
public class C0771c {

    /* renamed from: b */
    private static C0771c f778b = new C0771c();

    /* renamed from: a */
    private C0770b f779a = null;

    /* renamed from: b */
    private final synchronized C0770b m905b(Context context) {
        if (this.f779a == null) {
            if (context.getApplicationContext() != null) {
                context = context.getApplicationContext();
            }
            this.f779a = new C0770b(context);
        }
        return this.f779a;
    }

    /* renamed from: a */
    public static C0770b m904a(Context context) {
        return f778b.m905b(context);
    }
}
