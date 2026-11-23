package com.google.android.gms.internal.measurement;

import java.io.Serializable;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes.dex */
public final class c7 {
    public static <T> y6<T> a(y6<T> y6Var) {
        if ((y6Var instanceof a7) || (y6Var instanceof z6)) {
            return y6Var;
        }
        return y6Var instanceof Serializable ? new z6(y6Var) : new a7(y6Var);
    }

    public static <T> y6<T> b(@NullableDecl T t) {
        return new b7(t);
    }
}
