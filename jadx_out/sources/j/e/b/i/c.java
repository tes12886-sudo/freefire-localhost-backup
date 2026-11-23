package j.e.b.i;

import android.os.Parcel;
import android.os.Parcelable;
import j.e.b.d;
import j.e.b.e;
import j.e.b.f;

/* JADX INFO: loaded from: classes.dex */
public class c implements Parcelable {
    private final d a;
    private final f b;
    private final e c;
    private final j.e.b.b d;
    public static final c e = new c(d.CANCEL, j.e.b.b.c);
    public static final Parcelable.Creator<c> CREATOR = new a();

    static class a implements Parcelable.Creator<c> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final c createFromParcel(Parcel parcel) {
            return new c(parcel, (a) null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final c[] newArray(int i2) {
            return new c[i2];
        }
    }

    private c(Parcel parcel) {
        this.a = (d) parcel.readSerializable();
        this.b = (f) parcel.readParcelable(f.class.getClassLoader());
        this.c = (e) parcel.readParcelable(j.e.b.a.class.getClassLoader());
        this.d = (j.e.b.b) parcel.readParcelable(j.e.b.b.class.getClassLoader());
    }

    /* synthetic */ c(Parcel parcel, a aVar) {
        this(parcel);
    }

    public c(d dVar, j.e.b.b bVar) {
        this(dVar, null, null, bVar);
    }

    c(d dVar, f fVar, e eVar, j.e.b.b bVar) {
        this.a = dVar;
        this.b = fVar;
        this.c = eVar;
        this.d = bVar;
    }

    public c(f fVar, e eVar) {
        this(d.SUCCESS, fVar, eVar, j.e.b.b.c);
    }

    public j.e.b.b a() {
        return this.d;
    }

    public e b() {
        return this.c;
    }

    public d c() {
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
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        if (this.a != cVar.a) {
            return false;
        }
        f fVar = this.b;
        if (fVar == null ? cVar.b != null : !fVar.equals(cVar.b)) {
            return false;
        }
        e eVar = this.c;
        if (eVar == null ? cVar.c == null : eVar.equals(cVar.c)) {
            return this.d.equals(cVar.d);
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        f fVar = this.b;
        int iHashCode2 = (iHashCode + (fVar != null ? fVar.hashCode() : 0)) * 31;
        e eVar = this.c;
        return ((iHashCode2 + (eVar != null ? eVar.hashCode() : 0)) * 31) + this.d.hashCode();
    }

    public String toString() {
        return "LineLoginResult{errorData=" + this.d + ", responseCode=" + this.a + ", lineProfile=" + this.b + ", lineCredential=" + this.c + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeSerializable(this.a);
        parcel.writeParcelable(this.b, i2);
        parcel.writeParcelable(this.c, i2);
        parcel.writeParcelable(this.d, i2);
    }
}
