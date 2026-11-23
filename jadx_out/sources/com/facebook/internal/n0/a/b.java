package com.facebook.internal.n0.a;

import android.annotation.SuppressLint;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.os.Build;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.webkit.WebView;
import android.widget.TextView;
import java.io.PrintWriter;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.List;
import l.d0.p;
import l.y.c.f;
import l.y.c.i;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"HexColorValueUsage", "CatchGeneralException", "BadMethodUse-java.lang.String.length"})
public final class b {
    private static b d;
    private static Method e;
    public static final c f = new c(null);
    private final com.facebook.internal.n0.a.a a = new com.facebook.internal.n0.a.a();
    private final d b = new d();
    private Method c;

    private static final class a {
        private static Field a;
        public static final a b = new a();

        static {
            try {
                Field declaredField = View.class.getDeclaredField("mKeyedTags");
                a = declaredField;
                if (declaredField != null) {
                    declaredField.setAccessible(true);
                }
            } catch (NoSuchFieldException unused) {
            }
        }

        private a() {
        }

        private final JSONObject a(View view) {
            try {
                if (a == null) {
                    Field declaredField = View.class.getDeclaredField("mKeyedTags");
                    a = declaredField;
                    if (declaredField != null) {
                        declaredField.setAccessible(true);
                    }
                }
                Field field = a;
                Object obj = field != null ? field.get(view) : null;
                if (obj == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.util.SparseArray<*>");
                }
                SparseArray sparseArray = (SparseArray) obj;
                if (sparseArray == null || sparseArray.size() <= 0) {
                    return null;
                }
                JSONObject jSONObject = new JSONObject();
                try {
                    int size = sparseArray.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        try {
                            jSONObject.put(com.facebook.internal.n0.a.c.c(view.getResources(), sparseArray.keyAt(i2)), sparseArray.valueAt(i2));
                        } catch (JSONException unused) {
                        }
                    }
                } catch (Exception unused2) {
                }
                return jSONObject;
            } catch (Exception unused3) {
                return null;
            }
        }

