package o;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

/* JADX INFO: loaded from: classes.dex */
class q {
    private static final q c = e();
    private final boolean a;

    @Nullable
    private final Constructor<MethodHandles.Lookup> b;

    static final class a extends q {

        /* JADX INFO: renamed from: o.q$a$a, reason: collision with other inner class name */
        static final class ExecutorC0284a implements Executor {
            private final Handler a = new Handler(Looper.getMainLooper());

            ExecutorC0284a() {
            }

            @Override // java.util.concurrent.Executor
            public void execute(Runnable runnable) {
                this.a.post(runnable);
            }
        }

        a() {
            super(Build.VERSION.SDK_INT >= 24);
        }

        @Override // o.q
        public Executor b() {
            return new ExecutorC0284a();
        }

        @Override // o.q
        @Nullable
        Object g(Method method, Class<?> cls, Object obj, Object... objArr) {
            if (Build.VERSION.SDK_INT >= 26) {
                return super.g(method, cls, obj, objArr);
            }
            throw new UnsupportedOperationException("Calling default methods on API 24 and 25 is not supported");
        }
    }

    q(boolean z) {
        this.a = z;
        Constructor<MethodHandles.Lookup> declaredConstructor = null;
        if (z) {
            try {
                declaredConstructor = MethodHandles.Lookup.class.getDeclaredConstructor(Class.class, Integer.TYPE);
                declaredConstructor.setAccessible(true);
            } catch (NoClassDefFoundError | NoSuchMethodException unused) {
            }
        }
        this.b = declaredConstructor;
    }

    private static q e() {
        return "Dalvik".equals(System.getProperty("java.vm.name")) ? new a() : new q(true);
    }

    static q f() {
        return c;
    }

    List<? extends e.a> a(@Nullable Executor executor) {
        i iVar = new i(executor);
        return this.a ? Arrays.asList(g.a, iVar) : Collections.singletonList(iVar);
    }

    @Nullable
    Executor b() {
        return null;
    }

    List<? extends h.a> c() {
        return this.a ? Collections.singletonList(o.a) : Collections.emptyList();
    }

    int d() {
        return this.a ? 1 : 0;
    }

    @Nullable
    @IgnoreJRERequirement
    Object g(Method method, Class<?> cls, Object obj, Object... objArr) {
        Constructor<MethodHandles.Lookup> constructor = this.b;
        return (constructor != null ? constructor.newInstance(cls, -1) : MethodHandles.lookup()).unreflectSpecial(method, cls).bindTo(obj).invokeWithArguments(objArr);
    }

    @IgnoreJRERequirement
    boolean h(Method method) {
        return this.a && method.isDefault();
    }
}
