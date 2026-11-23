package com.google.android.gms.common.internal;

import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public class x implements com.google.android.gms.common.api.a.d.c, com.google.android.gms.common.api.a.d {
    public static final x b = a().a();
    private final String a;

    public static class a {
        private String a;

        /* synthetic */ a(b0 b0Var) {
        }

        public x a() {
            return new x(this.a, null);
        }
    }

    /* synthetic */ x(String str, c0 c0Var) {
        this.a = str;
    }

    public static a a() {
        return new a(null);
    }

    public final Bundle c() {
        Bundle bundle = new Bundle();
        String str = this.a;
        if (str != null) {
            bundle.putString("api", str);
        }
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof x) {
            return o.a(this.a, ((x) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return o.b(this.a);
    }
}
