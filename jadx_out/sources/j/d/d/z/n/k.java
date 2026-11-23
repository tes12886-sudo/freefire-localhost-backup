package j.d.d.z.n;

import j.d.d.s;
import j.d.d.w;
import j.d.d.x;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class k implements x {
    private final j.d.d.z.c a;
    private final j.d.d.d b;
    private final j.d.d.z.d c;
    private final e d;

    class a extends c {
        final /* synthetic */ Field d;
        final /* synthetic */ boolean e;
        final /* synthetic */ w f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ j.d.d.e f2078g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ j.d.d.a0.a f2079h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ boolean f2080i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(k kVar, String str, boolean z, boolean z2, Field field, boolean z3, w wVar, j.d.d.e eVar, j.d.d.a0.a aVar, boolean z4) {
            super(str, z, z2);
            this.d = field;
            this.e = z3;
            this.f = wVar;
            this.f2078g = eVar;
            this.f2079h = aVar;
            this.f2080i = z4;
        }

        @Override // j.d.d.z.n.k.c
        void a(j.d.d.b0.a aVar, Object obj) throws IllegalAccessException {
            Object objB = this.f.b(aVar);
            if (objB == null && this.f2080i) {
                return;
            }
            this.d.set(obj, objB);
        }

        @Override // j.d.d.z.n.k.c
        void b(j.d.d.b0.c cVar, Object obj) throws IllegalAccessException {
            (this.e ? this.f : new m(this.f2078g, this.f, this.f2079h.getType())).d(cVar, this.d.get(obj));
        }

        @Override // j.d.d.z.n.k.c
        public boolean c(Object obj) {
            return this.b && this.d.get(obj) != obj;
        }
    }

    public static final class b<T> extends w<T> {
        private final j.d.d.z.i<T> a;
        private final Map<String, c> b;

        b(j.d.d.z.i<T> iVar, Map<String, c> map) {
            this.a = iVar;
            this.b = map;
        }

        @Override // j.d.d.w
        public T b(j.d.d.b0.a aVar) throws IOException {
            if (aVar.n0() == j.d.d.b0.b.NULL) {
                aVar.j0();
                return null;
            }
            T tA = this.a.a();
            try {
                aVar.c();
                while (aVar.Z()) {
                    c cVar = this.b.get(aVar.h0());
                    if (cVar == null || !cVar.c) {
                        aVar.x0();
                    } else {
                        cVar.a(aVar, tA);
                    }
                }
                aVar.F();
                return tA;
            } catch (IllegalAccessException e) {
                throw new AssertionError(e);
            } catch (IllegalStateException e2) {
                throw new s(e2);
            }
        }

        @Override // j.d.d.w
        public void d(j.d.d.b0.c cVar, T t) throws IOException {
            if (t == null) {
                cVar.b0();
                return;
            }
            cVar.j();
            try {
                for (c cVar2 : this.b.values()) {
                    if (cVar2.c(t)) {
                        cVar.Z(cVar2.a);
                        cVar2.b(cVar, t);
                    }
                }
                cVar.F();
            } catch (IllegalAccessException e) {
                throw new AssertionError(e);
            }
        }
    }

    static abstract class c {
        final String a;
        final boolean b;
        final boolean c;

        protected c(String str, boolean z, boolean z2) {
            this.a = str;
            this.b = z;
            this.c = z2;
        }

        abstract void a(j.d.d.b0.a aVar, Object obj);

        abstract void b(j.d.d.b0.c cVar, Object obj);

        abstract boolean c(Object obj);
    }

    public k(j.d.d.z.c cVar, j.d.d.d dVar, j.d.d.z.d dVar2, e eVar) {
        this.a = cVar;
        this.b = dVar;
        this.c = dVar2;
        this.d = eVar;
    }

    private c b(j.d.d.e eVar, Field field, String str, j.d.d.a0.a<?> aVar, boolean z, boolean z2) {
        boolean zA = j.d.d.z.k.a(aVar.getRawType());
        j.d.d.y.b bVar = (j.d.d.y.b) field.getAnnotation(j.d.d.y.b.class);
        w<?> wVarB = bVar != null ? this.d.b(this.a, eVar, aVar, bVar) : null;
        boolean z3 = wVarB != null;
        if (wVarB == null) {
            wVarB = eVar.m(aVar);
        }
        return new a(this, str, z, z2, field, z3, wVarB, eVar, aVar, zA);
    }

    static boolean d(Field field, boolean z, j.d.d.z.d dVar) {
        return (dVar.e(field.getType(), z) || dVar.i(field, z)) ? false : true;
    }

    private Map<String, c> e(j.d.d.e eVar, j.d.d.a0.a<?> aVar, Class<?> cls) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (cls.isInterface()) {
            return linkedHashMap;
        }
        Type type = aVar.getType();
        j.d.d.a0.a<?> aVar2 = aVar;
        Class<?> rawType = cls;
        while (rawType != Object.class) {
            Field[] declaredFields = rawType.getDeclaredFields();
            int length = declaredFields.length;
            boolean z = false;
            int i2 = 0;
            while (i2 < length) {
                Field field = declaredFields[i2];
                boolean zC = c(field, true);
                boolean zC2 = c(field, z);
                if (zC || zC2) {
                    j.d.d.z.o.a.b(field);
                    Type typeP = j.d.d.z.b.p(aVar2.getType(), rawType, field.getGenericType());
                    List<String> listF = f(field);
                    int size = listF.size();
                    c cVar = null;
                    int i3 = 0;
                    while (i3 < size) {
                        String str = listF.get(i3);
                        boolean z2 = i3 != 0 ? false : zC;
                        int i4 = i3;
                        c cVar2 = cVar;
                        int i5 = size;
                        List<String> list = listF;
                        Field field2 = field;
                        cVar = cVar2 == null ? (c) linkedHashMap.put(str, b(eVar, field, str, j.d.d.a0.a.get(typeP), z2, zC2)) : cVar2;
                        i3 = i4 + 1;
                        zC = z2;
                        listF = list;
                        size = i5;
                        field = field2;
                    }
                    c cVar3 = cVar;
                    if (cVar3 != null) {
                        throw new IllegalArgumentException(type + " declares multiple JSON fields named " + cVar3.a);
                    }
                }
                i2++;
                z = false;
            }
            aVar2 = j.d.d.a0.a.get(j.d.d.z.b.p(aVar2.getType(), rawType, rawType.getGenericSuperclass()));
            rawType = aVar2.getRawType();
        }
        return linkedHashMap;
    }

    private List<String> f(Field field) {
        j.d.d.y.c cVar = (j.d.d.y.c) field.getAnnotation(j.d.d.y.c.class);
        if (cVar == null) {
            return Collections.singletonList(this.b.a(field));
        }
        String strValue = cVar.value();
        String[] strArrAlternate = cVar.alternate();
        if (strArrAlternate.length == 0) {
            return Collections.singletonList(strValue);
        }
        ArrayList arrayList = new ArrayList(strArrAlternate.length + 1);
        arrayList.add(strValue);
        for (String str : strArrAlternate) {
            arrayList.add(str);
        }
        return arrayList;
    }

    @Override // j.d.d.x
    public <T> w<T> a(j.d.d.e eVar, j.d.d.a0.a<T> aVar) {
        Class<? super T> rawType = aVar.getRawType();
        if (Object.class.isAssignableFrom(rawType)) {
            return new b(this.a.a(aVar), e(eVar, aVar, rawType));
        }
        return null;
    }

    public boolean c(Field field, boolean z) {
        return d(field, z, this.c);
    }
}
