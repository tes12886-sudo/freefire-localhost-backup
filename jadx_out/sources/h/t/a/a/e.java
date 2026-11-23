package h.t.a.a;

import android.animation.TypeEvaluator;
import com.appff.haptic.base.Utils;

/* JADX INFO: loaded from: classes.dex */
public class e implements TypeEvaluator {
    private static final e a = new e();

    public static e a() {
        return a;
    }

    @Override // android.animation.TypeEvaluator
    public Object evaluate(float f, Object obj, Object obj2) {
        int iIntValue = ((Integer) obj).intValue();
        float f2 = ((iIntValue >> 24) & Utils.MAX_STRENGTH_VALUE) / 255.0f;
        float f3 = ((iIntValue >> 16) & Utils.MAX_STRENGTH_VALUE) / 255.0f;
        float f4 = ((iIntValue >> 8) & Utils.MAX_STRENGTH_VALUE) / 255.0f;
        float f5 = (iIntValue & Utils.MAX_STRENGTH_VALUE) / 255.0f;
        int iIntValue2 = ((Integer) obj2).intValue();
        float f6 = ((iIntValue2 >> 24) & Utils.MAX_STRENGTH_VALUE) / 255.0f;
        float f7 = ((iIntValue2 >> 16) & Utils.MAX_STRENGTH_VALUE) / 255.0f;
        float f8 = ((iIntValue2 >> 8) & Utils.MAX_STRENGTH_VALUE) / 255.0f;
        float f9 = (iIntValue2 & Utils.MAX_STRENGTH_VALUE) / 255.0f;
        float fPow = (float) Math.pow(f3, 2.2d);
        float fPow2 = (float) Math.pow(f4, 2.2d);
        float fPow3 = (float) Math.pow(f5, 2.2d);
        float fPow4 = (float) Math.pow(f7, 2.2d);
        float f10 = f2 + ((f6 - f2) * f);
        float fPow5 = fPow2 + ((((float) Math.pow(f8, 2.2d)) - fPow2) * f);
        float fPow6 = fPow3 + (f * (((float) Math.pow(f9, 2.2d)) - fPow3));
        return Integer.valueOf((Math.round(((float) Math.pow(fPow + ((fPow4 - fPow) * f), 0.45454545454545453d)) * 255.0f) << 16) | (Math.round(f10 * 255.0f) << 24) | (Math.round(((float) Math.pow(fPow5, 0.45454545454545453d)) * 255.0f) << 8) | Math.round(((float) Math.pow(fPow6, 0.45454545454545453d)) * 255.0f));
    }
}
