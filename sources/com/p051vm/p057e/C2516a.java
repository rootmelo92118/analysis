package com.p051vm.p057e;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p051vm.p052a.C2505a;
import com.p051vm.p052a.C2510e;
import com.p051vm.shadowsocks.sockhome.C2545R;

/* renamed from: com.vm.e.a */
/* compiled from: RateStarUtil */
public class C2516a {
    /* renamed from: a */
    public static boolean m11828a(Context context) {
        return !C2510e.m11806a(context).mo15473d() && C2510e.m11806a(context).mo15471b() >= C2505a.m11786a(context).mo15457c() && C2510e.m11806a(context).mo15475f() < 2;
    }

    /* renamed from: b */
    public static void m11829b(final Context context) {
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        View inflate = LayoutInflater.from(context).inflate(C2545R.layout.dialog_pop_rate_star, (ViewGroup) null);
        builder.setView(inflate);
        final AlertDialog show = builder.show();
        ((TextView) inflate.findViewById(C2545R.C2547id.cancel)).setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                C2510e.m11806a(context).mo15474e();
                show.dismiss();
            }
        });
        ((TextView) inflate.findViewById(C2545R.C2547id.confirm)).setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                C2510e.m11806a(context).mo15472c();
                C2516a.m11830c(context);
                show.dismiss();
            }
        });
    }

    /* renamed from: a */
    public static void m11827a(final Activity activity) {
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        View inflate = LayoutInflater.from(activity).inflate(C2545R.layout.dialog_force_update, (ViewGroup) null);
        builder.setView(inflate);
        final AlertDialog show = builder.show();
        ((TextView) inflate.findViewById(C2545R.C2547id.update_cancel)).setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                activity.finish();
                show.dismiss();
            }
        });
        ((TextView) inflate.findViewById(C2545R.C2547id.update_confirm)).setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                C2510e.m11806a(activity).mo15472c();
                C2516a.m11830c(activity);
                show.dismiss();
            }
        });
    }

    /* renamed from: c */
    public static void m11830c(Context context) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=com.vm.shadowsocks.sockhome"));
            intent.setPackage("com.android.vending");
            intent.addFlags(268435456);
            context.startActivity(intent);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
