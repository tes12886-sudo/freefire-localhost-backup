package com.appff.haptic.a;

/* JADX INFO: loaded from: classes.dex */
abstract class f {
    int a;
    int b;
    int c;
    int d;
    int e;

    public f(int i2, int i3, int i4) {
        this.a = i2;
        this.b = i3;
        this.e = i4;
    }

    abstract int[] a();

    public String toString() {
        return "PatternHeEventBase{mEventType=" + this.a + ", mRelativeTime=" + this.b + ", mDuration=" + this.e + '}';
    }
}
