package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.support.annotation.WorkerThread;
import android.support.p037v7.widget.helper.ItemTouchHelper;
import com.google.android.gms.common.C0851d;
import com.google.android.gms.common.C0858g;
import com.google.android.gms.internal.measurement.C1928bu;
import com.google.android.gms.internal.measurement.C1940cf;
import com.google.android.gms.internal.measurement.C1941cg;
import com.google.android.gms.internal.measurement.C1947cm;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.measurement.internal.h */
public final class C2284h {

    /* renamed from: A */
    public static C2285a<Long> f8508A = C2285a.m11283a("measurement.upload.window_interval", 3600000, 3600000);

    /* renamed from: B */
    public static C2285a<Long> f8509B = C2285a.m11283a("measurement.upload.interval", 3600000, 3600000);

    /* renamed from: C */
    public static C2285a<Long> f8510C = C2285a.m11283a("measurement.upload.realtime_upload_interval", 10000, 10000);

    /* renamed from: D */
    public static C2285a<Long> f8511D = C2285a.m11283a("measurement.upload.debug_upload_interval", 1000, 1000);

    /* renamed from: E */
    public static C2285a<Long> f8512E = C2285a.m11283a("measurement.upload.minimum_delay", 500, 500);

    /* renamed from: F */
    public static C2285a<Long> f8513F = C2285a.m11283a("measurement.alarm_manager.minimum_interval", 60000, 60000);

    /* renamed from: G */
    public static C2285a<Long> f8514G = C2285a.m11283a("measurement.upload.stale_data_deletion_interval", 86400000, 86400000);

    /* renamed from: H */
    public static C2285a<Long> f8515H = C2285a.m11283a("measurement.upload.refresh_blacklisted_config_interval", 604800000, 604800000);

    /* renamed from: I */
    public static C2285a<Long> f8516I = C2285a.m11283a("measurement.upload.initial_upload_delay_time", 15000, 15000);

    /* renamed from: J */
    public static C2285a<Long> f8517J = C2285a.m11283a("measurement.upload.retry_time", 1800000, 1800000);

    /* renamed from: K */
    public static C2285a<Integer> f8518K = C2285a.m11282a("measurement.upload.retry_count", 6, 6);

    /* renamed from: L */
    public static C2285a<Long> f8519L = C2285a.m11283a("measurement.upload.max_queue_time", 2419200000L, 2419200000L);

    /* renamed from: M */
    public static C2285a<Integer> f8520M = C2285a.m11282a("measurement.lifetimevalue.max_currency_tracked", 4, 4);

    /* renamed from: N */
    public static C2285a<Integer> f8521N = C2285a.m11282a("measurement.audience.filter_result_max_count", (int) ItemTouchHelper.Callback.DEFAULT_DRAG_ANIMATION_DURATION, (int) ItemTouchHelper.Callback.DEFAULT_DRAG_ANIMATION_DURATION);

    /* renamed from: O */
    public static C2285a<Long> f8522O = C2285a.m11283a("measurement.service_client.idle_disconnect_millis", 5000, 5000);

    /* renamed from: P */
    public static C2285a<Boolean> f8523P = C2285a.m11285a("measurement.test.boolean_flag", false, false);

    /* renamed from: Q */
    public static C2285a<String> f8524Q = C2285a.m11284a("measurement.test.string_flag", "---", "---");

    /* renamed from: R */
    public static C2285a<Long> f8525R = C2285a.m11283a("measurement.test.long_flag", -1, -1);

    /* renamed from: S */
    public static C2285a<Integer> f8526S = C2285a.m11282a("measurement.test.int_flag", -2, -2);

    /* renamed from: T */
    public static C2285a<Double> f8527T = C2285a.m11281a("measurement.test.double_flag", -3.0d, -3.0d);

    /* renamed from: U */
    public static C2285a<Integer> f8528U = C2285a.m11282a("measurement.experiment.max_ids", 50, 50);

