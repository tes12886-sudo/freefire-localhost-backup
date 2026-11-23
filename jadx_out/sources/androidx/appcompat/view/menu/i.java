package androidx.appcompat.view.menu;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.appff.haptic.base.Utils;

/* JADX INFO: loaded from: classes.dex */
public final class i implements h.h.f.a.b {
    private View A;
    private h.h.l.d B;
    private MenuItem.OnActionExpandListener C;
    private ContextMenu.ContextMenuInfo E;
    private final int a;
    private final int b;
    private final int c;
    private final int d;
    private CharSequence e;
    private CharSequence f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Intent f120g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private char f121h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private char f123j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Drawable f125l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    g f127n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private r f128o;
    private Runnable p;
    private MenuItem.OnMenuItemClickListener q;
    private CharSequence r;
    private CharSequence s;
    private int z;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f122i = Utils.CONTINUOUS_EVENT;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f124k = Utils.CONTINUOUS_EVENT;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f126m = 0;
    private ColorStateList t = null;
    private PorterDuff.Mode u = null;
    private boolean v = false;
    private boolean w = false;
    private boolean x = false;
    private int y = 16;
    private boolean D = false;

    class a implements h.h.l.d.b {
        a() {
        }

        @Override // h.h.l.d.b
        public void onActionProviderVisibilityChanged(boolean z) {
            i iVar = i.this;
            iVar.f127n.J(iVar);
        }
    }

    i(g gVar, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6) {
        this.z = 0;
        this.f127n = gVar;
        this.a = i3;
        this.b = i2;
        this.c = i4;
        this.d = i5;
        this.e = charSequence;
        this.z = i6;
    }

    private static void d(StringBuilder sb, int i2, int i3, String str) {
        if ((i2 & i3) == i3) {
            sb.append(str);
        }
    }

    private Drawable e(Drawable drawable) {
        if (drawable != null && this.x && (this.v || this.w)) {
            drawable = androidx.core.graphics.drawable.a.p(drawable).mutate();
            if (this.v) {
                androidx.core.graphics.drawable.a.n(drawable, this.t);
            }
            if (this.w) {
                androidx.core.graphics.drawable.a.o(drawable, this.u);
            }
            this.x = false;
        }
        return drawable;
    }

    boolean A() {
        return this.f127n.H() && g() != 0;
    }

    public boolean B() {
        return (this.z & 4) == 4;
    }

    @Override // h.h.f.a.b
    public h.h.f.a.b a(h.h.l.d dVar) {
        h.h.l.d dVar2 = this.B;
        if (dVar2 != null) {
            dVar2.h();
        }
        this.A = null;
        this.B = dVar;
        this.f127n.K(true);
        h.h.l.d dVar3 = this.B;
        if (dVar3 != null) {
            dVar3.j(new a());
        }
        return this;
    }

    @Override // h.h.f.a.b
    public h.h.l.d b() {
        return this.B;
    }

    public void c() {
        this.f127n.I(this);
    }

    @Override // h.h.f.a.b, android.view.MenuItem
    public boolean collapseActionView() {
        if ((this.z & 8) == 0) {
            return false;
        }
        if (this.A == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.C;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.f127n.f(this);
        }
        return false;
    }

    @Override // h.h.f.a.b, android.view.MenuItem
    public boolean expandActionView() {
        if (!j()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.C;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.f127n.k(this);
        }
        return false;
    }

    public int f() {
        return this.d;
    }

    char g() {
        return this.f127n.G() ? this.f123j : this.f121h;
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // h.h.f.a.b, android.view.MenuItem
    public View getActionView() {
        View view = this.A;
        if (view != null) {
            return view;
        }
        h.h.l.d dVar = this.B;
        if (dVar == null) {
            return null;
        }
        View viewD = dVar.d(this);
        this.A = viewD;
        return viewD;
    }

    @Override // h.h.f.a.b, android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.f124k;
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.f123j;
    }

