package com.unity3d.player;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.CookieHandler;
import java.net.CookieManager;
import java.net.CookieStore;
import java.net.HttpCookie;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.SocketTimeoutException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLConnection;
import java.net.UnknownHostException;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;
import java.security.cert.CertPathValidatorException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLKeyException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: loaded from: classes.dex */
class UnityWebRequest implements Runnable {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final HostnameVerifier f1507k;
    private long a;
    private String b;
    private String c;
    private Map d;
    private boolean e;
    private int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f1508g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f1509h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f1510i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f1511j;

    static {
        if (CookieHandler.getDefault() == null) {
            CookieHandler.setDefault(new CookieManager());
        }
        f1507k = new HostnameVerifier() { // from class: com.unity3d.player.UnityWebRequest.1
            @Override // javax.net.ssl.HostnameVerifier
            public final boolean verify(String str, SSLSession sSLSession) {
                return true;
            }
        };
    }

    UnityWebRequest(long j2, String str, Map map, String str2, boolean z, int i2) {
        this.a = j2;
        this.b = str2;
        this.c = str;
        this.d = map;
        this.e = z;
        this.f = i2;
    }

    static void clearCookieCache(String str, String str2) {
        CookieStore cookieStore;
        CookieHandler cookieHandler = CookieHandler.getDefault();
        if (cookieHandler == null || !(cookieHandler instanceof CookieManager) || (cookieStore = ((CookieManager) cookieHandler).getCookieStore()) == null) {
            return;
        }
        if (str == null) {
            cookieStore.removeAll();
            return;
        }
        try {
            URI uri = new URI(null, str, str2, null);
            List<HttpCookie> list = cookieStore.get(uri);
            if (list != null) {
                Iterator<HttpCookie> it = list.iterator();
                while (it.hasNext()) {
                    cookieStore.remove(uri, it.next());
                }
            }
        } catch (URISyntaxException unused) {
        }
    }

    private static native void contentLengthCallback(long j2, int i2);

    private static native boolean downloadCallback(long j2, ByteBuffer byteBuffer, int i2);

    private static native void errorCallback(long j2, int i2, String str);

    private boolean hasTimedOut() {
        return this.f > 0 && System.currentTimeMillis() - this.f1508g >= ((long) this.f);
    }

    private static native void headerCallback(long j2, String str, String str2);

    private static native void responseCodeCallback(long j2, int i2);

