package com.appff.haptic.a;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.text.TextUtils;
import android.util.Log;
import com.appff.haptic.base.Utils;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class a extends com.appff.haptic.base.d {
    public static AtomicInteger a = new AtomicInteger();
    private static final String b = "PatternHeImpl";
    private final Vibrator c;
    private final boolean d = false;
    private Class<?> e;

    @SuppressLint({"PrivateApi"})
    public a(Context context) {
        this.c = (Vibrator) context.getSystemService("vibrator");
        try {
            this.e = Class.forName("android.os.RichTapVibrationEffect");
        } catch (ClassNotFoundException unused) {
            Log.i(b, "failed to reflect class: ...VibrationEffect!");
        }
        if (this.e == null) {
            try {
                this.e = Class.forName("android.os.VibrationEffect");
            } catch (ClassNotFoundException unused2) {
                Log.i(b, "failed to reflect class: \"android.os.VibrationEffect\"!");
            }
        }
    }

    private boolean b(int i2, int i3, int i4) {
        String str;
        if (i2 >= 22) {
            if (i2 == 22) {
                if (i4 != 1) {
                    str = "rt version is " + String.format("%x", Integer.valueOf(i2)) + " can not support he version: " + i4;
                }
            } else if (i2 == 23 && i4 != 1 && i4 != 2) {
                return false;
            }
            return true;
        }
        str = "can not support he in rt version:" + String.format("%x02", Integer.valueOf(i2));
        Log.e(b, str);
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:107:0x01bb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:77:0x01bc A[Catch: Exception -> 0x01d6, LOOP:0: B:5:0x0029->B:77:0x01bc, LOOP_END, TryCatch #1 {Exception -> 0x01d6, blocks: (B:7:0x002d, B:13:0x0052, B:16:0x005a, B:18:0x007f, B:20:0x008c, B:86:0x01e1, B:88:0x01e8, B:90:0x01f5, B:91:0x0207, B:92:0x020b, B:21:0x0095, B:23:0x00b2, B:26:0x00ba, B:28:0x00d0, B:30:0x00d6, B:32:0x00f8, B:34:0x0101, B:35:0x0108, B:38:0x0116, B:42:0x0137, B:45:0x013f, B:77:0x01bc, B:48:0x0148, B:50:0x0151, B:52:0x0159, B:57:0x0167, B:59:0x0170, B:61:0x0178, B:68:0x018a, B:72:0x0199, B:31:0x00f3, B:80:0x01cf, B:17:0x0079, B:10:0x0048), top: B:100:0x002d }] */
    private int[] b(String str) {
        int[] iArr;
        int i2;
        String str2;
        int i3;
        String str3;
        int i4;
        int i5;
        String str4;
        String str5 = Utils.EVENT_KEY_RELATIVE_TIME;
        try {
            JSONArray jSONArray = new JSONObject(str).getJSONArray(Utils.PATTERN_KEY_PATTERN);
            int iMin = Math.min(jSONArray.length(), 16);
            int[] iArr2 = new int[iMin * 17];
            int i6 = 0;
            int i7 = 0;
            int i8 = 0;
            boolean z = true;
            while (true) {
                if (i6 < iMin) {
                    try {
                        JSONObject jSONObject = jSONArray.getJSONObject(i6).getJSONObject(Utils.EVENT_KEY_EVENT);
                        String string = jSONObject.getString(Utils.EVENT_KEY_HE_TYPE);
                        if (TextUtils.equals(Utils.EVENT_TYPE_HE_CONTINUOUS_NAME, string)) {
                            i4 = Utils.CONTINUOUS_EVENT;
                        } else {
                            if (TextUtils.equals(Utils.EVENT_TYPE_HE_TRANSIENT_NAME, string)) {
                                i4 = Utils.TRANSIENT_EVENT;
                            } else {
                                i2 = iMin;
                                i3 = i8;
                                str3 = "haven't get type value";
                            }
                            Log.e(b, str3);
                            i8 = i3;
                            z = false;
                        }
                        if (jSONObject.has(str5)) {
                            i5 = jSONObject.getInt(str5);
                        } else {
                            StringBuilder sb = new StringBuilder();
                            sb.append("event:");
                            sb.append(i6);
                            sb.append(" don't have relativeTime parameters,set default:");
                            i5 = i6 * Utils.HE_DEFAULT_RELATIVE_TIME;
                            sb.append(i5);
                            Log.e(b, sb.toString());
                        }
                        i7 = i5;
                        String str6 = str5;
                        if (c(i7, 0, 50000)) {
                            JSONObject jSONObject2 = jSONObject.getJSONObject(Utils.EVENT_KEY_HE_PARAMETERS);
                            int i9 = jSONObject2.getInt(Utils.EVENT_KEY_HE_INTENSITY);
                            i3 = i8;
                            int i10 = jSONObject2.getInt(Utils.EVENT_KEY_HE_FREQUENCY);
                            boolean z2 = z;
                            int i11 = 100;
                            i2 = iMin;
                            if (c(i9, 0, 100) && c(i10, 0, 100)) {
                                int i12 = i6 * 17;
                                iArr2[i12 + 0] = i4;
                                iArr2[i12 + 1] = i7;
                                iArr2[i12 + 2] = i9;
                                iArr2[i12 + 3] = i10;
                                if (4096 == i4) {
                                    if (jSONObject.has(Utils.EVENT_KEY_DURATION)) {
                                        i8 = jSONObject.getInt(Utils.EVENT_KEY_DURATION);
                                    } else {
                                        Log.e(b, "event:" + i6 + " don't have duration parameters,set default:0");
                                        i8 = 0;
                                    }
                                    if (c(i8, 0, 5000)) {
                                        iArr2[i12 + 4] = i8;
                                        JSONArray jSONArray2 = jSONObject2.getJSONArray(Utils.EVENT_KEY_HE_CURVE);
                                        int i13 = 0;
                                        while (true) {
                                            if (i13 < 4) {
                                                JSONObject jSONObject3 = jSONArray2.getJSONObject(i13);
                                                int i14 = jSONObject3.getInt(Utils.EVENT_KEY_HE_CURVE_POINT_TIME);
                                                int i15 = i12;
                                                int i16 = (int) (jSONObject3.getDouble(Utils.EVENT_KEY_HE_INTENSITY) * 100.0d);
                                                int i17 = jSONObject3.getInt(Utils.EVENT_KEY_HE_FREQUENCY);
                                                if (i13 == 0 && (i14 != 0 || i16 != 0 || !c(i17, -100, i11))) {
                                                    str4 = "first point's time,  intensity must be 0, frequency must between -100 and 100";
                                                } else if (1 == i13 && (!c(i14, 0, 5000) || !c(i16, 0, 100) || !c(i17, -100, 100))) {
                                                    str4 = "second point's time must be less than 5000, intensity must between 0~1, frequency must between -100 and 100";
                                                } else if (2 != i13 || (c(i14, 0, 5000) && c(i16, 0, 100) && c(i17, -100, 100))) {
                                                    if (3 == i13) {
                                                        if (i14 == i8 && i16 == 0) {
                                                            i11 = 100;
                                                            if (!c(i17, -100, 100)) {
                                                            }
                                                        }
                                                        str4 = "fourth point's time must equal with duration, and intensity must be 0, frequency must between -100 and 100";
                                                    } else {
                                                        i11 = 100;
                                                    }
                                                    int i18 = i13 * 3;
                                                    iArr2[i15 + i18 + 5] = i14;
                                                    iArr2[i15 + i18 + 6] = i16;
                                                    iArr2[i15 + i18 + 7] = i17;
                                                    i13++;
                                                    i12 = i15;
                                                } else {
                                                    str4 = "third point's time must be less than 5000, and intensity must between 0~1, frequency must between -100 and 100";
                                                }
                                                Log.e(b, str4);
                                                z = false;
                                            }
                                            if (!z) {
                                                i6++;
                                                jSONArray = jSONArray;
                                                str5 = str6;
                                                iMin = i2;
                                            }
                                        }
                                    } else {
                                        Log.e(b, "duration must be less than 5000");
                                    }
                                } else {
                                    i8 = i3;
                                }
                                z = z2;
                                if (!z) {
                                    i6++;
                                    jSONArray = jSONArray;
                                    str5 = str6;
                                    iMin = i2;
                                }
                            } else {
                                str3 = "intensity or frequency must between 0 and 100";
                                Log.e(b, str3);
                                i8 = i3;
                            }
                        } else {
                            Log.e(b, "relativeTime must between 0 and 50000");
                            i2 = iMin;
                        }
                        z = false;
                    } catch (Exception e) {
                        e = e;
                        iArr = iArr2;
                        e.printStackTrace();
                        return iArr;
                    }
                } else {
                    i2 = iMin;
                }
                if (!z) {
                    Log.e(b, "current he file data, isn't compliance!!!!!!!");
                    return null;
                }
                if (4096 == iArr2[((i2 - 1) * 17) + 0]) {
                    str2 = "last event type is continuous, totalDuration:" + (i7 + i8);
                } else {
                    str2 = "last event type is transient, totalDuration:" + (i7 + 80);
                }
                Log.d(b, str2);
                return iArr2;
            }
        } catch (Exception e2) {
            e = e2;
            iArr = null;
        }
    }

    private boolean c(int i2, int i3, int i4) {
        return i2 >= i3 && i2 <= i4;
    }

    private e[] c(String str) {
        e[] eVarArr;
        e[] eVarArr2;
        String str2;
        String str3;
        int i2;
        int i3;
        String str4 = Utils.EVENT_KEY_DURATION;
        String str5 = Utils.EVENT_KEY_HE_FREQUENCY;
        String str6 = Utils.EVENT_KEY_HE_INTENSITY;
        String str7 = Utils.EVENT_KEY_RELATIVE_TIME;
        try {
            JSONArray jSONArray = new JSONObject(str).getJSONArray(Utils.PATTERN_KEY_PATTERN_LIST);
            int length = jSONArray.length();
            byte[] bArr = new byte[length * 64];
            e[] eVarArr3 = new e[length];
            boolean z = true;
            int i4 = 0;
            int i5 = 0;
            int i6 = 0;
            while (i4 < length) {
                try {
                    e eVar = new e(this);
                    JSONObject jSONObject = jSONArray.getJSONObject(i4);
                    int i7 = jSONObject.getInt(Utils.PATTERN_KEY_PATTERN_ABS_TIME);
                    eVar.a = i7;
                    int i8 = i5 + i6;
                    JSONArray jSONArray2 = jSONArray;
                    if (i4 > 0 && i7 < i8) {
                        Log.e(b, "Bad pattern relative time in int:" + i4);
                        return null;
                    }
                    JSONArray jSONArray3 = jSONObject.getJSONArray(Utils.PATTERN_KEY_PATTERN);
                    eVar.b = new c[jSONArray3.length()];
                    int i9 = length;
                    int i10 = -1;
                    int i11 = 0;
                    while (true) {
                        if (i11 < jSONArray3.length()) {
                            JSONArray jSONArray4 = jSONArray3;
                            JSONObject jSONObject2 = jSONArray3.getJSONObject(i11).getJSONObject(Utils.EVENT_KEY_EVENT);
                            String string = jSONObject2.getString(Utils.EVENT_KEY_HE_TYPE);
                            boolean z2 = z;
                            int i12 = i5;
                            if (TextUtils.equals(Utils.EVENT_TYPE_HE_CONTINUOUS_NAME, string)) {
                                try {
                                    eVar.b[i11] = new b(this);
                                    i2 = Utils.CONTINUOUS_EVENT;
                                } catch (Exception e) {
                                    e = e;
                                    eVarArr = eVarArr3;
                                    e.printStackTrace();
                                    return eVarArr;
                                }
                            } else {
                                if (TextUtils.equals(Utils.EVENT_TYPE_HE_TRANSIENT_NAME, string)) {
                                    eVar.b[i11] = new i(this);
                                    i2 = Utils.TRANSIENT_EVENT;
                                } else {
                                    str2 = str7;
                                    eVarArr2 = eVarArr3;
                                    i3 = i6;
                                    str3 = str5;
                                    Log.e(b, "haven't get type value");
                                    i5 = i12;
                                }
                                i6 = i3;
                                z = false;
                            }
                            eVar.b[i11].f = (byte) jSONObject2.getInt(Utils.PATTERN_KEY_EVENT_VIB_ID);
                            if (!jSONObject2.has(str7)) {
                                Log.e(b, "event:" + i4 + " don't have relativeTime parameters,BAD he!");
                                return null;
                            }
                            int i13 = jSONObject2.getInt(str7);
                            if (i11 > 0 && i13 < i10) {
                                Log.e(b, "pattern ind:" + i4 + " event:" + i11 + " relative time is not right!");
                                return null;
                            }
                            str2 = str7;
                            if (c(i13, 0, 50000)) {
                                JSONObject jSONObject3 = jSONObject2.getJSONObject(Utils.EVENT_KEY_HE_PARAMETERS);
                                int i14 = jSONObject3.getInt(str6);
                                i3 = i6;
                                int i15 = jSONObject3.getInt(str5);
                                eVarArr2 = eVarArr3;
                                String str8 = str5;
                                if (c(i14, 0, 100) && c(i15, 0, 100)) {
                                    c[] cVarArr = eVar.b;
                                    cVarArr[i11].d = i2;
                                    cVarArr[i11].f475g = i13;
                                    cVarArr[i11].f476h = i14;
                                    cVarArr[i11].f477i = i15;
                                    if (4096 != i2) {
                                        str4 = str4;
                                        str6 = str6;
                                        str3 = str8;
                                        i6 = i3;
                                    } else {
                                        if (!jSONObject2.has(str4)) {
                                            Log.e(b, "event:" + i4 + " don't have duration parameters");
                                            return null;
                                        }
                                        int i16 = jSONObject2.getInt(str4);
                                        if (c(i16, 0, 5000)) {
                                            eVar.b[i11].f478j = i16;
                                            JSONArray jSONArray5 = jSONObject3.getJSONArray(Utils.EVENT_KEY_HE_CURVE);
                                            ((b) eVar.b[i11]).a = (byte) jSONArray5.length();
                                            int length2 = jSONArray5.length();
                                            h[] hVarArr = new h[length2];
                                            str4 = str4;
                                            int i17 = -1;
                                            int i18 = 0;
                                            int i19 = 0;
                                            while (i18 < jSONArray5.length()) {
                                                JSONObject jSONObject4 = jSONArray5.getJSONObject(i18);
                                                hVarArr[i18] = new h(this);
                                                i19 = jSONObject4.getInt(Utils.EVENT_KEY_HE_CURVE_POINT_TIME);
                                                String str9 = str6;
                                                JSONArray jSONArray6 = jSONArray5;
                                                int i20 = (int) (jSONObject4.getDouble(str6) * 100.0d);
                                                String str10 = str8;
                                                int i21 = jSONObject4.getInt(str10);
                                                if (i18 == 0 && i19 != 0) {
                                                    Log.d(b, "time of first point is not 0,bad he!");
                                                    return null;
                                                }
                                                if (i18 > 0 && i19 < i17) {
                                                    Log.d(b, "point times did not arrange in order,bad he!");
                                                    return null;
                                                }
                                                hVarArr[i18].a = i19;
                                                hVarArr[i18].b = i20;
                                                hVarArr[i18].c = i21;
                                                i18++;
                                                str8 = str10;
                                                i17 = i19;
                                                jSONArray5 = jSONArray6;
                                                str6 = str9;
                                            }
                                            str6 = str6;
                                            str3 = str8;
                                            if (i19 != i16) {
                                                Log.e(b, "event:" + i4 + " point last time do not match duration parameter");
                                                return null;
                                            }
                                            if (length2 > 0) {
                                                ((b) eVar.b[i11]).b = hVarArr;
                                                i6 = i16;
                                            } else {
                                                Log.d(b, "continuous event has nothing in point");
                                                i6 = i16;
                                                z2 = false;
                                            }
                                        } else {
                                            Log.e(b, "duration must be less than 5000");
                                            str4 = str4;
                                            i6 = i16;
                                            str6 = str6;
                                            i5 = i13;
                                            str3 = str8;
                                        }
                                    }
                                    if (z2) {
                                        i11++;
                                        str5 = str3;
                                        i10 = i13;
                                        i5 = i10;
                                        jSONArray3 = jSONArray4;
                                        z = z2;
                                        str4 = str4;
                                        str7 = str2;
                                        eVarArr3 = eVarArr2;
                                        str6 = str6;
                                    } else {
                                        i5 = i13;
                                        z = z2;
                                    }
                                } else {
                                    str3 = str8;
                                    Log.e(b, "intensity or frequency must between 0 and 100");
                                    i5 = i13;
                                    i6 = i3;
                                }
                            } else {
                                Log.e(b, "relativeTime must between 0 and 50000");
                                str4 = str4;
                                str3 = str5;
                                str6 = str6;
                                eVarArr2 = eVarArr3;
                                i5 = i13;
                            }
                            z = false;
                        } else {
                            str4 = str4;
                            str6 = str6;
                            str2 = str7;
                            eVarArr2 = eVarArr3;
                            str3 = str5;
                        }
                        if (!z) {
                            Log.e(b, "current he file data, isn't compliance!!!!!!!");
                            return null;
                        }
                        try {
                            eVarArr2[i4] = eVar;
                            i4++;
                            str5 = str3;
                            jSONArray = jSONArray2;
                            length = i9;
                            str4 = str4;
                            str7 = str2;
                            eVarArr3 = eVarArr2;
                            str6 = str6;
                        } catch (Exception e2) {
                            e = e2;
                            eVarArr = eVarArr2;
                            e.printStackTrace();
                            return eVarArr;
                        }
                    }
                } catch (Exception e3) {
                    e = e3;
                    eVarArr2 = eVarArr3;
                }
            }
            return eVarArr3;
        } catch (Exception e4) {
            e = e4;
            eVarArr = null;
        }
    }

    @Override // com.appff.haptic.base.d
    public int a(String str) {
        int i2;
        int iA;
        Log.d(b, "get Non FF PatternDuration");
        try {
            JSONArray jSONArray = new JSONObject(str).getJSONArray(Utils.PATTERN_KEY_PATTERN);
            int iMin = Math.min(jSONArray.length(), 16);
            int i3 = iMin * 2;
            long[] jArr = new long[i3];
            int i4 = 0;
            int i5 = 0;
            for (int i6 = 0; i6 < iMin; i6++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i6).getJSONObject(Utils.EVENT_KEY_EVENT);
                String string = jSONObject.getString(Utils.EVENT_KEY_HE_TYPE);
                if (!TextUtils.equals(Utils.EVENT_TYPE_HE_CONTINUOUS_NAME, string)) {
                    if (!TextUtils.equals(Utils.EVENT_TYPE_HE_TRANSIENT_NAME, string)) {
                        Log.e(b, "haven't get type value");
                        break;
                    }
                    int i7 = i6 * 2;
                    jArr[i7] = (jSONObject.getInt(Utils.EVENT_KEY_RELATIVE_TIME) - i4) - i5;
                    if (jArr[i7] < 0) {
                        jArr[i7] = 50;
                    }
                    JSONObject jSONObject2 = jSONObject.getJSONObject(Utils.EVENT_KEY_HE_PARAMETERS);
                    iA = com.appff.haptic.base.d.a(jSONObject2.getInt(Utils.EVENT_KEY_HE_INTENSITY), jSONObject2.getInt(Utils.EVENT_KEY_HE_FREQUENCY));
                    jArr[i7 + 1] = iA;
                    e.printStackTrace();
                    return i2;
                }
                int i8 = i6 * 2;
                jArr[i8] = (jSONObject.getInt(Utils.EVENT_KEY_RELATIVE_TIME) - i4) - i5;
                if (jArr[i8] < 0) {
                    jArr[i8] = 50;
                }
                iA = jSONObject.getInt(Utils.EVENT_KEY_DURATION);
                if (iA > 50 && iA < 100) {
                    iA = 50;
                } else if (iA > 100) {
                    iA -= 50;
                }
                jArr[i8 + 1] = iA;
                i5 = iA;
                i4 = jSONObject.getInt(Utils.EVENT_KEY_RELATIVE_TIME);
            }
            int i9 = 0;
            for (int i10 = 0; i10 < i3; i10++) {
                try {
                    i9 = (int) (((long) i9) + jArr[i10]);
                } catch (Exception e) {
                    e = e;
                    i2 = i9;
                }
            }
            if (i9 <= 30000) {
                return i9;
            }
            Log.e(b, "Pattern's duration is less than 30000");
            return 0;
        } catch (Exception e2) {
            e = e2;
            i2 = 0;
        }
    }

    @Override // com.appff.haptic.base.d
    public void a() {
        a(0, 0, 0);
    }

    @Override // com.appff.haptic.base.d
    public void a(int i2) {
        a(-1, -1, i2);
    }

    @Override // com.appff.haptic.base.d
    public void a(int i2, int i3, int i4) {
        try {
            if (Build.VERSION.SDK_INT >= 26) {
                Class<?> cls = this.e;
                Class<?> cls2 = Integer.TYPE;
                this.c.vibrate((VibrationEffect) cls.getMethod("createPatternHeParameter", cls2, cls2, cls2).invoke(null, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)));
            } else {
                Log.e(b, "The system apk is low than 26,does not support rt!!");
            }
        } catch (Exception e) {
            e.printStackTrace();
            Log.w(b, "The system doesn't integrate rt software");
        }
    }

    @Override // com.appff.haptic.base.d
    public void a(File file, int i2, int i3, int i4, int i5) {
        if (Utils.validatePath(file.getPath(), Utils.SUFFIX_HE)) {
            Log.d(b, "looper:" + i2 + " interval:" + i3 + " amplitude:" + i4 + " freq:" + i5);
            StringBuilder sb = new StringBuilder();
            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
                while (true) {
                    String line = bufferedReader.readLine();
                    if (line == null) {
                        break;
                    } else {
                        sb.append(line);
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            a(sb.toString(), i2, i3, i4, i5);
        }
    }

    @Override // com.appff.haptic.base.d
    public void a(String str, int i2, int i3, int i4, int i5) {
        int i6;
        String str2;
        int i7 = Build.VERSION.SDK_INT;
        if (this.c == null) {
            str2 = "Please call the init method";
        } else {
            Log.d(b, "play new he api applyPatternHeWithString(String patternString, int loop,int interval,int amplitude,int freq)");
            if (i2 >= 1) {
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    boolean zIsNonFFVersionInFramework = Utils.isNonFFVersionInFramework();
                    if (zIsNonFFVersionInFramework) {
                        i6 = 0;
                    } else {
                        int i8 = jSONObject.getJSONObject(Utils.HE_META_DATA_KEY).getInt(Utils.HE_VERSION_KEY);
                        int majorVersion = Utils.getMajorVersion();
                        if (!b(majorVersion, Utils.getMinorVersion(), i8)) {
                            Log.e(b, "rt version check failed, MajorVersion:" + String.format("%x02", Integer.valueOf(majorVersion)) + " heVersion:" + i8);
                            return;
                        }
                        i6 = i8;
                    }
                    if (i6 == 1) {
                        int[] iArrB = b(str);
                        if (iArrB == null) {
                            Log.e(b, "serialize he failed!! ,heVersion:" + i6);
                            return;
                        }
                        int length = iArrB.length;
                        try {
                            if (i7 < 26) {
                                Log.e(b, "The system is low than 26,does not support rt!!");
                                return;
                            }
                            Class<?> cls = this.e;
                            Class<?> cls2 = Integer.TYPE;
                            Method method = cls.getMethod("createPatternHeWithParam", int[].class, cls2, cls2, cls2, cls2);
                            if (!zIsNonFFVersionInFramework) {
                                int[] iArr = new int[length + 1];
                                iArr[0] = i6;
                                System.arraycopy(iArrB, 0, iArr, 1, iArrB.length);
                                iArrB = iArr;
                            }
                            this.c.vibrate((VibrationEffect) method.invoke(null, iArrB, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)));
                            return;
                        } catch (Exception e) {
                            e.printStackTrace();
                            Log.w(b, "for createPatternHe, The system doesn't integrate rt software");
                            return;
                        }
                    }
                    if (i6 != 2) {
                        Log.e(b, "unsupport he version heVersion:" + i6);
                        return;
                    }
                    e[] eVarArrC = c(str);
                    if (eVarArrC != null && eVarArrC.length != 0) {
                        int[] iArrA = a(2, i6, eVarArrC.length, Process.myPid(), a.getAndIncrement(), 0, eVarArrC);
                        try {
                            if (i7 >= 26) {
                                Class<?> cls3 = this.e;
                                Class<?> cls4 = Integer.TYPE;
                                this.c.vibrate((VibrationEffect) cls3.getMethod("createPatternHeWithParam", int[].class, cls4, cls4, cls4, cls4).invoke(null, iArrA, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)));
                            } else {
                                Log.e(b, "The system is low than 26,does not support rt!!");
                            }
                            return;
                        } catch (Exception e2) {
                            e2.printStackTrace();
                            Log.w(b, "for createPatternHe, The system doesn't integrate rt software");
                            return;
                        }
                    }
                    Log.e(b, "serialize he failed!!, heVersion:" + i6);
                    return;
                } catch (Exception e3) {
                    e3.printStackTrace();
                    return;
                }
                e3.printStackTrace();
                return;
            }
            str2 = "The minimum count of loop pattern is 1";
        }
        Log.e(b, str2);
    }

    int[] a(int i2, int i3, int i4, int i5, int i6, int i7, e[] eVarArr) {
        int iB = 0;
        for (e eVar : eVarArr) {
            iB += eVar.b();
        }
        int length = 5;
        int[] iArr = new int[iB + 5];
        Arrays.fill(iArr, 0);
        iArr[0] = i2;
        iArr[1] = i3;
        iArr[2] = i5;
        iArr[3] = i6;
        iArr[4] = (i4 & 65535) | iArr[4];
        iArr[4] = ((eVarArr.length << 16) & (-65536)) | iArr[4];
        for (e eVar2 : eVarArr) {
            int[] iArrA = eVar2.a(i7);
            System.arraycopy(iArrA, 0, iArr, length, iArrA.length);
            length += iArrA.length;
            i7++;
        }
        return iArr;
    }

    @Override // com.appff.haptic.base.d
    public void b(int i2) {
        a(i2, -1, -1);
    }

    @Override // com.appff.haptic.base.d
    public void b(int i2, int i3) {
        int[] iArrA = new g(Utils.TRANSIENT_EVENT, 0, 0, i2, i3).a();
        try {
            if (Build.VERSION.SDK_INT >= 26) {
                Class<?> cls = this.e;
                Class<?> cls2 = Integer.TYPE;
                this.c.vibrate((VibrationEffect) cls.getMethod("createPatternHeWithParam", int[].class, cls2, cls2, cls2, cls2).invoke(null, iArrA, 1, 0, Integer.valueOf(Utils.MAX_STRENGTH_VALUE), 0));
            } else {
                Log.e(b, "The system is low than 26,does not support rt!!");
            }
        } catch (Exception e) {
            e.printStackTrace();
            Log.w(b, "The system doesn't integrate rt software");
        }
    }

    @Override // com.appff.haptic.base.d
    public void b(File file, int i2, int i3, int i4, int i5) {
        if (Utils.validatePath(file.getPath(), Utils.SUFFIX_HE)) {
            Log.d(b, "looper:" + i2 + " interval:" + i3 + " amplitude:" + i4 + " freq:" + i5);
            StringBuilder sb = new StringBuilder();
            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
                while (true) {
                    String line = bufferedReader.readLine();
                    if (line == null) {
                        break;
                    } else {
                        sb.append(line);
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            b(sb.toString(), i2, i3, i4, i5);
        }
    }

    @Override // com.appff.haptic.base.d
    public void b(String str, int i2, int i3, int i4, int i5) {
        int i6;
        long[] jArr;
        int[] iArr;
        String str2;
        if (this.c == null) {
            str2 = "Please call the init method";
        } else {
            Log.d(b, "play new he api, applyPatternHeWithStringOn No FF");
            if (i2 >= 1) {
                try {
                    JSONArray jSONArray = new JSONObject(str).getJSONArray(Utils.PATTERN_KEY_PATTERN);
                    int iMin = Math.min(jSONArray.length(), 16);
                    int i7 = iMin * 2;
                    long[] jArr2 = new long[i7];
                    int[] iArr2 = new int[i7];
                    Arrays.fill(iArr2, 0);
                    int i8 = 0;
                    int i9 = 0;
                    int i10 = 0;
                    while (true) {
                        if (i8 >= iMin) {
                            i6 = i7;
                            jArr = jArr2;
                            break;
                        }
                        JSONObject jSONObject = jSONArray.getJSONObject(i8).getJSONObject(Utils.EVENT_KEY_EVENT);
                        String string = jSONObject.getString(Utils.EVENT_KEY_HE_TYPE);
                        JSONArray jSONArray2 = jSONArray;
                        int i11 = iMin;
                        if (!TextUtils.equals(Utils.EVENT_TYPE_HE_CONTINUOUS_NAME, string)) {
                            i6 = i7;
                            jArr = jArr2;
                            if (!TextUtils.equals(Utils.EVENT_TYPE_HE_TRANSIENT_NAME, string)) {
                                Log.e(b, "haven't get type value");
                                break;
                            }
                            int i12 = i8 * 2;
                            jArr[i12] = (jSONObject.getInt(Utils.EVENT_KEY_RELATIVE_TIME) - i9) - i10;
                            if (jArr[i12] < 0) {
                                jArr[i12] = 50;
                            }
                            iArr2[i12] = 0;
                            JSONObject jSONObject2 = jSONObject.getJSONObject(Utils.EVENT_KEY_HE_PARAMETERS);
                            int i13 = jSONObject2.getInt(Utils.EVENT_KEY_HE_INTENSITY);
                            int iA = com.appff.haptic.base.d.a(i13, jSONObject2.getInt(Utils.EVENT_KEY_HE_FREQUENCY));
                            int i14 = i12 + 1;
                            jArr[i14] = iA;
                            double d = i4;
                            Double.isNaN(d);
                            iArr = iArr2;
                            double d2 = i13;
                            Double.isNaN(d2);
                            iArr[i14] = Math.max(1, Math.min((int) (((d * 1.0d) * d2) / 100.0d), Utils.MAX_STRENGTH_VALUE));
                            i10 = iA;
                            i9 = jSONObject.getInt(Utils.EVENT_KEY_RELATIVE_TIME);
                        } else {
                            int i15 = i8 * 2;
                            jArr2[i15] = (jSONObject.getInt(Utils.EVENT_KEY_RELATIVE_TIME) - i9) - i10;
                            if (jArr2[i15] < 0) {
                                jArr2[i15] = 50;
                            }
                            iArr2[i15] = 0;
                            int i16 = jSONObject.getInt(Utils.EVENT_KEY_DURATION);
                            if (i16 > 50 && i16 < 100) {
                                i16 = 50;
                            } else if (i16 > 100) {
                                i16 -= 50;
                            }
                            int i17 = i15 + 1;
                            i6 = i7;
                            jArr2[i17] = i16;
                            JSONObject jSONObject3 = jSONObject.getJSONObject(Utils.EVENT_KEY_HE_PARAMETERS);
                            JSONArray jSONArray3 = jSONObject3.getJSONArray(Utils.EVENT_KEY_HE_CURVE);
                            int i18 = i16;
                            jArr = jArr2;
                            int iMax = Math.max(Math.min((int) (jSONArray3.getJSONObject(1).getDouble(Utils.EVENT_KEY_HE_INTENSITY) * 255.0d), Utils.MAX_STRENGTH_VALUE), Math.min((int) (jSONArray3.getJSONObject(2).getDouble(Utils.EVENT_KEY_HE_INTENSITY) * 255.0d), Utils.MAX_STRENGTH_VALUE));
                            int i19 = jSONObject3.getInt(Utils.EVENT_KEY_HE_INTENSITY);
                            int i20 = jSONObject3.getInt(Utils.EVENT_KEY_HE_FREQUENCY);
                            double d3 = i19;
                            Double.isNaN(d3);
                            double d4 = iMax;
                            Double.isNaN(d4);
                            double d5 = d4 * (d3 / 100.0d);
                            double d6 = i4;
                            Double.isNaN(d6);
                            int iMax2 = Math.max(1, (int) ((d5 * d6) / 255.0d));
                            if (i20 < 30) {
                                iMax2 = 0;
                            }
                            iArr2[i17] = iMax2;
                            i9 = jSONObject.getInt(Utils.EVENT_KEY_RELATIVE_TIME);
                            iArr = iArr2;
                            i10 = i18;
                        }
                        i8++;
                        jSONArray = jSONArray2;
                        iArr2 = iArr;
                        i7 = i6;
                        iMin = i11;
                        jArr2 = jArr;
                    }
                    Log.d(b, "times:" + Arrays.toString(jArr));
                    int i21 = i6;
                    int i22 = 0;
                    for (int i23 = 0; i23 < i21; i23++) {
                        i22 = (int) (((long) i22) + jArr[i23]);
                    }
                    if (i22 > 30000) {
                        Log.e(b, "Pattern's duration is less than 30000");
                        return;
                    } else if (Build.VERSION.SDK_INT >= 26) {
                        this.c.vibrate(VibrationEffect.createWaveform(jArr, iArr2, -1));
                        return;
                    } else {
                        this.c.vibrate(jArr, -1);
                        return;
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                    return;
                }
            }
            str2 = "The minimum count of loop pattern is 1";
        }
        Log.e(b, str2);
    }

    @Override // com.appff.haptic.base.d
    public void c(int i2) {
        a(-1, i2, -1);
    }
}
