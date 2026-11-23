package com.facebook;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final Date f559l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final Date f560m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final Date f561n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final e f562o;
    public static final c p = new c(null);
    private final Date a;
    private final Set<String> b;
    private final Set<String> c;
    private final Set<String> d;
    private final String e;
    private final e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Date f563g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f564h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final String f565i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Date f566j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final String f567k;

    /* JADX INFO: renamed from: com.facebook.a$a, reason: collision with other inner class name */
    public interface InterfaceC0053a {
        void a(n nVar);

        void b(a aVar);
    }

    public static final class b implements Parcelable.Creator<a> {
        b() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public a createFromParcel(Parcel parcel) {
            l.y.c.i.e(parcel, "source");
            return new a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public a[] newArray(int i2) {
            return new a[i2];
        }
    }

    public static final class c {
        private c() {
        }

        public /* synthetic */ c(l.y.c.f fVar) {
            this();
        }

        public final a a(a aVar) {
            l.y.c.i.e(aVar, "current");
            return new a(aVar.m(), aVar.c(), aVar.n(), aVar.k(), aVar.f(), aVar.g(), aVar.l(), new Date(), new Date(), aVar.e(), null, 1024, null);
        }

        public final a b(JSONObject jSONObject) throws JSONException {
            l.y.c.i.e(jSONObject, "jsonObject");
            if (jSONObject.getInt("version") > 1) {
                throw new n("Unknown AccessToken serialization format.");
            }
            String string = jSONObject.getString(j.c.a.a.EXTRA_TOKEN);
            Date date = new Date(jSONObject.getLong("expires_at"));
            JSONArray jSONArray = jSONObject.getJSONArray("permissions");
            JSONArray jSONArray2 = jSONObject.getJSONArray("declined_permissions");
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("expired_permissions");
            Date date2 = new Date(jSONObject.getLong("last_refresh"));
            String string2 = jSONObject.getString("source");
            l.y.c.i.d(string2, "jsonObject.getString(SOURCE_KEY)");
            e eVarValueOf = e.valueOf(string2);
            String string3 = jSONObject.getString("application_id");
            String string4 = jSONObject.getString("user_id");
            Date date3 = new Date(jSONObject.optLong("data_access_expiration_time", 0L));
            String strOptString = jSONObject.optString("graph_domain", null);
            l.y.c.i.d(string, j.c.a.a.EXTRA_TOKEN);
            l.y.c.i.d(string3, "applicationId");
            l.y.c.i.d(string4, "userId");
            l.y.c.i.d(jSONArray, "permissionsArray");
            List<String> listC0 = com.facebook.internal.h0.c0(jSONArray);
            l.y.c.i.d(jSONArray2, "declinedPermissionsArray");
            return new a(string, string3, string4, listC0, com.facebook.internal.h0.c0(jSONArray2), jSONArrayOptJSONArray == null ? new ArrayList() : com.facebook.internal.h0.c0(jSONArrayOptJSONArray), eVarValueOf, date, date2, date3, strOptString);
        }

        public final a c(Bundle bundle) {
            String string;
            l.y.c.i.e(bundle, "bundle");
            List<String> listF = f(bundle, "com.facebook.TokenCachingStrategy.Permissions");
            List<String> listF2 = f(bundle, "com.facebook.TokenCachingStrategy.DeclinedPermissions");
            List<String> listF3 = f(bundle, "com.facebook.TokenCachingStrategy.ExpiredPermissions");
            z.a aVar = z.d;
            String strA = aVar.a(bundle);
            if (com.facebook.internal.h0.Y(strA)) {
                strA = r.g();
            }
            String str = strA;
            String strF = aVar.f(bundle);
            if (strF != null) {
                JSONObject jSONObjectE = com.facebook.internal.h0.e(strF);
                if (jSONObjectE != null) {
                    try {
                        string = jSONObjectE.getString("id");
                    } catch (JSONException unused) {
                        return null;
                    }
                } else {
                    string = null;
                }
                if (str != null && string != null) {
                    return new a(strF, str, string, listF, listF2, listF3, aVar.e(bundle), aVar.c(bundle), aVar.d(bundle), null, null, 1024, null);
                }
            }
            return null;
        }

        public final void d() {
            a aVarG = d.f575g.e().g();
            if (aVarG != null) {
                i(a(aVarG));
            }
        }

        public final a e() {
            return d.f575g.e().g();
        }

        public final List<String> f(Bundle bundle, String str) {
            l.y.c.i.e(bundle, "bundle");
            ArrayList<String> stringArrayList = bundle.getStringArrayList(str);
            if (stringArrayList == null) {
                return l.t.m.g();
            }
            List<String> listUnmodifiableList = Collections.unmodifiableList(new ArrayList(stringArrayList));
            l.y.c.i.d(listUnmodifiableList, "Collections.unmodifiable…ist(originalPermissions))");
            return listUnmodifiableList;
        }

        public final boolean g() {
            a aVarG = d.f575g.e().g();
            return (aVarG == null || aVarG.p()) ? false : true;
        }

        public final void h(InterfaceC0053a interfaceC0053a) {
            d.f575g.e().i(interfaceC0053a);
        }

        public final void i(a aVar) {
            d.f575g.e().l(aVar);
        }
    }

    static {
        Date date = new Date(Long.MAX_VALUE);
        f559l = date;
        f560m = date;
        f561n = new Date();
        f562o = e.FACEBOOK_APPLICATION_WEB;
        CREATOR = new b();
    }

    public a(Parcel parcel) {
        l.y.c.i.e(parcel, "parcel");
        this.a = new Date(parcel.readLong());
        ArrayList arrayList = new ArrayList();
        parcel.readStringList(arrayList);
        Set<String> setUnmodifiableSet = Collections.unmodifiableSet(new HashSet(arrayList));
        l.y.c.i.d(setUnmodifiableSet, "Collections.unmodifiable…HashSet(permissionsList))");
        this.b = setUnmodifiableSet;
        arrayList.clear();
        parcel.readStringList(arrayList);
        Set<String> setUnmodifiableSet2 = Collections.unmodifiableSet(new HashSet(arrayList));
        l.y.c.i.d(setUnmodifiableSet2, "Collections.unmodifiable…HashSet(permissionsList))");
        this.c = setUnmodifiableSet2;
        arrayList.clear();
        parcel.readStringList(arrayList);
        Set<String> setUnmodifiableSet3 = Collections.unmodifiableSet(new HashSet(arrayList));
        l.y.c.i.d(setUnmodifiableSet3, "Collections.unmodifiable…HashSet(permissionsList))");
        this.d = setUnmodifiableSet3;
        String string = parcel.readString();
        com.facebook.internal.i0.n(string, j.c.a.a.EXTRA_TOKEN);
        if (string == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        this.e = string;
        String string2 = parcel.readString();
        this.f = string2 != null ? e.valueOf(string2) : f562o;
        this.f563g = new Date(parcel.readLong());
        String string3 = parcel.readString();
        com.facebook.internal.i0.n(string3, "applicationId");
        if (string3 == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        this.f564h = string3;
        String string4 = parcel.readString();
        com.facebook.internal.i0.n(string4, "userId");
        if (string4 == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        this.f565i = string4;
        this.f566j = new Date(parcel.readLong());
        this.f567k = parcel.readString();
    }

    public a(String str, String str2, String str3, Collection<String> collection, Collection<String> collection2, Collection<String> collection3, e eVar, Date date, Date date2, Date date3) {
        this(str, str2, str3, collection, collection2, collection3, eVar, date, date2, date3, null, 1024, null);
    }

    public a(String str, String str2, String str3, Collection<String> collection, Collection<String> collection2, Collection<String> collection3, e eVar, Date date, Date date2, Date date3, String str4) {
        l.y.c.i.e(str, "accessToken");
        l.y.c.i.e(str2, "applicationId");
        l.y.c.i.e(str3, "userId");
        com.facebook.internal.i0.j(str, "accessToken");
        com.facebook.internal.i0.j(str2, "applicationId");
        com.facebook.internal.i0.j(str3, "userId");
        this.a = date == null ? f560m : date;
        Set<String> setUnmodifiableSet = Collections.unmodifiableSet(collection != null ? new HashSet(collection) : new HashSet());
        l.y.c.i.d(setUnmodifiableSet, "Collections.unmodifiable…missions) else HashSet())");
        this.b = setUnmodifiableSet;
        Set<String> setUnmodifiableSet2 = Collections.unmodifiableSet(collection2 != null ? new HashSet(collection2) : new HashSet());
        l.y.c.i.d(setUnmodifiableSet2, "Collections.unmodifiable…missions) else HashSet())");
        this.c = setUnmodifiableSet2;
        Set<String> setUnmodifiableSet3 = Collections.unmodifiableSet(collection3 != null ? new HashSet(collection3) : new HashSet());
        l.y.c.i.d(setUnmodifiableSet3, "Collections.unmodifiable…missions) else HashSet())");
        this.d = setUnmodifiableSet3;
        this.e = str;
        this.f = b(eVar == null ? f562o : eVar, str4);
        this.f563g = date2 == null ? f561n : date2;
        this.f564h = str2;
        this.f565i = str3;
        this.f566j = (date3 == null || date3.getTime() == 0) ? f560m : date3;
        this.f567k = str4 == null ? "facebook" : str4;
    }

    public /* synthetic */ a(String str, String str2, String str3, Collection collection, Collection collection2, Collection collection3, e eVar, Date date, Date date2, Date date3, String str4, int i2, l.y.c.f fVar) {
        this(str, str2, str3, collection, collection2, collection3, eVar, date, date2, date3, (i2 & 1024) != 0 ? "facebook" : str4);
    }

    private final void a(StringBuilder sb) {
        sb.append(" permissions:");
        sb.append("[");
        sb.append(TextUtils.join(", ", this.b));
        sb.append("]");
    }

    private final e b(e eVar, String str) {
        if (str == null || !str.equals("instagram")) {
            return eVar;
        }
        int i2 = com.facebook.b.a[eVar.ordinal()];
        if (i2 == 1) {
            return e.INSTAGRAM_APPLICATION_WEB;
        }
        if (i2 != 2) {
            return i2 != 3 ? eVar : e.INSTAGRAM_WEB_VIEW;
        }
        return e.INSTAGRAM_CUSTOM_CHROME_TAB;
    }

    public static final a d() {
        return p.e();
    }

    public static final boolean o() {
        return p.g();
    }

    public static final void q(InterfaceC0053a interfaceC0053a) {
        p.h(interfaceC0053a);
    }

    public static final void r(a aVar) {
        p.i(aVar);
    }

    private final String t() {
        return r.z(a0.INCLUDE_ACCESS_TOKENS) ? this.e : "ACCESS_TOKEN_REMOVED";
    }

    public final String c() {
        return this.f564h;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final Date e() {
        return this.f566j;
    }

    public boolean equals(Object obj) {
        boolean zA;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (l.y.c.i.a(this.a, aVar.a) && l.y.c.i.a(this.b, aVar.b) && l.y.c.i.a(this.c, aVar.c) && l.y.c.i.a(this.d, aVar.d) && l.y.c.i.a(this.e, aVar.e) && this.f == aVar.f && l.y.c.i.a(this.f563g, aVar.f563g) && l.y.c.i.a(this.f564h, aVar.f564h) && l.y.c.i.a(this.f565i, aVar.f565i) && l.y.c.i.a(this.f566j, aVar.f566j)) {
            String str = this.f567k;
            String str2 = aVar.f567k;
            if (str == null) {
                zA = str2 == null;
            } else {
                zA = l.y.c.i.a(str, str2);
            }
            if (zA) {
                return true;
            }
        }
        return false;
    }

    public final Set<String> f() {
        return this.c;
    }

    public final Set<String> g() {
        return this.d;
    }

    public final Date h() {
        return this.a;
    }

    public int hashCode() {
        int iHashCode = (((((((((((((((((((527 + this.a.hashCode()) * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31) + this.f563g.hashCode()) * 31) + this.f564h.hashCode()) * 31) + this.f565i.hashCode()) * 31) + this.f566j.hashCode()) * 31;
        String str = this.f567k;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final String i() {
        return this.f567k;
    }

    public final Date j() {
        return this.f563g;
    }

    public final Set<String> k() {
        return this.b;
    }

    public final e l() {
        return this.f;
    }

    public final String m() {
        return this.e;
    }

    public final String n() {
        return this.f565i;
    }

    public final boolean p() {
        return new Date().after(this.a);
    }

    public final JSONObject s() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("version", 1);
        jSONObject.put(j.c.a.a.EXTRA_TOKEN, this.e);
        jSONObject.put("expires_at", this.a.getTime());
        jSONObject.put("permissions", new JSONArray((Collection) this.b));
        jSONObject.put("declined_permissions", new JSONArray((Collection) this.c));
        jSONObject.put("expired_permissions", new JSONArray((Collection) this.d));
        jSONObject.put("last_refresh", this.f563g.getTime());
        jSONObject.put("source", this.f.name());
        jSONObject.put("application_id", this.f564h);
        jSONObject.put("user_id", this.f565i);
        jSONObject.put("data_access_expiration_time", this.f566j.getTime());
        String str = this.f567k;
        if (str != null) {
            jSONObject.put("graph_domain", str);
        }
        return jSONObject;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{AccessToken");
        sb.append(" token:");
        sb.append(t());
        a(sb);
        sb.append("}");
        String string = sb.toString();
        l.y.c.i.d(string, "builder.toString()");
        return string;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        l.y.c.i.e(parcel, "dest");
        parcel.writeLong(this.a.getTime());
        parcel.writeStringList(new ArrayList(this.b));
        parcel.writeStringList(new ArrayList(this.c));
        parcel.writeStringList(new ArrayList(this.d));
        parcel.writeString(this.e);
        parcel.writeString(this.f.name());
        parcel.writeLong(this.f563g.getTime());
        parcel.writeString(this.f564h);
        parcel.writeString(this.f565i);
        parcel.writeLong(this.f566j.getTime());
        parcel.writeString(this.f567k);
    }
}
