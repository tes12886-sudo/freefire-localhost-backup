package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
public enum n5 implements b9 {
    UNKNOWN(0),
    STRING(1),
    NUMBER(2),
    BOOLEAN(3),
    STATEMENT(4);

    private final int a;

    n5(int i2) {
        this.a = i2;
    }

    public static n5 a(int i2) {
        if (i2 == 0) {
            return UNKNOWN;
        }
        if (i2 == 1) {
            return STRING;
        }
        if (i2 == 2) {
            return NUMBER;
        }
        if (i2 == 3) {
            return BOOLEAN;
        }
        if (i2 != 4) {
            return null;
        }
        return STATEMENT;
    }

    public static c9 c() {
        return m5.a;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "<" + n5.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.a + " name=" + name() + '>';
    }
}
