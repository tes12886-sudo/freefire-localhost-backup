package m;

import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import javax.net.ssl.SSLPeerUnverifiedException;

/* JADX INFO: loaded from: classes.dex */
public final class g {
    public static final b c = new b(null);
    public static final g d = new a().b();
    private final Set<c> a;
    private final m.h0.n.c b;

    public static final class a {
        private final List<c> a = new ArrayList();

        public final a a(String str, String... strArr) {
            l.y.c.i.e(str, "pattern");
            l.y.c.i.e(strArr, "pins");
            int length = strArr.length;
            int i2 = 0;
            while (i2 < length) {
                String str2 = strArr[i2];
                i2++;
                c().add(new c(str, str2));
            }
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final g b() {
            return new g(l.t.u.S(this.a), null, 2, 0 == true ? 1 : 0);
        }

        public final List<c> c() {
            return this.a;
        }
    }

    public static final class b {
        private b() {
        }

        public /* synthetic */ b(l.y.c.f fVar) {
            this();
        }

        public final String a(Certificate certificate) {
            l.y.c.i.e(certificate, "certificate");
            if (certificate instanceof X509Certificate) {
                return l.y.c.i.k("sha256/", c((X509Certificate) certificate).a());
            }
            throw new IllegalArgumentException("Certificate pinning requires X509 certificates".toString());
        }

        public final n.e b(X509Certificate x509Certificate) {
            l.y.c.i.e(x509Certificate, "<this>");
            n.e.a aVar = n.e.d;
            byte[] encoded = x509Certificate.getPublicKey().getEncoded();
            l.y.c.i.d(encoded, "publicKey.encoded");
            return n.e.a.f(aVar, encoded, 0, 0, 3, null).r();
        }

        public final n.e c(X509Certificate x509Certificate) {
            l.y.c.i.e(x509Certificate, "<this>");
            n.e.a aVar = n.e.d;
            byte[] encoded = x509Certificate.getPublicKey().getEncoded();
            l.y.c.i.d(encoded, "publicKey.encoded");
            return n.e.a.f(aVar, encoded, 0, 0, 3, null).s();
        }
    }

    public static final class c {
        private final String a;
        private final String b;
        private final n.e c;

        public c(String str, String str2) {
            n.e eVarA;
            l.y.c.i.e(str, "pattern");
            l.y.c.i.e(str2, "pin");
            if (!((l.d0.p.x(str, "*.", false, 2, null) && l.d0.q.N(str, "*", 1, false, 4, null) == -1) || (l.d0.p.x(str, "**.", false, 2, null) && l.d0.q.N(str, "*", 2, false, 4, null) == -1) || l.d0.q.N(str, "*", 0, false, 6, null) == -1)) {
                throw new IllegalArgumentException(l.y.c.i.k("Unexpected pattern: ", str).toString());
            }
            String strE = m.h0.c.e(str);
            if (strE == null) {
                throw new IllegalArgumentException(l.y.c.i.k("Invalid pattern: ", str));
            }
            this.a = strE;
            if (l.d0.p.x(str2, "sha1/", false, 2, null)) {
                this.b = "sha1";
                n.e.a aVar = n.e.d;
                String strSubstring = str2.substring(5);
                l.y.c.i.d(strSubstring, "this as java.lang.String).substring(startIndex)");
                eVarA = aVar.a(strSubstring);
                if (eVarA == null) {
                    throw new IllegalArgumentException(l.y.c.i.k("Invalid pin hash: ", str2));
                }
            } else {
                if (!l.d0.p.x(str2, "sha256/", false, 2, null)) {
                    throw new IllegalArgumentException(l.y.c.i.k("pins must start with 'sha256/' or 'sha1/': ", str2));
                }
                this.b = "sha256";
                n.e.a aVar2 = n.e.d;
                String strSubstring2 = str2.substring(7);
                l.y.c.i.d(strSubstring2, "this as java.lang.String).substring(startIndex)");
                eVarA = aVar2.a(strSubstring2);
                if (eVarA == null) {
                    throw new IllegalArgumentException(l.y.c.i.k("Invalid pin hash: ", str2));
                }
            }
            this.c = eVarA;
        }

        public final n.e a() {
            return this.c;
        }

        public final String b() {
            return this.b;
        }

        /* JADX WARN: Failed to inline method: l.d0.g.o(java.lang.String, int, java.lang.String, int, int, boolean, int, java.lang.Object):boolean */
        /* JADX WARN: Unknown register number '(r12v0 java.lang.String)' in method call: l.d0.g.o(java.lang.String, int, java.lang.String, int, int, boolean, int, java.lang.Object):boolean */
        public final boolean c(String str) {
            l.y.c.i.e(str, "hostname");
            if (l.d0.p.x(this.a, "**.", false, 2, null)) {
                int length = this.a.length() - 3;
                int length2 = str.length() - length;
                if (!l.d0.p.n(str, str.length() - length, this.a, 3, length, (str & 16) != 0 ? false : false)) {
                    return false;
                }
                if (length2 != 0 && str.charAt(length2 - 1) != '.') {
                    return false;
                }
            } else {
                if (!l.d0.p.x(this.a, "*.", false, 2, null)) {
                    return l.y.c.i.a(str, this.a);
                }
                int length3 = this.a.length() - 1;
                int length4 = str.length() - length3;
                if (!l.d0.g.o(str, str.length() - length3, this.a, 1, length3, false, 16, null) || l.d0.q.R(str, '.', length4 - 1, false, 4, null) != -1) {
                    return false;
                }
            }
            return true;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return l.y.c.i.a(this.a, cVar.a) && l.y.c.i.a(this.b, cVar.b) && l.y.c.i.a(this.c, cVar.c);
        }

