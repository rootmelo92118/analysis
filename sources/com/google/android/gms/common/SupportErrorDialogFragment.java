package com.google.android.gms.common;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.p034v4.app.DialogFragment;
import android.support.p034v4.app.FragmentManager;
import com.google.android.gms.common.internal.C0926p;

public class SupportErrorDialogFragment extends DialogFragment {

    /* renamed from: a */
    private Dialog f771a = null;

    /* renamed from: b */
    private DialogInterface.OnCancelListener f772b = null;

    public Dialog onCreateDialog(Bundle bundle) {
        if (this.f771a == null) {
            setShowsDialog(false);
        }
        return this.f771a;
    }

    public void onCancel(DialogInterface dialogInterface) {
        if (this.f772b != null) {
            this.f772b.onCancel(dialogInterface);
        }
    }

    /* renamed from: a */
    public static SupportErrorDialogFragment m892a(Dialog dialog, DialogInterface.OnCancelListener onCancelListener) {
        SupportErrorDialogFragment supportErrorDialogFragment = new SupportErrorDialogFragment();
        Dialog dialog2 = (Dialog) C0926p.m1307a(dialog, (Object) "Cannot display null dialog");
        dialog2.setOnCancelListener((DialogInterface.OnCancelListener) null);
        dialog2.setOnDismissListener((DialogInterface.OnDismissListener) null);
        supportErrorDialogFragment.f771a = dialog2;
        if (onCancelListener != null) {
            supportErrorDialogFragment.f772b = onCancelListener;
        }
        return supportErrorDialogFragment;
    }

    public void show(FragmentManager fragmentManager, String str) {
        super.show(fragmentManager, str);
    }
}
