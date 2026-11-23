package com.facebook.share.b;

import android.graphics.Bitmap;
import android.net.Uri;
import com.facebook.internal.h0;
import com.facebook.internal.i0;
import com.facebook.share.c.r;
import com.facebook.share.c.s;
import com.facebook.share.c.t;
import com.facebook.share.c.u;
import com.facebook.share.c.v;
import com.facebook.share.c.w;
import com.facebook.share.c.x;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public class l {
    private static c a;
    private static c b;
    private static c c;

    private static class b extends c {
        private b() {
            super();
        }

        @Override // com.facebook.share.b.l.c
        public void o(v vVar) {
            l.S(vVar, this);
        }
    }

    private static class c {
        private boolean a;

        private c() {
            this.a = false;
        }

        public boolean a() {
            return this.a;
        }

        public void b(com.facebook.share.c.d dVar) {
            l.u(dVar, this);
        }

        public void c(com.facebook.share.c.g gVar) {
            l.z(gVar, this);
        }

        public void d(com.facebook.share.c.h hVar) {
            l.B(hVar, this);
        }

        public void e(com.facebook.share.c.i iVar) {
            l.A(iVar, this);
        }

        public void f(com.facebook.share.c.k kVar) {
            l.P(kVar);
        }

        public void g(com.facebook.share.c.m mVar) {
            l.Q(mVar);
        }

        public void h(com.facebook.share.c.n nVar) {
            l.C(nVar);
        }

        public void i(com.facebook.share.c.p pVar) {
            l.D(pVar, this);
        }

        public void j(com.facebook.share.c.q qVar) {
            this.a = true;
            l.E(qVar, this);
        }

        public void k(r rVar) {
            l.G(rVar, this);
        }

        public void l(s sVar, boolean z) {
            l.H(sVar, this, z);
        }

        public void m(t tVar) {
            l.M(tVar, this);
        }

        public void n(u uVar) {
            l.K(uVar, this);
        }

        public void o(v vVar) {
            l.S(vVar, this);
        }

        public void p(w wVar) {
            l.T(wVar, this);
        }

        public void q(x xVar) {
            l.U(xVar, this);
        }
    }

    private static class d extends c {
        private d() {
            super();
        }

        @Override // com.facebook.share.b.l.c
        public void e(com.facebook.share.c.i iVar) {
            throw new com.facebook.n("Cannot share ShareMediaContent via web sharing dialogs");
        }

        @Override // com.facebook.share.b.l.c
        public void m(t tVar) {
            l.N(tVar, this);
        }

        @Override // com.facebook.share.b.l.c
        public void q(x xVar) {
            throw new com.facebook.n("Cannot share ShareVideoContent via web sharing dialogs");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void A(com.facebook.share.c.i iVar, c cVar) {
        List<com.facebook.share.c.h> listH = iVar.h();
        if (listH == null || listH.isEmpty()) {
            throw new com.facebook.n("Must specify at least one medium in ShareMediaContent.");
        }
        if (listH.size() > 6) {
            throw new com.facebook.n(String.format(Locale.ROOT, "Cannot add more than %d media.", 6));
        }
        Iterator<com.facebook.share.c.h> it = listH.iterator();
        while (it.hasNext()) {
            cVar.d(it.next());
        }
    }

    public static void B(com.facebook.share.c.h hVar, c cVar) {
        if (hVar instanceof t) {
            cVar.m((t) hVar);
        } else {
            if (!(hVar instanceof w)) {
                throw new com.facebook.n(String.format(Locale.ROOT, "Invalid media type: %s", hVar.getClass().getSimpleName()));
            }
            cVar.p((w) hVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void C(com.facebook.share.c.n nVar) {
        if (h0.Y(nVar.b())) {
            throw new com.facebook.n("Must specify Page Id for ShareMessengerOpenGraphMusicTemplateContent");
        }
        if (nVar.i() == null) {
            throw new com.facebook.n("Must specify url for ShareMessengerOpenGraphMusicTemplateContent");
        }
        O(nVar.h());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void D(com.facebook.share.c.p pVar, c cVar) {
        if (pVar == null) {
            throw new com.facebook.n("Must specify a non-null ShareOpenGraphAction");
        }
        if (h0.Y(pVar.e())) {
            throw new com.facebook.n("ShareOpenGraphAction must have a non-empty actionType");
        }
        cVar.l(pVar, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void E(com.facebook.share.c.q qVar, c cVar) {
        cVar.i(qVar.h());
        String strI = qVar.i();
        if (h0.Y(strI)) {
            throw new com.facebook.n("Must specify a previewPropertyName.");
        }
        if (qVar.h().a(strI) != null) {
            return;
        }
        throw new com.facebook.n("Property \"" + strI + "\" was not found on the action. The name of the preview property must match the name of an action property.");
    }

    private static void F(String str, boolean z) {
        if (z) {
            String[] strArrSplit = str.split(":");
            if (strArrSplit.length < 2) {
                throw new com.facebook.n("Open Graph keys must be namespaced: %s", str);
            }
            for (String str2 : strArrSplit) {
                if (str2.isEmpty()) {
                    throw new com.facebook.n("Invalid key found in Open Graph dictionary: %s", str);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void G(r rVar, c cVar) {
        if (rVar == null) {
            throw new com.facebook.n("Cannot share a null ShareOpenGraphObject");
        }
        cVar.l(rVar, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void H(s sVar, c cVar, boolean z) {
        for (String str : sVar.d()) {
            F(str, z);
            Object objA = sVar.a(str);
            if (objA instanceof List) {
                for (Object obj : (List) objA) {
                    if (obj == null) {
                        throw new com.facebook.n("Cannot put null objects in Lists in ShareOpenGraphObjects and ShareOpenGraphActions");
                    }
                    I(obj, cVar);
                }
            } else {
                I(objA, cVar);
            }
        }
    }

    private static void I(Object obj, c cVar) {
        if (obj instanceof r) {
            cVar.k((r) obj);
        } else if (obj instanceof t) {
            cVar.m((t) obj);
        }
    }

    private static void J(t tVar) {
        if (tVar == null) {
            throw new com.facebook.n("Cannot share a null SharePhoto");
        }
        Bitmap bitmapC = tVar.c();
        Uri uriE = tVar.e();
        if (bitmapC == null && uriE == null) {
            throw new com.facebook.n("SharePhoto does not have a Bitmap or ImageUrl specified");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void K(u uVar, c cVar) {
        List<t> listH = uVar.h();
        if (listH == null || listH.isEmpty()) {
            throw new com.facebook.n("Must specify at least one Photo in SharePhotoContent.");
        }
        if (listH.size() > 6) {
            throw new com.facebook.n(String.format(Locale.ROOT, "Cannot add more than %d photos.", 6));
        }
        Iterator<t> it = listH.iterator();
        while (it.hasNext()) {
            cVar.m(it.next());
        }
    }

    private static void L(t tVar, c cVar) {
        J(tVar);
        Bitmap bitmapC = tVar.c();
        Uri uriE = tVar.e();
        if (bitmapC == null && h0.a0(uriE) && !cVar.a()) {
            throw new com.facebook.n("Cannot set the ImageUrl of a SharePhoto to the Uri of an image on the web when sharing SharePhotoContent");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void M(t tVar, c cVar) {
        L(tVar, cVar);
        if (tVar.c() == null && h0.a0(tVar.e())) {
            return;
        }
        i0.d(com.facebook.r.f());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void N(t tVar, c cVar) {
        J(tVar);
    }

    private static void O(com.facebook.share.c.j jVar) {
        if (jVar == null) {
            return;
        }
        if (h0.Y(jVar.a())) {
            throw new com.facebook.n("Must specify title for ShareMessengerActionButton");
        }
        if (jVar instanceof com.facebook.share.c.o) {
            R((com.facebook.share.c.o) jVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void P(com.facebook.share.c.k kVar) {
        if (h0.Y(kVar.b())) {
            throw new com.facebook.n("Must specify Page Id for ShareMessengerGenericTemplateContent");
        }
        if (kVar.h() == null) {
            throw new com.facebook.n("Must specify element for ShareMessengerGenericTemplateContent");
        }
        if (h0.Y(kVar.h().e())) {
            throw new com.facebook.n("Must specify title for ShareMessengerGenericTemplateElement");
        }
        O(kVar.h().a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void Q(com.facebook.share.c.m mVar) {
        if (h0.Y(mVar.b())) {
            throw new com.facebook.n("Must specify Page Id for ShareMessengerMediaTemplateContent");
        }
        if (mVar.k() == null && h0.Y(mVar.h())) {
            throw new com.facebook.n("Must specify either attachmentId or mediaURL for ShareMessengerMediaTemplateContent");
        }
        O(mVar.i());
    }

    private static void R(com.facebook.share.c.o oVar) {
        if (oVar.e() == null) {
            throw new com.facebook.n("Must specify url for ShareMessengerURLActionButton");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void S(v vVar, c cVar) {
        if (vVar == null || (vVar.i() == null && vVar.k() == null)) {
            throw new com.facebook.n("Must pass the Facebook app a background asset, a sticker asset, or both");
        }
        if (vVar.i() != null) {
            cVar.d(vVar.i());
        }
        if (vVar.k() != null) {
            cVar.m(vVar.k());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void T(w wVar, c cVar) {
        if (wVar == null) {
            throw new com.facebook.n("Cannot share a null ShareVideo");
        }
        Uri uriC = wVar.c();
        if (uriC == null) {
            throw new com.facebook.n("ShareVideo does not have a LocalUrl specified");
        }
        if (!h0.T(uriC) && !h0.W(uriC)) {
            throw new com.facebook.n("ShareVideo must reference a video that is on the device");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void U(x xVar, c cVar) {
        cVar.p(xVar.k());
        t tVarJ = xVar.j();
        if (tVarJ != null) {
            cVar.m(tVarJ);
        }
    }

    private static c q() {
        if (b == null) {
            b = new c();
        }
        return b;
    }

    private static c r() {
        if (c == null) {
            c = new b();
        }
        return c;
    }

    private static c s() {
        if (a == null) {
            a = new d();
        }
        return a;
    }

    private static void t(com.facebook.share.c.e eVar, c cVar) {
        if (eVar == null) {
            throw new com.facebook.n("Must provide non-null content to share");
        }
        if (eVar instanceof com.facebook.share.c.g) {
            cVar.c((com.facebook.share.c.g) eVar);
            return;
        }
        if (eVar instanceof u) {
            cVar.n((u) eVar);
            return;
        }
        if (eVar instanceof x) {
            cVar.q((x) eVar);
            return;
        }
        if (eVar instanceof com.facebook.share.c.q) {
            cVar.j((com.facebook.share.c.q) eVar);
            return;
        }
        if (eVar instanceof com.facebook.share.c.i) {
            cVar.e((com.facebook.share.c.i) eVar);
            return;
        }
        if (eVar instanceof com.facebook.share.c.d) {
            cVar.b((com.facebook.share.c.d) eVar);
            return;
        }
        if (eVar instanceof com.facebook.share.c.n) {
            cVar.h((com.facebook.share.c.n) eVar);
            return;
        }
        if (eVar instanceof com.facebook.share.c.m) {
            cVar.g((com.facebook.share.c.m) eVar);
        } else if (eVar instanceof com.facebook.share.c.k) {
            cVar.f((com.facebook.share.c.k) eVar);
        } else if (eVar instanceof v) {
            cVar.o((v) eVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void u(com.facebook.share.c.d dVar, c cVar) {
        if (h0.Y(dVar.i())) {
            throw new com.facebook.n("Must specify a non-empty effectId");
        }
    }

    public static void v(com.facebook.share.c.e eVar) {
        t(eVar, q());
    }

    public static void w(com.facebook.share.c.e eVar) {
        t(eVar, q());
    }

    public static void x(com.facebook.share.c.e eVar) {
        t(eVar, r());
    }

    public static void y(com.facebook.share.c.e eVar) {
        t(eVar, s());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void z(com.facebook.share.c.g gVar, c cVar) {
        Uri uriJ = gVar.j();
        if (uriJ != null && !h0.a0(uriJ)) {
            throw new com.facebook.n("Image Url must be an http:// or https:// url");
        }
    }
}
