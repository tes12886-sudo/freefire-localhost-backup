package h.h.i;

import android.content.Context;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.Handler;

/* JADX INFO: loaded from: classes.dex */
public class f {

    public static class a {
        private final int a;
        private final b[] b;

        @Deprecated
        public a(int i2, b[] bVarArr) {
            this.a = i2;
            this.b = bVarArr;
        }

        static a a(int i2, b[] bVarArr) {
            return new a(i2, bVarArr);
        }

        public b[] b() {
            return this.b;
        }

        public int c() {
            return this.a;
        }
    }

    public static class b {
        private final Uri a;
        private final int b;
        private final int c;
        private final boolean d;
        private final int e;

        @Deprecated
        public b(Uri uri, int i2, int i3, boolean z, int i4) {
            h.h.k.e.f(uri);
            this.a = uri;
            this.b = i2;
            this.c = i3;
            this.d = z;
            this.e = i4;
        }

        static b a(Uri uri, int i2, int i3, boolean z, int i4) {
            return new b(uri, i2, i3, z, i4);
        }

        public int b() {
            return this.e;
        }

        public int c() {
            return this.b;
        }

        public Uri d() {
            return this.a;
        }

        public int e() {
            return this.c;
        }

        public boolean f() {
            return this.d;
        }
    }

    public static class c {
        public void a(int i2) {
            throw null;
        }

        public void b(Typeface typeface) {
            throw null;
        }
    }

    public static Typeface a(Context context, CancellationSignal cancellationSignal, b[] bVarArr) {
        return h.h.e.e.b(context, cancellationSignal, bVarArr, 0);
    }

    public static a b(Context context, CancellationSignal cancellationSignal, d dVar) {
        return h.h.i.c.d(context, dVar, cancellationSignal);
    }

    public static Typeface c(Context context, d dVar, int i2, boolean z, int i3, Handler handler, c cVar) {
        h.h.i.a aVar = new h.h.i.a(cVar, handler);
        return z ? e.e(context, dVar, aVar, i2, i3) : e.d(context, dVar, i2, null, aVar);
    }
}
