package com.facebook.j0.v;

import android.os.AsyncTask;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.net.URL;
import java.net.URLConnection;

/* JADX INFO: loaded from: classes.dex */
public final class f extends AsyncTask<String, Void, Boolean> {
    private final String a;
    private final File b;
    private final a c;

    public interface a {
        void a(File file);
    }

    public f(String str, File file, a aVar) {
        l.y.c.i.e(str, "uriStr");
        l.y.c.i.e(file, "destFile");
        l.y.c.i.e(aVar, "onSuccess");
        this.a = str;
        this.b = file;
        this.c = aVar;
    }

    public Boolean a(String... strArr) {
        if (com.facebook.internal.m0.i.a.d(this)) {
            return null;
        }
        try {
            l.y.c.i.e(strArr, "args");
            try {
                URL url = new URL(this.a);
                URLConnection uRLConnectionOpenConnection = url.openConnection();
                l.y.c.i.d(uRLConnectionOpenConnection, "conn");
                int contentLength = uRLConnectionOpenConnection.getContentLength();
                DataInputStream dataInputStream = new DataInputStream(url.openStream());
                byte[] bArr = new byte[contentLength];
                dataInputStream.readFully(bArr);
                dataInputStream.close();
                DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(this.b));
                dataOutputStream.write(bArr);
                dataOutputStream.flush();
                dataOutputStream.close();
                return Boolean.TRUE;
            } catch (Exception unused) {
                return Boolean.FALSE;
            }
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, this);
            return null;
        }
    }

    protected void b(boolean z) {
        if (!com.facebook.internal.m0.i.a.d(this) && z) {
            try {
                this.c.a(this.b);
            } catch (Throwable th) {
                com.facebook.internal.m0.i.a.b(th, this);
            }
        }
    }

    @Override // android.os.AsyncTask
    public /* bridge */ /* synthetic */ Boolean doInBackground(String[] strArr) {
        if (com.facebook.internal.m0.i.a.d(this)) {
            return null;
        }
        try {
            return a(strArr);
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, this);
            return null;
        }
    }

    @Override // android.os.AsyncTask
    public /* bridge */ /* synthetic */ void onPostExecute(Boolean bool) {
        if (com.facebook.internal.m0.i.a.d(this)) {
            return;
        }
        try {
            b(bool.booleanValue());
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, this);
        }
    }
}
