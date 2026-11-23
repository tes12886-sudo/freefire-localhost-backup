package com.appff.haptic.a;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
class g extends f {
    g(int i2, int i3, int i4, int i5, int i6) {
        super(i2, i3, i4);
        this.a = i2;
        this.b = i3;
        this.e = i4;
        this.c = i5;
        this.d = i6;
    }

    @Override // com.appff.haptic.a.f
    public int[] a() {
        int[] iArr = new int[17];
        Arrays.fill(iArr, 0);
        iArr[0] = this.a;
        iArr[1] = this.b;
        iArr[2] = this.c;
        iArr[3] = this.d;
        iArr[4] = this.e;
        return iArr;
    }

    @Override // com.appff.haptic.a.f
    public String toString() {
        return "PatternHeEventPreBaked{mEventType=" + this.a + ", mRelativeTime=" + this.b + ", mDuration=" + this.e + ", mIntensity=" + this.c + ", mFrequency=" + this.d + '}';
    }
}
