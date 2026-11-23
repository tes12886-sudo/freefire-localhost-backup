package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
final class o8 {
    private static final m8<?> a = new n8();
    private static final m8<?> b;

    static {
        m8<?> m8Var;
        try {
            m8Var = (m8) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            m8Var = null;
        }
        b = m8Var;
    }

    static m8<?> a() {
        return a;
    }

    static m8<?> b() {
        m8<?> m8Var = b;
        if (m8Var != null) {
            return m8Var;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }
}
