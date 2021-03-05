package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.Nullable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.ads.internal.gmsg.zzu;
import com.google.android.gms.ads.internal.overlay.zzd;
import com.google.android.gms.ads.internal.zzbo;
import com.google.android.gms.ads.internal.zzv;
import com.google.android.gms.common.util.C0980p;
import com.google.android.gms.p039a.C0719a;
import javax.annotation.ParametersAreNonnullByDefault;

@C1598qn
@ParametersAreNonnullByDefault
public interface afl extends zzbo, adc, agh, agi, agm, agp, agq, agr, bmr, C1339gy, C1365hx {
    /* renamed from: A */
    boolean mo10331A();

    /* renamed from: B */
    void mo10332B();

    /* renamed from: C */
    boolean mo10333C();

    /* renamed from: D */
    boolean mo10334D();

    /* renamed from: E */
    boolean mo10335E();

    /* renamed from: F */
    void mo10336F();

    /* renamed from: G */
    void mo10337G();

    /* renamed from: H */
    C1130be mo10338H();

    /* renamed from: I */
    void mo10339I();

    /* renamed from: J */
    void mo10340J();

    /* renamed from: a */
    void mo10341a(int i);

    /* renamed from: a */
    void mo10342a(Context context);

    /* renamed from: a */
    void mo10343a(C0719a aVar);

    /* renamed from: a */
    void mo10344a(zzd zzd);

    /* renamed from: a */
    void mo10168a(aga aga);

    /* renamed from: a */
    void mo10345a(agy agy);

    /* renamed from: a */
    void mo10346a(C1130be beVar);

    /* renamed from: a */
    void mo10347a(String str, zzu<? super afl> zzu);

    /* renamed from: a */
    void mo10348a(String str, C0980p<zzu<? super afl>> pVar);

    /* renamed from: a */
    void mo10169a(String str, aeo aeo);

    /* renamed from: a */
    void mo10349a(String str, String str2, @Nullable String str3);

    @Nullable
    /* renamed from: b */
    aga mo10172b();

    /* renamed from: b */
    void mo10350b(zzd zzd);

    /* renamed from: b */
    void mo10351b(String str);

    /* renamed from: b */
    void mo10352b(String str, zzu<? super afl> zzu);

    /* renamed from: b */
    void mo10353b(boolean z);

    /* renamed from: c */
    void mo10354c(boolean z);

    /* renamed from: d */
    Activity mo10174d();

    /* renamed from: d */
    void mo10355d(boolean z);

    void destroy();

    /* renamed from: e */
    zzv mo10175e();

    /* renamed from: e */
    void mo10357e(boolean z);

    /* renamed from: f */
    void mo10358f(boolean z);

    Context getContext();

    int getHeight();

    ViewGroup.LayoutParams getLayoutParams();

    void getLocationOnScreen(int[] iArr);

    @Nullable
    View.OnClickListener getOnClickListener();

    ViewParent getParent();

    int getRequestedOrientation();

    View getView();

    WebView getWebView();

    int getWidth();

    /* renamed from: h */
    C1017ab mo10179h();

    /* renamed from: i */
    zzbbi mo10180i();

    void loadData(String str, String str2, String str3);

    void loadDataWithBaseURL(String str, String str2, String str3, String str4, @Nullable String str5);

    void loadUrl(String str);

    /* renamed from: m */
    void mo10371m();

    void measure(int i, int i2);

    /* renamed from: n */
    void mo10373n();

    /* renamed from: o */
    void mo10374o();

    void onPause();

    void onResume();

    /* renamed from: p */
    Context mo10377p();

    /* renamed from: q */
    zzd mo10378q();

    /* renamed from: r */
    zzd mo10379r();

    /* renamed from: s */
    agy mo10380s();

    void setBackgroundColor(int i);

    void setOnClickListener(View.OnClickListener onClickListener);

    void setOnTouchListener(View.OnTouchListener onTouchListener);

    void setRequestedOrientation(int i);

    void setWebChromeClient(WebChromeClient webChromeClient);

    void setWebViewClient(WebViewClient webViewClient);

    void stopLoading();

    /* renamed from: t */
    String mo10387t();

    @Nullable
    /* renamed from: u */
    ags mo10388u();

    /* renamed from: v */
    WebViewClient mo10389v();

    /* renamed from: w */
    boolean mo10390w();

    /* renamed from: x */
    awy mo10391x();

    @Nullable
    /* renamed from: y */
    C0719a mo10392y();

    /* renamed from: z */
    boolean mo10393z();
}
