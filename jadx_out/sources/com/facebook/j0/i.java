package com.facebook.j0;

import com.facebook.internal.t;
import com.facebook.internal.u;

/* JADX INFO: loaded from: classes.dex */
public final class i {

    public static final class a implements u.b {

        /* JADX INFO: renamed from: com.facebook.j0.i$a$a, reason: collision with other inner class name */
        static final class C0071a implements com.facebook.internal.p.a {
            public static final C0071a a = new C0071a();

            C0071a() {
            }

            @Override // com.facebook.internal.p.a
            public final void a(boolean z) {
                if (z) {
                    com.facebook.j0.q.a.c();
                }
            }
        }

        static final class b implements com.facebook.internal.p.a {
            public static final b a = new b();

            b() {
            }

            @Override // com.facebook.internal.p.a
            public final void a(boolean z) {
                if (z) {
                    com.facebook.j0.y.a.a();
                }
            }
        }

        static final class c implements com.facebook.internal.p.a {
            public static final c a = new c();

            c() {
            }

            @Override // com.facebook.internal.p.a
            public final void a(boolean z) {
                if (z) {
                    com.facebook.j0.w.d.g();
                }
            }
        }

        static final class d implements com.facebook.internal.p.a {
            public static final d a = new d();

            d() {
            }

            @Override // com.facebook.internal.p.a
            public final void a(boolean z) {
                if (z) {
                    com.facebook.j0.s.a.a();
                }
            }
        }

        static final class e implements com.facebook.internal.p.a {
            public static final e a = new e();

            e() {
            }

            @Override // com.facebook.internal.p.a
            public final void a(boolean z) {
                if (z) {
                    com.facebook.j0.t.f.a();
                }
            }
        }

        a() {
        }

        @Override // com.facebook.internal.u.b
        public void a() {
        }

        @Override // com.facebook.internal.u.b
        public void b(t tVar) {
            com.facebook.internal.p.a(com.facebook.internal.p.b.AAM, C0071a.a);
            com.facebook.internal.p.a(com.facebook.internal.p.b.RestrictiveDataFiltering, b.a);
            com.facebook.internal.p.a(com.facebook.internal.p.b.PrivacyProtection, c.a);
            com.facebook.internal.p.a(com.facebook.internal.p.b.EventDeactivation, d.a);
            com.facebook.internal.p.a(com.facebook.internal.p.b.IapLogging, e.a);
        }
    }

    private i() {
    }

    public static final void a() {
        if (com.facebook.internal.m0.i.a.d(i.class)) {
            return;
        }
        try {
            u.h(new a());
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, i.class);
        }
    }
}
