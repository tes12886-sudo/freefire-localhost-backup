package m.h0.k;

import com.appff.haptic.base.Utils;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import l.t.u;
import n.x;

/* JADX INFO: loaded from: classes.dex */
public final class d {
    public static final d a;
    private static final c[] b;
    private static final Map<n.e, Integer> c;

    public static final class a {
        private final int a;
        private int b;
        private final List<c> c;
        private final n.d d;
        public c[] e;
        private int f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f2244g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f2245h;

        public a(x xVar, int i2, int i3) {
            l.y.c.i.e(xVar, "source");
            this.a = i2;
            this.b = i3;
            this.c = new ArrayList();
            this.d = n.l.b(xVar);
            c[] cVarArr = new c[8];
            this.e = cVarArr;
            this.f = cVarArr.length - 1;
        }

        public /* synthetic */ a(x xVar, int i2, int i3, int i4, l.y.c.f fVar) {
            this(xVar, i2, (i4 & 4) != 0 ? i2 : i3);
        }

        private final void a() {
            int i2 = this.b;
            int i3 = this.f2245h;
            if (i2 < i3) {
                if (i2 == 0) {
                    b();
                } else {
                    d(i3 - i2);
                }
            }
        }

        private final void b() {
            l.t.g.g(this.e, null, 0, 0, 6, null);
            this.f = this.e.length - 1;
            this.f2244g = 0;
            this.f2245h = 0;
        }

        private final int c(int i2) {
            return this.f + 1 + i2;
        }

        private final int d(int i2) {
            int i3;
            int i4 = 0;
            if (i2 > 0) {
                int length = this.e.length;
                while (true) {
                    length--;
                    i3 = this.f;
                    if (length < i3 || i2 <= 0) {
                        break;
                    }
                    c cVar = this.e[length];
                    l.y.c.i.c(cVar);
                    int i5 = cVar.c;
                    i2 -= i5;
                    this.f2245h -= i5;
                    this.f2244g--;
                    i4++;
                }
                c[] cVarArr = this.e;
                System.arraycopy(cVarArr, i3 + 1, cVarArr, i3 + 1 + i4, this.f2244g);
                this.f += i4;
            }
            return i4;
        }

        private final n.e f(int i2) throws IOException {
            c cVar;
            if (!h(i2)) {
                int iC = c(i2 - d.a.c().length);
                if (iC >= 0) {
                    c[] cVarArr = this.e;
                    if (iC < cVarArr.length) {
                        cVar = cVarArr[iC];
                        l.y.c.i.c(cVar);
                    }
                }
                throw new IOException(l.y.c.i.k("Header index too large ", Integer.valueOf(i2 + 1)));
            }
            cVar = d.a.c()[i2];
            return cVar.a;
        }

        private final void g(int i2, c cVar) {
            this.c.add(cVar);
            int i3 = cVar.c;
            if (i2 != -1) {
                c cVar2 = this.e[c(i2)];
                l.y.c.i.c(cVar2);
                i3 -= cVar2.c;
            }
            int i4 = this.b;
            if (i3 > i4) {
                b();
                return;
            }
            int iD = d((this.f2245h + i3) - i4);
            if (i2 == -1) {
                int i5 = this.f2244g + 1;
                c[] cVarArr = this.e;
                if (i5 > cVarArr.length) {
                    c[] cVarArr2 = new c[cVarArr.length * 2];
                    System.arraycopy(cVarArr, 0, cVarArr2, cVarArr.length, cVarArr.length);
                    this.f = this.e.length - 1;
                    this.e = cVarArr2;
                }
                int i6 = this.f;
                this.f = i6 - 1;
                this.e[i6] = cVar;
                this.f2244g++;
            } else {
                this.e[i2 + c(i2) + iD] = cVar;
            }
            this.f2245h += i3;
        }

        private final boolean h(int i2) {
            return i2 >= 0 && i2 <= d.a.c().length - 1;
        }

        private final int i() {
            return m.h0.d.b(this.d.readByte(), Utils.MAX_STRENGTH_VALUE);
        }

        private final void l(int i2) throws IOException {
            if (h(i2)) {
                this.c.add(d.a.c()[i2]);
                return;
            }
            int iC = c(i2 - d.a.c().length);
            if (iC >= 0) {
                c[] cVarArr = this.e;
                if (iC < cVarArr.length) {
                    List<c> list = this.c;
                    c cVar = cVarArr[iC];
                    l.y.c.i.c(cVar);
                    list.add(cVar);
                    return;
                }
            }
            throw new IOException(l.y.c.i.k("Header index too large ", Integer.valueOf(i2 + 1)));
        }

        private final void n(int i2) {
            g(-1, new c(f(i2), j()));
        }

