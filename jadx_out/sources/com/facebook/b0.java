package com.facebook;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class b0 implements Parcelable {
    public static final Parcelable.Creator<b0> CREATOR;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String f571h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final b f572i = new b(null);
    private final String a;
    private final String b;
    private final String c;
    private final String d;
    private final String e;
    private final Uri f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Uri f573g;

    public static final class a implements Parcelable.Creator<b0> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public b0 createFromParcel(Parcel parcel) {
            l.y.c.i.e(parcel, "source");
            return new b0(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public b0[] newArray(int i2) {
            return new b0[i2];
        }
    }

    public static final class b {

        public static final class a implements com.facebook.internal.h0.a {
            a() {
            }

            @Override // com.facebook.internal.h0.a
            public void a(n nVar) {
                Log.e(b0.f571h, "Got unexpected exception: " + nVar);
            }

            @Override // com.facebook.internal.h0.a
            public void b(JSONObject jSONObject) {
                String strOptString = jSONObject != null ? jSONObject.optString("id") : null;
                if (strOptString == null) {
                    Log.w(b0.f571h, "No user ID returned on Me request");
                    return;
                }
                String strOptString2 = jSONObject.optString("link");
                String strOptString3 = jSONObject.optString("profile_picture", null);
                b0.f572i.c(new b0(strOptString, jSONObject.optString("first_name"), jSONObject.optString("middle_name"), jSONObject.optString("last_name"), jSONObject.optString("name"), strOptString2 != null ? Uri.parse(strOptString2) : null, strOptString3 != null ? Uri.parse(strOptString3) : null));
            }
        }

        private b() {
        }

        public /* synthetic */ b(l.y.c.f fVar) {
            this();
        }

        public final void a() {
            com.facebook.a.c cVar = com.facebook.a.p;
            com.facebook.a aVarE = cVar.e();
            if (aVarE != null) {
                if (cVar.g()) {
                    com.facebook.internal.h0.D(aVarE.m(), new a());
                } else {
                    c(null);
                }
            }
        }

        public final b0 b() {
            return d0.e.a().c();
        }

        public final void c(b0 b0Var) {
            d0.e.a().f(b0Var);
        }
    }

    static {
        String simpleName = b0.class.getSimpleName();
        l.y.c.i.d(simpleName, "Profile::class.java.simpleName");
        f571h = simpleName;
        CREATOR = new a();
    }

    private b0(Parcel parcel) {
        this.a = parcel.readString();
        this.b = parcel.readString();
        this.c = parcel.readString();
        this.d = parcel.readString();
        this.e = parcel.readString();
        String string = parcel.readString();
        this.f = string == null ? null : Uri.parse(string);
        String string2 = parcel.readString();
        this.f573g = string2 != null ? Uri.parse(string2) : null;
    }

    public /* synthetic */ b0(Parcel parcel, l.y.c.f fVar) {
        this(parcel);
    }

    public b0(String str, String str2, String str3, String str4, String str5, Uri uri, Uri uri2) {
        com.facebook.internal.i0.n(str, "id");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = uri;
        this.f573g = uri2;
    }

    public b0(JSONObject jSONObject) {
        l.y.c.i.e(jSONObject, "jsonObject");
        this.a = jSONObject.optString("id", null);
        this.b = jSONObject.optString("first_name", null);
        this.c = jSONObject.optString("middle_name", null);
        this.d = jSONObject.optString("last_name", null);
        this.e = jSONObject.optString("name", null);
        String strOptString = jSONObject.optString("link_uri", null);
        this.f = strOptString == null ? null : Uri.parse(strOptString);
        String strOptString2 = jSONObject.optString("picture_uri", null);
        this.f573g = strOptString2 != null ? Uri.parse(strOptString2) : null;
    }

    public static final void b() {
        f572i.a();
    }

    public static final void c(b0 b0Var) {
        f572i.c(b0Var);
    }

    public final JSONObject d() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("id", this.a);
            jSONObject.put("first_name", this.b);
            jSONObject.put("middle_name", this.c);
            jSONObject.put("last_name", this.d);
            jSONObject.put("name", this.e);
            Uri uri = this.f;
            if (uri != null) {
                jSONObject.put("link_uri", uri.toString());
            }
            Uri uri2 = this.f573g;
            if (uri2 != null) {
                jSONObject.put("picture_uri", uri2.toString());
            }
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        String str;
        String str2;
        String str3;
        String str4;
        Uri uri;
        Uri uri2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b0)) {
            return false;
        }
        String str5 = this.a;
        return ((str5 == null && ((b0) obj).a == null) || l.y.c.i.a(str5, ((b0) obj).a)) && (((str = this.b) == null && ((b0) obj).b == null) || l.y.c.i.a(str, ((b0) obj).b)) && ((((str2 = this.c) == null && ((b0) obj).c == null) || l.y.c.i.a(str2, ((b0) obj).c)) && ((((str3 = this.d) == null && ((b0) obj).d == null) || l.y.c.i.a(str3, ((b0) obj).d)) && ((((str4 = this.e) == null && ((b0) obj).e == null) || l.y.c.i.a(str4, ((b0) obj).e)) && ((((uri = this.f) == null && ((b0) obj).f == null) || l.y.c.i.a(uri, ((b0) obj).f)) && (((uri2 = this.f573g) == null && ((b0) obj).f573g == null) || l.y.c.i.a(uri2, ((b0) obj).f573g))))));
    }

    public int hashCode() {
        String str = this.a;
        int iHashCode = 527 + (str != null ? str.hashCode() : 0);
        String str2 = this.b;
        if (str2 != null) {
            iHashCode = (iHashCode * 31) + str2.hashCode();
        }
        String str3 = this.c;
        if (str3 != null) {
            iHashCode = (iHashCode * 31) + str3.hashCode();
        }
        String str4 = this.d;
        if (str4 != null) {
            iHashCode = (iHashCode * 31) + str4.hashCode();
        }
        String str5 = this.e;
        if (str5 != null) {
            iHashCode = (iHashCode * 31) + str5.hashCode();
        }
        Uri uri = this.f;
        if (uri != null) {
            iHashCode = (iHashCode * 31) + uri.hashCode();
        }
        Uri uri2 = this.f573g;
        return uri2 != null ? (iHashCode * 31) + uri2.hashCode() : iHashCode;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        l.y.c.i.e(parcel, "dest");
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
        Uri uri = this.f;
        parcel.writeString(uri != null ? uri.toString() : null);
        Uri uri2 = this.f573g;
        parcel.writeString(uri2 != null ? uri2.toString() : null);
    }
}
