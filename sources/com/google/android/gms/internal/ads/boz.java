package com.google.android.gms.internal.ads;

import android.support.p034v4.view.PointerIconCompat;
import com.google.android.gms.internal.ads.aqn;
import p000a.p001a.p002a.p003a.p004a.p006b.C0008a;

public final class boz {

    /* renamed from: com.google.android.gms.internal.ads.boz$a */
    public static final class C1142a extends aqn<C1142a, C1143a> implements ary {
        /* access modifiers changed from: private */
        public static final C1142a zzcar = new C1142a();
        private static volatile ash<C1142a> zzcas;

        /* renamed from: com.google.android.gms.internal.ads.boz$a$b */
        public enum C1144b implements aqq {
            UNKNOWN_EVENT_TYPE(0),
            AD_REQUEST(1),
            AD_LOADED(2),
            AD_FAILED_TO_LOAD(3),
            AD_FAILED_TO_LOAD_NO_FILL(4),
            AD_IMPRESSION(5),
            AD_FIRST_CLICK(6),
            AD_SUBSEQUENT_CLICK(7),
            REQUEST_WILL_START(8),
            REQUEST_DID_END(9),
            REQUEST_WILL_UPDATE_SIGNALS(10),
            REQUEST_DID_UPDATE_SIGNALS(11),
            REQUEST_WILL_BUILD_URL(12),
            REQUEST_DID_BUILD_URL(13),
            REQUEST_WILL_MAKE_NETWORK_REQUEST(14),
            REQUEST_DID_RECEIVE_NETWORK_RESPONSE(15),
            REQUEST_WILL_PROCESS_RESPONSE(16),
            REQUEST_DID_PROCESS_RESPONSE(17),
            REQUEST_WILL_RENDER(18),
            REQUEST_DID_RENDER(19),
            REQUEST_WILL_UPDATE_GMS_SIGNALS(1000),
            REQUEST_DID_UPDATE_GMS_SIGNALS(PointerIconCompat.TYPE_CONTEXT_MENU),
            REQUEST_FAILED_TO_UPDATE_GMS_SIGNALS(PointerIconCompat.TYPE_HAND),
            REQUEST_FAILED_TO_BUILD_URL(PointerIconCompat.TYPE_HELP),
            REQUEST_FAILED_TO_MAKE_NETWORK_REQUEST(PointerIconCompat.TYPE_WAIT),
            REQUEST_FAILED_TO_PROCESS_RESPONSE(1005),
            REQUEST_FAILED_TO_UPDATE_SIGNALS(PointerIconCompat.TYPE_CELL),
            BANNER_SIZE_INVALID(C0008a.DEFAULT_TIMEOUT),
            BANNER_SIZE_VALID(10001),
            ANDROID_WEBVIEW_CRASH(10002);
            

            /* renamed from: E */
            private static final aqr<C1144b> f4933E = null;

            /* renamed from: F */
            private final int f4961F;

            /* renamed from: a */
            public final int mo10648a() {
                return this.f4961F;
            }

            private C1144b(int i) {
                this.f4961F = i;
            }

            static {
                f4933E = new bpb();
            }
        }

        private C1142a() {
        }

        /* renamed from: com.google.android.gms.internal.ads.boz$a$a */
        public static final class C1143a extends aqn.C1078a<C1142a, C1143a> implements ary {
            private C1143a() {
                super(C1142a.zzcar);
            }

            /* synthetic */ C1143a(bpa bpa) {
                this();
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final Object mo10613a(int i, Object obj, Object obj2) {
            switch (bpa.f4964a[i - 1]) {
                case 1:
                    return new C1142a();
                case 2:
                    return new C1143a((bpa) null);
                case 3:
                    return m3456a((arw) zzcar, "\u0001\u0000", (Object[]) null);
                case 4:
                    return zzcar;
                case 5:
                    ash<C1142a> ash = zzcas;
                    if (ash == null) {
                        synchronized (C1142a.class) {
                            ash = zzcas;
                            if (ash == null) {
                                ash = new aqn.C1079b<>(zzcar);
                                zzcas = ash;
                            }
                        }
                    }
                    return ash;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        static {
            aqn.m3458a(C1142a.class, zzcar);
        }
    }
}
