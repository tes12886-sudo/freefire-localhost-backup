package com.facebook.internal.o0;

import android.util.Base64;
import android.util.Log;
import com.facebook.r;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.Signature;
import java.security.spec.X509EncodedKeySpec;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import l.d0.d;
import l.d0.p;
import l.s;
import l.y.c.i;
import l.y.c.l;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class b {
    private static final String a = "/.well-known/oauth/openid/keys/";
    public static final b b = new b();

    static final class a implements Runnable {
        final /* synthetic */ URL a;
        final /* synthetic */ l b;
        final /* synthetic */ String c;
        final /* synthetic */ ReentrantLock d;
        final /* synthetic */ Condition e;

        a(URL url, l lVar, String str, ReentrantLock reentrantLock, Condition condition) {
            this.a = url;
            this.b = lVar;
            this.c = str;
            this.d = reentrantLock;
            this.e = condition;
        }

        /* JADX WARN: Type inference failed for: r1v14, types: [T, java.lang.String] */
        @Override // java.lang.Runnable
        public final void run() {
            ReentrantLock reentrantLock;
            if (com.facebook.internal.m0.i.a.d(this)) {
                return;
            }
            try {
                URLConnection uRLConnectionOpenConnection = this.a.openConnection();
                if (uRLConnectionOpenConnection == null) {
                    throw new NullPointerException("null cannot be cast to non-null type java.net.HttpURLConnection");
                }
                HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
                try {
                    try {
                        InputStream inputStream = httpURLConnection.getInputStream();
                        i.d(inputStream, "connection.inputStream");
                        Reader inputStreamReader = new InputStreamReader(inputStream, d.b);
                        String strC = l.x.b.c(inputStreamReader instanceof BufferedReader ? (BufferedReader) inputStreamReader : new BufferedReader(inputStreamReader, 8192));
                        httpURLConnection.getInputStream().close();
                        this.b.a = new JSONObject(strC).optString(this.c);
                        httpURLConnection.disconnect();
                        reentrantLock = this.d;
                        reentrantLock.lock();
                        try {
                            this.e.signal();
                            s sVar = s.a;
                        } finally {
                            reentrantLock.unlock();
                        }
                    } catch (Throwable th) {
                        httpURLConnection.disconnect();
                        ReentrantLock reentrantLock2 = this.d;
                        reentrantLock2.lock();
                        try {
                            this.e.signal();
                            s sVar2 = s.a;
                            throw th;
                        } finally {
                            reentrantLock2.unlock();
                        }
                    }
                } catch (Exception e) {
                    String name = b.b.getClass().getName();
                    String message = e.getMessage();
                    if (message == null) {
                        message = "Error getting public key";
                    }
                    Log.d(name, message);
                    httpURLConnection.disconnect();
                    reentrantLock = this.d;
                    reentrantLock.lock();
                    try {
                        this.e.signal();
                        s sVar3 = s.a;
                    } finally {
                        reentrantLock.unlock();
                    }
                }
            } catch (Throwable th2) {
                com.facebook.internal.m0.i.a.b(th2, this);
            }
        }
    }

    private b() {
    }

    public static final PublicKey a(String str) {
        i.e(str, "key");
        byte[] bArrDecode = Base64.decode(p.t(p.t(p.t(str, "\n", "", false, 4, null), "-----BEGIN PUBLIC KEY-----", "", false, 4, null), "-----END PUBLIC KEY-----", "", false, 4, null), 0);
        i.d(bArrDecode, "Base64.decode(pubKeyString, Base64.DEFAULT)");
        PublicKey publicKeyGeneratePublic = KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(bArrDecode));
        i.d(publicKeyGeneratePublic, "kf.generatePublic(x509publicKey)");
        return publicKeyGeneratePublic;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final String b(String str) {
        i.e(str, "kid");
        URL url = new URL("https", "www." + r.o(), a);
        ReentrantLock reentrantLock = new ReentrantLock();
        Condition conditionNewCondition = reentrantLock.newCondition();
        l lVar = new l();
        lVar.a = null;
        r.n().execute(new a(url, lVar, str, reentrantLock, conditionNewCondition));
        reentrantLock.lock();
        try {
            conditionNewCondition.await(5000L, TimeUnit.MILLISECONDS);
            return (String) lVar.a;
        } finally {
            reentrantLock.unlock();
        }
    }

    public static final boolean c(PublicKey publicKey, String str, String str2) {
        i.e(publicKey, "publicKey");
        i.e(str, "data");
        i.e(str2, "signature");
        try {
            Signature signature = Signature.getInstance("SHA256withRSA");
            signature.initVerify(publicKey);
            byte[] bytes = str.getBytes(d.b);
            i.d(bytes, "(this as java.lang.String).getBytes(charset)");
            signature.update(bytes);
            byte[] bArrDecode = Base64.decode(str2, 8);
            i.d(bArrDecode, "Base64.decode(signature, Base64.URL_SAFE)");
            return signature.verify(bArrDecode);
        } catch (Exception unused) {
            return false;
        }
    }
}
