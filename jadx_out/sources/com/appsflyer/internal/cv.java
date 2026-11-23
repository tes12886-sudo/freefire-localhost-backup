package com.appsflyer.internal;

import com.appff.haptic.base.Utils;

/* JADX INFO: loaded from: classes.dex */
public final class cv {
    public static void AFInAppEventParameterName(int i2, int i3, boolean z, int i4, int[] iArr, int[][] iArr2, int[] iArr3) {
        if (!z) {
            AFInAppEventParameterName(iArr);
        }
        int i5 = 0;
        while (i5 < i4) {
            int i6 = i2 ^ iArr[i5];
            int iAFKeystoreWrapper = i3 ^ AFKeystoreWrapper(i6, iArr2);
            i5++;
            i3 = i6;
            i2 = iAFKeystoreWrapper;
        }
        int i7 = i2 ^ iArr[iArr.length - 2];
        int i8 = i3 ^ iArr[iArr.length - 1];
        if (!z) {
            AFInAppEventParameterName(iArr);
        }
        iArr3[0] = i8;
        iArr3[1] = i7;
    }

    private static void AFInAppEventParameterName(int[] iArr) {
        for (int i2 = 0; i2 < iArr.length / 2; i2++) {
            int i3 = iArr[i2];
            iArr[i2] = iArr[(iArr.length - i2) - 1];
            iArr[(iArr.length - i2) - 1] = i3;
        }
    }

    private static int AFKeystoreWrapper(int i2, int[][] iArr) {
        return ((iArr[0][i2 >>> 24] + iArr[1][(i2 >>> 16) & Utils.MAX_STRENGTH_VALUE]) ^ iArr[2][(i2 >>> 8) & Utils.MAX_STRENGTH_VALUE]) + iArr[3][i2 & Utils.MAX_STRENGTH_VALUE];
    }
}
