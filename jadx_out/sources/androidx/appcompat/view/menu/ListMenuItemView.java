package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.appcompat.widget.a1;
import h.h.l.y;

/* JADX INFO: loaded from: classes.dex */
public class ListMenuItemView extends LinearLayout implements n.a, AbsListView.SelectionBoundsAdjuster {
    private i a;
    private ImageView b;
    private RadioButton c;
    private TextView d;
    private CheckBox e;
    private TextView f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private ImageView f79g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private ImageView f80h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private LinearLayout f81i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Drawable f82j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f83k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Context f84l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f85m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private Drawable f86n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f87o;
    private LayoutInflater p;
    private boolean q;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, h.b.a.D);
    }

    public ListMenuItemView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet);
        a1 a1VarU = a1.u(getContext(), attributeSet, h.b.j.O1, i2, 0);
        this.f82j = a1VarU.f(h.b.j.Q1);
        this.f83k = a1VarU.m(h.b.j.P1, -1);
        this.f85m = a1VarU.a(h.b.j.R1, false);
        this.f84l = context;
        this.f86n = a1VarU.f(h.b.j.S1);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{R.attr.divider}, h.b.a.A, 0);
        this.f87o = typedArrayObtainStyledAttributes.hasValue(0);
        a1VarU.v();
        typedArrayObtainStyledAttributes.recycle();
    }

    private void b(View view) {
        c(view, -1);
    }

    private void c(View view, int i2) {
        LinearLayout linearLayout = this.f81i;
        if (linearLayout != null) {
            linearLayout.addView(view, i2);
        } else {
            addView(view, i2);
        }
    }

    private void e() {
        CheckBox checkBox = (CheckBox) getInflater().inflate(h.b.g.f1706h, (ViewGroup) this, false);
        this.e = checkBox;
        b(checkBox);
    }

    private void f() {
        ImageView imageView = (ImageView) getInflater().inflate(h.b.g.f1707i, (ViewGroup) this, false);
        this.b = imageView;
        c(imageView, 0);
    }

    private void g() {
        RadioButton radioButton = (RadioButton) getInflater().inflate(h.b.g.f1709k, (ViewGroup) this, false);
        this.c = radioButton;
        b(radioButton);
    }

    private LayoutInflater getInflater() {
        if (this.p == null) {
            this.p = LayoutInflater.from(getContext());
        }
        return this.p;
    }

    private void setSubMenuArrowVisible(boolean z) {
        ImageView imageView = this.f79g;
        if (imageView != null) {
            imageView.setVisibility(z ? 0 : 8);
        }
    }

    @Override // androidx.appcompat.view.menu.n.a
    public boolean a() {
        return false;
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.f80h;
        if (imageView == null || imageView.getVisibility() != 0) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f80h.getLayoutParams();
        rect.top += this.f80h.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    @Override // androidx.appcompat.view.menu.n.a
    public void d(i iVar, int i2) {
        this.a = iVar;
        setVisibility(iVar.isVisible() ? 0 : 8);
        setTitle(iVar.i(this));
        setCheckable(iVar.isCheckable());
        h(iVar.A(), iVar.g());
        setIcon(iVar.getIcon());
        setEnabled(iVar.isEnabled());
        setSubMenuArrowVisible(iVar.hasSubMenu());
        setContentDescription(iVar.getContentDescription());
    }

    @Override // androidx.appcompat.view.menu.n.a
    public i getItemData() {
        return this.a;
    }

    public void h(boolean z, char c) {
        int i2 = (z && this.a.A()) ? 0 : 8;
        if (i2 == 0) {
            this.f.setText(this.a.h());
        }
        if (this.f.getVisibility() != i2) {
            this.f.setVisibility(i2);
        }
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        y.Q(this, this.f82j);
        TextView textView = (TextView) findViewById(h.b.f.M);
        this.d = textView;
        int i2 = this.f83k;
        if (i2 != -1) {
            textView.setTextAppearance(this.f84l, i2);
        }
        this.f = (TextView) findViewById(h.b.f.F);
        ImageView imageView = (ImageView) findViewById(h.b.f.I);
        this.f79g = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.f86n);
        }
        this.f80h = (ImageView) findViewById(h.b.f.r);
        this.f81i = (LinearLayout) findViewById(h.b.f.f1701l);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i2, int i3) {
        if (this.b != null && this.f85m) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.b.getLayoutParams();
            int i4 = layoutParams.height;
            if (i4 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i4;
            }
        }
        super.onMeasure(i2, i3);
    }

    public void setCheckable(boolean z) {
        CompoundButton compoundButton;
        CompoundButton compoundButton2;
        if (!z && this.c == null && this.e == null) {
            return;
        }
        if (this.a.m()) {
            if (this.c == null) {
                g();
            }
            compoundButton = this.c;
            compoundButton2 = this.e;
        } else {
            if (this.e == null) {
                e();
            }
            compoundButton = this.e;
            compoundButton2 = this.c;
        }
        if (z) {
            compoundButton.setChecked(this.a.isChecked());
            if (compoundButton.getVisibility() != 0) {
                compoundButton.setVisibility(0);
            }
            if (compoundButton2 == null || compoundButton2.getVisibility() == 8) {
                return;
            }
            compoundButton2.setVisibility(8);
            return;
        }
        CheckBox checkBox = this.e;
        if (checkBox != null) {
            checkBox.setVisibility(8);
        }
        RadioButton radioButton = this.c;
        if (radioButton != null) {
            radioButton.setVisibility(8);
        }
    }

    public void setChecked(boolean z) {
        CompoundButton compoundButton;
        if (this.a.m()) {
            if (this.c == null) {
                g();
            }
            compoundButton = this.c;
        } else {
            if (this.e == null) {
                e();
            }
            compoundButton = this.e;
        }
        compoundButton.setChecked(z);
    }

    public void setForceShowIcon(boolean z) {
        this.q = z;
        this.f85m = z;
    }

    public void setGroupDividerEnabled(boolean z) {
        ImageView imageView = this.f80h;
        if (imageView != null) {
            imageView.setVisibility((this.f87o || !z) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        boolean z = this.a.z() || this.q;
        if (z || this.f85m) {
            ImageView imageView = this.b;
            if (imageView == null && drawable == null && !this.f85m) {
                return;
            }
            if (imageView == null) {
                f();
            }
            if (drawable == null && !this.f85m) {
                this.b.setVisibility(8);
                return;
            }
            ImageView imageView2 = this.b;
            if (!z) {
                drawable = null;
            }
            imageView2.setImageDrawable(drawable);
            if (this.b.getVisibility() != 0) {
                this.b.setVisibility(0);
            }
        }
    }

    public void setTitle(CharSequence charSequence) {
        int i2;
        TextView textView;
        if (charSequence != null) {
            this.d.setText(charSequence);
            if (this.d.getVisibility() == 0) {
                return;
            }
            textView = this.d;
            i2 = 0;
        } else {
            i2 = 8;
            if (this.d.getVisibility() == 8) {
                return;
            } else {
                textView = this.d;
            }
        }
        textView.setVisibility(i2);
    }
}
