package com.voxelbusters.androidlib.b;

import android.util.Log;
import com.appff.haptic.base.Utils;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class a {
    public int a;
    public float[] b;

    public a(int i2, float[] fArr) {
        this.a = i2;
        this.b = Arrays.copyOf(fArr, fArr.length);
    }

    public int a(int i2, short s, byte[] bArr) {
        float[] fArr = this.b;
        int i3 = 0;
        if (fArr == null) {
            Log.d("AacEncode", "datas is null");
            return 0;
        }
        int length = (fArr.length / this.a) * i2 * 2;
        if (length > bArr.length) {
            return 0;
        }
        int i4 = 0;
        while (true) {
            float[] fArr2 = this.b;
            if (i3 >= fArr2.length) {
                return length;
            }
            float f = s;
            short s2 = (short) (fArr2[i3] * f);
            int i5 = this.a;
            short s3 = i5 >= i2 ? (short) (fArr2[i3 + 1] * f) : s2;
            int i6 = i4 + 1;
            bArr[i4] = (byte) (s2 & 255);
            int i7 = i6 + 1;
            bArr[i6] = (byte) ((s2 >> 8) & Utils.MAX_STRENGTH_VALUE);
            int i8 = i7 + 1;
            bArr[i7] = (byte) (s3 & 255);
            i4 = i8 + 1;
            bArr[i8] = (byte) ((s3 >> 8) & Utils.MAX_STRENGTH_VALUE);
            i3 += i5;
        }
    }
}
