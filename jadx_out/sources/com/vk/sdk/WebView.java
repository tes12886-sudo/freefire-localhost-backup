package com.vk.sdk;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public class WebView extends android.webkit.WebView {
    public WebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.webkit.WebView, android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        View view = this;
        while (view.getParent() instanceof View) {
            view = (View) view.getParent();
            view.setBackgroundColor(0);
        }
    }
}
