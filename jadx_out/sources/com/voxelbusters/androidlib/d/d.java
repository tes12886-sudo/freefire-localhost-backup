package com.voxelbusters.androidlib.d;

import android.content.ContentUris;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.provider.MediaStore;

/* JADX INFO: loaded from: classes.dex */
public class d {
    public static Uri a(String str, Context context) {
        Cursor cursorQuery = context.getContentResolver().query(MediaStore.Video.Media.EXTERNAL_CONTENT_URI, new String[]{"_id"}, "_data=?", new String[]{str}, null);
        if (cursorQuery == null || !cursorQuery.moveToFirst()) {
            return null;
        }
        return ContentUris.withAppendedId(MediaStore.Video.Media.EXTERNAL_CONTENT_URI, cursorQuery.getLong(0));
    }

    public static String b(Context context, Uri uri) {
        if (Build.VERSION.SDK_INT < 19) {
            return "";
        }
        Cursor cursorQuery = null;
        try {
            cursorQuery = context.getContentResolver().query(uri, new String[]{"_data"}, null, null, null);
            return (cursorQuery == null || !cursorQuery.moveToFirst()) ? "" : cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("_data"));
        } finally {
            if (cursorQuery != null) {
                cursorQuery.close();
            }
        }
    }
}
