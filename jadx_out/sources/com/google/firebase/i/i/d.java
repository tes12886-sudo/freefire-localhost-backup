package com.google.firebase.i.i;

import com.google.firebase.i.f;
import com.google.firebase.i.g;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes.dex */
public final class d implements com.google.firebase.i.h.b<d> {
    private static final com.google.firebase.i.d<Object> e = new com.google.firebase.i.d() { // from class: com.google.firebase.i.i.a
        @Override // com.google.firebase.i.d
        public final void a(Object obj, Object obj2) {
            d.i(obj, (com.google.firebase.i.e) obj2);
            throw null;
        }
    };
    private static final f<String> f = new f() { // from class: com.google.firebase.i.i.b
        @Override // com.google.firebase.i.f
        public final void a(Object obj, Object obj2) {
            ((g) obj2).d((String) obj);
        }
    };

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final f<Boolean> f1435g = new f() { // from class: com.google.firebase.i.i.c
        @Override // com.google.firebase.i.f
        public final void a(Object obj, Object obj2) {
            ((g) obj2).e(((Boolean) obj).booleanValue());
        }
    };

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final b f1436h = new b(null);
    private final Map<Class<?>, com.google.firebase.i.d<?>> a = new HashMap();
    private final Map<Class<?>, f<?>> b = new HashMap();
    private com.google.firebase.i.d<Object> c = e;
    private boolean d = false;

    class a implements com.google.firebase.i.a {
        a() {
        }

        @Override // com.google.firebase.i.a
        public String a(Object obj) {
            StringWriter stringWriter = new StringWriter();
            try {
                b(obj, stringWriter);
            } catch (IOException unused) {
            }
            return stringWriter.toString();
        }

        @Override // com.google.firebase.i.a
        public void b(Object obj, Writer writer) throws IOException {
            e eVar = new e(writer, d.this.a, d.this.b, d.this.c, d.this.d);
            eVar.i(obj, false);
            eVar.r();
        }
    }

    private static final class b implements f<Date> {
        private static final DateFormat a;

        static {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
            a = simpleDateFormat;
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        }

        private b() {
        }

        /* synthetic */ b(a aVar) {
            this();
        }

        @Override // com.google.firebase.i.f
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(Date date, g gVar) {
            gVar.d(a.format(date));
        }
    }

    public d() {
        m(String.class, f);
        m(Boolean.class, f1435g);
        m(Date.class, f1436h);
    }

    static /* synthetic */ void i(Object obj, com.google.firebase.i.e eVar) {
        throw new com.google.firebase.i.b("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
    }

    @Override // com.google.firebase.i.h.b
    public /* bridge */ /* synthetic */ com.google.firebase.i.h.b a(Class cls, com.google.firebase.i.d dVar) {
        l(cls, dVar);
        return this;
    }

    public com.google.firebase.i.a f() {
        return new a();
    }

    public d g(com.google.firebase.i.h.a aVar) {
        aVar.a(this);
        return this;
    }

    public d h(boolean z) {
        this.d = z;
        return this;
    }

    public <T> d l(Class<T> cls, com.google.firebase.i.d<? super T> dVar) {
        this.a.put(cls, dVar);
        this.b.remove(cls);
        return this;
    }

    public <T> d m(Class<T> cls, f<? super T> fVar) {
        this.b.put(cls, fVar);
        this.a.remove(cls);
        return this;
    }
}