        private final void o() throws IOException {
            d dVar = d.a;
            n.e eVarJ = j();
            dVar.a(eVarJ);
            g(-1, new c(eVarJ, j()));
        }

        private final void p(int i2) throws IOException {
            this.c.add(new c(f(i2), j()));
        }

        private final void q() throws IOException {
            d dVar = d.a;
            n.e eVarJ = j();
            dVar.a(eVarJ);
            this.c.add(new c(eVarJ, j()));
        }

        public final List<c> e() {
            List<c> listP = u.P(this.c);
            this.c.clear();
            return listP;
        }

        public final n.e j() {
            int i2 = i();
            boolean z = (i2 & 128) == 128;
            long jM = m(i2, 127);
            if (!z) {
                return this.d.o(jM);
            }
            n.b bVar = new n.b();
            k.a.b(this.d, jM, bVar);
            return bVar.j0();
        }

        public final void k() throws IOException {
            while (!this.d.z()) {
                int iB = m.h0.d.b(this.d.readByte(), Utils.MAX_STRENGTH_VALUE);
                if (iB == 128) {
                    throw new IOException("index == 0");
                }
                if ((iB & 128) == 128) {
                    l(m(iB, 127) - 1);
                } else if (iB == 64) {
                    o();
                } else if ((iB & 64) == 64) {
                    n(m(iB, 63) - 1);
                } else if ((iB & 32) == 32) {
                    int iM = m(iB, 31);
                    this.b = iM;
                    if (iM < 0 || iM > this.a) {
                        throw new IOException(l.y.c.i.k("Invalid dynamic table size update ", Integer.valueOf(this.b)));
                    }
                    a();
                } else if (iB == 16 || iB == 0) {
                    q();
                } else {
                    p(m(iB, 15) - 1);
                }
            }
        }

        public final int m(int i2, int i3) {
            int i4 = i2 & i3;
            if (i4 < i3) {
                return i4;
            }
            int i5 = 0;
            while (true) {
                int i6 = i();
                if ((i6 & 128) == 0) {
                    return i3 + (i6 << i5);
                }
                i3 += (i6 & 127) << i5;
                i5 += 7;
            }
        }
    }

    public static final class b {
        public int a;
        private final boolean b;
        private final n.b c;
        private int d;
        private boolean e;
        public int f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public c[] f2246g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f2247h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f2248i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f2249j;

        public b(int i2, boolean z, n.b bVar) {
            l.y.c.i.e(bVar, "out");
            this.a = i2;
            this.b = z;
            this.c = bVar;
            this.d = Integer.MAX_VALUE;
            this.f = i2;
            c[] cVarArr = new c[8];
            this.f2246g = cVarArr;
            this.f2247h = cVarArr.length - 1;
        }

        public /* synthetic */ b(int i2, boolean z, n.b bVar, int i3, l.y.c.f fVar) {
            this((i3 & 1) != 0 ? Utils.CONTINUOUS_EVENT : i2, (i3 & 2) != 0 ? true : z, bVar);
        }

        private final void a() {
            int i2 = this.f;
            int i3 = this.f2249j;
            if (i2 < i3) {
                if (i2 == 0) {
                    b();
                } else {
                    c(i3 - i2);
                }
            }
        }

        private final void b() {
            l.t.g.g(this.f2246g, null, 0, 0, 6, null);
            this.f2247h = this.f2246g.length - 1;
            this.f2248i = 0;
            this.f2249j = 0;
        }

        private final int c(int i2) {
            int i3;
            int i4 = 0;
            if (i2 > 0) {
                int length = this.f2246g.length;
                while (true) {
                    length--;
                    i3 = this.f2247h;
                    if (length < i3 || i2 <= 0) {
                        break;
                    }
                    c cVar = this.f2246g[length];
                    l.y.c.i.c(cVar);
                    i2 -= cVar.c;
                    int i5 = this.f2249j;
                    c cVar2 = this.f2246g[length];
                    l.y.c.i.c(cVar2);
                    this.f2249j = i5 - cVar2.c;
                    this.f2248i--;
                    i4++;
                }
                c[] cVarArr = this.f2246g;
                System.arraycopy(cVarArr, i3 + 1, cVarArr, i3 + 1 + i4, this.f2248i);
                c[] cVarArr2 = this.f2246g;
                int i6 = this.f2247h;
                Arrays.fill(cVarArr2, i6 + 1, i6 + 1 + i4, (Object) null);
                this.f2247h += i4;
            }
            return i4;
        }

