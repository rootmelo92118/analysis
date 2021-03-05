package com.google.android.gms.ads.internal.overlay;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C0932b;
import com.google.android.gms.internal.ads.C1598qn;

@C1598qn
public final class zzc extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzc> CREATOR = new zzb();
    public final Intent intent;
    public final String mimeType;
    public final String packageName;
    public final String url;
    private final String zzdqp;
    public final String zzdqq;
    public final String zzdqr;
    private final String zzdqs;

    public zzc(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this(str, str2, str3, str4, str5, str6, str7, (Intent) null);
    }

    public zzc(Intent intent2) {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, intent2);
    }

    public zzc(String str, String str2, String str3, String str4, String str5, String str6, String str7, Intent intent2) {
        this.zzdqp = str;
        this.url = str2;
        this.mimeType = str3;
        this.packageName = str4;
        this.zzdqq = str5;
        this.zzdqr = str6;
        this.zzdqs = str7;
        this.intent = intent2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C0932b.m1364a(parcel);
        C0932b.m1377a(parcel, 2, this.zzdqp, false);
        C0932b.m1377a(parcel, 3, this.url, false);
        C0932b.m1377a(parcel, 4, this.mimeType, false);
        C0932b.m1377a(parcel, 5, this.packageName, false);
        C0932b.m1377a(parcel, 6, this.zzdqq, false);
        C0932b.m1377a(parcel, 7, this.zzdqr, false);
        C0932b.m1377a(parcel, 8, this.zzdqs, false);
        C0932b.m1372a(parcel, 9, (Parcelable) this.intent, i, false);
        C0932b.m1365a(parcel, a);
    }
}
