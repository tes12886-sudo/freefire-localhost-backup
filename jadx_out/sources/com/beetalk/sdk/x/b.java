package com.beetalk.sdk.x;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Process;
import android.text.TextUtils;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class b {
    private static Map<String, b> b = new HashMap();
    private C0047b a;

    /* JADX INFO: renamed from: com.beetalk.sdk.x.b$b, reason: collision with other inner class name */
    public class C0047b {
        private final AtomicLong a;
        private final AtomicInteger b;
        private final long c;
        private final int d;
        private final Map<File, Long> e;
        protected File f;

        /* JADX INFO: renamed from: com.beetalk.sdk.x.b$b$a */
        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                File[] fileArrListFiles = C0047b.this.f.listFiles();
                if (fileArrListFiles != null) {
                    int iJ = 0;
                    int i2 = 0;
                    for (File file : fileArrListFiles) {
                        iJ = (int) (((long) iJ) + C0047b.this.j(file));
                        i2++;
                        C0047b.this.e.put(file, Long.valueOf(file.lastModified()));
                    }
                    C0047b.this.a.set(iJ);
                    C0047b.this.b.set(i2);
                }
            }
        }

        private C0047b(b bVar, File file, long j2, int i2) {
            this.e = Collections.synchronizedMap(new HashMap());
            this.f = file;
            this.c = j2;
            this.d = i2;
            this.a = new AtomicLong();
            this.b = new AtomicInteger();
            i();
        }

        private void i() {
            new Thread(new a()).start();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public long j(File file) {
            return file.length();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public File k(String str) {
            File fileL = l(str);
            Long lValueOf = Long.valueOf(System.currentTimeMillis());
            fileL.setLastModified(lValueOf.longValue());
            this.e.put(fileL, lValueOf);
            return fileL;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public File l(String str) {
            return new File(this.f, str.hashCode() + "");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void m(File file) {
            int iAddAndGet = this.b.get();
            while (iAddAndGet + 1 > this.d) {
                this.a.addAndGet(-o());
                iAddAndGet = this.b.addAndGet(-1);
            }
            this.b.addAndGet(1);
            long j2 = j(file);
            long jAddAndGet = this.a.get();
            while (jAddAndGet + j2 > this.c) {
                jAddAndGet = this.a.addAndGet(-o());
            }
            this.a.addAndGet(j2);
            Long lValueOf = Long.valueOf(System.currentTimeMillis());
            file.setLastModified(lValueOf.longValue());
            this.e.put(file, lValueOf);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean n(String str) {
            return k(str).delete();
        }

        private long o() {
            File key;
            if (this.e.isEmpty()) {
                return 0L;
            }
            Set<Map.Entry<File, Long>> setEntrySet = this.e.entrySet();
            synchronized (this.e) {
                key = null;
                Long value = null;
                for (Map.Entry<File, Long> entry : setEntrySet) {
                    if (key == null) {
                        key = entry.getKey();
                        value = entry.getValue();
                    } else {
                        Long value2 = entry.getValue();
                        if (value2.longValue() < value.longValue()) {
                            key = entry.getKey();
                            value = value2;
                        }
                    }
                }
            }
            long j2 = j(key);
            if (key.delete()) {
                this.e.remove(key);
            }
            return j2;
        }
    }

    private static class c {
        /* JADX INFO: Access modifiers changed from: private */
        public static byte[] a(Bitmap bitmap) {
            if (bitmap == null) {
                return null;
            }
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            bitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
            return byteArrayOutputStream.toByteArray();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static Bitmap b(byte[] bArr) {
            if (bArr.length == 0) {
                return null;
            }
            return BitmapFactory.decodeByteArray(bArr, 0, bArr.length);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static String k(String str) {
            return (str == null || !p(str.getBytes())) ? str : str.substring(str.indexOf(32) + 1, str.length());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static byte[] l(byte[] bArr) {
            return p(bArr) ? m(bArr, q(bArr, ' ') + 1, bArr.length) : bArr;
        }

        private static byte[] m(byte[] bArr, int i2, int i3) {
            int i4 = i3 - i2;
            if (i4 >= 0) {
                byte[] bArr2 = new byte[i4];
                System.arraycopy(bArr, i2, bArr2, 0, Math.min(bArr.length - i2, i4));
                return bArr2;
            }
            throw new IllegalArgumentException(i2 + " > " + i3);
        }

        private static String n(int i2) {
            String str = System.currentTimeMillis() + "";
            while (str.length() < 13) {
                str = "0" + str;
            }
            return str + "-" + i2 + ' ';
        }

        private static String[] o(byte[] bArr) {
            if (p(bArr)) {
                return new String[]{new String(m(bArr, 0, 13)), new String(m(bArr, 14, q(bArr, ' ')))};
            }
            return null;
        }

        private static boolean p(byte[] bArr) {
            return bArr != null && bArr.length > 15 && bArr[13] == 45 && q(bArr, ' ') > 14;
        }

        private static int q(byte[] bArr, char c) {
            for (int i2 = 0; i2 < bArr.length; i2++) {
                if (bArr[i2] == c) {
                    return i2;
                }
            }
            return -1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static boolean r(String str) {
            return s(str.getBytes());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static boolean s(byte[] bArr) {
            String[] strArrO = o(bArr);
            if (strArrO != null && strArrO.length == 2) {
                String strSubstring = strArrO[0];
                while (strSubstring.startsWith("0")) {
                    strSubstring = strSubstring.substring(1, strSubstring.length());
                }
                if (System.currentTimeMillis() > Long.valueOf(strSubstring).longValue() + (Long.valueOf(strArrO[1]).longValue() * 1000)) {
                    return true;
                }
            }
            return false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static byte[] t(int i2, byte[] bArr) {
            byte[] bytes = n(i2).getBytes();
            byte[] bArr2 = new byte[bytes.length + bArr.length];
            System.arraycopy(bytes, 0, bArr2, 0, bytes.length);
            System.arraycopy(bArr, 0, bArr2, bytes.length, bArr.length);
            return bArr2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static String u(int i2, String str) {
            return n(i2) + str;
        }
    }

    private b(File file, long j2, int i2) {
        if (file.exists() || file.mkdirs()) {
            this.a = new C0047b(file, j2, i2);
            return;
        }
        throw new RuntimeException("can't make dirs in " + file.getAbsolutePath());
    }

    public static b a(Context context, String str) {
        return b(new File(context.getCacheDir(), str), 50000000L, Integer.MAX_VALUE);
    }

    public static b b(File file, long j2, int i2) {
        b bVar = b.get(file.getAbsoluteFile() + g());
        if (bVar != null) {
            return bVar;
        }
        b bVar2 = new b(file, j2, i2);
        b.put(file.getAbsolutePath() + g(), bVar2);
        return bVar2;
    }

    private static String g() {
        return "_" + Process.myPid();
    }

    /* JADX WARN: Code duplicated, block: B:42:0x0056 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Not initialized variable reg: 2, insn: 0x0053: MOVE (r0 I:??[OBJECT, ARRAY]) = (r2 I:??[OBJECT, ARRAY]), block:B:35:0x0053 */
    public byte[] c(String str) throws Throwable {
        RandomAccessFile randomAccessFile;
        RandomAccessFile randomAccessFile2;
        RandomAccessFile randomAccessFile3 = null;
        try {
            try {
                File fileK = this.a.k(str);
                if (!fileK.exists()) {
                    return null;
                }
                randomAccessFile = new RandomAccessFile(fileK, "r");
                try {
                    byte[] bArr = new byte[(int) randomAccessFile.length()];
                    randomAccessFile.read(bArr);
                    if (c.s(bArr)) {
                        try {
                            randomAccessFile.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        n(str);
                        return null;
                    }
                    byte[] bArrL = c.l(bArr);
                    try {
                        randomAccessFile.close();
                    } catch (IOException e2) {
                        e2.printStackTrace();
                    }
                    return bArrL;
                } catch (Exception e3) {
                    e = e3;
                }
            } catch (Throwable th) {
                th = th;
                randomAccessFile3 = randomAccessFile2;
                if (randomAccessFile3 != null) {
                    try {
                        randomAccessFile3.close();
                    } catch (IOException e4) {
                        e4.printStackTrace();
                    }
                }
                throw th;
            }
        } catch (Exception e5) {
            e = e5;
            randomAccessFile = null;
        } catch (Throwable th2) {
            th = th2;
            if (randomAccessFile3 != null) {
                randomAccessFile3.close();
            }
            throw th;
        }
        e.printStackTrace();
        if (randomAccessFile != null) {
            try {
                randomAccessFile.close();
            } catch (IOException e6) {
                e6.printStackTrace();
            }
        }
        return null;
    }

    public Bitmap d(String str) {
        if (c(str) == null) {
            return null;
        }
        return c.b(c(str));
    }

    public JSONObject e(String str) throws Throwable {
        String strF = f(str);
        if (TextUtils.isEmpty(strF)) {
            return null;
        }
        try {
            return new JSONObject(strF);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.io.BufferedReader] */
    public String f(String str) throws Throwable {
        BufferedReader bufferedReader;
        File fileK = this.a.k(str);
        ?? Exists = fileK.exists();
        ?? r2 = 0;
        try {
            if (Exists == 0) {
                return null;
            }
            try {
                bufferedReader = new BufferedReader(new FileReader(fileK));
                String str2 = "";
                while (true) {
                    try {
                        String line = bufferedReader.readLine();
                        if (line == null) {
                            break;
                        }
                        str2 = str2 + line;
                    } catch (IOException e) {
                        e = e;
                        e.printStackTrace();
                        if (bufferedReader != null) {
                            try {
                                bufferedReader.close();
                            } catch (IOException e2) {
                                e2.printStackTrace();
                            }
                        }
                        return null;
                    }
                }
                if (c.r(str2)) {
                    try {
                        bufferedReader.close();
                    } catch (IOException e3) {
                        e3.printStackTrace();
                    }
                    n(str);
                    return null;
                }
                String strK = c.k(str2);
                try {
                    bufferedReader.close();
                } catch (IOException e4) {
                    e4.printStackTrace();
                }
                return strK;
            } catch (IOException e5) {
                e = e5;
                bufferedReader = null;
            } catch (Throwable th) {
                th = th;
                if (r2 != 0) {
                    try {
                        r2.close();
                    } catch (IOException e6) {
                        e6.printStackTrace();
                    }
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            r2 = Exists;
        }
    }

    public void h(String str, Bitmap bitmap, int i2) throws Throwable {
        m(str, c.a(bitmap), i2);
    }

    public void i(String str, String str2) throws Throwable {
        File fileL = this.a.l(str);
        BufferedWriter bufferedWriter = null;
        try {
            try {
                BufferedWriter bufferedWriter2 = new BufferedWriter(new FileWriter(fileL), 1024);
                try {
                    bufferedWriter2.write(str2);
                    try {
                        bufferedWriter2.flush();
                        bufferedWriter2.close();
                    } catch (IOException e) {
                        e = e;
                        e.printStackTrace();
                    }
                } catch (IOException e2) {
                    e = e2;
                    bufferedWriter = bufferedWriter2;
                    e.printStackTrace();
                    if (bufferedWriter != null) {
                        try {
                            bufferedWriter.flush();
                            bufferedWriter.close();
                        } catch (IOException e3) {
                            e = e3;
                            e.printStackTrace();
                        }
                    }
                } catch (Throwable th) {
                    th = th;
                    bufferedWriter = bufferedWriter2;
                    if (bufferedWriter != null) {
                        try {
                            bufferedWriter.flush();
                            bufferedWriter.close();
                        } catch (IOException e4) {
                            e4.printStackTrace();
                        }
                    }
                    this.a.m(fileL);
                    throw th;
                }
            } catch (IOException e5) {
                e = e5;
            }
            this.a.m(fileL);
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public void j(String str, String str2, int i2) throws Throwable {
        i(str, c.u(i2, str2));
    }

    public void k(String str, JSONObject jSONObject, int i2) throws Throwable {
        j(str, jSONObject.toString(), i2);
    }

    public void l(String str, byte[] bArr) throws Throwable {
        File fileL = this.a.l(str);
        FileOutputStream fileOutputStream = null;
        try {
            try {
                FileOutputStream fileOutputStream2 = new FileOutputStream(fileL);
                try {
                    fileOutputStream2.write(bArr);
                    try {
                        fileOutputStream2.flush();
                        fileOutputStream2.close();
                    } catch (IOException e) {
                        e = e;
                        e.printStackTrace();
                    }
                } catch (Exception e2) {
                    e = e2;
                    fileOutputStream = fileOutputStream2;
                    e.printStackTrace();
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.flush();
                            fileOutputStream.close();
                        } catch (IOException e3) {
                            e = e3;
                            e.printStackTrace();
                        }
                    }
                } catch (Throwable th) {
                    th = th;
                    fileOutputStream = fileOutputStream2;
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.flush();
                            fileOutputStream.close();
                        } catch (IOException e4) {
                            e4.printStackTrace();
                        }
                    }
                    this.a.m(fileL);
                    throw th;
                }
            } catch (Exception e5) {
                e = e5;
            }
            this.a.m(fileL);
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public void m(String str, byte[] bArr, int i2) throws Throwable {
        l(str, c.t(i2, bArr));
    }

    public boolean n(String str) {
        return this.a.n(str);
    }
}
