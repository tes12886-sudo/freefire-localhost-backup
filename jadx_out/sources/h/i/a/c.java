package h.i.a;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public abstract class c extends a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f1828i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f1829j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private LayoutInflater f1830k;

    @Deprecated
    public c(Context context, int i2, Cursor cursor, boolean z) {
        super(context, cursor, z);
        this.f1829j = i2;
        this.f1828i = i2;
        this.f1830k = (LayoutInflater) context.getSystemService("layout_inflater");
    }

    @Override // h.i.a.a
    public View g(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f1830k.inflate(this.f1829j, viewGroup, false);
    }

    @Override // h.i.a.a
    public View h(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f1830k.inflate(this.f1828i, viewGroup, false);
    }
}
