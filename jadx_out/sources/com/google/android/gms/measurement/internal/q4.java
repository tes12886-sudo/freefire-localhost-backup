package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.uf;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class q4 implements uf {
    final /* synthetic */ s4 a;

    q4(s4 s4Var) {
        this.a = s4Var;
    }

    @Override // com.google.android.gms.internal.measurement.uf
    public final void a(int i2, String str, List<String> list, boolean z, boolean z2) {
        p3 p3VarV;
        int i3 = i2 - 1;
        if (i3 == 0) {
            p3VarV = this.a.a.d().v();
        } else if (i3 == 1) {
            r3 r3VarD = this.a.a.d();
            if (z) {
                p3VarV = r3VarD.p();
            } else {
                p3VarV = !z2 ? r3VarD.q() : r3VarD.o();
            }
        } else if (i3 == 3) {
            p3VarV = this.a.a.d().w();
        } else if (i3 != 4) {
            p3VarV = this.a.a.d().u();
        } else {
            r3 r3VarD2 = this.a.a.d();
            if (z) {
                p3VarV = r3VarD2.s();
            } else {
                p3VarV = !z2 ? r3VarD2.t() : r3VarD2.r();
            }
        }
        int size = list.size();
        if (size == 1) {
            p3VarV.b(str, list.get(0));
            return;
        }
        if (size == 2) {
            p3VarV.c(str, list.get(0), list.get(1));
        } else if (size != 3) {
            p3VarV.a(str);
        } else {
            p3VarV.d(str, list.get(0), list.get(1), list.get(2));
        }
    }
}
