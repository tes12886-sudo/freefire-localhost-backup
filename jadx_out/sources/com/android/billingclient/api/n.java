package com.android.billingclient.api;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class n {
    private String a;
    private List b;

    public static class a {
        private String a;
        private List b;

        /* synthetic */ a(o0 o0Var) {
        }

        public n a() {
            String str = this.a;
            if (str == null) {
                throw new IllegalArgumentException("SKU type must be set");
            }
            if (this.b == null) {
                throw new IllegalArgumentException("SKU list or SkuWithOffer list must be set");
            }
            n nVar = new n();
            nVar.a = str;
            nVar.b = this.b;
            return nVar;
        }

        public a b(List<String> list) {
            this.b = new ArrayList(list);
            return this;
        }

        public a c(String str) {
            this.a = str;
            return this;
        }
    }

    public static a c() {
        return new a(null);
    }

    public String a() {
        return this.a;
    }

    public List<String> b() {
        return this.b;
    }
}
