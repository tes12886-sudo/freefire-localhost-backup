package com.appff.haptic.a;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
class i extends c {
    final /* synthetic */ a a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    i(a aVar) {
        super(aVar);
        this.a = aVar;
        this.e = 7;
    }

    @Override // com.appff.haptic.a.c
    int[] a() {
        int[] iArr = new int[this.e];
        Arrays.fill(iArr, 0);
        iArr[0] = this.d;
        iArr[1] = this.e - 2;
        iArr[2] = this.f;
        iArr[3] = this.f475g;
        iArr[4] = this.f476h;
        iArr[5] = this.f477i;
        iArr[6] = this.f478j;
        return iArr;
    }
}
