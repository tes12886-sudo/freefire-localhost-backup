package j.d.e.l;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class o implements j.d.e.g {
    private final j a = new j();

    @Override // j.d.e.g
    public j.d.e.j.b a(String str, j.d.e.a aVar, int i2, int i3, Map<j.d.e.c, ?> map) {
        if (aVar == j.d.e.a.UPC_A) {
            return this.a.a("0".concat(String.valueOf(str)), j.d.e.a.EAN_13, i2, i3, map);
        }
        throw new IllegalArgumentException("Can only encode UPC-A, but got ".concat(String.valueOf(aVar)));
    }
}
