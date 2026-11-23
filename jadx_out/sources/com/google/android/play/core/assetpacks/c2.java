package com.google.android.play.core.assetpacks;

import java.io.File;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: loaded from: classes.dex */
final class c2 {
    private static final j.d.a.d.a.b.f b = new j.d.a.d.a.b.f("VerifySliceTaskHandler");
    private final v a;

    c2(v vVar) {
        this.a = vVar;
    }

    private final void b(b2 b2Var, File file) {
        try {
            File fileC = this.a.C(b2Var.b, b2Var.c, b2Var.d, b2Var.e);
            if (!fileC.exists()) {
                throw new k0(String.format("Cannot find metadata files for slice %s.", b2Var.e), b2Var.a);
            }
            try {
                if (!j1.a(a2.a(file, fileC)).equals(b2Var.f)) {
                    throw new k0(String.format("Verification failed for slice %s.", b2Var.e), b2Var.a);
                }
                b.d("Verification of slice %s of pack %s successful.", b2Var.e, b2Var.b);
            } catch (IOException e) {
                throw new k0(String.format("Could not digest file during verification for slice %s.", b2Var.e), e, b2Var.a);
            } catch (NoSuchAlgorithmException e2) {
                throw new k0("SHA256 algorithm not supported.", e2, b2Var.a);
            }
        } catch (IOException e3) {
            throw new k0(String.format("Could not reconstruct slice archive during verification for slice %s.", b2Var.e), e3, b2Var.a);
        }
    }

    public final void a(b2 b2Var) {
        File fileV = this.a.v(b2Var.b, b2Var.c, b2Var.d, b2Var.e);
        if (!fileV.exists()) {
            throw new k0(String.format("Cannot find unverified files for slice %s.", b2Var.e), b2Var.a);
        }
        b(b2Var, fileV);
        File fileW = this.a.w(b2Var.b, b2Var.c, b2Var.d, b2Var.e);
        if (!fileW.exists()) {
            fileW.mkdirs();
        }
        if (!fileV.renameTo(fileW)) {
            throw new k0(String.format("Failed to move slice %s after verification.", b2Var.e), b2Var.a);
        }
    }
}
