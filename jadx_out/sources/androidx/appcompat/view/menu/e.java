package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class e implements m, AdapterView.OnItemClickListener {
    Context a;
    LayoutInflater b;
    g c;
    ExpandedMenuView d;
    int e;
    int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    int f108g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private m.a f109h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    a f110i;

    private class a extends BaseAdapter {
        private int a = -1;

        public a() {
            a();
        }

        void a() {
            i iVarV = e.this.c.v();
            if (iVarV != null) {
                ArrayList<i> arrayListZ = e.this.c.z();
                int size = arrayListZ.size();
                for (int i2 = 0; i2 < size; i2++) {
                    if (arrayListZ.get(i2) == iVarV) {
                        this.a = i2;
                        return;
                    }
                }
            }
            this.a = -1;
        }

        @Override // android.widget.Adapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public i getItem(int i2) {
            ArrayList<i> arrayListZ = e.this.c.z();
            int i3 = i2 + e.this.e;
            int i4 = this.a;
            if (i4 >= 0 && i3 >= i4) {
                i3++;
            }
            return arrayListZ.get(i3);
        }

        @Override // android.widget.Adapter
        public int getCount() {
            int size = e.this.c.z().size() - e.this.e;
            return this.a < 0 ? size : size - 1;
        }

        @Override // android.widget.Adapter
        public long getItemId(int i2) {
            return i2;
        }

        @Override // android.widget.Adapter
        public View getView(int i2, View view, ViewGroup viewGroup) {
            if (view == null) {
                e eVar = e.this;
                view = eVar.b.inflate(eVar.f108g, viewGroup, false);
            }
            ((n.a) view).d(getItem(i2), 0);
            return view;
        }

        @Override // android.widget.BaseAdapter
        public void notifyDataSetChanged() {
            a();
            super.notifyDataSetChanged();
        }
    }

    public e(int i2, int i3) {
        this.f108g = i2;
        this.f = i3;
    }

    public e(Context context, int i2) {
        this(i2, 0);
        this.a = context;
        this.b = LayoutInflater.from(context);
    }

    @Override // androidx.appcompat.view.menu.m
    public void a(g gVar, boolean z) {
        m.a aVar = this.f109h;
        if (aVar != null) {
            aVar.a(gVar, z);
        }
    }

    public ListAdapter b() {
        if (this.f110i == null) {
            this.f110i = new a();
        }
        return this.f110i;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0029  */
    /* JADX WARN: Code duplicated, block: B:15:? A[RETURN, SYNTHETIC] */
    @Override // androidx.appcompat.view.menu.m
    public void c(Context context, g gVar) {
        LayoutInflater layoutInflaterFrom;
        a aVar;
        if (this.f == 0) {
            if (this.a != null) {
                this.a = context;
                if (this.b == null) {
                    layoutInflaterFrom = LayoutInflater.from(context);
                }
            }
            this.c = gVar;
            aVar = this.f110i;
            if (aVar != null) {
                aVar.notifyDataSetChanged();
            }
        }
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, this.f);
        this.a = contextThemeWrapper;
        layoutInflaterFrom = LayoutInflater.from(contextThemeWrapper);
        this.b = layoutInflaterFrom;
        this.c = gVar;
        aVar = this.f110i;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    public n d(ViewGroup viewGroup) {
        if (this.d == null) {
            this.d = (ExpandedMenuView) this.b.inflate(h.b.g.f1705g, viewGroup, false);
            if (this.f110i == null) {
                this.f110i = new a();
            }
            this.d.setAdapter((ListAdapter) this.f110i);
            this.d.setOnItemClickListener(this);
        }
        return this.d;
    }

    @Override // androidx.appcompat.view.menu.m
    public boolean e(r rVar) {
        if (!rVar.hasVisibleItems()) {
            return false;
        }
        new h(rVar).d(null);
        m.a aVar = this.f109h;
        if (aVar == null) {
            return true;
        }
        aVar.b(rVar);
        return true;
    }

    @Override // androidx.appcompat.view.menu.m
    public void f(boolean z) {
        a aVar = this.f110i;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.m
    public boolean h() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.m
    public boolean i(g gVar, i iVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.m
    public boolean j(g gVar, i iVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.m
    public void k(m.a aVar) {
        this.f109h = aVar;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i2, long j2) {
        this.c.M(this.f110i.getItem(i2), this, 0);
    }
}
