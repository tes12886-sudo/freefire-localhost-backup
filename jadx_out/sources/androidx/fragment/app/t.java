package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
final class t implements Parcelable {
    public static final Parcelable.Creator<t> CREATOR = new a();
    final String a;
    final String b;
    final boolean c;
    final int d;
    final int e;
    final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final boolean f413g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final boolean f414h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final boolean f415i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    final Bundle f416j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    final boolean f417k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    final int f418l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    Bundle f419m;

    class a implements Parcelable.Creator<t> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public t createFromParcel(Parcel parcel) {
            return new t(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public t[] newArray(int i2) {
            return new t[i2];
        }
    }

    t(Parcel parcel) {
        this.a = parcel.readString();
        this.b = parcel.readString();
        this.c = parcel.readInt() != 0;
        this.d = parcel.readInt();
        this.e = parcel.readInt();
        this.f = parcel.readString();
        this.f413g = parcel.readInt() != 0;
        this.f414h = parcel.readInt() != 0;
        this.f415i = parcel.readInt() != 0;
        this.f416j = parcel.readBundle();
        this.f417k = parcel.readInt() != 0;
        this.f419m = parcel.readBundle();
        this.f418l = parcel.readInt();
    }

    t(Fragment fragment) {
        this.a = fragment.getClass().getName();
        this.b = fragment.f;
        this.c = fragment.f373n;
        this.d = fragment.F;
        this.e = fragment.G;
        this.f = fragment.H;
        this.f413g = fragment.K;
        this.f414h = fragment.f372m;
        this.f415i = fragment.J;
        this.f416j = fragment.f366g;
        this.f417k = fragment.I;
        this.f418l = fragment.Z.ordinal();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentState{");
        sb.append(this.a);
        sb.append(" (");
        sb.append(this.b);
        sb.append(")}:");
        if (this.c) {
            sb.append(" fromLayout");
        }
        if (this.e != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.e));
        }
        String str = this.f;
        if (str != null && !str.isEmpty()) {
            sb.append(" tag=");
            sb.append(this.f);
        }
        if (this.f413g) {
            sb.append(" retainInstance");
        }
        if (this.f414h) {
            sb.append(" removing");
        }
        if (this.f415i) {
            sb.append(" detached");
        }
        if (this.f417k) {
            sb.append(" hidden");
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeInt(this.c ? 1 : 0);
        parcel.writeInt(this.d);
        parcel.writeInt(this.e);
        parcel.writeString(this.f);
        parcel.writeInt(this.f413g ? 1 : 0);
        parcel.writeInt(this.f414h ? 1 : 0);
        parcel.writeInt(this.f415i ? 1 : 0);
        parcel.writeBundle(this.f416j);
        parcel.writeInt(this.f417k ? 1 : 0);
        parcel.writeBundle(this.f419m);
        parcel.writeInt(this.f418l);
    }
}