    private void runSafe() {
        StringBuilder sb;
        String message;
        b.AbstractC0158b abstractC0158b;
        this.f1508g = System.currentTimeMillis();
        try {
            URL url = new URL(this.b);
            URLConnection uRLConnectionOpenConnection = url.openConnection();
            uRLConnectionOpenConnection.setConnectTimeout(this.f);
            uRLConnectionOpenConnection.setReadTimeout(this.f);
            InputStream inputStream = null;
            if (uRLConnectionOpenConnection instanceof HttpsURLConnection) {
                HttpsURLConnection httpsURLConnection = (HttpsURLConnection) uRLConnectionOpenConnection;
                if (this.e) {
                    abstractC0158b = new b.AbstractC0158b() { // from class: com.unity3d.player.UnityWebRequest.2
                        @Override // com.unity3d.player.b.AbstractC0158b, javax.net.ssl.X509TrustManager
                        public final void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
                            if (!UnityWebRequest.this.validateCertificateCallback((x509CertificateArr == null || x509CertificateArr.length <= 0) ? new byte[0] : x509CertificateArr[0].getEncoded())) {
                                throw new CertificateException();
                            }
                        }
                    };
                    httpsURLConnection.setHostnameVerifier(f1507k);
                } else {
                    abstractC0158b = null;
                }
                SSLSocketFactory sSLSocketFactoryA = b.a(abstractC0158b);
                if (sSLSocketFactoryA != null) {
                    httpsURLConnection.setSSLSocketFactory(sSLSocketFactoryA);
                }
            }
            if (url.getProtocol().equalsIgnoreCase("file") && !url.getHost().isEmpty()) {
                malformattedUrlCallback("file:// must use an absolute path");
                return;
            }
            boolean z = uRLConnectionOpenConnection instanceof HttpURLConnection;
            int i2 = 0;
            if (z) {
                try {
                    HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
                    httpURLConnection.setRequestMethod(this.c);
                    httpURLConnection.setInstanceFollowRedirects(false);
                    long j2 = this.f1509h;
                    if (j2 > 0) {
                        if (this.f1511j) {
                            httpURLConnection.setChunkedStreamingMode(0);
                        } else {
                            httpURLConnection.setFixedLengthStreamingMode((int) j2);
                        }
                        if (this.f1510i) {
                            httpURLConnection.addRequestProperty("Expect", "100-continue");
                        }
                    }
                } catch (ProtocolException e) {
                    badProtocolCallback(e.toString());
                    return;
                }
            }
            Map map = this.d;
            if (map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    uRLConnectionOpenConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
                }
            }
            ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(131072);
            if (uploadCallback(null) > 0) {
                uRLConnectionOpenConnection.setDoOutput(true);
                try {
                    OutputStream outputStream = uRLConnectionOpenConnection.getOutputStream();
                    while (true) {
                        int iUploadCallback = uploadCallback(byteBufferAllocateDirect);
                        if (iUploadCallback <= 0) {
                            break;
                        }
                        if (hasTimedOut()) {
                            outputStream.close();
                            errorCallback(this.a, 14, "WebRequest timed out.");
                            return;
                        }
                        outputStream.write(byteBufferAllocateDirect.array(), byteBufferAllocateDirect.arrayOffset(), iUploadCallback);
                    }
                } catch (Exception e2) {
                    errorCallback(e2.toString());
                    return;
                }
            }
            if (z) {
                try {
                    responseCodeCallback(((HttpURLConnection) uRLConnectionOpenConnection).getResponseCode());
                } catch (SocketTimeoutException e3) {
                    errorCallback(this.a, 14, e3.toString());
                    return;
                } catch (UnknownHostException e4) {
                    unknownHostCallback(e4.toString());
                    return;
                } catch (SSLException e5) {
                    sslCannotConnectCallback(e5);
                    return;
                } catch (IOException e6) {
                    errorCallback(e6.toString());
                    return;
                }
            }
            Map<String, List<String>> headerFields = uRLConnectionOpenConnection.getHeaderFields();
            headerCallback(headerFields);
            if ((headerFields == null || !headerFields.containsKey("content-length")) && uRLConnectionOpenConnection.getContentLength() != -1) {
                headerCallback("content-length", String.valueOf(uRLConnectionOpenConnection.getContentLength()));
            }
            if ((headerFields == null || !headerFields.containsKey("content-type")) && uRLConnectionOpenConnection.getContentType() != null) {
                headerCallback("content-type", uRLConnectionOpenConnection.getContentType());
            }
            if (headerFields != null && headerFields.containsKey("Set-Cookie") && CookieHandler.getDefault() != null && (CookieHandler.getDefault() instanceof CookieManager)) {
                CookieStore cookieStore = ((CookieManager) CookieHandler.getDefault()).getCookieStore();
                for (String str : headerFields.get("Set-Cookie")) {
                    try {
                        HttpCookie httpCookie = HttpCookie.parse(str).get(i2);
                        if (httpCookie.getPath() != null && !httpCookie.getPath().equals("") && (httpCookie.getDomain() == null || httpCookie.getDomain().equals(url.getHost()))) {
                            URI uri = new URI(url.getProtocol(), url.getHost(), httpCookie.getPath(), null);
                            httpCookie.setDomain(url.getHost());
                            cookieStore.add(uri, httpCookie);
                        }
                    } catch (IllegalArgumentException e7) {
                        sb = new StringBuilder("UnityWebRequest: error parsing cookie '");
                        sb.append(str);
                        sb.append("': ");
                        message = e7.getMessage();
                        sb.append(message);
                        g.Log(6, sb.toString());
                    } catch (URISyntaxException e8) {
                        sb = new StringBuilder("UnityWebRequest: error constructing URI: ");
                        message = e8.getMessage();
                        sb.append(message);
                        g.Log(6, sb.toString());
                    }
                    i2 = 0;
                }
            }
            contentLengthCallback(uRLConnectionOpenConnection.getContentLength());
            try {
                if (uRLConnectionOpenConnection instanceof HttpURLConnection) {
                    HttpURLConnection httpURLConnection2 = (HttpURLConnection) uRLConnectionOpenConnection;
                    responseCodeCallback(httpURLConnection2.getResponseCode());
                    inputStream = httpURLConnection2.getErrorStream();
                }
                if (inputStream == null) {
                    inputStream = uRLConnectionOpenConnection.getInputStream();
                }
                ReadableByteChannel readableByteChannelNewChannel = Channels.newChannel(inputStream);
                while (true) {
                    int i3 = readableByteChannelNewChannel.read(byteBufferAllocateDirect);
                    if (i3 == -1) {
                        break;
                    }
                    if (hasTimedOut()) {
                        readableByteChannelNewChannel.close();
                        errorCallback(this.a, 14, "WebRequest timed out.");
                        return;
                    } else if (!downloadCallback(byteBufferAllocateDirect, i3)) {
                        break;
                    } else {
                        byteBufferAllocateDirect.clear();
                    }
                }
                readableByteChannelNewChannel.close();
            } catch (SocketTimeoutException e9) {
                errorCallback(this.a, 14, e9.toString());
            } catch (UnknownHostException e10) {
                unknownHostCallback(e10.toString());
            } catch (SSLException e11) {
                sslCannotConnectCallback(e11);
            } catch (IOException e12) {
                errorCallback(this.a, 12, e12.toString());
            } catch (Exception e13) {
                errorCallback(e13.toString());
            }
        } catch (MalformedURLException e14) {
            malformattedUrlCallback(e14.toString());
        } catch (IOException e15) {
            errorCallback(e15.toString());
        }
    }

    private static native int uploadCallback(long j2, ByteBuffer byteBuffer);

    private static native boolean validateCertificateCallback(long j2, byte[] bArr);

    protected void badProtocolCallback(String str) {
        errorCallback(this.a, 4, str);
    }

    protected void contentLengthCallback(int i2) {
        contentLengthCallback(this.a, i2);
    }

    protected boolean downloadCallback(ByteBuffer byteBuffer, int i2) {
        return downloadCallback(this.a, byteBuffer, i2);
    }

    protected void errorCallback(String str) {
        errorCallback(this.a, 2, str);
    }

    protected void headerCallback(String str, String str2) {
        headerCallback(this.a, str, str2);
    }

    protected void headerCallback(Map map) {
        if (map == null || map.size() == 0) {
            return;
        }
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            if (str == null) {
                str = "Status";
            }
            Iterator it = ((List) entry.getValue()).iterator();
            while (it.hasNext()) {
                headerCallback(str, (String) it.next());
            }
        }
    }

    protected void malformattedUrlCallback(String str) {
        errorCallback(this.a, 5, str);
    }

    protected void responseCodeCallback(int i2) {
        responseCodeCallback(this.a, i2);
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            runSafe();
        } catch (Exception e) {
            errorCallback(e.toString());
        }
    }

    void setupTransferSettings(long j2, boolean z, boolean z2) {
        this.f1509h = j2;
        this.f1510i = z;
        this.f1511j = z2;
    }

    protected void sslCannotConnectCallback(SSLException sSLException) {
        int i2;
        String string = sSLException.toString();
        for (Throwable cause = sSLException; cause != null; cause = cause.getCause()) {
            if (cause instanceof SSLKeyException) {
                i2 = 23;
            } else if ((cause instanceof SSLPeerUnverifiedException) || (cause instanceof CertPathValidatorException)) {
                i2 = 25;
            }
            errorCallback(this.a, i2, string);
        }
        i2 = 16;
        errorCallback(this.a, i2, string);
    }

    protected void unknownHostCallback(String str) {
        errorCallback(this.a, 7, str);
    }

    protected int uploadCallback(ByteBuffer byteBuffer) {
        return uploadCallback(this.a, byteBuffer);
    }

    protected boolean validateCertificateCallback(byte[] bArr) {
        return validateCertificateCallback(this.a, bArr);
    }
}
