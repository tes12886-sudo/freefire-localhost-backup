package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.v8;
import com.google.android.gms.internal.measurement.z8;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class z8<MessageType extends z8<MessageType, BuilderType>, BuilderType extends v8<MessageType, BuilderType>> extends l7<MessageType, BuilderType> {
    private static final Map<Object, z8<?, ?>> zza = new ConcurrentHashMap();
    protected eb zzc = eb.a();
    protected int zzd = -1;

    static Object k(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    protected static d9 m() {
        return a9.c();
    }

    protected static e9 n() {
        return r9.c();
    }

    protected static e9 o(e9 e9Var) {
        int size = e9Var.size();
        return e9Var.k(size == 0 ? 10 : size + size);
    }

    protected static <E> f9<E> p() {
        return ma.c();
    }

    protected static <E> f9<E> q(f9<E> f9Var) {
        int size = f9Var.size();
        return f9Var.k(size == 0 ? 10 : size + size);
    }

    static <T extends z8> T t(Class<T> cls) {
        Map<Object, z8<?, ?>> map = zza;
        z8<?, ?> z8Var = map.get(cls);
        if (z8Var == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                z8Var = map.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (z8Var == null) {
            z8Var = (z8) ((z8) nb.h(cls)).w(6, null, null);
            if (z8Var == null) {
                throw new IllegalStateException();
            }
            map.put(cls, z8Var);
        }
        return z8Var;
    }

    protected static <T extends z8> void u(Class<T> cls, T t) {
        zza.put(cls, t);
    }

    protected static Object v(da daVar, String str, Object[] objArr) {
        return new na(daVar, str, objArr);
    }

    @Override // com.google.android.gms.internal.measurement.l7
    final int c() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.measurement.da
    public final int d() {
        int i2 = this.zzd;
        if (i2 != -1) {
            return i2;
        }
        int iB = la.a().b(getClass()).b(this);
        this.zzd = iB;
        return iB;
    }

    @Override // com.google.android.gms.internal.measurement.da
    public final /* bridge */ /* synthetic */ ca e() {
        return (v8) w(5, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return la.a().b(getClass()).h(this, (z8) obj);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.l7
    final void f(int i2) {
        this.zzd = i2;
    }

    @Override // com.google.android.gms.internal.measurement.da
    public final void g(g8 g8Var) {
        la.a().b(getClass()).d(this, h8.l(g8Var));
    }

    @Override // com.google.android.gms.internal.measurement.ea
    public final /* bridge */ /* synthetic */ da h() {
        return (z8) w(6, null, null);
    }

    public final int hashCode() {
        int i2 = this.zzb;
        if (i2 != 0) {
            return i2;
        }
        int iG = la.a().b(getClass()).g(this);
        this.zzb = iG;
        return iG;
    }

    @Override // com.google.android.gms.internal.measurement.da
    public final /* bridge */ /* synthetic */ ca i() {
        v8 v8Var = (v8) w(5, null, null);
        v8Var.q(this);
        return v8Var;
    }

    protected final <MessageType extends z8<MessageType, BuilderType>, BuilderType extends v8<MessageType, BuilderType>> BuilderType r() {
        return (BuilderType) w(5, null, null);
    }

    public final BuilderType s() {
        BuilderType buildertype = (BuilderType) w(5, null, null);
        buildertype.q(this);
        return buildertype;
    }

    public final String toString() {
        return fa.a(this, super.toString());
    }

    protected abstract Object w(int i2, Object obj, Object obj2);
}
