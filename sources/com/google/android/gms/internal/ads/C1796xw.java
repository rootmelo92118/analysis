package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import android.text.TextUtils;
import android.webkit.WebSettings;
import com.google.android.gms.common.C0858g;
import com.google.android.gms.common.util.C0968d;
import com.google.android.gms.common.util.C0982r;

@TargetApi(17)
/* renamed from: com.google.android.gms.internal.ads.xw */
public class C1796xw extends C1798xy {
    /* renamed from: a */
    public final boolean mo13232a(Context context, WebSettings webSettings) {
        super.mo13232a(context, webSettings);
        webSettings.setMediaPlaybackRequiresUserGesture(false);
        return true;
    }

    /* renamed from: a */
    public final String mo13226a(Context context) {
        String str;
        C1844zq a = C1844zq.m8566a();
        if (TextUtils.isEmpty(a.f6942a)) {
            if (C0968d.m1465a()) {
                str = (String) C1842zo.m8563a(context, new C1845zr(a, context));
            } else {
                str = (String) C1842zo.m8563a(context, new C1846zs(a, C0858g.getRemoteContext(context), context));
            }
            a.f6942a = str;
        }
        return a.f6942a;
    }

    /* renamed from: b */
    public final void mo13236b(Context context) {
        C1844zq a = C1844zq.m8566a();
        C1772wz.m8287a("Updating user agent.");
        String defaultUserAgent = WebSettings.getDefaultUserAgent(context);
        if (!defaultUserAgent.equals(a.f6942a)) {
            Context remoteContext = C0858g.getRemoteContext(context);
            if (C0968d.m1465a() || remoteContext == null) {
                SharedPreferences.Editor putString = context.getSharedPreferences("admob_user_agent", 0).edit().putString("user_agent", WebSettings.getDefaultUserAgent(context));
                if (remoteContext == null) {
                    putString.apply();
                } else {
                    C0982r.m1515a(context, putString, "admob_user_agent");
                }
            }
            a.f6942a = defaultUserAgent;
        }
        C1772wz.m8287a("User agent is updated.");
    }

    /* renamed from: a */
    public final Drawable mo13223a(Context context, Bitmap bitmap, boolean z, float f) {
        if (!z || f <= 0.0f || f > 25.0f) {
            return new BitmapDrawable(context.getResources(), bitmap);
        }
        try {
            Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, bitmap.getWidth(), bitmap.getHeight(), false);
            Bitmap createBitmap = Bitmap.createBitmap(createScaledBitmap);
            RenderScript create = RenderScript.create(context);
            ScriptIntrinsicBlur create2 = ScriptIntrinsicBlur.create(create, Element.U8_4(create));
            Allocation createFromBitmap = Allocation.createFromBitmap(create, createScaledBitmap);
            Allocation createFromBitmap2 = Allocation.createFromBitmap(create, createBitmap);
            create2.setRadius(f);
            create2.setInput(createFromBitmap);
            create2.forEach(createFromBitmap2);
            createFromBitmap2.copyTo(createBitmap);
            return new BitmapDrawable(context.getResources(), createBitmap);
        } catch (RuntimeException unused) {
            return new BitmapDrawable(context.getResources(), bitmap);
        }
    }
}
