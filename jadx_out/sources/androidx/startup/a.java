package androidx.startup;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class a {
    private static volatile a d;
    private static final Object e = new Object();
    final Context c;
    final Set<Class<? extends b<?>>> b = new HashSet();
    final Map<Class<?>, Object> a = new HashMap();

    a(Context context) {
        this.c = context.getApplicationContext();
    }

    public static a c(Context context) {
        if (d == null) {
            synchronized (e) {
                if (d == null) {
                    d = new a(context);
                }
            }
        }
        return d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    void a() {
        try {
            try {
                h.s.a.a("Startup");
                Bundle bundle = this.c.getPackageManager().getProviderInfo(new ComponentName(this.c.getPackageName(), InitializationProvider.class.getName()), 128).metaData;
                String string = this.c.getString(c.a);
                if (bundle != null) {
                    HashSet hashSet = new HashSet();
                    for (String str : bundle.keySet()) {
                        if (string.equals(bundle.getString(str, null))) {
                            Class<?> cls = Class.forName(str);
                            if (b.class.isAssignableFrom(cls)) {
                                this.b.add((Class<? extends b<?>>) cls);
                                b(cls, hashSet);
                            } else {
                                continue;
                            }
                        }
                    }
                }
                h.s.a.b();
            } catch (Throwable th) {
                h.s.a.b();
                throw th;
            }
        } catch (PackageManager.NameNotFoundException | ClassNotFoundException e2) {
            throw new d(e2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x001f A[Catch: all -> 0x008c, TRY_LEAVE, TryCatch #2 {all -> 0x008c, blocks: (B:6:0x0009, B:7:0x0010, B:9:0x0017, B:11:0x001f, B:23:0x0066, B:24:0x006b, B:25:0x006c, B:29:0x0077, B:30:0x008b, B:12:0x0022, B:14:0x003a, B:15:0x003e, B:17:0x0044, B:19:0x0052, B:20:0x0056), top: B:42:0x0009, outer: #0, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:14:0x003a A[Catch: all -> 0x0065, TryCatch #1 {all -> 0x0065, blocks: (B:12:0x0022, B:14:0x003a, B:15:0x003e, B:17:0x0044, B:19:0x0052, B:20:0x0056), top: B:40:0x0022, outer: #2 }] */
    /* JADX WARN: Code duplicated, block: B:17:0x0044 A[Catch: all -> 0x0065, TryCatch #1 {all -> 0x0065, blocks: (B:12:0x0022, B:14:0x003a, B:15:0x003e, B:17:0x0044, B:19:0x0052, B:20:0x0056), top: B:40:0x0022, outer: #2 }] */
    /* JADX WARN: Code duplicated, block: B:25:0x006c A[Catch: all -> 0x008c, TRY_LEAVE, TryCatch #2 {all -> 0x008c, blocks: (B:6:0x0009, B:7:0x0010, B:9:0x0017, B:11:0x001f, B:23:0x0066, B:24:0x006b, B:25:0x006c, B:29:0x0077, B:30:0x008b, B:12:0x0022, B:14:0x003a, B:15:0x003e, B:17:0x0044, B:19:0x0052, B:20:0x0056), top: B:42:0x0009, outer: #0, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:29:0x0077 A[Catch: all -> 0x008c, TRY_ENTER, TryCatch #2 {all -> 0x008c, blocks: (B:6:0x0009, B:7:0x0010, B:9:0x0017, B:11:0x001f, B:23:0x0066, B:24:0x006b, B:25:0x006c, B:29:0x0077, B:30:0x008b, B:12:0x0022, B:14:0x003a, B:15:0x003e, B:17:0x0044, B:19:0x0052, B:20:0x0056), top: B:42:0x0009, outer: #0, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:44:0x0052 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:46:0x003e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:9:0x0017 A[Catch: all -> 0x008c, TryCatch #2 {all -> 0x008c, blocks: (B:6:0x0009, B:7:0x0010, B:9:0x0017, B:11:0x001f, B:23:0x0066, B:24:0x006b, B:25:0x006c, B:29:0x0077, B:30:0x008b, B:12:0x0022, B:14:0x003a, B:15:0x003e, B:17:0x0044, B:19:0x0052, B:20:0x0056), top: B:42:0x0009, outer: #0, inners: #1 }] */
    <T> T b(Class<? extends b<?>> cls, Set<Class<?>> set) {
        T t;
        List<Class<? extends b<?>>> listA;
        synchronized (e) {
            if (h.s.a.d()) {
                try {
                    h.s.a.a(cls.getSimpleName());
                    if (!set.contains(cls)) {
                        throw new IllegalStateException(String.format("Cannot initialize %s. Cycle detected.", cls.getName()));
                    }
                    if (this.a.containsKey(cls)) {
                        t = (T) this.a.get(cls);
                    } else {
                        set.add(cls);
                        try {
                            b<?> bVarNewInstance = cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                            listA = bVarNewInstance.a();
                            if (!listA.isEmpty()) {
                                for (Class<? extends b<?>> cls2 : listA) {
                                    if (!this.a.containsKey(cls2)) {
                                        b(cls2, set);
                                    }
                                }
                            }
                            t = (T) bVarNewInstance.b(this.c);
                            set.remove(cls);
                            this.a.put(cls, t);
                        } catch (Throwable th) {
                            throw new d(th);
                        }
                    }
                    h.s.a.b();
                } catch (Throwable th2) {
                    h.s.a.b();
                    throw th2;
                }
            } else {
                if (!set.contains(cls)) {
                    throw new IllegalStateException(String.format("Cannot initialize %s. Cycle detected.", cls.getName()));
                }
                if (this.a.containsKey(cls)) {
                    set.add(cls);
                    b<?> bVarNewInstance2 = cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                    listA = bVarNewInstance2.a();
                    if (!listA.isEmpty()) {
                        while (r2.hasNext()) {
                            if (!this.a.containsKey(cls2)) {
                                b(cls2, set);
                            }
                        }
                    }
                    t = (T) bVarNewInstance2.b(this.c);
                    set.remove(cls);
                    this.a.put(cls, t);
                } else {
                    t = (T) this.a.get(cls);
                }
                h.s.a.b();
            }
            throw th;
        }
        return t;
    }

    public <T> T d(Class<? extends b<T>> cls) {
        return (T) b(cls, new HashSet());
    }
}
