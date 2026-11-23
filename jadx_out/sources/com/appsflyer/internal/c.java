package com.appsflyer.internal;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PixelFormat;
import android.hardware.SensorManager;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.PhoneNumberUtils;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.webkit.URLUtil;
import android.widget.ExpandableListView;
import com.appsflyer.AFLogger;
import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
final class c {
    private static char[] AFInAppEventParameterName = {24, 28, 'M', 'a', 'J', '4', 'L', 'N', '7', '2', 'J', 'c', 'c', 'c', 'a', 'a', 'I', '1', '0', '1', 'L', 'K', '5', 'N', 'J', '2', 'L', 'L', 'L', 'L', 'M', 'M', '3', 'Z', 187, 189, 191, 196, 192, 186, 157, 162, 197, 164, 140, 165, 190, 200, 192, 191, 201, 183, 171, 187, 187, 184, 186, 191, '@', 133, 128, 'p', 'q', '~', 137, 140, 'p', 'M', 'f', 135, 'd', '_', '|', 130, 134, 129, 127, '}', 26, 'L', '9', 'm', 'f', 'j', 'n', 'p', 'Q', 'N', 'l', 'K', 'G', 'k', 'k', 'e', 206, 208, 137, 216, 221, 137, 205, 206, 213, 210, 202, 175, 137, 163, 215, 216, 210, 221, 217, 206, 204, 225, 206, 137, 209, 221, 210, 224, 137, 209, 221, 202, 217, 137, 206, 209, 204, 202, 204, 137, 221};
    private static long AFInAppEventType = 9088409587802389276L;
    private static int valueOf = 0;
    private static int values = 1;

    static class d extends HashMap<String, Object> {
        private static int AFVersionDeclaration = 1;
        private static int getLevel;
        private final Context AFKeystoreWrapper;
        private final Map<String, Object> values;
        private static char[] AFInAppEventType = {45871, 57605, 5963, 17853, 64403, 10690, 24101, 35846, 8786, 20666, 34529, 13521, 54318, 34306, 28773, 8869, 40070, 20160, 14624, 60191, 15890, 27697, 39493, 58167, 45333, 18297, 5541, 43921, 31228, 3646, 56351, 29271, 167, 55035, 25850, 14636, 53100, 40258, 38571, 50334, 13043, 24628, 56857, 5831, 17641, 45725, 57415, 24176, 35873, 64411, 10667, 34809, 62720, 8963, 37235, 52360, 14986, 26849, 50742, 13380, 25184, 'b', '&', 21086, '&', 21085};
        private static long valueOf = -6884389957348077011L;
        private static int[] AFInAppEventParameterName = {264022428, -820998946, -1835969172, 545826097, 1791829078, 35725697, -876159950, -884180872, 791409275, -2126541223, 1035454124, -679804399, -620917022, 1978309802, 824869615, -147598075, -461163612, -436180871};

        public static class b {
            public final Boolean AFKeystoreWrapper;
            Boolean valueOf;
            public final String values;

            b() {
            }

            b(String str, Boolean bool) {
                this.values = str;
                this.AFKeystoreWrapper = bool;
            }

            static byte[] AFInAppEventParameterName(byte[] bArr) {
                for (int i2 = 0; i2 < bArr.length; i2++) {
                    bArr[i2] = (byte) (bArr[i2] ^ ((i2 % 2) + 42));
                }
                return bArr;
            }

            static String AFInAppEventType(byte[] bArr) {
                StringBuilder sb = new StringBuilder();
                for (byte b : bArr) {
                    String hexString = Integer.toHexString(b);
                    if (hexString.length() == 1) {
                        hexString = "0".concat(String.valueOf(hexString));
                    }
                    sb.append(hexString);
                }
                return sb.toString();
            }

            static byte[] AFInAppEventType(String str) {
                return str.getBytes();
            }
        }

