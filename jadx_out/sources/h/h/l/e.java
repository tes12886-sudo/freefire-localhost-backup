package h.h.l;

import android.content.ClipData;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.ContentInfo;

/* JADX INFO: loaded from: classes.dex */
public final class e {
    private final f a;

    public static final class a {
        private final c a;

        public a(ClipData clipData, int i2) {
            this.a = Build.VERSION.SDK_INT >= 31 ? new b(clipData, i2) : new d(clipData, i2);
        }

        public e a() {
            return this.a.a();
        }

        public a b(Bundle bundle) {
            this.a.b(bundle);
            return this;
        }

        public a c(int i2) {
            this.a.d(i2);
            return this;
        }

        public a d(Uri uri) {
            this.a.c(uri);
            return this;
        }
    }

    private static final class b implements c {
        private final ContentInfo.Builder a;

        b(ClipData clipData, int i2) {
            this.a = new ContentInfo.Builder(clipData, i2);
        }

        @Override // h.h.l.e.c
        public e a() {
            return new e(new C0198e(this.a.build()));
        }

        @Override // h.h.l.e.c
        public void b(Bundle bundle) {
            this.a.setExtras(bundle);
        }

        @Override // h.h.l.e.c
        public void c(Uri uri) {
            this.a.setLinkUri(uri);
        }

        @Override // h.h.l.e.c
        public void d(int i2) {
            this.a.setFlags(i2);
        }
    }

    private interface c {
        e a();

        void b(Bundle bundle);

        void c(Uri uri);

        void d(int i2);
    }

    private static final class d implements c {
        ClipData a;
        int b;
        int c;
        Uri d;
        Bundle e;

        d(ClipData clipData, int i2) {
            this.a = clipData;
            this.b = i2;
        }

        @Override // h.h.l.e.c
        public e a() {
            return new e(new g(this));
        }

        @Override // h.h.l.e.c
        public void b(Bundle bundle) {
            this.e = bundle;
        }

        @Override // h.h.l.e.c
        public void c(Uri uri) {
            this.d = uri;
        }

        @Override // h.h.l.e.c
        public void d(int i2) {
            this.c = i2;
        }
    }

    /* JADX INFO: renamed from: h.h.l.e$e, reason: collision with other inner class name */
    private static final class C0198e implements f {
        private final ContentInfo a;

        C0198e(ContentInfo contentInfo) {
            h.h.k.e.f(contentInfo);
            this.a = contentInfo;
        }

        @Override // h.h.l.e.f
        public ClipData a() {
            return this.a.getClip();
        }

        @Override // h.h.l.e.f
        public int b() {
            return this.a.getFlags();
        }

        @Override // h.h.l.e.f
        public ContentInfo c() {
            return this.a;
        }

        @Override // h.h.l.e.f
        public int d() {
            return this.a.getSource();
        }

        public String toString() {
            return "ContentInfoCompat{" + this.a + "}";
        }
    }

    private interface f {
        ClipData a();

        int b();

        ContentInfo c();

        int d();
    }

    private static final class g implements f {
        private final ClipData a;
        private final int b;
        private final int c;
        private final Uri d;
        private final Bundle e;

        g(d dVar) {
            ClipData clipData = dVar.a;
            h.h.k.e.f(clipData);
            this.a = clipData;
            int i2 = dVar.b;
            h.h.k.e.b(i2, 0, 5, "source");
            this.b = i2;
            int i3 = dVar.c;
            h.h.k.e.e(i3, 1);
            this.c = i3;
            this.d = dVar.d;
            this.e = dVar.e;
        }

        @Override // h.h.l.e.f
        public ClipData a() {
            return this.a;
        }

        @Override // h.h.l.e.f
        public int b() {
            return this.c;
        }

        @Override // h.h.l.e.f
        public ContentInfo c() {
            return null;
        }

        @Override // h.h.l.e.f
        public int d() {
            return this.b;
        }

        public String toString() {
            String str;
            StringBuilder sb = new StringBuilder();
            sb.append("ContentInfoCompat{clip=");
            sb.append(this.a.getDescription());
            sb.append(", source=");
            sb.append(e.e(this.b));
            sb.append(", flags=");
            sb.append(e.a(this.c));
            if (this.d == null) {
                str = "";
            } else {
                str = ", hasLinkUri(" + this.d.toString().length() + ")";
            }
            sb.append(str);
            sb.append(this.e != null ? ", hasExtras" : "");
            sb.append("}");
            return sb.toString();
        }
    }

    e(f fVar) {
        this.a = fVar;
    }

    static String a(int i2) {
        return (i2 & 1) != 0 ? "FLAG_CONVERT_TO_PLAIN_TEXT" : String.valueOf(i2);
    }

    static String e(int i2) {
        if (i2 == 0) {
            return "SOURCE_APP";
        }
        if (i2 == 1) {
            return "SOURCE_CLIPBOARD";
        }
        if (i2 == 2) {
            return "SOURCE_INPUT_METHOD";
        }
        if (i2 == 3) {
            return "SOURCE_DRAG_AND_DROP";
        }
        if (i2 != 4) {
            return i2 != 5 ? String.valueOf(i2) : "SOURCE_PROCESS_TEXT";
        }
        return "SOURCE_AUTOFILL";
    }

    public static e g(ContentInfo contentInfo) {
        return new e(new C0198e(contentInfo));
    }

    public ClipData b() {
        return this.a.a();
    }

    public int c() {
        return this.a.b();
    }

    public int d() {
        return this.a.d();
    }

    public ContentInfo f() {
        return this.a.c();
    }

    public String toString() {
        return this.a.toString();
    }
}
