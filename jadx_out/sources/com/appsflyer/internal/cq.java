package com.appsflyer.internal;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public final class cq extends FilterInputStream {
    private final int AFInAppEventParameterName;
    private byte[] AFInAppEventType;
    private byte[] AFKeystoreWrapper;
    private int[] AFLogger$LogLevel;
    private int AFVersionDeclaration;
    private int AppsFlyer2dXConversionCallback;
    private int getLevel;
    private int init;
    private cn valueOf;
    private byte[] values;

    public cq(InputStream inputStream, int[] iArr, byte[] bArr, int i2, boolean z, int i3) {
        super(inputStream);
        this.AFVersionDeclaration = Integer.MAX_VALUE;
        int iMin = Math.min(Math.max(i2, 3), 16);
        this.AFInAppEventParameterName = iMin;
        this.AFInAppEventType = new byte[8];
        byte[] bArr2 = new byte[8];
        this.values = bArr2;
        this.AFKeystoreWrapper = new byte[8];
        this.AFLogger$LogLevel = new int[2];
        this.init = 8;
        this.AppsFlyer2dXConversionCallback = 8;
        this.getLevel = i3;
        if (i3 == 2) {
            System.arraycopy(bArr, 0, bArr2, 0, 8);
        }
        this.valueOf = new cn(iArr, iMin, true, false);
    }

    private int AFInAppEventType() throws IOException {
        if (this.AFVersionDeclaration == Integer.MAX_VALUE) {
            this.AFVersionDeclaration = ((FilterInputStream) this).in.read();
        }
        if (this.init == 8) {
            byte[] bArr = this.AFInAppEventType;
            int i2 = this.AFVersionDeclaration;
            bArr[0] = (byte) i2;
            if (i2 < 0) {
                throw new IllegalStateException("unexpected block size");
            }
            int i3 = 1;
            do {
                int i4 = ((FilterInputStream) this).in.read(this.AFInAppEventType, i3, 8 - i3);
                if (i4 <= 0) {
                    break;
                }
                i3 += i4;
            } while (i3 < 8);
            if (i3 < 8) {
                throw new IllegalStateException("unexpected block size");
            }
            AFKeystoreWrapper();
            int i5 = ((FilterInputStream) this).in.read();
            this.AFVersionDeclaration = i5;
            this.init = 0;
            this.AppsFlyer2dXConversionCallback = i5 < 0 ? 8 - (this.AFInAppEventType[7] & 255) : 8;
        }
        return this.AppsFlyer2dXConversionCallback;
    }

    private void AFKeystoreWrapper() {
        if (this.getLevel == 2) {
            byte[] bArr = this.AFInAppEventType;
            System.arraycopy(bArr, 0, this.AFKeystoreWrapper, 0, bArr.length);
        }
        byte[] bArr2 = this.AFInAppEventType;
        int i2 = ((bArr2[0] << 24) & (-16777216)) + ((bArr2[1] << 16) & 16711680) + ((bArr2[2] << 8) & 65280) + (bArr2[3] & 255);
        int i3 = ((-16777216) & (bArr2[4] << 24)) + (16711680 & (bArr2[5] << 16)) + (65280 & (bArr2[6] << 8)) + (bArr2[7] & 255);
        int i4 = this.AFInAppEventParameterName;
        cn cnVar = this.valueOf;
        cv.AFInAppEventParameterName(i2, i3, false, i4, cnVar.valueOf, cnVar.values, this.AFLogger$LogLevel);
        int[] iArr = this.AFLogger$LogLevel;
        int i5 = iArr[0];
        int i6 = iArr[1];
        byte[] bArr3 = this.AFInAppEventType;
        bArr3[0] = (byte) (i5 >> 24);
        bArr3[1] = (byte) (i5 >> 16);
        bArr3[2] = (byte) (i5 >> 8);
        bArr3[3] = (byte) i5;
        bArr3[4] = (byte) (i6 >> 24);
        bArr3[5] = (byte) (i6 >> 16);
        bArr3[6] = (byte) (i6 >> 8);
        bArr3[7] = (byte) i6;
        if (this.getLevel == 2) {
            for (int i7 = 0; i7 < 8; i7++) {
                byte[] bArr4 = this.AFInAppEventType;
                bArr4[i7] = (byte) (bArr4[i7] ^ this.values[i7]);
            }
            byte[] bArr5 = this.AFKeystoreWrapper;
            System.arraycopy(bArr5, 0, this.values, 0, bArr5.length);
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() throws IOException {
        AFInAppEventType();
        return this.AppsFlyer2dXConversionCallback - this.init;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        AFInAppEventType();
        int i2 = this.init;
        if (i2 >= this.AppsFlyer2dXConversionCallback) {
            return -1;
        }
        byte[] bArr = this.AFInAppEventType;
        this.init = i2 + 1;
        return bArr[i2] & 255;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i2, int i3) throws IOException {
        int i4 = i2 + i3;
        for (int i5 = i2; i5 < i4; i5++) {
            AFInAppEventType();
            int i6 = this.init;
            if (i6 >= this.AppsFlyer2dXConversionCallback) {
                if (i5 == i2) {
                    return -1;
                }
                return i3 - (i4 - i5);
            }
            byte[] bArr2 = this.AFInAppEventType;
            this.init = i6 + 1;
            bArr[i5] = bArr2[i6];
        }
        return i3;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j2) {
        long j3 = 0;
        while (j3 < j2 && read() != -1) {
            j3++;
        }
        return j3;
    }
}