        d(Map<String, Object> map, Context context) {
            this.values = map;
            this.AFKeystoreWrapper = context;
            put(AFKeystoreWrapper(), AFInAppEventParameterName());
        }

        /* JADX WARN: Code duplicated, block: B:27:0x0261  */
        private String AFInAppEventParameterName() {
            String string;
            int i2;
            try {
                String string2 = this.values.get(AFInAppEventParameterName(TextUtils.getTrimmedLength(""), (char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 45903), 12 - ExpandableListView.getPackedPositionType(0L)).intern()).toString();
                String string3 = this.values.get(AFInAppEventParameterName(24 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (char) (58193 - View.MeasureSpec.makeMeasureSpec(0, 0)), 15 - (ViewConfiguration.getLongPressTimeout() >> 16)).intern()).toString();
                String strReplaceAll = AFInAppEventParameterName(38 - View.MeasureSpec.getSize(0), (char) (38557 - ExpandableListView.getPackedPositionType(0L)), 5 - ((Process.getThreadPriority(0) + 20) >> 6)).intern().replaceAll(values(new int[]{554720026, 810846395, -1353340409, 1995249900}, TextUtils.indexOf((CharSequence) "", '0', 0) + 6).intern(), "");
                StringBuilder sb = new StringBuilder();
                sb.append(string2);
                sb.append(string3);
                sb.append(strReplaceAll);
                String strAFInAppEventParameterName = ah.AFInAppEventParameterName(sb.toString());
                StringBuilder sb2 = new StringBuilder();
                sb2.append("");
                sb2.append(strAFInAppEventParameterName.substring(0, 16));
                string = sb2.toString();
            } catch (Exception e) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(values(new int[]{640847658, -233831226, 620669702, -1347693514, 1083507952, -1102549683, -450369102, -1732957970, 393969182, 886873569, -1952655995, 1892296752, 1890815725, -1673734706, 1444084348, -987179240, 1094281385, 992383361, 17585538, 973864474, -432527319, -1739858274}, TextUtils.lastIndexOf("", '0') + 45).intern());
                sb3.append(e);
                AFLogger.AFInAppEventParameterName(sb3.toString());
                StringBuilder sb4 = new StringBuilder();
                sb4.append("");
                sb4.append(AFInAppEventParameterName(42 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (char) (5797 - (ViewConfiguration.getDoubleTapTimeout() >> 16)), AndroidCharacter.getMirror('0') - 30).intern());
                string = sb4.toString();
            }
            String str = string;
            try {
                Intent intentRegisterReceiver = this.AFKeystoreWrapper.registerReceiver(null, new IntentFilter(values(new int[]{-248593871, 418937694, 1034627370, 175927361, -56373222, 1046364932, 687343027, -368521510, 1427030466, 1568180991, -741401460, -1800867994, 1331349556, 1216887738, -1608381182, -1947019990, 948188064, 1315957742, -1365079188, 1790179928}, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 37).intern()));
                int intExtra = -2700;
                if (intentRegisterReceiver != null) {
                    intExtra = intentRegisterReceiver.getIntExtra(values(new int[]{998518318, -1660110958, -513052711, 611993354, 508697840, 1938850892}, PhoneNumberUtils.toaFromString("") - 118).intern(), -2700);
                } else {
                    int i3 = getLevel + 121;
                    AFVersionDeclaration = i3 % 128;
                    int i4 = i3 % 2;
                }
                String str2 = this.AFKeystoreWrapper.getApplicationInfo().nativeLibraryDir;
                if (str2 == null) {
                    i2 = 0;
                } else {
                    if (str2.contains(values(new int[]{-1675036583, 1271474483}, 2 - ImageFormat.getBitsPerPixel(0)).intern())) {
                        int i5 = getLevel + 61;
                        AFVersionDeclaration = i5 % 128;
                        if ((i5 % 2 == 0 ? 'L' : (char) 16) != 16) {
                            i2 = 0;
                        } else {
                            i2 = 1;
                        }
                    } else {
                        i2 = 0;
                    }
                }
                int size = ((SensorManager) this.AFKeystoreWrapper.getSystemService(values(new int[]{-2108098182, 924452591, -880754948, 1430040891}, 6 - (ViewConfiguration.getScrollBarFadeDuration() >> 16)).intern())).getSensorList(-1).size();
                StringBuilder sb5 = new StringBuilder();
                sb5.append(AFInAppEventParameterName(TextUtils.getCapsMode("", 0, 0) + 61, (char) (ViewConfiguration.getTapTimeout() >> 16), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 1).intern());
                sb5.append(intExtra);
                sb5.append(values(new int[]{1802121942, -851730084}, KeyEvent.getDeadChar(0, 0) + 2).intern());
                sb5.append(i2);
                sb5.append(AFInAppEventParameterName((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 61, (char) TextUtils.getCapsMode("", 0, 0), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 1).intern());
                sb5.append(size);
                sb5.append(AFInAppEventParameterName(Color.blue(0) + 64, (char) TextUtils.getCapsMode("", 0, 0), 6 - AndroidCharacter.getEastAsianWidth('0')).intern());
                sb5.append(this.values.size());
                String string4 = sb5.toString();
                StringBuilder sb6 = new StringBuilder();
                sb6.append(str);
                sb6.append(b.AFInAppEventType(b.AFInAppEventParameterName(b.AFInAppEventType(string4))));
                return sb6.toString();
            } catch (Exception e2) {
                StringBuilder sb7 = new StringBuilder();
                sb7.append(values(new int[]{640847658, -233831226, 620669702, -1347693514, 1083507952, -1102549683, -450369102, -1732957970, 393969182, 886873569, -1952655995, 1892296752, 1890815725, -1673734706, 1444084348, -987179240, 1094281385, 992383361, 17585538, 973864474, -432527319, -1739858274}, 44 - (ViewConfiguration.getTapTimeout() >> 16)).intern());
                sb7.append(e2);
                AFLogger.AFInAppEventParameterName(sb7.toString());
                StringBuilder sb8 = new StringBuilder();
                sb8.append(str);
                sb8.append(values(new int[]{-828854563, 475996213, 640677171, -1604617094, -1550728992, -1021112346, 2006942107, 297401137}, TextUtils.getCapsMode("", 0, 0) + 16).intern());
                return sb8.toString();
            }
        }

