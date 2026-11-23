package m;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class u implements Iterable<l.l<? extends String, ? extends String>>, l.y.c.q.a {
    public static final b b = new b(null);
    private final String[] a;

    public static final class a {
        private final List<String> a = new ArrayList(20);

        public final a a(String str, String str2) {
            l.y.c.i.e(str, "name");
            l.y.c.i.e(str2, "value");
            b bVar = u.b;
            bVar.d(str);
            bVar.e(str2, str);
            d(str, str2);
            return this;
        }

        public final a b(u uVar) {
            l.y.c.i.e(uVar, "headers");
            int size = uVar.size();
            for (int i2 = 0; i2 < size; i2++) {
                d(uVar.c(i2), uVar.h(i2));
            }
            return this;
        }

        public final a c(String str) {
            l.y.c.i.e(str, "line");
            int iM = l.d0.q.M(str, ':', 1, false, 4, null);
            if (iM != -1) {
                String strSubstring = str.substring(0, iM);
                l.y.c.i.d(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                String strSubstring2 = str.substring(iM + 1);
                l.y.c.i.d(strSubstring2, "this as java.lang.String).substring(startIndex)");
                d(strSubstring, strSubstring2);
            } else {
                if (str.charAt(0) == ':') {
                    str = str.substring(1);
                    l.y.c.i.d(str, "this as java.lang.String).substring(startIndex)");
                }
                d("", str);
            }
            return this;
        }

        public final a d(String str, String str2) {
            l.y.c.i.e(str, "name");
            l.y.c.i.e(str2, "value");
            f().add(str);
            f().add(l.d0.q.u0(str2).toString());
            return this;
        }

        public final u e() {
            Object[] array = this.a.toArray(new String[0]);
            if (array != null) {
                return new u((String[]) array, null);
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }

        public final List<String> f() {
            return this.a;
        }

        public final a g(String str) {
            l.y.c.i.e(str, "name");
            int i2 = 0;
            while (i2 < f().size()) {
                if (l.d0.p.l(str, f().get(i2), true)) {
                    f().remove(i2);
                    f().remove(i2);
                    i2 -= 2;
                }
                i2 += 2;
            }
            return this;
        }

        public final a h(String str, String str2) {
            l.y.c.i.e(str, "name");
            l.y.c.i.e(str2, "value");
            b bVar = u.b;
            bVar.d(str);
            bVar.e(str2, str);
            g(str);
            d(str, str2);
            return this;
        }
    }

    public static final class b {
        private b() {
        }

        public /* synthetic */ b(l.y.c.f fVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void d(String str) {
            if (!(str.length() > 0)) {
                throw new IllegalArgumentException("name is empty".toString());
            }
            int length = str.length();
            int i2 = 0;
            while (i2 < length) {
                int i3 = i2 + 1;
                char cCharAt = str.charAt(i2);
                if (!('!' <= cCharAt && cCharAt < 127)) {
                    throw new IllegalArgumentException(m.h0.d.q("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(cCharAt), Integer.valueOf(i2), str).toString());
                }
                i2 = i3;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Code duplicated, block: B:15:0x0023  */
        public final void e(String str, String str2) {
            boolean z;
            int length = str.length();
            int i2 = 0;
            while (i2 < length) {
                int i3 = i2 + 1;
                char cCharAt = str.charAt(i2);
                if (cCharAt == '\t') {
                    z = true;
                } else {
                    if (' ' <= cCharAt && cCharAt < 127) {
                        z = true;
                    } else {
                        z = false;
                    }
                }
                if (!z) {
                    throw new IllegalArgumentException(l.y.c.i.k(m.h0.d.q("Unexpected char %#04x at %d in %s value", Integer.valueOf(cCharAt), Integer.valueOf(i2), str2), m.h0.d.D(str2) ? "" : l.y.c.i.k(": ", str)).toString());
                }
                i2 = i3;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String f(String[] strArr, String str) {
            int length = strArr.length - 2;
            int iB = l.w.c.b(length, 0, -2);
            if (iB > length) {
                return null;
            }
            while (true) {
                int i2 = length - 2;
                if (l.d0.p.l(str, strArr[length], true)) {
                    return strArr[length + 1];
                }
                if (length == iB) {
                    return null;
                }
                length = i2;
            }
        }

        public final u g(String... strArr) {
            l.y.c.i.e(strArr, "namesAndValues");
            int i2 = 0;
            if (!(strArr.length % 2 == 0)) {
                throw new IllegalArgumentException("Expected alternating header names and values".toString());
            }
            String[] strArr2 = (String[]) strArr.clone();
            int length = strArr2.length;
            int i3 = 0;
            while (i3 < length) {
                int i4 = i3 + 1;
                if (!(strArr2[i3] != null)) {
                    throw new IllegalArgumentException("Headers cannot be null".toString());
                }
                strArr2[i3] = l.d0.q.u0(strArr2[i3]).toString();
                i3 = i4;
            }
            int iB = l.w.c.b(0, strArr2.length - 1, 2);
            if (iB >= 0) {
                while (true) {
                    int i5 = i2 + 2;
                    String str = strArr2[i2];
                    String str2 = strArr2[i2 + 1];
                    d(str);
                    e(str2, str);
                    if (i2 == iB) {
                        break;
                    }
                    i2 = i5;
                }
            }
            return new u(strArr2, null);
        }
    }

    private u(String[] strArr) {
        this.a = strArr;
    }

    public /* synthetic */ u(String[] strArr, l.y.c.f fVar) {
        this(strArr);
    }

    public static final u f(String... strArr) {
        return b.g(strArr);
    }

    public final String b(String str) {
        l.y.c.i.e(str, "name");
        return b.f(this.a, str);
    }

    public final String c(int i2) {
        return this.a[i2 * 2];
    }

    public final a d() {
        a aVar = new a();
        l.t.r.s(aVar.f(), this.a);
        return aVar;
    }

    public boolean equals(Object obj) {
        return (obj instanceof u) && Arrays.equals(this.a, ((u) obj).a);
    }

    public final String h(int i2) {
        return this.a[(i2 * 2) + 1];
    }

    public int hashCode() {
        return Arrays.hashCode(this.a);
    }

    @Override // java.lang.Iterable
    public Iterator<l.l<? extends String, ? extends String>> iterator() {
        int size = size();
        l.l[] lVarArr = new l.l[size];
        for (int i2 = 0; i2 < size; i2++) {
            lVarArr[i2] = l.p.a(c(i2), h(i2));
        }
        return l.y.c.b.a(lVarArr);
    }

    public final List<String> j(String str) {
        l.y.c.i.e(str, "name");
        int size = size();
        ArrayList arrayList = null;
        int i2 = 0;
        while (i2 < size) {
            int i3 = i2 + 1;
            if (l.d0.p.l(str, c(i2), true)) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(h(i2));
            }
            i2 = i3;
        }
        if (arrayList == null) {
            return l.t.m.g();
        }
        List<String> listUnmodifiableList = Collections.unmodifiableList(arrayList);
        l.y.c.i.d(listUnmodifiableList, "{\n      Collections.unmodifiableList(result)\n    }");
        return listUnmodifiableList;
    }

    public final int size() {
        return this.a.length / 2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        int size = size();
        int i2 = 0;
        while (i2 < size) {
            int i3 = i2 + 1;
            String strC = c(i2);
            String strH = h(i2);
            sb.append(strC);
            sb.append(": ");
            if (m.h0.d.D(strC)) {
                strH = "██";
            }
            sb.append(strH);
            sb.append("\n");
            i2 = i3;
        }
        String string = sb.toString();
        l.y.c.i.d(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
}
