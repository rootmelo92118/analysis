package com.google.android.gms.ads.internal.overlay;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.gmsg.zzb;
import com.google.android.gms.ads.internal.gmsg.zzd;
import com.google.android.gms.ads.internal.zzaq;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C0932b;
import com.google.android.gms.internal.ads.C1598qn;
import com.google.android.gms.internal.ads.afl;
import com.google.android.gms.internal.ads.bqf;
import com.google.android.gms.internal.ads.zzbbi;
import com.google.android.gms.p039a.C0719a;
import com.google.android.gms.p039a.C0722b;

@C1598qn
public final class AdOverlayInfoParcel extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<AdOverlayInfoParcel> CREATOR = new zzm();
    public final int orientation;
    public final String url;
    public final String zzbde;
    public final zzbbi zzbsp;
    public final zzc zzdrs;
    public final bqf zzdrt;
    public final zzn zzdru;
    public final afl zzdrv;
    public final zzd zzdrw;
    public final boolean zzdrx;
    public final String zzdry;
    public final zzt zzdrz;
    public final int zzdsa;
    public final String zzdsb;
    public final zzaq zzdsc;
    public final zzb zzdsd;

    public static void zza(Intent intent, AdOverlayInfoParcel adOverlayInfoParcel) {
        Bundle bundle = new Bundle(1);
        bundle.putParcelable("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo", adOverlayInfoParcel);
        intent.putExtra("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo", bundle);
    }

    public static AdOverlayInfoParcel zzc(Intent intent) {
        try {
            Bundle bundleExtra = intent.getBundleExtra("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo");
            bundleExtra.setClassLoader(AdOverlayInfoParcel.class.getClassLoader());
            return (AdOverlayInfoParcel) bundleExtra.getParcelable("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo");
        } catch (Exception unused) {
            return null;
        }
    }

    public AdOverlayInfoParcel(bqf bqf, zzn zzn, zzt zzt, afl afl, int i, zzbbi zzbbi, String str, zzaq zzaq) {
        this.zzdrs = null;
        this.zzdrt = bqf;
        this.zzdru = zzn;
        this.zzdrv = afl;
        this.zzdsd = null;
        this.zzdrw = null;
        this.zzbde = null;
        this.zzdrx = false;
        this.zzdry = null;
        this.zzdrz = zzt;
        this.orientation = i;
        this.zzdsa = 1;
        this.url = null;
        this.zzbsp = zzbbi;
        this.zzdsb = str;
        this.zzdsc = zzaq;
    }

    public AdOverlayInfoParcel(bqf bqf, zzn zzn, zzt zzt, afl afl, boolean z, int i, zzbbi zzbbi) {
        this.zzdrs = null;
        this.zzdrt = bqf;
        this.zzdru = zzn;
        this.zzdrv = afl;
        this.zzdsd = null;
        this.zzdrw = null;
        this.zzbde = null;
        this.zzdrx = z;
        this.zzdry = null;
        this.zzdrz = zzt;
        this.orientation = i;
        this.zzdsa = 2;
        this.url = null;
        this.zzbsp = zzbbi;
        this.zzdsb = null;
        this.zzdsc = null;
    }

    public AdOverlayInfoParcel(bqf bqf, zzn zzn, zzb zzb, zzd zzd, zzt zzt, afl afl, boolean z, int i, String str, zzbbi zzbbi) {
        this.zzdrs = null;
        this.zzdrt = bqf;
        this.zzdru = zzn;
        this.zzdrv = afl;
        this.zzdsd = zzb;
        this.zzdrw = zzd;
        this.zzbde = null;
        this.zzdrx = z;
        this.zzdry = null;
        this.zzdrz = zzt;
        this.orientation = i;
        this.zzdsa = 3;
        this.url = str;
        this.zzbsp = zzbbi;
        this.zzdsb = null;
        this.zzdsc = null;
    }

    public AdOverlayInfoParcel(bqf bqf, zzn zzn, zzb zzb, zzd zzd, zzt zzt, afl afl, boolean z, int i, String str, String str2, zzbbi zzbbi) {
        this.zzdrs = null;
        this.zzdrt = bqf;
        this.zzdru = zzn;
        this.zzdrv = afl;
        this.zzdsd = zzb;
        this.zzdrw = zzd;
        this.zzbde = str2;
        this.zzdrx = z;
        this.zzdry = str;
        this.zzdrz = zzt;
        this.orientation = i;
        this.zzdsa = 3;
        this.url = null;
        this.zzbsp = zzbbi;
        this.zzdsb = null;
        this.zzdsc = null;
    }

    public AdOverlayInfoParcel(zzc zzc, bqf bqf, zzn zzn, zzt zzt, zzbbi zzbbi) {
        this.zzdrs = zzc;
        this.zzdrt = bqf;
        this.zzdru = zzn;
        this.zzdrv = null;
        this.zzdsd = null;
        this.zzdrw = null;
        this.zzbde = null;
        this.zzdrx = false;
        this.zzdry = null;
        this.zzdrz = zzt;
        this.orientation = -1;
        this.zzdsa = 4;
        this.url = null;
        this.zzbsp = zzbbi;
        this.zzdsb = null;
        this.zzdsc = null;
    }

    AdOverlayInfoParcel(zzc zzc, IBinder iBinder, IBinder iBinder2, IBinder iBinder3, IBinder iBinder4, String str, boolean z, String str2, IBinder iBinder5, int i, int i2, String str3, zzbbi zzbbi, String str4, zzaq zzaq, IBinder iBinder6) {
        this.zzdrs = zzc;
        this.zzdrt = (bqf) C0722b.m770a(C0719a.C0720a.m768a(iBinder));
        this.zzdru = (zzn) C0722b.m770a(C0719a.C0720a.m768a(iBinder2));
        this.zzdrv = (afl) C0722b.m770a(C0719a.C0720a.m768a(iBinder3));
        this.zzdsd = (zzb) C0722b.m770a(C0719a.C0720a.m768a(iBinder6));
        this.zzdrw = (zzd) C0722b.m770a(C0719a.C0720a.m768a(iBinder4));
        this.zzbde = str;
        this.zzdrx = z;
        this.zzdry = str2;
        this.zzdrz = (zzt) C0722b.m770a(C0719a.C0720a.m768a(iBinder5));
        this.orientation = i;
        this.zzdsa = i2;
        this.url = str3;
        this.zzbsp = zzbbi;
        this.zzdsb = str4;
        this.zzdsc = zzaq;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C0932b.m1364a(parcel);
        C0932b.m1372a(parcel, 2, (Parcelable) this.zzdrs, i, false);
        C0932b.m1370a(parcel, 3, C0722b.m769a(this.zzdrt).asBinder(), false);
        C0932b.m1370a(parcel, 4, C0722b.m769a(this.zzdru).asBinder(), false);
        C0932b.m1370a(parcel, 5, C0722b.m769a(this.zzdrv).asBinder(), false);
        C0932b.m1370a(parcel, 6, C0722b.m769a(this.zzdrw).asBinder(), false);
        C0932b.m1377a(parcel, 7, this.zzbde, false);
        C0932b.m1379a(parcel, 8, this.zzdrx);
        C0932b.m1377a(parcel, 9, this.zzdry, false);
        C0932b.m1370a(parcel, 10, C0722b.m769a(this.zzdrz).asBinder(), false);
        C0932b.m1367a(parcel, 11, this.orientation);
        C0932b.m1367a(parcel, 12, this.zzdsa);
        C0932b.m1377a(parcel, 13, this.url, false);
        C0932b.m1372a(parcel, 14, (Parcelable) this.zzbsp, i, false);
        C0932b.m1377a(parcel, 16, this.zzdsb, false);
        C0932b.m1372a(parcel, 17, (Parcelable) this.zzdsc, i, false);
        C0932b.m1370a(parcel, 18, C0722b.m769a(this.zzdsd).asBinder(), false);
        C0932b.m1365a(parcel, a);
    }
}
