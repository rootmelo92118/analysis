package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.view.WindowManager;
import com.google.android.gms.ads.internal.zzbv;
import java.util.ArrayList;
import java.util.List;

@C1598qn
/* renamed from: com.google.android.gms.internal.ads.ye */
public final class C1805ye {

    /* renamed from: a */
    private final Context f6862a;

    /* renamed from: b */
    private String f6863b;

    /* renamed from: c */
    private String f6864c;

    /* renamed from: d */
    private String f6865d;
    @Nullable

    /* renamed from: e */
    private String f6866e;

    /* renamed from: f */
    private final float f6867f;

    /* renamed from: g */
    private float f6868g;

    /* renamed from: h */
    private float f6869h;

    /* renamed from: i */
    private float f6870i;

    /* renamed from: j */
    private int f6871j;

    /* renamed from: k */
    private int f6872k;

    /* renamed from: l */
    private float f6873l;

    /* renamed from: m */
    private float f6874m;

    /* renamed from: n */
    private float f6875n;

    /* renamed from: o */
    private float f6876o;

    /* renamed from: p */
    private Handler f6877p;

    /* renamed from: q */
    private Runnable f6878q;

    public C1805ye(Context context) {
        this.f6871j = 0;
        this.f6878q = new C1806yf(this);
        this.f6862a = context;
        this.f6867f = context.getResources().getDisplayMetrics().density;
        this.f6872k = ViewConfiguration.get(this.f6862a).getScaledTouchSlop();
        zzbv.zzlv().mo13282a();
        this.f6877p = zzbv.zzlv().mo13283b();
    }

    public C1805ye(Context context, String str) {
        this(context);
        this.f6863b = str;
    }

    /* renamed from: a */
    public final void mo13250a(MotionEvent motionEvent) {
        if (((Boolean) bre.m6321e().mo12778a(C1557p.f6033ci)).booleanValue()) {
            int actionMasked = motionEvent.getActionMasked();
            int historySize = motionEvent.getHistorySize();
            int pointerCount = motionEvent.getPointerCount();
            if (actionMasked == 0) {
                this.f6871j = 0;
                this.f6873l = motionEvent.getX();
                this.f6874m = motionEvent.getY();
            } else if (this.f6871j != -1) {
                boolean z = true;
                if (this.f6871j == 0 && actionMasked == 5) {
                    this.f6871j = 5;
                    this.f6875n = motionEvent.getX(1);
                    this.f6876o = motionEvent.getY(1);
                    this.f6877p.postDelayed(this.f6878q, ((Long) bre.m6321e().mo12778a(C1557p.f6034cj)).longValue());
                } else if (this.f6871j == 5) {
                    if (pointerCount == 2) {
                        if (actionMasked == 2) {
                            boolean z2 = false;
                            for (int i = 0; i < historySize; i++) {
                                if (!m8495a(motionEvent.getHistoricalX(0, i), motionEvent.getHistoricalY(0, i), motionEvent.getHistoricalX(1, i), motionEvent.getHistoricalY(1, i))) {
                                    z2 = true;
                                }
                            }
                            if (m8495a(motionEvent.getX(), motionEvent.getY(), motionEvent.getX(1), motionEvent.getY(1))) {
                                z = z2;
                            }
                        } else {
                            z = false;
                        }
                    }
                    if (z) {
                        this.f6871j = -1;
                        this.f6877p.removeCallbacks(this.f6878q);
                    }
                }
            }
        } else {
            int historySize2 = motionEvent.getHistorySize();
            for (int i2 = 0; i2 < historySize2; i2++) {
                m8494a(motionEvent.getActionMasked(), motionEvent.getHistoricalX(0, i2), motionEvent.getHistoricalY(0, i2));
            }
            m8494a(motionEvent.getActionMasked(), motionEvent.getX(), motionEvent.getY());
        }
    }

