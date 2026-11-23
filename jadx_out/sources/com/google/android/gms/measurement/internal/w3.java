package com.google.android.gms.measurement.internal;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class w3 implements Runnable {
    private final URL a;
    private final byte[] b;
    private final u3 c;
    private final String d;
    private final Map<String, String> e;
    final /* synthetic */ x3 f;

    public w3(x3 x3Var, String str, URL url, byte[] bArr, Map<String, String> map, u3 u3Var) {
        this.f = x3Var;
        com.google.android.gms.common.internal.q.g(str);
        com.google.android.gms.common.internal.q.k(url);
        com.google.android.gms.common.internal.q.k(u3Var);
        this.a = url;
        this.b = bArr;
        this.c = u3Var;
        this.d = str;
        this.e = map;
    }

    /* JADX WARN: Code duplicated, block: B:64:0x010d  */
    /* JADX WARN: Code duplicated, block: B:77:0x014d  */
    /* JADX WARN: Code duplicated, block: B:79:0x0131 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:81:0x00f1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        Throwable th;
        HttpURLConnection httpURLConnectionN;
        Map map;
        IOException e;
        Map map2;
        IOException iOException;
        int responseCode;
        v3 v3Var;
        x4 x4VarF;
        InputStream inputStream;
        this.f.g();
        OutputStream outputStream = null;
        try {
            httpURLConnectionN = this.f.n(this.a);
            try {
                Map<String, String> map3 = this.e;
                if (map3 != null) {
                    for (Map.Entry<String, String> entry : map3.entrySet()) {
                        httpURLConnectionN.addRequestProperty(entry.getKey(), entry.getValue());
                    }
                }
                if (this.b != null) {
                    byte[] bArrI = this.f.b.Y().I(this.b);
                    p3 p3VarW = this.f.a.d().w();
                    int length = bArrI.length;
                    p3VarW.b("Uploading data. size", Integer.valueOf(length));
                    httpURLConnectionN.setDoOutput(true);
                    httpURLConnectionN.addRequestProperty("Content-Encoding", "gzip");
                    httpURLConnectionN.setFixedLengthStreamingMode(length);
                    httpURLConnectionN.connect();
                    OutputStream outputStream2 = httpURLConnectionN.getOutputStream();
                    try {
                        outputStream2.write(bArrI);
                        outputStream2.close();
                    } catch (IOException e2) {
                        map2 = null;
                        iOException = e2;
                        outputStream = outputStream2;
                        responseCode = 0;
                        if (outputStream != null) {
                            try {
                                outputStream.close();
                            } catch (IOException e3) {
                                this.f.a.d().o().c("Error closing HTTP compressed POST connection output stream. appId", r3.x(this.d), e3);
                            }
                        }
                        if (httpURLConnectionN != null) {
                            httpURLConnectionN.disconnect();
                        }
                        x4VarF = this.f.a.f();
                        v3Var = new v3(this.d, this.c, responseCode, iOException, null, map2, null);
                        x4VarF.r(v3Var);
                    } catch (Throwable th2) {
                        th = th2;
                        map = null;
                        outputStream = outputStream2;
                        responseCode = 0;
                        if (outputStream != null) {
                            try {
                                outputStream.close();
                            } catch (IOException e4) {
                                this.f.a.d().o().c("Error closing HTTP compressed POST connection output stream. appId", r3.x(this.d), e4);
                            }
                        }
                        if (httpURLConnectionN != null) {
                            httpURLConnectionN.disconnect();
                        }
                        this.f.a.f().r(new v3(this.d, this.c, responseCode, null, null, map, null));
                        throw th;
                    }
                }
                responseCode = httpURLConnectionN.getResponseCode();
                try {
                    try {
                        Map<String, List<String>> headerFields = httpURLConnectionN.getHeaderFields();
                        try {
                            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                            inputStream = httpURLConnectionN.getInputStream();
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
                                if (httpURLConnectionN != null) {
                                    httpURLConnectionN.disconnect();
                                }
                                x4VarF = this.f.a.f();
                                v3Var = new v3(this.d, this.c, responseCode, null, byteArray, headerFields, null);
                            } catch (Throwable th3) {
                                th = th3;
                                if (inputStream != null) {
                                    inputStream.close();
                                }
                                throw th;
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            inputStream = null;
                        }
                    } catch (IOException e5) {
                        e = e5;
                        iOException = e;
                        if (outputStream != null) {
                            outputStream.close();
                        }
                        if (httpURLConnectionN != null) {
                            httpURLConnectionN.disconnect();
                        }
                        x4VarF = this.f.a.f();
                        v3Var = new v3(this.d, this.c, responseCode, iOException, null, map2, null);
                    } catch (Throwable th5) {
                        th = th5;
                        if (outputStream != null) {
                            outputStream.close();
                        }
                        if (httpURLConnectionN != null) {
                            httpURLConnectionN.disconnect();
                        }
                        this.f.a.f().r(new v3(this.d, this.c, responseCode, null, null, map, null));
                        throw th;
                    }
                } catch (IOException e6) {
                    e = e6;
                    map2 = null;
                    iOException = e;
                    if (outputStream != null) {
                        outputStream.close();
                    }
                    if (httpURLConnectionN != null) {
                        httpURLConnectionN.disconnect();
                    }
                    x4VarF = this.f.a.f();
                    v3Var = new v3(this.d, this.c, responseCode, iOException, null, map2, null);
                } catch (Throwable th6) {
                    th = th6;
                    map = null;
                    if (outputStream != null) {
                        outputStream.close();
                    }
                    if (httpURLConnectionN != null) {
                        httpURLConnectionN.disconnect();
                    }
                    this.f.a.f().r(new v3(this.d, this.c, responseCode, null, null, map, null));
                    throw th;
                }
            } catch (IOException e7) {
                e = e7;
                map2 = null;
                iOException = e;
                responseCode = 0;
                if (outputStream != null) {
                    outputStream.close();
                }
                if (httpURLConnectionN != null) {
                    httpURLConnectionN.disconnect();
                }
                x4VarF = this.f.a.f();
                v3Var = new v3(this.d, this.c, responseCode, iOException, null, map2, null);
                x4VarF.r(v3Var);
            } catch (Throwable th7) {
                th = th7;
                map = null;
            }
        } catch (IOException e8) {
            e = e8;
            httpURLConnectionN = null;
            map2 = null;
        } catch (Throwable th8) {
            th = th8;
            httpURLConnectionN = null;
            map = null;
        }
        x4VarF.r(v3Var);
    }
}
