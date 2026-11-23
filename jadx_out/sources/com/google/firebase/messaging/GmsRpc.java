package com.google.firebase.messaging;

import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import com.appsflyer.AppsFlyerProperties;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.firebase.FirebaseApp;
import com.google.firebase.inject.Provider;
import com.google.firebase.installations.FirebaseInstallationsApi;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: classes.dex */
class GmsRpc {
    private final FirebaseApp a;
    private final Metadata b;
    private final j.d.a.c.d.d c;
    private final Provider<com.google.firebase.platforminfo.h> d;
    private final Provider<com.google.firebase.j.f> e;
    private final FirebaseInstallationsApi f;

    GmsRpc(FirebaseApp firebaseApp, Metadata metadata, Provider<com.google.firebase.platforminfo.h> provider, Provider<com.google.firebase.j.f> provider2, FirebaseInstallationsApi firebaseInstallationsApi) {
        this(firebaseApp, metadata, new j.d.a.c.d.d(firebaseApp.getApplicationContext()), provider, provider2, firebaseInstallationsApi);
    }

    GmsRpc(FirebaseApp firebaseApp, Metadata metadata, j.d.a.c.d.d dVar, Provider<com.google.firebase.platforminfo.h> provider, Provider<com.google.firebase.j.f> provider2, FirebaseInstallationsApi firebaseInstallationsApi) {
        this.a = firebaseApp;
        this.b = metadata;
        this.c = dVar;
        this.d = provider;
        this.e = provider2;
        this.f = firebaseInstallationsApi;
    }

    private static String a(byte[] bArr) {
        return Base64.encodeToString(bArr, 11);
    }

    private Task<String> c(Task<Bundle> task) {
        return task.continueWith(e0.a, new Continuation(this) { // from class: com.google.firebase.messaging.f0
            private final GmsRpc a;

            {
                this.a = this;
            }

            @Override // com.google.android.gms.tasks.Continuation
            public Object a(Task task2) {
                return this.a.h(task2);
            }
        });
    }

    private String d() {
        try {
            return a(MessageDigest.getInstance("SHA-1").digest(this.a.getName().getBytes()));
        } catch (NoSuchAlgorithmException unused) {
            return "[HASH-ERROR]";
        }
    }

    private String f(Bundle bundle) throws IOException {
        if (bundle == null) {
            throw new IOException("SERVICE_NOT_AVAILABLE");
        }
        String string = bundle.getString("registration_id");
        if (string != null) {
            return string;
        }
        String string2 = bundle.getString("unregistered");
        if (string2 != null) {
            return string2;
        }
        String string3 = bundle.getString("error");
        if ("RST".equals(string3)) {
            throw new IOException("INSTANCE_ID_RESET");
        }
        if (string3 != null) {
            throw new IOException(string3);
        }
        String strValueOf = String.valueOf(bundle);
        StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 21);
        sb.append("Unexpected response: ");
        sb.append(strValueOf);
        Log.w("FirebaseMessaging", sb.toString(), new Throwable());
        throw new IOException("SERVICE_NOT_AVAILABLE");
    }

    static boolean g(String str) {
        return "SERVICE_NOT_AVAILABLE".equals(str) || "INTERNAL_SERVER_ERROR".equals(str) || "InternalServerError".equals(str);
    }

    private Bundle i(String str, String str2, String str3, Bundle bundle) {
        com.google.firebase.j.f.a aVarA;
        bundle.putString("scope", str3);
        bundle.putString("sender", str2);
        bundle.putString("subtype", str2);
        bundle.putString(AppsFlyerProperties.APP_ID, str);
        bundle.putString("gmp_app_id", this.a.getOptions().getApplicationId());
        bundle.putString("gmsv", Integer.toString(this.b.d()));
        bundle.putString("osv", Integer.toString(Build.VERSION.SDK_INT));
        bundle.putString("app_ver", this.b.a());
        bundle.putString("app_ver_name", this.b.b());
        bundle.putString("firebase-app-name-hash", d());
        try {
            String strB = ((com.google.firebase.installations.k) com.google.android.gms.tasks.d.a(this.f.a(false))).b();
            if (TextUtils.isEmpty(strB)) {
                Log.w("FirebaseMessaging", "FIS auth token is empty");
            } else {
                bundle.putString("Goog-Firebase-Installations-Auth", strB);
            }
        } catch (InterruptedException | ExecutionException e) {
            Log.e("FirebaseMessaging", "Failed to get FIS auth token", e);
        }
        bundle.putString("cliv", "fcm-22.0.0");
        com.google.firebase.j.f fVar = this.e.get();
        com.google.firebase.platforminfo.h hVar = this.d.get();
        if (fVar != null && hVar != null && (aVarA = fVar.a("fire-iid")) != com.google.firebase.j.f.a.NONE) {
            bundle.putString("Firebase-Client-Log-Type", Integer.toString(aVarA.a()));
            bundle.putString("Firebase-Client", hVar.a());
        }
        return bundle;
    }

    private Task<Bundle> j(String str, String str2, String str3, Bundle bundle) {
        i(str, str2, str3, bundle);
        return this.c.a(bundle);
    }

    Task<?> b(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("delete", "1");
        return c(j(str, Metadata.c(this.a), "*", bundle));
    }

    Task<String> e(String str) {
        return c(j(str, Metadata.c(this.a), "*", new Bundle()));
    }

    final /* synthetic */ String h(Task task) {
        return f((Bundle) task.getResult(IOException.class));
    }

    Task<?> k(String str, String str2, String str3) {
        Bundle bundle = new Bundle();
        String strValueOf = String.valueOf(str3);
        bundle.putString("gcm.topic", strValueOf.length() != 0 ? "/topics/".concat(strValueOf) : new String("/topics/"));
        String strValueOf2 = String.valueOf(str3);
        return c(j(str, str2, strValueOf2.length() != 0 ? "/topics/".concat(strValueOf2) : new String("/topics/"), bundle));
    }

    Task<?> l(String str, String str2, String str3) {
        Bundle bundle = new Bundle();
        String strValueOf = String.valueOf(str3);
        bundle.putString("gcm.topic", strValueOf.length() != 0 ? "/topics/".concat(strValueOf) : new String("/topics/"));
        bundle.putString("delete", "1");
        String strValueOf2 = String.valueOf(str3);
        return c(j(str, str2, strValueOf2.length() != 0 ? "/topics/".concat(strValueOf2) : new String("/topics/"), bundle));
    }
}
