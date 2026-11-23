package m.h0;

import com.appff.haptic.base.Utils;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import l.d0.f;
import l.d0.p;
import l.d0.q;
import l.t.d0;
import l.t.h;
import l.t.m;
import l.t.n;
import l.y.c.i;
import m.c0;
import m.e0;
import m.r;
import m.u;
import m.v;
import m.z;
import n.e;
import n.o;
import n.x;
import n.y;

/* JADX INFO: loaded from: classes.dex */
public final class d {
    public static final byte[] a;
    public static final u b = u.b.g(new String[0]);
    public static final e0 c;
    private static final o d;
    public static final TimeZone e;
    private static final f f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final boolean f2188g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f2189h;

    static {
        byte[] bArr = new byte[0];
        a = bArr;
        c = e0.b.d(e0.b, bArr, null, 1, null);
        c0.a.i(c0.a, bArr, null, 0, 0, 7, null);
        o.a aVar = o.d;
        e.a aVar2 = e.d;
        d = aVar.d(aVar2.b("efbbbf"), aVar2.b("feff"), aVar2.b("fffe"), aVar2.b("0000ffff"), aVar2.b("ffff0000"));
        TimeZone timeZone = TimeZone.getTimeZone("GMT");
        i.c(timeZone);
        e = timeZone;
        f = new f("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");
        f2188g = false;
        String name = z.class.getName();
        i.d(name, "OkHttpClient::class.java.name");
        f2189h = q.c0(q.b0(name, "okhttp3."), "Client");
    }

    public static final int A(String str, int i2) {
        i.e(str, "<this>");
        int length = str.length();
        while (i2 < length) {
            int i3 = i2 + 1;
            char cCharAt = str.charAt(i2);
            if (cCharAt != ' ' && cCharAt != '\t') {
                return i2;
            }
            i2 = i3;
        }
        return str.length();
    }

