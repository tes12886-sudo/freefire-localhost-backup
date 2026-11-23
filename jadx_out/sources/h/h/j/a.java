package h.h.j;

import android.os.Build;
import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.MetricAffectingSpan;
import h.h.k.c;

/* JADX INFO: loaded from: classes.dex */
public class a implements Spannable {
    private final Spannable a;
    private final C0196a b;
    private final PrecomputedText c;

    /* JADX INFO: renamed from: h.h.j.a$a, reason: collision with other inner class name */
    public static final class C0196a {
        private final TextPaint a;
        private final TextDirectionHeuristic b;
        private final int c;
        private final int d;

        /* JADX INFO: renamed from: h.h.j.a$a$a, reason: collision with other inner class name */
        public static class C0197a {
            private final TextPaint a;
            private TextDirectionHeuristic b;
            private int c;
            private int d;

            public C0197a(TextPaint textPaint) {
                this.a = textPaint;
                int i2 = Build.VERSION.SDK_INT;
                if (i2 >= 23) {
                    this.c = 1;
                    this.d = 1;
                } else {
                    this.d = 0;
                    this.c = 0;
                }
                this.b = i2 >= 18 ? TextDirectionHeuristics.FIRSTSTRONG_LTR : null;
            }

            public C0196a a() {
                return new C0196a(this.a, this.b, this.c, this.d);
            }

            public C0197a b(int i2) {
                this.c = i2;
                return this;
            }

            public C0197a c(int i2) {
                this.d = i2;
                return this;
            }

            public C0197a d(TextDirectionHeuristic textDirectionHeuristic) {
                this.b = textDirectionHeuristic;
                return this;
            }
        }

        public C0196a(PrecomputedText.Params params) {
            this.a = params.getTextPaint();
            this.b = params.getTextDirection();
            this.c = params.getBreakStrategy();
            this.d = params.getHyphenationFrequency();
            int i2 = Build.VERSION.SDK_INT;
        }

        C0196a(TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, int i2, int i3) {
            if (Build.VERSION.SDK_INT >= 29) {
                new PrecomputedText.Params.Builder(textPaint).setBreakStrategy(i2).setHyphenationFrequency(i3).setTextDirection(textDirectionHeuristic).build();
            }
            this.a = textPaint;
            this.b = textDirectionHeuristic;
            this.c = i2;
            this.d = i3;
        }

        public boolean a(C0196a c0196a) {
            int i2 = Build.VERSION.SDK_INT;
            if ((i2 >= 23 && (this.c != c0196a.b() || this.d != c0196a.c())) || this.a.getTextSize() != c0196a.e().getTextSize() || this.a.getTextScaleX() != c0196a.e().getTextScaleX() || this.a.getTextSkewX() != c0196a.e().getTextSkewX()) {
                return false;
            }
            if ((i2 >= 21 && (this.a.getLetterSpacing() != c0196a.e().getLetterSpacing() || !TextUtils.equals(this.a.getFontFeatureSettings(), c0196a.e().getFontFeatureSettings()))) || this.a.getFlags() != c0196a.e().getFlags()) {
                return false;
            }
            if (i2 >= 24) {
                if (!this.a.getTextLocales().equals(c0196a.e().getTextLocales())) {
                    return false;
                }
            } else if (i2 >= 17 && !this.a.getTextLocale().equals(c0196a.e().getTextLocale())) {
                return false;
            }
            if (this.a.getTypeface() == null) {
                return c0196a.e().getTypeface() == null;
            }
            return this.a.getTypeface().equals(c0196a.e().getTypeface());
        }

        public int b() {
            return this.c;
        }

        public int c() {
            return this.d;
        }

        public TextDirectionHeuristic d() {
            return this.b;
        }

