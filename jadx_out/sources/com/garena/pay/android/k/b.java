package com.garena.pay.android.k;

import android.graphics.drawable.ColorDrawable;
import android.view.MotionEvent;
import android.view.View;
import android.widget.PopupWindow;

/* JADX INFO: loaded from: classes.dex */
public class b {
    protected PopupWindow a;
    private PopupWindow.OnDismissListener b = new a();
    private c c;

    class a implements PopupWindow.OnDismissListener {
        a() {
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
            b.this.a.setBackgroundDrawable(null);
            b bVar = b.this;
            bVar.a = null;
            bVar.c();
        }
    }

    /* JADX INFO: renamed from: com.garena.pay.android.k.b$b, reason: collision with other inner class name */
    class ViewOnTouchListenerC0111b implements View.OnTouchListener {
        ViewOnTouchListenerC0111b() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (motionEvent.getAction() != 0) {
                return true;
            }
            b.this.b();
            return true;
        }
    }

    public interface c {
        void a();
    }

    public b(View view, boolean z, boolean z2) {
        this.a = new PopupWindow(view, -1, -1, true);
        this.a.setBackgroundDrawable(new ColorDrawable(0));
        this.a.setInputMethodMode(1);
        this.a.setFocusable(true);
        this.a.update();
        if (z2) {
            this.a.setTouchInterceptor(new ViewOnTouchListenerC0111b());
        }
        this.a.setOnDismissListener(this.b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        c cVar = this.c;
        if (cVar != null) {
            cVar.a();
        }
    }

    public void b() {
        PopupWindow popupWindow = this.a;
        if (popupWindow != null) {
            try {
                popupWindow.dismiss();
            } catch (Exception unused) {
            }
        }
    }

    public void d(c cVar) {
        this.c = cVar;
    }

    public void e(View view) {
        if (view == null || !com.garena.pay.android.j.d.c(view.getContext())) {
            return;
        }
        this.a.showAtLocation(view, 17, 0, 0);
    }

    public void f() {
        PopupWindow popupWindow = this.a;
        if (popupWindow != null) {
            try {
                popupWindow.setOnDismissListener(null);
                this.a.dismiss();
            } catch (Exception unused) {
            }
        }
    }
}
