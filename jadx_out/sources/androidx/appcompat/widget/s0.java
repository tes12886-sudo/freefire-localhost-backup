package androidx.appcompat.widget;

/* JADX INFO: loaded from: classes.dex */
class s0 {
    private int a = 0;
    private int b = 0;
    private int c = Integer.MIN_VALUE;
    private int d = Integer.MIN_VALUE;
    private int e = 0;
    private int f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f258g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f259h = false;

    s0() {
    }

    public int a() {
        return this.f258g ? this.a : this.b;
    }

    public int b() {
        return this.a;
    }

    public int c() {
        return this.b;
    }

    public int d() {
        return this.f258g ? this.b : this.a;
    }

    public void e(int i2, int i3) {
        this.f259h = false;
        if (i2 != Integer.MIN_VALUE) {
            this.e = i2;
            this.a = i2;
        }
        if (i3 != Integer.MIN_VALUE) {
            this.f = i3;
            this.b = i3;
        }
    }

    public void f(boolean z) {
        int i2;
        if (z == this.f258g) {
            return;
        }
        this.f258g = z;
        if (this.f259h) {
            if (z) {
                int i3 = this.d;
                if (i3 == Integer.MIN_VALUE) {
                    i3 = this.e;
                }
                this.a = i3;
                i2 = this.c;
                if (i2 == Integer.MIN_VALUE) {
                }
            } else {
                int i4 = this.c;
                if (i4 == Integer.MIN_VALUE) {
                    i4 = this.e;
                }
                this.a = i4;
                i2 = this.d;
                if (i2 == Integer.MIN_VALUE) {
                }
            }
            this.b = i2;
        }
        this.a = this.e;
        i2 = this.f;
        this.b = i2;
    }

    public void g(int i2, int i3) {
        this.c = i2;
        this.d = i3;
        this.f259h = true;
        if (this.f258g) {
            if (i3 != Integer.MIN_VALUE) {
                this.a = i3;
            }
            if (i2 != Integer.MIN_VALUE) {
                this.b = i2;
                return;
            }
            return;
        }
        if (i2 != Integer.MIN_VALUE) {
            this.a = i2;
        }
        if (i3 != Integer.MIN_VALUE) {
            this.b = i3;
        }
    }
}
