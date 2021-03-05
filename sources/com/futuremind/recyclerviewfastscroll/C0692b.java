package com.futuremind.recyclerviewfastscroll;

import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;

/* renamed from: com.futuremind.recyclerviewfastscroll.b */
/* compiled from: Utils */
public class C0692b {
    /* renamed from: a */
    public static float m756a(View view) {
        int[] iArr = {0, (int) view.getY()};
        ((View) view.getParent()).getLocationInWindow(iArr);
        return (float) iArr[1];
    }

    /* renamed from: b */
    public static float m758b(View view) {
        int[] iArr = {(int) view.getX(), 0};
        ((View) view.getParent()).getLocationInWindow(iArr);
        return (float) iArr[0];
    }

    /* renamed from: a */
    public static float m755a(float f, float f2, float f3) {
        return Math.min(Math.max(f, f3), f2);
    }

    /* renamed from: a */
    public static void m757a(View view, Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 16) {
            view.setBackground(drawable);
        } else {
            view.setBackgroundDrawable(drawable);
        }
    }
}
