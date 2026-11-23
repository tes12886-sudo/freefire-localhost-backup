package h.b.n;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.widget.a1;
import androidx.appcompat.widget.i0;
import com.appff.haptic.base.Utils;
import h.h.l.l;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public class g extends MenuInflater {
    static final Class<?>[] e;
    static final Class<?>[] f;
    final Object[] a;
    final Object[] b;
    Context c;
    private Object d;

    private static class a implements MenuItem.OnMenuItemClickListener {
        private static final Class<?>[] c = {MenuItem.class};
        private Object a;
        private Method b;

        public a(Object obj, String str) {
            this.a = obj;
            Class<?> cls = obj.getClass();
            try {
                this.b = cls.getMethod(str, c);
            } catch (Exception e) {
                InflateException inflateException = new InflateException("Couldn't resolve menu item onClick handler " + str + " in class " + cls.getName());
                inflateException.initCause(e);
                throw inflateException;
            }
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            try {
                if (this.b.getReturnType() == Boolean.TYPE) {
                    return ((Boolean) this.b.invoke(this.a, menuItem)).booleanValue();
                }
                this.b.invoke(this.a, menuItem);
                return true;
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }

    private class b {
        h.h.l.d A;
        private CharSequence B;
        private CharSequence C;
        private ColorStateList D = null;
        private PorterDuff.Mode E = null;
        private Menu a;
        private int b;
        private int c;
        private int d;
        private int e;
        private boolean f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private boolean f1758g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private boolean f1759h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f1760i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private int f1761j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private CharSequence f1762k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private CharSequence f1763l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private int f1764m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private char f1765n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private int f1766o;
        private char p;
        private int q;
        private int r;
        private boolean s;
        private boolean t;
        private boolean u;
        private int v;
        private int w;
        private String x;
        private String y;
        private String z;

        public b(Menu menu) {
            this.a = menu;
            h();
        }

        private char c(String str) {
            if (str == null) {
                return (char) 0;
            }
            return str.charAt(0);
        }

        private <T> T e(String str, Class<?>[] clsArr, Object[] objArr) {
            try {
                Constructor<?> constructor = Class.forName(str, false, g.this.c.getClassLoader()).getConstructor(clsArr);
                constructor.setAccessible(true);
                return (T) constructor.newInstance(objArr);
            } catch (Exception e) {
                Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e);
                return null;
            }
        }

        private void i(MenuItem menuItem) {
            boolean z = false;
            menuItem.setChecked(this.s).setVisible(this.t).setEnabled(this.u).setCheckable(this.r >= 1).setTitleCondensed(this.f1763l).setIcon(this.f1764m);
            int i2 = this.v;
            if (i2 >= 0) {
                menuItem.setShowAsAction(i2);
            }
            if (this.z != null) {
                if (g.this.c.isRestricted()) {
                    throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
                }
                menuItem.setOnMenuItemClickListener(new a(g.this.b(), this.z));
            }
            if (this.r >= 2) {
                if (menuItem instanceof androidx.appcompat.view.menu.i) {
                    ((androidx.appcompat.view.menu.i) menuItem).t(true);
                } else if (menuItem instanceof j) {
                    ((j) menuItem).h(true);
                }
            }
            String str = this.x;
            if (str != null) {
                menuItem.setActionView((View) e(str, g.e, g.this.a));
                z = true;
            }
            int i3 = this.w;
            if (i3 > 0) {
                if (z) {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
                } else {
                    menuItem.setActionView(i3);
                }
            }
            h.h.l.d dVar = this.A;
            if (dVar != null) {
                l.a(menuItem, dVar);
            }
            l.c(menuItem, this.B);
            l.g(menuItem, this.C);
            l.b(menuItem, this.f1765n, this.f1766o);
            l.f(menuItem, this.p, this.q);
            PorterDuff.Mode mode = this.E;
            if (mode != null) {
                l.e(menuItem, mode);
            }
            ColorStateList colorStateList = this.D;
            if (colorStateList != null) {
                l.d(menuItem, colorStateList);
            }
        }

        public void a() {
            this.f1759h = true;
            i(this.a.add(this.b, this.f1760i, this.f1761j, this.f1762k));
        }

        public SubMenu b() {
            this.f1759h = true;
            SubMenu subMenuAddSubMenu = this.a.addSubMenu(this.b, this.f1760i, this.f1761j, this.f1762k);
            i(subMenuAddSubMenu.getItem());
            return subMenuAddSubMenu;
        }

        public boolean d() {
            return this.f1759h;
        }

        public void f(AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = g.this.c.obtainStyledAttributes(attributeSet, h.b.j.j1);
            this.b = typedArrayObtainStyledAttributes.getResourceId(h.b.j.l1, 0);
            this.c = typedArrayObtainStyledAttributes.getInt(h.b.j.n1, 0);
            this.d = typedArrayObtainStyledAttributes.getInt(h.b.j.o1, 0);
            this.e = typedArrayObtainStyledAttributes.getInt(h.b.j.p1, 0);
            this.f = typedArrayObtainStyledAttributes.getBoolean(h.b.j.m1, true);
            this.f1758g = typedArrayObtainStyledAttributes.getBoolean(h.b.j.k1, true);
            typedArrayObtainStyledAttributes.recycle();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public void g(AttributeSet attributeSet) {
            a1 a1VarT = a1.t(g.this.c, attributeSet, h.b.j.q1);
            this.f1760i = a1VarT.m(h.b.j.t1, 0);
            this.f1761j = (a1VarT.j(h.b.j.w1, this.c) & (-65536)) | (a1VarT.j(h.b.j.x1, this.d) & 65535);
            this.f1762k = a1VarT.o(h.b.j.y1);
            this.f1763l = a1VarT.o(h.b.j.z1);
            this.f1764m = a1VarT.m(h.b.j.r1, 0);
            this.f1765n = c(a1VarT.n(h.b.j.A1));
            this.f1766o = a1VarT.j(h.b.j.H1, Utils.CONTINUOUS_EVENT);
            this.p = c(a1VarT.n(h.b.j.B1));
            this.q = a1VarT.j(h.b.j.L1, Utils.CONTINUOUS_EVENT);
            int i2 = h.b.j.C1;
            this.r = a1VarT.r(i2) ? a1VarT.a(i2, false) : this.e;
            this.s = a1VarT.a(h.b.j.u1, false);
            this.t = a1VarT.a(h.b.j.v1, this.f);
            this.u = a1VarT.a(h.b.j.s1, this.f1758g);
            this.v = a1VarT.j(h.b.j.M1, -1);
            this.z = a1VarT.n(h.b.j.D1);
            this.w = a1VarT.m(h.b.j.E1, 0);
            this.x = a1VarT.n(h.b.j.G1);
            String strN = a1VarT.n(h.b.j.F1);
            this.y = strN;
            boolean z = strN != null;
            if (z && this.w == 0 && this.x == null) {
                this.A = (h.h.l.d) e(strN, g.f, g.this.b);
            } else {
                if (z) {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                }
                this.A = null;
            }
            this.B = a1VarT.o(h.b.j.I1);
            this.C = a1VarT.o(h.b.j.N1);
            int i3 = h.b.j.K1;
            if (a1VarT.r(i3)) {
                this.E = i0.d(a1VarT.j(i3, -1), this.E);
            } else {
                this.E = null;
            }
            int i4 = h.b.j.J1;
            if (a1VarT.r(i4)) {
                this.D = a1VarT.c(i4);
            } else {
                this.D = null;
            }
            a1VarT.v();
            this.f1759h = false;
        }

        public void h() {
            this.b = 0;
            this.c = 0;
            this.d = 0;
            this.e = 0;
            this.f = true;
            this.f1758g = true;
        }
    }

    static {
        Class<?>[] clsArr = {Context.class};
        e = clsArr;
        f = clsArr;
    }

    public g(Context context) {
        super(context);
        this.c = context;
        Object[] objArr = {context};
        this.a = objArr;
        this.b = objArr;
    }

    private Object a(Object obj) {
        return (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) ? a(((ContextWrapper) obj).getBaseContext()) : obj;
    }

    private void c(XmlPullParser xmlPullParser, AttributeSet attributeSet, Menu menu) throws XmlPullParserException, IOException {
        b bVar = new b(menu);
        int eventType = xmlPullParser.getEventType();
        do {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if (name.equals("menu")) {
                    eventType = xmlPullParser.next();
                    break;
                }
                throw new RuntimeException("Expecting menu, got " + name);
            }
            eventType = xmlPullParser.next();
        } while (eventType != 1);
        String str = null;
        boolean z = false;
        boolean z2 = false;
        while (!z) {
            if (eventType == 1) {
                throw new RuntimeException("Unexpected end of document");
            }
            if (eventType != 2) {
                if (eventType == 3) {
                    String name2 = xmlPullParser.getName();
                    if (z2 && name2.equals(str)) {
                        str = null;
                        z2 = false;
                    } else if (name2.equals("group")) {
                        bVar.h();
                    } else if (name2.equals("item")) {
                        if (!bVar.d()) {
                            h.h.l.d dVar = bVar.A;
                            if (dVar == null || !dVar.a()) {
                                bVar.a();
                            } else {
                                bVar.b();
                            }
                        }
                    } else if (name2.equals("menu")) {
                        z = true;
                    }
                }
            } else if (!z2) {
                String name3 = xmlPullParser.getName();
                if (name3.equals("group")) {
                    bVar.f(attributeSet);
                } else if (name3.equals("item")) {
                    bVar.g(attributeSet);
                } else if (name3.equals("menu")) {
                    c(xmlPullParser, attributeSet, bVar.b());
                } else {
                    str = name3;
                    z2 = true;
                }
            }
            eventType = xmlPullParser.next();
        }
    }

    Object b() {
        if (this.d == null) {
            this.d = a(this.c);
        }
        return this.d;
    }

    @Override // android.view.MenuInflater
    public void inflate(int i2, Menu menu) {
        if (!(menu instanceof h.h.f.a.a)) {
            super.inflate(i2, menu);
            return;
        }
        XmlResourceParser layout = null;
        try {
            try {
                try {
                    layout = this.c.getResources().getLayout(i2);
                    c(layout, Xml.asAttributeSet(layout), menu);
                    if (layout != null) {
                        layout.close();
                    }
                } catch (XmlPullParserException e2) {
                    throw new InflateException("Error inflating menu XML", e2);
                }
            } catch (IOException e3) {
                throw new InflateException("Error inflating menu XML", e3);
            }
        } catch (Throwable th) {
            if (layout != null) {
                layout.close();
            }
            throw th;
        }
    }
}
