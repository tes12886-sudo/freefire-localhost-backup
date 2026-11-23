package m;

import java.io.IOException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;

/* JADX INFO: loaded from: classes.dex */
public final class t {
    public static final a e = new a(null);
    private final g0 a;
    private final i b;
    private final List<Certificate> c;
    private final l.g d;

    public static final class a {

        /* JADX INFO: renamed from: m.t$a$a, reason: collision with other inner class name */
        static final class C0277a extends l.y.c.j implements l.y.b.a<List<? extends Certificate>> {
            final /* synthetic */ List<Certificate> a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C0277a(List<? extends Certificate> list) {
                super(0);
                this.a = list;
            }

            @Override // l.y.b.a
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public final List<Certificate> a() {
                return this.a;
            }
        }

        private a() {
        }

        public /* synthetic */ a(l.y.c.f fVar) {
            this();
        }

        private final List<Certificate> b(Certificate[] certificateArr) {
            return certificateArr != null ? m.h0.d.t(Arrays.copyOf(certificateArr, certificateArr.length)) : l.t.m.g();
        }

        public final t a(SSLSession sSLSession) throws IOException {
            List<Certificate> listG;
            l.y.c.i.e(sSLSession, "<this>");
            String cipherSuite = sSLSession.getCipherSuite();
            if (cipherSuite == null) {
                throw new IllegalStateException("cipherSuite == null".toString());
            }
            if (l.y.c.i.a(cipherSuite, "TLS_NULL_WITH_NULL_NULL") ? true : l.y.c.i.a(cipherSuite, "SSL_NULL_WITH_NULL_NULL")) {
                throw new IOException(l.y.c.i.k("cipherSuite == ", cipherSuite));
            }
            i iVarB = i.b.b(cipherSuite);
            String protocol = sSLSession.getProtocol();
            if (protocol == null) {
                throw new IllegalStateException("tlsVersion == null".toString());
            }
            if (l.y.c.i.a("NONE", protocol)) {
                throw new IOException("tlsVersion == NONE");
            }
            g0 g0VarA = g0.b.a(protocol);
            try {
                listG = b(sSLSession.getPeerCertificates());
            } catch (SSLPeerUnverifiedException unused) {
                listG = l.t.m.g();
            }
            return new t(g0VarA, iVarB, b(sSLSession.getLocalCertificates()), new C0277a(listG));
        }
    }

    static final class b extends l.y.c.j implements l.y.b.a<List<? extends Certificate>> {
        final /* synthetic */ l.y.b.a<List<Certificate>> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(l.y.b.a<? extends List<? extends Certificate>> aVar) {
            super(0);
            this.a = aVar;
        }

        @Override // l.y.b.a
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final List<Certificate> a() {
            try {
                return this.a.a();
            } catch (SSLPeerUnverifiedException unused) {
                return l.t.m.g();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public t(g0 g0Var, i iVar, List<? extends Certificate> list, l.y.b.a<? extends List<? extends Certificate>> aVar) {
        l.y.c.i.e(g0Var, "tlsVersion");
        l.y.c.i.e(iVar, "cipherSuite");
        l.y.c.i.e(list, "localCertificates");
        l.y.c.i.e(aVar, "peerCertificatesFn");
        this.a = g0Var;
        this.b = iVar;
        this.c = list;
        this.d = l.i.a(new b(aVar));
    }

    private final String b(Certificate certificate) {
        if (certificate instanceof X509Certificate) {
            return ((X509Certificate) certificate).getSubjectDN().toString();
        }
        String type = certificate.getType();
        l.y.c.i.d(type, "type");
        return type;
    }

    public final i a() {
        return this.b;
    }

    public final List<Certificate> c() {
        return this.c;
    }

    public final List<Certificate> d() {
        return (List) this.d.getValue();
    }

    public final g0 e() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj instanceof t) {
            t tVar = (t) obj;
            if (tVar.a == this.a && l.y.c.i.a(tVar.b, this.b) && l.y.c.i.a(tVar.d(), d()) && l.y.c.i.a(tVar.c, this.c)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((((527 + this.a.hashCode()) * 31) + this.b.hashCode()) * 31) + d().hashCode()) * 31) + this.c.hashCode();
    }

    public String toString() {
        List<Certificate> listD = d();
        ArrayList arrayList = new ArrayList(l.t.n.o(listD, 10));
        Iterator<T> it = listD.iterator();
        while (it.hasNext()) {
            arrayList.add(b((Certificate) it.next()));
        }
        String string = arrayList.toString();
        StringBuilder sb = new StringBuilder();
        sb.append("Handshake{tlsVersion=");
        sb.append(this.a);
        sb.append(" cipherSuite=");
        sb.append(this.b);
        sb.append(" peerCertificates=");
        sb.append(string);
        sb.append(" localCertificates=");
        List<Certificate> list = this.c;
        ArrayList arrayList2 = new ArrayList(l.t.n.o(list, 10));
        Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList2.add(b((Certificate) it2.next()));
        }
        sb.append(arrayList2);
        sb.append('}');
        return sb.toString();
    }
}