    @Override // h.h.f.a.b, android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.r;
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.b;
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        Drawable drawable = this.f125l;
        if (drawable != null) {
            return e(drawable);
        }
        if (this.f126m == 0) {
            return null;
        }
        Drawable drawableB = h.b.k.a.a.b(this.f127n.u(), this.f126m);
        this.f126m = 0;
        this.f125l = drawableB;
        return e(drawableB);
    }

    @Override // h.h.f.a.b, android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.t;
    }

    @Override // h.h.f.a.b, android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.u;
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.f120g;
    }

    @Override // android.view.MenuItem
    @ViewDebug.CapturedViewProperty
    public int getItemId() {
        return this.a;
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.E;
    }

    @Override // h.h.f.a.b, android.view.MenuItem
    public int getNumericModifiers() {
        return this.f122i;
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.f121h;
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.c;
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return this.f128o;
    }

    @Override // android.view.MenuItem
    @ViewDebug.CapturedViewProperty
    public CharSequence getTitle() {
        return this.e;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f;
        if (charSequence == null) {
            charSequence = this.e;
        }
        return (Build.VERSION.SDK_INT >= 18 || charSequence == null || (charSequence instanceof String)) ? charSequence : charSequence.toString();
    }

    @Override // h.h.f.a.b, android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.s;
    }

    String h() {
        int i2;
        char cG = g();
        if (cG == 0) {
            return "";
        }
        Resources resources = this.f127n.u().getResources();
        StringBuilder sb = new StringBuilder();
        if (ViewConfiguration.get(this.f127n.u()).hasPermanentMenuKey()) {
            sb.append(resources.getString(h.b.h.f1718k));
        }
        int i3 = this.f127n.G() ? this.f124k : this.f122i;
        d(sb, i3, 65536, resources.getString(h.b.h.f1714g));
        d(sb, i3, Utils.CONTINUOUS_EVENT, resources.getString(h.b.h.c));
        d(sb, i3, 2, resources.getString(h.b.h.b));
        d(sb, i3, 1, resources.getString(h.b.h.f1715h));
        d(sb, i3, 4, resources.getString(h.b.h.f1717j));
        d(sb, i3, 8, resources.getString(h.b.h.f));
        if (cG == '\b') {
            i2 = h.b.h.d;
        } else {
            if (cG != '\n') {
                if (cG != ' ') {
                    sb.append(cG);
                } else {
                    i2 = h.b.h.f1716i;
                }
                return sb.toString();
            }
            i2 = h.b.h.e;
        }
        sb.append(resources.getString(i2));
        return sb.toString();
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return this.f128o != null;
    }

    CharSequence i(n.a aVar) {
        return (aVar == null || !aVar.a()) ? getTitle() : getTitleCondensed();
    }

    @Override // h.h.f.a.b, android.view.MenuItem
    public boolean isActionViewExpanded() {
        return this.D;
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return (this.y & 1) == 1;
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return (this.y & 2) == 2;
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return (this.y & 16) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        h.h.l.d dVar = this.B;
        if (dVar == null || !dVar.g()) {
            return (this.y & 8) == 0;
        }
        return (this.y & 8) == 0 && this.B.b();
    }

    public boolean j() {
        h.h.l.d dVar;
        if ((this.z & 8) == 0) {
            return false;
        }
        if (this.A == null && (dVar = this.B) != null) {
            this.A = dVar.d(this);
        }
        return this.A != null;
    }

    public boolean k() {
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = this.q;
        if (onMenuItemClickListener != null && onMenuItemClickListener.onMenuItemClick(this)) {
            return true;
        }
        g gVar = this.f127n;
        if (gVar.h(gVar, this)) {
            return true;
        }
        Runnable runnable = this.p;
        if (runnable != null) {
            runnable.run();
            return true;
        }
        if (this.f120g != null) {
            try {
                this.f127n.u().startActivity(this.f120g);
                return true;
            } catch (ActivityNotFoundException e) {
                Log.e("MenuItemImpl", "Can't find activity to handle intent; ignoring", e);
            }
        }
        h.h.l.d dVar = this.B;
        return dVar != null && dVar.e();
    }

    public boolean l() {
        return (this.y & 32) == 32;
    }

    public boolean m() {
        return (this.y & 4) != 0;
    }

    public boolean n() {
        return (this.z & 1) == 1;
    }

    public boolean o() {
        return (this.z & 2) == 2;
    }

    public h.h.f.a.b p(int i2) {
        Context contextU = this.f127n.u();
        q(LayoutInflater.from(contextU).inflate(i2, (ViewGroup) new LinearLayout(contextU), false));
        return this;
    }

    public h.h.f.a.b q(View view) {
        int i2;
        this.A = view;
        this.B = null;
        if (view != null && view.getId() == -1 && (i2 = this.a) > 0) {
            view.setId(i2);
        }
        this.f127n.I(this);
        return this;
    }

    public void r(boolean z) {
        this.D = z;
        this.f127n.K(false);
    }

    void s(boolean z) {
        int i2 = this.y;
        int i3 = (z ? 2 : 0) | (i2 & (-3));
        this.y = i3;
        if (i2 != i3) {
            this.f127n.K(false);
        }
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // h.h.f.a.b, android.view.MenuItem
    public /* bridge */ /* synthetic */ MenuItem setActionView(int i2) {
        p(i2);
        return this;
    }

    @Override // h.h.f.a.b, android.view.MenuItem
    public /* bridge */ /* synthetic */ MenuItem setActionView(View view) {
        q(view);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c) {
        if (this.f123j == c) {
            return this;
        }
        this.f123j = Character.toLowerCase(c);
        this.f127n.K(false);
        return this;
    }

    @Override // h.h.f.a.b, android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c, int i2) {
        if (this.f123j == c && this.f124k == i2) {
            return this;
        }
        this.f123j = Character.toLowerCase(c);
        this.f124k = KeyEvent.normalizeMetaState(i2);
        this.f127n.K(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z) {
        int i2 = this.y;
        int i3 = (z ? 1 : 0) | (i2 & (-2));
        this.y = i3;
        if (i2 != i3) {
            this.f127n.K(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z) {
        if ((this.y & 4) != 0) {
            this.f127n.T(this);
        } else {
            s(z);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public /* bridge */ /* synthetic */ MenuItem setContentDescription(CharSequence charSequence) {
        setContentDescription(charSequence);
        return this;
    }

    @Override // h.h.f.a.b, android.view.MenuItem
    public h.h.f.a.b setContentDescription(CharSequence charSequence) {
        this.r = charSequence;
        this.f127n.K(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z) {
        this.y = z ? this.y | 16 : this.y & (-17);
        this.f127n.K(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i2) {
        this.f125l = null;
        this.f126m = i2;
        this.x = true;
        this.f127n.K(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.f126m = 0;
        this.f125l = drawable;
        this.x = true;
        this.f127n.K(false);
        return this;
    }

    @Override // h.h.f.a.b, android.view.MenuItem
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.t = colorStateList;
        this.v = true;
        this.x = true;
        this.f127n.K(false);
        return this;
    }

    @Override // h.h.f.a.b, android.view.MenuItem
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.u = mode;
        this.w = true;
        this.x = true;
        this.f127n.K(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.f120g = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c) {
        if (this.f121h == c) {
            return this;
        }
        this.f121h = c;
        this.f127n.K(false);
        return this;
    }

    @Override // h.h.f.a.b, android.view.MenuItem
    public MenuItem setNumericShortcut(char c, int i2) {
        if (this.f121h == c && this.f122i == i2) {
            return this;
        }
        this.f121h = c;
        this.f122i = KeyEvent.normalizeMetaState(i2);
        this.f127n.K(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.C = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.q = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c, char c2) {
        this.f121h = c;
        this.f123j = Character.toLowerCase(c2);
        this.f127n.K(false);
        return this;
    }

    @Override // h.h.f.a.b, android.view.MenuItem
    public MenuItem setShortcut(char c, char c2, int i2, int i3) {
        this.f121h = c;
        this.f122i = KeyEvent.normalizeMetaState(i2);
        this.f123j = Character.toLowerCase(c2);
        this.f124k = KeyEvent.normalizeMetaState(i3);
        this.f127n.K(false);
        return this;
    }

    @Override // h.h.f.a.b, android.view.MenuItem
    public void setShowAsAction(int i2) {
        int i3 = i2 & 3;
        if (i3 != 0 && i3 != 1 && i3 != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.z = i2;
        this.f127n.I(this);
    }

    @Override // h.h.f.a.b, android.view.MenuItem
    public /* bridge */ /* synthetic */ MenuItem setShowAsActionFlags(int i2) {
        w(i2);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i2) {
        setTitle(this.f127n.u().getString(i2));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.e = charSequence;
        this.f127n.K(false);
        r rVar = this.f128o;
        if (rVar != null) {
            rVar.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f = charSequence;
        this.f127n.K(false);
        return this;
    }

    @Override // android.view.MenuItem
    public /* bridge */ /* synthetic */ MenuItem setTooltipText(CharSequence charSequence) {
        setTooltipText(charSequence);
        return this;
    }

    @Override // h.h.f.a.b, android.view.MenuItem
    public h.h.f.a.b setTooltipText(CharSequence charSequence) {
        this.s = charSequence;
        this.f127n.K(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z) {
        if (y(z)) {
            this.f127n.J(this);
        }
        return this;
    }

    public void t(boolean z) {
        this.y = (z ? 4 : 0) | (this.y & (-5));
    }

    public String toString() {
        CharSequence charSequence = this.e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    public void u(boolean z) {
        this.y = z ? this.y | 32 : this.y & (-33);
    }

    void v(ContextMenu.ContextMenuInfo contextMenuInfo) {
        this.E = contextMenuInfo;
    }

    public h.h.f.a.b w(int i2) {
        setShowAsAction(i2);
        return this;
    }

    public void x(r rVar) {
        this.f128o = rVar;
        rVar.setHeaderTitle(getTitle());
    }

    boolean y(boolean z) {
        int i2 = this.y;
        int i3 = (z ? 0 : 8) | (i2 & (-9));
        this.y = i3;
        return i2 != i3;
    }

    public boolean z() {
        return this.f127n.A();
    }
}
