package com.google.android.gms.common.internal;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.p034v4.app.Fragment;
import android.util.Log;
import com.google.android.gms.common.api.internal.C0821e;

/* renamed from: com.google.android.gms.common.internal.f */
public abstract class C0909f implements DialogInterface.OnClickListener {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo9895a();

    /* renamed from: a */
    public static C0909f m1272a(Activity activity, Intent intent, int i) {
        return new C0935v(intent, activity, i);
    }

    /* renamed from: a */
    public static C0909f m1273a(@NonNull Fragment fragment, Intent intent, int i) {
        return new C0936w(intent, fragment, i);
    }

    /* renamed from: a */
    public static C0909f m1274a(@NonNull C0821e eVar, Intent intent, int i) {
        return new C0937x(intent, eVar, i);
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        try {
            mo9895a();
        } catch (ActivityNotFoundException e) {
            Log.e("DialogRedirect", "Failed to start resolution intent", e);
        } finally {
            dialogInterface.dismiss();
        }
    }
}
