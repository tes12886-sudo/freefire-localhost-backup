package com.google.firebase.crashlytics.internal.d;

import android.content.Context;
import com.google.firebase.crashlytics.internal.common.k;
import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public class b {
    private static final c d = new c();
    private final Context a;
    private final InterfaceC0132b b;
    private com.google.firebase.crashlytics.internal.d.a c;

    /* JADX INFO: renamed from: com.google.firebase.crashlytics.internal.d.b$b, reason: collision with other inner class name */
    public interface InterfaceC0132b {
        File a();
    }

    private static final class c implements com.google.firebase.crashlytics.internal.d.a {
        private c() {
        }

        @Override // com.google.firebase.crashlytics.internal.d.a
        public void a() {
        }

        @Override // com.google.firebase.crashlytics.internal.d.a
        public String b() {
            return null;
        }

        @Override // com.google.firebase.crashlytics.internal.d.a
        public byte[] c() {
            return null;
        }

        @Override // com.google.firebase.crashlytics.internal.d.a
        public void d() {
        }

        @Override // com.google.firebase.crashlytics.internal.d.a
        public void e(long j2, String str) {
        }
    }

    public b(Context context, InterfaceC0132b interfaceC0132b) {
        this(context, interfaceC0132b, null);
    }

    public b(Context context, InterfaceC0132b interfaceC0132b, String str) {
        this.a = context;
        this.b = interfaceC0132b;
        this.c = d;
        e(str);
    }

    private File d(String str) {
        return new File(this.b.a(), "crashlytics-userlog-" + str + ".temp");
    }

    public void a() {
        this.c.d();
    }

    public byte[] b() {
        return this.c.c();
    }

    public String c() {
        return this.c.b();
    }

    public final void e(String str) {
        this.c.a();
        this.c = d;
        if (str == null) {
            return;
        }
        if (k.k(this.a, "com.crashlytics.CollectCustomLogs", true)) {
            f(d(str), 65536);
        } else {
            com.google.firebase.crashlytics.internal.a.f().b("Preferences requested no custom logs. Aborting log file creation.");
        }
    }

    void f(File file, int i2) {
        this.c = new d(file, i2);
    }

    public void g(long j2, String str) {
        this.c.e(j2, str);
    }
}
