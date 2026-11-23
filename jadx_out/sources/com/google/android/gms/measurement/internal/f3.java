package com.google.android.gms.measurement.internal;

import android.content.Context;
import com.FF.voiceengine.FFVoiceConst;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class f3 {
    public static final d3<Long> A;
    public static final d3<Boolean> A0;
    public static final d3<Long> B;
    public static final d3<Boolean> B0;
    public static final d3<Integer> C;
    public static final d3<Long> D;
    public static final d3<Integer> E;
    public static final d3<Integer> F;
    public static final d3<Integer> G;
    public static final d3<Integer> H;
    public static final d3<Integer> I;
    public static final d3<Long> J;
    public static final d3<Boolean> K;
    public static final d3<String> L;
    public static final d3<Long> M;
    public static final d3<Integer> N;
    public static final d3<Double> O;
    public static final d3<Integer> P;
    public static final d3<Integer> Q;
    public static final d3<Long> R;
    public static final d3<Boolean> S;
    public static final d3<Boolean> T;
    public static final d3<Boolean> U;
    public static final d3<Boolean> V;
    public static final d3<Boolean> W;
    public static final d3<Boolean> X;
    public static final d3<Boolean> Y;
    public static final d3<Boolean> Z;
    private static final List<d3<?>> a = Collections.synchronizedList(new ArrayList());
    public static final d3<Boolean> a0;
    public static final d3<Long> b;
    public static final d3<Boolean> b0;
    public static final d3<Long> c;
    public static final d3<Boolean> c0;
    public static final d3<Long> d;
    public static final d3<Boolean> d0;
    public static final d3<String> e;
    public static final d3<Boolean> e0;
    public static final d3<String> f;
    public static final d3<Boolean> f0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final d3<Integer> f1192g;
    public static final d3<Boolean> g0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final d3<Integer> f1193h;
    public static final d3<Boolean> h0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final d3<Integer> f1194i;
    public static final d3<Boolean> i0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final d3<Integer> f1195j;
    public static final d3<Boolean> j0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final d3<Integer> f1196k;
    public static final d3<Boolean> k0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final d3<Integer> f1197l;
    public static final d3<Boolean> l0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final d3<Integer> f1198m;
    public static final d3<Boolean> m0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final d3<Integer> f1199n;
    public static final d3<Boolean> n0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final d3<Integer> f1200o;
    public static final d3<Boolean> o0;
    public static final d3<Integer> p;
    public static final d3<Boolean> p0;
    public static final d3<String> q;
    public static final d3<Boolean> q0;
    public static final d3<Long> r;
    public static final d3<Boolean> r0;
    public static final d3<Long> s;
    public static final d3<Boolean> s0;
    public static final d3<Long> t;
    public static final d3<Boolean> t0;
    public static final d3<Long> u;
    public static final d3<Integer> u0;
    public static final d3<Long> v;
    public static final d3<Boolean> v0;
    public static final d3<Long> w;
    public static final d3<Boolean> w0;
    public static final d3<Long> x;
    public static final d3<Boolean> x0;
    public static final d3<Long> y;
    public static final d3<Boolean> y0;
    public static final d3<Long> z;
    public static final d3<Boolean> z0;

    static {
        Collections.synchronizedSet(new HashSet());
        b = b("measurement.ad_id_cache_time", 10000L, 10000L, v.a);
        c = b("measurement.monitoring.sample_period_millis", 86400000L, 86400000L, h0.a);
        d = b("measurement.config.cache_time", 86400000L, 3600000L, s0.a);
        e = b("measurement.config.url_scheme", "https", "https", e1.a);
        f = b("measurement.config.url_authority", "app-measurement.com", "app-measurement.com", p1.a);
        f1192g = b("measurement.upload.max_bundles", 100, 100, a2.a);
        f1193h = b("measurement.upload.max_batch_size", 65536, 65536, m2.a);
        f1194i = b("measurement.upload.max_bundle_size", 65536, 65536, x2.a);
        Integer numValueOf = Integer.valueOf(FFVoiceConst.FFVoiceEvent.FFVoice_EVENT_EOF);
        f1195j = b("measurement.upload.max_events_per_bundle", numValueOf, numValueOf, y2.a);
        f1196k = b("measurement.upload.max_events_per_day", 100000, 100000, z2.a);
        f1197l = b("measurement.upload.max_error_events_per_day", numValueOf, numValueOf, w.a);
        f1198m = b("measurement.upload.max_public_events_per_day", 50000, 50000, x.a);
        Integer numValueOf2 = Integer.valueOf(FFVoiceConst.FFVoice_RTC_SERVER_REGION.RTC_EXT_SERVER);
        f1199n = b("measurement.upload.max_conversions_per_day", numValueOf2, numValueOf2, y.a);
        f1200o = b("measurement.upload.max_realtime_events_per_day", 10, 10, z.a);
        p = b("measurement.store.max_stored_events_per_app", 100000, 100000, a0.a);
        q = b("measurement.upload.url", "https://app-measurement.com/a", "https://app-measurement.com/a", c0.a);
        r = b("measurement.upload.backoff_period", 43200000L, 43200000L, d0.a);
        s = b("measurement.upload.window_interval", 3600000L, 3600000L, e0.a);
        t = b("measurement.upload.interval", 3600000L, 3600000L, f0.a);
        u = b("measurement.upload.realtime_upload_interval", 10000L, 10000L, g0.a);
        v = b("measurement.upload.debug_upload_interval", 1000L, 1000L, i0.a);
        w = b("measurement.upload.minimum_delay", 500L, 500L, j0.a);
        x = b("measurement.alarm_manager.minimum_interval", 60000L, 60000L, k0.a);
        y = b("measurement.upload.stale_data_deletion_interval", 86400000L, 86400000L, l0.a);
        z = b("measurement.upload.refresh_blacklisted_config_interval", 604800000L, 604800000L, m0.a);
        A = b("measurement.upload.initial_upload_delay_time", 15000L, 15000L, n0.a);
        B = b("measurement.upload.retry_time", 1800000L, 1800000L, o0.a);
        C = b("measurement.upload.retry_count", 6, 6, p0.a);
        D = b("measurement.upload.max_queue_time", 2419200000L, 2419200000L, q0.a);
        E = b("measurement.lifetimevalue.max_currency_tracked", 4, 4, r0.a);
        Integer numValueOf3 = Integer.valueOf(j.d.a.e.a.a.i.g.STATUS_SUCCESS);
        F = b("measurement.audience.filter_result_max_count", numValueOf3, numValueOf3, t0.a);
        G = b("measurement.upload.max_public_user_properties", 25, 25, null);
        H = b("measurement.upload.max_event_name_cardinality", 500, 500, null);
        I = b("measurement.upload.max_public_event_params", 25, 25, null);
        J = b("measurement.service_client.idle_disconnect_millis", 5000L, 5000L, u0.a);
        Boolean bool = Boolean.FALSE;
        K = b("measurement.test.boolean_flag", bool, bool, v0.a);
        L = b("measurement.test.string_flag", "---", "---", w0.a);
        M = b("measurement.test.long_flag", -1L, -1L, x0.a);
        N = b("measurement.test.int_flag", -2, -2, y0.a);
        Double dValueOf = Double.valueOf(-3.0d);
        O = b("measurement.test.double_flag", dValueOf, dValueOf, z0.a);
        P = b("measurement.experiment.max_ids", 50, 50, a1.a);
        Q = b("measurement.max_bundles_per_iteration", 100, 100, b1.a);
        R = b("measurement.sdk.attribution.cache.ttl", 604800000L, 604800000L, d1.a);
        S = b("measurement.validation.internal_limits_internal_event_params", bool, bool, f1.a);
        Boolean bool2 = Boolean.TRUE;
        T = b("measurement.collection.firebase_global_collection_flag_enabled", bool2, bool2, g1.a);
        U = b("measurement.collection.redundant_engagement_removal_enabled", bool, bool, h1.a);
        V = b("measurement.collection.log_event_and_bundle_v2", bool2, bool2, i1.a);
        W = b("measurement.quality.checksum", bool, bool, null);
        X = b("measurement.sdk.collection.validate_param_names_alphabetical", bool2, bool2, j1.a);
        Y = b("measurement.audience.use_bundle_end_timestamp_for_non_sequence_property_filters", bool, bool, k1.a);
        Z = b("measurement.audience.refresh_event_count_filters_timestamp", bool, bool, l1.a);
        a0 = b("measurement.audience.use_bundle_timestamp_for_event_count_filters", bool, bool, m1.a);
        b0 = b("measurement.sdk.collection.retrieve_deeplink_from_bow_2", bool2, bool2, n1.a);
        c0 = b("measurement.sdk.collection.last_deep_link_referrer2", bool2, bool2, o1.a);
        d0 = b("measurement.sdk.collection.last_deep_link_referrer_campaign2", bool, bool, q1.a);
        e0 = b("measurement.sdk.collection.last_gclid_from_referrer2", bool, bool, r1.a);
        f0 = b("measurement.sdk.collection.enable_extend_user_property_size", bool2, bool2, s1.a);
        g0 = b("measurement.upload.file_lock_state_check", bool2, bool2, t1.a);
        h0 = b("measurement.ga.ga_app_id", bool, bool, u1.a);
        i0 = b("measurement.lifecycle.app_in_background_parameter", bool, bool, v1.a);
        j0 = b("measurement.integration.disable_firebase_instance_id", bool, bool, w1.a);
        k0 = b("measurement.lifecycle.app_backgrounded_engagement", bool, bool, x1.a);
        l0 = b("measurement.collection.service.update_with_analytics_fix", bool, bool, y1.a);
        m0 = b("measurement.service.use_appinfo_modified", bool2, bool2, z1.a);
        n0 = b("measurement.client.firebase_feature_rollout.v1.enable", bool2, bool2, b2.a);
        o0 = b("measurement.client.sessions.check_on_reset_and_enable2", bool2, bool2, c2.a);
        p0 = b("measurement.scheduler.task_thread.cleanup_on_exit", bool, bool, e2.a);
        q0 = b("measurement.upload.file_truncate_fix", bool, bool, f2.a);
        r0 = b("measurement.sdk.screen.disabling_automatic_reporting", bool2, bool2, g2.a);
        s0 = b("measurement.sdk.screen.manual_screen_view_logging", bool2, bool2, h2.a);
        b("measurement.collection.synthetic_data_mitigation", bool, bool, i2.a);
        t0 = b("measurement.androidId.delete_feature", bool2, bool2, j2.a);
        u0 = b("measurement.service.storage_consent_support_version", 203600, 203600, k2.a);
        v0 = b("measurement.upload.directly_maybe_log_error_events", bool2, bool2, l2.a);
        w0 = b("measurement.frontend.directly_maybe_log_error_events", bool, bool, n2.a);
        x0 = b("measurement.client.properties.non_null_origin", bool2, bool2, o2.a);
        b("measurement.client.click_identifier_control.dev", bool, bool, p2.a);
        b("measurement.service.click_identifier_control", bool, bool, q2.a);
        y0 = b("measurement.client.reject_blank_user_id", bool2, bool2, r2.a);
        z0 = b("measurement.config.persist_last_modified", bool2, bool2, s2.a);
        A0 = b("measurement.client.consent.suppress_1p_in_ga4f_install", bool2, bool2, t2.a);
        B0 = b("measurement.module.pixie.ees", bool, bool, u2.a);
        b("measurement.euid.client.dev", bool, bool, v2.a);
        b("measurement.euid.service", bool, bool, w2.a);
    }

    public static Map<String, String> a(Context context) {
        com.google.android.gms.internal.measurement.w5 w5VarB = com.google.android.gms.internal.measurement.w5.b(context.getContentResolver(), com.google.android.gms.internal.measurement.g6.a("com.google.android.gms.measurement"));
        return w5VarB == null ? Collections.emptyMap() : w5VarB.c();
    }

    static <V> d3<V> b(String str, V v2, V v3, b3<V> b3Var) {
        d3<V> d3Var = new d3<>(str, v2, v3, b3Var, null);
        a.add(d3Var);
        return d3Var;
    }
}
