package com.google.android.gms.common;

import android.app.Dialog;
import android.app.DialogFragment;
import android.app.FragmentManager;
import android.content.DialogInterface;
import android.os.Bundle;
import com.google.android.gms.common.internal.C0926p;

/* renamed from: com.google.android.gms.common.b */
public class C0848b extends DialogFragment {

    /* renamed from: a */
    private Dialog f939a = null;

    /* renamed from: b */
    private DialogInterface.OnCancelListener f940b = null;

    public Dialog onCreateDialog(Bundle bundle) {
        if (this.f939a == null) {
            setShowsDialog(false);
        }
        return this.f939a;
    }

    public void onCancel(DialogInterface dialogInterface) {
        if (this.f940b != null) {
            this.f940b.onCancel(dialogInterface);
        }
    }

    /* renamed from: a */
    public static C0848b m1105a(Dialog dialog, DialogInterface.OnCancelListener onCancelListener) {
        C0848b bVar = new C0848b();
        Dialog dialog2 = (Dialog) C0926p.m1307a(dialog, (Object) "Cannot display null dialog");
        dialog2.setOnCancelListener((DialogInterface.OnCancelListener) null);
        dialog2.setOnDismissListener((DialogInterface.OnDismissListener) null);
        bVar.f939a = dialog2;
        if (onCancelListener != null) {
            bVar.f940b = onCancelListener;
        }
        return bVar;
    }

    public void show(FragmentManager fragmentManager, String str) {
        super.show(fragmentManager, str);
    }
}
