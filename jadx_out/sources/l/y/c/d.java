package l.y.c;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import l.d0.q;
import l.t.c0;
import l.t.d0;
import l.y.b.r;
import l.y.b.s;
import l.y.b.t;
import l.y.b.u;
import l.y.b.v;
import l.y.b.w;

/* JADX INFO: loaded from: classes.dex */
public final class d implements l.b0.a<Object>, c {
    public static final a b = new a(null);
    private static final Map<Class<? extends Object<?>>, Integer> c;
    private static final HashMap<String, String> d;
    private static final HashMap<String, String> e;
    private static final HashMap<String, String> f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Map<String, String> f2152g;
    private final Class<?> a;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final String a(Class<?> cls) {
            String str;
            i.e(cls, "jClass");
            String str2 = null;
            if (!cls.isAnonymousClass()) {
                if (cls.isLocalClass()) {
                    String simpleName = cls.getSimpleName();
                    Method enclosingMethod = cls.getEnclosingMethod();
                    if (enclosingMethod != null) {
                        i.d(simpleName, "name");
                        String strR0 = q.r0(simpleName, enclosingMethod.getName() + '$', null, 2, null);
                        if (strR0 != null) {
                            return strR0;
                        }
                    }
                    Constructor<?> enclosingConstructor = cls.getEnclosingConstructor();
                    i.d(simpleName, "name");
                    if (enclosingConstructor == null) {
                        return q.q0(simpleName, '$', null, 2, null);
                    }
                    return q.r0(simpleName, enclosingConstructor.getName() + '$', null, 2, null);
                }
                if (!cls.isArray()) {
                    String str3 = (String) d.f2152g.get(cls.getName());
                    return str3 == null ? cls.getSimpleName() : str3;
                }
                Class<?> componentType = cls.getComponentType();
                if (componentType.isPrimitive() && (str = (String) d.f2152g.get(componentType.getName())) != null) {
                    str2 = str + "Array";
                }
                if (str2 == null) {
                    return "Array";
                }
            }
            return str2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        int i2 = 0;
        List listI = l.t.m.i(l.y.b.a.class, l.y.b.l.class, l.y.b.p.class, l.y.b.q.class, r.class, s.class, t.class, u.class, v.class, w.class, l.y.b.b.class, l.y.b.c.class, l.y.b.d.class, l.y.b.e.class, l.y.b.f.class, l.y.b.g.class, l.y.b.h.class, l.y.b.i.class, l.y.b.j.class, l.y.b.k.class, l.y.b.m.class, l.y.b.n.class, l.y.b.o.class);
        ArrayList arrayList = new ArrayList(l.t.n.o(listI, 10));
        for (Object obj : listI) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                l.t.k.n();
                throw null;
            }
            arrayList.add(l.p.a((Class) obj, Integer.valueOf(i2)));
            i2 = i3;
        }
        c = d0.j(arrayList);
        HashMap<String, String> map = new HashMap<>();
        map.put("boolean", "kotlin.Boolean");
        map.put("char", "kotlin.Char");
        map.put("byte", "kotlin.Byte");
        map.put("short", "kotlin.Short");
        map.put("int", "kotlin.Int");
        map.put("float", "kotlin.Float");
        map.put("long", "kotlin.Long");
        map.put("double", "kotlin.Double");
        d = map;
        HashMap<String, String> map2 = new HashMap<>();
        map2.put("java.lang.Boolean", "kotlin.Boolean");
        map2.put("java.lang.Character", "kotlin.Char");
        map2.put("java.lang.Byte", "kotlin.Byte");
        map2.put("java.lang.Short", "kotlin.Short");
        map2.put("java.lang.Integer", "kotlin.Int");
        map2.put("java.lang.Float", "kotlin.Float");
        map2.put("java.lang.Long", "kotlin.Long");
        map2.put("java.lang.Double", "kotlin.Double");
        e = map2;
        HashMap<String, String> map3 = new HashMap<>();
        map3.put("java.lang.Object", "kotlin.Any");
        map3.put("java.lang.String", "kotlin.String");
        map3.put("java.lang.CharSequence", "kotlin.CharSequence");
        map3.put("java.lang.Throwable", "kotlin.Throwable");
        map3.put("java.lang.Cloneable", "kotlin.Cloneable");
        map3.put("java.lang.Number", "kotlin.Number");
        map3.put("java.lang.Comparable", "kotlin.Comparable");
        map3.put("java.lang.Enum", "kotlin.Enum");
        map3.put("java.lang.annotation.Annotation", "kotlin.Annotation");
        map3.put("java.lang.Iterable", "kotlin.collections.Iterable");
        map3.put("java.util.Iterator", "kotlin.collections.Iterator");
        map3.put("java.util.Collection", "kotlin.collections.Collection");
        map3.put("java.util.List", "kotlin.collections.List");
        map3.put("java.util.Set", "kotlin.collections.Set");
        map3.put("java.util.ListIterator", "kotlin.collections.ListIterator");
        map3.put("java.util.Map", "kotlin.collections.Map");
        map3.put("java.util.Map$Entry", "kotlin.collections.Map.Entry");
        map3.put("kotlin.jvm.internal.StringCompanionObject", "kotlin.String.Companion");
        map3.put("kotlin.jvm.internal.EnumCompanionObject", "kotlin.Enum.Companion");
        map3.putAll(map);
        map3.putAll(map2);
        Collection<String> collectionValues = map.values();
        i.d(collectionValues, "primitiveFqNames.values");
        for (String str : collectionValues) {
            StringBuilder sb = new StringBuilder();
            sb.append("kotlin.jvm.internal.");
            i.d(str, "kotlinName");
            sb.append(q.t0(str, '.', null, 2, null));
            sb.append("CompanionObject");
            l.l lVarA = l.p.a(sb.toString(), str + ".Companion");
            map3.put(lVarA.c(), lVarA.d());
        }
        for (Map.Entry<Class<? extends Object<?>>, Integer> entry : c.entrySet()) {
            map3.put(entry.getKey().getName(), "kotlin.Function" + entry.getValue().intValue());
        }
        f = map3;
        LinkedHashMap linkedHashMap = new LinkedHashMap(c0.a(map3.size()));
        for (Map.Entry entry2 : map3.entrySet()) {
            linkedHashMap.put(entry2.getKey(), q.t0((String) entry2.getValue(), '.', null, 2, null));
        }
        f2152g = linkedHashMap;
    }

    public d(Class<?> cls) {
        i.e(cls, "jClass");
        this.a = cls;
    }

    @Override // l.b0.a
    public String a() {
        return b.a(b());
    }

    @Override // l.y.c.c
    public Class<?> b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        return (obj instanceof d) && i.a(l.y.a.a(this), l.y.a.a((l.b0.a) obj));
    }

    public int hashCode() {
        return l.y.a.a(this).hashCode();
    }

    public String toString() {
        return b().toString() + " (Kotlin reflection is not available)";
    }
}
