package com.google.firebase.crashlytics;

import com.google.firebase.FirebaseApp;
import com.google.firebase.components.n;
import com.google.firebase.components.o;
import com.google.firebase.components.q;
import com.google.firebase.components.r;
import com.google.firebase.components.t;
import com.google.firebase.crashlytics.internal.CrashlyticsNativeComponent;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.platforminfo.g;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class CrashlyticsRegistrar implements r {
    /* JADX INFO: Access modifiers changed from: private */
    public FirebaseCrashlytics a(o oVar) {
        return FirebaseCrashlytics.init((FirebaseApp) oVar.a(FirebaseApp.class), (FirebaseInstallationsApi) oVar.a(FirebaseInstallationsApi.class), oVar.c(CrashlyticsNativeComponent.class), oVar.e(com.google.firebase.analytics.a.a.class));
    }

    @Override // com.google.firebase.components.r
    public List<n<?>> getComponents() {
        n.b bVarA = n.a(FirebaseCrashlytics.class);
        bVarA.b(t.j(FirebaseApp.class));
        bVarA.b(t.j(FirebaseInstallationsApi.class));
        bVarA.b(t.i(CrashlyticsNativeComponent.class));
        bVarA.b(t.a(com.google.firebase.analytics.a.a.class));
        bVarA.f(new q() { // from class: com.google.firebase.crashlytics.d
            @Override // com.google.firebase.components.q
            public final Object a(o oVar) {
                return this.a.a(oVar);
            }
        });
        bVarA.e();
        return Arrays.asList(bVarA.d(), g.a("fire-cls", "18.0.1"));
    }
}
