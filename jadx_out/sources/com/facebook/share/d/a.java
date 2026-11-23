package com.facebook.share.d;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.facebook.internal.g;
import com.facebook.internal.i;
import com.facebook.internal.i0;
import com.facebook.internal.j;
import com.facebook.l;
import com.facebook.r;
import com.facebook.share.b.k;
import com.facebook.share.b.o;
import com.facebook.share.b.q;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class a extends j<com.facebook.share.c.c, d> {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f788g = com.facebook.internal.e.c.GameRequest.a();

    /* JADX INFO: renamed from: com.facebook.share.d.a$a, reason: collision with other inner class name */
    class C0105a extends k {
        final /* synthetic */ l b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0105a(a aVar, l lVar, l lVar2) {
            super(lVar);
            this.b = lVar2;
        }

        @Override // com.facebook.share.b.k
        public void c(com.facebook.internal.a aVar, Bundle bundle) {
            if (bundle != null) {
                this.b.onSuccess(new d(bundle, null));
            } else {
                a(aVar);
            }
        }
    }

    class b implements com.facebook.internal.e.a {
        final /* synthetic */ k a;

        b(k kVar) {
            this.a = kVar;
        }

        @Override // com.facebook.internal.e.a
        public boolean a(int i2, Intent intent) {
            return o.p(a.this.h(), i2, intent, this.a);
        }
    }

    private class c extends j<com.facebook.share.c.c, d>.a {
        private c() {
            super(a.this);
        }

        /* synthetic */ c(a aVar, C0105a c0105a) {
            this();
        }

        @Override // com.facebook.internal.j.a
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public boolean a(com.facebook.share.c.c cVar, boolean z) {
            return g.a() != null && i0.e(a.this.f(), g.b());
        }

        @Override // com.facebook.internal.j.a
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public com.facebook.internal.a b(com.facebook.share.c.c cVar) {
            com.facebook.share.b.d.a(cVar);
            com.facebook.internal.a aVarE = a.this.e();
            Bundle bundleA = q.a(cVar);
            com.facebook.a aVarD = com.facebook.a.d();
            bundleA.putString("app_id", aVarD != null ? aVarD.c() : r.g());
            bundleA.putString("redirect_uri", g.b());
            i.h(aVarE, "apprequests", bundleA);
            return aVarE;
        }
    }

    public static final class d {
        List<String> a;

        private d(Bundle bundle) {
            bundle.getString("request");
            this.a = new ArrayList();
            while (bundle.containsKey(String.format("to[%d]", Integer.valueOf(this.a.size())))) {
                List<String> list = this.a;
                list.add(bundle.getString(String.format("to[%d]", Integer.valueOf(list.size()))));
            }
        }

        /* synthetic */ d(Bundle bundle, C0105a c0105a) {
            this(bundle);
        }
    }

    private class e extends j<com.facebook.share.c.c, d>.a {
        private e() {
            super(a.this);
        }

        /* synthetic */ e(a aVar, C0105a c0105a) {
            this();
        }

        @Override // com.facebook.internal.j.a
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public boolean a(com.facebook.share.c.c cVar, boolean z) {
            return true;
        }

        @Override // com.facebook.internal.j.a
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public com.facebook.internal.a b(com.facebook.share.c.c cVar) {
            com.facebook.share.b.d.a(cVar);
            com.facebook.internal.a aVarE = a.this.e();
            i.l(aVarE, "apprequests", q.a(cVar));
            return aVarE;
        }
    }

    public a(Activity activity) {
        super(activity, f788g);
    }

    public static boolean o() {
        return true;
    }

    @Override // com.facebook.internal.j
    protected com.facebook.internal.a e() {
        return new com.facebook.internal.a(h());
    }

    @Override // com.facebook.internal.j
    protected List<j<com.facebook.share.c.c, d>.a> g() {
        ArrayList arrayList = new ArrayList();
        C0105a c0105a = null;
        arrayList.add(new c(this, c0105a));
        arrayList.add(new e(this, c0105a));
        return arrayList;
    }

    @Override // com.facebook.internal.j
    protected void k(com.facebook.internal.e eVar, l<d> lVar) {
        eVar.c(h(), new b(lVar == null ? null : new C0105a(this, lVar, lVar)));
    }
}
