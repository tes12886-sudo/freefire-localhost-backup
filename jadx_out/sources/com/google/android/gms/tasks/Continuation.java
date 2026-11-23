package com.google.android.gms.tasks;

/* JADX INFO: loaded from: classes.dex */
public interface Continuation<TResult, TContinuationResult> {
    TContinuationResult a(Task<TResult> task);
}
