package androidx.appcompat.widget;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;

/* JADX INFO: loaded from: classes.dex */
public class a0 extends Spinner implements h.h.l.x {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int[] f177i = {R.attr.spinnerMode};
    private final androidx.appcompat.widget.f a;
    private final Context b;
    private l0 c;
    private SpinnerAdapter d;
    private final boolean e;
    private g f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    int f178g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final Rect f179h;

    class a extends l0 {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ e f180j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(View view, e eVar) {
            super(view);
            this.f180j = eVar;
        }

        @Override // androidx.appcompat.widget.l0
        public androidx.appcompat.view.menu.p b() {
            return this.f180j;
        }

        @Override // androidx.appcompat.widget.l0
        @SuppressLint({"SyntheticAccessor"})
        public boolean c() {
            if (a0.this.getInternalPopup().b()) {
                return true;
            }
            a0.this.b();
            return true;
        }
    }

    class b implements ViewTreeObserver.OnGlobalLayoutListener {
        b() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!a0.this.getInternalPopup().b()) {
                a0.this.b();
            }
            ViewTreeObserver viewTreeObserver = a0.this.getViewTreeObserver();
            if (viewTreeObserver != null) {
                if (Build.VERSION.SDK_INT >= 16) {
                    viewTreeObserver.removeOnGlobalLayoutListener(this);
                } else {
                    viewTreeObserver.removeGlobalOnLayoutListener(this);
                }
            }
        }
    }

    class c implements g, DialogInterface.OnClickListener {
        androidx.appcompat.app.b a;
        private ListAdapter b;
        private CharSequence c;

        c() {
        }

        @Override // androidx.appcompat.widget.a0.g
        public int a() {
            return 0;
        }

        @Override // androidx.appcompat.widget.a0.g
        public boolean b() {
            androidx.appcompat.app.b bVar = this.a;
            if (bVar != null) {
                return bVar.isShowing();
            }
            return false;
        }

        @Override // androidx.appcompat.widget.a0.g
        public void dismiss() {
            androidx.appcompat.app.b bVar = this.a;
            if (bVar != null) {
                bVar.dismiss();
                this.a = null;
            }
        }

        @Override // androidx.appcompat.widget.a0.g
        public Drawable f() {
            return null;
        }

        @Override // androidx.appcompat.widget.a0.g
        public void h(CharSequence charSequence) {
            this.c = charSequence;
        }

        @Override // androidx.appcompat.widget.a0.g
        public void i(Drawable drawable) {
            Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.a0.g
        public void j(int i2) {
            Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.a0.g
        public void k(int i2) {
            Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.a0.g
        public void l(int i2) {
            Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.a0.g
        public void m(int i2, int i3) {
            if (this.b == null) {
                return;
            }
            androidx.appcompat.app.b.a aVar = new androidx.appcompat.app.b.a(a0.this.getPopupContext());
            CharSequence charSequence = this.c;
            if (charSequence != null) {
                aVar.h(charSequence);
            }
            aVar.g(this.b, a0.this.getSelectedItemPosition(), this);
            androidx.appcompat.app.b bVarA = aVar.a();
            this.a = bVarA;
            ListView listViewE = bVarA.e();
            if (Build.VERSION.SDK_INT >= 17) {
                listViewE.setTextDirection(i2);
                listViewE.setTextAlignment(i3);
            }
            this.a.show();
        }

        @Override // androidx.appcompat.widget.a0.g
        public int n() {
            return 0;
        }

        @Override // androidx.appcompat.widget.a0.g
        public CharSequence o() {
            return this.c;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i2) {
            a0.this.setSelection(i2);
            if (a0.this.getOnItemClickListener() != null) {
                a0.this.performItemClick(null, i2, this.b.getItemId(i2));
            }
            dismiss();
        }

        @Override // androidx.appcompat.widget.a0.g
        public void p(ListAdapter listAdapter) {
            this.b = listAdapter;
        }
    }

    private static class d implements ListAdapter, SpinnerAdapter {
        private SpinnerAdapter a;
        private ListAdapter b;

        public d(SpinnerAdapter spinnerAdapter, Resources.Theme theme) {
            this.a = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                this.b = (ListAdapter) spinnerAdapter;
            }
            if (theme != null) {
                if (Build.VERSION.SDK_INT >= 23 && (spinnerAdapter instanceof ThemedSpinnerAdapter)) {
                    ThemedSpinnerAdapter themedSpinnerAdapter = (ThemedSpinnerAdapter) spinnerAdapter;
                    if (themedSpinnerAdapter.getDropDownViewTheme() != theme) {
                        themedSpinnerAdapter.setDropDownViewTheme(theme);
                        return;
                    }
                    return;
                }
                if (spinnerAdapter instanceof w0) {
                    w0 w0Var = (w0) spinnerAdapter;
                    if (w0Var.getDropDownViewTheme() == null) {
                        w0Var.setDropDownViewTheme(theme);
                    }
                }
            }
        }

        @Override // android.widget.ListAdapter
        public boolean areAllItemsEnabled() {
            ListAdapter listAdapter = this.b;
            if (listAdapter != null) {
                return listAdapter.areAllItemsEnabled();
            }
            return true;
        }

        @Override // android.widget.Adapter
        public int getCount() {
            SpinnerAdapter spinnerAdapter = this.a;
            if (spinnerAdapter == null) {
                return 0;
            }
            return spinnerAdapter.getCount();
        }

        @Override // android.widget.SpinnerAdapter
        public View getDropDownView(int i2, View view, ViewGroup viewGroup) {
            SpinnerAdapter spinnerAdapter = this.a;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getDropDownView(i2, view, viewGroup);
        }

        @Override // android.widget.Adapter
        public Object getItem(int i2) {
            SpinnerAdapter spinnerAdapter = this.a;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getItem(i2);
        }

        @Override // android.widget.Adapter
        public long getItemId(int i2) {
            SpinnerAdapter spinnerAdapter = this.a;
            if (spinnerAdapter == null) {
                return -1L;
            }
            return spinnerAdapter.getItemId(i2);
        }

        @Override // android.widget.Adapter
        public int getItemViewType(int i2) {
            return 0;
        }

        @Override // android.widget.Adapter
        public View getView(int i2, View view, ViewGroup viewGroup) {
            return getDropDownView(i2, view, viewGroup);
        }

        @Override // android.widget.Adapter
        public int getViewTypeCount() {
            return 1;
        }

        @Override // android.widget.Adapter
        public boolean hasStableIds() {
            SpinnerAdapter spinnerAdapter = this.a;
            return spinnerAdapter != null && spinnerAdapter.hasStableIds();
        }

        @Override // android.widget.Adapter
        public boolean isEmpty() {
            return getCount() == 0;
        }

        @Override // android.widget.ListAdapter
        public boolean isEnabled(int i2) {
            ListAdapter listAdapter = this.b;
            if (listAdapter != null) {
                return listAdapter.isEnabled(i2);
            }
            return true;
        }

        @Override // android.widget.Adapter
        public void registerDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.a;
            if (spinnerAdapter != null) {
                spinnerAdapter.registerDataSetObserver(dataSetObserver);
            }
        }

        @Override // android.widget.Adapter
        public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.a;
            if (spinnerAdapter != null) {
                spinnerAdapter.unregisterDataSetObserver(dataSetObserver);
            }
        }
    }

    class e extends n0 implements g {
        private CharSequence R;
        ListAdapter S;
        private final Rect T;
        private int U;

        class a implements AdapterView.OnItemClickListener {
            a(a0 a0Var) {
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i2, long j2) {
                a0.this.setSelection(i2);
                if (a0.this.getOnItemClickListener() != null) {
                    e eVar = e.this;
                    a0.this.performItemClick(view, i2, eVar.S.getItemId(i2));
                }
                e.this.dismiss();
            }
        }

        class b implements ViewTreeObserver.OnGlobalLayoutListener {
            b() {
            }

            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                e eVar = e.this;
                if (!eVar.Q(a0.this)) {
                    e.this.dismiss();
                } else {
                    e.this.O();
                    e.super.d();
                }
            }
        }

        class c implements PopupWindow.OnDismissListener {
            final /* synthetic */ ViewTreeObserver.OnGlobalLayoutListener a;

            c(ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
                this.a = onGlobalLayoutListener;
            }

            @Override // android.widget.PopupWindow.OnDismissListener
            public void onDismiss() {
                ViewTreeObserver viewTreeObserver = a0.this.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeGlobalOnLayoutListener(this.a);
                }
            }
        }

        public e(Context context, AttributeSet attributeSet, int i2) {
            super(context, attributeSet, i2);
            this.T = new Rect();
            z(a0.this);
            F(true);
            K(0);
            H(new a(a0.this));
        }

        /* JADX WARN: Code duplicated, block: B:23:0x008d  */
        /* JADX WARN: Code duplicated, block: B:24:0x009a  */
        void O() {
            int iMax;
            int iP;
            Drawable drawableF = f();
            int i2 = 0;
            if (drawableF != null) {
                drawableF.getPadding(a0.this.f179h);
                i2 = g1.b(a0.this) ? a0.this.f179h.right : -a0.this.f179h.left;
            } else {
                Rect rect = a0.this.f179h;
                rect.right = 0;
                rect.left = 0;
            }
            int paddingLeft = a0.this.getPaddingLeft();
            int paddingRight = a0.this.getPaddingRight();
            int width = a0.this.getWidth();
            a0 a0Var = a0.this;
            int i3 = a0Var.f178g;
            if (i3 != -2) {
                if (i3 == -1) {
                    iMax = (width - paddingLeft) - paddingRight;
                } else {
                    B(i3);
                }
                if (g1.b(a0.this)) {
                    iP = i2 + (((width - paddingRight) - v()) - P());
                } else {
                    iP = i2 + paddingLeft + P();
                }
                l(iP);
            }
            int iA = a0Var.a((SpinnerAdapter) this.S, f());
            int i4 = a0.this.getContext().getResources().getDisplayMetrics().widthPixels;
            Rect rect2 = a0.this.f179h;
            int i5 = (i4 - rect2.left) - rect2.right;
            if (iA > i5) {
                iA = i5;
            }
            iMax = Math.max(iA, (width - paddingLeft) - paddingRight);
            B(iMax);
            if (g1.b(a0.this)) {
                iP = i2 + (((width - paddingRight) - v()) - P());
            } else {
                iP = i2 + paddingLeft + P();
            }
            l(iP);
        }

        public int P() {
            return this.U;
        }

        boolean Q(View view) {
            return h.h.l.y.z(view) && view.getGlobalVisibleRect(this.T);
        }

        @Override // androidx.appcompat.widget.a0.g
        public void h(CharSequence charSequence) {
            this.R = charSequence;
        }

        @Override // androidx.appcompat.widget.a0.g
        public void k(int i2) {
            this.U = i2;
        }

        @Override // androidx.appcompat.widget.a0.g
        public void m(int i2, int i3) {
            ViewTreeObserver viewTreeObserver;
            boolean zB = b();
            O();
            E(2);
            super.d();
            ListView listViewG = g();
            listViewG.setChoiceMode(1);
            if (Build.VERSION.SDK_INT >= 17) {
                listViewG.setTextDirection(i2);
                listViewG.setTextAlignment(i3);
            }
            L(a0.this.getSelectedItemPosition());
            if (zB || (viewTreeObserver = a0.this.getViewTreeObserver()) == null) {
                return;
            }
            b bVar = new b();
            viewTreeObserver.addOnGlobalLayoutListener(bVar);
            G(new c(bVar));
        }

        @Override // androidx.appcompat.widget.a0.g
        public CharSequence o() {
            return this.R;
        }

        @Override // androidx.appcompat.widget.n0, androidx.appcompat.widget.a0.g
        public void p(ListAdapter listAdapter) {
            super.p(listAdapter);
            this.S = listAdapter;
        }
    }

    static class f extends View.BaseSavedState {
        public static final Parcelable.Creator<f> CREATOR = new a();
        boolean a;

        class a implements Parcelable.Creator<f> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public f createFromParcel(Parcel parcel) {
                return new f(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public f[] newArray(int i2) {
                return new f[i2];
            }
        }

        f(Parcel parcel) {
            super(parcel);
            this.a = parcel.readByte() != 0;
        }

        f(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            parcel.writeByte(this.a ? (byte) 1 : (byte) 0);
        }
    }

    interface g {
        int a();

        boolean b();

        void dismiss();

        Drawable f();

        void h(CharSequence charSequence);

        void i(Drawable drawable);

        void j(int i2);

        void k(int i2);

        void l(int i2);

        void m(int i2, int i3);

        int n();

        CharSequence o();

        void p(ListAdapter listAdapter);
    }

    public a0(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, h.b.a.J);
    }

    public a0(Context context, AttributeSet attributeSet, int i2) {
        this(context, attributeSet, i2, -1);
    }

    public a0(Context context, AttributeSet attributeSet, int i2, int i3) {
        this(context, attributeSet, i2, i3, null);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0049 A[Catch: Exception -> 0x0053, all -> 0x0063, TRY_LEAVE, TryCatch #0 {all -> 0x0063, blocks: (B:13:0x0043, B:15:0x0049, B:24:0x0059), top: B:46:0x003b }] */
    /* JADX WARN: Code duplicated, block: B:17:0x004f A[PHI: r10 r11
  0x004f: PHI (r10v2 int) = (r10v0 int), (r10v4 int) binds: [B:25:0x0060, B:16:0x004d] A[DONT_GENERATE, DONT_INLINE]
  0x004f: PHI (r11v6 android.content.res.TypedArray) = (r11v5 android.content.res.TypedArray), (r11v8 android.content.res.TypedArray) binds: [B:25:0x0060, B:16:0x004d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:34:0x006e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:36:0x0071  */
    /* JADX WARN: Code duplicated, block: B:37:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:40:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:43:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:49:0x003d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    public a0(Context context, AttributeSet attributeSet, int i2, int i3, Resources.Theme theme) throws Throwable {
        h.b.n.d dVar;
        TypedArray typedArray;
        TypedArray typedArrayObtainStyledAttributes;
        CharSequence[] charSequenceArrP;
        SpinnerAdapter spinnerAdapter;
        super(context, attributeSet, i2);
        this.f179h = new Rect();
        v0.a(this, getContext());
        a1 a1VarU = a1.u(context, attributeSet, h.b.j.r2, i2, 0);
        this.a = new androidx.appcompat.widget.f(this);
        try {
            if (theme == null) {
                int iM = a1VarU.m(h.b.j.w2, 0);
                if (iM != 0) {
                    dVar = new h.b.n.d(context, iM);
                } else {
                    this.b = context;
                }
                typedArray = 0;
                if (i3 == -1) {
                    try {
                        typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f177i, i2, 0);
                        try {
                            i3 = typedArrayObtainStyledAttributes.hasValue(0) ? typedArrayObtainStyledAttributes.getInt(0, 0) : i3;
                            if (typedArrayObtainStyledAttributes != null) {
                                typedArrayObtainStyledAttributes.recycle();
                            }
                        } catch (Exception e2) {
                            e = e2;
                            Log.i("AppCompatSpinner", "Could not read android:spinnerMode", e);
                            if (typedArrayObtainStyledAttributes != null) {
                                typedArrayObtainStyledAttributes.recycle();
                            }
                        }
                    } catch (Exception e3) {
                        e = e3;
                        typedArrayObtainStyledAttributes = null;
                    } catch (Throwable th) {
                        th = th;
                        if (typedArray != 0) {
                            typedArray.recycle();
                        }
                        throw th;
                    }
                }
                if (i3 != 0) {
                    c cVar = new c();
                    this.f = cVar;
                    cVar.h(a1VarU.n(h.b.j.u2));
                } else if (i3 == 1) {
                    e eVar = new e(this.b, attributeSet, i2);
                    a1 a1VarU2 = a1.u(this.b, attributeSet, h.b.j.r2, i2, 0);
                    this.f178g = a1VarU2.l(h.b.j.v2, -2);
                    eVar.i(a1VarU2.f(h.b.j.t2));
                    eVar.h(a1VarU.n(h.b.j.u2));
                    a1VarU2.v();
                    this.f = eVar;
                    this.c = new a(this, eVar);
                }
                charSequenceArrP = a1VarU.p(h.b.j.s2);
                if (charSequenceArrP != null) {
                    ArrayAdapter arrayAdapter = new ArrayAdapter(context, R.layout.simple_spinner_item, charSequenceArrP);
                    arrayAdapter.setDropDownViewResource(h.b.g.t);
                    setAdapter((SpinnerAdapter) arrayAdapter);
                }
                a1VarU.v();
                this.e = true;
                spinnerAdapter = this.d;
                if (spinnerAdapter != null) {
                    setAdapter(spinnerAdapter);
                    this.d = null;
                }
                this.a.e(attributeSet, i2);
                return;
            }
            dVar = new h.b.n.d(context, theme);
            if (i3 == -1) {
                typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f177i, i2, 0);
                if (typedArrayObtainStyledAttributes.hasValue(0)) {
                }
                if (typedArrayObtainStyledAttributes != null) {
                    typedArrayObtainStyledAttributes.recycle();
                }
            }
            if (i3 != 0) {
                c cVar2 = new c();
                this.f = cVar2;
                cVar2.h(a1VarU.n(h.b.j.u2));
            } else if (i3 == 1) {
                e eVar2 = new e(this.b, attributeSet, i2);
                a1 a1VarU3 = a1.u(this.b, attributeSet, h.b.j.r2, i2, 0);
                this.f178g = a1VarU3.l(h.b.j.v2, -2);
                eVar2.i(a1VarU3.f(h.b.j.t2));
                eVar2.h(a1VarU.n(h.b.j.u2));
                a1VarU3.v();
                this.f = eVar2;
                this.c = new a(this, eVar2);
            }
            charSequenceArrP = a1VarU.p(h.b.j.s2);
            if (charSequenceArrP != null) {
                ArrayAdapter arrayAdapter2 = new ArrayAdapter(context, R.layout.simple_spinner_item, charSequenceArrP);
                arrayAdapter2.setDropDownViewResource(h.b.g.t);
                setAdapter((SpinnerAdapter) arrayAdapter2);
            }
            a1VarU.v();
            this.e = true;
            spinnerAdapter = this.d;
            if (spinnerAdapter != null) {
                setAdapter(spinnerAdapter);
                this.d = null;
            }
            this.a.e(attributeSet, i2);
            return;
        } catch (Throwable th2) {
            th = th2;
            typedArray = -1;
        }
        this.b = dVar;
        typedArray = 0;
    }

    int a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i2 = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int iMax = Math.max(0, getSelectedItemPosition());
        int iMin = Math.min(spinnerAdapter.getCount(), iMax + 15);
        View view = null;
        int iMax2 = 0;
        for (int iMax3 = Math.max(0, iMax - (15 - (iMin - iMax))); iMax3 < iMin; iMax3++) {
            int itemViewType = spinnerAdapter.getItemViewType(iMax3);
            if (itemViewType != i2) {
                view = null;
                i2 = itemViewType;
            }
            view = spinnerAdapter.getView(iMax3, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            iMax2 = Math.max(iMax2, view.getMeasuredWidth());
        }
        if (drawable == null) {
            return iMax2;
        }
        drawable.getPadding(this.f179h);
        Rect rect = this.f179h;
        return iMax2 + rect.left + rect.right;
    }

    void b() {
        if (Build.VERSION.SDK_INT >= 17) {
            this.f.m(getTextDirection(), getTextAlignment());
        } else {
            this.f.m(-1, -1);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        androidx.appcompat.widget.f fVar = this.a;
        if (fVar != null) {
            fVar.b();
        }
    }

    @Override // android.widget.Spinner
    public int getDropDownHorizontalOffset() {
        g gVar = this.f;
        if (gVar != null) {
            return gVar.a();
        }
        if (Build.VERSION.SDK_INT >= 16) {
            return super.getDropDownHorizontalOffset();
        }
        return 0;
    }

    @Override // android.widget.Spinner
    public int getDropDownVerticalOffset() {
        g gVar = this.f;
        if (gVar != null) {
            return gVar.n();
        }
        if (Build.VERSION.SDK_INT >= 16) {
            return super.getDropDownVerticalOffset();
        }
        return 0;
    }

    @Override // android.widget.Spinner
    public int getDropDownWidth() {
        if (this.f != null) {
            return this.f178g;
        }
        if (Build.VERSION.SDK_INT >= 16) {
            return super.getDropDownWidth();
        }
        return 0;
    }

    final g getInternalPopup() {
        return this.f;
    }

    @Override // android.widget.Spinner
    public Drawable getPopupBackground() {
        g gVar = this.f;
        if (gVar != null) {
            return gVar.f();
        }
        if (Build.VERSION.SDK_INT >= 16) {
            return super.getPopupBackground();
        }
        return null;
    }

    @Override // android.widget.Spinner
    public Context getPopupContext() {
        return this.b;
    }

    @Override // android.widget.Spinner
    public CharSequence getPrompt() {
        g gVar = this.f;
        return gVar != null ? gVar.o() : super.getPrompt();
    }

    @Override // h.h.l.x
    public ColorStateList getSupportBackgroundTintList() {
        androidx.appcompat.widget.f fVar = this.a;
        if (fVar != null) {
            return fVar.c();
        }
        return null;
    }

    @Override // h.h.l.x
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        androidx.appcompat.widget.f fVar = this.a;
        if (fVar != null) {
            return fVar.d();
        }
        return null;
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        g gVar = this.f;
        if (gVar == null || !gVar.b()) {
            return;
        }
        this.f.dismiss();
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    protected void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        if (this.f == null || View.MeasureSpec.getMode(i2) != Integer.MIN_VALUE) {
            return;
        }
        setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i2)), getMeasuredHeight());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        f fVar = (f) parcelable;
        super.onRestoreInstanceState(fVar.getSuperState());
        if (!fVar.a || (viewTreeObserver = getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new b());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public Parcelable onSaveInstanceState() {
        f fVar = new f(super.onSaveInstanceState());
        g gVar = this.f;
        fVar.a = gVar != null && gVar.b();
        return fVar;
    }

    @Override // android.widget.Spinner, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        l0 l0Var = this.c;
        if (l0Var == null || !l0Var.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.Spinner, android.view.View
    public boolean performClick() {
        g gVar = this.f;
        if (gVar == null) {
            return super.performClick();
        }
        if (gVar.b()) {
            return true;
        }
        b();
        return true;
    }

    @Override // android.widget.AdapterView
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.e) {
            this.d = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        if (this.f != null) {
            Context context = this.b;
            if (context == null) {
                context = getContext();
            }
            this.f.p(new d(spinnerAdapter, context.getTheme()));
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        androidx.appcompat.widget.f fVar = this.a;
        if (fVar != null) {
            fVar.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        androidx.appcompat.widget.f fVar = this.a;
        if (fVar != null) {
            fVar.g(i2);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownHorizontalOffset(int i2) {
        g gVar = this.f;
        if (gVar != null) {
            gVar.k(i2);
            this.f.l(i2);
        } else if (Build.VERSION.SDK_INT >= 16) {
            super.setDropDownHorizontalOffset(i2);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownVerticalOffset(int i2) {
        g gVar = this.f;
        if (gVar != null) {
            gVar.j(i2);
        } else if (Build.VERSION.SDK_INT >= 16) {
            super.setDropDownVerticalOffset(i2);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownWidth(int i2) {
        if (this.f != null) {
            this.f178g = i2;
        } else if (Build.VERSION.SDK_INT >= 16) {
            super.setDropDownWidth(i2);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundDrawable(Drawable drawable) {
        g gVar = this.f;
        if (gVar != null) {
            gVar.i(drawable);
        } else if (Build.VERSION.SDK_INT >= 16) {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundResource(int i2) {
        setPopupBackgroundDrawable(h.b.k.a.a.b(getPopupContext(), i2));
    }

    @Override // android.widget.Spinner
    public void setPrompt(CharSequence charSequence) {
        g gVar = this.f;
        if (gVar != null) {
            gVar.h(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    @Override // h.h.l.x
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        androidx.appcompat.widget.f fVar = this.a;
        if (fVar != null) {
            fVar.i(colorStateList);
        }
    }

    @Override // h.h.l.x
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        androidx.appcompat.widget.f fVar = this.a;
        if (fVar != null) {
            fVar.j(mode);
        }
    }
}
