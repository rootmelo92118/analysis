package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C0932b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@C1598qn
@ParametersAreNonnullByDefault
public final class zzaso extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzaso> CREATOR = new C1628rq();

    /* renamed from: a */
    public final boolean f7108a;
    @Nullable

    /* renamed from: b */
    public final List<String> f7109b;

    public zzaso() {
        this(false, Collections.emptyList());
    }

    public zzaso(boolean z, List<String> list) {
        this.f7108a = z;
        this.f7109b = list;
    }

    @Nullable
    /* renamed from: a */
    public static zzaso m8611a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return new zzaso();
        }
        JSONArray optJSONArray = jSONObject.optJSONArray("reporting_urls");
        ArrayList arrayList = new ArrayList();
        if (optJSONArray != null) {
            for (int i = 0; i < optJSONArray.length(); i++) {
                try {
                    arrayList.add(optJSONArray.getString(i));
                } catch (JSONException e) {
                    C1772wz.m1627c("Error grabbing url from json.", e);
                }
            }
        }
        return new zzaso(jSONObject.optBoolean("enable_protection"), arrayList);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C0932b.m1364a(parcel);
        C0932b.m1379a(parcel, 2, this.f7108a);
        C0932b.m1386b(parcel, 3, this.f7109b, false);
        C0932b.m1365a(parcel, a);
    }
}
