package com.appsflyer.internal;

import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.PackageItemInfo;
import android.database.Cursor;
import android.net.Uri;
import com.appsflyer.AFLogger;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class ch extends cf {
    public ch(Runnable runnable) {
        super("huawei", runnable);
    }

    @Override // com.appsflyer.internal.cl
    public final void AFKeystoreWrapper(Context context) {
        valueOf(context, new ax<Map<String, Object>>(context, "com.huawei.appmarket.commondata", "FFE391E0EA186D0734ED601E4E70E3224B7309D48E2075BAC46D8C667EAE7212", "3BAF59A2E5331C30675FAB35FF5FFF0D116142D3D4664F1C3CB804068B40614F") { // from class: com.appsflyer.internal.ch.5
            /* JADX INFO: Access modifiers changed from: private */
            /* JADX WARN: Code duplicated, block: B:22:0x010e A[PHI: r2
  0x010e: PHI (r2v6 android.database.Cursor) = (r2v5 android.database.Cursor), (r2v7 android.database.Cursor) binds: [B:21:0x010c, B:15:0x00f8] A[DONT_GENERATE, DONT_INLINE]] */
            @Override // com.appsflyer.internal.ax
            /* JADX INFO: renamed from: AFKeystoreWrapper, reason: merged with bridge method [inline-methods] */
            public Map<String, Object> values() {
                String str = ((PackageItemInfo) this.AFInAppEventType.getPackageManager().resolveContentProvider(this.values, 128)).packageName;
                ch.this.values.put("api_ver", Long.valueOf(ac.valueOf(this.AFInAppEventType, str)));
                ch.this.values.put("api_ver_name", ac.values(this.AFInAppEventType, str));
                Cursor cursorQuery = null;
                try {
                    try {
                        ContentResolver contentResolver = this.AFInAppEventType.getContentResolver();
                        StringBuilder sb = new StringBuilder("content://");
                        sb.append(this.values);
                        sb.append("/item/5");
                        cursorQuery = contentResolver.query(Uri.parse(sb.toString()), null, null, new String[]{this.AFInAppEventType.getPackageName()}, null);
                        if (cursorQuery == null) {
                            ch.this.values.put("response", "SERVICE_UNAVAILABLE");
                        } else if (cursorQuery.moveToFirst()) {
                            ch.this.values.put("response", "OK");
                            ch.this.values.put("referrer", cursorQuery.getString(0));
                            ch.this.values.put("click_ts", Long.valueOf(cursorQuery.getLong(1)));
                            ch.this.values.put("install_end_ts", Long.valueOf(cursorQuery.getLong(2)));
                            if (cursorQuery.getColumnCount() > 3) {
                                ch.this.values.put("install_begin_ts", Long.valueOf(cursorQuery.getLong(3)));
                                HashMap map = new HashMap();
                                String string = cursorQuery.getString(4);
                                if (string != null) {
                                    map.put("track_id", string);
                                }
                                map.put("referrer_ex", cursorQuery.getString(5));
                                ch.this.values.put("huawei_custom", map);
                            }
                        } else {
                            ch.this.values.put("response", "FEATURE_NOT_SUPPORTED");
                        }
                        if (cursorQuery != null) {
                            cursorQuery.close();
                        }
                    } catch (Exception e) {
                        ch.this.values.put("response", "FEATURE_NOT_SUPPORTED");
                        AFLogger.valueOf(e.getMessage(), e);
                        if (0 != 0) {
                            cursorQuery.close();
                        }
                    }
                    ch.this.AFKeystoreWrapper();
                    return ch.this.values;
                } catch (Throwable th) {
                    if (0 != 0) {
                        cursorQuery.close();
                    }
                    throw th;
                }
            }
        });
    }
}
