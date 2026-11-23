package com.google.android.gms.measurement.internal;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;

/* JADX INFO: loaded from: classes.dex */
public final class la {
    private final a5 a;

    public la(a5 a5Var) {
        this.a = a5Var;
    }

    final void a() {
        this.a.f().h();
        if (e()) {
            if (d()) {
                this.a.A().u.b(null);
                Bundle bundle = new Bundle();
                bundle.putString("source", "(not set)");
                bundle.putString("medium", "(not set)");
                bundle.putString("_cis", "intent");
                bundle.putLong("_cc", 1L);
                this.a.F().X("auto", "_cmpx", bundle);
            } else {
                String strA = this.a.A().u.a();
                if (TextUtils.isEmpty(strA)) {
                    this.a.d().p().a("Cache still valid but referrer not found");
                } else {
                    long jA = ((this.a.A().v.a() / 3600000) - 1) * 3600000;
                    Uri uri = Uri.parse(strA);
                    Bundle bundle2 = new Bundle();
                    Pair pair = new Pair(uri.getPath(), bundle2);
                    for (String str : uri.getQueryParameterNames()) {
                        bundle2.putString(str, uri.getQueryParameter(str));
                    }
                    ((Bundle) pair.second).putLong("_cc", jA);
                    this.a.F().X((String) pair.first, "_cmp", (Bundle) pair.second);
                }
                this.a.A().u.b(null);
            }
            this.a.A().v.b(0L);
        }
    }

    final void b(String str, Bundle bundle) {
        String string;
        this.a.f().h();
        if (this.a.k()) {
            return;
        }
        if (bundle.isEmpty()) {
            string = null;
        } else {
            if (true == str.isEmpty()) {
                str = "auto";
            }
            Uri.Builder builder = new Uri.Builder();
            builder.path(str);
            for (String str2 : bundle.keySet()) {
                builder.appendQueryParameter(str2, bundle.getString(str2));
            }
            string = builder.build().toString();
        }
        if (TextUtils.isEmpty(string)) {
            return;
        }
        this.a.A().u.b(string);
        this.a.A().v.b(this.a.e().a());
    }

    final void c() {
        if (e() && d()) {
            this.a.A().u.b(null);
        }
    }

    final boolean d() {
        return e() && this.a.e().a() - this.a.A().v.a() > this.a.z().s(null, f3.R);
    }

    final boolean e() {
        return this.a.A().v.a() > 0;
    }
}
