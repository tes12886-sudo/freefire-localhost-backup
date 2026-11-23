package com.facebook.login;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.CustomTabMainActivity;
import com.facebook.internal.h0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class a extends x {
    public static final Parcelable.Creator<a> CREATOR = new C0098a();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static boolean f687h;
    private String e;
    private String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f688g;

    /* JADX INFO: renamed from: com.facebook.login.a$a, reason: collision with other inner class name */
    static class C0098a implements Parcelable.Creator {
        C0098a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public a createFromParcel(Parcel parcel) {
            return new a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public a[] newArray(int i2) {
            return new a[i2];
        }
    }

    a(Parcel parcel) {
        super(parcel);
        this.f688g = "";
        this.f = parcel.readString();
    }

    a(l lVar) {
        super(lVar);
        this.f688g = "";
        this.f = h0.s(20);
        f687h = false;
        this.f688g = com.facebook.internal.g.c(A());
    }

    private String A() {
        return super.t();
    }

    private void B(String str, l.d dVar) {
        int i2;
        if (str != null) {
            if (str.startsWith("fbconnect://cct.") || str.startsWith(super.t())) {
                Uri uri = Uri.parse(str);
                Bundle bundleL0 = h0.l0(uri.getQuery());
                bundleL0.putAll(h0.l0(uri.getFragment()));
                if (!C(bundleL0)) {
                    super.x(dVar, null, new com.facebook.n("Invalid state parameter"));
                    return;
                }
                String string = bundleL0.getString("error");
                if (string == null) {
                    string = bundleL0.getString("error_type");
                }
                String string2 = bundleL0.getString("error_msg");
                if (string2 == null) {
                    string2 = bundleL0.getString("error_message");
                }
                if (string2 == null) {
                    string2 = bundleL0.getString("error_description");
                }
                String string3 = bundleL0.getString("error_code");
                if (h0.Y(string3)) {
                    i2 = -1;
                } else {
                    try {
                        i2 = Integer.parseInt(string3);
                    } catch (NumberFormatException unused) {
                        i2 = -1;
                    }
                }
                if (h0.Y(string) && h0.Y(string2) && i2 == -1) {
                    super.x(dVar, bundleL0, null);
                } else {
                    com.facebook.n tVar = ((string == null || !(string.equals("access_denied") || string.equals("OAuthAccessDeniedException"))) && i2 != 4201) ? new com.facebook.t(new com.facebook.q(i2, string, string2), string2) : new com.facebook.p();
                    super.x(dVar, null, tVar);
                }
            }
        }
    }

    private boolean C(Bundle bundle) {
        try {
            String string = bundle.getString("state");
            if (string == null) {
                return false;
            }
            return new JSONObject(string).getString("7_challenge").equals(this.f);
        } catch (JSONException unused) {
            return false;
        }
    }

    private String z() {
        String str = this.e;
        if (str != null) {
            return str;
        }
        String strA = com.facebook.internal.g.a();
        this.e = strA;
        return strA;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.facebook.login.q
    public String j() {
        return "custom_tab";
    }

    @Override // com.facebook.login.q
    public boolean m(int i2, int i3, Intent intent) {
        if ((intent == null || !intent.getBooleanExtra(CustomTabMainActivity.f556i, false)) && i2 == 1) {
            l.d dVarQ = h().q();
            if (i3 == -1) {
                B(intent != null ? intent.getStringExtra(CustomTabMainActivity.f) : null, dVarQ);
                return true;
            }
            super.x(dVarQ, null, new com.facebook.p());
            return false;
        }
        return super.m(i2, i3, intent);
    }

    @Override // com.facebook.login.q
    public void n(JSONObject jSONObject) throws JSONException {
        jSONObject.put("7_challenge", this.f);
    }

    @Override // com.facebook.login.q
    public int q(l.d dVar) {
        l lVarH = h();
        if (t().isEmpty()) {
            return 0;
        }
        Bundle bundleS = s(dVar);
        r(bundleS, dVar);
        if (f687h) {
            bundleS.putString("cct_over_app_switch", "1");
        }
        if (com.facebook.r.f736o) {
            dVar.o();
            b.d(com.facebook.internal.f.a("oauth", bundleS));
        }
        Intent intent = new Intent(lVarH.i(), (Class<?>) CustomTabMainActivity.class);
        intent.putExtra(CustomTabMainActivity.c, "oauth");
        intent.putExtra(CustomTabMainActivity.d, bundleS);
        intent.putExtra(CustomTabMainActivity.e, z());
        intent.putExtra(CustomTabMainActivity.f554g, dVar.h().toString());
        lVarH.l().startActivityForResult(intent, 1);
        return 1;
    }

    @Override // com.facebook.login.x
    protected String t() {
        return this.f688g;
    }

    @Override // com.facebook.login.x
    protected String u() {
        return "chrome_custom_tab";
    }

    @Override // com.facebook.login.x
    com.facebook.e v() {
        return com.facebook.e.CHROME_CUSTOM_TAB;
    }

    @Override // com.facebook.login.q, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        super.writeToParcel(parcel, i2);
        parcel.writeString(this.f);
    }
}
