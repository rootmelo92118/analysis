package com.google.android.gms.internal.ads;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Display;
import android.view.WindowManager;
import javax.annotation.concurrent.GuardedBy;

@C1598qn
final class acx implements SensorEventListener {

    /* renamed from: a */
    private final SensorManager f1364a;

    /* renamed from: b */
    private final Object f1365b = new Object();

    /* renamed from: c */
    private final Display f1366c;

    /* renamed from: d */
    private final float[] f1367d = new float[9];

    /* renamed from: e */
    private final float[] f1368e = new float[9];
    @GuardedBy("mSensorThreadLock")

    /* renamed from: f */
    private float[] f1369f;

    /* renamed from: g */
    private Handler f1370g;

    /* renamed from: h */
    private acz f1371h;

    acx(Context context) {
        this.f1364a = (SensorManager) context.getSystemService("sensor");
        this.f1366c = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
    }

    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo10141a() {
        if (this.f1370g == null) {
            Sensor defaultSensor = this.f1364a.getDefaultSensor(11);
            if (defaultSensor == null) {
                C1772wz.m1626c("No Sensor of TYPE_ROTATION_VECTOR");
                return;
            }
            HandlerThread handlerThread = new HandlerThread("OrientationMonitor");
            handlerThread.start();
            this.f1370g = new Handler(handlerThread.getLooper());
            if (!this.f1364a.registerListener(this, defaultSensor, 0, this.f1370g)) {
                C1772wz.m1626c("SensorManager.registerListener failed.");
                mo10144b();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo10144b() {
        if (this.f1370g != null) {
            this.f1364a.unregisterListener(this);
            this.f1370g.post(new acy(this));
            this.f1370g = null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo10142a(acz acz) {
        this.f1371h = acz;
    }

    public final void onSensorChanged(SensorEvent sensorEvent) {
        float[] fArr = sensorEvent.values;
        if (fArr[0] != 0.0f || fArr[1] != 0.0f || fArr[2] != 0.0f) {
            synchronized (this.f1365b) {
                if (this.f1369f == null) {
                    this.f1369f = new float[9];
                }
            }
            SensorManager.getRotationMatrixFromVector(this.f1367d, fArr);
            switch (this.f1366c.getRotation()) {
                case 1:
                    SensorManager.remapCoordinateSystem(this.f1367d, 2, 129, this.f1368e);
                    break;
                case 2:
                    SensorManager.remapCoordinateSystem(this.f1367d, 129, 130, this.f1368e);
                    break;
                case 3:
                    SensorManager.remapCoordinateSystem(this.f1367d, 130, 1, this.f1368e);
                    break;
                default:
                    System.arraycopy(this.f1367d, 0, this.f1368e, 0, 9);
                    break;
            }
            m1722a(1, 3);
            m1722a(2, 6);
            m1722a(5, 7);
            synchronized (this.f1365b) {
                System.arraycopy(this.f1368e, 0, this.f1369f, 0, 9);
            }
            if (this.f1371h != null) {
                this.f1371h.mo10148a();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo10143a(float[] fArr) {
        synchronized (this.f1365b) {
            if (this.f1369f == null) {
                return false;
            }
            System.arraycopy(this.f1369f, 0, fArr, 0, this.f1369f.length);
            return true;
        }
    }

    /* renamed from: a */
    private final void m1722a(int i, int i2) {
        float f = this.f1368e[i];
        this.f1368e[i] = this.f1368e[i2];
        this.f1368e[i2] = f;
    }
}
