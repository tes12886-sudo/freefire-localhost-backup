package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
public enum m3 implements b9 {
    UNKNOWN_COMPARISON_TYPE(0),
    LESS_THAN(1),
    GREATER_THAN(2),
    EQUAL(3),
    BETWEEN(4);

    private final int a;

    m3(int i2) {
        this.a = i2;
    }

    public static m3 a(int i2) {
        if (i2 == 0) {
            return UNKNOWN_COMPARISON_TYPE;
        }
        if (i2 == 1) {
            return LESS_THAN;
        }
        if (i2 == 2) {
            return GREATER_THAN;
        }
        if (i2 == 3) {
            return EQUAL;
        }
        if (i2 != 4) {
            return null;
        }
        return BETWEEN;
    }

    public static c9 c() {
        return l3.a;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "<" + m3.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.a + " name=" + name() + '>';
    }
}
