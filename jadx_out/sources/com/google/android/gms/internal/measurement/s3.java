package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
public enum s3 implements b9 {
    UNKNOWN_MATCH_TYPE(0),
    REGEXP(1),
    BEGINS_WITH(2),
    ENDS_WITH(3),
    PARTIAL(4),
    EXACT(5),
    IN_LIST(6);

    private final int a;

    s3(int i2) {
        this.a = i2;
    }

    public static s3 a(int i2) {
        switch (i2) {
            case 0:
                return UNKNOWN_MATCH_TYPE;
            case 1:
                return REGEXP;
            case 2:
                return BEGINS_WITH;
            case 3:
                return ENDS_WITH;
            case 4:
                return PARTIAL;
            case 5:
                return EXACT;
            case 6:
                return IN_LIST;
            default:
                return null;
        }
    }

    public static c9 c() {
        return r3.a;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "<" + s3.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.a + " name=" + name() + '>';
    }
}
