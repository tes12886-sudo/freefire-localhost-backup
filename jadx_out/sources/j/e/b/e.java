package j.e.b;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class e implements Parcelable {
    public static final Parcelable.Creator<e> CREATOR = new a();
    private final j.e.b.a a;
    private final List<String> b;

    static class a implements Parcelable.Creator<e> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final e createFromParcel(Parcel parcel) {
            return new e(parcel, (a) null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final e[] newArray(int i2) {
            return new e[i2];
        }
    }

    private e(Parcel parcel) {
        this.a = (j.e.b.a) parcel.readParcelable(j.e.b.a.class.getClassLoader());
        ArrayList arrayList = new ArrayList(8);
        parcel.readStringList(arrayList);
        this.b = Collections.unmodifiableList(arrayList);
    }

    /* synthetic */ e(Parcel parcel, a aVar) {
        this(parcel);
    }

    public e(j.e.b.a aVar, List<String> list) {
        this.a = aVar;
        this.b = list;
    }

    public j.e.b.a a() {
        return this.a;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e.class != obj.getClass()) {
            return false;
        }
        e eVar = (e) obj;
        if (this.a.equals(eVar.a)) {
            return this.b.equals(eVar.b);
        }
        return false;
    }

    public int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public String toString() {
        return "LineCredential{accessToken=" + ((Object) "#####") + ", permission=" + this.b + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeParcelable(this.a, i2);
        parcel.writeStringList(this.b);
    }
}
