package j.e.b.i;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes.dex */
public class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C0250a();
    private static int f = 1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static int f2141g = 2;
    private final String a;
    private final Uri b;
    private final Uri c;
    private final boolean d;
    private final boolean e;

    /* JADX INFO: renamed from: j.e.b.i.a$a, reason: collision with other inner class name */
    static class C0250a implements Parcelable.Creator<a> {
        C0250a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final a createFromParcel(Parcel parcel) {
            return new a(parcel, (C0250a) null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final a[] newArray(int i2) {
            return new a[i2];
        }
    }

    public static class b {
        private final String a;
        private Uri b;
        private Uri c;
        private boolean d;
        private boolean e;

        public b(String str) {
            if (TextUtils.isEmpty(str)) {
                throw new IllegalArgumentException("channelId is empty.");
            }
            this.a = str;
            this.b = Uri.parse("https://access.line.me/v2");
            this.c = Uri.parse("https://access.line.me/dialog/oauth/weblogin");
        }

        public a f() {
            return new a(this, (C0250a) null);
        }
    }

    private a(Parcel parcel) {
        this.a = parcel.readString();
        this.b = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        this.c = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        int i2 = parcel.readInt();
        this.d = (f & i2) > 0;
        this.e = (i2 & f2141g) > 0;
    }

    /* synthetic */ a(Parcel parcel, C0250a c0250a) {
        this(parcel);
    }

    private a(b bVar) {
        this.a = bVar.a;
        this.b = bVar.b;
        this.c = bVar.c;
        this.d = bVar.d;
        this.e = bVar.e;
    }

    /* synthetic */ a(b bVar, C0250a c0250a) {
        this(bVar);
    }

    public String a() {
        return this.a;
    }

    public Uri b() {
        return this.b;
    }

    public Uri c() {
        return this.c;
    }

    public boolean d() {
        return this.e;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean e() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        if (this.d == aVar.d && this.e == aVar.e && this.a.equals(aVar.a) && this.b.equals(aVar.b)) {
            return this.c.equals(aVar.c);
        }
        return false;
    }

    public int hashCode() {
        return (((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + (this.d ? 1 : 0)) * 31) + (this.e ? 1 : 0);
    }

    public String toString() {
        return "LineAuthenticationConfig{channelId=" + this.a + ", endPointBaseUrl=" + this.b + ", webLoginPageUrl=" + this.c + ", isLineAppAuthenticationDisabled=" + this.d + ", isEncryptorPreparationDisabled=" + this.e + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.a);
        parcel.writeParcelable(this.b, i2);
        parcel.writeParcelable(this.c, i2);
        parcel.writeInt((this.d ? f : 0) | 0 | (this.e ? f2141g : 0));
    }
}
