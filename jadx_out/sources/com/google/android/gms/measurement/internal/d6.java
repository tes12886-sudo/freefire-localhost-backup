package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public final class d6 {
    final Context a;
    String b;
    String c;
    String d;
    Boolean e;
    long f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    com.google.android.gms.internal.measurement.o1 f1179g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    boolean f1180h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final Long f1181i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    String f1182j;

    public d6(Context context, com.google.android.gms.internal.measurement.o1 o1Var, Long l2) {
        this.f1180h = true;
        com.google.android.gms.common.internal.q.k(context);
        Context applicationContext = context.getApplicationContext();
        com.google.android.gms.common.internal.q.k(applicationContext);
        this.a = applicationContext;
        this.f1181i = l2;
        if (o1Var != null) {
            this.f1179g = o1Var;
            this.b = o1Var.f;
            this.c = o1Var.e;
            this.d = o1Var.d;
            this.f1180h = o1Var.c;
            this.f = o1Var.b;
            this.f1182j = o1Var.f1099h;
            Bundle bundle = o1Var.f1098g;
            if (bundle != null) {
                this.e = Boolean.valueOf(bundle.getBoolean("dataCollectionDefaultEnabled", true));
            }
        }
    }
}
