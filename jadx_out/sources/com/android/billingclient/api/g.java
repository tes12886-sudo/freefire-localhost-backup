package com.android.billingclient.api;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class g {
    private boolean a;
    private String b;
    private String c;
    private c d;
    private j.d.a.c.f.h.b0 e;
    private ArrayList f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f465g;

    public static class a {
        private String a;
        private String b;
        private List c;
        private ArrayList d;
        private boolean e;
        private c.a f;

        /* synthetic */ a(c0 c0Var) {
            c.a aVarA = c.a();
            c.a.b(aVarA);
            this.f = aVarA;
        }

        public g a() {
            ArrayList arrayList = this.d;
            boolean z = true;
            boolean z2 = (arrayList == null || arrayList.isEmpty()) ? false : true;
            List list = this.c;
            boolean z3 = (list == null || list.isEmpty()) ? false : true;
            if (!z2 && !z3) {
                throw new IllegalArgumentException("Details of the products must be provided.");
            }
            if (z2 && z3) {
                throw new IllegalArgumentException("Set SkuDetails or ProductDetailsParams, not both.");
            }
            f0 f0Var = null;
            if (!z2) {
                b bVar = (b) this.c.get(0);
                for (int i2 = 0; i2 < this.c.size(); i2++) {
                    b bVar2 = (b) this.c.get(i2);
                    if (bVar2 == null) {
                        throw new IllegalArgumentException("ProductDetailsParams cannot be null.");
                    }
                    if (i2 != 0) {
                        bVar2.a().b();
                        throw null;
                    }
                }
                bVar.a().c();
                throw null;
            }
            if (this.d.contains(null)) {
                throw new IllegalArgumentException("SKU cannot be null.");
            }
            if (this.d.size() > 1) {
                SkuDetails skuDetails = (SkuDetails) this.d.get(0);
                String strD = skuDetails.d();
                ArrayList arrayList2 = this.d;
                int size = arrayList2.size();
                for (int i3 = 0; i3 < size; i3++) {
                    SkuDetails skuDetails2 = (SkuDetails) arrayList2.get(i3);
                    if (!strD.equals("play_pass_subs") && !skuDetails2.d().equals("play_pass_subs") && !strD.equals(skuDetails2.d())) {
                        throw new IllegalArgumentException("SKUs should have the same type.");
                    }
                }
                String strH = skuDetails.h();
                ArrayList arrayList3 = this.d;
                int size2 = arrayList3.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    SkuDetails skuDetails3 = (SkuDetails) arrayList3.get(i4);
                    if (!strD.equals("play_pass_subs") && !skuDetails3.d().equals("play_pass_subs") && !strH.equals(skuDetails3.h())) {
                        throw new IllegalArgumentException("All SKUs must have the same package name.");
                    }
                }
            }
            g gVar = new g(f0Var);
            if (!z2 || ((SkuDetails) this.d.get(0)).h().isEmpty()) {
                if (z3) {
                    ((b) this.c.get(0)).a().c();
                    throw null;
                }
                z = false;
            }
            gVar.a = z;
            gVar.b = this.a;
            gVar.c = this.b;
            gVar.d = this.f.a();
            ArrayList arrayList4 = this.d;
            gVar.f = arrayList4 != null ? new ArrayList(arrayList4) : new ArrayList();
            gVar.f465g = this.e;
            List list2 = this.c;
            gVar.e = list2 != null ? j.d.a.c.f.h.b0.s(list2) : j.d.a.c.f.h.b0.t();
            return gVar;
        }

        public a b(boolean z) {
            this.e = z;
            return this;
        }

        public a c(String str) {
            this.a = str;
            return this;
        }

        public a d(String str) {
            this.b = str;
            return this;
        }

        @Deprecated
        public a e(SkuDetails skuDetails) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(skuDetails);
            this.d = arrayList;
            return this;
        }
    }

    public static final class b {
        private final k a;

        public final k a() {
            return this.a;
        }
    }

    public static class c {
        private String a;
        private int b = 0;

        public static class a {
            private String a;
            private boolean b;
            private int c = 0;

            /* synthetic */ a(d0 d0Var) {
            }

            static /* synthetic */ a b(a aVar) {
                aVar.b = true;
                return aVar;
            }

            public c a() {
                e0 e0Var = null;
                boolean z = (TextUtils.isEmpty(this.a) && TextUtils.isEmpty(null)) ? false : true;
                boolean zIsEmpty = true ^ TextUtils.isEmpty(null);
                if (z && zIsEmpty) {
                    throw new IllegalArgumentException("Please provide Old SKU purchase information(token/id) or original external transaction id, not both.");
                }
                if (!this.b && !z && !zIsEmpty) {
                    throw new IllegalArgumentException("Old SKU purchase information(token/id) or original external transaction id must be provided.");
                }
                c cVar = new c(e0Var);
                cVar.a = this.a;
                cVar.b = this.c;
                return cVar;
            }
        }

        /* synthetic */ c(e0 e0Var) {
        }

        public static a a() {
            return new a(null);
        }

        final int b() {
            return this.b;
        }

        final String c() {
            return this.a;
        }
    }

    /* synthetic */ g(f0 f0Var) {
    }

    public static a a() {
        return new a(null);
    }

    public final int b() {
        return this.d.b();
    }

    public final String c() {
        return this.b;
    }

    public final String d() {
        return this.c;
    }

    public final String e() {
        return this.d.c();
    }

    public final ArrayList f() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f);
        return arrayList;
    }

    public final List g() {
        return this.e;
    }

    public final boolean o() {
        return this.f465g;
    }

    final boolean p() {
        return (this.b == null && this.c == null && this.d.b() == 0 && !this.a && !this.f465g) ? false : true;
    }
}
