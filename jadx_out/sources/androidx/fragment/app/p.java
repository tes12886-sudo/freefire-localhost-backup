package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
final class p implements Parcelable {
    public static final Parcelable.Creator<p> CREATOR = new a();
    ArrayList<t> a;
    ArrayList<String> b;
    b[] c;
    int d;
    String e;
    ArrayList<String> f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    ArrayList<Bundle> f408g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    ArrayList<n.m> f409h;

    class a implements Parcelable.Creator<p> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public p createFromParcel(Parcel parcel) {
            return new p(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public p[] newArray(int i2) {
            return new p[i2];
        }
    }

    public p() {
        this.e = null;
        this.f = new ArrayList<>();
        this.f408g = new ArrayList<>();
    }

    public p(Parcel parcel) {
        this.e = null;
        this.f = new ArrayList<>();
        this.f408g = new ArrayList<>();
        this.a = parcel.createTypedArrayList(t.CREATOR);
        this.b = parcel.createStringArrayList();
        this.c = (b[]) parcel.createTypedArray(b.CREATOR);
        this.d = parcel.readInt();
        this.e = parcel.readString();
        this.f = parcel.createStringArrayList();
        this.f408g = parcel.createTypedArrayList(Bundle.CREATOR);
        this.f409h = parcel.createTypedArrayList(n.m.CREATOR);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeTypedList(this.a);
        parcel.writeStringList(this.b);
        parcel.writeTypedArray(this.c, i2);
        parcel.writeInt(this.d);
        parcel.writeString(this.e);
        parcel.writeStringList(this.f);
        parcel.writeTypedList(this.f408g);
        parcel.writeTypedList(this.f409h);
    }
}
