package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.database.ContentObserver;
import android.util.Log;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes.dex */
final class d6 implements a6 {
    private static d6 c;

    @Nullable
    private final Context a;

    @Nullable
    private final ContentObserver b;

    private d6() {
        this.a = null;
        this.b = null;
    }

    private d6(Context context) {
        this.a = context;
        c6 c6Var = new c6(this, null);
        this.b = c6Var;
        context.getContentResolver().registerContentObserver(q5.a, true, c6Var);
    }

    static d6 b(Context context) {
        d6 d6Var;
        synchronized (d6.class) {
            if (c == null) {
                c = androidx.core.content.c.b(context, "com.google.android.providers.gsf.permission.READ_GSERVICES") == 0 ? new d6(context) : new d6();
            }
            d6Var = c;
        }
        return d6Var;
    }

    static synchronized void d() {
        Context context;
        d6 d6Var = c;
        if (d6Var != null && (context = d6Var.a) != null && d6Var.b != null) {
            context.getContentResolver().unregisterContentObserver(c.b);
        }
        c = null;
    }

    @Override // com.google.android.gms.internal.measurement.a6
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final String a(final String str) {
        if (this.a == null) {
            return null;
        }
        try {
            return (String) y5.a(new z5(this, str) { // from class: com.google.android.gms.internal.measurement.b6
                private final d6 a;
                private final String b;

                {
                    this.a = this;
                    this.b = str;
                }

                @Override // com.google.android.gms.internal.measurement.z5
                public final Object zza() {
                    return this.a.e(this.b);
                }
            });
        } catch (IllegalStateException | SecurityException e) {
            String strValueOf = String.valueOf(str);
            Log.e("GservicesLoader", strValueOf.length() != 0 ? "Unable to read GServices for: ".concat(strValueOf) : new String("Unable to read GServices for: "), e);
            return null;
        }
    }

    final /* synthetic */ String e(String str) {
        return q5.a(this.a.getContentResolver(), str, null);
    }
}
