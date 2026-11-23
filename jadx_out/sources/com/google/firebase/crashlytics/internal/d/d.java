package com.google.firebase.crashlytics.internal.d;

import com.google.firebase.crashlytics.internal.common.k;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
class d implements com.google.firebase.crashlytics.internal.d.a {
    private static final Charset d = Charset.forName("UTF-8");
    private final File a;
    private final int b;
    private c c;

    class a implements c.d {
        final /* synthetic */ byte[] a;
        final /* synthetic */ int[] b;

        a(d dVar, byte[] bArr, int[] iArr) {
            this.a = bArr;
            this.b = iArr;
        }

        @Override // com.google.firebase.crashlytics.internal.d.c.d
        public void a(InputStream inputStream, int i2) throws IOException {
            try {
                inputStream.read(this.a, this.b[0], i2);
                int[] iArr = this.b;
                iArr[0] = iArr[0] + i2;
            } finally {
                inputStream.close();
            }
        }
    }

    private static class b {
        public final byte[] a;
        public final int b;

        b(byte[] bArr, int i2) {
            this.a = bArr;
            this.b = i2;
        }
    }

    d(File file, int i2) {
        this.a = file;
        this.b = i2;
    }

    private void f(long j2, String str) {
        if (this.c == null) {
            return;
        }
        if (str == null) {
            str = "null";
        }
        try {
            int i2 = this.b / 4;
            if (str.length() > i2) {
                str = "..." + str.substring(str.length() - i2);
            }
            this.c.l(String.format(Locale.US, "%d %s%n", Long.valueOf(j2), str.replaceAll("\r", " ").replaceAll("\n", " ")).getBytes(d));
            while (!this.c.Y() && this.c.j0() > this.b) {
                this.c.f0();
            }
        } catch (IOException e) {
            com.google.firebase.crashlytics.internal.a.f().e("There was a problem writing to the Crashlytics log.", e);
        }
    }

    private b g() {
        if (!this.a.exists()) {
            return null;
        }
        h();
        c cVar = this.c;
        if (cVar == null) {
            return null;
        }
        int[] iArr = {0};
        byte[] bArr = new byte[cVar.j0()];
        try {
            this.c.Q(new a(this, bArr, iArr));
        } catch (IOException e) {
            com.google.firebase.crashlytics.internal.a.f().e("A problem occurred while reading the Crashlytics log file.", e);
        }
        return new b(bArr, iArr[0]);
    }

    private void h() {
        if (this.c == null) {
            try {
                this.c = new c(this.a);
            } catch (IOException e) {
                com.google.firebase.crashlytics.internal.a.f().e("Could not open log file: " + this.a, e);
            }
        }
    }

    @Override // com.google.firebase.crashlytics.internal.d.a
    public void a() {
        k.e(this.c, "There was a problem closing the Crashlytics log file.");
        this.c = null;
    }

    @Override // com.google.firebase.crashlytics.internal.d.a
    public String b() {
        byte[] bArrC = c();
        if (bArrC != null) {
            return new String(bArrC, d);
        }
        return null;
    }

    @Override // com.google.firebase.crashlytics.internal.d.a
    public byte[] c() {
        b bVarG = g();
        if (bVarG == null) {
            return null;
        }
        int i2 = bVarG.b;
        byte[] bArr = new byte[i2];
        System.arraycopy(bVarG.a, 0, bArr, 0, i2);
        return bArr;
    }

    @Override // com.google.firebase.crashlytics.internal.d.a
    public void d() {
        a();
        this.a.delete();
    }

    @Override // com.google.firebase.crashlytics.internal.d.a
    public void e(long j2, String str) {
        h();
        f(j2, str);
    }
}
