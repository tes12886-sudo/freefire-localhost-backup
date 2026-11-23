package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class o9 extends q9 {
    private static final Class<?> c = Collections.unmodifiableList(Collections.emptyList()).getClass();

    /* synthetic */ o9(n9 n9Var) {
        super(null);
    }

    @Override // com.google.android.gms.internal.measurement.q9
    final void a(Object obj, long j2) {
        Object objUnmodifiableList;
        List list = (List) nb.s(obj, j2);
        if (list instanceof m9) {
            objUnmodifiableList = ((m9) list).a();
        } else {
            if (c.isAssignableFrom(list.getClass())) {
                return;
            }
            if ((list instanceof ka) && (list instanceof f9)) {
                f9 f9Var = (f9) list;
                if (f9Var.zza()) {
                    f9Var.zzb();
                    return;
                }
                return;
            }
            objUnmodifiableList = Collections.unmodifiableList(list);
        }
        nb.t(obj, j2, objUnmodifiableList);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0094 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:34:0x009c  */
    @Override // com.google.android.gms.internal.measurement.q9
    final <E> void b(Object obj, Object obj2, long j2) {
        List list;
        List list2;
        int size;
        List listK;
        List list3 = (List) nb.s(obj2, j2);
        int size2 = list3.size();
        List list4 = (List) nb.s(obj, j2);
        if (!list4.isEmpty()) {
            if (!c.isAssignableFrom(list4.getClass())) {
                if (list4 instanceof ib) {
                    l9 l9Var = new l9(list4.size() + size2);
                    l9Var.addAll(l9Var.size(), (ib) list4);
                    list = l9Var;
                } else {
                    boolean z = list4 instanceof ka;
                    list2 = list4;
                    if (z) {
                        boolean z2 = list4 instanceof f9;
                        list2 = list4;
                        if (z2) {
                            f9 f9Var = (f9) list4;
                            list2 = list4;
                            if (!f9Var.zza()) {
                                listK = f9Var.k(list4.size() + size2);
                            }
                        }
                    }
                }
                size = list2.size();
                int size3 = list3.size();
                if (size > 0 && size3 > 0) {
                    list2.addAll(list3);
                }
                if (size > 0) {
                    list3 = list2;
                }
                nb.t(obj, j2, list3);
            }
            ArrayList arrayList = new ArrayList(list4.size() + size2);
            arrayList.addAll(list4);
            list = arrayList;
            nb.t(obj, j2, list);
            list2 = list;
            size = list2.size();
            int size4 = list3.size();
            if (size > 0) {
                list2.addAll(list3);
            }
            if (size > 0) {
                list3 = list2;
            }
            nb.t(obj, j2, list3);
        }
        if (list4 instanceof m9) {
            listK = new l9(size2);
        } else {
            listK = ((list4 instanceof ka) && (list4 instanceof f9)) ? ((f9) list4).k(size2) : new ArrayList(size2);
        }
        nb.t(obj, j2, listK);
        list2 = listK;
        size = list2.size();
        int size5 = list3.size();
        if (size > 0) {
            list2.addAll(list3);
        }
        if (size > 0) {
            list3 = list2;
        }
        nb.t(obj, j2, list3);
    }
}
