package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class w6 {
    public static q a(Object obj) {
        if (obj == null) {
            return q.y;
        }
        if (obj instanceof String) {
            return new u((String) obj);
        }
        if (obj instanceof Double) {
            return new i((Double) obj);
        }
        if (obj instanceof Long) {
            return new i(Double.valueOf(((Long) obj).doubleValue()));
        }
        if (obj instanceof Integer) {
            return new i(Double.valueOf(((Integer) obj).doubleValue()));
        }
        if (obj instanceof Boolean) {
            return new g((Boolean) obj);
        }
        throw new IllegalArgumentException("Invalid value type");
    }

    public static q b(o5 o5Var) {
        if (o5Var == null) {
            return q.x;
        }
        n5 n5Var = n5.UNKNOWN;
        int iOrdinal = o5Var.x().ordinal();
        if (iOrdinal == 0) {
            throw new IllegalArgumentException("Unknown type found. Cannot convert entity");
        }
        if (iOrdinal == 1) {
            return o5Var.A() ? new u(o5Var.B()) : q.E;
        }
        if (iOrdinal == 2) {
            return o5Var.E() ? new i(Double.valueOf(o5Var.G())) : new i(null);
        }
        if (iOrdinal == 3) {
            return o5Var.C() ? new g(Boolean.valueOf(o5Var.D())) : new g(null);
        }
        if (iOrdinal != 4) {
            String strValueOf = String.valueOf(o5Var);
            StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 16);
            sb.append("Invalid entity: ");
            sb.append(strValueOf);
            throw new IllegalStateException(sb.toString());
        }
        List<o5> listY = o5Var.y();
        ArrayList arrayList = new ArrayList();
        Iterator<o5> it = listY.iterator();
        while (it.hasNext()) {
            arrayList.add(b(it.next()));
        }
        return new r(o5Var.z(), arrayList);
    }
}
