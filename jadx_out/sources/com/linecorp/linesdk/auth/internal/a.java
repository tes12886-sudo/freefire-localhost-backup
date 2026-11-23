package com.linecorp.linesdk.auth.internal;

import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
final class a {
    static final com.linecorp.linesdk.auth.internal.b b = new com.linecorp.linesdk.auth.internal.b(6, 9, 0);
    final d a;

    /* JADX INFO: renamed from: com.linecorp.linesdk.auth.internal.a$a, reason: collision with other inner class name */
    static class C0154a {
        final Intent a;
        final Bundle b;
        final boolean c;

        C0154a(Intent intent, Bundle bundle, boolean z) {
            this.a = intent;
            this.b = bundle;
            this.c = z;
        }
    }

    static class b {
        final Intent a;
        final Bundle b;
        final String c;
        final boolean d;

        b(Intent intent, Bundle bundle, String str, boolean z) {
            this.a = intent;
            this.b = bundle;
            this.c = str;
            this.d = z;
        }
    }

    static class c {
        final String a;
        private final String b;
        private final String c;
        private final String d;

        c(String str, String str2, String str3, String str4) {
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
        }

        static c a(String str) {
            return new c(null, null, null, str);
        }

        final boolean b() {
            return !TextUtils.isEmpty(this.a);
        }

        final boolean c() {
            return TextUtils.isEmpty(this.d) && !b();
        }

        final j.e.b.b d() {
            if (!c()) {
                return new j.e.b.b(this.d);
            }
            try {
                return new j.e.b.b(new JSONObject().putOpt("error", this.b).putOpt("error_description", this.c).toString());
            } catch (JSONException e) {
                return new j.e.b.b(e);
            }
        }
    }

    a(d dVar) {
        this.a = dVar;
    }

    static List<Intent> a(Uri uri, Collection<ResolveInfo> collection, Bundle bundle) {
        ArrayList arrayList = new ArrayList(collection.size());
        for (ResolveInfo resolveInfo : collection) {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(uri);
            intent.setPackage(resolveInfo.activityInfo.packageName);
            if (bundle != null) {
                intent.putExtras(bundle);
            }
            arrayList.add(intent);
        }
        return arrayList;
    }
}
