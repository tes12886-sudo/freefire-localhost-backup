package com.google.android.gms.common.internal.y;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class c {
    public static int a(Parcel parcel) {
        return r(parcel, 20293);
    }

    public static void b(Parcel parcel, int i2) {
        s(parcel, i2);
    }

    public static void c(Parcel parcel, int i2, boolean z) {
        t(parcel, i2, 4);
        parcel.writeInt(z ? 1 : 0);
    }

    public static void d(Parcel parcel, int i2, Boolean bool, boolean z) {
        if (bool != null) {
            t(parcel, i2, 4);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        } else if (z) {
            t(parcel, i2, 0);
        }
    }

    public static void e(Parcel parcel, int i2, Bundle bundle, boolean z) {
        if (bundle == null) {
            if (z) {
                t(parcel, i2, 0);
            }
        } else {
            int iR = r(parcel, i2);
            parcel.writeBundle(bundle);
            s(parcel, iR);
        }
    }

    public static void f(Parcel parcel, int i2, Double d, boolean z) {
        if (d != null) {
            t(parcel, i2, 8);
            parcel.writeDouble(d.doubleValue());
        } else if (z) {
            t(parcel, i2, 0);
        }
    }

    public static void g(Parcel parcel, int i2, Float f, boolean z) {
        if (f != null) {
            t(parcel, i2, 4);
            parcel.writeFloat(f.floatValue());
        } else if (z) {
            t(parcel, i2, 0);
        }
    }

    public static void h(Parcel parcel, int i2, IBinder iBinder, boolean z) {
        if (iBinder == null) {
            if (z) {
                t(parcel, i2, 0);
            }
        } else {
            int iR = r(parcel, i2);
            parcel.writeStrongBinder(iBinder);
            s(parcel, iR);
        }
    }

    public static void i(Parcel parcel, int i2, int i3) {
        t(parcel, i2, 4);
        parcel.writeInt(i3);
    }

    public static void j(Parcel parcel, int i2, int[] iArr, boolean z) {
        if (iArr == null) {
            if (z) {
                t(parcel, i2, 0);
            }
        } else {
            int iR = r(parcel, i2);
            parcel.writeIntArray(iArr);
            s(parcel, iR);
        }
    }

    public static void k(Parcel parcel, int i2, long j2) {
        t(parcel, i2, 8);
        parcel.writeLong(j2);
    }

    public static void l(Parcel parcel, int i2, Long l2, boolean z) {
        if (l2 != null) {
            t(parcel, i2, 8);
            parcel.writeLong(l2.longValue());
        } else if (z) {
            t(parcel, i2, 0);
        }
    }

    public static void m(Parcel parcel, int i2, Parcelable parcelable, int i3, boolean z) {
        if (parcelable == null) {
            if (z) {
                t(parcel, i2, 0);
            }
        } else {
            int iR = r(parcel, i2);
            parcelable.writeToParcel(parcel, i3);
            s(parcel, iR);
        }
    }

    public static void n(Parcel parcel, int i2, String str, boolean z) {
        if (str == null) {
            if (z) {
                t(parcel, i2, 0);
            }
        } else {
            int iR = r(parcel, i2);
            parcel.writeString(str);
            s(parcel, iR);
        }
    }

    public static void o(Parcel parcel, int i2, List<String> list, boolean z) {
        if (list == null) {
            if (z) {
                t(parcel, i2, 0);
            }
        } else {
            int iR = r(parcel, i2);
            parcel.writeStringList(list);
            s(parcel, iR);
        }
    }

    public static <T extends Parcelable> void p(Parcel parcel, int i2, T[] tArr, int i3, boolean z) {
        if (tArr == null) {
            if (z) {
                t(parcel, i2, 0);
                return;
            }
            return;
        }
        int iR = r(parcel, i2);
        parcel.writeInt(tArr.length);
        for (T t : tArr) {
            if (t == null) {
                parcel.writeInt(0);
            } else {
                u(parcel, t, i3);
            }
        }
        s(parcel, iR);
    }

    public static <T extends Parcelable> void q(Parcel parcel, int i2, List<T> list, boolean z) {
        if (list == null) {
            if (z) {
                t(parcel, i2, 0);
                return;
            }
            return;
        }
        int iR = r(parcel, i2);
        int size = list.size();
        parcel.writeInt(size);
        for (int i3 = 0; i3 < size; i3++) {
            T t = list.get(i3);
            if (t == null) {
                parcel.writeInt(0);
            } else {
                u(parcel, t, 0);
            }
        }
        s(parcel, iR);
    }

    private static int r(Parcel parcel, int i2) {
        parcel.writeInt(i2 | (-65536));
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    private static void s(Parcel parcel, int i2) {
        int iDataPosition = parcel.dataPosition();
        parcel.setDataPosition(i2 - 4);
        parcel.writeInt(iDataPosition - i2);
        parcel.setDataPosition(iDataPosition);
    }

    private static void t(Parcel parcel, int i2, int i3) {
        parcel.writeInt(i2 | (i3 << 16));
    }

    private static void u(Parcel parcel, Parcelable parcelable, int i2) {
        int iDataPosition = parcel.dataPosition();
        parcel.writeInt(1);
        int iDataPosition2 = parcel.dataPosition();
        parcelable.writeToParcel(parcel, i2);
        int iDataPosition3 = parcel.dataPosition();
        parcel.setDataPosition(iDataPosition);
        parcel.writeInt(iDataPosition3 - iDataPosition2);
        parcel.setDataPosition(iDataPosition3);
    }
}
