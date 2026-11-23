package okhttp3.internal.publicsuffix;

import com.appff.haptic.base.Utils;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.IDN;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import l.d0.q;
import l.s;
import l.t.k;
import l.t.l;
import l.t.m;
import l.t.u;
import l.y.c.f;
import l.y.c.i;
import m.h0.d;
import m.h0.l.h;

/* JADX INFO: loaded from: classes.dex */
public final class PublicSuffixDatabase {
    public static final a e = new a(null);
    private static final byte[] f = {42};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final List<String> f2376g = l.b("*");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final PublicSuffixDatabase f2377h = new PublicSuffixDatabase();
    private final AtomicBoolean a = new AtomicBoolean(false);
    private final CountDownLatch b = new CountDownLatch(1);
    private byte[] c;
    private byte[] d;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String b(byte[] bArr, byte[][] bArr2, int i2) {
            int i3;
            boolean z;
            int iB;
            int iB2;
            int length = bArr.length;
            int i4 = 0;
            while (i4 < length) {
                int i5 = (i4 + length) / 2;
                while (i5 > -1 && bArr[i5] != 10) {
                    i5--;
                }
                int i6 = i5 + 1;
                int i7 = 1;
                while (true) {
                    i3 = i6 + i7;
                    if (bArr[i3] == 10) {
                        break;
                    }
                    i7++;
                }
                int i8 = i3 - i6;
                int i9 = i2;
                boolean z2 = false;
                int i10 = 0;
                int i11 = 0;
                while (true) {
                    if (z2) {
                        iB = 46;
                        z = false;
                    } else {
                        z = z2;
                        iB = d.b(bArr2[i9][i10], Utils.MAX_STRENGTH_VALUE);
                    }
                    iB2 = iB - d.b(bArr[i6 + i11], Utils.MAX_STRENGTH_VALUE);
                    if (iB2 != 0) {
                        break;
                    }
                    i11++;
                    i10++;
                    if (i11 == i8) {
                        break;
                    }
                    if (bArr2[i9].length != i10) {
                        z2 = z;
                    } else {
                        if (i9 == bArr2.length - 1) {
                            break;
                        }
                        i9++;
                        z2 = true;
                        i10 = -1;
                    }
                }
                if (iB2 >= 0) {
                    if (iB2 <= 0) {
                        int i12 = i8 - i11;
                        int length2 = bArr2[i9].length - i10;
                        int length3 = bArr2.length;
                        for (int i13 = i9 + 1; i13 < length3; i13++) {
                            length2 += bArr2[i13].length;
                        }
                        if (length2 >= i12) {
                            if (length2 <= i12) {
                                Charset charset = StandardCharsets.UTF_8;
                                i.d(charset, "UTF_8");
                                return new String(bArr, i6, i8, charset);
                            }
                        }
                    }
                    i4 = i3 + 1;
                }
                length = i6 - 1;
            }
            return null;
        }

