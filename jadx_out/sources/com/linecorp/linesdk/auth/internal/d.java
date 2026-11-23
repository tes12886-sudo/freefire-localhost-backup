package com.linecorp.linesdk.auth.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import j.e.b.h.g;

/* JADX INFO: loaded from: classes.dex */
final class d implements Parcelable {
    public static final Parcelable.Creator<d> CREATOR = new a();
    g a;
    String b;
    String c;
    int d;

    static class a implements Parcelable.Creator<d> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ d createFromParcel(Parcel parcel) {
            return new d(parcel, (byte) 0);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ d[] newArray(int i2) {
            return new d[i2];
        }
    }

    /* JADX WARN: $VALUES field not found */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    static final class b {
        public static final int a = 1;
        public static final int b = 2;
        public static final int c = 3;
        public static final int d = 4;
        private static final /* synthetic */ int[] e = {1, 2, 3, 4};

        public static int[] a() {
            return (int[]) e.clone();
        }
    }

    d() {
        this.d = b.a;
    }

    private d(Parcel parcel) {
        this.d = b.a;
        String string = parcel.readString();
        String string2 = parcel.readString();
        this.a = (TextUtils.isEmpty(string) || TextUtils.isEmpty(string2)) ? null : new g(string, string2);
        this.b = parcel.readString();
        this.d = b.a()[parcel.readByte()];
        this.c = parcel.readString();
    }

    /* synthetic */ d(Parcel parcel, byte b2) {
        this(parcel);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        g gVar = this.a;
        parcel.writeString(gVar == null ? null : gVar.a);
        g gVar2 = this.a;
        parcel.writeString(gVar2 != null ? gVar2.b : null);
        parcel.writeString(this.b);
        parcel.writeByte((byte) (this.d - 1));
        parcel.writeString(this.c);
    }
}
