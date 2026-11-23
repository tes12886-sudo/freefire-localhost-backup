package j.f.a;

/* JADX INFO: loaded from: classes.dex */
public enum a {
    VARINT(0),
    FIXED64(1),
    LENGTH_DELIMITED(2),
    FIXED32(5);

    final int a;

    /* JADX INFO: renamed from: j.f.a.a$a, reason: collision with other inner class name */
    static /* synthetic */ class C0251a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[a.values().length];
            a = iArr;
            try {
                iArr[a.VARINT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[a.FIXED32.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[a.FIXED64.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[a.LENGTH_DELIMITED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    a(int i2) {
        this.a = i2;
    }

    public e<?> a() {
        int i2 = C0251a.a[ordinal()];
        if (i2 == 1) {
            return e.e;
        }
        if (i2 == 2) {
            return e.d;
        }
        if (i2 == 3) {
            return e.f;
        }
        if (i2 == 4) {
            return e.f2143h;
        }
        throw new AssertionError();
    }
}
