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
public final class ck extends cf {
    public ck(Runnable runnable) {
        super("samsung", runnable);
    }

    @Override // com.appsflyer.internal.cl
    public final void AFKeystoreWrapper(Context context) {
        valueOf(context, new ax<Map<String, Object>>(context, "com.sec.android.app.samsungapps.referrer", "FBA3AF4E7757D9016E953FB3EE4671CA2BD9AF725F9A53D52ED4A38EAAA08901") { // from class: com.appsflyer.internal.ck.3
            private static void AFInAppEventParameterName(String str, Map<String, Object> map, Cursor cursor) {
                int columnIndex = cursor.getColumnIndex(str);
                if (columnIndex == -1) {
                    return;
                }
                long j2 = cursor.getLong(columnIndex);
                if (j2 == 0) {
                    return;
                }
                map.put(str, Long.valueOf(j2));
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* JADX WARN: Code duplicated, block: B:24:0x00d3 A[PHI: r2
  0x00d3: PHI (r2v1 android.database.Cursor) = (r2v0 android.database.Cursor), (r2v8 android.database.Cursor) binds: [B:23:0x00d1, B:17:0x00bd] A[DONT_GENERATE, DONT_INLINE]] */
            @Override // com.appsflyer.internal.ax
            /* JADX INFO: renamed from: AFInAppEventType, reason: merged with bridge method [inline-methods] */
            public Map<String, Object> values() {
                String string;
                Cursor cursorQuery = null;
                try {
                    try {
                        ContentResolver contentResolver = this.AFInAppEventType.getContentResolver();
                        StringBuilder sb = new StringBuilder("content://");
                        sb.append(this.values);
                        cursorQuery = contentResolver.query(Uri.parse(sb.toString()), null, null, null, null);
                        if (cursorQuery == null) {
                            ck.this.values.put("response", "SERVICE_UNAVAILABLE");
                        } else if (cursorQuery.moveToFirst()) {
                            ck.this.values.put("response", "OK");
                            valueOf("referrer", ck.this.values, cursorQuery);
                            AFInAppEventParameterName("click_ts", ck.this.values, cursorQuery);
                            AFInAppEventParameterName("install_begin_ts", ck.this.values, cursorQuery);
                            AFInAppEventParameterName("install_end_ts", ck.this.values, cursorQuery);
                            valueOf("organic_keywords", ck.this.values, cursorQuery);
                            valueOf("attr_type", ck.this.values, cursorQuery);
                            HashMap map = new HashMap();
                            int columnIndex = cursorQuery.getColumnIndex("instant");
                            if (columnIndex != -1 && (string = cursorQuery.getString(columnIndex)) != null) {
                                map.put("instant", Boolean.valueOf(Boolean.parseBoolean(string)));
                            }
                            AFInAppEventParameterName("click_server_ts", map, cursorQuery);
                            AFInAppEventParameterName("install_begin_server_ts", map, cursorQuery);
                            valueOf("install_version", map, cursorQuery);
                            if (!map.isEmpty()) {
                                ck.this.values.put("custom", map);
                            }
                        } else {
                            ck.this.values.put("response", "FEATURE_NOT_SUPPORTED");
                        }
                        if (cursorQuery != null) {
                            cursorQuery.close();
                        }
                    } catch (Exception e) {
                        ck.this.values.put("response", "FEATURE_NOT_SUPPORTED");
                        AFLogger.valueOf(e.getMessage(), e);
                        if (0 != 0) {
                            cursorQuery.close();
                        }
                    }
                    String str = ((PackageItemInfo) this.AFInAppEventType.getPackageManager().resolveContentProvider(this.values, 128)).packageName;
                    ck.this.values.put("api_ver", Long.valueOf(ac.valueOf(this.AFInAppEventType, str)));
                    ck.this.values.put("api_ver_name", ac.values(this.AFInAppEventType, str));
                    ck.this.AFKeystoreWrapper();
                    return ck.this.values;
                } catch (Throwable th) {
                    if (0 != 0) {
                        cursorQuery.close();
                    }
                    throw th;
                }
            }

            private static void valueOf(String str, Map<String, Object> map, Cursor cursor) {
                String string;
                int columnIndex = cursor.getColumnIndex(str);
                if (columnIndex == -1 || (string = cursor.getString(columnIndex)) == null) {
                    return;
                }
                map.put(str, string);
            }
        });
    }
}
