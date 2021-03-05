package com.p051vm.p055c;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.net.ConnectivityManager;
import com.p051vm.shadowsocks.sockhome.C2545R;

/* renamed from: com.vm.c.a */
/* compiled from: NetworkUtil */
public class C2514a {
    /* renamed from: a */
    public static boolean m11822a(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (connectivityManager.getActiveNetworkInfo() != null) {
            return connectivityManager.getActiveNetworkInfo().isConnected();
        }
        return false;
    }

    /* renamed from: b */
    public static void m11823b(Context context) {
        if (!m11822a(context)) {
            new AlertDialog.Builder(context).setTitle(C2545R.string.network_tips_title).setMessage(C2545R.string.network_tips_desc).setPositiveButton(C2545R.string.network_tips_confirm, (DialogInterface.OnClickListener) null).show();
        }
    }
}
