package l.v.d;

import l.y.c.i;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes.dex */
public class c {
    /* JADX WARN: Multi-variable type inference failed */
    public static <T> l.v.a<T> a(l.v.a<? super T> aVar) {
        l.v.a<T> aVar2;
        i.e(aVar, "<this>");
        l.v.e.a.c cVar = aVar instanceof l.v.e.a.c ? (l.v.e.a.c) aVar : null;
        return (cVar == null || (aVar2 = (l.v.a<T>) cVar.f()) == null) ? aVar : aVar2;
    }
}
