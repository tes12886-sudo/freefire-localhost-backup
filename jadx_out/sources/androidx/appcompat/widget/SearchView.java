package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.app.SearchableInfo;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import android.widget.TextView;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class SearchView extends m0 implements h.b.n.c {
    static final n z0;
    final ImageView F;
    private final View G;
    private p H;
    private Rect I;
    private Rect J;
    private int[] K;
    private int[] L;
    private final ImageView M;
    private final Drawable N;
    private final int O;
    private final int P;
    private final Intent Q;
    private final Intent R;
    private final CharSequence S;
    private l T;
    private k U;
    View.OnFocusChangeListener V;
    private m W;
    private View.OnClickListener a0;
    private boolean b0;
    private boolean c0;
    h.i.a.a d0;
    private boolean e0;
    private CharSequence f0;
    private boolean g0;
    private boolean h0;
    private int i0;
    private boolean j0;
    private CharSequence k0;
    private CharSequence l0;
    private boolean m0;
    private int n0;
    SearchableInfo o0;
    final SearchAutoComplete p;
    private Bundle p0;
    private final View q;
    private final Runnable q0;
    private final View r;
    private Runnable r0;
    private final View s;
    private final WeakHashMap<String, Drawable.ConstantState> s0;
    final ImageView t;
    private final View.OnClickListener t0;
    final ImageView u;
    View.OnKeyListener u0;
    final ImageView v;
    private final TextView.OnEditorActionListener v0;
    private final AdapterView.OnItemClickListener w0;
    private final AdapterView.OnItemSelectedListener x0;
    private TextWatcher y0;

    public static class SearchAutoComplete extends androidx.appcompat.widget.e {
        private int e;
        private SearchView f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private boolean f166g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final Runnable f167h;

        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                SearchAutoComplete.this.d();
            }
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            this(context, attributeSet, h.b.a.p);
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet, int i2) {
            super(context, attributeSet, i2);
            this.f167h = new a();
            this.e = getThreshold();
        }

        private int getSearchViewTextMinWidthDp() {
            Configuration configuration = getResources().getConfiguration();
            int i2 = configuration.screenWidthDp;
            int i3 = configuration.screenHeightDp;
            if (i2 >= 960 && i3 >= 720 && configuration.orientation == 2) {
                return 256;
            }
            if (i2 >= 600) {
                return j.d.a.e.a.a.i.g.STATUS_RUNNING;
            }
            if (i2 < 640 || i3 < 480) {
                return 160;
            }
            return j.d.a.e.a.a.i.g.STATUS_RUNNING;
        }

        void b() {
            if (Build.VERSION.SDK_INT < 29) {
                SearchView.z0.c(this);
                return;
            }
            setInputMethodMode(1);
            if (enoughToFilter()) {
                showDropDown();
            }
        }

        boolean c() {
            return TextUtils.getTrimmedLength(getText()) == 0;
        }

        void d() {
            if (this.f166g) {
                ((InputMethodManager) getContext().getSystemService("input_method")).showSoftInput(this, 0);
                this.f166g = false;
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public boolean enoughToFilter() {
            return this.e <= 0 || super.enoughToFilter();
        }

        @Override // androidx.appcompat.widget.e, android.widget.TextView, android.view.View
        public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.f166g) {
                removeCallbacks(this.f167h);
                post(this.f167h);
            }
            return inputConnectionOnCreateInputConnection;
        }

        @Override // android.view.View
        protected void onFinishInflate() {
            super.onFinishInflate();
            setMinWidth((int) TypedValue.applyDimension(1, getSearchViewTextMinWidthDp(), getResources().getDisplayMetrics()));
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        protected void onFocusChanged(boolean z, int i2, Rect rect) {
            super.onFocusChanged(z, i2, rect);
            this.f.X();
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public boolean onKeyPreIme(int i2, KeyEvent keyEvent) {
            if (i2 == 4) {
                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                    KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                    if (keyDispatcherState != null) {
                        keyDispatcherState.startTracking(keyEvent, this);
                    }
                    return true;
                }
                if (keyEvent.getAction() == 1) {
                    KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                    if (keyDispatcherState2 != null) {
                        keyDispatcherState2.handleUpEvent(keyEvent);
                    }
                    if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                        this.f.clearFocus();
                        setImeVisibility(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i2, keyEvent);
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public void onWindowFocusChanged(boolean z) {
            super.onWindowFocusChanged(z);
            if (z && this.f.hasFocus() && getVisibility() == 0) {
                this.f166g = true;
                if (SearchView.K(getContext())) {
                    b();
                }
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public void performCompletion() {
        }

        @Override // android.widget.AutoCompleteTextView
        protected void replaceText(CharSequence charSequence) {
        }

        void setImeVisibility(boolean z) {
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            if (!z) {
                this.f166g = false;
                removeCallbacks(this.f167h);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else {
                if (!inputMethodManager.isActive(this)) {
                    this.f166g = true;
                    return;
                }
                this.f166g = false;
                removeCallbacks(this.f167h);
                inputMethodManager.showSoftInput(this, 0);
            }
        }

        void setSearchView(SearchView searchView) {
            this.f = searchView;
        }

        @Override // android.widget.AutoCompleteTextView
        public void setThreshold(int i2) {
            super.setThreshold(i2);
            this.e = i2;
        }
    }

    class a implements TextWatcher {
        a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
            SearchView.this.W(charSequence);
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            SearchView.this.d0();
        }
    }

    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            h.i.a.a aVar = SearchView.this.d0;
            if (aVar instanceof u0) {
                aVar.a(null);
            }
        }
    }

    class d implements View.OnFocusChangeListener {
        d() {
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z) {
            SearchView searchView = SearchView.this;
            View.OnFocusChangeListener onFocusChangeListener = searchView.V;
            if (onFocusChangeListener != null) {
                onFocusChangeListener.onFocusChange(searchView, z);
            }
        }
    }

    class e implements View.OnLayoutChangeListener {
        e() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
            SearchView.this.z();
        }
    }

    class f implements View.OnClickListener {
        f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            SearchView searchView = SearchView.this;
            if (view == searchView.t) {
                searchView.T();
                return;
            }
            if (view == searchView.v) {
                searchView.P();
                return;
            }
            if (view == searchView.u) {
                searchView.U();
            } else if (view == searchView.F) {
                searchView.Y();
            } else if (view == searchView.p) {
                searchView.F();
            }
        }
    }

    class g implements View.OnKeyListener {
        g() {
        }

        @Override // android.view.View.OnKeyListener
        public boolean onKey(View view, int i2, KeyEvent keyEvent) {
            SearchView searchView = SearchView.this;
            if (searchView.o0 == null) {
                return false;
            }
            if (searchView.p.isPopupShowing() && SearchView.this.p.getListSelection() != -1) {
                return SearchView.this.V(view, i2, keyEvent);
            }
            if (SearchView.this.p.c() || !keyEvent.hasNoModifiers() || keyEvent.getAction() != 1 || i2 != 66) {
                return false;
            }
            view.cancelLongPress();
            SearchView searchView2 = SearchView.this;
            searchView2.N(0, null, searchView2.p.getText().toString());
            return true;
        }
    }

    class h implements TextView.OnEditorActionListener {
        h() {
        }

        @Override // android.widget.TextView.OnEditorActionListener
        public boolean onEditorAction(TextView textView, int i2, KeyEvent keyEvent) {
            SearchView.this.U();
            return true;
        }
    }

    class i implements AdapterView.OnItemClickListener {
        i() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i2, long j2) {
            SearchView.this.Q(i2, 0, null);
        }
    }

    class j implements AdapterView.OnItemSelectedListener {
        j() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i2, long j2) {
            SearchView.this.R(i2);
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    public interface k {
        boolean a();
    }

    public interface l {
        boolean a(String str);

        boolean b(String str);
    }

    public interface m {
        boolean a(int i2);

        boolean b(int i2);
    }

    private static class n {
        private Method a;
        private Method b;
        private Method c;

        @SuppressLint({"DiscouragedPrivateApi", "SoonBlockedPrivateApi"})
        n() {
            this.a = null;
            this.b = null;
            this.c = null;
            d();
            try {
                Method declaredMethod = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", new Class[0]);
                this.a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            try {
                Method declaredMethod2 = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", new Class[0]);
                this.b = declaredMethod2;
                declaredMethod2.setAccessible(true);
            } catch (NoSuchMethodException unused2) {
            }
            try {
                Method method = AutoCompleteTextView.class.getMethod("ensureImeVisible", Boolean.TYPE);
                this.c = method;
                method.setAccessible(true);
            } catch (NoSuchMethodException unused3) {
            }
        }

        private static void d() {
            if (Build.VERSION.SDK_INT >= 29) {
                throw new UnsupportedClassVersionError("This function can only be used for API Level < 29.");
            }
        }

        void a(AutoCompleteTextView autoCompleteTextView) {
            d();
            Method method = this.b;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, new Object[0]);
                } catch (Exception unused) {
                }
            }
        }

        void b(AutoCompleteTextView autoCompleteTextView) {
            d();
            Method method = this.a;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, new Object[0]);
                } catch (Exception unused) {
                }
            }
        }

        void c(AutoCompleteTextView autoCompleteTextView) {
            d();
            Method method = this.c;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, Boolean.TRUE);
                } catch (Exception unused) {
                }
            }
        }
    }

    static class o extends h.j.a.a {
        public static final Parcelable.Creator<o> CREATOR = new a();
        boolean c;

        class a implements Parcelable.ClassLoaderCreator<o> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public o createFromParcel(Parcel parcel) {
                return new o(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public o createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new o(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public o[] newArray(int i2) {
                return new o[i2];
            }
        }

        public o(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.c = ((Boolean) parcel.readValue(null)).booleanValue();
        }

        o(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "SearchView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " isIconified=" + this.c + "}";
        }

        @Override // h.j.a.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            parcel.writeValue(Boolean.valueOf(this.c));
        }
    }

    private static class p extends TouchDelegate {
        private final View a;
        private final Rect b;
        private final Rect c;
        private final Rect d;
        private final int e;
        private boolean f;

        public p(Rect rect, Rect rect2, View view) {
            super(rect, view);
            this.e = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
            this.b = new Rect();
            this.d = new Rect();
            this.c = new Rect();
            a(rect, rect2);
            this.a = view;
        }

        public void a(Rect rect, Rect rect2) {
            this.b.set(rect);
            this.d.set(rect);
            Rect rect3 = this.d;
            int i2 = this.e;
            rect3.inset(-i2, -i2);
            this.c.set(rect2);
        }

        /* JADX WARN: Code duplicated, block: B:20:0x003d  */
        @Override // android.view.TouchDelegate
        public boolean onTouchEvent(MotionEvent motionEvent) {
            boolean z;
            float width;
            int height;
            boolean z2;
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            int action = motionEvent.getAction();
            boolean z3 = true;
            if (action != 0) {
                if (action == 1 || action == 2) {
                    z2 = this.f;
                    if (z2 && !this.d.contains(x, y)) {
                        z3 = z2;
                        z = false;
                    }
                } else if (action != 3) {
                    z = true;
                    z3 = false;
                } else {
                    z2 = this.f;
                    this.f = false;
                }
                z3 = z2;
                z = true;
            } else if (this.b.contains(x, y)) {
                this.f = true;
                z = true;
            } else {
                z = true;
                z3 = false;
            }
            if (!z3) {
                return false;
            }
            if (!z || this.c.contains(x, y)) {
                Rect rect = this.c;
                width = x - rect.left;
                height = y - rect.top;
            } else {
                width = this.a.getWidth() / 2;
                height = this.a.getHeight() / 2;
            }
            motionEvent.setLocation(width, height);
            return this.a.dispatchTouchEvent(motionEvent);
        }
    }

    static {
        z0 = Build.VERSION.SDK_INT < 29 ? new n() : null;
    }

    public SearchView(Context context) {
        this(context, null);
    }

    public SearchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, h.b.a.H);
    }

    public SearchView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.I = new Rect();
        this.J = new Rect();
        this.K = new int[2];
        this.L = new int[2];
        this.q0 = new b();
        this.r0 = new c();
        this.s0 = new WeakHashMap<>();
        f fVar = new f();
        this.t0 = fVar;
        this.u0 = new g();
        h hVar = new h();
        this.v0 = hVar;
        i iVar = new i();
        this.w0 = iVar;
        j jVar = new j();
        this.x0 = jVar;
        this.y0 = new a();
        int[] iArr = h.b.j.Z1;
        a1 a1VarU = a1.u(context, attributeSet, iArr, i2, 0);
        h.h.l.y.L(this, context, iArr, attributeSet, a1VarU.q(), i2, 0);
        LayoutInflater.from(context).inflate(a1VarU.m(h.b.j.j2, h.b.g.r), (ViewGroup) this, true);
        SearchAutoComplete searchAutoComplete = (SearchAutoComplete) findViewById(h.b.f.D);
        this.p = searchAutoComplete;
        searchAutoComplete.setSearchView(this);
        this.q = findViewById(h.b.f.z);
        View viewFindViewById = findViewById(h.b.f.C);
        this.r = viewFindViewById;
        View viewFindViewById2 = findViewById(h.b.f.J);
        this.s = viewFindViewById2;
        ImageView imageView = (ImageView) findViewById(h.b.f.x);
        this.t = imageView;
        ImageView imageView2 = (ImageView) findViewById(h.b.f.A);
        this.u = imageView2;
        ImageView imageView3 = (ImageView) findViewById(h.b.f.y);
        this.v = imageView3;
        ImageView imageView4 = (ImageView) findViewById(h.b.f.E);
        this.F = imageView4;
        ImageView imageView5 = (ImageView) findViewById(h.b.f.B);
        this.M = imageView5;
        h.h.l.y.Q(viewFindViewById, a1VarU.f(h.b.j.k2));
        h.h.l.y.Q(viewFindViewById2, a1VarU.f(h.b.j.o2));
        int i3 = h.b.j.n2;
        imageView.setImageDrawable(a1VarU.f(i3));
        imageView2.setImageDrawable(a1VarU.f(h.b.j.h2));
        imageView3.setImageDrawable(a1VarU.f(h.b.j.e2));
        imageView4.setImageDrawable(a1VarU.f(h.b.j.q2));
        imageView5.setImageDrawable(a1VarU.f(i3));
        this.N = a1VarU.f(h.b.j.m2);
        c1.a(imageView, getResources().getString(h.b.h.f1719l));
        this.O = a1VarU.m(h.b.j.p2, h.b.g.q);
        this.P = a1VarU.m(h.b.j.f2, 0);
        imageView.setOnClickListener(fVar);
        imageView3.setOnClickListener(fVar);
        imageView2.setOnClickListener(fVar);
        imageView4.setOnClickListener(fVar);
        searchAutoComplete.setOnClickListener(fVar);
        searchAutoComplete.addTextChangedListener(this.y0);
        searchAutoComplete.setOnEditorActionListener(hVar);
        searchAutoComplete.setOnItemClickListener(iVar);
        searchAutoComplete.setOnItemSelectedListener(jVar);
        searchAutoComplete.setOnKeyListener(this.u0);
        searchAutoComplete.setOnFocusChangeListener(new d());
        setIconifiedByDefault(a1VarU.a(h.b.j.i2, true));
        int iE = a1VarU.e(h.b.j.b2, -1);
        if (iE != -1) {
            setMaxWidth(iE);
        }
        this.S = a1VarU.o(h.b.j.g2);
        this.f0 = a1VarU.o(h.b.j.l2);
        int iJ = a1VarU.j(h.b.j.d2, -1);
        if (iJ != -1) {
            setImeOptions(iJ);
        }
        int iJ2 = a1VarU.j(h.b.j.c2, -1);
        if (iJ2 != -1) {
            setInputType(iJ2);
        }
        setFocusable(a1VarU.a(h.b.j.a2, true));
        a1VarU.v();
        Intent intent = new Intent("android.speech.action.WEB_SEARCH");
        this.Q = intent;
        intent.addFlags(268435456);
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        Intent intent2 = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        this.R = intent2;
        intent2.addFlags(268435456);
        View viewFindViewById3 = findViewById(searchAutoComplete.getDropDownAnchor());
        this.G = viewFindViewById3;
        if (viewFindViewById3 != null) {
            viewFindViewById3.addOnLayoutChangeListener(new e());
        }
        i0(this.b0);
        e0();
    }

    private Intent A(String str, Uri uri, String str2, String str3, int i2, String str4) {
        Intent intent = new Intent(str);
        intent.addFlags(268435456);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.l0);
        if (str3 != null) {
            intent.putExtra("query", str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        Bundle bundle = this.p0;
        if (bundle != null) {
            intent.putExtra("app_data", bundle);
        }
        if (i2 != 0) {
            intent.putExtra("action_key", i2);
            intent.putExtra("action_msg", str4);
        }
        intent.setComponent(this.o0.getSearchActivity());
        return intent;
    }

    private Intent B(Cursor cursor, int i2, String str) {
        int position;
        String strO;
        try {
            String strO2 = u0.o(cursor, "suggest_intent_action");
            if (strO2 == null) {
                strO2 = this.o0.getSuggestIntentAction();
            }
            if (strO2 == null) {
                strO2 = "android.intent.action.SEARCH";
            }
            String str2 = strO2;
            String strO3 = u0.o(cursor, "suggest_intent_data");
            if (strO3 == null) {
                strO3 = this.o0.getSuggestIntentData();
            }
            if (strO3 != null && (strO = u0.o(cursor, "suggest_intent_data_id")) != null) {
                strO3 = strO3 + "/" + Uri.encode(strO);
            }
            return A(str2, strO3 == null ? null : Uri.parse(strO3), u0.o(cursor, "suggest_intent_extra_data"), u0.o(cursor, "suggest_intent_query"), i2, str);
        } catch (RuntimeException e2) {
            try {
                position = cursor.getPosition();
            } catch (RuntimeException unused) {
                position = -1;
            }
            Log.w("SearchView", "Search suggestions cursor at row " + position + " returned exception.", e2);
            return null;
        }
    }

    private Intent C(Intent intent, SearchableInfo searchableInfo) {
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        Intent intent2 = new Intent("android.intent.action.SEARCH");
        intent2.setComponent(searchActivity);
        PendingIntent activity = PendingIntent.getActivity(getContext(), 0, intent2, 1107296256);
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.p0;
        if (bundle2 != null) {
            bundle.putParcelable("app_data", bundle2);
        }
        Intent intent3 = new Intent(intent);
        Resources resources = getResources();
        String string = searchableInfo.getVoiceLanguageModeId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageModeId()) : "free_form";
        String string2 = searchableInfo.getVoicePromptTextId() != 0 ? resources.getString(searchableInfo.getVoicePromptTextId()) : null;
        String string3 = searchableInfo.getVoiceLanguageId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageId()) : null;
        int voiceMaxResults = searchableInfo.getVoiceMaxResults() != 0 ? searchableInfo.getVoiceMaxResults() : 1;
        intent3.putExtra("android.speech.extra.LANGUAGE_MODEL", string);
        intent3.putExtra("android.speech.extra.PROMPT", string2);
        intent3.putExtra("android.speech.extra.LANGUAGE", string3);
        intent3.putExtra("android.speech.extra.MAX_RESULTS", voiceMaxResults);
        intent3.putExtra("calling_package", searchActivity != null ? searchActivity.flattenToShortString() : null);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", activity);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", bundle);
        return intent3;
    }

    private Intent D(Intent intent, SearchableInfo searchableInfo) {
        Intent intent2 = new Intent(intent);
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        intent2.putExtra("calling_package", searchActivity == null ? null : searchActivity.flattenToShortString());
        return intent2;
    }

    private void E() {
        this.p.dismissDropDown();
    }

    private void G(View view, Rect rect) {
        view.getLocationInWindow(this.K);
        getLocationInWindow(this.L);
        int[] iArr = this.K;
        int i2 = iArr[1];
        int[] iArr2 = this.L;
        int i3 = i2 - iArr2[1];
        int i4 = iArr[0] - iArr2[0];
        rect.set(i4, i3, view.getWidth() + i4, view.getHeight() + i3);
    }

    private CharSequence H(CharSequence charSequence) {
        if (!this.b0 || this.N == null) {
            return charSequence;
        }
        double textSize = this.p.getTextSize();
        Double.isNaN(textSize);
        int i2 = (int) (textSize * 1.25d);
        this.N.setBounds(0, 0, i2, i2);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("   ");
        spannableStringBuilder.setSpan(new ImageSpan(this.N), 1, 2, 33);
        spannableStringBuilder.append(charSequence);
        return spannableStringBuilder;
    }

    private boolean I() {
        SearchableInfo searchableInfo = this.o0;
        if (searchableInfo == null || !searchableInfo.getVoiceSearchEnabled()) {
            return false;
        }
        Intent intent = null;
        if (this.o0.getVoiceSearchLaunchWebSearch()) {
            intent = this.Q;
        } else if (this.o0.getVoiceSearchLaunchRecognizer()) {
            intent = this.R;
        }
        return (intent == null || getContext().getPackageManager().resolveActivity(intent, 65536) == null) ? false : true;
    }

    static boolean K(Context context) {
        return context.getResources().getConfiguration().orientation == 2;
    }

    private boolean L() {
        return (this.e0 || this.j0) && !J();
    }

    private void M(Intent intent) {
        if (intent == null) {
            return;
        }
        try {
            getContext().startActivity(intent);
        } catch (RuntimeException e2) {
            Log.e("SearchView", "Failed launch activity: " + intent, e2);
        }
    }

    private boolean O(int i2, int i3, String str) {
        Cursor cursorB = this.d0.b();
        if (cursorB == null || !cursorB.moveToPosition(i2)) {
            return false;
        }
        M(B(cursorB, i3, str));
        return true;
    }

    private void Z() {
        post(this.q0);
    }

    private void a0(int i2) {
        CharSequence charSequenceC;
        Editable text = this.p.getText();
        Cursor cursorB = this.d0.b();
        if (cursorB == null) {
            return;
        }
        if (!cursorB.moveToPosition(i2) || (charSequenceC = this.d0.c(cursorB)) == null) {
            setQuery(text);
        } else {
            setQuery(charSequenceC);
        }
    }

    private void c0() {
        boolean z = true;
        boolean z2 = !TextUtils.isEmpty(this.p.getText());
        if (!z2 && (!this.b0 || this.m0)) {
            z = false;
        }
        this.v.setVisibility(z ? 0 : 8);
        Drawable drawable = this.v.getDrawable();
        if (drawable != null) {
            drawable.setState(z2 ? ViewGroup.ENABLED_STATE_SET : ViewGroup.EMPTY_STATE_SET);
        }
    }

    private void e0() {
        CharSequence queryHint = getQueryHint();
        SearchAutoComplete searchAutoComplete = this.p;
        if (queryHint == null) {
            queryHint = "";
        }
        searchAutoComplete.setHint(H(queryHint));
    }

    private void f0() {
        this.p.setThreshold(this.o0.getSuggestThreshold());
        this.p.setImeOptions(this.o0.getImeOptions());
        int inputType = this.o0.getInputType();
        if ((inputType & 15) == 1) {
            inputType &= -65537;
            if (this.o0.getSuggestAuthority() != null) {
                inputType = inputType | 65536 | 524288;
            }
        }
        this.p.setInputType(inputType);
        h.i.a.a aVar = this.d0;
        if (aVar != null) {
            aVar.a(null);
        }
        if (this.o0.getSuggestAuthority() != null) {
            u0 u0Var = new u0(getContext(), this, this.o0, this.s0);
            this.d0 = u0Var;
            this.p.setAdapter(u0Var);
            ((u0) this.d0).x(this.g0 ? 2 : 1);
        }
    }

    private void g0() {
        this.s.setVisibility((L() && (this.u.getVisibility() == 0 || this.F.getVisibility() == 0)) ? 0 : 8);
    }

    private int getPreferredHeight() {
        return getContext().getResources().getDimensionPixelSize(h.b.d.f1678g);
    }

    private int getPreferredWidth() {
        return getContext().getResources().getDimensionPixelSize(h.b.d.f1679h);
    }

    private void h0(boolean z) {
        this.u.setVisibility((this.e0 && L() && hasFocus() && (z || !this.j0)) ? 0 : 8);
    }

    private void i0(boolean z) {
        this.c0 = z;
        int i2 = z ? 0 : 8;
        boolean z2 = !TextUtils.isEmpty(this.p.getText());
        this.t.setVisibility(i2);
        h0(z2);
        this.q.setVisibility(z ? 8 : 0);
        this.M.setVisibility((this.M.getDrawable() == null || this.b0) ? 8 : 0);
        c0();
        j0(!z2);
        g0();
    }

    private void j0(boolean z) {
        int i2 = 8;
        if (this.j0 && !J() && z) {
            this.u.setVisibility(8);
            i2 = 0;
        }
        this.F.setVisibility(i2);
    }

    private void setQuery(CharSequence charSequence) {
        this.p.setText(charSequence);
        this.p.setSelection(TextUtils.isEmpty(charSequence) ? 0 : charSequence.length());
    }

    void F() {
        if (Build.VERSION.SDK_INT >= 29) {
            this.p.refreshAutoCompleteResults();
            return;
        }
        n nVar = z0;
        nVar.b(this.p);
        nVar.a(this.p);
    }

    public boolean J() {
        return this.c0;
    }

    void N(int i2, String str, String str2) {
        getContext().startActivity(A("android.intent.action.SEARCH", null, null, str2, i2, str));
    }

    void P() {
        if (!TextUtils.isEmpty(this.p.getText())) {
            this.p.setText("");
            this.p.requestFocus();
            this.p.setImeVisibility(true);
        } else if (this.b0) {
            k kVar = this.U;
            if (kVar == null || !kVar.a()) {
                clearFocus();
                i0(true);
            }
        }
    }

    boolean Q(int i2, int i3, String str) {
        m mVar = this.W;
        if (mVar != null && mVar.b(i2)) {
            return false;
        }
        O(i2, 0, null);
        this.p.setImeVisibility(false);
        E();
        return true;
    }

    boolean R(int i2) {
        m mVar = this.W;
        if (mVar != null && mVar.a(i2)) {
            return false;
        }
        a0(i2);
        return true;
    }

    void S(CharSequence charSequence) {
        setQuery(charSequence);
    }

    void T() {
        i0(false);
        this.p.requestFocus();
        this.p.setImeVisibility(true);
        View.OnClickListener onClickListener = this.a0;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    void U() {
        Editable text = this.p.getText();
        if (text == null || TextUtils.getTrimmedLength(text) <= 0) {
            return;
        }
        l lVar = this.T;
        if (lVar == null || !lVar.b(text.toString())) {
            if (this.o0 != null) {
                N(0, null, text.toString());
            }
            this.p.setImeVisibility(false);
            E();
        }
    }

    boolean V(View view, int i2, KeyEvent keyEvent) {
        if (this.o0 != null && this.d0 != null && keyEvent.getAction() == 0 && keyEvent.hasNoModifiers()) {
            if (i2 == 66 || i2 == 84 || i2 == 61) {
                return Q(this.p.getListSelection(), 0, null);
            }
            if (i2 == 21 || i2 == 22) {
                this.p.setSelection(i2 == 21 ? 0 : this.p.length());
                this.p.setListSelection(0);
                this.p.clearListSelection();
                this.p.b();
                return true;
            }
            if (i2 != 19 || this.p.getListSelection() == 0) {
                return false;
            }
        }
        return false;
    }

    void W(CharSequence charSequence) {
        Editable text = this.p.getText();
        this.l0 = text;
        boolean z = !TextUtils.isEmpty(text);
        h0(z);
        j0(!z);
        c0();
        g0();
        if (this.T != null && !TextUtils.equals(charSequence, this.k0)) {
            this.T.a(charSequence.toString());
        }
        this.k0 = charSequence.toString();
    }

    void X() {
        i0(J());
        Z();
        if (this.p.hasFocus()) {
            F();
        }
    }

    void Y() {
        Intent intentC;
        SearchableInfo searchableInfo = this.o0;
        if (searchableInfo == null) {
            return;
        }
        try {
            if (searchableInfo.getVoiceSearchLaunchWebSearch()) {
                intentC = D(this.Q, searchableInfo);
            } else if (!searchableInfo.getVoiceSearchLaunchRecognizer()) {
                return;
            } else {
                intentC = C(this.R, searchableInfo);
            }
            getContext().startActivity(intentC);
        } catch (ActivityNotFoundException unused) {
            Log.w("SearchView", "Could not find voice search activity");
        }
    }

    public void b0(CharSequence charSequence, boolean z) {
        this.p.setText(charSequence);
        if (charSequence != null) {
            SearchAutoComplete searchAutoComplete = this.p;
            searchAutoComplete.setSelection(searchAutoComplete.length());
            this.l0 = charSequence;
        }
        if (!z || TextUtils.isEmpty(charSequence)) {
            return;
        }
        U();
    }

    @Override // h.b.n.c
    public void c() {
        if (this.m0) {
            return;
        }
        this.m0 = true;
        int imeOptions = this.p.getImeOptions();
        this.n0 = imeOptions;
        this.p.setImeOptions(imeOptions | 33554432);
        this.p.setText("");
        setIconified(false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void clearFocus() {
        this.h0 = true;
        super.clearFocus();
        this.p.clearFocus();
        this.p.setImeVisibility(false);
        this.h0 = false;
    }

    @Override // h.b.n.c
    public void d() {
        b0("", false);
        clearFocus();
        i0(true);
        this.p.setImeOptions(this.n0);
        this.m0 = false;
    }

    void d0() {
        int[] iArr = this.p.hasFocus() ? ViewGroup.FOCUSED_STATE_SET : ViewGroup.EMPTY_STATE_SET;
        Drawable background = this.r.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        Drawable background2 = this.s.getBackground();
        if (background2 != null) {
            background2.setState(iArr);
        }
        invalidate();
    }

    public int getImeOptions() {
        return this.p.getImeOptions();
    }

    public int getInputType() {
        return this.p.getInputType();
    }

    public int getMaxWidth() {
        return this.i0;
    }

    public CharSequence getQuery() {
        return this.p.getText();
    }

    public CharSequence getQueryHint() {
        CharSequence charSequence = this.f0;
        if (charSequence != null) {
            return charSequence;
        }
        SearchableInfo searchableInfo = this.o0;
        return (searchableInfo == null || searchableInfo.getHintId() == 0) ? this.S : getContext().getText(this.o0.getHintId());
    }

    int getSuggestionCommitIconResId() {
        return this.P;
    }

    int getSuggestionRowLayout() {
        return this.O;
    }

    public h.i.a.a getSuggestionsAdapter() {
        return this.d0;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        removeCallbacks(this.q0);
        post(this.r0);
        super.onDetachedFromWindow();
    }

    @Override // androidx.appcompat.widget.m0, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        super.onLayout(z, i2, i3, i4, i5);
        if (z) {
            G(this.p, this.I);
            Rect rect = this.J;
            Rect rect2 = this.I;
            rect.set(rect2.left, 0, rect2.right, i5 - i3);
            p pVar = this.H;
            if (pVar != null) {
                pVar.a(this.J, this.I);
                return;
            }
            p pVar2 = new p(this.J, this.I, this.p);
            this.H = pVar2;
            setTouchDelegate(pVar2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0043 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:27:0x0046  */
    /* JADX WARN: Code duplicated, block: B:28:0x004b  */
    @Override // androidx.appcompat.widget.m0, android.view.View
    protected void onMeasure(int i2, int i3) {
        int preferredWidth;
        int mode;
        int size;
        if (J()) {
            super.onMeasure(i2, i3);
            return;
        }
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode2 != Integer.MIN_VALUE) {
            if (mode2 == 0) {
                size2 = this.i0;
                if (size2 <= 0) {
                    size2 = getPreferredWidth();
                }
            } else if (mode2 == 1073741824 && (preferredWidth = this.i0) > 0) {
            }
            mode = View.MeasureSpec.getMode(i3);
            size = View.MeasureSpec.getSize(i3);
            if (mode != Integer.MIN_VALUE) {
                size = Math.min(getPreferredHeight(), size);
            } else if (mode == 0) {
                size = getPreferredHeight();
            }
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(size2, 1073741824), View.MeasureSpec.makeMeasureSpec(size, 1073741824));
        }
        preferredWidth = this.i0;
        if (preferredWidth <= 0) {
            preferredWidth = getPreferredWidth();
        }
        size2 = Math.min(preferredWidth, size2);
        mode = View.MeasureSpec.getMode(i3);
        size = View.MeasureSpec.getSize(i3);
        if (mode != Integer.MIN_VALUE) {
            size = Math.min(getPreferredHeight(), size);
        } else if (mode == 0) {
            size = getPreferredHeight();
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size2, 1073741824), View.MeasureSpec.makeMeasureSpec(size, 1073741824));
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof o)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        o oVar = (o) parcelable;
        super.onRestoreInstanceState(oVar.a());
        i0(oVar.c);
        requestLayout();
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        o oVar = new o(super.onSaveInstanceState());
        oVar.c = J();
        return oVar;
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        Z();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean requestFocus(int i2, Rect rect) {
        if (this.h0 || !isFocusable()) {
            return false;
        }
        if (J()) {
            return super.requestFocus(i2, rect);
        }
        boolean zRequestFocus = this.p.requestFocus(i2, rect);
        if (zRequestFocus) {
            i0(false);
        }
        return zRequestFocus;
    }

    public void setAppSearchData(Bundle bundle) {
        this.p0 = bundle;
    }

    public void setIconified(boolean z) {
        if (z) {
            P();
        } else {
            T();
        }
    }

    public void setIconifiedByDefault(boolean z) {
        if (this.b0 == z) {
            return;
        }
        this.b0 = z;
        i0(z);
        e0();
    }

    public void setImeOptions(int i2) {
        this.p.setImeOptions(i2);
    }

    public void setInputType(int i2) {
        this.p.setInputType(i2);
    }

    public void setMaxWidth(int i2) {
        this.i0 = i2;
        requestLayout();
    }

    public void setOnCloseListener(k kVar) {
        this.U = kVar;
    }

    public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.V = onFocusChangeListener;
    }

    public void setOnQueryTextListener(l lVar) {
        this.T = lVar;
    }

    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
        this.a0 = onClickListener;
    }

    public void setOnSuggestionListener(m mVar) {
        this.W = mVar;
    }

    public void setQueryHint(CharSequence charSequence) {
        this.f0 = charSequence;
        e0();
    }

    public void setQueryRefinementEnabled(boolean z) {
        this.g0 = z;
        h.i.a.a aVar = this.d0;
        if (aVar instanceof u0) {
            ((u0) aVar).x(z ? 2 : 1);
        }
    }

    public void setSearchableInfo(SearchableInfo searchableInfo) {
        this.o0 = searchableInfo;
        if (searchableInfo != null) {
            f0();
            e0();
        }
        boolean zI = I();
        this.j0 = zI;
        if (zI) {
            this.p.setPrivateImeOptions("nm");
        }
        i0(J());
    }

    public void setSubmitButtonEnabled(boolean z) {
        this.e0 = z;
        i0(J());
    }

    public void setSuggestionsAdapter(h.i.a.a aVar) {
        this.d0 = aVar;
        this.p.setAdapter(aVar);
    }

    void z() {
        if (this.G.getWidth() > 1) {
            Resources resources = getContext().getResources();
            int paddingLeft = this.r.getPaddingLeft();
            Rect rect = new Rect();
            boolean zB = g1.b(this);
            int dimensionPixelSize = this.b0 ? resources.getDimensionPixelSize(h.b.d.e) + resources.getDimensionPixelSize(h.b.d.f) : 0;
            this.p.getDropDownBackground().getPadding(rect);
            int i2 = rect.left;
            this.p.setDropDownHorizontalOffset(zB ? -i2 : paddingLeft - (i2 + dimensionPixelSize));
            this.p.setDropDownWidth((((this.G.getWidth() + rect.left) + rect.right) + dimensionPixelSize) - paddingLeft);
        }
    }
}