        private final void d(c cVar) {
            int i2 = cVar.c;
            int i3 = this.f;
            if (i2 > i3) {
                b();
                return;
            }
            c((this.f2249j + i2) - i3);
            int i4 = this.f2248i + 1;
            c[] cVarArr = this.f2246g;
            if (i4 > cVarArr.length) {
                c[] cVarArr2 = new c[cVarArr.length * 2];
                System.arraycopy(cVarArr, 0, cVarArr2, cVarArr.length, cVarArr.length);
                this.f2247h = this.f2246g.length - 1;
                this.f2246g = cVarArr2;
            }
            int i5 = this.f2247h;
            this.f2247h = i5 - 1;
            this.f2246g[i5] = cVar;
            this.f2248i++;
            this.f2249j += i2;
        }

        public final void e(int i2) {
            this.a = i2;
            int iMin = Math.min(i2, 16384);
            int i3 = this.f;
            if (i3 == iMin) {
                return;
            }
            if (iMin < i3) {
                this.d = Math.min(this.d, iMin);
            }
            this.e = true;
            this.f = iMin;
            a();
        }

        /* JADX WARN: Code duplicated, block: B:7:0x002a  */
        public final void f(n.e eVar) {
            int iT;
            int i2;
            l.y.c.i.e(eVar, "data");
            if (this.b) {
                k kVar = k.a;
                if (kVar.d(eVar) < eVar.t()) {
                    n.b bVar = new n.b();
                    kVar.c(eVar, bVar);
                    eVar = bVar.j0();
                    iT = eVar.t();
                    i2 = 128;
                } else {
                    iT = eVar.t();
                    i2 = 0;
                }
            } else {
                iT = eVar.t();
                i2 = 0;
            }
            h(iT, 127, i2);
            this.c.v0(eVar);
        }

        /* JADX WARN: Code duplicated, block: B:29:0x0087  */
        /* JADX WARN: Code duplicated, block: B:31:0x008f  */
        /* JADX WARN: Code duplicated, block: B:33:0x00a0  */
        /* JADX WARN: Code duplicated, block: B:36:0x00bb A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:37:0x00bd  */
        /* JADX WARN: Code duplicated, block: B:40:0x00cc  */
        /* JADX WARN: Code duplicated, block: B:41:0x00d4  */
        /* JADX WARN: Code duplicated, block: B:43:0x00d8  */
        /* JADX WARN: Code duplicated, block: B:45:0x00e7  */
        /* JADX WARN: Code duplicated, block: B:57:0x00af A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:60:0x00c8 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:61:0x00c8 A[SYNTHETIC] */
        public final void g(List<c> list) {
            int length;
            int length2;
            int i2;
            int length3;
            c cVar;
            c cVar2;
            l.y.c.i.e(list, "headerBlock");
            if (this.e) {
                int i3 = this.d;
                if (i3 < this.f) {
                    h(i3, 31, 32);
                }
                this.e = false;
                this.d = Integer.MAX_VALUE;
                h(this.f, 31, 32);
            }
            int size = list.size();
            int i4 = 0;
            while (i4 < size) {
                int i5 = i4 + 1;
                c cVar3 = list.get(i4);
                n.e eVarV = cVar3.a.v();
                n.e eVar = cVar3.b;
                d dVar = d.a;
                Integer num = dVar.b().get(eVarV);
                if (num != null) {
                    length2 = num.intValue() + 1;
                    if (2 <= length2 && length2 < 8) {
                        if (l.y.c.i.a(dVar.c()[length2 - 1].b, eVar)) {
                            length = length2;
                        } else if (l.y.c.i.a(dVar.c()[length2].b, eVar)) {
                            length2++;
                            length = length2;
                        }
                        if (length2 == -1) {
                            i2 = this.f2247h + 1;
                            length3 = this.f2246g.length;
                            while (i2 < length3) {
                                int i6 = i2 + 1;
                                cVar = this.f2246g[i2];
                                l.y.c.i.c(cVar);
                                if (l.y.c.i.a(cVar.a, eVarV)) {
                                    cVar2 = this.f2246g[i2];
                                    l.y.c.i.c(cVar2);
                                    if (l.y.c.i.a(cVar2.b, eVar)) {
                                        length2 = d.a.c().length + (i2 - this.f2247h);
                                        break;
                                    } else if (length == -1) {
                                        length = d.a.c().length + (i2 - this.f2247h);
                                    }
                                }
                                i2 = i6;
                            }
                        }
                        if (length2 != -1) {
                            h(length2, 127, 128);
                        } else {
                            if (length == -1) {
                                this.c.z0(64);
                                f(eVarV);
                            } else if (eVarV.u(c.d) || l.y.c.i.a(c.f2243i, eVarV)) {
                                h(length, 63, 64);
                            } else {
                                h(length, 15, 0);
                                f(eVar);
                            }
                            f(eVar);
                            d(cVar3);
                        }
                        i4 = i5;
                    }
                    length = length2;
                } else {
                    length = -1;
                }
                length2 = -1;
                if (length2 == -1) {
                    i2 = this.f2247h + 1;
                    length3 = this.f2246g.length;
                    while (i2 < length3) {
                        int i7 = i2 + 1;
                        cVar = this.f2246g[i2];
                        l.y.c.i.c(cVar);
                        if (l.y.c.i.a(cVar.a, eVarV)) {
                            cVar2 = this.f2246g[i2];
                            l.y.c.i.c(cVar2);
                            if (l.y.c.i.a(cVar2.b, eVar)) {
                                length2 = d.a.c().length + (i2 - this.f2247h);
                                break;
                            } else if (length == -1) {
                                length = d.a.c().length + (i2 - this.f2247h);
                            }
                        }
                        i2 = i7;
                    }
                }
                if (length2 != -1) {
                    h(length2, 127, 128);
                } else {
                    if (length == -1) {
                        this.c.z0(64);
                        f(eVarV);
                    } else {
                        if (eVarV.u(c.d)) {
                        }
                        h(length, 63, 64);
                    }
                    f(eVar);
                    d(cVar3);
                }
                i4 = i5;
            }
        }

