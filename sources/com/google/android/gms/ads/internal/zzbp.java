package com.google.android.gms.ads.internal;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import com.google.android.gms.common.internal.C0926p;
import com.google.android.gms.internal.ads.C1026aj;
import com.google.android.gms.internal.ads.C1526nw;
import com.google.android.gms.internal.ads.C1534od;
import com.google.android.gms.internal.ads.C1557p;
import com.google.android.gms.internal.ads.C1598qn;
import com.google.android.gms.internal.ads.C1695uc;
import com.google.android.gms.internal.ads.C1772wz;
import com.google.android.gms.internal.ads.C1780xg;
import com.google.android.gms.internal.ads.C1851zx;
import com.google.android.gms.internal.ads.awy;
import com.google.android.gms.internal.ads.awz;
import com.google.android.gms.internal.ads.bre;
import com.google.android.gms.internal.ads.brh;
import com.google.android.gms.internal.ads.brl;
import com.google.android.gms.internal.ads.brx;
import com.google.android.gms.internal.ads.bsb;
import com.google.android.gms.internal.ads.bse;
import com.google.android.gms.internal.ads.bsk;
import com.google.android.gms.internal.ads.btb;
import com.google.android.gms.internal.ads.zzbbi;
import com.google.android.gms.internal.ads.zzwb;
import com.google.android.gms.internal.ads.zzwf;
import com.google.android.gms.internal.ads.zzyv;
import com.google.android.gms.internal.ads.zzzw;
import com.google.android.gms.p039a.C0719a;
import com.google.android.gms.p039a.C0722b;
import java.util.Map;
import java.util.concurrent.Future;
import javax.annotation.ParametersAreNonnullByDefault;

@C1598qn
@ParametersAreNonnullByDefault
public final class zzbp extends brx {
    /* access modifiers changed from: private */
    public final Context mContext;
    /* access modifiers changed from: private */
    @Nullable
    public brl zzbnn;
    /* access modifiers changed from: private */
    public final zzbbi zzbob;
    private final zzwf zzbqu;
    /* access modifiers changed from: private */
    public final Future<awy> zzbqv = C1780xg.m8354a(new zzbs(this));
    private final zzbu zzbqw;
    /* access modifiers changed from: private */
    @Nullable
    public WebView zzbqx = new WebView(this.mContext);
    /* access modifiers changed from: private */
    @Nullable
    public awy zzbqy;
    private AsyncTask<Void, Void, String> zzbqz;

    public zzbp(Context context, zzwf zzwf, String str, zzbbi zzbbi) {
        this.mContext = context;
        this.zzbob = zzbbi;
        this.zzbqu = zzwf;
        this.zzbqw = new zzbu(str);
        zzbt(0);
        this.zzbqx.setVerticalScrollBarEnabled(false);
        this.zzbqx.getSettings().setJavaScriptEnabled(true);
        this.zzbqx.setWebViewClient(new zzbq(this));
        this.zzbqx.setOnTouchListener(new zzbr(this));
    }

    @Nullable
    public final String getMediationAdapterClassName() {
        return null;
    }

    @Nullable
    public final btb getVideoController() {
        return null;
    }

    public final boolean isLoading() {
        return false;
    }

    public final boolean isReady() {
        return false;
    }

    public final void setManualImpressionsEnabled(boolean z) {
    }

    public final void stopLoading() {
    }

    @Nullable
    public final String zzje() {
        return null;
    }

    public final C0719a zzie() {
        C0926p.m1315b("getAdFrame must be called on the main UI thread.");
        return C0722b.m769a(this.zzbqx);
    }

    public final void destroy() {
        C0926p.m1315b("destroy must be called on the main UI thread.");
        this.zzbqz.cancel(true);
        this.zzbqv.cancel(true);
        this.zzbqx.destroy();
        this.zzbqx = null;
    }

    public final boolean zzb(zzwb zzwb) {
        C0926p.m1307a(this.zzbqx, (Object) "This Search Ad has already been torn down");
        this.zzbqw.zza(zzwb, this.zzbob);
        this.zzbqz = new zzbt(this, (zzbq) null).execute(new Void[0]);
        return true;
    }

    public final void pause() {
        C0926p.m1315b("pause must be called on the main UI thread.");
    }

    public final void resume() {
        C0926p.m1315b("resume must be called on the main UI thread.");
    }

    public final void zza(brl brl) {
        this.zzbnn = brl;
    }

    public final void zza(bse bse) {
        throw new IllegalStateException("Unused method");
    }

    public final void zza(bsb bsb) {
        throw new IllegalStateException("Unused method");
    }

