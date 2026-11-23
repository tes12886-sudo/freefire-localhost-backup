package m.h0.i;

import java.net.Proxy;
import m.b0;
import m.v;

/* JADX INFO: loaded from: classes.dex */
public final class i {
    public static final i a = new i();

    private i() {
    }

    private final boolean b(b0 b0Var, Proxy.Type type) {
        return !b0Var.f() && type == Proxy.Type.HTTP;
    }

    public final String a(b0 b0Var, Proxy.Type type) {
        l.y.c.i.e(b0Var, "request");
        l.y.c.i.e(type, "proxyType");
        StringBuilder sb = new StringBuilder();
        sb.append(b0Var.g());
        sb.append(' ');
        i iVar = a;
        boolean zB = iVar.b(b0Var, type);
        v vVarJ = b0Var.j();
        if (zB) {
            sb.append(vVarJ);
        } else {
            sb.append(iVar.c(vVarJ));
        }
        sb.append(" HTTP/1.1");
        String string = sb.toString();
        l.y.c.i.d(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    public final String c(v vVar) {
        l.y.c.i.e(vVar, "url");
        String strD = vVar.d();
        String strF = vVar.f();
        if (strF == null) {
            return strD;
        }
        return strD + '?' + ((Object) strF);
    }
}
