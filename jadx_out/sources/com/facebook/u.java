package com.facebook;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.security.SecureRandom;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.GZIPOutputStream;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class u {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final String f795o;
    private static final String p;
    private static String q;
    private static final Pattern r;
    private static volatile String s;
    public static final c t = new c(null);
    private com.facebook.a a;
    private String b;
    private JSONObject c;
    private String d;
    private String e;
    private boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Bundle f796g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Object f797h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f798i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private b f799j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private y f800k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f801l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f802m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private String f803n;

    private static final class a {
        private final u a;
        private final Object b;

        public a(u uVar, Object obj) {
            l.y.c.i.e(uVar, "request");
            this.a = uVar;
            this.b = obj;
        }

        public final u a() {
            return this.a;
        }

        public final Object b() {
            return this.b;
        }
    }

    public interface b {
        void b(x xVar);
    }

    public static final class c {

        static final class a implements b {
            final /* synthetic */ d a;

            a(d dVar) {
                this.a = dVar;
            }

            @Override // com.facebook.u.b
            public final void b(x xVar) {
                l.y.c.i.e(xVar, "response");
                d dVar = this.a;
                if (dVar != null) {
                    dVar.a(xVar.c(), xVar);
                }
            }
        }

        static final class b implements Runnable {
            final /* synthetic */ ArrayList a;
            final /* synthetic */ w b;

            b(ArrayList arrayList, w wVar) {
                this.a = arrayList;
                this.b = wVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                if (com.facebook.internal.m0.i.a.d(this)) {
                    return;
                }
                try {
                    for (Pair pair : this.a) {
                        b bVar = (b) pair.first;
                        Object obj = pair.second;
                        l.y.c.i.d(obj, "pair.second");
                        bVar.b((x) obj);
                    }
                    Iterator<w.a> it = this.b.t().iterator();
                    while (it.hasNext()) {
                        it.next().a(this.b);
                    }
                } catch (Throwable th) {
                    com.facebook.internal.m0.i.a.b(th, this);
                }
            }
        }

        private c() {
        }

        public /* synthetic */ c(l.y.c.f fVar) {
            this();
        }

        private final void A(String str, Object obj, e eVar, boolean z) {
            String string;
            String string2;
            String str2;
            Class<?> cls = obj.getClass();
            if (JSONObject.class.isAssignableFrom(cls)) {
                if (obj == null) {
                    throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
                }
                JSONObject jSONObject = (JSONObject) obj;
                if (z) {
                    Iterator<String> itKeys = jSONObject.keys();
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        l.y.c.o oVar = l.y.c.o.a;
                        String str3 = String.format("%s[%s]", Arrays.copyOf(new Object[]{str, next}, 2));
                        l.y.c.i.d(str3, "java.lang.String.format(format, *args)");
                        Object objOpt = jSONObject.opt(next);
                        l.y.c.i.d(objOpt, "jsonObject.opt(propertyName)");
                        A(str3, objOpt, eVar, z);
                    }
                    return;
                }
                if (jSONObject.has("id")) {
                    string2 = jSONObject.optString("id");
                    str2 = "jsonObject.optString(\"id\")";
                } else if (jSONObject.has("url")) {
                    string2 = jSONObject.optString("url");
                    str2 = "jsonObject.optString(\"url\")";
                } else {
                    if (!jSONObject.has("fbsdk:create_object")) {
                        return;
                    }
                    string2 = jSONObject.toString();
                    str2 = "jsonObject.toString()";
                }
                l.y.c.i.d(string2, str2);
                A(str, string2, eVar, z);
                return;
            }
            if (!JSONArray.class.isAssignableFrom(cls)) {
                if (String.class.isAssignableFrom(cls) || Number.class.isAssignableFrom(cls) || Boolean.TYPE.isAssignableFrom(cls)) {
                    string = obj.toString();
                } else {
                    if (!Date.class.isAssignableFrom(cls)) {
                        return;
                    }
                    if (obj == null) {
                        throw new NullPointerException("null cannot be cast to non-null type java.util.Date");
                    }
                    string = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ", Locale.US).format((Date) obj);
                    l.y.c.i.d(string, "iso8601DateFormat.format(date)");
                }
                eVar.a(str, string);
                return;
            }
            if (obj == null) {
                throw new NullPointerException("null cannot be cast to non-null type org.json.JSONArray");
            }
            JSONArray jSONArray = (JSONArray) obj;
            int length = jSONArray.length();
            for (int i2 = 0; i2 < length; i2++) {
                l.y.c.o oVar2 = l.y.c.o.a;
                String str4 = String.format(Locale.ROOT, "%s[%d]", Arrays.copyOf(new Object[]{str, Integer.valueOf(i2)}, 2));
                l.y.c.i.d(str4, "java.lang.String.format(locale, format, *args)");
                Object objOpt2 = jSONArray.opt(i2);
                l.y.c.i.d(objOpt2, "jsonArray.opt(i)");
                A(str4, objOpt2, eVar, z);
            }
        }

        private final void B(w wVar, com.facebook.internal.a0 a0Var, int i2, URL url, OutputStream outputStream, boolean z) throws JSONException, IOException {
            h hVar = new h(outputStream, a0Var, z);
            if (i2 != 1) {
                String strN = n(wVar);
                if (strN.length() == 0) {
                    throw new n("App ID was not specified at the request or Settings.");
                }
                hVar.a("batch_app_id", strN);
                HashMap map = new HashMap();
                F(hVar, wVar, map);
                if (a0Var != null) {
                    a0Var.b("  Attachments:\n");
                }
                D(map, hVar);
                return;
            }
            u uVarQ = wVar.get(0);
            HashMap map2 = new HashMap();
            for (String str : uVarQ.s().keySet()) {
                Object obj = uVarQ.s().get(str);
                if (t(obj)) {
                    l.y.c.i.d(str, "key");
                    map2.put(str, new a(uVarQ, obj));
                }
            }
            if (a0Var != null) {
                a0Var.b("  Parameters:\n");
            }
            E(uVarQ.s(), hVar, uVarQ);
            if (a0Var != null) {
                a0Var.b("  Attachments:\n");
            }
            D(map2, hVar);
            JSONObject jSONObjectO = uVarQ.o();
            if (jSONObjectO != null) {
                String path = url.getPath();
                l.y.c.i.d(path, "url.path");
                z(jSONObjectO, path, hVar);
            }
        }

        private final void D(Map<String, a> map, h hVar) throws IOException {
            for (Map.Entry<String, a> entry : map.entrySet()) {
                if (u.t.t(entry.getValue().b())) {
                    hVar.j(entry.getKey(), entry.getValue().b(), entry.getValue().a());
                }
            }
        }

        private final void E(Bundle bundle, h hVar, u uVar) throws IOException {
            for (String str : bundle.keySet()) {
                Object obj = bundle.get(str);
                if (u(obj)) {
                    l.y.c.i.d(str, "key");
                    hVar.j(str, obj, uVar);
                }
            }
        }

        private final void F(h hVar, Collection<u> collection, Map<String, a> map) throws JSONException, IOException {
            JSONArray jSONArray = new JSONArray();
            Iterator<u> it = collection.iterator();
            while (it.hasNext()) {
                it.next().B(jSONArray, map);
            }
            hVar.l("batch", jSONArray, collection);
        }

        private final void H(HttpURLConnection httpURLConnection, boolean z) {
            if (!z) {
                httpURLConnection.setRequestProperty("Content-Type", o());
            } else {
                httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
                httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
            }
        }

        private final HttpURLConnection e(URL url) throws IOException {
            URLConnection uRLConnectionOpenConnection = url.openConnection();
            if (uRLConnectionOpenConnection == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.net.HttpURLConnection");
            }
            HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
            httpURLConnection.setRequestProperty("User-Agent", p());
            httpURLConnection.setRequestProperty("Accept-Language", Locale.getDefault().toString());
            httpURLConnection.setChunkedStreamingMode(0);
            return httpURLConnection;
        }

        private final String n(w wVar) {
            String strR = wVar.r();
            if (strR != null && (!wVar.isEmpty())) {
                return strR;
            }
            Iterator<u> it = wVar.iterator();
            while (it.hasNext()) {
                com.facebook.a aVarK = it.next().k();
                if (aVarK != null) {
                    return aVarK.c();
                }
            }
            String str = u.q;
            if (str != null) {
                if (str.length() > 0) {
                    return str;
                }
            }
            return r.g();
        }

        private final String o() {
            l.y.c.o oVar = l.y.c.o.a;
            String str = String.format("multipart/form-data; boundary=%s", Arrays.copyOf(new Object[]{u.p}, 1));
            l.y.c.i.d(str, "java.lang.String.format(format, *args)");
            return str;
        }

        private final String p() {
            if (u.s == null) {
                l.y.c.o oVar = l.y.c.o.a;
                String str = String.format("%s.%s", Arrays.copyOf(new Object[]{"FBAndroidSDK", "12.2.0"}, 2));
                l.y.c.i.d(str, "java.lang.String.format(format, *args)");
                u.s = str;
                String strA = com.facebook.internal.y.a();
                if (!com.facebook.internal.h0.Y(strA)) {
                    String str2 = String.format(Locale.ROOT, "%s/%s", Arrays.copyOf(new Object[]{u.s, strA}, 2));
                    l.y.c.i.d(str2, "java.lang.String.format(locale, format, *args)");
                    u.s = str2;
                }
            }
            return u.s;
        }

        private final boolean q(w wVar) {
            Iterator<w.a> it = wVar.t().iterator();
            while (it.hasNext()) {
                if (it.next() instanceof w.b) {
                    return true;
                }
            }
            Iterator<u> it2 = wVar.iterator();
            while (it2.hasNext()) {
                if (it2.next().m() instanceof f) {
                    return true;
                }
            }
            return false;
        }

        private final boolean r(w wVar) {
            for (u uVar : wVar) {
                Iterator<String> it = uVar.s().keySet().iterator();
                while (it.hasNext()) {
                    if (t(uVar.s().get(it.next()))) {
                        return false;
                    }
                }
            }
            return true;
        }

        private final boolean s(String str) {
            Matcher matcher = u.r.matcher(str);
            if (matcher.matches()) {
                str = matcher.group(1);
                l.y.c.i.d(str, "matcher.group(1)");
            }
            return l.d0.p.x(str, "me/", false, 2, null) || l.d0.p.x(str, "/me/", false, 2, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean t(Object obj) {
            return (obj instanceof Bitmap) || (obj instanceof byte[]) || (obj instanceof Uri) || (obj instanceof ParcelFileDescriptor) || (obj instanceof g);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean u(Object obj) {
            return (obj instanceof String) || (obj instanceof Boolean) || (obj instanceof Number) || (obj instanceof Date);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String y(Object obj) {
            if (obj instanceof String) {
                return (String) obj;
            }
            if ((obj instanceof Boolean) || (obj instanceof Number)) {
                return obj.toString();
            }
            if (!(obj instanceof Date)) {
                throw new IllegalArgumentException("Unsupported parameter type.");
            }
            String str = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ", Locale.US).format((Date) obj);
            l.y.c.i.d(str, "iso8601DateFormat.format(value)");
            return str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Code duplicated, block: B:10:0x0023  */
        public final void z(JSONObject jSONObject, String str, e eVar) {
            boolean z;
            if (s(str)) {
                int iN = l.d0.q.N(str, ":", 0, false, 6, null);
                int iN2 = l.d0.q.N(str, "?", 0, false, 6, null);
                if (iN <= 3 || (iN2 != -1 && iN >= iN2)) {
                    z = false;
                } else {
                    z = true;
                }
            } else {
                z = false;
            }
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                Object objOpt = jSONObject.opt(next);
                boolean z2 = z && l.d0.p.l(next, "image", true);
                l.y.c.i.d(next, "key");
                l.y.c.i.d(objOpt, "value");
                A(next, objOpt, eVar, z2);
            }
        }

        public final void C(w wVar, List<x> list) {
            l.y.c.i.e(wVar, "requests");
            l.y.c.i.e(list, "responses");
            int size = wVar.size();
            ArrayList arrayList = new ArrayList();
            for (int i2 = 0; i2 < size; i2++) {
                u uVarQ = wVar.get(i2);
                if (uVarQ.m() != null) {
                    arrayList.add(new Pair(uVarQ.m(), list.get(i2)));
                }
            }
            if (arrayList.size() > 0) {
                b bVar = new b(arrayList, wVar);
                Handler handlerS = wVar.s();
                if (handlerS != null) {
                    handlerS.post(bVar);
                } else {
                    bVar.run();
                }
            }
        }

        /* JADX WARN: Code duplicated, block: B:33:0x00f2  */
        public final void G(w wVar, HttpURLConnection httpURLConnection) throws Throwable {
            OutputStream gZIPOutputStream;
            l.y.c.i.e(wVar, "requests");
            l.y.c.i.e(httpURLConnection, "connection");
            com.facebook.internal.a0 a0Var = new com.facebook.internal.a0(a0.REQUESTS, "Request");
            int size = wVar.size();
            boolean zR = r(wVar);
            OutputStream outputStream = null;
            y yVarR = size == 1 ? wVar.get(0).r() : null;
            if (yVarR == null) {
                yVarR = y.POST;
            }
            httpURLConnection.setRequestMethod(yVarR.name());
            H(httpURLConnection, zR);
            URL url = httpURLConnection.getURL();
            a0Var.b("Request:\n");
            a0Var.d("Id", wVar.u());
            l.y.c.i.d(url, "url");
            a0Var.d("URL", url);
            Object requestMethod = httpURLConnection.getRequestMethod();
            l.y.c.i.d(requestMethod, "connection.requestMethod");
            a0Var.d("Method", requestMethod);
            Object requestProperty = httpURLConnection.getRequestProperty("User-Agent");
            l.y.c.i.d(requestProperty, "connection.getRequestProperty(\"User-Agent\")");
            a0Var.d("User-Agent", requestProperty);
            Object requestProperty2 = httpURLConnection.getRequestProperty("Content-Type");
            l.y.c.i.d(requestProperty2, "connection.getRequestProperty(\"Content-Type\")");
            a0Var.d("Content-Type", requestProperty2);
            httpURLConnection.setConnectTimeout(wVar.x());
            httpURLConnection.setReadTimeout(wVar.x());
            if (!(yVarR == y.POST)) {
                a0Var.e();
                return;
            }
            httpURLConnection.setDoOutput(true);
            try {
                OutputStream bufferedOutputStream = new BufferedOutputStream(httpURLConnection.getOutputStream());
                if (zR) {
                    try {
                        gZIPOutputStream = new GZIPOutputStream(bufferedOutputStream);
                    } catch (Throwable th) {
                        th = th;
                        outputStream = bufferedOutputStream;
                        if (outputStream != null) {
                            outputStream.close();
                        }
                        throw th;
                    }
                } else {
                    gZIPOutputStream = bufferedOutputStream;
                }
                try {
                    if (q(wVar)) {
                        e0 e0Var = new e0(wVar.s());
                        B(wVar, null, size, url, e0Var, zR);
                        gZIPOutputStream = new f0(gZIPOutputStream, wVar, e0Var.j(), e0Var.f());
                    }
                    B(wVar, a0Var, size, url, gZIPOutputStream, zR);
                    gZIPOutputStream.close();
                    a0Var.e();
                } catch (Throwable th2) {
                    th = th2;
                    outputStream = gZIPOutputStream;
                    if (outputStream != null) {
                        outputStream.close();
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        }

        public final boolean I(u uVar) {
            l.y.c.i.e(uVar, "request");
            String strX = uVar.x();
            if (strX == null) {
                return true;
            }
            if (strX.length() == 0) {
                return true;
            }
            if (l.d0.p.x(strX, "v", false, 2, null)) {
                if (strX == null) {
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                }
                strX = strX.substring(1);
                l.y.c.i.d(strX, "(this as java.lang.String).substring(startIndex)");
            }
            Object[] array = new l.d0.f("\\.").c(strX, 0).toArray(new String[0]);
            if (array == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
            }
            String[] strArr = (String[]) array;
            if (strArr.length < 2 || Integer.parseInt(strArr[0]) <= 2) {
                return Integer.parseInt(strArr[0]) >= 2 && Integer.parseInt(strArr[1]) >= 4;
            }
            return true;
        }

        public final HttpURLConnection J(w wVar) throws Throwable {
            l.y.c.i.e(wVar, "requests");
            K(wVar);
            try {
                HttpURLConnection httpURLConnectionE = null;
                try {
                    httpURLConnectionE = e(wVar.size() == 1 ? new URL(wVar.get(0).v()) : new URL(com.facebook.internal.f0.g()));
                    G(wVar, httpURLConnectionE);
                    return httpURLConnectionE;
                } catch (IOException e) {
                    com.facebook.internal.h0.q(httpURLConnectionE);
                    throw new n("could not construct request body", e);
                } catch (JSONException e2) {
                    com.facebook.internal.h0.q(httpURLConnectionE);
                    throw new n("could not construct request body", e2);
                }
            } catch (MalformedURLException e3) {
                throw new n("could not construct URL for request", e3);
            }
        }

        public final void K(w wVar) {
            l.y.c.i.e(wVar, "requests");
            for (u uVar : wVar) {
                if (y.GET == uVar.r()) {
                    l.y.c.i.d(uVar, "request");
                    if (I(uVar) && (!uVar.s().containsKey("fields") || com.facebook.internal.h0.Y(uVar.s().getString("fields")))) {
                        com.facebook.internal.a0.a aVar = com.facebook.internal.a0.f;
                        a0 a0Var = a0.DEVELOPER_ERRORS;
                        Object[] objArr = new Object[1];
                        String strP = uVar.p();
                        if (strP == null) {
                            strP = "";
                        }
                        objArr[0] = strP;
                        aVar.b(a0Var, 5, "Request", "starting with Graph API v2.4, GET requests for /%s should contain an explicit \"fields\" parameter.", objArr);
                    }
                }
            }
        }

        public final x f(u uVar) {
            l.y.c.i.e(uVar, "request");
            List<x> listI = i(uVar);
            if (listI.size() == 1) {
                return listI.get(0);
            }
            throw new n("invalid state: expected a single response");
        }

        public final List<x> g(w wVar) throws Throwable {
            Exception exc;
            HttpURLConnection httpURLConnectionJ;
            List<x> listM;
            l.y.c.i.e(wVar, "requests");
            com.facebook.internal.i0.l(wVar, "requests");
            HttpURLConnection httpURLConnection = null;
            try {
                httpURLConnectionJ = J(wVar);
                exc = null;
            } catch (Exception e) {
                exc = e;
                httpURLConnectionJ = null;
            } catch (Throwable th) {
                th = th;
                com.facebook.internal.h0.q(httpURLConnection);
                throw th;
            }
            try {
                if (httpURLConnectionJ != null) {
                    listM = m(httpURLConnectionJ, wVar);
                } else {
                    List<x> listA = x.f805g.a(wVar.v(), null, new n(exc));
                    C(wVar, listA);
                    listM = listA;
                }
                com.facebook.internal.h0.q(httpURLConnectionJ);
                return listM;
            } catch (Throwable th2) {
                th = th2;
                httpURLConnection = httpURLConnectionJ;
                com.facebook.internal.h0.q(httpURLConnection);
                throw th;
            }
        }

        public final List<x> h(Collection<u> collection) {
            l.y.c.i.e(collection, "requests");
            return g(new w(collection));
        }

        public final List<x> i(u... uVarArr) {
            l.y.c.i.e(uVarArr, "requests");
            return h(l.t.h.t(uVarArr));
        }

        public final v j(w wVar) {
            l.y.c.i.e(wVar, "requests");
            com.facebook.internal.i0.l(wVar, "requests");
            v vVar = new v(wVar);
            vVar.executeOnExecutor(r.n(), new Void[0]);
            return vVar;
        }

        public final v k(Collection<u> collection) {
            l.y.c.i.e(collection, "requests");
            return j(new w(collection));
        }

        public final v l(u... uVarArr) {
            l.y.c.i.e(uVarArr, "requests");
            return k(l.t.h.t(uVarArr));
        }

        public final List<x> m(HttpURLConnection httpURLConnection, w wVar) {
            l.y.c.i.e(httpURLConnection, "connection");
            l.y.c.i.e(wVar, "requests");
            List<x> listF = x.f805g.f(httpURLConnection, wVar);
            com.facebook.internal.h0.q(httpURLConnection);
            int size = wVar.size();
            if (size == listF.size()) {
                C(wVar, listF);
                com.facebook.d.f575g.e().f();
                return listF;
            }
            l.y.c.o oVar = l.y.c.o.a;
            String str = String.format(Locale.US, "Received %d responses while expecting %d", Arrays.copyOf(new Object[]{Integer.valueOf(listF.size()), Integer.valueOf(size)}, 2));
            l.y.c.i.d(str, "java.lang.String.format(locale, format, *args)");
            throw new n(str);
        }

        public final u v(com.facebook.a aVar, String str, b bVar) {
            return new u(aVar, str, null, null, bVar, null, 32, null);
        }

        public final u w(com.facebook.a aVar, d dVar) {
            return new u(aVar, "me", null, null, new a(dVar), null, 32, null);
        }

        public final u x(com.facebook.a aVar, String str, JSONObject jSONObject, b bVar) {
            u uVar = new u(aVar, str, null, y.POST, bVar, null, 32, null);
            uVar.E(jSONObject);
            return uVar;
        }
    }

    public interface d {
        void a(JSONObject jSONObject, x xVar);
    }

    private interface e {
        void a(String str, String str2);
    }

    public interface f extends b {
        void a(long j2, long j3);
    }

    public static final class g<RESOURCE extends Parcelable> implements Parcelable {
        public static final Parcelable.Creator<g<?>> CREATOR = new a();
        private final String a;
        private final RESOURCE b;

        public static final class a implements Parcelable.Creator<g<?>> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public g<?> createFromParcel(Parcel parcel) {
                l.y.c.i.e(parcel, "source");
                return new g<>(parcel, (l.y.c.f) null);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public g<?>[] newArray(int i2) {
                return new g[i2];
            }
        }

        private g(Parcel parcel) {
            this.a = parcel.readString();
            this.b = (RESOURCE) parcel.readParcelable(r.f().getClassLoader());
        }

        public /* synthetic */ g(Parcel parcel, l.y.c.f fVar) {
            this(parcel);
        }

        public g(RESOURCE resource, String str) {
            this.a = str;
            this.b = resource;
        }

        public final String a() {
            return this.a;
        }

        public final RESOURCE b() {
            return this.b;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 1;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            l.y.c.i.e(parcel, "out");
            parcel.writeString(this.a);
            parcel.writeParcelable(this.b, i2);
        }
    }

    private static final class h implements e {
        private boolean a;
        private final boolean b;
        private final OutputStream c;
        private final com.facebook.internal.a0 d;

        public h(OutputStream outputStream, com.facebook.internal.a0 a0Var, boolean z) {
            l.y.c.i.e(outputStream, "outputStream");
            this.c = outputStream;
            this.d = a0Var;
            this.a = true;
            this.b = z;
        }

        private final RuntimeException b() {
            return new IllegalArgumentException("value is not a supported type.");
        }

        @Override // com.facebook.u.e
        public void a(String str, String str2) throws IOException {
            l.y.c.i.e(str, "key");
            l.y.c.i.e(str2, "value");
            f(str, null, null);
            i("%s", str2);
            k();
            com.facebook.internal.a0 a0Var = this.d;
            if (a0Var != null) {
                a0Var.d("    " + str, str2);
            }
        }

        public final void c(String str, Object... objArr) throws IOException {
            l.y.c.i.e(str, "format");
            l.y.c.i.e(objArr, "args");
            if (this.b) {
                OutputStream outputStream = this.c;
                l.y.c.o oVar = l.y.c.o.a;
                Locale locale = Locale.US;
                Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
                String str2 = String.format(locale, str, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
                l.y.c.i.d(str2, "java.lang.String.format(locale, format, *args)");
                String strEncode = URLEncoder.encode(str2, "UTF-8");
                l.y.c.i.d(strEncode, "URLEncoder.encode(String… format, *args), \"UTF-8\")");
                Charset charset = l.d0.d.b;
                if (strEncode == null) {
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                }
                byte[] bytes = strEncode.getBytes(charset);
                l.y.c.i.d(bytes, "(this as java.lang.String).getBytes(charset)");
                outputStream.write(bytes);
                return;
            }
            if (this.a) {
                OutputStream outputStream2 = this.c;
                Charset charset2 = l.d0.d.b;
                byte[] bytes2 = "--".getBytes(charset2);
                l.y.c.i.d(bytes2, "(this as java.lang.String).getBytes(charset)");
                outputStream2.write(bytes2);
                OutputStream outputStream3 = this.c;
                String str3 = u.p;
                if (str3 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                }
                byte[] bytes3 = str3.getBytes(charset2);
                l.y.c.i.d(bytes3, "(this as java.lang.String).getBytes(charset)");
                outputStream3.write(bytes3);
                OutputStream outputStream4 = this.c;
                byte[] bytes4 = "\r\n".getBytes(charset2);
                l.y.c.i.d(bytes4, "(this as java.lang.String).getBytes(charset)");
                outputStream4.write(bytes4);
                this.a = false;
            }
            OutputStream outputStream5 = this.c;
            l.y.c.o oVar2 = l.y.c.o.a;
            Object[] objArrCopyOf2 = Arrays.copyOf(objArr, objArr.length);
            String str4 = String.format(str, Arrays.copyOf(objArrCopyOf2, objArrCopyOf2.length));
            l.y.c.i.d(str4, "java.lang.String.format(format, *args)");
            Charset charset3 = l.d0.d.b;
            if (str4 == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
            byte[] bytes5 = str4.getBytes(charset3);
            l.y.c.i.d(bytes5, "(this as java.lang.String).getBytes(charset)");
            outputStream5.write(bytes5);
        }

        public final void d(String str, Bitmap bitmap) throws IOException {
            l.y.c.i.e(str, "key");
            l.y.c.i.e(bitmap, "bitmap");
            f(str, str, "image/png");
            bitmap.compress(Bitmap.CompressFormat.PNG, 100, this.c);
            i("", new Object[0]);
            k();
            com.facebook.internal.a0 a0Var = this.d;
            if (a0Var != null) {
                a0Var.d("    " + str, "<Image>");
            }
        }

        public final void e(String str, byte[] bArr) throws IOException {
            l.y.c.i.e(str, "key");
            l.y.c.i.e(bArr, "bytes");
            f(str, str, "content/unknown");
            this.c.write(bArr);
            i("", new Object[0]);
            k();
            com.facebook.internal.a0 a0Var = this.d;
            if (a0Var != null) {
                l.y.c.o oVar = l.y.c.o.a;
                String str2 = String.format(Locale.ROOT, "<Data: %d>", Arrays.copyOf(new Object[]{Integer.valueOf(bArr.length)}, 1));
                l.y.c.i.d(str2, "java.lang.String.format(locale, format, *args)");
                a0Var.d("    " + str, str2);
            }
        }

        public final void f(String str, String str2, String str3) throws IOException {
            if (!this.b) {
                c("Content-Disposition: form-data; name=\"%s\"", str);
                if (str2 != null) {
                    c("; filename=\"%s\"", str2);
                }
                i("", new Object[0]);
                if (str3 != null) {
                    i("%s: %s", "Content-Type", str3);
                }
                i("", new Object[0]);
                return;
            }
            OutputStream outputStream = this.c;
            l.y.c.o oVar = l.y.c.o.a;
            String str4 = String.format("%s=", Arrays.copyOf(new Object[]{str}, 1));
            l.y.c.i.d(str4, "java.lang.String.format(format, *args)");
            Charset charset = l.d0.d.b;
            if (str4 == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
            byte[] bytes = str4.getBytes(charset);
            l.y.c.i.d(bytes, "(this as java.lang.String).getBytes(charset)");
            outputStream.write(bytes);
        }

        public final void g(String str, Uri uri, String str2) throws IOException {
            int iO;
            l.y.c.i.e(str, "key");
            l.y.c.i.e(uri, "contentUri");
            if (str2 == null) {
                str2 = "content/unknown";
            }
            f(str, str, str2);
            if (this.c instanceof e0) {
                ((e0) this.c).c(com.facebook.internal.h0.x(uri));
                iO = 0;
            } else {
                iO = com.facebook.internal.h0.o(r.f().getContentResolver().openInputStream(uri), this.c) + 0;
            }
            i("", new Object[0]);
            k();
            com.facebook.internal.a0 a0Var = this.d;
            if (a0Var != null) {
                l.y.c.o oVar = l.y.c.o.a;
                String str3 = String.format(Locale.ROOT, "<Data: %d>", Arrays.copyOf(new Object[]{Integer.valueOf(iO)}, 1));
                l.y.c.i.d(str3, "java.lang.String.format(locale, format, *args)");
                a0Var.d("    " + str, str3);
            }
        }

        public final void h(String str, ParcelFileDescriptor parcelFileDescriptor, String str2) throws IOException {
            int iO;
            l.y.c.i.e(str, "key");
            l.y.c.i.e(parcelFileDescriptor, "descriptor");
            if (str2 == null) {
                str2 = "content/unknown";
            }
            f(str, str, str2);
            OutputStream outputStream = this.c;
            if (outputStream instanceof e0) {
                ((e0) outputStream).c(parcelFileDescriptor.getStatSize());
                iO = 0;
            } else {
                iO = com.facebook.internal.h0.o(new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor), this.c) + 0;
            }
            i("", new Object[0]);
            k();
            com.facebook.internal.a0 a0Var = this.d;
            if (a0Var != null) {
                l.y.c.o oVar = l.y.c.o.a;
                String str3 = String.format(Locale.ROOT, "<Data: %d>", Arrays.copyOf(new Object[]{Integer.valueOf(iO)}, 1));
                l.y.c.i.d(str3, "java.lang.String.format(locale, format, *args)");
                a0Var.d("    " + str, str3);
            }
        }

        public final void i(String str, Object... objArr) throws IOException {
            l.y.c.i.e(str, "format");
            l.y.c.i.e(objArr, "args");
            c(str, Arrays.copyOf(objArr, objArr.length));
            if (this.b) {
                return;
            }
            c("\r\n", new Object[0]);
        }

        public final void j(String str, Object obj, u uVar) throws IOException {
            l.y.c.i.e(str, "key");
            Closeable closeable = this.c;
            if (closeable instanceof g0) {
                if (closeable == null) {
                    throw new NullPointerException("null cannot be cast to non-null type com.facebook.RequestOutputStream");
                }
                ((g0) closeable).b(uVar);
            }
            c cVar = u.t;
            if (cVar.u(obj)) {
                a(str, cVar.y(obj));
                return;
            }
            if (obj instanceof Bitmap) {
                d(str, (Bitmap) obj);
                return;
            }
            if (obj instanceof byte[]) {
                e(str, (byte[]) obj);
                return;
            }
            if (obj instanceof Uri) {
                g(str, (Uri) obj, null);
                return;
            }
            if (obj instanceof ParcelFileDescriptor) {
                h(str, (ParcelFileDescriptor) obj, null);
                return;
            }
            if (!(obj instanceof g)) {
                throw b();
            }
            g gVar = (g) obj;
            Parcelable parcelableB = gVar.b();
            String strA = gVar.a();
            if (parcelableB instanceof ParcelFileDescriptor) {
                h(str, (ParcelFileDescriptor) parcelableB, strA);
            } else {
                if (!(parcelableB instanceof Uri)) {
                    throw b();
                }
                g(str, (Uri) parcelableB, strA);
            }
        }

        public final void k() throws IOException {
            if (!this.b) {
                i("--%s", u.p);
                return;
            }
            OutputStream outputStream = this.c;
            byte[] bytes = "&".getBytes(l.d0.d.b);
            l.y.c.i.d(bytes, "(this as java.lang.String).getBytes(charset)");
            outputStream.write(bytes);
        }

        public final void l(String str, JSONArray jSONArray, Collection<u> collection) throws JSONException, IOException {
            l.y.c.i.e(str, "key");
            l.y.c.i.e(jSONArray, "requestJsonArray");
            l.y.c.i.e(collection, "requests");
            Closeable closeable = this.c;
            if (!(closeable instanceof g0)) {
                String string = jSONArray.toString();
                l.y.c.i.d(string, "requestJsonArray.toString()");
                a(str, string);
                return;
            }
            if (closeable == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.facebook.RequestOutputStream");
            }
            g0 g0Var = (g0) closeable;
            f(str, null, null);
            c("[", new Object[0]);
            int i2 = 0;
            for (u uVar : collection) {
                JSONObject jSONObject = jSONArray.getJSONObject(i2);
                g0Var.b(uVar);
                Object[] objArr = new Object[1];
                String string2 = jSONObject.toString();
                if (i2 > 0) {
                    objArr[0] = string2;
                    c(",%s", objArr);
                } else {
                    objArr[0] = string2;
                    c("%s", objArr);
                }
                i2++;
            }
            c("]", new Object[0]);
            com.facebook.internal.a0 a0Var = this.d;
            if (a0Var != null) {
                String string3 = jSONArray.toString();
                l.y.c.i.d(string3, "requestJsonArray.toString()");
                a0Var.d("    " + str, string3);
            }
        }
    }

    static final class i implements b {
        final /* synthetic */ b a;

        i(b bVar) {
            this.a = bVar;
        }

        @Override // com.facebook.u.b
        public final void b(x xVar) {
            l.y.c.i.e(xVar, "response");
            JSONObject jSONObjectC = xVar.c();
            JSONObject jSONObjectOptJSONObject = jSONObjectC != null ? jSONObjectC.optJSONObject("__debug__") : null;
            JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.optJSONArray("messages") : null;
            if (jSONArrayOptJSONArray != null) {
                int length = jSONArrayOptJSONArray.length();
                for (int i2 = 0; i2 < length; i2++) {
                    JSONObject jSONObjectOptJSONObject2 = jSONArrayOptJSONArray.optJSONObject(i2);
                    String strOptString = jSONObjectOptJSONObject2 != null ? jSONObjectOptJSONObject2.optString("message") : null;
                    String strOptString2 = jSONObjectOptJSONObject2 != null ? jSONObjectOptJSONObject2.optString("type") : null;
                    String strOptString3 = jSONObjectOptJSONObject2 != null ? jSONObjectOptJSONObject2.optString("link") : null;
                    if (strOptString != null && strOptString2 != null) {
                        a0 a0Var = a0.GRAPH_API_DEBUG_INFO;
                        if (l.y.c.i.a(strOptString2, "warning")) {
                            a0Var = a0.GRAPH_API_DEBUG_WARNING;
                        }
                        if (!com.facebook.internal.h0.Y(strOptString3)) {
                            strOptString = strOptString + " Link: " + strOptString3;
                        }
                        com.facebook.internal.a0.f.c(a0Var, u.f795o, strOptString);
                    }
                }
            }
            b bVar = this.a;
            if (bVar != null) {
                bVar.b(xVar);
            }
        }
    }

    public static final class j implements e {
        final /* synthetic */ ArrayList a;

        j(ArrayList arrayList) {
            this.a = arrayList;
        }

        @Override // com.facebook.u.e
        public void a(String str, String str2) {
            l.y.c.i.e(str, "key");
            l.y.c.i.e(str2, "value");
            ArrayList arrayList = this.a;
            l.y.c.o oVar = l.y.c.o.a;
            String str3 = String.format(Locale.US, "%s=%s", Arrays.copyOf(new Object[]{str, URLEncoder.encode(str2, "UTF-8")}, 2));
            l.y.c.i.d(str3, "java.lang.String.format(locale, format, *args)");
            arrayList.add(str3);
        }
    }

    static {
        String simpleName = u.class.getSimpleName();
        l.y.c.i.d(simpleName, "GraphRequest::class.java.simpleName");
        f795o = simpleName;
        char[] charArray = "-_1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
        l.y.c.i.d(charArray, "(this as java.lang.String).toCharArray()");
        StringBuilder sb = new StringBuilder();
        SecureRandom secureRandom = new SecureRandom();
        int iNextInt = secureRandom.nextInt(11) + 30;
        for (int i2 = 0; i2 < iNextInt; i2++) {
            sb.append(charArray[secureRandom.nextInt(charArray.length)]);
        }
        String string = sb.toString();
        l.y.c.i.d(string, "buffer.toString()");
        p = string;
        r = Pattern.compile("^/?v\\d+\\.\\d+/(.*)");
    }

    public u() {
        this(null, null, null, null, null, null, 63, null);
    }

    public u(com.facebook.a aVar, String str, Bundle bundle, y yVar, b bVar) {
        this(aVar, str, bundle, yVar, bVar, null, 32, null);
    }

    public u(com.facebook.a aVar, String str, Bundle bundle, y yVar, b bVar, String str2) {
        this.f = true;
        this.a = aVar;
        this.b = str;
        this.f798i = str2;
        C(bVar);
        F(yVar);
        this.f796g = bundle != null ? new Bundle(bundle) : new Bundle();
        if (this.f798i == null) {
            this.f798i = r.p();
        }
    }

    public /* synthetic */ u(com.facebook.a aVar, String str, Bundle bundle, y yVar, b bVar, String str2, int i2, l.y.c.f fVar) {
        this((i2 & 1) != 0 ? null : aVar, (i2 & 2) != 0 ? null : str, (i2 & 4) != 0 ? null : bundle, (i2 & 8) != 0 ? null : yVar, (i2 & 16) != 0 ? null : bVar, (i2 & 32) != 0 ? null : str2);
    }

    public static final u A(com.facebook.a aVar, d dVar) {
        return t.w(aVar, dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void B(JSONArray jSONArray, Map<String, a> map) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        String str = this.d;
        if (str != null) {
            jSONObject.put("name", str);
            jSONObject.put("omit_response_on_success", this.f);
        }
        String str2 = this.e;
        if (str2 != null) {
            jSONObject.put("depends_on", str2);
        }
        String strT = t();
        jSONObject.put("relative_url", strT);
        jSONObject.put("method", this.f800k);
        com.facebook.a aVar = this.a;
        if (aVar != null) {
            com.facebook.internal.a0.f.e(aVar.m());
        }
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = this.f796g.keySet().iterator();
        while (it.hasNext()) {
            Object obj = this.f796g.get(it.next());
            if (t.t(obj)) {
                l.y.c.o oVar = l.y.c.o.a;
                String str3 = String.format(Locale.ROOT, "%s%d", Arrays.copyOf(new Object[]{"file", Integer.valueOf(map.size())}, 2));
                l.y.c.i.d(str3, "java.lang.String.format(locale, format, *args)");
                arrayList.add(str3);
                map.put(str3, new a(this, obj));
            }
        }
        if (!arrayList.isEmpty()) {
            jSONObject.put("attached_files", TextUtils.join(",", arrayList));
        }
        JSONObject jSONObject2 = this.c;
        if (jSONObject2 != null) {
            ArrayList arrayList2 = new ArrayList();
            t.z(jSONObject2, strT, new j(arrayList2));
            jSONObject.put("body", TextUtils.join("&", arrayList2));
        }
        jSONArray.put(jSONObject);
    }

    private final boolean J() {
        String strL = l();
        boolean zC = strL != null ? l.d0.q.C(strL, "|", false, 2, null) : false;
        if (((strL == null || !l.d0.p.x(strL, "IG", false, 2, null) || zC) ? false : true) && y()) {
            return true;
        }
        return (z() || zC) ? false : true;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x004b  */
    /* JADX WARN: Code duplicated, block: B:19:0x0051  */
    /* JADX WARN: Code duplicated, block: B:21:0x0059  */
    /* JADX WARN: Code duplicated, block: B:23:? A[RETURN, SYNTHETIC] */
    private final void g() {
        String strL;
        String str;
        Bundle bundle = this.f796g;
        if (this.f801l || !J()) {
            strL = l();
            if (strL != null) {
            }
            if (!bundle.containsKey("access_token") && com.facebook.internal.h0.Y(r.l())) {
                Log.w(f795o, "Starting with v13 of the SDK, a client token must be embedded in your client code before making Graph API calls. Visit https://developers.facebook.com/docs/android/getting-started#client-token to learn how to implement this change.");
            }
            bundle.putString("sdk", "android");
            bundle.putString("format", "json");
            if (r.z(a0.GRAPH_API_DEBUG_INFO)) {
                str = "info";
            } else if (r.z(a0.GRAPH_API_DEBUG_WARNING)) {
                return;
            } else {
                str = "warning";
            }
            bundle.putString("debug", str);
        }
        strL = n();
        bundle.putString("access_token", strL);
        if (!bundle.containsKey("access_token")) {
            Log.w(f795o, "Starting with v13 of the SDK, a client token must be embedded in your client code before making Graph API calls. Visit https://developers.facebook.com/docs/android/getting-started#client-token to learn how to implement this change.");
        }
        bundle.putString("sdk", "android");
        bundle.putString("format", "json");
        if (r.z(a0.GRAPH_API_DEBUG_INFO)) {
            str = "info";
        } else if (r.z(a0.GRAPH_API_DEBUG_WARNING)) {
            return;
        } else {
            str = "warning";
        }
        bundle.putString("debug", str);
    }

    private final String h(String str, boolean z) {
        if (!z && this.f800k == y.POST) {
            return str;
        }
        Uri.Builder builderBuildUpon = Uri.parse(str).buildUpon();
        for (String str2 : this.f796g.keySet()) {
            Object obj = this.f796g.get(str2);
            if (obj == null) {
                obj = "";
            }
            c cVar = t;
            if (cVar.u(obj)) {
                builderBuildUpon.appendQueryParameter(str2, cVar.y(obj).toString());
            } else if (this.f800k != y.GET) {
                l.y.c.o oVar = l.y.c.o.a;
                String str3 = String.format(Locale.US, "Unsupported parameter type for GET request: %s", Arrays.copyOf(new Object[]{obj.getClass().getSimpleName()}, 1));
                l.y.c.i.d(str3, "java.lang.String.format(locale, format, *args)");
                throw new IllegalArgumentException(str3);
            }
        }
        String string = builderBuildUpon.toString();
        l.y.c.i.d(string, "uriBuilder.toString()");
        return string;
    }

    private final String l() {
        com.facebook.a aVar = this.a;
        if (aVar != null) {
            if (!this.f796g.containsKey("access_token")) {
                String strM = aVar.m();
                com.facebook.internal.a0.f.e(strM);
                return strM;
            }
        } else if (!this.f801l && !this.f796g.containsKey("access_token")) {
            return n();
        }
        return this.f796g.getString("access_token");
    }

    private final String n() {
        String strG = r.g();
        String strL = r.l();
        if (com.facebook.internal.h0.Y(strG) || com.facebook.internal.h0.Y(strL)) {
            com.facebook.internal.h0.f0(f795o, "Warning: Request without access token missing application ID or client token.");
            return null;
        }
        StringBuilder sb = new StringBuilder();
        if (strG == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        sb.append(strG);
        sb.append("|");
        if (strL == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        sb.append(strL);
        return sb.toString();
    }

    private final String q() {
        if (r.matcher(this.b).matches()) {
            return this.b;
        }
        l.y.c.o oVar = l.y.c.o.a;
        String str = String.format("%s/%s", Arrays.copyOf(new Object[]{this.f798i, this.b}, 2));
        l.y.c.i.d(str, "java.lang.String.format(format, *args)");
        return str;
    }

    private final String w(String str) {
        if (!z()) {
            str = com.facebook.internal.f0.f();
        }
        l.y.c.o oVar = l.y.c.o.a;
        String str2 = String.format("%s/%s", Arrays.copyOf(new Object[]{str, q()}, 2));
        l.y.c.i.d(str2, "java.lang.String.format(format, *args)");
        return str2;
    }

    private final boolean y() {
        if (this.b == null) {
            return false;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("^/?");
        sb.append(r.g());
        sb.append("/?.*");
        return this.f802m || Pattern.matches(sb.toString(), this.b);
    }

    private final boolean z() {
        if (!l.y.c.i.a(r.q(), "instagram.com")) {
            return true;
        }
        return !y();
    }

    public final void C(b bVar) {
        if (r.z(a0.GRAPH_API_DEBUG_INFO) || r.z(a0.GRAPH_API_DEBUG_WARNING)) {
            this.f799j = new i(bVar);
        } else {
            this.f799j = bVar;
        }
    }

    public final void D(boolean z) {
        this.f802m = z;
    }

    public final void E(JSONObject jSONObject) {
        this.c = jSONObject;
    }

    public final void F(y yVar) {
        if (this.f803n != null && yVar != y.GET) {
            throw new n("Can't change HTTP method on request with overridden URL.");
        }
        if (yVar == null) {
            yVar = y.GET;
        }
        this.f800k = yVar;
    }

    public final void G(Bundle bundle) {
        l.y.c.i.e(bundle, "<set-?>");
        this.f796g = bundle;
    }

    public final void H(boolean z) {
        this.f801l = z;
    }

    public final void I(Object obj) {
        this.f797h = obj;
    }

    public final x i() {
        return t.f(this);
    }

    public final v j() {
        return t.l(this);
    }

    public final com.facebook.a k() {
        return this.a;
    }

    public final b m() {
        return this.f799j;
    }

    public final JSONObject o() {
        return this.c;
    }

    public final String p() {
        return this.b;
    }

    public final y r() {
        return this.f800k;
    }

    public final Bundle s() {
        return this.f796g;
    }

    public final String t() {
        if (this.f803n != null) {
            throw new n("Can't override URL for a batch request");
        }
        String strW = w(com.facebook.internal.f0.g());
        g();
        Uri uri = Uri.parse(h(strW, true));
        l.y.c.o oVar = l.y.c.o.a;
        l.y.c.i.d(uri, "uri");
        String str = String.format("%s?%s", Arrays.copyOf(new Object[]{uri.getPath(), uri.getQuery()}, 2));
        l.y.c.i.d(str, "java.lang.String.format(format, *args)");
        return str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{Request: ");
        sb.append(" accessToken: ");
        Object obj = this.a;
        if (obj == null) {
            obj = "null";
        }
        sb.append(obj);
        sb.append(", graphPath: ");
        sb.append(this.b);
        sb.append(", graphObject: ");
        sb.append(this.c);
        sb.append(", httpMethod: ");
        sb.append(this.f800k);
        sb.append(", parameters: ");
        sb.append(this.f796g);
        sb.append("}");
        String string = sb.toString();
        l.y.c.i.d(string, "StringBuilder()\n        …(\"}\")\n        .toString()");
        return string;
    }

    public final Object u() {
        return this.f797h;
    }

    public final String v() {
        String str = this.f803n;
        if (str != null) {
            return String.valueOf(str);
        }
        String str2 = this.b;
        String strW = w((this.f800k == y.POST && str2 != null && l.d0.p.k(str2, "/videos", false, 2, null)) ? com.facebook.internal.f0.i() : com.facebook.internal.f0.h(r.q()));
        g();
        return h(strW, false);
    }

    public final String x() {
        return this.f798i;
    }
}
