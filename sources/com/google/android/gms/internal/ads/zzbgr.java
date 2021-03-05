package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.support.annotation.Nullable;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.gms.ads.impl.C0726R;
import com.google.android.gms.ads.internal.gmsg.zzu;
import com.google.android.gms.ads.internal.overlay.zzc;
import com.google.android.gms.ads.internal.overlay.zzd;
import com.google.android.gms.ads.internal.zzbv;
import com.google.android.gms.ads.internal.zzv;
import com.google.android.gms.common.util.C0980p;
import com.google.android.gms.p039a.C0719a;
import java.util.Map;
import org.json.JSONObject;

@C1598qn
public final class zzbgr extends FrameLayout implements afl {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final afl f7193a;

    /* renamed from: b */
    private final act f7194b;

    public zzbgr(afl afl) {
        super(afl.getContext());
        this.f7193a = afl;
        this.f7194b = new act(afl.mo10377p(), this, this);
        addView(this.f7193a.getView());
    }

    public final View getView() {
        return this;
    }

    /* renamed from: a */
    public final act mo10166a() {
        return this.f7194b;
    }

    public final void onPause() {
        this.f7194b.mo10136b();
        this.f7193a.onPause();
    }

    /* renamed from: B */
    public final void mo10332B() {
        this.f7194b.mo10137c();
        this.f7193a.mo10332B();
    }

    /* renamed from: I */
    public final void mo10339I() {
        setBackgroundColor(0);
        this.f7193a.setBackgroundColor(0);
    }

    /* renamed from: j */
    public final int mo10181j() {
        return getMeasuredHeight();
    }

    /* renamed from: k */
    public final int mo10182k() {
        return getMeasuredWidth();
    }

    /* renamed from: l */
    public final void mo10183l() {
        this.f7193a.mo10183l();
    }

    public final WebView getWebView() {
        return this.f7193a.getWebView();
    }

    /* renamed from: a */
    public final void mo10443a(String str, Map<String, ?> map) {
        this.f7193a.mo10443a(str, map);
    }

    /* renamed from: a */
    public final void mo10444a(String str, JSONObject jSONObject) {
        this.f7193a.mo10444a(str, jSONObject);
    }

    /* renamed from: a */
    public final void mo10347a(String str, zzu<? super afl> zzu) {
        this.f7193a.mo10347a(str, zzu);
    }

    /* renamed from: b */
    public final void mo10352b(String str, zzu<? super afl> zzu) {
        this.f7193a.mo10352b(str, zzu);
    }

    /* renamed from: a */
    public final void mo10348a(String str, C0980p<zzu<? super afl>> pVar) {
        this.f7193a.mo10348a(str, pVar);
    }

    /* renamed from: m */
    public final void mo10371m() {
        this.f7193a.mo10371m();
    }

    /* renamed from: a */
    public final void mo10341a(int i) {
        this.f7193a.mo10341a(i);
    }

    /* renamed from: n */
    public final void mo10373n() {
        this.f7193a.mo10373n();
    }

    /* renamed from: o */
    public final void mo10374o() {
        this.f7193a.mo10374o();
    }

    /* renamed from: a */
    public final void mo10171a(boolean z, long j) {
        this.f7193a.mo10171a(z, j);
    }

    /* renamed from: d */
    public final void mo10449d(String str) {
        this.f7193a.mo10449d(str);
    }

    /* renamed from: b */
    public final void mo10448b(String str, JSONObject jSONObject) {
        this.f7193a.mo10448b(str, jSONObject);
    }

    /* renamed from: d */
    public final Activity mo10174d() {
        return this.f7193a.mo10174d();
    }

    /* renamed from: p */
    public final Context mo10377p() {
        return this.f7193a.mo10377p();
    }

    /* renamed from: e */
    public final zzv mo10175e() {
        return this.f7193a.mo10175e();
    }

    /* renamed from: q */
    public final zzd mo10378q() {
        return this.f7193a.mo10378q();
    }

