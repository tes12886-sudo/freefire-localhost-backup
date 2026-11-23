package androidx.core.graphics.drawable;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.versionedparcelable.CustomVersionedParcelable;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes.dex */
public class IconCompat extends CustomVersionedParcelable {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    static final PorterDuff.Mode f316k = PorterDuff.Mode.SRC_IN;
    public int a;
    Object b;
    public byte[] c;
    public Parcelable d;
    public int e;
    public int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ColorStateList f317g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    PorterDuff.Mode f318h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f319i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f320j;

    public IconCompat() {
        this.a = -1;
        this.c = null;
        this.d = null;
        this.e = 0;
        this.f = 0;
        this.f317g = null;
        this.f318h = f316k;
        this.f319i = null;
    }

    private IconCompat(int i2) {
        this.a = -1;
        this.c = null;
        this.d = null;
        this.e = 0;
        this.f = 0;
        this.f317g = null;
        this.f318h = f316k;
        this.f319i = null;
        this.a = i2;
    }

    static Bitmap a(Bitmap bitmap, boolean z) {
        int iMin = (int) (Math.min(bitmap.getWidth(), bitmap.getHeight()) * 0.6666667f);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iMin, iMin, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint(3);
        float f = iMin;
        float f2 = 0.5f * f;
        float f3 = 0.9166667f * f2;
        if (z) {
            float f4 = 0.010416667f * f;
            paint.setColor(0);
            paint.setShadowLayer(f4, 0.0f, f * 0.020833334f, 1023410176);
            canvas.drawCircle(f2, f2, f3, paint);
            paint.setShadowLayer(f4, 0.0f, 0.0f, 503316480);
            canvas.drawCircle(f2, f2, f3, paint);
            paint.clearShadowLayer();
        }
        paint.setColor(-16777216);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        Matrix matrix = new Matrix();
        matrix.setTranslate((-(bitmap.getWidth() - iMin)) / 2, (-(bitmap.getHeight() - iMin)) / 2);
        bitmapShader.setLocalMatrix(matrix);
        paint.setShader(bitmapShader);
        canvas.drawCircle(f2, f2, f3, paint);
        canvas.setBitmap(null);
        return bitmapCreateBitmap;
    }

    public static IconCompat b(Bitmap bitmap) {
        if (bitmap == null) {
            throw new IllegalArgumentException("Bitmap must not be null.");
        }
        IconCompat iconCompat = new IconCompat(1);
        iconCompat.b = bitmap;
        return iconCompat;
    }

    public static IconCompat c(Resources resources, String str, int i2) {
        if (str == null) {
            throw new IllegalArgumentException("Package must not be null.");
        }
        if (i2 == 0) {
            throw new IllegalArgumentException("Drawable resource ID must not be 0");
        }
        IconCompat iconCompat = new IconCompat(2);
        iconCompat.e = i2;
        if (resources != null) {
            try {
                iconCompat.b = resources.getResourceName(i2);
            } catch (Resources.NotFoundException unused) {
                throw new IllegalArgumentException("Icon resource cannot be found");
            }
        } else {
            iconCompat.b = str;
        }
        iconCompat.f320j = str;
        return iconCompat;
    }

    private static int f(Icon icon) {
        if (Build.VERSION.SDK_INT >= 28) {
            return icon.getResId();
        }
        try {
            return ((Integer) icon.getClass().getMethod("getResId", new Class[0]).invoke(icon, new Object[0])).intValue();
        } catch (IllegalAccessException e) {
            Log.e("IconCompat", "Unable to get icon resource", e);
            return 0;
        } catch (NoSuchMethodException e2) {
            Log.e("IconCompat", "Unable to get icon resource", e2);
            return 0;
        } catch (InvocationTargetException e3) {
            Log.e("IconCompat", "Unable to get icon resource", e3);
            return 0;
        }
    }

