package com.voxelbusters.androidlib.b;

import android.content.Context;
import android.graphics.Point;
import android.media.CamcorderProfile;
import android.util.Log;
import android.util.Range;
import com.voxelbusters.androidlib.internal.e;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class b {
    private static String f = "RecorderProfile";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Map f1626g;
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;

    static {
        HashMap map = new HashMap();
        f1626g = map;
        map.put(1, new Range(4000000, 8000000));
        map.put(6, new Range(4000000, 8000000));
        map.put(5, new Range(1500000, 4000000));
        map.put(4, new Range(1200000, 1500000));
        map.put(0, new Range(400000, 1000000));
    }

    private static CamcorderProfile a(e eVar) {
        int iOrdinal = eVar.ordinal();
        Log.d(f, "getCamCorderProfile Preferred Type : " + eVar + "  index = " + iOrdinal);
        HashMap map = new HashMap();
        map.put(0, 6);
        map.put(1, 6);
        map.put(2, 5);
        map.put(3, 4);
        int length = e.values().length;
        while (iOrdinal <= length) {
            int iIntValue = ((Integer) map.get(Integer.valueOf(iOrdinal))).intValue();
            if (CamcorderProfile.hasProfile(iIntValue)) {
                return CamcorderProfile.get(iIntValue);
            }
            iOrdinal++;
        }
        return CamcorderProfile.get(0);
    }

    public static b b(Context context, e eVar, float f2) {
        int i2;
        Log.d(f, "getRecorderProfile : " + eVar);
        CamcorderProfile camcorderProfileA = a(eVar);
        Log.d(f, "Camcorder profile : " + camcorderProfileA.quality);
        b bVar = new b();
        Point pointJ = com.voxelbusters.androidlib.d.b.j(context);
        boolean zN = com.voxelbusters.androidlib.d.b.n(context);
        int i3 = zN ? camcorderProfileA.videoFrameWidth : camcorderProfileA.videoFrameHeight;
        int i4 = zN ? camcorderProfileA.videoFrameHeight : camcorderProfileA.videoFrameWidth;
        int i5 = pointJ.x;
        if (i3 >= i5 && i4 >= (i2 = pointJ.y)) {
            bVar.b = i5;
            bVar.c = i2;
            Log.d(f, "Setting the screen size : " + pointJ.x + "   " + pointJ.y);
        } else if (zN) {
            i3 = (i5 * i4) / pointJ.y;
        } else {
            i4 = (pointJ.y * i3) / i5;
        }
        if (i3 % 2 != 0) {
            i3++;
        }
        if (i4 % 2 != 0) {
            i4++;
        }
        bVar.b = i3;
        bVar.c = i4;
        bVar.e = c(camcorderProfileA.quality);
        bVar.d = camcorderProfileA.videoFrameRate;
        bVar.a = camcorderProfileA.quality;
        Log.d(f, "Bit rate : " + bVar.e + " Frame Rate : " + bVar.d + " Profile Quality : " + bVar.a + " Width : " + bVar.b + " Height : " + bVar.c + "  screen size : " + pointJ.x + "   " + pointJ.y);
        return bVar;
    }

    private static int c(int i2) {
        if (i2 == 4) {
            return 800000;
        }
        if (i2 != 5) {
            return i2 != 6 ? 400000 : 2000000;
        }
        return 1500000;
    }

    public String toString() {
        return "Width : " + this.b + " Height : " + this.c + " Bitrate : " + this.e + " FrameRate : " + this.d;
    }
}
