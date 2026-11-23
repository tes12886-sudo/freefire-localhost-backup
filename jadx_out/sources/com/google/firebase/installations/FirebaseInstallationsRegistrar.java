package com.google.firebase.installations;

import androidx.annotation.Keep;
import com.google.firebase.FirebaseApp;
import com.google.firebase.components.o;
import com.google.firebase.components.q;
import com.google.firebase.components.r;
import com.google.firebase.components.t;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@Keep
public class FirebaseInstallationsRegistrar implements r {
    static /* synthetic */ FirebaseInstallationsApi a(o oVar) {
        return new g((FirebaseApp) oVar.a(FirebaseApp.class), oVar.c(com.google.firebase.platforminfo.h.class), oVar.c(com.google.firebase.j.f.class));
    }

    @Override // com.google.firebase.components.r
    public List<com.google.firebase.components.n<?>> getComponents() {
        com.google.firebase.components.n.b bVarA = com.google.firebase.components.n.a(FirebaseInstallationsApi.class);
        bVarA.b(t.j(FirebaseApp.class));
        bVarA.b(t.i(com.google.firebase.j.f.class));
        bVarA.b(t.i(com.google.firebase.platforminfo.h.class));
        bVarA.f(new q() { // from class: com.google.firebase.installations.d
            @Override // com.google.firebase.components.q
            public final Object a(o oVar) {
                return FirebaseInstallationsRegistrar.a(oVar);
            }
        });
        return Arrays.asList(bVarA.d(), com.google.firebase.platforminfo.g.a("fire-installations", "17.0.0"));
    }
}
