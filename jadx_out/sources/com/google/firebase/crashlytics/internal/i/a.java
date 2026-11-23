package com.google.firebase.crashlytics.internal.i;

/* JADX INFO: loaded from: classes.dex */
public class a implements d {
    private final int a;
    private final d[] b;
    private final b c;

    public a(int i2, d... dVarArr) {
        this.a = i2;
        this.b = dVarArr;
        this.c = new b(i2);
    }

    @Override // com.google.firebase.crashlytics.internal.i.d
    public StackTraceElement[] a(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr.length <= this.a) {
            return stackTraceElementArr;
        }
        StackTraceElement[] stackTraceElementArrA = stackTraceElementArr;
        for (d dVar : this.b) {
            if (stackTraceElementArrA.length <= this.a) {
                break;
            }
            stackTraceElementArrA = dVar.a(stackTraceElementArr);
        }
        return stackTraceElementArrA.length > this.a ? this.c.a(stackTraceElementArrA) : stackTraceElementArrA;
    }
}
