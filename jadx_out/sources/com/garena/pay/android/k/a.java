package com.garena.pay.android.k;

import android.app.Activity;
import android.view.View;
import com.garena.pay.android.data.GGPayment;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class a {
    public static b a;
    private static c b;

    /* JADX INFO: renamed from: com.garena.pay.android.k.a$a, reason: collision with other inner class name */
    class C0110a implements c.b {
        final /* synthetic */ List a;

        C0110a(List list) {
            this.a = list;
        }

        @Override // com.garena.pay.android.k.c.b
        public void a() {
            a.a.a();
        }

        @Override // com.garena.pay.android.k.c.b
        public void b(Object obj) {
            b bVar;
            Integer num = (Integer) obj;
            if (num.intValue() > this.a.size() || (bVar = a.a) == null) {
                return;
            }
            bVar.b((GGPayment.Denomination) this.a.get(num.intValue()));
        }
    }

    public interface b {
        void a();

        void b(GGPayment.Denomination denomination);
    }

    public static void a(boolean z) {
        c cVar = b;
        if (cVar != null) {
            cVar.g(z);
        }
    }

    public static void b(Activity activity, List<GGPayment.Denomination> list, String str) {
        c cVar = new c(activity);
        b = cVar;
        cVar.k(String.format(com.garena.pay.android.j.d.b(activity, j.c.b.g.e), str));
        int i2 = 0;
        for (GGPayment.Denomination denomination : list) {
            d dVar = new d();
            dVar.c = denomination.getIconUrl();
            dVar.a = denomination.getName();
            dVar.e = Integer.valueOf(i2);
            dVar.d = denomination.getPrice();
            denomination.isInPromotion();
            if (denomination.getPromoPoints() > 0) {
                dVar.f = activity.getString(j.c.b.g.f1943h, new Object[]{"" + denomination.getPromoPoints()});
            }
            b.c(dVar);
            i2++;
        }
        b.i(new C0110a(list));
    }

    public static void c(b bVar) {
        a = bVar;
    }

    public static void d(View view) {
        b.j(8);
        b.f();
        b.l(view);
    }
}
