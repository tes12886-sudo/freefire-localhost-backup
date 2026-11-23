package com.google.android.play.core.assetpacks;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
final class s extends j.d.a.d.a.c.c<AssetPackState> {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final a1 f1339g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final l0 f1340h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final j.d.a.d.a.b.e0<s2> f1341i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final e0 f1342j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final o0 f1343k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final j.d.a.d.a.b.e0<Executor> f1344l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final j.d.a.d.a.b.e0<Executor> f1345m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Handler f1346n;

    s(Context context, a1 a1Var, l0 l0Var, j.d.a.d.a.b.e0<s2> e0Var, o0 o0Var, e0 e0Var2, j.d.a.d.a.b.e0<Executor> e0Var3, j.d.a.d.a.b.e0<Executor> e0Var4) {
        super(new j.d.a.d.a.b.f("AssetPackServiceListenerRegistry"), new IntentFilter("com.google.android.play.core.assetpacks.receiver.ACTION_SESSION_UPDATE"), context);
        this.f1346n = new Handler(Looper.getMainLooper());
        this.f1339g = a1Var;
        this.f1340h = l0Var;
        this.f1341i = e0Var;
        this.f1343k = o0Var;
        this.f1342j = e0Var2;
        this.f1344l = e0Var3;
        this.f1345m = e0Var4;
    }

    @Override // j.d.a.d.a.c.c
    protected final void a(Context context, Intent intent) {
        final Bundle bundleExtra = intent.getBundleExtra("com.google.android.play.core.assetpacks.receiver.EXTRA_SESSION_STATE");
        if (bundleExtra == null) {
            this.a.b("Empty bundle received from broadcast.", new Object[0]);
            return;
        }
        ArrayList<String> stringArrayList = bundleExtra.getStringArrayList("pack_names");
        if (stringArrayList == null || stringArrayList.size() != 1) {
            this.a.b("Corrupt bundle received from broadcast.", new Object[0]);
            return;
        }
        final AssetPackState assetPackStateD = AssetPackState.d(bundleExtra, stringArrayList.get(0), this.f1343k, u.c);
        this.a.a("ListenerRegistryBroadcastReceiver.onReceive: %s", assetPackStateD);
        PendingIntent pendingIntent = (PendingIntent) bundleExtra.getParcelable("confirmation_intent");
        if (pendingIntent != null) {
            this.f1342j.a(pendingIntent);
        }
        this.f1345m.a().execute(new Runnable(this, bundleExtra, assetPackStateD) { // from class: com.google.android.play.core.assetpacks.q
            private final s a;
            private final Bundle b;
            private final AssetPackState c;

            {
                this.a = this;
                this.b = bundleExtra;
                this.c = assetPackStateD;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.h(this.b, this.c);
            }
        });
        this.f1344l.a().execute(new Runnable(this, bundleExtra) { // from class: com.google.android.play.core.assetpacks.r
            private final s a;
            private final Bundle b;

            {
                this.a = this;
                this.b = bundleExtra;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.g(this.b);
            }
        });
    }

    final void f(final AssetPackState assetPackState) {
        this.f1346n.post(new Runnable(this, assetPackState) { // from class: com.google.android.play.core.assetpacks.p
            private final s a;
            private final AssetPackState b;

            {
                this.a = this;
                this.b = assetPackState;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.d(this.b);
            }
        });
    }

    final /* synthetic */ void g(Bundle bundle) {
        if (this.f1339g.d(bundle)) {
            this.f1340h.a();
        }
    }

    final /* synthetic */ void h(Bundle bundle, AssetPackState assetPackState) {
        if (this.f1339g.e(bundle)) {
            f(assetPackState);
            this.f1341i.a().c();
        }
    }
}
