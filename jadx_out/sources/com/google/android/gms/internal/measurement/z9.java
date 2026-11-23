package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
final class z9 {
    private static final y9 a;
    private static final y9 b;

    static {
        y9 y9Var;
        try {
            y9Var = (y9) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            y9Var = null;
        }
        a = y9Var;
        b = new y9();
    }

    static y9 a() {
        return a;
    }

    static y9 b() {
        return b;
    }
}
