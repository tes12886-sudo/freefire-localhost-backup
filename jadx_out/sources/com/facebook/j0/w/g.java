package com.facebook.j0.w;

import android.text.TextUtils;
import com.facebook.r;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;
import l.y.c.i;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class g {
    public static final g a = new g();

    private g() {
    }

    public static final File a() {
        if (com.facebook.internal.m0.i.a.d(g.class)) {
            return null;
        }
        try {
            File file = new File(r.f().getFilesDir(), "facebook_ml/");
            if (file.exists() || file.mkdirs()) {
                return file;
            }
            return null;
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, g.class);
            return null;
        }
    }

    public static final Map<String, a> c(File file) {
        if (com.facebook.internal.m0.i.a.d(g.class)) {
            return null;
        }
        try {
            i.e(file, "file");
            try {
                FileInputStream fileInputStream = new FileInputStream(file);
                int iAvailable = fileInputStream.available();
                DataInputStream dataInputStream = new DataInputStream(fileInputStream);
                byte[] bArr = new byte[iAvailable];
                dataInputStream.readFully(bArr);
                dataInputStream.close();
                if (iAvailable < 4) {
                    return null;
                }
                int i2 = 0;
                ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr, 0, 4);
                byteBufferWrap.order(ByteOrder.LITTLE_ENDIAN);
                i.d(byteBufferWrap, "bb");
                int i3 = byteBufferWrap.getInt();
                int i4 = i3 + 4;
                if (iAvailable < i4) {
                    return null;
                }
                JSONObject jSONObject = new JSONObject(new String(bArr, 4, i3, l.d0.d.b));
                JSONArray jSONArrayNames = jSONObject.names();
                int length = jSONArrayNames.length();
                String[] strArr = new String[length];
                for (int i5 = 0; i5 < length; i5++) {
                    strArr[i5] = jSONArrayNames.getString(i5);
                }
                l.t.g.h(strArr);
                HashMap map = new HashMap();
                int i6 = 0;
                while (i6 < length) {
                    String str = strArr[i6];
                    if (str != null) {
                        JSONArray jSONArray = jSONObject.getJSONArray(str);
                        int length2 = jSONArray.length();
                        int[] iArr = new int[length2];
                        int i7 = 1;
                        while (i2 < length2) {
                            iArr[i2] = jSONArray.getInt(i2);
                            i7 *= iArr[i2];
                            i2++;
                        }
                        int i8 = i7 * 4;
                        int i9 = i4 + i8;
                        if (i9 > iAvailable) {
                            return null;
                        }
                        ByteBuffer byteBufferWrap2 = ByteBuffer.wrap(bArr, i4, i8);
                        byteBufferWrap2.order(ByteOrder.LITTLE_ENDIAN);
                        a aVar = new a(iArr);
                        byteBufferWrap2.asFloatBuffer().get(aVar.a(), 0, i7);
                        map.put(str, aVar);
                        i4 = i9;
                    }
                    i6++;
                    i2 = 0;
                }
                return map;
            } catch (Exception unused) {
                return null;
            }
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, g.class);
            return null;
        }
    }

    public final String b(String str) {
        if (com.facebook.internal.m0.i.a.d(this)) {
            return null;
        }
        try {
            i.e(str, "str");
            int length = str.length() - 1;
            int i2 = 0;
            boolean z = false;
            while (i2 <= length) {
                boolean z2 = i.g(str.charAt(!z ? i2 : length), 32) <= 0;
                if (z) {
                    if (!z2) {
                        break;
                    }
                    length--;
                } else if (z2) {
                    i2++;
                } else {
                    z = true;
                }
            }
            Object[] array = new l.d0.f("\\s+").c(str.subSequence(i2, length + 1).toString(), 0).toArray(new String[0]);
            if (array == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
            }
            String strJoin = TextUtils.join(" ", (String[]) array);
            i.d(strJoin, "TextUtils.join(\" \", strArray)");
            return strJoin;
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, this);
            return null;
        }
    }

    public final int[] d(String str, int i2) {
        if (com.facebook.internal.m0.i.a.d(this)) {
            return null;
        }
        try {
            i.e(str, "texts");
            int[] iArr = new int[i2];
            String strB = b(str);
            Charset charsetForName = Charset.forName("UTF-8");
            i.d(charsetForName, "Charset.forName(\"UTF-8\")");
            if (strB == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
            byte[] bytes = strB.getBytes(charsetForName);
            i.d(bytes, "(this as java.lang.String).getBytes(charset)");
            for (int i3 = 0; i3 < i2; i3++) {
                if (i3 < bytes.length) {
                    iArr[i3] = bytes[i3] & 255;
                } else {
                    iArr[i3] = 0;
                }
            }
            return iArr;
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, this);
            return null;
        }
    }
}
