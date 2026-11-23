package h.l.a;

import android.os.Build;
import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
public final class f {
    private final b a;

    private static class a extends b {
        private final TextView a;
        private final d b;
        private boolean c = true;

        a(TextView textView) {
            this.a = textView;
            this.b = new d(textView);
        }

        private InputFilter[] d(InputFilter[] inputFilterArr) {
            int length = inputFilterArr.length;
            for (InputFilter inputFilter : inputFilterArr) {
                if (inputFilter == this.b) {
                    return inputFilterArr;
                }
            }
            InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length + 1];
            System.arraycopy(inputFilterArr, 0, inputFilterArr2, 0, length);
            inputFilterArr2[length] = this.b;
            return inputFilterArr2;
        }

        private SparseArray<InputFilter> e(InputFilter[] inputFilterArr) {
            SparseArray<InputFilter> sparseArray = new SparseArray<>(1);
            for (int i2 = 0; i2 < inputFilterArr.length; i2++) {
                if (inputFilterArr[i2] instanceof d) {
                    sparseArray.put(i2, inputFilterArr[i2]);
                }
            }
            return sparseArray;
        }

        private InputFilter[] f(InputFilter[] inputFilterArr) {
            SparseArray<InputFilter> sparseArrayE = e(inputFilterArr);
            if (sparseArrayE.size() == 0) {
                return inputFilterArr;
            }
            int length = inputFilterArr.length;
            InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length - sparseArrayE.size()];
            int i2 = 0;
            for (int i3 = 0; i3 < length; i3++) {
                if (sparseArrayE.indexOfKey(i3) < 0) {
                    inputFilterArr2[i2] = inputFilterArr[i3];
                    i2++;
                }
            }
            return inputFilterArr2;
        }

        private TransformationMethod h(TransformationMethod transformationMethod) {
            return transformationMethod instanceof h ? ((h) transformationMethod).a() : transformationMethod;
        }

        private void i() {
            this.a.setFilters(a(this.a.getFilters()));
        }

        private TransformationMethod k(TransformationMethod transformationMethod) {
            return ((transformationMethod instanceof h) || (transformationMethod instanceof PasswordTransformationMethod)) ? transformationMethod : new h(transformationMethod);
        }

        @Override // h.l.a.f.b
        InputFilter[] a(InputFilter[] inputFilterArr) {
            return !this.c ? f(inputFilterArr) : d(inputFilterArr);
        }

        @Override // h.l.a.f.b
        void b(boolean z) {
            if (z) {
                j();
            }
        }

        @Override // h.l.a.f.b
        void c(boolean z) {
            this.c = z;
            j();
            i();
        }

        void g(boolean z) {
            this.c = z;
        }

        void j() {
            this.a.setTransformationMethod(l(this.a.getTransformationMethod()));
        }

        TransformationMethod l(TransformationMethod transformationMethod) {
            return this.c ? k(transformationMethod) : h(transformationMethod);
        }
    }

    static class b {
        b() {
        }

        InputFilter[] a(InputFilter[] inputFilterArr) {
            return inputFilterArr;
        }

        void b(boolean z) {
        }

        void c(boolean z) {
        }
    }

    private static class c extends b {
        private final a a;

        c(TextView textView) {
            this.a = new a(textView);
        }

        private boolean d() {
            return !androidx.emoji2.text.g.h();
        }

        @Override // h.l.a.f.b
        InputFilter[] a(InputFilter[] inputFilterArr) {
            return d() ? inputFilterArr : this.a.a(inputFilterArr);
        }

        @Override // h.l.a.f.b
        void b(boolean z) {
            if (d()) {
                return;
            }
            this.a.b(z);
        }

        @Override // h.l.a.f.b
        void c(boolean z) {
            if (d()) {
                this.a.g(z);
            } else {
                this.a.c(z);
            }
        }
    }

    public f(TextView textView, boolean z) {
        h.h.k.e.g(textView, "textView cannot be null");
        if (Build.VERSION.SDK_INT < 19) {
            this.a = new b();
        } else {
            this.a = !z ? new c(textView) : new a(textView);
        }
    }

    public InputFilter[] a(InputFilter[] inputFilterArr) {
        return this.a.a(inputFilterArr);
    }

    public void b(boolean z) {
        this.a.b(z);
    }

    public void c(boolean z) {
        this.a.c(z);
    }
}
