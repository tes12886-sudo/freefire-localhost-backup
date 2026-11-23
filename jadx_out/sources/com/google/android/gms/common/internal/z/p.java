package com.google.android.gms.common.internal.z;

import android.content.Context;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.internal.r;
import com.google.android.gms.common.internal.u;
import com.google.android.gms.common.internal.w;
import com.google.android.gms.common.internal.x;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes.dex */
public final class p extends GoogleApi implements w {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final com.google.android.gms.common.api.a.g f1037k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final com.google.android.gms.common.api.a.AbstractC0120a f1038l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final com.google.android.gms.common.api.a f1039m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ int f1040n = 0;

    static {
        com.google.android.gms.common.api.a.g gVar = new com.google.android.gms.common.api.a.g();
        f1037k = gVar;
        o oVar = new o();
        f1038l = oVar;
        f1039m = new com.google.android.gms.common.api.a("ClientTelemetry.API", oVar, gVar);
    }

    public p(Context context, x xVar) {
        super(context, (com.google.android.gms.common.api.a<x>) f1039m, xVar, GoogleApi.a.c);
    }

    @Override // com.google.android.gms.common.internal.w
    public final Task<Void> a(final u uVar) {
        r.a aVarA = r.a();
        aVarA.d(j.d.a.c.f.d.f.a);
        aVarA.c(false);
        aVarA.b(new com.google.android.gms.common.api.internal.n() { // from class: com.google.android.gms.common.internal.z.n
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.n
            public final void a(Object obj, Object obj2) {
                u uVar2 = uVar;
                int i2 = p.f1040n;
                ((j) ((q) obj).I()).c1(uVar2);
                ((TaskCompletionSource) obj2).c(null);
            }
        });
        return e(aVarA.a());
    }
}
