package com.google.android.play.core.assetpacks;

import java.io.File;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
final class n1 {
    private static final j.d.a.d.a.b.f b = new j.d.a.d.a.b.f("MergeSliceTaskHandler");
    private final v a;

    n1(v vVar) {
        this.a = vVar;
    }

    private static void b(File file, File file2) {
        if (!file.isDirectory()) {
            if (file2.exists()) {
                String strValueOf = String.valueOf(file2);
                StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 51);
                sb.append("File clashing with existing file from other slice: ");
                sb.append(strValueOf);
                throw new k0(sb.toString());
            }
            if (file.renameTo(file2)) {
                return;
            }
            String strValueOf2 = String.valueOf(file);
            StringBuilder sb2 = new StringBuilder(String.valueOf(strValueOf2).length() + 21);
            sb2.append("Unable to move file: ");
            sb2.append(strValueOf2);
            throw new k0(sb2.toString());
        }
        file2.mkdirs();
        for (File file3 : file.listFiles()) {
            b(file3, new File(file2, file3.getName()));
        }
        if (file.delete()) {
            return;
        }
        String strValueOf3 = String.valueOf(file);
        StringBuilder sb3 = new StringBuilder(String.valueOf(strValueOf3).length() + 28);
        sb3.append("Unable to delete directory: ");
        sb3.append(strValueOf3);
        throw new k0(sb3.toString());
    }

    public final void a(m1 m1Var) {
        File fileW = this.a.w(m1Var.b, m1Var.c, m1Var.d, m1Var.e);
        if (!fileW.exists()) {
            throw new k0(String.format("Cannot find verified files for slice %s.", m1Var.e), m1Var.a);
        }
        File fileX = this.a.x(m1Var.b, m1Var.c, m1Var.d);
        if (!fileX.exists()) {
            fileX.mkdirs();
        }
        b(fileW, fileX);
        try {
            this.a.z(m1Var.b, m1Var.c, m1Var.d, this.a.y(m1Var.b, m1Var.c, m1Var.d) + 1);
        } catch (IOException e) {
            b.b("Writing merge checkpoint failed with %s.", e.getMessage());
            throw new k0("Writing merge checkpoint failed.", e, m1Var.a);
        }
    }
}
