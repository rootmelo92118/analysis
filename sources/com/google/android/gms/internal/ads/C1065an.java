package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.customtabs.CustomTabsCallback;
import android.support.customtabs.CustomTabsClient;
import android.support.customtabs.CustomTabsServiceConnection;
import android.support.customtabs.CustomTabsSession;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;

@C1598qn
@ParametersAreNonnullByDefault
/* renamed from: com.google.android.gms.internal.ads.an */
public final class C1065an implements avz {
    @Nullable

    /* renamed from: a */
    private CustomTabsSession f2063a;
    @Nullable

    /* renamed from: b */
    private CustomTabsClient f2064b;
    @Nullable

    /* renamed from: c */
    private CustomTabsServiceConnection f2065c;
    @Nullable

    /* renamed from: d */
    private C1066ao f2066d;

    /* renamed from: a */
    public static boolean m2853a(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (packageManager == null) {
            return false;
        }
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.example.com"));
        ResolveInfo resolveActivity = packageManager.resolveActivity(intent, 0);
        List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(intent, 65536);
        if (!(queryIntentActivities == null || resolveActivity == null)) {
            for (int i = 0; i < queryIntentActivities.size(); i++) {
                if (resolveActivity.activityInfo.name.equals(queryIntentActivities.get(i).activityInfo.name)) {
                    return resolveActivity.activityInfo.packageName.equals(avx.m4304a(context));
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    public final void mo10728a(Activity activity) {
        if (this.f2065c != null) {
            activity.unbindService(this.f2065c);
            this.f2064b = null;
            this.f2063a = null;
            this.f2065c = null;
        }
    }

    /* renamed from: a */
    public final void mo10730a(C1066ao aoVar) {
        this.f2066d = aoVar;
    }

    /* renamed from: b */
    public final void mo10732b(Activity activity) {
        String a;
        if (this.f2064b == null && (a = avx.m4304a(activity)) != null) {
            this.f2065c = new avy(this);
            CustomTabsClient.bindCustomTabsService(activity, a, this.f2065c);
        }
    }

    /* renamed from: a */
    public final boolean mo10731a(Uri uri, Bundle bundle, List<Bundle> list) {
        if (this.f2064b == null) {
            return false;
        }
        if (this.f2064b == null) {
            this.f2063a = null;
        } else if (this.f2063a == null) {
            this.f2063a = this.f2064b.newSession((CustomTabsCallback) null);
        }
        CustomTabsSession customTabsSession = this.f2063a;
        if (customTabsSession == null) {
            return false;
        }
        return customTabsSession.mayLaunchUrl(uri, (Bundle) null, (List<Bundle>) null);
    }

    /* renamed from: a */
    public final void mo10729a(CustomTabsClient customTabsClient) {
        this.f2064b = customTabsClient;
        this.f2064b.warmup(0);
        if (this.f2066d != null) {
            this.f2066d.mo10742a();
        }
    }

    /* renamed from: a */
    public final void mo10727a() {
        this.f2064b = null;
        this.f2063a = null;
        if (this.f2066d != null) {
            this.f2066d.mo10743b();
        }
    }
}