    /* renamed from: V */
    public static C2285a<Boolean> f8529V = C2285a.m11285a("measurement.lifetimevalue.user_engagement_tracking_enabled", true, true);

    /* renamed from: W */
    public static C2285a<Boolean> f8530W = C2285a.m11285a("measurement.audience.complex_param_evaluation", true, true);

    /* renamed from: X */
    public static C2285a<Boolean> f8531X = C2285a.m11285a("measurement.validation.internal_limits_internal_event_params", false, false);

    /* renamed from: Y */
    public static C2285a<Boolean> f8532Y = C2285a.m11285a("measurement.quality.unsuccessful_update_retry_counter", true, true);

    /* renamed from: Z */
    public static C2285a<Boolean> f8533Z = C2285a.m11285a("measurement.iid.disable_on_collection_disabled", true, true);

    /* renamed from: a */
    static C2270er f8534a;

    /* renamed from: aA */
    private static C2285a<Boolean> f8535aA = C2285a.m11285a("measurement.log_upgrades_enabled", false, false);

    /* renamed from: aa */
    public static C2285a<Boolean> f8536aa = C2285a.m11285a("measurement.app_launch.call_only_when_enabled", true, true);

    /* renamed from: ab */
    public static C2285a<Boolean> f8537ab = C2285a.m11285a("measurement.run_on_worker_inline", true, false);

    /* renamed from: ac */
    public static C2285a<Boolean> f8538ac = C2285a.m11285a("measurement.audience.dynamic_filters", true, true);

    /* renamed from: ad */
    public static C2285a<Boolean> f8539ad = C2285a.m11285a("measurement.reset_analytics.persist_time", false, false);

    /* renamed from: ae */
    public static C2285a<Boolean> f8540ae = C2285a.m11285a("measurement.validation.value_and_currency_params", false, false);

    /* renamed from: af */
    public static C2285a<Boolean> f8541af = C2285a.m11285a("measurement.sampling.time_zone_offset_enabled", false, false);

    /* renamed from: ag */
    public static C2285a<Boolean> f8542ag = C2285a.m11285a("measurement.referrer.enable_logging_install_referrer_cmp_from_apk", false, false);

    /* renamed from: ah */
    public static C2285a<Boolean> f8543ah = C2285a.m11285a("measurement.fetch_config_with_admob_app_id", true, true);

    /* renamed from: ai */
    public static C2285a<Boolean> f8544ai = C2285a.m11285a("measurement.sessions.session_id_enabled", false, false);

    /* renamed from: aj */
    public static C2285a<Boolean> f8545aj = C2285a.m11285a("measurement.sessions.session_number_enabled", false, false);

    /* renamed from: ak */
    public static C2285a<Boolean> f8546ak = C2285a.m11285a("measurement.sessions.immediate_start_enabled", false, false);

    /* renamed from: al */
    public static C2285a<Boolean> f8547al = C2285a.m11285a("measurement.sessions.background_sessions_enabled", false, false);

    /* renamed from: am */
    public static C2285a<Boolean> f8548am = C2285a.m11285a("measurement.collection.firebase_global_collection_flag_enabled", true, true);

    /* renamed from: an */
    public static C2285a<Boolean> f8549an = C2285a.m11285a("measurement.collection.efficient_engagement_reporting_enabled", false, false);

    /* renamed from: ao */
    public static C2285a<Boolean> f8550ao = C2285a.m11285a("measurement.collection.redundant_engagement_removal_enabled", false, false);

    /* renamed from: ap */
    public static C2285a<Boolean> f8551ap = C2285a.m11285a("measurement.remove_app_instance_id_cache_enabled", true, true);

    /* renamed from: aq */
    public static C2285a<Boolean> f8552aq = C2285a.m11285a("measurement.collection.init_params_control_enabled", true, true);

    /* renamed from: ar */
    public static C2285a<Boolean> f8553ar = C2285a.m11285a("measurement.upload.disable_is_uploader", false, false);

