package h.k.a;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.DocumentsContract;
import android.util.Log;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
class c extends a {
    private Context a;
    private Uri b;

    c(a aVar, Context context, Uri uri) {
        super(aVar);
        this.a = context;
        this.b = uri;
    }

    private static void g(AutoCloseable autoCloseable) {
        if (autoCloseable != null) {
            try {
                autoCloseable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
    }

    private static Uri h(Context context, Uri uri, String str, String str2) {
        try {
            return DocumentsContract.createDocument(context.getContentResolver(), uri, str, str2);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // h.k.a.a
    public a a(String str, String str2) {
        Uri uriH = h(this.a, this.b, str, str2);
        if (uriH != null) {
            return new c(this, this.a, uriH);
        }
        return null;
    }

    @Override // h.k.a.a
    public String c() {
        return b.b(this.a, this.b);
    }

    @Override // h.k.a.a
    public Uri d() {
        return this.b;
    }

    @Override // h.k.a.a
    public boolean e() {
        return b.d(this.a, this.b);
    }

    @Override // h.k.a.a
    public a[] f() {
        ContentResolver contentResolver = this.a.getContentResolver();
        Uri uri = this.b;
        Uri uriBuildChildDocumentsUriUsingTree = DocumentsContract.buildChildDocumentsUriUsingTree(uri, DocumentsContract.getDocumentId(uri));
        ArrayList arrayList = new ArrayList();
        Cursor cursorQuery = null;
        try {
            try {
                cursorQuery = contentResolver.query(uriBuildChildDocumentsUriUsingTree, new String[]{"document_id"}, null, null, null);
                while (cursorQuery.moveToNext()) {
                    arrayList.add(DocumentsContract.buildDocumentUriUsingTree(this.b, cursorQuery.getString(0)));
                }
            } catch (Exception e) {
                Log.w("DocumentFile", "Failed query: " + e);
            }
            g(cursorQuery);
            Uri[] uriArr = (Uri[]) arrayList.toArray(new Uri[arrayList.size()]);
            a[] aVarArr = new a[uriArr.length];
            for (int i2 = 0; i2 < uriArr.length; i2++) {
                aVarArr[i2] = new c(this, this.a, uriArr[i2]);
            }
            return aVarArr;
        } catch (Throwable th) {
            g(cursorQuery);
            throw th;
        }
    }
}
