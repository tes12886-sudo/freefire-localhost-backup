package com.google.firebase.messaging;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class RemoteMessage extends com.google.android.gms.common.internal.y.a {
    public static final Parcelable.Creator<RemoteMessage> CREATOR = new l0();
    Bundle a;
    private Map<String, String> b;
    private b c;

    public static class b {
        private final String a;
        private final String b;
        private final String[] c;
        private final String d;
        private final String e;
        private final String[] f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final String f1448g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final String f1449h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final String f1450i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private final String f1451j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private final String f1452k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private final String f1453l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private final Uri f1454m;

        private b(k0 k0Var) {
            this.a = k0Var.p("gcm.n.title");
            this.b = k0Var.h("gcm.n.title");
            this.c = i(k0Var, "gcm.n.title");
            this.d = k0Var.p("gcm.n.body");
            this.e = k0Var.h("gcm.n.body");
            this.f = i(k0Var, "gcm.n.body");
            this.f1448g = k0Var.p("gcm.n.icon");
            this.f1449h = k0Var.o();
            this.f1450i = k0Var.p("gcm.n.tag");
            this.f1451j = k0Var.p("gcm.n.color");
            this.f1452k = k0Var.p("gcm.n.click_action");
            this.f1453l = k0Var.p("gcm.n.android_channel_id");
            this.f1454m = k0Var.f();
            k0Var.p("gcm.n.image");
            k0Var.p("gcm.n.ticker");
            k0Var.b("gcm.n.notification_priority");
            k0Var.b("gcm.n.visibility");
            k0Var.b("gcm.n.notification_count");
            k0Var.a("gcm.n.sticky");
            k0Var.a("gcm.n.local_only");
            k0Var.a("gcm.n.default_sound");
            k0Var.a("gcm.n.default_vibrate_timings");
            k0Var.a("gcm.n.default_light_settings");
            k0Var.j("gcm.n.event_time");
            k0Var.e();
            k0Var.q();
        }

        private static String[] i(k0 k0Var, String str) {
            Object[] objArrG = k0Var.g(str);
            if (objArrG == null) {
                return null;
            }
            String[] strArr = new String[objArrG.length];
            for (int i2 = 0; i2 < objArrG.length; i2++) {
                strArr[i2] = String.valueOf(objArrG[i2]);
            }
            return strArr;
        }

        public String a() {
            return this.d;
        }

        public String[] b() {
            return this.f;
        }

        public String c() {
            return this.e;
        }

        public String d() {
            return this.f1453l;
        }

        public String e() {
            return this.f1452k;
        }

        public String f() {
            return this.f1451j;
        }

        public String g() {
            return this.f1448g;
        }

        public Uri h() {
            return this.f1454m;
        }

        public String j() {
            return this.f1449h;
        }

        public String k() {
            return this.f1450i;
        }

        public String l() {
            return this.a;
        }

        public String[] m() {
            return this.c;
        }

        public String n() {
            return this.b;
        }
    }

    public RemoteMessage(Bundle bundle) {
        this.a = bundle;
    }

    private int n(String str) {
        if ("high".equals(str)) {
            return 1;
        }
        return "normal".equals(str) ? 2 : 0;
    }

    public String f() {
        return this.a.getString("collapse_key");
    }

    public Map<String, String> h() {
        if (this.b == null) {
            this.b = com.google.firebase.messaging.b.a.a(this.a);
        }
        return this.b;
    }

    public String j() {
        return this.a.getString("from");
    }

    public String l() {
        String string = this.a.getString("google.message_id");
        return string == null ? this.a.getString("message_id") : string;
    }

    public String q() {
        return this.a.getString("message_type");
    }

    public b r() {
        if (this.c == null && k0.t(this.a)) {
            this.c = new b(new k0(this.a));
        }
        return this.c;
    }

    public int s() {
        String string = this.a.getString("google.original_priority");
        if (string == null) {
            string = this.a.getString("google.priority");
        }
        return n(string);
    }

    public int t() {
        String string = this.a.getString("google.delivered_priority");
        if (string == null) {
            if ("1".equals(this.a.getString("google.priority_reduced"))) {
                return 2;
            }
            string = this.a.getString("google.priority");
        }
        return n(string);
    }

    public byte[] u() {
        return this.a.getByteArray("rawData");
    }

    public long v() {
        Object obj = this.a.get("google.sent_time");
        if (obj instanceof Long) {
            return ((Long) obj).longValue();
        }
        if (!(obj instanceof String)) {
            return 0L;
        }
        try {
            return Long.parseLong((String) obj);
        } catch (NumberFormatException unused) {
            String strValueOf = String.valueOf(obj);
            StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 19);
            sb.append("Invalid sent time: ");
            sb.append(strValueOf);
            Log.w("FirebaseMessaging", sb.toString());
            return 0L;
        }
    }

    public String w() {
        return this.a.getString("google.to");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        l0.c(this, parcel, i2);
    }

    public int x() {
        Object obj = this.a.get("google.ttl");
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        if (!(obj instanceof String)) {
            return 0;
        }
        try {
            return Integer.parseInt((String) obj);
        } catch (NumberFormatException unused) {
            String strValueOf = String.valueOf(obj);
            StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 13);
            sb.append("Invalid TTL: ");
            sb.append(strValueOf);
            Log.w("FirebaseMessaging", sb.toString());
            return 0;
        }
    }

    void y(Intent intent) {
        intent.putExtras(this.a);
    }
}
