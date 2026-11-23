package com.google.firebase.crashlytics.internal.h;

import android.content.Context;
import com.google.android.datatransport.TransportFactory;
import com.google.android.datatransport.e;
import com.google.android.datatransport.f;
import com.google.android.datatransport.h.r;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.crashlytics.internal.common.m;
import com.google.firebase.crashlytics.internal.e.v;
import com.google.firebase.crashlytics.internal.e.x.g;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes.dex */
public class c {
    private static final g b = new g();
    private static final String c = d("hts/cahyiseot-agolai.o/1frlglgc/aclg", "tp:/rsltcrprsp.ogepscmv/ieo/eaybtho");
    private static final String d = d("AzSBpY4F0rHiHFdinTvM", "IayrSTFL9eJ69YeSUO2");
    private static final e<v, byte[]> e = new e() { // from class: com.google.firebase.crashlytics.internal.h.a
        @Override // com.google.android.datatransport.e
        public final Object apply(Object obj) {
            return c.b.D((v) obj).getBytes(Charset.forName("UTF-8"));
        }
    };
    private final f<v> a;

    c(f<v> fVar, e<v, byte[]> eVar) {
        this.a = fVar;
    }

    public static c a(Context context) {
        r.f(context);
        TransportFactory transportFactoryG = r.c().g(new com.google.android.datatransport.cct.c(c, d));
        com.google.android.datatransport.b bVarB = com.google.android.datatransport.b.b("json");
        e<v, byte[]> eVar = e;
        return new c(transportFactoryG.a("FIREBASE_CRASHLYTICS_REPORT", v.class, bVarB, eVar), eVar);
    }

    static /* synthetic */ void b(TaskCompletionSource taskCompletionSource, m mVar, Exception exc) {
        if (exc != null) {
            taskCompletionSource.d(exc);
        } else {
            taskCompletionSource.e(mVar);
        }
    }

    private static String d(String str, String str2) {
        int length = str.length() - str2.length();
        if (length < 0 || length > 1) {
            throw new IllegalArgumentException("Invalid input received");
        }
        StringBuilder sb = new StringBuilder(str.length() + str2.length());
        for (int i2 = 0; i2 < str.length(); i2++) {
            sb.append(str.charAt(i2));
            if (str2.length() > i2) {
                sb.append(str2.charAt(i2));
            }
        }
        return sb.toString();
    }

    public Task<m> e(final m mVar) {
        v vVarB = mVar.b();
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.a.b(com.google.android.datatransport.c.e(vVarB), new com.google.android.datatransport.g() { // from class: com.google.firebase.crashlytics.internal.h.b
            @Override // com.google.android.datatransport.g
            public final void a(Exception exc) {
                c.b(taskCompletionSource, mVar, exc);
            }
        });
        return taskCompletionSource.a();
    }
}
