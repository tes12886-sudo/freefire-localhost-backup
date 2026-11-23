package com.dts.freefireth;

import android.app.Activity;
import android.os.Build;
import android.view.DisplayCutout;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public class DisplayCutoutAPI {
    private static final IDisplayCutoutProvider[] DisplayCutoutProviders = {new Android28DisplayCutoutProvider(), new HuaweiDisplayCutoutProvider(), new XiaomiDisplayCutoutProvider(), new OppoDisplayCutoutProvider(), new VivoDisplayCutoutProvider()};
    private static boolean _Debug;

    public static class Android28DisplayCutoutProvider implements IDisplayCutoutProvider {
        @Override // com.dts.freefireth.DisplayCutoutAPI.IDisplayCutoutProvider
        public boolean HasDisplayCutout(Activity activity) {
            DisplayCutout displayCutout;
            try {
                if (Build.VERSION.SDK_INT < 28 || activity == null || activity.getWindow() == null || activity.getWindow().getDecorView() == null || activity.getWindow().getDecorView().getRootWindowInsets() == null || (displayCutout = activity.getWindow().getDecorView().getRootWindowInsets().getDisplayCutout()) == null) {
                    return false;
                }
                DisplayCutoutAPI.LogDebug("@Android28DisplayCutout.HasDisplayCutout(): safe inset top: " + displayCutout.getSafeInsetTop());
                DisplayCutoutAPI.LogDebug("@Android28DisplayCutout.HasDisplayCutout(): safe inset bottom: " + displayCutout.getSafeInsetBottom());
                DisplayCutoutAPI.LogDebug("@Android28DisplayCutout.HasDisplayCutout(): safe inset left: " + displayCutout.getSafeInsetLeft());
                DisplayCutoutAPI.LogDebug("@Android28DisplayCutout.HasDisplayCutout(): safe inset right: " + displayCutout.getSafeInsetRight());
                return displayCutout.getSafeInsetTop() > 0 || displayCutout.getSafeInsetBottom() > 0 || displayCutout.getSafeInsetLeft() > 0 || displayCutout.getSafeInsetRight() > 0;
            } catch (Exception e) {
                DisplayCutoutAPI.LogDebug("@Android28DisplayCutout.HasDisplayCutout(): " + e.getMessage());
                return false;
            }
        }
    }

    public static class HuaweiDisplayCutoutProvider implements IDisplayCutoutProvider {
        @Override // com.dts.freefireth.DisplayCutoutAPI.IDisplayCutoutProvider
        public boolean HasDisplayCutout(Activity activity) {
            try {
                Class<?> clsLoadClass = activity.getClassLoader().loadClass("com.huawei.android.util.HwNotchSizeUtil");
                return ((Boolean) clsLoadClass.getMethod("hasNotchInScreen", new Class[0]).invoke(clsLoadClass, new Object[0])).booleanValue();
            } catch (Exception e) {
                DisplayCutoutAPI.LogDebug("@HuaweiDisplayCutout.HasDisplayCutout(): " + e.getMessage());
                return false;
            }
        }
    }

    public interface IDisplayCutoutProvider {
        boolean HasDisplayCutout(Activity activity);
    }

    public static class OppoDisplayCutoutProvider implements IDisplayCutoutProvider {
        @Override // com.dts.freefireth.DisplayCutoutAPI.IDisplayCutoutProvider
        public boolean HasDisplayCutout(Activity activity) {
            String strSystemPropertiesGetString;
            try {
                return activity.getPackageManager().hasSystemFeature("com.oppo.feature.screen.heteromorphism") && (strSystemPropertiesGetString = DisplayCutoutAPI.SystemPropertiesGetString("ro.oppo.screen.heteromorphism", null)) != null && strSystemPropertiesGetString.length() > 0;
            } catch (Exception e) {
                DisplayCutoutAPI.LogDebug("@OppoDisplayCutout.HasDisplayCutout(): " + e.getMessage());
                return false;
            }
        }
    }

    public static class VivoDisplayCutoutProvider implements IDisplayCutoutProvider {
        @Override // com.dts.freefireth.DisplayCutoutAPI.IDisplayCutoutProvider
        public boolean HasDisplayCutout(Activity activity) {
            try {
                Class<?> clsLoadClass = activity.getClassLoader().loadClass("android.util.FtFeature");
                if (clsLoadClass == null) {
                    return false;
                }
                for (Method method : clsLoadClass.getDeclaredMethods()) {
                    if (method.getName().equalsIgnoreCase("isFeatureSupport")) {
                        return ((Boolean) method.invoke(clsLoadClass, 32)).booleanValue();
                    }
                }
                return false;
            } catch (Exception e) {
                DisplayCutoutAPI.LogDebug("@VivoDisplayCutout.HasDisplayCutout(): " + e.getMessage());
                return false;
            }
        }
    }

    public static class XiaomiDisplayCutoutProvider implements IDisplayCutoutProvider {
        @Override // com.dts.freefireth.DisplayCutoutAPI.IDisplayCutoutProvider
        public boolean HasDisplayCutout(Activity activity) {
            try {
                return 1 == DisplayCutoutAPI.SystemPropertiesGetInt("ro.miui.notch", 0);
            } catch (Exception e) {
                DisplayCutoutAPI.LogDebug("@XiaomiDisplayCutout.HasDisplayCutout(): " + e.getMessage());
                return false;
            }
        }
    }

    public static boolean HasDisplayCutout() {
        if (FFAPI.MainActivity == null) {
            return false;
        }
        for (IDisplayCutoutProvider iDisplayCutoutProvider : DisplayCutoutProviders) {
            if (iDisplayCutoutProvider.HasDisplayCutout(FFAPI.MainActivity)) {
                return true;
            }
        }
        return false;
    }

    public static void LogDebug(String str) {
        if (_Debug) {
            FFAPI.nativeLog(str);
        }
    }

    public static void SetDebug(boolean z) {
        _Debug = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int SystemPropertiesGetInt(String str, int i2) {
        try {
            return ((Integer) Class.forName("android.os.SystemProperties").getMethod("getInt", String.class, Integer.TYPE).invoke(null, str, Integer.valueOf(i2))).intValue();
        } catch (Exception e) {
            LogDebug("@DisplayCutoutAPI.SystemPropertiesGetInt(): " + e.getMessage());
            return i2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String SystemPropertiesGetString(String str, String str2) {
        try {
            return (String) Class.forName("android.os.SystemProperties").getMethod("get", String.class, Integer.TYPE).invoke(null, str, str2);
        } catch (Exception e) {
            LogDebug("@DisplayCutoutAPI.SystemPropertiesGetString(): " + e.getMessage());
            return str2;
        }
    }
}
