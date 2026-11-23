package j.e.b.h;

import android.content.Context;
import j.e.a.a.a;

/* JADX INFO: loaded from: classes.dex */
public final class b {
    private final Context a;
    private final String b;
    private final a.d c;

    public b(Context context, String str) {
        this(context.getApplicationContext(), str, d.a());
    }

    private b(Context context, String str, a.d dVar) {
        this.a = context;
        this.b = "com.linecorp.linesdk.accesstoken." + str;
        this.c = dVar;
    }

    private String a(long j2) {
        return this.c.a(this.a, String.valueOf(j2));
    }

    private String b(String str) {
        return this.c.a(this.a, str);
    }

    public final void c(e eVar) {
        this.a.getSharedPreferences(this.b, 0).edit().putString("accessToken", b(eVar.a)).putString("expiresIn", a(eVar.b)).putString("issuedClientTime", a(eVar.c)).putString("refreshToken", b(eVar.d)).apply();
    }
}
