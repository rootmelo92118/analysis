package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.util.Base64;
import com.google.android.gms.ads.internal.zzbv;
import com.google.android.gms.common.internal.safeparcel.C0930a;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

@C1598qn
/* renamed from: com.google.android.gms.internal.ads.gw */
final class C1337gw {

    /* renamed from: a */
    final zzwb f5417a;

    /* renamed from: b */
    final String f5418b;

    /* renamed from: c */
    final int f5419c;

    /* renamed from: a */
    static C1337gw m6957a(String str) {
        String[] split = str.split("\u0000");
        if (split.length == 3) {
            Parcel obtain = Parcel.obtain();
            try {
                String str2 = new String(Base64.decode(split[0], 0), "UTF-8");
                int parseInt = Integer.parseInt(split[1]);
                byte[] decode = Base64.decode(split[2], 0);
                obtain.unmarshall(decode, 0, decode.length);
                obtain.setDataPosition(0);
                C1337gw gwVar = new C1337gw(zzwb.CREATOR.createFromParcel(obtain), str2, parseInt);
                obtain.recycle();
                return gwVar;
            } catch (C0930a.C0931a | IllegalArgumentException | IllegalStateException e) {
                zzbv.zzlj().mo13119a(e, "QueueSeed.decode");
                throw new IOException("Malformed QueueSeed encoding.", e);
            } catch (Throwable th) {
                obtain.recycle();
                throw th;
            }
        } else {
            throw new IOException("Incorrect field count for QueueSeed.");
        }
    }

    C1337gw(C1333gs gsVar) {
        this(gsVar.mo12560a(), gsVar.mo12564c(), gsVar.mo12563b());
    }

    private C1337gw(zzwb zzwb, String str, int i) {
        this.f5417a = zzwb;
        this.f5418b = str;
        this.f5419c = i;
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final String mo12581a() {
        Parcel obtain = Parcel.obtain();
        try {
            String encodeToString = Base64.encodeToString(this.f5418b.getBytes("UTF-8"), 0);
            String num = Integer.toString(this.f5419c);
            this.f5417a.writeToParcel(obtain, 0);
            String encodeToString2 = Base64.encodeToString(obtain.marshall(), 0);
            StringBuilder sb = new StringBuilder(String.valueOf(encodeToString).length() + 2 + String.valueOf(num).length() + String.valueOf(encodeToString2).length());
            sb.append(encodeToString);
            sb.append("\u0000");
            sb.append(num);
            sb.append("\u0000");
            sb.append(encodeToString2);
            String sb2 = sb.toString();
            obtain.recycle();
            return sb2;
        } catch (UnsupportedEncodingException unused) {
            C1772wz.m1626c("QueueSeed encode failed because UTF-8 is not available.");
            obtain.recycle();
            return "";
        } catch (Throwable th) {
            obtain.recycle();
            throw th;
        }
    }
}
