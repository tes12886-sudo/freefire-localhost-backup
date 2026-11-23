package h.r;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.util.Log;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileFilter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipOutputStream;

/* JADX INFO: loaded from: classes.dex */
final class b implements Closeable {
    private final File a;
    private final long b;
    private final File c;
    private final RandomAccessFile d;
    private final FileChannel e;
    private final FileLock f;

    class a implements FileFilter {
        a(b bVar) {
        }

        @Override // java.io.FileFilter
        public boolean accept(File file) {
            return !file.getName().equals("MultiDex.lock");
        }
    }

    /* JADX INFO: renamed from: h.r.b$b, reason: collision with other inner class name */
    private static class C0214b extends File {
        public long a;

        public C0214b(File file, String str) {
            super(file, str);
            this.a = -1L;
        }
    }

    b(File file, File file2) {
        Log.i("MultiDex", "MultiDexExtractor(" + file.getPath() + ", " + file2.getPath() + ")");
        this.a = file;
        this.c = file2;
        this.b = u(file);
        File file3 = new File(file2, "MultiDex.lock");
        RandomAccessFile randomAccessFile = new RandomAccessFile(file3, "rw");
        this.d = randomAccessFile;
        try {
            FileChannel channel = randomAccessFile.getChannel();
            this.e = channel;
            try {
                Log.i("MultiDex", "Blocking on lock " + file3.getPath());
                this.f = channel.lock();
                Log.i("MultiDex", file3.getPath() + " locked");
            } catch (IOException e) {
                e = e;
                c(this.e);
                throw e;
            } catch (Error e2) {
                e = e2;
                c(this.e);
                throw e;
            } catch (RuntimeException e3) {
                e = e3;
                c(this.e);
                throw e;
            }
        } catch (IOException | Error | RuntimeException e4) {
            c(this.d);
            throw e4;
        }
    }

    private static boolean F(Context context, File file, long j2, String str) {
        SharedPreferences sharedPreferencesJ = j(context);
        if (sharedPreferencesJ.getLong(str + "timestamp", -1L) == l(file)) {
            if (sharedPreferencesJ.getLong(str + "crc", -1L) == j2) {
                return false;
            }
        }
        return true;
    }

    private List<C0214b> Q(Context context, String str) throws IOException {
        Log.i("MultiDex", "loading existing secondary dex files");
        String str2 = this.a.getName() + ".classes";
        SharedPreferences sharedPreferencesJ = j(context);
        int i2 = sharedPreferencesJ.getInt(str + "dex.number", 1);
        ArrayList arrayList = new ArrayList(i2 + (-1));
        int i3 = 2;
        while (i3 <= i2) {
            C0214b c0214b = new C0214b(this.c, str2 + i3 + ".zip");
            if (!c0214b.isFile()) {
                throw new IOException("Missing extracted secondary dex file '" + c0214b.getPath() + "'");
            }
            c0214b.a = u(c0214b);
            long j2 = sharedPreferencesJ.getLong(str + "dex.crc." + i3, -1L);
            long j3 = sharedPreferencesJ.getLong(str + "dex.time." + i3, -1L);
            long jLastModified = c0214b.lastModified();
            if (j3 == jLastModified) {
                String str3 = str2;
                SharedPreferences sharedPreferences = sharedPreferencesJ;
                if (j2 == c0214b.a) {
                    arrayList.add(c0214b);
                    i3++;
                    sharedPreferencesJ = sharedPreferences;
                    str2 = str3;
                }
            }
            throw new IOException("Invalid extracted dex: " + c0214b + " (key \"" + str + "\"), expected modification time: " + j3 + ", modification time: " + jLastModified + ", expected crc: " + j2 + ", file crc: " + c0214b.a);
        }
        return arrayList;
    }

