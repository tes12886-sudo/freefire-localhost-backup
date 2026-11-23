package com.google.firebase.crashlytics.internal.settings;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.crashlytics.internal.common.DataCollectionArbiter;
import com.google.firebase.crashlytics.internal.common.IdManager;
import com.google.firebase.crashlytics.internal.common.k;
import com.google.firebase.crashlytics.internal.common.o;
import com.google.firebase.crashlytics.internal.common.p;
import com.google.firebase.crashlytics.internal.common.y;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class d implements SettingsDataProvider {
    private final Context a;
    private final com.google.firebase.crashlytics.internal.settings.h.f b;
    private final e c;
    private final o d;
    private final com.google.firebase.crashlytics.internal.settings.a e;
    private final com.google.firebase.crashlytics.internal.settings.i.b f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final DataCollectionArbiter f1429g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final AtomicReference<com.google.firebase.crashlytics.internal.settings.h.d> f1430h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final AtomicReference<TaskCompletionSource<com.google.firebase.crashlytics.internal.settings.h.a>> f1431i;

    class a implements SuccessContinuation<Void, Void> {
        a() {
        }

        @Override // com.google.android.gms.tasks.SuccessContinuation
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Task<Void> a(Void r5) throws Throwable {
            JSONObject jSONObjectA = d.this.f.a(d.this.b, true);
            if (jSONObjectA != null) {
                com.google.firebase.crashlytics.internal.settings.h.e eVarB = d.this.c.b(jSONObjectA);
                d.this.e.c(eVarB.d(), jSONObjectA);
                d.this.q(jSONObjectA, "Loaded settings: ");
                d dVar = d.this;
                dVar.r(dVar.b.f);
                d.this.f1430h.set(eVarB);
                ((TaskCompletionSource) d.this.f1431i.get()).e(eVarB.c());
                TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
                taskCompletionSource.e(eVarB.c());
                d.this.f1431i.set(taskCompletionSource);
            }
            return com.google.android.gms.tasks.d.e(null);
        }
    }

    d(Context context, com.google.firebase.crashlytics.internal.settings.h.f fVar, o oVar, e eVar, com.google.firebase.crashlytics.internal.settings.a aVar, com.google.firebase.crashlytics.internal.settings.i.b bVar, DataCollectionArbiter dataCollectionArbiter) {
        AtomicReference<com.google.firebase.crashlytics.internal.settings.h.d> atomicReference = new AtomicReference<>();
        this.f1430h = atomicReference;
        this.f1431i = new AtomicReference<>(new TaskCompletionSource());
        this.a = context;
        this.b = fVar;
        this.d = oVar;
        this.c = eVar;
        this.e = aVar;
        this.f = bVar;
        this.f1429g = dataCollectionArbiter;
        atomicReference.set(b.e(oVar));
    }

    public static d l(Context context, String str, IdManager idManager, com.google.firebase.crashlytics.internal.f.b bVar, String str2, String str3, DataCollectionArbiter dataCollectionArbiter) {
        String strG = idManager.g();
        y yVar = new y();
        return new d(context, new com.google.firebase.crashlytics.internal.settings.h.f(str, idManager.h(), idManager.i(), idManager.j(), idManager, k.h(k.n(context), str, str3, str2), str3, str2, p.a(strG).c()), yVar, new e(yVar), new com.google.firebase.crashlytics.internal.settings.a(context), new com.google.firebase.crashlytics.internal.settings.i.a(String.format(Locale.US, "https://firebase-settings.crashlytics.com/spi/v2/platforms/android/gmp/%s/settings", str), bVar), dataCollectionArbiter);
    }

    private com.google.firebase.crashlytics.internal.settings.h.e m(c cVar) throws Throwable {
        com.google.firebase.crashlytics.internal.settings.h.e eVar = null;
        try {
            if (!c.SKIP_CACHE_LOOKUP.equals(cVar)) {
                JSONObject jSONObjectB = this.e.b();
                if (jSONObjectB != null) {
                    com.google.firebase.crashlytics.internal.settings.h.e eVarB = this.c.b(jSONObjectB);
                    if (eVarB != null) {
                        q(jSONObjectB, "Loaded cached settings: ");
                        long jA = this.d.a();
                        if (c.IGNORE_CACHE_EXPIRATION.equals(cVar) || !eVarB.e(jA)) {
                            try {
                                com.google.firebase.crashlytics.internal.a.f().i("Returning cached settings.");
                                eVar = eVarB;
                            } catch (Exception e) {
                                e = e;
                                eVar = eVarB;
                                com.google.firebase.crashlytics.internal.a.f().e("Failed to get cached settings", e);
                            }
                        } else {
                            com.google.firebase.crashlytics.internal.a.f().i("Cached settings have expired.");
                        }
                    } else {
                        com.google.firebase.crashlytics.internal.a.f().e("Failed to parse cached settings data.", null);
                    }
                } else {
                    com.google.firebase.crashlytics.internal.a.f().b("No cached settings data found.");
                }
            }
        } catch (Exception e2) {
            e = e2;
        }
        return eVar;
    }

    private String n() {
        return k.r(this.a).getString("existing_instance_identifier", "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q(JSONObject jSONObject, String str) {
        com.google.firebase.crashlytics.internal.a.f().b(str + jSONObject.toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"CommitPrefEdits"})
    public boolean r(String str) {
        SharedPreferences.Editor editorEdit = k.r(this.a).edit();
        editorEdit.putString("existing_instance_identifier", str);
        editorEdit.apply();
        return true;
    }

    @Override // com.google.firebase.crashlytics.internal.settings.SettingsDataProvider
    public Task<com.google.firebase.crashlytics.internal.settings.h.a> a() {
        return this.f1431i.get().a();
    }

    @Override // com.google.firebase.crashlytics.internal.settings.SettingsDataProvider
    public com.google.firebase.crashlytics.internal.settings.h.d b() {
        return this.f1430h.get();
    }

    boolean k() {
        return !n().equals(this.b.f);
    }

    public Task<Void> o(c cVar, Executor executor) throws Throwable {
        com.google.firebase.crashlytics.internal.settings.h.e eVarM;
        if (!k() && (eVarM = m(cVar)) != null) {
            this.f1430h.set(eVarM);
            this.f1431i.get().e(eVarM.c());
            return com.google.android.gms.tasks.d.e(null);
        }
        com.google.firebase.crashlytics.internal.settings.h.e eVarM2 = m(c.IGNORE_CACHE_EXPIRATION);
        if (eVarM2 != null) {
            this.f1430h.set(eVarM2);
            this.f1431i.get().e(eVarM2.c());
        }
        return this.f1429g.waitForDataCollectionPermission().onSuccessTask(executor, new a());
    }

    public Task<Void> p(Executor executor) {
        return o(c.USE_CACHE, executor);
    }
}
