package l.t;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes.dex */
public class u extends t {

    /* JADX INFO: Add missing generic type declarations: [T] */
    public static final class a<T> implements l.c0.c<T> {
        final /* synthetic */ Iterable a;

        public a(Iterable iterable) {
            this.a = iterable;
        }

        @Override // l.c0.c
        public Iterator<T> iterator() {
            return this.a.iterator();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    static final class b<T> extends l.y.c.j implements l.y.b.l<Integer, T> {
        final /* synthetic */ int a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(int i2) {
            super(1);
            this.a = i2;
        }

        @Override // l.y.b.l
        public /* bridge */ /* synthetic */ Object c(Integer num) {
            d(num.intValue());
            throw null;
        }

        public final T d(int i2) {
            throw new IndexOutOfBoundsException("Collection doesn't contain element at index " + this.a + '.');
        }
    }

    public static final <T> int A(Iterable<? extends T> iterable, T t) {
        l.y.c.i.e(iterable, "<this>");
        if (iterable instanceof List) {
            return ((List) iterable).indexOf(t);
        }
        int i2 = 0;
        for (T t2 : iterable) {
            if (i2 < 0) {
                k.n();
                throw null;
            }
            if (l.y.c.i.a(t, t2)) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    public static final <T, A extends Appendable> A B(Iterable<? extends T> iterable, A a2, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i2, CharSequence charSequence4, l.y.b.l<? super T, ? extends CharSequence> lVar) throws IOException {
        l.y.c.i.e(iterable, "<this>");
        l.y.c.i.e(a2, "buffer");
        l.y.c.i.e(charSequence, "separator");
        l.y.c.i.e(charSequence2, "prefix");
        l.y.c.i.e(charSequence3, "postfix");
        l.y.c.i.e(charSequence4, "truncated");
        a2.append(charSequence2);
        int i3 = 0;
        for (T t : iterable) {
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

    public static /* synthetic */ Appendable C(Iterable iterable, Appendable appendable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i2, CharSequence charSequence4, l.y.b.l lVar, int i3, Object obj) throws IOException {
        B(iterable, appendable, (i3 & 2) != 0 ? ", " : charSequence, (i3 & 4) != 0 ? "" : charSequence2, (i3 & 8) == 0 ? charSequence3 : "", (i3 & 16) != 0 ? -1 : i2, (i3 & 32) != 0 ? "..." : charSequence4, (i3 & 64) != 0 ? null : lVar);
        return appendable;
    }

    public static final <T> String D(Iterable<? extends T> iterable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i2, CharSequence charSequence4, l.y.b.l<? super T, ? extends CharSequence> lVar) throws IOException {
        l.y.c.i.e(iterable, "<this>");
        l.y.c.i.e(charSequence, "separator");
        l.y.c.i.e(charSequence2, "prefix");
        l.y.c.i.e(charSequence3, "postfix");
        l.y.c.i.e(charSequence4, "truncated");
        StringBuilder sb = new StringBuilder();
        B(iterable, sb, charSequence, charSequence2, charSequence3, i2, charSequence4, lVar);
        String string = sb.toString();
        l.y.c.i.d(string, "joinTo(StringBuilder(), …ed, transform).toString()");
        return string;
    }

    public static /* synthetic */ String E(Iterable iterable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i2, CharSequence charSequence4, l.y.b.l lVar, int i3, Object obj) {
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
        return D(iterable, charSequence, charSequence5, charSequence6, i4, charSequence7, lVar);
    }

    public static <T> T F(List<? extends T> list) {
        l.y.c.i.e(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(m.h(list));
    }

    public static <T> List<T> G(Iterable<? extends T> iterable, Iterable<? extends T> iterable2) {
        l.y.c.i.e(iterable, "<this>");
        l.y.c.i.e(iterable2, "elements");
        if (iterable instanceof Collection) {
            return H((Collection) iterable, iterable2);
        }
        ArrayList arrayList = new ArrayList();
        r.r(arrayList, iterable);
        r.r(arrayList, iterable2);
        return arrayList;
    }

    public static <T> List<T> H(Collection<? extends T> collection, Iterable<? extends T> iterable) {
        l.y.c.i.e(collection, "<this>");
        l.y.c.i.e(iterable, "elements");
        if (!(iterable instanceof Collection)) {
            ArrayList arrayList = new ArrayList(collection);
            r.r(arrayList, iterable);
            return arrayList;
        }
        Collection collection2 = (Collection) iterable;
        ArrayList arrayList2 = new ArrayList(collection.size() + collection2.size());
        arrayList2.addAll(collection);
        arrayList2.addAll(collection2);
        return arrayList2;
    }

    public static <T> List<T> I(Collection<? extends T> collection, T t) {
        l.y.c.i.e(collection, "<this>");
        ArrayList arrayList = new ArrayList(collection.size() + 1);
        arrayList.addAll(collection);
        arrayList.add(t);
        return arrayList;
    }

    public static <T> T J(Collection<? extends T> collection, l.z.c cVar) {
        l.y.c.i.e(collection, "<this>");
        l.y.c.i.e(cVar, "random");
        if (collection.isEmpty()) {
            throw new NoSuchElementException("Collection is empty.");
        }
        return (T) w(collection, cVar.d(collection.size()));
    }

    public static <T> T K(Iterable<? extends T> iterable) {
        l.y.c.i.e(iterable, "<this>");
        if (iterable instanceof List) {
            return (T) L((List) iterable);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException("Collection is empty.");
        }
        T next = it.next();
        if (it.hasNext()) {
            throw new IllegalArgumentException("Collection has more than one element.");
        }
        return next;
    }

    public static final <T> T L(List<? extends T> list) {
        l.y.c.i.e(list, "<this>");
        int size = list.size();
        if (size == 0) {
            throw new NoSuchElementException("List is empty.");
        }
        if (size == 1) {
            return list.get(0);
        }
        throw new IllegalArgumentException("List has more than one element.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> List<T> M(Iterable<? extends T> iterable, Comparator<? super T> comparator) {
        l.y.c.i.e(iterable, "<this>");
        l.y.c.i.e(comparator, "comparator");
        if (!(iterable instanceof Collection)) {
            List<T> listQ = Q(iterable);
            q.q(listQ, comparator);
            return listQ;
        }
        Collection collection = (Collection) iterable;
        if (collection.size() <= 1) {
            return P(iterable);
        }
        Object[] array = collection.toArray(new Object[0]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
        g.i(array, comparator);
        return g.b(array);
    }

    public static final <T> List<T> N(Iterable<? extends T> iterable, int i2) {
        l.y.c.i.e(iterable, "<this>");
        int i3 = 0;
        if (!(i2 >= 0)) {
            throw new IllegalArgumentException(("Requested element count " + i2 + " is less than zero.").toString());
        }
        if (i2 == 0) {
            return m.g();
        }
        if (iterable instanceof Collection) {
            if (i2 >= ((Collection) iterable).size()) {
                return P(iterable);
            }
            if (i2 == 1) {
                return l.b(y(iterable));
            }
        }
        ArrayList arrayList = new ArrayList(i2);
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
            i3++;
            if (i3 == i2) {
                break;
            }
        }
        return m.l(arrayList);
    }

    public static final <T, C extends Collection<? super T>> C O(Iterable<? extends T> iterable, C c) {
        l.y.c.i.e(iterable, "<this>");
        l.y.c.i.e(c, "destination");
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            c.add(it.next());
        }
        return c;
    }

    public static <T> List<T> P(Iterable<? extends T> iterable) {
        l.y.c.i.e(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            return m.l(Q(iterable));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return m.g();
        }
        if (size != 1) {
            return R(collection);
        }
        return l.b(iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next());
    }

    public static final <T> List<T> Q(Iterable<? extends T> iterable) {
        l.y.c.i.e(iterable, "<this>");
        if (iterable instanceof Collection) {
            return R((Collection) iterable);
        }
        ArrayList arrayList = new ArrayList();
        O(iterable, arrayList);
        return arrayList;
    }

    public static <T> List<T> R(Collection<? extends T> collection) {
        l.y.c.i.e(collection, "<this>");
        return new ArrayList(collection);
    }

    public static <T> Set<T> S(Iterable<? extends T> iterable) {
        l.y.c.i.e(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            O(iterable, linkedHashSet);
            return h0.e(linkedHashSet);
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return h0.b();
        }
        if (size == 1) {
            return g0.a(iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next());
        }
        LinkedHashSet linkedHashSet2 = new LinkedHashSet(c0.a(collection.size()));
        O(iterable, linkedHashSet2);
        return linkedHashSet2;
    }

    public static <T, R> List<l.l<T, R>> T(Iterable<? extends T> iterable, Iterable<? extends R> iterable2) {
        l.y.c.i.e(iterable, "<this>");
        l.y.c.i.e(iterable2, "other");
        Iterator<? extends T> it = iterable.iterator();
        Iterator<? extends R> it2 = iterable2.iterator();
        ArrayList arrayList = new ArrayList(Math.min(n.o(iterable, 10), n.o(iterable2, 10)));
        while (it.hasNext() && it2.hasNext()) {
            arrayList.add(l.p.a(it.next(), it2.next()));
        }
        return arrayList;
    }

    public static <T> l.c0.c<T> t(Iterable<? extends T> iterable) {
        l.y.c.i.e(iterable, "<this>");
        return new a(iterable);
    }

    public static <T> boolean u(Iterable<? extends T> iterable, T t) {
        l.y.c.i.e(iterable, "<this>");
        if (iterable instanceof Collection) {
            return ((Collection) iterable).contains(t);
        }
        return A(iterable, t) >= 0;
    }

    public static <T> List<T> v(List<? extends T> list, int i2) {
        l.y.c.i.e(list, "<this>");
        if (i2 >= 0) {
            return N(list, l.a0.i.b(list.size() - i2, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i2 + " is less than zero.").toString());
    }

    public static final <T> T w(Iterable<? extends T> iterable, int i2) {
        l.y.c.i.e(iterable, "<this>");
        return iterable instanceof List ? (T) ((List) iterable).get(i2) : (T) x(iterable, i2, new b(i2));
    }

    public static final <T> T x(Iterable<? extends T> iterable, int i2, l.y.b.l<? super Integer, ? extends T> lVar) {
        l.y.c.i.e(iterable, "<this>");
        l.y.c.i.e(lVar, "defaultValue");
        if (iterable instanceof List) {
            List list = (List) iterable;
            return (i2 < 0 || i2 > m.h(list)) ? lVar.c(Integer.valueOf(i2)) : (T) list.get(i2);
        }
        if (i2 >= 0) {
            int i3 = 0;
            for (T t : iterable) {
                int i4 = i3 + 1;
                if (i2 == i3) {
                    return t;
                }
                i3 = i4;
            }
        }
        return lVar.c(Integer.valueOf(i2));
    }

    public static final <T> T y(Iterable<? extends T> iterable) {
        l.y.c.i.e(iterable, "<this>");
        if (iterable instanceof List) {
            return (T) k.z((List) iterable);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    public static <T> T z(List<? extends T> list) {
        l.y.c.i.e(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(0);
    }
}
