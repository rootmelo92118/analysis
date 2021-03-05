package com.google.android.gms.common.data;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C0932b;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;

public class BitmapTeleporter extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<BitmapTeleporter> CREATOR = new C0853a();

    /* renamed from: a */
    private final int f949a;

    /* renamed from: b */
    private ParcelFileDescriptor f950b;

    /* renamed from: c */
    private final int f951c;

    /* renamed from: d */
    private Bitmap f952d = null;

    /* renamed from: e */
    private boolean f953e = false;

    /* renamed from: f */
    private File f954f;

    BitmapTeleporter(int i, ParcelFileDescriptor parcelFileDescriptor, int i2) {
        this.f949a = i;
        this.f950b = parcelFileDescriptor;
        this.f951c = i2;
    }

    public void writeToParcel(Parcel parcel, int i) {
        if (this.f950b == null) {
            Bitmap bitmap = this.f952d;
            ByteBuffer allocate = ByteBuffer.allocate(bitmap.getRowBytes() * bitmap.getHeight());
            bitmap.copyPixelsToBuffer(allocate);
            byte[] array = allocate.array();
            DataOutputStream dataOutputStream = new DataOutputStream(new BufferedOutputStream(m1137a()));
            try {
                dataOutputStream.writeInt(array.length);
                dataOutputStream.writeInt(bitmap.getWidth());
                dataOutputStream.writeInt(bitmap.getHeight());
                dataOutputStream.writeUTF(bitmap.getConfig().toString());
                dataOutputStream.write(array);
                m1138a(dataOutputStream);
            } catch (IOException e) {
                throw new IllegalStateException("Could not write into unlinked file", e);
            } catch (Throwable th) {
                m1138a(dataOutputStream);
                throw th;
            }
        }
        int a = C0932b.m1364a(parcel);
        C0932b.m1367a(parcel, 1, this.f949a);
        C0932b.m1372a(parcel, 2, (Parcelable) this.f950b, i | 1, false);
        C0932b.m1367a(parcel, 3, this.f951c);
        C0932b.m1365a(parcel, a);
        this.f950b = null;
    }

    /* renamed from: a */
    private final FileOutputStream m1137a() {
        if (this.f954f != null) {
            try {
                File createTempFile = File.createTempFile("teleporter", ".tmp", this.f954f);
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
                    this.f950b = ParcelFileDescriptor.open(createTempFile, 268435456);
                    createTempFile.delete();
                    return fileOutputStream;
                } catch (FileNotFoundException unused) {
                    throw new IllegalStateException("Temporary file is somehow already deleted");
                }
            } catch (IOException e) {
                throw new IllegalStateException("Could not create temporary file", e);
            }
        } else {
            throw new IllegalStateException("setTempDir() must be called before writing this object to a parcel");
        }
    }

    /* renamed from: a */
    private static void m1138a(Closeable closeable) {
        try {
            closeable.close();
        } catch (IOException e) {
            Log.w("BitmapTeleporter", "Could not close stream", e);
        }
    }
}
