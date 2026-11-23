package com.google.firebase.analytics.connector.internal;

import android.content.Context;
import com.google.firebase.FirebaseApp;
import com.google.firebase.components.o;
import com.google.firebase.components.q;
import com.google.firebase.events.Subscriber;

/* JADX INFO: loaded from: classes.dex */
final /* synthetic */ class a implements q {
    static final q a = new a();

    private a() {
    }

    @Override // com.google.firebase.components.q
    public final Object a(o oVar) {
        return com.google.firebase.analytics.a.b.d((FirebaseApp) oVar.a(FirebaseApp.class), (Context) oVar.a(Context.class), (Subscriber) oVar.a(Subscriber.class));
    }
}
