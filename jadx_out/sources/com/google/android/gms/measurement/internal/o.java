package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class o {
    final String a;
    final String b;
    final String c;
    final long d;
    final long e;
    final r f;

    o(a5 a5Var, String str, String str2, String str3, long j2, long j3, Bundle bundle) {
        r rVar;
        com.google.android.gms.common.internal.q.g(str2);
        com.google.android.gms.common.internal.q.g(str3);
        this.a = str2;
        this.b = str3;
        this.c = true == TextUtils.isEmpty(str) ? null : str;
        this.d = j2;
        this.e = j3;
        if (j3 != 0 && j3 > j2) {
            a5Var.d().r().b("Event created with reverse previous/current timestamps. appId", r3.x(str2));
        }
        if (bundle == null || bundle.isEmpty()) {
            rVar = new r(new Bundle());
        } else {
            Bundle bundle2 = new Bundle(bundle);
            Iterator<String> it = bundle2.keySet().iterator();
            while (it.hasNext()) {
                String next = it.next();
                if (next == null) {
                    a5Var.d().o().a("Param name can't be null");
                } else {
                    Object objS = a5Var.G().s(next, bundle2.get(next));
                    if (objS == null) {
                        a5Var.d().r().b("Param value can't be null", a5Var.H().q(next));
                    } else {
                        a5Var.G().z(bundle2, next, objS);
                    }
                }
                it.remove();
            }
            rVar = new r(bundle2);
        }
        this.f = rVar;
    }

    private o(a5 a5Var, String str, String str2, String str3, long j2, long j3, r rVar) {
        com.google.android.gms.common.internal.q.g(str2);
        com.google.android.gms.common.internal.q.g(str3);
        com.google.android.gms.common.internal.q.k(rVar);
        this.a = str2;
        this.b = str3;
        this.c = true == TextUtils.isEmpty(str) ? null : str;
        this.d = j2;
        this.e = j3;
        if (j3 != 0 && j3 > j2) {
            a5Var.d().r().c("Event created with reverse previous/current timestamps. appId, name", r3.x(str2), r3.x(str3));
        }
        this.f = rVar;
    }

    final o a(a5 a5Var, long j2) {
        return new o(a5Var, this.c, this.a, this.b, this.d, j2, this.f);
    }

    public final String toString() {
        String str = this.a;
        String str2 = this.b;
        String strValueOf = String.valueOf(this.f);
        int length = String.valueOf(str).length();
        StringBuilder sb = new StringBuilder(length + 33 + String.valueOf(str2).length() + String.valueOf(strValueOf).length());
        sb.append("Event{appId='");
        sb.append(str);
        sb.append("', name='");
        sb.append(str2);
        sb.append("', params=");
        sb.append(strValueOf);
        sb.append('}');
        return sb.toString();
    }
}