        public int hashCode() {
            return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
        }

        public String toString() {
            return this.b + '/' + this.c.a();
        }
    }

    static final class d extends l.y.c.j implements l.y.b.a<List<? extends X509Certificate>> {
        final /* synthetic */ List<Certificate> b;
        final /* synthetic */ String c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(List<? extends Certificate> list, String str) {
            super(0);
            this.b = list;
            this.c = str;
        }

        @Override // l.y.b.a
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final List<X509Certificate> a() {
            m.h0.n.c cVarD = g.this.d();
            List<Certificate> listA = cVarD == null ? null : cVarD.a(this.b, this.c);
            if (listA == null) {
                listA = this.b;
            }
            ArrayList arrayList = new ArrayList(l.t.n.o(listA, 10));
            Iterator<T> it = listA.iterator();
            while (it.hasNext()) {
                arrayList.add((X509Certificate) ((Certificate) it.next()));
            }
            return arrayList;
        }
    }

    public g(Set<c> set, m.h0.n.c cVar) {
        l.y.c.i.e(set, "pins");
        this.a = set;
        this.b = cVar;
    }

    public /* synthetic */ g(Set set, m.h0.n.c cVar, int i2, l.y.c.f fVar) {
        this(set, (i2 & 2) != 0 ? null : cVar);
    }

    public final void a(String str, List<? extends Certificate> list) {
        l.y.c.i.e(str, "hostname");
        l.y.c.i.e(list, "peerCertificates");
        b(str, new d(list, str));
    }

    public final void b(String str, l.y.b.a<? extends List<? extends X509Certificate>> aVar) throws SSLPeerUnverifiedException {
        l.y.c.i.e(str, "hostname");
        l.y.c.i.e(aVar, "cleanedPeerCertificatesFn");
        List<c> listC = c(str);
        if (listC.isEmpty()) {
            return;
        }
        List<? extends X509Certificate> listA = aVar.a();
        for (X509Certificate x509Certificate : listA) {
            n.e eVarC = null;
            n.e eVarB = null;
            for (c cVar : listC) {
                String strB = cVar.b();
                if (l.y.c.i.a(strB, "sha256")) {
                    if (eVarC == null) {
                        eVarC = c.c(x509Certificate);
                    }
                    if (l.y.c.i.a(cVar.a(), eVarC)) {
                        return;
                    }
                } else {
                    if (!l.y.c.i.a(strB, "sha1")) {
                        throw new AssertionError(l.y.c.i.k("unsupported hashAlgorithm: ", cVar.b()));
                    }
                    if (eVarB == null) {
                        eVarB = c.b(x509Certificate);
                    }
                    if (l.y.c.i.a(cVar.a(), eVarB)) {
                        return;
                    }
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Certificate pinning failure!");
        sb.append("\n  Peer certificate chain:");
        for (X509Certificate x509Certificate2 : listA) {
            sb.append("\n    ");
            sb.append(c.a(x509Certificate2));
            sb.append(": ");
            sb.append(x509Certificate2.getSubjectDN().getName());
        }
        sb.append("\n  Pinned certificates for ");
        sb.append(str);
        sb.append(":");
        for (c cVar2 : listC) {
            sb.append("\n    ");
            sb.append(cVar2);
        }
        String string = sb.toString();
        l.y.c.i.d(string, "StringBuilder().apply(builderAction).toString()");
        throw new SSLPeerUnverifiedException(string);
    }

    public final List<c> c(String str) {
        l.y.c.i.e(str, "hostname");
        Set<c> set = this.a;
        List<c> listG = l.t.m.g();
        for (Object obj : set) {
            if (((c) obj).c(str)) {
                if (listG.isEmpty()) {
                    listG = new ArrayList<>();
                }
                l.y.c.p.a(listG).add(obj);
            }
        }
        return listG;
    }

    public final m.h0.n.c d() {
        return this.b;
    }

    public final g e(m.h0.n.c cVar) {
        l.y.c.i.e(cVar, "certificateChainCleaner");
        return l.y.c.i.a(this.b, cVar) ? this : new g(this.a, cVar);
    }

    public boolean equals(Object obj) {
        if (obj instanceof g) {
            g gVar = (g) obj;
            if (l.y.c.i.a(gVar.a, this.a) && l.y.c.i.a(gVar.b, this.b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = (1517 + this.a.hashCode()) * 41;
        m.h0.n.c cVar = this.b;
        return iHashCode + (cVar != null ? cVar.hashCode() : 0);
    }
}
