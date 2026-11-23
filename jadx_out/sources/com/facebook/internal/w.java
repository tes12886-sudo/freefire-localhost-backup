package com.facebook.internal;

import android.net.Uri;
import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public final class w extends f {
    public static final a c = new a(null);

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(l.y.c.f fVar) {
            this();
        }

        public final Uri a(String str, Bundle bundle) {
            l.y.c.i.e(str, "action");
            if (l.y.c.i.a(str, "oauth")) {
                return h0.f(f0.j(), "oauth/authorize", bundle);
            }
            return h0.f(f0.j(), com.facebook.r.p() + "/dialog/" + str, bundle);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(String str, Bundle bundle) {
        super(str, bundle);
        l.y.c.i.e(str, "action");
        c(c.a(str, bundle == null ? new Bundle() : bundle));
    }
}
