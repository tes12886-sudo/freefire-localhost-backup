package com.appff.haptic.base;

import android.text.TextUtils;
import java.io.File;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public class Utils {
    public static final int ANDROID_VERSIONCODE_O = 26;
    public static final int ANDROID_VERSIONCODE_Q = 29;
    public static final int CONTINUOUS_EVENT = 4096;
    public static final String EVENT_KEY_DURATION = "Duration";
    public static final String EVENT_KEY_EVENT = "Event";
    public static final String EVENT_KEY_HE_CURVE = "Curve";
    public static final String EVENT_KEY_HE_CURVE_POINT_TIME = "Time";
    public static final String EVENT_KEY_HE_FREQUENCY = "Frequency";
    public static final String EVENT_KEY_HE_INTENSITY = "Intensity";
    public static final String EVENT_KEY_HE_PARAMETERS = "Parameters";
    public static final String EVENT_KEY_HE_TYPE = "Type";
    public static final String EVENT_KEY_RELATIVE_TIME = "RelativeTime";
    public static final String EVENT_TYPE_HE_CONTINUOUS_NAME = "continuous";
    public static final String EVENT_TYPE_HE_TRANSIENT_NAME = "transient";
    public static final int FORMAT_VERSION = 2;
    public static final int HE_CURVE_POINT_0_FREQUENCY = 7;
    public static final int HE_CURVE_POINT_0_INTENSITY = 6;
    public static final int HE_CURVE_POINT_0_TIME = 5;
    public static final int HE_DEFAULT_DURATION = 0;
    public static final int HE_DEFAULT_RELATIVE_TIME = 400;
    public static final int HE_DURATION = 4;
    public static final int HE_EVENT_DATA_LEN = 17;
    public static final int HE_FREQUENCY = 3;
    public static final int HE_INTENSITY = 2;
    public static final String HE_META_DATA_KEY = "Metadata";
    public static final int HE_NON_RICH_TAP_DEFAULT_STOP_DURATION = 50;
    public static final int HE_NON_RICH_TAP_TRANSIENT_DEFAULT_DURATION = 65;
    public static final int HE_PRE_BAKED_MAX_AMPLITUDE = 100;
    public static final int HE_PRE_BAKED_MIN_AMPLITUDE = 1;
    public static final int HE_RELATIVE_TIME = 1;
    public static final int HE_TYPE = 0;
    public static final int HE_VALUE_LENGTH = 17;
    public static final String HE_VERSION_KEY = "Version";
    public static final int MAX_DURATION = 30000;
    public static final int MAX_EVENT_COUNT = 16;
    public static final int MAX_SCALE = 100;
    public static final int MAX_STRENGTH_VALUE = 255;
    public static final int MIN_STRENGTH_VALUE = 0;
    public static final String PATTERN_KEY_EVENT_VIB_ID = "Index";
    public static final String PATTERN_KEY_PATTERN = "Pattern";
    public static final String PATTERN_KEY_PATTERN_ABS_TIME = "AbsoluteTime";
    public static final String PATTERN_KEY_PATTERN_DESC = "PatternDesc";
    public static final String PATTERN_KEY_PATTERN_LIST = "PatternList";
    public static final String SUFFIX_HE = ".he";
    public static final int TRANSIENT_EVENT = 4097;
    public static final int VIBRATION_EFFECT_SUPPORT_NO = 2;
    public static final int VIBRATION_EFFECT_SUPPORT_YES = 1;
    private static int mFFMajorVersion;
    private static int mFFMinorVersion;
    private static boolean mIsNonFFVersionInFramework;
    private static int mSeq;

    public static long byteArrayToLong(byte[] bArr) {
        int i2;
        int length = bArr.length;
        if (length == 1) {
            i2 = bArr[0] & 255;
        } else if (length == 2) {
            i2 = (short) ((bArr[0] & 255) | ((bArr[1] & 255) << 8));
        } else {
            if (length != 4) {
                if (length != 8) {
                    return 0L;
                }
                long j2 = bArr[7] & 255;
                long j3 = bArr[6] & 255;
                long j4 = bArr[5] & 255;
                long j5 = bArr[4] & 255;
                long j6 = bArr[3] & 255;
                return ((long) (bArr[0] & 255)) | ((bArr[2] & 255) << 16) | (j6 << 24) | (j2 << 56) | (j3 << 48) | (j4 << 40) | (j5 << 32) | (((long) (bArr[1] & 255)) << 8);
            }
            i2 = (bArr[0] & 255) | ((bArr[3] & 255) << 24) | ((bArr[2] & 255) << 16) | ((bArr[1] & 255) << 8);
        }
        return i2;
    }

    public static boolean checkIfPatternHeFile(File file) {
        return validatePath(file.getPath(), SUFFIX_HE);
    }

    public static boolean fileMatchSuffix(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str.trim())) {
            return false;
        }
        return str.trim().toLowerCase(Locale.getDefault()).endsWith(str2);
    }

    public static int getMajorVersion() {
        return mFFMajorVersion;
    }

    public static int getMinorVersion() {
        return mFFMinorVersion;
    }

    public static String getTransientJsonString(int i2, int i3) {
        return "{\"Metadata\":{\"Created\": \"2021-01-01\",\"Description\": \"Haptic editor design, for getting transient signal\",        \"Version\": 1},\"Pattern\":[{    \"Event\": {    \"Parameters\": {        \"Frequency\": " + i3 + ",\"Intensity\": " + i2 + "    },    \"Type\": \"transient\",    \"RelativeTime\": 0}}]}";
    }

    public static byte[] intToBytes(int i2) {
        return new byte[]{(byte) (i2 & MAX_STRENGTH_VALUE), (byte) ((i2 >> 8) & MAX_STRENGTH_VALUE), (byte) ((i2 >> 16) & MAX_STRENGTH_VALUE), (byte) ((i2 >> 24) & MAX_STRENGTH_VALUE)};
    }

    public static boolean isNonFFVersionInFramework() {
        return mIsNonFFVersionInFramework;
    }

    public static byte[] longToBytes(long j2) {
        return new byte[]{(byte) (j2 & 255), (byte) ((j2 >> 8) & 255), (byte) ((j2 >> 16) & 255), (byte) ((j2 >> 24) & 255), (byte) ((j2 >> 32) & 255), (byte) ((j2 >> 40) & 255), (byte) ((j2 >> 48) & 255), (byte) ((j2 >> 56) & 255)};
    }

    public static int setMajorVersion(int i2) {
        mFFMajorVersion = i2;
        return i2;
    }

    public static int setMinorVersion(int i2) {
        mFFMinorVersion = i2;
        return i2;
    }

    public static void setNonFFVersionInFramework(boolean z) {
        mIsNonFFVersionInFramework = z;
    }

    public static byte[] shortToBytes(short s) {
        return new byte[]{(byte) (s & 255), (byte) ((s >> 8) & MAX_STRENGTH_VALUE)};
    }

    public static boolean validatePath(String str, String str2) {
        if (fileMatchSuffix(str, str2)) {
            return new File(str).exists();
        }
        return false;
    }

    public int[] bytesToInts(byte[] bArr) {
        int length = bArr.length;
        int[] iArr = new int[length % 4 == 0 ? length / 4 : (length / 4) + 1];
        int i2 = 4;
        while (i2 <= length) {
            iArr[(i2 / 4) - 1] = (bArr[i2 - 4] << 24) | ((bArr[i2 - 3] & MAX_STRENGTH_VALUE) << 16) | ((bArr[i2 - 2] & MAX_STRENGTH_VALUE) << 8) | (bArr[i2 - 1] & MAX_STRENGTH_VALUE);
            i2 += 4;
        }
        int i3 = 0;
        while (true) {
            int i4 = (length + 4) - i2;
            if (i3 >= i4) {
                return iArr;
            }
            int i5 = (i2 / 4) - 1;
            if (i3 == 0) {
                iArr[i5] = (bArr[(i2 - 4) + i3] << (((i4 - i3) - 1) * 8)) | iArr[i5];
            } else {
                iArr[i5] = ((bArr[(i2 - 4) + i3] & MAX_STRENGTH_VALUE) << (((i4 - i3) - 1) * 8)) | iArr[i5];
            }
            i3++;
        }
    }
}
