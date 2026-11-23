package com.google.android.play.core.assetpacks;

import com.appff.haptic.base.Utils;
import java.io.FilterInputStream;
import java.io.InputStream;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
final class d0 extends FilterInputStream {
    private final l1 a;
    private byte[] b;
    private long c;
    private boolean d;
    private boolean e;

    d0(InputStream inputStream) {
        super(inputStream);
        this.a = new l1();
        this.b = new byte[Utils.CONTINUOUS_EVENT];
        this.d = false;
        this.e = false;
    }

    private final boolean l(int i2) {
        int iU = u(this.b, 0, i2);
        if (iU != i2) {
            int i3 = i2 - iU;
            if (u(this.b, iU, i3) != i3) {
                this.a.a(this.b, 0, iU);
                return false;
            }
        }
        this.a.a(this.b, 0, i2);
        return true;
    }

    private final int u(byte[] bArr, int i2, int i3) {
        return Math.max(0, super.read(bArr, i2, i3));
    }

    final d2 b() {
        byte[] bArr;
        if (this.c > 0) {
            do {
                bArr = this.b;
            } while (read(bArr, 0, bArr.length) != -1);
        }
        if (this.d || this.e) {
            return new d2(null, -1L, -1, false, false, null);
        }
        if (!l(30)) {
            this.d = true;
            return this.a.b();
        }
        d2 d2VarB = this.a.b();
        if (d2VarB.h()) {
            this.e = true;
            return d2VarB;
        }
        if (d2VarB.e() == 4294967295L) {
            throw new k0("Files bigger than 4GiB are not supported.");
        }
        int iC = this.a.c() - 30;
        long j2 = iC;
        int length = this.b.length;
        if (j2 > length) {
            do {
                length += length;
            } while (length < j2);
            this.b = Arrays.copyOf(this.b, length);
        }
        if (!l(iC)) {
            this.d = true;
            return this.a.b();
        }
        d2 d2VarB2 = this.a.b();
        this.c = d2VarB2.e();
        return d2VarB2;
    }

    final boolean c() {
        return this.d;
    }

    final boolean f() {
        return this.e;
    }

    final long j() {
        return this.c;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i2, int i3) {
        long j2 = this.c;
        if (j2 <= 0 || this.d) {
            return -1;
        }
        int iU = u(bArr, i2, (int) Math.min(j2, i3));
        this.c -= (long) iU;
        if (iU != 0) {
            return iU;
        }
        this.d = true;
        return 0;
    }
}
