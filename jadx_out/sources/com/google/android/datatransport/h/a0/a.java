package com.google.android.datatransport.h.a0;

import android.util.SparseArray;
import com.google.android.datatransport.d;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class a {
    private static SparseArray<d> a = new SparseArray<>();
    private static HashMap<d, Integer> b;

    static {
        HashMap<d, Integer> map = new HashMap<>();
        b = map;
        map.put(d.DEFAULT, 0);
        b.put(d.VERY_LOW, 1);
        b.put(d.HIGHEST, 2);
        for (d dVar : b.keySet()) {
            a.append(b.get(dVar).intValue(), dVar);
        }
    }

    public static int a(d dVar) {
        Integer num = b.get(dVar);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("PriorityMapping is missing known Priority value " + dVar);
    }

    public static d b(int i2) {
        d dVar = a.get(i2);
        if (dVar != null) {
            return dVar;
        }
        throw new IllegalArgumentException("Unknown Priority for value " + i2);
    }
}