    private static String h(Icon icon) {
        if (Build.VERSION.SDK_INT >= 28) {
            return icon.getResPackage();
        }
        try {
            return (String) icon.getClass().getMethod("getResPackage", new Class[0]).invoke(icon, new Object[0]);
        } catch (IllegalAccessException e) {
            Log.e("IconCompat", "Unable to get icon package", e);
            return null;
        } catch (NoSuchMethodException e2) {
            Log.e("IconCompat", "Unable to get icon package", e2);
            return null;
        } catch (InvocationTargetException e3) {
            Log.e("IconCompat", "Unable to get icon package", e3);
            return null;
        }
    }

    private static int j(Icon icon) {
        StringBuilder sb;
        if (Build.VERSION.SDK_INT >= 28) {
            return icon.getType();
        }
        try {
            return ((Integer) icon.getClass().getMethod("getType", new Class[0]).invoke(icon, new Object[0])).intValue();
        } catch (IllegalAccessException e) {
            e = e;
            sb = new StringBuilder();
            sb.append("Unable to get icon type ");
            sb.append(icon);
            Log.e("IconCompat", sb.toString(), e);
            return -1;
        } catch (NoSuchMethodException e2) {
            e = e2;
            sb = new StringBuilder();
            sb.append("Unable to get icon type ");
            sb.append(icon);
            Log.e("IconCompat", sb.toString(), e);
            return -1;
        } catch (InvocationTargetException e3) {
            e = e3;
            sb = new StringBuilder();
            sb.append("Unable to get icon type ");
            sb.append(icon);
            Log.e("IconCompat", sb.toString(), e);
            return -1;
        }
    }

    private static Uri l(Icon icon) {
        if (Build.VERSION.SDK_INT >= 28) {
            return icon.getUri();
        }
        try {
            return (Uri) icon.getClass().getMethod("getUri", new Class[0]).invoke(icon, new Object[0]);
        } catch (IllegalAccessException e) {
            Log.e("IconCompat", "Unable to get icon uri", e);
            return null;
        } catch (NoSuchMethodException e2) {
            Log.e("IconCompat", "Unable to get icon uri", e2);
            return null;
        } catch (InvocationTargetException e3) {
            Log.e("IconCompat", "Unable to get icon uri", e3);
            return null;
        }
    }

    private static String r(int i2) {
        switch (i2) {
            case 1:
                return "BITMAP";
            case 2:
                return "RESOURCE";
            case 3:
                return "DATA";
            case 4:
                return "URI";
            case 5:
                return "BITMAP_MASKABLE";
            case 6:
                return "URI_MASKABLE";
            default:
                return "UNKNOWN";
        }
    }

    public Bitmap d() {
        int i2 = this.a;
        if (i2 == -1 && Build.VERSION.SDK_INT >= 23) {
            Object obj = this.b;
            if (obj instanceof Bitmap) {
                return (Bitmap) obj;
            }
            return null;
        }
        if (i2 == 1) {
            return (Bitmap) this.b;
        }
        if (i2 == 5) {
            return a((Bitmap) this.b, true);
        }
        throw new IllegalStateException("called getBitmap() on " + this);
    }

    public int e() {
        int i2 = this.a;
        if (i2 == -1 && Build.VERSION.SDK_INT >= 23) {
            return f((Icon) this.b);
        }
        if (i2 == 2) {
            return this.e;
        }
        throw new IllegalStateException("called getResId() on " + this);
    }

    public String g() {
        int i2 = this.a;
        if (i2 == -1 && Build.VERSION.SDK_INT >= 23) {
            return h((Icon) this.b);
        }
        if (i2 == 2) {
            return TextUtils.isEmpty(this.f320j) ? ((String) this.b).split(":", -1)[0] : this.f320j;
        }
        throw new IllegalStateException("called getResPackage() on " + this);
    }

    public int i() {
        int i2 = this.a;
        return (i2 != -1 || Build.VERSION.SDK_INT < 23) ? i2 : j((Icon) this.b);
    }

    public Uri k() {
        int i2 = this.a;
        if (i2 == -1 && Build.VERSION.SDK_INT >= 23) {
            return l((Icon) this.b);
        }
        if (i2 == 4 || i2 == 6) {
            return Uri.parse((String) this.b);
        }
        throw new IllegalStateException("called getUri() on " + this);
    }

