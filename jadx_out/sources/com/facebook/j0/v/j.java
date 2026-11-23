package com.facebook.j0.v;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.facebook.r;

/* JADX INFO: loaded from: classes.dex */
public final class j {
    public static final a c = new a(null);
    private final String a;
    private final boolean b;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(l.y.c.f fVar) {
            this();
        }

        public final void a() {
            SharedPreferences.Editor editorEdit = PreferenceManager.getDefaultSharedPreferences(r.f()).edit();
            editorEdit.remove("com.facebook.appevents.SourceApplicationInfo.callingApplicationPackage");
            editorEdit.remove("com.facebook.appevents.SourceApplicationInfo.openedByApplink");
            editorEdit.apply();
        }

        public final j b() {
            SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(r.f());
            l.y.c.f fVar = null;
            if (defaultSharedPreferences.contains("com.facebook.appevents.SourceApplicationInfo.callingApplicationPackage")) {
                return new j(defaultSharedPreferences.getString("com.facebook.appevents.SourceApplicationInfo.callingApplicationPackage", null), defaultSharedPreferences.getBoolean("com.facebook.appevents.SourceApplicationInfo.openedByApplink", false), fVar);
            }
            return null;
        }
    }

    private j(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public /* synthetic */ j(String str, boolean z, l.y.c.f fVar) {
        this(str, z);
    }

    public final void a() {
        SharedPreferences.Editor editorEdit = PreferenceManager.getDefaultSharedPreferences(r.f()).edit();
        editorEdit.putString("com.facebook.appevents.SourceApplicationInfo.callingApplicationPackage", this.a);
        editorEdit.putBoolean("com.facebook.appevents.SourceApplicationInfo.openedByApplink", this.b);
        editorEdit.apply();
    }

    public String toString() {
        String str = this.b ? "Applink" : "Unclassified";
        if (this.a == null) {
            return str;
        }
        return str + '(' + this.a + ')';
    }
}
