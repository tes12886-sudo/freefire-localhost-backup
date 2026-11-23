package com.facebook.share.d;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.facebook.internal.i;
import com.facebook.internal.j;
import com.facebook.share.b.f;
import com.facebook.share.b.h;
import com.facebook.share.b.l;
import com.facebook.share.b.o;
import com.facebook.share.c.e;
import com.facebook.share.c.g;
import com.facebook.share.c.k;
import com.facebook.share.c.m;
import com.facebook.share.c.n;
import java.util.ArrayList;
import java.util.List;

/* JADX WARN: Unexpected interfaces in signature: [java.lang.Object] */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class b extends j<e, com.facebook.share.a> {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f789h = com.facebook.internal.e.c.Message.a();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f790g;

    /* JADX INFO: renamed from: com.facebook.share.d.b$b, reason: collision with other inner class name */
    private class C0106b extends j<e, com.facebook.share.a>.a {

        /* JADX INFO: renamed from: com.facebook.share.d.b$b$a */
        class a implements i.a {
            final /* synthetic */ com.facebook.internal.a a;
            final /* synthetic */ e b;
            final /* synthetic */ boolean c;

            a(C0106b c0106b, com.facebook.internal.a aVar, e eVar, boolean z) {
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

        private C0106b() {
            super(b.this);
        }

        @Override // com.facebook.internal.j.a
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public boolean a(e eVar, boolean z) {
            return eVar != null && b.q(eVar.getClass());
        }

        @Override // com.facebook.internal.j.a
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public com.facebook.internal.a b(e eVar) {
            l.v(eVar);
            com.facebook.internal.a aVarE = b.this.e();
            boolean zS = b.this.s();
            b.t(b.this.f(), eVar, aVarE);
            i.j(aVarE, new a(this, aVarE, eVar, zS), b.r(eVar.getClass()));
            return aVarE;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public b(Activity activity) {
        int i2 = f789h;
        super(activity, i2);
        this.f790g = false;
        o.x(i2);
    }

    public static boolean q(Class<? extends e> cls) {
        com.facebook.internal.h hVarR = r(cls);
        return hVarR != null && i.a(hVarR);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.facebook.internal.h r(Class<? extends e> cls) {
        if (g.class.isAssignableFrom(cls)) {
            return f.MESSAGE_DIALOG;
        }
        if (k.class.isAssignableFrom(cls)) {
            return f.MESSENGER_GENERIC_TEMPLATE;
        }
        if (n.class.isAssignableFrom(cls)) {
            return f.MESSENGER_OPEN_GRAPH_MUSIC_TEMPLATE;
        }
        if (m.class.isAssignableFrom(cls)) {
            return f.MESSENGER_MEDIA_TEMPLATE;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void t(Context context, e eVar, com.facebook.internal.a aVar) {
        String str;
        com.facebook.internal.h hVarR = r(eVar.getClass());
        if (hVarR == f.MESSAGE_DIALOG) {
            str = "status";
        } else if (hVarR == f.MESSENGER_GENERIC_TEMPLATE) {
            str = "GenericTemplate";
        } else if (hVarR == f.MESSENGER_MEDIA_TEMPLATE) {
            str = "MediaTemplate";
        } else {
            str = hVarR == f.MESSENGER_OPEN_GRAPH_MUSIC_TEMPLATE ? "OpenGraphMusicTemplate" : "unknown";
        }
        com.facebook.j0.m mVar = new com.facebook.j0.m(context);
        Bundle bundle = new Bundle();
        bundle.putString("fb_share_dialog_content_type", str);
        bundle.putString("fb_share_dialog_content_uuid", aVar.d().toString());
        bundle.putString("fb_share_dialog_content_page_id", eVar.b());
        mVar.g("fb_messenger_share_dialog_show", bundle);
    }

    @Override // com.facebook.internal.j
    protected com.facebook.internal.a e() {
        return new com.facebook.internal.a(h());
    }

    @Override // com.facebook.internal.j
    protected List<j<e, com.facebook.share.a>.a> g() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C0106b());
        return arrayList;
    }

    @Override // com.facebook.internal.j
    protected void k(com.facebook.internal.e eVar, com.facebook.l<com.facebook.share.a> lVar) {
        o.w(h(), eVar, lVar);
    }

    public boolean s() {
        return this.f790g;
    }
}
