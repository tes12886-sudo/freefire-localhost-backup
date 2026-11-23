package h.d.b;

import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public final class a {
    public final Integer a;
    public final Integer b;
    public final Integer c;
    public final Integer d;

    /* JADX INFO: renamed from: h.d.b.a$a, reason: collision with other inner class name */
    public static final class C0186a {
        private Integer a;
        private Integer b;
        private Integer c;
        private Integer d;

        public a a() {
            return new a(this.a, this.b, this.c, this.d);
        }

        public C0186a b(int i2) {
            this.a = Integer.valueOf(i2 | (-16777216));
            return this;
        }
    }

    a(Integer num, Integer num2, Integer num3, Integer num4) {
        this.a = num;
        this.b = num2;
        this.c = num3;
        this.d = num4;
    }

    Bundle a() {
        Bundle bundle = new Bundle();
        Integer num = this.a;
        if (num != null) {
            bundle.putInt("android.support.customtabs.extra.TOOLBAR_COLOR", num.intValue());
        }
        Integer num2 = this.b;
        if (num2 != null) {
            bundle.putInt("android.support.customtabs.extra.SECONDARY_TOOLBAR_COLOR", num2.intValue());
        }
        Integer num3 = this.c;
        if (num3 != null) {
            bundle.putInt("androidx.browser.customtabs.extra.NAVIGATION_BAR_COLOR", num3.intValue());
        }
        Integer num4 = this.d;
        if (num4 != null) {
            bundle.putInt("androidx.browser.customtabs.extra.NAVIGATION_BAR_DIVIDER_COLOR", num4.intValue());
        }
        return bundle;
    }
}
