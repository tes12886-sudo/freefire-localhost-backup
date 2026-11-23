package j.d.d.z.n;

import java.io.IOException;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Calendar;
import java.util.Currency;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;

/* JADX INFO: loaded from: classes.dex */
public final class n {
    public static final j.d.d.w<BigInteger> A;
    public static final j.d.d.w<j.d.d.z.g> B;
    public static final j.d.d.x C;
    public static final j.d.d.w<StringBuilder> D;
    public static final j.d.d.x E;
    public static final j.d.d.w<StringBuffer> F;
    public static final j.d.d.x G;
    public static final j.d.d.w<URL> H;
    public static final j.d.d.x I;
    public static final j.d.d.w<URI> J;
    public static final j.d.d.x K;
    public static final j.d.d.w<InetAddress> L;
    public static final j.d.d.x M;
    public static final j.d.d.w<UUID> N;
    public static final j.d.d.x O;
    public static final j.d.d.w<Currency> P;
    public static final j.d.d.x Q;
    public static final j.d.d.w<Calendar> R;
    public static final j.d.d.x S;
    public static final j.d.d.w<Locale> T;
    public static final j.d.d.x U;
    public static final j.d.d.w<j.d.d.k> V;
    public static final j.d.d.x W;
    public static final j.d.d.x X;
    public static final j.d.d.w<Class> a;
    public static final j.d.d.x b;
    public static final j.d.d.w<BitSet> c;
    public static final j.d.d.x d;
    public static final j.d.d.w<Boolean> e;
    public static final j.d.d.w<Boolean> f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final j.d.d.x f2082g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final j.d.d.w<Number> f2083h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final j.d.d.x f2084i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final j.d.d.w<Number> f2085j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final j.d.d.x f2086k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final j.d.d.w<Number> f2087l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final j.d.d.x f2088m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final j.d.d.w<AtomicInteger> f2089n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final j.d.d.x f2090o;
    public static final j.d.d.w<AtomicBoolean> p;
    public static final j.d.d.x q;
    public static final j.d.d.w<AtomicIntegerArray> r;
    public static final j.d.d.x s;
    public static final j.d.d.w<Number> t;
    public static final j.d.d.w<Number> u;
    public static final j.d.d.w<Number> v;
    public static final j.d.d.w<Character> w;
    public static final j.d.d.x x;
    public static final j.d.d.w<String> y;
    public static final j.d.d.w<BigDecimal> z;

    class a extends j.d.d.w<AtomicIntegerArray> {
        a() {
        }

        @Override // j.d.d.w
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public AtomicIntegerArray b(j.d.d.b0.a aVar) {
            ArrayList arrayList = new ArrayList();
            aVar.b();
            while (aVar.Z()) {
                try {
                    arrayList.add(Integer.valueOf(aVar.f0()));
                } catch (NumberFormatException e) {
                    throw new j.d.d.s(e);
                }
            }
            aVar.u();
            int size = arrayList.size();
            AtomicIntegerArray atomicIntegerArray = new AtomicIntegerArray(size);
            for (int i2 = 0; i2 < size; i2++) {
                atomicIntegerArray.set(i2, ((Integer) arrayList.get(i2)).intValue());
            }
            return atomicIntegerArray;
        }

        @Override // j.d.d.w
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(j.d.d.b0.c cVar, AtomicIntegerArray atomicIntegerArray) throws IOException {
            cVar.f();
            int length = atomicIntegerArray.length();
            for (int i2 = 0; i2 < length; i2++) {
                cVar.l0(atomicIntegerArray.get(i2));
            }
            cVar.u();
        }
    }

    class a0 implements j.d.d.x {
        final /* synthetic */ Class a;
        final /* synthetic */ j.d.d.w b;

        /* JADX INFO: Add missing generic type declarations: [T1] */
        class a<T1> extends j.d.d.w<T1> {
            final /* synthetic */ Class a;

            a(Class cls) {
                this.a = cls;
            }

            @Override // j.d.d.w
            public T1 b(j.d.d.b0.a aVar) {
                T1 t1 = (T1) a0.this.b.b(aVar);
                if (t1 == null || this.a.isInstance(t1)) {
                    return t1;
                }
                throw new j.d.d.s("Expected a " + this.a.getName() + " but was " + t1.getClass().getName() + "; at path " + aVar.Y());
            }

            @Override // j.d.d.w
            public void d(j.d.d.b0.c cVar, T1 t1) {
                a0.this.b.d(cVar, t1);
            }
        }