        public final void b(PrintWriter printWriter, View view) {
            c cVar;
            AccessibilityNodeInfo accessibilityNodeInfoI;
            int i2 = Build.VERSION.SDK_INT;
            i.e(printWriter, "writer");
            i.e(view, "view");
            if (i2 >= 21 && (accessibilityNodeInfoI = (cVar = b.f).i(view)) != null) {
                JSONObject jSONObject = new JSONObject();
                try {
                    if (view instanceof TextView) {
                        ColorStateList textColors = ((TextView) view).getTextColors();
                        i.d(textColors, "view.textColors");
                        jSONObject.put("textColor", textColors.getDefaultColor());
                        jSONObject.put("textSize", ((TextView) view).getTextSize());
                        jSONObject.put("hint", cVar.j(((TextView) view).getHint(), 100));
                    }
                    JSONObject jSONObjectA = a(view);
                    if (jSONObjectA != null) {
                        jSONObject.put("keyedTags", jSONObjectA);
                    }
                    JSONArray jSONArray = new JSONArray();
                    for (AccessibilityNodeInfo.AccessibilityAction accessibilityAction : accessibilityNodeInfoI.getActionList()) {
                        i.d(accessibilityAction, "action");
                        CharSequence label = accessibilityAction.getLabel();
                        if (label == null) {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                        }
                        String str = (String) label;
                        if (str != null) {
                            jSONArray.put(b.f.j(str, 50));
                        }
                    }
                    if (jSONArray.length() > 0) {
                        jSONObject.put("actions", jSONArray);
                    }
                    c cVar2 = b.f;
                    String strJ = cVar2.j(accessibilityNodeInfoI.getContentDescription(), 50);
                    if (strJ != null) {
                        if (strJ.length() > 0) {
                            jSONObject.put("content-description", strJ);
                        }
                    }
                    jSONObject.put("accessibility-focused", accessibilityNodeInfoI.isAccessibilityFocused()).put("checkable", accessibilityNodeInfoI.isCheckable()).put("checked", accessibilityNodeInfoI.isChecked()).put("class-name", cVar2.j(accessibilityNodeInfoI.getClassName(), 50)).put("clickable", accessibilityNodeInfoI.isClickable()).put("content-invalid", accessibilityNodeInfoI.isContentInvalid()).put("dismissable", accessibilityNodeInfoI.isDismissable()).put("editable", accessibilityNodeInfoI.isEditable()).put("enabled", accessibilityNodeInfoI.isEnabled()).put("focusable", accessibilityNodeInfoI.isFocusable()).put("focused", accessibilityNodeInfoI.isFocused()).put("long-clickable", accessibilityNodeInfoI.isLongClickable()).put("multiline", accessibilityNodeInfoI.isMultiLine()).put("password", accessibilityNodeInfoI.isPassword()).put("scrollable", accessibilityNodeInfoI.isScrollable()).put("selected", accessibilityNodeInfoI.isSelected()).put("visible-to-user", accessibilityNodeInfoI.isVisibleToUser());
                    if (i2 >= 24) {
                        C0067b.a.a(jSONObject, accessibilityNodeInfoI);
                    }
                } catch (Exception e) {
                    try {
                        jSONObject.put("DUMP-ERROR", b.f.j(e.getMessage(), 50));
                    } catch (JSONException unused) {
                    }
                }
                printWriter.append(" props=\"").append((CharSequence) jSONObject.toString()).append("\"");
            }
        }
    }

    /* JADX INFO: renamed from: com.facebook.internal.n0.a.b$b, reason: collision with other inner class name */
    private static final class C0067b {
        public static final C0067b a = new C0067b();

        private C0067b() {
        }

        public final void a(JSONObject jSONObject, AccessibilityNodeInfo accessibilityNodeInfo) throws JSONException {
            i.e(jSONObject, "props");
            i.e(accessibilityNodeInfo, "nodeInfo");
            if (Build.VERSION.SDK_INT < 24) {
                return;
            }
            jSONObject.put("context-clickable", accessibilityNodeInfo.isContextClickable()).put("drawing-order", accessibilityNodeInfo.getDrawingOrder()).put("important-for-accessibility", accessibilityNodeInfo.isImportantForAccessibility());
        }
    }

    public static final class c {
        private c() {
        }

        public /* synthetic */ c(f fVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final AccessibilityNodeInfo i(View view) {
            if (view == null) {
                return null;
            }
            AccessibilityNodeInfo accessibilityNodeInfoObtain = AccessibilityNodeInfo.obtain();
            try {
                view.onInitializeAccessibilityNodeInfo(accessibilityNodeInfoObtain);
                return accessibilityNodeInfoObtain;
            } catch (NullPointerException unused) {
                if (accessibilityNodeInfoObtain != null) {
                    accessibilityNodeInfoObtain.recycle();
                }
                return null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String j(CharSequence charSequence, int i2) {
            if (charSequence == null) {
                return "";
            }
            if (charSequence.length() == 0) {
                return "";
            }
            String strT = p.t(p.t(p.t(charSequence.toString(), " \n", " ", false, 4, null), "\n", " ", false, 4, null), "\"", "", false, 4, null);
            if (charSequence.length() <= i2) {
                return strT;
            }
            StringBuilder sb = new StringBuilder();
            if (strT == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
            String strSubstring = strT.substring(0, i2);
            i.d(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            sb.append(strSubstring);
            sb.append("...");
            return sb.toString();
        }

        @SuppressLint({"PrivateApi", "ReflectionMethodUse"})
        private final String k(View view) {
            if (b.e == null) {
                b.e = view.getClass().getDeclaredMethod("getText", new Class[0]);
            }
            Method method = b.e;
            Object objInvoke = method != null ? method.invoke(view, new Object[0]) : null;
            if (objInvoke != null) {
                return objInvoke.toString();
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean l(String[] strArr, String str) {
            if (strArr == null) {
                return false;
            }
            for (String str2 : strArr) {
                if (p.l(str, str2, true)) {
                    return true;
                }
            }
            return false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean m(View view) {
            for (Class<?> superclass = view.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
                if (i.a(superclass.getName(), "com.facebook.litho.LithoView")) {
                    return true;
                }
            }
            return false;
        }

        private final void o(PrintWriter printWriter, View view) {
            Object tag = view.getTag();
            if (!(tag instanceof String)) {
                tag = null;
            }
            String str = (String) tag;
            if (str != null) {
                if (str.length() == 0) {
                    return;
                }
                printWriter.print(" app:tag/");
                printWriter.print(j(str, 60));
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void p(PrintWriter printWriter, View view, int i2, int i3) {
            int[] iArr = new int[2];
            view.getLocationOnScreen(iArr);
            printWriter.print(" ");
            printWriter.print(iArr[0] - i2);
            printWriter.print(",");
            printWriter.print(iArr[1] - i3);
            printWriter.print("-");
            printWriter.print((iArr[0] + view.getWidth()) - i2);
            printWriter.print(",");
            printWriter.print((iArr[1] + view.getHeight()) - i3);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void q(PrintWriter printWriter, View view) {
            String str;
            printWriter.print(" ");
            int visibility = view.getVisibility();
            if (visibility != 0) {
                if (visibility == 4) {
                    str = "I";
                } else if (visibility != 8) {
                    printWriter.print(".");
                } else {
                    str = "G";
                }
                printWriter.print(str);
            } else {
                printWriter.print("V");
            }
            printWriter.print(view.isFocusable() ? "F" : ".");
            printWriter.print(view.isEnabled() ? "E" : ".");
            printWriter.print(".");
            printWriter.print(view.isHorizontalScrollBarEnabled() ? "H" : ".");
            printWriter.print(view.isVerticalScrollBarEnabled() ? "V" : ".");
            printWriter.print(view.isClickable() ? "C" : ".");
            printWriter.print(view.isLongClickable() ? "L" : ".");
            printWriter.print(" ");
            printWriter.print(view.isFocused() ? "F" : ".");
            printWriter.print(view.isSelected() ? "S" : ".");
            printWriter.print(view.isHovered() ? "H" : ".");
            printWriter.print(view.isActivated() ? "A" : ".");
            printWriter.print(view.isDirty() ? "D" : ".");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void r(PrintWriter printWriter, View view) {
            String resourcePackageName;
            try {
                int id = view.getId();
                if (id == -1) {
                    o(printWriter, view);
                    return;
                }
                printWriter.append(" #");
                printWriter.append((CharSequence) Integer.toHexString(id));
                Resources resources = view.getResources();
                if (id > 0 && resources != null) {
                    int i2 = (-16777216) & id;
                    if (i2 == 16777216) {
                        resourcePackageName = "android";
                    } else if (i2 != 2130706432) {
                        resourcePackageName = resources.getResourcePackageName(id);
                        i.d(resourcePackageName, "resources.getResourcePackageName(id)");
                    } else {
                        resourcePackageName = "app";
                    }
                    printWriter.print(" ");
                    printWriter.print(resourcePackageName);
                    printWriter.print(":");
                    printWriter.print(resources.getResourceTypeName(id));
                    printWriter.print("/");
                    printWriter.print(resources.getResourceEntryName(id));
                    return;
                }
                o(printWriter, view);
            } catch (Exception unused) {
                o(printWriter, view);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Code duplicated, block: B:19:0x003f A[Catch: Exception -> 0x009c, TryCatch #0 {Exception -> 0x009c, blocks: (B:3:0x0001, B:5:0x0007, B:6:0x000d, B:40:0x007e, B:45:0x0088, B:7:0x0013, B:9:0x0023, B:10:0x0028, B:12:0x002e, B:14:0x0034, B:19:0x003f, B:21:0x0045, B:26:0x0057, B:33:0x006c, B:36:0x0072, B:37:0x0075), top: B:48:0x0001 }] */
        /* JADX WARN: Code duplicated, block: B:21:0x0045 A[Catch: Exception -> 0x009c, TryCatch #0 {Exception -> 0x009c, blocks: (B:3:0x0001, B:5:0x0007, B:6:0x000d, B:40:0x007e, B:45:0x0088, B:7:0x0013, B:9:0x0023, B:10:0x0028, B:12:0x002e, B:14:0x0034, B:19:0x003f, B:21:0x0045, B:26:0x0057, B:33:0x006c, B:36:0x0072, B:37:0x0075), top: B:48:0x0001 }] */
        /* JADX WARN: Code duplicated, block: B:23:0x0052 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:24:0x0054  */
        /* JADX WARN: Code duplicated, block: B:25:0x0056  */
        /* JADX WARN: Code duplicated, block: B:28:0x0063  */
        /* JADX WARN: Code duplicated, block: B:29:0x0065  */
        /* JADX WARN: Code duplicated, block: B:36:0x0072 A[Catch: Exception -> 0x009c, TryCatch #0 {Exception -> 0x009c, blocks: (B:3:0x0001, B:5:0x0007, B:6:0x000d, B:40:0x007e, B:45:0x0088, B:7:0x0013, B:9:0x0023, B:10:0x0028, B:12:0x002e, B:14:0x0034, B:19:0x003f, B:21:0x0045, B:26:0x0057, B:33:0x006c, B:36:0x0072, B:37:0x0075), top: B:48:0x0001 }] */
        /* JADX WARN: Code duplicated, block: B:40:0x007e A[Catch: Exception -> 0x009c, TryCatch #0 {Exception -> 0x009c, blocks: (B:3:0x0001, B:5:0x0007, B:6:0x000d, B:40:0x007e, B:45:0x0088, B:7:0x0013, B:9:0x0023, B:10:0x0028, B:12:0x002e, B:14:0x0034, B:19:0x003f, B:21:0x0045, B:26:0x0057, B:33:0x006c, B:36:0x0072, B:37:0x0075), top: B:48:0x0001 }] */
        /* JADX WARN: Code duplicated, block: B:42:0x0084  */
        /* JADX WARN: Code duplicated, block: B:44:0x0087  */
        /* JADX WARN: Code duplicated, block: B:45:0x0088 A[Catch: Exception -> 0x009c, TRY_LEAVE, TryCatch #0 {Exception -> 0x009c, blocks: (B:3:0x0001, B:5:0x0007, B:6:0x000d, B:40:0x007e, B:45:0x0088, B:7:0x0013, B:9:0x0023, B:10:0x0028, B:12:0x002e, B:14:0x0034, B:19:0x003f, B:21:0x0045, B:26:0x0057, B:33:0x006c, B:36:0x0072, B:37:0x0075), top: B:48:0x0001 }] */
        /* JADX WARN: Code duplicated, block: B:51:0x006f A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:52:0x006c A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:53:0x006a A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:54:0x0071 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:55:0x0068 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:60:? A[RETURN, SYNTHETIC] */
        @SuppressLint({"ReflectionMethodUse"})
        public final void s(PrintWriter printWriter, View view) {
            Object tag;
            String string;
            int length;
            int i2;
            boolean z;
            CharSequence charSequenceSubSequence;
            int i3;
            boolean z2;
            String strK;
            try {
                if (!(view instanceof TextView)) {
                    if (i.a(view.getClass().getSimpleName(), "RCTextView")) {
                        strK = k(view);
                    } else {
                        CharSequence contentDescription = view.getContentDescription();
                        String string2 = contentDescription != null ? contentDescription.toString() : null;
                        if (string2 == null) {
                            tag = view.getTag();
                            if (tag != null) {
                                string = tag.toString();
                                length = string.length() - 1;
                                i2 = 0;
                                z = false;
                                while (i2 <= length) {
                                    if (z) {
                                        i3 = length;
                                    } else {
                                        i3 = i2;
                                    }
                                    if (i.g(string.charAt(i3), 32) <= 0) {
                                        z2 = true;
                                    } else {
                                        z2 = false;
                                    }
                                    if (z) {
                                        if (!z2) {
                                            break;
                                        } else {
                                            length--;
                                        }
                                    } else if (z2) {
                                        i2++;
                                    } else {
                                        z = true;
                                    }
                                }
                                charSequenceSubSequence = string.subSequence(i2, length + 1);
                            }
                        } else {
                            if (string2.length() == 0) {
                                tag = view.getTag();
                                if (tag != null) {
                                    string = tag.toString();
                                    length = string.length() - 1;
                                    i2 = 0;
                                    z = false;
                                    while (i2 <= length) {
                                        if (z) {
                                            i3 = i2;
                                        } else {
                                            i3 = length;
                                        }
                                        if (i.g(string.charAt(i3), 32) <= 0) {
                                            z2 = true;
                                        } else {
                                            z2 = false;
                                        }
                                        if (z) {
                                            if (z2) {
                                                z = true;
                                            } else {
                                                i2++;
                                            }
                                        } else {
                                            if (!z2) {
                                                break;
                                                break;
                                            }
                                            length--;
                                        }
                                    }
                                    charSequenceSubSequence = string.subSequence(i2, length + 1);
                                }
                            }
                        }
                        strK = string2;
                    }
                    if (strK != null) {
                        if (strK.length() == 0) {
                            return;
                        }
                        printWriter.print(" text=\"");
                        printWriter.print(j(strK, 600));
                        printWriter.print("\"");
                    }
                }
                charSequenceSubSequence = ((TextView) view).getText();
                strK = charSequenceSubSequence.toString();
                if (strK != null) {
                    if (strK.length() == 0) {
                        return;
                    }
                    printWriter.print(" text=\"");
                    printWriter.print(j(strK, 600));
                    printWriter.print("\"");
                }
            } catch (Exception unused) {
            }
        }

        public final boolean n(String str, PrintWriter printWriter, String[] strArr) {
            i.e(str, "prefix");
            i.e(printWriter, "writer");
            if (strArr != null) {
                if ((!(strArr.length == 0)) && i.a("e2e", strArr[0])) {
                    if (b.d == null) {
                        b.d = new b();
                    }
                    b bVar = b.d;
                    if (bVar != null) {
                        bVar.g(str, printWriter, strArr);
                    }
                    return true;
                }
            }
            return false;
        }
    }

    private final void f(String str, PrintWriter printWriter, View view, int i2, int i3, boolean z, boolean z2) {
        ViewGroup viewGroup;
        int childCount;
        printWriter.print(str);
        if (view == null) {
            printWriter.println("null");
            return;
        }
        printWriter.print(view.getClass().getName());
        printWriter.print("{");
        printWriter.print(Integer.toHexString(view.hashCode()));
        c cVar = f;
        cVar.q(printWriter, view);
        cVar.p(printWriter, view, i2, i3);
        cVar.r(printWriter, view);
        cVar.s(printWriter, view);
        if (z2 && Build.VERSION.SDK_INT >= 21) {
            a.b.b(printWriter, view);
        }
        printWriter.println("}");
        if (cVar.m(view)) {
            h(printWriter, view, str, z2);
        }
        if (z && (view instanceof WebView)) {
            this.b.c((WebView) view);
        }
        if ((view instanceof ViewGroup) && (childCount = (viewGroup = (ViewGroup) view).getChildCount()) > 0) {
            String str2 = str + "  ";
            int[] iArr = new int[2];
            view.getLocationOnScreen(iArr);
            for (int i4 = 0; i4 < childCount; i4++) {
                f(str2, printWriter, viewGroup.getChildAt(i4), iArr[0], iArr[1], z, z2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void g(String str, PrintWriter printWriter, String[] strArr) {
        View viewB;
        printWriter.print(str);
        printWriter.println("Top Level Window View Hierarchy:");
        c cVar = f;
        boolean zL = cVar.l(strArr, "all-roots");
        boolean zL2 = cVar.l(strArr, "top-root");
        boolean zL3 = cVar.l(strArr, "webview");
        boolean zL4 = cVar.l(strArr, "props");
        try {
            List<com.facebook.internal.n0.a.a.C0066a> listB = this.a.b();
            if (listB != null && !listB.isEmpty()) {
                Collections.reverse(listB);
                WindowManager.LayoutParams layoutParams = null;
                for (com.facebook.internal.n0.a.a.C0066a c0066a : listB) {
                    if (c0066a != null && (viewB = c0066a.b()) != null && viewB.getVisibility() == 0) {
                        if (!zL && layoutParams != null && Math.abs(c0066a.a().type - layoutParams.type) != 1) {
                            break;
                        }
                        f(str + "  ", printWriter, c0066a.b(), 0, 0, zL3, zL4);
                        WindowManager.LayoutParams layoutParamsA = c0066a.a();
                        if (zL2) {
                            break;
                        } else {
                            layoutParams = layoutParamsA;
                        }
                    }
                }
                this.b.b(printWriter);
            }
        } catch (Exception e2) {
            printWriter.println("Failure in view hierarchy dump: " + e2.getMessage());
        }
    }

    private final void h(PrintWriter printWriter, View view, String str, boolean z) {
        try {
            if (this.c == null) {
                Class<?> cls = Class.forName("com.facebook.litho.LithoViewTestHelper");
                i.d(cls, "Class.forName(LITHO_VIEW_TEST_HELPER_CLASS)");
                this.c = cls.getDeclaredMethod("viewToStringForE2E", View.class, Integer.TYPE, Boolean.TYPE);
            }
            Method method = this.c;
            Object objInvoke = method != null ? method.invoke(null, view, Integer.valueOf((str.length() / 2) + 1), Boolean.valueOf(z)) : null;
            if (objInvoke == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
            }
            i.d(printWriter.append((CharSequence) objInvoke), "writer.append(lithoViewDump)");
        } catch (Exception e2) {
            printWriter.append((CharSequence) str).append("Failed litho view sub hierarch dump: ").append((CharSequence) f.j(e2.getMessage(), 100)).println();
        }
    }
}