    /* renamed from: y */
    public final C0719a mo10392y() {
        return this.f7193a.mo10392y();
    }

    /* renamed from: r */
    public final zzd mo10379r() {
        return this.f7193a.mo10379r();
    }

    /* renamed from: s */
    public final agy mo10380s() {
        return this.f7193a.mo10380s();
    }

    /* renamed from: t */
    public final String mo10387t() {
        return this.f7193a.mo10387t();
    }

    /* renamed from: u */
    public final ags mo10388u() {
        return this.f7193a.mo10388u();
    }

    /* renamed from: v */
    public final WebViewClient mo10389v() {
        return this.f7193a.mo10389v();
    }

    /* renamed from: w */
    public final boolean mo10390w() {
        return this.f7193a.mo10390w();
    }

    /* renamed from: x */
    public final awy mo10391x() {
        return this.f7193a.mo10391x();
    }

    /* renamed from: i */
    public final zzbbi mo10180i() {
        return this.f7193a.mo10180i();
    }

    /* renamed from: z */
    public final boolean mo10393z() {
        return this.f7193a.mo10393z();
    }

    public final int getRequestedOrientation() {
        return this.f7193a.getRequestedOrientation();
    }

    /* renamed from: A */
    public final boolean mo10331A() {
        return this.f7193a.mo10331A();
    }

    /* renamed from: C */
    public final boolean mo10333C() {
        return this.f7193a.mo10333C();
    }

    /* renamed from: D */
    public final boolean mo10334D() {
        return this.f7193a.mo10334D();
    }

    public final void zzjg() {
        this.f7193a.zzjg();
    }

    public final void zzjf() {
        this.f7193a.zzjf();
    }

    /* renamed from: g */
    public final String mo10177g() {
        return this.f7193a.mo10177g();
    }

    /* renamed from: c */
    public final C1016aa mo10173c() {
        return this.f7193a.mo10173c();
    }

    /* renamed from: h */
    public final C1017ab mo10179h() {
        return this.f7193a.mo10179h();
    }

    /* renamed from: b */
    public final aga mo10172b() {
        return this.f7193a.mo10172b();
    }

    /* renamed from: a */
    public final void mo10344a(zzd zzd) {
        this.f7193a.mo10344a(zzd);
    }

    /* renamed from: a */
    public final void mo10343a(C0719a aVar) {
        this.f7193a.mo10343a(aVar);
    }

    /* renamed from: a */
    public final void mo10345a(agy agy) {
        this.f7193a.mo10345a(agy);
    }

    /* renamed from: b */
    public final void mo10353b(boolean z) {
        this.f7193a.mo10353b(z);
    }

    /* renamed from: F */
    public final void mo10336F() {
        this.f7193a.mo10336F();
    }

    /* renamed from: a */
    public final void mo10342a(Context context) {
        this.f7193a.mo10342a(context);
    }

    /* renamed from: c */
    public final void mo10354c(boolean z) {
        this.f7193a.mo10354c(z);
    }

    public final void setRequestedOrientation(int i) {
        this.f7193a.setRequestedOrientation(i);
    }

    /* renamed from: b */
    public final void mo10350b(zzd zzd) {
        this.f7193a.mo10350b(zzd);
    }

    /* renamed from: d */
    public final void mo10355d(boolean z) {
        this.f7193a.mo10355d(z);
    }

    /* renamed from: b */
    public final void mo10351b(String str) {
        this.f7193a.mo10351b(str);
    }

    /* renamed from: a */
    public final void mo10169a(String str, aeo aeo) {
        this.f7193a.mo10169a(str, aeo);
    }

    /* renamed from: a */
    public final aeo mo10167a(String str) {
        return this.f7193a.mo10167a(str);
    }

    /* renamed from: G */
    public final void mo10337G() {
        this.f7193a.mo10337G();
    }

