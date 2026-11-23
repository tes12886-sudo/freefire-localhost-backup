package j.d.a.e.a.a.i;

import android.content.Context;
import android.net.SSLCertificateSocketFactory;
import android.os.Looper;
import android.util.Log;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.net.URI;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpEntityEnclosingRequest;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.HttpRequestInterceptor;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.client.params.HttpClientParams;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.conn.scheme.PlainSocketFactory;
import org.apache.http.conn.scheme.Scheme;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.conn.scheme.SocketFactory;
import org.apache.http.conn.ssl.SSLSocketFactory;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.client.RequestWrapper;
import org.apache.http.impl.conn.tsccm.ThreadSafeClientConnManager;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;
import org.apache.http.params.HttpProtocolParams;
import org.apache.http.protocol.BasicHttpContext;
import org.apache.http.protocol.BasicHttpProcessor;
import org.apache.http.protocol.HttpContext;

/* JADX INFO: loaded from: classes.dex */
public final class a implements HttpClient {
    static Class<?> d;
    private static final HttpRequestInterceptor e;
    private final HttpClient a;
    private RuntimeException b = new IllegalStateException("AndroidHttpClient created and never closed");
    private volatile d c;

    /* JADX INFO: renamed from: j.d.a.e.a.a.i.a$a, reason: collision with other inner class name */
    class C0235a implements HttpRequestInterceptor {
        C0235a() {
        }

        @Override // org.apache.http.HttpRequestInterceptor
        public void process(HttpRequest httpRequest, HttpContext httpContext) {
            if (Looper.myLooper() != null && Looper.myLooper() == Looper.getMainLooper()) {
                throw new RuntimeException("This thread forbids HTTP requests");
            }
        }
    }

    class b extends DefaultHttpClient {
        b(ClientConnectionManager clientConnectionManager, HttpParams httpParams) {
            super(clientConnectionManager, httpParams);
        }

        @Override // org.apache.http.impl.client.DefaultHttpClient, org.apache.http.impl.client.AbstractHttpClient
        protected HttpContext createHttpContext() {
            BasicHttpContext basicHttpContext = new BasicHttpContext();
            basicHttpContext.setAttribute("http.authscheme-registry", getAuthSchemes());
            basicHttpContext.setAttribute("http.cookiespec-registry", getCookieSpecs());
            basicHttpContext.setAttribute("http.auth.credentials-provider", getCredentialsProvider());
            return basicHttpContext;
        }

        @Override // org.apache.http.impl.client.DefaultHttpClient, org.apache.http.impl.client.AbstractHttpClient
        protected BasicHttpProcessor createHttpProcessor() {
            BasicHttpProcessor basicHttpProcessorCreateHttpProcessor = super.createHttpProcessor();
            basicHttpProcessorCreateHttpProcessor.addRequestInterceptor(a.e);
            basicHttpProcessorCreateHttpProcessor.addRequestInterceptor(new c(a.this, null));
            return basicHttpProcessorCreateHttpProcessor;
        }
    }

    private class c implements HttpRequestInterceptor {
        private c() {
        }

        /* synthetic */ c(a aVar, C0235a c0235a) {
            this();
        }

        @Override // org.apache.http.HttpRequestInterceptor
        public void process(HttpRequest httpRequest, HttpContext httpContext) {
            d dVar = a.this.c;
            if (dVar != null && dVar.c() && (httpRequest instanceof HttpUriRequest)) {
                dVar.d(a.f((HttpUriRequest) httpRequest, false));
            }
        }
    }

    private static class d {
        private final String a;
        private final int b;

        /* JADX INFO: Access modifiers changed from: private */
        public boolean c() {
            return Log.isLoggable(this.a, this.b);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void d(String str) {
            Log.println(this.b, this.a, str);
        }
    }

    static {
        try {
            d = Class.forName("android.net.SSLSessionCache");
        } catch (Exception unused) {
        }
        e = new C0235a();
    }

    private a(ClientConnectionManager clientConnectionManager, HttpParams httpParams) {
        this.a = new b(clientConnectionManager, httpParams);
    }

