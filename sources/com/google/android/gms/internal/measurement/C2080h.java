package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.p039a.C0719a;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.h */
public final class C2080h extends C1923bp implements C2026f {
    C2080h(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
    }

    /* renamed from: a */
    public final void mo13863a(C0719a aVar, zzdy zzdy, long j) {
        Parcel b = mo13540b();
        C1931bx.m9001a(b, (IInterface) aVar);
        C1931bx.m9002a(b, (Parcelable) zzdy);
        b.writeLong(j);
        mo13541b(1, b);
    }

    /* renamed from: a */
    public final void mo13873a(String str, String str2, Bundle bundle, boolean z, boolean z2, long j) {
        Parcel b = mo13540b();
        b.writeString(str);
        b.writeString(str2);
        C1931bx.m9002a(b, (Parcelable) bundle);
        C1931bx.m9003a(b, z);
        C1931bx.m9003a(b, z2);
        b.writeLong(j);
        mo13541b(2, b);
    }

    /* renamed from: a */
    public final void mo13872a(String str, String str2, Bundle bundle, C2111i iVar, long j) {
        Parcel b = mo13540b();
        b.writeString(str);
        b.writeString(str2);
        C1931bx.m9002a(b, (Parcelable) bundle);
        C1931bx.m9001a(b, (IInterface) iVar);
        b.writeLong(j);
        mo13541b(3, b);
    }

    /* renamed from: a */
    public final void mo13874a(String str, String str2, C0719a aVar, boolean z, long j) {
        Parcel b = mo13540b();
        b.writeString(str);
        b.writeString(str2);
        C1931bx.m9001a(b, (IInterface) aVar);
        C1931bx.m9003a(b, z);
        b.writeLong(j);
        mo13541b(4, b);
    }

    /* renamed from: a */
    public final void mo13876a(String str, String str2, boolean z, C2111i iVar) {
        Parcel b = mo13540b();
        b.writeString(str);
        b.writeString(str2);
        C1931bx.m9003a(b, z);
        C1931bx.m9001a(b, (IInterface) iVar);
        mo13541b(5, b);
    }

    /* renamed from: a */
    public final void mo13870a(String str, C2111i iVar) {
        Parcel b = mo13540b();
        b.writeString(str);
        C1931bx.m9001a(b, (IInterface) iVar);
        mo13541b(6, b);
    }

    /* renamed from: a */
    public final void mo13869a(String str, long j) {
        Parcel b = mo13540b();
        b.writeString(str);
        b.writeLong(j);
        mo13541b(7, b);
    }

    /* renamed from: a */
    public final void mo13858a(Bundle bundle, long j) {
        Parcel b = mo13540b();
        C1931bx.m9002a(b, (Parcelable) bundle);
        b.writeLong(j);
        mo13541b(8, b);
    }

    /* renamed from: a */
    public final void mo13871a(String str, String str2, Bundle bundle) {
        Parcel b = mo13540b();
        b.writeString(str);
        b.writeString(str2);
        C1931bx.m9002a(b, (Parcelable) bundle);
        mo13541b(9, b);
    }

    /* renamed from: a */
    public final void mo13875a(String str, String str2, C2111i iVar) {
        Parcel b = mo13540b();
        b.writeString(str);
        b.writeString(str2);
        C1931bx.m9001a(b, (IInterface) iVar);
        mo13541b(10, b);
    }

    /* renamed from: a */
    public final void mo13878a(boolean z, long j) {
        Parcel b = mo13540b();
        C1931bx.m9003a(b, z);
        b.writeLong(j);
        mo13541b(11, b);
    }

    /* renamed from: a */
    public final void mo13857a(long j) {
        Parcel b = mo13540b();
        b.writeLong(j);
        mo13541b(12, b);
    }

    /* renamed from: b */
    public final void mo13879b(long j) {
        Parcel b = mo13540b();
        b.writeLong(j);
        mo13541b(13, b);
    }

    /* renamed from: c */
    public final void mo13884c(long j) {
        Parcel b = mo13540b();
        b.writeLong(j);
        mo13541b(14, b);
    }

    /* renamed from: a */
    public final void mo13864a(C0719a aVar, String str, String str2, long j) {
        Parcel b = mo13540b();
        C1931bx.m9001a(b, (IInterface) aVar);
        b.writeString(str);
        b.writeString(str2);
        b.writeLong(j);
        mo13541b(15, b);
    }

    /* renamed from: a */
    public final void mo13865a(C2111i iVar) {
        Parcel b = mo13540b();
        C1931bx.m9001a(b, (IInterface) iVar);
        mo13541b(16, b);
    }

    /* renamed from: b */
    public final void mo13881b(C2111i iVar) {
        Parcel b = mo13540b();
        C1931bx.m9001a(b, (IInterface) iVar);
        mo13541b(17, b);
    }

    /* renamed from: a */
    public final void mo13868a(C2125o oVar) {
        Parcel b = mo13540b();
        C1931bx.m9001a(b, (IInterface) oVar);
        mo13541b(18, b);
    }

