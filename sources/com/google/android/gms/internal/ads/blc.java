package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Choreographer;

final class blc implements Handler.Callback, Choreographer.FrameCallback {

    /* renamed from: b */
    private static final blc f4643b = new blc();

    /* renamed from: a */
    public volatile long f4644a;

    /* renamed from: c */
    private final Handler f4645c;

    /* renamed from: d */
    private final HandlerThread f4646d = new HandlerThread("ChoreographerOwner:Handler");

    /* renamed from: e */
    private Choreographer f4647e;

    /* renamed from: f */
    private int f4648f;

    /* renamed from: a */
    public static blc m5876a() {
        return f4643b;
    }

    private blc() {
        this.f4646d.start();
        this.f4645c = new Handler(this.f4646d.getLooper(), this);
        this.f4645c.sendEmptyMessage(0);
    }

    /* renamed from: b */
    public final void mo12092b() {
        this.f4645c.sendEmptyMessage(1);
    }

    /* renamed from: c */
    public final void mo12093c() {
        this.f4645c.sendEmptyMessage(2);
    }

    public final void doFrame(long j) {
        this.f4644a = j;
        this.f4647e.postFrameCallbackDelayed(this, 500);
    }

    public final boolean handleMessage(Message message) {
        switch (message.what) {
            case 0:
                this.f4647e = Choreographer.getInstance();
                return true;
            case 1:
                this.f4648f++;
                if (this.f4648f == 1) {
                    this.f4647e.postFrameCallback(this);
                }
                return true;
            case 2:
                this.f4648f--;
                if (this.f4648f == 0) {
                    this.f4647e.removeFrameCallback(this);
                    this.f4644a = 0;
                }
                return true;
            default:
                return false;
        }
    }
}
