package l.d0;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes.dex */
public class i extends h {

    static final class a extends l.y.c.j implements l.y.b.l<String, String> {
        public static final a a = new a();

        a() {
            super(1);
        }

        @Override // l.y.b.l
        public /* bridge */ /* synthetic */ String c(String str) {
            String str2 = str;
            d(str2);
            return str2;
        }

        public final String d(String str) {
            l.y.c.i.e(str, "line");
            return str;
        }
    }

    static final class b extends l.y.c.j implements l.y.b.l<String, String> {
        final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str) {
            super(1);
            this.a = str;
        }

        @Override // l.y.b.l
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final String c(String str) {
            l.y.c.i.e(str, "line");
            return this.a + str;
        }
    }

    private static final l.y.b.l<String, String> b(String str) {
        return str.length() == 0 ? a.a : new b(str);
    }

    public static final String c(String str, String str2, String str3) throws IOException {
        int i2;
        l.y.c.i.e(str, "<this>");
        l.y.c.i.e(str2, "newIndent");
        l.y.c.i.e(str3, "marginPrefix");
        if (!(!p.m(str3))) {
            throw new IllegalArgumentException("marginPrefix must be non-blank string.".toString());
        }
        List<String> listV = q.V(str);
        int length = str.length() + (str2.length() * listV.size());
        l.y.b.l<String, String> lVarB = b(str2);
        int iH = l.t.m.h(listV);
        ArrayList arrayList = new ArrayList();
        int i3 = 0;
        for (Object obj : listV) {
            int i4 = i3 + 1;
            String strC = null;
            if (i3 < 0) {
                l.t.k.n();
                throw null;
            }
            String str4 = (String) obj;
            if ((i3 != 0 && i3 != iH) || !p.m(str4)) {
                int length2 = str4.length();
                int i5 = 0;
                while (true) {
                    if (i5 >= length2) {
                        i2 = -1;
                        break;
                    }
                    if (!l.d0.b.c(str4.charAt(i5))) {
                        i2 = i5;
                        break;
                    }
                    i5++;
                }
                if (i2 != -1) {
                    int i6 = i2;
                    if (p.w(str4, str3, i2, false, 4, null)) {
                        strC = str4.substring(i6 + str3.length());
                        l.y.c.i.d(strC, "this as java.lang.String).substring(startIndex)");
                    }
                }
                if (strC == null || (strC = lVarB.c(strC)) == null) {
                    strC = str4;
                }
            }
            if (strC != null) {
                arrayList.add(strC);
            }
            i3 = i4;
        }
        StringBuilder sb = new StringBuilder(length);
        l.t.k.C(arrayList, sb, "\n", null, null, 0, null, null, 124, null);
        String string = sb.toString();
        l.y.c.i.d(string, "mapIndexedNotNull { inde…\"\\n\")\n        .toString()");
        return string;
    }

    public static final String d(String str, String str2) {
        l.y.c.i.e(str, "<this>");
        l.y.c.i.e(str2, "marginPrefix");
        return c(str, "", str2);
    }

    public static /* synthetic */ String e(String str, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str2 = "|";
        }
        return d(str, str2);
    }
}
