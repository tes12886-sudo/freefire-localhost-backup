package m.h0.h;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.UnknownServiceException;
import java.security.cert.CertificateException;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocket;
import m.l;

/* JADX INFO: loaded from: classes.dex */
public final class b {
    private final List<l> a;
    private int b;
    private boolean c;
    private boolean d;

    public b(List<l> list) {
        l.y.c.i.e(list, "connectionSpecs");
        this.a = list;
    }

    private final boolean c(SSLSocket sSLSocket) {
        int i2 = this.b;
        int size = this.a.size();
        while (i2 < size) {
            int i3 = i2 + 1;
            if (this.a.get(i2).e(sSLSocket)) {
                return true;
            }
            i2 = i3;
        }
        return false;
    }

    public final l a(SSLSocket sSLSocket) throws UnknownServiceException {
        l lVar;
        l.y.c.i.e(sSLSocket, "sslSocket");
        int i2 = this.b;
        int size = this.a.size();
        while (true) {
            if (i2 >= size) {
                lVar = null;
                break;
            }
            int i3 = i2 + 1;
            lVar = this.a.get(i2);
            if (lVar.e(sSLSocket)) {
                this.b = i3;
                break;
            }
            i2 = i3;
        }
        if (lVar != null) {
            this.c = c(sSLSocket);
            lVar.c(sSLSocket, this.d);
            return lVar;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unable to find acceptable protocols. isFallback=");
        sb.append(this.d);
        sb.append(", modes=");
        sb.append(this.a);
        sb.append(", supported protocols=");
        String[] enabledProtocols = sSLSocket.getEnabledProtocols();
        l.y.c.i.c(enabledProtocols);
        String string = Arrays.toString(enabledProtocols);
        l.y.c.i.d(string, "toString(this)");
        sb.append(string);
        throw new UnknownServiceException(sb.toString());
    }

    public final boolean b(IOException iOException) {
        l.y.c.i.e(iOException, "e");
        this.d = true;
        return (!this.c || (iOException instanceof ProtocolException) || (iOException instanceof InterruptedIOException) || ((iOException instanceof SSLHandshakeException) && (iOException.getCause() instanceof CertificateException)) || (iOException instanceof SSLPeerUnverifiedException) || !(iOException instanceof SSLException)) ? false : true;
    }
}