    public static a e(String str, Context context) {
        Object objNewInstance;
        Class<?> cls;
        BasicHttpParams basicHttpParams = new BasicHttpParams();
        HttpConnectionParams.setStaleCheckingEnabled(basicHttpParams, false);
        HttpConnectionParams.setConnectionTimeout(basicHttpParams, 60000);
        HttpConnectionParams.setSoTimeout(basicHttpParams, 60000);
        HttpConnectionParams.setSocketBufferSize(basicHttpParams, 8192);
        HttpClientParams.setRedirecting(basicHttpParams, false);
        SocketFactory socketFactory = null;
        if (context == null || (cls = d) == null) {
            objNewInstance = null;
        } else {
            try {
                objNewInstance = cls.getConstructor(Context.class).newInstance(context);
            } catch (IllegalAccessException e2) {
                e2.printStackTrace();
                objNewInstance = null;
            } catch (IllegalArgumentException e3) {
                e3.printStackTrace();
                objNewInstance = null;
            } catch (InstantiationException e4) {
                e4.printStackTrace();
                objNewInstance = null;
            } catch (NoSuchMethodException e5) {
                e5.printStackTrace();
                objNewInstance = null;
            } catch (SecurityException e6) {
                e6.printStackTrace();
                objNewInstance = null;
            } catch (InvocationTargetException e7) {
                e7.printStackTrace();
                objNewInstance = null;
            }
        }
        HttpProtocolParams.setUserAgent(basicHttpParams, str);
        SchemeRegistry schemeRegistry = new SchemeRegistry();
        schemeRegistry.register(new Scheme("http", PlainSocketFactory.getSocketFactory(), 80));
        if (objNewInstance != null) {
            try {
                socketFactory = (SocketFactory) SSLCertificateSocketFactory.class.getDeclaredMethod("getHttpSocketFactory", Integer.TYPE, d).invoke(null, 60000, objNewInstance);
            } catch (IllegalAccessException e8) {
                e8.printStackTrace();
            } catch (IllegalArgumentException e9) {
                e9.printStackTrace();
            } catch (NoSuchMethodException e10) {
                e10.printStackTrace();
            } catch (SecurityException e11) {
                e11.printStackTrace();
            } catch (InvocationTargetException e12) {
                e12.printStackTrace();
            }
        }
        if (socketFactory == null) {
            socketFactory = SSLSocketFactory.getSocketFactory();
        }
        schemeRegistry.register(new Scheme("https", socketFactory, 443));
        return new a(new ThreadSafeClientConnManager(basicHttpParams, schemeRegistry), basicHttpParams);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String f(HttpUriRequest httpUriRequest, boolean z) throws IOException {
        HttpEntity entity;
        StringBuilder sb = new StringBuilder();
        sb.append("curl ");
        for (Header header : httpUriRequest.getAllHeaders()) {
            if (z || (!header.getName().equals("Authorization") && !header.getName().equals("Cookie"))) {
                sb.append("--header \"");
                sb.append(header.toString().trim());
                sb.append("\" ");
            }
        }
        URI uri = httpUriRequest.getURI();
        if (httpUriRequest instanceof RequestWrapper) {
            HttpRequest original = ((RequestWrapper) httpUriRequest).getOriginal();
            if (original instanceof HttpUriRequest) {
                uri = ((HttpUriRequest) original).getURI();
            }
        }
        sb.append("\"");
        sb.append(uri);
        sb.append("\"");
        if ((httpUriRequest instanceof HttpEntityEnclosingRequest) && (entity = ((HttpEntityEnclosingRequest) httpUriRequest).getEntity()) != null && entity.isRepeatable()) {
            if (entity.getContentLength() < 1024) {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                entity.writeTo(byteArrayOutputStream);
                String string = byteArrayOutputStream.toString();
                sb.append(" --data-ascii \"");
                sb.append(string);
                sb.append("\"");
            } else {
                sb.append(" [TOO MUCH DATA TO INCLUDE]");
            }
        }
        return sb.toString();
    }

    public void d() {
        if (this.b != null) {
            getConnectionManager().shutdown();
            this.b = null;
        }
    }

    @Override // org.apache.http.client.HttpClient
    public <T> T execute(HttpHost httpHost, HttpRequest httpRequest, ResponseHandler<? extends T> responseHandler) {
        return (T) this.a.execute(httpHost, httpRequest, responseHandler);
    }

    @Override // org.apache.http.client.HttpClient
    public <T> T execute(HttpHost httpHost, HttpRequest httpRequest, ResponseHandler<? extends T> responseHandler, HttpContext httpContext) {
        return (T) this.a.execute(httpHost, httpRequest, responseHandler, httpContext);
    }

    @Override // org.apache.http.client.HttpClient
    public <T> T execute(HttpUriRequest httpUriRequest, ResponseHandler<? extends T> responseHandler) {
        return (T) this.a.execute(httpUriRequest, responseHandler);
    }

    @Override // org.apache.http.client.HttpClient
    public <T> T execute(HttpUriRequest httpUriRequest, ResponseHandler<? extends T> responseHandler, HttpContext httpContext) {
        return (T) this.a.execute(httpUriRequest, responseHandler, httpContext);
    }

    @Override // org.apache.http.client.HttpClient
    public HttpResponse execute(HttpHost httpHost, HttpRequest httpRequest) {
        return this.a.execute(httpHost, httpRequest);
    }

    @Override // org.apache.http.client.HttpClient
    public HttpResponse execute(HttpHost httpHost, HttpRequest httpRequest, HttpContext httpContext) {
        return this.a.execute(httpHost, httpRequest, httpContext);
    }

    @Override // org.apache.http.client.HttpClient
    public HttpResponse execute(HttpUriRequest httpUriRequest) {
        return this.a.execute(httpUriRequest);
    }

    @Override // org.apache.http.client.HttpClient
    public HttpResponse execute(HttpUriRequest httpUriRequest, HttpContext httpContext) {
        return this.a.execute(httpUriRequest, httpContext);
    }

    protected void finalize() throws Throwable {
        super.finalize();
        RuntimeException runtimeException = this.b;
        if (runtimeException != null) {
            Log.e("AndroidHttpClient", "Leak found", runtimeException);
            this.b = null;
        }
    }

    @Override // org.apache.http.client.HttpClient
    public ClientConnectionManager getConnectionManager() {
        return this.a.getConnectionManager();
    }

    @Override // org.apache.http.client.HttpClient
    public HttpParams getParams() {
        return this.a.getParams();
    }
}
