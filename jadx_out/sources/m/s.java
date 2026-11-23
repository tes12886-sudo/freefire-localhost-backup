package m;

import java.io.EOFException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class s extends c0 {
    private static final x d = x.d.a("application/x-www-form-urlencoded");
    private final List<String> b;
    private final List<String> c;

    public static final class a {
        private final Charset a;
        private final List<String> b;
        private final List<String> c;

        /* JADX WARN: Multi-variable type inference failed */
        public a() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public a(Charset charset) {
            this.a = charset;
            this.b = new ArrayList();
            this.c = new ArrayList();
        }

        public /* synthetic */ a(Charset charset, int i2, l.y.c.f fVar) {
            this((i2 & 1) != 0 ? null : charset);
        }

        public final a a(String str, String str2) {
            l.y.c.i.e(str, "name");
            l.y.c.i.e(str2, "value");
            List<String> list = this.b;
            v.b bVar = v.f2312k;
            list.add(v.b.b(bVar, str, 0, 0, " \"':;<=>@[]^`{}|/\\?#&!$(),~", false, false, true, false, this.a, 91, null));
            this.c.add(v.b.b(bVar, str2, 0, 0, " \"':;<=>@[]^`{}|/\\?#&!$(),~", false, false, true, false, this.a, 91, null));
            return this;
        }

        public final a b(String str, String str2) {
            l.y.c.i.e(str, "name");
            l.y.c.i.e(str2, "value");
            List<String> list = this.b;
            v.b bVar = v.f2312k;
            list.add(v.b.b(bVar, str, 0, 0, " \"':;<=>@[]^`{}|/\\?#&!$(),~", true, false, true, false, this.a, 83, null));
            this.c.add(v.b.b(bVar, str2, 0, 0, " \"':;<=>@[]^`{}|/\\?#&!$(),~", true, false, true, false, this.a, 83, null));
            return this;
        }

        public final s c() {
            return new s(this.b, this.c);
        }
    }

    public s(List<String> list, List<String> list2) {
        l.y.c.i.e(list, "encodedNames");
        l.y.c.i.e(list2, "encodedValues");
        this.b = m.h0.d.R(list);
        this.c = m.h0.d.R(list2);
    }

    private final long m(n.c cVar, boolean z) throws EOFException {
        n.b bVarA;
        if (z) {
            bVarA = new n.b();
        } else {
            l.y.c.i.c(cVar);
            bVarA = cVar.a();
        }
        int i2 = 0;
        int size = this.b.size();
        while (i2 < size) {
            int i3 = i2 + 1;
            if (i2 > 0) {
                bVarA.z0(38);
            }
            bVarA.I0(this.b.get(i2));
            bVarA.z0(61);
            bVarA.I0(this.c.get(i2));
            i2 = i3;
        }
        if (!z) {
            return 0L;
        }
        long jR0 = bVarA.r0();
        bVarA.Y();
        return jR0;
    }

    @Override // m.c0
    public long a() {
        return m(null, true);
    }

    @Override // m.c0
    public x b() {
        return d;
    }

    @Override // m.c0
    public void h(n.c cVar) throws EOFException {
        l.y.c.i.e(cVar, "sink");
        m(cVar, false);
    }

    public final String i(int i2) {
        return this.b.get(i2);
    }

    public final String j(int i2) {
        return this.c.get(i2);
    }

    public final int k() {
        return this.b.size();
    }

    public final String l(int i2) {
        return v.b.g(v.f2312k, j(i2), 0, 0, true, 3, null);
    }
}
