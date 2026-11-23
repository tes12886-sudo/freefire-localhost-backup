package j.g.a.a.a.y.j;

import android.os.Parcel;
import android.os.Parcelable;
import j.g.a.a.a.r;

/* JADX INFO: loaded from: classes.dex */
public class g implements Parcelable {
    public static final Parcelable.Creator<g> CREATOR = new a();
    public final r a;
    public final String b;
    public final long c;

    class a implements Parcelable.Creator<g> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public g createFromParcel(Parcel parcel) {
            return new g(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public g[] newArray(int i2) {
            return new g[i2];
        }
    }

    private g(Parcel parcel) {
        this.a = (r) parcel.readParcelable(r.class.getClassLoader());
        this.b = parcel.readString();
        this.c = parcel.readLong();
    }

    /* synthetic */ g(Parcel parcel, a aVar) {
        this(parcel);
    }

    public g(r rVar, String str, long j2) {
        this.a = rVar;
        this.b = str;
        this.c = j2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "authToken=" + this.a + ",userName=" + this.b + ",userId=" + this.c;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeParcelable(this.a, i2);
        parcel.writeString(this.b);
        parcel.writeLong(this.c);
    }
}
