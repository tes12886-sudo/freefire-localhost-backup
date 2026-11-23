package com.facebook;

import android.os.Parcel;
import android.os.Parcelable;
import java.net.HttpURLConnection;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class q implements Parcelable {
    private final String a;
    private n b;
    private final a c;
    private final int d;
    private final int e;
    private final int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f724g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f725h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final String f726i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Object f727j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final c f723l = new c(null);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final d f722k = new d(j.d.a.e.a.a.i.g.STATUS_SUCCESS, 299);
    public static final Parcelable.Creator<q> CREATOR = new b();

    public enum a {
        LOGIN_RECOVERABLE,
        OTHER,
        TRANSIENT
    }

    public static final class b implements Parcelable.Creator<q> {
        b() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public q createFromParcel(Parcel parcel) {
            l.y.c.i.e(parcel, "parcel");
            return new q(parcel, (l.y.c.f) null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public q[] newArray(int i2) {
            return new q[i2];
        }
    }

    public static final class c {
        private c() {
        }

        public /* synthetic */ c(l.y.c.f fVar) {
            this();
        }

        /* JADX WARN: Code duplicated, block: B:45:0x00cd A[Catch: JSONException -> 0x012b, TryCatch #0 {JSONException -> 0x012b, blocks: (B:3:0x0012, B:5:0x0018, B:7:0x0022, B:9:0x0026, B:12:0x0034, B:14:0x003f, B:17:0x0049, B:20:0x0053, B:23:0x005b, B:25:0x0061, B:28:0x006b, B:31:0x0075, B:45:0x00cd, B:33:0x0081, B:36:0x008e, B:38:0x0097, B:42:0x00a8, B:47:0x00ee, B:49:0x00f8, B:51:0x0106, B:53:0x010f), top: B:57:0x0012 }] */
        public final q a(JSONObject jSONObject, Object obj, HttpURLConnection httpURLConnection) {
            String strOptString;
            int iOptInt;
            String str;
            String strOptString2;
            String strOptString3;
            boolean zOptBoolean;
            String str2;
            l.y.c.i.e(jSONObject, "singleResult");
            try {
                if (jSONObject.has("code")) {
                    int i2 = jSONObject.getInt("code");
                    Object objJ = com.facebook.internal.h0.J(jSONObject, "body", "FACEBOOK_NON_JSON_RESULT");
                    if (objJ != null && (objJ instanceof JSONObject)) {
                        boolean z = false;
                        int iOptInt2 = -1;
                        if (((JSONObject) objJ).has("error")) {
                            JSONObject jSONObject2 = (JSONObject) com.facebook.internal.h0.J((JSONObject) objJ, "error", null);
                            strOptString = jSONObject2 != null ? jSONObject2.optString("type", null) : null;
                            String strOptString4 = jSONObject2 != null ? jSONObject2.optString("message", null) : null;
                            int iOptInt3 = jSONObject2 != null ? jSONObject2.optInt("code", -1) : -1;
                            iOptInt2 = jSONObject2 != null ? jSONObject2.optInt("error_subcode", -1) : -1;
                            strOptString2 = jSONObject2 != null ? jSONObject2.optString("error_user_msg", null) : null;
                            strOptString3 = jSONObject2 != null ? jSONObject2.optString("error_user_title", null) : null;
                            str = strOptString4;
                            zOptBoolean = jSONObject2 != null ? jSONObject2.optBoolean("is_transient", false) : false;
                            iOptInt = iOptInt2;
                            z = true;
                            iOptInt2 = iOptInt3;
                        } else {
                            if (((JSONObject) objJ).has("error_code") || ((JSONObject) objJ).has("error_msg") || ((JSONObject) objJ).has("error_reason")) {
                                strOptString = ((JSONObject) objJ).optString("error_reason", null);
                                String strOptString5 = ((JSONObject) objJ).optString("error_msg", null);
                                int iOptInt4 = ((JSONObject) objJ).optInt("error_code", -1);
                                iOptInt = ((JSONObject) objJ).optInt("error_subcode", -1);
                                iOptInt2 = iOptInt4;
                                str = strOptString5;
                                strOptString2 = null;
                                strOptString3 = null;
                                z = true;
                                zOptBoolean = false;
                            } else {
                                str2 = null;
                                str = null;
                                strOptString2 = null;
                                strOptString3 = null;
                                iOptInt = -1;
                                zOptBoolean = false;
                            }
                            if (z) {
                                return new q(i2, iOptInt2, iOptInt, str2, str, strOptString3, strOptString2, (JSONObject) objJ, jSONObject, obj, httpURLConnection, null, zOptBoolean, null);
                            }
                        }
                        str2 = strOptString;
                        if (z) {
                            return new q(i2, iOptInt2, iOptInt, str2, str, strOptString3, strOptString2, (JSONObject) objJ, jSONObject, obj, httpURLConnection, null, zOptBoolean, null);
                        }
                    }
                    if (!c().a(i2)) {
                        return new q(i2, -1, -1, null, null, null, null, jSONObject.has("body") ? (JSONObject) com.facebook.internal.h0.J(jSONObject, "body", "FACEBOOK_NON_JSON_RESULT") : null, jSONObject, obj, httpURLConnection, null, false, null);
                    }
                }
            } catch (JSONException unused) {
            }
            return null;
        }

        public final synchronized com.facebook.internal.l b() {
            com.facebook.internal.t tVarJ = com.facebook.internal.u.j(r.g());
            if (tVarJ != null) {
                return tVarJ.d();
            }
            return com.facebook.internal.l.f617h.b();
        }

        public final d c() {
            return q.f722k;
        }
    }

    public static final class d {
        private final int a;
        private final int b;

        public d(int i2, int i3) {
            this.a = i2;
            this.b = i3;
        }

        public final boolean a(int i2) {
            return this.a <= i2 && this.b >= i2;
        }
    }

    private q(int i2, int i3, int i4, String str, String str2, String str3, String str4, JSONObject jSONObject, JSONObject jSONObject2, Object obj, HttpURLConnection httpURLConnection, n nVar, boolean z) {
        boolean z2;
        this.d = i2;
        this.e = i3;
        this.f = i4;
        this.f724g = str;
        this.f725h = str3;
        this.f726i = str4;
        this.f727j = obj;
        this.a = str2;
        if (nVar != null) {
            this.b = nVar;
            z2 = true;
        } else {
            this.b = new t(this, c());
            z2 = false;
        }
        a aVarC = z2 ? a.OTHER : f723l.b().c(i3, i4, z);
        this.c = aVarC;
        f723l.b().d(aVarC);
    }

    public /* synthetic */ q(int i2, int i3, int i4, String str, String str2, String str3, String str4, JSONObject jSONObject, JSONObject jSONObject2, Object obj, HttpURLConnection httpURLConnection, n nVar, boolean z, l.y.c.f fVar) {
        this(i2, i3, i4, str, str2, str3, str4, jSONObject, jSONObject2, obj, httpURLConnection, nVar, z);
    }

    public q(int i2, String str, String str2) {
        this(-1, i2, -1, str, str2, null, null, null, null, null, null, null, false);
    }

    private q(Parcel parcel) {
        this(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), null, null, null, null, null, false);
    }

    public /* synthetic */ q(Parcel parcel, l.y.c.f fVar) {
        this(parcel);
    }

    public q(HttpURLConnection httpURLConnection, Exception exc) {
        this(-1, -1, -1, null, null, null, null, null, null, null, httpURLConnection, exc instanceof n ? (n) exc : new n(exc), false);
    }

    public final int b() {
        return this.e;
    }

    public final String c() {
        String str = this.a;
        if (str != null) {
            return str;
        }
        n nVar = this.b;
        if (nVar != null) {
            return nVar.getLocalizedMessage();
        }
        return null;
    }

    public final String d() {
        return this.f724g;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final n e() {
        return this.b;
    }

    public final int f() {
        return this.d;
    }

    public final int g() {
        return this.f;
    }

    public String toString() {
        String str = "{HttpStatus: " + this.d + ", errorCode: " + this.e + ", subErrorCode: " + this.f + ", errorType: " + this.f724g + ", errorMessage: " + c() + "}";
        l.y.c.i.d(str, "StringBuilder(\"{HttpStat…(\"}\")\n        .toString()");
        return str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        l.y.c.i.e(parcel, "out");
        parcel.writeInt(this.d);
        parcel.writeInt(this.e);
        parcel.writeInt(this.f);
        parcel.writeString(this.f724g);
        parcel.writeString(c());
        parcel.writeString(this.f725h);
        parcel.writeString(this.f726i);
    }
}