    private List<C0214b> T() {
        boolean z;
        String str = this.a.getName() + ".classes";
        b();
        ArrayList arrayList = new ArrayList();
        ZipFile zipFile = new ZipFile(this.a);
        try {
            ZipEntry entry = zipFile.getEntry("classes2.dex");
            int i2 = 2;
            while (entry != null) {
                C0214b c0214b = new C0214b(this.c, str + i2 + ".zip");
                arrayList.add(c0214b);
                Log.i("MultiDex", "Extraction is needed for file " + c0214b);
                int i3 = 0;
                boolean z2 = false;
                while (i3 < 3 && !z2) {
                    int i4 = i3 + 1;
                    f(zipFile, entry, c0214b, str);
                    try {
                        c0214b.a = u(c0214b);
                        z = true;
                    } catch (IOException e) {
                        Log.w("MultiDex", "Failed to read crc from " + c0214b.getAbsolutePath(), e);
                        z = false;
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append("Extraction ");
                    sb.append(z ? "succeeded" : "failed");
                    sb.append(" '");
                    sb.append(c0214b.getAbsolutePath());
                    sb.append("': length ");
                    sb.append(c0214b.length());
                    sb.append(" - crc: ");
                    sb.append(c0214b.a);
                    Log.i("MultiDex", sb.toString());
                    if (!z) {
                        c0214b.delete();
                        if (c0214b.exists()) {
                            Log.w("MultiDex", "Failed to delete corrupted secondary dex '" + c0214b.getPath() + "'");
                        }
                    }
                    z2 = z;
                    i3 = i4;
                }
                if (!z2) {
                    throw new IOException("Could not create zip file " + c0214b.getAbsolutePath() + " for secondary dex (" + i2 + ")");
                }
                i2++;
                entry = zipFile.getEntry("classes" + i2 + ".dex");
            }
            try {
                zipFile.close();
            } catch (IOException e2) {
                Log.w("MultiDex", "Failed to close resource", e2);
            }
            return arrayList;
        } catch (Throwable th) {
            try {
                zipFile.close();
                throw th;
            } catch (IOException e3) {
                Log.w("MultiDex", "Failed to close resource", e3);
                throw th;
            }
        }
    }

    private static void Y(Context context, String str, long j2, long j3, List<C0214b> list) {
        SharedPreferences.Editor editorEdit = j(context).edit();
        editorEdit.putLong(str + "timestamp", j2);
        editorEdit.putLong(str + "crc", j3);
        editorEdit.putInt(str + "dex.number", list.size() + 1);
        int i2 = 2;
        for (C0214b c0214b : list) {
            editorEdit.putLong(str + "dex.crc." + i2, c0214b.a);
            editorEdit.putLong(str + "dex.time." + i2, c0214b.lastModified());
            i2++;
        }
        editorEdit.commit();
    }

    private void b() {
        File[] fileArrListFiles = this.c.listFiles(new a(this));
        if (fileArrListFiles == null) {
            Log.w("MultiDex", "Failed to list secondary dex dir content (" + this.c.getPath() + ").");
            return;
        }
        for (File file : fileArrListFiles) {
            Log.i("MultiDex", "Trying to delete old file " + file.getPath() + " of size " + file.length());
            if (file.delete()) {
                Log.i("MultiDex", "Deleted old file " + file.getPath());
            } else {
                Log.w("MultiDex", "Failed to delete old file " + file.getPath());
            }
        }
    }

    private static void c(Closeable closeable) {
        try {
            closeable.close();
        } catch (IOException e) {
            Log.w("MultiDex", "Failed to close resource", e);
        }
    }

    private static void f(ZipFile zipFile, ZipEntry zipEntry, File file, String str) throws IOException {
        InputStream inputStream = zipFile.getInputStream(zipEntry);
        File fileCreateTempFile = File.createTempFile("tmp-" + str, ".zip", file.getParentFile());
        Log.i("MultiDex", "Extracting " + fileCreateTempFile.getPath());
        try {
            ZipOutputStream zipOutputStream = new ZipOutputStream(new BufferedOutputStream(new FileOutputStream(fileCreateTempFile)));
            try {
                ZipEntry zipEntry2 = new ZipEntry("classes.dex");
                zipEntry2.setTime(zipEntry.getTime());
                zipOutputStream.putNextEntry(zipEntry2);
                byte[] bArr = new byte[16384];
                while (true) {
                    int i2 = inputStream.read(bArr);
                    if (i2 == -1) {
                        break;
                    } else {
                        zipOutputStream.write(bArr, 0, i2);
                    }
                }
                zipOutputStream.closeEntry();
                zipOutputStream.close();
                if (!fileCreateTempFile.setReadOnly()) {
                    throw new IOException("Failed to mark readonly \"" + fileCreateTempFile.getAbsolutePath() + "\" (tmp of \"" + file.getAbsolutePath() + "\")");
                }
                Log.i("MultiDex", "Renaming to " + file.getPath());
                if (fileCreateTempFile.renameTo(file)) {
                    c(inputStream);
                    fileCreateTempFile.delete();
                    return;
                }
                throw new IOException("Failed to rename \"" + fileCreateTempFile.getAbsolutePath() + "\" to \"" + file.getAbsolutePath() + "\"");
            } catch (Throwable th) {
                zipOutputStream.close();
                throw th;
            }
        } catch (Throwable th2) {
            c(inputStream);
            fileCreateTempFile.delete();
            throw th2;
        }
    }

    private static SharedPreferences j(Context context) {
        return context.getSharedPreferences("multidex.version", Build.VERSION.SDK_INT < 11 ? 0 : 4);
    }

    private static long l(File file) {
        long jLastModified = file.lastModified();
        return jLastModified == -1 ? jLastModified - 1 : jLastModified;
    }

    private static long u(File file) throws IOException {
        long jC = c.c(file);
        return jC == -1 ? jC - 1 : jC;
    }

    List<? extends File> O(Context context, String str, boolean z) {
        List<C0214b> listQ;
        Log.i("MultiDex", "MultiDexExtractor.load(" + this.a.getPath() + ", " + z + ", " + str + ")");
        if (!this.f.isValid()) {
            throw new IllegalStateException("MultiDexExtractor was closed");
        }
        if (!z && !F(context, this.a, this.b, str)) {
            try {
                listQ = Q(context, str);
            } catch (IOException e) {
                Log.w("MultiDex", "Failed to reload existing extracted secondary dex files, falling back to fresh extraction", e);
                List<C0214b> listT = T();
                Y(context, str, l(this.a), this.b, listT);
                listQ = listT;
            }
            Log.i("MultiDex", "load found " + listQ.size() + " secondary dex files");
            return listQ;
        }
        Log.i("MultiDex", z ? "Forced extraction must be performed." : "Detected that extraction must be performed.");
        List<C0214b> listT2 = T();
        Y(context, str, l(this.a), this.b, listT2);
        listQ = listT2;
        Log.i("MultiDex", "load found " + listQ.size() + " secondary dex files");
        return listQ;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f.release();
        this.e.close();
        this.d.close();
    }
}
