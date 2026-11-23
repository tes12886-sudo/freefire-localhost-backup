package m.h0.e;

import java.net.Authenticator;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.PasswordAuthentication;
import java.net.Proxy;
import java.net.SocketAddress;
import java.util.List;
import l.d0.p;
import l.t.k;
import l.y.c.f;
import l.y.c.i;
import m.b;
import m.b0;
import m.d0;
import m.f0;
import m.h;
import m.o;
import m.q;
import m.v;

/* JADX INFO: loaded from: classes.dex */
public final class a implements b {
    private final q b;

    /* JADX INFO: renamed from: m.h0.e.a$a, reason: collision with other inner class name */
    public /* synthetic */ class C0262a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[Proxy.Type.values().length];
            iArr[Proxy.Type.DIRECT.ordinal()] = 1;
            a = iArr;
        }
    }

    public a(q qVar) {
        i.e(qVar, "defaultDns");
        this.b = qVar;
    }

    public /* synthetic */ a(q qVar, int i2, f fVar) {
        this((i2 & 1) != 0 ? q.a : qVar);
    }

    private final InetAddress b(Proxy proxy, v vVar, q qVar) {
        Proxy.Type type = proxy.type();
        if ((type == null ? -1 : C0262a.a[type.ordinal()]) == 1) {
            return (InetAddress) k.z(qVar.a(vVar.i()));
        }
        SocketAddress socketAddressAddress = proxy.address();
        if (socketAddressAddress == null) {
            throw new NullPointerException("null cannot be cast to non-null type java.net.InetSocketAddress");
        }
        InetAddress address = ((InetSocketAddress) socketAddressAddress).getAddress();
        i.d(address, "address() as InetSocketAddress).address");
        return address;
    }

    @Override // m.b
    public b0 a(f0 f0Var, d0 d0Var) {
        m.a aVarA;
        PasswordAuthentication passwordAuthenticationRequestPasswordAuthentication;
        i.e(d0Var, "response");
        List<h> listJ = d0Var.j();
        b0 b0VarF0 = d0Var.f0();
        v vVarJ = b0VarF0.j();
        boolean z = d0Var.l() == 407;
        Proxy proxyB = f0Var == null ? null : f0Var.b();
        if (proxyB == null) {
            proxyB = Proxy.NO_PROXY;
        }
        for (h hVar : listJ) {
            if (p.l("Basic", hVar.c(), true)) {
                q qVarC = (f0Var == null || (aVarA = f0Var.a()) == null) ? null : aVarA.c();
                if (qVarC == null) {
                    qVarC = this.b;
                }
                if (z) {
                    SocketAddress socketAddressAddress = proxyB.address();
                    if (socketAddressAddress == null) {
                        throw new NullPointerException("null cannot be cast to non-null type java.net.InetSocketAddress");
                    }
                    InetSocketAddress inetSocketAddress = (InetSocketAddress) socketAddressAddress;
                    String hostName = inetSocketAddress.getHostName();
                    i.d(proxyB, "proxy");
                    passwordAuthenticationRequestPasswordAuthentication = Authenticator.requestPasswordAuthentication(hostName, b(proxyB, vVarJ, qVarC), inetSocketAddress.getPort(), vVarJ.u(), hVar.b(), hVar.c(), vVarJ.w(), Authenticator.RequestorType.PROXY);
                } else {
                    String strI = vVarJ.i();
                    i.d(proxyB, "proxy");
                    passwordAuthenticationRequestPasswordAuthentication = Authenticator.requestPasswordAuthentication(strI, b(proxyB, vVarJ, qVarC), vVarJ.n(), vVarJ.u(), hVar.b(), hVar.c(), vVarJ.w(), Authenticator.RequestorType.SERVER);
                }
                if (passwordAuthenticationRequestPasswordAuthentication != null) {
                    String str = z ? "Proxy-Authorization" : "Authorization";
                    String userName = passwordAuthenticationRequestPasswordAuthentication.getUserName();
                    i.d(userName, "auth.userName");
                    char[] password = passwordAuthenticationRequestPasswordAuthentication.getPassword();
                    i.d(password, "auth.password");
                    String strA = o.a(userName, new String(password), hVar.a());
                    b0.a aVarH = b0VarF0.h();
                    aVarH.d(str, strA);
                    return aVarH.a();
                }
            }
        }
        return null;
    }
}
