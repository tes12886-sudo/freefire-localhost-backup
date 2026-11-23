package j.d.a.c.e;

import android.os.IBinder;
import com.google.android.gms.common.internal.q;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes.dex */
public final class b<T> extends a.AbstractBinderC0233a {
    private final Object a;

    private b(Object obj) {
        this.a = obj;
    }

    public static <T> a c1(T t) {
        return new b(t);
    }

    public static <T> T o(a aVar) {
        if (aVar instanceof b) {
            return (T) ((b) aVar).a;
        }
        IBinder iBinderAsBinder = aVar.asBinder();
        Field[] declaredFields = iBinderAsBinder.getClass().getDeclaredFields();
        Field field = null;
        int i2 = 0;
        for (Field field2 : declaredFields) {
            if (!field2.isSynthetic()) {
                i2++;
                field = field2;
            }
        }
        if (i2 != 1) {
            throw new IllegalArgumentException("Unexpected number of IObjectWrapper declared fields: " + declaredFields.length);
        }
        q.k(field);
        if (field.isAccessible()) {
            throw new IllegalArgumentException("IObjectWrapper declared field not private!");
        }
        field.setAccessible(true);
        try {
            return (T) field.get(iBinderAsBinder);
        } catch (IllegalAccessException e) {
            throw new IllegalArgumentException("Could not access the field in remoteBinder.", e);
        } catch (NullPointerException e2) {
            throw new IllegalArgumentException("Binder object is null.", e2);
        }
    }
}