        private static String AFInAppEventParameterName(int i2, char c, int i3) {
            int i4 = AFVersionDeclaration + 27;
            getLevel = i4 % 128;
            if (i4 % 2 != 0) {
            }
            char[] cArr = new char[i3];
            int i5 = 0;
            while (true) {
                if (!(i5 < i3)) {
                    return new String(cArr);
                }
                int i6 = AFVersionDeclaration + 63;
                getLevel = i6 % 128;
                if (i6 % 2 != 0) {
                    cArr[i5] = (char) ((((long) AFInAppEventType[i2 << i5]) ^ (((long) i5) | valueOf)) * ((long) c));
                    i5 += 126;
                } else {
                    cArr[i5] = (char) ((((long) AFInAppEventType[i2 + i5]) ^ (((long) i5) * valueOf)) ^ ((long) c));
                    i5++;
                }
            }
        }

        private static StringBuilder AFInAppEventType(String... strArr) {
            ArrayList arrayList = new ArrayList();
            int i2 = 0;
            while (true) {
                if (!(i2 < 3)) {
                    break;
                }
                arrayList.add(Integer.valueOf(strArr[i2].length()));
                i2++;
            }
            Collections.sort(arrayList);
            int iIntValue = ((Integer) arrayList.get(0)).intValue();
            StringBuilder sb = new StringBuilder();
            int i3 = getLevel + 9;
            AFVersionDeclaration = i3 % 128;
            int i4 = i3 % 2;
            int i5 = 0;
            while (true) {
                if ((i5 < iIntValue ? 'Q' : 'M') == 'M') {
                    return sb;
                }
                int i6 = AFVersionDeclaration + 75;
                getLevel = i6 % 128;
                int i7 = i6 % 2;
                Integer numValueOf = null;
                for (int i8 = 0; i8 < 3; i8++) {
                    int iCharAt = strArr[i8].charAt(i5);
                    if (numValueOf == null) {
                        int i9 = AFVersionDeclaration + 25;
                        getLevel = i9 % 128;
                        int i10 = i9 % 2;
                    } else {
                        iCharAt ^= numValueOf.intValue();
                    }
                    numValueOf = Integer.valueOf(iCharAt);
                }
                sb.append(Integer.toHexString(numValueOf.intValue()));
                i5++;
            }
        }

