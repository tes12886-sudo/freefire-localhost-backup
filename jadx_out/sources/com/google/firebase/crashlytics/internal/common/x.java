package com.google.firebase.crashlytics.internal.common;

import android.content.Context;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.firebase.crashlytics.internal.settings.SettingsDataProvider;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public class x {
    private final l a;
    private final com.google.firebase.crashlytics.internal.g.g b;
    private final com.google.firebase.crashlytics.internal.h.c c;
    private final com.google.firebase.crashlytics.internal.d.b d;
    private final z e;

    x(l lVar, com.google.firebase.crashlytics.internal.g.g gVar, com.google.firebase.crashlytics.internal.h.c cVar, com.google.firebase.crashlytics.internal.d.b bVar, z zVar) {
        this.a = lVar;
        this.b = gVar;
        this.c = cVar;
        this.d = bVar;
        this.e = zVar;
    }

    public static x a(Context context, IdManager idManager, com.google.firebase.crashlytics.internal.g.h hVar, AppData appData, com.google.firebase.crashlytics.internal.d.b bVar, z zVar, com.google.firebase.crashlytics.internal.i.d dVar, SettingsDataProvider settingsDataProvider) {
        return new x(new l(context, idManager, appData, dVar), new com.google.firebase.crashlytics.internal.g.g(new File(hVar.a()), settingsDataProvider), com.google.firebase.crashlytics.internal.h.c.a(context), bVar, zVar);
    }

    private static List<com.google.firebase.crashlytics.internal.e.v.b> d(Map<String, String> map) {
        ArrayList arrayList = new ArrayList();
        arrayList.ensureCapacity(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            com.google.firebase.crashlytics.internal.e.v.b.a aVarA = com.google.firebase.crashlytics.internal.e.v.b.a();
            aVarA.b(entry.getKey());
            aVarA.c(entry.getValue());
            arrayList.add(aVarA.a());
        }
        Collections.sort(arrayList, new Comparator() { // from class: com.google.firebase.crashlytics.internal.common.d
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ((com.google.firebase.crashlytics.internal.e.v.b) obj).b().compareTo(((com.google.firebase.crashlytics.internal.e.v.b) obj2).b());
            }
        });
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean j(Task<m> task) {
        if (!task.isSuccessful()) {
            com.google.firebase.crashlytics.internal.a.f().l("Crashlytics report could not be enqueued to DataTransport", task.getException());
            return false;
        }
        m result = task.getResult();
        com.google.firebase.crashlytics.internal.a.f().b("Crashlytics report successfully enqueued to DataTransport: " + result.c());
        this.b.f(result.c());
        return true;
    }

    private void k(Throwable th, Thread thread, String str, String str2, long j2, boolean z) {
        boolean zEquals = str2.equals("crash");
        com.google.firebase.crashlytics.internal.e.v.d.AbstractC0137d abstractC0137dB = this.a.b(th, thread, str2, j2, 4, 8, z);
        com.google.firebase.crashlytics.internal.e.v.d.AbstractC0137d.b bVarG = abstractC0137dB.g();
        String strC = this.d.c();
        if (strC != null) {
            com.google.firebase.crashlytics.internal.e.v.d.AbstractC0137d.AbstractC0148d.a aVarA = com.google.firebase.crashlytics.internal.e.v.d.AbstractC0137d.AbstractC0148d.a();
            aVarA.b(strC);
            bVarG.d(aVarA.a());
        } else {
            com.google.firebase.crashlytics.internal.a.f().i("No log data to include with this event.");
        }
        List<com.google.firebase.crashlytics.internal.e.v.b> listD = d(this.e.c());
        if (!listD.isEmpty()) {
            com.google.firebase.crashlytics.internal.e.v.d.AbstractC0137d.a.AbstractC0138a abstractC0138aF = abstractC0137dB.b().f();
            abstractC0138aF.c(com.google.firebase.crashlytics.internal.e.w.b(listD));
            bVarG.b(abstractC0138aF.a());
        }
        this.b.C(bVarG.a(), str, zEquals);
    }

    public void b(String str, List<v> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<v> it = list.iterator();
        while (it.hasNext()) {
            com.google.firebase.crashlytics.internal.e.v.c.b bVarC = it.next().c();
            if (bVarC != null) {
                arrayList.add(bVarC);
            }
        }
        com.google.firebase.crashlytics.internal.g.g gVar = this.b;
        com.google.firebase.crashlytics.internal.e.v.c.a aVarA = com.google.firebase.crashlytics.internal.e.v.c.a();
        aVarA.b(com.google.firebase.crashlytics.internal.e.w.b(arrayList));
        gVar.h(str, aVarA.a());
    }

    public void c(long j2, String str) {
        this.b.g(str, j2);
    }

    public boolean e() {
        return this.b.p();
    }

    public List<String> h() {
        return this.b.y();
    }

    public void i(String str, long j2) {
        this.b.D(this.a.c(str, j2));
    }

    public void l(Throwable th, Thread thread, String str, long j2) {
        com.google.firebase.crashlytics.internal.a.f().i("Persisting fatal event for session " + str);
        k(th, thread, str, "crash", j2, true);
    }

    public void m(Throwable th, Thread thread, String str, long j2) {
        com.google.firebase.crashlytics.internal.a.f().i("Persisting non-fatal event for session " + str);
        k(th, thread, str, "error", j2, false);
    }

    public void n(String str) {
        String strD = this.e.d();
        if (strD == null) {
            com.google.firebase.crashlytics.internal.a.f().i("Could not persist user ID; no user ID available");
        } else {
            this.b.E(strD, str);
        }
    }

    public void o() {
        this.b.e();
    }

    public Task<Void> p(Executor executor) {
        List<m> listZ = this.b.z();
        ArrayList arrayList = new ArrayList();
        Iterator<m> it = listZ.iterator();
        while (it.hasNext()) {
            arrayList.add(this.c.e(it.next()).continueWith(executor, new Continuation() { // from class: com.google.firebase.crashlytics.internal.common.c
                @Override // com.google.android.gms.tasks.Continuation
                public final Object a(Task task) {
                    return Boolean.valueOf(this.a.j(task));
                }
            }));
        }
        return com.google.android.gms.tasks.d.f(arrayList);
    }
}
