package com.google.android.gms.common.api.internal;

import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* JADX INFO: loaded from: classes.dex */
public final class r2 extends w2 {
    private final SparseArray f;

    private r2(LifecycleFragment lifecycleFragment) {
        super(lifecycleFragment, GoogleApiAvailability.getInstance());
        this.f = new SparseArray();
        this.a.b("AutoManageHelper", this);
    }

    public static r2 t(h hVar) {
        LifecycleFragment lifecycleFragmentD = LifecycleCallback.d(hVar);
        r2 r2Var = (r2) lifecycleFragmentD.e("AutoManageHelper", r2.class);
        return r2Var != null ? r2Var : new r2(lifecycleFragmentD);
    }

    private final q2 w(int i2) {
        if (this.f.size() <= i2) {
            return null;
        }
        SparseArray sparseArray = this.f;
        return (q2) sparseArray.get(sparseArray.keyAt(i2));
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        for (int i2 = 0; i2 < this.f.size(); i2++) {
            q2 q2VarW = w(i2);
            if (q2VarW != null) {
                printWriter.append((CharSequence) str).append("GoogleApiClient #").print(q2VarW.a);
                printWriter.println(":");
                q2VarW.b.h(String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
            }
        }
    }

    @Override // com.google.android.gms.common.api.internal.w2, com.google.android.gms.common.api.internal.LifecycleCallback
    public final void j() {
        super.j();
        Log.d("AutoManageHelper", "onStart " + this.b + " " + String.valueOf(this.f));
        if (this.c.get() == null) {
            for (int i2 = 0; i2 < this.f.size(); i2++) {
                q2 q2VarW = w(i2);
                if (q2VarW != null) {
                    q2VarW.b.f();
                }
            }
        }
    }

    @Override // com.google.android.gms.common.api.internal.w2, com.google.android.gms.common.api.internal.LifecycleCallback
    public final void k() {
        super.k();
        for (int i2 = 0; i2 < this.f.size(); i2++) {
            q2 q2VarW = w(i2);
            if (q2VarW != null) {
                q2VarW.b.g();
            }
        }
    }

    @Override // com.google.android.gms.common.api.internal.w2
    protected final void m(ConnectionResult connectionResult, int i2) {
        Log.w("AutoManageHelper", "Unresolved error while connecting client. Stopping auto-manage.");
        if (i2 < 0) {
            Log.wtf("AutoManageHelper", "AutoManageLifecycleHelper received onErrorResolutionFailed callback but no failing client ID is set", new Exception());
            return;
        }
        q2 q2Var = (q2) this.f.get(i2);
        if (q2Var != null) {
            v(i2);
            com.google.android.gms.common.api.e.c cVar = q2Var.c;
            if (cVar != null) {
                cVar.m(connectionResult);
            }
        }
    }

    @Override // com.google.android.gms.common.api.internal.w2
    protected final void n() {
        for (int i2 = 0; i2 < this.f.size(); i2++) {
            q2 q2VarW = w(i2);
            if (q2VarW != null) {
                q2VarW.b.f();
            }
        }
    }

    public final void u(int i2, com.google.android.gms.common.api.e eVar, com.google.android.gms.common.api.e.c cVar) {
        com.google.android.gms.common.internal.q.l(eVar, "GoogleApiClient instance cannot be null");
        com.google.android.gms.common.internal.q.o(this.f.indexOfKey(i2) < 0, "Already managing a GoogleApiClient with id " + i2);
        t2 t2Var = (t2) this.c.get();
        Log.d("AutoManageHelper", "starting AutoManage for client " + i2 + " " + this.b + " " + String.valueOf(t2Var));
        q2 q2Var = new q2(this, i2, eVar, cVar);
        eVar.o(q2Var);
        this.f.put(i2, q2Var);
        if (this.b && t2Var == null) {
            Log.d("AutoManageHelper", "connecting ".concat(eVar.toString()));
            eVar.f();
        }
    }

    public final void v(int i2) {
        q2 q2Var = (q2) this.f.get(i2);
        this.f.remove(i2);
        if (q2Var != null) {
            q2Var.b.p(q2Var);
            q2Var.b.g();
        }
    }
}
