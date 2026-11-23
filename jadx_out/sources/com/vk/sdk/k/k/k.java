package com.vk.sdk.k.k;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class k extends g implements Comparable<k>, Parcelable, a {
    public String a;
    public int b;
    public int c;
    public char d;

    private k() {
    }

    public static k f(String str, char c, int i2, int i3) {
        k kVar = new k();
        kVar.a = str;
        kVar.d = c;
        r(kVar, i2, i3);
        return kVar;
    }

    public static k h(String str, int i2) {
        return j(str, i2, i2);
    }

    public static k j(String str, int i2, int i3) {
        char c;
        k kVar = new k();
        kVar.a = str;
        kVar.b = i2;
        kVar.c = i3;
        float f = i2 / i3;
        if (i2 <= 75) {
            c = 's';
        } else if (i2 <= 130) {
            c = f <= 1.5f ? 'o' : 'm';
        } else if (i2 <= 200 && f <= 1.5f) {
            c = 'p';
        } else if (i2 <= 320 && f <= 1.5f) {
            c = 'q';
        } else if (i2 <= 604) {
            c = 'x';
        } else if (i2 <= 807) {
            c = 'y';
        } else {
            if (i2 > 1280 || i3 > 1024) {
                if (i2 <= 2560 && i3 <= 2048) {
                    c = 'w';
                }
                return kVar;
            }
            c = 'z';
        }
        kVar.d = c;
        return kVar;
    }

    private static void l(k kVar, float f, int i2) {
        n(kVar, Math.min(1.5f, f), i2);
    }

    private static void n(k kVar, float f, int i2) {
        kVar.b = i2;
        kVar.c = (int) Math.ceil(i2 / f);
    }

    private static void q(k kVar, float f, int i2, int i3) {
        if (f > 1.0f) {
            kVar.b = i2;
            kVar.c = (int) (i2 / f);
        } else {
            kVar.c = i3;
            kVar.b = (int) (i3 * f);
        }
    }

    private static void r(k kVar, int i2, int i3) {
        int iMin;
        int iMin2;
        int i4;
        int i5;
        int iMin3;
        int i6;
        float f = i2 / i3;
        switch (kVar.d) {
            case 'm':
                iMin = Math.min(i2, 130);
                n(kVar, f, iMin);
                break;
            case 'o':
                iMin2 = Math.min(i2, 130);
                l(kVar, f, iMin2);
                break;
            case 'p':
                i4 = j.d.a.e.a.a.i.g.STATUS_SUCCESS;
                iMin2 = Math.min(i2, i4);
                l(kVar, f, iMin2);
                break;
            case 'q':
                i4 = 320;
                iMin2 = Math.min(i2, i4);
                l(kVar, f, iMin2);
                break;
            case 's':
                i5 = 75;
                iMin = Math.min(i2, i5);
                n(kVar, f, iMin);
                break;
            case 'w':
                iMin3 = Math.min(i2, 2560);
                i6 = 2048;
                q(kVar, f, iMin3, Math.min(i3, i6));
                break;
            case 'x':
                i5 = 604;
                iMin = Math.min(i2, i5);
                n(kVar, f, iMin);
                break;
            case 'y':
                i5 = 807;
                iMin = Math.min(i2, i5);
                n(kVar, f, iMin);
                break;
            case 'z':
                iMin3 = Math.min(i2, 1280);
                i6 = 1024;
                q(kVar, f, iMin3, Math.min(i3, i6));
                break;
        }
    }

    public static k s(JSONObject jSONObject, int i2, int i3) {
        k kVar = new k();
        kVar.a = jSONObject.optString("src");
        kVar.b = jSONObject.optInt("width");
        kVar.c = jSONObject.optInt("height");
        String strOptString = jSONObject.optString("type");
        if (!TextUtils.isEmpty(strOptString)) {
            kVar.d = strOptString.charAt(0);
        }
        if (kVar.b == 0 || kVar.c == 0) {
            r(kVar, i2, i3);
        }
        return kVar;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public int compareTo(k kVar) {
        int i2 = this.b;
        int i3 = kVar.b;
        if (i2 < i3) {
            return -1;
        }
        return i2 == i3 ? 0 : 1;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.a);
        parcel.writeInt(this.b);
        parcel.writeInt(this.c);
        parcel.writeInt(this.d);
    }
}