    /* renamed from: c */
    public final void mo13886c(C2111i iVar) {
        Parcel b = mo13540b();
        C1931bx.m9001a(b, (IInterface) iVar);
        mo13541b(19, b);
    }

    /* renamed from: d */
    public final void mo13890d(C2111i iVar) {
        Parcel b = mo13540b();
        C1931bx.m9001a(b, (IInterface) iVar);
        mo13541b(20, b);
    }

    /* renamed from: e */
    public final void mo13892e(C2111i iVar) {
        Parcel b = mo13540b();
        C1931bx.m9001a(b, (IInterface) iVar);
        mo13541b(21, b);
    }

    /* renamed from: f */
    public final void mo13893f(C2111i iVar) {
        Parcel b = mo13540b();
        C1931bx.m9001a(b, (IInterface) iVar);
        mo13541b(22, b);
    }

    /* renamed from: b */
    public final void mo13883b(String str, long j) {
        Parcel b = mo13540b();
        b.writeString(str);
        b.writeLong(j);
        mo13541b(23, b);
    }

    /* renamed from: c */
    public final void mo13888c(String str, long j) {
        Parcel b = mo13540b();
        b.writeString(str);
        b.writeLong(j);
        mo13541b(24, b);
    }

    /* renamed from: a */
    public final void mo13860a(C0719a aVar, long j) {
        Parcel b = mo13540b();
        C1931bx.m9001a(b, (IInterface) aVar);
        b.writeLong(j);
        mo13541b(25, b);
    }

    /* renamed from: b */
    public final void mo13880b(C0719a aVar, long j) {
        Parcel b = mo13540b();
        C1931bx.m9001a(b, (IInterface) aVar);
        b.writeLong(j);
        mo13541b(26, b);
    }

    /* renamed from: a */
    public final void mo13861a(C0719a aVar, Bundle bundle, long j) {
        Parcel b = mo13540b();
        C1931bx.m9001a(b, (IInterface) aVar);
        C1931bx.m9002a(b, (Parcelable) bundle);
        b.writeLong(j);
        mo13541b(27, b);
    }

    /* renamed from: c */
    public final void mo13885c(C0719a aVar, long j) {
        Parcel b = mo13540b();
        C1931bx.m9001a(b, (IInterface) aVar);
        b.writeLong(j);
        mo13541b(28, b);
    }

    /* renamed from: d */
    public final void mo13889d(C0719a aVar, long j) {
        Parcel b = mo13540b();
        C1931bx.m9001a(b, (IInterface) aVar);
        b.writeLong(j);
        mo13541b(29, b);
    }

    /* renamed from: e */
    public final void mo13891e(C0719a aVar, long j) {
        Parcel b = mo13540b();
        C1931bx.m9001a(b, (IInterface) aVar);
        b.writeLong(j);
        mo13541b(30, b);
    }

    /* renamed from: a */
    public final void mo13862a(C0719a aVar, C2111i iVar, long j) {
        Parcel b = mo13540b();
        C1931bx.m9001a(b, (IInterface) aVar);
        C1931bx.m9001a(b, (IInterface) iVar);
        b.writeLong(j);
        mo13541b(31, b);
    }

    /* renamed from: a */
    public final void mo13859a(Bundle bundle, C2111i iVar, long j) {
        Parcel b = mo13540b();
        C1931bx.m9002a(b, (Parcelable) bundle);
        C1931bx.m9001a(b, (IInterface) iVar);
        b.writeLong(j);
        mo13541b(32, b);
    }

    /* renamed from: a */
    public final void mo13856a(int i, String str, C0719a aVar, C0719a aVar2, C0719a aVar3) {
        Parcel b = mo13540b();
        b.writeInt(i);
        b.writeString(str);
        C1931bx.m9001a(b, (IInterface) aVar);
        C1931bx.m9001a(b, (IInterface) aVar2);
        C1931bx.m9001a(b, (IInterface) aVar3);
        mo13541b(33, b);
    }

    /* renamed from: a */
    public final void mo13867a(C2122l lVar) {
        Parcel b = mo13540b();
        C1931bx.m9001a(b, (IInterface) lVar);
        mo13541b(34, b);
    }

    /* renamed from: b */
    public final void mo13882b(C2122l lVar) {
        Parcel b = mo13540b();
        C1931bx.m9001a(b, (IInterface) lVar);
        mo13541b(35, b);
    }

    /* renamed from: c */
    public final void mo13887c(C2122l lVar) {
        Parcel b = mo13540b();
        C1931bx.m9001a(b, (IInterface) lVar);
        mo13541b(36, b);
    }

    /* renamed from: a */
    public final void mo13877a(Map map) {
        Parcel b = mo13540b();
        b.writeMap(map);
        mo13541b(37, b);
    }

    /* renamed from: a */
    public final void mo13866a(C2111i iVar, int i) {
        Parcel b = mo13540b();
        C1931bx.m9001a(b, (IInterface) iVar);
        b.writeInt(i);
        mo13541b(38, b);
    }
}
