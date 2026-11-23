package com.google.android.play.core.assetpacks;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes.dex */
final class n0 extends OutputStream {
    private final l1 a = new l1();
    private final File b;
    private final y1 c;
    private long d;
    private long e;
    private FileOutputStream f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private d2 f1337g;

    n0(File file, y1 y1Var) {
        this.b = file;
        this.c = y1Var;
    }

    @Override // java.io.OutputStream
    public final void write(int i2) throws IOException {
        write(new byte[]{(byte) i2});
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i2, int i3) throws IOException {
        int iMin;
        while (i3 > 0) {
            if (this.d == 0 && this.e == 0) {
                int iA = this.a.a(bArr, i2, i3);
                if (iA == -1) {
                    return;
                }
                i2 += iA;
                i3 -= iA;
                d2 d2VarB = this.a.b();
                this.f1337g = d2VarB;
                if (d2VarB.h()) {
                    this.d = 0L;
                    this.c.m(this.f1337g.i(), this.f1337g.i().length);
                    this.e = this.f1337g.i().length;
                } else if (!this.f1337g.c() || this.f1337g.b()) {
                    byte[] bArrI = this.f1337g.i();
                    this.c.m(bArrI, bArrI.length);
                    this.d = this.f1337g.e();
                } else {
                    this.c.g(this.f1337g.i());
                    File file = new File(this.b, this.f1337g.d());
                    file.getParentFile().mkdirs();
                    this.d = this.f1337g.e();
                    this.f = new FileOutputStream(file);
                }
            }
            if (!this.f1337g.b()) {
                if (this.f1337g.h()) {
                    this.c.i(this.e, bArr, i2, i3);
                    this.e += (long) i3;
                    iMin = i3;
                } else if (this.f1337g.c()) {
                    iMin = (int) Math.min(i3, this.d);
                    this.f.write(bArr, i2, iMin);
                    long j2 = this.d - ((long) iMin);
                    this.d = j2;
                    if (j2 == 0) {
                        this.f.close();
                    }
                } else {
                    iMin = (int) Math.min(i3, this.d);
                    int length = this.f1337g.i().length;
                    this.c.i((((long) length) + this.f1337g.e()) - this.d, bArr, i2, iMin);
                    this.d -= (long) iMin;
                }
                i2 += iMin;
                i3 -= iMin;
            }
        }
    }
}
