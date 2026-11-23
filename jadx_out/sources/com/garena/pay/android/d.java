package com.garena.pay.android;

import com.garena.pay.android.data.GGPayment;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class d implements Serializable {
    private GGPayment a;
    private List<GGPayment.Denomination> c;
    private int e;
    private String b = "";
    private GGPayment.Denomination d = null;

    public String a() {
        return this.b;
    }

    public GGPayment.Denomination b() {
        return this.d;
    }

    public GGPayment c() {
        return this.a;
    }

    public List<GGPayment.Denomination> d() {
        return this.c;
    }

    public int e() {
        return this.e;
    }

    public String f() {
        GGPayment gGPayment = this.a;
        if (gGPayment == null) {
            return null;
        }
        return gGPayment.getVirtualCurrencyName();
    }

    public void g(String str) {
        this.b = str;
    }

    public void h(GGPayment.Denomination denomination) {
        this.d = denomination;
    }

    public void i(GGPayment gGPayment) {
        this.a = gGPayment;
    }

    public void j(List<GGPayment.Denomination> list) {
        this.c = list;
    }

    public void k(int i2) {
        this.e = i2;
    }
}
