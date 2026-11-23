package com.google.android.play.core.assetpacks;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
final class o implements s2 {
    private static final j.d.a.d.a.b.f f = new j.d.a.d.a.b.f("AssetPackServiceImpl");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Intent f1338g = new Intent("com.google.android.play.core.assetmoduleservice.BIND_ASSET_MODULE_SERVICE").setPackage(GoogleApiAvailabilityLight.GOOGLE_PLAY_STORE_PACKAGE);
    private final String a;
    private final o0 b;
    private j.d.a.d.a.b.p<j.d.a.d.a.b.o0> c;
    private j.d.a.d.a.b.p<j.d.a.d.a.b.o0> d;
    private final AtomicBoolean e = new AtomicBoolean();

    o(Context context, o0 o0Var) {
        this.a = context.getPackageName();
        this.b = o0Var;
        if (j.d.a.d.a.b.t.a(context)) {
            Context contextB = j.d.a.d.a.d.a.b(context);
            j.d.a.d.a.b.f fVar = f;
            Intent intent = f1338g;
            this.c = new j.d.a.d.a.b.p<>(contextB, fVar, "AssetPackService", intent, t2.c);
            this.d = new j.d.a.d.a.b.p<>(j.d.a.d.a.d.a.b(context), fVar, "AssetPackService-keepAlive", intent, t2.b);
        }
        f.a("AssetPackService initiated.", new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Bundle h(int i2, String str) {
        Bundle bundleI = i(i2);
        bundleI.putString("module_name", str);
        return bundleI;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Bundle i(int i2) {
        Bundle bundle = new Bundle();
        bundle.putInt("session_id", i2);
        return bundle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Bundle j() {
        Bundle bundle = new Bundle();
        bundle.putInt("playcore_version_code", 10901);
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(0);
        arrayList.add(1);
        bundle.putIntegerArrayList("supported_compression_formats", arrayList);
        bundle.putIntegerArrayList("supported_patch_formats", new ArrayList<>());
        return bundle;
    }

    static /* synthetic */ ArrayList k(Collection collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            Bundle bundle = new Bundle();
            bundle.putString("module_name", str);
            arrayList.add(bundle);
        }
        return arrayList;
    }

    static /* synthetic */ Bundle m(Map map) {
        Bundle bundleJ = j();
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        for (Map.Entry entry : map.entrySet()) {
            Bundle bundle = new Bundle();
            bundle.putString("installed_asset_module_name", (String) entry.getKey());
            bundle.putLong("installed_asset_module_version", ((Long) entry.getValue()).longValue());
            arrayList.add(bundle);
        }
        bundleJ.putParcelableArrayList("installed_asset_module", arrayList);
        return bundleJ;
    }

    static /* synthetic */ Bundle q(int i2, String str, String str2, int i3) {
        Bundle bundleH = h(i2, str);
        bundleH.putString("slice_id", str2);
        bundleH.putInt("chunk_number", i3);
        return bundleH;
    }

    static /* synthetic */ List u(o oVar, List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AssetPackState next = c.b((Bundle) it.next(), oVar.b).e().values().iterator().next();
            if (next == null) {
                f.b("onGetSessionStates: Bundle contained no pack.", new Object[0]);
            }
            if (j1.d(next.g())) {
                arrayList.add(next.f());
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void x(int i2, String str, int i3) {
        if (this.c == null) {
            throw new k0("The Play Store app is not installed or is an unofficial version.", i2);
        }
        f.d("notifyModuleCompleted", new Object[0]);
        j.d.a.d.a.f.p pVar = new j.d.a.d.a.f.p();
        this.c.a(new f(this, pVar, i2, str, pVar, i3));
    }

    private static <T> j.d.a.d.a.f.e<T> y() {
        f.b("onError(%d)", -11);
        return j.d.a.d.a.f.g.c(new a(-11));
    }

    @Override // com.google.android.play.core.assetpacks.s2
    public final void a(int i2, String str) {
        x(i2, str, 10);
    }

    @Override // com.google.android.play.core.assetpacks.s2
    public final j.d.a.d.a.f.e<ParcelFileDescriptor> b(int i2, String str, String str2, int i3) {
        if (this.c == null) {
            return y();
        }
        f.d("getChunkFileDescriptor(%s, %s, %d, session=%d)", str, str2, Integer.valueOf(i3), Integer.valueOf(i2));
        j.d.a.d.a.f.p pVar = new j.d.a.d.a.f.p();
        this.c.a(new h(this, pVar, i2, str, str2, i3, pVar));
        return pVar.c();
    }

    @Override // com.google.android.play.core.assetpacks.s2
    public final synchronized void c() {
        if (this.d == null) {
            f.e("Keep alive connection manager is not initialized.", new Object[0]);
            return;
        }
        j.d.a.d.a.b.f fVar = f;
        fVar.d("keepAlive", new Object[0]);
        if (!this.e.compareAndSet(false, true)) {
            fVar.d("Service is already kept alive.", new Object[0]);
        } else {
            j.d.a.d.a.f.p pVar = new j.d.a.d.a.f.p();
            this.d.a(new i(this, pVar, pVar));
        }
    }

    @Override // com.google.android.play.core.assetpacks.s2
    public final void d(int i2) {
        if (this.c == null) {
            throw new k0("The Play Store app is not installed or is an unofficial version.", i2);
        }
        f.d("notifySessionFailed", new Object[0]);
        j.d.a.d.a.f.p pVar = new j.d.a.d.a.f.p();
        this.c.a(new g(this, pVar, i2, pVar));
    }

    @Override // com.google.android.play.core.assetpacks.s2
    public final j.d.a.d.a.f.e<List<String>> e(Map<String, Long> map) {
        if (this.c == null) {
            return y();
        }
        f.d("syncPacks", new Object[0]);
        j.d.a.d.a.f.p pVar = new j.d.a.d.a.f.p();
        this.c.a(new v2(this, pVar, map, pVar));
        return pVar.c();
    }

    @Override // com.google.android.play.core.assetpacks.s2
    public final void f(List<String> list) {
        if (this.c == null) {
            return;
        }
        f.d("cancelDownloads(%s)", list);
        j.d.a.d.a.f.p pVar = new j.d.a.d.a.f.p();
        this.c.a(new u2(this, pVar, list, pVar));
    }

    @Override // com.google.android.play.core.assetpacks.s2
    public final void g(int i2, String str, String str2, int i3) {
        if (this.c == null) {
            throw new k0("The Play Store app is not installed or is an unofficial version.", i2);
        }
        f.d("notifyChunkTransferred", new Object[0]);
        j.d.a.d.a.f.p pVar = new j.d.a.d.a.f.p();
        this.c.a(new e(this, pVar, i2, str, str2, i3, pVar));
    }
}
