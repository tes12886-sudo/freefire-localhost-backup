package com.facebook;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.IOException;
import java.security.spec.InvalidKeySpecException;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class f implements Parcelable {
    private final String a;
    private final String b;
    private final i c;
    private final h d;
    private final String e;
    public static final b f = new b(null);
    public static final Parcelable.Creator<f> CREATOR = new a();

    public static final class a implements Parcelable.Creator<f> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public f createFromParcel(Parcel parcel) {
            l.y.c.i.e(parcel, "source");
            return new f(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public f[] newArray(int i2) {
            return new f[i2];
        }
    }

    public static final class b {
        private b() {
        }

        public /* synthetic */ b(l.y.c.f fVar) {
            this();
        }

        public final void a(f fVar) {
            AuthenticationTokenManager.e.a().e(fVar);
        }
    }

    public f(Parcel parcel) {
        l.y.c.i.e(parcel, "parcel");
        String string = parcel.readString();
        com.facebook.internal.i0.n(string, j.c.a.a.EXTRA_TOKEN);
        if (string == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        this.a = string;
        String string2 = parcel.readString();
        com.facebook.internal.i0.m(string2, "expectedNonce");
        if (string2 == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        this.b = string2;
        Parcelable parcelable = parcel.readParcelable(i.class.getClassLoader());
        if (parcelable == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        this.c = (i) parcelable;
        Parcelable parcelable2 = parcel.readParcelable(h.class.getClassLoader());
        if (parcelable2 == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        this.d = (h) parcelable2;
        String string3 = parcel.readString();
        com.facebook.internal.i0.n(string3, "signature");
        if (string3 == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        this.e = string3;
    }

    public f(String str, String str2) {
        l.y.c.i.e(str, j.c.a.a.EXTRA_TOKEN);
        l.y.c.i.e(str2, "expectedNonce");
        com.facebook.internal.i0.j(str, j.c.a.a.EXTRA_TOKEN);
        com.facebook.internal.i0.j(str2, "expectedNonce");
        List listI0 = l.d0.q.i0(str, new String[]{"."}, false, 0, 6, null);
        if (!(listI0.size() == 3)) {
            throw new IllegalArgumentException("Invalid IdToken string".toString());
        }
        String str3 = (String) listI0.get(0);
        String str4 = (String) listI0.get(1);
        String str5 = (String) listI0.get(2);
        this.a = str;
        this.b = str2;
        i iVar = new i(str3);
        this.c = iVar;
        this.d = new h(str4, str2);
        if (!a(str3, str4, str5, iVar.a())) {
            throw new IllegalArgumentException("Invalid Signature".toString());
        }
        this.e = str5;
    }

    private final boolean a(String str, String str2, String str3, String str4) {
        try {
            String strB = com.facebook.internal.o0.b.b(str4);
            if (strB != null) {
                return com.facebook.internal.o0.b.c(com.facebook.internal.o0.b.a(strB), str + '.' + str2, str3);
            }
        } catch (IOException | InvalidKeySpecException unused) {
        }
        return false;
    }

    public static final void b(f fVar) {
        f.a(fVar);
    }

    public final JSONObject c() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("token_string", this.a);
        jSONObject.put("expected_nonce", this.b);
        jSONObject.put("header", this.c.c());
        jSONObject.put("claims", this.d.b());
        jSONObject.put("signature", this.e);
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
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return l.y.c.i.a(this.a, fVar.a) && l.y.c.i.a(this.b, fVar.b) && l.y.c.i.a(this.c, fVar.c) && l.y.c.i.a(this.d, fVar.d) && l.y.c.i.a(this.e, fVar.e);
    }

    public int hashCode() {
        return ((((((((527 + this.a.hashCode()) * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        l.y.c.i.e(parcel, "dest");
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeParcelable(this.c, i2);
        parcel.writeParcelable(this.d, i2);
        parcel.writeString(this.e);
    }
}
