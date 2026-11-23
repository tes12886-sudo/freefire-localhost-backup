package com.facebook.internal;

import android.graphics.Bitmap;
import android.net.Uri;
import android.util.Log;
import com.facebook.FacebookContentProvider;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public final class b0 {
    private static final String a;
    private static File b;
    public static final b0 c = new b0();

    public static final class a {
        private final String a;
        private final String b;
        private boolean c;
        private boolean d;
        private final UUID e;
        private final Bitmap f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final Uri f598g;

        /* JADX WARN: Code duplicated, block: B:25:0x0067  */
        /* JADX WARN: Code duplicated, block: B:28:0x0075  */
        /* JADX WARN: Code duplicated, block: B:29:0x007a  */
        public a(UUID uuid, Bitmap bitmap, Uri uri) {
            String string;
            String strA;
            l.y.c.i.e(uuid, "callId");
            this.e = uuid;
            this.f = bitmap;
            this.f598g = uri;
            boolean z = true;
            if (uri != null) {
                String scheme = uri.getScheme();
                if (!l.d0.p.l("content", scheme, true)) {
                    if (!l.d0.p.l("file", uri.getScheme(), true)) {
                        if (!h0.a0(uri)) {
                            throw new com.facebook.n("Unsupported scheme for media Uri : " + scheme);
                        }
                    }
                    string = this.d ? UUID.randomUUID().toString() : null;
                    this.b = string;
                    if (this.d) {
                        strA = FacebookContentProvider.b.a(com.facebook.r.g(), uuid, string);
                    } else {
                        strA = String.valueOf(uri);
                    }
                    this.a = strA;
                }
                this.c = true;
                String authority = uri.getAuthority();
                if (authority == null || l.d0.p.x(authority, "media", false, 2, null)) {
                    z = false;
                }
            } else if (bitmap == null) {
                throw new com.facebook.n("Cannot share media without a bitmap or Uri set");
            }
            this.d = z;
            if (this.d) {
            }
            this.b = string;
            if (this.d) {
                strA = String.valueOf(uri);
            } else {
                strA = FacebookContentProvider.b.a(com.facebook.r.g(), uuid, string);
            }
            this.a = strA;
        }

        public final String a() {
            return this.b;
        }

        public final String b() {
            return this.a;
        }

        public final Bitmap c() {
            return this.f;
        }

        public final UUID d() {
            return this.e;
        }

        public final Uri e() {
            return this.f598g;
        }

        public final boolean f() {
            return this.d;
        }

        public final boolean g() {
            return this.c;
        }
    }

    static {
        String name = b0.class.getName();
        l.y.c.i.d(name, "NativeAppCallAttachmentStore::class.java.name");
        a = name;
    }

    private b0() {
    }

    public static final void a(Collection<a> collection) {
        File fileG;
        if (collection == null || collection.isEmpty()) {
            return;
        }
        if (b == null) {
            b();
        }
        f();
        ArrayList<File> arrayList = new ArrayList();
        try {
            for (a aVar : collection) {
                if (aVar.f() && (fileG = g(aVar.d(), aVar.a(), true)) != null) {
                    arrayList.add(fileG);
                    if (aVar.c() != null) {
                        c.k(aVar.c(), fileG);
                    } else if (aVar.e() != null) {
                        c.l(aVar.e(), aVar.g(), fileG);
                    }
                }
            }
        } catch (IOException e) {
            Log.e(a, "Got unexpected exception:" + e);
            for (File file : arrayList) {
                if (file != null) {
                    try {
                        file.delete();
                    } catch (Exception unused) {
                    }
                }
            }
            throw new com.facebook.n(e);
        }
    }

    public static final void b() {
        h0.p(h());
    }

    public static final void c(UUID uuid) {
        l.y.c.i.e(uuid, "callId");
        File fileI = i(uuid, false);
        if (fileI != null) {
            h0.p(fileI);
        }
    }

    public static final a d(UUID uuid, Bitmap bitmap) {
        l.y.c.i.e(uuid, "callId");
        l.y.c.i.e(bitmap, "attachmentBitmap");
        return new a(uuid, bitmap, null);
    }

    public static final a e(UUID uuid, Uri uri) {
        l.y.c.i.e(uuid, "callId");
        l.y.c.i.e(uri, "attachmentUri");
        return new a(uuid, null, uri);
    }

    public static final File f() {
        File fileH = h();
        if (fileH != null) {
            fileH.mkdirs();
        }
        return fileH;
    }

    public static final File g(UUID uuid, String str, boolean z) {
        l.y.c.i.e(uuid, "callId");
        File fileI = i(uuid, z);
        if (fileI == null) {
            return null;
        }
        try {
            return new File(fileI, URLEncoder.encode(str, "UTF-8"));
        } catch (UnsupportedEncodingException unused) {
            return null;
        }
    }

    public static final synchronized File h() {
        if (b == null) {
            b = new File(com.facebook.r.f().getCacheDir(), "com.facebook.NativeAppCallAttachmentStore.files");
        }
        return b;
    }

    public static final File i(UUID uuid, boolean z) {
        l.y.c.i.e(uuid, "callId");
        if (b == null) {
            return null;
        }
        File file = new File(b, uuid.toString());
        if (z && !file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    public static final File j(UUID uuid, String str) {
        if (h0.Y(str) || uuid == null) {
            throw new FileNotFoundException();
        }
        try {
            return g(uuid, str, false);
        } catch (IOException unused) {
            throw new FileNotFoundException();
        }
    }

    private final void k(Bitmap bitmap, File file) {
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            bitmap.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream);
        } finally {
            h0.i(fileOutputStream);
        }
    }

    private final void l(Uri uri, boolean z, File file) {
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            h0.o(!z ? new FileInputStream(uri.getPath()) : com.facebook.r.f().getContentResolver().openInputStream(uri), fileOutputStream);
            h0.i(fileOutputStream);
        } catch (Throwable th) {
            h0.i(fileOutputStream);
            throw th;
        }
    }
}
