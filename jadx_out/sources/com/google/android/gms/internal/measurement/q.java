package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public interface q {
    public static final q x = new v();
    public static final q y = new o();
    public static final q z = new h("continue");
    public static final q A = new h("break");
    public static final q B = new h("return");
    public static final q C = new g(Boolean.TRUE);
    public static final q D = new g(Boolean.FALSE);
    public static final q E = new u("");

    String b();

    Double c();

    Boolean d();

    Iterator<q> h();

    q j();

    q q(String str, v4 v4Var, List<q> list);
}
