package com.google.android.play.core.assetpacks;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
final class w extends InputStream {
    private final InputStream a;
    private long b;

    w(InputStream inputStream, long j2) {
        this.a = inputStream;
        this.b = j2;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        super.close();
        this.a.close();
        this.b = 0L;
    }

    @Override // java.io.InputStream
    public final int read() {
        long j2 = this.b;
        if (j2 <= 0) {
            return -1;
        }
        this.b = j2 - 1;
        return this.a.read();
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i2, int i3) throws IOException {
        long j2 = this.b;
        if (j2 <= 0) {
            return -1;
        }
        int i4 = this.a.read(bArr, i2, (int) Math.min(i3, j2));
        if (i4 != -1) {
            this.b -= (long) i4;
        }
        return i4;
    }
}
