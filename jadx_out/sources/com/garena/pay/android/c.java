package com.garena.pay.android;

import android.R;
import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.widget.ProgressBar;
import com.beetalk.sdk.networking.model.ChannelsResp;
import com.beetalk.sdk.u.j;
import com.garena.pay.android.data.GGPayment;
import i.i;
import java.io.Serializable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
class c implements Serializable {
    private com.garena.pay.android.d c;
    private transient GGPayActivity e;
    private transient ProgressDialog f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private transient g f828g;
    private LinkedHashMap<String, com.garena.pay.android.e> a = new LinkedHashMap<>();
    private com.garena.pay.android.e b = null;
    private h d = h.INIT;

    class a implements i.g<ChannelsResp, Void> {
        final /* synthetic */ com.garena.pay.android.d a;

        a(com.garena.pay.android.d dVar) {
            this.a = dVar;
        }

        @Override // i.g
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Void a(i<ChannelsResp> iVar) {
            c.this.o();
            if (iVar.x() || iVar.t() == null) {
                c.this.l(com.garena.pay.android.b.PAYMENT_NETWORK_CONNECTION_EXCEPTION);
                return null;
            }
            ChannelsResp channelsRespT = iVar.t();
            com.beetalk.sdk.x.a.a("Response Recd from Server: %s", channelsRespT);
            if (channelsRespT.getErrorCode() != com.garena.pay.android.b.SUCCESS.c().intValue()) {
                c.this.l(com.garena.pay.android.b.d(channelsRespT.getErrorCode()));
                return null;
            }
            c.this.c = this.a;
            c cVar = c.this;
            cVar.a = cVar.t(cVar.c, channelsRespT);
            c.this.v();
            return null;
        }
    }

    class b implements i.g<j, Void> {
        b() {
        }

        @Override // i.g
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Void a(i<j> iVar) {
            if (iVar.x() || iVar.v() || iVar.t() == null) {
                c.this.l(com.garena.pay.android.b.PAYMENT_CANNOT_START_ACTIVITY);
                return null;
            }
            c.this.p(iVar.t());
            return null;
        }
    }

    /* JADX INFO: renamed from: com.garena.pay.android.c$c, reason: collision with other inner class name */
    class C0109c implements i.g<Boolean, Boolean> {
        C0109c() {
        }

        @Override // i.g
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Boolean a(i<Boolean> iVar) {
            c.this.o();
            return Boolean.valueOf(!iVar.x() && iVar.t().booleanValue());
        }
    }

    class d implements com.garena.pay.android.k.h.b {
        d() {
        }

        @Override // com.garena.pay.android.k.h.b
        public void a() {
            com.beetalk.sdk.x.a.a("User Dismissed the Dialog Box. Therefore invoking failed to pay", new Object[0]);
            c.this.l(com.garena.pay.android.b.PAYMENT_USER_CANCELLED);
        }

        @Override // com.garena.pay.android.k.h.b
        public void b(com.garena.pay.android.e eVar) {
            c.this.d = h.CHOOSE_ITEM;
            c.this.b = eVar;
            c.this.c.j(c.this.b.h());
            c.this.v();
        }
    }

    class e implements com.garena.pay.android.k.a.b {
        e() {
        }

        @Override // com.garena.pay.android.k.a.b
        public void a() {
            com.beetalk.sdk.x.a.a("User Dismissed the Dialog Box. Therefore invoking failed to pay", new Object[0]);
            c.this.l(com.garena.pay.android.b.PAYMENT_USER_CANCELLED);
        }

        @Override // com.garena.pay.android.k.a.b
        public void b(GGPayment.Denomination denomination) {
            c.this.d = h.READY_TO_PAY;
            c.this.c.h(denomination);
            c.this.v();
            com.beetalk.sdk.x.a.a("We have a denomination chosen %s Continue with payment next step", denomination.getName());
        }
    }

