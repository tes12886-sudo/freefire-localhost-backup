package com.facebook.internal;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.net.Uri;
import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public class f {
    public static final a b = new a(null);
    private Uri a;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(l.y.c.f fVar) {
            this();
        }

        public Uri a(String str, Bundle bundle) {
            l.y.c.i.e(str, "action");
            return h0.f(f0.b(), com.facebook.r.p() + "/dialog/" + str, bundle);
        }
    }

    public f(String str, Bundle bundle) {
        l.y.c.i.e(str, "action");
        this.a = b.a(str, bundle == null ? new Bundle() : bundle);
    }

    public static Uri a(String str, Bundle bundle) {
        if (com.facebook.internal.m0.i.a.d(f.class)) {
            return null;
        }
        try {
            return b.a(str, bundle);
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, f.class);
            return null;
        }
    }

    public final boolean b(Activity activity, String str) {
        if (com.facebook.internal.m0.i.a.d(this)) {
            return false;
        }
        try {
            l.y.c.i.e(activity, "activity");
            h.d.b.d dVarA = new h.d.b.d.a(com.facebook.login.b.c()).a();
            dVarA.a.setPackage(str);
            try {
                dVarA.a(activity, this.a);
                return true;
            } catch (ActivityNotFoundException unused) {
                return false;
            }
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, this);
            return false;
        }
    }

    protected final void c(Uri uri) {
        if (com.facebook.internal.m0.i.a.d(this)) {
            return;
        }
        try {
            l.y.c.i.e(uri, "<set-?>");
            this.a = uri;
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, this);
        }
    }
}
