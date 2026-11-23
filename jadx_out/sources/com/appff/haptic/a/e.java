package com.appff.haptic.a;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
class e {
    int a;
    c[] b;
    final /* synthetic */ a c;

    e(a aVar) {
        this.c = aVar;
    }

    int a() {
        int i2 = 0;
        for (c cVar : this.b) {
            int i3 = cVar.d;
            if (i3 == 4096) {
                i2 += (((b) cVar).a * 3) + 8;
            } else if (i3 == 4097) {
                i2 += 7;
            }
        }
        return i2;
    }

    int[] a(int i2) {
        int[] iArr = new int[b()];
        Arrays.fill(iArr, 0);
        iArr[0] = i2;
        iArr[1] = this.a;
        c[] cVarArr = this.b;
        iArr[2] = cVarArr.length;
        int length = 3;
        for (c cVar : cVarArr) {
            int[] iArrA = cVar.a();
            System.arraycopy(iArrA, 0, iArr, length, iArrA.length);
            length += iArrA.length;
        }
        return iArr;
    }

    int b() {
        return a() + 3;
    }
}
