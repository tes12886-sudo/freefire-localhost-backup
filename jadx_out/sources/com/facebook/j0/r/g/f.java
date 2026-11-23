package com.facebook.j0.r.g;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RatingBar;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.TimePicker;
import com.appff.haptic.base.Utils;
import com.facebook.internal.h0;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import l.y.c.i;
import l.y.c.o;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class f {
    private static final String a = "com.facebook.j0.r.g.f";
    private static Method c;
    public static final f d = new f();
    private static WeakReference<View> b = new WeakReference<>(null);

    private f() {
    }

    public static final View a(View view) {
        if (com.facebook.internal.m0.i.a.d(f.class)) {
            return null;
        }
        while (view != null) {
            try {
                if (!d.q(view)) {
                    Object parent = view.getParent();
                    if (!(parent instanceof View)) {
                        break;
                    }
                    view = (View) parent;
                } else {
                    return view;
                }
            } catch (Throwable th) {
                com.facebook.internal.m0.i.a.b(th, f.class);
            }
        }
        return null;
    }

    public static final List<View> b(View view) {
        if (com.facebook.internal.m0.i.a.d(f.class)) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            if (view instanceof ViewGroup) {
                int childCount = ((ViewGroup) view).getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    arrayList.add(((ViewGroup) view).getChildAt(i2));
                }
            }
            return arrayList;
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, f.class);
            return null;
        }
    }

    public static final int c(View view) {
        if (com.facebook.internal.m0.i.a.d(f.class)) {
            return 0;
        }
        try {
            i.e(view, "view");
            int i2 = view instanceof ImageView ? 2 : 0;
            if (view.isClickable()) {
                i2 |= 32;
            }
            if (o(view)) {
                i2 |= 512;
            }
            if (view instanceof TextView) {
                int i3 = i2 | 1024 | 1;
                if (view instanceof Button) {
                    i3 |= 4;
                    if (view instanceof Switch) {
                        i3 |= 8192;
                    } else if (view instanceof CheckBox) {
                        i3 |= 32768;
                    }
                }
                return view instanceof EditText ? i3 | 2048 : i3;
            }
            if (!(view instanceof Spinner) && !(view instanceof DatePicker)) {
                if (view instanceof RatingBar) {
                    return i2 | 65536;
                }
                if (view instanceof RadioGroup) {
                    return i2 | 16384;
                }
                return ((view instanceof ViewGroup) && d.p(view, b.get())) ? i2 | 64 : i2;
            }
            return i2 | Utils.CONTINUOUS_EVENT;
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, f.class);
            return 0;
        }
    }

    public static final JSONObject d(View view) {
        if (com.facebook.internal.m0.i.a.d(f.class)) {
            return null;
        }
        try {
            i.e(view, "view");
            if (i.a(view.getClass().getName(), "com.facebook.react.ReactRootView")) {
                b = new WeakReference<>(view);
            }
            JSONObject jSONObject = new JSONObject();
            try {
                s(view, jSONObject);
                JSONArray jSONArray = new JSONArray();
                List<View> listB = b(view);
                int size = listB.size();
                for (int i2 = 0; i2 < size; i2++) {
                    jSONArray.put(d(listB.get(i2)));
                }
                jSONObject.put("childviews", jSONArray);
            } catch (JSONException e) {
                Log.e(a, "Failed to create JSONObject for view.", e);
            }
            return jSONObject;
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, f.class);
            return null;
        }
    }

    private final JSONObject e(View view) {
        if (com.facebook.internal.m0.i.a.d(this)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("top", view.getTop());
                jSONObject.put("left", view.getLeft());
                jSONObject.put("width", view.getWidth());
                jSONObject.put("height", view.getHeight());
                jSONObject.put("scrollx", view.getScrollX());
                jSONObject.put("scrolly", view.getScrollY());
                jSONObject.put("visibility", view.getVisibility());
            } catch (JSONException e) {
                Log.e(a, "Failed to create JSONObject for dimension.", e);
            }
            return jSONObject;
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, this);
            return null;
        }
    }

    private final Class<?> f(String str) {
        if (com.facebook.internal.m0.i.a.d(this)) {
            return null;
        }
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException unused) {
            return null;
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, this);
            return null;
        }
    }

    public static final View.OnClickListener g(View view) {
        if (com.facebook.internal.m0.i.a.d(f.class)) {
            return null;
        }
        try {
            Field declaredField = Class.forName("android.view.View").getDeclaredField("mListenerInfo");
            i.d(declaredField, "Class.forName(\"android.v…redField(\"mListenerInfo\")");
            if (declaredField != null) {
                declaredField.setAccessible(true);
            }
            Object obj = declaredField.get(view);
            if (obj == null) {
                return null;
            }
            Field declaredField2 = Class.forName("android.view.View$ListenerInfo").getDeclaredField("mOnClickListener");
            i.d(declaredField2, "Class.forName(\"android.v…Field(\"mOnClickListener\")");
            if (declaredField2 == null) {
                return null;
            }
            declaredField2.setAccessible(true);
            Object obj2 = declaredField2.get(obj);
            if (obj2 != null) {
                return (View.OnClickListener) obj2;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.view.View.OnClickListener");
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException unused) {
            return null;
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, f.class);
            return null;
        }
    }

    public static final View.OnTouchListener h(View view) {
        String str;
        try {
            if (com.facebook.internal.m0.i.a.d(f.class)) {
                return null;
            }
            try {
                try {
                    try {
                        Field declaredField = Class.forName("android.view.View").getDeclaredField("mListenerInfo");
                        i.d(declaredField, "Class.forName(\"android.v…redField(\"mListenerInfo\")");
                        if (declaredField != null) {
                            declaredField.setAccessible(true);
                        }
                        Object obj = declaredField.get(view);
                        if (obj == null) {
                            return null;
                        }
                        Field declaredField2 = Class.forName("android.view.View$ListenerInfo").getDeclaredField("mOnTouchListener");
                        i.d(declaredField2, "Class.forName(\"android.v…Field(\"mOnTouchListener\")");
                        if (declaredField2 == null) {
                            return null;
                        }
                        declaredField2.setAccessible(true);
                        Object obj2 = declaredField2.get(obj);
                        if (obj2 != null) {
                            return (View.OnTouchListener) obj2;
                        }
                        throw new NullPointerException("null cannot be cast to non-null type android.view.View.OnTouchListener");
                    } catch (ClassNotFoundException e) {
                        e = e;
                        str = a;
                        h0.e0(str, e);
                        return null;
                    }
                } catch (NoSuchFieldException e2) {
                    e = e2;
                    str = a;
                    h0.e0(str, e);
                    return null;
                }
            } catch (IllegalAccessException e3) {
                e = e3;
                str = a;
                h0.e0(str, e);
                return null;
            }
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, f.class);
            return null;
        }
    }

    public static final String i(View view) {
        CharSequence hint;
        String string;
        if (com.facebook.internal.m0.i.a.d(f.class)) {
            return null;
        }
        try {
            if (view instanceof EditText) {
                hint = ((EditText) view).getHint();
            } else {
                hint = view instanceof TextView ? ((TextView) view).getHint() : null;
            }
            return (hint == null || (string = hint.toString()) == null) ? "" : string;
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, f.class);
            return null;
        }
    }

    public static final ViewGroup j(View view) {
        if (com.facebook.internal.m0.i.a.d(f.class) || view == null) {
            return null;
        }
        try {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                return (ViewGroup) parent;
            }
            return null;
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, f.class);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:42:0x0108 A[EDGE_INSN: B:42:0x0108->B:43:0x0109 BREAK  A[LOOP:0: B:32:0x00d7->B:38:0x00f6]] */
    public static final String k(View view) {
        CharSequence charSequenceValueOf;
        Object selectedItem;
        String string;
        if (com.facebook.internal.m0.i.a.d(f.class)) {
            return null;
        }
        try {
            if (view instanceof TextView) {
                charSequenceValueOf = ((TextView) view).getText();
                if (view instanceof Switch) {
                    charSequenceValueOf = ((Switch) view).isChecked() ? "1" : "0";
                }
            } else if (!(view instanceof Spinner)) {
                int i2 = 0;
                if (!(view instanceof DatePicker)) {
                    if (!(view instanceof TimePicker)) {
                        if (!(view instanceof RadioGroup)) {
                            if (!(view instanceof RatingBar)) {
                                charSequenceValueOf = null;
                                break;
                            }
                            charSequenceValueOf = String.valueOf(((RatingBar) view).getRating());
                        } else {
                            int checkedRadioButtonId = ((RadioGroup) view).getCheckedRadioButtonId();
                            int childCount = ((RadioGroup) view).getChildCount();
                            while (true) {
                                if (i2 >= childCount) {
                                    charSequenceValueOf = null;
                                    break;
                                }
                                View childAt = ((RadioGroup) view).getChildAt(i2);
                                i.d(childAt, "child");
                                if (childAt.getId() == checkedRadioButtonId && (childAt instanceof RadioButton)) {
                                    charSequenceValueOf = ((RadioButton) childAt).getText();
                                    break;
                                }
                                i2++;
                            }
                        }
                    } else {
                        Integer currentHour = ((TimePicker) view).getCurrentHour();
                        i.d(currentHour, "view.currentHour");
                        int iIntValue = currentHour.intValue();
                        Integer currentMinute = ((TimePicker) view).getCurrentMinute();
                        i.d(currentMinute, "view.currentMinute");
                        int iIntValue2 = currentMinute.intValue();
                        o oVar = o.a;
                        charSequenceValueOf = String.format("%02d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(iIntValue), Integer.valueOf(iIntValue2)}, 2));
                    }
                } else {
                    int year = ((DatePicker) view).getYear();
                    int month = ((DatePicker) view).getMonth();
                    int dayOfMonth = ((DatePicker) view).getDayOfMonth();
                    o oVar2 = o.a;
                    charSequenceValueOf = String.format("%04d-%02d-%02d", Arrays.copyOf(new Object[]{Integer.valueOf(year), Integer.valueOf(month), Integer.valueOf(dayOfMonth)}, 3));
                }
                i.d(charSequenceValueOf, "java.lang.String.format(format, *args)");
            } else {
                if (((Spinner) view).getCount() <= 0 || (selectedItem = ((Spinner) view).getSelectedItem()) == null) {
                    charSequenceValueOf = null;
                    break;
                }
                charSequenceValueOf = selectedItem.toString();
            }
            return (charSequenceValueOf == null || (string = charSequenceValueOf.toString()) == null) ? "" : string;
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, f.class);
            return null;
        }
    }

    private final View l(float[] fArr, View view) {
        String str;
        if (com.facebook.internal.m0.i.a.d(this)) {
            return null;
        }
        try {
            n();
            Method method = c;
            if (method != null && view != null) {
                try {
                    if (method == null) {
                        throw new IllegalStateException("Required value was null.".toString());
                    }
                    Object objInvoke = method.invoke(null, fArr, view);
                    if (objInvoke == null) {
                        throw new NullPointerException("null cannot be cast to non-null type android.view.View");
                    }
                    View view2 = (View) objInvoke;
                    if (view2 != null && view2.getId() > 0) {
                        Object parent = view2.getParent();
                        if (parent != null) {
                            return (View) parent;
                        }
                        throw new NullPointerException("null cannot be cast to non-null type android.view.View");
                    }
                } catch (IllegalAccessException e) {
                    e = e;
                    str = a;
                    h0.e0(str, e);
                } catch (InvocationTargetException e2) {
                    e = e2;
                    str = a;
                    h0.e0(str, e);
                }
            }
            return null;
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, this);
            return null;
        }
    }

    private final float[] m(View view) {
        if (com.facebook.internal.m0.i.a.d(this)) {
            return null;
        }
        try {
            int[] iArr = new int[2];
            view.getLocationOnScreen(iArr);
            return new float[]{iArr[0], iArr[1]};
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, this);
            return null;
        }
    }

    private final void n() {
        String str;
        if (com.facebook.internal.m0.i.a.d(this)) {
            return;
        }
        try {
            if (c != null) {
                return;
            }
            try {
                Class<?> cls = Class.forName("com.facebook.react.uimanager.TouchTargetHelper");
                i.d(cls, "Class.forName(CLASS_TOUCHTARGETHELPER)");
                Method declaredMethod = cls.getDeclaredMethod("findTouchTargetView", float[].class, ViewGroup.class);
                c = declaredMethod;
                if (declaredMethod == null) {
                    throw new IllegalStateException("Required value was null.".toString());
                }
                declaredMethod.setAccessible(true);
            } catch (ClassNotFoundException e) {
                e = e;
                str = a;
                h0.e0(str, e);
            } catch (NoSuchMethodException e2) {
                e = e2;
                str = a;
                h0.e0(str, e);
            }
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, this);
        }
    }

    private static final boolean o(View view) {
        if (com.facebook.internal.m0.i.a.d(f.class)) {
            return false;
        }
        try {
            ViewParent parent = view.getParent();
            if (parent instanceof AdapterView) {
                return true;
            }
            f fVar = d;
            Class<?> clsF = fVar.f("android.support.v4.view.NestedScrollingChild");
            if (clsF != null && clsF.isInstance(parent)) {
                return true;
            }
            Class<?> clsF2 = fVar.f("androidx.core.view.NestedScrollingChild");
            return clsF2 != null && clsF2.isInstance(parent);
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, f.class);
            return false;
        }
    }

    private final boolean q(View view) {
        if (com.facebook.internal.m0.i.a.d(this)) {
            return false;
        }
        try {
            return i.a(view.getClass().getName(), "com.facebook.react.ReactRootView");
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, this);
            return false;
        }
    }

    public static final void r(View view, View.OnClickListener onClickListener) {
        Field declaredField;
        Field declaredField2;
        if (com.facebook.internal.m0.i.a.d(f.class)) {
            return;
        }
        try {
            i.e(view, "view");
            Object obj = null;
            try {
                try {
                    declaredField = Class.forName("android.view.View").getDeclaredField("mListenerInfo");
                    try {
                        declaredField2 = Class.forName("android.view.View$ListenerInfo").getDeclaredField("mOnClickListener");
                    } catch (ClassNotFoundException | NoSuchFieldException unused) {
                        declaredField2 = null;
                    }
                } catch (Exception unused2) {
                    return;
                }
            } catch (ClassNotFoundException | NoSuchFieldException unused3) {
                declaredField = null;
            }
            if (declaredField == null || declaredField2 == null) {
                view.setOnClickListener(onClickListener);
                return;
            }
            declaredField.setAccessible(true);
            declaredField2.setAccessible(true);
            try {
                declaredField.setAccessible(true);
                obj = declaredField.get(view);
            } catch (IllegalAccessException unused4) {
            }
            if (obj == null) {
                view.setOnClickListener(onClickListener);
            } else {
                declaredField2.set(obj, onClickListener);
            }
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, f.class);
        }
    }

    public static final void s(View view, JSONObject jSONObject) {
        if (com.facebook.internal.m0.i.a.d(f.class)) {
            return;
        }
        try {
            i.e(view, "view");
            i.e(jSONObject, "json");
            try {
                String strK = k(view);
                String strI = i(view);
                Object tag = view.getTag();
                CharSequence contentDescription = view.getContentDescription();
                jSONObject.put("classname", view.getClass().getCanonicalName());
                jSONObject.put("classtypebitmask", c(view));
                jSONObject.put("id", view.getId());
                if (d.g(view)) {
                    jSONObject.put("text", "");
                    jSONObject.put("is_user_input", true);
                } else {
                    jSONObject.put("text", h0.j(h0.C0(strK), ""));
                }
                jSONObject.put("hint", h0.j(h0.C0(strI), ""));
                if (tag != null) {
                    jSONObject.put("tag", h0.j(h0.C0(tag.toString()), ""));
                }
                if (contentDescription != null) {
                    jSONObject.put("description", h0.j(h0.C0(contentDescription.toString()), ""));
                }
                jSONObject.put("dimension", d.e(view));
            } catch (JSONException e) {
                h0.e0(a, e);
            }
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, f.class);
        }
    }

    public final boolean p(View view, View view2) {
        View viewL;
        if (com.facebook.internal.m0.i.a.d(this)) {
            return false;
        }
        try {
            i.e(view, "view");
            String name = view.getClass().getName();
            i.d(name, "view.javaClass.name");
            return i.a(name, "com.facebook.react.views.view.ReactViewGroup") && (viewL = l(m(view), view2)) != null && viewL.getId() == view.getId();
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, this);
            return false;
        }
    }
}
