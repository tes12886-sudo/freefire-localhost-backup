package com.beetalk.sdk.x;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.os.Build;
import android.widget.ImageView;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.net.URL;

/* JADX INFO: loaded from: classes.dex */
public class f extends AsyncTask<String, Void, Bitmap> {
    private final WeakReference<ImageView> a;
    private final int b;
    private com.beetalk.sdk.x.b c;

    public static final class b {
        private final String a;
        private int b;

        private b(String str) {
            this.b = 0;
            this.a = str;
        }

        public void a(ImageView imageView) {
            if (imageView == null) {
                return;
            }
            f fVar = new f(imageView, this.b);
            if (Build.VERSION.SDK_INT >= 11) {
                fVar.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, this.a);
            } else {
                fVar.execute(this.a);
            }
        }

        public b b(int i2) {
            this.b = i2;
            return this;
        }
    }

    private f(ImageView imageView, int i2) {
        this.a = new WeakReference<>(imageView);
        this.b = i2;
        this.c = com.beetalk.sdk.x.b.a(imageView.getContext(), "cache_images");
    }

    public static b b(String str) {
        return new b(str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Bitmap doInBackground(String... strArr) throws Throwable {
        String str = strArr[0];
        Bitmap bitmapD = this.c.d(str);
        if (bitmapD != null) {
            return bitmapD;
        }
        try {
            bitmapD = BitmapFactory.decodeStream(new URL(str).openStream());
            this.c.h(str, bitmapD, 172800);
            return bitmapD;
        } catch (IOException e) {
            com.beetalk.sdk.x.a.b(e);
            return bitmapD;
        } catch (OutOfMemoryError unused) {
            com.beetalk.sdk.x.a.c("ImageLoader failed to load image: out of memory", new Object[0]);
            return bitmapD;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(Bitmap bitmap) {
        if (bitmap == null) {
            return;
        }
        ImageView imageView = this.a.get();
        if (imageView != null) {
            imageView.setImageBitmap(bitmap);
        } else {
            if (bitmap.isRecycled()) {
                return;
            }
            bitmap.recycle();
        }
    }

    @Override // android.os.AsyncTask
    protected void onPreExecute() {
        ImageView imageView = this.a.get();
        if (imageView != null) {
            imageView.setImageResource(this.b);
        }
    }
}
