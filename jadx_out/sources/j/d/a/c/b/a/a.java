package j.d.a.c.b.a;

import android.os.Bundle;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.internal.h;
import com.google.android.gms.auth.api.signin.internal.i;
import j.d.a.c.f.b.d;

/* JADX INFO: loaded from: classes.dex */
public final class a {
    public static final com.google.android.gms.common.api.a.g<d> a;
    public static final com.google.android.gms.common.api.a.g<i> b;
    private static final com.google.android.gms.common.api.a.AbstractC0120a<d, C0231a> c;
    private static final com.google.android.gms.common.api.a.AbstractC0120a<i, GoogleSignInOptions> d;
    public static final com.google.android.gms.common.api.a<GoogleSignInOptions> e;
    public static final com.google.android.gms.auth.api.signin.b f;

    /* JADX INFO: renamed from: j.d.a.c.b.a.a$a, reason: collision with other inner class name */
    @Deprecated
    public static class C0231a implements com.google.android.gms.common.api.a.d.c, com.google.android.gms.common.api.a.d {
        private final boolean a;

        /* JADX INFO: renamed from: j.d.a.c.b.a.a$a$a, reason: collision with other inner class name */
        @Deprecated
        public static class C0232a {
            protected Boolean a = Boolean.FALSE;

            public C0231a a() {
                return new C0231a(this);
            }
        }

        static {
            new C0232a().a();
        }

        public C0231a(C0232a c0232a) {
            this.a = c0232a.a.booleanValue();
        }

        public final Bundle a() {
            Bundle bundle = new Bundle();
            bundle.putString("consumer_package", null);
            bundle.putBoolean("force_save_dialog", this.a);
            return bundle;
        }
    }

    static {
        com.google.android.gms.common.api.a.g<d> gVar = new com.google.android.gms.common.api.a.g<>();
        a = gVar;
        com.google.android.gms.common.api.a.g<i> gVar2 = new com.google.android.gms.common.api.a.g<>();
        b = gVar2;
        f fVar = new f();
        c = fVar;
        g gVar3 = new g();
        d = gVar3;
        com.google.android.gms.common.api.a<c> aVar = b.c;
        new com.google.android.gms.common.api.a("Auth.CREDENTIALS_API", fVar, gVar);
        e = new com.google.android.gms.common.api.a<>("Auth.GOOGLE_SIGN_IN_API", gVar3, gVar2);
        j.d.a.c.b.a.d.a aVar2 = b.d;
        f = new h();
    }
}
