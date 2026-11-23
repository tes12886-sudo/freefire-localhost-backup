package androidx.core.app;

import android.app.RemoteInput;
import android.os.Build;
import android.os.Bundle;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class n {
    static RemoteInput a(n nVar) {
        Set<String> setD;
        int i2 = Build.VERSION.SDK_INT;
        RemoteInput.Builder builderAddExtras = new RemoteInput.Builder(nVar.i()).setLabel(nVar.h()).setChoices(nVar.e()).setAllowFreeFormInput(nVar.c()).addExtras(nVar.g());
        if (i2 >= 26 && (setD = nVar.d()) != null) {
            Iterator<String> it = setD.iterator();
            while (it.hasNext()) {
                builderAddExtras.setAllowDataType(it.next(), true);
            }
        }
        if (i2 >= 29) {
            builderAddExtras.setEditChoicesBeforeSending(nVar.f());
        }
        return builderAddExtras.build();
    }

    static RemoteInput[] b(n[] nVarArr) {
        if (nVarArr == null) {
            return null;
        }
        RemoteInput[] remoteInputArr = new RemoteInput[nVarArr.length];
        for (int i2 = 0; i2 < nVarArr.length; i2++) {
            remoteInputArr[i2] = a(nVarArr[i2]);
        }
        return remoteInputArr;
    }

    public boolean c() {
        throw null;
    }

    public Set<String> d() {
        throw null;
    }

    public CharSequence[] e() {
        throw null;
    }

    public int f() {
        throw null;
    }

    public Bundle g() {
        throw null;
    }

    public CharSequence h() {
        throw null;
    }

    public String i() {
        throw null;
    }
}
