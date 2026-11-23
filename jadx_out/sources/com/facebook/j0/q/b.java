package com.facebook.j0.q;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import com.facebook.j0.r.g.f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l.d0.q;
import l.y.c.i;

/* JADX INFO: loaded from: classes.dex */
public final class b {
    public static final b a = new b();

    private b() {
    }

    public static final List<String> a(View view) {
        if (com.facebook.internal.m0.i.a.d(b.class)) {
            return null;
        }
        try {
            i.e(view, "view");
            ArrayList arrayList = new ArrayList();
            ViewGroup viewGroupJ = f.j(view);
            if (viewGroupJ != null) {
                for (View view2 : f.b(viewGroupJ)) {
                    if (view != view2) {
                        arrayList.addAll(a.c(view2));
                    }
                }
            }
            return arrayList;
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, b.class);
            return null;
        }
    }

    public static final List<String> b(View view) {
        if (com.facebook.internal.m0.i.a.d(b.class)) {
            return null;
        }
        try {
            i.e(view, "view");
            ArrayList<String> arrayList = new ArrayList();
            arrayList.add(f.i(view));
            Object tag = view.getTag();
            if (tag != null) {
                arrayList.add(tag.toString());
            }
            CharSequence contentDescription = view.getContentDescription();
            if (contentDescription != null) {
                arrayList.add(contentDescription.toString());
            }
            try {
                if (view.getId() != -1) {
                    String resourceName = view.getResources().getResourceName(view.getId());
                    i.d(resourceName, "resourceName");
                    Object[] array = new l.d0.f("/").c(resourceName, 0).toArray(new String[0]);
                    if (array == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                    }
                    String[] strArr = (String[]) array;
                    if (strArr.length == 2) {
                        arrayList.add(strArr[1]);
                    }
                }
            } catch (Resources.NotFoundException unused) {
            }
            ArrayList arrayList2 = new ArrayList();
            for (String str : arrayList) {
                if ((str.length() > 0) && str.length() <= 100) {
                    if (str == null) {
                        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                    }
                    String lowerCase = str.toLowerCase();
                    i.d(lowerCase, "(this as java.lang.String).toLowerCase()");
                    arrayList2.add(lowerCase);
                }
            }
            return arrayList2;
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, b.class);
            return null;
        }
    }

    private final List<String> c(View view) {
        if (com.facebook.internal.m0.i.a.d(this)) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            if (view instanceof EditText) {
                return arrayList;
            }
            if (!(view instanceof TextView)) {
                Iterator<View> it = f.b(view).iterator();
                while (it.hasNext()) {
                    arrayList.addAll(c(it.next()));
                }
                return arrayList;
            }
            String string = ((TextView) view).getText().toString();
            if ((string.length() > 0) && string.length() < 100) {
                if (string == null) {
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                }
                String lowerCase = string.toLowerCase();
                i.d(lowerCase, "(this as java.lang.String).toLowerCase()");
                arrayList.add(lowerCase);
            }
            return arrayList;
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, this);
            return null;
        }
    }

    private final boolean d(String str, List<String> list) {
        if (com.facebook.internal.m0.i.a.d(this)) {
            return false;
        }
        try {
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                if (q.C(str, it.next(), false, 2, null)) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, this);
            return false;
        }
    }

    public static final boolean e(List<String> list, List<String> list2) {
        if (com.facebook.internal.m0.i.a.d(b.class)) {
            return false;
        }
        try {
            i.e(list, "indicators");
            i.e(list2, "keys");
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                if (a.d(it.next(), list2)) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, b.class);
            return false;
        }
    }

    public static final boolean f(String str, String str2) {
        if (com.facebook.internal.m0.i.a.d(b.class)) {
            return false;
        }
        try {
            i.e(str, "text");
            i.e(str2, "rule");
            return new l.d0.f(str2).a(str);
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, b.class);
            return false;
        }
    }
}
