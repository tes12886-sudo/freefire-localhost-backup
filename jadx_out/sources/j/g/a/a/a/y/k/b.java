package j.g.a.a.a.y.k;

import android.content.Context;
import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes.dex */
public class b implements a {
    private final SharedPreferences a;

    public b(Context context, String str) {
        if (context == null) {
            throw new IllegalArgumentException("Context must not be null");
        }
        this.a = context.getSharedPreferences(str, 0);
    }

    @Override // j.g.a.a.a.y.k.a
    public SharedPreferences.Editor a() {
        return this.a.edit();
    }

    @Override // j.g.a.a.a.y.k.a
    public boolean b(SharedPreferences.Editor editor) {
        editor.apply();
        return true;
    }

    @Override // j.g.a.a.a.y.k.a
    public SharedPreferences get() {
        return this.a;
    }
}
