package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Build;
import android.view.Surface;
import android.view.TextureView;
import com.google.android.gms.ads.internal.zzbv;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@TargetApi(14)
@C1598qn
public final class zzbcx extends zzbdi implements MediaPlayer.OnBufferingUpdateListener, MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener, MediaPlayer.OnInfoListener, MediaPlayer.OnPreparedListener, MediaPlayer.OnVideoSizeChangedListener, TextureView.SurfaceTextureListener {

    /* renamed from: c */
    private static final Map<Integer, String> f7140c = new HashMap();

    /* renamed from: d */
    private final ade f7141d;

    /* renamed from: e */
    private final boolean f7142e;

    /* renamed from: f */
    private int f7143f = 0;

    /* renamed from: g */
    private int f7144g = 0;

    /* renamed from: h */
    private MediaPlayer f7145h;

    /* renamed from: i */
    private Uri f7146i;

    /* renamed from: j */
    private int f7147j;

    /* renamed from: k */
    private int f7148k;

    /* renamed from: l */
    private int f7149l;

    /* renamed from: m */
    private int f7150m;

    /* renamed from: n */
    private int f7151n;

    /* renamed from: o */
    private ada f7152o;

    /* renamed from: p */
    private boolean f7153p;

    /* renamed from: q */
    private int f7154q;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public acm f7155r;

    public zzbcx(Context context, boolean z, boolean z2, adb adb, ade ade) {
        super(context);
        setSurfaceTextureListener(this);
        this.f7141d = ade;
        this.f7153p = z;
        this.f7142e = z2;
        this.f7141d.mo10186a(this);
    }

    /* renamed from: a */
    public final String mo13325a() {
        String valueOf = String.valueOf(this.f7153p ? " spherical" : "");
        return valueOf.length() != 0 ? "MediaPlayer".concat(valueOf) : new String("MediaPlayer");
    }

    /* renamed from: a */
    public final void mo13328a(acm acm) {
        this.f7155r = acm;
    }

    public final void setVideoPath(String str) {
        Uri parse = Uri.parse(str);
        zzty a = zzty.m8825a(parse);
        if (a != null) {
            parse = Uri.parse(a.f7261a);
        }
        this.f7146i = parse;
        this.f7154q = 0;
        m8622f();
        requestLayout();
        invalidate();
    }

    /* renamed from: b */
    public final void mo13329b() {
        C1772wz.m8287a("AdMediaPlayerView stop");
        if (this.f7145h != null) {
            this.f7145h.stop();
            this.f7145h.release();
            this.f7145h = null;
            m8624g(0);
            this.f7144g = 0;
        }
        this.f7141d.mo10187b();
    }

    public final void onVideoSizeChanged(MediaPlayer mediaPlayer, int i, int i2) {
        StringBuilder sb = new StringBuilder(57);
        sb.append("AdMediaPlayerView size changed: ");
        sb.append(i);
        sb.append(" x ");
        sb.append(i2);
        C1772wz.m8287a(sb.toString());
        this.f7147j = mediaPlayer.getVideoWidth();
        this.f7148k = mediaPlayer.getVideoHeight();
        if (this.f7147j != 0 && this.f7148k != 0) {
            requestLayout();
        }
    }

    public final void onPrepared(MediaPlayer mediaPlayer) {
        C1772wz.m8287a("AdMediaPlayerView prepared");
        m8624g(2);
        this.f7141d.mo10185a();
        C1782xi.f6838a.post(new acd(this));
        this.f7147j = mediaPlayer.getVideoWidth();
        this.f7148k = mediaPlayer.getVideoHeight();
        if (this.f7154q != 0) {
            mo13327a(this.f7154q);
        }
        m8623g();
        int i = this.f7147j;
        int i2 = this.f7148k;
        StringBuilder sb = new StringBuilder(62);
        sb.append("AdMediaPlayerView stream dimensions: ");
        sb.append(i);
        sb.append(" x ");
        sb.append(i2);
        C1772wz.m1628d(sb.toString());
        if (this.f7144g == 3) {
            mo13331c();
        }
        mo10200e();
    }

