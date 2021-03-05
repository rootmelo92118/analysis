package com.google.android.gms.common.data;

import android.database.CursorWindow;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.internal.C0926p;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C0932b;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.HashMap;

@KeepName
public final class DataHolder extends AbstractSafeParcelable implements Closeable {
    public static final Parcelable.Creator<DataHolder> CREATOR = new C0855c();

    /* renamed from: k */
    private static final C0852a f955k = new C0854b(new String[0], (String) null);

    /* renamed from: a */
    private final int f956a;

    /* renamed from: b */
    private final String[] f957b;

    /* renamed from: c */
    private Bundle f958c;

    /* renamed from: d */
    private final CursorWindow[] f959d;

    /* renamed from: e */
    private final int f960e;

    /* renamed from: f */
    private final Bundle f961f;

    /* renamed from: g */
    private int[] f962g;

    /* renamed from: h */
    private int f963h;

    /* renamed from: i */
    private boolean f964i = false;

    /* renamed from: j */
    private boolean f965j = true;

    DataHolder(int i, String[] strArr, CursorWindow[] cursorWindowArr, int i2, Bundle bundle) {
        this.f956a = i;
        this.f957b = strArr;
        this.f959d = cursorWindowArr;
        this.f960e = i2;
        this.f961f = bundle;
    }

    /* renamed from: a */
    public final void mo9731a() {
        this.f958c = new Bundle();
        for (int i = 0; i < this.f957b.length; i++) {
            this.f958c.putInt(this.f957b[i], i);
        }
        this.f962g = new int[this.f959d.length];
        int i2 = 0;
        for (int i3 = 0; i3 < this.f959d.length; i3++) {
            this.f962g[i3] = i2;
            i2 += this.f959d[i3].getNumRows() - (i2 - this.f959d[i3].getStartPosition());
        }
        this.f963h = i2;
    }

    /* renamed from: com.google.android.gms.common.data.DataHolder$a */
    public static class C0852a {

        /* renamed from: a */
        private final String[] f966a;

        /* renamed from: b */
        private final ArrayList<HashMap<String, Object>> f967b;

        /* renamed from: c */
        private final String f968c;

        /* renamed from: d */
        private final HashMap<Object, Integer> f969d;

        /* renamed from: e */
        private boolean f970e;

        /* renamed from: f */
        private String f971f;

        private C0852a(String[] strArr, String str) {
            this.f966a = (String[]) C0926p.m1306a(strArr);
            this.f967b = new ArrayList<>();
            this.f968c = str;
            this.f969d = new HashMap<>();
            this.f970e = false;
            this.f971f = null;
        }

        /* synthetic */ C0852a(String[] strArr, String str, C0854b bVar) {
            this(strArr, (String) null);
        }
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C0932b.m1364a(parcel);
        C0932b.m1382a(parcel, 1, this.f957b, false);
        C0932b.m1381a(parcel, 2, (T[]) this.f959d, i, false);
        C0932b.m1367a(parcel, 3, mo9732b());
        C0932b.m1369a(parcel, 4, mo9733c(), false);
        C0932b.m1367a(parcel, 1000, this.f956a);
        C0932b.m1365a(parcel, a);
        if ((i & 1) != 0) {
            close();
        }
    }

    /* renamed from: b */
    public final int mo9732b() {
        return this.f960e;
    }

    /* renamed from: c */
    public final Bundle mo9733c() {
        return this.f961f;
    }

    /* renamed from: d */
    public final boolean mo9735d() {
        boolean z;
        synchronized (this) {
            z = this.f964i;
        }
        return z;
    }

    public final void close() {
        synchronized (this) {
            if (!this.f964i) {
                this.f964i = true;
                for (CursorWindow close : this.f959d) {
                    close.close();
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void finalize() {
        try {
            if (this.f965j && this.f959d.length > 0 && !mo9735d()) {
                close();
                String obj = toString();
                StringBuilder sb = new StringBuilder(String.valueOf(obj).length() + 178);
                sb.append("Internal data leak within a DataBuffer object detected!  Be sure to explicitly call release() on all DataBuffer extending objects when you are done with them. (internal object: ");
                sb.append(obj);
                sb.append(")");
                Log.e("DataBuffer", sb.toString());
            }
        } finally {
            super.finalize();
        }
    }
}
