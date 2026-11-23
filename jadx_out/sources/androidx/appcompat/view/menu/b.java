package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class b implements m {
    protected Context a;
    protected Context b;
    protected g c;
    protected LayoutInflater d;
    private m.a e;
    private int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f97g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected n f98h;

    public b(Context context, int i2, int i3) {
        this.a = context;
        this.d = LayoutInflater.from(context);
        this.f = i2;
        this.f97g = i3;
    }

    @Override // androidx.appcompat.view.menu.m
    public void a(g gVar, boolean z) {
        m.a aVar = this.e;
        if (aVar != null) {
            aVar.a(gVar, z);
        }
    }

    protected void b(View view, int i2) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup != null) {
            viewGroup.removeView(view);
        }
        ((ViewGroup) this.f98h).addView(view, i2);
    }

    @Override // androidx.appcompat.view.menu.m
    public void c(Context context, g gVar) {
        this.b = context;
        LayoutInflater.from(context);
        this.c = gVar;
    }

    public abstract void d(i iVar, n.a aVar);

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // androidx.appcompat.view.menu.m
    public boolean e(r rVar) {
        m.a aVar = this.e;
        g gVar = rVar;
        if (aVar == null) {
            return false;
        }
        if (rVar == null) {
            gVar = this.c;
        }
        return aVar.b(gVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.appcompat.view.menu.m
    public void f(boolean z) {
        ViewGroup viewGroup = (ViewGroup) this.f98h;
        if (viewGroup == null) {
            return;
        }
        g gVar = this.c;
        int i2 = 0;
        if (gVar != null) {
            gVar.r();
            ArrayList<i> arrayListE = this.c.E();
            int size = arrayListE.size();
            int i3 = 0;
            for (int i4 = 0; i4 < size; i4++) {
                i iVar = arrayListE.get(i4);
                if (q(i3, iVar)) {
                    View childAt = viewGroup.getChildAt(i3);
                    i itemData = childAt instanceof n.a ? ((n.a) childAt).getItemData() : null;
                    View viewN = n(iVar, childAt, viewGroup);
                    if (iVar != itemData) {
                        viewN.setPressed(false);
                        viewN.jumpDrawablesToCurrentState();
                    }
                    if (viewN != childAt) {
                        b(viewN, i3);
                    }
                    i3++;
                }
            }
            i2 = i3;
        }
        while (i2 < viewGroup.getChildCount()) {
            if (!l(viewGroup, i2)) {
                i2++;
            }
        }
    }

    public n.a g(ViewGroup viewGroup) {
        return (n.a) this.d.inflate(this.f97g, viewGroup, false);
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
        this.e = aVar;
    }

    protected boolean l(ViewGroup viewGroup, int i2) {
        viewGroup.removeViewAt(i2);
        return true;
    }

    public m.a m() {
        return this.e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View n(i iVar, View view, ViewGroup viewGroup) {
        n.a aVarG = view instanceof n.a ? (n.a) view : g(viewGroup);
        d(iVar, aVarG);
        return (View) aVarG;
    }

    public n o(ViewGroup viewGroup) {
        if (this.f98h == null) {
            n nVar = (n) this.d.inflate(this.f, viewGroup, false);
            this.f98h = nVar;
            nVar.b(this.c);
            f(true);
        }
        return this.f98h;
    }

    public void p(int i2) {
    }

    public abstract boolean q(int i2, i iVar);
}
