package androidx.lifecycle;

import androidx.savedstate.SavedStateRegistry;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
final class SavedStateHandleController implements i {
    private boolean a;
    private final u b;

    /* JADX INFO: renamed from: androidx.lifecycle.SavedStateHandleController$1, reason: invalid class name */
    class AnonymousClass1 implements i {
        final /* synthetic */ g a;
        final /* synthetic */ SavedStateRegistry b;

        @Override // androidx.lifecycle.i
        public void d(k kVar, g.b bVar) {
            if (bVar == g.b.ON_START) {
                this.a.c(this);
                this.b.e(a.class);
            }
        }
    }

    static final class a implements SavedStateRegistry.a {
        a() {
        }

        @Override // androidx.savedstate.SavedStateRegistry.a
        public void a(androidx.savedstate.c cVar) {
            if (!(cVar instanceof y)) {
                throw new IllegalStateException("Internal error: OnRecreation should be registered only on componentsthat implement ViewModelStoreOwner");
            }
            x xVarJ = ((y) cVar).j();
            SavedStateRegistry savedStateRegistryD = cVar.d();
            Iterator<String> it = xVarJ.c().iterator();
            while (it.hasNext()) {
                SavedStateHandleController.h(xVarJ.b(it.next()), savedStateRegistryD, cVar.a());
            }
            if (xVarJ.c().isEmpty()) {
                return;
            }
            savedStateRegistryD.e(a.class);
        }
    }

    static void h(v vVar, SavedStateRegistry savedStateRegistry, g gVar) {
        SavedStateHandleController savedStateHandleController = (SavedStateHandleController) vVar.c("androidx.lifecycle.savedstate.vm.tag");
        if (savedStateHandleController == null || savedStateHandleController.j()) {
            return;
        }
        savedStateHandleController.i(savedStateRegistry, gVar);
        throw null;
    }

    @Override // androidx.lifecycle.i
    public void d(k kVar, g.b bVar) {
        if (bVar == g.b.ON_DESTROY) {
            this.a = false;
            kVar.a().c(this);
        }
    }

    void i(SavedStateRegistry savedStateRegistry, g gVar) {
        if (this.a) {
            throw new IllegalStateException("Already attached to lifecycleOwner");
        }
        this.a = true;
        gVar.a(this);
        this.b.a();
        throw null;
    }

    boolean j() {
        return this.a;
    }
}
