package l.c0;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import l.t.m;
import l.y.b.l;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes.dex */
public class i extends h {

    /* JADX INFO: Add missing generic type declarations: [T] */
    public static final class a<T> implements Iterable<T>, l.y.c.q.a {
        final /* synthetic */ c a;

        public a(c cVar) {
            this.a = cVar;
        }

        @Override // java.lang.Iterable
        public Iterator<T> iterator() {
            return this.a.iterator();
        }
    }

    public static <T> Iterable<T> a(c<? extends T> cVar) {
        l.y.c.i.e(cVar, "<this>");
        return new a(cVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> c<T> b(c<? extends T> cVar, int i2) {
        l.y.c.i.e(cVar, "<this>");
        if (i2 >= 0) {
            if (i2 == 0) {
                return cVar;
            }
            return cVar instanceof b ? ((b) cVar).a(i2) : new l.c0.a(cVar, i2);
        }
        throw new IllegalArgumentException(("Requested element count " + i2 + " is less than zero.").toString());
    }

    public static final <T, A extends Appendable> A c(c<? extends T> cVar, A a2, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i2, CharSequence charSequence4, l<? super T, ? extends CharSequence> lVar) throws IOException {
        l.y.c.i.e(cVar, "<this>");
        l.y.c.i.e(a2, "buffer");
        l.y.c.i.e(charSequence, "separator");
        l.y.c.i.e(charSequence2, "prefix");
        l.y.c.i.e(charSequence3, "postfix");
        l.y.c.i.e(charSequence4, "truncated");
        a2.append(charSequence2);
        int i3 = 0;
        for (T t : cVar) {
            i3++;
            if (i3 > 1) {
                a2.append(charSequence);
            }
            if (i2 >= 0 && i3 > i2) {
                break;
            }
            l.d0.h.a(a2, t, lVar);
        }
        if (i2 >= 0 && i3 > i2) {
            a2.append(charSequence4);
        }
        a2.append(charSequence3);
        return a2;
    }

    public static final <T> String d(c<? extends T> cVar, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i2, CharSequence charSequence4, l<? super T, ? extends CharSequence> lVar) throws IOException {
        l.y.c.i.e(cVar, "<this>");
        l.y.c.i.e(charSequence, "separator");
        l.y.c.i.e(charSequence2, "prefix");
        l.y.c.i.e(charSequence3, "postfix");
        l.y.c.i.e(charSequence4, "truncated");
        StringBuilder sb = new StringBuilder();
        c(cVar, sb, charSequence, charSequence2, charSequence3, i2, charSequence4, lVar);
        String string = sb.toString();
        l.y.c.i.d(string, "joinTo(StringBuilder(), …ed, transform).toString()");
        return string;
    }

    public static /* synthetic */ String e(c cVar, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i2, CharSequence charSequence4, l lVar, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence5 = (i3 & 2) != 0 ? "" : charSequence2;
        CharSequence charSequence6 = (i3 & 4) == 0 ? charSequence3 : "";
        int i4 = (i3 & 8) != 0 ? -1 : i2;
        if ((i3 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence7 = charSequence4;
        if ((i3 & 32) != 0) {
            lVar = null;
        }
        return d(cVar, charSequence, charSequence5, charSequence6, i4, charSequence7, lVar);
    }

    public static <T, R> c<R> f(c<? extends T> cVar, l<? super T, ? extends R> lVar) {
        l.y.c.i.e(cVar, "<this>");
        l.y.c.i.e(lVar, "transform");
        return new j(cVar, lVar);
    }

    public static final <T, C extends Collection<? super T>> C g(c<? extends T> cVar, C c) {
        l.y.c.i.e(cVar, "<this>");
        l.y.c.i.e(c, "destination");
        Iterator<? extends T> it = cVar.iterator();
        while (it.hasNext()) {
            c.add(it.next());
        }
        return c;
    }

    public static <T> List<T> h(c<? extends T> cVar) {
        l.y.c.i.e(cVar, "<this>");
        return m.l(i(cVar));
    }

    public static final <T> List<T> i(c<? extends T> cVar) {
        l.y.c.i.e(cVar, "<this>");
        ArrayList arrayList = new ArrayList();
        g(cVar, arrayList);
        return arrayList;
    }
}
