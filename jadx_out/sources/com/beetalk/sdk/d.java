package com.beetalk.sdk;

import android.app.Activity;
import android.content.Intent;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public class d implements Serializable {
    private final com.beetalk.sdk.a a;
    private final String b;
    private int c;
    private g.n d;
    private boolean e;
    private String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f484g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private ArrayList<String> f485h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f486i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private g f487j;

    class a implements com.beetalk.sdk.a {
        final /* synthetic */ Activity a;

        a(d dVar, Activity activity) {
            this.a = activity;
        }

        @Override // com.beetalk.sdk.a
        public Activity a() {
            return this.a;
        }

        @Override // com.beetalk.sdk.a
        public void startActivityForResult(Intent intent, int i2) {
            com.beetalk.sdk.x.a.a(this.a.getClass().getName(), new Object[0]);
            this.a.startActivityForResult(intent, i2);
        }
    }

    class b implements com.beetalk.sdk.a {
        b() {
        }

        @Override // com.beetalk.sdk.a
        public Activity a() {
            return d.this.a.a();
        }

        @Override // com.beetalk.sdk.a
        public void startActivityForResult(Intent intent, int i2) {
            d.this.a.startActivityForResult(intent, i2);
        }
    }

    public d(Activity activity, g.n nVar) {
        this(activity, nVar, p.c.intValue(), false, "");
    }

    public d(Activity activity, g.n nVar, int i2, boolean z, String str) {
        this.b = UUID.randomUUID().toString();
        this.c = p.c.intValue();
        this.e = false;
        this.c = i2;
        this.d = nVar;
        this.e = z;
        this.f = str;
        this.a = new a(this, activity);
    }

    public com.beetalk.sdk.a b() {
        return this.a;
    }

    public com.beetalk.sdk.b.c c() {
        com.beetalk.sdk.b.c cVar = new com.beetalk.sdk.b.c(new b(), this.b, this.c, this.e, this.f, this.f484g);
        cVar.j(this.f486i);
        cVar.i(this.f485h);
        cVar.h(this.f487j.I());
        cVar.k(this.f487j.F());
        return cVar;
    }

    public int d() {
        return this.c;
    }

    public g e() {
        return this.f487j;
    }

    public void f(String str) {
        this.f = str;
    }

    public void g(String str) {
        this.f484g = str;
    }

    public void h(boolean z) {
        this.e = z;
    }

    public void i(int i2) {
        this.c = i2;
    }

    public void j(g gVar) {
        this.f487j = gVar;
    }
}
