package com.google.firebase.crashlytics;

import android.os.Bundle;
import com.google.firebase.crashlytics.internal.analytics.AnalyticsEventLogger;
import com.google.firebase.crashlytics.internal.breadcrumbs.BreadcrumbSource;
import com.google.firebase.inject.Deferred;
import com.google.firebase.inject.Provider;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public class e {
    private final Deferred<com.google.firebase.analytics.a.a> a;
    private volatile AnalyticsEventLogger b;
    private volatile BreadcrumbSource c;
    private final List<com.google.firebase.crashlytics.internal.breadcrumbs.a> d;

    public e(Deferred<com.google.firebase.analytics.a.a> deferred) {
        this(deferred, new com.google.firebase.crashlytics.internal.breadcrumbs.b(), new com.google.firebase.crashlytics.internal.analytics.e());
    }

    public e(Deferred<com.google.firebase.analytics.a.a> deferred, BreadcrumbSource breadcrumbSource, AnalyticsEventLogger analyticsEventLogger) {
        this.a = deferred;
        this.c = breadcrumbSource;
        this.d = new ArrayList();
        this.b = analyticsEventLogger;
        c();
    }

    private void c() {
        this.a.a(new Deferred.a() { // from class: com.google.firebase.crashlytics.a
            @Override // com.google.firebase.inject.Deferred.a
            public final void a(Provider provider) {
                this.a.i(provider);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void e(String str, Bundle bundle) {
        this.b.a(str, bundle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void g(com.google.firebase.crashlytics.internal.breadcrumbs.a aVar) {
        synchronized (this) {
            if (this.c instanceof com.google.firebase.crashlytics.internal.breadcrumbs.b) {
                this.d.add(aVar);
            }
            this.c.a(aVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void i(Provider provider) {
        com.google.firebase.analytics.a.a aVar = (com.google.firebase.analytics.a.a) provider.get();
        com.google.firebase.crashlytics.internal.analytics.d dVar = new com.google.firebase.crashlytics.internal.analytics.d(aVar);
        f fVar = new f();
        if (j(aVar, fVar) == null) {
            com.google.firebase.crashlytics.internal.a.f().k("Could not register Firebase Analytics listener; a listener is already registered.");
            return;
        }
        com.google.firebase.crashlytics.internal.a.f().b("Registered Firebase Analytics listener.");
        com.google.firebase.crashlytics.internal.analytics.c cVar = new com.google.firebase.crashlytics.internal.analytics.c();
        com.google.firebase.crashlytics.internal.analytics.b bVar = new com.google.firebase.crashlytics.internal.analytics.b(dVar, 500, TimeUnit.MILLISECONDS);
        synchronized (this) {
            Iterator<com.google.firebase.crashlytics.internal.breadcrumbs.a> it = this.d.iterator();
            while (it.hasNext()) {
                cVar.a(it.next());
            }
            fVar.d(cVar);
            fVar.e(bVar);
            this.c = cVar;
            this.b = bVar;
        }
    }

    private static com.google.firebase.analytics.a.a.InterfaceC0129a j(com.google.firebase.analytics.a.a aVar, f fVar) {
        com.google.firebase.analytics.a.a.InterfaceC0129a interfaceC0129aB = aVar.b("clx", fVar);
        if (interfaceC0129aB == null) {
            com.google.firebase.crashlytics.internal.a.f().b("Could not register AnalyticsConnectorListener with Crashlytics origin.");
            interfaceC0129aB = aVar.b("crash", fVar);
            if (interfaceC0129aB != null) {
                com.google.firebase.crashlytics.internal.a.f().k("A new version of the Google Analytics for Firebase SDK is now available. For improved performance and compatibility with Crashlytics, please update to the latest version.");
            }
        }
        return interfaceC0129aB;
    }

    public AnalyticsEventLogger a() {
        return new AnalyticsEventLogger() { // from class: com.google.firebase.crashlytics.b
            @Override // com.google.firebase.crashlytics.internal.analytics.AnalyticsEventLogger
            public final void a(String str, Bundle bundle) {
                this.a.e(str, bundle);
            }
        };
    }

    public BreadcrumbSource b() {
        return new BreadcrumbSource() { // from class: com.google.firebase.crashlytics.c
            @Override // com.google.firebase.crashlytics.internal.breadcrumbs.BreadcrumbSource
            public final void a(com.google.firebase.crashlytics.internal.breadcrumbs.a aVar) {
                this.a.g(aVar);
            }
        };
    }
}
