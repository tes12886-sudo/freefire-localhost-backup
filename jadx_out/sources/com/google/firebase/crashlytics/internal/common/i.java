package com.google.firebase.crashlytics.internal.common;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.GZIPOutputStream;

/* JADX INFO: loaded from: classes.dex */
class i implements v {
    private final byte[] a;
    private final String b;
    private final String c;

    i(String str, String str2, byte[] bArr) {
        this.b = str;
        this.c = str2;
        this.a = bArr;
    }

    private byte[] d() {
        if (e()) {
            return null;
        }
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
                try {
                    gZIPOutputStream.write(this.a);
                    gZIPOutputStream.finish();
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    gZIPOutputStream.close();
                    byteArrayOutputStream.close();
                    return byteArray;
                } catch (Throwable th) {
                    try {
                        gZIPOutputStream.close();
                    } catch (Throwable unused) {
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable unused2) {
                }
                throw th2;
            }
        } catch (IOException unused3) {
            return null;
        }
    }

    private boolean e() {
        byte[] bArr = this.a;
        return bArr == null || bArr.length == 0;
    }

    @Override // com.google.firebase.crashlytics.internal.common.v
    public InputStream a() {
        if (e()) {
            return null;
        }
        return new ByteArrayInputStream(this.a);
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
