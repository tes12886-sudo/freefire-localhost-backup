package com.facebook.internal.m0;

import com.facebook.internal.p;
import com.facebook.r;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    static final class a implements p.a {
        public static final a a = new a();

        a() {
        }

        @Override // com.facebook.internal.p.a
        public final void a(boolean z) {
            if (z) {
                com.facebook.internal.m0.h.a.d.a();
                if (p.g(p.b.CrashShield)) {
                    com.facebook.internal.m0.a.a();
                    com.facebook.internal.m0.i.a.a();
                }
                if (p.g(p.b.ThreadCheck)) {
                    com.facebook.internal.m0.k.a.a();
                }
            }
        }
    }

    static final class b implements p.a {
        public static final b a = new b();

        b() {
        }

        @Override // com.facebook.internal.p.a
        public final void a(boolean z) {
            if (z) {
                com.facebook.internal.m0.j.b.a();
            }
        }
    }

    static final class c implements p.a {
        public static final c a = new c();

        c() {
        }

        @Override // com.facebook.internal.p.a
        public final void a(boolean z) {
            if (z) {
                com.facebook.internal.m0.g.b.a();
            }
        }
    }

    public static final void a() {
        if (r.j()) {
            p.a(p.b.CrashReport, a.a);
            p.a(p.b.ErrorReport, b.a);
            p.a(p.b.AnrReport, c.a);
        }
    }
}
