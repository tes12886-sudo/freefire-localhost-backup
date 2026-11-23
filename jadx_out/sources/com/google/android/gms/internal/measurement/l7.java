package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.k7;
import com.google.android.gms.internal.measurement.l7;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class l7<MessageType extends l7<MessageType, BuilderType>, BuilderType extends k7<MessageType, BuilderType>> implements da {
    protected int zzb = 0;

    /* JADX WARN: Multi-variable type inference failed */
    protected static <T> void j(Iterable<T> iterable, List<? super T> list) {
        g9.a(iterable);
        if (iterable instanceof m9) {
            List<?> listE = ((m9) iterable).e();
            m9 m9Var = (m9) list;
            int size = list.size();
            for (Object obj : listE) {
                if (obj == null) {
                    int size2 = m9Var.size();
                    StringBuilder sb = new StringBuilder(37);
                    sb.append("Element at index ");
                    sb.append(size2 - size);
                    sb.append(" is null.");
                    String string = sb.toString();
                    int size3 = m9Var.size();
                    while (true) {
                        size3--;
                        if (size3 < size) {
                            throw new NullPointerException(string);
                        }
                        m9Var.remove(size3);
                    }
                } else if (obj instanceof z7) {
                    m9Var.i((z7) obj);
                } else {
                    m9Var.add((String) obj);
                }
            }
            return;
        }
        if (iterable instanceof ka) {
            list.addAll(iterable);
            return;
        }
        if ((list instanceof ArrayList) && (iterable instanceof Collection)) {
            ((ArrayList) list).ensureCapacity(list.size() + iterable.size());
        }
        int size4 = list.size();
        for (T t : iterable) {
            if (t == null) {
                int size5 = list.size();
                StringBuilder sb2 = new StringBuilder(37);
                sb2.append("Element at index ");
                sb2.append(size5 - size4);
                sb2.append(" is null.");
                String string2 = sb2.toString();
                int size6 = list.size();
                while (true) {
                    size6--;
                    if (size6 < size4) {
                        throw new NullPointerException(string2);
                    }
                    list.remove(size6);
                }
            } else {
                list.add(t);
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.da
    public final z7 a() {
        try {
            int iD = d();
            z7 z7Var = z7.b;
            byte[] bArr = new byte[iD];
            g8 g8VarX = g8.x(bArr);
            g(g8VarX);
            g8VarX.c();
            return new y7(bArr);
        } catch (IOException e) {
            String name = getClass().getName();
            StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 72);
            sb.append("Serializing ");
            sb.append(name);
            sb.append(" to a ByteString threw an IOException (should never happen).");
            throw new RuntimeException(sb.toString(), e);
        }
    }

    public final byte[] b() {
        try {
            byte[] bArr = new byte[d()];
            g8 g8VarX = g8.x(bArr);
            g(g8VarX);
            g8VarX.c();
            return bArr;
        } catch (IOException e) {
            String name = getClass().getName();
            StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 72);
            sb.append("Serializing ");
            sb.append(name);
            sb.append(" to a byte array threw an IOException (should never happen).");
            throw new RuntimeException(sb.toString(), e);
        }
    }

    int c() {
        throw null;
    }

    void f(int i2) {
        throw null;
    }
}