    /* renamed from: as */
    public static C2285a<Boolean> f8554as = C2285a.m11285a("measurement.experiment.enable_experiment_reporting", false, false);

    /* renamed from: at */
    public static C2285a<Boolean> f8555at = C2285a.m11285a("measurement.collection.log_event_and_bundle_v2", true, true);

    /* renamed from: au */
    public static C2285a<Boolean> f8556au = C2285a.m11285a("measurement.collection.null_empty_event_name_fix", true, true);
    /* access modifiers changed from: private */

    /* renamed from: av */
    public static final C1947cm f8557av = new C1947cm(C1940cf.m9016a("com.google.android.gms.measurement"));

    /* renamed from: aw */
    private static volatile C2166aw f8558aw;

    /* renamed from: ax */
    private static Boolean f8559ax;

    /* renamed from: ay */
    private static C2285a<Boolean> f8560ay = C2285a.m11285a("measurement.log_third_party_store_events_enabled", false, false);

    /* renamed from: az */
    private static C2285a<Boolean> f8561az = C2285a.m11285a("measurement.log_installs_enabled", false, false);

    /* renamed from: b */
    static List<C2285a<Integer>> f8562b = new ArrayList();

    /* renamed from: c */
    static List<C2285a<Long>> f8563c = new ArrayList();

    /* renamed from: d */
    static List<C2285a<Boolean>> f8564d = new ArrayList();

    /* renamed from: e */
    static List<C2285a<String>> f8565e = new ArrayList();

    /* renamed from: f */
    static List<C2285a<Double>> f8566f = new ArrayList();

    /* renamed from: g */
    public static C2285a<Boolean> f8567g = C2285a.m11285a("measurement.log_androidId_enabled", false, false);

    /* renamed from: h */
    public static C2285a<Boolean> f8568h = C2285a.m11285a("measurement.upload_dsid_enabled", false, false);

    /* renamed from: i */
    public static C2285a<String> f8569i = C2285a.m11284a("measurement.log_tag", "FA", "FA-SVC");

    /* renamed from: j */
    public static C2285a<Long> f8570j = C2285a.m11283a("measurement.ad_id_cache_time", 10000, 10000);

    /* renamed from: k */
    public static C2285a<Long> f8571k = C2285a.m11283a("measurement.monitoring.sample_period_millis", 86400000, 86400000);

    /* renamed from: l */
    public static C2285a<Long> f8572l = C2285a.m11283a("measurement.config.cache_time", 86400000, 3600000);

    /* renamed from: m */
    public static C2285a<String> f8573m = C2285a.m11284a("measurement.config.url_scheme", "https", "https");

    /* renamed from: n */
    public static C2285a<String> f8574n = C2285a.m11284a("measurement.config.url_authority", "app-measurement.com", "app-measurement.com");

    /* renamed from: o */
    public static C2285a<Integer> f8575o = C2285a.m11282a("measurement.upload.max_bundles", 100, 100);

    /* renamed from: p */
    public static C2285a<Integer> f8576p = C2285a.m11282a("measurement.upload.max_batch_size", 65536, 65536);

    /* renamed from: q */
    public static C2285a<Integer> f8577q = C2285a.m11282a("measurement.upload.max_bundle_size", 65536, 65536);

    /* renamed from: r */
    public static C2285a<Integer> f8578r = C2285a.m11282a("measurement.upload.max_events_per_bundle", 1000, 1000);

    /* renamed from: s */
    public static C2285a<Integer> f8579s = C2285a.m11282a("measurement.upload.max_events_per_day", 100000, 100000);

    /* renamed from: t */
    public static C2285a<Integer> f8580t = C2285a.m11282a("measurement.upload.max_error_events_per_day", 1000, 1000);

    /* renamed from: u */
    public static C2285a<Integer> f8581u = C2285a.m11282a("measurement.upload.max_public_events_per_day", 50000, 50000);

