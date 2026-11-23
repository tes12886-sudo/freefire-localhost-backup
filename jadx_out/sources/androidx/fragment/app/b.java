package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
final class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new a();
    final int[] a;
    final ArrayList<String> b;
    final int[] c;
    final int[] d;
    final int e;
    final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final int f384g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final int f385h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final CharSequence f386i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    final int f387j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    final CharSequence f388k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    final ArrayList<String> f389l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    final ArrayList<String> f390m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final boolean f391n;

    class a implements Parcelable.Creator<b> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public b createFromParcel(Parcel parcel) {
            return new b(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public b[] newArray(int i2) {
            return new b[i2];
        }
    }

    public b(Parcel parcel) {
        this.a = parcel.createIntArray();
        this.b = parcel.createStringArrayList();
        this.c = parcel.createIntArray();
        this.d = parcel.createIntArray();
        this.e = parcel.readInt();
        this.f = parcel.readString();
        this.f384g = parcel.readInt();
        this.f385h = parcel.readInt();
        this.f386i = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f387j = parcel.readInt();
        this.f388k = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f389l = parcel.createStringArrayList();
        this.f390m = parcel.createStringArrayList();
        this.f391n = parcel.readInt() != 0;
    }

    public b(androidx.fragment.app.a aVar) {
        int size = aVar.a.size();
        this.a = new int[size * 5];
        if (!aVar.f420g) {
            throw new IllegalStateException("Not on back stack");
        }
        this.b = new ArrayList<>(size);
        this.c = new int[size];
        this.d = new int[size];
        int i2 = 0;
        int i3 = 0;
        while (i2 < size) {
            w.a aVar2 = aVar.a.get(i2);
            int i4 = i3 + 1;
            this.a[i3] = aVar2.a;
            ArrayList<String> arrayList = this.b;
            Fragment fragment = aVar2.b;
            arrayList.add(fragment != null ? fragment.f : null);
            int[] iArr = this.a;
            int i5 = i4 + 1;
            iArr[i4] = aVar2.c;
            int i6 = i5 + 1;
            iArr[i5] = aVar2.d;
            int i7 = i6 + 1;
            iArr[i6] = aVar2.e;
            iArr[i7] = aVar2.f;
            this.c[i2] = aVar2.f429g.ordinal();
            this.d[i2] = aVar2.f430h.ordinal();
            i2++;
            i3 = i7 + 1;
        }
        this.e = aVar.f;
        this.f = aVar.f421h;
        this.f384g = aVar.s;
        this.f385h = aVar.f422i;
        this.f386i = aVar.f423j;
        this.f387j = aVar.f424k;
        this.f388k = aVar.f425l;
        this.f389l = aVar.f426m;
        this.f390m = aVar.f427n;
        this.f391n = aVar.f428o;
    }

    public androidx.fragment.app.a a(n nVar) {
        androidx.fragment.app.a aVar = new androidx.fragment.app.a(nVar);
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int[] iArr = this.a;
            if (i2 >= iArr.length) {
                aVar.f = this.e;
                aVar.f421h = this.f;
                aVar.s = this.f384g;
                aVar.f420g = true;
                aVar.f422i = this.f385h;
                aVar.f423j = this.f386i;
                aVar.f424k = this.f387j;
                aVar.f425l = this.f388k;
                aVar.f426m = this.f389l;
                aVar.f427n = this.f390m;
                aVar.f428o = this.f391n;
                aVar.m(1);
                return aVar;
            }
            w.a aVar2 = new w.a();
            int i4 = i2 + 1;
            aVar2.a = iArr[i2];
            if (n.F0(2)) {
                Log.v("FragmentManager", "Instantiate " + aVar + " op #" + i3 + " base fragment #" + this.a[i4]);
            }
            String str = this.b.get(i3);
            aVar2.b = str != null ? nVar.g0(str) : null;
            aVar2.f429g = androidx.lifecycle.g.c.values()[this.c[i3]];
            aVar2.f430h = androidx.lifecycle.g.c.values()[this.d[i3]];
            int[] iArr2 = this.a;
            int i5 = i4 + 1;
            int i6 = iArr2[i4];
            aVar2.c = i6;
            int i7 = i5 + 1;
            int i8 = iArr2[i5];
            aVar2.d = i8;
            int i9 = i7 + 1;
            int i10 = iArr2[i7];
            aVar2.e = i10;
            int i11 = iArr2[i9];
            aVar2.f = i11;
            aVar.b = i6;
            aVar.c = i8;
            aVar.d = i10;
            aVar.e = i11;
            aVar.e(aVar2);
            i3++;
            i2 = i9 + 1;
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeIntArray(this.a);
        parcel.writeStringList(this.b);
        parcel.writeIntArray(this.c);
        parcel.writeIntArray(this.d);
        parcel.writeInt(this.e);
        parcel.writeString(this.f);
        parcel.writeInt(this.f384g);
        parcel.writeInt(this.f385h);
        TextUtils.writeToParcel(this.f386i, parcel, 0);
        parcel.writeInt(this.f387j);
        TextUtils.writeToParcel(this.f388k, parcel, 0);
        parcel.writeStringList(this.f389l);
        parcel.writeStringList(this.f390m);
        parcel.writeInt(this.f391n ? 1 : 0);
    }
}
