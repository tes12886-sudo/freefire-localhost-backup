package com.google.firebase.crashlytics.internal.g;

import com.google.firebase.crashlytics.internal.common.m;
import com.google.firebase.crashlytics.internal.e.v;
import com.google.firebase.crashlytics.internal.e.w;
import com.google.firebase.crashlytics.internal.settings.SettingsDataProvider;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public class g {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Charset f1424g = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f1425h = 15;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final com.google.firebase.crashlytics.internal.e.x.g f1426i = new com.google.firebase.crashlytics.internal.e.x.g();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final Comparator<? super File> f1427j = new Comparator() { // from class: com.google.firebase.crashlytics.internal.g.a
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return ((File) obj2).getName().compareTo(((File) obj).getName());
        }
    };

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final FilenameFilter f1428k = new FilenameFilter() { // from class: com.google.firebase.crashlytics.internal.g.f
        @Override // java.io.FilenameFilter
        public final boolean accept(File file, String str) {
            return str.startsWith("event");
        }
    };
    private final AtomicInteger a = new AtomicInteger(0);
    private final File b;
    private final File c;
    private final File d;
    private final File e;
    private final SettingsDataProvider f;

    public g(File file, SettingsDataProvider settingsDataProvider) {
        File file2 = new File(file, "report-persistence");
        this.b = new File(file2, "sessions");
        this.c = new File(file2, "priority-reports");
        this.d = new File(file2, "reports");
        this.e = new File(file2, "native-reports");
        this.f = settingsDataProvider;
    }

    private static boolean A(File file) {
        return file.exists() || file.mkdirs();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int B(File file, File file2) {
        return l(file.getName()).compareTo(l(file2.getName()));
    }

    private static File F(File file) throws IOException {
        if (A(file)) {
            return file;
        }
        throw new IOException("Could not create directory " + file);
    }

    private static String G(File file) throws IOException {
        byte[] bArr = new byte[8192];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        FileInputStream fileInputStream = new FileInputStream(file);
        while (true) {
            try {
                int i2 = fileInputStream.read(bArr);
                if (i2 <= 0) {
                    String str = new String(byteArrayOutputStream.toByteArray(), f1424g);
                    fileInputStream.close();
                    return str;
                }
                byteArrayOutputStream.write(bArr, 0, i2);
            } catch (Throwable th) {
                try {
                    fileInputStream.close();
                } catch (Throwable unused) {
                }
                throw th;
            }
        }
    }

    private static void H(File file) {
        if (file == null) {
            return;
        }
        if (file.isDirectory()) {
            for (File file2 : file.listFiles()) {
                H(file2);
            }
        }
        file.delete();
    }

    private static List<File> I(List<File>... listArr) {
        for (List<File> list : listArr) {
            Collections.sort(list, f1427j);
        }
        return d(listArr);
    }

    private static void J(File file, File file2, v.c cVar, String str) {
        try {
            com.google.firebase.crashlytics.internal.e.x.g gVar = f1426i;
            v vVarM = gVar.C(G(file)).m(cVar);
            F(file2);
            N(new File(file2, str), gVar.D(vVarM));
        } catch (IOException e) {
            com.google.firebase.crashlytics.internal.a.f().l("Could not synthesize final native report file for " + file, e);
        }
    }

    private void K(File file, long j2) {
        boolean z;
        List<File> listN = n(file, f1428k);
        if (listN.isEmpty()) {
            com.google.firebase.crashlytics.internal.a.f().i("Session " + file.getName() + " has no events.");
            return;
        }
        Collections.sort(listN);
        ArrayList arrayList = new ArrayList();
        Iterator<File> it = listN.iterator();
        loop0: while (true) {
            z = false;
            while (true) {
                if (!it.hasNext()) {
                    break loop0;
                }
                File next = it.next();
                try {
                    arrayList.add(f1426i.a(G(next)));
                    if (z || q(next.getName())) {
                        z = true;
                    }
                } catch (IOException e) {
                    com.google.firebase.crashlytics.internal.a.f().l("Could not add event to report for " + next, e);
                }
            }
        }
        if (arrayList.isEmpty()) {
            com.google.firebase.crashlytics.internal.a.f().k("Could not parse event files for session " + file.getName());
            return;
        }
        String strG = null;
        File file2 = new File(file, "user");
        if (file2.isFile()) {
            try {
                strG = G(file2);
            } catch (IOException e2) {
                com.google.firebase.crashlytics.internal.a.f().l("Could not read user ID file in " + file.getName(), e2);
            }
        }
        L(new File(file, "report"), z ? this.c : this.d, arrayList, j2, z, strG);
    }

    private static void L(File file, File file2, List<v.d.AbstractC0137d> list, long j2, boolean z, String str) {
        try {
            com.google.firebase.crashlytics.internal.e.x.g gVar = f1426i;
            v vVarL = gVar.C(G(file)).n(j2, z, str).l(w.b(list));
            v.d dVarJ = vVarL.j();
            if (dVarJ == null) {
                return;
            }
            F(file2);
            N(new File(file2, dVarJ.h()), gVar.D(vVarL));
        } catch (IOException e) {
            com.google.firebase.crashlytics.internal.a.f().l("Could not synthesize final report file for " + file, e);
        }
    }

    private static int M(File file, int i2) {
        List<File> listN = n(file, new FilenameFilter() { // from class: com.google.firebase.crashlytics.internal.g.b
            @Override // java.io.FilenameFilter
            public final boolean accept(File file2, String str) {
                return g.r(file2, str);
            }
        });
        Collections.sort(listN, new Comparator() { // from class: com.google.firebase.crashlytics.internal.g.e
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return g.B((File) obj, (File) obj2);
            }
        });
        return b(listN, i2);
    }

    private static void N(File file, String str) throws IOException {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), f1424g);
        try {
            outputStreamWriter.write(str);
            outputStreamWriter.close();
        } catch (Throwable th) {
            try {
                outputStreamWriter.close();
            } catch (Throwable unused) {
            }
            throw th;
        }
    }

    private List<File> a(final String str) {
        List<File> listM = m(this.b, new FileFilter() { // from class: com.google.firebase.crashlytics.internal.g.d
            @Override // java.io.FileFilter
            public final boolean accept(File file) {
                return g.t(str, file);
            }
        });
        Collections.sort(listM, f1427j);
        if (listM.size() <= 8) {
            return listM;
        }
        Iterator<File> it = listM.subList(8, listM.size()).iterator();
        while (it.hasNext()) {
            H(it.next());
        }
        return listM.subList(0, 8);
    }

    private static int b(List<File> list, int i2) {
        int size = list.size();
        for (File file : list) {
            if (size <= i2) {
                return size;
            }
            H(file);
            size--;
        }
        return size;
    }

    private void c() {
        int i2 = this.f.b().a().b;
        List<File> listK = k();
        int size = listK.size();
        if (size <= i2) {
            return;
        }
        Iterator<File> it = listK.subList(i2, size).iterator();
        while (it.hasNext()) {
            it.next().delete();
        }
    }

    private static List<File> d(List<File>... listArr) {
        ArrayList arrayList = new ArrayList();
        int size = 0;
        for (List<File> list : listArr) {
            size += list.size();
        }
        arrayList.ensureCapacity(size);
        for (List<File> list2 : listArr) {
            arrayList.addAll(list2);
        }
        return arrayList;
    }

    private static String i(int i2, boolean z) {
        return "event" + String.format(Locale.US, "%010d", Integer.valueOf(i2)) + (z ? "_" : "");
    }

    private static List<File> j(File file) {
        return m(file, null);
    }

    private List<File> k() {
        return I(d(j(this.c), j(this.e)), j(this.d));
    }

    private static String l(String str) {
        return str.substring(0, f1425h);
    }

    private static List<File> m(File file, FileFilter fileFilter) {
        if (!file.isDirectory()) {
            return Collections.emptyList();
        }
        File[] fileArrListFiles = fileFilter == null ? file.listFiles() : file.listFiles(fileFilter);
        return fileArrListFiles != null ? Arrays.asList(fileArrListFiles) : Collections.emptyList();
    }

    private static List<File> n(File file, FilenameFilter filenameFilter) {
        if (!file.isDirectory()) {
            return Collections.emptyList();
        }
        File[] fileArrListFiles = filenameFilter == null ? file.listFiles() : file.listFiles(filenameFilter);
        return fileArrListFiles != null ? Arrays.asList(fileArrListFiles) : Collections.emptyList();
    }

    private File o(String str) {
        return new File(this.b, str);
    }

    private static boolean q(String str) {
        return str.startsWith("event") && str.endsWith("_");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean r(File file, String str) {
        return str.startsWith("event") && !str.endsWith("_");
    }

    static /* synthetic */ boolean t(String str, File file) {
        return file.isDirectory() && !file.getName().equals(str);
    }

    public void C(v.d.AbstractC0137d abstractC0137d, String str, boolean z) {
        int i2 = this.f.b().a().a;
        File fileO = o(str);
        try {
            N(new File(fileO, i(this.a.getAndIncrement(), z)), f1426i.b(abstractC0137d));
        } catch (IOException e) {
            com.google.firebase.crashlytics.internal.a.f().l("Could not persist event for session " + str, e);
        }
        M(fileO, i2);
    }

    public void D(v vVar) {
        v.d dVarJ = vVar.j();
        if (dVarJ == null) {
            com.google.firebase.crashlytics.internal.a.f().b("Could not get session for report");
            return;
        }
        String strH = dVarJ.h();
        try {
            File fileO = o(strH);
            F(fileO);
            N(new File(fileO, "report"), f1426i.D(vVar));
        } catch (IOException e) {
            com.google.firebase.crashlytics.internal.a.f().c("Could not persist report for session " + strH, e);
        }
    }

    public void E(String str, String str2) {
        try {
            N(new File(o(str2), "user"), str);
        } catch (IOException e) {
            com.google.firebase.crashlytics.internal.a.f().l("Could not persist user ID for session " + str2, e);
        }
    }

    public void e() {
        Iterator<File> it = k().iterator();
        while (it.hasNext()) {
            it.next().delete();
        }
    }

    public void f(final String str) {
        FilenameFilter filenameFilter = new FilenameFilter() { // from class: com.google.firebase.crashlytics.internal.g.c
            @Override // java.io.FilenameFilter
            public final boolean accept(File file, String str2) {
                return str2.startsWith(str);
            }
        };
        Iterator<File> it = d(n(this.c, filenameFilter), n(this.e, filenameFilter), n(this.d, filenameFilter)).iterator();
        while (it.hasNext()) {
            it.next().delete();
        }
    }

    public void g(String str, long j2) {
        for (File file : a(str)) {
            com.google.firebase.crashlytics.internal.a.f().i("Finalizing report for session " + file.getName());
            K(file, j2);
            H(file);
        }
        c();
    }

    public void h(String str, v.c cVar) {
        J(new File(o(str), "report"), this.e, cVar, str);
    }

    public boolean p() {
        return !k().isEmpty();
    }

    public List<String> y() {
        List<File> listJ = j(this.b);
        Collections.sort(listJ, f1427j);
        ArrayList arrayList = new ArrayList();
        Iterator<File> it = listJ.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getName());
        }
        return arrayList;
    }

    public List<m> z() {
        List<File> listK = k();
        ArrayList arrayList = new ArrayList();
        arrayList.ensureCapacity(listK.size());
        for (File file : k()) {
            try {
                arrayList.add(m.a(f1426i.C(G(file)), file.getName()));
            } catch (IOException e) {
                com.google.firebase.crashlytics.internal.a.f().l("Could not load report file " + file + "; deleting", e);
                file.delete();
            }
        }
        return arrayList;
    }
}
