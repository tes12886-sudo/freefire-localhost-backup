package com.google.android.play.core.assetpacks;

import android.content.Intent;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes.dex */
final class a1 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final j.d.a.d.a.b.f f1306g = new j.d.a.d.a.b.f("ExtractorSessionStoreView");
    private final v a;
    private final j.d.a.d.a.b.e0<s2> b;
    private final o0 c;
    private final j.d.a.d.a.b.e0<Executor> d;
    private final Map<Integer, x0> e = new HashMap();
    private final ReentrantLock f = new ReentrantLock();

    a1(v vVar, j.d.a.d.a.b.e0<s2> e0Var, o0 o0Var, j.d.a.d.a.b.e0<Executor> e0Var2) {
        this.a = vVar;
        this.b = e0Var;
        this.c = o0Var;
        this.d = e0Var2;
    }

    private final Map<String, x0> p(final List<String> list) {
        final byte[] bArr = null;
        return (Map) q(new z0(this, list, bArr) { // from class: com.google.android.play.core.assetpacks.t0
            private final a1 a;
            private final List b;
            private final /* synthetic */ int c = 1;

            {
                this.a = this;
                this.b = list;
            }

            @Override // com.google.android.play.core.assetpacks.z0
            public final Object a() {
                return this.c != 0 ? this.a.i(this.b) : this.a.h(this.b);
            }
        });
    }

    private final <T> T q(z0<T> z0Var) {
        try {
            a();
            return z0Var.a();
        } finally {
            b();
        }
    }

    private final x0 r(int i2) {
        Map<Integer, x0> map = this.e;
        Integer numValueOf = Integer.valueOf(i2);
        x0 x0Var = map.get(numValueOf);
        if (x0Var != null) {
            return x0Var;
        }
        throw new k0(String.format("Could not find session %d while trying to get it", numValueOf), i2);
    }

    private static String s(Bundle bundle) {
        ArrayList<String> stringArrayList = bundle.getStringArrayList("pack_names");
        if (stringArrayList == null || stringArrayList.isEmpty()) {
            throw new k0("Session without pack received.");
        }
        return stringArrayList.get(0);
    }

    private static <T> List<T> t(List<T> list) {
        return list == null ? Collections.emptyList() : list;
    }

    final void a() {
        this.f.lock();
    }

    final void b() {
        this.f.unlock();
    }

    final Map<Integer, x0> c() {
        return this.e;
    }

    final boolean d(Bundle bundle) {
        return ((Boolean) q(new q0(this, bundle, null))).booleanValue();
    }

    final boolean e(Bundle bundle) {
        return ((Boolean) q(new q0(this, bundle))).booleanValue();
    }

    final void f(final String str, final int i2, final long j2) {
        q(new z0(this, str, i2, j2) { // from class: com.google.android.play.core.assetpacks.r0
            private final a1 a;
            private final String b;
            private final int c;
            private final long d;

            {
                this.a = this;
                this.b = str;
                this.c = i2;
                this.d = j2;
            }

            @Override // com.google.android.play.core.assetpacks.z0
            public final Object a() {
                this.a.l(this.b, this.c, this.d);
                return null;
            }
        });
    }

    final void g(int i2) {
        q(new s0(this, i2));
    }

    final /* synthetic */ Map h(List list) {
        int i2;
        Map<String, x0> mapP = p(list);
        HashMap map = new HashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            final x0 x0Var = mapP.get(str);
            if (x0Var == null) {
                i2 = 8;
            } else {
                if (j1.d(x0Var.c.c)) {
                    try {
                        x0Var.c.c = 6;
                        this.d.a().execute(new Runnable(this, x0Var) { // from class: com.google.android.play.core.assetpacks.u0
                            private final a1 a;
                            private final x0 b;

                            {
                                this.a = this;
                                this.b = x0Var;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                this.a.g(this.b.a);
                            }
                        });
                        this.c.a(str);
                    } catch (k0 unused) {
                        f1306g.d("Session %d with pack %s does not exist, no need to cancel.", Integer.valueOf(x0Var.a), str);
                    }
                }
                i2 = x0Var.c.c;
            }
            map.put(str, Integer.valueOf(i2));
        }
        return map;
    }

    final /* synthetic */ Map i(List list) {
        HashMap map = new HashMap();
        for (x0 x0Var : this.e.values()) {
            String str = x0Var.c.a;
            if (list.contains(str)) {
                x0 x0Var2 = (x0) map.get(str);
                if ((x0Var2 == null ? -1 : x0Var2.a) < x0Var.a) {
                    map.put(str, x0Var);
                }
            }
        }
        return map;
    }

    final /* synthetic */ Boolean j(Bundle bundle) {
        Boolean bool = Boolean.TRUE;
        int i2 = bundle.getInt("session_id");
        if (i2 == 0) {
            return bool;
        }
        Map<Integer, x0> map = this.e;
        Integer numValueOf = Integer.valueOf(i2);
        if (!map.containsKey(numValueOf)) {
            return bool;
        }
        x0 x0Var = this.e.get(numValueOf);
        if (x0Var.c.c == 6) {
            return Boolean.FALSE;
        }
        return Boolean.valueOf(!j1.g(x0Var.c.c, bundle.getInt(j.d.a.d.a.b.i0.a("status", s(bundle)))));
    }

    final /* synthetic */ Boolean k(Bundle bundle) {
        int i2 = bundle.getInt("session_id");
        if (i2 == 0) {
            return Boolean.FALSE;
        }
        Map<Integer, x0> map = this.e;
        Integer numValueOf = Integer.valueOf(i2);
        boolean z = true;
        if (map.containsKey(numValueOf)) {
            x0 x0VarR = r(i2);
            int i3 = bundle.getInt(j.d.a.d.a.b.i0.a("status", x0VarR.c.a));
            if (j1.g(x0VarR.c.c, i3)) {
                f1306g.a("Found stale update for session %s with status %d.", numValueOf, Integer.valueOf(x0VarR.c.c));
                w0 w0Var = x0VarR.c;
                String str = w0Var.a;
                int i4 = w0Var.c;
                if (i4 == 4) {
                    this.b.a().a(i2, str);
                } else if (i4 == 5) {
                    this.b.a().d(i2);
                } else if (i4 == 6) {
                    this.b.a().f(Arrays.asList(str));
                }
            } else {
                x0VarR.c.c = i3;
                if (j1.e(i3)) {
                    g(i2);
                    this.c.a(x0VarR.c.a);
                } else {
                    for (y0 y0Var : x0VarR.c.e) {
                        ArrayList parcelableArrayList = bundle.getParcelableArrayList(j.d.a.d.a.b.i0.b("chunk_intents", x0VarR.c.a, y0Var.a));
                        if (parcelableArrayList != null) {
                            for (int i5 = 0; i5 < parcelableArrayList.size(); i5++) {
                                if (parcelableArrayList.get(i5) != null && ((Intent) parcelableArrayList.get(i5)).getData() != null) {
                                    y0Var.d.get(i5).a = true;
                                }
                            }
                        }
                    }
                }
            }
        } else {
            String strS = s(bundle);
            long j2 = bundle.getLong(j.d.a.d.a.b.i0.a("pack_version", strS));
            int i6 = bundle.getInt(j.d.a.d.a.b.i0.a("status", strS));
            long j3 = bundle.getLong(j.d.a.d.a.b.i0.a("total_bytes_to_download", strS));
            ArrayList<String> stringArrayList = bundle.getStringArrayList(j.d.a.d.a.b.i0.a("slice_ids", strS));
            ArrayList arrayList = new ArrayList();
            for (String str2 : t(stringArrayList)) {
                ArrayList parcelableArrayList2 = bundle.getParcelableArrayList(j.d.a.d.a.b.i0.b("chunk_intents", strS, str2));
                ArrayList arrayList2 = new ArrayList();
                Iterator it = t(parcelableArrayList2).iterator();
                while (it.hasNext()) {
                    if (((Intent) it.next()) == null) {
                        z = false;
                    }
                    arrayList2.add(new v0(z));
                    z = true;
                }
                String string = bundle.getString(j.d.a.d.a.b.i0.b("uncompressed_hash_sha256", strS, str2));
                long j4 = bundle.getLong(j.d.a.d.a.b.i0.b("uncompressed_size", strS, str2));
                int i7 = bundle.getInt(j.d.a.d.a.b.i0.b("patch_format", strS, str2), 0);
                arrayList.add(i7 != 0 ? new y0(str2, string, j4, arrayList2, 0, i7) : new y0(str2, string, j4, arrayList2, bundle.getInt(j.d.a.d.a.b.i0.b("compression_format", strS, str2), 0), 0));
                z = true;
            }
            this.e.put(Integer.valueOf(i2), new x0(i2, bundle.getInt("app_version_code"), new w0(strS, j2, i6, j3, arrayList)));
        }
        return Boolean.TRUE;
    }

    final /* synthetic */ void l(String str, int i2, long j2) {
        x0 x0Var = p(Arrays.asList(str)).get(str);
        if (x0Var == null || j1.e(x0Var.c.c)) {
            f1306g.b(String.format("Could not find pack %s while trying to complete it", str), new Object[0]);
        }
        this.a.b(str, i2, j2);
        x0Var.c.c = 4;
    }

    final /* synthetic */ void m(int i2) {
        r(i2).c.c = 5;
    }

    final /* synthetic */ void n(int i2) {
        x0 x0VarR = r(i2);
        if (!j1.e(x0VarR.c.c)) {
            throw new k0(String.format("Could not safely delete session %d because it is not in a terminal state.", Integer.valueOf(i2)), i2);
        }
        v vVar = this.a;
        w0 w0Var = x0VarR.c;
        vVar.b(w0Var.a, x0VarR.b, w0Var.b);
        w0 w0Var2 = x0VarR.c;
        int i3 = w0Var2.c;
        if (i3 == 5 || i3 == 6) {
            this.a.c(w0Var2.a, x0VarR.b, w0Var2.b);
        }
    }

    final void o(int i2) {
        q(new s0(this, i2, null));
    }
}