    /* renamed from: a */
    private final boolean m8495a(float f, float f2, float f3, float f4) {
        return Math.abs(this.f6873l - f) < ((float) this.f6872k) && Math.abs(this.f6874m - f2) < ((float) this.f6872k) && Math.abs(this.f6875n - f3) < ((float) this.f6872k) && Math.abs(this.f6876o - f4) < ((float) this.f6872k);
    }

    /* renamed from: a */
    private final void m8494a(int i, float f, float f2) {
        if (i == 0) {
            this.f6871j = 0;
            this.f6868g = f;
            this.f6869h = f2;
            this.f6870i = f2;
        } else if (this.f6871j != -1) {
            if (i == 2) {
                if (f2 > this.f6869h) {
                    this.f6869h = f2;
                } else if (f2 < this.f6870i) {
                    this.f6870i = f2;
                }
                if (this.f6869h - this.f6870i > this.f6867f * 30.0f) {
                    this.f6871j = -1;
                    return;
                }
                if (this.f6871j == 0 || this.f6871j == 2) {
                    if (f - this.f6868g >= this.f6867f * 50.0f) {
                        this.f6868g = f;
                        this.f6871j++;
                    }
                } else if ((this.f6871j == 1 || this.f6871j == 3) && f - this.f6868g <= this.f6867f * -50.0f) {
                    this.f6868g = f;
                    this.f6871j++;
                }
                if (this.f6871j == 1 || this.f6871j == 3) {
                    if (f > this.f6868g) {
                        this.f6868g = f;
                    }
                } else if (this.f6871j == 2 && f < this.f6868g) {
                    this.f6868g = f;
                }
            } else if (i == 1 && this.f6871j == 4) {
                mo13248a();
            }
        }
    }

    /* renamed from: a */
    public final void mo13248a() {
        try {
            if (!(this.f6862a instanceof Activity)) {
                C1772wz.m1628d("Can not create dialog without Activity Context");
                return;
            }
            String str = !TextUtils.isEmpty(zzbv.zzlp().mo13265a()) ? "Creative Preview (Enabled)" : "Creative Preview";
            String str2 = zzbv.zzlp().mo13269b() ? "Troubleshooting (Enabled)" : "Troubleshooting";
            ArrayList arrayList = new ArrayList();
            int a = m8493a((List<String>) arrayList, "Ad Information", true);
            int a2 = m8493a((List<String>) arrayList, str, true);
            int a3 = m8493a((List<String>) arrayList, str2, true);
            AlertDialog.Builder builder = new AlertDialog.Builder(this.f6862a, zzbv.zzlh().mo13242f());
            builder.setTitle("Select a Debug Mode").setItems((CharSequence[]) arrayList.toArray(new String[0]), new C1807yg(this, a, a2, a3));
            builder.create().show();
        } catch (WindowManager.BadTokenException e) {
            if (C1772wz.m8288a()) {
                Log.v("Ads", "", e);
            }
        }
    }

    /* renamed from: a */
    public final void mo13251a(String str) {
        this.f6864c = str;
    }

    /* renamed from: b */
    public final void mo13254b(String str) {
        this.f6865d = str;
    }

    /* renamed from: c */
    public final void mo13256c(String str) {
        this.f6863b = str;
    }

    /* renamed from: d */
    public final void mo13258d(String str) {
        this.f6866e = str;
    }

