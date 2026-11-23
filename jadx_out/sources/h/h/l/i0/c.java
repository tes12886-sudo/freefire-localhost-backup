package h.h.l.i0;

import android.content.ClipDescription;
import android.net.Uri;
import android.os.Build;
import android.view.inputmethod.InputContentInfo;

/* JADX INFO: loaded from: classes.dex */
public final class c {
    private final InterfaceC0202c a;

    private static final class a implements InterfaceC0202c {
        final InputContentInfo a;

        a(Uri uri, ClipDescription clipDescription, Uri uri2) {
            this.a = new InputContentInfo(uri, clipDescription, uri2);
        }

        a(Object obj) {
            this.a = (InputContentInfo) obj;
        }

        @Override // h.h.l.i0.c.InterfaceC0202c
        public Object a() {
            return this.a;
        }

        @Override // h.h.l.i0.c.InterfaceC0202c
        public Uri b() {
            return this.a.getContentUri();
        }

        @Override // h.h.l.i0.c.InterfaceC0202c
        public void c() {
            this.a.requestPermission();
        }

        @Override // h.h.l.i0.c.InterfaceC0202c
        public Uri d() {
            return this.a.getLinkUri();
        }

        @Override // h.h.l.i0.c.InterfaceC0202c
        public ClipDescription getDescription() {
            return this.a.getDescription();
        }
    }

    private static final class b implements InterfaceC0202c {
        private final Uri a;
        private final ClipDescription b;
        private final Uri c;

        b(Uri uri, ClipDescription clipDescription, Uri uri2) {
            this.a = uri;
            this.b = clipDescription;
            this.c = uri2;
        }

        @Override // h.h.l.i0.c.InterfaceC0202c
        public Object a() {
            return null;
        }

        @Override // h.h.l.i0.c.InterfaceC0202c
        public Uri b() {
            return this.a;
        }

        @Override // h.h.l.i0.c.InterfaceC0202c
        public void c() {
        }

        @Override // h.h.l.i0.c.InterfaceC0202c
        public Uri d() {
            return this.c;
        }

        @Override // h.h.l.i0.c.InterfaceC0202c
        public ClipDescription getDescription() {
            return this.b;
        }
    }

    /* JADX INFO: renamed from: h.h.l.i0.c$c, reason: collision with other inner class name */
    private interface InterfaceC0202c {
        Object a();

        Uri b();

        void c();

        Uri d();

        ClipDescription getDescription();
    }

    public c(Uri uri, ClipDescription clipDescription, Uri uri2) {
        this.a = Build.VERSION.SDK_INT >= 25 ? new a(uri, clipDescription, uri2) : new b(uri, clipDescription, uri2);
    }

    private c(InterfaceC0202c interfaceC0202c) {
        this.a = interfaceC0202c;
    }

    public static c f(Object obj) {
        if (obj != null && Build.VERSION.SDK_INT >= 25) {
            return new c(new a(obj));
        }
        return null;
    }

    public Uri a() {
        return this.a.b();
    }

    public ClipDescription b() {
        return this.a.getDescription();
    }

    public Uri c() {
        return this.a.d();
    }

    public void d() {
        this.a.c();
    }

    public Object e() {
        return this.a.a();
    }
}
