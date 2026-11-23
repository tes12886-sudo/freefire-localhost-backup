package m.h0.l.i;

import android.annotation.SuppressLint;
import android.net.ssl.SSLSockets;
import android.os.Build;
import java.io.IOException;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import m.a0;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"NewApi"})
public final class a implements k {
    public static final C0270a a = new C0270a(null);

    /* JADX INFO: renamed from: m.h0.l.i.a$a, reason: collision with other inner class name */
    public static final class C0270a {
        private C0270a() {
        }

        public /* synthetic */ C0270a(l.y.c.f fVar) {
            this();
        }

        public final k a() {
            if (b()) {
                return new a();
            }
            return null;
        }

        public final boolean b() {
            return m.h0.l.h.a.h() && Build.VERSION.SDK_INT >= 29;
        }
    }

    @Override // m.h0.l.i.k
    public boolean a(SSLSocket sSLSocket) {
        l.y.c.i.e(sSLSocket, "sslSocket");
        return SSLSockets.isSupportedSocket(sSLSocket);
    }

    @Override // m.h0.l.i.k
    @SuppressLint({"NewApi"})
    public String b(SSLSocket sSLSocket) {
        l.y.c.i.e(sSLSocket, "sslSocket");
        String applicationProtocol = sSLSocket.getApplicationProtocol();
        if (applicationProtocol == null ? true : l.y.c.i.a(applicationProtocol, "")) {
            return null;
        }
        return applicationProtocol;
    }

    @Override // m.h0.l.i.k
    public boolean c() {
        return a.b();
    }

    @Override // m.h0.l.i.k
    @SuppressLint({"NewApi"})
    public void d(SSLSocket sSLSocket, String str, List<? extends a0> list) throws IOException {
        l.y.c.i.e(sSLSocket, "sslSocket");
        l.y.c.i.e(list, "protocols");
        try {
            SSLSockets.setUseSessionTickets(sSLSocket, true);
            SSLParameters sSLParameters = sSLSocket.getSSLParameters();
            Object[] array = m.h0.l.h.a.b(list).toArray(new String[0]);
            if (array == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            }
            sSLParameters.setApplicationProtocols((String[]) array);
            sSLSocket.setSSLParameters(sSLParameters);
        } catch (IllegalArgumentException e) {
            throw new IOException("Android internal error", e);
        }
    }
}