    public final void destroy() {
        C0719a y = mo10392y();
        if (y != null) {
            zzbv.zzlw().mo12838b(y);
            C1782xi.f6838a.postDelayed(new afw(this), (long) ((Integer) bre.m6321e().mo12778a(C1557p.f6002cD)).intValue());
            return;
        }
        this.f7193a.destroy();
    }

    public final void loadData(String str, String str2, String str3) {
        this.f7193a.loadData(str, str2, str3);
    }

    public final void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        this.f7193a.loadDataWithBaseURL(str, str2, str3, str4, str5);
    }

    public final void loadUrl(String str) {
        this.f7193a.loadUrl(str);
    }

    /* renamed from: a */
    public final void mo10349a(String str, String str2, @Nullable String str3) {
        this.f7193a.mo10349a(str, str2, str3);
    }

    public final void setOnClickListener(View.OnClickListener onClickListener) {
        this.f7193a.setOnClickListener(onClickListener);
    }

    public final void setOnTouchListener(View.OnTouchListener onTouchListener) {
        this.f7193a.setOnTouchListener(onTouchListener);
    }

    public final void setWebChromeClient(WebChromeClient webChromeClient) {
        this.f7193a.setWebChromeClient(webChromeClient);
    }

    public final void setWebViewClient(WebViewClient webViewClient) {
        this.f7193a.setWebViewClient(webViewClient);
    }

    public final void stopLoading() {
        this.f7193a.stopLoading();
    }

    public final void onResume() {
        this.f7193a.onResume();
    }

    /* renamed from: J */
    public final void mo10340J() {
        TextView textView = new TextView(getContext());
        Resources g = zzbv.zzlj().mo13127g();
        textView.setText(g != null ? g.getString(C0726R.string.f664s7) : "Test Ad");
        textView.setTextSize(15.0f);
        textView.setTextColor(-1);
        textView.setPadding(5, 0, 5, 0);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(-12303292);
        gradientDrawable.setCornerRadius(8.0f);
        if (Build.VERSION.SDK_INT >= 16) {
            textView.setBackground(gradientDrawable);
        } else {
            textView.setBackgroundDrawable(gradientDrawable);
        }
        addView(textView, new FrameLayout.LayoutParams(-2, -2, 49));
        bringChildToFront(textView);
    }

    /* renamed from: f */
    public final void mo10358f(boolean z) {
        this.f7193a.mo10358f(z);
    }

    /* renamed from: a */
    public final void mo10442a(bmq bmq) {
        this.f7193a.mo10442a(bmq);
    }

    public final View.OnClickListener getOnClickListener() {
        return this.f7193a.getOnClickListener();
    }

    /* renamed from: a */
    public final void mo10346a(@Nullable C1130be beVar) {
        this.f7193a.mo10346a(beVar);
    }

    @Nullable
    /* renamed from: H */
    public final C1130be mo10338H() {
        return this.f7193a.mo10338H();
    }

    /* renamed from: a */
    public final void mo10168a(aga aga) {
        this.f7193a.mo10168a(aga);
    }

    /* renamed from: E */
    public final boolean mo10335E() {
        return this.f7193a.mo10335E();
    }

    /* renamed from: e */
    public final void mo10357e(boolean z) {
        this.f7193a.mo10357e(z);
    }

    /* renamed from: a */
    public final void mo10170a(boolean z) {
        this.f7193a.mo10170a(z);
    }

    /* renamed from: f */
    public final void mo10176f() {
        this.f7193a.mo10176f();
    }

    /* renamed from: a */
    public final void mo10441a(zzc zzc) {
        this.f7193a.mo10441a(zzc);
    }

    /* renamed from: a */
    public final void mo10445a(boolean z, int i) {
        this.f7193a.mo10445a(z, i);
    }

    /* renamed from: a */
    public final void mo10446a(boolean z, int i, String str) {
        this.f7193a.mo10446a(z, i, str);
    }

    /* renamed from: a */
    public final void mo10447a(boolean z, int i, String str, String str2) {
        this.f7193a.mo10447a(z, i, str, str2);
    }
}
