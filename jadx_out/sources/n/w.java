package n;

import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;

/* JADX INFO: loaded from: classes.dex */
final class w extends a {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final Socket f2351l;

    public w(Socket socket) {
        l.y.c.i.e(socket, "socket");
        this.f2351l = socket;
    }

    @Override // n.a
    protected IOException v(IOException iOException) {
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
        if (iOException != null) {
            socketTimeoutException.initCause(iOException);
        }
        return socketTimeoutException;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Exception] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.AssertionError, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.logging.Logger] */
    @Override // n.a
    protected void z() {
        try {
            this.f2351l.close();
        } catch (AssertionError e) {
            e = e;
            if (!l.c(e)) {
                throw e;
            }
            m.a.log(Level.WARNING, l.y.c.i.k("Failed to close timed out socket ", this.f2351l), e);
        } catch (Exception e2) {
            e = e2;
            m.a.log(Level.WARNING, l.y.c.i.k("Failed to close timed out socket ", this.f2351l), e);
        }
    }
}
