package j.d.a.e.a.a.i;

import android.content.Context;
import android.net.Proxy;
import android.os.Build;
import android.os.PowerManager;
import android.os.Process;
import android.util.Log;
import com.FF.voiceengine.FFVoiceConst;
import com.appff.haptic.base.Utils;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.SyncFailedException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Locale;
import org.apache.http.Header;
import org.apache.http.HttpHost;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.conn.params.ConnRouteParams;

/* JADX INFO: loaded from: classes.dex */
public class f {
    private Context a;
    private j.d.a.e.a.a.i.d b;
    private g c;
    private final h d;
    private final j.d.a.e.a.a.i.e e;
    private String f;

    private static class b {
        public int a;
        public int b;
        public String c;
        public boolean d;
        public String e;
        public String f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public String f2012g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f2013h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public long f2014i;

        private b() {
            this.a = 0;
            this.b = 0;
            this.d = false;
            this.f2013h = 0;
            this.f2014i = 0L;
        }
    }

    private class c extends Throwable {
        private c(f fVar) {
        }
    }

    private static class d {
        public String a;
        public FileOutputStream b;
        public int e;
        public String f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public String f2016h;
        public boolean c = false;
        public int d = 0;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f2015g = false;

        public d(j.d.a.e.a.a.i.d dVar, g gVar) {
            this.e = 0;
            this.e = dVar.f2004l;
            this.f2016h = dVar.a;
            this.a = gVar.generateTempSaveFileName(dVar.c);
        }
    }

    private class e extends Throwable {
        public int a;

        public e(f fVar, int i2, String str) {
            super(str);
            this.a = i2;
        }

        public e(f fVar, int i2, String str, Throwable th) {
            super(str, th);
            this.a = i2;
        }
    }

