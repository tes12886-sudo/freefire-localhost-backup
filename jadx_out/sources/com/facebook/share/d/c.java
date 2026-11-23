package com.facebook.share.d;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import com.facebook.internal.b0;
import com.facebook.internal.h0;
import com.facebook.internal.i;
import com.facebook.internal.j;
import com.facebook.share.b.h;
import com.facebook.share.b.l;
import com.facebook.share.b.m;
import com.facebook.share.b.n;
import com.facebook.share.b.o;
import com.facebook.share.b.p;
import com.facebook.share.b.q;
import com.facebook.share.c.t;
import com.facebook.share.c.u;
import com.facebook.share.c.v;
import com.facebook.share.c.x;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/* JADX WARN: Unexpected interfaces in signature: [java.lang.Object] */
/* JADX INFO: loaded from: classes.dex */
public final class c extends j<com.facebook.share.c.e, com.facebook.share.a> {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String f791i = "c";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final int f792j = com.facebook.internal.e.c.Share.a();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f793g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f794h;

    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[d.values().length];
            a = iArr;
            try {
                iArr[d.AUTOMATIC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[d.WEB.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[d.NATIVE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    private class b extends j<com.facebook.share.c.e, com.facebook.share.a>.a {

        class a implements i.a {
            final /* synthetic */ com.facebook.internal.a a;
            final /* synthetic */ com.facebook.share.c.e b;
            final /* synthetic */ boolean c;

            a(b bVar, com.facebook.internal.a aVar, com.facebook.share.c.e eVar, boolean z) {
                this.a = aVar;
                this.b = eVar;
                this.c = z;
            }

            @Override // com.facebook.internal.i.a
            public Bundle a() {
                return com.facebook.share.b.e.e(this.a.d(), this.b, this.c);
            }

            @Override // com.facebook.internal.i.a
            public Bundle b() {
                return h.k(this.a.d(), this.b, this.c);
            }
        }

        private b() {
            super(c.this);
        }

        /* synthetic */ b(c cVar, a aVar) {
            this();
        }

        @Override // com.facebook.internal.j.a
        public Object c() {
            return d.NATIVE;
        }

        @Override // com.facebook.internal.j.a
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public boolean a(com.facebook.share.c.e eVar, boolean z) {
            return (eVar instanceof com.facebook.share.c.d) && c.v(eVar.getClass());
        }

        @Override // com.facebook.internal.j.a
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public com.facebook.internal.a b(com.facebook.share.c.e eVar) {
            l.w(eVar);
            com.facebook.internal.a aVarE = c.this.e();
            i.j(aVarE, new a(this, aVarE, eVar, c.this.z()), c.y(eVar.getClass()));
            return aVarE;
        }
    }

    /* JADX INFO: renamed from: com.facebook.share.d.c$c, reason: collision with other inner class name */
    private class C0107c extends j<com.facebook.share.c.e, com.facebook.share.a>.a {
        private C0107c() {
            super(c.this);
        }

        /* synthetic */ C0107c(c cVar, a aVar) {
            this();
        }

        @Override // com.facebook.internal.j.a
        public Object c() {
            return d.FEED;
        }

        @Override // com.facebook.internal.j.a
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public boolean a(com.facebook.share.c.e eVar, boolean z) {
            return (eVar instanceof com.facebook.share.c.g) || (eVar instanceof n);
        }

        @Override // com.facebook.internal.j.a
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public com.facebook.internal.a b(com.facebook.share.c.e eVar) {
            Bundle bundleF;
            c cVar = c.this;
            cVar.A(cVar.f(), eVar, d.FEED);
            com.facebook.internal.a aVarE = c.this.e();
            if (eVar instanceof com.facebook.share.c.g) {
                com.facebook.share.c.g gVar = (com.facebook.share.c.g) eVar;
                l.y(gVar);
                bundleF = q.g(gVar);
            } else {
                bundleF = q.f((n) eVar);
            }
            i.l(aVarE, "feed", bundleF);
            return aVarE;
        }
    }

    public enum d {
        AUTOMATIC,
        NATIVE,
        WEB,
        FEED
    }

    private class e extends j<com.facebook.share.c.e, com.facebook.share.a>.a {

        class a implements i.a {
            final /* synthetic */ com.facebook.internal.a a;
            final /* synthetic */ com.facebook.share.c.e b;
            final /* synthetic */ boolean c;

            a(e eVar, com.facebook.internal.a aVar, com.facebook.share.c.e eVar2, boolean z) {
                this.a = aVar;
                this.b = eVar2;
                this.c = z;
            }

            @Override // com.facebook.internal.i.a
            public Bundle a() {
                return com.facebook.share.b.e.e(this.a.d(), this.b, this.c);
            }

            @Override // com.facebook.internal.i.a
            public Bundle b() {
                return h.k(this.a.d(), this.b, this.c);
            }
        }

        private e() {
            super(c.this);
        }

        /* synthetic */ e(c cVar, a aVar) {
            this();
        }

        @Override // com.facebook.internal.j.a
        public Object c() {
            return d.NATIVE;
        }

        @Override // com.facebook.internal.j.a
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public boolean a(com.facebook.share.c.e eVar, boolean z) {
            boolean zA;
            if (eVar == null || (eVar instanceof com.facebook.share.c.d) || (eVar instanceof v)) {
                return false;
            }
            if (z) {
                zA = true;
            } else {
                zA = eVar.f() != null ? i.a(m.HASHTAG) : true;
                if ((eVar instanceof com.facebook.share.c.g) && !h0.Y(((com.facebook.share.c.g) eVar).k())) {
                    zA &= i.a(m.LINK_SHARE_QUOTES);
                }
            }
            return zA && c.v(eVar.getClass());
        }

        @Override // com.facebook.internal.j.a
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public com.facebook.internal.a b(com.facebook.share.c.e eVar) {
            c cVar = c.this;
            cVar.A(cVar.f(), eVar, d.NATIVE);
            l.w(eVar);
            com.facebook.internal.a aVarE = c.this.e();
            i.j(aVarE, new a(this, aVarE, eVar, c.this.z()), c.y(eVar.getClass()));
            return aVarE;
        }
    }

    private class f extends j<com.facebook.share.c.e, com.facebook.share.a>.a {

        class a implements i.a {
            final /* synthetic */ com.facebook.internal.a a;
            final /* synthetic */ com.facebook.share.c.e b;
            final /* synthetic */ boolean c;

            a(f fVar, com.facebook.internal.a aVar, com.facebook.share.c.e eVar, boolean z) {
                this.a = aVar;
                this.b = eVar;
                this.c = z;
            }

            @Override // com.facebook.internal.i.a
            public Bundle a() {
                return com.facebook.share.b.e.e(this.a.d(), this.b, this.c);
            }

            @Override // com.facebook.internal.i.a
            public Bundle b() {
                return h.k(this.a.d(), this.b, this.c);
            }
        }

        private f() {
            super(c.this);
        }

        /* synthetic */ f(c cVar, a aVar) {
            this();
        }

        @Override // com.facebook.internal.j.a
        public Object c() {
            return d.NATIVE;
        }

        @Override // com.facebook.internal.j.a
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public boolean a(com.facebook.share.c.e eVar, boolean z) {
            return (eVar instanceof v) && c.v(eVar.getClass());
        }

        @Override // com.facebook.internal.j.a
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public com.facebook.internal.a b(com.facebook.share.c.e eVar) {
            l.x(eVar);
            com.facebook.internal.a aVarE = c.this.e();
            i.j(aVarE, new a(this, aVarE, eVar, c.this.z()), c.y(eVar.getClass()));
            return aVarE;
        }
    }

    private class g extends j<com.facebook.share.c.e, com.facebook.share.a>.a {
        private g() {
            super(c.this);
        }

        /* synthetic */ g(c cVar, a aVar) {
            this();
        }

        private u e(u uVar, UUID uuid) {
            u.b bVarR = new u.b().r(uVar);
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (int i2 = 0; i2 < uVar.h().size(); i2++) {
                t tVarI = uVar.h().get(i2);
                Bitmap bitmapC = tVarI.c();
                if (bitmapC != null) {
                    b0.a aVarD = b0.d(uuid, bitmapC);
                    t.b bVarM = new t.b().m(tVarI);
                    bVarM.q(Uri.parse(aVarD.b()));
                    bVarM.o(null);
                    tVarI = bVarM.i();
                    arrayList2.add(aVarD);
                }
                arrayList.add(tVarI);
            }
            bVarR.s(arrayList);
            b0.a(arrayList2);
            return bVarR.q();
        }

        private String g(com.facebook.share.c.e eVar) {
            if ((eVar instanceof com.facebook.share.c.g) || (eVar instanceof u)) {
                return "share";
            }
            if (eVar instanceof com.facebook.share.c.q) {
                return "share_open_graph";
            }
            return null;
        }

        @Override // com.facebook.internal.j.a
        public Object c() {
            return d.WEB;
        }

        @Override // com.facebook.internal.j.a
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public boolean a(com.facebook.share.c.e eVar, boolean z) {
            return eVar != null && c.w(eVar);
        }

        @Override // com.facebook.internal.j.a
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public com.facebook.internal.a b(com.facebook.share.c.e eVar) {
            Bundle bundleD;
            c cVar = c.this;
            cVar.A(cVar.f(), eVar, d.WEB);
            com.facebook.internal.a aVarE = c.this.e();
            l.y(eVar);
            if (eVar instanceof com.facebook.share.c.g) {
                bundleD = q.b((com.facebook.share.c.g) eVar);
            } else {
                bundleD = eVar instanceof u ? q.d(e((u) eVar, aVarE.d())) : q.c((com.facebook.share.c.q) eVar);
            }
            i.l(aVarE, g(eVar), bundleD);
            return aVarE;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public c(Activity activity) {
        int i2 = f792j;
        super(activity, i2);
        this.f793g = false;
        this.f794h = true;
        o.x(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A(Context context, com.facebook.share.c.e eVar, d dVar) {
        String str;
        if (this.f794h) {
            dVar = d.AUTOMATIC;
        }
        int i2 = a.a[dVar.ordinal()];
        String str2 = "unknown";
        if (i2 == 1) {
            str = "automatic";
        } else if (i2 != 2) {
            str = i2 != 3 ? "unknown" : "native";
        } else {
            str = "web";
        }
        com.facebook.internal.h hVarY = y(eVar.getClass());
        if (hVarY == m.SHARE_DIALOG) {
            str2 = "status";
        } else if (hVarY == m.PHOTOS) {
            str2 = "photo";
        } else if (hVarY == m.VIDEO) {
            str2 = "video";
        } else if (hVarY == com.facebook.share.b.i.OG_ACTION_DIALOG) {
            str2 = "open_graph";
        }
        com.facebook.j0.m mVar = new com.facebook.j0.m(context);
        Bundle bundle = new Bundle();
        bundle.putString("fb_share_dialog_show", str);
        bundle.putString("fb_share_dialog_content_type", str2);
        mVar.g("fb_share_dialog_show", bundle);
    }

    public static boolean u(Class<? extends com.facebook.share.c.e> cls) {
        return x(cls) || v(cls);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean v(Class<? extends com.facebook.share.c.e> cls) {
        com.facebook.internal.h hVarY = y(cls);
        return hVarY != null && i.a(hVarY);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean w(com.facebook.share.c.e eVar) {
        if (!x(eVar.getClass())) {
            return false;
        }
        if (!(eVar instanceof com.facebook.share.c.q)) {
            return true;
        }
        try {
            o.B((com.facebook.share.c.q) eVar);
            return true;
        } catch (Exception e2) {
            h0.g0(f791i, "canShow returned false because the content of the Opem Graph object can't be shared via the web dialog", e2);
            return false;
        }
    }

    private static boolean x(Class<? extends com.facebook.share.c.e> cls) {
        return com.facebook.share.c.g.class.isAssignableFrom(cls) || com.facebook.share.c.q.class.isAssignableFrom(cls) || (u.class.isAssignableFrom(cls) && com.facebook.a.o());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.facebook.internal.h y(Class<? extends com.facebook.share.c.e> cls) {
        if (com.facebook.share.c.g.class.isAssignableFrom(cls)) {
            return m.SHARE_DIALOG;
        }
        if (u.class.isAssignableFrom(cls)) {
            return m.PHOTOS;
        }
        if (x.class.isAssignableFrom(cls)) {
            return m.VIDEO;
        }
        if (com.facebook.share.c.q.class.isAssignableFrom(cls)) {
            return com.facebook.share.b.i.OG_ACTION_DIALOG;
        }
        if (com.facebook.share.c.i.class.isAssignableFrom(cls)) {
            return m.MULTIMEDIA;
        }
        if (com.facebook.share.c.d.class.isAssignableFrom(cls)) {
            return com.facebook.share.b.a.SHARE_CAMERA_EFFECT;
        }
        if (v.class.isAssignableFrom(cls)) {
            return p.SHARE_STORY_ASSET;
        }
        return null;
    }

    @Override // com.facebook.internal.j
    protected com.facebook.internal.a e() {
        return new com.facebook.internal.a(h());
    }

    @Override // com.facebook.internal.j
    protected List<j<com.facebook.share.c.e, com.facebook.share.a>.a> g() {
        ArrayList arrayList = new ArrayList();
        a aVar = null;
        arrayList.add(new e(this, aVar));
        arrayList.add(new C0107c(this, aVar));
        arrayList.add(new g(this, aVar));
        arrayList.add(new b(this, aVar));
        arrayList.add(new f(this, aVar));
        return arrayList;
    }

    @Override // com.facebook.internal.j
    protected void k(com.facebook.internal.e eVar, com.facebook.l<com.facebook.share.a> lVar) {
        o.w(h(), eVar, lVar);
    }

    public boolean z() {
        return this.f793g;
    }
}
