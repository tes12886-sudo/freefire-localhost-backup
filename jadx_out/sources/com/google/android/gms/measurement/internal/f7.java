package com.google.android.gms.measurement.internal;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class f7 implements Runnable {
    private final URL a;
    private final String b;
    final /* synthetic */ h7 c;
    private final y4 d;

    public f7(h7 h7Var, String str, URL url, byte[] bArr, Map map, y4 y4Var, byte[] bArr2) {
        this.c = h7Var;
        com.google.android.gms.common.internal.q.g(str);
        com.google.android.gms.common.internal.q.k(url);
        com.google.android.gms.common.internal.q.k(y4Var);
        this.a = url;
        this.d = y4Var;
        this.b = str;
    }

    private final void b(final int i2, final Exception exc, final byte[] bArr, final Map<String, List<String>> map) {
        this.c.a.f().r(new Runnable(this, i2, exc, bArr, map) { // from class: com.google.android.gms.measurement.internal.e7
            private final f7 a;
            private final int b;
            private final Exception c;
            private final byte[] d;
            private final Map e;

            {
                this.a = this;
                this.b = i2;
                this.c = exc;
                this.d = bArr;
                this.e = map;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.a(this.b, this.c, this.d, this.e);
            }
        });
    }

    final /* synthetic */ void a(int i2, Exception exc, byte[] bArr, Map map) {
        this.d.a(this.b, i2, exc, bArr, map);
    }

    /* JADX WARN: Code duplicated, block: B:41:0x0065  */
    /* JADX WARN: Code duplicated, block: B:47:0x0073  */
    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        Map<String, List<String>> map;
        Throwable th;
        int responseCode;
        HttpURLConnection httpURLConnectionO;
        Map<String, List<String>> map2;
        IOException e;
        InputStream inputStream;
        this.c.g();
        try {
            httpURLConnectionO = this.c.o(this.a);
            try {
                responseCode = httpURLConnectionO.getResponseCode();
                try {
                    try {
                        Map<String, List<String>> headerFields = httpURLConnectionO.getHeaderFields();
                        try {
                            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                            inputStream = httpURLConnectionO.getInputStream();
                            try {
                                byte[] bArr = new byte[1024];
                                while (true) {
                                    int i2 = inputStream.read(bArr);
                                    if (i2 <= 0) {
                                        break;
                                    } else {
                                        byteArrayOutputStream.write(bArr, 0, i2);
                                    }
                                }
                                byte[] byteArray = byteArrayOutputStream.toByteArray();
                                if (inputStream != null) {
                                    inputStream.close();
                                }
                                if (httpURLConnectionO != null) {
                                    httpURLConnectionO.disconnect();
                                }
                                b(responseCode, null, byteArray, headerFields);
                            } catch (Throwable th2) {
                                th = th2;
                                if (inputStream != null) {
                                    inputStream.close();
                                }
                                throw th;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            inputStream = null;
                        }
                    } catch (IOException e2) {
                        e = e2;
                        map2 = null;
                        if (httpURLConnectionO != null) {
                            httpURLConnectionO.disconnect();
                        }
                        b(responseCode, e, null, map2);
                    } catch (Throwable th4) {
                        th = th4;
                        map = null;
                        if (httpURLConnectionO != null) {
                            httpURLConnectionO.disconnect();
                        }
                        b(responseCode, null, null, map);
                        throw th;
                    }
                } catch (IOException e3) {
                    e = e3;
                    if (httpURLConnectionO != null) {
                        httpURLConnectionO.disconnect();
                    }
                    b(responseCode, e, null, map2);
                } catch (Throwable th5) {
                    th = th5;
                    if (httpURLConnectionO != null) {
                        httpURLConnectionO.disconnect();
                    }
                    b(responseCode, null, null, map);
                    throw th;
                }
            } catch (IOException e4) {
                map2 = null;
                e = e4;
                responseCode = 0;
            } catch (Throwable th6) {
                map = null;
                th = th6;
                responseCode = 0;
            }
        } catch (IOException e5) {
            map2 = null;
            e = e5;
            responseCode = 0;
            httpURLConnectionO = null;
        } catch (Throwable th7) {
            map = null;
            th = th7;
            responseCode = 0;
            httpURLConnectionO = null;
        }
    }
}
