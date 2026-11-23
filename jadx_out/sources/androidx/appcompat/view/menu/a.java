package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import com.appff.haptic.base.Utils;

/* JADX INFO: loaded from: classes.dex */
public class a implements h.h.f.a.b {
    private final int a;
    private final int b;
    private final int c;
    private CharSequence d;
    private CharSequence e;
    private Intent f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private char f88g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private char f90i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Drawable f92k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Context f93l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private CharSequence f94m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private CharSequence f95n;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f89h = Utils.CONTINUOUS_EVENT;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f91j = Utils.CONTINUOUS_EVENT;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private ColorStateList f96o = null;
    private PorterDuff.Mode p = null;
    private boolean q = false;
    private boolean r = false;
    private int s = 16;

    public a(Context context, int i2, int i3, int i4, int i5, CharSequence charSequence) {
        this.f93l = context;
        this.a = i3;
        this.b = i2;
        this.c = i5;
        this.d = charSequence;
    }

    private void c() {
        Drawable drawable = this.f92k;
        if (drawable != null) {
            if (this.q || this.r) {
                Drawable drawableP = androidx.core.graphics.drawable.a.p(drawable);
                this.f92k = drawableP;
                Drawable drawableMutate = drawableP.mutate();
                this.f92k = drawableMutate;
                if (this.q) {
                    androidx.core.graphics.drawable.a.n(drawableMutate, this.f96o);
                }
                if (this.r) {
                    androidx.core.graphics.drawable.a.o(this.f92k, this.p);
                }
            }
        }
    }

    @Override // h.h.f.a.b
    public h.h.f.a.b a(h.h.l.d dVar) {
        throw new UnsupportedOperationException();
    }

    @Override // h.h.f.a.b
    public h.h.l.d b() {
        return null;
    }

    @Override // h.h.f.a.b, android.view.MenuItem
    public boolean collapseActionView() {
        return false;
    }

    public h.h.f.a.b d(int i2) {
        throw new UnsupportedOperationException();
    }

    public h.h.f.a.b e(View view) {
        throw new UnsupportedOperationException();
    }

    @Override // h.h.f.a.b, android.view.MenuItem
    public boolean expandActionView() {
        return false;
    }

    public h.h.f.a.b f(int i2) {
        setShowAsAction(i2);
        return this;
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    @Override // h.h.f.a.b, android.view.MenuItem
    public View getActionView() {
        return null;
    }

    @Override // h.h.f.a.b, android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.f91j;
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.f90i;
    }

    @Override // h.h.f.a.b, android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.f94m;
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.b;
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        return this.f92k;
    }

    @Override // h.h.f.a.b, android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.f96o;
    }

    @Override // h.h.f.a.b, android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.p;
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.f;
    }

    @Override // android.view.MenuItem
    public int getItemId() {
        return this.a;
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // h.h.f.a.b, android.view.MenuItem
    public int getNumericModifiers() {
        return this.f89h;
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.f88g;
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.c;
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return null;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitle() {
        return this.d;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.e;
        return charSequence != null ? charSequence : this.d;
    }

    @Override // h.h.f.a.b, android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.f95n;
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return false;
    }

    @Override // h.h.f.a.b, android.view.MenuItem
    public boolean isActionViewExpanded() {
        return false;
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return (this.s & 1) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return (this.s & 2) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return (this.s & 16) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        return (this.s & 8) == 0;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    @Override // h.h.f.a.b, android.view.MenuItem
    public /* bridge */ /* synthetic */ MenuItem setActionView(int i2) {
        d(i2);
        throw null;
    }

    @Override // h.h.f.a.b, android.view.MenuItem
    public /* bridge */ /* synthetic */ MenuItem setActionView(View view) {
        e(view);
        throw null;
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c) {
        this.f90i = Character.toLowerCase(c);
        return this;
    }

    @Override // h.h.f.a.b, android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c, int i2) {
        this.f90i = Character.toLowerCase(c);
        this.f91j = KeyEvent.normalizeMetaState(i2);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z) {
        this.s = (z ? 1 : 0) | (this.s & (-2));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z) {
        this.s = (z ? 2 : 0) | (this.s & (-3));
        return this;
    }

    @Override // android.view.MenuItem
    public /* bridge */ /* synthetic */ MenuItem setContentDescription(CharSequence charSequence) {
        setContentDescription(charSequence);
        return this;
    }

    @Override // h.h.f.a.b, android.view.MenuItem
    public h.h.f.a.b setContentDescription(CharSequence charSequence) {
        this.f94m = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z) {
        this.s = (z ? 16 : 0) | (this.s & (-17));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i2) {
        this.f92k = androidx.core.content.a.f(this.f93l, i2);
        c();
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.f92k = drawable;
        c();
        return this;
    }

    @Override // h.h.f.a.b, android.view.MenuItem
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f96o = colorStateList;
        this.q = true;
        c();
        return this;
    }

    @Override // h.h.f.a.b, android.view.MenuItem
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.p = mode;
        this.r = true;
        c();
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.f = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c) {
        this.f88g = c;
        return this;
    }

    @Override // h.h.f.a.b, android.view.MenuItem
    public MenuItem setNumericShortcut(char c, int i2) {
        this.f88g = c;
        this.f89h = KeyEvent.normalizeMetaState(i2);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c, char c2) {
        this.f88g = c;
        this.f90i = Character.toLowerCase(c2);
        return this;
    }

    @Override // h.h.f.a.b, android.view.MenuItem
    public MenuItem setShortcut(char c, char c2, int i2, int i3) {
        this.f88g = c;
        this.f89h = KeyEvent.normalizeMetaState(i2);
        this.f90i = Character.toLowerCase(c2);
        this.f91j = KeyEvent.normalizeMetaState(i3);
        return this;
    }

    @Override // h.h.f.a.b, android.view.MenuItem
    public void setShowAsAction(int i2) {
    }

    @Override // h.h.f.a.b, android.view.MenuItem
    public /* bridge */ /* synthetic */ MenuItem setShowAsActionFlags(int i2) {
        f(i2);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i2) {
        this.d = this.f93l.getResources().getString(i2);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.d = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.e = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public /* bridge */ /* synthetic */ MenuItem setTooltipText(CharSequence charSequence) {
        setTooltipText(charSequence);
        return this;
    }

    @Override // h.h.f.a.b, android.view.MenuItem
    public h.h.f.a.b setTooltipText(CharSequence charSequence) {
        this.f95n = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z) {
        this.s = (this.s & 8) | (z ? 0 : 8);
        return this;
    }
}
