package com.facebook.internal;

import android.app.Dialog;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class k extends androidx.fragment.app.d {
    private Dialog x0;

    static final class a implements j0.e {
        a() {
        }

        @Override // com.facebook.internal.j0.e
        public final void a(Bundle bundle, com.facebook.n nVar) {
            k.this.Z1(bundle, nVar);
        }
    }

    static final class b implements j0.e {
        b() {
        }

        @Override // com.facebook.internal.j0.e
        public final void a(Bundle bundle, com.facebook.n nVar) {
            k.this.a2(bundle);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Z1(Bundle bundle, com.facebook.n nVar) {
        androidx.fragment.app.e eVarM = m();
        if (eVarM != null) {
            l.y.c.i.d(eVarM, "activity ?: return");
            Intent intent = eVarM.getIntent();
            l.y.c.i.d(intent, "fragmentActivity.intent");
            eVarM.setResult(nVar == null ? -1 : 0, c0.p(intent, bundle, nVar));
            eVarM.finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a2(Bundle bundle) {
        androidx.fragment.app.e eVarM = m();
        if (eVarM != null) {
            l.y.c.i.d(eVarM, "activity ?: return");
            Intent intent = new Intent();
            if (bundle == null) {
                bundle = new Bundle();
            }
            intent.putExtras(bundle);
            eVarM.setResult(-1, intent);
            eVarM.finish();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void L0() {
        super.L0();
        Dialog dialog = this.x0;
        if (dialog instanceof j0) {
            if (dialog == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.facebook.internal.WebDialog");
            }
            ((j0) dialog).s();
        }
    }

    @Override // androidx.fragment.app.d
    public Dialog P1(Bundle bundle) {
        Dialog dialog = this.x0;
        if (dialog != null) {
            if (dialog != null) {
                return dialog;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.app.Dialog");
        }
        Z1(null, null);
        T1(false);
        Dialog dialogP1 = super.P1(bundle);
        l.y.c.i.d(dialogP1, "super.onCreateDialog(savedInstanceState)");
        return dialogP1;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void Y1() {
        androidx.fragment.app.e eVarM;
        j0 j0VarA;
        String str;
        if (this.x0 == null && (eVarM = m()) != null) {
            l.y.c.i.d(eVarM, "activity ?: return");
            Intent intent = eVarM.getIntent();
            l.y.c.i.d(intent, "intent");
            Bundle bundleA = c0.A(intent);
            if (!(bundleA != null ? bundleA.getBoolean("is_fallback", false) : false)) {
                String string = bundleA != null ? bundleA.getString("action") : null;
                Bundle bundle = bundleA != null ? bundleA.getBundle("params") : null;
                if (h0.Y(string)) {
                    str = "Cannot start a WebDialog with an empty/missing 'actionName'";
                    h0.f0("FacebookDialogFragment", str);
                    eVarM.finish();
                    return;
                } else {
                    if (string == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                    }
                    j0.a aVar = new j0.a(eVarM, string, bundle);
                    aVar.h(new a());
                    j0VarA = aVar.a();
                    this.x0 = j0VarA;
                }
            }
            String string2 = bundleA != null ? bundleA.getString("url") : null;
            if (h0.Y(string2)) {
                str = "Cannot start a fallback WebDialog with an empty/missing 'url'";
                h0.f0("FacebookDialogFragment", str);
                eVarM.finish();
                return;
            }
            l.y.c.o oVar = l.y.c.o.a;
            String str2 = String.format("fb%s://bridge/", Arrays.copyOf(new Object[]{com.facebook.r.g()}, 1));
            l.y.c.i.d(str2, "java.lang.String.format(format, *args)");
            o.a aVar2 = o.s;
            if (string2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
            }
            j0VarA = aVar2.a(eVarM, string2, str2);
            j0VarA.w(new b());
            this.x0 = j0VarA;
        }
    }

    public final void b2(Dialog dialog) {
        this.x0 = dialog;
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        l.y.c.i.e(configuration, "newConfig");
        super.onConfigurationChanged(configuration);
        if ((this.x0 instanceof j0) && h0()) {
            Dialog dialog = this.x0;
            if (dialog == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.facebook.internal.WebDialog");
            }
            ((j0) dialog).s();
        }
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public void q0(Bundle bundle) {
        super.q0(bundle);
        Y1();
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public void x0() {
        Dialog dialogN1 = N1();
        if (dialogN1 != null && N()) {
            dialogN1.setDismissMessage(null);
        }
        super.x0();
    }
}
