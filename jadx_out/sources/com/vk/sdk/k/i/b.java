package com.vk.sdk.k.i;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.text.TextUtils;
import android.util.Pair;
import com.vk.sdk.j;
import com.vk.sdk.k.k.r;
import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.zip.GZIPInputStream;

/* JADX INFO: loaded from: classes.dex */
public class b {
    private static final ExecutorService a = Executors.newFixedThreadPool(3);
    private static final ExecutorService b = Executors.newSingleThreadExecutor();

    class a extends HashMap<String, String> {
        a() {
            put("Accept-Encoding", "gzip");
        }
    }

    /* JADX INFO: renamed from: com.vk.sdk.k.i.b$b, reason: collision with other inner class name */
    class RunnableC0165b implements Runnable {
        final /* synthetic */ com.vk.sdk.k.i.a a;

        RunnableC0165b(com.vk.sdk.k.i.a aVar) {
            this.a = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.a.g(b.b);
        }
    }

    class c implements Runnable {
        final /* synthetic */ com.vk.sdk.k.i.c a;

        c(com.vk.sdk.k.i.c cVar) {
            this.a = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.a.m().a();
        }
    }

    public static class d {
        public URL a;
        public int b = 20000;
        public List<Pair<String, String>> c = null;
        public g d = null;
        public Map<String, String> e = null;
        public boolean f = false;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public HttpURLConnection f1556g;

        public d(String str) {
            this.a = null;
            if (str != null) {
                try {
                    this.a = new URL(str);
                } catch (MalformedURLException unused) {
                }
            }
        }

        public void a() {
            HttpURLConnection httpURLConnection = this.f1556g;
            if (httpURLConnection != null) {
                httpURLConnection.disconnect();
            }
            this.f = true;
        }

        HttpURLConnection b() throws IOException {
            PackageManager packageManager;
            HttpURLConnection httpURLConnection = (HttpURLConnection) this.a.openConnection();
            this.f1556g = httpURLConnection;
            httpURLConnection.setReadTimeout(this.b);
            this.f1556g.setConnectTimeout(this.b + 5000);
            this.f1556g.setRequestMethod("POST");
            this.f1556g.setUseCaches(false);
            this.f1556g.setDoInput(true);
            this.f1556g.setDoOutput(true);
            try {
                Context contextA = j.a();
                if (contextA != null && (packageManager = contextA.getPackageManager()) != null) {
                    PackageInfo packageInfo = packageManager.getPackageInfo(contextA.getPackageName(), 0);
                    this.f1556g.setRequestProperty("User-Agent", String.format(Locale.US, "%s/%s (%s; Android %d; Scale/%.2f; VK SDK %s; %s)", com.vk.sdk.m.c.b(contextA), packageInfo.versionName, Build.MODEL, Integer.valueOf(Build.VERSION.SDK_INT), Float.valueOf(contextA.getResources().getDisplayMetrics().density), "1.6.9", packageInfo.packageName));
                }
            } catch (Exception unused) {
            }
            this.f1556g.setRequestProperty("Connection", "Keep-Alive");
            Map<String, String> map = this.e;
            if (map != null) {
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    this.f1556g.addRequestProperty(entry.getKey(), entry.getValue());
                }
            }
            if (this.d != null) {
                this.f1556g.addRequestProperty("Content-length", this.d.b() + "");
                Pair<String, String> pairC = this.d.c();
                this.f1556g.addRequestProperty((String) pairC.first, (String) pairC.second);
            }
            OutputStream outputStream = this.f1556g.getOutputStream();
            e(outputStream);
            outputStream.close();
            this.f1556g.connect();
            return this.f1556g;
        }

