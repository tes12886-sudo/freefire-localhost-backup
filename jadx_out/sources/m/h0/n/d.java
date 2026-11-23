package m.h0.n;

import java.security.cert.Certificate;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;
import l.d0.p;
import l.d0.q;
import l.t.m;
import l.t.u;
import l.y.c.i;
import n.z;

/* JADX INFO: loaded from: classes.dex */
public final class d implements HostnameVerifier {
    public static final d a = new d();

    private d() {
    }

    private final String b(String str) {
        if (!d(str)) {
            return str;
        }
        Locale locale = Locale.US;
        i.d(locale, "US");
        String lowerCase = str.toLowerCase(locale);
        i.d(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        return lowerCase;
    }

    private final List<String> c(X509Certificate x509Certificate, int i2) {
        Object obj;
        try {
            Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames == null) {
                return m.g();
            }
            ArrayList arrayList = new ArrayList();
            for (List<?> list : subjectAlternativeNames) {
                if (list != null && list.size() >= 2 && i.a(list.get(0), Integer.valueOf(i2)) && (obj = list.get(1)) != null) {
                    arrayList.add((String) obj);
                }
            }
            return arrayList;
        } catch (CertificateParsingException unused) {
            return m.g();
        }
    }

    private final boolean d(String str) {
        return str.length() == ((int) z.b(str, 0, 0, 3, null));
    }

    private final boolean f(String str, String str2) {
        if (!(str == null || str.length() == 0) && !p.x(str, ".", false, 2, null) && !p.k(str, "..", false, 2, null)) {
            if (!(str2 == null || str2.length() == 0) && !p.x(str2, ".", false, 2, null) && !p.k(str2, "..", false, 2, null)) {
                if (!p.k(str, ".", false, 2, null)) {
                    str = i.k(str, ".");
                }
                String str3 = str;
                if (!p.k(str2, ".", false, 2, null)) {
                    str2 = i.k(str2, ".");
                }
                String strB = b(str2);
                if (!q.C(strB, "*", false, 2, null)) {
                    return i.a(str3, strB);
                }
                if (!p.x(strB, "*.", false, 2, null) || q.M(strB, '*', 1, false, 4, null) != -1 || str3.length() < strB.length() || i.a("*.", strB)) {
                    return false;
                }
                String strSubstring = strB.substring(1);
                i.d(strSubstring, "this as java.lang.String).substring(startIndex)");
                if (!p.k(str3, strSubstring, false, 2, null)) {
                    return false;
                }
                int length = str3.length() - strSubstring.length();
                return length <= 0 || q.R(str3, '.', length + (-1), false, 4, null) == -1;
            }
        }
        return false;
    }

    private final boolean g(String str, X509Certificate x509Certificate) {
        String strB = b(str);
        List<String> listC = c(x509Certificate, 2);
        if ((listC instanceof Collection) && listC.isEmpty()) {
            return false;
        }
        Iterator<T> it = listC.iterator();
        while (it.hasNext()) {
            if (a.f(strB, (String) it.next())) {
                return true;
            }
        }
        return false;
    }

    private final boolean h(String str, X509Certificate x509Certificate) {
        String strE = m.h0.c.e(str);
        List<String> listC = c(x509Certificate, 7);
        if ((listC instanceof Collection) && listC.isEmpty()) {
            return false;
        }
        Iterator<T> it = listC.iterator();
        while (it.hasNext()) {
            if (i.a(strE, m.h0.c.e((String) it.next()))) {
                return true;
            }
        }
        return false;
    }

    public final List<String> a(X509Certificate x509Certificate) {
        i.e(x509Certificate, "certificate");
        return u.H(c(x509Certificate, 7), c(x509Certificate, 2));
    }

    public final boolean e(String str, X509Certificate x509Certificate) {
        i.e(str, "host");
        i.e(x509Certificate, "certificate");
        return m.h0.d.g(str) ? h(str, x509Certificate) : g(str, x509Certificate);
    }

    @Override // javax.net.ssl.HostnameVerifier
    public boolean verify(String str, SSLSession sSLSession) {
        i.e(str, "host");
        i.e(sSLSession, "session");
        if (!d(str)) {
            return false;
        }
        try {
            Certificate certificate = sSLSession.getPeerCertificates()[0];
            if (certificate != null) {
                return e(str, (X509Certificate) certificate);
            }
            throw new NullPointerException("null cannot be cast to non-null type java.security.cert.X509Certificate");
        } catch (SSLException unused) {
            return false;
        }
    }
}
