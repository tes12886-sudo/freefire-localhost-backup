package com.google.firebase.messaging;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
class h0 implements Closeable {
    private final URL a;
    private Task<Bitmap> b;
    private volatile InputStream c;

    private h0(URL url) {
        this.a = url;
    }

    private byte[] c() throws IOException {
        URLConnection uRLConnectionOpenConnection = this.a.openConnection();
        if (uRLConnectionOpenConnection.getContentLength() > 1048576) {
            throw new IOException("Content-Length exceeds max size of 1048576");
        }
        InputStream inputStream = uRLConnectionOpenConnection.getInputStream();
        try {
            this.c = inputStream;
            byte[] bArrA = j.d.a.c.f.g.r.a(j.d.a.c.f.g.r.b(inputStream, 1048577L));
            if (inputStream != null) {
                inputStream.close();
            }
            if (Log.isLoggable("FirebaseMessaging", 2)) {
                String strValueOf = String.valueOf(this.a);
                StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 34);
                sb.append("Downloaded ");
                sb.append(bArrA.length);
                sb.append(" bytes from ");
                sb.append(strValueOf);
                Log.v("FirebaseMessaging", sb.toString());
            }
            if (bArrA.length <= 1048576) {
                return bArrA;
            }
            throw new IOException("Image exceeds max size of 1048576");
        } catch (Throwable th) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (Throwable th2) {
                    j.d.a.c.f.g.z.a(th, th2);
                }
            }
            throw th;
        }
    }

    public static h0 f(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return new h0(new URL(str));
        } catch (MalformedURLException unused) {
            String strValueOf = String.valueOf(str);
            Log.w("FirebaseMessaging", strValueOf.length() != 0 ? "Not downloading image, bad URL: ".concat(strValueOf) : new String("Not downloading image, bad URL: "));
            return null;
        }
    }

    public Bitmap b() throws IOException {
        String strValueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 22);
        sb.append("Starting download of: ");
        sb.append(strValueOf);
        Log.i("FirebaseMessaging", sb.toString());
        byte[] bArrC = c();
        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrC, 0, bArrC.length);
        if (bitmapDecodeByteArray == null) {
            String strValueOf2 = String.valueOf(this.a);
            StringBuilder sb2 = new StringBuilder(String.valueOf(strValueOf2).length() + 24);
            sb2.append("Failed to decode image: ");
            sb2.append(strValueOf2);
            throw new IOException(sb2.toString());
        }
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            String strValueOf3 = String.valueOf(this.a);
            StringBuilder sb3 = new StringBuilder(String.valueOf(strValueOf3).length() + 31);
            sb3.append("Successfully downloaded image: ");
            sb3.append(strValueOf3);
            Log.d("FirebaseMessaging", sb3.toString());
        }
        return bitmapDecodeByteArray;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        try {
            j.d.a.c.f.g.s.a(this.c);
        } catch (NullPointerException e) {
            Log.e("FirebaseMessaging", "Failed to close the image download stream.", e);
        }
    }

    public Task<Bitmap> j() {
        Task<Bitmap> task = this.b;
        com.google.android.gms.common.internal.q.k(task);
        return task;
    }

    public void l(Executor executor) {
        this.b = com.google.android.gms.tasks.d.c(executor, new Callable(this) { // from class: com.google.firebase.messaging.g0
            private final h0 a;

            {
                this.a = this;
            }

            @Override // java.util.concurrent.Callable
            public Object call() {
                return this.a.b();
            }
        });
    }
}
