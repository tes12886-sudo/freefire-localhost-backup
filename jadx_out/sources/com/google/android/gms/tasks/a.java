package com.google.android.gms.tasks;

/* JADX INFO: loaded from: classes.dex */
public final class a extends IllegalStateException {
    private a(String str, Throwable th) {
        super(str, th);
    }

    public static IllegalStateException a(Task<?> task) {
        String strConcat;
        if (!task.isComplete()) {
            return new IllegalStateException("DuplicateTaskCompletionException can only be created from completed Task.");
        }
        Exception exception = task.getException();
        if (exception != null) {
            strConcat = "failure";
        } else if (task.isSuccessful()) {
            strConcat = "result ".concat(String.valueOf(String.valueOf(task.getResult())));
        } else {
            strConcat = task.isCanceled() ? "cancellation" : "unknown issue";
        }
        return new a("Complete with: ".concat(strConcat), exception);
    }
}
