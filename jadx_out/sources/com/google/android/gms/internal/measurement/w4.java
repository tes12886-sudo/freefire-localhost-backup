package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
public enum w4 implements b9 {
    RADS(1),
    PROVISIONING(2);

    private final int a;

    w4(int i2) {
        this.a = i2;
    }

    public static w4 a(int i2) {
        if (i2 == 1) {
            return RADS;
        }
        if (i2 != 2) {
            return null;
        }
        return PROVISIONING;
    }

    public static c9 c() {
        return u4.a;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "<" + w4.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.a + " name=" + name() + '>';
    }
}
