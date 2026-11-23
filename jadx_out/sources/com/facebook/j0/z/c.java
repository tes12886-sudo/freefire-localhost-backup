package com.facebook.j0.z;

import android.text.TextUtils;
import android.view.View;
import android.widget.AdapterView;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.RatingBar;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TimePicker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l.t.m;
import l.y.c.i;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class c {
    public static final c b = new c();
    private static final List<Class<? extends View>> a = m.i(Switch.class, Spinner.class, DatePicker.class, TimePicker.class, RadioGroup.class, RatingBar.class, EditText.class, AdapterView.class);

    private c() {
    }

    public static final List<View> a(View view) {
        if (com.facebook.internal.m0.i.a.d(c.class)) {
            return null;
        }
        try {
            i.e(view, "view");
            ArrayList arrayList = new ArrayList();
            Iterator<Class<? extends View>> it = a.iterator();
            while (it.hasNext()) {
                if (it.next().isInstance(view)) {
                    return arrayList;
                }
            }
            if (view.isClickable()) {
                arrayList.add(view);
            }
            Iterator<View> it2 = com.facebook.j0.r.g.f.b(view).iterator();
            while (it2.hasNext()) {
                arrayList.addAll(a(it2.next()));
            }
            return arrayList;
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, c.class);
            return null;
        }
    }

    public static final JSONObject b(View view, View view2) {
        if (com.facebook.internal.m0.i.a.d(c.class)) {
            return null;
        }
        try {
            i.e(view, "view");
            i.e(view2, "clickedView");
            JSONObject jSONObject = new JSONObject();
            if (view == view2) {
                try {
                    jSONObject.put("is_interacted", true);
                } catch (JSONException unused) {
                }
            }
            e(view, jSONObject);
            JSONArray jSONArray = new JSONArray();
            Iterator<View> it = com.facebook.j0.r.g.f.b(view).iterator();
            while (it.hasNext()) {
                jSONArray.put(b(it.next(), view2));
            }
            jSONObject.put("childviews", jSONArray);
            return jSONObject;
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, c.class);
            return null;
        }
    }

    private final List<String> c(View view) {
        if (com.facebook.internal.m0.i.a.d(this)) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            for (View view2 : com.facebook.j0.r.g.f.b(view)) {
                String strK = com.facebook.j0.r.g.f.k(view2);
                if (strK.length() > 0) {
                    arrayList.add(strK);
                }
                arrayList.addAll(c(view2));
            }
            return arrayList;
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, this);
            return null;
        }
    }

    public static final String d(View view) {
        if (com.facebook.internal.m0.i.a.d(c.class)) {
            return null;
        }
        try {
            i.e(view, "hostView");
            String strK = com.facebook.j0.r.g.f.k(view);
            if (strK.length() > 0) {
                return strK;
            }
            String strJoin = TextUtils.join(" ", b.c(view));
            i.d(strJoin, "TextUtils.join(\" \", childrenText)");
            return strJoin;
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, c.class);
            return null;
        }
    }

    public static final void e(View view, JSONObject jSONObject) {
        if (com.facebook.internal.m0.i.a.d(c.class)) {
            return;
        }
        try {
            i.e(view, "view");
            i.e(jSONObject, "json");
            try {
                String strK = com.facebook.j0.r.g.f.k(view);
                String strI = com.facebook.j0.r.g.f.i(view);
                jSONObject.put("classname", view.getClass().getSimpleName());
                jSONObject.put("classtypebitmask", com.facebook.j0.r.g.f.c(view));
                boolean z = true;
                if (strK.length() > 0) {
                    jSONObject.put("text", strK);
                }
                if (strI.length() <= 0) {
                    z = false;
                }
                if (z) {
                    jSONObject.put("hint", strI);
                }
                if (view instanceof EditText) {
                    jSONObject.put("inputtype", ((EditText) view).getInputType());
                }
            } catch (JSONException unused) {
            }
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, c.class);
        }
    }
}
