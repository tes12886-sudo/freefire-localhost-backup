package com.google.firebase.analytics.connector.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.Keep;
import com.google.firebase.FirebaseApp;
import com.google.firebase.components.n;
import com.google.firebase.components.r;
import com.google.firebase.components.t;
import com.google.firebase.events.Subscriber;
import com.google.firebase.platforminfo.g;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@Keep
public class AnalyticsConnectorRegistrar implements r {
    @Override // com.google.firebase.components.r
    @Keep
    @SuppressLint({"MissingPermission"})
    public List<n<?>> getComponents() {
        n.b bVarA = n.a(com.google.firebase.analytics.a.a.class);
        bVarA.b(t.j(FirebaseApp.class));
        bVarA.b(t.j(Context.class));
        bVarA.b(t.j(Subscriber.class));
        bVarA.f(a.a);
        bVarA.e();
        return Arrays.asList(bVarA.d(), g.a("fire-analytics", "19.0.0"));
    }
}
