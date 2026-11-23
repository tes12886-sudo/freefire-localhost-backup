package com.appsflyer.internal;

import android.content.Context;
import com.appsflyer.AFLogger;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class af {
    private static af valueOf = new af();

    private af() {
    }

    static void AFKeystoreWrapper(String str, Context context) {
        File file = new File(new File(context.getFilesDir(), "AFRequestCache"), str);
        StringBuilder sb = new StringBuilder("Deleting ");
        sb.append(str);
        sb.append(" from cache");
        AFLogger.valueOf(sb.toString());
        if (file.exists()) {
            try {
                file.delete();
            } catch (Exception e) {
                StringBuilder sb2 = new StringBuilder("Could not delete ");
                sb2.append(str);
                sb2.append(" from cache");
                AFLogger.valueOf(sb2.toString(), e);
            }
        }
    }

    static f valueOf(File file) throws Throwable {
        FileReader fileReader;
        FileReader fileReader2 = null;
        try {
            fileReader = new FileReader(file);
            try {
                char[] cArr = new char[(int) file.length()];
                fileReader.read(cArr);
                f fVar = new f(cArr);
                fVar.AFKeystoreWrapper = file.getName();
                try {
                    fileReader.close();
                } catch (IOException e) {
                    AFLogger.valueOf(e);
                }
                return fVar;
            } catch (Exception unused) {
                if (fileReader != null) {
                    try {
                        fileReader.close();
                    } catch (IOException e2) {
                        AFLogger.valueOf(e2);
                    }
                }
                return null;
            } catch (Throwable th) {
                th = th;
                fileReader2 = fileReader;
                if (fileReader2 != null) {
                    try {
                        fileReader2.close();
                    } catch (IOException e3) {
                        AFLogger.valueOf(e3);
                    }
                }
                throw th;
            }
        } catch (Exception unused2) {
            fileReader = null;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    static List<f> valueOf(Context context) {
        ArrayList arrayList = new ArrayList();
        try {
            File file = new File(context.getFilesDir(), "AFRequestCache");
            if (file.exists()) {
                for (File file2 : file.listFiles()) {
                    StringBuilder sb = new StringBuilder("Found cached request");
                    sb.append(file2.getName());
                    AFLogger.valueOf(sb.toString());
                    arrayList.add(valueOf(file2));
                }
            } else {
                file.mkdir();
            }
        } catch (Exception e) {
            AFLogger.valueOf("Could not cache request", e);
        }
        return arrayList;
    }

    static af values() {
        return valueOf;
    }

    static File values(Context context) {
        return new File(context.getFilesDir(), "AFRequestCache");
    }
}
