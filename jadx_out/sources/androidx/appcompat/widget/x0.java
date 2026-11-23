package androidx.appcompat.widget;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.os.Build;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class x0 extends ContextWrapper {
    private static final Object c = new Object();
    private static ArrayList<WeakReference<x0>> d;
    private final Resources a;
    private final Resources.Theme b;

    private x0(Context context) {
        super(context);
        if (!f1.c()) {
            this.a = new z0(this, context.getResources());
            this.b = null;
            return;
        }
        f1 f1Var = new f1(this, context.getResources());
        this.a = f1Var;
        Resources.Theme themeNewTheme = f1Var.newTheme();
        this.b = themeNewTheme;
        themeNewTheme.setTo(context.getTheme());
    }

    private static boolean a(Context context) {
        if ((context instanceof x0) || (context.getResources() instanceof z0) || (context.getResources() instanceof f1)) {
            return false;
        }
        return Build.VERSION.SDK_INT < 21 || f1.c();
    }

    public static Context b(Context context) {
        if (!a(context)) {
            return context;
        }
        synchronized (c) {
            ArrayList<WeakReference<x0>> arrayList = d;
            if (arrayList == null) {
                d = new ArrayList<>();
            } else {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    WeakReference<x0> weakReference = d.get(size);
                    if (weakReference == null || weakReference.get() == null) {
                        d.remove(size);
                    }
                }
                for (int size2 = d.size() - 1; size2 >= 0; size2--) {
                    WeakReference<x0> weakReference2 = d.get(size2);
                    x0 x0Var = weakReference2 != null ? weakReference2.get() : null;
                    if (x0Var != null && x0Var.getBaseContext() == context) {
                        return x0Var;
                    }
                }
            }
            x0 x0Var2 = new x0(context);
            d.add(new WeakReference<>(x0Var2));
            return x0Var2;
        }
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public AssetManager getAssets() {
        return this.a.getAssets();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        return this.a;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources.Theme getTheme() {
        Resources.Theme theme = this.b;
        return theme == null ? super.getTheme() : theme;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void setTheme(int i2) {
        Resources.Theme theme = this.b;
        if (theme == null) {
            super.setTheme(i2);
        } else {
            theme.applyStyle(i2, true);
        }
    }
}
