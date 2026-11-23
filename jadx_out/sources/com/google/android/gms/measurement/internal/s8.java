package com.google.android.gms.measurement.internal;

import android.util.Pair;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class s8 extends m9 {
    private String d;
    private boolean e;
    private long f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final d4 f1281g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final d4 f1282h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final d4 f1283i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final d4 f1284j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final d4 f1285k;

    s8(v9 v9Var) {
        super(v9Var);
        h4 h4VarA = this.a.A();
        h4VarA.getClass();
        this.f1281g = new d4(h4VarA, "last_delete_stale", 0L);
        h4 h4VarA2 = this.a.A();
        h4VarA2.getClass();
        this.f1282h = new d4(h4VarA2, "backoff", 0L);
        h4 h4VarA3 = this.a.A();
        h4VarA3.getClass();
        this.f1283i = new d4(h4VarA3, "last_upload", 0L);
        h4 h4VarA4 = this.a.A();
        h4VarA4.getClass();
        this.f1284j = new d4(h4VarA4, "last_upload_attempt", 0L);
        h4 h4VarA5 = this.a.A();
        h4VarA5.getClass();
        this.f1285k = new d4(h4VarA5, "midnight_offset", 0L);
    }

    @Override // com.google.android.gms.measurement.internal.m9
    protected final boolean k() {
        return false;
    }

    final Pair<String, Boolean> m(String str, g gVar) {
        return gVar.f() ? n(str) : new Pair<>("", Boolean.FALSE);
    }

    @Deprecated
    final Pair<String, Boolean> n(String str) {
        h();
        long jC = this.a.e().c();
        String str2 = this.d;
        if (str2 != null && jC < this.f) {
            return new Pair<>(str2, Boolean.valueOf(this.e));
        }
        this.f = jC + this.a.z().s(str, f3.b);
        j.d.a.c.a.a.a.d(true);
        try {
            j.d.a.c.a.a.a.C0230a c0230aB = j.d.a.c.a.a.a.b(this.a.c());
            this.d = "";
            String strA = c0230aB.a();
            if (strA != null) {
                this.d = strA;
            }
            this.e = c0230aB.b();
        } catch (Exception e) {
            this.a.d().v().b("Unable to get advertising id", e);
            this.d = "";
        }
        j.d.a.c.a.a.a.d(false);
        return new Pair<>(this.d, Boolean.valueOf(this.e));
    }

    @Deprecated
    final String o(String str) {
        h();
        String str2 = (String) n(str).first;
        MessageDigest messageDigestB = ca.B();
        if (messageDigestB == null) {
            return null;
        }
        return String.format(Locale.US, "%032X", new BigInteger(1, messageDigestB.digest(str2.getBytes())));
    }
}
