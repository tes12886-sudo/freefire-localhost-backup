package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;

/* JADX INFO: loaded from: classes.dex */
public class d extends Fragment implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {
    private Handler h0;
    private boolean q0;
    private Dialog s0;
    private boolean t0;
    private boolean u0;
    private boolean v0;
    private Runnable i0 = new a();
    private DialogInterface.OnCancelListener j0 = new b();
    private DialogInterface.OnDismissListener k0 = new c();
    private int l0 = 0;
    private int m0 = 0;
    private boolean n0 = true;
    private boolean o0 = true;
    private int p0 = -1;
    private androidx.lifecycle.q<androidx.lifecycle.k> r0 = new C0022d();
    private boolean w0 = false;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        @SuppressLint({"SyntheticAccessor"})
        public void run() {
            d.this.k0.onDismiss(d.this.s0);
        }
    }

    class b implements DialogInterface.OnCancelListener {
        b() {
        }

        @Override // android.content.DialogInterface.OnCancelListener
        @SuppressLint({"SyntheticAccessor"})
        public void onCancel(DialogInterface dialogInterface) {
            if (d.this.s0 != null) {
                d dVar = d.this;
                dVar.onCancel(dVar.s0);
            }
        }
    }

    class c implements DialogInterface.OnDismissListener {
        c() {
        }

        @Override // android.content.DialogInterface.OnDismissListener
        @SuppressLint({"SyntheticAccessor"})
        public void onDismiss(DialogInterface dialogInterface) {
            if (d.this.s0 != null) {
                d dVar = d.this;
                dVar.onDismiss(dVar.s0);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.d$d, reason: collision with other inner class name */
    class C0022d implements androidx.lifecycle.q<androidx.lifecycle.k> {
        C0022d() {
        }

        @Override // androidx.lifecycle.q
        @SuppressLint({"SyntheticAccessor"})
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(androidx.lifecycle.k kVar) {
            if (kVar == null || !d.this.o0) {
                return;
            }
            View viewR1 = d.this.r1();
            if (viewR1.getParent() != null) {
                throw new IllegalStateException("DialogFragment can not be attached to a container view");
            }
            if (d.this.s0 != null) {
                if (n.F0(3)) {
                    Log.d("FragmentManager", "DialogFragment " + this + " setting the content view on " + d.this.s0);
                }
                d.this.s0.setContentView(viewR1);
            }
        }
    }

    class e extends g {
        final /* synthetic */ g a;

        e(g gVar) {
            this.a = gVar;
        }

        @Override // androidx.fragment.app.g
        public View f(int i2) {
            return this.a.g() ? this.a.f(i2) : d.this.Q1(i2);
        }

        @Override // androidx.fragment.app.g
        public boolean g() {
            return this.a.g() || d.this.R1();
        }
    }

    private void M1(boolean z, boolean z2) {
        if (this.u0) {
            return;
        }
        this.u0 = true;
        this.v0 = false;
        Dialog dialog = this.s0;
        if (dialog != null) {
            dialog.setOnDismissListener(null);
            this.s0.dismiss();
            if (!z2) {
                if (Looper.myLooper() == this.h0.getLooper()) {
                    onDismiss(this.s0);
                } else {
                    this.h0.post(this.i0);
                }
            }
        }
        this.t0 = true;
        if (this.p0 >= 0) {
            G().U0(this.p0, 1);
            this.p0 = -1;
            return;
        }
        w wVarM = G().m();
        wVarM.k(this);
        if (z) {
            wVarM.g();
        } else {
            wVarM.f();
        }
    }

    private void S1(Bundle bundle) {
        if (this.o0 && !this.w0) {
            try {
                this.q0 = true;
                Dialog dialogP1 = P1(bundle);
                this.s0 = dialogP1;
                if (this.o0) {
                    U1(dialogP1, this.l0);
                    Context contextS = s();
                    if (contextS instanceof Activity) {
                        this.s0.setOwnerActivity((Activity) contextS);
                    }
                    this.s0.setCancelable(this.n0);
                    this.s0.setOnCancelListener(this.j0);
                    this.s0.setOnDismissListener(this.k0);
                    this.w0 = true;
                } else {
                    this.s0 = null;
                }
            } finally {
                this.q0 = false;
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void M0(Bundle bundle) {
        super.M0(bundle);
        Dialog dialog = this.s0;
        if (dialog != null) {
            Bundle bundleOnSaveInstanceState = dialog.onSaveInstanceState();
            bundleOnSaveInstanceState.putBoolean("android:dialogShowing", false);
            bundle.putBundle("android:savedDialogState", bundleOnSaveInstanceState);
        }
        int i2 = this.l0;
        if (i2 != 0) {
            bundle.putInt("android:style", i2);
        }
        int i3 = this.m0;
        if (i3 != 0) {
            bundle.putInt("android:theme", i3);
        }
        boolean z = this.n0;
        if (!z) {
            bundle.putBoolean("android:cancelable", z);
        }
        boolean z2 = this.o0;
        if (!z2) {
            bundle.putBoolean("android:showsDialog", z2);
        }
        int i4 = this.p0;
        if (i4 != -1) {
            bundle.putInt("android:backStackId", i4);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void N0() {
        super.N0();
        Dialog dialog = this.s0;
        if (dialog != null) {
            this.t0 = false;
            dialog.show();
            View decorView = this.s0.getWindow().getDecorView();
            androidx.lifecycle.z.a(decorView, this);
            androidx.lifecycle.a0.a(decorView, this);
            androidx.savedstate.d.a(decorView, this);
        }
    }

    public Dialog N1() {
        return this.s0;
    }

    @Override // androidx.fragment.app.Fragment
    public void O0() {
        super.O0();
        Dialog dialog = this.s0;
        if (dialog != null) {
            dialog.hide();
        }
    }

    public int O1() {
        return this.m0;
    }

    public Dialog P1(Bundle bundle) {
        if (n.F0(3)) {
            Log.d("FragmentManager", "onCreateDialog called for DialogFragment " + this);
        }
        return new Dialog(q1(), O1());
    }

    @Override // androidx.fragment.app.Fragment
    public void Q0(Bundle bundle) {
        Bundle bundle2;
        super.Q0(bundle);
        if (this.s0 == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.s0.onRestoreInstanceState(bundle2);
    }

    View Q1(int i2) {
        Dialog dialog = this.s0;
        if (dialog != null) {
            return dialog.findViewById(i2);
        }
        return null;
    }

    boolean R1() {
        return this.w0;
    }

    public void T1(boolean z) {
        this.o0 = z;
    }

    public void U1(Dialog dialog, int i2) {
        if (i2 != 1 && i2 != 2) {
            if (i2 != 3) {
                return;
            }
            Window window = dialog.getWindow();
            if (window != null) {
                window.addFlags(24);
            }
        }
        dialog.requestWindowFeature(1);
    }

    public void V1(n nVar, String str) {
        this.u0 = false;
        this.v0 = true;
        w wVarM = nVar.m();
        wVarM.d(this, str);
        wVarM.f();
    }

    @Override // androidx.fragment.app.Fragment
    void X0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle bundle2;
        super.X0(layoutInflater, viewGroup, bundle);
        if (this.Q != null || this.s0 == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.s0.onRestoreInstanceState(bundle2);
    }

    @Override // androidx.fragment.app.Fragment
    g h() {
        return new e(super.h());
    }

    @Override // androidx.fragment.app.Fragment
    public void n0(Context context) {
        super.n0(context);
        W().i(this.r0);
        if (this.v0) {
            return;
        }
        this.u0 = false;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        if (this.t0) {
            return;
        }
        if (n.F0(3)) {
            Log.d("FragmentManager", "onDismiss called for DialogFragment " + this);
        }
        M1(true, true);
    }

    @Override // androidx.fragment.app.Fragment
    public void q0(Bundle bundle) {
        super.q0(bundle);
        this.h0 = new Handler();
        this.o0 = this.G == 0;
        if (bundle != null) {
            this.l0 = bundle.getInt("android:style", 0);
            this.m0 = bundle.getInt("android:theme", 0);
            this.n0 = bundle.getBoolean("android:cancelable", true);
            this.o0 = bundle.getBoolean("android:showsDialog", this.o0);
            this.p0 = bundle.getInt("android:backStackId", -1);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void x0() {
        super.x0();
        Dialog dialog = this.s0;
        if (dialog != null) {
            this.t0 = true;
            dialog.setOnDismissListener(null);
            this.s0.dismiss();
            if (!this.u0) {
                onDismiss(this.s0);
            }
            this.s0 = null;
            this.w0 = false;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void y0() {
        super.y0();
        if (!this.v0 && !this.u0) {
            this.u0 = true;
        }
        W().m(this.r0);
    }

    @Override // androidx.fragment.app.Fragment
    public LayoutInflater z0(Bundle bundle) {
        StringBuilder sb;
        String str;
        LayoutInflater layoutInflaterZ0 = super.z0(bundle);
        if (this.o0 && !this.q0) {
            S1(bundle);
            if (n.F0(2)) {
                Log.d("FragmentManager", "get layout inflater for DialogFragment " + this + " from dialog context");
            }
            Dialog dialog = this.s0;
            return dialog != null ? layoutInflaterZ0.cloneInContext(dialog.getContext()) : layoutInflaterZ0;
        }
        if (n.F0(2)) {
            String str2 = "getting layout inflater for DialogFragment " + this;
            if (this.o0) {
                sb = new StringBuilder();
                str = "mCreatingDialog = true: ";
            } else {
                sb = new StringBuilder();
                str = "mShowsDialog = false: ";
            }
            sb.append(str);
            sb.append(str2);
            Log.d("FragmentManager", sb.toString());
        }
        return layoutInflaterZ0;
    }
}