    public static final String[] B(String[] strArr, String[] strArr2, Comparator<? super String> comparator) {
        i.e(strArr, "<this>");
        i.e(strArr2, "other");
        i.e(comparator, "comparator");
        ArrayList arrayList = new ArrayList();
        int length = strArr.length;
        int i2 = 0;
        while (i2 < length) {
            String str = strArr[i2];
            i2++;
            int length2 = strArr2.length;
            int i3 = 0;
            while (i3 < length2) {
                String str2 = strArr2[i3];
                i3++;
                if (comparator.compare(str, str2) == 0) {
                    arrayList.add(str);
                    break;
                }
            }
        }
        Object[] array = arrayList.toArray(new String[0]);
        if (array != null) {
            return (String[]) array;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
    }

    public static final boolean C(Socket socket, n.d dVar) {
        i.e(socket, "<this>");
        i.e(dVar, "source");
        try {
            int soTimeout = socket.getSoTimeout();
            try {
                socket.setSoTimeout(1);
                return !dVar.z();
            } finally {
                socket.setSoTimeout(soTimeout);
            }
        } catch (SocketTimeoutException unused) {
            return true;
        } catch (IOException unused2) {
            return false;
        }
    }

    public static final boolean D(String str) {
        i.e(str, "name");
        return p.l(str, "Authorization", true) || p.l(str, "Cookie", true) || p.l(str, "Proxy-Authorization", true) || p.l(str, "Set-Cookie", true);
    }

    public static /* synthetic */ r F(r rVar, m.e eVar) {
        f(rVar, eVar);
        return rVar;
    }

    public static final int G(char c2) {
        if ('0' <= c2 && c2 < ':') {
            return c2 - '0';
        }
        char c3 = 'a';
        if (!('a' <= c2 && c2 < 'g')) {
            c3 = 'A';
            if (!('A' <= c2 && c2 < 'G')) {
                return -1;
            }
        }
        return (c2 - c3) + 10;
    }

    public static final Charset H(n.d dVar, Charset charset) {
        Charset charset2;
        String str;
        i.e(dVar, "<this>");
        i.e(charset, "default");
        int iX = dVar.X(d);
        if (iX == -1) {
            return charset;
        }
        if (iX == 0) {
            charset2 = StandardCharsets.UTF_8;
            str = "UTF_8";
        } else if (iX == 1) {
            charset2 = StandardCharsets.UTF_16BE;
            str = "UTF_16BE";
        } else {
            if (iX != 2) {
                if (iX == 3) {
                    return l.d0.d.a.a();
                }
                if (iX == 4) {
                    return l.d0.d.a.b();
                }
                throw new AssertionError();
            }
            charset2 = StandardCharsets.UTF_16LE;
            str = "UTF_16LE";
        }
        i.d(charset2, str);
        return charset2;
    }

    public static final int I(n.d dVar) {
        i.e(dVar, "<this>");
        return b(dVar.readByte(), Utils.MAX_STRENGTH_VALUE) | (b(dVar.readByte(), Utils.MAX_STRENGTH_VALUE) << 16) | (b(dVar.readByte(), Utils.MAX_STRENGTH_VALUE) << 8);
    }

    public static final int J(n.b bVar, byte b2) throws EOFException {
        i.e(bVar, "<this>");
        int i2 = 0;
        while (!bVar.z() && bVar.d0(0L) == b2) {
            i2++;
            bVar.readByte();
        }
        return i2;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x005b A[PHI: r12
  0x005b: PHI (r12v6 boolean) = (r12v5 boolean), (r12v10 boolean) binds: [B:23:0x007a, B:13:0x0051] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Undo finally extract visitor
    java.lang.NullPointerException: Cannot invoke "Object.hashCode()" because "this.second" is null
    	at jadx.core.utils.Pair.hashCode(Pair.java:35)
    	at java.base/java.util.HashMap.hash(HashMap.java:338)
    	at java.base/java.util.HashMap.getNode(HashMap.java:568)
    	at java.base/java.util.HashMap.containsKey(HashMap.java:594)
    	at jadx.core.dex.visitors.finaly.traverser.state.TraverserGlobalCommonState.hasBlocksBeenCached(TraverserGlobalCommonState.java:35)
    	at jadx.core.dex.visitors.finaly.traverser.handlers.MergePathActivePathTraverserHandler.handle(MergePathActivePathTraverserHandler.java:174)
    	at jadx.core.dex.visitors.finaly.traverser.handlers.AbstractActivePathTraverserHandler.process(AbstractActivePathTraverserHandler.java:19)
    	at jadx.core.dex.visitors.finaly.traverser.TraverserController.processHandlerImplementations(TraverserController.java:43)
    	at jadx.core.dex.visitors.finaly.traverser.TraverserController.advance(TraverserController.java:156)
    	at jadx.core.dex.visitors.finaly.traverser.TraverserController.process(TraverserController.java:79)
    	at jadx.core.dex.visitors.finaly.MarkFinallyVisitor.findCommonInsns(MarkFinallyVisitor.java:404)
    	at jadx.core.dex.visitors.finaly.MarkFinallyVisitor.extractFinally(MarkFinallyVisitor.java:284)
    	at jadx.core.dex.visitors.finaly.MarkFinallyVisitor.processTryBlock(MarkFinallyVisitor.java:202)
    	at jadx.core.dex.visitors.finaly.MarkFinallyVisitor.visit(MarkFinallyVisitor.java:135)
     */
    public static final boolean K(x xVar, int i2, TimeUnit timeUnit) {
        boolean z;
        i.e(xVar, "<this>");
        i.e(timeUnit, "timeUnit");
        long jNanoTime = System.nanoTime();
        long jC = xVar.d().e() ? xVar.d().c() - jNanoTime : Long.MAX_VALUE;
        xVar.d().d(Math.min(jC, timeUnit.toNanos(i2)) + jNanoTime);
        try {
            n.b bVar = new n.b();
            while (xVar.I(bVar, 8192L) != -1) {
                bVar.Y();
            }
            z = true;
            if (jC == Long.MAX_VALUE) {
                xVar.d().a();
            } else {
                xVar.d().d(jNanoTime + jC);
            }
        } catch (InterruptedIOException unused) {
            z = false;
            if (jC != Long.MAX_VALUE) {
                xVar.d().d(jNanoTime + jC);
            }
        } catch (Throwable th) {
            y yVarD = xVar.d();
            if (jC == Long.MAX_VALUE) {
                yVarD.a();
            } else {
                yVarD.d(jNanoTime + jC);
            }
            throw th;
        }
        return z;
    }

    public static final ThreadFactory L(final String str, final boolean z) {
        i.e(str, "name");
        return new ThreadFactory() { // from class: m.h0.a
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                return d.M(str, z, runnable);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Thread M(String str, boolean z, Runnable runnable) {
        i.e(str, "$name");
        Thread thread = new Thread(runnable, str);
        thread.setDaemon(z);
        return thread;
    }

    public static final List<m.h0.k.c> N(u uVar) {
        i.e(uVar, "<this>");
        l.a0.f fVarI = l.a0.i.i(0, uVar.size());
        ArrayList arrayList = new ArrayList(n.o(fVarI, 10));
        Iterator<Integer> it = fVarI.iterator();
        while (it.hasNext()) {
            int iA = ((l.t.z) it).a();
            arrayList.add(new m.h0.k.c(uVar.c(iA), uVar.h(iA)));
        }
        return arrayList;
    }

    public static final u O(List<m.h0.k.c> list) {
        i.e(list, "<this>");
        u.a aVar = new u.a();
        for (m.h0.k.c cVar : list) {
            aVar.d(cVar.a().x(), cVar.b().x());
        }
        return aVar.e();
    }

    public static final String P(v vVar, boolean z) {
        String strI;
        i.e(vVar, "<this>");
        if (q.C(vVar.i(), ":", false, 2, null)) {
            strI = '[' + vVar.i() + ']';
        } else {
            strI = vVar.i();
        }
        if (!z && vVar.n() == v.f2312k.c(vVar.u())) {
            return strI;
        }
        return strI + ':' + vVar.n();
    }

    public static /* synthetic */ String Q(v vVar, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = false;
        }
        return P(vVar, z);
    }

    public static final <T> List<T> R(List<? extends T> list) {
        i.e(list, "<this>");
        List<T> listUnmodifiableList = Collections.unmodifiableList(l.t.u.R(list));
        i.d(listUnmodifiableList, "unmodifiableList(toMutableList())");
        return listUnmodifiableList;
    }

    public static final <K, V> Map<K, V> S(Map<K, ? extends V> map) {
        i.e(map, "<this>");
        if (map.isEmpty()) {
            return d0.d();
        }
        Map<K, V> mapUnmodifiableMap = Collections.unmodifiableMap(new LinkedHashMap(map));
        i.d(mapUnmodifiableMap, "{\n    Collections.unmodi…(LinkedHashMap(this))\n  }");
        return mapUnmodifiableMap;
    }

    public static final long T(String str, long j2) {
        i.e(str, "<this>");
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return j2;
        }
    }

    public static final int U(String str, int i2) {
        Long lValueOf;
        if (str == null) {
            lValueOf = null;
        } else {
            try {
                lValueOf = Long.valueOf(Long.parseLong(str));
            } catch (NumberFormatException unused) {
                return i2;
            }
        }
        if (lValueOf == null) {
            return i2;
        }
        long jLongValue = lValueOf.longValue();
        if (jLongValue > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (jLongValue < 0) {
            return 0;
        }
        return (int) jLongValue;
    }

    public static final String V(String str, int i2, int i3) {
        i.e(str, "<this>");
        int iW = w(str, i2, i3);
        String strSubstring = str.substring(iW, y(str, iW, i3));
        i.d(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public static /* synthetic */ String W(String str, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i2 = 0;
        }
        if ((i4 & 2) != 0) {
            i3 = str.length();
        }
        return V(str, i2, i3);
    }

    public static final Throwable X(Exception exc, List<? extends Exception> list) {
        i.e(exc, "<this>");
        i.e(list, "suppressed");
        if (list.size() > 1) {
            System.out.println(list);
        }
        Iterator<? extends Exception> it = list.iterator();
        while (it.hasNext()) {
            l.b.a(exc, it.next());
        }
        return exc;
    }

    public static final void Y(n.c cVar, int i2) {
        i.e(cVar, "<this>");
        cVar.A((i2 >>> 16) & Utils.MAX_STRENGTH_VALUE);
        cVar.A((i2 >>> 8) & Utils.MAX_STRENGTH_VALUE);
        cVar.A(i2 & Utils.MAX_STRENGTH_VALUE);
    }

    public static final <E> void a(List<E> list, E e2) {
        i.e(list, "<this>");
        if (list.contains(e2)) {
            return;
        }
        list.add(e2);
    }

    public static final int b(byte b2, int i2) {
        return b2 & i2;
    }

    public static final int c(short s, int i2) {
        return s & i2;
    }

    public static final long d(int i2, long j2) {
        return j2 & ((long) i2);
    }

    public static final r.b e(final r rVar) {
        i.e(rVar, "<this>");
        return new r.b() { // from class: m.h0.b
            @Override // m.r.b
            public final r a(m.e eVar) {
                r rVar2 = rVar;
                d.F(rVar2, eVar);
                return rVar2;
            }
        };
    }

    private static final r f(r rVar, m.e eVar) {
        i.e(rVar, "$this_asFactory");
        i.e(eVar, "it");
        return rVar;
    }

    public static final boolean g(String str) {
        i.e(str, "<this>");
        return f.a(str);
    }

    public static final boolean h(v vVar, v vVar2) {
        i.e(vVar, "<this>");
        i.e(vVar2, "other");
        return i.a(vVar.i(), vVar2.i()) && vVar.n() == vVar2.n() && i.a(vVar.u(), vVar2.u());
    }

    public static final void i(long j2, long j3, long j4) {
        if ((j3 | j4) < 0 || j3 > j2 || j2 - j3 < j4) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    public static final void j(Closeable closeable) {
        i.e(closeable, "<this>");
        try {
            closeable.close();
        } catch (RuntimeException e2) {
            throw e2;
        } catch (Exception unused) {
        }
    }

    public static final void k(Socket socket) {
        i.e(socket, "<this>");
        try {
            socket.close();
        } catch (AssertionError e2) {
            throw e2;
        } catch (RuntimeException e3) {
            if (!i.a(e3.getMessage(), "bio == null")) {
                throw e3;
            }
        } catch (Exception unused) {
        }
    }

    public static final String[] l(String[] strArr, String str) {
        i.e(strArr, "<this>");
        i.e(str, "value");
        Object[] objArrCopyOf = Arrays.copyOf(strArr, strArr.length + 1);
        i.d(objArrCopyOf, "copyOf(this, newSize)");
        String[] strArr2 = (String[]) objArrCopyOf;
        strArr2[h.n(strArr2)] = str;
        return strArr2;
    }

    public static final int m(String str, char c2, int i2, int i3) {
        i.e(str, "<this>");
        while (i2 < i3) {
            int i4 = i2 + 1;
            if (str.charAt(i2) == c2) {
                return i2;
            }
            i2 = i4;
        }
        return i3;
    }

    public static final int n(String str, String str2, int i2, int i3) {
        i.e(str, "<this>");
        i.e(str2, "delimiters");
        while (i2 < i3) {
            int i4 = i2 + 1;
            if (q.B(str2, str.charAt(i2), false, 2, null)) {
                return i2;
            }
            i2 = i4;
        }
        return i3;
    }

    public static /* synthetic */ int o(String str, char c2, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i2 = 0;
        }
        if ((i4 & 4) != 0) {
            i3 = str.length();
        }
        return m(str, c2, i2, i3);
    }

    public static final boolean p(x xVar, int i2, TimeUnit timeUnit) {
        i.e(xVar, "<this>");
        i.e(timeUnit, "timeUnit");
        try {
            return K(xVar, i2, timeUnit);
        } catch (IOException unused) {
            return false;
        }
    }

    public static final String q(String str, Object... objArr) {
        i.e(str, "format");
        i.e(objArr, "args");
        l.y.c.o oVar = l.y.c.o.a;
        Locale locale = Locale.US;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        String str2 = String.format(locale, str, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
        i.d(str2, "format(locale, format, *args)");
        return str2;
    }

    public static final boolean r(String[] strArr, String[] strArr2, Comparator<? super String> comparator) {
        i.e(strArr, "<this>");
        i.e(comparator, "comparator");
        if (!(strArr.length == 0) && strArr2 != null) {
            if (!(strArr2.length == 0)) {
                int length = strArr.length;
                int i2 = 0;
                while (i2 < length) {
                    String str = strArr[i2];
                    i2++;
                    Iterator itA = l.y.c.b.a(strArr2);
                    while (itA.hasNext()) {
                        if (comparator.compare(str, (String) itA.next()) == 0) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public static final long s(m.d0 d0Var) {
        i.e(d0Var, "<this>");
        String strB = d0Var.T().b("Content-Length");
        if (strB == null) {
            return -1L;
        }
        return T(strB, -1L);
    }

    @SafeVarargs
    public static final <T> List<T> t(T... tArr) {
        i.e(tArr, "elements");
        Object[] objArr = (Object[]) tArr.clone();
        List<T> listUnmodifiableList = Collections.unmodifiableList(m.i(Arrays.copyOf(objArr, objArr.length)));
        i.d(listUnmodifiableList, "unmodifiableList(listOf(*elements.clone()))");
        return listUnmodifiableList;
    }

    public static final int u(String[] strArr, String str, Comparator<String> comparator) {
        i.e(strArr, "<this>");
        i.e(str, "value");
        i.e(comparator, "comparator");
        int length = strArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (comparator.compare(strArr[i2], str) == 0) {
                return i2;
            }
        }
        return -1;
    }

    public static final int v(String str) {
        i.e(str, "<this>");
        int length = str.length();
        int i2 = 0;
        while (i2 < length) {
            int i3 = i2 + 1;
            char cCharAt = str.charAt(i2);
            if (i.g(cCharAt, 31) <= 0 || i.g(cCharAt, 127) >= 0) {
                return i2;
            }
            i2 = i3;
        }
        return -1;
    }

    public static final int w(String str, int i2, int i3) {
        i.e(str, "<this>");
        while (i2 < i3) {
            int i4 = i2 + 1;
            char cCharAt = str.charAt(i2);
            if (!((((cCharAt == '\t' || cCharAt == '\n') || cCharAt == '\f') || cCharAt == '\r') || cCharAt == ' ')) {
                return i2;
            }
            i2 = i4;
        }
        return i3;
    }

    public static /* synthetic */ int x(String str, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i2 = 0;
        }
        if ((i4 & 2) != 0) {
            i3 = str.length();
        }
        return w(str, i2, i3);
    }

    public static final int y(String str, int i2, int i3) {
        i.e(str, "<this>");
        int i4 = i3 - 1;
        if (i2 <= i4) {
            while (true) {
                int i5 = i4 - 1;
                char cCharAt = str.charAt(i4);
                if (!((((cCharAt == '\t' || cCharAt == '\n') || cCharAt == '\f') || cCharAt == '\r') || cCharAt == ' ')) {
                    return i4 + 1;
                }
                if (i4 != i2) {
                    i4 = i5;
                }
            }
        }
        return i2;
    }

    public static /* synthetic */ int z(String str, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i2 = 0;
        }
        if ((i4 & 2) != 0) {
            i3 = str.length();
        }
        return y(str, i2, i3);
    }
}
