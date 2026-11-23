package m.h0.n;

import java.security.cert.X509Certificate;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import javax.security.auth.x500.X500Principal;
import l.y.c.i;

/* JADX INFO: loaded from: classes.dex */
public final class b implements e {
    private final Map<X500Principal, Set<X509Certificate>> a;

    public b(X509Certificate... x509CertificateArr) {
        i.e(x509CertificateArr, "caCerts");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int length = x509CertificateArr.length;
        int i2 = 0;
        while (i2 < length) {
            X509Certificate x509Certificate = x509CertificateArr[i2];
            i2++;
            X500Principal subjectX500Principal = x509Certificate.getSubjectX500Principal();
            i.d(subjectX500Principal, "caCert.subjectX500Principal");
            Object linkedHashSet = linkedHashMap.get(subjectX500Principal);
            if (linkedHashSet == null) {
                linkedHashSet = new LinkedHashSet();
                linkedHashMap.put(subjectX500Principal, linkedHashSet);
            }
            ((Set) linkedHashSet).add(x509Certificate);
        }
        this.a = linkedHashMap;
    }

    @Override // m.h0.n.e
    public X509Certificate a(X509Certificate x509Certificate) {
        boolean z;
        i.e(x509Certificate, "cert");
        Set<X509Certificate> set = this.a.get(x509Certificate.getIssuerX500Principal());
        Object obj = null;
        if (set == null) {
            return null;
        }
        for (Object obj2 : set) {
            try {
                x509Certificate.verify(((X509Certificate) obj2).getPublicKey());
                z = true;
            } catch (Exception unused) {
                z = false;
            }
            if (z) {
                obj = obj2;
                break;
            }
        }
        return (X509Certificate) obj;
    }

    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof b) && i.a(((b) obj).a, this.a));
    }

    public int hashCode() {
        return this.a.hashCode();
    }
}
