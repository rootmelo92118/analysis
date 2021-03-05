package com.google.android.gms.ads.formats;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.Nullable;
import com.google.android.gms.ads.doubleclick.AppEventListener;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C0932b;
import com.google.android.gms.internal.ads.C1598qn;
import com.google.android.gms.internal.ads.bqr;
import com.google.android.gms.internal.ads.bse;
import com.google.android.gms.internal.ads.bsf;

@C1598qn
public final class PublisherAdViewOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator<PublisherAdViewOptions> CREATOR = new zzc();
    private final boolean zzbli;
    @Nullable
    private final bse zzblj;
    @Nullable
    private AppEventListener zzblk;

    private PublisherAdViewOptions(Builder builder) {
        this.zzbli = builder.zzbli;
        this.zzblk = builder.zzblk;
        this.zzblj = this.zzblk != null ? new bqr(this.zzblk) : null;
    }

    public static final class Builder {
        /* access modifiers changed from: private */
        public boolean zzbli = false;
        /* access modifiers changed from: private */
        public AppEventListener zzblk;

        public final Builder setManualImpressionsEnabled(boolean z) {
            this.zzbli = z;
            return this;
        }

        public final Builder setAppEventListener(AppEventListener appEventListener) {
            this.zzblk = appEventListener;
            return this;
        }

        public final PublisherAdViewOptions build() {
            return new PublisherAdViewOptions(this);
        }
    }

    PublisherAdViewOptions(boolean z, @Nullable IBinder iBinder) {
        this.zzbli = z;
        this.zzblj = iBinder != null ? bsf.m6354a(iBinder) : null;
    }

    @Nullable
    public final AppEventListener getAppEventListener() {
        return this.zzblk;
    }

    public final boolean getManualImpressionsEnabled() {
        return this.zzbli;
    }

    @Nullable
    public final bse zzib() {
        return this.zzblj;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C0932b.m1364a(parcel);
        C0932b.m1379a(parcel, 1, getManualImpressionsEnabled());
        C0932b.m1370a(parcel, 2, this.zzblj == null ? null : this.zzblj.asBinder(), false);
        C0932b.m1365a(parcel, a);
    }
}
