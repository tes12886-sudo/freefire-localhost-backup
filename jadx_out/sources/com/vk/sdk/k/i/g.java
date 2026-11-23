package com.vk.sdk.k.i;

import android.util.Pair;
import android.webkit.MimeTypeMap;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Locale;
import java.util.Random;

/* JADX INFO: loaded from: classes.dex */
public class g {
    private final String a = String.format(Locale.US, "Boundary(======VK_SDK_%d======)", Integer.valueOf(new Random().nextInt()));
    private final File[] b;
    private String c;

    public g(File[] fileArr) {
        this.b = fileArr;
    }

    private String a() {
        return String.format("\r\n--%s--\r\n", this.a);
    }

    protected static String e(String str) {
        String fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(str);
        if (fileExtensionFromUrl != null) {
            return MimeTypeMap.getSingleton().getMimeTypeFromExtension(fileExtensionFromUrl);
        }
        return null;
    }

    public long b() {
        long length = 0;
        int i2 = 0;
        while (true) {
            File[] fileArr = this.b;
            if (i2 >= fileArr.length) {
                return length + ((long) a().length());
            }
            File file = fileArr[i2];
            length = length + file.length() + ((long) d(file, i2).length());
            i2++;
        }
    }

    public Pair<String, String> c() {
        return new Pair<>("Content-Type", String.format("multipart/form-data; boundary=%s", this.a));
    }

    protected String d(File file, int i2) {
        String str = this.c;
        String str2 = (str == null || !str.equals("doc")) ? String.format(Locale.US, "file%d", Integer.valueOf(i2 + 1)) : "file";
        return String.format("\r\n--%s\r\n", this.a) + String.format("Content-Disposition: form-data; name=\"%s\"; filename=\"%s.%s\"\r\n", str2, str2, MimeTypeMap.getFileExtensionFromUrl(file.getAbsolutePath())) + String.format("Content-Type: %s\r\n\r\n", e(file.getAbsolutePath()));
    }

    public void f(OutputStream outputStream) throws IOException {
        int i2 = 0;
        while (true) {
            File[] fileArr = this.b;
            if (i2 >= fileArr.length) {
                outputStream.write(a().getBytes("UTF-8"));
                return;
            }
            File file = fileArr[i2];
            outputStream.write(d(file, i2).getBytes("UTF-8"));
            FileInputStream fileInputStream = new FileInputStream(file);
            byte[] bArr = new byte[2048];
            while (true) {
                int i3 = fileInputStream.read(bArr);
                if (i3 != -1) {
                    outputStream.write(bArr, 0, i3);
                }
            }
            fileInputStream.close();
            i2++;
        }
    }
}
