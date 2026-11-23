package com.google.android.play.core.assetpacks;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.GZIPInputStream;

/* JADX INFO: loaded from: classes.dex */
final class w1 {
    private static final j.d.a.d.a.b.f c = new j.d.a.d.a.b.f("PatchSliceTaskHandler");
    private final v a;
    private final j.d.a.d.a.b.e0<s2> b;

    w1(v vVar, j.d.a.d.a.b.e0<s2> e0Var) {
        this.a = vVar;
        this.b = e0Var;
    }

    public final void a(v1 v1Var) {
        File fileT = this.a.t(v1Var.b, v1Var.c, v1Var.d);
        File file = new File(this.a.u(v1Var.b, v1Var.c, v1Var.d), v1Var.f1349h);
        try {
            InputStream gZIPInputStream = v1Var.f1351j;
            if (v1Var.f1348g == 2) {
                gZIPInputStream = new GZIPInputStream(gZIPInputStream, 8192);
            }
            try {
                x xVar = new x(fileT, file);
                File fileV = this.a.v(v1Var.b, v1Var.e, v1Var.f, v1Var.f1349h);
                if (!fileV.exists()) {
                    fileV.mkdirs();
                }
                y1 y1Var = new y1(this.a, v1Var.b, v1Var.e, v1Var.f, v1Var.f1349h);
                j.d.a.d.a.b.s.e(xVar, gZIPInputStream, new n0(fileV, y1Var), v1Var.f1350i);
                y1Var.d(0);
                gZIPInputStream.close();
                c.d("Patching and extraction finished for slice %s of pack %s.", v1Var.f1349h, v1Var.b);
                this.b.a().g(v1Var.a, v1Var.b, v1Var.f1349h, 0);
                try {
                    v1Var.f1351j.close();
                } catch (IOException unused) {
                    c.e("Could not close file for slice %s of pack %s.", v1Var.f1349h, v1Var.b);
                }
            } catch (Throwable th) {
                try {
                    gZIPInputStream.close();
                } catch (Throwable th2) {
                    j.d.a.d.a.b.d0.a(th, th2);
                }
                throw th;
            }
        } catch (IOException e) {
            c.b("IOException during patching %s.", e.getMessage());
            throw new k0(String.format("Error patching slice %s of pack %s.", v1Var.f1349h, v1Var.b), e, v1Var.a);
        }
    }
}
