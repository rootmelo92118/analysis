package com.google.android.gms.ads.doubleclick;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.mediation.MediationAdapter;
import com.google.android.gms.ads.mediation.NetworkExtras;
import com.google.android.gms.ads.mediation.customevent.CustomEvent;
import com.google.android.gms.common.internal.C0926p;
import com.google.android.gms.internal.ads.bti;
import com.google.android.gms.internal.ads.btj;
import java.util.Date;
import java.util.List;
import java.util.Set;

public final class PublisherAdRequest {
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
    public static final int TAG_FOR_UNDER_AGE_OF_CONSENT_FALSE = 0;
    public static final int TAG_FOR_UNDER_AGE_OF_CONSENT_TRUE = 1;
    public static final int TAG_FOR_UNDER_AGE_OF_CONSENT_UNSPECIFIED = -1;
    private final bti zzvq;

    private PublisherAdRequest(Builder builder) {
        this.zzvq = new bti(builder.zzvr);
    }

    public static void updateCorrelator() {
    }

    public static final class Builder {
        /* access modifiers changed from: private */
        public final btj zzvr = new btj();

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

        public final PublisherAdRequest build() {
            return new PublisherAdRequest(this);
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

        @Deprecated
        public final Builder setManualImpressionsEnabled(boolean z) {
            this.zzvr.mo12385a(z);
            return this;
        }

        public final Builder setPublisherProvidedId(String str) {
            this.zzvr.mo12393e(str);
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

        public final Builder addCustomTargeting(String str, String str2) {
            this.zzvr.mo12383a(str, str2);
            return this;
        }

        public final Builder addCustomTargeting(String str, List<String> list) {
            if (list != null) {
                this.zzvr.mo12383a(str, TextUtils.join(",", list));
            }
            return this;
        }

        public final Builder addCategoryExclusion(String str) {
            this.zzvr.mo12395g(str);
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

    public final boolean getManualImpressionsEnabled() {
        return this.zzvq.mo12366f();
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

    public final String getPublisherProvidedId() {
        return this.zzvq.mo12367g();
    }

    public final boolean isTestDevice(Context context) {
        return this.zzvq.mo12359a(context);
    }

    public final Bundle getCustomTargeting() {
        return this.zzvq.mo12373m();
    }

    public final bti zzaz() {
        return this.zzvq;
    }
}
