package m.h0.k;

import com.appff.haptic.base.Utils;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import n.x;
import n.y;

/* JADX INFO: loaded from: classes.dex */
public final class h implements Closeable {
    public static final a e = new a(null);
    private static final Logger f;
    private final n.d a;
    private final boolean b;
    private final b c;
    private final d.a d;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(l.y.c.f fVar) {
            this();
        }

        public final Logger a() {
            return h.f;
        }

        public final int b(int i2, int i3, int i4) throws IOException {
            if ((i3 & 8) != 0) {
                i2--;
            }
            if (i4 <= i2) {
                return i2 - i4;
            }
            throw new IOException("PROTOCOL_ERROR padding " + i4 + " > remaining length " + i2);
        }
    }

    public static final class b implements x {
        private final n.d a;
        private int b;
        private int c;
        private int d;
        private int e;
        private int f;

        public b(n.d dVar) {
            l.y.c.i.e(dVar, "source");
            this.a = dVar;
        }

        private final void c() throws IOException {
            int i2 = this.d;
            int I = m.h0.d.I(this.a);
            this.e = I;
            this.b = I;
            int iB = m.h0.d.b(this.a.readByte(), Utils.MAX_STRENGTH_VALUE);
            this.c = m.h0.d.b(this.a.readByte(), Utils.MAX_STRENGTH_VALUE);
            a aVar = h.e;
            if (aVar.a().isLoggable(Level.FINE)) {
                aVar.a().fine(e.a.c(true, this.d, this.b, iB, this.c));
            }
            int i3 = this.a.readInt() & Integer.MAX_VALUE;
            this.d = i3;
            if (iB == 9) {
                if (i3 != i2) {
                    throw new IOException("TYPE_CONTINUATION streamId changed");
                }
            } else {
                throw new IOException(iB + " != TYPE_CONTINUATION");
            }
        }

        public final void F(int i2) {
            this.d = i2;
        }

        @Override // n.x
        public long I(n.b bVar, long j2) throws IOException {
            l.y.c.i.e(bVar, "sink");
            while (true) {
                int i2 = this.e;
                if (i2 != 0) {
                    long jI = this.a.I(bVar, Math.min(j2, i2));
                    if (jI == -1) {
                        return -1L;
                    }
                    this.e -= (int) jI;
                    return jI;
                }
                this.a.skip(this.f);
                this.f = 0;
                if ((this.c & 4) != 0) {
                    return -1L;
                }
                c();
            }
        }

        public final int b() {
            return this.e;
        }

        @Override // n.x, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // n.x
        public y d() {
            return this.a.d();
        }

        public final void f(int i2) {
            this.c = i2;
        }

        public final void j(int i2) {
            this.e = i2;
        }

        public final void l(int i2) {
            this.b = i2;
        }

        public final void u(int i2) {
            this.f = i2;
        }
    }

    public interface c {
        void b();

        void c(boolean z, m mVar);

        void d(boolean z, int i2, n.d dVar, int i3);

        void e(boolean z, int i2, int i3);

        void f(int i2, int i3, int i4, boolean z);

        void g(int i2, m.h0.k.b bVar);

        void h(boolean z, int i2, int i3, List<m.h0.k.c> list);

        void i(int i2, long j2);

        void j(int i2, int i3, List<m.h0.k.c> list);

        void k(int i2, m.h0.k.b bVar, n.e eVar);
    }

    static {
        Logger logger = Logger.getLogger(e.class.getName());
        l.y.c.i.d(logger, "getLogger(Http2::class.java.name)");
        f = logger;
    }

    public h(n.d dVar, boolean z) {
        l.y.c.i.e(dVar, "source");
        this.a = dVar;
        this.b = z;
        b bVar = new b(dVar);
        this.c = bVar;
        this.d = new d.a(bVar, Utils.CONTINUOUS_EVENT, 0, 4, null);
    }

    private final void F(c cVar, int i2, int i3, int i4) throws IOException {
        if (i4 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0");
        }
        boolean z = (i3 & 1) != 0;
        int iB = (i3 & 8) != 0 ? m.h0.d.b(this.a.readByte(), Utils.MAX_STRENGTH_VALUE) : 0;
        if ((i3 & 32) != 0) {
            Q(cVar, i4);
            i2 -= 5;
        }
        cVar.h(z, i4, -1, u(e.b(i2, i3, iB), iB, i3, i4));
    }

    private final void O(c cVar, int i2, int i3, int i4) throws IOException {
        if (i2 != 8) {
            throw new IOException(l.y.c.i.k("TYPE_PING length != 8: ", Integer.valueOf(i2)));
        }
        if (i4 != 0) {
            throw new IOException("TYPE_PING streamId != 0");
        }
        cVar.e((i3 & 1) != 0, this.a.readInt(), this.a.readInt());
    }

    private final void Q(c cVar, int i2) {
        int i3 = this.a.readInt();
        cVar.f(i2, i3 & Integer.MAX_VALUE, m.h0.d.b(this.a.readByte(), Utils.MAX_STRENGTH_VALUE) + 1, (Integer.MIN_VALUE & i3) != 0);
    }

    private final void T(c cVar, int i2, int i3, int i4) throws IOException {
        if (i2 == 5) {
            if (i4 == 0) {
                throw new IOException("TYPE_PRIORITY streamId == 0");
            }
            Q(cVar, i4);
        } else {
            throw new IOException("TYPE_PRIORITY length: " + i2 + " != 5");
        }
    }

    private final void Y(c cVar, int i2, int i3, int i4) throws IOException {
        if (i4 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0");
        }
        int iB = (i3 & 8) != 0 ? m.h0.d.b(this.a.readByte(), Utils.MAX_STRENGTH_VALUE) : 0;
        cVar.j(i4, this.a.readInt() & Integer.MAX_VALUE, u(e.b(i2 - 4, i3, iB), iB, i3, i4));
    }

    private final void Z(c cVar, int i2, int i3, int i4) throws IOException {
        if (i2 != 4) {
            throw new IOException("TYPE_RST_STREAM length: " + i2 + " != 4");
        }
        if (i4 == 0) {
            throw new IOException("TYPE_RST_STREAM streamId == 0");
        }
        int i5 = this.a.readInt();
        m.h0.k.b bVarA = m.h0.k.b.b.a(i5);
        if (bVarA == null) {
            throw new IOException(l.y.c.i.k("TYPE_RST_STREAM unexpected error code: ", Integer.valueOf(i5)));
        }
        cVar.g(i4, bVarA);
    }

    private final void a0(c cVar, int i2, int i3, int i4) throws IOException {
        if (i4 != 0) {
            throw new IOException("TYPE_SETTINGS streamId != 0");
        }
        if ((i3 & 1) != 0) {
            if (i2 != 0) {
                throw new IOException("FRAME_SIZE_ERROR ack frame should be empty!");
            }
            cVar.b();
            return;
        }
        if (i2 % 6 != 0) {
            throw new IOException(l.y.c.i.k("TYPE_SETTINGS length % 6 != 0: ", Integer.valueOf(i2)));
        }
        m mVar = new m();
        l.a0.d dVarH = l.a0.i.h(l.a0.i.i(0, i2), 6);
        int iB = dVarH.b();
        int iC = dVarH.c();
        int iD = dVarH.d();
        if ((iD > 0 && iB <= iC) || (iD < 0 && iC <= iB)) {
            while (true) {
                int i5 = iB + iD;
                int iC2 = m.h0.d.c(this.a.readShort(), 65535);
                int i6 = this.a.readInt();
                if (iC2 != 2) {
                    if (iC2 == 3) {
                        iC2 = 4;
                    } else if (iC2 == 4) {
                        iC2 = 7;
                        if (i6 < 0) {
                            throw new IOException("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1");
                        }
                    } else if (iC2 == 5 && (i6 < 16384 || i6 > 16777215)) {
                        throw new IOException(l.y.c.i.k("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: ", Integer.valueOf(i6)));
                    }
                } else if (i6 != 0 && i6 != 1) {
                    throw new IOException("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1");
                }
                mVar.h(iC2, i6);
                if (iB != iC) {
                    iB = i5;
                }
            }
        }
        cVar.c(false, mVar);
    }

    private final void b0(c cVar, int i2, int i3, int i4) throws IOException {
        if (i2 != 4) {
            throw new IOException(l.y.c.i.k("TYPE_WINDOW_UPDATE length !=4: ", Integer.valueOf(i2)));
        }
        long jD = m.h0.d.d(this.a.readInt(), 2147483647L);
        if (jD == 0) {
            throw new IOException("windowSizeIncrement was 0");
        }
        cVar.i(i4, jD);
    }

    private final void j(c cVar, int i2, int i3, int i4) throws IOException {
        if (i4 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_DATA streamId == 0");
        }
        boolean z = (i3 & 1) != 0;
        if ((i3 & 32) != 0) {
            throw new IOException("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA");
        }
        int iB = (i3 & 8) != 0 ? m.h0.d.b(this.a.readByte(), Utils.MAX_STRENGTH_VALUE) : 0;
        cVar.d(z, i4, this.a, e.b(i2, i3, iB));
        this.a.skip(iB);
    }

    private final void l(c cVar, int i2, int i3, int i4) throws IOException {
        if (i2 < 8) {
            throw new IOException(l.y.c.i.k("TYPE_GOAWAY length < 8: ", Integer.valueOf(i2)));
        }
        if (i4 != 0) {
            throw new IOException("TYPE_GOAWAY streamId != 0");
        }
        int i5 = this.a.readInt();
        int i6 = this.a.readInt();
        int i7 = i2 - 8;
        m.h0.k.b bVarA = m.h0.k.b.b.a(i6);
        if (bVarA == null) {
            throw new IOException(l.y.c.i.k("TYPE_GOAWAY unexpected error code: ", Integer.valueOf(i6)));
        }
        n.e eVarO = n.e.e;
        if (i7 > 0) {
            eVarO = this.a.o(i7);
        }
        cVar.k(i5, bVarA, eVarO);
    }

    private final List<m.h0.k.c> u(int i2, int i3, int i4, int i5) throws IOException {
        this.c.j(i2);
        b bVar = this.c;
        bVar.l(bVar.b());
        this.c.u(i3);
        this.c.f(i4);
        this.c.F(i5);
        this.d.k();
        return this.d.e();
    }

    public final boolean c(boolean z, c cVar) throws IOException {
        l.y.c.i.e(cVar, "handler");
        try {
            this.a.P(9L);
            int I = m.h0.d.I(this.a);
            if (I > 16384) {
                throw new IOException(l.y.c.i.k("FRAME_SIZE_ERROR: ", Integer.valueOf(I)));
            }
            int iB = m.h0.d.b(this.a.readByte(), Utils.MAX_STRENGTH_VALUE);
            int iB2 = m.h0.d.b(this.a.readByte(), Utils.MAX_STRENGTH_VALUE);
            int i2 = this.a.readInt() & Integer.MAX_VALUE;
            Logger logger = f;
            if (logger.isLoggable(Level.FINE)) {
                logger.fine(e.a.c(true, i2, I, iB, iB2));
            }
            if (z && iB != 4) {
                throw new IOException(l.y.c.i.k("Expected a SETTINGS frame but was ", e.a.b(iB)));
            }
            switch (iB) {
                case 0:
                    j(cVar, I, iB2, i2);
                    return true;
                case 1:
                    F(cVar, I, iB2, i2);
                    return true;
                case 2:
                    T(cVar, I, iB2, i2);
                    return true;
                case 3:
                    Z(cVar, I, iB2, i2);
                    return true;
                case 4:
                    a0(cVar, I, iB2, i2);
                    return true;
                case 5:
                    Y(cVar, I, iB2, i2);
                    return true;
                case 6:
                    O(cVar, I, iB2, i2);
                    return true;
                case 7:
                    l(cVar, I, iB2, i2);
                    return true;
                case 8:
                    b0(cVar, I, iB2, i2);
                    return true;
                default:
                    this.a.skip(I);
                    return true;
            }
        } catch (EOFException unused) {
            return false;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.a.close();
    }

    public final void f(c cVar) throws IOException {
        l.y.c.i.e(cVar, "handler");
        if (this.b) {
            if (!c(true, cVar)) {
                throw new IOException("Required SETTINGS preface not received");
            }
            return;
        }
        n.d dVar = this.a;
        n.e eVar = e.b;
        n.e eVarO = dVar.o(eVar.t());
        Logger logger = f;
        if (logger.isLoggable(Level.FINE)) {
            logger.fine(m.h0.d.q(l.y.c.i.k("<< CONNECTION ", eVarO.j()), new Object[0]));
        }
        if (!l.y.c.i.a(eVar, eVarO)) {
            throw new IOException(l.y.c.i.k("Expected a connection header but was ", eVarO.x()));
        }
    }
}
