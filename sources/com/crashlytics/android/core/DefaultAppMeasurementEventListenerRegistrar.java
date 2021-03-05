package com.crashlytics.android.core;

import android.content.Context;
import android.os.Bundle;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import org.json.JSONException;
import org.json.JSONObject;
import p000a.p001a.p002a.p003a.C0139c;
import p000a.p001a.p002a.p003a.C0153l;

class DefaultAppMeasurementEventListenerRegistrar implements AppMeasurementEventListenerRegistrar {
    private static final String ANALYTIC_CLASS = "com.google.android.gms.measurement.AppMeasurement";
    private static final String ANALYTIC_CLASS_ON_EVENT_LISTENER = "com.google.android.gms.measurement.AppMeasurement$OnEventListener";
    private static final String CRASH_ORIGIN = "crash";
    private static final String GET_INSTANCE_METHOD = "getInstance";
    private static final String NAME = "name";
    private static final String PARAMETERS = "parameters";
    private static final String REGISTER_METHOD = "registerOnMeasurementEventListener";
    /* access modifiers changed from: private */
    public final CrashlyticsCore crashlyticsCore;

    static AppMeasurementEventListenerRegistrar instanceFrom(CrashlyticsCore crashlyticsCore2) {
        return new DefaultAppMeasurementEventListenerRegistrar(crashlyticsCore2);
    }

    private DefaultAppMeasurementEventListenerRegistrar(CrashlyticsCore crashlyticsCore2) {
        this.crashlyticsCore = crashlyticsCore2;
    }

    public boolean register() {
        Class<?> cls = getClass(ANALYTIC_CLASS);
        if (cls == null) {
            C0139c.m394g().mo288d(CrashlyticsCore.TAG, "Firebase Analytics is not present; you will not see automatic logging of events before a crash occurs.");
            return false;
        }
        Object instance = getInstance(cls);
        if (instance != null) {
            return invoke(cls, instance, REGISTER_METHOD);
        }
        C0139c.m394g().mo288d(CrashlyticsCore.TAG, "Could not create an instance of Firebase Analytics.");
        return false;
    }

    private Class<?> getClass(String str) {
        try {
            return this.crashlyticsCore.getContext().getClassLoader().loadClass(str);
        } catch (Exception unused) {
            return null;
        }
    }

    private Object getInstance(Class<?> cls) {
        try {
            return cls.getDeclaredMethod(GET_INSTANCE_METHOD, new Class[]{Context.class}).invoke(cls, new Object[]{this.crashlyticsCore.getContext()});
        } catch (Exception e) {
            C0139c.m394g().mo282a(CrashlyticsCore.TAG, "Could not get instance of com.google.android.gms.measurement.AppMeasurement", (Throwable) e);
            return null;
        }
    }

    private boolean invoke(Class<?> cls, Object obj, String str) {
        Class<?> cls2 = getClass(ANALYTIC_CLASS_ON_EVENT_LISTENER);
        if (cls2 == null) {
            C0139c.m394g().mo281a(CrashlyticsCore.TAG, "Could not get class com.google.android.gms.measurement.AppMeasurement$OnEventListener");
            return false;
        }
        try {
            cls.getDeclaredMethod(str, new Class[]{cls2}).invoke(obj, new Object[]{onEventListenerProxy(cls2)});
            return true;
        } catch (NoSuchMethodException e) {
            C0153l g = C0139c.m394g();
            g.mo289d(CrashlyticsCore.TAG, "Expected method missing: " + str, e);
            return false;
        } catch (InvocationTargetException e2) {
            C0153l g2 = C0139c.m394g();
            g2.mo289d(CrashlyticsCore.TAG, "Cannot invoke method: " + str, e2);
            return false;
        } catch (IllegalAccessException e3) {
            C0153l g3 = C0139c.m394g();
            g3.mo289d(CrashlyticsCore.TAG, "Cannot access method: " + str, e3);
            return false;
        }
    }

    private Object onEventListenerProxy(Class cls) {
        return Proxy.newProxyInstance(this.crashlyticsCore.getContext().getClassLoader(), new Class[]{cls}, new InvocationHandler() {
            public Object invoke(Object obj, Method method, Object[] objArr) {
                if (objArr.length == 4) {
                    String str = objArr[0];
                    String str2 = objArr[1];
                    Bundle bundle = objArr[2];
                    if (str == null || str.equals(DefaultAppMeasurementEventListenerRegistrar.CRASH_ORIGIN)) {
                        return null;
                    }
                    DefaultAppMeasurementEventListenerRegistrar.writeEventToUserLog(DefaultAppMeasurementEventListenerRegistrar.this.crashlyticsCore, str2, bundle);
                    return null;
                }
                throw new RuntimeException("Unexpected AppMeasurement.OnEventListener signature");
            }
        });
    }

    /* access modifiers changed from: private */
    public static void writeEventToUserLog(CrashlyticsCore crashlyticsCore2, String str, Bundle bundle) {
        try {
            crashlyticsCore2.log("$A$:" + serializeEvent(str, bundle));
        } catch (JSONException unused) {
            C0153l g = C0139c.m394g();
            g.mo288d(CrashlyticsCore.TAG, "Unable to serialize Firebase Analytics event; " + str);
        }
    }

    private static String serializeEvent(String str, Bundle bundle) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        for (String str2 : bundle.keySet()) {
            jSONObject2.put(str2, bundle.get(str2));
        }
        jSONObject.put(NAME, str);
        jSONObject.put(PARAMETERS, jSONObject2);
        return jSONObject.toString();
    }
}
