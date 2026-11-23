package com.facebook;

import android.util.Log;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

/* JADX INFO: loaded from: classes.dex */
public final class x {
    private static final String f = "com.facebook.x";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f805g = new a(null);
    private final JSONObject a;
    private final HttpURLConnection b;
    private final JSONObject c;
    private final JSONArray d;
    private final q e;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(l.y.c.f fVar) {
            this();
        }

        private final x b(u uVar, HttpURLConnection httpURLConnection, Object obj, Object obj2) throws JSONException {
            if (obj instanceof JSONObject) {
                JSONObject jSONObject = (JSONObject) obj;
                q qVarA = q.f723l.a(jSONObject, obj2, httpURLConnection);
                if (qVarA != null) {
                    Log.e(x.f, qVarA.toString());
                    if (qVarA.b() == 190 && com.facebook.internal.h0.U(uVar.k())) {
                        if (qVarA.g() != 493) {
                            com.facebook.a.p.i(null);
                        } else {
                            com.facebook.a.c cVar = com.facebook.a.p;
                            com.facebook.a aVarE = cVar.e();
                            if (aVarE != null && !aVarE.p()) {
                                cVar.d();
                            }
                        }
                    }
                    return new x(uVar, httpURLConnection, qVarA);
                }
                Object objJ = com.facebook.internal.h0.J(jSONObject, "body", "FACEBOOK_NON_JSON_RESULT");
                if (objJ instanceof JSONObject) {
                    return new x(uVar, httpURLConnection, objJ.toString(), (JSONObject) objJ);
                }
                if (objJ instanceof JSONArray) {
                    return new x(uVar, httpURLConnection, objJ.toString(), (JSONArray) objJ);
                }
                obj = JSONObject.NULL;
                l.y.c.i.d(obj, "JSONObject.NULL");
            }
            if (obj == JSONObject.NULL) {
                return new x(uVar, httpURLConnection, obj.toString(), (JSONObject) null);
            }
            throw new n("Got unexpected object type in response, class: " + obj.getClass().getSimpleName());
        }

