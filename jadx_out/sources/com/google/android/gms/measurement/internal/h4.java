package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import android.util.Pair;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

/* JADX INFO: loaded from: classes.dex */
final class h4 extends v5 {
    static final Pair<String, Long> x = new Pair<>("", 0L);
    private SharedPreferences c;
    public e4 d;
    public final d4 e;
    public final d4 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final g4 f1210g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f1211h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f1212i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long f1213j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final d4 f1214k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final b4 f1215l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final g4 f1216m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final b4 f1217n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final d4 f1218o;
    public boolean p;
    public final b4 q;
    public final b4 r;
    public final d4 s;
    public final g4 t;
    public final g4 u;
    public final d4 v;
    public final c4 w;

    h4(a5 a5Var) {
        super(a5Var);
        this.f1214k = new d4(this, "session_timeout", 1800000L);
        this.f1215l = new b4(this, "start_new_session", true);
        this.f1218o = new d4(this, "last_pause_time", 0L);
        this.f1216m = new g4(this, "non_personalized_ads", null);
        this.f1217n = new b4(this, "allow_remote_dynamite", false);
        this.e = new d4(this, "first_open_time", 0L);
        this.f = new d4(this, "app_install_time", 0L);
        this.f1210g = new g4(this, "app_instance_id", null);
        this.q = new b4(this, "app_backgrounded", false);
        this.r = new b4(this, "deep_link_retrieval_complete", false);
        this.s = new d4(this, "deep_link_retrieval_attempts", 0L);
        this.t = new g4(this, "firebase_feature_rollouts", null);
        this.u = new g4(this, "deferred_attribution_cache", null);
        this.v = new d4(this, "deferred_attribution_cache_timestamp", 0L);
        this.w = new c4(this, "default_event_parameters", null);
    }

    @Override // com.google.android.gms.measurement.internal.v5
    protected final boolean i() {
        return true;
    }

    @Override // com.google.android.gms.measurement.internal.v5
    @EnsuresNonNull.List({@EnsuresNonNull({"this.preferences"}), @EnsuresNonNull({"this.monitoringSample"})})
    protected final void j() {
        SharedPreferences sharedPreferences = this.a.c().getSharedPreferences("com.google.android.gms.measurement.prefs", 0);
        this.c = sharedPreferences;
        boolean z = sharedPreferences.getBoolean("has_been_opened", false);
        this.p = z;
        if (!z) {
            SharedPreferences.Editor editorEdit = this.c.edit();
            editorEdit.putBoolean("has_been_opened", true);
            editorEdit.apply();
        }
        this.a.z();
        this.d = new e4(this, "health_monitor", Math.max(0L, f3.c.b(null).longValue()), null);
    }

    final Pair<String, Boolean> o(String str) {
        h();
        long jC = this.a.e().c();
        String str2 = this.f1211h;
        if (str2 != null && jC < this.f1213j) {
            return new Pair<>(str2, Boolean.valueOf(this.f1212i));
        }
        this.f1213j = jC + this.a.z().s(str, f3.b);
        j.d.a.c.a.a.a.d(true);
        try {
            j.d.a.c.a.a.a.C0230a c0230aB = j.d.a.c.a.a.a.b(this.a.c());
            this.f1211h = "";
            String strA = c0230aB.a();
            if (strA != null) {
                this.f1211h = strA;
            }
            this.f1212i = c0230aB.b();
        } catch (Exception e) {
            this.a.d().v().b("Unable to get advertising id", e);
            this.f1211h = "";
        }
        j.d.a.c.a.a.a.d(false);
        return new Pair<>(this.f1211h, Boolean.valueOf(this.f1212i));
    }

    protected final SharedPreferences p() {
        h();
        l();
        com.google.android.gms.common.internal.q.k(this.c);
        return this.c;
    }

    final void q(Boolean bool) {
        h();
        SharedPreferences.Editor editorEdit = p().edit();
        if (bool != null) {
            editorEdit.putBoolean("measurement_enabled", bool.booleanValue());
        } else {
            editorEdit.remove("measurement_enabled");
        }
        editorEdit.apply();
    }

    final Boolean r() {
        h();
        if (p().contains("measurement_enabled")) {
            return Boolean.valueOf(p().getBoolean("measurement_enabled", true));
        }
        return null;
    }

    final boolean s(int i2) {
        return g.m(i2, p().getInt("consent_source", 100));
    }

    final g t() {
        h();
        return g.c(p().getString("consent_settings", "G1"));
    }

    final void u(boolean z) {
        h();
        this.a.d().w().b("App measurement setting deferred collection", Boolean.valueOf(z));
        SharedPreferences.Editor editorEdit = p().edit();
        editorEdit.putBoolean("deferred_analytics_collection", z);
        editorEdit.apply();
    }

    final boolean v() {
        SharedPreferences sharedPreferences = this.c;
        if (sharedPreferences == null) {
            return false;
        }
        return sharedPreferences.contains("deferred_analytics_collection");
    }

    final boolean w(long j2) {
        return j2 - this.f1214k.a() > this.f1218o.a();
    }
}
