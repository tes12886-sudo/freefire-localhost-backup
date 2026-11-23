package androidx.activity.result;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import androidx.lifecycle.g;
import androidx.lifecycle.i;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;

/* JADX INFO: loaded from: classes.dex */
public abstract class d {
    private Random a = new Random();
    private final Map<Integer, String> b = new HashMap();
    final Map<String, Integer> c = new HashMap();
    private final Map<String, c> d = new HashMap();
    ArrayList<String> e = new ArrayList<>();
    final transient Map<String, b<?>> f = new HashMap();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final Map<String, Object> f14g = new HashMap();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final Bundle f15h = new Bundle();

    /* JADX INFO: Add missing generic type declarations: [I] */
    class a<I> extends androidx.activity.result.c<I> {
        final /* synthetic */ String a;
        final /* synthetic */ int b;
        final /* synthetic */ androidx.activity.result.g.a c;

        a(String str, int i2, androidx.activity.result.g.a aVar) {
            this.a = str;
            this.b = i2;
            this.c = aVar;
        }

        @Override // androidx.activity.result.c
        public void b(I i2, androidx.core.app.b bVar) {
            d.this.e.add(this.a);
            Integer num = d.this.c.get(this.a);
            d.this.f(num != null ? num.intValue() : this.b, this.c, i2, bVar);
        }

        @Override // androidx.activity.result.c
        public void c() {
            d.this.k(this.a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class b<O> {
        final androidx.activity.result.b<O> a;
        final androidx.activity.result.g.a<?, O> b;

        b(androidx.activity.result.b<O> bVar, androidx.activity.result.g.a<?, O> aVar) {
            this.a = bVar;
            this.b = aVar;
        }
    }

    private static class c {
        final g a;
        private final ArrayList<i> b;

        void a() {
            Iterator<i> it = this.b.iterator();
            while (it.hasNext()) {
                this.a.c(it.next());
            }
            this.b.clear();
        }
    }

    private void a(int i2, String str) {
        this.b.put(Integer.valueOf(i2), str);
        this.c.put(str, Integer.valueOf(i2));
    }

    private <O> void d(String str, int i2, Intent intent, b<O> bVar) {
        androidx.activity.result.b<O> bVar2;
        if (bVar != null && (bVar2 = bVar.a) != null) {
            bVar2.a(bVar.b.c(i2, intent));
        } else {
            this.f14g.remove(str);
            this.f15h.putParcelable(str, new androidx.activity.result.a(i2, intent));
        }
    }

    private int e() {
        int iNextInt = this.a.nextInt(2147418112);
        while (true) {
            int i2 = iNextInt + 65536;
            if (!this.b.containsKey(Integer.valueOf(i2))) {
                return i2;
            }
            iNextInt = this.a.nextInt(2147418112);
        }
    }

    private int j(String str) {
        Integer num = this.c.get(str);
        if (num != null) {
            return num.intValue();
        }
        int iE = e();
        a(iE, str);
        return iE;
    }

    public final boolean b(int i2, int i3, Intent intent) {
        String str = this.b.get(Integer.valueOf(i2));
        if (str == null) {
            return false;
        }
        this.e.remove(str);
        d(str, i3, intent, this.f.get(str));
        return true;
    }

    public final <O> boolean c(int i2, @SuppressLint({"UnknownNullness"}) O o2) {
        androidx.activity.result.b<?> bVar;
        String str = this.b.get(Integer.valueOf(i2));
        if (str == null) {
            return false;
        }
        this.e.remove(str);
        b<?> bVar2 = this.f.get(str);
        if (bVar2 != null && (bVar = bVar2.a) != null) {
            bVar.a(o2);
            return true;
        }
        this.f15h.remove(str);
        this.f14g.put(str, o2);
        return true;
    }

    public abstract <I, O> void f(int i2, androidx.activity.result.g.a<I, O> aVar, @SuppressLint({"UnknownNullness"}) I i3, androidx.core.app.b bVar);

    public final void g(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
        ArrayList<String> stringArrayList = bundle.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
        if (stringArrayList == null || integerArrayList == null) {
            return;
        }
        this.e = bundle.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
        this.a = (Random) bundle.getSerializable("KEY_COMPONENT_ACTIVITY_RANDOM_OBJECT");
        this.f15h.putAll(bundle.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT"));
        for (int i2 = 0; i2 < stringArrayList.size(); i2++) {
            String str = stringArrayList.get(i2);
            if (this.c.containsKey(str)) {
                Integer numRemove = this.c.remove(str);
                if (!this.f15h.containsKey(str)) {
                    this.b.remove(numRemove);
                }
            }
            a(integerArrayList.get(i2).intValue(), stringArrayList.get(i2));
        }
    }

    public final void h(Bundle bundle) {
        bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(this.c.values()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(this.c.keySet()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(this.e));
        bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", (Bundle) this.f15h.clone());
        bundle.putSerializable("KEY_COMPONENT_ACTIVITY_RANDOM_OBJECT", this.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <I, O> androidx.activity.result.c<I> i(String str, androidx.activity.result.g.a<I, O> aVar, androidx.activity.result.b<O> bVar) {
        int iJ = j(str);
        this.f.put(str, new b<>(bVar, aVar));
        if (this.f14g.containsKey(str)) {
            Object obj = this.f14g.get(str);
            this.f14g.remove(str);
            bVar.a(obj);
        }
        androidx.activity.result.a aVar2 = (androidx.activity.result.a) this.f15h.getParcelable(str);
        if (aVar2 != null) {
            this.f15h.remove(str);
            bVar.a(aVar.c(aVar2.b(), aVar2.a()));
        }
        return new a(str, iJ, aVar);
    }

    final void k(String str) {
        Integer numRemove;
        if (!this.e.contains(str) && (numRemove = this.c.remove(str)) != null) {
            this.b.remove(numRemove);
        }
        this.f.remove(str);
        if (this.f14g.containsKey(str)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + this.f14g.get(str));
            this.f14g.remove(str);
        }
        if (this.f15h.containsKey(str)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + this.f15h.getParcelable(str));
            this.f15h.remove(str);
        }
        c cVar = this.d.get(str);
        if (cVar != null) {
            cVar.a();
            this.d.remove(str);
        }
    }
}