    public final void onCompletion(MediaPlayer mediaPlayer) {
        C1772wz.m8287a("AdMediaPlayerView completion");
        m8624g(5);
        this.f7144g = 5;
        C1782xi.f6838a.post(new acf(this));
    }

    public final boolean onInfo(MediaPlayer mediaPlayer, int i, int i2) {
        String str = f7140c.get(Integer.valueOf(i));
        String str2 = f7140c.get(Integer.valueOf(i2));
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 37 + String.valueOf(str2).length());
        sb.append("AdMediaPlayerView MediaPlayer info: ");
        sb.append(str);
        sb.append(":");
        sb.append(str2);
        C1772wz.m8287a(sb.toString());
        return true;
    }

    public final boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        String str = f7140c.get(Integer.valueOf(i));
        String str2 = f7140c.get(Integer.valueOf(i2));
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 38 + String.valueOf(str2).length());
        sb.append("AdMediaPlayerView MediaPlayer error: ");
        sb.append(str);
        sb.append(":");
        sb.append(str2);
        C1772wz.m1630e(sb.toString());
        m8624g(-1);
        this.f7144g = -1;
        C1782xi.f6838a.post(new acg(this, str, str2));
        return true;
    }

    public final void onBufferingUpdate(MediaPlayer mediaPlayer, int i) {
        this.f7149l = i;
    }

    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        C1772wz.m8287a("AdMediaPlayerView surface created");
        m8622f();
        C1782xi.f6838a.post(new ach(this));
    }

    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        C1772wz.m8287a("AdMediaPlayerView surface changed");
        boolean z = false;
        boolean z2 = this.f7144g == 3;
        if (this.f7147j == i && this.f7148k == i2) {
            z = true;
        }
        if (this.f7145h != null && z2 && z) {
            if (this.f7154q != 0) {
                mo13327a(this.f7154q);
            }
            mo13331c();
        }
        if (this.f7152o != null) {
            this.f7152o.mo10160a(i, i2);
        }
        C1782xi.f6838a.post(new aci(this, i, i2));
    }

    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        C1772wz.m8287a("AdMediaPlayerView surface destroyed");
        if (this.f7145h != null && this.f7154q == 0) {
            this.f7154q = this.f7145h.getCurrentPosition();
        }
        if (this.f7152o != null) {
            this.f7152o.mo10162b();
        }
        C1782xi.f6838a.post(new acj(this));
        m8621a(true);
        return true;
    }

    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        this.f7141d.mo10188b(this);
        this.f7156a.mo10139a(surfaceTexture, this.f7155r);
    }

    /* access modifiers changed from: protected */
    public final void onWindowVisibilityChanged(int i) {
        StringBuilder sb = new StringBuilder(58);
        sb.append("AdMediaPlayerView window visibility changed to ");
        sb.append(i);
        C1772wz.m8287a(sb.toString());
        C1782xi.f6838a.post(new acc(this, i));
        super.onWindowVisibilityChanged(i);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0072, code lost:
        if (r1 > r6) goto L_0x0098;
     */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00aa  */
    /* JADX WARNING: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onMeasure(int r6, int r7) {
        /*
            r5 = this;
            int r0 = r5.f7147j
            int r0 = getDefaultSize(r0, r6)
            int r1 = r5.f7148k
            int r1 = getDefaultSize(r1, r7)
            int r2 = r5.f7147j
            if (r2 <= 0) goto L_0x0096
            int r2 = r5.f7148k
            if (r2 <= 0) goto L_0x0096
            com.google.android.gms.internal.ads.ada r2 = r5.f7152o
            if (r2 != 0) goto L_0x0096
            int r0 = android.view.View.MeasureSpec.getMode(r6)
            int r6 = android.view.View.MeasureSpec.getSize(r6)
            int r1 = android.view.View.MeasureSpec.getMode(r7)
            int r7 = android.view.View.MeasureSpec.getSize(r7)
            r2 = 1073741824(0x40000000, float:2.0)
            if (r0 != r2) goto L_0x0055
            if (r1 != r2) goto L_0x0055
            int r0 = r5.f7147j
            int r0 = r0 * r7
            int r1 = r5.f7148k
            int r1 = r1 * r6
            if (r0 >= r1) goto L_0x0042
            int r6 = r5.f7147j
            int r6 = r6 * r7
            int r0 = r5.f7148k
            int r0 = r6 / r0
            r6 = r0
            goto L_0x0098
        L_0x0042:
            int r0 = r5.f7147j
            int r0 = r0 * r7
            int r1 = r5.f7148k
            int r1 = r1 * r6
            if (r0 <= r1) goto L_0x0098
            int r7 = r5.f7148k
            int r7 = r7 * r6
            int r0 = r5.f7147j
            int r1 = r7 / r0
            goto L_0x0097
        L_0x0055:
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 != r2) goto L_0x0067
            int r0 = r5.f7148k
            int r0 = r0 * r6
            int r2 = r5.f7147j
            int r0 = r0 / r2
            if (r1 != r3) goto L_0x0065
            if (r0 <= r7) goto L_0x0065
            goto L_0x0098
        L_0x0065:
            r7 = r0
            goto L_0x0098
        L_0x0067:
            if (r1 != r2) goto L_0x0077
            int r1 = r5.f7147j
            int r1 = r1 * r7
            int r2 = r5.f7148k
            int r1 = r1 / r2
            if (r0 != r3) goto L_0x0075
            if (r1 <= r6) goto L_0x0075
            goto L_0x0098
        L_0x0075:
            r6 = r1
            goto L_0x0098
        L_0x0077:
            int r2 = r5.f7147j
            int r4 = r5.f7148k
            if (r1 != r3) goto L_0x0087
            if (r4 <= r7) goto L_0x0087
            int r1 = r5.f7147j
            int r1 = r1 * r7
            int r2 = r5.f7148k
            int r1 = r1 / r2
            goto L_0x0089
        L_0x0087:
            r1 = r2
            r7 = r4
        L_0x0089:
            if (r0 != r3) goto L_0x0075
            if (r1 <= r6) goto L_0x0075
            int r7 = r5.f7148k
            int r7 = r7 * r6
            int r0 = r5.f7147j
            int r1 = r7 / r0
            goto L_0x0097
        L_0x0096:
            r6 = r0
        L_0x0097:
            r7 = r1
        L_0x0098:
            r5.setMeasuredDimension(r6, r7)
            com.google.android.gms.internal.ads.ada r0 = r5.f7152o
            if (r0 == 0) goto L_0x00a4
            com.google.android.gms.internal.ads.ada r0 = r5.f7152o
            r0.mo10160a((int) r6, (int) r7)
        L_0x00a4:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 16
            if (r0 != r1) goto L_0x00c1
            int r0 = r5.f7150m
            if (r0 <= 0) goto L_0x00b2
            int r0 = r5.f7150m
            if (r0 != r6) goto L_0x00ba
        L_0x00b2:
            int r0 = r5.f7151n
            if (r0 <= 0) goto L_0x00bd
            int r0 = r5.f7151n
            if (r0 == r7) goto L_0x00bd
        L_0x00ba:
            r5.m8623g()
        L_0x00bd:
            r5.f7150m = r6
            r5.f7151n = r7
        L_0x00c1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbcx.onMeasure(int, int):void");
    }

    public final String toString() {
        String name = getClass().getName();
        String hexString = Integer.toHexString(hashCode());
        StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 1 + String.valueOf(hexString).length());
        sb.append(name);
        sb.append("@");
        sb.append(hexString);
        return sb.toString();
    }

    /* renamed from: f */
    private final void m8622f() {
        C1772wz.m8287a("AdMediaPlayerView init MediaPlayer");
        SurfaceTexture surfaceTexture = getSurfaceTexture();
        if (this.f7146i != null && surfaceTexture != null) {
            m8621a(false);
            try {
                zzbv.zzlx();
                this.f7145h = new MediaPlayer();
                this.f7145h.setOnBufferingUpdateListener(this);
                this.f7145h.setOnCompletionListener(this);
                this.f7145h.setOnErrorListener(this);
                this.f7145h.setOnInfoListener(this);
                this.f7145h.setOnPreparedListener(this);
                this.f7145h.setOnVideoSizeChangedListener(this);
                this.f7149l = 0;
                if (this.f7153p) {
                    this.f7152o = new ada(getContext());
                    this.f7152o.mo10161a(surfaceTexture, getWidth(), getHeight());
                    this.f7152o.start();
                    SurfaceTexture c = this.f7152o.mo10163c();
                    if (c != null) {
                        surfaceTexture = c;
                    } else {
                        this.f7152o.mo10162b();
                        this.f7152o = null;
                    }
                }
                this.f7145h.setDataSource(getContext(), this.f7146i);
                zzbv.zzly();
                this.f7145h.setSurface(new Surface(surfaceTexture));
                this.f7145h.setAudioStreamType(3);
                this.f7145h.setScreenOnWhilePlaying(true);
                this.f7145h.prepareAsync();
                m8624g(1);
            } catch (IOException | IllegalArgumentException | IllegalStateException e) {
                String valueOf = String.valueOf(this.f7146i);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 36);
                sb.append("Failed to initialize MediaPlayer at ");
                sb.append(valueOf);
                C1772wz.m1627c(sb.toString(), e);
                onError(this.f7145h, 1, 0);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0034 A[LOOP:0: B:10:0x0034->B:15:0x004f, LOOP_START] */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m8623g() {
        /*
            r8 = this;
            boolean r0 = r8.f7142e
            if (r0 != 0) goto L_0x0005
            return
        L_0x0005:
            boolean r0 = r8.m8625h()
            if (r0 == 0) goto L_0x0059
            android.media.MediaPlayer r0 = r8.f7145h
            int r0 = r0.getCurrentPosition()
            if (r0 <= 0) goto L_0x0059
            int r0 = r8.f7144g
            r1 = 3
            if (r0 == r1) goto L_0x0059
            java.lang.String r0 = "AdMediaPlayerView nudging MediaPlayer"
            com.google.android.gms.internal.ads.C1772wz.m8287a(r0)
            r0 = 0
            r8.m8620a((float) r0)
            android.media.MediaPlayer r0 = r8.f7145h
            r0.start()
            android.media.MediaPlayer r0 = r8.f7145h
            int r0 = r0.getCurrentPosition()
            com.google.android.gms.common.util.e r1 = com.google.android.gms.ads.internal.zzbv.zzlm()
            long r1 = r1.mo9996a()
        L_0x0034:
            boolean r3 = r8.m8625h()
            if (r3 == 0) goto L_0x0051
            android.media.MediaPlayer r3 = r8.f7145h
            int r3 = r3.getCurrentPosition()
            if (r3 != r0) goto L_0x0051
            com.google.android.gms.common.util.e r3 = com.google.android.gms.ads.internal.zzbv.zzlm()
            long r3 = r3.mo9996a()
            long r3 = r3 - r1
            r5 = 250(0xfa, double:1.235E-321)
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 <= 0) goto L_0x0034
        L_0x0051:
            android.media.MediaPlayer r0 = r8.f7145h
            r0.pause()
            r8.mo10200e()
        L_0x0059:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbcx.m8623g():void");
    }

    /* renamed from: a */
    private final void m8621a(boolean z) {
        C1772wz.m8287a("AdMediaPlayerView release");
        if (this.f7152o != null) {
            this.f7152o.mo10162b();
            this.f7152o = null;
        }
        if (this.f7145h != null) {
            this.f7145h.reset();
            this.f7145h.release();
            this.f7145h = null;
            m8624g(0);
            if (z) {
                this.f7144g = 0;
                this.f7144g = 0;
            }
        }
    }

    /* renamed from: c */
    public final void mo13331c() {
        C1772wz.m8287a("AdMediaPlayerView play");
        if (m8625h()) {
            this.f7145h.start();
            m8624g(3);
            this.f7156a.mo10138a();
            C1782xi.f6838a.post(new ack(this));
        }
        this.f7144g = 3;
    }

    /* renamed from: d */
    public final void mo13332d() {
        C1772wz.m8287a("AdMediaPlayerView pause");
        if (m8625h() && this.f7145h.isPlaying()) {
            this.f7145h.pause();
            m8624g(4);
            C1782xi.f6838a.post(new acl(this));
        }
        this.f7144g = 4;
    }

    public final int getDuration() {
        if (m8625h()) {
            return this.f7145h.getDuration();
        }
        return -1;
    }

    public final int getCurrentPosition() {
        if (m8625h()) {
            return this.f7145h.getCurrentPosition();
        }
        return 0;
    }

    /* renamed from: a */
    public final void mo13327a(int i) {
        StringBuilder sb = new StringBuilder(34);
        sb.append("AdMediaPlayerView seek ");
        sb.append(i);
        C1772wz.m8287a(sb.toString());
        if (m8625h()) {
            this.f7145h.seekTo(i);
            this.f7154q = 0;
            return;
        }
        this.f7154q = i;
    }

    /* renamed from: h */
    private final boolean m8625h() {
        return (this.f7145h == null || this.f7143f == -1 || this.f7143f == 0 || this.f7143f == 1) ? false : true;
    }

    /* renamed from: a */
    public final void mo13326a(float f, float f2) {
        if (this.f7152o != null) {
            this.f7152o.mo10159a(f, f2);
        }
    }

    public final int getVideoWidth() {
        if (this.f7145h != null) {
            return this.f7145h.getVideoWidth();
        }
        return 0;
    }

    public final int getVideoHeight() {
        if (this.f7145h != null) {
            return this.f7145h.getVideoHeight();
        }
        return 0;
    }

    /* renamed from: e */
    public final void mo10200e() {
        m8620a(this.f7157b.mo10194a());
    }

    /* renamed from: a */
    private final void m8620a(float f) {
        if (this.f7145h != null) {
            try {
                this.f7145h.setVolume(f, f);
            } catch (IllegalStateException unused) {
            }
        } else {
            C1772wz.m1630e("AdMediaPlayerView setMediaPlayerVolume() called before onPrepared().");
        }
    }

    /* renamed from: g */
    private final void m8624g(int i) {
        if (i == 3) {
            this.f7141d.mo10189c();
            this.f7157b.mo10197b();
        } else if (this.f7143f == 3) {
            this.f7141d.mo10190d();
            this.f7157b.mo10198c();
        }
        this.f7143f = i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final /* synthetic */ void mo13330b(int i) {
        if (this.f7155r != null) {
            this.f7155r.onWindowVisibilityChanged(i);
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 17) {
            f7140c.put(-1004, "MEDIA_ERROR_IO");
            f7140c.put(-1007, "MEDIA_ERROR_MALFORMED");
            f7140c.put(-1010, "MEDIA_ERROR_UNSUPPORTED");
            f7140c.put(-110, "MEDIA_ERROR_TIMED_OUT");
            f7140c.put(3, "MEDIA_INFO_VIDEO_RENDERING_START");
        }
        f7140c.put(100, "MEDIA_ERROR_SERVER_DIED");
        f7140c.put(1, "MEDIA_ERROR_UNKNOWN");
        f7140c.put(1, "MEDIA_INFO_UNKNOWN");
        f7140c.put(700, "MEDIA_INFO_VIDEO_TRACK_LAGGING");
        f7140c.put(701, "MEDIA_INFO_BUFFERING_START");
        f7140c.put(702, "MEDIA_INFO_BUFFERING_END");
        f7140c.put(800, "MEDIA_INFO_BAD_INTERLEAVING");
        f7140c.put(801, "MEDIA_INFO_NOT_SEEKABLE");
        f7140c.put(802, "MEDIA_INFO_METADATA_UPDATE");
        if (Build.VERSION.SDK_INT >= 19) {
            f7140c.put(901, "MEDIA_INFO_UNSUPPORTED_SUBTITLE");
            f7140c.put(902, "MEDIA_INFO_SUBTITLE_TIMED_OUT");
        }
    }
}
