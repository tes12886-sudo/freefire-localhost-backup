package androidx.emoji2.text;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes.dex */
class l {

    private static class a implements c {
        private final ByteBuffer a;

        a(ByteBuffer byteBuffer) {
            this.a = byteBuffer;
            byteBuffer.order(ByteOrder.BIG_ENDIAN);
        }

        @Override // androidx.emoji2.text.l.c
        public void a(int i2) {
            ByteBuffer byteBuffer = this.a;
            byteBuffer.position(byteBuffer.position() + i2);
        }

        @Override // androidx.emoji2.text.l.c
        public long b() {
            return l.c(this.a.getInt());
        }

        @Override // androidx.emoji2.text.l.c
        public int c() {
            return this.a.getInt();
        }

        @Override // androidx.emoji2.text.l.c
        public long d() {
            return this.a.position();
        }

        @Override // androidx.emoji2.text.l.c
        public int readUnsignedShort() {
            return l.d(this.a.getShort());
        }
    }

    private static class b {
        private final long a;

        b(long j2, long j3) {
            this.a = j2;
        }

        long a() {
            return this.a;
        }
    }

    private interface c {
        void a(int i2);

        long b();

        int c();

        long d();

        int readUnsignedShort();
    }

    private static b a(c cVar) throws IOException {
        long jB;
        cVar.a(4);
        int unsignedShort = cVar.readUnsignedShort();
        if (unsignedShort > 100) {
            throw new IOException("Cannot read metadata.");
        }
        cVar.a(6);
        int i2 = 0;
        while (true) {
            if (i2 >= unsignedShort) {
                jB = -1;
                break;
            }
            int iC = cVar.c();
            cVar.a(4);
            jB = cVar.b();
            cVar.a(4);
            if (1835365473 == iC) {
                break;
            }
            i2++;
        }
        if (jB != -1) {
            cVar.a((int) (jB - cVar.d()));
            cVar.a(12);
            long jB2 = cVar.b();
            for (int i3 = 0; i3 < jB2; i3++) {
                int iC2 = cVar.c();
                long jB3 = cVar.b();
                long jB4 = cVar.b();
                if (1164798569 == iC2 || 1701669481 == iC2) {
                    return new b(jB3 + jB, jB4);
                }
            }
        }
        throw new IOException("Cannot read metadata.");
    }

    static androidx.emoji2.text.p.b b(ByteBuffer byteBuffer) {
        ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
        byteBufferDuplicate.position((int) a(new a(byteBufferDuplicate)).a());
        return androidx.emoji2.text.p.b.h(byteBufferDuplicate);
    }

    static long c(int i2) {
        return ((long) i2) & 4294967295L;
    }

    static int d(short s) {
        return s & 65535;
    }
}
