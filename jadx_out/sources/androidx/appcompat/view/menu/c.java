package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;

/* JADX INFO: loaded from: classes.dex */
abstract class c {
    final Context a;
    private h.f.g<h.h.f.a.b, MenuItem> b;
    private h.f.g<h.h.f.a.c, SubMenu> c;

    c(Context context) {
        this.a = context;
    }

    final MenuItem c(MenuItem menuItem) {
        if (!(menuItem instanceof h.h.f.a.b)) {
            return menuItem;
        }
        h.h.f.a.b bVar = (h.h.f.a.b) menuItem;
        if (this.b == null) {
            this.b = new h.f.g<>();
        }
        MenuItem menuItem2 = this.b.get(menuItem);
        if (menuItem2 != null) {
            return menuItem2;
        }
        j jVar = new j(this.a, bVar);
        this.b.put(bVar, jVar);
        return jVar;
    }

    final SubMenu d(SubMenu subMenu) {
        if (!(subMenu instanceof h.h.f.a.c)) {
            return subMenu;
        }
        h.h.f.a.c cVar = (h.h.f.a.c) subMenu;
        if (this.c == null) {
            this.c = new h.f.g<>();
        }
        SubMenu subMenu2 = this.c.get(cVar);
        if (subMenu2 != null) {
            return subMenu2;
        }
        s sVar = new s(this.a, cVar);
        this.c.put(cVar, sVar);
        return sVar;
    }

    final void e() {
        h.f.g<h.h.f.a.b, MenuItem> gVar = this.b;
        if (gVar != null) {
            gVar.clear();
        }
        h.f.g<h.h.f.a.c, SubMenu> gVar2 = this.c;
        if (gVar2 != null) {
            gVar2.clear();
        }
    }

    final void f(int i2) {
        if (this.b == null) {
            return;
        }
        int i3 = 0;
        while (i3 < this.b.size()) {
            if (this.b.i(i3).getGroupId() == i2) {
                this.b.j(i3);
                i3--;
            }
            i3++;
        }
    }

    final void g(int i2) {
        if (this.b == null) {
            return;
        }
        for (int i3 = 0; i3 < this.b.size(); i3++) {
            if (this.b.i(i3).getItemId() == i2) {
                this.b.j(i3);
                return;
            }
        }
    }
}
