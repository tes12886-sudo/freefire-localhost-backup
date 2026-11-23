package j.a;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Environment;
import android.text.TextUtils;
import android.util.Log;
import com.FF.voiceengine.FFVoiceConst;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.zip.GZIPOutputStream;

/* JADX INFO: loaded from: classes.dex */
public class a extends j.a.b {
    private static final String b = a.class.getSimpleName();
    private static String c;
    private static SimpleDateFormat d;
    private static SimpleDateFormat e;
    public static String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static String f1910g;
    private HashMap<String, ArrayList<c>> a;

    /* JADX INFO: renamed from: j.a.a$a, reason: collision with other inner class name */
    class C0219a implements Comparator<File> {
        C0219a(a aVar) {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(File file, File file2) {
            if (file.lastModified() > file2.lastModified()) {
                return 1;
            }
            return file.lastModified() < file2.lastModified() ? -1 : 0;
        }
    }

    class b implements Comparator<c> {
        b(a aVar) {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(c cVar, c cVar2) {
            long j2 = cVar.b;
            long j3 = cVar2.b;
            if (j2 - j3 > 0) {
                return 1;
            }
            return j2 - j3 < 0 ? -1 : 0;
        }
    }

    private static class c {
        String a;
        long b;
        String c;
        boolean d;
        boolean e;
        String f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        String f1911g;

        private c(Intent intent) {
            this.b = intent.getLongExtra("time", 0L);
            this.c = intent.getStringExtra("log");
            this.a = a.d.format(new Date(this.b));
            this.d = intent.getBooleanExtra("isFatal", false);
            this.e = intent.getBooleanExtra("forceFlush", false);
            this.f = intent.getStringExtra("file");
            this.f1911g = intent.getStringExtra("dir_path");
        }

        /* synthetic */ c(Intent intent, C0219a c0219a) {
            this(intent);
        }
    }

    static {
        Locale locale = Locale.ENGLISH;
        d = new SimpleDateFormat("yyyy-MM-dd-HH", locale);
        e = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", locale);
        f = "http://203.116.180.99/crash/logs/";
        f1910g = "crashreporter.beetalkmobile.com";
    }

    public a() {
        super("log2file");
        this.a = new HashMap<>();
    }

    private void b(String str) {
        if (TextUtils.isEmpty(str)) {
            String strE = e();
            Locale locale = Locale.ENGLISH;
            StringBuilder sb = new StringBuilder();
            sb.append(Environment.getExternalStorageDirectory());
            String str2 = File.separator;
            sb.append(str2);
            sb.append("%s");
            sb.append(str2);
            sb.append("logs");
            str = String.format(locale, sb.toString(), strE.toLowerCase(locale));
        }
        c = str;
        File file = new File(c);
        if (file.exists() || !file.mkdirs()) {
            return;
        }
        Log.d(b, "current dir " + c);
    }

