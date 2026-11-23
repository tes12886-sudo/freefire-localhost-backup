package com.vk.sdk;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;

/* JADX INFO: loaded from: classes.dex */
public class j {
    private static Context a;

    public static Context a() {
        return a;
    }

    public static Bitmap b(Bitmap bitmap, int i2, int i3) {
        Context context;
        if (bitmap == null || bitmap.isRecycled() || (context = a) == null) {
            return bitmap;
        }
        int i4 = (int) (context.getResources().getDisplayMetrics().density * i2);
        int width = (int) (bitmap.getWidth() / ((bitmap.getHeight() * 1.0f) / i4));
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(width, i4, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint();
        Rect rect = new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight());
        Rect rect2 = new Rect(0, 0, width, i4);
        RectF rectF = new RectF(rect2);
        paint.setAntiAlias(true);
        canvas.drawARGB(0, 0, 0, 0);
        paint.setColor(-1);
        float f = i3;
        canvas.drawRoundRect(rectF, f, f, paint);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        canvas.drawBitmap(bitmap, rect, rect2, paint);
        return bitmapCreateBitmap;
    }

    static void c(Context context) {
        if (context != null) {
            a = context.getApplicationContext();
        }
    }
}
