package com.google.android.gms.common.internal.y;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class b {

    public static class a extends RuntimeException {
        public a(String str, Parcel parcel) {
            super(str + " Parcel: pos=" + parcel.dataPosition() + " size=" + parcel.dataSize());
        }
    }

    public static Bundle a(Parcel parcel, int i2) {
        int iS = s(parcel, i2);
        int iDataPosition = parcel.dataPosition();
        if (iS == 0) {
            return null;
        }
        Bundle bundle = parcel.readBundle();
        parcel.setDataPosition(iDataPosition + iS);
        return bundle;
    }

    public static int[] b(Parcel parcel, int i2) {
        int iS = s(parcel, i2);
        int iDataPosition = parcel.dataPosition();
        if (iS == 0) {
            return null;
        }
        int[] iArrCreateIntArray = parcel.createIntArray();
        parcel.setDataPosition(iDataPosition + iS);
        return iArrCreateIntArray;
    }

    public static <T extends Parcelable> T c(Parcel parcel, int i2, Parcelable.Creator<T> creator) {
        int iS = s(parcel, i2);
        int iDataPosition = parcel.dataPosition();
        if (iS == 0) {
            return null;
        }
        T tCreateFromParcel = creator.createFromParcel(parcel);
        parcel.setDataPosition(iDataPosition + iS);
        return tCreateFromParcel;
    }

    public static String d(Parcel parcel, int i2) {
        int iS = s(parcel, i2);
        int iDataPosition = parcel.dataPosition();
        if (iS == 0) {
            return null;
        }
        String string = parcel.readString();
        parcel.setDataPosition(iDataPosition + iS);
        return string;
    }

    public static ArrayList<String> e(Parcel parcel, int i2) {
        int iS = s(parcel, i2);
        int iDataPosition = parcel.dataPosition();
        if (iS == 0) {
            return null;
        }
        ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
        parcel.setDataPosition(iDataPosition + iS);
        return arrayListCreateStringArrayList;
    }

    public static <T> T[] f(Parcel parcel, int i2, Parcelable.Creator<T> creator) {
        int iS = s(parcel, i2);
        int iDataPosition = parcel.dataPosition();
        if (iS == 0) {
            return null;
        }
        T[] tArr = (T[]) parcel.createTypedArray(creator);
        parcel.setDataPosition(iDataPosition + iS);
        return tArr;
    }

    public static <T> ArrayList<T> g(Parcel parcel, int i2, Parcelable.Creator<T> creator) {
        int iS = s(parcel, i2);
        int iDataPosition = parcel.dataPosition();
        if (iS == 0) {
            return null;
        }
        ArrayList<T> arrayListCreateTypedArrayList = parcel.createTypedArrayList(creator);
        parcel.setDataPosition(iDataPosition + iS);
        return arrayListCreateTypedArrayList;
    }

    public static void h(Parcel parcel, int i2) {
        if (parcel.dataPosition() == i2) {
            return;
        }
        throw new a("Overread allowed size end=" + i2, parcel);
    }

    public static int i(int i2) {
        return (char) i2;
    }

    public static boolean j(Parcel parcel, int i2) {
        w(parcel, i2, 4);
        return parcel.readInt() != 0;
    }

    public static Boolean k(Parcel parcel, int i2) {
        int iS = s(parcel, i2);
        if (iS == 0) {
            return null;
        }
        v(parcel, i2, iS, 4);
        return Boolean.valueOf(parcel.readInt() != 0);
    }

    public static Double l(Parcel parcel, int i2) {
        int iS = s(parcel, i2);
        if (iS == 0) {
            return null;
        }
        v(parcel, i2, iS, 8);
        return Double.valueOf(parcel.readDouble());
    }

    public static Float m(Parcel parcel, int i2) {
        int iS = s(parcel, i2);
        if (iS == 0) {
            return null;
        }
        v(parcel, i2, iS, 4);
        return Float.valueOf(parcel.readFloat());
    }

    public static int n(Parcel parcel) {
        return parcel.readInt();
    }

    public static IBinder o(Parcel parcel, int i2) {
        int iS = s(parcel, i2);
        int iDataPosition = parcel.dataPosition();
        if (iS == 0) {
            return null;
        }
        IBinder strongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(iDataPosition + iS);
        return strongBinder;
    }

    public static int p(Parcel parcel, int i2) {
        w(parcel, i2, 4);
        return parcel.readInt();
    }

    public static long q(Parcel parcel, int i2) {
        w(parcel, i2, 8);
        return parcel.readLong();
    }

    public static Long r(Parcel parcel, int i2) {
        int iS = s(parcel, i2);
        if (iS == 0) {
            return null;
        }
        v(parcel, i2, iS, 8);
        return Long.valueOf(parcel.readLong());
    }

    public static int s(Parcel parcel, int i2) {
        return (i2 & (-65536)) != -65536 ? (char) (i2 >> 16) : parcel.readInt();
    }

    public static void t(Parcel parcel, int i2) {
        parcel.setDataPosition(parcel.dataPosition() + s(parcel, i2));
    }

    public static int u(Parcel parcel) {
        int iN = n(parcel);
        int iS = s(parcel, iN);
        int iDataPosition = parcel.dataPosition();
        if (i(iN) != 20293) {
            throw new a("Expected object header. Got 0x".concat(String.valueOf(Integer.toHexString(iN))), parcel);
        }
        int i2 = iS + iDataPosition;
        if (i2 >= iDataPosition && i2 <= parcel.dataSize()) {
            return i2;
        }
        throw new a("Size read is invalid start=" + iDataPosition + " end=" + i2, parcel);
    }

    private static void v(Parcel parcel, int i2, int i3, int i4) {
        if (i3 == i4) {
            return;
        }
        throw new a("Expected size " + i4 + " got " + i3 + " (0x" + Integer.toHexString(i3) + ")", parcel);
    }

    private static void w(Parcel parcel, int i2, int i3) {
        int iS = s(parcel, i2);
        if (iS == i3) {
            return;
        }
        throw new a("Expected size " + i3 + " got " + iS + " (0x" + Integer.toHexString(iS) + ")", parcel);
    }
}
