package j.g.a.a.a;

import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public class d implements h {
    private int a;

    public d() {
        this.a = 4;
    }

    public d(int i2) {
        this.a = i2;
    }

    @Override // j.g.a.a.a.h
    public void a(String str, String str2) {
        g(str, str2, null);
    }

    @Override // j.g.a.a.a.h
    public void b(String str, String str2) {
        c(str, str2, null);
    }

    @Override // j.g.a.a.a.h
    public void c(String str, String str2, Throwable th) {
        if (f(str, 6)) {
            Log.e(str, str2, th);
        }
    }

    @Override // j.g.a.a.a.h
    public void d(String str, String str2) {
        e(str, str2, null);
    }

    public void e(String str, String str2, Throwable th) {
        if (f(str, 3)) {
            Log.d(str, str2, th);
        }
    }

    public boolean f(String str, int i2) {
        return this.a <= i2;
    }

    public void g(String str, String str2, Throwable th) {
        if (f(str, 5)) {
            Log.w(str, str2, th);
        }
    }
}
