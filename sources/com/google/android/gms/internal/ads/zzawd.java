package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.google.android.gms.ads.reward.RewardItem;
import com.google.android.gms.common.internal.C0924o;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C0932b;
import org.json.JSONArray;
import org.json.JSONException;

@C1598qn
public final class zzawd extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzawd> CREATOR = new C1724ve();

    /* renamed from: a */
    public final String f7125a;

    /* renamed from: b */
    public final int f7126b;

    public zzawd(RewardItem rewardItem) {
        this(rewardItem.getType(), rewardItem.getAmount());
    }

    public zzawd(String str, int i) {
        this.f7125a = str;
        this.f7126b = i;
    }

    @Nullable
    /* renamed from: a */
    public static zzawd m8616a(JSONArray jSONArray) {
        if (jSONArray == null || jSONArray.length() == 0) {
            return null;
        }
        return new zzawd(jSONArray.getJSONObject(0).optString("rb_type"), jSONArray.getJSONObject(0).optInt("rb_amount"));
    }

    @Nullable
    /* renamed from: a */
    public static zzawd m8615a(@Nullable String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return m8616a(new JSONArray(str));
        } catch (JSONException unused) {
            return null;
        }
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C0932b.m1364a(parcel);
        C0932b.m1377a(parcel, 2, this.f7125a, false);
        C0932b.m1367a(parcel, 3, this.f7126b);
        C0932b.m1365a(parcel, a);
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof zzawd)) {
            return false;
        }
        zzawd zzawd = (zzawd) obj;
        if (!C0924o.m1303a(this.f7125a, zzawd.f7125a) || !C0924o.m1303a(Integer.valueOf(this.f7126b), Integer.valueOf(zzawd.f7126b))) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C0924o.m1301a(this.f7125a, Integer.valueOf(this.f7126b));
    }
}
