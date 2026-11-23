package j.d.a.c.f.g;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class c implements com.google.firebase.i.e {
    private static final Charset f = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final com.google.firebase.i.c f1969g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final com.google.firebase.i.c f1970h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final com.google.firebase.i.d<Map.Entry<Object, Object>> f1971i;
    private OutputStream a;
    private final Map<Class<?>, com.google.firebase.i.d<?>> b;
    private final Map<Class<?>, com.google.firebase.i.f<?>> c;
    private final com.google.firebase.i.d<Object> d;
    private final g e = new g(this);

    static {
        com.google.firebase.i.c.b bVarA = com.google.firebase.i.c.a("key");
        b0 b0Var = new b0();
        b0Var.a(1);
        bVarA.b(b0Var.b());
        f1969g = bVarA.a();
        com.google.firebase.i.c.b bVarA2 = com.google.firebase.i.c.a("value");
        b0 b0Var2 = new b0();
        b0Var2.a(2);
        bVarA2.b(b0Var2.b());
        f1970h = bVarA2.a();
        f1971i = b.a;
    }

    c(OutputStream outputStream, Map<Class<?>, com.google.firebase.i.d<?>> map, Map<Class<?>, com.google.firebase.i.f<?>> map2, com.google.firebase.i.d<Object> dVar) {
        this.a = outputStream;
        this.b = map;
        this.c = map2;
        this.d = dVar;
    }

    static final /* synthetic */ void k(Map.Entry entry, com.google.firebase.i.e eVar) {
        eVar.f(f1969g, entry.getKey());
        eVar.f(f1970h, entry.getValue());
    }

    private final <T> c l(com.google.firebase.i.d<T> dVar, com.google.firebase.i.c cVar, T t, boolean z) throws IOException {
        long jM = m(dVar, t);
        if (z && jM == 0) {
            return this;
        }
        r((p(cVar) << 3) | 2);
        s(jM);
        dVar.a(t, this);
        return this;
    }

    private final <T> long m(com.google.firebase.i.d<T> dVar, T t) throws IOException {
        c0 c0Var = new c0();
        try {
            OutputStream outputStream = this.a;
            this.a = c0Var;
            try {
                dVar.a(t, this);
                this.a = outputStream;
                long jB = c0Var.b();
                c0Var.close();
                return jB;
            } catch (Throwable th) {
                this.a = outputStream;
                throw th;
            }
        } catch (Throwable th2) {
            try {
                c0Var.close();
            } catch (Throwable th3) {
                z.a(th2, th3);
            }
            throw th2;
        }
    }

    private final <T> c n(com.google.firebase.i.f<T> fVar, com.google.firebase.i.c cVar, T t, boolean z) {
        this.e.a(cVar, z);
        fVar.a(t, this.e);
        return this;
    }

    private static ByteBuffer o(int i2) {
        return ByteBuffer.allocate(i2).order(ByteOrder.LITTLE_ENDIAN);
    }

    private static int p(com.google.firebase.i.c cVar) {
        f0 f0Var = (f0) cVar.c(f0.class);
        if (f0Var != null) {
            return f0Var.zza();
        }
        throw new com.google.firebase.i.b("Field has no @Protobuf config");
    }

    private static f0 q(com.google.firebase.i.c cVar) {
        f0 f0Var = (f0) cVar.c(f0.class);
        if (f0Var != null) {
            return f0Var;
        }
        throw new com.google.firebase.i.b("Field has no @Protobuf config");
    }

    private final void r(int i2) throws IOException {
        while (true) {
            long j2 = i2 & (-128);
            OutputStream outputStream = this.a;
            if (j2 == 0) {
                outputStream.write(i2 & 127);
                return;
            } else {
                outputStream.write((i2 & 127) | 128);
                i2 >>>= 7;
            }
        }
    }

    private final void s(long j2) throws IOException {
        while (true) {
            long j3 = (-128) & j2;
            OutputStream outputStream = this.a;
            if (j3 == 0) {
                outputStream.write(((int) j2) & 127);
                return;
            } else {
                outputStream.write((((int) j2) & 127) | 128);
                j2 >>>= 7;
            }
        }
    }

    @Override // com.google.firebase.i.e
    public final /* bridge */ /* synthetic */ com.google.firebase.i.e a(com.google.firebase.i.c cVar, boolean z) {
        h(cVar, z ? 1 : 0, true);
        return this;
    }

    @Override // com.google.firebase.i.e
    public final /* bridge */ /* synthetic */ com.google.firebase.i.e b(com.google.firebase.i.c cVar, long j2) throws IOException {
        i(cVar, j2, true);
        return this;
    }

    @Override // com.google.firebase.i.e
    public final /* bridge */ /* synthetic */ com.google.firebase.i.e c(com.google.firebase.i.c cVar, int i2) {
        h(cVar, i2, true);
        return this;
    }

    final com.google.firebase.i.e d(com.google.firebase.i.c cVar, Object obj, boolean z) {
        if (obj == null) {
            return this;
        }
        if (obj instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) obj;
            if (z && charSequence.length() == 0) {
                return this;
            }
            r((p(cVar) << 3) | 2);
            byte[] bytes = charSequence.toString().getBytes(f);
            r(bytes.length);
            this.a.write(bytes);
            return this;
        }
        if (obj instanceof Collection) {
            Iterator it = ((Collection) obj).iterator();
            while (it.hasNext()) {
                d(cVar, it.next(), false);
            }
            return this;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                l(f1971i, cVar, (Map.Entry) it2.next(), false);
            }
            return this;
        }
        if (obj instanceof Double) {
            e(cVar, ((Double) obj).doubleValue(), z);
            return this;
        }
        if (obj instanceof Float) {
            g(cVar, ((Float) obj).floatValue(), z);
            return this;
        }
        if (obj instanceof Number) {
            i(cVar, ((Number) obj).longValue(), z);
            return this;
        }
        if (obj instanceof Boolean) {
            h(cVar, ((Boolean) obj).booleanValue() ? 1 : 0, z);
            return this;
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            if (z && bArr.length == 0) {
                return this;
            }
            r((p(cVar) << 3) | 2);
            r(bArr.length);
            this.a.write(bArr);
            return this;
        }
        com.google.firebase.i.d<?> dVar = this.b.get(obj.getClass());
        if (dVar != null) {
            l(dVar, cVar, obj, z);
            return this;
        }
        com.google.firebase.i.f<?> fVar = this.c.get(obj.getClass());
        if (fVar != null) {
            n(fVar, cVar, obj, z);
            return this;
        }
        if (obj instanceof d0) {
            h(cVar, ((d0) obj).a(), true);
            return this;
        }
        if (obj instanceof Enum) {
            h(cVar, ((Enum) obj).ordinal(), true);
            return this;
        }
        l(this.d, cVar, obj, z);
        return this;
    }

    final com.google.firebase.i.e e(com.google.firebase.i.c cVar, double d, boolean z) throws IOException {
        if (z && d == 0.0d) {
            return this;
        }
        r((p(cVar) << 3) | 1);
        this.a.write(o(8).putDouble(d).array());
        return this;
    }

    @Override // com.google.firebase.i.e
    public final com.google.firebase.i.e f(com.google.firebase.i.c cVar, Object obj) {
        d(cVar, obj, true);
        return this;
    }

    final com.google.firebase.i.e g(com.google.firebase.i.c cVar, float f2, boolean z) throws IOException {
        if (z && f2 == 0.0f) {
            return this;
        }
        r((p(cVar) << 3) | 5);
        this.a.write(o(4).putFloat(f2).array());
        return this;
    }

    final c h(com.google.firebase.i.c cVar, int i2, boolean z) {
        if (z && i2 == 0) {
            return this;
        }
        f0 f0VarQ = q(cVar);
        e0 e0Var = e0.DEFAULT;
        int iOrdinal = f0VarQ.zzb().ordinal();
        if (iOrdinal == 0) {
            r(f0VarQ.zza() << 3);
            r(i2);
        } else if (iOrdinal == 1) {
            r(f0VarQ.zza() << 3);
            r((i2 + i2) ^ (i2 >> 31));
        } else if (iOrdinal == 2) {
            r((f0VarQ.zza() << 3) | 5);
            this.a.write(o(4).putInt(i2).array());
        }
        return this;
    }

    final c i(com.google.firebase.i.c cVar, long j2, boolean z) throws IOException {
        if (z && j2 == 0) {
            return this;
        }
        f0 f0VarQ = q(cVar);
        e0 e0Var = e0.DEFAULT;
        int iOrdinal = f0VarQ.zzb().ordinal();
        if (iOrdinal == 0) {
            r(f0VarQ.zza() << 3);
            s(j2);
        } else if (iOrdinal == 1) {
            r(f0VarQ.zza() << 3);
            s((j2 >> 63) ^ (j2 + j2));
        } else if (iOrdinal == 2) {
            r((f0VarQ.zza() << 3) | 1);
            this.a.write(o(8).putLong(j2).array());
        }
        return this;
    }

    final c j(Object obj) {
        if (obj == null) {
            return this;
        }
        com.google.firebase.i.d<?> dVar = this.b.get(obj.getClass());
        if (dVar != null) {
            dVar.a(obj, this);
            return this;
        }
        String strValueOf = String.valueOf(obj.getClass());
        StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 15);
        sb.append("No encoder for ");
        sb.append(strValueOf);
        throw new com.google.firebase.i.b(sb.toString());
    }
}