    static /* synthetic */ class f {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[h.values().length];
            a = iArr;
            try {
                iArr[h.CHOOSE_CHANNEL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[h.CHOOSE_ITEM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[h.READY_TO_PAY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    interface g {
        void a(j jVar);
    }

    private enum h {
        INIT(0),
        CHOOSE_CHANNEL(1),
        CHOOSE_ITEM(2),
        READY_TO_PAY(3),
        DONE(4);

        private final int a;

        h(int i2) {
            this.a = i2;
        }

        public int c() {
            return this.a;
        }

        public h d() {
            h hVar = INIT;
            return this == hVar ? hVar : e(c() - 1);
        }

        public h e(int i2) {
            return (i2 < 0 || i2 > 4) ? DONE : values()[i2];
        }
    }

    c() {
    }

    private void A() {
        if (this.f == null) {
            this.f = new ProgressDialog(m());
        }
        this.f.setCancelable(false);
        this.f.show();
        this.f.setContentView(new ProgressBar(m()));
    }

    private void B(com.garena.pay.android.d dVar) {
        A();
        com.beetalk.sdk.t.e.d().e(n(), false, dVar).j(new a(dVar), i.f1903k);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l(com.garena.pay.android.b bVar) {
        p(j.a(this.c, bVar, bVar.e()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o() {
        ProgressDialog progressDialog = this.f;
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p(j jVar) {
        g gVar;
        if (jVar == null || (gVar = this.f828g) == null) {
            return;
        }
        gVar.a(jVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public LinkedHashMap<String, com.garena.pay.android.e> t(com.garena.pay.android.d dVar, ChannelsResp channelsResp) {
        Integer numValueOf;
        com.beetalk.sdk.x.a.a("JSON From Payment Server %s", channelsResp);
        List<GGPayment.PaymentChannel> channels = channelsResp.getChannels();
        LinkedHashMap<String, com.garena.pay.android.e> linkedHashMap = new LinkedHashMap<>();
        if (channels == null) {
            return linkedHashMap;
        }
        for (GGPayment.PaymentChannel paymentChannel : channels) {
            if (paymentChannel.getItems() != null && !paymentChannel.getItems().isEmpty() && paymentChannel.getChannelId().equalsIgnoreCase(String.valueOf(201069))) {
                GGPayment gGPaymentC = dVar.c();
                Integer numValueOf2 = null;
                if (gGPaymentC != null) {
                    numValueOf2 = Integer.valueOf(gGPaymentC.getAppServerId());
                    numValueOf = Integer.valueOf(gGPaymentC.getRoleId());
                } else {
                    numValueOf = null;
                }
                NewGoogleIabPayRequestHandler newGoogleIabPayRequestHandler = new NewGoogleIabPayRequestHandler(this.e, numValueOf2, numValueOf);
                newGoogleIabPayRequestHandler.p(paymentChannel);
                newGoogleIabPayRequestHandler.C();
                linkedHashMap.put(String.valueOf(201069), newGoogleIabPayRequestHandler);
            }
        }
        return linkedHashMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v() {
        h hVar;
        if (!com.beetalk.sdk.x.j.b(this.c.a())) {
            this.b = this.a.get(String.valueOf(this.c.a()));
        }
        if (this.b == null && this.a.size() == 1 && this.d == h.CHOOSE_CHANNEL) {
            Iterator<com.garena.pay.android.e> it = this.a.values().iterator();
            while (it.hasNext()) {
                this.b = it.next();
            }
        }
        if (this.b != null && this.c.b() == null) {
            if (this.b.m()) {
                hVar = h.READY_TO_PAY;
            } else {
                this.c.j(this.b.h());
                hVar = h.CHOOSE_ITEM;
            }
            this.d = hVar;
        }
        if (this.b != null && this.c.b() != null) {
            this.c.j(this.b.h());
            this.d = h.READY_TO_PAY;
        }
        int i2 = f.a[this.d.ordinal()];
        if (i2 == 1) {
            y();
            return;
        }
        if (i2 == 2) {
            z();
            return;
        }
        if (i2 != 3) {
            return;
        }
        if (this.b != null) {
            A();
            this.b.q(this.e, this.c, this.c.b().getItemId(), new C0109c()).j(new b(), i.f1903k);
        } else {
            l(com.garena.pay.android.b.PAYMENT_CANNOT_START_ACTIVITY);
        }
        this.d = h.DONE;
    }

    private void y() {
        com.garena.pay.android.k.h.a(false);
        com.garena.pay.android.k.a.a(false);
        com.garena.pay.android.k.h.c(new d());
        com.garena.pay.android.k.h.b(m(), this.a);
        com.garena.pay.android.k.h.d(m().findViewById(j.c.b.e.f1936j));
    }

    private void z() {
        com.garena.pay.android.k.h.a(false);
        com.garena.pay.android.k.a.a(false);
        com.garena.pay.android.k.a.c(new e());
        com.garena.pay.android.k.a.b(m(), this.c.d(), this.c.f());
        com.garena.pay.android.k.a.d(m().findViewById(j.c.b.e.f1936j));
    }

    Activity m() {
        return this.e;
    }

    Context n() {
        return this.e;
    }

    void q() {
        h hVarD = this.d.d();
        this.d = hVarD;
        if (hVarD != h.INIT && this.c != null) {
            v();
        } else {
            m().finish();
            m().overridePendingTransition(0, R.anim.fade_out);
        }
    }

    void r() {
        Iterator<com.garena.pay.android.e> it = this.a.values().iterator();
        while (it.hasNext()) {
            it.next().n();
        }
        ProgressDialog progressDialog = this.f;
        if (progressDialog != null) {
            progressDialog.dismiss();
            this.f = null;
        }
    }

    void s(Intent intent) {
        com.garena.pay.android.e eVar = this.b;
        if (eVar != null) {
            eVar.o(intent);
        }
    }

    void u(com.garena.pay.android.d dVar) {
        h hVar = this.d;
        if (hVar == h.DONE) {
            return;
        }
        if (this.c != null && hVar != h.INIT) {
            v();
        } else {
            this.d = h.CHOOSE_CHANNEL;
            B(dVar);
        }
    }

    void w(GGPayActivity gGPayActivity) {
        this.e = gGPayActivity;
    }

    void x(g gVar) {
        this.f828g = gVar;
    }
}
