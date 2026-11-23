package g.a;

import android.annotation.SuppressLint;
import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"NotCloseable"})
public class b {
    private b() {
    }

    public b(a aVar) {
        this();
        Log.d("HapticPlayer", "new player");
    }

    public static boolean a() {
        return false;
    }

    public void b(int i2) {
        Log.e("HapticPlayer", "not support Haptic player api, start with loop");
    }

    public void c(int i2, int i3, int i4) {
        Log.e("HapticPlayer", "not support Haptic player api, start with loop & interval & amplitude");
    }

    public void d(int i2, int i3, int i4, int i5) {
        Log.e("HapticPlayer", "not support Haptic player api, start with loop & interval & amplitude & freq");
    }

    public void e() {
        Log.e("HapticPlayer", "not support Haptic player api, stop");
    }

    public void f(int i2) {
        Log.e("HapticPlayer", "not support Haptic player api, updateAmplitude with amplitude");
    }

    public void g(int i2) {
        Log.e("HapticPlayer", "not support Haptic player api, updateFrequency with freq");
    }

    public void h(int i2) {
        Log.e("HapticPlayer", "not support Haptic player api, updateInterval with interval");
    }

    public void i(int i2, int i3, int i4) {
        Log.e("HapticPlayer", "not support Haptic player api, updateParameter with interval/amplitude/freq");
    }
}
