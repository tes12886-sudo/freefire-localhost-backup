package com.google.android.gms.common.api.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Scope;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class k implements com.google.android.gms.common.api.a.f, ServiceConnection {
    private final String a;
    private final String b;
    private final ComponentName c;
    private final Context d;
    private final f e;
    private final Handler f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final l f970g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private IBinder f971h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f972i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String f973j;

    private final void x() {
        if (Thread.currentThread() != this.f.getLooper().getThread()) {
            throw new IllegalStateException("This method should only run on the NonGmsServiceBrokerClient's handler thread.");
        }
    }

    @Override // com.google.android.gms.common.api.a.f
    public final boolean a() {
        x();
        return this.f971h != null;
    }

    final /* synthetic */ void b() {
        this.f972i = false;
        this.f971h = null;
        String.valueOf((Object) null);
        this.e.j(1);
    }

    @Override // com.google.android.gms.common.api.a.f
    public final void c(com.google.android.gms.common.internal.c.e eVar) {
    }

    @Override // com.google.android.gms.common.api.a.f
    public final boolean d() {
        return false;
    }

    @Override // com.google.android.gms.common.api.a.f
    public final Set<Scope> e() {
        return Collections.emptySet();
    }

    @Override // com.google.android.gms.common.api.a.f
    public final void f(com.google.android.gms.common.internal.j jVar, Set<Scope> set) {
    }

    @Override // com.google.android.gms.common.api.a.f
    public final void g(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    @Override // com.google.android.gms.common.api.a.f
    public final void h(String str) {
        x();
        this.f973j = str;
        s();
    }

    @Override // com.google.android.gms.common.api.a.f
    public final boolean i() {
        return false;
    }

    @Override // com.google.android.gms.common.api.a.f
    public final int k() {
        return 0;
    }

    @Override // com.google.android.gms.common.api.a.f
    public final boolean l() {
        x();
        return this.f972i;
    }

    @Override // com.google.android.gms.common.api.a.f
    public final com.google.android.gms.common.c[] m() {
        return new com.google.android.gms.common.c[0];
    }

    @Override // com.google.android.gms.common.api.a.f
    public final String n() {
        String str = this.a;
        if (str != null) {
            return str;
        }
        com.google.android.gms.common.internal.q.k(this.c);
        return this.c.getPackageName();
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, final IBinder iBinder) {
        this.f.post(new Runnable() { // from class: com.google.android.gms.common.api.internal.w1
            @Override // java.lang.Runnable
            public final void run() {
                this.a.v(iBinder);
            }
        });
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.f.post(new Runnable() { // from class: com.google.android.gms.common.api.internal.v1
            @Override // java.lang.Runnable
            public final void run() {
                this.a.b();
            }
        });
    }

    @Override // com.google.android.gms.common.api.a.f
    public final String q() {
        return this.f973j;
    }

    @Override // com.google.android.gms.common.api.a.f
    public final void r(com.google.android.gms.common.internal.c.InterfaceC0123c interfaceC0123c) {
        x();
        String.valueOf(this.f971h);
        if (a()) {
            try {
                h("connect() called when already connected");
            } catch (Exception unused) {
            }
        }
        try {
            Intent intent = new Intent();
            ComponentName componentName = this.c;
            if (componentName != null) {
                intent.setComponent(componentName);
            } else {
                intent.setPackage(this.a).setAction(this.b);
            }
            boolean zBindService = this.d.bindService(intent, this, com.google.android.gms.common.internal.h.a());
            this.f972i = zBindService;
            if (!zBindService) {
                this.f971h = null;
                this.f970g.m(new ConnectionResult(16));
            }
            String.valueOf(this.f971h);
        } catch (SecurityException e) {
            this.f972i = false;
            this.f971h = null;
            throw e;
        }
    }

    @Override // com.google.android.gms.common.api.a.f
    public final void s() {
        x();
        String.valueOf(this.f971h);
        try {
            this.d.unbindService(this);
        } catch (IllegalArgumentException unused) {
        }
        this.f972i = false;
        this.f971h = null;
    }

    @Override // com.google.android.gms.common.api.a.f
    public final Intent t() {
        return new Intent();
    }

    @Override // com.google.android.gms.common.api.a.f
    public final boolean u() {
        return false;
    }

    final /* synthetic */ void v(IBinder iBinder) {
        this.f972i = false;
        this.f971h = iBinder;
        String.valueOf(iBinder);
        this.e.o(new Bundle());
    }

    public final void w(String str) {
    }
}
