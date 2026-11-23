package h.h.l;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public class k {
    private final CopyOnWriteArrayList<m> a = new CopyOnWriteArrayList<>();

    public k(Runnable runnable) {
        new HashMap();
    }

    public void a(Menu menu, MenuInflater menuInflater) {
        Iterator<m> it = this.a.iterator();
        while (it.hasNext()) {
            it.next().b(menu, menuInflater);
        }
    }

    public boolean b(MenuItem menuItem) {
        Iterator<m> it = this.a.iterator();
        while (it.hasNext()) {
            if (it.next().a(menuItem)) {
                return true;
            }
        }
        return false;
    }
}
