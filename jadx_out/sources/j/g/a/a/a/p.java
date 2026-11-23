package j.g.a.a.a;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public class p implements Parcelable {
    public static final Parcelable.Creator<p> CREATOR = new a();
    private final String a;
    private final String b;

    class a implements Parcelable.Creator<p> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public p createFromParcel(Parcel parcel) {
            return new p(parcel, (a) null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public p[] newArray(int i2) {
            return new p[i2];
        }
    }

    private p(Parcel parcel) {
        this.a = parcel.readString();
        this.b = parcel.readString();
    }

    /* synthetic */ p(Parcel parcel, a aVar) {
        this(parcel);
    }

    public p(String str, String str2) {
        if (str == null || str2 == null) {
            throw new IllegalArgumentException("TwitterAuthConfig must not be created with null consumer key or secret.");
        }
        this.a = d(str);
        this.b = d(str2);
    }

    static String d(String str) {
        if (str != null) {
            return str.trim();
        }
        return null;
    }

    public String a() {
        return this.a;
    }

    public String b() {
        return this.b;
    }

    public int c() {
        return 140;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
    }
}
