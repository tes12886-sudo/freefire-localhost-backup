package com.facebook.m0;

import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class b extends Fragment {
    private a h0;

    @Override // androidx.fragment.app.Fragment
    public void L0() {
        super.L0();
        this.h0.g();
    }

    @Override // androidx.fragment.app.Fragment
    public void l0(int i2, int i3, Intent intent) {
        super.l0(i2, i3, intent);
        this.h0.f(i2, i3, intent);
    }

    @Override // androidx.fragment.app.Fragment
    public void q0(Bundle bundle) {
        super.q0(bundle);
        this.h0 = new a(this);
    }
}
