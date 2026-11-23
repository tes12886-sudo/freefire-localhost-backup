package l.a0;

/* JADX WARN: Unexpected interfaces in signature: [java.lang.Object<java.lang.Integer>] */
/* JADX INFO: loaded from: classes.dex */
public final class f extends d {
    public static final a e = new a(null);
    private static final f f = new f(1, 0);

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(l.y.c.f fVar) {
            this();
        }

        public final f a() {
            return f.f;
        }
    }

    public f(int i2, int i3) {
        super(i2, i3, 1);
    }

    @Override // l.a0.d
    public boolean equals(Object obj) {
        if (obj instanceof f) {
            if (!isEmpty() || !((f) obj).isEmpty()) {
                f fVar = (f) obj;
                if (b() != fVar.b() || c() != fVar.c()) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // l.a0.d
    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (b() * 31) + c();
    }

    @Override // l.a0.d
    public boolean isEmpty() {
        return b() > c();
    }

    public Integer j() {
        return Integer.valueOf(c());
    }

    public Integer l() {
        return Integer.valueOf(b());
    }

    @Override // l.a0.d
    public String toString() {
        return b() + ".." + c();
    }
}
