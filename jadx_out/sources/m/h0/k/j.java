package m.h0.k;

import com.appff.haptic.base.Utils;
import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
public final class j implements Closeable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Logger f2285g = Logger.getLogger(e.class.getName());
    private final n.c a;
    private final boolean b;
    private final n.b c;
    private int d;
    private boolean e;
    private final d.b f;

    public j(n.c cVar, boolean z) {
        l.y.c.i.e(cVar, "sink");
        this.a = cVar;
        this.b = z;
        n.b bVar = new n.b();
        this.c = bVar;
        this.d = 16384;
        this.f = new d.b(0, false, bVar, 3, null);
    }

    private final void b0(int i2, long j2) {
        while (j2 > 0) {
            long jMin = Math.min(this.d, j2);
            j2 -= jMin;
            l(i2, (int) jMin, 9, j2 == 0 ? 4 : 0);
            this.a.h(this.c, jMin);
        }
    }

    public final synchronized void F(boolean z, int i2, List<c> list) {
        l.y.c.i.e(list, "headerBlock");
        if (this.e) {
            throw new IOException("closed");
        }
        this.f.g(list);
        long jR0 = this.c.r0();
        long jMin = Math.min(this.d, jR0);
        int i3 = jR0 == jMin ? 4 : 0;
        if (z) {
            i3 |= 1;
        }
        l(i2, (int) jMin, 1, i3);
        this.a.h(this.c, jMin);
        if (jR0 > jMin) {
            b0(i2, jR0 - jMin);
        }
    }

    public final int O() {
        return this.d;
    }

    public final synchronized void Q(boolean z, int i2, int i3) {
        if (this.e) {
            throw new IOException("closed");
        }
        l(0, 8, 6, z ? 1 : 0);
        this.a.r(i2);
        this.a.r(i3);
        this.a.flush();
    }

    public final synchronized void T(int i2, int i3, List<c> list) {
        l.y.c.i.e(list, "requestHeaders");
        if (this.e) {
            throw new IOException("closed");
        }
        this.f.g(list);
        long jR0 = this.c.r0();
        int iMin = (int) Math.min(((long) this.d) - 4, jR0);
        long j2 = iMin;
        l(i2, iMin + 4, 5, jR0 == j2 ? 4 : 0);
        this.a.r(i3 & Integer.MAX_VALUE);
        this.a.h(this.c, j2);
        if (jR0 > j2) {
            b0(i2, jR0 - j2);
        }
    }

    public final synchronized void Y(int i2, b bVar) {
        l.y.c.i.e(bVar, "errorCode");
        if (this.e) {
            throw new IOException("closed");
        }
        if (!(bVar.c() != -1)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        l(i2, 4, 3, 0);
        this.a.r(bVar.c());
        this.a.flush();
    }

    public final synchronized void Z(m mVar) {
        int i2;
        l.y.c.i.e(mVar, "settings");
        if (this.e) {
            throw new IOException("closed");
        }
        int i3 = 0;
        l(0, mVar.i() * 6, 4, 0);
        while (i3 < 10) {
            int i4 = i3 + 1;
            if (mVar.f(i3)) {
                if (i3 != 4) {
                    i2 = i3 != 7 ? i3 : 4;
                } else {
                    i2 = 3;
                }
                this.a.p(i2);
                this.a.r(mVar.a(i3));
            }
            i3 = i4;
        }
        this.a.flush();
    }

    public final synchronized void a0(int i2, long j2) {
        if (this.e) {
            throw new IOException("closed");
        }
        if (!(j2 != 0 && j2 <= 2147483647L)) {
            throw new IllegalArgumentException(l.y.c.i.k("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: ", Long.valueOf(j2)).toString());
        }
        l(i2, 4, 8, 0);
        this.a.r((int) j2);
        this.a.flush();
    }

    public final synchronized void b(m mVar) {
        l.y.c.i.e(mVar, "peerSettings");
        if (this.e) {
            throw new IOException("closed");
        }
        this.d = mVar.e(this.d);
        if (mVar.b() != -1) {
            this.f.e(mVar.b());
        }
        l(0, 0, 4, 1);
        this.a.flush();
    }

    public final synchronized void c() {
        if (this.e) {
            throw new IOException("closed");
        }
        if (this.b) {
            Logger logger = f2285g;
            if (logger.isLoggable(Level.FINE)) {
                logger.fine(m.h0.d.q(l.y.c.i.k(">> CONNECTION ", e.b.j()), new Object[0]));
            }
            this.a.G(e.b);
            this.a.flush();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        this.e = true;
        this.a.close();
    }

    public final synchronized void f(boolean z, int i2, n.b bVar, int i3) {
        if (this.e) {
            throw new IOException("closed");
        }
        j(i2, z ? 1 : 0, bVar, i3);
    }

    public final synchronized void flush() {
        if (this.e) {
            throw new IOException("closed");
        }
        this.a.flush();
    }

    public final void j(int i2, int i3, n.b bVar, int i4) {
        l(i2, i4, 0, i3);
        if (i4 > 0) {
            n.c cVar = this.a;
            l.y.c.i.c(bVar);
            cVar.h(bVar, i4);
        }
    }

    public final void l(int i2, int i3, int i4, int i5) {
        Logger logger = f2285g;
        if (logger.isLoggable(Level.FINE)) {
            logger.fine(e.a.c(false, i2, i3, i4, i5));
        }
        if (!(i3 <= this.d)) {
            throw new IllegalArgumentException(("FRAME_SIZE_ERROR length > " + this.d + ": " + i3).toString());
        }
        if (!((Integer.MIN_VALUE & i2) == 0)) {
            throw new IllegalArgumentException(l.y.c.i.k("reserved bit set: ", Integer.valueOf(i2)).toString());
        }
        m.h0.d.Y(this.a, i3);
        this.a.A(i4 & Utils.MAX_STRENGTH_VALUE);
        this.a.A(i5 & Utils.MAX_STRENGTH_VALUE);
        this.a.r(i2 & Integer.MAX_VALUE);
    }

    public final synchronized void u(int i2, b bVar, byte[] bArr) {
        l.y.c.i.e(bVar, "errorCode");
        l.y.c.i.e(bArr, "debugData");
        if (this.e) {
            throw new IOException("closed");
        }
        if (!(bVar.c() != -1)) {
            throw new IllegalArgumentException("errorCode.httpCode == -1".toString());
        }
        l(0, bArr.length + 8, 7, 0);
        this.a.r(i2);
        this.a.r(bVar.c());
        if (!(bArr.length == 0)) {
            this.a.E(bArr);
        }
        this.a.flush();
    }
}