    /* renamed from: a */
    private static int m8493a(List<String> list, String str, boolean z) {
        list.add(str);
        return list.size() - 1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final /* synthetic */ void mo13253b() {
        zzbv.zzlp().mo13267a(this.f6862a, this.f6864c, this.f6865d, this.f6866e);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final /* synthetic */ void mo13255c() {
        zzbv.zzlp().mo13266a(this.f6862a, this.f6864c, this.f6865d);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void mo13252a(String str, DialogInterface dialogInterface, int i) {
        zzbv.zzlf();
        C1782xi.m8370a(this.f6862a, Intent.createChooser(new Intent("android.intent.action.SEND").setType("text/plain").putExtra("android.intent.extra.TEXT", str), "Share via"));
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x006e, code lost:
        if (android.text.TextUtils.isEmpty(r1) == false) goto L_0x0073;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ void mo13249a(int r1, int r2, int r3, android.content.DialogInterface r4, int r5) {
        /*
            r0 = this;
            if (r5 != r1) goto L_0x009b
            android.content.Context r1 = r0.f6862a
            boolean r1 = r1 instanceof android.app.Activity
            if (r1 != 0) goto L_0x000e
            java.lang.String r1 = "Can not create dialog without Activity Context"
            com.google.android.gms.internal.ads.C1772wz.m1628d(r1)
            return
        L_0x000e:
            java.lang.String r1 = r0.f6863b
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 != 0) goto L_0x0071
            java.lang.String r2 = "\\+"
            java.lang.String r3 = "%20"
            java.lang.String r1 = r1.replaceAll(r2, r3)
            android.net.Uri$Builder r2 = new android.net.Uri$Builder
            r2.<init>()
            android.net.Uri$Builder r1 = r2.encodedQuery(r1)
            android.net.Uri r1 = r1.build()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            com.google.android.gms.ads.internal.zzbv.zzlf()
            java.util.Map r1 = com.google.android.gms.internal.ads.C1782xi.m8367a((android.net.Uri) r1)
            java.util.Set r3 = r1.keySet()
            java.util.Iterator r3 = r3.iterator()
        L_0x003f:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0062
            java.lang.Object r4 = r3.next()
            java.lang.String r4 = (java.lang.String) r4
            r2.append(r4)
            java.lang.String r5 = " = "
            r2.append(r5)
            java.lang.Object r4 = r1.get(r4)
            java.lang.String r4 = (java.lang.String) r4
            r2.append(r4)
            java.lang.String r4 = "\n\n"
            r2.append(r4)
            goto L_0x003f
        L_0x0062:
            java.lang.String r1 = r2.toString()
            java.lang.String r1 = r1.trim()
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 != 0) goto L_0x0071
            goto L_0x0073
        L_0x0071:
            java.lang.String r1 = "No debug information"
        L_0x0073:
            android.app.AlertDialog$Builder r2 = new android.app.AlertDialog$Builder
            android.content.Context r3 = r0.f6862a
            r2.<init>(r3)
            r2.setMessage(r1)
            java.lang.String r3 = "Ad Information"
            r2.setTitle(r3)
            java.lang.String r3 = "Share"
            com.google.android.gms.internal.ads.yh r4 = new com.google.android.gms.internal.ads.yh
            r4.<init>(r0, r1)
            r2.setPositiveButton(r3, r4)
            java.lang.String r1 = "Close"
            android.content.DialogInterface$OnClickListener r3 = com.google.android.gms.internal.ads.C1809yi.f6886a
            r2.setNegativeButton(r1, r3)
            android.app.AlertDialog r1 = r2.create()
            r1.show()
            return
        L_0x009b:
            if (r5 != r2) goto L_0x00ab
            java.lang.String r1 = "Debug mode [Creative Preview] selected."
            com.google.android.gms.internal.ads.C1772wz.m1624b(r1)
            com.google.android.gms.internal.ads.yj r1 = new com.google.android.gms.internal.ads.yj
            r1.<init>(r0)
            com.google.android.gms.internal.ads.C1780xg.m8353a((java.lang.Runnable) r1)
            return
        L_0x00ab:
            if (r5 != r3) goto L_0x00ba
            java.lang.String r1 = "Debug mode [Troubleshooting] selected."
            com.google.android.gms.internal.ads.C1772wz.m1624b(r1)
            com.google.android.gms.internal.ads.yk r1 = new com.google.android.gms.internal.ads.yk
            r1.<init>(r0)
            com.google.android.gms.internal.ads.C1780xg.m8353a((java.lang.Runnable) r1)
        L_0x00ba:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1805ye.mo13249a(int, int, int, android.content.DialogInterface, int):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final /* synthetic */ void mo13257d() {
        this.f6871j = 4;
        mo13248a();
    }
}
