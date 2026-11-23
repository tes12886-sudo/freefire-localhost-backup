package h.k.a;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
class b {
    private static void a(AutoCloseable autoCloseable) {
        if (autoCloseable != null) {
            try {
                autoCloseable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
    }

    public static String b(Context context, Uri uri) {
        return e(context, uri, "_display_name", null);
    }

    private static String c(Context context, Uri uri) {
        return e(context, uri, "mime_type", null);
    }

    public static boolean d(Context context, Uri uri) {
        String strC = c(context, uri);
        return ("vnd.android.document/directory".equals(strC) || TextUtils.isEmpty(strC)) ? false : true;
    }

    private static String e(Context context, Uri uri, String str, String str2) {
        Cursor cursorQuery = null;
        try {
            cursorQuery = context.getContentResolver().query(uri, new String[]{str}, null, null, null);
            return (!cursorQuery.moveToFirst() || cursorQuery.isNull(0)) ? str2 : cursorQuery.getString(0);
        } catch (Exception e) {
            Log.w("DocumentFile", "Failed query: " + e);
            return str2;
        } finally {
            a(cursorQuery);
        }
        a(cursorQuery);
    }
}