    public InputStream m(Context context) {
        StringBuilder sb;
        String str;
        Uri uriK = k();
        String scheme = uriK.getScheme();
        if ("content".equals(scheme) || "file".equals(scheme)) {
            try {
                return context.getContentResolver().openInputStream(uriK);
            } catch (Exception e) {
                e = e;
                sb = new StringBuilder();
                str = "Unable to load image from URI: ";
            }
        } else {
            try {
                return new FileInputStream(new File((String) this.b));
            } catch (FileNotFoundException e2) {
                e = e2;
                sb = new StringBuilder();
                str = "Unable to load image from path: ";
            }
        }
        sb.append(str);
        sb.append(uriK);
        Log.w("IconCompat", sb.toString(), e);
        return null;
    }

    public void n() {
        Parcelable parcelable;
        this.f318h = PorterDuff.Mode.valueOf(this.f319i);
        switch (this.a) {
            case -1:
                parcelable = this.d;
                if (parcelable == null) {
                    throw new IllegalArgumentException("Invalid icon");
                }
                break;
            case 0:
            default:
                return;
            case 1:
            case 5:
                parcelable = this.d;
                if (parcelable == null) {
                    byte[] bArr = this.c;
                    this.b = bArr;
                    this.a = 3;
                    this.e = 0;
                    this.f = bArr.length;
                    return;
                }
                break;
            case 2:
            case 4:
            case 6:
                String str = new String(this.c, Charset.forName("UTF-16"));
                this.b = str;
                if (this.a == 2 && this.f320j == null) {
                    this.f320j = str.split(":", -1)[0];
                    return;
                }
                return;
            case 3:
                this.b = this.c;
                return;
        }
        this.b = parcelable;
    }

    public void o(boolean z) {
        this.f319i = this.f318h.name();
        switch (this.a) {
            case -1:
                if (z) {
                    throw new IllegalArgumentException("Can't serialize Icon created with IconCompat#createFromIcon");
                }
                break;
            case 0:
            default:
                return;
            case 1:
            case 5:
                if (z) {
                    Bitmap bitmap = (Bitmap) this.b;
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    bitmap.compress(Bitmap.CompressFormat.PNG, 90, byteArrayOutputStream);
                    this.c = byteArrayOutputStream.toByteArray();
                    return;
                }
                break;
            case 2:
                this.c = ((String) this.b).getBytes(Charset.forName("UTF-16"));
                return;
            case 3:
                this.c = (byte[]) this.b;
                return;
            case 4:
            case 6:
                this.c = this.b.toString().getBytes(Charset.forName("UTF-16"));
                return;
        }
        this.d = (Parcelable) this.b;
    }

