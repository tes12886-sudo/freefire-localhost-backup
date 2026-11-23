package com.facebook;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class i implements Parcelable {
    public static final Parcelable.Creator<i> CREATOR = new a();
    private final String a;
    private final String b;
    private final String c;

    public static final class a implements Parcelable.Creator<i> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public i createFromParcel(Parcel parcel) {
            l.y.c.i.e(parcel, "source");
            return new i(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public i[] newArray(int i2) {
            return new i[i2];
        }
    }

    public i(Parcel parcel) {
        l.y.c.i.e(parcel, "parcel");
        String string = parcel.readString();
        com.facebook.internal.i0.n(string, "alg");
        if (string == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        this.a = string;
        String string2 = parcel.readString();
        com.facebook.internal.i0.n(string2, "typ");
        if (string2 == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        this.b = string2;
        String string3 = parcel.readString();
        com.facebook.internal.i0.n(string3, "kid");
        if (string3 == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        this.c = string3;
    }

    public i(String str) throws JSONException {
        l.y.c.i.e(str, "encodedHeaderString");
        if (!b(str)) {
            throw new IllegalArgumentException("Invalid Header".toString());
        }
        byte[] bArrDecode = Base64.decode(str, 0);
        l.y.c.i.d(bArrDecode, "decodedBytes");
        JSONObject jSONObject = new JSONObject(new String(bArrDecode, l.d0.d.b));
        String string = jSONObject.getString("alg");
        l.y.c.i.d(string, "jsonObj.getString(\"alg\")");
        this.a = string;
        String string2 = jSONObject.getString("typ");
        l.y.c.i.d(string2, "jsonObj.getString(\"typ\")");
        this.b = string2;
        String string3 = jSONObject.getString("kid");
        l.y.c.i.d(string3, "jsonObj.getString(\"kid\")");
        this.c = string3;
    }

    private final boolean b(String str) {
        com.facebook.internal.i0.j(str, "encodedHeaderString");
        byte[] bArrDecode = Base64.decode(str, 0);
        l.y.c.i.d(bArrDecode, "decodedBytes");
        try {
            JSONObject jSONObject = new JSONObject(new String(bArrDecode, l.d0.d.b));
            String strOptString = jSONObject.optString("alg");
            l.y.c.i.d(strOptString, "alg");
            boolean z = (strOptString.length() > 0) && l.y.c.i.a(strOptString, "RS256");
            String strOptString2 = jSONObject.optString("kid");
            l.y.c.i.d(strOptString2, "jsonObj.optString(\"kid\")");
            boolean z2 = strOptString2.length() > 0;
            String strOptString3 = jSONObject.optString("typ");
            l.y.c.i.d(strOptString3, "jsonObj.optString(\"typ\")");
            return z && z2 && (strOptString3.length() > 0);
        } catch (JSONException unused) {
            return false;
        }
    }

    public final String a() {
        return this.c;
    }

    public final JSONObject c() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("alg", this.a);
        jSONObject.put("typ", this.b);
        jSONObject.put("kid", this.c);
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
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return l.y.c.i.a(this.a, iVar.a) && l.y.c.i.a(this.b, iVar.b) && l.y.c.i.a(this.c, iVar.c);
    }

    public int hashCode() {
        return ((((527 + this.a.hashCode()) * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public String toString() {
        String string = c().toString();
        l.y.c.i.d(string, "headerJsonObject.toString()");
        return string;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        l.y.c.i.e(parcel, "dest");
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
    }
}
