package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public abstract class k<E> extends g {
    private final Activity a;
    private final Context b;
    private final Handler c;
    final n d;

    k(Activity activity, Context context, Handler handler, int i2) {
        this.d = new o();
        this.a = activity;
        h.h.k.e.g(context, "context == null");
        this.b = context;
        h.h.k.e.g(handler, "handler == null");
        this.c = handler;
    }

    k(e eVar) {
        this(eVar, eVar, new Handler(), 0);
    }

    @Override // androidx.fragment.app.g
    public View f(int i2) {
        return null;
    }

    @Override // androidx.fragment.app.g
    public boolean g() {
        return true;
    }

    Activity i() {
        return this.a;
    }

    Context k() {
        return this.b;
    }

    Handler l() {
        return this.c;
    }

    public abstract E m();

    public LayoutInflater n() {
        return LayoutInflater.from(this.b);
    }

    public boolean o(Fragment fragment) {
        return true;
    }

    public void p(Fragment fragment, @SuppressLint({"UnknownNullness"}) Intent intent, int i2, Bundle bundle) {
        if (i2 != -1) {
            throw new IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host");
        }
        androidx.core.content.a.l(this.b, intent, bundle);
    }

    public void q() {
    }
}