    private void c() {
        File[] fileArrListFiles;
        try {
            File file = new File(c);
            if (file.exists() && (fileArrListFiles = file.listFiles()) != null && fileArrListFiles.length > 168) {
                Arrays.sort(fileArrListFiles, new C0219a(this));
                for (int i2 = 0; i2 < fileArrListFiles.length - 168; i2++) {
                    if (fileArrListFiles[i2].exists()) {
                        fileArrListFiles[i2].delete();
                    }
                }
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    private void d() {
        synchronized (this.a) {
            try {
                for (String str : this.a.keySet()) {
                    StringBuffer stringBuffer = new StringBuffer();
                    ArrayList<c> arrayList = this.a.get(str);
                    Collections.sort(arrayList, new b(this));
                    c[] cVarArr = (c[]) arrayList.toArray(new c[0]);
                    arrayList.clear();
                    for (c cVar : cVarArr) {
                        String str2 = e.format(new Date(cVar.b));
                        stringBuffer.append('[');
                        stringBuffer.append(str2);
                        stringBuffer.append(']');
                        stringBuffer.append('\t');
                        stringBuffer.append(cVar.c);
                        stringBuffer.append('\n');
                    }
                    FileWriter fileWriterH = null;
                    try {
                        fileWriterH = h(str);
                        fileWriterH.append((CharSequence) stringBuffer.toString());
                        Thread.sleep(200L);
                        if (fileWriterH != null) {
                        }
                    } catch (IOException | InterruptedException unused) {
                        if (fileWriterH != null) {
                        }
                    } finally {
                        if (fileWriterH != null) {
                            try {
                                fileWriterH.close();
                            } catch (IOException unused2) {
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private String e() {
        return getString(getApplicationContext().getApplicationInfo().labelRes, new Object[]{Locale.ENGLISH});
    }

    private int f() {
        Iterator<String> it = this.a.keySet().iterator();
        int size = 0;
        while (it.hasNext()) {
            size += this.a.get(it.next()).size();
        }
        return size;
    }

    private String g(String str) {
        return c + File.separator + str + ".txt";
    }

    private FileWriter h(String str) throws IOException {
        b(c);
        File file = new File(g(str));
        if (!file.exists()) {
            file.createNewFile();
        }
        return new FileWriter(file, true);
    }

    private static String i(long j2) {
        if (j2 < FFVoiceConst.FFVoiceEvent.FFVoice_EVENT_EOF) {
            return j2 + " B";
        }
        double d2 = j2;
        double dLog = Math.log(d2);
        double d3 = FFVoiceConst.FFVoiceEvent.FFVoice_EVENT_EOF;
        int iLog = (int) (dLog / Math.log(d3));
        String str = "kMGTPE".charAt(iLog - 1) + "";
        double dPow = Math.pow(d3, iLog);
        Double.isNaN(d2);
        return String.format("%.1f %sB", Double.valueOf(d2 / dPow), str);
    }

    public static void j(Context context, String str, boolean z, String str2) {
        Intent intent = new Intent(context, (Class<?>) a.class);
        intent.putExtra("time", System.currentTimeMillis());
        intent.putExtra("log", str);
        intent.putExtra("forceFlush", z);
        intent.putExtra("dir_path", str2);
        if (Build.VERSION.SDK_INT >= 26) {
            context.startForegroundService(intent);
        } else {
            context.startService(intent);
        }
    }

    private static boolean k(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            try {
                j.a.c cVar = new j.a.c(f, "UTF-8");
                cVar.b("Host", f1910g);
                cVar.a("logfile", new File(str));
                cVar.a("attachment", new File(str2));
                if (cVar.c()) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("====\n");
                    stringBuffer.append("post LogFile = " + str);
                    stringBuffer.append('\n');
                    stringBuffer.append("post AttachFile = " + str2);
                    stringBuffer.append("\n done!");
                    Log.i("post", stringBuffer.toString());
                    return true;
                }
            } catch (IOException unused) {
            }
        }
        return false;
    }

    private void l(c cVar) {
        File file = new File(g(cVar.a));
        File file2 = new File(g(d.format(new Date(cVar.b - 3600000))));
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append('\n');
        stringBuffer.append("curFile= " + file.getAbsolutePath() + " exist = " + file.exists() + " size = " + i(file.length()));
        stringBuffer.append('\n');
        stringBuffer.append("preFile= " + file2.getAbsolutePath() + " exist = " + file2.exists() + " size = " + i(file2.length()));
        Log.i("reportToServer", stringBuffer.toString());
        try {
            File file3 = new File(c + File.separator + "report.gz");
            file3.createNewFile();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(new FileOutputStream(file3));
            byte[] bArr = new byte[1024];
            if (file2.exists()) {
                FileInputStream fileInputStream = new FileInputStream(file2);
                while (true) {
                    int i2 = fileInputStream.read(bArr);
                    if (i2 <= 0) {
                        break;
                    } else {
                        gZIPOutputStream.write(bArr, 0, i2);
                    }
                }
                fileInputStream.close();
            }
            gZIPOutputStream.write("\n ---second_file--- \n".getBytes());
            if (file.exists()) {
                FileInputStream fileInputStream2 = new FileInputStream(file);
                while (true) {
                    int i3 = fileInputStream2.read(bArr);
                    if (i3 <= 0) {
                        break;
                    } else {
                        gZIPOutputStream.write(bArr, 0, i3);
                    }
                }
                fileInputStream2.close();
            }
            gZIPOutputStream.flush();
            gZIPOutputStream.finish();
            gZIPOutputStream.close();
            if (k(cVar.f, file3.getAbsolutePath())) {
                File file4 = new File(cVar.f);
                if (file4.delete()) {
                    Log.i("reportToServer", "file =" + file4.getAbsolutePath() + " deleted");
                }
                if (file3.delete()) {
                    Log.i("reportToServer", "file =" + file3.getAbsolutePath() + " deleted");
                }
            }
        } catch (IOException unused) {
        }
    }

    @Override // android.app.IntentService, android.app.Service
    public void onDestroy() {
        super.onDestroy();
        d();
    }

    @Override // android.app.IntentService
    protected void onHandleIntent(Intent intent) {
        if (intent == null) {
            return;
        }
        c cVar = new c(intent, null);
        b(cVar.f1911g);
        c();
        if (this.a.get(cVar.a) == null) {
            this.a.put(cVar.a, new ArrayList<>());
        }
        this.a.get(cVar.a).add(cVar);
        if (f() > 16 || cVar.d || cVar.e) {
            d();
        }
        if (cVar.d) {
            l(cVar);
        }
    }
}
