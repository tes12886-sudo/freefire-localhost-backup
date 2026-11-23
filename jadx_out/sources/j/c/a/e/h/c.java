package j.c.a.e.h;

import j.c.a.d.a.e;
import j.c.a.d.a.f;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class c extends a {
    private List<e> c(List<e> list) {
        List<Integer> listA = j.c.a.e.i.a.a();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (e eVar : list) {
            if (!listA.contains(eVar.e)) {
                arrayList2.add(eVar);
            }
            arrayList.add(eVar.e);
        }
        j.c.a.e.i.a.h(arrayList);
        return arrayList2;
    }

    @Override // j.c.a.e.h.a
    public int a() {
        return 18;
    }

    @Override // j.c.a.e.h.a
    public void b(byte[] bArr, int i2, int i3) {
        f fVarD = j.c.a.e.l.f.d(bArr, i2, i3);
        for (e eVar : c(fVarD.e)) {
            j.c.a.e.k.a.a(j.c.a.e.a.c(), eVar.d, eVar.f);
        }
        j.c.a.e.a.b().b("ACK_PUSH_MSG", new j.c.a.e.g.c.a(j.c.a.e.l.e.e(fVarD.e.get(0).e.intValue())));
    }
}
