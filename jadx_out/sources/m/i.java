package m;

import com.appff.haptic.base.Utils;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class i {
    public static final b b;
    private static final Comparator<String> c;
    private static final Map<String, i> d;
    public static final i e;
    public static final i f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final i f2292g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final i f2293h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final i f2294i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final i f2295j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final i f2296k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final i f2297l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final i f2298m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final i f2299n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final i f2300o;
    public static final i p;
    public static final i q;
    public static final i r;
    public static final i s;
    public static final i t;
    private final String a;

    public static final class a implements Comparator<String> {
        a() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(String str, String str2) {
            l.y.c.i.e(str, "a");
            l.y.c.i.e(str2, "b");
            int iMin = Math.min(str.length(), str2.length());
            for (int i2 = 4; i2 < iMin; i2++) {
                char cCharAt = str.charAt(i2);
                char cCharAt2 = str2.charAt(i2);
                if (cCharAt != cCharAt2) {
                    return l.y.c.i.g(cCharAt, cCharAt2) < 0 ? -1 : 1;
                }
            }
            int length = str.length();
            int length2 = str2.length();
            if (length != length2) {
                return length < length2 ? -1 : 1;
            }
            return 0;
        }
    }

    public static final class b {
        private b() {
        }

        public /* synthetic */ b(l.y.c.f fVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final i d(String str, int i2) {
            i iVar = new i(str, null);
            i.d.put(str, iVar);
            return iVar;
        }

        private final String e(String str) {
            if (l.d0.p.x(str, "TLS_", false, 2, null)) {
                String strSubstring = str.substring(4);
                l.y.c.i.d(strSubstring, "this as java.lang.String).substring(startIndex)");
                return l.y.c.i.k("SSL_", strSubstring);
            }
            if (!l.d0.p.x(str, "SSL_", false, 2, null)) {
                return str;
            }
            String strSubstring2 = str.substring(4);
            l.y.c.i.d(strSubstring2, "this as java.lang.String).substring(startIndex)");
            return l.y.c.i.k("TLS_", strSubstring2);
        }

        public final synchronized i b(String str) {
            i iVar;
            l.y.c.i.e(str, "javaName");
            iVar = (i) i.d.get(str);
            if (iVar == null) {
                iVar = (i) i.d.get(e(str));
                if (iVar == null) {
                    iVar = new i(str, null);
                }
                i.d.put(str, iVar);
            }
            return iVar;
        }

        public final Comparator<String> c() {
            return i.c;
        }
    }

    static {
        b bVar = new b(null);
        b = bVar;
        c = new a();
        d = new LinkedHashMap();
        bVar.d("SSL_RSA_WITH_NULL_MD5", 1);
        bVar.d("SSL_RSA_WITH_NULL_SHA", 2);
        bVar.d("SSL_RSA_EXPORT_WITH_RC4_40_MD5", 3);
        bVar.d("SSL_RSA_WITH_RC4_128_MD5", 4);
        bVar.d("SSL_RSA_WITH_RC4_128_SHA", 5);
        bVar.d("SSL_RSA_EXPORT_WITH_DES40_CBC_SHA", 8);
        bVar.d("SSL_RSA_WITH_DES_CBC_SHA", 9);
        e = bVar.d("SSL_RSA_WITH_3DES_EDE_CBC_SHA", 10);
        bVar.d("SSL_DHE_DSS_EXPORT_WITH_DES40_CBC_SHA", 17);
        bVar.d("SSL_DHE_DSS_WITH_DES_CBC_SHA", 18);
        bVar.d("SSL_DHE_DSS_WITH_3DES_EDE_CBC_SHA", 19);
        bVar.d("SSL_DHE_RSA_EXPORT_WITH_DES40_CBC_SHA", 20);
        bVar.d("SSL_DHE_RSA_WITH_DES_CBC_SHA", 21);
        bVar.d("SSL_DHE_RSA_WITH_3DES_EDE_CBC_SHA", 22);
        bVar.d("SSL_DH_anon_EXPORT_WITH_RC4_40_MD5", 23);
        bVar.d("SSL_DH_anon_WITH_RC4_128_MD5", 24);
        bVar.d("SSL_DH_anon_EXPORT_WITH_DES40_CBC_SHA", 25);
        bVar.d("SSL_DH_anon_WITH_DES_CBC_SHA", 26);
        bVar.d("SSL_DH_anon_WITH_3DES_EDE_CBC_SHA", 27);
        bVar.d("TLS_KRB5_WITH_DES_CBC_SHA", 30);
        bVar.d("TLS_KRB5_WITH_3DES_EDE_CBC_SHA", 31);
        bVar.d("TLS_KRB5_WITH_RC4_128_SHA", 32);
        bVar.d("TLS_KRB5_WITH_DES_CBC_MD5", 34);
        bVar.d("TLS_KRB5_WITH_3DES_EDE_CBC_MD5", 35);
        bVar.d("TLS_KRB5_WITH_RC4_128_MD5", 36);
        bVar.d("TLS_KRB5_EXPORT_WITH_DES_CBC_40_SHA", 38);
        bVar.d("TLS_KRB5_EXPORT_WITH_RC4_40_SHA", 40);
        bVar.d("TLS_KRB5_EXPORT_WITH_DES_CBC_40_MD5", 41);
        bVar.d("TLS_KRB5_EXPORT_WITH_RC4_40_MD5", 43);
        f = bVar.d("TLS_RSA_WITH_AES_128_CBC_SHA", 47);
        bVar.d("TLS_DHE_DSS_WITH_AES_128_CBC_SHA", 50);
        bVar.d("TLS_DHE_RSA_WITH_AES_128_CBC_SHA", 51);
        bVar.d("TLS_DH_anon_WITH_AES_128_CBC_SHA", 52);
        f2292g = bVar.d("TLS_RSA_WITH_AES_256_CBC_SHA", 53);
        bVar.d("TLS_DHE_DSS_WITH_AES_256_CBC_SHA", 56);
        bVar.d("TLS_DHE_RSA_WITH_AES_256_CBC_SHA", 57);
        bVar.d("TLS_DH_anon_WITH_AES_256_CBC_SHA", 58);
        bVar.d("TLS_RSA_WITH_NULL_SHA256", 59);
        bVar.d("TLS_RSA_WITH_AES_128_CBC_SHA256", 60);
        bVar.d("TLS_RSA_WITH_AES_256_CBC_SHA256", 61);
        bVar.d("TLS_DHE_DSS_WITH_AES_128_CBC_SHA256", 64);
        bVar.d("TLS_RSA_WITH_CAMELLIA_128_CBC_SHA", 65);
        bVar.d("TLS_DHE_DSS_WITH_CAMELLIA_128_CBC_SHA", 68);
        bVar.d("TLS_DHE_RSA_WITH_CAMELLIA_128_CBC_SHA", 69);
        bVar.d("TLS_DHE_RSA_WITH_AES_128_CBC_SHA256", 103);
        bVar.d("TLS_DHE_DSS_WITH_AES_256_CBC_SHA256", 106);
        bVar.d("TLS_DHE_RSA_WITH_AES_256_CBC_SHA256", 107);
        bVar.d("TLS_DH_anon_WITH_AES_128_CBC_SHA256", 108);
        b bVar2 = b;
        bVar2.d("TLS_DH_anon_WITH_AES_256_CBC_SHA256", 109);
        bVar2.d("TLS_RSA_WITH_CAMELLIA_256_CBC_SHA", 132);
        bVar2.d("TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA", 135);
        bVar2.d("TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA", 136);
        bVar2.d("TLS_PSK_WITH_RC4_128_SHA", 138);
        bVar2.d("TLS_PSK_WITH_3DES_EDE_CBC_SHA", 139);
        bVar2.d("TLS_PSK_WITH_AES_128_CBC_SHA", 140);
        bVar2.d("TLS_PSK_WITH_AES_256_CBC_SHA", 141);
        bVar2.d("TLS_RSA_WITH_SEED_CBC_SHA", 150);
        f2293h = bVar2.d("TLS_RSA_WITH_AES_128_GCM_SHA256", 156);
        f2294i = bVar2.d("TLS_RSA_WITH_AES_256_GCM_SHA384", 157);
        bVar2.d("TLS_DHE_RSA_WITH_AES_128_GCM_SHA256", 158);
        bVar2.d("TLS_DHE_RSA_WITH_AES_256_GCM_SHA384", 159);
        bVar2.d("TLS_DHE_DSS_WITH_AES_128_GCM_SHA256", 162);
        bVar2.d("TLS_DHE_DSS_WITH_AES_256_GCM_SHA384", 163);
        bVar2.d("TLS_DH_anon_WITH_AES_128_GCM_SHA256", 166);
        bVar2.d("TLS_DH_anon_WITH_AES_256_GCM_SHA384", 167);
        bVar2.d("TLS_EMPTY_RENEGOTIATION_INFO_SCSV", Utils.MAX_STRENGTH_VALUE);
        bVar2.d("TLS_FALLBACK_SCSV", 22016);
        bVar2.d("TLS_ECDH_ECDSA_WITH_NULL_SHA", 49153);
        bVar2.d("TLS_ECDH_ECDSA_WITH_RC4_128_SHA", 49154);
        bVar2.d("TLS_ECDH_ECDSA_WITH_3DES_EDE_CBC_SHA", 49155);
        bVar2.d("TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA", 49156);
        bVar2.d("TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA", 49157);
        bVar2.d("TLS_ECDHE_ECDSA_WITH_NULL_SHA", 49158);
        bVar2.d("TLS_ECDHE_ECDSA_WITH_RC4_128_SHA", 49159);
        bVar2.d("TLS_ECDHE_ECDSA_WITH_3DES_EDE_CBC_SHA", 49160);
        bVar2.d("TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA", 49161);
        bVar2.d("TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA", 49162);
        bVar2.d("TLS_ECDH_RSA_WITH_NULL_SHA", 49163);
        bVar2.d("TLS_ECDH_RSA_WITH_RC4_128_SHA", 49164);
        bVar2.d("TLS_ECDH_RSA_WITH_3DES_EDE_CBC_SHA", 49165);
        bVar2.d("TLS_ECDH_RSA_WITH_AES_128_CBC_SHA", 49166);
        bVar2.d("TLS_ECDH_RSA_WITH_AES_256_CBC_SHA", 49167);
        bVar2.d("TLS_ECDHE_RSA_WITH_NULL_SHA", 49168);
        bVar2.d("TLS_ECDHE_RSA_WITH_RC4_128_SHA", 49169);
        bVar2.d("TLS_ECDHE_RSA_WITH_3DES_EDE_CBC_SHA", 49170);
        f2295j = bVar2.d("TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA", 49171);
        f2296k = bVar2.d("TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA", 49172);
        bVar2.d("TLS_ECDH_anon_WITH_NULL_SHA", 49173);
        bVar2.d("TLS_ECDH_anon_WITH_RC4_128_SHA", 49174);
        bVar2.d("TLS_ECDH_anon_WITH_3DES_EDE_CBC_SHA", 49175);
        bVar2.d("TLS_ECDH_anon_WITH_AES_128_CBC_SHA", 49176);
        bVar2.d("TLS_ECDH_anon_WITH_AES_256_CBC_SHA", 49177);
        bVar2.d("TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA256", 49187);
        bVar2.d("TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA384", 49188);
        bVar2.d("TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA256", 49189);
        bVar2.d("TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA384", 49190);
        bVar2.d("TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256", 49191);
        bVar2.d("TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA384", 49192);
        b bVar3 = b;
        bVar3.d("TLS_ECDH_RSA_WITH_AES_128_CBC_SHA256", 49193);
        bVar3.d("TLS_ECDH_RSA_WITH_AES_256_CBC_SHA384", 49194);
        f2297l = bVar3.d("TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256", 49195);
        f2298m = bVar3.d("TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384", 49196);
        bVar3.d("TLS_ECDH_ECDSA_WITH_AES_128_GCM_SHA256", 49197);
        bVar3.d("TLS_ECDH_ECDSA_WITH_AES_256_GCM_SHA384", 49198);
        f2299n = bVar3.d("TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256", 49199);
        f2300o = bVar3.d("TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384", 49200);
        bVar3.d("TLS_ECDH_RSA_WITH_AES_128_GCM_SHA256", 49201);
        bVar3.d("TLS_ECDH_RSA_WITH_AES_256_GCM_SHA384", 49202);
        bVar3.d("TLS_ECDHE_PSK_WITH_AES_128_CBC_SHA", 49205);
        bVar3.d("TLS_ECDHE_PSK_WITH_AES_256_CBC_SHA", 49206);
        p = bVar3.d("TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256", 52392);
        q = bVar3.d("TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256", 52393);
        bVar3.d("TLS_DHE_RSA_WITH_CHACHA20_POLY1305_SHA256", 52394);
        bVar3.d("TLS_ECDHE_PSK_WITH_CHACHA20_POLY1305_SHA256", 52396);
        r = bVar3.d("TLS_AES_128_GCM_SHA256", 4865);
        s = bVar3.d("TLS_AES_256_GCM_SHA384", 4866);
        t = bVar3.d("TLS_CHACHA20_POLY1305_SHA256", 4867);
        bVar3.d("TLS_AES_128_CCM_SHA256", 4868);
        bVar3.d("TLS_AES_128_CCM_8_SHA256", 4869);
    }

    private i(String str) {
        this.a = str;
    }

    public /* synthetic */ i(String str, l.y.c.f fVar) {
        this(str);
    }

    public final String c() {
        return this.a;
    }

    public String toString() {
        return this.a;
    }
}
