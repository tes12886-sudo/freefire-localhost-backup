package com.google.firebase.crashlytics.internal.common;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.GZIPOutputStream;

/* JADX INFO: loaded from: classes.dex */
class r implements v {
    private final File a;
    private final String b;
    private final String c;

    r(String str, String str2, File file) {
        this.b = str;
        this.c = str2;
        this.a = file;
    }

    private byte[] d() {
        byte[] bArr = new byte[8192];
        try {
            InputStream inputStreamA = a();
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
                    if (inputStreamA == null) {
                        gZIPOutputStream.close();
                        byteArrayOutputStream.close();
                        if (inputStreamA != null) {
                            inputStreamA.close();
                        }
                        return null;
                    }
                    while (true) {
                        try {
                            int i2 = inputStreamA.read(bArr);
                            if (i2 <= 0) {
                                break;
                            }
                            gZIPOutputStream.write(bArr, 0, i2);
                        } catch (Throwable th) {
                            try {
                                gZIPOutputStream.close();
                            } catch (Throwable unused) {
                            }
                            throw th;
                        }
                    }
                    gZIPOutputStream.finish();
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    gZIPOutputStream.close();
                    byteArrayOutputStream.close();
                    if (inputStreamA != null) {
                        inputStreamA.close();
                    }
                    return byteArray;
                } catch (Throwable th2) {
                    try {
                        byteArrayOutputStream.close();
                    } catch (Throwable unused2) {
                    }
                    throw th2;
                }
            } catch (Throwable th3) {
                if (inputStreamA != null) {
                    try {
                        inputStreamA.close();
                    } catch (Throwable unused3) {
                    }
                }
                throw th3;
            }
        } catch (IOException unused4) {
            return null;
        }
    }

    @Override // com.google.firebase.crashlytics.internal.common.v
    public InputStream a() {
        if (this.a.exists() && this.a.isFile()) {
            try {
                return new FileInputStream(this.a);
            } catch (FileNotFoundException unused) {
            }
        }
        return null;
    }

    @Override // com.google.firebase.crashlytics.internal.common.v
    public String b() {
        return this.c;
    }

    @Override // com.google.firebase.crashlytics.internal.common.v
    public com.google.firebase.crashlytics.internal.e.v.c.b c() {
        byte[] bArrD = d();
        if (bArrD == null) {
            return null;
        }
        com.google.firebase.crashlytics.internal.e.v.c.b.a aVarA = com.google.firebase.crashlytics.internal.e.v.c.b.a();
        aVarA.b(bArrD);
        aVarA.c(this.b);
        return aVarA.a();
    }
}
