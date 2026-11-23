package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
public final class nc implements mc {
    public static final p6<Long> A;
    public static final p6<Long> B;
    public static final p6<Long> C;
    public static final p6<Long> D;
    public static final p6<Long> E;
    public static final p6<Long> F;
    public static final p6<Long> G;
    public static final p6<String> H;
    public static final p6<Long> I;
    public static final p6<Long> a;
    public static final p6<Long> b;
    public static final p6<Long> c;
    public static final p6<String> d;
    public static final p6<String> e;
    public static final p6<Long> f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final p6<Long> f1089g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final p6<Long> f1090h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final p6<Long> f1091i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final p6<Long> f1092j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final p6<Long> f1093k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final p6<Long> f1094l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final p6<Long> f1095m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final p6<Long> f1096n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final p6<Long> f1097o;
    public static final p6<Long> p;
    public static final p6<Long> q;
    public static final p6<Long> r;
    public static final p6<Long> s;
    public static final p6<Long> t;
    public static final p6<Long> u;
    public static final p6<Long> v;
    public static final p6<Long> w;
    public static final p6<Long> x;
    public static final p6<Long> y;
    public static final p6<Long> z;

    static {
        n6 n6Var = new n6(g6.a("com.google.android.gms.measurement"));
        a = n6Var.a("measurement.ad_id_cache_time", 10000L);
        b = n6Var.a("measurement.max_bundles_per_iteration", 100L);
        c = n6Var.a("measurement.config.cache_time", 86400000L);
        n6Var.d("measurement.log_tag", "FA");
        d = n6Var.d("measurement.config.url_authority", "app-measurement.com");
        e = n6Var.d("measurement.config.url_scheme", "https");
        f = n6Var.a("measurement.upload.debug_upload_interval", 1000L);
        f1089g = n6Var.a("measurement.lifetimevalue.max_currency_tracked", 4L);
        f1090h = n6Var.a("measurement.store.max_stored_events_per_app", 100000L);
        f1091i = n6Var.a("measurement.experiment.max_ids", 50L);
        f1092j = n6Var.a("measurement.audience.filter_result_max_count", 200L);
        f1093k = n6Var.a("measurement.alarm_manager.minimum_interval", 60000L);
        f1094l = n6Var.a("measurement.upload.minimum_delay", 500L);
        f1095m = n6Var.a("measurement.monitoring.sample_period_millis", 86400000L);
        f1096n = n6Var.a("measurement.upload.realtime_upload_interval", 10000L);
        f1097o = n6Var.a("measurement.upload.refresh_blacklisted_config_interval", 604800000L);
        n6Var.a("measurement.config.cache_time.service", 3600000L);
        p = n6Var.a("measurement.service_client.idle_disconnect_millis", 5000L);
        n6Var.d("measurement.log_tag.service", "FA-SVC");
        q = n6Var.a("measurement.upload.stale_data_deletion_interval", 86400000L);
        r = n6Var.a("measurement.sdk.attribution.cache.ttl", 604800000L);
        s = n6Var.a("measurement.upload.backoff_period", 43200000L);
        t = n6Var.a("measurement.upload.initial_upload_delay_time", 15000L);
        u = n6Var.a("measurement.upload.interval", 3600000L);
        v = n6Var.a("measurement.upload.max_bundle_size", 65536L);
        w = n6Var.a("measurement.upload.max_bundles", 100L);
        x = n6Var.a("measurement.upload.max_conversions_per_day", 500L);
        y = n6Var.a("measurement.upload.max_error_events_per_day", 1000L);
        z = n6Var.a("measurement.upload.max_events_per_bundle", 1000L);
        A = n6Var.a("measurement.upload.max_events_per_day", 100000L);
        B = n6Var.a("measurement.upload.max_public_events_per_day", 50000L);
        C = n6Var.a("measurement.upload.max_queue_time", 2419200000L);
        D = n6Var.a("measurement.upload.max_realtime_events_per_day", 10L);
        E = n6Var.a("measurement.upload.max_batch_size", 65536L);
        F = n6Var.a("measurement.upload.retry_count", 6L);
        G = n6Var.a("measurement.upload.retry_time", 1800000L);
        H = n6Var.d("measurement.upload.url", "https://app-measurement.com/a");
        I = n6Var.a("measurement.upload.window_interval", 3600000L);
    }

    @Override // com.google.android.gms.internal.measurement.mc
    public final long A() {
        return s.e().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.mc
    public final long B() {
        return D.e().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.mc
    public final long C() {
        return f1097o.e().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.mc
    public final long D() {
        return I.e().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.mc
    public final long E() {
        return E.e().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.mc
    public final long F() {
        return x.e().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.mc
    public final long G() {
        return A.e().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.mc
    public final long a() {
        return f1091i.e().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.mc
    public final long b() {
        return c.e().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.mc
    public final String c() {
        return d.e();
    }

    @Override // com.google.android.gms.internal.measurement.mc
    public final String d() {
        return e.e();
    }

    @Override // com.google.android.gms.internal.measurement.mc
    public final long e() {
        return f1090h.e().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.mc
    public final long f() {
        return f1092j.e().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.mc
    public final long g() {
        return f1093k.e().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.mc
    public final long h() {
        return f.e().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.mc
    public final long i() {
        return f1089g.e().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.mc
    public final long j() {
        return t.e().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.mc
    public final long k() {
        return p.e().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.mc
    public final long l() {
        return f1094l.e().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.mc
    public final long m() {
        return F.e().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.mc
    public final long n() {
        return y.e().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.mc
    public final long o() {
        return B.e().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.mc
    public final long p() {
        return u.e().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.mc
    public final long q() {
        return q.e().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.mc
    public final long r() {
        return z.e().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.mc
    public final long s() {
        return f1095m.e().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.mc
    public final long t() {
        return v.e().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.mc
    public final long u() {
        return G.e().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.mc
    public final long v() {
        return r.e().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.mc
    public final long w() {
        return C.e().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.mc
    public final long x() {
        return f1096n.e().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.mc
    public final long y() {
        return w.e().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.mc
    public final String z() {
        return H.e();
    }

    @Override // com.google.android.gms.internal.measurement.mc
    public final long zza() {
        return a.e().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.mc
    public final long zzb() {
        return b.e().longValue();
    }
}
