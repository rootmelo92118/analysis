package com.google.android.gms.measurement;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Keep;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresPermission;
import android.support.annotation.Size;
import android.support.annotation.WorkerThread;
import com.google.android.gms.common.internal.C0926p;
import com.google.android.gms.measurement.internal.C2166aw;
import com.google.android.gms.measurement.internal.C2196bz;
import com.google.android.gms.measurement.internal.C2211cn;
import com.google.android.gms.measurement.internal.C2290m;
import java.util.List;
import java.util.Map;

@Deprecated
public class AppMeasurement {

    /* renamed from: a */
    private final C2166aw f8021a;

    public static class ConditionalUserProperty {
        @Keep
        public boolean mActive;
        @Keep
        public String mAppId;
        @Keep
        public long mCreationTimestamp;
        @Keep
        public String mExpiredEventName;
        @Keep
        public Bundle mExpiredEventParams;
        @Keep
        public String mName;
        @Keep
        public String mOrigin;
        @Keep
        public long mTimeToLive;
        @Keep
        public String mTimedOutEventName;
        @Keep
        public Bundle mTimedOutEventParams;
        @Keep
        public String mTriggerEventName;
        @Keep
        public long mTriggerTimeout;
        @Keep
        public String mTriggeredEventName;
        @Keep
        public Bundle mTriggeredEventParams;
        @Keep
        public long mTriggeredTimestamp;
        @Keep
        public Object mValue;

        public ConditionalUserProperty() {
        }

        public ConditionalUserProperty(ConditionalUserProperty conditionalUserProperty) {
            C0926p.m1306a(conditionalUserProperty);
            this.mAppId = conditionalUserProperty.mAppId;
            this.mOrigin = conditionalUserProperty.mOrigin;
            this.mCreationTimestamp = conditionalUserProperty.mCreationTimestamp;
            this.mName = conditionalUserProperty.mName;
            if (conditionalUserProperty.mValue != null) {
                this.mValue = C2211cn.m10702a(conditionalUserProperty.mValue);
                if (this.mValue == null) {
                    this.mValue = conditionalUserProperty.mValue;
                }
            }
            this.mActive = conditionalUserProperty.mActive;
            this.mTriggerEventName = conditionalUserProperty.mTriggerEventName;
            this.mTriggerTimeout = conditionalUserProperty.mTriggerTimeout;
            this.mTimedOutEventName = conditionalUserProperty.mTimedOutEventName;
            if (conditionalUserProperty.mTimedOutEventParams != null) {
                this.mTimedOutEventParams = new Bundle(conditionalUserProperty.mTimedOutEventParams);
            }
            this.mTriggeredEventName = conditionalUserProperty.mTriggeredEventName;
            if (conditionalUserProperty.mTriggeredEventParams != null) {
                this.mTriggeredEventParams = new Bundle(conditionalUserProperty.mTriggeredEventParams);
            }
            this.mTriggeredTimestamp = conditionalUserProperty.mTriggeredTimestamp;
            this.mTimeToLive = conditionalUserProperty.mTimeToLive;
            this.mExpiredEventName = conditionalUserProperty.mExpiredEventName;
            if (conditionalUserProperty.mExpiredEventParams != null) {
                this.mExpiredEventParams = new Bundle(conditionalUserProperty.mExpiredEventParams);
            }
        }
    }

    public interface OnEventListener extends C2196bz {
        @WorkerThread
        void onEvent(String str, String str2, Bundle bundle, long j);
    }

    @Keep
    @RequiresPermission(allOf = {"android.permission.INTERNET", "android.permission.ACCESS_NETWORK_STATE", "android.permission.WAKE_LOCK"})
    @Deprecated
    public static AppMeasurement getInstance(Context context) {
        return C2166aw.m10527a(context, (C2290m) null).mo14324i();
    }

    /* renamed from: a */
    public final void mo14148a(boolean z) {
        this.f8021a.mo14323h().mo14401a(z);
    }

    public AppMeasurement(C2166aw awVar) {
        C0926p.m1306a(awVar);
        this.f8021a = awVar;
    }

