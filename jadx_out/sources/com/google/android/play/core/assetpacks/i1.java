package com.google.android.play.core.assetpacks;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FilenameFilter;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
final class i1 implements s2 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final j.d.a.d.a.b.f f1323g = new j.d.a.d.a.b.f("FakeAssetPackService");
    private final String a;
    private final s b;
    private final Context c;
    private final u1 d;
    private final j.d.a.d.a.b.e0<Executor> e;
    private final Handler f = new Handler(Looper.getMainLooper());

    static {
        new AtomicInteger(1);
    }

    i1(File file, s sVar, o0 o0Var, Context context, u1 u1Var, j.d.a.d.a.b.e0<Executor> e0Var) {
        this.a = file.getAbsolutePath();
        this.b = sVar;
        this.c = context;
        this.d = u1Var;
        this.e = e0Var;
    }

    static long h(int i2, long j2) {
        if (i2 == 2) {
            return j2 / 2;
        }
        if (i2 == 3 || i2 == 4) {
            return j2;
        }
        return 0L;
    }

    private final File[] k(final String str) throws com.google.android.play.core.common.a {
        File file = new File(this.a);
        if (!file.isDirectory()) {
            throw new com.google.android.play.core.common.a(String.format("Local testing directory '%s' not found.", file));
        }
        File[] fileArrListFiles = file.listFiles(new FilenameFilter(str) { // from class: com.google.android.play.core.assetpacks.g1
            private final String a;

            {
                this.a = str;
            }

            @Override // java.io.FilenameFilter
            public final boolean accept(File file2, String str2) {
                return str2.startsWith(String.valueOf(this.a).concat("-")) && str2.endsWith(".apk");
            }
        });
        if (fileArrListFiles == null) {
            throw new com.google.android.play.core.common.a(String.format("Failed fetching APKs for pack '%s'.", str));
        }
        if (fileArrListFiles.length == 0) {
            throw new com.google.android.play.core.common.a(String.format("No APKs available for pack '%s'.", str));
        }
        for (File file2 : fileArrListFiles) {
            if (j.d.a.d.a.b.r.a(file2).equals(str)) {
                return fileArrListFiles;
            }
        }
        throw new com.google.android.play.core.common.a(String.format("No master slice available for pack '%s'.", str));
    }

    private static String l(File file) throws com.google.android.play.core.common.a {
        try {
            return j1.a(Arrays.asList(file));
        } catch (IOException e) {
            throw new com.google.android.play.core.common.a(String.format("Could not digest file: %s.", file), e);
        } catch (NoSuchAlgorithmException e2) {
            throw new com.google.android.play.core.common.a("SHA256 algorithm not supported.", e2);
        }
    }

    private final void m(int i2, String str, int i3) throws com.google.android.play.core.common.a {
        Bundle bundle = new Bundle();
        bundle.putInt("app_version_code", this.d.a());
        bundle.putInt("session_id", i2);
        File[] fileArrK = k(str);
        ArrayList<String> arrayList = new ArrayList<>();
        long length = 0;
        for (File file : fileArrK) {
            length += file.length();
            ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>();
            arrayList2.add(i3 == 3 ? new Intent().setData(Uri.EMPTY) : null);
            String strA = j.d.a.d.a.b.r.a(file);
            bundle.putParcelableArrayList(j.d.a.d.a.b.i0.b("chunk_intents", str, strA), arrayList2);
            bundle.putString(j.d.a.d.a.b.i0.b("uncompressed_hash_sha256", str, strA), l(file));
            bundle.putLong(j.d.a.d.a.b.i0.b("uncompressed_size", str, strA), file.length());
            arrayList.add(strA);
        }
        bundle.putStringArrayList(j.d.a.d.a.b.i0.a("slice_ids", str), arrayList);
        bundle.putLong(j.d.a.d.a.b.i0.a("pack_version", str), this.d.a());
        bundle.putInt(j.d.a.d.a.b.i0.a("status", str), i3);
        bundle.putInt(j.d.a.d.a.b.i0.a("error_code", str), 0);
        bundle.putLong(j.d.a.d.a.b.i0.a("bytes_downloaded", str), h(i3, length));
        bundle.putLong(j.d.a.d.a.b.i0.a("total_bytes_to_download", str), length);
        bundle.putStringArrayList("pack_names", new ArrayList<>(Arrays.asList(str)));
        bundle.putLong("bytes_downloaded", h(i3, length));
        bundle.putLong("total_bytes_to_download", length);
        final Intent intentPutExtra = new Intent("com.google.android.play.core.assetpacks.receiver.ACTION_SESSION_UPDATE").putExtra("com.google.android.play.core.assetpacks.receiver.EXTRA_SESSION_STATE", bundle);
        this.f.post(new Runnable(this, intentPutExtra) { // from class: com.google.android.play.core.assetpacks.h1
            private final i1 a;
            private final Intent b;

            {
                this.a = this;
                this.b = intentPutExtra;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.i(this.b);
            }
        });
    }

    @Override // com.google.android.play.core.assetpacks.s2
    public final void a(final int i2, final String str) {
        f1323g.d("notifyModuleCompleted", new Object[0]);
        this.e.a().execute(new Runnable(this, i2, str) { // from class: com.google.android.play.core.assetpacks.f1
            private final i1 a;
            private final int b;
            private final String c;

            {
                this.a = this;
                this.b = i2;
                this.c = str;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.j(this.b, this.c);
            }
        });
    }

    @Override // com.google.android.play.core.assetpacks.s2
    public final j.d.a.d.a.f.e<ParcelFileDescriptor> b(int i2, String str, String str2, int i3) {
        f1323g.d("getChunkFileDescriptor(session=%d, %s, %s, %d)", Integer.valueOf(i2), str, str2, Integer.valueOf(i3));
        j.d.a.d.a.f.p pVar = new j.d.a.d.a.f.p();
        try {
            for (File file : k(str)) {
                if (j.d.a.d.a.b.r.a(file).equals(str2)) {
                    pVar.a(ParcelFileDescriptor.open(file, 268435456));
                    return pVar.c();
                }
            }
            throw new com.google.android.play.core.common.a(String.format("Local testing slice for '%s' not found.", str2));
        } catch (com.google.android.play.core.common.a e) {
            f1323g.e("getChunkFileDescriptor failed", e);
            pVar.b(e);
        } catch (FileNotFoundException e2) {
            f1323g.e("getChunkFileDescriptor failed", e2);
            pVar.b(new com.google.android.play.core.common.a("Asset Slice file not found.", e2));
        }
    }

    @Override // com.google.android.play.core.assetpacks.s2
    public final void c() {
        f1323g.d("keepAlive", new Object[0]);
    }

    @Override // com.google.android.play.core.assetpacks.s2
    public final void d(int i2) {
        f1323g.d("notifySessionFailed", new Object[0]);
    }

    @Override // com.google.android.play.core.assetpacks.s2
    public final j.d.a.d.a.f.e<List<String>> e(Map<String, Long> map) {
        f1323g.d("syncPacks()", new Object[0]);
        return j.d.a.d.a.f.g.a(new ArrayList());
    }

    @Override // com.google.android.play.core.assetpacks.s2
    public final void f(List<String> list) {
        f1323g.d("cancelDownload(%s)", list);
    }

    @Override // com.google.android.play.core.assetpacks.s2
    public final void g(int i2, String str, String str2, int i3) {
        f1323g.d("notifyChunkTransferred", new Object[0]);
    }

    final /* synthetic */ void i(Intent intent) {
        this.b.a(this.c, intent);
    }

    final /* synthetic */ void j(int i2, String str) {
        try {
            m(i2, str, 4);
        } catch (com.google.android.play.core.common.a e) {
            f1323g.e("notifyModuleCompleted failed", e);
        }
    }
}