    public final Bundle getAdMetadata() {
        throw new IllegalStateException("Unused method");
    }

    public final void showInterstitial() {
        throw new IllegalStateException("Unused method");
    }

    public final void zzih() {
        throw new IllegalStateException("Unused method");
    }

    public final zzwf zzif() {
        return this.zzbqu;
    }

    public final void zza(zzwf zzwf) {
        throw new IllegalStateException("AdSize must be set before initialization");
    }

    public final void zza(C1526nw nwVar) {
        throw new IllegalStateException("Unused method");
    }

    public final void zza(C1534od odVar, String str) {
        throw new IllegalStateException("Unused method");
    }

    public final String getAdUnitId() {
        throw new IllegalStateException("getAdUnitId not implemented");
    }

    public final bse zzir() {
        throw new IllegalStateException("getIAppEventListener not implemented");
    }

    public final brl zzis() {
        throw new IllegalStateException("getIAdListener not implemented");
    }

    public final void zza(C1026aj ajVar) {
        throw new IllegalStateException("Unused method");
    }

    public final void zza(brh brh) {
        throw new IllegalStateException("Unused method");
    }

    public final void zza(bsk bsk) {
        throw new IllegalStateException("Unused method");
    }

    public final void zza(C1695uc ucVar) {
        throw new IllegalStateException("Unused method");
    }

    public final void setUserId(String str) {
        throw new IllegalStateException("Unused method");
    }

    public final void zzap(String str) {
        throw new IllegalStateException("Unused method");
    }

    public final void zza(zzzw zzzw) {
        throw new IllegalStateException("Unused method");
    }

    public final void zza(zzyv zzyv) {
        throw new IllegalStateException("Unused method");
    }

    public final void setImmersiveMode(boolean z) {
        throw new IllegalStateException("Unused method");
    }

    /* access modifiers changed from: package-private */
    public final int zzav(String str) {
        String queryParameter = Uri.parse(str).getQueryParameter("height");
        if (TextUtils.isEmpty(queryParameter)) {
            return 0;
        }
        try {
            bre.m6317a();
            return C1851zx.m8582a(this.mContext, Integer.parseInt(queryParameter));
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    /* access modifiers changed from: package-private */
    public final void zzbt(int i) {
        if (this.zzbqx != null) {
            this.zzbqx.setLayoutParams(new ViewGroup.LayoutParams(-1, i));
        }
    }

    /* access modifiers changed from: package-private */
    public final String zzkw() {
        Uri.Builder builder = new Uri.Builder();
        builder.scheme("https://").appendEncodedPath((String) bre.m6321e().mo12778a(C1557p.f5962bQ));
        builder.appendQueryParameter("query", this.zzbqw.getQuery());
        builder.appendQueryParameter("pubId", this.zzbqw.zzkz());
        Map<String, String> zzla = this.zzbqw.zzla();
        for (String next : zzla.keySet()) {
            builder.appendQueryParameter(next, zzla.get(next));
        }
        Uri build = builder.build();
        if (this.zzbqy != null) {
            try {
                build = this.zzbqy.mo11350a(build, this.mContext);
            } catch (awz e) {
                C1772wz.m1627c("Unable to process ad data", e);
            }
        }
        String zzkx = zzkx();
        String encodedQuery = build.getEncodedQuery();
        StringBuilder sb = new StringBuilder(String.valueOf(zzkx).length() + 1 + String.valueOf(encodedQuery).length());
        sb.append(zzkx);
        sb.append("#");
        sb.append(encodedQuery);
        return sb.toString();
    }

    /* access modifiers changed from: package-private */
    public final String zzkx() {
        String zzky = this.zzbqw.zzky();
        if (TextUtils.isEmpty(zzky)) {
            zzky = "www.google.com";
        }
        String str = (String) bre.m6321e().mo12778a(C1557p.f5962bQ);
        StringBuilder sb = new StringBuilder(String.valueOf(zzky).length() + 8 + String.valueOf(str).length());
        sb.append("https://");
        sb.append(zzky);
        sb.append(str);
        return sb.toString();
    }

    /* access modifiers changed from: private */
    public final String zzaw(String str) {
        if (this.zzbqy == null) {
            return str;
        }
        Uri parse = Uri.parse(str);
        try {
            parse = this.zzbqy.mo11351a(parse, this.mContext, (View) null, (Activity) null);
        } catch (awz e) {
            C1772wz.m1627c("Unable to process ad data", e);
        }
        return parse.toString();
    }

    /* access modifiers changed from: private */
    public final void zzax(String str) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(str));
        this.mContext.startActivity(intent);
    }
}
