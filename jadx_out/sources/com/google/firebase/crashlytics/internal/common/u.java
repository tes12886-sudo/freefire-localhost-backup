package com.google.firebase.crashlytics.internal.common;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
class u {
    private static final Charset b = Charset.forName("UTF-8");
    private final File a;

    class a extends JSONObject {
        final /* synthetic */ z a;

        a(z zVar) throws JSONException {
            this.a = zVar;
            put("userId", zVar.d());
        }
    }

    public u(File file) {
        this.a = file;
    }

    private static String c(Map<String, String> map) {
        return new JSONObject(map).toString();
    }

    private static String d(z zVar) {
        return new a(zVar).toString();
    }

    public File a(String str) {
        return new File(this.a, str + "keys.meta");
    }

    public File b(String str) {
        return new File(this.a, str + "user.meta");
    }

    public void e(String str, Map<String, String> map) throws Throwable {
        File fileA = a(str);
        BufferedWriter bufferedWriter = null;
        try {
            try {
                String strC = c(map);
                BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileA), b));
                try {
                    bufferedWriter2.write(strC);
                    bufferedWriter2.flush();
                    k.e(bufferedWriter2, "Failed to close key/value metadata file.");
                } catch (Exception e) {
                    e = e;
                    bufferedWriter = bufferedWriter2;
                    com.google.firebase.crashlytics.internal.a.f().e("Error serializing key/value metadata.", e);
                    k.e(bufferedWriter, "Failed to close key/value metadata file.");
                } catch (Throwable th) {
                    th = th;
                    bufferedWriter = bufferedWriter2;
                    k.e(bufferedWriter, "Failed to close key/value metadata file.");
                    throw th;
                }
            } catch (Exception e2) {
                e = e2;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public void f(String str, z zVar) throws Throwable {
        File fileB = b(str);
        BufferedWriter bufferedWriter = null;
        try {
            try {
                String strD = d(zVar);
                BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileB), b));
                try {
                    bufferedWriter2.write(strD);
                    bufferedWriter2.flush();
                    k.e(bufferedWriter2, "Failed to close user metadata file.");
                } catch (Exception e) {
                    e = e;
                    bufferedWriter = bufferedWriter2;
                    com.google.firebase.crashlytics.internal.a.f().e("Error serializing user metadata.", e);
                    k.e(bufferedWriter, "Failed to close user metadata file.");
                } catch (Throwable th) {
                    th = th;
                    bufferedWriter = bufferedWriter2;
                    k.e(bufferedWriter, "Failed to close user metadata file.");
                    throw th;
                }
            } catch (Exception e2) {
                e = e2;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
