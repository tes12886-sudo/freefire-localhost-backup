package o;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.net.URI;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.annotation.Nullable;
import m.b0;

/* JADX INFO: loaded from: classes.dex */
final class s {
    private final Method a;
    private final m.v b;
    final String c;

    @Nullable
    private final String d;

    @Nullable
    private final m.u e;

    @Nullable
    private final m.x f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f2361g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f2362h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final boolean f2363i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final p<?>[] f2364j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    final boolean f2365k;

    static final class a {
        private static final Pattern x = Pattern.compile("\\{([a-zA-Z][a-zA-Z0-9_-]*)\\}");
        private static final Pattern y = Pattern.compile("[a-zA-Z][a-zA-Z0-9_-]*");
        final u a;
        final Method b;
        final Annotation[] c;
        final Annotation[][] d;
        final Type[] e;
        boolean f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        boolean f2366g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        boolean f2367h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        boolean f2368i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        boolean f2369j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        boolean f2370k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        boolean f2371l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        boolean f2372m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        @Nullable
        String f2373n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        boolean f2374o;
        boolean p;
        boolean q;

        @Nullable
        String r;

        @Nullable
        m.u s;

        @Nullable
        m.x t;

        @Nullable
        Set<String> u;

        @Nullable
        p<?>[] v;
        boolean w;

        a(u uVar, Method method) {
            this.a = uVar;
            this.b = method;
            this.c = method.getAnnotations();
            this.e = method.getGenericParameterTypes();
            this.d = method.getParameterAnnotations();
        }

        private static Class<?> a(Class<?> cls) {
            if (Boolean.TYPE == cls) {
                return Boolean.class;
            }
            if (Byte.TYPE == cls) {
                return Byte.class;
            }
            if (Character.TYPE == cls) {
                return Character.class;
            }
            if (Double.TYPE == cls) {
                return Double.class;
            }
            if (Float.TYPE == cls) {
                return Float.class;
            }
            if (Integer.TYPE == cls) {
                return Integer.class;
            }
            if (Long.TYPE == cls) {
                return Long.class;
            }
            return Short.TYPE == cls ? Short.class : cls;
        }

        private m.u c(String[] strArr) {
            m.u.a aVar = new m.u.a();
            for (String str : strArr) {
                int iIndexOf = str.indexOf(58);
                if (iIndexOf == -1 || iIndexOf == 0 || iIndexOf == str.length() - 1) {
                    throw y.m(this.b, "@Headers value must be in the form \"Name: Value\". Found: \"%s\"", str);
                }
                String strSubstring = str.substring(0, iIndexOf);
                String strTrim = str.substring(iIndexOf + 1).trim();
                if ("Content-Type".equalsIgnoreCase(strSubstring)) {
                    try {
                        this.t = m.x.e(strTrim);
                    } catch (IllegalArgumentException e) {
                        throw y.n(this.b, e, "Malformed content type: %s", strTrim);
                    }
                } else {
                    aVar.a(strSubstring, strTrim);
                }
            }
            return aVar.e();
        }

        private void d(String str, String str2, boolean z) {
            String str3 = this.f2373n;
            if (str3 != null) {
                throw y.m(this.b, "Only one HTTP method is allowed. Found: %s and %s.", str3, str);
            }
            this.f2373n = str;
            this.f2374o = z;
            if (str2.isEmpty()) {
                return;
            }
            int iIndexOf = str2.indexOf(63);
            if (iIndexOf != -1 && iIndexOf < str2.length() - 1) {
                String strSubstring = str2.substring(iIndexOf + 1);
                if (x.matcher(strSubstring).find()) {
                    throw y.m(this.b, "URL query string \"%s\" must not have replace block. For dynamic query parameters use @Query.", strSubstring);
                }
            }
            this.r = str2;
            this.u = h(str2);
        }

