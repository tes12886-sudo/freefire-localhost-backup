package j.c.a.e.g;

import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public class a {
    private HashMap<String, ArrayList<b>> a = new HashMap<>();

    public void a() {
        this.a.clear();
    }

    public void b(String str, j.c.a.e.g.c.a aVar) {
        if (str == null || !this.a.containsKey(str)) {
            return;
        }
        for (b bVar : this.a.get(str)) {
            if (bVar != null) {
                bVar.a(aVar);
            }
        }
    }

    public void c(String str, b bVar) {
        if (str != null) {
            if (this.a.containsKey(str)) {
                this.a.get(str).add(bVar);
                return;
            }
            ArrayList<b> arrayList = new ArrayList<>();
            arrayList.add(bVar);
            this.a.put(str, arrayList);
        }
    }
}