        public TextPaint e() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C0196a)) {
                return false;
            }
            C0196a c0196a = (C0196a) obj;
            if (a(c0196a)) {
                return Build.VERSION.SDK_INT < 18 || this.b == c0196a.d();
            }
            return false;
        }

        public int hashCode() {
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 24) {
                return c.b(Float.valueOf(this.a.getTextSize()), Float.valueOf(this.a.getTextScaleX()), Float.valueOf(this.a.getTextSkewX()), Float.valueOf(this.a.getLetterSpacing()), Integer.valueOf(this.a.getFlags()), this.a.getTextLocales(), this.a.getTypeface(), Boolean.valueOf(this.a.isElegantTextHeight()), this.b, Integer.valueOf(this.c), Integer.valueOf(this.d));
            }
            if (i2 >= 21) {
                return c.b(Float.valueOf(this.a.getTextSize()), Float.valueOf(this.a.getTextScaleX()), Float.valueOf(this.a.getTextSkewX()), Float.valueOf(this.a.getLetterSpacing()), Integer.valueOf(this.a.getFlags()), this.a.getTextLocale(), this.a.getTypeface(), Boolean.valueOf(this.a.isElegantTextHeight()), this.b, Integer.valueOf(this.c), Integer.valueOf(this.d));
            }
            if (i2 < 18 && i2 < 17) {
                return c.b(Float.valueOf(this.a.getTextSize()), Float.valueOf(this.a.getTextScaleX()), Float.valueOf(this.a.getTextSkewX()), Integer.valueOf(this.a.getFlags()), this.a.getTypeface(), this.b, Integer.valueOf(this.c), Integer.valueOf(this.d));
            }
            return c.b(Float.valueOf(this.a.getTextSize()), Float.valueOf(this.a.getTextScaleX()), Float.valueOf(this.a.getTextSkewX()), Integer.valueOf(this.a.getFlags()), this.a.getTextLocale(), this.a.getTypeface(), this.b, Integer.valueOf(this.c), Integer.valueOf(this.d));
        }

        /* JADX WARN: Code duplicated, block: B:14:0x00df  */
        /* JADX WARN: Instruction removed from duplicated block: B:14:0x00df, please report this as an issue */
        public String toString() {
            StringBuilder sb;
            Object textLocale;
            StringBuilder sb2 = new StringBuilder("{");
            sb2.append("textSize=" + this.a.getTextSize());
            sb2.append(", textScaleX=" + this.a.getTextScaleX());
            sb2.append(", textSkewX=" + this.a.getTextSkewX());
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 21) {
                sb2.append(", letterSpacing=" + this.a.getLetterSpacing());
                sb2.append(", elegantTextHeight=" + this.a.isElegantTextHeight());
            }
            if (i2 < 24) {
                if (i2 >= 17) {
                    sb = new StringBuilder();
                    sb.append(", textLocale=");
                    textLocale = this.a.getTextLocale();
                }
                sb2.append(", typeface=" + this.a.getTypeface());
                if (i2 >= 26) {
                    sb2.append(", variationSettings=" + this.a.getFontVariationSettings());
                }
                sb2.append(", textDir=" + this.b);
                sb2.append(", breakStrategy=" + this.c);
                sb2.append(", hyphenationFrequency=" + this.d);
                sb2.append("}");
                return sb2.toString();
            }
            sb = new StringBuilder();
            sb.append(", textLocale=");
            textLocale = this.a.getTextLocales();
            sb.append(textLocale);
            sb2.append(sb.toString());
            sb2.append(", typeface=" + this.a.getTypeface());
            if (i2 >= 26) {
                sb2.append(", variationSettings=" + this.a.getFontVariationSettings());
            }
            sb2.append(", textDir=" + this.b);
            sb2.append(", breakStrategy=" + this.c);
            sb2.append(", hyphenationFrequency=" + this.d);
            sb2.append("}");
            return sb2.toString();
        }
    }

    public C0196a a() {
        return this.b;
    }

    public PrecomputedText b() {
        Spannable spannable = this.a;
        if (spannable instanceof PrecomputedText) {
            return (PrecomputedText) spannable;
        }
        return null;
    }

    @Override // java.lang.CharSequence
    public char charAt(int i2) {
        return this.a.charAt(i2);
    }

    @Override // android.text.Spanned
    public int getSpanEnd(Object obj) {
        return this.a.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public int getSpanFlags(Object obj) {
        return this.a.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public int getSpanStart(Object obj) {
        return this.a.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public <T> T[] getSpans(int i2, int i3, Class<T> cls) {
        return Build.VERSION.SDK_INT >= 29 ? (T[]) this.c.getSpans(i2, i3, cls) : (T[]) this.a.getSpans(i2, i3, cls);
    }

    @Override // java.lang.CharSequence
    public int length() {
        return this.a.length();
    }

    @Override // android.text.Spanned
    public int nextSpanTransition(int i2, int i3, Class cls) {
        return this.a.nextSpanTransition(i2, i3, cls);
    }

    @Override // android.text.Spannable
    public void removeSpan(Object obj) {
        if (obj instanceof MetricAffectingSpan) {
            throw new IllegalArgumentException("MetricAffectingSpan can not be removed from PrecomputedText.");
        }
        if (Build.VERSION.SDK_INT >= 29) {
            this.c.removeSpan(obj);
        } else {
            this.a.removeSpan(obj);
        }
    }

    @Override // android.text.Spannable
    public void setSpan(Object obj, int i2, int i3, int i4) {
        if (obj instanceof MetricAffectingSpan) {
            throw new IllegalArgumentException("MetricAffectingSpan can not be set to PrecomputedText.");
        }
        if (Build.VERSION.SDK_INT >= 29) {
            this.c.setSpan(obj, i2, i3, i4);
        } else {
            this.a.setSpan(obj, i2, i3, i4);
        }
    }

    @Override // java.lang.CharSequence
    public CharSequence subSequence(int i2, int i3) {
        return this.a.subSequence(i2, i3);
    }

    @Override // java.lang.CharSequence
    public String toString() {
        return this.a.toString();
    }
}
