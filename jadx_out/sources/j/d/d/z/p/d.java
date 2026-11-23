package j.d.d.z.p;

import j.d.d.x;
import java.sql.Timestamp;
import java.util.Date;

/* JADX INFO: loaded from: classes.dex */
public final class d {
    public static final boolean a;
    public static final j.d.d.z.n.d.b<? extends Date> b;
    public static final j.d.d.z.n.d.b<? extends Date> c;
    public static final x d;
    public static final x e;
    public static final x f;

    class a extends j.d.d.z.n.d.b<java.sql.Date> {
        a(Class cls) {
            super(cls);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // j.d.d.z.n.d.b
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public java.sql.Date d(Date date) {
            return new java.sql.Date(date.getTime());
        }
    }

    class b extends j.d.d.z.n.d.b<Timestamp> {
        b(Class cls) {
            super(cls);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // j.d.d.z.n.d.b
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Timestamp d(Date date) {
            return new Timestamp(date.getTime());
        }
    }

    static {
        boolean z;
        x xVar;
        try {
            Class.forName("java.sql.Date");
            z = true;
        } catch (ClassNotFoundException unused) {
            z = false;
        }
        a = z;
        if (z) {
            b = new a(java.sql.Date.class);
            c = new b(Timestamp.class);
            d = j.d.d.z.p.a.b;
            e = j.d.d.z.p.b.b;
            xVar = c.b;
        } else {
            xVar = null;
            b = null;
            c = null;
            d = null;
            e = null;
        }
        f = xVar;
    }
}
