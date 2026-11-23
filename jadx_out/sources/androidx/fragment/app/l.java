package androidx.fragment.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
class l implements LayoutInflater.Factory2 {
    final n a;

    class a implements View.OnAttachStateChangeListener {
        final /* synthetic */ u a;

        a(u uVar) {
            this.a = uVar;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            Fragment fragmentK = this.a.k();
            this.a.m();
            c0.n((ViewGroup) fragmentK.Q.getParent(), l.this.a).j();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    l(n nVar) {
        this.a = nVar;
    }

    @Override // android.view.LayoutInflater.Factory2
    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        u uVarW;
        StringBuilder sb;
        String str2;
        if (h.class.getName().equals(str)) {
            return new h(context, attributeSet, this.a);
        }
        if (!"fragment".equals(str)) {
            return null;
        }
        String attributeValue = attributeSet.getAttributeValue(null, "class");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, h.m.c.a);
        if (attributeValue == null) {
            attributeValue = typedArrayObtainStyledAttributes.getString(h.m.c.b);
        }
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(h.m.c.c, -1);
        String string = typedArrayObtainStyledAttributes.getString(h.m.c.d);
        typedArrayObtainStyledAttributes.recycle();
        if (attributeValue == null || !j.b(context.getClassLoader(), attributeValue)) {
            return null;
        }
        int id = view != null ? view.getId() : 0;
        if (id == -1 && resourceId == -1 && string == null) {
            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
        }
        Fragment fragmentH0 = resourceId != -1 ? this.a.h0(resourceId) : null;
        if (fragmentH0 == null && string != null) {
            fragmentH0 = this.a.i0(string);
        }
        if (fragmentH0 == null && id != -1) {
            fragmentH0 = this.a.h0(id);
        }
        if (fragmentH0 == null) {
            fragmentH0 = this.a.q0().a(context.getClassLoader(), attributeValue);
            fragmentH0.f373n = true;
            fragmentH0.F = resourceId != 0 ? resourceId : id;
            fragmentH0.G = id;
            fragmentH0.H = string;
            fragmentH0.f374o = true;
            n nVar = this.a;
            fragmentH0.s = nVar;
            fragmentH0.t = nVar.t0();
            fragmentH0.C0(this.a.t0().k(), attributeSet, fragmentH0.b);
            uVarW = this.a.g(fragmentH0);
            if (n.F0(2)) {
                sb = new StringBuilder();
                sb.append("Fragment ");
                sb.append(fragmentH0);
                str2 = " has been inflated via the <fragment> tag: id=0x";
                sb.append(str2);
                sb.append(Integer.toHexString(resourceId));
                Log.v("FragmentManager", sb.toString());
            }
        } else {
            if (fragmentH0.f374o) {
                throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id) + " with another fragment for " + attributeValue);
            }
            fragmentH0.f374o = true;
            n nVar2 = this.a;
            fragmentH0.s = nVar2;
            fragmentH0.t = nVar2.t0();
            fragmentH0.C0(this.a.t0().k(), attributeSet, fragmentH0.b);
            uVarW = this.a.w(fragmentH0);
            if (n.F0(2)) {
                sb = new StringBuilder();
                sb.append("Retained Fragment ");
                sb.append(fragmentH0);
                str2 = " has been re-attached via the <fragment> tag: id=0x";
                sb.append(str2);
                sb.append(Integer.toHexString(resourceId));
                Log.v("FragmentManager", sb.toString());
            }
        }
        fragmentH0.P = (ViewGroup) view;
        uVarW.m();
        uVarW.j();
        View view2 = fragmentH0.Q;
        if (view2 == null) {
            throw new IllegalStateException("Fragment " + attributeValue + " did not create a view.");
        }
        if (resourceId != 0) {
            view2.setId(resourceId);
        }
        if (fragmentH0.Q.getTag() == null) {
            fragmentH0.Q.setTag(string);
        }
        fragmentH0.Q.addOnAttachStateChangeListener(new a(uVarW));
        return fragmentH0.Q;
    }

    @Override // android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }
}