        private void e(Annotation annotation) {
            String strValue;
            String str;
            String strValue2;
            String str2;
            if (annotation instanceof o.a0.b) {
                strValue = ((o.a0.b) annotation).value();
                str = "DELETE";
            } else if (annotation instanceof o.a0.f) {
                strValue = ((o.a0.f) annotation).value();
                str = "GET";
            } else {
                if (!(annotation instanceof o.a0.g)) {
                    if (annotation instanceof o.a0.n) {
                        strValue2 = ((o.a0.n) annotation).value();
                        str2 = "PATCH";
                    } else if (annotation instanceof o.a0.o) {
                        strValue2 = ((o.a0.o) annotation).value();
                        str2 = "POST";
                    } else if (annotation instanceof o.a0.p) {
                        strValue2 = ((o.a0.p) annotation).value();
                        str2 = "PUT";
                    } else {
                        if (!(annotation instanceof o.a0.m)) {
                            if (annotation instanceof o.a0.h) {
                                o.a0.h hVar = (o.a0.h) annotation;
                                d(hVar.method(), hVar.path(), hVar.hasBody());
                                return;
                            }
                            if (annotation instanceof o.a0.k) {
                                String[] strArrValue = ((o.a0.k) annotation).value();
                                if (strArrValue.length == 0) {
                                    throw y.m(this.b, "@Headers annotation is empty.", new Object[0]);
                                }
                                this.s = c(strArrValue);
                                return;
                            }
                            if (annotation instanceof o.a0.l) {
                                if (this.p) {
                                    throw y.m(this.b, "Only one encoding annotation is allowed.", new Object[0]);
                                }
                                this.q = true;
                                return;
                            } else {
                                if (annotation instanceof o.a0.e) {
                                    if (this.q) {
                                        throw y.m(this.b, "Only one encoding annotation is allowed.", new Object[0]);
                                    }
                                    this.p = true;
                                    return;
                                }
                                return;
                            }
                        }
                        strValue = ((o.a0.m) annotation).value();
                        str = "OPTIONS";
                    }
                    d(str2, strValue2, true);
                    return;
                }
                strValue = ((o.a0.g) annotation).value();
                str = "HEAD";
            }
            d(str, strValue, false);
        }

        @Nullable
        private p<?> f(int i2, Type type, @Nullable Annotation[] annotationArr, boolean z) {
            p<?> pVar;
            if (annotationArr != null) {
                pVar = null;
                for (Annotation annotation : annotationArr) {
                    p<?> pVarG = g(i2, type, annotationArr, annotation);
                    if (pVarG != null) {
                        if (pVar != null) {
                            throw y.o(this.b, i2, "Multiple Retrofit annotations found, only one allowed.", new Object[0]);
                        }
                        pVar = pVarG;
                    }
                }
            } else {
                pVar = null;
            }
            if (pVar != null) {
                return pVar;
            }
            if (z) {
                try {
                    if (y.h(type) == l.v.a.class) {
                        this.w = true;
                        return null;
                    }
                } catch (NoClassDefFoundError unused) {
                }
            }
            throw y.o(this.b, i2, "No Retrofit annotation found.", new Object[0]);
        }

