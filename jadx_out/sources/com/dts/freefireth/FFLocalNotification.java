package com.dts.freefireth;

import android.app.AlarmManager;
import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.BitmapFactory;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import androidx.core.app.i;
import androidx.core.app.l;
import com.FF.voiceengine.FFVoiceConst;
import com.dts.freefireth.variant.FreeFireBuildVariant;
import j.d.d.a0.a;
import j.d.d.e;
import j.d.d.s;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class FFLocalNotification {
    public static final String INTENT_EXTRA_LOCAL_NOTIFICATION_INDEX_NAME = "LocalNotificationIndex";
    public static final String INTENT_EXTRA_LOCAL_NOTIFICATION_NAME = "LocalNotification";
    public static final String INTENT_EXTRA_NOTIFY_TYPE = "FreeFireNotifyType";
    public static final String SHARED_PREFERENCE_KEY_LOCAL_NOTIFICATIONS = "LocalNotifications";
    public static final String SHARED_PREFERENCE_KEY_LOCAL_NOTIFICATION_RECORDS = "LocalNotificationRecords";
    public static final String SHARED_PREFERENCE_NAME = "FreeFireSharedPreference";

    public static void _hideAllLocalNotifications(Context context) {
        l.f(context).d();
    }

    public static void _hideLocalNotification(Context context, int i2) {
        l.f(context).b(i2);
    }

    private static HashMap<Integer, _FFLocalNotification> _loadLocalNotifcations(Context context) {
        e eVar = new e();
        String string = context.getSharedPreferences(SHARED_PREFERENCE_NAME, 0).getString(SHARED_PREFERENCE_KEY_LOCAL_NOTIFICATIONS, null);
        HashMap<Integer, _FFLocalNotification> map = new HashMap<>();
        if (string == null) {
            return map;
        }
        try {
            return string.length() > 0 ? (HashMap) eVar.l(string, new a<HashMap<Integer, _FFLocalNotification>>() { // from class: com.dts.freefireth.FFLocalNotification.1
            }.getType()) : map;
        } catch (s | NullPointerException unused) {
            return map;
        }
    }

    private static HashMap<Integer, Integer> _loadLocalNotificationRecords(Context context) {
        e eVar = new e();
        String str_readLocalNotificationRecords = _readLocalNotificationRecords(context);
        if (str_readLocalNotificationRecords == null) {
            return null;
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        if (str_readLocalNotificationRecords == null) {
            return map;
        }
        try {
            return str_readLocalNotificationRecords.length() > 0 ? (HashMap) eVar.l(str_readLocalNotificationRecords, new a<HashMap<Integer, Integer>>() { // from class: com.dts.freefireth.FFLocalNotification.2
            }.getType()) : map;
        } catch (s | NullPointerException unused) {
            return map;
        }
    }

    private static String _readLocalNotificationRecords(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(SHARED_PREFERENCE_NAME, 0);
        if (sharedPreferences == null) {
            return null;
        }
        return sharedPreferences.getString(SHARED_PREFERENCE_KEY_LOCAL_NOTIFICATION_RECORDS, null);
    }

    private static void _recordLocalNotification(Context context, int i2) {
        HashMap<Integer, Integer> map_loadLocalNotificationRecords = _loadLocalNotificationRecords(context);
        if (map_loadLocalNotificationRecords == null) {
            map_loadLocalNotificationRecords = new HashMap<>();
        }
        if (map_loadLocalNotificationRecords.containsKey(Integer.valueOf(i2))) {
            map_loadLocalNotificationRecords.put(Integer.valueOf(i2), Integer.valueOf(map_loadLocalNotificationRecords.get(Integer.valueOf(i2)).intValue() + 1));
        } else {
            map_loadLocalNotificationRecords.put(Integer.valueOf(i2), 1);
        }
        _saveLocalNotificationRecords(context, map_loadLocalNotificationRecords);
    }

    static void _rescheduleAllLocalNotifications(Context context) {
        HashMap<Integer, _FFLocalNotification> map_loadLocalNotifcations = _loadLocalNotifcations(context);
        Iterator<_FFLocalNotification> it = map_loadLocalNotifcations.values().iterator();
        while (it.hasNext()) {
            _scheduleLocalNotification(context, it.next());
        }
        _saveLocalNotifications(context, map_loadLocalNotifcations);
    }

    private static void _saveLocalNotificationRecords(Context context, HashMap<Integer, Integer> map) {
        e eVar = new e();
        context.getSharedPreferences(SHARED_PREFERENCE_NAME, 0).edit().putString(SHARED_PREFERENCE_KEY_LOCAL_NOTIFICATION_RECORDS, map != null ? eVar.t(map) : null).commit();
    }

    static void _saveLocalNotifications(Context context, HashMap<Integer, _FFLocalNotification> map) {
        e eVar = new e();
        SharedPreferences sharedPreferences = context.getSharedPreferences(SHARED_PREFERENCE_NAME, 0);
        sharedPreferences.edit().putString(SHARED_PREFERENCE_KEY_LOCAL_NOTIFICATIONS, eVar.t(map)).commit();
    }

    static void _scheduleLocalNotification(Context context, _FFLocalNotification _fflocalnotification) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        long j2 = _fflocalnotification.time_ms;
        for (int i2 = 0; i2 <= _fflocalnotification.repeat_times; i2++) {
            alarmManager.set(0, j2, PendingIntent.getBroadcast(context, getLocalNotificationRequestCode(_fflocalnotification.notification_id, i2), getLocalNotificationIntent(context, _fflocalnotification, i2), 335544320));
            j2 += (long) _fflocalnotification.repeat_interval_ms;
        }
    }

    public static void _showLocalNotification(Context context, _FFLocalNotification _fflocalnotification) {
        _hideLocalNotification(context, _fflocalnotification.notification_id);
        if (isChannelEnabled(context, _fflocalnotification.channel_id)) {
            l lVarF = l.f(context);
            Intent intent = new Intent(context, (Class<?>) FFMainActivity.class);
            intent.setData(Uri.parse(_fflocalnotification.uri));
            intent.putExtra(INTENT_EXTRA_NOTIFY_TYPE, _fflocalnotification.notify_type);
            PendingIntent activity = PendingIntent.getActivity(context, 0, intent, 201326592);
            i.e eVar = new i.e(context, _fflocalnotification.channel_id);
            eVar.k(_fflocalnotification.title);
            eVar.j(_fflocalnotification.content);
            eVar.i(activity);
            eVar.f(true);
            int i2 = Build.VERSION.SDK_INT;
            if (i2 < 26) {
                Uri uri = Uri.parse("android.resource://" + FreeFireBuildVariant.GetPackageName() + "/" + FFAPI.R(context, "raw", "fflogo"));
                if (i2 >= 21) {
                    eVar.w(uri, 5);
                } else {
                    eVar.v(uri);
                }
            }
            if (i2 >= 23) {
                eVar.o(BitmapFactory.decodeResource(context.getResources(), FFAPI.R_drawable(context, "notify_icon")));
            }
            eVar.u(i2 >= 21 ? FFAPI.R_drawable(context, "small_icon") : FFAPI.R_drawable(context, "notify_icon"));
            _recordLocalNotification(context, _fflocalnotification.notify_type);
            lVarF.k(_fflocalnotification.notification_id, eVar.b());
        }
    }

    static void _unscheduleLocalNotification(Context context, _FFLocalNotification _fflocalnotification) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        for (int i2 = 0; i2 <= _fflocalnotification.repeat_times; i2++) {
            PendingIntent broadcast = PendingIntent.getBroadcast(context, getLocalNotificationRequestCode(_fflocalnotification.notification_id, i2), getLocalNotificationIntent(context, _fflocalnotification, i2), 603979776);
            if (broadcast != null) {
                alarmManager.cancel(broadcast);
            }
        }
    }

    static void _unsheduleAllLocalNotifications(Context context) {
        HashMap<Integer, _FFLocalNotification> map_loadLocalNotifcations = _loadLocalNotifcations(context);
        Iterator<_FFLocalNotification> it = map_loadLocalNotifcations.values().iterator();
        while (it.hasNext()) {
            _unscheduleLocalNotification(context, it.next());
        }
        map_loadLocalNotifcations.clear();
        _saveLocalNotifications(context, map_loadLocalNotifcations);
    }

    public static boolean areNotificationsEnabled() {
        return l.f(FFAPI.MainActivity).a();
    }

    public static void clearAllNotifications() {
        FFMainActivity fFMainActivity = FFAPI.MainActivity;
        if (fFMainActivity != null) {
            l.f(fFMainActivity).d();
        }
    }

    public static void clearLocalNotificationRecords() {
        _saveLocalNotificationRecords(FFAPI.MainActivity, null);
    }

    private static Intent getLocalNotificationIntent(Context context, _FFLocalNotification _fflocalnotification, int i2) {
        Intent intent = new Intent(FFBroadcastReceiver.ACTION_LOCAL_NOTIFICATION);
        intent.setClass(context, FFBroadcastReceiver.class);
        Bundle bundle = new Bundle();
        bundle.putParcelable(INTENT_EXTRA_LOCAL_NOTIFICATION_NAME, _fflocalnotification);
        intent.putExtra(INTENT_EXTRA_LOCAL_NOTIFICATION_NAME, bundle);
        intent.putExtra(INTENT_EXTRA_LOCAL_NOTIFICATION_INDEX_NAME, i2);
        intent.setData(Uri.parse(_fflocalnotification.uri));
        return intent;
    }

    private static int getLocalNotificationRequestCode(int i2, int i3) {
        return (i2 * FFVoiceConst.FFVoiceEvent.FFVoice_EVENT_EOF) + i3;
    }

    public static void gotoChannelNotificationSettings(int i2) {
        if (Build.VERSION.SDK_INT >= 26) {
            Intent intent = new Intent("android.settings.CHANNEL_NOTIFICATION_SETTINGS");
            intent.putExtra("android.provider.extra.APP_PACKAGE", FFAPI.MainActivity.getPackageName());
            intent.putExtra("android.provider.extra.CHANNEL_ID", i2);
            FFAPI.MainActivity.startActivity(intent);
        }
    }

    public static boolean hasNotificationChannels() {
        return Build.VERSION.SDK_INT >= 26;
    }

    private static boolean isChannelEnabled(Context context, String str) {
        NotificationChannel notificationChannelH;
        String group;
        NotificationChannelGroup notificationChannelGroupI;
        l lVarF = l.f(context);
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 26 || (notificationChannelH = lVarF.h(str)) == null) {
            return true;
        }
        if (notificationChannelH.getImportance() == 0) {
            return false;
        }
        return i2 < 28 || (group = notificationChannelH.getGroup()) == null || (notificationChannelGroupI = lVarF.i(group)) == null || !notificationChannelGroupI.isBlocked();
    }

    public static boolean isNotificationChannelEnabled(String str) {
        return isChannelEnabled(FFAPI.MainActivity, str);
    }

    public static String readLocalNotificationRecords() {
        return _readLocalNotificationRecords(FFAPI.MainActivity);
    }

    public static void scheduleLocalNotification(int i2, int i3, String str, String str2, long j2, int i4, int i5, String str3, String str4) {
        _FFLocalNotification _fflocalnotification = new _FFLocalNotification();
        _fflocalnotification.notification_id = i3;
        _fflocalnotification.channel_id = str4;
        _fflocalnotification.title = str;
        _fflocalnotification.content = str2;
        _fflocalnotification.time_ms = j2;
        _fflocalnotification.repeat_interval_ms = i4;
        _fflocalnotification.repeat_times = i5;
        _fflocalnotification.uri = str3;
        _fflocalnotification.notify_type = i2;
        HashMap<Integer, _FFLocalNotification> map_loadLocalNotifcations = _loadLocalNotifcations(FFAPI.MainActivity);
        if (map_loadLocalNotifcations.containsKey(Integer.valueOf(_fflocalnotification.notification_id))) {
            map_loadLocalNotifcations.remove(Integer.valueOf(_fflocalnotification.notification_id));
        }
        map_loadLocalNotifcations.put(Integer.valueOf(_fflocalnotification.notification_id), _fflocalnotification);
        _saveLocalNotifications(FFAPI.MainActivity, map_loadLocalNotifcations);
        _scheduleLocalNotification(FFAPI.MainActivity, _fflocalnotification);
    }

    public static void setLocalNotificationChannel(String str, int i2, String str2, String str3) {
        if (Build.VERSION.SDK_INT >= 26) {
            NotificationChannel notificationChannel = new NotificationChannel(str, str2, i2);
            notificationChannel.setDescription(str3);
            notificationChannel.setShowBadge(true);
            notificationChannel.setSound(Uri.parse("android.resource://" + FreeFireBuildVariant.GetPackageName() + "/" + FFAPI.R(FFAPI.MainActivity, "raw", "fflogo")), new AudioAttributes.Builder().setContentType(4).setUsage(5).build());
            l.f(FFAPI.MainActivity).e(notificationChannel);
        }
    }

    public static void unscheduleAllLocalNotifications() {
        _unsheduleAllLocalNotifications(FFAPI.MainActivity);
    }

    public static void unscheduleLocalNotification(int i2) {
        HashMap<Integer, _FFLocalNotification> map_loadLocalNotifcations = _loadLocalNotifcations(FFAPI.MainActivity);
        if (map_loadLocalNotifcations.containsKey(Integer.valueOf(i2))) {
            _FFLocalNotification _fflocalnotification = map_loadLocalNotifcations.get(Integer.valueOf(i2));
            map_loadLocalNotifcations.remove(Integer.valueOf(i2));
            _saveLocalNotifications(FFAPI.MainActivity, map_loadLocalNotifcations);
            _unscheduleLocalNotification(FFAPI.MainActivity, _fflocalnotification);
        }
    }
}
