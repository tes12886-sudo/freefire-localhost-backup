package com.garena.pay.android.k;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class c {
    private com.garena.pay.android.k.b a;
    private Activity b;
    private b d;
    private ViewGroup e;
    private List<e> c = new ArrayList();
    private String f = "";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f830g = 0;

    class a implements com.garena.pay.android.k.b.c {
        a() {
        }

        @Override // com.garena.pay.android.k.b.c
        public void a() {
            c.this.d.a();
        }
    }

    public interface b {
        void a();

        void b(Object obj);
    }

    public c(Activity activity) {
        this.b = activity;
    }

    private void a() {
        ViewGroup viewGroup = (ViewGroup) this.b.getLayoutInflater().inflate(j.c.b.f.c, new LinearLayout(this.b));
        this.e = viewGroup;
        LinearLayout linearLayout = (LinearLayout) viewGroup.findViewById(j.c.b.e.f1940n);
        TextView textView = (TextView) this.e.findViewById(j.c.b.e.f1937k);
        textView.setVisibility(com.garena.pay.android.j.d.d(this.f) ? 8 : 0);
        textView.setText(this.f);
        this.e.findViewById(j.c.b.e.b).setVisibility(this.f830g);
        for (e eVar : this.c) {
            g fVar = eVar instanceof d ? new f(this.b, this) : new g(this.b, this);
            fVar.d(eVar);
            linearLayout.addView(fVar.b());
        }
    }

    public void c(e eVar) {
        this.c.add(eVar);
    }

    public void d(String str, int i2, String str2, String str3, Object obj) {
        e eVar = new e();
        eVar.b = i2;
        eVar.a = str;
        eVar.e = obj;
        eVar.d = str2;
        this.c.add(eVar);
    }

    public void e(String str, String str2, String str3, String str4, Object obj) {
        e eVar = new e();
        eVar.c = str2;
        eVar.a = str;
        eVar.e = obj;
        eVar.d = str3;
        eVar.f = str4;
        this.c.add(eVar);
    }

    public void f() {
        com.garena.pay.android.j.a.a(this.b);
        a();
    }

    public void g(boolean z) {
        com.garena.pay.android.k.b bVar = this.a;
        if (bVar != null && z) {
            bVar.b();
        } else {
            if (bVar == null || z) {
                return;
            }
            bVar.f();
        }
    }

    public b h() {
        return this.d;
    }

    public void i(b bVar) {
        this.d = bVar;
    }

    public void j(int i2) {
        this.f830g = i2;
    }

    public void k(String str) {
        this.f = str;
    }

    public void l(View view) {
        com.garena.pay.android.k.b bVar = new com.garena.pay.android.k.b(this.e, false, false);
        this.a = bVar;
        bVar.d(new a());
        this.a.e(view);
    }
}
