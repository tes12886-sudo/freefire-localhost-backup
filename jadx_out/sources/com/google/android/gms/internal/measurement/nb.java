package com.google.android.gms.internal.measurement;

import com.appff.haptic.base.Utils;
import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
final class nb {
    private static final Unsafe a;
    private static final Class<?> b;
    private static final boolean c;
    private static final boolean d;
    private static final mb e;
    private static final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final boolean f1086g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    static final long f1087h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    static final boolean f1088i;

    /* JADX WARN: Code duplicated, block: B:11:0x0048  */
    static {
        Unsafe unsafe;
        boolean z;
        Unsafe unsafe2;
        boolean z2;
        mb mbVar;
        Unsafe unsafeV = v();
        a = unsafeV;
        b = n7.a();
        Class<?> cls = Long.TYPE;
        boolean zW = w(cls);
        c = zW;
        boolean zW2 = w(Integer.TYPE);
        d = zW2;
        mb kbVar = null;
        if (unsafeV != null) {
            if (zW) {
                kbVar = new lb(unsafeV);
            } else if (zW2) {
                kbVar = new kb(unsafeV);
            }
        }
        e = kbVar;
        if (kbVar == null || (unsafe = kbVar.a) == null) {
            z = false;
        } else {
            try {
                Class<?> cls2 = unsafe.getClass();
                cls2.getMethod("objectFieldOffset", Field.class);
                cls2.getMethod("getLong", Object.class, cls);
                if (b() == null) {
                    z = false;
                } else {
                    z = true;
                }
            } catch (Throwable th) {
                x(th);
            }
        }
        f = z;
        mb mbVar2 = e;
        if (mbVar2 == null || (unsafe2 = mbVar2.a) == null) {
            z2 = false;
        } else {
            try {
                Class<?> cls3 = unsafe2.getClass();
                cls3.getMethod("objectFieldOffset", Field.class);
                cls3.getMethod("arrayBaseOffset", Class.class);
                cls3.getMethod("arrayIndexScale", Class.class);
                Class<?> cls4 = Long.TYPE;
                cls3.getMethod("getInt", Object.class, cls4);
                cls3.getMethod("putInt", Object.class, cls4, Integer.TYPE);
                cls3.getMethod("getLong", Object.class, cls4);
                cls3.getMethod("putLong", Object.class, cls4, cls4);
                cls3.getMethod("getObject", Object.class, cls4);
                cls3.getMethod("putObject", Object.class, cls4, Object.class);
                z2 = true;
            } catch (Throwable th2) {
                x(th2);
                z2 = false;
            }
        }
        f1086g = z2;
        f1087h = E(byte[].class);
        E(boolean[].class);
        a(boolean[].class);
        E(int[].class);
        a(int[].class);
        E(long[].class);
        a(long[].class);
        E(float[].class);
        a(float[].class);
        E(double[].class);
        a(double[].class);
        E(Object[].class);
        a(Object[].class);
        Field fieldB = b();
        if (fieldB != null && (mbVar = e) != null) {
            mbVar.h(fieldB);
        }
        f1088i = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    private nb() {
    }

    static /* synthetic */ boolean A(Object obj, long j2) {
        return ((byte) ((e.k(obj, (-4) & j2) >>> ((int) (((j2 ^ (-1)) & 3) << 3))) & Utils.MAX_STRENGTH_VALUE)) != 0;
    }

    static /* synthetic */ boolean B(Object obj, long j2) {
        return ((byte) ((e.k(obj, (-4) & j2) >>> ((int) ((j2 & 3) << 3))) & Utils.MAX_STRENGTH_VALUE)) != 0;
    }

    private static int E(Class<?> cls) {
        if (f1086g) {
            return e.i(cls);
        }
        return -1;
    }

    private static int a(Class<?> cls) {
        if (f1086g) {
            return e.j(cls);
        }
        return -1;
    }

    private static Field b() {
        int i2 = n7.a;
        Field fieldC = c(Buffer.class, "effectiveDirectAddress");
        if (fieldC != null) {
            return fieldC;
        }
        Field fieldC2 = c(Buffer.class, "address");
        if (fieldC2 == null || fieldC2.getType() != Long.TYPE) {
            return null;
        }
        return fieldC2;
    }

    private static Field c(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void d(Object obj, long j2, byte b2) {
        long j3 = (-4) & j2;
        mb mbVar = e;
        int i2 = ((((int) j2) ^ (-1)) & 3) << 3;
        mbVar.l(obj, j3, ((255 & b2) << i2) | (mbVar.k(obj, j3) & ((Utils.MAX_STRENGTH_VALUE << i2) ^ (-1))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void e(Object obj, long j2, byte b2) {
        long j3 = (-4) & j2;
        mb mbVar = e;
        int i2 = (((int) j2) & 3) << 3;
        mbVar.l(obj, j3, ((255 & b2) << i2) | (mbVar.k(obj, j3) & ((Utils.MAX_STRENGTH_VALUE << i2) ^ (-1))));
    }

    static boolean f() {
        return f1086g;
    }

    static boolean g() {
        return f;
    }

    static <T> T h(Class<T> cls) {
        try {
            return (T) a.allocateInstance(cls);
        } catch (InstantiationException e2) {
            throw new IllegalStateException(e2);
        }
    }

    static int i(Object obj, long j2) {
        return e.k(obj, j2);
    }

    static void j(Object obj, long j2, int i2) {
        e.l(obj, j2, i2);
    }

    static long k(Object obj, long j2) {
        return e.m(obj, j2);
    }

    static void l(Object obj, long j2, long j3) {
        e.n(obj, j2, j3);
    }

    static boolean m(Object obj, long j2) {
        return e.b(obj, j2);
    }

    static void n(Object obj, long j2, boolean z) {
        e.c(obj, j2, z);
    }

    static float o(Object obj, long j2) {
        return e.d(obj, j2);
    }

    static void p(Object obj, long j2, float f2) {
        e.e(obj, j2, f2);
    }

    static double q(Object obj, long j2) {
        return e.f(obj, j2);
    }

    static void r(Object obj, long j2, double d2) {
        e.g(obj, j2, d2);
    }

    static Object s(Object obj, long j2) {
        return e.o(obj, j2);
    }

    static void t(Object obj, long j2, Object obj2) {
        e.p(obj, j2, obj2);
    }

    static void u(byte[] bArr, long j2, byte b2) {
        e.a(bArr, f1087h + j2, b2);
    }

    static Unsafe v() {
        try {
            return (Unsafe) AccessController.doPrivileged(new jb());
        } catch (Throwable unused) {
            return null;
        }
    }

    static boolean w(Class<?> cls) {
        int i2 = n7.a;
        try {
            Class<?> cls2 = b;
            Class<?> cls3 = Boolean.TYPE;
            cls2.getMethod("peekLong", cls, cls3);
            cls2.getMethod("pokeLong", cls, Long.TYPE, cls3);
            Class<?> cls4 = Integer.TYPE;
            cls2.getMethod("pokeInt", cls, cls4, cls3);
            cls2.getMethod("peekInt", cls, cls3);
            cls2.getMethod("pokeByte", cls, Byte.TYPE);
            cls2.getMethod("peekByte", cls);
            cls2.getMethod("pokeByteArray", cls, byte[].class, cls4, cls4);
            cls2.getMethod("peekByteArray", cls, byte[].class, cls4, cls4);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    static /* synthetic */ void x(Throwable th) {
        Logger logger = Logger.getLogger(nb.class.getName());
        Level level = Level.WARNING;
        String strValueOf = String.valueOf(th);
        StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 71);
        sb.append("platform method missing - proto runtime falling back to safer methods: ");
        sb.append(strValueOf);
        logger.logp(level, "com.google.protobuf.UnsafeUtil", "logMissingMethod", sb.toString());
    }
}
