package j.d.d;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class f {
    private j.d.d.z.d a = j.d.d.z.d.f2070g;
    private t b = t.a;
    private d c = c.a;
    private final Map<Type, g<?>> d = new HashMap();
    private final List<x> e = new ArrayList();
    private final List<x> f = new ArrayList();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f2061g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f2062h = e.f2052m;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f2063i = 2;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f2064j = 2;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f2065k = false;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f2066l = false;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f2067m = true;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f2068n = false;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f2069o = false;
    private boolean p = false;
    private boolean q = true;
    private v r = e.f2054o;
    private v s = e.p;

    private void a(String str, int i2, int i3, List<x> list) {
        x xVarB;
        x xVarB2;
        boolean z = j.d.d.z.p.d.a;
        x xVarA = null;
        if (str != null && !str.trim().isEmpty()) {
            xVarB = j.d.d.z.n.d.b.b.b(str);
            if (z) {
                xVarA = j.d.d.z.p.d.c.b(str);
                xVarB2 = j.d.d.z.p.d.b.b(str);
            } else {
                xVarB2 = null;
            }
        } else {
            if (i2 == 2 || i3 == 2) {
                return;
            }
            x xVarA2 = j.d.d.z.n.d.b.b.a(i2, i3);
            if (z) {
                xVarA = j.d.d.z.p.d.c.a(i2, i3);
                x xVarA3 = j.d.d.z.p.d.b.a(i2, i3);
                xVarB = xVarA2;
                xVarB2 = xVarA3;
            } else {
                xVarB = xVarA2;
                xVarB2 = null;
            }
        }
        list.add(xVarB);
        if (z) {
            list.add(xVarA);
            list.add(xVarB2);
        }
    }

    public e b() {
        List<x> arrayList = new ArrayList<>(this.e.size() + this.f.size() + 3);
        arrayList.addAll(this.e);
        Collections.reverse(arrayList);
        ArrayList arrayList2 = new ArrayList(this.f);
        Collections.reverse(arrayList2);
        arrayList.addAll(arrayList2);
        a(this.f2062h, this.f2063i, this.f2064j, arrayList);
        return new e(this.a, this.c, this.d, this.f2061g, this.f2065k, this.f2069o, this.f2067m, this.f2068n, this.p, this.f2066l, this.q, this.b, this.f2062h, this.f2063i, this.f2064j, this.e, this.f, arrayList, this.r, this.s);
    }

    public f c(Type type, Object obj) {
        boolean z = obj instanceof r;
        j.d.d.z.a.a(z || (obj instanceof j) || (obj instanceof g) || (obj instanceof w));
        if (obj instanceof g) {
            this.d.put(type, (g) obj);
        }
        if (z || (obj instanceof j)) {
            this.e.add(j.d.d.z.n.l.f(j.d.d.a0.a.get(type), obj));
        }
        if (obj instanceof w) {
            this.e.add(j.d.d.z.n.n.a(j.d.d.a0.a.get(type), (w) obj));
        }
        return this;
    }

    public f d(x xVar) {
        this.e.add(xVar);
        return this;
    }
}
