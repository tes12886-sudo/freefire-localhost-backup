package com.facebook.m0;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.e;
import com.facebook.CustomTabMainActivity;
import com.facebook.internal.f;
import com.facebook.internal.g;
import com.facebook.internal.h0;
import com.facebook.r;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
class a {
    private Fragment a;
    private String b;
    protected String c;

    a(Fragment fragment) {
        this.a = fragment;
    }

    private void a(int i2, Intent intent) {
        e eVarM;
        if (!this.a.a0() || (eVarM = this.a.m()) == null) {
            return;
        }
        eVarM.setResult(i2, intent);
        eVarM.finish();
    }

    private String b() {
        if (this.b == null) {
            this.b = g.a();
        }
        return this.b;
    }

    static String c() {
        return "fb" + r.g() + "://authorize";
    }

    private Bundle d() {
        Bundle bundle = new Bundle();
        this.c = h0.s(20);
        bundle.putString("redirect_uri", g.c(c()));
        bundle.putString("app_id", r.g());
        bundle.putString("state", this.c);
        return bundle;
    }

    private boolean e() {
        return b() != null;
    }

    private boolean h() {
        if (this.a.m() == null || this.a.m().checkCallingOrSelfPermission("android.permission.INTERNET") != 0 || !e()) {
            return false;
        }
        Bundle bundleD = d();
        if (r.f736o) {
            com.facebook.login.b.d(f.a("share_referral", bundleD));
        }
        Intent intent = new Intent(this.a.m(), (Class<?>) CustomTabMainActivity.class);
        intent.putExtra(CustomTabMainActivity.c, "share_referral");
        intent.putExtra(CustomTabMainActivity.d, bundleD);
        intent.putExtra(CustomTabMainActivity.e, b());
        this.a.startActivityForResult(intent, 1);
        return true;
    }

    private boolean i(Bundle bundle) {
        if (this.c == null) {
            return true;
        }
        boolean zEquals = this.c.equals(bundle.getString("state"));
        this.c = null;
        return zEquals;
    }

    void f(int i2, int i3, Intent intent) {
        String stringExtra;
        if (i2 != 1) {
            return;
        }
        if (intent != null && (stringExtra = intent.getStringExtra(CustomTabMainActivity.f)) != null && stringExtra.startsWith(g.c(c()))) {
            Bundle bundleL0 = h0.l0(Uri.parse(stringExtra).getQuery());
            if (i(bundleL0)) {
                intent.putExtras(bundleL0);
            } else {
                i3 = 0;
                intent.putExtra("error_message", "The referral response was missing a valid challenge string.");
            }
        }
        a(i3, intent);
    }

    void g() {
        if (h()) {
            return;
        }
        Intent intent = new Intent();
        intent.putExtra("error_message", "Failed to open Referral dialog: Chrome custom tab could not be started. Please make sure internet permission is granted and Chrome is installed");
        a(0, intent);
    }
}