        private String AFKeystoreWrapper() {
            try {
                String string = Integer.toString(Build.VERSION.SDK_INT);
                String string2 = this.values.get(AFInAppEventParameterName((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) (TextUtils.lastIndexOf("", '0', 0) + 45903), 11 - ExpandableListView.getPackedPositionChild(0L)).intern()).toString();
                String string3 = this.values.get(values(new int[]{-1400612638, 722893263, 1201510708, 1839577259}, Color.red(0) + 5).intern()).toString();
                if (string3 == null) {
                    int i2 = getLevel + 111;
                    AFVersionDeclaration = i2 % 128;
                    int i3 = i2 % 2;
                    string3 = AFInAppEventParameterName(12 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) (54368 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)), 8 - (ViewConfiguration.getScrollDefaultDelay() >> 16)).intern();
                }
                StringBuilder sb = new StringBuilder(string2);
                sb.reverse();
                StringBuilder sbAFInAppEventType = AFInAppEventType(string, string3, sb.toString());
                int length = sbAFInAppEventType.length();
                if ((length > 4 ? (char) 31 : 'S') != 31) {
                    while (true) {
                        if ((length < 4 ? (char) 14 : (char) 25) != 14) {
                            break;
                        }
                        length++;
                        sbAFInAppEventType.append('1');
                    }
                } else {
                    int i4 = getLevel + 63;
                    AFVersionDeclaration = i4 % 128;
                    if (i4 % 2 == 0) {
                        sbAFInAppEventType.delete(5, length);
                    } else {
                        sbAFInAppEventType.delete(4, length);
                    }
                }
                sbAFInAppEventType.insert(0, AFInAppEventParameterName((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 19, (char) (TextUtils.indexOf("", "", 0) + 15993), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 2).intern());
                return sbAFInAppEventType.toString();
            } catch (Exception e) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(values(new int[]{640847658, -233831226, 620669702, -1347693514, 1083507952, -1102549683, -450369102, -1732957970, 393969182, 886873569, -1907198063, -659358675, -1220524838, -426323891, 726030888, -1625741836, 826016106, -853521743, -1716907684, 603768842, 752977807, -1933892853}, View.getDefaultSize(0, 0) + 42).intern());
                sb2.append(e);
                AFLogger.AFInAppEventParameterName(sb2.toString());
                return values(new int[]{180447687, -652056002, 277827748, -169691734}, (ViewConfiguration.getDoubleTapTimeout() >> 16) + 7).intern();
            }
        }

        private static String values(int[] iArr, int i2) {
            int i3 = getLevel + 29;
            AFVersionDeclaration = i3 % 128;
            int i4 = i3 % 2;
            char[] cArr = new char[4];
            char[] cArr2 = new char[iArr.length << 1];
            int[] iArr2 = (int[]) AFInAppEventParameterName.clone();
            int i5 = AFVersionDeclaration + 1;
            getLevel = i5 % 128;
            int i6 = i5 % 2;
            int i7 = 0;
            while (true) {
                if (i7 >= iArr.length) {
                    return new String(cArr2, 0, i2);
                }
                int i8 = getLevel + 5;
                AFVersionDeclaration = i8 % 128;
                int i9 = i8 % 2;
                cArr[0] = (char) (iArr[i7] >> 16);
                cArr[1] = (char) iArr[i7];
                int i10 = i7 + 1;
                cArr[2] = (char) (iArr[i10] >> 16);
                cArr[3] = (char) iArr[i10];
                cu.values(cArr, iArr2, false);
                int i11 = i7 << 1;
                cArr2[i11] = cArr[0];
                cArr2[i11 + 1] = cArr[1];
                cArr2[i11 + 2] = cArr[2];
                cArr2[i11 + 3] = cArr[3];
                i7 += 2;
            }
        }
    }

    c() {
    }

    private static String AFInAppEventParameterName(Context context) {
        int i2 = values + 33;
        valueOf = i2 % 128;
        try {
            String str = (i2 % 2 != 0 ? context.getPackageManager().getPackageInfo(context.getPackageName(), 1) : context.getPackageManager().getPackageInfo(context.getPackageName(), 0)).packageName;
            int i3 = values + 55;
            valueOf = i3 % 128;
            int i4 = i3 % 2;
            return str;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    private static boolean AFInAppEventParameterName(String str) {
        int i2 = valueOf + 17;
        values = i2 % 128;
        int i3 = i2 % 2;
        try {
            Class.forName(str);
            int i4 = valueOf + 53;
            values = i4 % 128;
            if ((i4 % 2 == 0 ? '\'' : ' ') != '\'') {
                return true;
            }
            Object[] objArr = null;
            int length = objArr.length;
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    private static String AFInAppEventType(Context context) {
        String str = null;
        if (System.getProperties().containsKey(valueOf("\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001", new int[]{80, 14, 0, 0}, URLUtil.isJavaScriptUrl("javascript:")).intern())) {
            try {
                Matcher matcher = Pattern.compile(values("獬穏獂䅹镹\ue36e\uef30齁常曟\uf7f9쏒ꮈ劬").intern()).matcher(context.getCacheDir().getPath().replace(values("潨씤潇﹛煋ܒ헨荟擟\ud9b2").intern(), ""));
                if ((matcher.find() ? 'I' : '9') != '9') {
                    int i2 = valueOf + 95;
                    values = i2 % 128;
                    String strGroup = i2 % 2 == 0 ? matcher.group(0) : matcher.group(1);
                    int i3 = values + 93;
                    valueOf = i3 % 128;
                    int i4 = i3 % 2;
                    str = strGroup;
                }
            } catch (Exception e) {
                aj ajVarAFInAppEventParameterName = aj.AFInAppEventParameterName();
                String strIntern = values("쭱」쬲\u0b79胩\uf6b4蜒✩㘥Ⲇ\ue234ꮌ᎗\u18fd쾒뱴ฒୡ묈䃮窜").intern();
                StringBuilder sb = new StringBuilder();
                sb.append(valueOf(null, new int[]{94, 41, 105, 12}, TextUtils.regionMatches("", 0, "", 0, 0)).intern());
                sb.append(e);
                ajVarAFInAppEventParameterName.AFInAppEventType(null, strIntern, sb.toString());
                return null;
            }
        }
        int i5 = values + 121;
        valueOf = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    static String AFKeystoreWrapper(Context context, long j2) {
        String strValues;
        String strIntern;
        String strValues2;
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        StringBuilder sb3 = new StringBuilder();
        if (!(!AFInAppEventParameterName(values("㎆䌿㏧硍ᄅ杙ﮄ\udff8䪢徨珉흈\ueb73比幱샳\uf6c7硉⫢㱨艞钿㚩⧓궻ꅤԝՎ뤨붟ᆤ焛䒖쨏ﰬ抡倂\ue6a3").intern()))) {
            int i2 = values + 91;
            valueOf = i2 % 128;
            int i3 = i2 % 2;
            strValues = valueOf("\u0001", new int[]{0, 1, 0, 0}, !PhoneNumberUtils.isNonSeparator('0'));
        } else {
            strValues = values("迻迋䟅િꌖ");
        }
        sb2.append(strValues.intern());
        StringBuilder sb4 = new StringBuilder();
        String packageName = context.getPackageName();
        String strValueOf = valueOf(packageName);
        sb2.append(valueOf("\u0001", new int[]{0, 1, 0, 0}, PhoneNumberUtils.isGlobalPhoneNumber("")).intern());
        sb4.append(strValueOf);
        sb2.append((!(AFInAppEventType(context) != null) ? values("迻迋䟅િꌖ") : valueOf("\u0001", new int[]{0, 1, 0, 0}, !TextUtils.isEmpty(""))).intern());
        sb4.append(packageName);
        String strAFInAppEventParameterName = AFInAppEventParameterName(context);
        if (strAFInAppEventParameterName == null) {
            int i4 = values + 31;
            valueOf = i4 % 128;
            if (i4 % 2 != 0) {
                sb2.append(values("迻迋䟅િꌖ").intern());
                sb4.append(packageName);
                int i5 = 33 / 0;
            } else {
                sb2.append(values("迻迋䟅િꌖ").intern());
                sb4.append(packageName);
            }
        } else {
            sb2.append(valueOf("\u0001", new int[]{0, 1, 0, 0}, !URLUtil.isHttpsUrl("https://")).intern());
            sb4.append(strAFInAppEventParameterName);
        }
        sb4.append(Boolean.TRUE.toString());
        sb.append(sb4.toString());
        try {
            sb.append(new SimpleDateFormat(values("ꏄﻂꎽ얧䋱㒰响俠\ue5e0\ue266—砉笹혿බ澜暥얦礔錷ሎ⤡").intern(), Locale.US).format(new Date(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).firstInstallTime)));
            int i6 = valueOf + 57;
            values = i6 % 128;
            int i7 = i6 % 2;
            sb.append(j2);
            if (AFInAppEventParameterName(valueOf("\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0001", new int[]{33, 25, 84, 0}, !TextUtils.isDigitsOnly("")).intern())) {
                int i8 = values + 5;
                valueOf = i8 % 128;
                int i9 = i8 % 2;
                strIntern = valueOf("\u0001", new int[]{0, 1, 0, 0}, !PhoneNumberUtils.isDialable('0')).intern();
                int i10 = values + 1;
                valueOf = i10 % 128;
                int i11 = i10 % 2;
            } else {
                strIntern = values("迻迋䟅િꌖ").intern();
            }
            sb3.append(strIntern);
            sb3.append(((AFInAppEventParameterName(values("ꓽ묋꒜聹욭냱舺䢃㌜Ꞝꑡ껶簔鏤觇륌憻聴ﵗ䗝ᕲ泶\ue130偦㫟奚튷").intern()) ? '0' : '/') != '0' ? values("迻迋䟅િꌖ") : valueOf("\u0001", new int[]{0, 1, 0, 0}, !PhoneNumberUtils.isDialable('0'))).intern());
            sb3.append((AFInAppEventParameterName(valueOf("\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0001", new int[]{58, 20, 22, 0}, URLUtil.isNetworkUrl("http://")).intern()) ? valueOf("\u0001", new int[]{0, 1, 0, 0}, PixelFormat.formatHasAlpha(0)) : values("迻迋䟅િꌖ")).intern());
            if (AFInAppEventParameterName(values("\uf6ee輠\uf68f둒ᨼ池ꘀ᪐ᜦ鎷磰諌⸁\ua7cb啐鴼㎊둌⇝").intern())) {
                int i12 = valueOf + 45;
                values = i12 % 128;
                strValues2 = (i12 % 2 == 0 ? '=' : '2') != '=' ? valueOf("\u0001", new int[]{0, 1, 0, 0}, true ^ URLUtil.isContentUrl("content:")) : valueOf("\u0001", new int[]{0, 1, 0, 0}, URLUtil.isContentUrl("content:"));
            } else {
                strValues2 = values("迻迋䟅િꌖ");
            }
            sb3.append(strValues2.intern());
            String strAFInAppEventType = ah.AFInAppEventType(ah.AFInAppEventParameterName(sb.toString()));
            String string = sb2.toString();
            StringBuilder sb5 = new StringBuilder(strAFInAppEventType);
            sb5.setCharAt(17, Integer.toString(Integer.parseInt(string, 2), 16).charAt(0));
            String string2 = sb5.toString();
            String string3 = sb3.toString();
            StringBuilder sb6 = new StringBuilder(string2);
            sb6.setCharAt(27, Integer.toString(Integer.parseInt(string3, 2), 16).charAt(0));
            return valueOf(sb6.toString(), Long.valueOf(j2));
        } catch (PackageManager.NameNotFoundException unused) {
            return valueOf("\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001", new int[]{1, 32, 0, 15}, TextUtils.isDigitsOnly("")).intern();
        }
    }

    private static String valueOf(String str) {
        int i2 = valueOf + 63;
        values = i2 % 128;
        int i3 = i2 % 2;
        if (!(str.contains(values("ỢỌ剙뭌\ud949").intern()))) {
            int i4 = values + 57;
            valueOf = i4 % 128;
            if ((i4 % 2 != 0 ? '!' : 'D') != '!') {
                return str;
            }
            int i5 = 83 / 0;
            return str;
        }
        String[] strArrSplit = str.split(valueOf("\u0001\u0000", new int[]{78, 2, 7, 1}, !URLUtil.isAboutUrl("about:")).intern());
        int length = strArrSplit.length;
        StringBuilder sb = new StringBuilder();
        int i6 = length - 1;
        sb.append(strArrSplit[i6]);
        sb.append(values("ỢỌ剙뭌\ud949").intern());
        for (int i7 = 1; i7 < i6; i7++) {
            int i8 = values + 45;
            valueOf = i8 % 128;
            int i9 = i8 % 2;
            sb.append(strArrSplit[i7]);
            sb.append(values("ỢỌ剙뭌\ud949").intern());
        }
        sb.append(strArrSplit[0]);
        return sb.toString();
    }

    private static String valueOf(String str, Long l2) {
        if (str == null || l2 == null || str.length() != 32) {
            return valueOf("\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001", new int[]{1, 32, 0, 15}, !Gravity.isVertical(0)).intern();
        }
        StringBuilder sb = new StringBuilder(str);
        String string = l2.toString();
        long numericValue = 0;
        int i2 = 0;
        int numericValue2 = 0;
        while (true) {
            if ((i2 < string.length() ? '_' : 'c') != '_') {
                break;
            }
            numericValue2 += Character.getNumericValue(string.charAt(i2));
            i2++;
            int i3 = valueOf + 5;
            values = i3 % 128;
            int i4 = i3 % 2;
        }
        String hexString = Integer.toHexString(numericValue2);
        sb.replace(7, hexString.length() + 7, hexString);
        for (int i5 = 0; i5 < sb.length(); i5++) {
            numericValue += (long) Character.getNumericValue(sb.charAt(i5));
        }
        while (true) {
            if (!(numericValue > 100)) {
                break;
            }
            int i6 = valueOf + 21;
            values = i6 % 128;
            numericValue = i6 % 2 == 0 ? numericValue - 100 : numericValue % 100;
        }
        sb.insert(23, (int) numericValue);
        if (numericValue < 10) {
            sb.insert(23, values("迻迋䟅િꌖ").intern());
        }
        String string2 = sb.toString();
        int i7 = valueOf + 121;
        values = i7 % 128;
        if (i7 % 2 != 0) {
            return string2;
        }
        Object[] objArr = null;
        int length = objArr.length;
        return string2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v12, types: [byte[]] */
    private static String valueOf(String str, int[] iArr, boolean z) throws UnsupportedEncodingException {
        if (str != 0) {
            str = str.getBytes("ISO-8859-1");
        }
        byte[] bArr = (byte[]) str;
        int i2 = iArr[0];
        int i3 = iArr[1];
        int i4 = iArr[2];
        int i5 = iArr[3];
        char[] cArr = new char[i3];
        System.arraycopy(AFInAppEventParameterName, i2, cArr, 0, i3);
        if ((bArr != null ? (char) 18 : (char) 4) != 4) {
            int i6 = valueOf + 37;
            values = i6 % 128;
            int i7 = i6 % 2;
            char[] cArr2 = new char[i3];
            int i8 = 0;
            char c = 0;
            while (true) {
                if (!(i8 < i3)) {
                    break;
                }
                if (!(bArr[i8] != 1)) {
                    cArr2[i8] = (char) (((cArr[i8] << 1) + 1) - c);
                } else {
                    cArr2[i8] = (char) ((cArr[i8] << 1) - c);
                }
                c = cArr2[i8];
                i8++;
            }
            cArr = cArr2;
        }
        if (i5 > 0) {
            char[] cArr3 = new char[i3];
            System.arraycopy(cArr, 0, cArr3, 0, i3);
            int i9 = i3 - i5;
            System.arraycopy(cArr3, 0, cArr, i9, i5);
            System.arraycopy(cArr3, i5, cArr, 0, i9);
        }
        if (z) {
            char[] cArr4 = new char[i3];
            int i10 = 0;
            while (true) {
                if (!(i10 < i3)) {
                    break;
                }
                int i11 = values + 79;
                valueOf = i11 % 128;
                if (!(i11 % 2 == 0)) {
                    cArr4[i10] = cArr[(i3 % i10) >>> 1];
                    i10 += 5;
                } else {
                    cArr4[i10] = cArr[(i3 - i10) - 1];
                    i10++;
                }
            }
            cArr = cArr4;
        }
        if (i4 > 0) {
            for (int i12 = 0; i12 < i3; i12++) {
                cArr[i12] = (char) (cArr[i12] - iArr[2]);
            }
        }
        return new String(cArr);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001b  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v12, types: [char[]] */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    private static String values(String str) {
        int i2 = values + 89;
        valueOf = i2 % 128;
        ?? r1 = 0;
        ?? r2 = 0;
        if (i2 % 2 != 0) {
            int length = r1.length;
            if (str != 0) {
                str = str.toCharArray();
                int i3 = valueOf + 85;
                values = i3 % 128;
                int i4 = i3 % 2;
            }
        } else if (!(str == 0)) {
            str = str.toCharArray();
            int i5 = valueOf + 85;
            values = i5 % 128;
            int i6 = i5 % 2;
        }
        char[] cArrAFKeystoreWrapper = cr.AFKeystoreWrapper(AFInAppEventType, (char[]) str);
        for (int i7 = 4; i7 < cArrAFKeystoreWrapper.length; i7++) {
            cArrAFKeystoreWrapper[i7] = (char) (((long) (cArrAFKeystoreWrapper[i7] ^ cArrAFKeystoreWrapper[i7 % 4])) ^ (((long) (i7 - 4)) * AFInAppEventType));
        }
        String str2 = new String(cArrAFKeystoreWrapper, 4, cArrAFKeystoreWrapper.length - 4);
        int i8 = values + 7;
        valueOf = i8 % 128;
        if ((i8 % 2 != 0 ? 'M' : (char) 5) != 'M') {
            return str2;
        }
        super.hashCode();
        return str2;
    }
}
