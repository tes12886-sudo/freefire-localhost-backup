package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import androidx.fragment.app.Fragment;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class k3 extends Fragment implements LifecycleFragment {
    private static final WeakHashMap k0 = new WeakHashMap();
    private final Map h0 = Collections.synchronizedMap(new h.f.a());
    private int i0 = 0;
    private Bundle j0;

    public static k3 L1(androidx.fragment.app.e eVar) {
        k3 k3Var;
        WeakHashMap weakHashMap = k0;
        WeakReference weakReference = (WeakReference) weakHashMap.get(eVar);
        if (weakReference != null && (k3Var = (k3) weakReference.get()) != null) {
            return k3Var;
        }
        try {
            k3 k3Var2 = (k3) eVar.s().i0("SupportLifecycleFragmentImpl");
            if (k3Var2 == null || k3Var2.f0()) {
                k3Var2 = new k3();
                androidx.fragment.app.w wVarM = eVar.s().m();
                wVarM.d(k3Var2, "SupportLifecycleFragmentImpl");
                wVarM.g();
            }
            weakHashMap.put(eVar, new WeakReference(k3Var2));
            return k3Var2;
        } catch (ClassCastException e) {
            throw new IllegalStateException("Fragment with tag SupportLifecycleFragmentImpl is not a SupportLifecycleFragmentImpl", e);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void L0() {
        super.L0();
        this.i0 = 3;
        Iterator it = this.h0.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).h();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void M0(Bundle bundle) {
        super.M0(bundle);
        if (bundle == null) {
            return;
        }
        for (Map.Entry entry : this.h0.entrySet()) {
            Bundle bundle2 = new Bundle();
            ((LifecycleCallback) entry.getValue()).i(bundle2);
            bundle.putBundle((String) entry.getKey(), bundle2);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void N0() {
        super.N0();
        this.i0 = 2;
        Iterator it = this.h0.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).j();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void O0() {
        super.O0();
        this.i0 = 4;
        Iterator it = this.h0.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).k();
        }
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleFragment
    public final void b(String str, LifecycleCallback lifecycleCallback) {
        if (this.h0.containsKey(str)) {
            throw new IllegalArgumentException("LifecycleCallback with tag " + str + " already added to this fragment.");
        }
        this.h0.put(str, lifecycleCallback);
        if (this.i0 > 0) {
            new j.d.a.c.f.f.i(Looper.getMainLooper()).post(new j3(this, lifecycleCallback, str));
        }
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleFragment
    public final <T extends LifecycleCallback> T e(String str, Class<T> cls) {
        return cls.cast(this.h0.get(str));
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleFragment
    public final /* synthetic */ Activity f() {
        return m();
    }

    @Override // androidx.fragment.app.Fragment
    public final void i(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.i(str, fileDescriptor, printWriter, strArr);
        Iterator it = this.h0.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).a(str, fileDescriptor, printWriter, strArr);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void l0(int i2, int i3, Intent intent) {
        super.l0(i2, i3, intent);
        Iterator it = this.h0.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).e(i2, i3, intent);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void q0(Bundle bundle) {
        super.q0(bundle);
        this.i0 = 1;
        this.j0 = bundle;
        for (Map.Entry entry : this.h0.entrySet()) {
            ((LifecycleCallback) entry.getValue()).f(bundle != null ? bundle.getBundle((String) entry.getKey()) : null);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void v0() {
        super.v0();
        this.i0 = 5;
        Iterator it = this.h0.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).g();
        }
    }
}