    /* renamed from: v */
    public static C2285a<Integer> f8582v = C2285a.m11282a("measurement.upload.max_conversions_per_day", 500, 500);

    /* renamed from: w */
    public static C2285a<Integer> f8583w = C2285a.m11282a("measurement.upload.max_realtime_events_per_day", 10, 10);

    /* renamed from: x */
    public static C2285a<Integer> f8584x = C2285a.m11282a("measurement.store.max_stored_events_per_app", 100000, 100000);

    /* renamed from: y */
    public static C2285a<String> f8585y = C2285a.m11284a("measurement.upload.url", "https://app-measurement.com/a", "https://app-measurement.com/a");

    /* renamed from: z */
    public static C2285a<Long> f8586z = C2285a.m11283a("measurement.upload.backoff_period", 43200000, 43200000);

    /* renamed from: a */
    public static Map<String, String> m11277a(Context context) {
        return C1928bu.m8993a(context.getContentResolver(), C1940cf.m9016a("com.google.android.gms.measurement")).mo13547a();
    }

    /* renamed from: com.google.android.gms.measurement.internal.h$a */
    public static final class C2285a<V> {

        /* renamed from: a */
        private C1941cg<V> f8587a;

        /* renamed from: b */
        private final V f8588b;

        /* renamed from: c */
        private final V f8589c;

        /* renamed from: d */
        private volatile V f8590d;

        /* renamed from: e */
        private final String f8591e;

        private C2285a(String str, V v, V v2) {
            this.f8591e = str;
            this.f8589c = v;
            this.f8588b = v2;
        }

        /* renamed from: a */
        static C2285a<Boolean> m11285a(String str, boolean z, boolean z2) {
            C2285a<Boolean> aVar = new C2285a<>(str, Boolean.valueOf(z), Boolean.valueOf(z2));
            C2284h.f8564d.add(aVar);
            return aVar;
        }

        /* renamed from: a */
        static C2285a<String> m11284a(String str, String str2, String str3) {
            C2285a<String> aVar = new C2285a<>(str, str2, str3);
            C2284h.f8565e.add(aVar);
            return aVar;
        }

        /* renamed from: a */
        static C2285a<Long> m11283a(String str, long j, long j2) {
            C2285a<Long> aVar = new C2285a<>(str, Long.valueOf(j), Long.valueOf(j2));
            C2284h.f8563c.add(aVar);
            return aVar;
        }

        /* renamed from: a */
        static C2285a<Integer> m11282a(String str, int i, int i2) {
            C2285a<Integer> aVar = new C2285a<>(str, Integer.valueOf(i), Integer.valueOf(i2));
            C2284h.f8562b.add(aVar);
            return aVar;
        }

        /* renamed from: a */
        static C2285a<Double> m11281a(String str, double d, double d2) {
            C2285a<Double> aVar = new C2285a<>(str, Double.valueOf(-3.0d), Double.valueOf(-3.0d));
            C2284h.f8566f.add(aVar);
            return aVar;
        }

        /* renamed from: a */
        public final String mo14803a() {
            return this.f8591e;
        }

