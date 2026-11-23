package h.k.a;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.provider.DocumentsContract;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    a(a aVar) {
    }

    public static a b(Context context, Uri uri) {
        if (Build.VERSION.SDK_INT >= 21) {
            return new c(null, context, DocumentsContract.buildDocumentUriUsingTree(uri, DocumentsContract.getTreeDocumentId(uri)));
        }
        return null;
    }

    public abstract a a(String str, String str2);

    public abstract String c();

    public abstract Uri d();

    public abstract boolean e();

    public abstract a[] f();
}
