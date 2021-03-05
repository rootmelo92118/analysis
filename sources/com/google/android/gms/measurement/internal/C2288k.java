package com.google.android.gms.measurement.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.measurement.C1923bp;
import com.google.android.gms.internal.measurement.C1931bx;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.measurement.internal.k */
public final class C2288k extends C1923bp implements C2286i {
    C2288k(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.internal.IMeasurementService");
    }

    /* renamed from: a */
    public final void mo14344a(zzag zzag, zzk zzk) {
        Parcel b = mo13540b();
        C1931bx.m9002a(b, (Parcelable) zzag);
        C1931bx.m9002a(b, (Parcelable) zzk);
        mo13541b(1, b);
    }

    /* renamed from: a */
    public final void mo14346a(zzfv zzfv, zzk zzk) {
        Parcel b = mo13540b();
        C1931bx.m9002a(b, (Parcelable) zzfv);
        C1931bx.m9002a(b, (Parcelable) zzk);
        mo13541b(2, b);
    }

    /* renamed from: a */
    public final void mo14347a(zzk zzk) {
        Parcel b = mo13540b();
        C1931bx.m9002a(b, (Parcelable) zzk);
        mo13541b(4, b);
    }

    /* renamed from: a */
    public final void mo14345a(zzag zzag, String str, String str2) {
        Parcel b = mo13540b();
        C1931bx.m9002a(b, (Parcelable) zzag);
        b.writeString(str);
        b.writeString(str2);
        mo13541b(5, b);
    }

    /* renamed from: b */
    public final void mo14352b(zzk zzk) {
        Parcel b = mo13540b();
        C1931bx.m9002a(b, (Parcelable) zzk);
        mo13541b(6, b);
    }

    /* renamed from: a */
    public final List<zzfv> mo14338a(zzk zzk, boolean z) {
        Parcel b = mo13540b();
        C1931bx.m9002a(b, (Parcelable) zzk);
        C1931bx.m9003a(b, z);
        Parcel a = mo13538a(7, b);
        ArrayList<zzfv> createTypedArrayList = a.createTypedArrayList(zzfv.CREATOR);
        a.recycle();
        return createTypedArrayList;
    }

    /* renamed from: a */
    public final byte[] mo14350a(zzag zzag, String str) {
        Parcel b = mo13540b();
        C1931bx.m9002a(b, (Parcelable) zzag);
        b.writeString(str);
        Parcel a = mo13538a(9, b);
        byte[] createByteArray = a.createByteArray();
        a.recycle();
        return createByteArray;
    }

    /* renamed from: a */
    public final void mo14343a(long j, String str, String str2, String str3) {
        Parcel b = mo13540b();
        b.writeLong(j);
        b.writeString(str);
        b.writeString(str2);
        b.writeString(str3);
        mo13541b(10, b);
    }

    /* renamed from: c */
    public final String mo14353c(zzk zzk) {
        Parcel b = mo13540b();
        C1931bx.m9002a(b, (Parcelable) zzk);
        Parcel a = mo13538a(11, b);
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    /* renamed from: a */
    public final void mo14349a(zzo zzo, zzk zzk) {
        Parcel b = mo13540b();
        C1931bx.m9002a(b, (Parcelable) zzo);
        C1931bx.m9002a(b, (Parcelable) zzk);
        mo13541b(12, b);
    }

    /* renamed from: a */
    public final void mo14348a(zzo zzo) {
        Parcel b = mo13540b();
        C1931bx.m9002a(b, (Parcelable) zzo);
        mo13541b(13, b);
    }

    /* renamed from: a */
    public final List<zzfv> mo14342a(String str, String str2, boolean z, zzk zzk) {
        Parcel b = mo13540b();
        b.writeString(str);
        b.writeString(str2);
        C1931bx.m9003a(b, z);
        C1931bx.m9002a(b, (Parcelable) zzk);
        Parcel a = mo13538a(14, b);
        ArrayList<zzfv> createTypedArrayList = a.createTypedArrayList(zzfv.CREATOR);
        a.recycle();
        return createTypedArrayList;
    }

    /* renamed from: a */
    public final List<zzfv> mo14341a(String str, String str2, String str3, boolean z) {
        Parcel b = mo13540b();
        b.writeString(str);
        b.writeString(str2);
        b.writeString(str3);
        C1931bx.m9003a(b, z);
        Parcel a = mo13538a(15, b);
        ArrayList<zzfv> createTypedArrayList = a.createTypedArrayList(zzfv.CREATOR);
        a.recycle();
        return createTypedArrayList;
    }

    /* renamed from: a */
    public final List<zzo> mo14339a(String str, String str2, zzk zzk) {
        Parcel b = mo13540b();
        b.writeString(str);
        b.writeString(str2);
        C1931bx.m9002a(b, (Parcelable) zzk);
        Parcel a = mo13538a(16, b);
        ArrayList<zzo> createTypedArrayList = a.createTypedArrayList(zzo.CREATOR);
        a.recycle();
        return createTypedArrayList;
    }

    /* renamed from: a */
    public final List<zzo> mo14340a(String str, String str2, String str3) {
        Parcel b = mo13540b();
        b.writeString(str);
        b.writeString(str2);
        b.writeString(str3);
        Parcel a = mo13538a(17, b);
        ArrayList<zzo> createTypedArrayList = a.createTypedArrayList(zzo.CREATOR);
        a.recycle();
        return createTypedArrayList;
    }

    /* renamed from: d */
    public final void mo14354d(zzk zzk) {
        Parcel b = mo13540b();
        C1931bx.m9002a(b, (Parcelable) zzk);
        mo13541b(18, b);
    }
}