        public final PublicSuffixDatabase c() {
            return PublicSuffixDatabase.f2377h;
        }
    }

    private final List<String> b(List<String> list) {
        String str;
        String str2;
        String strB;
        if (this.a.get() || !this.a.compareAndSet(false, true)) {
            try {
                this.b.await();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        } else {
            e();
        }
        if (!(this.c != null)) {
            throw new IllegalStateException("Unable to load publicsuffixes.gz resource from the classpath.".toString());
        }
        int size = list.size();
        byte[][] bArr = new byte[size][];
        for (int i2 = 0; i2 < size; i2++) {
            String str3 = list.get(i2);
            Charset charset = StandardCharsets.UTF_8;
            i.d(charset, "UTF_8");
            byte[] bytes = str3.getBytes(charset);
            i.d(bytes, "this as java.lang.String).getBytes(charset)");
            bArr[i2] = bytes;
        }
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                str = null;
                break;
            }
            int i4 = i3 + 1;
            a aVar = e;
            byte[] bArr2 = this.c;
            if (bArr2 == null) {
                i.q("publicSuffixListBytes");
                throw null;
            }
            String strB2 = aVar.b(bArr2, bArr, i3);
            if (strB2 != null) {
                str = strB2;
                break;
            }
            i3 = i4;
        }
        if (size <= 1) {
            str2 = null;
            break;
        }
        byte[][] bArr3 = (byte[][]) bArr.clone();
        int length = bArr3.length - 1;
        int i5 = 0;
        while (true) {
            if (i5 >= length) {
                str2 = null;
                break;
            }
            int i6 = i5 + 1;
            bArr3[i5] = f;
            a aVar2 = e;
            byte[] bArr4 = this.c;
            if (bArr4 == null) {
                i.q("publicSuffixListBytes");
                throw null;
            }
            String strB3 = aVar2.b(bArr4, bArr3, i5);
            if (strB3 != null) {
                str2 = strB3;
                break;
            }
            i5 = i6;
        }
        if (str2 == null) {
            strB = null;
            break;
        }
        int i7 = size - 1;
        int i8 = 0;
        while (true) {
            if (i8 >= i7) {
                strB = null;
                break;
            }
            int i9 = i8 + 1;
            a aVar3 = e;
            byte[] bArr5 = this.d;
            if (bArr5 == null) {
                i.q("publicSuffixExceptionListBytes");
                throw null;
            }
            strB = aVar3.b(bArr5, bArr, i8);
            if (strB != null) {
                break;
            }
            i8 = i9;
        }
        if (strB != null) {
            return q.h0(i.k("!", strB), new char[]{'.'}, false, 0, 6, null);
        }
        if (str == null && str2 == null) {
            return f2376g;
        }
        List<String> listH0 = str == null ? null : q.h0(str, new char[]{'.'}, false, 0, 6, null);
        if (listH0 == null) {
            listH0 = m.g();
        }
        List<String> listH1 = str2 != null ? q.h0(str2, new char[]{'.'}, false, 0, 6, null) : null;
        if (listH1 == null) {
            listH1 = m.g();
        }
        return listH0.size() > listH1.size() ? listH0 : listH1;
    }

    private final void d() throws IOException {
        InputStream resourceAsStream = PublicSuffixDatabase.class.getResourceAsStream("publicsuffixes.gz");
        if (resourceAsStream == null) {
            return;
        }
        n.d dVarB = n.l.b(new n.i(n.l.e(resourceAsStream)));
        try {
            byte[] bArrB = dVarB.B(dVarB.readInt());
            byte[] bArrB2 = dVarB.B(dVarB.readInt());
            s sVar = s.a;
            l.x.a.a(dVarB, null);
            synchronized (this) {
                i.c(bArrB);
                this.c = bArrB;
                i.c(bArrB2);
                this.d = bArrB2;
            }
            this.b.countDown();
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                l.x.a.a(dVarB, th);
                throw th2;
            }
        }
    }

    private final void e() {
        boolean z = false;
        while (true) {
            try {
                try {
                    d();
                    break;
                } catch (InterruptedIOException unused) {
                    Thread.interrupted();
                    z = true;
                } catch (IOException e2) {
                    h.a.g().j("Failed to read public suffix list", 5, e2);
                    if (z) {
                        Thread.currentThread().interrupt();
                        return;
                    }
                    return;
                }
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    private final List<String> f(String str) {
        List<String> listH0 = q.h0(str, new char[]{'.'}, false, 0, 6, null);
        return i.a(k.F(listH0), "") ? u.v(listH0, 1) : listH0;
    }

    public final String c(String str) {
        i.e(str, "domain");
        String unicode = IDN.toUnicode(str);
        i.d(unicode, "unicodeDomain");
        List<String> listF = f(unicode);
        List<String> listB = b(listF);
        if (listF.size() == listB.size() && listB.get(0).charAt(0) != '!') {
            return null;
        }
        char cCharAt = listB.get(0).charAt(0);
        int size = listF.size();
        int size2 = listB.size();
        if (cCharAt != '!') {
            size2++;
        }
        return l.c0.i.e(l.c0.i.b(u.t(f(str)), size - size2), ".", null, null, 0, null, null, 62, null);
    }
}
