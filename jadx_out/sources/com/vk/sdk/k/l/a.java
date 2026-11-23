package com.vk.sdk.k.l;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.sdk.h;

/* JADX INFO: loaded from: classes.dex */
public class a extends h implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C0167a();
    public c c;
    public float d;

    /* JADX INFO: renamed from: com.vk.sdk.k.l.a$a, reason: collision with other inner class name */
    class C0167a implements Parcelable.Creator<a> {
        C0167a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public a createFromParcel(Parcel parcel) {
            return new a(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public a[] newArray(int i2) {
            return new a[i2];
        }
    }

    static /* synthetic */ class b {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[c.values().length];
            a = iArr;
            try {
                iArr[c.Jpg.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[c.Png.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    enum c {
        Jpg,
        Png
    }

    public a() {
        this.c = c.Png;
    }

    private a(Parcel parcel) {
        this.c = c.Png;
        int i2 = parcel.readInt();
        this.c = i2 == -1 ? null : c.values()[i2];
        this.d = parcel.readFloat();
    }

    /* synthetic */ a(Parcel parcel, C0167a c0167a) {
        this(parcel);
    }

    public static a e(float f) {
        a aVar = new a();
        aVar.c = c.Jpg;
        aVar.d = f;
        return aVar;
    }

    public String d() {
        int i2 = b.a[this.c.ordinal()];
        if (i2 != 1) {
            return i2 != 2 ? "file" : "png";
        }
        return "jpg";
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        c cVar = this.c;
        parcel.writeInt(cVar == null ? -1 : cVar.ordinal());
        parcel.writeFloat(this.d);
    }
}