    @Deprecated
    public Icon p() {
        return q(null);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x006b A[PHI: r5
  0x006b: PHI (r5v15 android.graphics.Bitmap) = (r5v14 android.graphics.Bitmap), (r5v25 android.graphics.Bitmap) binds: [B:20:0x0069, B:13:0x002c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:22:0x0070 A[PHI: r5
  0x0070: PHI (r5v19 android.graphics.Bitmap) = (r5v14 android.graphics.Bitmap), (r5v25 android.graphics.Bitmap) binds: [B:20:0x0069, B:13:0x002c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:30:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:33:0x00ab  */
    public Icon q(Context context) {
        Bitmap bitmapA;
        Icon iconCreateWithResource;
        Bitmap bitmapDecodeStream;
        ColorStateList colorStateList;
        PorterDuff.Mode mode;
        int i2 = Build.VERSION.SDK_INT;
        switch (this.a) {
            case -1:
                return (Icon) this.b;
            case 0:
            default:
                throw new IllegalArgumentException("Unknown type");
            case 1:
                bitmapA = (Bitmap) this.b;
                iconCreateWithResource = Icon.createWithBitmap(bitmapA);
                colorStateList = this.f317g;
                if (colorStateList != null) {
                    iconCreateWithResource.setTintList(colorStateList);
                }
                mode = this.f318h;
                if (mode != f316k) {
                    iconCreateWithResource.setTintMode(mode);
                }
                return iconCreateWithResource;
            case 2:
                iconCreateWithResource = Icon.createWithResource(g(), this.e);
                colorStateList = this.f317g;
                if (colorStateList != null) {
                    iconCreateWithResource.setTintList(colorStateList);
                }
                mode = this.f318h;
                if (mode != f316k) {
                    iconCreateWithResource.setTintMode(mode);
                }
                return iconCreateWithResource;
            case 3:
                iconCreateWithResource = Icon.createWithData((byte[]) this.b, this.e, this.f);
                colorStateList = this.f317g;
                if (colorStateList != null) {
                    iconCreateWithResource.setTintList(colorStateList);
                }
                mode = this.f318h;
                if (mode != f316k) {
                    iconCreateWithResource.setTintMode(mode);
                }
                return iconCreateWithResource;
            case 4:
                iconCreateWithResource = Icon.createWithContentUri((String) this.b);
                colorStateList = this.f317g;
                if (colorStateList != null) {
                    iconCreateWithResource.setTintList(colorStateList);
                }
                mode = this.f318h;
                if (mode != f316k) {
                    iconCreateWithResource.setTintMode(mode);
                }
                return iconCreateWithResource;
            case 5:
                bitmapDecodeStream = (Bitmap) this.b;
                if (i2 >= 26) {
                    iconCreateWithResource = Icon.createWithAdaptiveBitmap(bitmapDecodeStream);
                } else {
                    bitmapA = a(bitmapDecodeStream, false);
                    iconCreateWithResource = Icon.createWithBitmap(bitmapA);
                }
                colorStateList = this.f317g;
                if (colorStateList != null) {
                    iconCreateWithResource.setTintList(colorStateList);
                }
                mode = this.f318h;
                if (mode != f316k) {
                    iconCreateWithResource.setTintMode(mode);
                }
                return iconCreateWithResource;
            case 6:
                if (i2 >= 30) {
                    iconCreateWithResource = Icon.createWithAdaptiveBitmapContentUri(k());
                } else {
                    if (context == null) {
                        throw new IllegalArgumentException("Context is required to resolve the file uri of the icon: " + k());
                    }
                    InputStream inputStreamM = m(context);
                    if (inputStreamM == null) {
                        throw new IllegalStateException("Cannot load adaptive icon from uri: " + k());
                    }
                    bitmapDecodeStream = BitmapFactory.decodeStream(inputStreamM);
                    if (i2 >= 26) {
                        iconCreateWithResource = Icon.createWithAdaptiveBitmap(bitmapDecodeStream);
                    } else {
                        bitmapA = a(bitmapDecodeStream, false);
                        iconCreateWithResource = Icon.createWithBitmap(bitmapA);
                    }
                }
                colorStateList = this.f317g;
                if (colorStateList != null) {
                    iconCreateWithResource.setTintList(colorStateList);
                }
                mode = this.f318h;
                if (mode != f316k) {
                    iconCreateWithResource.setTintMode(mode);
                }
                return iconCreateWithResource;
        }
    }

    public String toString() {
        int height;
        if (this.a == -1) {
            return String.valueOf(this.b);
        }
        StringBuilder sb = new StringBuilder("Icon(typ=");
        sb.append(r(this.a));
        switch (this.a) {
            case 1:
            case 5:
                sb.append(" size=");
                sb.append(((Bitmap) this.b).getWidth());
                sb.append("x");
                height = ((Bitmap) this.b).getHeight();
                sb.append(height);
                break;
            case 2:
                sb.append(" pkg=");
                sb.append(this.f320j);
                sb.append(" id=");
                sb.append(String.format("0x%08x", Integer.valueOf(e())));
                break;
            case 3:
                sb.append(" len=");
                sb.append(this.e);
                if (this.f != 0) {
                    sb.append(" off=");
                    height = this.f;
                    sb.append(height);
                }
                break;
            case 4:
            case 6:
                sb.append(" uri=");
                sb.append(this.b);
                break;
        }
        if (this.f317g != null) {
            sb.append(" tint=");
            sb.append(this.f317g);
        }
        if (this.f318h != f316k) {
            sb.append(" mode=");
            sb.append(this.f318h);
        }
        sb.append(")");
        return sb.toString();
    }
}
