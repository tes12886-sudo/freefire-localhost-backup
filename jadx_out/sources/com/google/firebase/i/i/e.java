package com.google.firebase.i.i;

import android.util.Base64;
import android.util.JsonWriter;
import com.google.firebase.i.f;
import com.google.firebase.i.g;
import java.io.IOException;
import java.io.Writer;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class e implements com.google.firebase.i.e, g {
    private e a = null;
    private boolean b = true;
    private final JsonWriter c;
    private final Map<Class<?>, com.google.firebase.i.d<?>> d;
    private final Map<Class<?>, f<?>> e;
    private final com.google.firebase.i.d<Object> f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f1437g;

    e(Writer writer, Map<Class<?>, com.google.firebase.i.d<?>> map, Map<Class<?>, f<?>> map2, com.google.firebase.i.d<Object> dVar, boolean z) {
        this.c = new JsonWriter(writer);
        this.d = map;
        this.e = map2;
        this.f = dVar;
        this.f1437g = z;
    }

    private boolean q(Object obj) {
        return obj == null || obj.getClass().isArray() || (obj instanceof Collection) || (obj instanceof Date) || (obj instanceof Enum) || (obj instanceof Number);
    }

    private e t(String str, Object obj) throws IOException {
        v();
        this.c.name(str);
        if (obj != null) {
            return i(obj, false);
        }
        this.c.nullValue();
        return this;
    }

    private e u(String str, Object obj) throws IOException {
        if (obj == null) {
            return this;
        }
        v();
        this.c.name(str);
        return i(obj, false);
    }

    private void v() throws IOException {
        if (!this.b) {
            throw new IllegalStateException("Parent context used since this context was created. Cannot use this context anymore.");
        }
        e eVar = this.a;
        if (eVar != null) {
            eVar.v();
            this.a.b = false;
            this.a = null;
            this.c.endObject();
        }
    }

    @Override // com.google.firebase.i.e
    public com.google.firebase.i.e a(com.google.firebase.i.c cVar, boolean z) throws IOException {
        n(cVar.b(), z);
        return this;
    }

    @Override // com.google.firebase.i.e
    public com.google.firebase.i.e b(com.google.firebase.i.c cVar, long j2) throws IOException {
        l(cVar.b(), j2);
        return this;
    }

    @Override // com.google.firebase.i.e
    public com.google.firebase.i.e c(com.google.firebase.i.c cVar, int i2) throws IOException {
        k(cVar.b(), i2);
        return this;
    }

    @Override // com.google.firebase.i.g
    public /* bridge */ /* synthetic */ g d(String str) throws IOException {
        j(str);
        return this;
    }

    @Override // com.google.firebase.i.g
    public /* bridge */ /* synthetic */ g e(boolean z) throws IOException {
        o(z);
        return this;
    }

    @Override // com.google.firebase.i.e
    public com.google.firebase.i.e f(com.google.firebase.i.c cVar, Object obj) {
        return m(cVar.b(), obj);
    }

    public e g(int i2) throws IOException {
        v();
        this.c.value(i2);
        return this;
    }

    public e h(long j2) throws IOException {
        v();
        this.c.value(j2);
        return this;
    }

    e i(Object obj, boolean z) throws IOException {
        int i2 = 0;
        if (z && q(obj)) {
            Object[] objArr = new Object[1];
            objArr[0] = obj == null ? null : obj.getClass();
            throw new com.google.firebase.i.b(String.format("%s cannot be encoded inline", objArr));
        }
        if (obj == null) {
            this.c.nullValue();
            return this;
        }
        if (obj instanceof Number) {
            this.c.value((Number) obj);
            return this;
        }
        if (!obj.getClass().isArray()) {
            if (obj instanceof Collection) {
                this.c.beginArray();
                Iterator it = ((Collection) obj).iterator();
                while (it.hasNext()) {
                    i(it.next(), false);
                }
                this.c.endArray();
                return this;
            }
            if (obj instanceof Map) {
                this.c.beginObject();
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    Object key = entry.getKey();
                    try {
                        m((String) key, entry.getValue());
                    } catch (ClassCastException e) {
                        throw new com.google.firebase.i.b(String.format("Only String keys are currently supported in maps, got %s of type %s instead.", key, key.getClass()), e);
                    }
                }
                this.c.endObject();
                return this;
            }
            com.google.firebase.i.d<?> dVar = this.d.get(obj.getClass());
            if (dVar != null) {
                s(dVar, obj, z);
                return this;
            }
            f<?> fVar = this.e.get(obj.getClass());
            if (fVar != null) {
                fVar.a(obj, this);
                return this;
            }
            if (obj instanceof Enum) {
                j(((Enum) obj).name());
                return this;
            }
            s(this.f, obj, z);
            return this;
        }
        if (obj instanceof byte[]) {
            p((byte[]) obj);
            return this;
        }
        this.c.beginArray();
        if (obj instanceof int[]) {
            int[] iArr = (int[]) obj;
            int length = iArr.length;
            while (i2 < length) {
                this.c.value(iArr[i2]);
                i2++;
            }
        } else if (obj instanceof long[]) {
            long[] jArr = (long[]) obj;
            int length2 = jArr.length;
            while (i2 < length2) {
                h(jArr[i2]);
                i2++;
            }
        } else if (obj instanceof double[]) {
            double[] dArr = (double[]) obj;
            int length3 = dArr.length;
            while (i2 < length3) {
                this.c.value(dArr[i2]);
                i2++;
            }
        } else if (obj instanceof boolean[]) {
            boolean[] zArr = (boolean[]) obj;
            int length4 = zArr.length;
            while (i2 < length4) {
                this.c.value(zArr[i2]);
                i2++;
            }
        } else if (obj instanceof Number[]) {
            for (Number number : (Number[]) obj) {
                i(number, false);
            }
        } else {
            for (Object obj2 : (Object[]) obj) {
                i(obj2, false);
            }
        }
        this.c.endArray();
        return this;
    }

    public e j(String str) throws IOException {
        v();
        this.c.value(str);
        return this;
    }

    public e k(String str, int i2) throws IOException {
        v();
        this.c.name(str);
        g(i2);
        return this;
    }

    public e l(String str, long j2) throws IOException {
        v();
        this.c.name(str);
        h(j2);
        return this;
    }

    public e m(String str, Object obj) {
        return this.f1437g ? u(str, obj) : t(str, obj);
    }

    public e n(String str, boolean z) throws IOException {
        v();
        this.c.name(str);
        o(z);
        return this;
    }

    public e o(boolean z) throws IOException {
        v();
        this.c.value(z);
        return this;
    }

    public e p(byte[] bArr) throws IOException {
        v();
        if (bArr == null) {
            this.c.nullValue();
        } else {
            this.c.value(Base64.encodeToString(bArr, 2));
        }
        return this;
    }

    void r() throws IOException {
        v();
        this.c.flush();
    }

    e s(com.google.firebase.i.d<Object> dVar, Object obj, boolean z) throws IOException {
        if (!z) {
            this.c.beginObject();
        }
        dVar.a(obj, this);
        if (!z) {
            this.c.endObject();
        }
        return this;
    }
}
