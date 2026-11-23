package j.e.b.h.a.a;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;
import java.util.zip.GZIPInputStream;
import javax.net.ssl.HttpsURLConnection;

/* JADX INFO: loaded from: classes.dex */
public final class a {
    private static final byte[] e = new byte[0];
    private final e a;
    private final d b;
    private int c;
    private int d;

    public a(Context context, String str) {
        this(new e(context, str));
    }

    private a(e eVar) {
        this.a = eVar;
        this.b = new d("UTF-8");
        this.c = 90000;
        this.d = 90000;
    }

    private static <T> j.e.b.c<T> b(HttpURLConnection httpURLConnection, c<T> cVar, c<String> cVar2) throws IOException {
        InputStream inputStream = httpURLConnection.getResponseCode() < 400 ? httpURLConnection.getInputStream() : httpURLConnection.getErrorStream();
        List<String> list = httpURLConnection.getHeaderFields().get("Content-Encoding");
        boolean z = false;
        if (list != null && !list.isEmpty()) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                if (list.get(i2).equalsIgnoreCase("gzip")) {
                    z = true;
                    break;
                }
            }
        }
        if (z) {
            inputStream = new GZIPInputStream(inputStream);
        }
        int responseCode = httpURLConnection.getResponseCode();
        try {
            return responseCode != 200 ? j.e.b.c.a(j.e.b.d.SERVER_ERROR, new j.e.b.b(responseCode, cVar2.a(inputStream))) : j.e.b.c.b(cVar.a(inputStream));
        } catch (IOException e2) {
            return j.e.b.c.a(j.e.b.d.INTERNAL_ERROR, new j.e.b.b(responseCode, e2));
        }
    }

    private static HttpURLConnection c(Uri uri) throws IOException {
        URLConnection uRLConnectionOpenConnection = new URL(uri.toString()).openConnection();
        if (!(uRLConnectionOpenConnection instanceof HttpsURLConnection)) {
            throw new IllegalArgumentException("The scheme of the server url must be https." + uri);
        }
        if (Build.VERSION.SDK_INT >= 24) {
            return (HttpURLConnection) uRLConnectionOpenConnection;
        }
        HttpsURLConnection httpsURLConnection = (HttpsURLConnection) uRLConnectionOpenConnection;
        httpsURLConnection.setSSLSocketFactory(new j.e.a.a.a(httpsURLConnection.getSSLSocketFactory()));
        return httpsURLConnection;
    }

    private static void d(HttpURLConnection httpURLConnection, Map<String, String> map) {
        for (Map.Entry<String, String> entry : map.entrySet()) {
            httpURLConnection.setRequestProperty(entry.getKey(), entry.getValue());
        }
    }

    private static byte[] e(Map<String, String> map) {
        if (map.isEmpty()) {
            return e;
        }
        Uri.Builder builder = new Uri.Builder();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            builder.appendQueryParameter(entry.getKey(), entry.getValue());
        }
        try {
            return builder.build().getEncodedQuery().getBytes("UTF-8");
        } catch (UnsupportedEncodingException e2) {
            throw new RuntimeException(e2);
        }
    }

    public final <T> j.e.b.c<T> a(Uri uri, Map<String, String> map, Map<String, String> map2, c<T> cVar) {
        byte[] bArrE = e(map2);
        HttpURLConnection httpURLConnection = null;
        try {
            try {
                int length = bArrE.length;
                HttpURLConnection httpURLConnectionC = c(uri);
                httpURLConnectionC.setInstanceFollowRedirects(true);
                httpURLConnectionC.setRequestProperty("User-Agent", this.a.b());
                httpURLConnectionC.setRequestProperty("Accept-Encoding", "gzip");
                httpURLConnectionC.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
                httpURLConnectionC.setRequestProperty("Content-Length", String.valueOf(length));
                httpURLConnectionC.setConnectTimeout(this.c);
                httpURLConnectionC.setReadTimeout(this.d);
                httpURLConnectionC.setRequestMethod("POST");
                httpURLConnectionC.setDoOutput(true);
                try {
                    d(httpURLConnectionC, map);
                    httpURLConnectionC.connect();
                    OutputStream outputStream = httpURLConnectionC.getOutputStream();
                    outputStream.write(bArrE);
                    outputStream.flush();
                    j.e.b.c<T> cVarB = b(httpURLConnectionC, cVar, this.b);
                    if (httpURLConnectionC != null) {
                        httpURLConnectionC.disconnect();
                    }
                    return cVarB;
                } catch (IOException e2) {
                    e = e2;
                    httpURLConnection = httpURLConnectionC;
                    j.e.b.c<T> cVarA = j.e.b.c.a(j.e.b.d.NETWORK_ERROR, new j.e.b.b(e));
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    return cVarA;
                } catch (Throwable th) {
                    th = th;
                    httpURLConnection = httpURLConnectionC;
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (IOException e3) {
            e = e3;
        }
    }

    public final <T> j.e.b.c<T> f(Uri uri, Map<String, String> map, Map<String, String> map2, c<T> cVar) throws Throwable {
        Uri.Builder builderBuildUpon = uri.buildUpon();
        for (Map.Entry<String, String> entry : map2.entrySet()) {
            builderBuildUpon.appendQueryParameter(entry.getKey(), entry.getValue());
        }
        HttpURLConnection httpURLConnection = null;
        try {
            try {
                HttpURLConnection httpURLConnectionC = c(builderBuildUpon.build());
                httpURLConnectionC.setInstanceFollowRedirects(true);
                httpURLConnectionC.setRequestProperty("User-Agent", this.a.b());
                httpURLConnectionC.setRequestProperty("Accept-Encoding", "gzip");
                httpURLConnectionC.setConnectTimeout(this.c);
                httpURLConnectionC.setReadTimeout(this.d);
                httpURLConnectionC.setRequestMethod("GET");
                try {
                    d(httpURLConnectionC, map);
                    httpURLConnectionC.connect();
                    j.e.b.c<T> cVarB = b(httpURLConnectionC, cVar, this.b);
                    if (httpURLConnectionC != null) {
                        httpURLConnectionC.disconnect();
                    }
                    return cVarB;
                } catch (IOException e2) {
                    e = e2;
                    httpURLConnection = httpURLConnectionC;
                    j.e.b.c<T> cVarA = j.e.b.c.a(j.e.b.d.NETWORK_ERROR, new j.e.b.b(e));
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    return cVarA;
                } catch (Throwable th) {
                    th = th;
                    httpURLConnection = httpURLConnectionC;
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    throw th;
                }
            } catch (IOException e3) {
                e = e3;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
