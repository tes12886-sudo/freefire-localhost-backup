package com.appff.haptic.a;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
class b extends c {
    int a;
    h[] b;
    final /* synthetic */ a c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    b(a aVar) {
        super(aVar);
        this.c = aVar;
    }

    @Override // com.appff.haptic.a.c
    int[] a() {
        int i2 = 8;
        int[] iArr = new int[(this.a * 3) + 8];
        Arrays.fill(iArr, 0);
        iArr[0] = this.d;
        int i3 = this.a;
        iArr[1] = ((i3 * 3) + 8) - 2;
        iArr[2] = this.f;
        iArr[3] = this.f475g;
        iArr[4] = this.f476h;
        iArr[5] = this.f477i;
        iArr[6] = this.f478j;
        iArr[7] = i3;
        for (int i4 = 0; i4 < this.a; i4++) {
            h[] hVarArr = this.b;
            iArr[i2] = hVarArr[i4].a;
            int i5 = i2 + 1;
            iArr[i5] = hVarArr[i4].b;
            int i6 = i5 + 1;
            iArr[i6] = hVarArr[i4].c;
            i2 = i6 + 1;
        }
        return iArr;
    }

    @Override // com.appff.haptic.a.c
    public String toString() {
        return "Continuous{mPointNum=" + this.a + ", mPoint=" + Arrays.toString(this.b) + '}';
    }
}
