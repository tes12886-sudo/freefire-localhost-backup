package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.q;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class GoogleSignInAccount extends com.google.android.gms.common.internal.y.a implements ReflectedParcelable {
    public static final Parcelable.Creator<GoogleSignInAccount> CREATOR = new f();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static com.google.android.gms.common.util.e f892n = com.google.android.gms.common.util.h.d();
    final int a;
    private String b;
    private String c;
    private String d;
    private String e;
    private Uri f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f893g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f894h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f895i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    List f896j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private String f897k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private String f898l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private Set f899m = new HashSet();

    GoogleSignInAccount(int i2, String str, String str2, String str3, String str4, Uri uri, String str5, long j2, String str6, List list, String str7, String str8) {
        this.a = i2;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = uri;
        this.f893g = str5;
        this.f894h = j2;
        this.f895i = str6;
        this.f896j = list;
        this.f897k = str7;
        this.f898l = str8;
    }

    public static GoogleSignInAccount v(String str, String str2, String str3, String str4, String str5, String str6, Uri uri, Long l2, String str7, Set set) {
        long jLongValue = l2.longValue();
        q.g(str7);
        q.k(set);
        return new GoogleSignInAccount(3, str, str2, str3, str4, uri, null, jLongValue, str7, new ArrayList(set), str5, str6);
    }

    public static GoogleSignInAccount w(String str) throws JSONException {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        String strOptString = jSONObject.optString("photoUrl");
        Uri uri = !TextUtils.isEmpty(strOptString) ? Uri.parse(strOptString) : null;
        long j2 = Long.parseLong(jSONObject.getString("expirationTime"));
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("grantedScopes");
        int length = jSONArray.length();
        for (int i2 = 0; i2 < length; i2++) {
            hashSet.add(new Scope(jSONArray.getString(i2)));
        }
        GoogleSignInAccount googleSignInAccountV = v(jSONObject.optString("id"), jSONObject.has("tokenId") ? jSONObject.optString("tokenId") : null, jSONObject.has("email") ? jSONObject.optString("email") : null, jSONObject.has("displayName") ? jSONObject.optString("displayName") : null, jSONObject.has("givenName") ? jSONObject.optString("givenName") : null, jSONObject.has("familyName") ? jSONObject.optString("familyName") : null, uri, Long.valueOf(j2), jSONObject.getString("obfuscatedIdentifier"), hashSet);
        googleSignInAccountV.f893g = jSONObject.has("serverAuthCode") ? jSONObject.optString("serverAuthCode") : null;
        return googleSignInAccountV;
    }

    public Account b() {
        String str = this.d;
        if (str == null) {
            return null;
        }
        return new Account(str, "com.google");
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GoogleSignInAccount)) {
            return false;
        }
        GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) obj;
        return googleSignInAccount.f895i.equals(this.f895i) && googleSignInAccount.s().equals(s());
    }

    public String f() {
        return this.e;
    }

    public String h() {
        return this.d;
    }

    public int hashCode() {
        return ((this.f895i.hashCode() + 527) * 31) + s().hashCode();
    }

    public String j() {
        return this.f898l;
    }

    public String l() {
        return this.f897k;
    }

    public String n() {
        return this.b;
    }

    public String q() {
        return this.c;
    }

    public Uri r() {
        return this.f;
    }

    public Set<Scope> s() {
        HashSet hashSet = new HashSet(this.f896j);
        hashSet.addAll(this.f899m);
        return hashSet;
    }

    public String t() {
        return this.f893g;
    }

    public boolean u() {
        return f892n.a() / 1000 >= this.f894h + (-300);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        int iA = com.google.android.gms.common.internal.y.c.a(parcel);
        com.google.android.gms.common.internal.y.c.i(parcel, 1, this.a);
        com.google.android.gms.common.internal.y.c.n(parcel, 2, n(), false);
        com.google.android.gms.common.internal.y.c.n(parcel, 3, q(), false);
        com.google.android.gms.common.internal.y.c.n(parcel, 4, h(), false);
        com.google.android.gms.common.internal.y.c.n(parcel, 5, f(), false);
        com.google.android.gms.common.internal.y.c.m(parcel, 6, r(), i2, false);
        com.google.android.gms.common.internal.y.c.n(parcel, 7, t(), false);
        com.google.android.gms.common.internal.y.c.k(parcel, 8, this.f894h);
        com.google.android.gms.common.internal.y.c.n(parcel, 9, this.f895i, false);
        com.google.android.gms.common.internal.y.c.q(parcel, 10, this.f896j, false);
        com.google.android.gms.common.internal.y.c.n(parcel, 11, l(), false);
        com.google.android.gms.common.internal.y.c.n(parcel, 12, j(), false);
        com.google.android.gms.common.internal.y.c.b(parcel, iA);
    }

    public final String x() {
        return this.f895i;
    }

    public final String y() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (n() != null) {
                jSONObject.put("id", n());
            }
            if (q() != null) {
                jSONObject.put("tokenId", q());
            }
            if (h() != null) {
                jSONObject.put("email", h());
            }
            if (f() != null) {
                jSONObject.put("displayName", f());
            }
            if (l() != null) {
                jSONObject.put("givenName", l());
            }
            if (j() != null) {
                jSONObject.put("familyName", j());
            }
            Uri uriR = r();
            if (uriR != null) {
                jSONObject.put("photoUrl", uriR.toString());
            }
            if (t() != null) {
                jSONObject.put("serverAuthCode", t());
            }
            jSONObject.put("expirationTime", this.f894h);
            jSONObject.put("obfuscatedIdentifier", this.f895i);
            JSONArray jSONArray = new JSONArray();
            List list = this.f896j;
            Scope[] scopeArr = (Scope[]) list.toArray(new Scope[list.size()]);
            Arrays.sort(scopeArr, new Comparator() { // from class: com.google.android.gms.auth.api.signin.e
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    Parcelable.Creator<GoogleSignInAccount> creator = GoogleSignInAccount.CREATOR;
                    return ((Scope) obj).f().compareTo(((Scope) obj2).f());
                }
            });
            for (Scope scope : scopeArr) {
                jSONArray.put(scope.f());
            }
            jSONObject.put("grantedScopes", jSONArray);
            jSONObject.remove("serverAuthCode");
            return jSONObject.toString();
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }
}
