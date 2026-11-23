package j.e.b;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public class f implements Parcelable {
    public static final Parcelable.Creator<f> CREATOR = new a();
    private final String a;
    private final String b;
    private final Uri c;
    private final String d;

    static class a implements Parcelable.Creator<f> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final f createFromParcel(Parcel parcel) {
            return new f(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final f[] newArray(int i2) {
            return new f[i2];
        }
    }

    private f(Parcel parcel) {
        this.a = parcel.readString();
        this.b = parcel.readString();
        this.c = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        this.d = parcel.readString();
    }

    /* synthetic */ f(Parcel parcel, a aVar) {
        this(parcel);
    }

    public f(String str, String str2, Uri uri, String str3) {
        this.a = str;
        this.b = str2;
        this.c = uri;
        this.d = str3;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && f.class == obj.getClass()) {
            f fVar = (f) obj;
            if (!this.a.equals(fVar.a) || !this.b.equals(fVar.b)) {
                return false;
            }
            Uri uri = this.c;
            if (uri == null ? fVar.c != null : !uri.equals(fVar.c)) {
                return false;
            }
            String str = this.d;
            String str2 = fVar.d;
            if (str != null) {
                return str.equals(str2);
            }
            if (str2 == null) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = ((this.a.hashCode() * 31) + this.b.hashCode()) * 31;
        Uri uri = this.c;
        int iHashCode2 = (iHashCode + (uri != null ? uri.hashCode() : 0)) * 31;
        String str = this.d;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return "LineProfile{displayName='" + this.b + "', userId='" + this.a + "', pictureUrl='" + this.c + "', statusMessage='" + this.d + "'}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeParcelable(this.c, i2);
        parcel.writeString(this.d);
    }
}