        public String c() {
            if (this.c == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList(this.c.size());
            for (Pair<String, String> pair : this.c) {
                Object obj = pair.first;
                if (obj != null && pair.second != null) {
                    arrayList.add(String.format("%s=%s", URLEncoder.encode((String) obj, "UTF-8"), URLEncoder.encode((String) pair.second, "UTF-8")));
                }
            }
            return TextUtils.join("&", arrayList);
        }

        void d(com.vk.sdk.k.d dVar) {
            Pair pair;
            ArrayList arrayList = new ArrayList(dVar.size());
            for (Map.Entry<String, Object> entry : dVar.entrySet()) {
                Object value = entry.getValue();
                if (value instanceof r) {
                    pair = new Pair(entry.getKey(), ((r) value).u());
                } else if (value instanceof Collection) {
                    pair = new Pair(entry.getKey(), TextUtils.join(",", (Collection) value));
                } else {
                    pair = new Pair(entry.getKey(), value == null ? null : String.valueOf(value));
                }
                arrayList.add(pair);
            }
            this.c = arrayList;
        }

        void e(OutputStream outputStream) throws IOException {
            g gVar = this.d;
            if (gVar != null) {
                gVar.f(outputStream);
                return;
            }
            String strC = c();
            if (strC == null || strC.length() <= 0) {
                return;
            }
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream, "UTF-8"));
            bufferedWriter.write(strC);
            bufferedWriter.flush();
            bufferedWriter.close();
        }
    }

    public interface e {
        void a(long j2, long j3);
    }

    public static class f {
        public final int a;
        public final long b;
        public Map<String, String> c;
        public final byte[] d;

        public f(HttpURLConnection httpURLConnection, e eVar) throws IOException {
            String str;
            this.c = null;
            this.a = httpURLConnection.getResponseCode();
            this.b = httpURLConnection.getContentLength();
            if (httpURLConnection.getHeaderFields() != null) {
                this.c = new HashMap();
                for (Map.Entry<String, List<String>> entry : httpURLConnection.getHeaderFields().entrySet()) {
                    this.c.put(entry.getKey(), TextUtils.join(",", entry.getValue()));
                }
            }
            InputStream inputStream = httpURLConnection.getInputStream();
            Map<String, String> map = this.c;
            if (map != null && (str = map.get("Content-Encoding")) != null && str.equalsIgnoreCase("gzip")) {
                inputStream = new GZIPInputStream(inputStream);
            }
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr = new byte[1024];
            long j2 = 0;
            eVar = this.b <= 0 ? null : eVar;
            while (true) {
                int i2 = inputStream.read(bArr);
                if (i2 == -1) {
                    inputStream.close();
                    byteArrayOutputStream.flush();
                    this.d = byteArrayOutputStream.toByteArray();
                    byteArrayOutputStream.close();
                    return;
                }
                byteArrayOutputStream.write(bArr, 0, i2);
                j2 += (long) i2;
                if (eVar != null) {
                    eVar.a(j2, this.b);
                }
            }
        }
    }

    public static void b(com.vk.sdk.k.i.c cVar) {
        a.execute(new c(cVar));
    }

    public static void c(com.vk.sdk.k.i.a aVar) {
        a.execute(new RunnableC0165b(aVar));
    }

    public static f d(d dVar) {
        f fVar = new f(dVar.b(), null);
        if (dVar.f) {
            return null;
        }
        return fVar;
    }

    public static d e(String str, File... fileArr) {
        d dVar = new d(str);
        dVar.d = new g(fileArr);
        return dVar;
    }

    private static Map<String, String> f() {
        return new a();
    }

    public static d g(com.vk.sdk.k.f fVar) {
        com.vk.sdk.e eVarB = com.vk.sdk.e.b();
        Locale locale = Locale.US;
        Object[] objArr = new Object[2];
        objArr[0] = (fVar.r || (eVarB != null && eVarB.e)) ? "s" : "";
        objArr[1] = fVar.d;
        d dVar = new d(String.format(locale, "http%s://api.vk.com/method/%s", objArr));
        dVar.e = f();
        dVar.d(fVar.t());
        return dVar;
    }
}
