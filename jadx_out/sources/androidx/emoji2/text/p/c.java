package androidx.emoji2.text.p;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public class c {
    protected int a;
    protected ByteBuffer b;
    private int c;
    private int d;

    public c() {
        d.a();
    }

    protected int a(int i2) {
        return i2 + this.b.getInt(i2);
    }

    protected int b(int i2) {
        if (i2 < this.d) {
            return this.b.getShort(this.c + i2);
        }
        return 0;
    }

    protected void c(int i2, ByteBuffer byteBuffer) {
        short s;
        this.b = byteBuffer;
        if (byteBuffer != null) {
            this.a = i2;
            int i3 = i2 - byteBuffer.getInt(i2);
            this.c = i3;
            s = this.b.getShort(i3);
        } else {
            s = 0;
            this.a = 0;
            this.c = 0;
        }
        this.d = s;
    }

    protected int d(int i2) {
        int i3 = i2 + this.a;
        return i3 + this.b.getInt(i3) + 4;
    }

    protected int e(int i2) {
        int i3 = i2 + this.a;
        return this.b.getInt(i3 + this.b.getInt(i3));
    }
}
