package com.google.android.gms.common;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.google.android.gms.common.internal.C0926p;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: com.google.android.gms.common.a */
public class C0768a implements ServiceConnection {

    /* renamed from: a */
    private boolean f773a = false;

    /* renamed from: b */
    private final BlockingQueue<IBinder> f774b = new LinkedBlockingQueue();

    public void onServiceDisconnected(ComponentName componentName) {
    }

    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f774b.add(iBinder);
    }

    /* renamed from: a */
    public IBinder mo9530a(long j, TimeUnit timeUnit) {
        C0926p.m1319c("BlockingServiceConnection.getServiceWithTimeout() called on main thread");
        if (!this.f773a) {
            this.f773a = true;
            IBinder poll = this.f774b.poll(j, timeUnit);
            if (poll != null) {
                return poll;
            }
            throw new TimeoutException("Timed out waiting for the service connection");
        }
        throw new IllegalStateException("Cannot call get on this connection more than once");
    }
}
