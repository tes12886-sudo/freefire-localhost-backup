package com.appsflyer.internal;

import com.appff.haptic.base.Utils;

/* JADX INFO: loaded from: classes.dex */
public final class cu {
    public static void AFInAppEventType(int[] iArr) {
        for (int i2 = 0; i2 < iArr.length / 2; i2++) {
            int i3 = iArr[i2];
            iArr[i2] = iArr[(iArr.length - i2) - 1];
            iArr[(iArr.length - i2) - 1] = i3;
        }
    }

    public static int values(int i2) {
        cn cnVar = cn.AFInAppEventType;
        int i3 = i2 >>> 24;
        int i4 = (i2 >>> 16) & Utils.MAX_STRENGTH_VALUE;
        int i5 = (i2 >>> 8) & Utils.MAX_STRENGTH_VALUE;
        int i6 = i2 & Utils.MAX_STRENGTH_VALUE;
        int[][] iArr = cnVar.values;
        return ((iArr[0][i3] + iArr[1][i4]) ^ iArr[2][i5]) + iArr[3][i6];
    }

    public static int[] values(char[] cArr, int[] iArr, boolean z) {
        int i2 = (cArr[0] << 16) + cArr[1];
        int i3 = (cArr[2] << 16) + cArr[3];
        if (!z) {
            AFInAppEventType(iArr);
        }
        int i4 = 0;
        while (i4 < 16) {
            int i5 = i2 ^ iArr[i4];
            int iValues = i3 ^ values(i5);
            i4++;
            i3 = i5;
            i2 = iValues;
        }
        int i6 = i2 ^ iArr[16];
        int i7 = iArr[17] ^ i3;
        int[] iArr2 = {i7, i6};
        cArr[0] = (char) (i7 >>> 16);
        cArr[1] = (char) i7;
        cArr[2] = (char) (i6 >>> 16);
        cArr[3] = (char) i6;
        if (!z) {
            AFInAppEventType(iArr);
        }
        return iArr2;
    }
}
