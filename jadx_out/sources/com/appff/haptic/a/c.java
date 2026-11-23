package com.appff.haptic.a;

/* JADX INFO: loaded from: classes.dex */
abstract class c {
    int d;
    int e;
    int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    int f475g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    int f476h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    int f477i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    int f478j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    final /* synthetic */ a f479k;

    c(a aVar) {
        this.f479k = aVar;
    }

    abstract int[] a();

    public String toString() {
        return "Event{mType=" + this.d + ", mVibId=" + this.f + ", mRelativeTime=" + this.f475g + ", mIntensity=" + this.f476h + ", mFreq=" + this.f477i + ", mDuration=" + this.f478j + '}';
    }
}
