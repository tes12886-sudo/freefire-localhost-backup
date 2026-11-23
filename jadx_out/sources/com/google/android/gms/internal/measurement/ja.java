package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
final class ja {
    private static final ia a;
    private static final ia b;

    static {
        ia iaVar;
        try {
            iaVar = (ia) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            iaVar = null;
        }
        a = iaVar;
        b = new ia();
    }

    static ia a() {
        return a;
    }

    static ia b() {
        return b;
    }
}
