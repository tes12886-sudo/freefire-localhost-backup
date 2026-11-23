package com.vk.sdk.k.i;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes.dex */
public class d extends c<Bitmap> {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f1559i;

    class a implements com.vk.sdk.k.i.a.d {
        final /* synthetic */ b a;

        /* JADX INFO: renamed from: com.vk.sdk.k.i.d$a$a, reason: collision with other inner class name */
        class RunnableC0166a implements Runnable {
            final /* synthetic */ Bitmap a;

            RunnableC0166a(Bitmap bitmap) {
                this.a = bitmap;
            }

            @Override // java.lang.Runnable
            public void run() {
                a aVar = a.this;
                aVar.a.a(d.this, this.a);
            }
        }

        a(b bVar) {
            this.a = bVar;
        }

        @Override // com.vk.sdk.k.i.a.d
        public void onComplete() {
            if (d.this.h() == com.vk.sdk.k.i.a.e.Finished) {
                d dVar = d.this;
                if (dVar.f == null) {
                    new Handler(Looper.getMainLooper()).post(new RunnableC0166a(dVar.l()));
                    return;
                }
            }
            b bVar = this.a;
            d dVar2 = d.this;
            bVar.b(dVar2, dVar2.i(dVar2.f));
        }
    }

    public static abstract class b extends com.vk.sdk.k.i.a.c<d, Bitmap> {
    }

    public d(String str) {
        super(new com.vk.sdk.k.i.b.d(str));
    }

    @Override // com.vk.sdk.k.i.c
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public Bitmap l() {
        byte[] bArrJ = j();
        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrJ, 0, bArrJ.length);
        return this.f1559i > 0.0f ? Bitmap.createScaledBitmap(bitmapDecodeByteArray, (int) (bitmapDecodeByteArray.getWidth() * this.f1559i), (int) (bitmapDecodeByteArray.getHeight() * this.f1559i), true) : bitmapDecodeByteArray;
    }

    public void q(b bVar) {
        e(new a(bVar));
    }
}
