package j.g.a.a.a;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public class r extends j.g.a.a.a.a implements Parcelable {
    public static final Parcelable.Creator<r> CREATOR = new a();

    @j.d.d.y.c(j.c.a.a.EXTRA_TOKEN)
    public final String a;

    @j.d.d.y.c("secret")
    public final String b;

    class a implements Parcelable.Creator<r> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public r createFromParcel(Parcel parcel) {
            return new r(parcel, (a) null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public r[] newArray(int i2) {
            return new r[i2];
        }
    }

    private r(Parcel parcel) {
        this.a = parcel.readString();
        this.b = parcel.readString();
    }

    /* synthetic */ r(Parcel parcel, a aVar) {
        this(parcel);
    }

    public r(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        String str = this.b;
        if (str == null ? rVar.b != null : !str.equals(rVar.b)) {
            return false;
        }
        String str2 = this.a;
        String str3 = rVar.a;
        return str2 == null ? str3 == null : str2.equals(str3);
    }

    public int hashCode() {
        String str = this.a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "token=" + this.a + ",secret=" + this.b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
    }
}