    public f(j.d.a.e.a.a.i.d dVar, g gVar, j.d.a.e.a.a.i.e eVar) {
        this.a = gVar;
        this.b = dVar;
        this.c = gVar;
        this.e = eVar;
        this.d = h.a(gVar);
        this.f = "APKXDL (Linux; U; Android " + Build.VERSION.RELEASE + ";" + Locale.getDefault().toString() + "; " + Build.DEVICE + "/" + Build.ID + ")" + gVar.getPackageName();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v16, types: [java.io.SyncFailedException] */
    /* JADX WARN: Type inference failed for: r4v17, types: [java.io.FileNotFoundException] */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.io.FileOutputStream] */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v22 */
    /* JADX WARN: Type inference failed for: r4v23 */
    /* JADX WARN: Type inference failed for: r4v24 */
    /* JADX WARN: Type inference failed for: r4v25 */
    /* JADX WARN: Type inference failed for: r4v26 */
    /* JADX WARN: Type inference failed for: r4v27 */
    /* JADX WARN: Type inference failed for: r4v28 */
    /* JADX WARN: Type inference failed for: r4v29 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.io.FileOutputStream] */
    /* JADX WARN: Type inference failed for: r4v9, types: [java.io.FileOutputStream] */
    /* JADX WARN: Type inference failed for: r5v10, types: [java.io.FileOutputStream] */
    /* JADX WARN: Type inference failed for: r5v11, types: [java.io.FileOutputStream] */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14, types: [java.io.FileOutputStream] */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v19 */
    /* JADX WARN: Type inference failed for: r5v20 */
    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.StringBuilder] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0039 -> B:53:0x00b4). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x003f -> B:53:0x00b4). Please report as a decompilation issue!!! */
    private void A(d dVar) throws Throwable {
        ?? fileOutputStream;
        ?? e2 = 0;
        ?? r4 = 0;
        ?? r5 = 0;
        e2 = 0;
        e2 = 0;
        try {
            try {
                try {
                    try {
                        fileOutputStream = new FileOutputStream(dVar.a, true);
                        try {
                            FileDescriptor fd = fileOutputStream.getFD();
                            fd.sync();
                            fileOutputStream.close();
                            e2 = fd;
                            fileOutputStream = fileOutputStream;
                        } catch (FileNotFoundException e3) {
                            e2 = e3;
                            Log.w("LVLDL", "file " + dVar.a + " not found: " + e2);
                            if (fileOutputStream != 0) {
                                fileOutputStream.close();
                            }
                        } catch (SyncFailedException e4) {
                            e2 = e4;
                            Log.w("LVLDL", "file " + dVar.a + " sync failed: " + e2);
                            if (fileOutputStream != 0) {
                                fileOutputStream.close();
                            }
                        } catch (IOException e5) {
                            e = e5;
                            r4 = fileOutputStream;
                            StringBuilder sb = new StringBuilder();
                            sb.append("IOException trying to sync ");
                            sb.append(dVar.a);
                            sb.append(": ");
                            sb.append(e);
                            Log.w("LVLDL", sb.toString());
                            e2 = r4;
                            fileOutputStream = sb;
                            if (r4 != 0) {
                                r4.close();
                                e2 = r4;
                                fileOutputStream = sb;
                            }
                        } catch (RuntimeException e6) {
                            e = e6;
                            r5 = fileOutputStream;
                            Log.w("LVLDL", "exception while syncing file: ", e);
                            e2 = r5;
                            fileOutputStream = fileOutputStream;
                            if (r5 != 0) {
                                r5.close();
                                e2 = r5;
                                fileOutputStream = fileOutputStream;
                            }
                        }
                    } catch (Throwable th) {
                        th = th;
                        if (e2 != 0) {
                            try {
                                e2.close();
                            } catch (IOException e7) {
                                Log.w("LVLDL", "IOException while closing synced file: ", e7);
                            } catch (RuntimeException e8) {
                                Log.w("LVLDL", "exception while closing file: ", e8);
                            }
                        }
                        throw th;
                    }
                } catch (IOException e9) {
                    Log.w("LVLDL", "IOException while closing synced file: ", e9);
                    e2 = e2;
                    fileOutputStream = fileOutputStream;
                } catch (RuntimeException e10) {
                    Log.w("LVLDL", "exception while closing file: ", e10);
                    e2 = e2;
                    fileOutputStream = fileOutputStream;
                }
            } catch (FileNotFoundException e11) {
                fileOutputStream = 0;
                e2 = e11;
            } catch (SyncFailedException e12) {
                fileOutputStream = 0;
                e2 = e12;
            } catch (IOException e13) {
                e = e13;
            } catch (RuntimeException e14) {
                e = e14;
            }
        } catch (Throwable th2) {
            th = th2;
            e2 = fileOutputStream;
        }
    }

    private void B(d dVar, b bVar, byte[] bArr, InputStream inputStream) throws e {
        while (true) {
            int iU = u(dVar, bVar, bArr, inputStream);
            if (iU == -1) {
                k(dVar, bVar);
                return;
            }
            dVar.f2015g = true;
            F(dVar, bArr, iU);
            bVar.a += iU;
            bVar.b += iU;
            w(dVar, bVar);
            d(dVar);
        }
    }

    private void C(d dVar, b bVar) {
        j.d.a.e.a.a.i.d dVar2 = this.b;
        dVar2.d = bVar.c;
        this.d.j(dVar2);
    }

    private void D(int i2, boolean z, int i3, int i4, boolean z2, String str) {
        j.d.a.e.a.a.i.d dVar = this.b;
        dVar.f2000h = i2;
        dVar.f2003k = i3;
        dVar.f2004l = i4;
        dVar.f1999g = System.currentTimeMillis();
        if (z) {
            j.d.a.e.a.a.i.d dVar2 = this.b;
            if (z2) {
                dVar2.f2002j = 1;
            } else {
                dVar2.f2002j++;
            }
        } else {
            this.b.f2002j = 0;
        }
        this.d.j(this.b);
    }

    private String E() {
        return this.f;
    }

    private void F(d dVar, byte[] bArr, int i2) throws e {
        try {
            if (dVar.b == null) {
                dVar.b = new FileOutputStream(dVar.a, true);
            }
            dVar.b.write(bArr, 0, i2);
            f(dVar);
        } catch (IOException e2) {
            if (!j.d.a.e.a.a.e.n()) {
                throw new e(this, g.STATUS_DEVICE_NOT_FOUND_ERROR, "external media not mounted while writing destination file");
            }
            if (j.d.a.e.a.a.e.c(j.d.a.e.a.a.e.g(dVar.a)) < i2) {
                throw new e(this, g.STATUS_INSUFFICIENT_SPACE_ERROR, "insufficient space while writing destination file", e2);
            }
            throw new e(this, g.STATUS_FILE_ERROR, "while writing destination file: " + e2.toString(), e2);
        }
    }

    private void a(b bVar, HttpGet httpGet) {
        if (bVar.d) {
            String str = bVar.c;
            if (str != null) {
                httpGet.addHeader("If-Match", str);
            }
            httpGet.addHeader("Range", "bytes=" + bVar.a + "-");
        }
    }

    private boolean b(b bVar) {
        return bVar.a > 0 && bVar.c == null;
    }

    private void c(d dVar) throws e {
        int networkAvailabilityState = this.c.getNetworkAvailabilityState(this.d);
        if (networkAvailabilityState == 2) {
            throw new e(this, g.STATUS_WAITING_FOR_NETWORK, "waiting for network to return");
        }
        if (networkAvailabilityState == 3) {
            throw new e(this, g.STATUS_QUEUED_FOR_WIFI, "waiting for wifi");
        }
        if (networkAvailabilityState == 5) {
            throw new e(this, g.STATUS_WAITING_FOR_NETWORK, "roaming is not allowed");
        }
        if (networkAvailabilityState == 6) {
            throw new e(this, g.STATUS_QUEUED_FOR_WIFI_OR_CELLULAR_PERMISSION, "waiting for wifi or for download over cellular to be authorized");
        }
    }

    private void d(d dVar) throws e {
        if (this.c.getControl() == 1 && this.c.getStatus() == 193) {
            throw new e(this, this.c.getStatus(), "download paused");
        }
    }

    private void e(d dVar, int i2) {
        f(dVar);
        if (dVar.a == null || !g.isStatusError(i2)) {
            return;
        }
        new File(dVar.a).delete();
        dVar.a = null;
    }

    private void f(d dVar) {
        try {
            FileOutputStream fileOutputStream = dVar.b;
            if (fileOutputStream != null) {
                fileOutputStream.close();
                dVar.b = null;
            }
        } catch (IOException unused) {
        }
    }

    private void g(d dVar, j.d.a.e.a.a.i.a aVar, HttpGet httpGet) throws e, c {
        b bVar = new b();
        byte[] bArr = new byte[Utils.CONTINUOUS_EVENT];
        d(dVar);
        z(dVar, bVar);
        a(bVar, httpGet);
        c(dVar);
        this.e.onDownloadStateChanged(3);
        HttpResponse httpResponseY = y(dVar, aVar, httpGet);
        l(dVar, bVar, httpResponseY);
        t(dVar, bVar, httpResponseY);
        InputStream inputStreamS = s(dVar, httpResponseY);
        this.e.onDownloadStateChanged(4);
        B(dVar, bVar, bArr, inputStreamS);
    }

    private void h(d dVar) throws Throwable {
        A(dVar);
        String str = dVar.a;
        String strB = j.d.a.e.a.a.e.b(this.c, this.b.c);
        if (dVar.a.equals(strB)) {
            return;
        }
        File file = new File(str);
        File file2 = new File(strB);
        j.d.a.e.a.a.i.d dVar2 = this.b;
        long j2 = dVar2.e;
        if (j2 == -1 || dVar2.f != j2) {
            throw new e(this, g.STATUS_FILE_DELIVERED_INCORRECTLY, "file delivered with incorrect size. probably due to network not browser configured");
        }
        if (!file.renameTo(file2)) {
            throw new e(this, g.STATUS_FILE_ERROR, "unable to finalize destination file");
        }
    }

    private int i(d dVar) {
        if (this.c.getNetworkAvailabilityState(this.d) != 1) {
            return g.STATUS_WAITING_FOR_NETWORK;
        }
        if (this.b.f2002j < 5) {
            dVar.c = true;
            return g.STATUS_WAITING_TO_RETRY;
        }
        Log.w("LVLDL", "reached max retries for " + this.b.f2002j);
        return g.STATUS_HTTP_DATA_ERROR;
    }

    private void k(d dVar, b bVar) throws e {
        j.d.a.e.a.a.i.d dVar2 = this.b;
        dVar2.f = bVar.a;
        this.d.j(dVar2);
        String str = bVar.e;
        if ((str == null || bVar.a == Integer.parseInt(str)) ? false : true) {
            if (!b(bVar)) {
                throw new e(this, i(dVar), "closed socket before end of file");
            }
            throw new e(this, g.STATUS_CANNOT_RESUME, "mismatched content length");
        }
    }

    private void l(d dVar, b bVar, HttpResponse httpResponse) throws e, c {
        int statusCode = httpResponse.getStatusLine().getStatusCode();
        if (statusCode == 503 && this.b.f2002j < 5) {
            o(dVar, httpResponse);
            throw null;
        }
        if (statusCode == 301 || statusCode == 302 || statusCode == 303 || statusCode == 307) {
            n(dVar, httpResponse, statusCode);
        }
        if (statusCode == (bVar.d ? 206 : g.STATUS_SUCCESS)) {
            dVar.e = 0;
        } else {
            m(dVar, bVar, statusCode);
            throw null;
        }
    }

    private void m(d dVar, b bVar, int i2) throws e {
        int i3;
        if (g.isStatusError(i2)) {
            i3 = i2;
        } else if (i2 < 300 || i2 >= 400) {
            i3 = (bVar.d && i2 == 200) ? g.STATUS_CANNOT_RESUME : g.STATUS_UNHANDLED_HTTP_CODE;
        } else {
            i3 = g.STATUS_UNHANDLED_REDIRECT;
        }
        throw new e(this, i3, "http error " + i2);
    }

    private void n(d dVar, HttpResponse httpResponse, int i2) throws e, c {
        if (dVar.e >= 5) {
            throw new e(this, g.STATUS_TOO_MANY_REDIRECTS, "too many redirects");
        }
        Header firstHeader = httpResponse.getFirstHeader("Location");
        if (firstHeader == null) {
            return;
        }
        try {
            String string = new URI(this.b.a).resolve(new URI(firstHeader.getValue())).toString();
            dVar.e++;
            dVar.f2016h = string;
            if (i2 == 301 || i2 == 303) {
                dVar.f = string;
            }
            throw new c();
        } catch (URISyntaxException unused) {
            throw new e(this, g.STATUS_HTTP_DATA_ERROR, "Couldn't resolve redirect URI");
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0020 A[Catch: NumberFormatException -> 0x0036, PHI: r0
  0x0020: PHI (r0v3 int) = (r0v2 int), (r0v6 int) binds: [B:7:0x0019, B:9:0x001e] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {NumberFormatException -> 0x0036, blocks: (B:4:0x000b, B:11:0x0022, B:12:0x0031, B:10:0x0020), top: B:19:0x000b }] */
    private void o(d dVar, HttpResponse httpResponse) throws e {
        int i2;
        dVar.c = true;
        Header firstHeader = httpResponse.getFirstHeader("Retry-After");
        if (firstHeader != null) {
            try {
                int i3 = Integer.parseInt(firstHeader.getValue());
                dVar.d = i3;
                if (i3 >= 0) {
                    int i4 = 30;
                    if (i3 >= 30) {
                        i4 = 86400;
                        if (i3 > 86400) {
                            dVar.d = i4;
                        }
                    } else {
                        dVar.d = i4;
                    }
                    int iNextInt = dVar.d + j.d.a.e.a.a.e.a.nextInt(31);
                    dVar.d = iNextInt;
                    i2 = iNextInt * FFVoiceConst.FFVoiceEvent.FFVoice_EVENT_EOF;
                } else {
                    i2 = 0;
                }
                dVar.d = i2;
            } catch (NumberFormatException unused) {
            }
        }
        throw new e(this, g.STATUS_WAITING_TO_RETRY, "got 503 Service Unavailable, will retry later");
    }

    private static final boolean p(String str) {
        if (str == null) {
            return false;
        }
        try {
            String host = URI.create(str).getHost();
            return host != null && (host.equalsIgnoreCase("localhost") || host.equals("127.0.0.1") || host.equals("[::1]"));
        } catch (IllegalArgumentException unused) {
        }
    }

    private void q() {
        StringBuilder sb = new StringBuilder();
        sb.append("Net ");
        sb.append(this.c.getNetworkAvailabilityState(this.d) == 1 ? "Up" : "Down");
        Log.i("LVLDL", sb.toString());
    }

    private void r(int i2, boolean z, int i3, int i4, boolean z2, String str) {
        D(i2, z, i3, i4, z2, str);
        g.isStatusCompleted(i2);
    }

    private InputStream s(d dVar, HttpResponse httpResponse) throws e {
        try {
            return httpResponse.getEntity().getContent();
        } catch (IOException e2) {
            q();
            throw new e(this, i(dVar), "while getting entity: " + e2.toString(), e2);
        }
    }

    private void t(d dVar, b bVar, HttpResponse httpResponse) throws e {
        if (bVar.d) {
            return;
        }
        v(dVar, bVar, httpResponse);
        try {
            g gVar = this.c;
            j.d.a.e.a.a.i.d dVar2 = this.b;
            dVar.a = gVar.generateSaveFile(dVar2.c, dVar2.e);
            try {
                dVar.b = new FileOutputStream(dVar.a);
            } catch (FileNotFoundException e2) {
                try {
                    if (new File(j.d.a.e.a.a.e.j(this.c)).mkdirs()) {
                        dVar.b = new FileOutputStream(dVar.a);
                    }
                } catch (Exception unused) {
                    throw new e(this, g.STATUS_FILE_ERROR, "while opening destination file: " + e2.toString(), e2);
                }
            }
            C(dVar, bVar);
            c(dVar);
        } catch (g.a e3) {
            throw new e(this, e3.a, e3.b);
        }
    }

    private int u(d dVar, b bVar, byte[] bArr, InputStream inputStream) throws e {
        try {
            return inputStream.read(bArr);
        } catch (IOException e2) {
            q();
            this.b.f = bVar.a;
            this.d.j(this.b);
            if (b(bVar)) {
                throw new e(this, g.STATUS_CANNOT_RESUME, "while reading response: " + e2.toString() + ", can't resume interrupted download with no ETag", e2);
            }
            throw new e(this, i(dVar), "while reading response: " + e2.toString(), e2);
        }
    }

    private void v(d dVar, b bVar, HttpResponse httpResponse) throws e {
        Header firstHeader;
        Header firstHeader2 = httpResponse.getFirstHeader("Content-Disposition");
        if (firstHeader2 != null) {
            bVar.f = firstHeader2.getValue();
        }
        Header firstHeader3 = httpResponse.getFirstHeader("Content-Location");
        if (firstHeader3 != null) {
            bVar.f2012g = firstHeader3.getValue();
        }
        Header firstHeader4 = httpResponse.getFirstHeader("ETag");
        if (firstHeader4 != null) {
            bVar.c = firstHeader4.getValue();
        }
        Header firstHeader5 = httpResponse.getFirstHeader("Transfer-Encoding");
        String value = firstHeader5 != null ? firstHeader5.getValue() : null;
        Header firstHeader6 = httpResponse.getFirstHeader("Content-Type");
        if (firstHeader6 != null && !firstHeader6.getValue().equals("application/vnd.android.obb")) {
            throw new e(this, g.STATUS_FILE_DELIVERED_INCORRECTLY, "file delivered with incorrect Mime type");
        }
        if (value == null && (firstHeader = httpResponse.getFirstHeader("Content-Length")) != null) {
            String value2 = firstHeader.getValue();
            bVar.e = value2;
            long j2 = Long.parseLong(value2);
            if (j2 != -1 && j2 != this.b.e) {
                Log.e("LVLDL", "Incorrect file size delivered.");
            }
        }
        if (bVar.e == null && (value == null || !value.equalsIgnoreCase("chunked"))) {
            throw new e(this, g.STATUS_HTTP_DATA_ERROR, "can't know size of download, giving up");
        }
    }

    private void w(d dVar, b bVar) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        int i2 = bVar.a;
        if (i2 - bVar.f2013h <= 4096 || jCurrentTimeMillis - bVar.f2014i <= 1000) {
            return;
        }
        j.d.a.e.a.a.i.d dVar2 = this.b;
        dVar2.f = i2;
        this.d.l(dVar2);
        bVar.f2013h = bVar.a;
        bVar.f2014i = jCurrentTimeMillis;
        long j2 = bVar.b;
        g gVar = this.c;
        gVar.notifyUpdateBytes(j2 + gVar.mBytesSoFar);
    }

    private HttpResponse y(d dVar, j.d.a.e.a.a.i.a aVar, HttpGet httpGet) throws e {
        try {
            return aVar.execute(httpGet);
        } catch (IOException e2) {
            q();
            throw new e(this, i(dVar), "while trying to execute request: " + e2.toString(), e2);
        } catch (IllegalArgumentException e3) {
            throw new e(this, g.STATUS_HTTP_DATA_ERROR, "while trying to execute request: " + e3.toString(), e3);
        }
    }

    private void z(d dVar, b bVar) throws e {
        String str = dVar.a;
        if (str != null) {
            if (!j.d.a.e.a.a.e.o(str)) {
                throw new e(this, g.STATUS_FILE_ERROR, "found invalid internal destination filename");
            }
            File file = new File(dVar.a);
            if (file.exists()) {
                long length = file.length();
                if (length == 0) {
                    file.delete();
                    dVar.a = null;
                } else {
                    if (this.b.d == null) {
                        file.delete();
                        throw new e(this, g.STATUS_CANNOT_RESUME, "Trying to resume a download that can't be resumed");
                    }
                    try {
                        dVar.b = new FileOutputStream(dVar.a, true);
                        bVar.a = (int) length;
                        long j2 = this.b.e;
                        if (j2 != -1) {
                            bVar.e = Long.toString(j2);
                        }
                        bVar.c = this.b.d;
                        bVar.d = true;
                    } catch (FileNotFoundException e2) {
                        throw new e(this, g.STATUS_FILE_ERROR, "while opening destination for resuming: " + e2.toString(), e2);
                    }
                }
            }
        }
        if (dVar.b != null) {
            f(dVar);
        }
    }

    public HttpHost j(Context context, String str) {
        String host;
        if (p(str) || this.c.isWiFi() || (host = Proxy.getHost(context)) == null) {
            return null;
        }
        return new HttpHost(host, Proxy.getPort(context), "http");
    }

    /* JADX WARN: Code duplicated, block: B:47:0x010d  */
    /* JADX WARN: Code duplicated, block: B:49:0x0112  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [j.d.a.e.a.a.i.a] */
    /* JADX WARN: Type inference failed for: r4v5 */
    public void x() throws Throwable {
        PowerManager.WakeLock wakeLockNewWakeLock;
        boolean z;
        int i2;
        int i3;
        boolean z2;
        String str;
        int i4;
        Process.setThreadPriority(10);
        d dVar = new d(this.b, this.c);
        PowerManager.WakeLock wakeLock = 0;
        j.d.a.e.a.a.i.a aVar = null;
        try {
            wakeLockNewWakeLock = ((PowerManager) this.a.getSystemService("power")).newWakeLock(1, "LVLDL");
            try {
                wakeLockNewWakeLock.acquire();
                j.d.a.e.a.a.i.a aVarE = j.d.a.e.a.a.i.a.e(E(), this.a);
                boolean z3 = false;
                while (!z3) {
                    ConnRouteParams.setDefaultProxy(aVarE.getParams(), j(this.a, dVar.f2016h));
                    HttpGet httpGet = new HttpGet(dVar.f2016h);
                    try {
                        g(dVar, aVarE, httpGet);
                        httpGet.abort();
                        z3 = true;
                    } catch (c unused) {
                        httpGet.abort();
                    } catch (Throwable th) {
                        httpGet.abort();
                        throw th;
                    }
                }
                h(dVar);
                if (wakeLockNewWakeLock != null) {
                    wakeLockNewWakeLock.release();
                }
                if (aVarE != null) {
                    aVarE.d();
                }
                e(dVar, g.STATUS_SUCCESS);
                z = dVar.c;
                i2 = dVar.d;
                i3 = dVar.e;
                z2 = dVar.f2015g;
                str = dVar.a;
                i4 = g.STATUS_SUCCESS;
            } catch (e e2) {
                e = e2;
                try {
                    Log.w("LVLDL", "Aborting request for download " + this.b.c + ": " + e.getMessage());
                    e.printStackTrace();
                    int i5 = e.a;
                    if (wakeLockNewWakeLock != null) {
                        wakeLockNewWakeLock.release();
                    }
                    if (0 != 0) {
                        wakeLock.d();
                    }
                    e(dVar, i5);
                    r(i5, dVar.c, dVar.d, dVar.e, dVar.f2015g, dVar.a);
                    return;
                } catch (Throwable th2) {
                    th = th2;
                    PowerManager.WakeLock wakeLock2 = wakeLockNewWakeLock;
                    aVar = null;
                    wakeLock = wakeLock2;
                    if (wakeLock != 0) {
                        wakeLock.release();
                    }
                    if (aVar != null) {
                        aVar.d();
                    }
                    e(dVar, g.STATUS_UNKNOWN_ERROR);
                    r(g.STATUS_UNKNOWN_ERROR, dVar.c, dVar.d, dVar.e, dVar.f2015g, dVar.a);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                wakeLock = wakeLockNewWakeLock;
                try {
                    Log.w("LVLDL", "Exception for " + this.b.c + ": " + th);
                    if (wakeLock != 0) {
                        wakeLock.release();
                    }
                    if (wakeLock != 0) {
                        wakeLock.d();
                    }
                    e(dVar, g.STATUS_UNKNOWN_ERROR);
                    z = dVar.c;
                    i2 = dVar.d;
                    i3 = dVar.e;
                    z2 = dVar.f2015g;
                    str = dVar.a;
                    i4 = g.STATUS_UNKNOWN_ERROR;
                } catch (Throwable th4) {
                    th = th4;
                    if (wakeLock != 0) {
                        wakeLock.release();
                    }
                    if (aVar != null) {
                        aVar.d();
                    }
                    e(dVar, g.STATUS_UNKNOWN_ERROR);
                    r(g.STATUS_UNKNOWN_ERROR, dVar.c, dVar.d, dVar.e, dVar.f2015g, dVar.a);
                    throw th;
                }
            }
        } catch (e e3) {
            e = e3;
            wakeLockNewWakeLock = null;
        } catch (Throwable th5) {
            th = th5;
        }
        r(i4, z, i2, i3, z2, str);
    }
}
