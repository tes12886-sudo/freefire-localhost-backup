package j.c.a.e.i;

import android.content.Context;
import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes.dex */
final class b {
    private static b b;
    private SharedPreferences a;

    private b(Context context) {
        this.a = context.getSharedPreferences("SERVICE_PREF", 0);
    }

    static b a() {
        if (b == null) {
            b = new b(j.c.a.e.a.c());
        }
        return b;
    }

    long b(String str, long j2) {
        return str != null ? this.a.getLong(str, j2) : j2;
    }

    String c(String str, String str2) {
        return str != null ? this.a.getString(str, str2) : str2;
    }

    void d(String str, long j2) {
        if (str != null) {
            SharedPreferences.Editor editorEdit = this.a.edit();
            editorEdit.putLong(str, j2);
            editorEdit.commit();
        }
    }

    void e(String str, String str2) {
        if (str != null) {
            SharedPreferences.Editor editorEdit = this.a.edit();
            editorEdit.putString(str, str2);
            editorEdit.commit();
        }
    }
}