        a0(Class cls, j.d.d.w wVar) {
            this.a = cls;
            this.b = wVar;
        }

        @Override // j.d.d.x
        public <T2> j.d.d.w<T2> a(j.d.d.e eVar, j.d.d.a0.a<T2> aVar) {
            Class<? super T2> rawType = aVar.getRawType();
            if (this.a.isAssignableFrom(rawType)) {
                return new a(rawType);
            }
            return null;
        }

        public String toString() {
            return "Factory[typeHierarchy=" + this.a.getName() + ",adapter=" + this.b + "]";
        }
    }

    class b extends j.d.d.w<Number> {
        b() {
        }

        @Override // j.d.d.w
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Number b(j.d.d.b0.a aVar) {
            if (aVar.n0() == j.d.d.b0.b.NULL) {
                aVar.j0();
                return null;
            }
            try {
                return Long.valueOf(aVar.g0());
            } catch (NumberFormatException e) {
                throw new j.d.d.s(e);
            }
        }

        @Override // j.d.d.w
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(j.d.d.b0.c cVar, Number number) throws IOException {
            cVar.n0(number);
        }
    }

    static /* synthetic */ class b0 {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[j.d.d.b0.b.values().length];
            a = iArr;
            try {
                iArr[j.d.d.b0.b.NUMBER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[j.d.d.b0.b.STRING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[j.d.d.b0.b.BOOLEAN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[j.d.d.b0.b.NULL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[j.d.d.b0.b.BEGIN_ARRAY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[j.d.d.b0.b.BEGIN_OBJECT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[j.d.d.b0.b.END_DOCUMENT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[j.d.d.b0.b.NAME.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[j.d.d.b0.b.END_OBJECT.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                a[j.d.d.b0.b.END_ARRAY.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    class c extends j.d.d.w<Number> {
        c() {
        }

        @Override // j.d.d.w
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Number b(j.d.d.b0.a aVar) {
            if (aVar.n0() != j.d.d.b0.b.NULL) {
                return Float.valueOf((float) aVar.e0());
            }
            aVar.j0();
            return null;
        }

        @Override // j.d.d.w
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(j.d.d.b0.c cVar, Number number) throws IOException {
            cVar.n0(number);
        }
    }

    class c0 extends j.d.d.w<Boolean> {
        c0() {
        }

        @Override // j.d.d.w
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Boolean b(j.d.d.b0.a aVar) throws IOException {
            j.d.d.b0.b bVarN0 = aVar.n0();
            if (bVarN0 != j.d.d.b0.b.NULL) {
                return bVarN0 == j.d.d.b0.b.STRING ? Boolean.valueOf(Boolean.parseBoolean(aVar.l0())) : Boolean.valueOf(aVar.d0());
            }
            aVar.j0();
            return null;
        }

        @Override // j.d.d.w
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(j.d.d.b0.c cVar, Boolean bool) throws IOException {
            cVar.m0(bool);
        }
    }

    class d extends j.d.d.w<Number> {
        d() {
        }

        @Override // j.d.d.w
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Number b(j.d.d.b0.a aVar) {
            if (aVar.n0() != j.d.d.b0.b.NULL) {
                return Double.valueOf(aVar.e0());
            }
            aVar.j0();
            return null;
        }

        @Override // j.d.d.w
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(j.d.d.b0.c cVar, Number number) throws IOException {
            cVar.n0(number);
        }
    }

    class d0 extends j.d.d.w<Boolean> {
        d0() {
        }

        @Override // j.d.d.w
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Boolean b(j.d.d.b0.a aVar) {
            if (aVar.n0() != j.d.d.b0.b.NULL) {
                return Boolean.valueOf(aVar.l0());
            }
            aVar.j0();
            return null;
        }

        @Override // j.d.d.w
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(j.d.d.b0.c cVar, Boolean bool) throws IOException {
            cVar.o0(bool == null ? "null" : bool.toString());
        }
    }

    class e extends j.d.d.w<Character> {
        e() {
        }

        @Override // j.d.d.w
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Character b(j.d.d.b0.a aVar) throws IOException {
            if (aVar.n0() == j.d.d.b0.b.NULL) {
                aVar.j0();
                return null;
            }
            String strL0 = aVar.l0();
            if (strL0.length() == 1) {
                return Character.valueOf(strL0.charAt(0));
            }
            throw new j.d.d.s("Expecting character, got: " + strL0 + "; at " + aVar.Y());
        }

        @Override // j.d.d.w
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(j.d.d.b0.c cVar, Character ch) throws IOException {
            cVar.o0(ch == null ? null : String.valueOf(ch));
        }
    }

    class e0 extends j.d.d.w<Number> {
        e0() {
        }

        @Override // j.d.d.w
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Number b(j.d.d.b0.a aVar) throws IOException {
            if (aVar.n0() == j.d.d.b0.b.NULL) {
                aVar.j0();
                return null;
            }
            try {
                int iF0 = aVar.f0();
                if (iF0 <= 255 && iF0 >= -128) {
                    return Byte.valueOf((byte) iF0);
                }
                throw new j.d.d.s("Lossy conversion from " + iF0 + " to byte; at path " + aVar.Y());
            } catch (NumberFormatException e) {
                throw new j.d.d.s(e);
            }
        }

        @Override // j.d.d.w
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(j.d.d.b0.c cVar, Number number) throws IOException {
            cVar.n0(number);
        }
    }

    class f extends j.d.d.w<String> {
        f() {
        }

        @Override // j.d.d.w
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public String b(j.d.d.b0.a aVar) throws IOException {
            j.d.d.b0.b bVarN0 = aVar.n0();
            if (bVarN0 != j.d.d.b0.b.NULL) {
                return bVarN0 == j.d.d.b0.b.BOOLEAN ? Boolean.toString(aVar.d0()) : aVar.l0();
            }
            aVar.j0();
            return null;
        }

        @Override // j.d.d.w
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(j.d.d.b0.c cVar, String str) throws IOException {
            cVar.o0(str);
        }
    }

    class f0 extends j.d.d.w<Number> {
        f0() {
        }

        @Override // j.d.d.w
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Number b(j.d.d.b0.a aVar) throws IOException {
            if (aVar.n0() == j.d.d.b0.b.NULL) {
                aVar.j0();
                return null;
            }
            try {
                int iF0 = aVar.f0();
                if (iF0 <= 65535 && iF0 >= -32768) {
                    return Short.valueOf((short) iF0);
                }
                throw new j.d.d.s("Lossy conversion from " + iF0 + " to short; at path " + aVar.Y());
            } catch (NumberFormatException e) {
                throw new j.d.d.s(e);
            }
        }

        @Override // j.d.d.w
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(j.d.d.b0.c cVar, Number number) throws IOException {
            cVar.n0(number);
        }
    }

    class g extends j.d.d.w<BigDecimal> {
        g() {
        }

        @Override // j.d.d.w
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public BigDecimal b(j.d.d.b0.a aVar) throws IOException {
            if (aVar.n0() == j.d.d.b0.b.NULL) {
                aVar.j0();
                return null;
            }
            String strL0 = aVar.l0();
            try {
                return new BigDecimal(strL0);
            } catch (NumberFormatException e) {
                throw new j.d.d.s("Failed parsing '" + strL0 + "' as BigDecimal; at path " + aVar.Y(), e);
            }
        }

        @Override // j.d.d.w
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(j.d.d.b0.c cVar, BigDecimal bigDecimal) throws IOException {
            cVar.n0(bigDecimal);
        }
    }

    class g0 extends j.d.d.w<Number> {
        g0() {
        }

        @Override // j.d.d.w
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Number b(j.d.d.b0.a aVar) {
            if (aVar.n0() == j.d.d.b0.b.NULL) {
                aVar.j0();
                return null;
            }
            try {
                return Integer.valueOf(aVar.f0());
            } catch (NumberFormatException e) {
                throw new j.d.d.s(e);
            }
        }

        @Override // j.d.d.w
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(j.d.d.b0.c cVar, Number number) throws IOException {
            cVar.n0(number);
        }
    }

    class h extends j.d.d.w<BigInteger> {
        h() {
        }

        @Override // j.d.d.w
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public BigInteger b(j.d.d.b0.a aVar) throws IOException {
            if (aVar.n0() == j.d.d.b0.b.NULL) {
                aVar.j0();
                return null;
            }
            String strL0 = aVar.l0();
            try {
                return new BigInteger(strL0);
            } catch (NumberFormatException e) {
                throw new j.d.d.s("Failed parsing '" + strL0 + "' as BigInteger; at path " + aVar.Y(), e);
            }
        }

        @Override // j.d.d.w
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(j.d.d.b0.c cVar, BigInteger bigInteger) throws IOException {
            cVar.n0(bigInteger);
        }
    }

    class h0 extends j.d.d.w<AtomicInteger> {
        h0() {
        }

        @Override // j.d.d.w
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public AtomicInteger b(j.d.d.b0.a aVar) {
            try {
                return new AtomicInteger(aVar.f0());
            } catch (NumberFormatException e) {
                throw new j.d.d.s(e);
            }
        }

        @Override // j.d.d.w
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(j.d.d.b0.c cVar, AtomicInteger atomicInteger) throws IOException {
            cVar.l0(atomicInteger.get());
        }
    }

    class i extends j.d.d.w<j.d.d.z.g> {
        i() {
        }

        @Override // j.d.d.w
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public j.d.d.z.g b(j.d.d.b0.a aVar) {
            if (aVar.n0() != j.d.d.b0.b.NULL) {
                return new j.d.d.z.g(aVar.l0());
            }
            aVar.j0();
            return null;
        }

        @Override // j.d.d.w
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(j.d.d.b0.c cVar, j.d.d.z.g gVar) throws IOException {
            cVar.n0(gVar);
        }
    }

    class i0 extends j.d.d.w<AtomicBoolean> {
        i0() {
        }

        @Override // j.d.d.w
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public AtomicBoolean b(j.d.d.b0.a aVar) {
            return new AtomicBoolean(aVar.d0());
        }

        @Override // j.d.d.w
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(j.d.d.b0.c cVar, AtomicBoolean atomicBoolean) throws IOException {
            cVar.p0(atomicBoolean.get());
        }
    }

    class j extends j.d.d.w<StringBuilder> {
        j() {
        }

        @Override // j.d.d.w
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public StringBuilder b(j.d.d.b0.a aVar) {
            if (aVar.n0() != j.d.d.b0.b.NULL) {
                return new StringBuilder(aVar.l0());
            }
            aVar.j0();
            return null;
        }

        @Override // j.d.d.w
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(j.d.d.b0.c cVar, StringBuilder sb) throws IOException {
            cVar.o0(sb == null ? null : sb.toString());
        }
    }

    private static final class j0<T extends Enum<T>> extends j.d.d.w<T> {
        private final Map<String, T> a = new HashMap();
        private final Map<T, String> b = new HashMap();

        class a implements PrivilegedAction<Field[]> {
            final /* synthetic */ Class a;

            a(j0 j0Var, Class cls) {
                this.a = cls;
            }

            @Override // java.security.PrivilegedAction
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Field[] run() {
                Field[] declaredFields = this.a.getDeclaredFields();
                ArrayList arrayList = new ArrayList(declaredFields.length);
                for (Field field : declaredFields) {
                    if (field.isEnumConstant()) {
                        arrayList.add(field);
                    }
                }
                Field[] fieldArr = (Field[]) arrayList.toArray(new Field[0]);
                AccessibleObject.setAccessible(fieldArr, true);
                return fieldArr;
            }
        }

        public j0(Class<T> cls) {
            try {
                for (Field field : (Field[]) AccessController.doPrivileged(new a(this, cls))) {
                    Enum r4 = (Enum) field.get(null);
                    String strName = r4.name();
                    j.d.d.y.c cVar = (j.d.d.y.c) field.getAnnotation(j.d.d.y.c.class);
                    if (cVar != null) {
                        strName = cVar.value();
                        for (String str : cVar.alternate()) {
                            this.a.put(str, (T) r4);
                        }
                    }
                    this.a.put(strName, (T) r4);
                    this.b.put((T) r4, strName);
                }
            } catch (IllegalAccessException e) {
                throw new AssertionError(e);
            }
        }

        @Override // j.d.d.w
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public T b(j.d.d.b0.a aVar) {
            if (aVar.n0() != j.d.d.b0.b.NULL) {
                return this.a.get(aVar.l0());
            }
            aVar.j0();
            return null;
        }

        @Override // j.d.d.w
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(j.d.d.b0.c cVar, T t) throws IOException {
            cVar.o0(t == null ? null : this.b.get(t));
        }
    }

    class k extends j.d.d.w<Class> {
        k() {
        }

        @Override // j.d.d.w
        public /* bridge */ /* synthetic */ Class b(j.d.d.b0.a aVar) {
            e(aVar);
            throw null;
        }

        @Override // j.d.d.w
        public /* bridge */ /* synthetic */ void d(j.d.d.b0.c cVar, Class cls) {
            f(cVar, cls);
            throw null;
        }

        public Class e(j.d.d.b0.a aVar) {
            throw new UnsupportedOperationException("Attempted to deserialize a java.lang.Class. Forgot to register a type adapter?");
        }

        public void f(j.d.d.b0.c cVar, Class cls) {
            throw new UnsupportedOperationException("Attempted to serialize java.lang.Class: " + cls.getName() + ". Forgot to register a type adapter?");
        }
    }

    class l extends j.d.d.w<StringBuffer> {
        l() {
        }

        @Override // j.d.d.w
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public StringBuffer b(j.d.d.b0.a aVar) {
            if (aVar.n0() != j.d.d.b0.b.NULL) {
                return new StringBuffer(aVar.l0());
            }
            aVar.j0();
            return null;
        }

        @Override // j.d.d.w
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(j.d.d.b0.c cVar, StringBuffer stringBuffer) throws IOException {
            cVar.o0(stringBuffer == null ? null : stringBuffer.toString());
        }
    }

    class m extends j.d.d.w<URL> {
        m() {
        }

        @Override // j.d.d.w
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public URL b(j.d.d.b0.a aVar) throws IOException {
            if (aVar.n0() == j.d.d.b0.b.NULL) {
                aVar.j0();
                return null;
            }
            String strL0 = aVar.l0();
            if ("null".equals(strL0)) {
                return null;
            }
            return new URL(strL0);
        }

        @Override // j.d.d.w
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(j.d.d.b0.c cVar, URL url) throws IOException {
            cVar.o0(url == null ? null : url.toExternalForm());
        }
    }

    /* JADX INFO: renamed from: j.d.d.z.n.n$n, reason: collision with other inner class name */
    class C0244n extends j.d.d.w<URI> {
        C0244n() {
        }

        @Override // j.d.d.w
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public URI b(j.d.d.b0.a aVar) throws IOException {
            if (aVar.n0() == j.d.d.b0.b.NULL) {
                aVar.j0();
                return null;
            }
            try {
                String strL0 = aVar.l0();
                if ("null".equals(strL0)) {
                    return null;
                }
                return new URI(strL0);
            } catch (URISyntaxException e) {
                throw new j.d.d.l(e);
            }
        }

        @Override // j.d.d.w
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(j.d.d.b0.c cVar, URI uri) throws IOException {
            cVar.o0(uri == null ? null : uri.toASCIIString());
        }
    }

    class o extends j.d.d.w<InetAddress> {
        o() {
        }

        @Override // j.d.d.w
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public InetAddress b(j.d.d.b0.a aVar) {
            if (aVar.n0() != j.d.d.b0.b.NULL) {
                return InetAddress.getByName(aVar.l0());
            }
            aVar.j0();
            return null;
        }

        @Override // j.d.d.w
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(j.d.d.b0.c cVar, InetAddress inetAddress) throws IOException {
            cVar.o0(inetAddress == null ? null : inetAddress.getHostAddress());
        }
    }

    class p extends j.d.d.w<UUID> {
        p() {
        }

        @Override // j.d.d.w
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public UUID b(j.d.d.b0.a aVar) throws IOException {
            if (aVar.n0() == j.d.d.b0.b.NULL) {
                aVar.j0();
                return null;
            }
            String strL0 = aVar.l0();
            try {
                return UUID.fromString(strL0);
            } catch (IllegalArgumentException e) {
                throw new j.d.d.s("Failed parsing '" + strL0 + "' as UUID; at path " + aVar.Y(), e);
            }
        }

        @Override // j.d.d.w
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(j.d.d.b0.c cVar, UUID uuid) throws IOException {
            cVar.o0(uuid == null ? null : uuid.toString());
        }
    }

    class q extends j.d.d.w<Currency> {
        q() {
        }

        @Override // j.d.d.w
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Currency b(j.d.d.b0.a aVar) throws IOException {
            String strL0 = aVar.l0();
            try {
                return Currency.getInstance(strL0);
            } catch (IllegalArgumentException e) {
                throw new j.d.d.s("Failed parsing '" + strL0 + "' as Currency; at path " + aVar.Y(), e);
            }
        }

        @Override // j.d.d.w
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(j.d.d.b0.c cVar, Currency currency) throws IOException {
            cVar.o0(currency.getCurrencyCode());
        }
    }

    class r extends j.d.d.w<Calendar> {
        r() {
        }

        @Override // j.d.d.w
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Calendar b(j.d.d.b0.a aVar) throws IOException {
            if (aVar.n0() == j.d.d.b0.b.NULL) {
                aVar.j0();
                return null;
            }
            aVar.c();
            int i2 = 0;
            int i3 = 0;
            int i4 = 0;
            int i5 = 0;
            int i6 = 0;
            int i7 = 0;
            while (aVar.n0() != j.d.d.b0.b.END_OBJECT) {
                String strH0 = aVar.h0();
                int iF0 = aVar.f0();
                if ("year".equals(strH0)) {
                    i2 = iF0;
                } else if ("month".equals(strH0)) {
                    i3 = iF0;
                } else if ("dayOfMonth".equals(strH0)) {
                    i4 = iF0;
                } else if ("hourOfDay".equals(strH0)) {
                    i5 = iF0;
                } else if ("minute".equals(strH0)) {
                    i6 = iF0;
                } else if ("second".equals(strH0)) {
                    i7 = iF0;
                }
            }
            aVar.F();
            return new GregorianCalendar(i2, i3, i4, i5, i6, i7);
        }

        @Override // j.d.d.w
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(j.d.d.b0.c cVar, Calendar calendar) throws IOException {
            if (calendar == null) {
                cVar.b0();
                return;
            }
            cVar.j();
            cVar.Z("year");
            cVar.l0(calendar.get(1));
            cVar.Z("month");
            cVar.l0(calendar.get(2));
            cVar.Z("dayOfMonth");
            cVar.l0(calendar.get(5));
            cVar.Z("hourOfDay");
            cVar.l0(calendar.get(11));
            cVar.Z("minute");
            cVar.l0(calendar.get(12));
            cVar.Z("second");
            cVar.l0(calendar.get(13));
            cVar.F();
        }
    }

    class s extends j.d.d.w<Locale> {
        s() {
        }

        @Override // j.d.d.w
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Locale b(j.d.d.b0.a aVar) {
            if (aVar.n0() == j.d.d.b0.b.NULL) {
                aVar.j0();
                return null;
            }
            StringTokenizer stringTokenizer = new StringTokenizer(aVar.l0(), "_");
            String strNextToken = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
            String strNextToken2 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
            String strNextToken3 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
            if (strNextToken2 == null && strNextToken3 == null) {
                return new Locale(strNextToken);
            }
            return strNextToken3 == null ? new Locale(strNextToken, strNextToken2) : new Locale(strNextToken, strNextToken2, strNextToken3);
        }

        @Override // j.d.d.w
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(j.d.d.b0.c cVar, Locale locale) throws IOException {
            cVar.o0(locale == null ? null : locale.toString());
        }
    }

    class t extends j.d.d.w<j.d.d.k> {
        t() {
        }

        @Override // j.d.d.w
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public j.d.d.k b(j.d.d.b0.a aVar) throws IOException {
            if (aVar instanceof j.d.d.z.n.f) {
                return ((j.d.d.z.n.f) aVar).A0();
            }
            switch (b0.a[aVar.n0().ordinal()]) {
                case 1:
                    return new j.d.d.p(new j.d.d.z.g(aVar.l0()));
                case 2:
                    return new j.d.d.p(aVar.l0());
                case 3:
                    return new j.d.d.p(Boolean.valueOf(aVar.d0()));
                case 4:
                    aVar.j0();
                    return j.d.d.m.a;
                case 5:
                    j.d.d.h hVar = new j.d.d.h();
                    aVar.b();
                    while (aVar.Z()) {
                        hVar.q(b(aVar));
                    }
                    aVar.u();
                    return hVar;
                case 6:
                    j.d.d.n nVar = new j.d.d.n();
                    aVar.c();
                    while (aVar.Z()) {
                        nVar.q(aVar.h0(), b(aVar));
                    }
                    aVar.F();
                    return nVar;
                default:
                    throw new IllegalArgumentException();
            }
        }

        @Override // j.d.d.w
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(j.d.d.b0.c cVar, j.d.d.k kVar) throws IOException {
            if (kVar == null || kVar.j()) {
                cVar.b0();
                return;
            }
            if (kVar.n()) {
                j.d.d.p pVarD = kVar.d();
                if (pVarD.x()) {
                    cVar.n0(pVarD.u());
                    return;
                } else if (pVarD.v()) {
                    cVar.p0(pVarD.q());
                    return;
                } else {
                    cVar.o0(pVarD.f());
                    return;
                }
            }
            if (kVar.h()) {
                cVar.f();
                Iterator<j.d.d.k> it = kVar.b().iterator();
                while (it.hasNext()) {
                    d(cVar, it.next());
                }
                cVar.u();
                return;
            }
            if (!kVar.l()) {
                throw new IllegalArgumentException("Couldn't write " + kVar.getClass());
            }
            cVar.j();
            for (Map.Entry<String, j.d.d.k> entry : kVar.c().s()) {
                cVar.Z(entry.getKey());
                d(cVar, entry.getValue());
            }
            cVar.F();
        }
    }

    class u implements j.d.d.x {
        u() {
        }

        @Override // j.d.d.x
        public <T> j.d.d.w<T> a(j.d.d.e eVar, j.d.d.a0.a<T> aVar) {
            Class<? super T> rawType = aVar.getRawType();
            if (!Enum.class.isAssignableFrom(rawType) || rawType == Enum.class) {
                return null;
            }
            if (!rawType.isEnum()) {
                rawType = rawType.getSuperclass();
            }
            return new j0(rawType);
        }
    }

    class v extends j.d.d.w<BitSet> {
        v() {
        }

        @Override // j.d.d.w
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public BitSet b(j.d.d.b0.a aVar) throws IOException {
            BitSet bitSet = new BitSet();
            aVar.b();
            j.d.d.b0.b bVarN0 = aVar.n0();
            int i2 = 0;
            while (bVarN0 != j.d.d.b0.b.END_ARRAY) {
                int i3 = b0.a[bVarN0.ordinal()];
                boolean zD0 = true;
                if (i3 == 1 || i3 == 2) {
                    int iF0 = aVar.f0();
                    if (iF0 == 0) {
                        zD0 = false;
                    } else if (iF0 != 1) {
                        throw new j.d.d.s("Invalid bitset value " + iF0 + ", expected 0 or 1; at path " + aVar.Y());
                    }
                } else {
                    if (i3 != 3) {
                        throw new j.d.d.s("Invalid bitset value type: " + bVarN0 + "; at path " + aVar.Q());
                    }
                    zD0 = aVar.d0();
                }
                if (zD0) {
                    bitSet.set(i2);
                }
                i2++;
                bVarN0 = aVar.n0();
            }
            aVar.u();
            return bitSet;
        }

        @Override // j.d.d.w
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(j.d.d.b0.c cVar, BitSet bitSet) throws IOException {
            cVar.f();
            int length = bitSet.length();
            for (int i2 = 0; i2 < length; i2++) {
                cVar.l0(bitSet.get(i2) ? 1L : 0L);
            }
            cVar.u();
        }
    }

    class w implements j.d.d.x {
        final /* synthetic */ j.d.d.a0.a a;
        final /* synthetic */ j.d.d.w b;

        w(j.d.d.a0.a aVar, j.d.d.w wVar) {
            this.a = aVar;
            this.b = wVar;
        }

        @Override // j.d.d.x
        public <T> j.d.d.w<T> a(j.d.d.e eVar, j.d.d.a0.a<T> aVar) {
            if (aVar.equals(this.a)) {
                return this.b;
            }
            return null;
        }
    }

    class x implements j.d.d.x {
        final /* synthetic */ Class a;
        final /* synthetic */ j.d.d.w b;

        x(Class cls, j.d.d.w wVar) {
            this.a = cls;
            this.b = wVar;
        }

        @Override // j.d.d.x
        public <T> j.d.d.w<T> a(j.d.d.e eVar, j.d.d.a0.a<T> aVar) {
            if (aVar.getRawType() == this.a) {
                return this.b;
            }
            return null;
        }

        public String toString() {
            return "Factory[type=" + this.a.getName() + ",adapter=" + this.b + "]";
        }
    }

    class y implements j.d.d.x {
        final /* synthetic */ Class a;
        final /* synthetic */ Class b;
        final /* synthetic */ j.d.d.w c;

        y(Class cls, Class cls2, j.d.d.w wVar) {
            this.a = cls;
            this.b = cls2;
            this.c = wVar;
        }

        @Override // j.d.d.x
        public <T> j.d.d.w<T> a(j.d.d.e eVar, j.d.d.a0.a<T> aVar) {
            Class<? super T> rawType = aVar.getRawType();
            if (rawType == this.a || rawType == this.b) {
                return this.c;
            }
            return null;
        }

        public String toString() {
            return "Factory[type=" + this.b.getName() + "+" + this.a.getName() + ",adapter=" + this.c + "]";
        }
    }

    class z implements j.d.d.x {
        final /* synthetic */ Class a;
        final /* synthetic */ Class b;
        final /* synthetic */ j.d.d.w c;

        z(Class cls, Class cls2, j.d.d.w wVar) {
            this.a = cls;
            this.b = cls2;
            this.c = wVar;
        }

        @Override // j.d.d.x
        public <T> j.d.d.w<T> a(j.d.d.e eVar, j.d.d.a0.a<T> aVar) {
            Class<? super T> rawType = aVar.getRawType();
            if (rawType == this.a || rawType == this.b) {
                return this.c;
            }
            return null;
        }

        public String toString() {
            return "Factory[type=" + this.a.getName() + "+" + this.b.getName() + ",adapter=" + this.c + "]";
        }
    }

    static {
        j.d.d.w<Class> wVarA = new k().a();
        a = wVarA;
        b = b(Class.class, wVarA);
        j.d.d.w<BitSet> wVarA2 = new v().a();
        c = wVarA2;
        d = b(BitSet.class, wVarA2);
        c0 c0Var = new c0();
        e = c0Var;
        f = new d0();
        f2082g = c(Boolean.TYPE, Boolean.class, c0Var);
        e0 e0Var = new e0();
        f2083h = e0Var;
        f2084i = c(Byte.TYPE, Byte.class, e0Var);
        f0 f0Var = new f0();
        f2085j = f0Var;
        f2086k = c(Short.TYPE, Short.class, f0Var);
        g0 g0Var = new g0();
        f2087l = g0Var;
        f2088m = c(Integer.TYPE, Integer.class, g0Var);
        j.d.d.w<AtomicInteger> wVarA3 = new h0().a();
        f2089n = wVarA3;
        f2090o = b(AtomicInteger.class, wVarA3);
        j.d.d.w<AtomicBoolean> wVarA4 = new i0().a();
        p = wVarA4;
        q = b(AtomicBoolean.class, wVarA4);
        j.d.d.w<AtomicIntegerArray> wVarA5 = new a().a();
        r = wVarA5;
        s = b(AtomicIntegerArray.class, wVarA5);
        t = new b();
        u = new c();
        v = new d();
        e eVar = new e();
        w = eVar;
        x = c(Character.TYPE, Character.class, eVar);
        f fVar = new f();
        y = fVar;
        z = new g();
        A = new h();
        B = new i();
        C = b(String.class, fVar);
        j jVar = new j();
        D = jVar;
        E = b(StringBuilder.class, jVar);
        l lVar = new l();
        F = lVar;
        G = b(StringBuffer.class, lVar);
        m mVar = new m();
        H = mVar;
        I = b(URL.class, mVar);
        C0244n c0244n = new C0244n();
        J = c0244n;
        K = b(URI.class, c0244n);
        o oVar = new o();
        L = oVar;
        M = e(InetAddress.class, oVar);
        p pVar = new p();
        N = pVar;
        O = b(UUID.class, pVar);
        j.d.d.w<Currency> wVarA6 = new q().a();
        P = wVarA6;
        Q = b(Currency.class, wVarA6);
        r rVar = new r();
        R = rVar;
        S = d(Calendar.class, GregorianCalendar.class, rVar);
        s sVar = new s();
        T = sVar;
        U = b(Locale.class, sVar);
        t tVar = new t();
        V = tVar;
        W = e(j.d.d.k.class, tVar);
        X = new u();
    }

    public static <TT> j.d.d.x a(j.d.d.a0.a<TT> aVar, j.d.d.w<TT> wVar) {
        return new w(aVar, wVar);
    }

    public static <TT> j.d.d.x b(Class<TT> cls, j.d.d.w<TT> wVar) {
        return new x(cls, wVar);
    }

    public static <TT> j.d.d.x c(Class<TT> cls, Class<TT> cls2, j.d.d.w<? super TT> wVar) {
        return new y(cls, cls2, wVar);
    }

    public static <TT> j.d.d.x d(Class<TT> cls, Class<? extends TT> cls2, j.d.d.w<? super TT> wVar) {
        return new z(cls, cls2, wVar);
    }

    public static <T1> j.d.d.x e(Class<T1> cls, j.d.d.w<T1> wVar) {
        return new a0(cls, wVar);
    }
}
