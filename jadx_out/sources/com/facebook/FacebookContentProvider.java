package com.facebook;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import android.util.Pair;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public final class FacebookContentProvider extends ContentProvider {
    private static final String a;
    public static final a b = new a(null);

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(l.y.c.f fVar) {
            this();
        }

        public final String a(String str, UUID uuid, String str2) {
            l.y.c.i.e(uuid, "callId");
            l.y.c.o oVar = l.y.c.o.a;
            String str3 = String.format("%s%s/%s/%s", Arrays.copyOf(new Object[]{"content://com.facebook.app.FacebookContentProvider", str, uuid.toString(), str2}, 4));
            l.y.c.i.d(str3, "java.lang.String.format(format, *args)");
            return str3;
        }
    }

    static {
        String name = FacebookContentProvider.class.getName();
        l.y.c.i.d(name, "FacebookContentProvider::class.java.name");
        a = name;
    }

    private final Pair<UUID, String> a(Uri uri) {
        try {
            String path = uri.getPath();
            if (path == null) {
                throw new IllegalStateException("Required value was null.".toString());
            }
            String strSubstring = path.substring(1);
            l.y.c.i.d(strSubstring, "(this as java.lang.String).substring(startIndex)");
            Object[] array = l.d0.q.i0(strSubstring, new String[]{"/"}, false, 0, 6, null).toArray(new String[0]);
            if (array == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
            }
            String[] strArr = (String[]) array;
            String str = strArr[0];
            String str2 = strArr[1];
            if ("..".contentEquals(str) || "..".contentEquals(str2)) {
                throw new Exception();
            }
            return new Pair<>(UUID.fromString(str), str2);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // android.content.ContentProvider
    public int delete(Uri uri, String str, String[] strArr) {
        l.y.c.i.e(uri, "uri");
        return 0;
    }

    @Override // android.content.ContentProvider
    public String getType(Uri uri) {
        l.y.c.i.e(uri, "uri");
        return null;
    }

    @Override // android.content.ContentProvider
    public Uri insert(Uri uri, ContentValues contentValues) {
        l.y.c.i.e(uri, "uri");
        return null;
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        return true;
    }

    @Override // android.content.ContentProvider
    public ParcelFileDescriptor openFile(Uri uri, String str) throws FileNotFoundException {
        l.y.c.i.e(uri, "uri");
        l.y.c.i.e(str, "mode");
        Pair<UUID, String> pairA = a(uri);
        if (pairA == null) {
            throw new FileNotFoundException();
        }
        try {
            File fileJ = com.facebook.internal.b0.j((UUID) pairA.first, (String) pairA.second);
            if (fileJ != null) {
                return ParcelFileDescriptor.open(fileJ, 268435456);
            }
            throw new FileNotFoundException();
        } catch (FileNotFoundException e) {
            Log.e(a, "Got unexpected exception:" + e);
            throw e;
        }
    }

    @Override // android.content.ContentProvider
    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        l.y.c.i.e(uri, "uri");
        return null;
    }

    @Override // android.content.ContentProvider
    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        l.y.c.i.e(uri, "uri");
        return 0;
    }
}
