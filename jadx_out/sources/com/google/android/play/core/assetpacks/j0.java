package com.google.android.play.core.assetpacks;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.io.SequenceInputStream;
import java.util.zip.GZIPInputStream;

/* JADX INFO: loaded from: classes.dex */
final class j0 {
    private static final j.d.a.d.a.b.f f = new j.d.a.d.a.b.f("ExtractChunkTaskHandler");
    private final byte[] a = new byte[8192];
    private final v b;
    private final j.d.a.d.a.b.e0<s2> c;
    private final j.d.a.d.a.b.e0<s> d;
    private final o0 e;

    j0(v vVar, j.d.a.d.a.b.e0<s2> e0Var, j.d.a.d.a.b.e0<s> e0Var2, o0 o0Var) {
        this.b = vVar;
        this.c = e0Var;
        this.d = e0Var2;
        this.e = o0Var;
    }

    private final File b(i0 i0Var) {
        File fileV = this.b.v(i0Var.b, i0Var.c, i0Var.d, i0Var.e);
        if (!fileV.exists()) {
            fileV.mkdirs();
        }
        return fileV;
    }

    /* JADX WARN: Code duplicated, block: B:49:0x0179  */
    public final void a(i0 i0Var) {
        InputStream sequenceInputStream;
        d2 d2VarB;
        File fileJ;
        long length;
        int iMin;
        int iMax;
        long j2;
        v vVar = this.b;
        String str = i0Var.b;
        int i2 = i0Var.c;
        long j3 = i0Var.d;
        String str2 = i0Var.e;
        y1 y1Var = new y1(vVar, str, i2, j3, str2);
        File fileC = vVar.C(str, i2, j3, str2);
        if (!fileC.exists()) {
            fileC.mkdirs();
        }
        try {
            InputStream inputStream = i0Var.f1322k;
            InputStream gZIPInputStream = i0Var.f != 1 ? inputStream : new GZIPInputStream(inputStream, 8192);
            try {
                if (i0Var.f1318g > 0) {
                    x1 x1VarE = y1Var.e();
                    int iE = x1VarE.e();
                    int i3 = i0Var.f1318g;
                    if (iE != i3 - 1) {
                        throw new k0(String.format("Trying to resume with chunk number %s when previously processed chunk was number %s.", Integer.valueOf(i3), Integer.valueOf(x1VarE.e())), i0Var.a);
                    }
                    int iA = x1VarE.a();
                    if (iA == 1) {
                        f.a("Resuming zip entry from last chunk during file %s.", x1VarE.b());
                        File file = new File(x1VarE.b());
                        if (!file.exists()) {
                            throw new k0("Partial file specified in checkpoint does not exist. Corrupt directory.", i0Var.a);
                        }
                        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
                        randomAccessFile.seek(x1VarE.c());
                        long jD = x1VarE.d();
                        while (true) {
                            iMin = (int) Math.min(jD, 8192L);
                            iMax = Math.max(gZIPInputStream.read(this.a, 0, iMin), 0);
                            if (iMax > 0) {
                                randomAccessFile.write(this.a, 0, iMax);
                            }
                            j2 = jD - ((long) iMax);
                            if (j2 <= 0 || iMax <= 0) {
                                break;
                                break;
                            }
                            jD = j2;
                        }
                        long length2 = randomAccessFile.length();
                        randomAccessFile.close();
                        if (iMax != iMin) {
                            f.a("Chunk has ended while resuming the previous chunks file content.", new Object[0]);
                            y1Var.a(file.getCanonicalPath(), length2, j2, i0Var.f1318g);
                        } else {
                            sequenceInputStream = gZIPInputStream;
                        }
                    } else if (iA == 2) {
                        f.a("Resuming zip entry from last chunk during local file header.", new Object[0]);
                        File fileB = this.b.B(i0Var.b, i0Var.c, i0Var.d, i0Var.e);
                        if (!fileB.exists()) {
                            throw new k0("Checkpoint extension file not found.", i0Var.a);
                        }
                        sequenceInputStream = new SequenceInputStream(new FileInputStream(fileB), gZIPInputStream);
                    } else {
                        if (iA != 3) {
                            throw new k0(String.format("Slice checkpoint file corrupt. Unexpected FileExtractionStatus %s.", Integer.valueOf(x1VarE.a())), i0Var.a);
                        }
                        f.a("Resuming central directory from last chunk.", new Object[0]);
                        y1Var.f(gZIPInputStream, x1VarE.c());
                        if (!i0Var.a()) {
                            throw new k0("Chunk has ended twice during central directory. This should not be possible with chunk sizes of 50MB.", i0Var.a);
                        }
                    }
                    sequenceInputStream = null;
                } else {
                    sequenceInputStream = gZIPInputStream;
                }
                if (sequenceInputStream != null) {
                    d0 d0Var = new d0(sequenceInputStream);
                    File fileB2 = b(i0Var);
                    do {
                        d2VarB = d0Var.b();
                        if (!d2VarB.g() && !d0Var.f()) {
                            if (!d2VarB.c() || d2VarB.b()) {
                                y1Var.h(d2VarB.i(), d0Var);
                            } else {
                                y1Var.g(d2VarB.i());
                                File file2 = new File(fileB2, d2VarB.d());
                                file2.getParentFile().mkdirs();
                                FileOutputStream fileOutputStream = new FileOutputStream(file2);
                                int i4 = d0Var.read(this.a);
                                while (i4 > 0) {
                                    fileOutputStream.write(this.a, 0, i4);
                                    i4 = d0Var.read(this.a);
                                }
                                fileOutputStream.close();
                            }
                        }
                        if (d0Var.c()) {
                            break;
                        }
                    } while (!d0Var.f());
                    if (d0Var.f()) {
                        f.a("Writing central directory metadata.", new Object[0]);
                        y1Var.h(d2VarB.i(), sequenceInputStream);
                    }
                    if (!i0Var.a()) {
                        if (d2VarB.g()) {
                            f.a("Writing slice checkpoint for partial local file header.", new Object[0]);
                            y1Var.b(d2VarB.i(), i0Var.f1318g);
                        } else if (d0Var.f()) {
                            f.a("Writing slice checkpoint for central directory.", new Object[0]);
                            y1Var.c(i0Var.f1318g);
                        } else {
                            if (d2VarB.f() == 0) {
                                f.a("Writing slice checkpoint for partial file.", new Object[0]);
                                fileJ = new File(b(i0Var), d2VarB.d());
                                length = d2VarB.e() - d0Var.j();
                                if (fileJ.length() != length) {
                                    throw new k0("Partial file is of unexpected size.");
                                }
                            } else {
                                f.a("Writing slice checkpoint for partial unextractable file.", new Object[0]);
                                fileJ = y1Var.j();
                                length = fileJ.length();
                            }
                            y1Var.a(fileJ.getCanonicalPath(), length, d0Var.j(), i0Var.f1318g);
                        }
                    }
                }
                gZIPInputStream.close();
                if (i0Var.a()) {
                    try {
                        y1Var.d(i0Var.f1318g);
                    } catch (IOException e) {
                        f.b("Writing extraction finished checkpoint failed with %s.", e.getMessage());
                        throw new k0("Writing extraction finished checkpoint failed.", e, i0Var.a);
                    }
                }
                f.d("Extraction finished for chunk %s of slice %s of pack %s of session %s.", Integer.valueOf(i0Var.f1318g), i0Var.e, i0Var.b, Integer.valueOf(i0Var.a));
                this.c.a().g(i0Var.a, i0Var.b, i0Var.e, i0Var.f1318g);
                try {
                    i0Var.f1322k.close();
                } catch (IOException unused) {
                    f.e("Could not close file for chunk %s of slice %s of pack %s.", Integer.valueOf(i0Var.f1318g), i0Var.e, i0Var.b);
                }
                if (i0Var.f1321j == 3) {
                    s sVarA = this.d.a();
                    String str3 = i0Var.b;
                    long j4 = i0Var.f1320i;
                    sVarA.f(AssetPackState.b(str3, 3, 0, j4, j4, this.e.c(str3, i0Var), 1));
                }
            } catch (Throwable th) {
                try {
                    gZIPInputStream.close();
                    throw th;
                } catch (Throwable th2) {
                    j.d.a.d.a.b.d0.a(th, th2);
                    throw th;
                }
            }
        } catch (IOException e2) {
            f.b("IOException during extraction %s.", e2.getMessage());
            throw new k0(String.format("Error extracting chunk %s of slice %s of pack %s of session %s.", Integer.valueOf(i0Var.f1318g), i0Var.e, i0Var.b, Integer.valueOf(i0Var.a)), e2, i0Var.a);
        }
    }
}
