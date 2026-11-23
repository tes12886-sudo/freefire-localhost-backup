package com.beetalk.sdk.plugin.e;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import com.beetalk.sdk.g;
import com.beetalk.sdk.h;
import com.beetalk.sdk.i;
import com.beetalk.sdk.p;
import com.beetalk.sdk.plugin.PluginResult;
import com.beetalk.sdk.x.d;
import com.garena.pay.android.b;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public abstract class a extends com.beetalk.sdk.plugin.a<h, PluginResult> {
    private static byte[] j(Bitmap bitmap, int i2, int i3) {
        byte[] byteArray;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        while (true) {
            bitmap.compress(Bitmap.CompressFormat.JPEG, i3, byteArrayOutputStream);
            byteArray = byteArrayOutputStream.toByteArray();
            if (byteArray.length <= i2 || i3 < 30) {
                break;
            }
            byteArrayOutputStream.reset();
            double d = i3;
            Double.isNaN(d);
            i3 = (int) (d * 0.85d);
        }
        try {
            byteArrayOutputStream.close();
        } catch (IOException e) {
            com.beetalk.sdk.x.a.b(e);
        }
        return byteArray;
    }

    @Override // com.beetalk.sdk.plugin.a
    public boolean f(Activity activity, int i2, Intent intent) {
        h(activity, (i2 == -1 ? b.SUCCESS : b.UNKNOWN_ERROR).c().intValue(), "");
        return true;
    }

    protected void i(Activity activity, h hVar) {
        Bitmap bitmapDecodeFile;
        String str = "com.garena.gas";
        byte[] bArrJ = null;
        try {
            String strA = hVar.a();
            if (!TextUtils.isEmpty(strA)) {
                File file = new File(strA);
                if (!file.exists()) {
                    com.beetalk.sdk.x.a.i("File doesn't exist:" + strA, new Object[0]);
                    h(activity, b.UNKNOWN_ERROR.c().intValue(), "File doesn't exist");
                    return;
                }
                try {
                    BitmapFactory.Options options = new BitmapFactory.Options();
                    options.inJustDecodeBounds = true;
                    options.inPreferredConfig = Bitmap.Config.ARGB_8888;
                    BitmapFactory.decodeFile(file.getAbsolutePath(), options);
                    int i2 = options.outWidth;
                    int i3 = options.outHeight;
                    int i4 = 1;
                    while (i2 * i3 > 2073600) {
                        i2 /= 2;
                        i3 /= 2;
                        i4 *= 2;
                    }
                    options.inJustDecodeBounds = false;
                    int i5 = 0;
                    do {
                        options.inSampleSize = i4;
                        bitmapDecodeFile = BitmapFactory.decodeFile(strA, options);
                        i4 *= 2;
                        i5++;
                        if (bitmapDecodeFile != null) {
                            break;
                        }
                    } while (i5 < 3);
                    bArrJ = j(bitmapDecodeFile, 500000, 85);
                } catch (Exception e) {
                    com.beetalk.sdk.x.a.b(e);
                }
            }
            if (bArrJ == null && (bArrJ = hVar.c()) == null) {
                h(activity, b.UNKNOWN_ERROR.c().intValue(), "fail to load image");
                return;
            }
            if (bArrJ.length > 500000) {
                try {
                    bArrJ = j(BitmapFactory.decodeByteArray(bArrJ, 0, bArrJ.length), 500000, 85);
                } catch (Exception e2) {
                    com.beetalk.sdk.x.a.b(e2);
                    h(activity, b.UNKNOWN_ERROR.c().intValue(), e2.getMessage());
                    return;
                }
            }
            Intent intent = new Intent();
            if (!d.p("com.garena.gas", activity)) {
                str = "com.garena.gaslite";
            }
            intent.setClassName(str, "com.garena.gameauth.GPProxyCommonActivity");
            intent.setAction(k());
            intent.putExtra("com.garena.msdk.share.ImgData", bArrJ);
            intent.putExtra("com.garena.msdk.share.MediaTagName", hVar.d());
            intent.putExtra("com.garena.msdk.share.ItemType", 1);
            intent.putExtra("com.garena.msdk.share.OpenId", g.y().C());
            intent.putExtra("com.garena.msdk.share.ShareTo", hVar.f());
            intent.putExtra("com.garena.msdk.share.MessageExt", hVar.e());
            intent.putExtra("com.garena.msdk.share.ImgDataLength", bArrJ.length);
            intent.putExtra("com.garena.msdk.share.GameId", hVar.b());
            intent.putExtra("com.garena.msdk.share.AutoAuth", false);
            intent.putExtra("com.garena.msdk.share.SDKVer", i.b());
            intent.putExtra("com.garena.msdk.share.SDKEnv", p.p().toString());
            activity.startActivityForResult(intent, e().intValue());
        } catch (Exception e3) {
            com.beetalk.sdk.x.a.b(e3);
            h(activity, b.UNKNOWN_ERROR.c().intValue(), e3.getMessage());
        }
    }

    protected abstract String k();
}
