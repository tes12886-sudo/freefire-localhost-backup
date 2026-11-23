package com.facebook.login;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import com.facebook.internal.f0;
import com.facebook.internal.h0;

/* JADX INFO: loaded from: classes.dex */
abstract class t extends q {
    t(Parcel parcel) {
        super(parcel);
    }

    t(l lVar) {
        super(lVar);
    }

    private void r(l.e eVar) {
        if (eVar != null) {
            h().g(eVar);
        } else {
            h().C();
        }
    }

    @Override // com.facebook.login.q
    public boolean m(int i2, int i3, Intent intent) {
        l.e eVarC;
        l.d dVarQ = h().q();
        if (intent != null) {
            if (i3 == 0) {
                v(dVarQ, intent);
            } else {
                if (i3 != -1) {
                    eVarC = l.e.c(dVarQ, "Unexpected resultCode from authorization.", null);
                } else {
                    Bundle extras = intent.getExtras();
                    if (extras == null) {
                        r(l.e.c(dVarQ, "Unexpected null from returned authorization data.", null));
                        return true;
                    }
                    String strS = s(extras);
                    String string = extras.get("error_code") != null ? extras.get("error_code").toString() : null;
                    String strT = t(extras);
                    String string2 = extras.getString("e2e");
                    if (!h0.Y(string2)) {
                        k(string2);
                    }
                    if (strS == null && string == null && strT == null) {
                        x(dVarQ, extras);
                    } else {
                        w(dVarQ, strS, strT, string);
                    }
                }
            }
            return true;
        }
        eVarC = l.e.a(dVarQ, "Operation canceled");
        r(eVarC);
        return true;
    }

    protected String s(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        String string = bundle.getString("error");
        return string == null ? bundle.getString("error_type") : string;
    }

    protected String t(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        String string = bundle.getString("error_message");
        return string == null ? bundle.getString("error_description") : string;
    }

    public com.facebook.e u() {
        return com.facebook.e.FACEBOOK_APPLICATION_WEB;
    }

    protected void v(l.d dVar, Intent intent) {
        Bundle extras = intent.getExtras();
        String strS = s(extras);
        String string = extras.get("error_code") != null ? extras.get("error_code").toString() : null;
        if (f0.c().equals(string)) {
            r(l.e.d(dVar, strS, t(extras), string));
        }
        r(l.e.a(dVar, strS));
    }

    protected void w(l.d dVar, String str, String str2, String str3) {
        if (str != null && str.equals("logged_out")) {
            a.f687h = true;
        } else if (!f0.d().contains(str)) {
            r(f0.e().contains(str) ? l.e.a(dVar, null) : l.e.d(dVar, str, str2, str3));
            return;
        }
        r(null);
    }

    protected void x(l.d dVar, Bundle bundle) {
        try {
            r(l.e.b(dVar, q.d(dVar.k(), bundle, u(), dVar.a()), q.f(bundle, dVar.j())));
        } catch (com.facebook.n e) {
            r(l.e.c(dVar, null, e.getMessage()));
        }
    }

    protected boolean y(Intent intent, int i2) {
        if (intent == null) {
            return false;
        }
        try {
            h().l().startActivityForResult(intent, i2);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }
}
