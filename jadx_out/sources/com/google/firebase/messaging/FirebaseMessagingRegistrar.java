package com.google.firebase.messaging;

import androidx.annotation.Keep;
import com.google.android.datatransport.TransportFactory;
import com.google.firebase.FirebaseApp;
import com.google.firebase.events.Subscriber;
import com.google.firebase.iid.internal.FirebaseInstanceIdInternal;
import com.google.firebase.installations.FirebaseInstallationsApi;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@Keep
public class FirebaseMessagingRegistrar implements com.google.firebase.components.r {
    static final /* synthetic */ FirebaseMessaging lambda$getComponents$0$FirebaseMessagingRegistrar(com.google.firebase.components.o oVar) {
        return new FirebaseMessaging((FirebaseApp) oVar.a(FirebaseApp.class), (FirebaseInstanceIdInternal) oVar.a(FirebaseInstanceIdInternal.class), oVar.c(com.google.firebase.platforminfo.h.class), oVar.c(com.google.firebase.j.f.class), (FirebaseInstallationsApi) oVar.a(FirebaseInstallationsApi.class), (TransportFactory) oVar.a(TransportFactory.class), (Subscriber) oVar.a(Subscriber.class));
    }

    @Override // com.google.firebase.components.r
    @Keep
    public List<com.google.firebase.components.n<?>> getComponents() {
        com.google.firebase.components.n.b bVarA = com.google.firebase.components.n.a(FirebaseMessaging.class);
        bVarA.b(com.google.firebase.components.t.j(FirebaseApp.class));
        bVarA.b(com.google.firebase.components.t.h(FirebaseInstanceIdInternal.class));
        bVarA.b(com.google.firebase.components.t.i(com.google.firebase.platforminfo.h.class));
        bVarA.b(com.google.firebase.components.t.i(com.google.firebase.j.f.class));
        bVarA.b(com.google.firebase.components.t.h(TransportFactory.class));
        bVarA.b(com.google.firebase.components.t.j(FirebaseInstallationsApi.class));
        bVarA.b(com.google.firebase.components.t.j(Subscriber.class));
        bVarA.f(d0.a);
        bVarA.c();
        return Arrays.asList(bVarA.d(), com.google.firebase.platforminfo.g.a("fire-fcm", "22.0.0"));
    }
}