        /* access modifiers changed from: private */
        /* renamed from: d */
        public static void m11287d() {
            synchronized (C2285a.class) {
                for (C2285a next : C2284h.f8564d) {
                    C1947cm a = C2284h.f8557av;
                    String str = next.f8591e;
                    C2270er erVar = C2284h.f8534a;
                    next.f8587a = a.mo13563a(str, ((Boolean) next.f8589c).booleanValue());
                }
                for (C2285a next2 : C2284h.f8565e) {
                    C1947cm a2 = C2284h.f8557av;
                    String str2 = next2.f8591e;
                    C2270er erVar2 = C2284h.f8534a;
                    next2.f8587a = a2.mo13562a(str2, (String) next2.f8589c);
                }
                for (C2285a next3 : C2284h.f8563c) {
                    C1947cm a3 = C2284h.f8557av;
                    String str3 = next3.f8591e;
                    C2270er erVar3 = C2284h.f8534a;
                    next3.f8587a = a3.mo13561a(str3, ((Long) next3.f8589c).longValue());
                }
                for (C2285a next4 : C2284h.f8562b) {
                    C1947cm a4 = C2284h.f8557av;
                    String str4 = next4.f8591e;
                    C2270er erVar4 = C2284h.f8534a;
                    next4.f8587a = a4.mo13560a(str4, ((Integer) next4.f8589c).intValue());
                }
                for (C2285a next5 : C2284h.f8566f) {
                    C1947cm a5 = C2284h.f8557av;
                    String str5 = next5.f8591e;
                    C2270er erVar5 = C2284h.f8534a;
                    next5.f8587a = a5.mo13559a(str5, ((Double) next5.f8589c).doubleValue());
                }
            }
        }

        @WorkerThread
        /* renamed from: e */
        private static void m11288e() {
            synchronized (C2285a.class) {
                if (!C2270er.m11151a()) {
                    C2270er erVar = C2284h.f8534a;
                    try {
                        for (C2285a next : C2284h.f8564d) {
                            next.f8590d = next.f8587a.mo13558d();
                        }
                        for (C2285a next2 : C2284h.f8565e) {
                            next2.f8590d = next2.f8587a.mo13558d();
                        }
                        for (C2285a next3 : C2284h.f8563c) {
                            next3.f8590d = next3.f8587a.mo13558d();
                        }
                        for (C2285a next4 : C2284h.f8562b) {
                            next4.f8590d = next4.f8587a.mo13558d();
                        }
                        for (C2285a next5 : C2284h.f8566f) {
                            next5.f8590d = next5.f8587a.mo13558d();
                        }
                    } catch (SecurityException e) {
                        C2284h.m11280a((Exception) e);
                    }
                } else {
                    throw new IllegalStateException("Tried to refresh flag cache on main thread or on package side.");
                }
            }
        }

        /* renamed from: b */
        public final V mo14804b() {
            if (C2284h.f8534a == null) {
                return this.f8589c;
            }
            C2270er erVar = C2284h.f8534a;
            if (C2270er.m11151a()) {
                return this.f8590d == null ? this.f8589c : this.f8590d;
            }
            m11288e();
            try {
                return this.f8587a.mo13558d();
            } catch (SecurityException e) {
                C2284h.m11280a((Exception) e);
                return this.f8587a.mo13557c();
            }
        }

        /* renamed from: a */
        public final V mo14802a(V v) {
            if (v != null) {
                return v;
            }
            if (C2284h.f8534a == null) {
                return this.f8589c;
            }
            C2270er erVar = C2284h.f8534a;
            if (C2270er.m11151a()) {
                return this.f8590d == null ? this.f8589c : this.f8590d;
            }
            m11288e();
            try {
                return this.f8587a.mo13558d();
            } catch (SecurityException e) {
                C2284h.m11280a((Exception) e);
                return this.f8587a.mo13557c();
            }
        }
    }

    /* renamed from: a */
    static void m11278a(C2166aw awVar) {
        f8558aw = awVar;
    }

    /* renamed from: a */
    static void m11280a(Exception exc) {
        if (f8558aw != null) {
            Context n = f8558aw.mo14231n();
            if (f8559ax == null) {
                f8559ax = Boolean.valueOf(C0851d.m1126b().mo9722b(n, (int) C0858g.GOOGLE_PLAY_SERVICES_VERSION_CODE) == 0);
            }
            if (f8559ax.booleanValue()) {
                f8558aw.mo14235r().mo14830d_().mo14842a("Got Exception on PhenotypeFlag.get on Play device", exc);
            }
        }
    }

    /* renamed from: a */
    static void m11279a(C2270er erVar) {
        f8534a = erVar;
        C2285a.m11287d();
    }
}
