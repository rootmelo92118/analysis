package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.os.Message;
import android.support.p034v4.media.session.PlaybackStateCompat;
import android.view.View;
import android.view.WindowManager;
import android.webkit.ConsoleMessage;
import android.webkit.GeolocationPermissions;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.PermissionRequest;
import android.webkit.WebChromeClient;
import android.webkit.WebStorage;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.ads.internal.overlay.zzd;
import com.google.android.gms.ads.internal.zzbv;
import com.google.android.gms.ads.internal.zzw;
import com.google.android.gms.common.util.C0979o;

@TargetApi(11)
@C1598qn
public final class afc extends WebChromeClient {

    /* renamed from: a */
    private final afl f1578a;

    public afc(afl afl) {
        this.f1578a = afl;
    }

    /* renamed from: a */
    private final boolean m1926a(Context context, String str, String str2, String str3, String str4, JsResult jsResult, JsPromptResult jsPromptResult, boolean z) {
        zzw a;
        try {
            if (this.f1578a == null || this.f1578a.mo10388u() == null || this.f1578a.mo10388u().mo10395a() == null || (a = this.f1578a.mo10388u().mo10395a()) == null || a.zzju()) {
                AlertDialog.Builder builder = new AlertDialog.Builder(context);
                builder.setTitle(str2);
                if (z) {
                    LinearLayout linearLayout = new LinearLayout(context);
                    linearLayout.setOrientation(1);
                    TextView textView = new TextView(context);
                    textView.setText(str3);
                    EditText editText = new EditText(context);
                    editText.setText(str4);
                    linearLayout.addView(textView);
                    linearLayout.addView(editText);
                    builder.setView(linearLayout).setPositiveButton(17039370, new afj(jsPromptResult, editText)).setNegativeButton(17039360, new afi(jsPromptResult)).setOnCancelListener(new afh(jsPromptResult)).create().show();
                } else {
                    builder.setMessage(str3).setPositiveButton(17039370, new afg(jsResult)).setNegativeButton(17039360, new aff(jsResult)).setOnCancelListener(new afd(jsResult)).create().show();
                }
                return true;
            }
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 11 + String.valueOf(str3).length());
            sb.append("window.");
            sb.append(str);
            sb.append("('");
            sb.append(str3);
            sb.append("')");
            a.zzas(sb.toString());
            return false;
        } catch (WindowManager.BadTokenException e) {
            C1772wz.m1627c("Fail to display Dialog.", e);
        }
    }

    public final boolean onCreateWindow(WebView webView, boolean z, boolean z2, Message message) {
        WebView.WebViewTransport webViewTransport = (WebView.WebViewTransport) message.obj;
        WebView webView2 = new WebView(webView.getContext());
        if (this.f1578a.mo10389v() != null) {
            webView2.setWebViewClient(this.f1578a.mo10389v());
        }
        webViewTransport.setWebView(webView2);
        message.sendToTarget();
        return true;
    }

    public final void onCloseWindow(WebView webView) {
        if (!(webView instanceof afl)) {
            C1772wz.m1630e("Tried to close a WebView that wasn't an AdWebView.");
            return;
        }
        zzd q = ((afl) webView).mo10378q();
        if (q == null) {
            C1772wz.m1630e("Tried to close an AdWebView not associated with an overlay.");
        } else {
            q.close();
        }
    }

    public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        String message = consoleMessage.message();
        String sourceId = consoleMessage.sourceId();
        int lineNumber = consoleMessage.lineNumber();
        StringBuilder sb = new StringBuilder(String.valueOf(message).length() + 19 + String.valueOf(sourceId).length());
        sb.append("JS: ");
        sb.append(message);
        sb.append(" (");
        sb.append(sourceId);
        sb.append(":");
        sb.append(lineNumber);
        sb.append(")");
        String sb2 = sb.toString();
        if (sb2.contains("Application Cache")) {
            return super.onConsoleMessage(consoleMessage);
        }
        switch (afk.f1587a[consoleMessage.messageLevel().ordinal()]) {
            case 1:
                C1772wz.m1626c(sb2);
                break;
            case 2:
                C1772wz.m1630e(sb2);
                break;
            case 3:
            case 4:
                C1772wz.m1628d(sb2);
                break;
            case 5:
                C1772wz.m1624b(sb2);
                break;
            default:
                C1772wz.m1628d(sb2);
                break;
        }
        return super.onConsoleMessage(consoleMessage);
    }

    public final void onExceededDatabaseQuota(String str, String str2, long j, long j2, long j3, WebStorage.QuotaUpdater quotaUpdater) {
        long j4 = 5242880 - j3;
        if (j4 <= 0) {
            quotaUpdater.updateQuota(j);
            return;
        }
        if (j != 0) {
            if (j2 == 0) {
                j = Math.min(j + Math.min(PlaybackStateCompat.ACTION_PREPARE_FROM_URI, j4), PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED);
            } else if (j2 <= Math.min(PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED - j, j4)) {
                j += j2;
            }
            j2 = j;
        } else if (j2 > j4 || j2 > PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) {
            j2 = 0;
        }
        quotaUpdater.updateQuota(j2);
    }

    public final void onHideCustomView() {
        zzd q = this.f1578a.mo10378q();
        if (q == null) {
            C1772wz.m1630e("Could not get ad overlay when hiding custom view.");
        } else {
            q.zzvo();
        }
    }

    /* renamed from: a */
    private static Context m1925a(WebView webView) {
        if (!(webView instanceof afl)) {
            return webView.getContext();
        }
        afl afl = (afl) webView;
        Activity d = afl.mo10174d();
        if (d != null) {
            return d;
        }
        return afl.getContext();
    }

    public final boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
        return m1926a(m1925a(webView), "alert", str, str2, (String) null, jsResult, (JsPromptResult) null, false);
    }

    public final boolean onJsBeforeUnload(WebView webView, String str, String str2, JsResult jsResult) {
        return m1926a(m1925a(webView), "onBeforeUnload", str, str2, (String) null, jsResult, (JsPromptResult) null, false);
    }

    public final boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
        return m1926a(m1925a(webView), "confirm", str, str2, (String) null, jsResult, (JsPromptResult) null, false);
    }

    public final boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        return m1926a(m1925a(webView), "prompt", str, str2, str3, (JsResult) null, jsPromptResult, true);
    }

    public final void onReachedMaxAppCacheSize(long j, long j2, WebStorage.QuotaUpdater quotaUpdater) {
        long j3 = j + PlaybackStateCompat.ACTION_PREPARE_FROM_URI;
        if (5242880 - j2 < j3) {
            quotaUpdater.updateQuota(0);
        } else {
            quotaUpdater.updateQuota(j3);
        }
    }

    public final void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        onShowCustomView(view, -1, customViewCallback);
    }

    @Deprecated
    public final void onShowCustomView(View view, int i, WebChromeClient.CustomViewCallback customViewCallback) {
        zzd q = this.f1578a.mo10378q();
        if (q == null) {
            C1772wz.m1630e("Could not get ad overlay when showing custom view.");
            customViewCallback.onCustomViewHidden();
            return;
        }
        q.zza(view, customViewCallback);
        q.setRequestedOrientation(i);
    }

    public final void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback) {
        boolean z;
        if (callback != null) {
            zzbv.zzlf();
            if (!C1782xi.m8381a(this.f1578a.getContext(), "android.permission.ACCESS_FINE_LOCATION")) {
                zzbv.zzlf();
                if (!C1782xi.m8381a(this.f1578a.getContext(), "android.permission.ACCESS_COARSE_LOCATION")) {
                    z = false;
                    callback.invoke(str, z, true);
                }
            }
            z = true;
            callback.invoke(str, z, true);
        }
    }

    @TargetApi(21)
    public final void onPermissionRequest(PermissionRequest permissionRequest) {
        if (C0979o.m1507h()) {
            if (!((Boolean) bre.m6321e().mo12778a(C1557p.f5934ap)).booleanValue()) {
                if (this.f1578a == null || this.f1578a.mo10388u() == null || this.f1578a.mo10388u().mo10424m() == null) {
                    super.onPermissionRequest(permissionRequest);
                    return;
                }
                String[] a = this.f1578a.mo10388u().mo10424m().mo13057a(permissionRequest.getResources());
                if (a.length > 0) {
                    permissionRequest.grant(a);
                    return;
                } else {
                    permissionRequest.deny();
                    return;
                }
            }
        }
        super.onPermissionRequest(permissionRequest);
    }
}
