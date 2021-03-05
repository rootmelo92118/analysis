package com.google.android.gms.ads;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.mediation.MediationAdapter;
import com.google.android.gms.ads.mediation.NetworkExtras;
import com.google.android.gms.ads.mediation.customevent.CustomEvent;
import com.google.android.gms.common.internal.C0926p;
import com.google.android.gms.internal.ads.bti;
import com.google.android.gms.internal.ads.btj;
import java.util.Date;
import java.util.Set;

public final class AdRequest {
    public static final String DEVICE_ID_EMULATOR = "B3EEABB8EE11C2BE770B684D95219ECB";
    public static final int ERROR_CODE_INTERNAL_ERROR = 0;
    public static final int ERROR_CODE_INVALID_REQUEST = 1;
    public static final int ERROR_CODE_NETWORK_ERROR = 2;
    public static final int ERROR_CODE_NO_FILL = 3;
    public static final int GENDER_FEMALE = 2;
    public static final int GENDER_MALE = 1;
    public static final int GENDER_UNKNOWN = 0;
    public static final String MAX_AD_CONTENT_RATING_G = "G";
    public static final String MAX_AD_CONTENT_RATING_MA = "MA";
    public static final String MAX_AD_CONTENT_RATING_PG = "PG";
    public static final String MAX_AD_CONTENT_RATING_T = "T";
    public static final int MAX_CONTENT_URL_LENGTH = 512;
    public static final int TAG_FOR_UNDER_AGE_OF_CONSENT_FALSE = 0;
    public static final int TAG_FOR_UNDER_AGE_OF_CONSENT_TRUE = 1;
    public static final int TAG_FOR_UNDER_AGE_OF_CONSENT_UNSPECIFIED = -1;
    private final bti zzvq;

    private AdRequest(Builder builder) {
        this.zzvq = new bti(builder.zzvr);
    }

    public static final class Builder {
        /* access modifiers changed from: private */
        public final btj zzvr = new btj();

        public Builder() {
            this.zzvr.mo12388b("B3EEABB8EE11C2BE770B684D95219ECB");
        }

        public final Builder addKeyword(String str) {
            this.zzvr.mo12382a(str);
            return this;
        }

        public final Builder addNetworkExtras(NetworkExtras networkExtras) {
            this.zzvr.mo12380a(networkExtras);
            return this;
        }

        public final Builder addNetworkExtrasBundle(Class<? extends MediationAdapter> cls, Bundle bundle) {
            this.zzvr.mo12381a(cls, bundle);
            if (cls.equals(AdMobAdapter.class) && bundle.getBoolean("_emulatorLiveAds")) {
                this.zzvr.mo12390c("B3EEABB8EE11C2BE770B684D95219ECB");
            }
            return this;
        }

        public final Builder addCustomEventExtrasBundle(Class<? extends CustomEvent> cls, Bundle bundle) {
            this.zzvr.mo12387b(cls, bundle);
            return this;
        }

        public final Builder addTestDevice(String str) {
            this.zzvr.mo12388b(str);
            return this;
        }

        public final AdRequest build() {
            return new AdRequest(this);
        }

        @Deprecated
        public final Builder setBirthday(Date date) {
            this.zzvr.mo12384a(date);
            return this;
        }

        public final Builder setContentUrl(String str) {
            C0926p.m1307a(str, (Object) "Content URL must be non-null.");
            C0926p.m1309a(str, (Object) "Content URL must be non-empty.");
            C0926p.m1318b(str.length() <= 512, "Content URL must not exceed %d in length.  Provided length was %d.", 512, Integer.valueOf(str.length()));
            this.zzvr.mo12392d(str);
            return this;
        }

        @Deprecated
        public final Builder setGender(int i) {
            this.zzvr.mo12378a(i);
            return this;
        }

        public final Builder setLocation(Location location) {
            this.zzvr.mo12379a(location);
            return this;
        }

        public final Builder setRequestAgent(String str) {
            this.zzvr.mo12394f(str);
            return this;
        }

        public final Builder tagForChildDirectedTreatment(boolean z) {
            this.zzvr.mo12389b(z);
            return this;
        }

        @Deprecated
        public final Builder setIsDesignedForFamilies(boolean z) {
            this.zzvr.mo12391c(z);
            return this;
        }

        public final Builder setTagForUnderAgeOfConsent(int i) {
            this.zzvr.mo12386b(i);
            return this;
        }

        public final Builder setMaxAdContentRating(String str) {
            this.zzvr.mo12396h(str);
            return this;
        }
    }

    @Deprecated
    public final Date getBirthday() {
        return this.zzvq.mo12358a();
    }

    public final String getContentUrl() {
        return this.zzvq.mo12361b();
    }

    @Deprecated
    public final int getGender() {
        return this.zzvq.mo12362c();
    }

    public final Set<String> getKeywords() {
        return this.zzvq.mo12364d();
    }

    public final Location getLocation() {
        return this.zzvq.mo12365e();
    }

    @Deprecated
    public final <T extends NetworkExtras> T getNetworkExtras(Class<T> cls) {
        return this.zzvq.mo12357a(cls);
    }

    public final <T extends MediationAdapter> Bundle getNetworkExtrasBundle(Class<T> cls) {
        return this.zzvq.mo12360b(cls);
    }

    public final <T extends CustomEvent> Bundle getCustomEventExtrasBundle(Class<T> cls) {
        return this.zzvq.mo12363c(cls);
    }

    public final boolean isTestDevice(Context context) {
        return this.zzvq.mo12359a(context);
    }

    public final bti zzaz() {
        return this.zzvq;
    }
}
