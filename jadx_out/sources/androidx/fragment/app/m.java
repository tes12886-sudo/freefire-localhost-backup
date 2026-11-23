package androidx.fragment.app;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
class m {
    private final CopyOnWriteArrayList<a> a = new CopyOnWriteArrayList<>();
    private final n b;

    private static final class a {
        final n.l a;
        final boolean b;
    }

    m(n nVar) {
        this.b = nVar;
    }

    void a(Fragment fragment, Bundle bundle, boolean z) {
        Fragment fragmentW0 = this.b.w0();
        if (fragmentW0 != null) {
            fragmentW0.G().v0().a(fragment, bundle, true);
        }
        for (a aVar : this.a) {
            if (!z || aVar.b) {
                aVar.a.a(this.b, fragment, bundle);
            }
        }
    }

    void b(Fragment fragment, boolean z) {
        Context contextK = this.b.t0().k();
        Fragment fragmentW0 = this.b.w0();
        if (fragmentW0 != null) {
            fragmentW0.G().v0().b(fragment, true);
        }
        for (a aVar : this.a) {
            if (!z || aVar.b) {
                aVar.a.b(this.b, fragment, contextK);
            }
        }
    }

    void c(Fragment fragment, Bundle bundle, boolean z) {
        Fragment fragmentW0 = this.b.w0();
        if (fragmentW0 != null) {
            fragmentW0.G().v0().c(fragment, bundle, true);
        }
        for (a aVar : this.a) {
            if (!z || aVar.b) {
                aVar.a.c(this.b, fragment, bundle);
            }
        }
    }

    void d(Fragment fragment, boolean z) {
        Fragment fragmentW0 = this.b.w0();
        if (fragmentW0 != null) {
            fragmentW0.G().v0().d(fragment, true);
        }
        for (a aVar : this.a) {
            if (!z || aVar.b) {
                aVar.a.d(this.b, fragment);
            }
        }
    }

    void e(Fragment fragment, boolean z) {
        Fragment fragmentW0 = this.b.w0();
        if (fragmentW0 != null) {
            fragmentW0.G().v0().e(fragment, true);
        }
        for (a aVar : this.a) {
            if (!z || aVar.b) {
                aVar.a.e(this.b, fragment);
            }
        }
    }

    void f(Fragment fragment, boolean z) {
        Fragment fragmentW0 = this.b.w0();
        if (fragmentW0 != null) {
            fragmentW0.G().v0().f(fragment, true);
        }
        for (a aVar : this.a) {
            if (!z || aVar.b) {
                aVar.a.f(this.b, fragment);
            }
        }
    }

    void g(Fragment fragment, boolean z) {
        Context contextK = this.b.t0().k();
        Fragment fragmentW0 = this.b.w0();
        if (fragmentW0 != null) {
            fragmentW0.G().v0().g(fragment, true);
        }
        for (a aVar : this.a) {
            if (!z || aVar.b) {
                aVar.a.g(this.b, fragment, contextK);
            }
        }
    }

    void h(Fragment fragment, Bundle bundle, boolean z) {
        Fragment fragmentW0 = this.b.w0();
        if (fragmentW0 != null) {
            fragmentW0.G().v0().h(fragment, bundle, true);
        }
        for (a aVar : this.a) {
            if (!z || aVar.b) {
                aVar.a.h(this.b, fragment, bundle);
            }
        }
    }

    void i(Fragment fragment, boolean z) {
        Fragment fragmentW0 = this.b.w0();
        if (fragmentW0 != null) {
            fragmentW0.G().v0().i(fragment, true);
        }
        for (a aVar : this.a) {
            if (!z || aVar.b) {
                aVar.a.i(this.b, fragment);
            }
        }
    }

    void j(Fragment fragment, Bundle bundle, boolean z) {
        Fragment fragmentW0 = this.b.w0();
        if (fragmentW0 != null) {
            fragmentW0.G().v0().j(fragment, bundle, true);
        }
        for (a aVar : this.a) {
            if (!z || aVar.b) {
                aVar.a.j(this.b, fragment, bundle);
            }
        }
    }

    void k(Fragment fragment, boolean z) {
        Fragment fragmentW0 = this.b.w0();
        if (fragmentW0 != null) {
            fragmentW0.G().v0().k(fragment, true);
        }
        for (a aVar : this.a) {
            if (!z || aVar.b) {
                aVar.a.k(this.b, fragment);
            }
        }
    }

    void l(Fragment fragment, boolean z) {
        Fragment fragmentW0 = this.b.w0();
        if (fragmentW0 != null) {
            fragmentW0.G().v0().l(fragment, true);
        }
        for (a aVar : this.a) {
            if (!z || aVar.b) {
                aVar.a.l(this.b, fragment);
            }
        }
    }

    void m(Fragment fragment, View view, Bundle bundle, boolean z) {
        Fragment fragmentW0 = this.b.w0();
        if (fragmentW0 != null) {
            fragmentW0.G().v0().m(fragment, view, bundle, true);
        }
        for (a aVar : this.a) {
            if (!z || aVar.b) {
                aVar.a.m(this.b, fragment, view, bundle);
            }
        }
    }

    void n(Fragment fragment, boolean z) {
        Fragment fragmentW0 = this.b.w0();
        if (fragmentW0 != null) {
            fragmentW0.G().v0().n(fragment, true);
        }
        for (a aVar : this.a) {
            if (!z || aVar.b) {
                aVar.a.n(this.b, fragment);
            }
        }
    }
}
