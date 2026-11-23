package h.l.a;

import android.os.Build;
import android.text.method.KeyListener;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;

/* JADX INFO: loaded from: classes.dex */
public final class a {
    private final b a;

    /* JADX INFO: renamed from: h.l.a.a$a, reason: collision with other inner class name */
    private static class C0205a extends b {
        private final EditText a;
        private final g b;

        C0205a(EditText editText, boolean z) {
            this.a = editText;
            g gVar = new g(editText, z);
            this.b = gVar;
            editText.addTextChangedListener(gVar);
            editText.setEditableFactory(h.l.a.b.getInstance());
        }

        @Override // h.l.a.a.b
        KeyListener a(KeyListener keyListener) {
            if (keyListener instanceof e) {
                return keyListener;
            }
            if (keyListener == null) {
                return null;
            }
            return new e(keyListener);
        }

        @Override // h.l.a.a.b
        InputConnection b(InputConnection inputConnection, EditorInfo editorInfo) {
            return inputConnection instanceof c ? inputConnection : new c(this.a, inputConnection, editorInfo);
        }

        @Override // h.l.a.a.b
        void c(boolean z) {
            this.b.c(z);
        }
    }

    static class b {
        b() {
        }

        KeyListener a(KeyListener keyListener) {
            return keyListener;
        }

        InputConnection b(InputConnection inputConnection, EditorInfo editorInfo) {
            return inputConnection;
        }

        void c(boolean z) {
        }
    }

    public a(EditText editText, boolean z) {
        h.h.k.e.g(editText, "editText cannot be null");
        if (Build.VERSION.SDK_INT < 19) {
            this.a = new b();
        } else {
            this.a = new C0205a(editText, z);
        }
    }

    public KeyListener a(KeyListener keyListener) {
        return this.a.a(keyListener);
    }

    public InputConnection b(InputConnection inputConnection, EditorInfo editorInfo) {
        if (inputConnection == null) {
            return null;
        }
        return this.a.b(inputConnection, editorInfo);
    }

    public void c(boolean z) {
        this.a.c(z);
    }
}
