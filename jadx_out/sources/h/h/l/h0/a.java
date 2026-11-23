package h.h.l.h0;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class a extends ClickableSpan {
    private final int a;
    private final b b;
    private final int c;

    public a(int i2, b bVar, int i3) {
        this.a = i2;
        this.b = bVar;
        this.c = i3;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.a);
        this.b.F(this.c, bundle);
    }
}