        @Nullable
        private p<?> g(int i2, Type type, Annotation[] annotationArr, Annotation annotation) {
            if (annotation instanceof o.a0.y) {
                j(i2, type);
                if (this.f2372m) {
                    throw y.o(this.b, i2, "Multiple @Url method annotations found.", new Object[0]);
                }
                if (this.f2368i) {
                    throw y.o(this.b, i2, "@Path parameters may not be used with @Url.", new Object[0]);
                }
                if (this.f2369j) {
                    throw y.o(this.b, i2, "A @Url parameter must not come after a @Query.", new Object[0]);
                }
                if (this.f2370k) {
                    throw y.o(this.b, i2, "A @Url parameter must not come after a @QueryName.", new Object[0]);
                }
                if (this.f2371l) {
                    throw y.o(this.b, i2, "A @Url parameter must not come after a @QueryMap.", new Object[0]);
                }
                if (this.r != null) {
                    throw y.o(this.b, i2, "@Url cannot be used with @%s URL", this.f2373n);
                }
                this.f2372m = true;
                if (type == m.v.class || type == String.class || type == URI.class || ((type instanceof Class) && "android.net.Uri".equals(((Class) type).getName()))) {
                    return new p.C0283p(this.b, i2);
                }
                throw y.o(this.b, i2, "@Url must be okhttp3.HttpUrl, String, java.net.URI, or android.net.Uri type.", new Object[0]);
            }
            if (annotation instanceof o.a0.s) {
                j(i2, type);
                if (this.f2369j) {
                    throw y.o(this.b, i2, "A @Path parameter must not come after a @Query.", new Object[0]);
                }
                if (this.f2370k) {
                    throw y.o(this.b, i2, "A @Path parameter must not come after a @QueryName.", new Object[0]);
                }
                if (this.f2371l) {
                    throw y.o(this.b, i2, "A @Path parameter must not come after a @QueryMap.", new Object[0]);
                }
                if (this.f2372m) {
                    throw y.o(this.b, i2, "@Path parameters may not be used with @Url.", new Object[0]);
                }
                if (this.r == null) {
                    throw y.o(this.b, i2, "@Path can only be used with relative url on @%s", this.f2373n);
                }
                this.f2368i = true;
                o.a0.s sVar = (o.a0.s) annotation;
                String strValue = sVar.value();
                i(i2, strValue);
                return new p.k(this.b, i2, strValue, this.a.i(type, annotationArr), sVar.encoded());
            }
            if (annotation instanceof o.a0.t) {
                j(i2, type);
                o.a0.t tVar = (o.a0.t) annotation;
                String strValue2 = tVar.value();
                boolean zEncoded = tVar.encoded();
                Class<?> clsH = y.h(type);
                this.f2369j = true;
                if (!Iterable.class.isAssignableFrom(clsH)) {
                    return clsH.isArray() ? new p.l(strValue2, this.a.i(a(clsH.getComponentType()), annotationArr), zEncoded).b() : new p.l(strValue2, this.a.i(type, annotationArr), zEncoded);
                }
                if (type instanceof ParameterizedType) {
                    return new p.l(strValue2, this.a.i(y.g(0, (ParameterizedType) type), annotationArr), zEncoded).c();
                }
                throw y.o(this.b, i2, clsH.getSimpleName() + " must include generic type (e.g., " + clsH.getSimpleName() + "<String>)", new Object[0]);
            }
            if (annotation instanceof o.a0.v) {
                j(i2, type);
                boolean zEncoded2 = ((o.a0.v) annotation).encoded();
                Class<?> clsH2 = y.h(type);
                this.f2370k = true;
                if (!Iterable.class.isAssignableFrom(clsH2)) {
                    return clsH2.isArray() ? new p.n(this.a.i(a(clsH2.getComponentType()), annotationArr), zEncoded2).b() : new p.n(this.a.i(type, annotationArr), zEncoded2);
                }
                if (type instanceof ParameterizedType) {
                    return new p.n(this.a.i(y.g(0, (ParameterizedType) type), annotationArr), zEncoded2).c();
                }
                throw y.o(this.b, i2, clsH2.getSimpleName() + " must include generic type (e.g., " + clsH2.getSimpleName() + "<String>)", new Object[0]);
            }
            if (annotation instanceof o.a0.u) {
                j(i2, type);
                Class<?> clsH3 = y.h(type);
                this.f2371l = true;
                if (!Map.class.isAssignableFrom(clsH3)) {
                    throw y.o(this.b, i2, "@QueryMap parameter type must be Map.", new Object[0]);
                }
                Type typeI = y.i(type, clsH3, Map.class);
                if (!(typeI instanceof ParameterizedType)) {
                    throw y.o(this.b, i2, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                }
                ParameterizedType parameterizedType = (ParameterizedType) typeI;
                Type typeG = y.g(0, parameterizedType);
                if (String.class == typeG) {
                    return new p.m(this.b, i2, this.a.i(y.g(1, parameterizedType), annotationArr), ((o.a0.u) annotation).encoded());
                }
                throw y.o(this.b, i2, "@QueryMap keys must be of type String: " + typeG, new Object[0]);
            }
            if (annotation instanceof o.a0.i) {
                j(i2, type);
                String strValue3 = ((o.a0.i) annotation).value();
                Class<?> clsH4 = y.h(type);
                if (!Iterable.class.isAssignableFrom(clsH4)) {
                    return clsH4.isArray() ? new p.f(strValue3, this.a.i(a(clsH4.getComponentType()), annotationArr)).b() : new p.f(strValue3, this.a.i(type, annotationArr));
                }
                if (type instanceof ParameterizedType) {
                    return new p.f(strValue3, this.a.i(y.g(0, (ParameterizedType) type), annotationArr)).c();
                }
                throw y.o(this.b, i2, clsH4.getSimpleName() + " must include generic type (e.g., " + clsH4.getSimpleName() + "<String>)", new Object[0]);
            }
            if (annotation instanceof o.a0.j) {
                if (type == m.u.class) {
                    return new p.h(this.b, i2);
                }
                j(i2, type);
                Class<?> clsH5 = y.h(type);
                if (!Map.class.isAssignableFrom(clsH5)) {
                    throw y.o(this.b, i2, "@HeaderMap parameter type must be Map.", new Object[0]);
                }
                Type typeI2 = y.i(type, clsH5, Map.class);
                if (!(typeI2 instanceof ParameterizedType)) {
                    throw y.o(this.b, i2, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                }
                ParameterizedType parameterizedType2 = (ParameterizedType) typeI2;
                Type typeG2 = y.g(0, parameterizedType2);
                if (String.class == typeG2) {
                    return new p.g(this.b, i2, this.a.i(y.g(1, parameterizedType2), annotationArr));
                }
                throw y.o(this.b, i2, "@HeaderMap keys must be of type String: " + typeG2, new Object[0]);
            }
            if (annotation instanceof o.a0.c) {
                j(i2, type);
                if (!this.p) {
                    throw y.o(this.b, i2, "@Field parameters can only be used with form encoding.", new Object[0]);
                }
                o.a0.c cVar = (o.a0.c) annotation;
                String strValue4 = cVar.value();
                boolean zEncoded3 = cVar.encoded();
                this.f = true;
                Class<?> clsH6 = y.h(type);
                if (!Iterable.class.isAssignableFrom(clsH6)) {
                    return clsH6.isArray() ? new p.d(strValue4, this.a.i(a(clsH6.getComponentType()), annotationArr), zEncoded3).b() : new p.d(strValue4, this.a.i(type, annotationArr), zEncoded3);
                }
                if (type instanceof ParameterizedType) {
                    return new p.d(strValue4, this.a.i(y.g(0, (ParameterizedType) type), annotationArr), zEncoded3).c();
                }
                throw y.o(this.b, i2, clsH6.getSimpleName() + " must include generic type (e.g., " + clsH6.getSimpleName() + "<String>)", new Object[0]);
            }
            if (annotation instanceof o.a0.d) {
                j(i2, type);
                if (!this.p) {
                    throw y.o(this.b, i2, "@FieldMap parameters can only be used with form encoding.", new Object[0]);
                }
                Class<?> clsH7 = y.h(type);
                if (!Map.class.isAssignableFrom(clsH7)) {
                    throw y.o(this.b, i2, "@FieldMap parameter type must be Map.", new Object[0]);
                }
                Type typeI3 = y.i(type, clsH7, Map.class);
                if (!(typeI3 instanceof ParameterizedType)) {
                    throw y.o(this.b, i2, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                }
                ParameterizedType parameterizedType3 = (ParameterizedType) typeI3;
                Type typeG3 = y.g(0, parameterizedType3);
                if (String.class == typeG3) {
                    h hVarI = this.a.i(y.g(1, parameterizedType3), annotationArr);
                    this.f = true;
                    return new p.e(this.b, i2, hVarI, ((o.a0.d) annotation).encoded());
                }
                throw y.o(this.b, i2, "@FieldMap keys must be of type String: " + typeG3, new Object[0]);
            }
            if (annotation instanceof o.a0.q) {
                j(i2, type);
                if (!this.q) {
                    throw y.o(this.b, i2, "@Part parameters can only be used with multipart encoding.", new Object[0]);
                }
                o.a0.q qVar = (o.a0.q) annotation;
                this.f2366g = true;
                String strValue5 = qVar.value();
                Class<?> clsH8 = y.h(type);
                if (strValue5.isEmpty()) {
                    if (!Iterable.class.isAssignableFrom(clsH8)) {
                        if (clsH8.isArray()) {
                            if (m.y.b.class.isAssignableFrom(clsH8.getComponentType())) {
                                return p.o.a.b();
                            }
                            throw y.o(this.b, i2, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                        }
                        if (m.y.b.class.isAssignableFrom(clsH8)) {
                            return p.o.a;
                        }
                        throw y.o(this.b, i2, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                    }
                    if (type instanceof ParameterizedType) {
                        if (m.y.b.class.isAssignableFrom(y.h(y.g(0, (ParameterizedType) type)))) {
                            return p.o.a.c();
                        }
                        throw y.o(this.b, i2, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                    }
                    throw y.o(this.b, i2, clsH8.getSimpleName() + " must include generic type (e.g., " + clsH8.getSimpleName() + "<String>)", new Object[0]);
                }
                m.u uVarF = m.u.f("Content-Disposition", "form-data; name=\"" + strValue5 + "\"", "Content-Transfer-Encoding", qVar.encoding());
                if (!Iterable.class.isAssignableFrom(clsH8)) {
                    if (!clsH8.isArray()) {
                        if (m.y.b.class.isAssignableFrom(clsH8)) {
                            throw y.o(this.b, i2, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                        }
                        return new p.i(this.b, i2, uVarF, this.a.g(type, annotationArr, this.c));
                    }
                    Class<?> clsA = a(clsH8.getComponentType());
                    if (m.y.b.class.isAssignableFrom(clsA)) {
                        throw y.o(this.b, i2, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                    }
                    return new p.i(this.b, i2, uVarF, this.a.g(clsA, annotationArr, this.c)).b();
                }
                if (type instanceof ParameterizedType) {
                    Type typeG4 = y.g(0, (ParameterizedType) type);
                    if (m.y.b.class.isAssignableFrom(y.h(typeG4))) {
                        throw y.o(this.b, i2, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                    }
                    return new p.i(this.b, i2, uVarF, this.a.g(typeG4, annotationArr, this.c)).c();
                }
                throw y.o(this.b, i2, clsH8.getSimpleName() + " must include generic type (e.g., " + clsH8.getSimpleName() + "<String>)", new Object[0]);
            }
            if (annotation instanceof o.a0.r) {
                j(i2, type);
                if (!this.q) {
                    throw y.o(this.b, i2, "@PartMap parameters can only be used with multipart encoding.", new Object[0]);
                }
                this.f2366g = true;
                Class<?> clsH9 = y.h(type);
                if (!Map.class.isAssignableFrom(clsH9)) {
                    throw y.o(this.b, i2, "@PartMap parameter type must be Map.", new Object[0]);
                }
                Type typeI4 = y.i(type, clsH9, Map.class);
                if (!(typeI4 instanceof ParameterizedType)) {
                    throw y.o(this.b, i2, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                }
                ParameterizedType parameterizedType4 = (ParameterizedType) typeI4;
                Type typeG5 = y.g(0, parameterizedType4);
                if (String.class == typeG5) {
                    Type typeG6 = y.g(1, parameterizedType4);
                    if (m.y.b.class.isAssignableFrom(y.h(typeG6))) {
                        throw y.o(this.b, i2, "@PartMap values cannot be MultipartBody.Part. Use @Part List<Part> or a different value type instead.", new Object[0]);
                    }
                    return new p.j(this.b, i2, this.a.g(typeG6, annotationArr, this.c), ((o.a0.r) annotation).encoding());
                }
                throw y.o(this.b, i2, "@PartMap keys must be of type String: " + typeG5, new Object[0]);
            }
            if (annotation instanceof o.a0.a) {
                j(i2, type);
                if (this.p || this.q) {
                    throw y.o(this.b, i2, "@Body parameters cannot be used with form or multi-part encoding.", new Object[0]);
                }
                if (this.f2367h) {
                    throw y.o(this.b, i2, "Multiple @Body method annotations found.", new Object[0]);
                }
                try {
                    h hVarG = this.a.g(type, annotationArr, this.c);
                    this.f2367h = true;
                    return new p.c(this.b, i2, hVarG);
                } catch (RuntimeException e) {
                    throw y.p(this.b, e, i2, "Unable to create @Body converter for %s", type);
                }
            }
            if (!(annotation instanceof o.a0.x)) {
                return null;
            }
            j(i2, type);
            Class<?> clsH10 = y.h(type);
            for (int i3 = i2 - 1; i3 >= 0; i3--) {
                p<?> pVar = this.v[i3];
                if ((pVar instanceof p.q) && ((p.q) pVar).a.equals(clsH10)) {
                    throw y.o(this.b, i2, "@Tag type " + clsH10.getName() + " is duplicate of parameter #" + (i3 + 1) + " and would always overwrite its value.", new Object[0]);
                }
            }
            return new p.q(clsH10);
        }

        static Set<String> h(String str) {
            Matcher matcher = x.matcher(str);
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            while (matcher.find()) {
                linkedHashSet.add(matcher.group(1));
            }
            return linkedHashSet;
        }

        private void i(int i2, String str) {
            if (!y.matcher(str).matches()) {
                throw y.o(this.b, i2, "@Path parameter name must match %s. Found: %s", x.pattern(), str);
            }
            if (!this.u.contains(str)) {
                throw y.o(this.b, i2, "URL \"%s\" does not contain \"{%s}\".", this.r, str);
            }
        }

        private void j(int i2, Type type) {
            if (y.j(type)) {
                throw y.o(this.b, i2, "Parameter type must not include a type variable or wildcard: %s", type);
            }
        }

        s b() {
            for (Annotation annotation : this.c) {
                e(annotation);
            }
            if (this.f2373n == null) {
                throw y.m(this.b, "HTTP method annotation is required (e.g., @GET, @POST, etc.).", new Object[0]);
            }
            if (!this.f2374o) {
                if (this.q) {
                    throw y.m(this.b, "Multipart can only be specified on HTTP methods with request body (e.g., @POST).", new Object[0]);
                }
                if (this.p) {
                    throw y.m(this.b, "FormUrlEncoded can only be specified on HTTP methods with request body (e.g., @POST).", new Object[0]);
                }
            }
            int length = this.d.length;
            this.v = new p[length];
            int i2 = length - 1;
            int i3 = 0;
            while (true) {
                boolean z = true;
                if (i3 >= length) {
                    break;
                }
                p<?>[] pVarArr = this.v;
                Type type = this.e[i3];
                Annotation[] annotationArr = this.d[i3];
                if (i3 != i2) {
                    z = false;
                }
                pVarArr[i3] = f(i3, type, annotationArr, z);
                i3++;
            }
            if (this.r == null && !this.f2372m) {
                throw y.m(this.b, "Missing either @%s URL or @Url parameter.", this.f2373n);
            }
            boolean z2 = this.p;
            if (!z2 && !this.q && !this.f2374o && this.f2367h) {
                throw y.m(this.b, "Non-body HTTP method cannot contain @Body.", new Object[0]);
            }
            if (z2 && !this.f) {
                throw y.m(this.b, "Form-encoded method must contain at least one @Field.", new Object[0]);
            }
            if (!this.q || this.f2366g) {
                return new s(this);
            }
            throw y.m(this.b, "Multipart method must contain at least one @Part.", new Object[0]);
        }
    }

    s(a aVar) {
        this.a = aVar.b;
        this.b = aVar.a.c;
        this.c = aVar.f2373n;
        this.d = aVar.r;
        this.e = aVar.s;
        this.f = aVar.t;
        this.f2361g = aVar.f2374o;
        this.f2362h = aVar.p;
        this.f2363i = aVar.q;
        this.f2364j = aVar.v;
        this.f2365k = aVar.w;
    }

    static s b(u uVar, Method method) {
        return new a(uVar, method).b();
    }

    b0 a(Object[] objArr) {
        p<?>[] pVarArr = this.f2364j;
        int length = objArr.length;
        if (length != pVarArr.length) {
            throw new IllegalArgumentException("Argument count (" + length + ") doesn't match expected count (" + pVarArr.length + ")");
        }
        r rVar = new r(this.c, this.b, this.d, this.e, this.f, this.f2361g, this.f2362h, this.f2363i);
        if (this.f2365k) {
            length--;
        }
        ArrayList arrayList = new ArrayList(length);
        for (int i2 = 0; i2 < length; i2++) {
            arrayList.add(objArr[i2]);
            pVarArr[i2].a(rVar, objArr[i2]);
        }
        b0.a aVarK = rVar.k();
        aVarK.n(l.class, new l(this.a, arrayList));
        return aVarK.a();
    }
}
