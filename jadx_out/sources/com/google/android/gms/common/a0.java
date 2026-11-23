package com.google.android.gms.common;

import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.a2;
import com.google.android.gms.common.internal.z1;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
abstract class a0 extends z1 {
    private final int a;

    protected a0(byte[] bArr) {
        com.google.android.gms.common.internal.q.a(bArr.length == 25);
        this.a = Arrays.hashCode(bArr);
    }

    protected static byte[] o(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e) {
            throw new AssertionError(e);
        }
    }

    @Override // com.google.android.gms.common.internal.a2
    public final int b() {
        return this.a;
    }

    @Override // com.google.android.gms.common.internal.a2
    public final j.d.a.c.e.a c() {
        return j.d.a.c.e.b.c1(c1());
    }

    abstract byte[] c1();

    public final boolean equals(Object obj) {
        j.d.a.c.e.a aVarC;
        if (obj != null && (obj instanceof a2)) {
            try {
                a2 a2Var = (a2) obj;
                if (a2Var.b() == this.a && (aVarC = a2Var.c()) != null) {
                    return Arrays.equals(c1(), (byte[]) j.d.a.c.e.b.o(aVarC));
                }
                return false;
            } catch (RemoteException e) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e);
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a;
    }
}
