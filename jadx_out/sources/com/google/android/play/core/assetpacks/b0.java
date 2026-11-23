package com.google.android.play.core.assetpacks;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
final class b0 extends j.d.a.d.a.b.r0 {
    private final j.d.a.d.a.b.f a = new j.d.a.d.a.b.f("AssetPackExtractionService");
    private final Context b;
    private final v c;

    b0(Context context, v vVar) {
        this.b = context;
        this.c = vVar;
    }

    private final synchronized void i0(Bundle bundle) {
        ComponentName componentNameStartForegroundService;
        Intent intent = new Intent(this.b, (Class<?>) ExtractionForegroundService.class);
        int i2 = bundle.getInt("action_type");
        intent.putExtra("action_type", i2);
        if (i2 == 1) {
            intent.putExtra("notification_channel_name", bundle.getString("notification_channel_name"));
            intent.putExtra("notification_title", bundle.getString("notification_title"));
            intent.putExtra("notification_subtext", bundle.getString("notification_subtext"));
            intent.putExtra("notification_timeout", bundle.getLong("notification_timeout"));
            Parcelable parcelable = bundle.getParcelable("notification_on_click_intent");
            if (parcelable instanceof PendingIntent) {
                intent.putExtra("notification_on_click_intent", parcelable);
            }
            intent.putExtra("notification_color", bundle.getInt("notification_color"));
        }
        try {
            componentNameStartForegroundService = Build.VERSION.SDK_INT >= 26 ? this.b.startForegroundService(intent) : this.b.startService(intent);
        } catch (IllegalStateException | SecurityException e) {
            this.a.c(e, "Failed starting installation service.", new Object[0]);
            componentNameStartForegroundService = null;
        }
        if (componentNameStartForegroundService == null) {
            this.a.b("Failed starting installation service.", new Object[0]);
        }
    }

    @Override // j.d.a.d.a.b.s0
    public final void R0(Bundle bundle, j.d.a.d.a.b.u0 u0Var) {
        this.a.a("updateServiceState AIDL call", new Object[0]);
        if (!j.d.a.d.a.b.t.a(this.b) || !j.d.a.d.a.b.t.b(this.b)) {
            u0Var.i0(new Bundle());
        } else {
            i0(bundle);
            u0Var.C(new Bundle(), new Bundle());
        }
    }

    @Override // j.d.a.d.a.b.s0
    public final void w(j.d.a.d.a.b.u0 u0Var) {
        this.a.a("clearAssetPackStorage AIDL call", new Object[0]);
        if (!j.d.a.d.a.b.t.a(this.b) || !j.d.a.d.a.b.t.b(this.b)) {
            u0Var.i0(new Bundle());
        } else {
            this.c.K();
            u0Var.I(new Bundle());
        }
    }
}
