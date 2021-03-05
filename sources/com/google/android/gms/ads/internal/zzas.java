package com.google.android.gms.ads.internal;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import com.google.android.gms.ads.internal.gmsg.zzu;
import com.google.android.gms.internal.ads.C1090au;
import com.google.android.gms.internal.ads.C1120aw;
import com.google.android.gms.internal.ads.C1210ce;
import com.google.android.gms.internal.ads.C1211cf;
import com.google.android.gms.internal.ads.C1450la;
import com.google.android.gms.internal.ads.C1453ld;
import com.google.android.gms.internal.ads.C1598qn;
import com.google.android.gms.internal.ads.C1752wf;
import com.google.android.gms.internal.ads.C1772wz;
import com.google.android.gms.internal.ads.afl;
import com.google.android.gms.p039a.C0719a;
import com.google.android.gms.p039a.C0722b;
import java.io.ByteArrayOutputStream;
import java.util.Iterator;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@C1598qn
@ParametersAreNonnullByDefault
public final class zzas {
    @Nullable
    public static View zze(@Nullable C1752wf wfVar) {
        if (wfVar == null) {
            C1772wz.m1626c("AdState is null");
            return null;
        } else if (zzf(wfVar) && wfVar.f6699b != null) {
            return wfVar.f6699b.getView();
        } else {
            try {
                C0719a a = wfVar.f6713p != null ? wfVar.f6713p.mo12681a() : null;
                if (a != null) {
                    return (View) C0722b.m770a(a);
                }
                C1772wz.m1630e("View in mediation adapter is null.");
                return null;
            } catch (RemoteException e) {
                C1772wz.m1627c("Could not get View from mediation adapter.", e);
                return null;
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v12, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: android.view.View} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v6, resolved type: android.view.View} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean zza(com.google.android.gms.internal.ads.afl r25, com.google.android.gms.internal.ads.C1427ke r26, java.util.concurrent.CountDownLatch r27) {
        /*
            r0 = r25
            r1 = r26
            r7 = r27
            r8 = 0
            android.view.View r2 = r25.getView()     // Catch:{ RemoteException -> 0x0132, RuntimeException -> 0x012d }
            if (r2 != 0) goto L_0x0014
            java.lang.String r0 = "AdWebView is null"
            com.google.android.gms.internal.ads.C1772wz.m1630e(r0)     // Catch:{ RemoteException -> 0x0132, RuntimeException -> 0x012d }
            goto L_0x0138
        L_0x0014:
            r3 = 4
            r2.setVisibility(r3)     // Catch:{ RemoteException -> 0x0132, RuntimeException -> 0x012d }
            com.google.android.gms.internal.ads.jx r2 = r1.f5617b     // Catch:{ RemoteException -> 0x0132, RuntimeException -> 0x012d }
            java.util.List<java.lang.String> r2 = r2.f5562r     // Catch:{ RemoteException -> 0x0132, RuntimeException -> 0x012d }
            if (r2 == 0) goto L_0x0127
            boolean r3 = r2.isEmpty()     // Catch:{ RemoteException -> 0x0132, RuntimeException -> 0x012d }
            if (r3 == 0) goto L_0x0026
            goto L_0x0127
        L_0x0026:
            java.lang.String r3 = "/nativeExpressAssetsLoaded"
            com.google.android.gms.ads.internal.zzav r4 = new com.google.android.gms.ads.internal.zzav     // Catch:{ RemoteException -> 0x0132, RuntimeException -> 0x012d }
            r4.<init>(r7)     // Catch:{ RemoteException -> 0x0132, RuntimeException -> 0x012d }
            r0.mo10347a((java.lang.String) r3, (com.google.android.gms.ads.internal.gmsg.zzu<? super com.google.android.gms.internal.ads.afl>) r4)     // Catch:{ RemoteException -> 0x0132, RuntimeException -> 0x012d }
            java.lang.String r3 = "/nativeExpressAssetsLoadingFailed"
            com.google.android.gms.ads.internal.zzaw r4 = new com.google.android.gms.ads.internal.zzaw     // Catch:{ RemoteException -> 0x0132, RuntimeException -> 0x012d }
            r4.<init>(r7)     // Catch:{ RemoteException -> 0x0132, RuntimeException -> 0x012d }
            r0.mo10347a((java.lang.String) r3, (com.google.android.gms.ads.internal.gmsg.zzu<? super com.google.android.gms.internal.ads.afl>) r4)     // Catch:{ RemoteException -> 0x0132, RuntimeException -> 0x012d }
            com.google.android.gms.internal.ads.kr r3 = r1.f5618c     // Catch:{ RemoteException -> 0x0132, RuntimeException -> 0x012d }
            com.google.android.gms.internal.ads.la r3 = r3.mo12699h()     // Catch:{ RemoteException -> 0x0132, RuntimeException -> 0x012d }
            com.google.android.gms.internal.ads.kr r4 = r1.f5618c     // Catch:{ RemoteException -> 0x0132, RuntimeException -> 0x012d }
            com.google.android.gms.internal.ads.ld r4 = r4.mo12700i()     // Catch:{ RemoteException -> 0x0132, RuntimeException -> 0x012d }
            java.lang.String r5 = "2"
            boolean r5 = r2.contains(r5)     // Catch:{ RemoteException -> 0x0132, RuntimeException -> 0x012d }
            r6 = 0
            if (r5 == 0) goto L_0x00a9
            if (r3 == 0) goto L_0x00a9
            com.google.android.gms.internal.ads.au r2 = new com.google.android.gms.internal.ads.au     // Catch:{ RemoteException -> 0x0132, RuntimeException -> 0x012d }
            java.lang.String r10 = r3.mo12708a()     // Catch:{ RemoteException -> 0x0132, RuntimeException -> 0x012d }
            java.util.List r11 = r3.mo12711b()     // Catch:{ RemoteException -> 0x0132, RuntimeException -> 0x012d }
            java.lang.String r12 = r3.mo12713c()     // Catch:{ RemoteException -> 0x0132, RuntimeException -> 0x012d }
            com.google.android.gms.internal.ads.ce r13 = r3.mo12715d()     // Catch:{ RemoteException -> 0x0132, RuntimeException -> 0x012d }
            java.lang.String r14 = r3.mo12716e()     // Catch:{ RemoteException -> 0x0132, RuntimeException -> 0x012d }
            double r15 = r3.mo12717f()     // Catch:{ RemoteException -> 0x0132, RuntimeException -> 0x012d }
            java.lang.String r17 = r3.mo12718g()     // Catch:{ RemoteException -> 0x0132, RuntimeException -> 0x012d }
            java.lang.String r18 = r3.mo12719h()     // Catch:{ RemoteException -> 0x0132, RuntimeException -> 0x012d }
            r19 = 0
            android.os.Bundle r20 = r3.mo12723l()     // Catch:{ RemoteException -> 0x0132, RuntimeException -> 0x012d }
            r21 = 0
            com.google.android.gms.a.a r4 = r3.mo12727p()     // Catch:{ RemoteException -> 0x0132, RuntimeException -> 0x012d }
            if (r4 == 0) goto L_0x008c
            com.google.android.gms.a.a r4 = r3.mo12727p()     // Catch:{ RemoteException -> 0x0132, RuntimeException -> 0x012d }
            java.lang.Object r4 = com.google.android.gms.p039a.C0722b.m770a((com.google.android.gms.p039a.C0719a) r4)     // Catch:{ RemoteException -> 0x0132, RuntimeException -> 0x012d }
            r6 = r4
            android.view.View r6 = (android.view.View) r6     // Catch:{ RemoteException -> 0x0132, RuntimeException -> 0x012d }
        L_0x008c:
            r22 = r6
            com.google.android.gms.a.a r23 = r3.mo12728q()     // Catch:{ RemoteException -> 0x0132, RuntimeException -> 0x012d }
            r24 = 0
            r9 = r2
            r9.<init>(r10, r11, r12, r13, r14, r15, r17, r18, r19, r20, r21, r22, r23, r24)     // Catch:{ RemoteException -> 0x0132, RuntimeException -> 0x012d }
            com.google.android.gms.internal.ads.jx r3 = r1.f5617b     // Catch:{ RemoteException -> 0x0132, RuntimeException -> 0x012d }
            java.lang.String r3 = r3.f5561q     // Catch:{ RemoteException -> 0x0132, RuntimeException -> 0x012d }
            com.google.android.gms.internal.ads.ags r4 = r25.mo10388u()     // Catch:{ RemoteException -> 0x0132, RuntimeException -> 0x012d }
            com.google.android.gms.ads.internal.zzat r5 = new com.google.android.gms.ads.internal.zzat     // Catch:{ RemoteException -> 0x0132, RuntimeException -> 0x012d }
            r5.<init>(r2, r3, r0)     // Catch:{ RemoteException -> 0x0132, RuntimeException -> 0x012d }
            r4.mo10400a((com.google.android.gms.internal.ads.agt) r5)     // Catch:{ RemoteException -> 0x0132, RuntimeException -> 0x012d }
            goto L_0x0102
        L_0x00a9:
            java.lang.String r3 = "1"
            boolean r2 = r2.contains(r3)     // Catch:{ RemoteException -> 0x0132, RuntimeException -> 0x012d }
            if (r2 == 0) goto L_0x0121
            if (r4 == 0) goto L_0x0121
            com.google.android.gms.internal.ads.aw r2 = new com.google.android.gms.internal.ads.aw     // Catch:{ RemoteException -> 0x0132, RuntimeException -> 0x012d }
            java.lang.String r10 = r4.mo12729a()     // Catch:{ RemoteException -> 0x0132, RuntimeException -> 0x012d }
            java.util.List r11 = r4.mo12732b()     // Catch:{ RemoteException -> 0x0132, RuntimeException -> 0x012d }
            java.lang.String r12 = r4.mo12734c()     // Catch:{ RemoteException -> 0x0132, RuntimeException -> 0x012d }
            com.google.android.gms.internal.ads.ce r13 = r4.mo12736d()     // Catch:{ RemoteException -> 0x0132, RuntimeException -> 0x012d }
            java.lang.String r14 = r4.mo12737e()     // Catch:{ RemoteException -> 0x0132, RuntimeException -> 0x012d }
            java.lang.String r15 = r4.mo12738f()     // Catch:{ RemoteException -> 0x0132, RuntimeException -> 0x012d }
            r16 = 0
            android.os.Bundle r17 = r4.mo12742j()     // Catch:{ RemoteException -> 0x0132, RuntimeException -> 0x012d }
            r18 = 0
            com.google.android.gms.a.a r3 = r4.mo12746n()     // Catch:{ RemoteException -> 0x0132, RuntimeException -> 0x012d }
            if (r3 == 0) goto L_0x00e6
            com.google.android.gms.a.a r3 = r4.mo12746n()     // Catch:{ RemoteException -> 0x0132, RuntimeException -> 0x012d }
            java.lang.Object r3 = com.google.android.gms.p039a.C0722b.m770a((com.google.android.gms.p039a.C0719a) r3)     // Catch:{ RemoteException -> 0x0132, RuntimeException -> 0x012d }
            r6 = r3
            android.view.View r6 = (android.view.View) r6     // Catch:{ RemoteException -> 0x0132, RuntimeException -> 0x012d }
        L_0x00e6:
            r19 = r6
            com.google.android.gms.a.a r20 = r4.mo12747o()     // Catch:{ RemoteException -> 0x0132, RuntimeException -> 0x012d }
            r21 = 0
            r9 = r2
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)     // Catch:{ RemoteException -> 0x0132, RuntimeException -> 0x012d }
            com.google.android.gms.internal.ads.jx r3 = r1.f5617b     // Catch:{ RemoteException -> 0x0132, RuntimeException -> 0x012d }
            java.lang.String r3 = r3.f5561q     // Catch:{ RemoteException -> 0x0132, RuntimeException -> 0x012d }
            com.google.android.gms.internal.ads.ags r4 = r25.mo10388u()     // Catch:{ RemoteException -> 0x0132, RuntimeException -> 0x012d }
            com.google.android.gms.ads.internal.zzau r5 = new com.google.android.gms.ads.internal.zzau     // Catch:{ RemoteException -> 0x0132, RuntimeException -> 0x012d }
            r5.<init>(r2, r3, r0)     // Catch:{ RemoteException -> 0x0132, RuntimeException -> 0x012d }
            r4.mo10400a((com.google.android.gms.internal.ads.agt) r5)     // Catch:{ RemoteException -> 0x0132, RuntimeException -> 0x012d }
        L_0x0102:
            com.google.android.gms.internal.ads.jx r2 = r1.f5617b     // Catch:{ RemoteException -> 0x0132, RuntimeException -> 0x012d }
            java.lang.String r3 = r2.f5559o     // Catch:{ RemoteException -> 0x0132, RuntimeException -> 0x012d }
            com.google.android.gms.internal.ads.jx r1 = r1.f5617b     // Catch:{ RemoteException -> 0x0132, RuntimeException -> 0x012d }
            java.lang.String r2 = r1.f5560p     // Catch:{ RemoteException -> 0x0132, RuntimeException -> 0x012d }
            if (r2 == 0) goto L_0x0117
            java.lang.String r4 = "text/html"
            java.lang.String r5 = "UTF-8"
            r6 = 0
            r1 = r25
            r1.loadDataWithBaseURL(r2, r3, r4, r5, r6)     // Catch:{ RemoteException -> 0x0132, RuntimeException -> 0x012d }
            goto L_0x011e
        L_0x0117:
            java.lang.String r1 = "text/html"
            java.lang.String r2 = "UTF-8"
            r0.loadData(r3, r1, r2)     // Catch:{ RemoteException -> 0x0132, RuntimeException -> 0x012d }
        L_0x011e:
            r0 = 1
            r8 = 1
            goto L_0x0138
        L_0x0121:
            java.lang.String r0 = "No matching template id and mapper"
            com.google.android.gms.internal.ads.C1772wz.m1630e(r0)     // Catch:{ RemoteException -> 0x0132, RuntimeException -> 0x012d }
            goto L_0x0138
        L_0x0127:
            java.lang.String r0 = "No template ids present in mediation response"
            com.google.android.gms.internal.ads.C1772wz.m1630e(r0)     // Catch:{ RemoteException -> 0x0132, RuntimeException -> 0x012d }
            goto L_0x0138
        L_0x012d:
            r0 = move-exception
            r27.countDown()
            throw r0
        L_0x0132:
            r0 = move-exception
            java.lang.String r1 = "Unable to invoke load assets"
            com.google.android.gms.internal.ads.C1772wz.m1627c(r1, r0)
        L_0x0138:
            if (r8 != 0) goto L_0x013d
            r27.countDown()
        L_0x013d:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.zzas.zza(com.google.android.gms.internal.ads.afl, com.google.android.gms.internal.ads.ke, java.util.concurrent.CountDownLatch):boolean");
    }

    public static boolean zzf(@Nullable C1752wf wfVar) {
        return (wfVar == null || !wfVar.f6711n || wfVar.f6712o == null || wfVar.f6712o.f5559o == null) ? false : true;
    }

    static zzu<afl> zza(@Nullable C1450la laVar, @Nullable C1453ld ldVar, zzab zzab) {
        return new zzax(laVar, zzab, ldVar);
    }

    /* access modifiers changed from: private */
    public static void zzd(afl afl) {
        View.OnClickListener onClickListener = afl.getOnClickListener();
        if (onClickListener != null) {
            onClickListener.onClick(afl.getView());
        }
    }

    private static JSONObject zza(@Nullable Bundle bundle, String str) {
        JSONObject jSONObject = new JSONObject();
        if (bundle == null || TextUtils.isEmpty(str)) {
            return jSONObject;
        }
        JSONObject jSONObject2 = new JSONObject(str);
        Iterator<String> keys = jSONObject2.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            if (bundle.containsKey(next)) {
                if ("image".equals(jSONObject2.getString(next))) {
                    Object obj = bundle.get(next);
                    if (obj instanceof Bitmap) {
                        jSONObject.put(next, zza((Bitmap) obj));
                    } else {
                        C1772wz.m1630e("Invalid type. An image type extra should return a bitmap");
                    }
                } else if (bundle.get(next) instanceof Bitmap) {
                    C1772wz.m1630e("Invalid asset type. Bitmap should be returned only for image type");
                } else {
                    jSONObject.put(next, String.valueOf(bundle.get(next)));
                }
            }
        }
        return jSONObject;
    }

    private static String zza(@Nullable C1210ce ceVar) {
        if (ceVar == null) {
            C1772wz.m1630e("Image is null. Returning empty string");
            return "";
        }
        try {
            Uri b = ceVar.mo11156b();
            if (b != null) {
                return b.toString();
            }
        } catch (RemoteException unused) {
            C1772wz.m1630e("Unable to get image uri. Trying data uri next");
        }
        return zzb(ceVar);
    }

    private static String zzb(C1210ce ceVar) {
        try {
            C0719a a = ceVar.mo11155a();
            if (a == null) {
                C1772wz.m1630e("Drawable is null. Returning empty string");
                return "";
            }
            Drawable drawable = (Drawable) C0722b.m770a(a);
            if (drawable instanceof BitmapDrawable) {
                return zza(((BitmapDrawable) drawable).getBitmap());
            }
            C1772wz.m1630e("Drawable is not an instance of BitmapDrawable. Returning empty string");
            return "";
        } catch (RemoteException unused) {
            C1772wz.m1630e("Unable to get drawable. Returning empty string");
            return "";
        }
    }

    private static String zza(@Nullable Bitmap bitmap) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        if (bitmap == null) {
            C1772wz.m1630e("Bitmap is null. Returning empty string");
            return "";
        }
        bitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
        String encodeToString = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0);
        String valueOf = String.valueOf("data:image/png;base64,");
        String valueOf2 = String.valueOf(encodeToString);
        return valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
    }

    @Nullable
    private static C1210ce zzg(Object obj) {
        if (obj instanceof IBinder) {
            return C1211cf.m6600a((IBinder) obj);
        }
        return null;
    }

    static final /* synthetic */ void zza(C1120aw awVar, String str, afl afl, boolean z) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("headline", awVar.mo11328e());
            jSONObject.put("body", awVar.mo11331i());
            jSONObject.put("call_to_action", awVar.mo11333k());
            jSONObject.put("advertiser", awVar.mo11334l());
            jSONObject.put("logo", zza(awVar.mo11332j()));
            JSONArray jSONArray = new JSONArray();
            List<Object> f = awVar.mo11236f();
            if (f != null) {
                for (Object zzg : f) {
                    jSONArray.put(zza(zzg(zzg)));
                }
            }
            jSONObject.put("images", jSONArray);
            jSONObject.put("extras", zza(awVar.mo11337o(), str));
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("assets", jSONObject);
            jSONObject2.put("template_id", "1");
            afl.mo10448b("google.afma.nativeExpressAds.loadAssets", jSONObject2);
        } catch (JSONException e) {
            C1772wz.m1627c("Exception occurred when loading assets", e);
        }
    }

    static final /* synthetic */ void zza(C1090au auVar, String str, afl afl, boolean z) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("headline", auVar.mo11235e());
            jSONObject.put("body", auVar.mo11237g());
            jSONObject.put("call_to_action", auVar.mo11239i());
            jSONObject.put("price", auVar.mo11242l());
            jSONObject.put("star_rating", String.valueOf(auVar.mo11240j()));
            jSONObject.put("store", auVar.mo11241k());
            jSONObject.put("icon", zza(auVar.mo11238h()));
            JSONArray jSONArray = new JSONArray();
            List<Object> f = auVar.mo11236f();
            if (f != null) {
                for (Object zzg : f) {
                    jSONArray.put(zza(zzg(zzg)));
                }
            }
            jSONObject.put("images", jSONArray);
            jSONObject.put("extras", zza(auVar.mo11245o(), str));
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("assets", jSONObject);
            jSONObject2.put("template_id", "2");
            afl.mo10448b("google.afma.nativeExpressAds.loadAssets", jSONObject2);
        } catch (JSONException e) {
            C1772wz.m1627c("Exception occurred when loading assets", e);
        }
    }
}