        public final void h(int i2, int i3, int i4) {
            int i5;
            n.b bVar;
            if (i2 < i3) {
                bVar = this.c;
                i5 = i2 | i4;
            } else {
                this.c.z0(i4 | i3);
                i5 = i2 - i3;
                while (i5 >= 128) {
                    this.c.z0(128 | (i5 & 127));
                    i5 >>>= 7;
                }
                bVar = this.c;
            }
            bVar.z0(i5);
        }
    }

    static {
        d dVar = new d();
        a = dVar;
        n.e eVar = c.f;
        n.e eVar2 = c.f2241g;
        n.e eVar3 = c.f2242h;
        n.e eVar4 = c.e;
        b = new c[]{new c(c.f2243i, ""), new c(eVar, "GET"), new c(eVar, "POST"), new c(eVar2, "/"), new c(eVar2, "/index.html"), new c(eVar3, "http"), new c(eVar3, "https"), new c(eVar4, "200"), new c(eVar4, "204"), new c(eVar4, "206"), new c(eVar4, "304"), new c(eVar4, "400"), new c(eVar4, "404"), new c(eVar4, "500"), new c("accept-charset", ""), new c("accept-encoding", "gzip, deflate"), new c("accept-language", ""), new c("accept-ranges", ""), new c("accept", ""), new c("access-control-allow-origin", ""), new c("age", ""), new c("allow", ""), new c("authorization", ""), new c("cache-control", ""), new c("content-disposition", ""), new c("content-encoding", ""), new c("content-language", ""), new c("content-length", ""), new c("content-location", ""), new c("content-range", ""), new c("content-type", ""), new c("cookie", ""), new c("date", ""), new c("etag", ""), new c("expect", ""), new c("expires", ""), new c("from", ""), new c("host", ""), new c("if-match", ""), new c("if-modified-since", ""), new c("if-none-match", ""), new c("if-range", ""), new c("if-unmodified-since", ""), new c("last-modified", ""), new c("link", ""), new c("location", ""), new c("max-forwards", ""), new c("proxy-authenticate", ""), new c("proxy-authorization", ""), new c("range", ""), new c("referer", ""), new c("refresh", ""), new c("retry-after", ""), new c("server", ""), new c("set-cookie", ""), new c("strict-transport-security", ""), new c("transfer-encoding", ""), new c("user-agent", ""), new c("vary", ""), new c("via", ""), new c("www-authenticate", "")};
        c = dVar.d();
    }

    private d() {
    }

    private final Map<n.e, Integer> d() {
        c[] cVarArr = b;
        LinkedHashMap linkedHashMap = new LinkedHashMap(cVarArr.length);
        int length = cVarArr.length;
        int i2 = 0;
        while (i2 < length) {
            int i3 = i2 + 1;
            c[] cVarArr2 = b;
            if (!linkedHashMap.containsKey(cVarArr2[i2].a)) {
                linkedHashMap.put(cVarArr2[i2].a, Integer.valueOf(i2));
            }
            i2 = i3;
        }
        Map<n.e, Integer> mapUnmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        l.y.c.i.d(mapUnmodifiableMap, "unmodifiableMap(result)");
        return mapUnmodifiableMap;
    }

    public final n.e a(n.e eVar) throws IOException {
        l.y.c.i.e(eVar, "name");
        int iT = eVar.t();
        int i2 = 0;
        while (i2 < iT) {
            int i3 = i2 + 1;
            byte bE = eVar.e(i2);
            if (65 <= bE && bE <= 90) {
                throw new IOException(l.y.c.i.k("PROTOCOL_ERROR response malformed: mixed case name: ", eVar.x()));
            }
            i2 = i3;
        }
        return eVar;
    }

    public final Map<n.e, Integer> b() {
        return c;
    }

    public final c[] c() {
        return b;
    }
}
