package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
final class u8 implements ba {
    private static final u8 a = new u8();

    private u8() {
    }

    public static u8 c() {
        return a;
    }

    @Override // com.google.android.gms.internal.measurement.ba
    public final boolean a(Class<?> cls) {
        return z8.class.isAssignableFrom(cls);
    }

    @Override // com.google.android.gms.internal.measurement.ba
    public final aa b(Class<?> cls) {
        if (!z8.class.isAssignableFrom(cls)) {
            String strValueOf = String.valueOf(cls.getName());
            throw new IllegalArgumentException(strValueOf.length() != 0 ? "Unsupported message type: ".concat(strValueOf) : new String("Unsupported message type: "));
        }
        try {
            return (aa) z8.t(cls.asSubclass(z8.class)).w(3, null, null);
        } catch (Exception e) {
            String strValueOf2 = String.valueOf(cls.getName());
            throw new RuntimeException(strValueOf2.length() != 0 ? "Unable to get message info for ".concat(strValueOf2) : new String("Unable to get message info for "), e);
        }
    }
}