    @Keep
    public void logEventInternal(String str, String str2, Bundle bundle) {
        this.f8021a.mo14323h().mo14395a(str, str2, bundle);
    }

    public void registerOnMeasurementEventListener(OnEventListener onEventListener) {
        this.f8021a.mo14323h().mo14392a((C2196bz) onEventListener);
    }

    public void unregisterOnMeasurementEventListener(OnEventListener onEventListener) {
        this.f8021a.mo14323h().mo14403b((C2196bz) onEventListener);
    }

    @Keep
    @Nullable
    public String getCurrentScreenName() {
        return this.f8021a.mo14323h().mo14409z();
    }

    @Keep
    @Nullable
    public String getCurrentScreenClass() {
        return this.f8021a.mo14323h().mo14385A();
    }

    @Keep
    @Nullable
    public String getAppInstanceId() {
        return this.f8021a.mo14323h().mo14407x();
    }

    @Keep
    @Nullable
    public String getGmpAppId() {
        return this.f8021a.mo14323h().mo14386B();
    }

    @Keep
    public long generateEventId() {
        return this.f8021a.mo14325j().mo14581g();
    }

    @Keep
    public void beginAdUnitExposure(@Size(min = 1) @NonNull String str) {
        this.f8021a.mo14305A().mo14217a(str, this.f8021a.mo14230m().mo9997b());
    }

    @Keep
    public void endAdUnitExposure(@Size(min = 1) @NonNull String str) {
        this.f8021a.mo14305A().mo14219b(str, this.f8021a.mo14230m().mo9997b());
    }

    @Keep
    public void setConditionalUserProperty(@NonNull ConditionalUserProperty conditionalUserProperty) {
        this.f8021a.mo14323h().mo14391a(conditionalUserProperty);
    }

    /* access modifiers changed from: protected */
    @Keep
    public void setConditionalUserPropertyAs(@NonNull ConditionalUserProperty conditionalUserProperty) {
        this.f8021a.mo14323h().mo14402b(conditionalUserProperty);
    }

    @Keep
    public void clearConditionalUserProperty(@Size(max = 24, min = 1) @NonNull String str, @Nullable String str2, @Nullable Bundle bundle) {
        this.f8021a.mo14323h().mo14405c(str, str2, bundle);
    }

    /* access modifiers changed from: protected */
    @Keep
    public void clearConditionalUserPropertyAs(@Size(min = 1) @NonNull String str, @Size(max = 24, min = 1) @NonNull String str2, @Nullable String str3, @Nullable Bundle bundle) {
        this.f8021a.mo14323h().mo14400a(str, str2, str3, bundle);
    }

    /* access modifiers changed from: protected */
    @Keep
    @WorkerThread
    public Map<String, Object> getUserProperties(@Nullable String str, @Nullable @Size(max = 24, min = 1) String str2, boolean z) {
        return this.f8021a.mo14323h().mo14390a(str, str2, z);
    }

    /* access modifiers changed from: protected */
    @Keep
    @WorkerThread
    public Map<String, Object> getUserPropertiesAs(@Size(min = 1) @NonNull String str, @Nullable String str2, @Nullable @Size(max = 23, min = 1) String str3, boolean z) {
        return this.f8021a.mo14323h().mo14389a(str, str2, str3, z);
    }

    @Keep
    @WorkerThread
    public List<ConditionalUserProperty> getConditionalUserProperties(@Nullable String str, @Nullable @Size(max = 23, min = 1) String str2) {
        return this.f8021a.mo14323h().mo14387a(str, str2);
    }

    /* access modifiers changed from: protected */
    @Keep
    @WorkerThread
    public List<ConditionalUserProperty> getConditionalUserPropertiesAs(@Size(min = 1) @NonNull String str, @Nullable String str2, @Nullable @Size(max = 23, min = 1) String str3) {
        return this.f8021a.mo14323h().mo14388a(str, str2, str3);
    }

    @Keep
    @WorkerThread
    public int getMaxUserProperties(@Size(min = 1) @NonNull String str) {
        this.f8021a.mo14323h();
        C0926p.m1308a(str);
        return 25;
    }
}
