package com.google.android.gms.internal.ads;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.util.Log;

final class bkv extends HandlerThread implements SurfaceTexture.OnFrameAvailableListener, Handler.Callback {

    /* renamed from: a */
    private final int[] f4585a = new int[1];

    /* renamed from: b */
    private Handler f4586b;

    /* renamed from: c */
    private SurfaceTexture f4587c;

    /* renamed from: d */
    private Error f4588d;

    /* renamed from: e */
    private RuntimeException f4589e;

    /* renamed from: f */
    private zzqk f4590f;

    public bkv() {
        super("dummySurface");
    }

    /* renamed from: a */
    public final zzqk mo12083a(boolean z) {
        boolean z2;
        start();
        this.f4586b = new Handler(getLooper(), this);
        synchronized (this) {
            z2 = false;
            this.f4586b.obtainMessage(1, z ? 1 : 0, 0).sendToTarget();
            while (this.f4590f == null && this.f4589e == null && this.f4588d == null) {
                try {
                    wait();
                } catch (InterruptedException unused) {
                    z2 = true;
                }
            }
        }
        if (z2) {
            Thread.currentThread().interrupt();
        }
        if (this.f4589e != null) {
            throw this.f4589e;
        } else if (this.f4588d == null) {
            return this.f4590f;
        } else {
            throw this.f4588d;
        }
    }

    /* renamed from: a */
    public final void mo12084a() {
        this.f4586b.sendEmptyMessage(3);
    }

    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.f4586b.sendEmptyMessage(2);
    }

    public final boolean handleMessage(Message message) {
        int[] iArr;
        int[] iArr2;
        switch (message.what) {
            case 1:
                try {
                    boolean z = message.arg1 != 0;
                    EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
                    bjy.m5692b(eglGetDisplay != null, "eglGetDisplay failed");
                    int[] iArr3 = new int[2];
                    bjy.m5692b(EGL14.eglInitialize(eglGetDisplay, iArr3, 0, iArr3, 1), "eglInitialize failed");
                    EGLConfig[] eGLConfigArr = new EGLConfig[1];
                    int[] iArr4 = new int[1];
                    bjy.m5692b(EGL14.eglChooseConfig(eglGetDisplay, new int[]{12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12327, 12344, 12339, 4, 12344}, 0, eGLConfigArr, 0, 1, iArr4, 0) && iArr4[0] > 0 && eGLConfigArr[0] != null, "eglChooseConfig failed");
                    EGLConfig eGLConfig = eGLConfigArr[0];
                    if (z) {
                        iArr = new int[]{12440, 2, 12992, 1, 12344};
                    } else {
                        iArr = new int[]{12440, 2, 12344};
                    }
                    EGLContext eglCreateContext = EGL14.eglCreateContext(eglGetDisplay, eGLConfig, EGL14.EGL_NO_CONTEXT, iArr, 0);
                    bjy.m5692b(eglCreateContext != null, "eglCreateContext failed");
                    if (z) {
                        iArr2 = new int[]{12375, 1, 12374, 1, 12992, 1, 12344};
                    } else {
                        iArr2 = new int[]{12375, 1, 12374, 1, 12344};
                    }
                    EGLSurface eglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eglGetDisplay, eGLConfig, iArr2, 0);
                    bjy.m5692b(eglCreatePbufferSurface != null, "eglCreatePbufferSurface failed");
                    bjy.m5692b(EGL14.eglMakeCurrent(eglGetDisplay, eglCreatePbufferSurface, eglCreatePbufferSurface, eglCreateContext), "eglMakeCurrent failed");
                    GLES20.glGenTextures(1, this.f4585a, 0);
                    this.f4587c = new SurfaceTexture(this.f4585a[0]);
                    this.f4587c.setOnFrameAvailableListener(this);
                    this.f4590f = new zzqk(this, this.f4587c, z);
                    synchronized (this) {
                        notify();
                    }
                } catch (RuntimeException e) {
                    Log.e("DummySurface", "Failed to initialize dummy surface", e);
                    this.f4589e = e;
                    synchronized (this) {
                        notify();
                    }
                } catch (Error e2) {
                    try {
                        Log.e("DummySurface", "Failed to initialize dummy surface", e2);
                        this.f4588d = e2;
                        synchronized (this) {
                            notify();
                        }
                    } catch (Throwable th) {
                        synchronized (this) {
                            notify();
                            throw th;
                        }
                    }
                }
                return true;
            case 2:
                this.f4587c.updateTexImage();
                return true;
            case 3:
                try {
                    this.f4587c.release();
                    this.f4590f = null;
                    this.f4587c = null;
                    GLES20.glDeleteTextures(1, this.f4585a, 0);
                    quit();
                } catch (Throwable th2) {
                    try {
                        Log.e("DummySurface", "Failed to release dummy surface", th2);
                    } finally {
                        quit();
                    }
                }
                return true;
            default:
                return true;
        }
    }
}
