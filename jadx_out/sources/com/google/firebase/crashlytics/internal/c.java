package com.google.firebase.crashlytics.internal;

import com.google.firebase.inject.Provider;
import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public final class c implements CrashlyticsNativeComponent {
    private static final com.google.firebase.crashlytics.internal.b b = new b();
    private final Provider<CrashlyticsNativeComponent> a;

    private static final class b implements com.google.firebase.crashlytics.internal.b {
        private b() {
        }

        @Override // com.google.firebase.crashlytics.internal.b
        public File a() {
            return null;
        }

        @Override // com.google.firebase.crashlytics.internal.b
        public File b() {
            return null;
        }

        @Override // com.google.firebase.crashlytics.internal.b
        public File c() {
            return null;
        }

        @Override // com.google.firebase.crashlytics.internal.b
        public File d() {
            return null;
        }

        @Override // com.google.firebase.crashlytics.internal.b
        public File e() {
            return null;
        }

        @Override // com.google.firebase.crashlytics.internal.b
        public File f() {
            return null;
        }
    }

    public c(Provider<CrashlyticsNativeComponent> provider) {
        this.a = provider;
    }

    @Override // com.google.firebase.crashlytics.internal.CrashlyticsNativeComponent
    public boolean a(String str) {
        CrashlyticsNativeComponent crashlyticsNativeComponent = this.a.get();
        if (crashlyticsNativeComponent != null) {
            return crashlyticsNativeComponent.a(str);
        }
        return true;
    }

    @Override // com.google.firebase.crashlytics.internal.CrashlyticsNativeComponent
    public com.google.firebase.crashlytics.internal.b b(String str) {
        CrashlyticsNativeComponent crashlyticsNativeComponent = this.a.get();
        return crashlyticsNativeComponent != null ? crashlyticsNativeComponent.b(str) : b;
    }

    @Override // com.google.firebase.crashlytics.internal.CrashlyticsNativeComponent
    public void c(String str, int i2, String str2, int i3, long j2, long j3, boolean z, int i4, String str3, String str4) {
        CrashlyticsNativeComponent crashlyticsNativeComponent = this.a.get();
        if (crashlyticsNativeComponent != null) {
            crashlyticsNativeComponent.c(str, i2, str2, i3, j2, j3, z, i4, str3, str4);
        }
    }

    @Override // com.google.firebase.crashlytics.internal.CrashlyticsNativeComponent
    public void d(String str, String str2, String str3, String str4, String str5, int i2, String str6) {
        CrashlyticsNativeComponent crashlyticsNativeComponent = this.a.get();
        if (crashlyticsNativeComponent != null) {
            crashlyticsNativeComponent.d(str, str2, str3, str4, str5, i2, str6);
        }
    }

    @Override // com.google.firebase.crashlytics.internal.CrashlyticsNativeComponent
    public void e(String str, String str2, long j2) {
        CrashlyticsNativeComponent crashlyticsNativeComponent = this.a.get();
        if (crashlyticsNativeComponent != null) {
            crashlyticsNativeComponent.e(str, str2, j2);
        }
    }

    @Override // com.google.firebase.crashlytics.internal.CrashlyticsNativeComponent
    public void f(String str, String str2, String str3, boolean z) {
        CrashlyticsNativeComponent crashlyticsNativeComponent = this.a.get();
        if (crashlyticsNativeComponent != null) {
            crashlyticsNativeComponent.f(str, str2, str3, z);
        }
    }

    @Override // com.google.firebase.crashlytics.internal.CrashlyticsNativeComponent
    public boolean g(String str) {
        CrashlyticsNativeComponent crashlyticsNativeComponent = this.a.get();
        if (crashlyticsNativeComponent != null) {
            return crashlyticsNativeComponent.g(str);
        }
        return true;
    }

    @Override // com.google.firebase.crashlytics.internal.CrashlyticsNativeComponent
    public boolean h(String str) {
        CrashlyticsNativeComponent crashlyticsNativeComponent = this.a.get();
        if (crashlyticsNativeComponent != null) {
            return crashlyticsNativeComponent.h(str);
        }
        return false;
    }
}
