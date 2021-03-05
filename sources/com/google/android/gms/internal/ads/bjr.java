package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.internal.ads.bjs;
import java.io.IOException;

@SuppressLint({"HandlerLeak"})
final class bjr<T extends bjs> extends Handler implements Runnable {

    /* renamed from: a */
    public final int f4501a;

    /* renamed from: b */
    private final T f4502b;

    /* renamed from: c */
    private final bjq<T> f4503c;

    /* renamed from: d */
    private final long f4504d;

    /* renamed from: e */
    private IOException f4505e;

    /* renamed from: f */
    private int f4506f;

    /* renamed from: g */
    private volatile Thread f4507g;

    /* renamed from: h */
    private volatile boolean f4508h;

    /* renamed from: i */
    private final /* synthetic */ bjp f4509i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bjr(bjp bjp, Looper looper, T t, bjq<T> bjq, int i, long j) {
        super(looper);
        this.f4509i = bjp;
        this.f4502b = t;
        this.f4503c = bjq;
        this.f4501a = i;
        this.f4504d = j;
    }

    /* renamed from: a */
    public final void mo12027a(int i) {
        if (this.f4505e != null && this.f4506f > i) {
            throw this.f4505e;
        }
    }

    /* renamed from: a */
    public final void mo12028a(long j) {
        bjy.m5691b(this.f4509i.f4499b == null);
        bjr unused = this.f4509i.f4499b = this;
        if (j > 0) {
            sendEmptyMessageDelayed(0, j);
        } else {
            m5669a();
        }
    }

    /* renamed from: a */
    public final void mo12029a(boolean z) {
        this.f4508h = z;
        this.f4505e = null;
        if (hasMessages(0)) {
            removeMessages(0);
            if (!z) {
                sendEmptyMessage(1);
            }
        } else {
            this.f4502b.mo11839a();
            if (this.f4507g != null) {
                this.f4507g.interrupt();
            }
        }
        if (z) {
            m5670b();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.f4503c.mo11824a(this.f4502b, elapsedRealtime, elapsedRealtime - this.f4504d, true);
        }
    }

    public final void run() {
        try {
            this.f4507g = Thread.currentThread();
            if (!this.f4502b.mo11841b()) {
                String valueOf = String.valueOf(this.f4502b.getClass().getSimpleName());
                bkn.m5803a(valueOf.length() != 0 ? "load:".concat(valueOf) : new String("load:"));
                this.f4502b.mo11842c();
                bkn.m5802a();
            }
            if (!this.f4508h) {
                sendEmptyMessage(2);
            }
        } catch (IOException e) {
            if (!this.f4508h) {
                obtainMessage(3, e).sendToTarget();
            }
        } catch (InterruptedException unused) {
            bjy.m5691b(this.f4502b.mo11841b());
            if (!this.f4508h) {
                sendEmptyMessage(2);
            }
        } catch (Exception e2) {
            Log.e("LoadTask", "Unexpected exception loading stream", e2);
            if (!this.f4508h) {
                obtainMessage(3, new bjt(e2)).sendToTarget();
            }
        } catch (OutOfMemoryError e3) {
            Log.e("LoadTask", "OutOfMemory error loading stream", e3);
            if (!this.f4508h) {
                obtainMessage(3, new bjt(e3)).sendToTarget();
            }
        } catch (Error e4) {
            Log.e("LoadTask", "Unexpected error loading stream", e4);
            if (!this.f4508h) {
                obtainMessage(4, e4).sendToTarget();
            }
            throw e4;
        } catch (Throwable th) {
            bkn.m5802a();
            throw th;
        }
    }

    public final void handleMessage(Message message) {
        int i;
        if (!this.f4508h) {
            if (message.what == 0) {
                m5669a();
            } else if (message.what != 4) {
                m5670b();
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long j = elapsedRealtime - this.f4504d;
                if (this.f4502b.mo11841b()) {
                    this.f4503c.mo11824a(this.f4502b, elapsedRealtime, j, false);
                    return;
                }
                switch (message.what) {
                    case 1:
                        this.f4503c.mo11824a(this.f4502b, elapsedRealtime, j, false);
                        return;
                    case 2:
                        this.f4503c.mo11823a(this.f4502b, elapsedRealtime, j);
                        return;
                    case 3:
                        this.f4505e = (IOException) message.obj;
                        int a = this.f4503c.mo11819a(this.f4502b, elapsedRealtime, j, this.f4505e);
                        if (a == 3) {
                            IOException unused = this.f4509i.f4500c = this.f4505e;
                            return;
                        } else if (a != 2) {
                            if (a == 1) {
                                i = 1;
                            } else {
                                i = this.f4506f + 1;
                            }
                            this.f4506f = i;
                            mo12028a((long) Math.min((this.f4506f - 1) * 1000, 5000));
                            return;
                        } else {
                            return;
                        }
                    default:
                        return;
                }
            } else {
                throw ((Error) message.obj);
            }
        }
    }

    /* renamed from: a */
    private final void m5669a() {
        this.f4505e = null;
        this.f4509i.f4498a.execute(this.f4509i.f4499b);
    }

    /* renamed from: b */
    private final void m5670b() {
        bjr unused = this.f4509i.f4499b = null;
    }
}
