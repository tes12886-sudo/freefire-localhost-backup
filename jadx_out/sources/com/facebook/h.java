package com.facebook;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import com.FF.voiceengine.FFVoiceConst;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class h implements Parcelable {
    private final String a;
    private final String b;
    private final String c;
    private final String d;
    private final long e;
    private final long f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f583g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f584h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final String f585i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final String f586j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final String f587k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final String f588l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final String f589m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Set<String> f590n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final String f591o;
    private final Map<String, Integer> p;
    private final Map<String, String> q;
    private final Map<String, String> r;
    private final String s;
    private final String t;
    public static final b u = new b(null);
    public static final Parcelable.Creator<h> CREATOR = new a();

    public static final class a implements Parcelable.Creator<h> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public h createFromParcel(Parcel parcel) {
            l.y.c.i.e(parcel, "source");
            return new h(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public h[] newArray(int i2) {
            return new h[i2];
        }
    }

    public static final class b {
        private b() {
        }

        public /* synthetic */ b(l.y.c.f fVar) {
            this();
        }

        public final String a(JSONObject jSONObject, String str) {
            l.y.c.i.e(jSONObject, "$this$getNullableString");
            l.y.c.i.e(str, "name");
            if (jSONObject.has(str)) {
                return jSONObject.getString(str);
            }
            return null;
        }
    }

    public h(Parcel parcel) {
        l.y.c.i.e(parcel, "parcel");
        String string = parcel.readString();
        com.facebook.internal.i0.n(string, "jti");
        if (string == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        this.a = string;
        String string2 = parcel.readString();
        com.facebook.internal.i0.n(string2, "iss");
        if (string2 == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        this.b = string2;
        String string3 = parcel.readString();
        com.facebook.internal.i0.n(string3, "aud");
        if (string3 == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        this.c = string3;
        String string4 = parcel.readString();
        com.facebook.internal.i0.n(string4, "nonce");
        if (string4 == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        this.d = string4;
        this.e = parcel.readLong();
        this.f = parcel.readLong();
        String string5 = parcel.readString();
        com.facebook.internal.i0.n(string5, "sub");
        if (string5 == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        this.f583g = string5;
        this.f584h = parcel.readString();
        this.f585i = parcel.readString();
        this.f586j = parcel.readString();
        this.f587k = parcel.readString();
        this.f588l = parcel.readString();
        this.f589m = parcel.readString();
        ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
        this.f590n = arrayListCreateStringArrayList != null ? Collections.unmodifiableSet(new HashSet(arrayListCreateStringArrayList)) : null;
        this.f591o = parcel.readString();
        HashMap hashMap = parcel.readHashMap(l.y.c.h.a.getClass().getClassLoader());
        hashMap = hashMap instanceof HashMap ? hashMap : null;
        this.p = hashMap != null ? Collections.unmodifiableMap(hashMap) : null;
        l.y.c.o oVar = l.y.c.o.a;
        HashMap hashMap2 = parcel.readHashMap(oVar.getClass().getClassLoader());
        hashMap2 = hashMap2 instanceof HashMap ? hashMap2 : null;
        this.q = hashMap2 != null ? Collections.unmodifiableMap(hashMap2) : null;
        HashMap hashMap3 = parcel.readHashMap(oVar.getClass().getClassLoader());
        hashMap3 = hashMap3 instanceof HashMap ? hashMap3 : null;
        this.r = hashMap3 != null ? Collections.unmodifiableMap(hashMap3) : null;
        this.s = parcel.readString();
        this.t = parcel.readString();
    }

    public h(String str, String str2) throws JSONException {
        l.y.c.i.e(str, "encodedClaims");
        l.y.c.i.e(str2, "expectedNonce");
        com.facebook.internal.i0.j(str, "encodedClaims");
        byte[] bArrDecode = Base64.decode(str, 8);
        l.y.c.i.d(bArrDecode, "decodedBytes");
        JSONObject jSONObject = new JSONObject(new String(bArrDecode, l.d0.d.b));
        if (!a(jSONObject, str2)) {
            throw new IllegalArgumentException("Invalid claims".toString());
        }
        String string = jSONObject.getString("jti");
        l.y.c.i.d(string, "jsonObj.getString(JSON_KEY_JIT)");
        this.a = string;
        String string2 = jSONObject.getString("iss");
        l.y.c.i.d(string2, "jsonObj.getString(JSON_KEY_ISS)");
        this.b = string2;
        String string3 = jSONObject.getString("aud");
        l.y.c.i.d(string3, "jsonObj.getString(JSON_KEY_AUD)");
        this.c = string3;
        String string4 = jSONObject.getString("nonce");
        l.y.c.i.d(string4, "jsonObj.getString(JSON_KEY_NONCE)");
        this.d = string4;
        this.e = jSONObject.getLong("exp");
        this.f = jSONObject.getLong("iat");
        String string5 = jSONObject.getString("sub");
        l.y.c.i.d(string5, "jsonObj.getString(JSON_KEY_SUB)");
        this.f583g = string5;
        b bVar = u;
        this.f584h = bVar.a(jSONObject, "name");
        this.f585i = bVar.a(jSONObject, "given_name");
        this.f586j = bVar.a(jSONObject, "middle_name");
        this.f587k = bVar.a(jSONObject, "family_name");
        this.f588l = bVar.a(jSONObject, "email");
        this.f589m = bVar.a(jSONObject, "picture");
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("user_friends");
        this.f590n = jSONArrayOptJSONArray == null ? null : Collections.unmodifiableSet(com.facebook.internal.h0.b0(jSONArrayOptJSONArray));
        this.f591o = bVar.a(jSONObject, "user_birthday");
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("user_age_range");
        this.p = jSONObjectOptJSONObject == null ? null : Collections.unmodifiableMap(com.facebook.internal.h0.m(jSONObjectOptJSONObject));
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("user_hometown");
        this.q = jSONObjectOptJSONObject2 == null ? null : Collections.unmodifiableMap(com.facebook.internal.h0.n(jSONObjectOptJSONObject2));
        JSONObject jSONObjectOptJSONObject3 = jSONObject.optJSONObject("user_location");
        this.r = jSONObjectOptJSONObject3 != null ? Collections.unmodifiableMap(com.facebook.internal.h0.n(jSONObjectOptJSONObject3)) : null;
        this.s = bVar.a(jSONObject, "user_gender");
        this.t = bVar.a(jSONObject, "user_link");
    }

    private final boolean a(JSONObject jSONObject, String str) {
        if (jSONObject == null) {
            return false;
        }
        String strOptString = jSONObject.optString("jti");
        l.y.c.i.d(strOptString, "jti");
        if (strOptString.length() == 0) {
            return false;
        }
        try {
            String strOptString2 = jSONObject.optString("iss");
            l.y.c.i.d(strOptString2, "iss");
            if (!(strOptString2.length() == 0) && (!(!l.y.c.i.a(new URL(strOptString2).getHost(), "facebook.com")) || !(!l.y.c.i.a(new URL(strOptString2).getHost(), "www.facebook.com")))) {
                String strOptString3 = jSONObject.optString("aud");
                l.y.c.i.d(strOptString3, "aud");
                if (!(strOptString3.length() == 0) && !(!l.y.c.i.a(strOptString3, r.g()))) {
                    long jOptLong = jSONObject.optLong("exp");
                    long j2 = FFVoiceConst.FFVoiceEvent.FFVoice_EVENT_EOF;
                    if (new Date().after(new Date(jOptLong * j2))) {
                        return false;
                    }
                    if (new Date().after(new Date((jSONObject.optLong("iat") * j2) + 600000))) {
                        return false;
                    }
                    String strOptString4 = jSONObject.optString("sub");
                    l.y.c.i.d(strOptString4, "sub");
                    if (strOptString4.length() == 0) {
                        return false;
                    }
                    String strOptString5 = jSONObject.optString("nonce");
                    l.y.c.i.d(strOptString5, "nonce");
                    if (!(strOptString5.length() == 0) && !(!l.y.c.i.a(strOptString5, str))) {
                        return true;
                    }
                }
            }
        } catch (MalformedURLException unused) {
        }
        return false;
    }

    public final JSONObject b() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("jti", this.a);
        jSONObject.put("iss", this.b);
        jSONObject.put("aud", this.c);
        jSONObject.put("nonce", this.d);
        jSONObject.put("exp", this.e);
        jSONObject.put("iat", this.f);
        String str = this.f583g;
        if (str != null) {
            jSONObject.put("sub", str);
        }
        String str2 = this.f584h;
        if (str2 != null) {
            jSONObject.put("name", str2);
        }
        String str3 = this.f585i;
        if (str3 != null) {
            jSONObject.put("given_name", str3);
        }
        String str4 = this.f586j;
        if (str4 != null) {
            jSONObject.put("middle_name", str4);
        }
        String str5 = this.f587k;
        if (str5 != null) {
            jSONObject.put("family_name", str5);
        }
        String str6 = this.f588l;
        if (str6 != null) {
            jSONObject.put("email", str6);
        }
        String str7 = this.f589m;
        if (str7 != null) {
            jSONObject.put("picture", str7);
        }
        if (this.f590n != null) {
            jSONObject.put("user_friends", new JSONArray((Collection) this.f590n));
        }
        String str8 = this.f591o;
        if (str8 != null) {
            jSONObject.put("user_birthday", str8);
        }
        if (this.p != null) {
            jSONObject.put("user_age_range", new JSONObject(this.p));
        }
        if (this.q != null) {
            jSONObject.put("user_hometown", new JSONObject(this.q));
        }
        if (this.r != null) {
            jSONObject.put("user_location", new JSONObject(this.r));
        }
        String str9 = this.s;
        if (str9 != null) {
            jSONObject.put("user_gender", str9);
        }
        String str10 = this.t;
        if (str10 != null) {
            jSONObject.put("user_link", str10);
        }
        return jSONObject;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return l.y.c.i.a(this.a, hVar.a) && l.y.c.i.a(this.b, hVar.b) && l.y.c.i.a(this.c, hVar.c) && l.y.c.i.a(this.d, hVar.d) && this.e == hVar.e && this.f == hVar.f && l.y.c.i.a(this.f583g, hVar.f583g) && l.y.c.i.a(this.f584h, hVar.f584h) && l.y.c.i.a(this.f585i, hVar.f585i) && l.y.c.i.a(this.f586j, hVar.f586j) && l.y.c.i.a(this.f587k, hVar.f587k) && l.y.c.i.a(this.f588l, hVar.f588l) && l.y.c.i.a(this.f589m, hVar.f589m) && l.y.c.i.a(this.f590n, hVar.f590n) && l.y.c.i.a(this.f591o, hVar.f591o) && l.y.c.i.a(this.p, hVar.p) && l.y.c.i.a(this.q, hVar.q) && l.y.c.i.a(this.r, hVar.r) && l.y.c.i.a(this.s, hVar.s) && l.y.c.i.a(this.t, hVar.t);
    }

    public int hashCode() {
        int iHashCode = (((((((((((((527 + this.a.hashCode()) * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + Long.valueOf(this.e).hashCode()) * 31) + Long.valueOf(this.f).hashCode()) * 31) + this.f583g.hashCode()) * 31;
        String str = this.f584h;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f585i;
        int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f586j;
        int iHashCode4 = (iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f587k;
        int iHashCode5 = (iHashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f588l;
        int iHashCode6 = (iHashCode5 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.f589m;
        int iHashCode7 = (iHashCode6 + (str6 != null ? str6.hashCode() : 0)) * 31;
        Set<String> set = this.f590n;
        int iHashCode8 = (iHashCode7 + (set != null ? set.hashCode() : 0)) * 31;
        String str7 = this.f591o;
        int iHashCode9 = (iHashCode8 + (str7 != null ? str7.hashCode() : 0)) * 31;
        Map<String, Integer> map = this.p;
        int iHashCode10 = (iHashCode9 + (map != null ? map.hashCode() : 0)) * 31;
        Map<String, String> map2 = this.q;
        int iHashCode11 = (iHashCode10 + (map2 != null ? map2.hashCode() : 0)) * 31;
        Map<String, String> map3 = this.r;
        int iHashCode12 = (iHashCode11 + (map3 != null ? map3.hashCode() : 0)) * 31;
        String str8 = this.s;
        int iHashCode13 = (iHashCode12 + (str8 != null ? str8.hashCode() : 0)) * 31;
        String str9 = this.t;
        return iHashCode13 + (str9 != null ? str9.hashCode() : 0);
    }

    public String toString() {
        String string = b().toString();
        l.y.c.i.d(string, "claimsJsonObject.toString()");
        return string;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        l.y.c.i.e(parcel, "dest");
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeLong(this.e);
        parcel.writeLong(this.f);
        parcel.writeString(this.f583g);
        parcel.writeString(this.f584h);
        parcel.writeString(this.f585i);
        parcel.writeString(this.f586j);
        parcel.writeString(this.f587k);
        parcel.writeString(this.f588l);
        parcel.writeString(this.f589m);
        parcel.writeStringList(this.f590n == null ? null : new ArrayList(this.f590n));
        parcel.writeString(this.f591o);
        parcel.writeMap(this.p);
        parcel.writeMap(this.q);
        parcel.writeMap(this.r);
        parcel.writeString(this.s);
        parcel.writeString(this.t);
    }
}