        private final List<x> c(HttpURLConnection httpURLConnection, List<u> list, Object obj) {
            Object obj2;
            x xVar;
            x xVar2;
            int size = list.size();
            ArrayList arrayList = new ArrayList(size);
            if (size == 1) {
                u uVar = list.get(0);
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("body", obj);
                    jSONObject.put("code", httpURLConnection != null ? httpURLConnection.getResponseCode() : j.d.a.e.a.a.i.g.STATUS_SUCCESS);
                    JSONArray jSONArray = new JSONArray();
                    jSONArray.put(jSONObject);
                    obj2 = jSONArray;
                } catch (IOException e) {
                    xVar2 = new x(uVar, httpURLConnection, new q(httpURLConnection, e));
                    arrayList.add(xVar2);
                    obj2 = obj;
                } catch (JSONException e2) {
                    xVar2 = new x(uVar, httpURLConnection, new q(httpURLConnection, e2));
                    arrayList.add(xVar2);
                    obj2 = obj;
                }
            } else {
                obj2 = obj;
            }
            if (obj2 instanceof JSONArray) {
                JSONArray jSONArray2 = (JSONArray) obj2;
                if (jSONArray2.length() == size) {
                    int length = jSONArray2.length();
                    for (int i2 = 0; i2 < length; i2++) {
                        u uVar2 = list.get(i2);
                        try {
                            Object obj3 = ((JSONArray) obj2).get(i2);
                            l.y.c.i.d(obj3, "obj");
                            arrayList.add(b(uVar2, httpURLConnection, obj3, obj));
                        } catch (n e3) {
                            xVar = new x(uVar2, httpURLConnection, new q(httpURLConnection, e3));
                            arrayList.add(xVar);
                        } catch (JSONException e4) {
                            xVar = new x(uVar2, httpURLConnection, new q(httpURLConnection, e4));
                            arrayList.add(xVar);
                        }
                    }
                    return arrayList;
                }
            }
            throw new n("Unexpected number of results");
        }

        public final List<x> a(List<u> list, HttpURLConnection httpURLConnection, n nVar) {
            l.y.c.i.e(list, "requests");
            ArrayList arrayList = new ArrayList(l.t.n.o(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(new x((u) it.next(), httpURLConnection, new q(httpURLConnection, nVar)));
            }
            return arrayList;
        }

        public final List<x> d(InputStream inputStream, HttpURLConnection httpURLConnection, w wVar) throws Throwable {
            l.y.c.i.e(wVar, "requests");
            String strQ0 = com.facebook.internal.h0.q0(inputStream);
            com.facebook.internal.a0.f.d(a0.INCLUDE_RAW_RESPONSES, "Response", "Response (raw)\n  Size: %d\n  Response:\n%s\n", Integer.valueOf(strQ0.length()), strQ0);
            return e(strQ0, httpURLConnection, wVar);
        }

        public final List<x> e(String str, HttpURLConnection httpURLConnection, w wVar) throws JSONException {
            l.y.c.i.e(str, "responseString");
            l.y.c.i.e(wVar, "requests");
            Object objNextValue = new JSONTokener(str).nextValue();
            l.y.c.i.d(objNextValue, "resultObject");
            List<x> listC = c(httpURLConnection, wVar, objNextValue);
            com.facebook.internal.a0.f.d(a0.REQUESTS, "Response", "Response\n  Id: %s\n  Size: %d\n  Responses:\n%s\n", wVar.u(), Integer.valueOf(str.length()), listC);
            return listC;
        }

        public final List<x> f(HttpURLConnection httpURLConnection, w wVar) {
            List<x> listA;
            l.y.c.i.e(httpURLConnection, "connection");
            l.y.c.i.e(wVar, "requests");
            InputStream errorStream = null;
            try {
                try {
                    if (!r.w()) {
                        Log.e(x.f, "GraphRequest can't be used when Facebook SDK isn't fully initialized");
                        throw new n("GraphRequest can't be used when Facebook SDK isn't fully initialized");
                    }
                    errorStream = httpURLConnection.getResponseCode() >= 400 ? httpURLConnection.getErrorStream() : httpURLConnection.getInputStream();
                    listA = d(errorStream, httpURLConnection, wVar);
                    com.facebook.internal.h0.i(errorStream);
                    return listA;
                } catch (n e) {
                    com.facebook.internal.a0.f.d(a0.REQUESTS, "Response", "Response <Error>: %s", e);
                    listA = a(wVar, httpURLConnection, e);
                } catch (Exception e2) {
                    com.facebook.internal.a0.f.d(a0.REQUESTS, "Response", "Response <Error>: %s", e2);
                    listA = a(wVar, httpURLConnection, new n(e2));
                }
            } catch (Throwable th) {
                com.facebook.internal.h0.i(null);
                throw th;
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public x(u uVar, HttpURLConnection httpURLConnection, q qVar) {
        this(uVar, httpURLConnection, null, null, null, qVar);
        l.y.c.i.e(uVar, "request");
        l.y.c.i.e(qVar, "error");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public x(u uVar, HttpURLConnection httpURLConnection, String str, JSONArray jSONArray) {
        this(uVar, httpURLConnection, str, null, jSONArray, null);
        l.y.c.i.e(uVar, "request");
        l.y.c.i.e(str, "rawResponse");
        l.y.c.i.e(jSONArray, "graphObjects");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public x(u uVar, HttpURLConnection httpURLConnection, String str, JSONObject jSONObject) {
        this(uVar, httpURLConnection, str, jSONObject, null, null);
        l.y.c.i.e(uVar, "request");
        l.y.c.i.e(str, "rawResponse");
    }

    public x(u uVar, HttpURLConnection httpURLConnection, String str, JSONObject jSONObject, JSONArray jSONArray, q qVar) {
        l.y.c.i.e(uVar, "request");
        this.b = httpURLConnection;
        this.c = jSONObject;
        this.d = jSONArray;
        this.e = qVar;
        this.a = jSONObject;
    }

    public final q b() {
        return this.e;
    }

    public final JSONObject c() {
        return this.c;
    }

    public final JSONObject d() {
        return this.a;
    }

    public String toString() {
        String str;
        try {
            l.y.c.o oVar = l.y.c.o.a;
            Locale locale = Locale.US;
            Object[] objArr = new Object[1];
            HttpURLConnection httpURLConnection = this.b;
            objArr[0] = Integer.valueOf(httpURLConnection != null ? httpURLConnection.getResponseCode() : j.d.a.e.a.a.i.g.STATUS_SUCCESS);
            str = String.format(locale, "%d", Arrays.copyOf(objArr, 1));
            l.y.c.i.d(str, "java.lang.String.format(locale, format, *args)");
        } catch (IOException unused) {
            str = "unknown";
        }
        String str2 = "{Response:  responseCode: " + str + ", graphObject: " + this.c + ", error: " + this.e + "}";
        l.y.c.i.d(str2, "StringBuilder()\n        …(\"}\")\n        .toString()");
        return str2;
    }
}
