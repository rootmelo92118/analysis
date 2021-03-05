package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.zzbv;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C0932b;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.C0975k;
import java.io.DataInputStream;
import java.io.IOException;

@C1598qn
public final class zzasy extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzasy> CREATOR = new C1640sb();

    /* renamed from: a */
    private ParcelFileDescriptor f7110a;

    /* renamed from: b */
    private Parcelable f7111b;

    /* renamed from: c */
    private boolean f7112c;

    public zzasy(ParcelFileDescriptor parcelFileDescriptor) {
        this.f7110a = parcelFileDescriptor;
        this.f7111b = null;
        this.f7112c = true;
    }

    public zzasy(SafeParcelable safeParcelable) {
        this.f7110a = null;
        this.f7111b = safeParcelable;
        this.f7112c = false;
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public final <T extends SafeParcelable> T mo13315a(Parcelable.Creator<T> creator) {
        if (this.f7112c) {
            if (this.f7110a == null) {
                C1772wz.m1626c("File descriptor is empty, returning null.");
                return null;
            }
            DataInputStream dataInputStream = new DataInputStream(new ParcelFileDescriptor.AutoCloseInputStream(this.f7110a));
            try {
                byte[] bArr = new byte[dataInputStream.readInt()];
                dataInputStream.readFully(bArr, 0, bArr.length);
                C0975k.m1495a(dataInputStream);
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.unmarshall(bArr, 0, bArr.length);
                    obtain.setDataPosition(0);
                    this.f7111b = (SafeParcelable) creator.createFromParcel(obtain);
                    obtain.recycle();
                    this.f7112c = false;
                } catch (Throwable th) {
                    obtain.recycle();
                    throw th;
                }
            } catch (IOException e) {
                C1772wz.m1625b("Could not read from parcel file descriptor", e);
                C0975k.m1495a(dataInputStream);
                return null;
            } catch (Throwable th2) {
                C0975k.m1495a(dataInputStream);
                throw th2;
            }
        }
        return (SafeParcelable) this.f7111b;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        m8612a();
        int a = C0932b.m1364a(parcel);
        C0932b.m1372a(parcel, 2, (Parcelable) this.f7110a, i, false);
        C0932b.m1365a(parcel, a);
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    private final ParcelFileDescriptor m8612a() {
        if (this.f7110a == null) {
            Parcel obtain = Parcel.obtain();
            try {
                this.f7111b.writeToParcel(obtain, 0);
                byte[] marshall = obtain.marshall();
                obtain.recycle();
                this.f7110a = m8613a(marshall);
            } catch (Throwable th) {
                obtain.recycle();
                throw th;
            }
        }
        return this.f7110a;
    }

    /* renamed from: a */
    private final <T> ParcelFileDescriptor m8613a(byte[] bArr) {
        ParcelFileDescriptor.AutoCloseOutputStream autoCloseOutputStream;
        try {
            ParcelFileDescriptor[] createPipe = ParcelFileDescriptor.createPipe();
            autoCloseOutputStream = new ParcelFileDescriptor.AutoCloseOutputStream(createPipe[1]);
            try {
                new Thread(new C1637rz(this, autoCloseOutputStream, bArr)).start();
                return createPipe[0];
            } catch (IOException e) {
                e = e;
                C1772wz.m1625b("Error transporting the ad response", e);
                zzbv.zzlj().mo13119a((Throwable) e, "LargeParcelTeleporter.pipeData.2");
                C0975k.m1495a(autoCloseOutputStream);
                return null;
            }
        } catch (IOException e2) {
            e = e2;
            autoCloseOutputStream = null;
            C1772wz.m1625b("Error transporting the ad response", e);
            zzbv.zzlj().mo13119a((Throwable) e, "LargeParcelTeleporter.pipeData.2");
            C0975k.m1495a(autoCloseOutputStream);
            return null;
        }
    }
}
