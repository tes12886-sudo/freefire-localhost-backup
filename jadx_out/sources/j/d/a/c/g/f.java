package j.d.a.c.g;

import com.google.android.gms.common.api.Scope;

/* JADX INFO: loaded from: classes.dex */
public final class f {
    public static final com.google.android.gms.common.api.a.g a;
    public static final com.google.android.gms.common.api.a.g b;
    public static final com.google.android.gms.common.api.a.AbstractC0120a c;
    static final com.google.android.gms.common.api.a.AbstractC0120a d;
    public static final com.google.android.gms.common.api.a e;

    static {
        com.google.android.gms.common.api.a.g gVar = new com.google.android.gms.common.api.a.g();
        a = gVar;
        com.google.android.gms.common.api.a.g gVar2 = new com.google.android.gms.common.api.a.g();
        b = gVar2;
        c cVar = new c();
        c = cVar;
        d dVar = new d();
        d = dVar;
        new Scope("profile");
        new Scope("email");
        e = new com.google.android.gms.common.api.a("SignIn.API", cVar, gVar);
        new com.google.android.gms.common.api.a("SignIn.INTERNAL_API", dVar, gVar2);
    }
}
