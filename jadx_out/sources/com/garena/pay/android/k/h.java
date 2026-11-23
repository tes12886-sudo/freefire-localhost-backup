package com.garena.pay.android.k;

import android.app.Activity;
import android.view.View;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class h {
    public static b a;
    private static c b;

    class a implements c.b {
        final /* synthetic */ HashMap a;

        a(HashMap map) {
            this.a = map;
        }

        @Override // com.garena.pay.android.k.c.b
        public void a() {
            h.a.a();
        }

        @Override // com.garena.pay.android.k.c.b
        public void b(Object obj) {
            b bVar;
            String str = (String) obj;
            if (str == null || (bVar = h.a) == null) {
                return;
            }
            bVar.b((com.garena.pay.android.e) this.a.get(str));
        }
    }

    public interface b {
        void a();

        void b(com.garena.pay.android.e eVar);
    }

    public static void a(boolean z) {
        c cVar = b;
        if (cVar != null) {
            cVar.g(z);
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x007f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:28:0x0071 A[SYNTHETIC] */
    public static void b(Activity activity, HashMap<String, com.garena.pay.android.e> map) {
        String strB;
        int i2;
        String str;
        String strI;
        boolean zD;
        c cVar;
        c cVar2 = b;
        if (cVar2 != null) {
            cVar2.g(false);
        }
        c cVar3 = new c(activity);
        b = cVar3;
        cVar3.k(com.garena.pay.android.j.d.b(activity, j.c.b.g.f1944i));
        for (Map.Entry<String, com.garena.pay.android.e> entry : map.entrySet()) {
            String key = entry.getKey();
            com.garena.pay.android.e value = entry.getValue();
            String strJ = value.j();
            int flag = value.l().getFlag();
            if ((flag & 1) == 1) {
                i2 = j.c.b.g.c;
            } else if ((flag & 2) == 2) {
                i2 = j.c.b.g.b;
            } else {
                if ((flag & 4) == 4) {
                    i2 = j.c.b.g.d;
                } else {
                    strB = "";
                }
                str = strB;
                strI = value.i(activity);
                zD = com.garena.pay.android.j.d.d(strJ);
                cVar = b;
                if (zD) {
                    cVar.d(strI, value.k(), com.garena.pay.android.j.d.b(activity, j.c.b.g.f1942g), str, key);
                } else {
                    cVar.e(strI, value.j(), com.garena.pay.android.j.d.b(activity, j.c.b.g.f1942g), str, key);
                }
            }
            strB = com.garena.pay.android.j.d.b(activity, i2);
            str = strB;
            strI = value.i(activity);
            zD = com.garena.pay.android.j.d.d(strJ);
            cVar = b;
            if (zD) {
                cVar.e(strI, value.j(), com.garena.pay.android.j.d.b(activity, j.c.b.g.f1942g), str, key);
            } else {
                cVar.d(strI, value.k(), com.garena.pay.android.j.d.b(activity, j.c.b.g.f1942g), str, key);
            }
        }
        b.i(new a(map));
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
