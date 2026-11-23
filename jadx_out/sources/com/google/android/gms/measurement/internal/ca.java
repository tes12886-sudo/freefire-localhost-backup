package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.content.pm.Signature;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.text.TextUtils;
import com.FF.voiceengine.FFVoiceConst;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.internal.measurement.td;
import java.io.ByteArrayInputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicLong;
import javax.security.auth.x500.X500Principal;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

/* JADX INFO: loaded from: classes.dex */
public final class ca extends v5 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String[] f1174g = {"firebase_", "google_", "ga_"};

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String[] f1175h = {"_err"};

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f1176i = 0;
    private SecureRandom c;
    private final AtomicLong d;
    private int e;
    private Integer f;

    ca(a5 a5Var) {
        super(a5Var);
        this.f = null;
        this.d = new AtomicLong(0L);
    }

    static MessageDigest B() {
        for (int i2 = 0; i2 < 2; i2++) {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                if (messageDigest != null) {
                    return messageDigest;
                }
            } catch (NoSuchAlgorithmException unused) {
            }
        }
        return null;
    }

    static long C(byte[] bArr) {
        com.google.android.gms.common.internal.q.k(bArr);
        int length = bArr.length;
        int i2 = 0;
        com.google.android.gms.common.internal.q.n(length > 0);
        long j2 = 0;
        for (int i3 = length - 1; i3 >= 0 && i3 >= bArr.length - 8; i3--) {
            j2 += (((long) bArr[i3]) & 255) << i2;
            i2 += 8;
        }
        return j2;
    }

    static boolean D(Context context, boolean z) {
        com.google.android.gms.common.internal.q.k(context);
        return f0(context, Build.VERSION.SDK_INT >= 24 ? "com.google.android.gms.measurement.AppMeasurementJobService" : "com.google.android.gms.measurement.AppMeasurementService");
    }

    static boolean F(String str) {
        return !TextUtils.isEmpty(str) && str.startsWith("_");
    }

    static boolean G(String str, String str2) {
        if (str == null && str2 == null) {
            return true;
        }
        if (str == null) {
            return false;
        }
        return str.equals(str2);
    }

    public static boolean M(String str) {
        return !f1175h[0].equals(str);
    }

    public static ArrayList<Bundle> Y(List<b> list) {
        if (list == null) {
            return new ArrayList<>(0);
        }
        ArrayList<Bundle> arrayList = new ArrayList<>(list.size());
        for (b bVar : list) {
            Bundle bundle = new Bundle();
            bundle.putString("app_id", bVar.a);
            bundle.putString("origin", bVar.b);
            bundle.putLong("creation_timestamp", bVar.d);
            bundle.putString("name", bVar.c.b);
            x5.a(bundle, bVar.c.f());
            bundle.putBoolean("active", bVar.e);
            String str = bVar.f;
            if (str != null) {
                bundle.putString("trigger_event_name", str);
            }
            t tVar = bVar.f1169g;
            if (tVar != null) {
                bundle.putString("timed_out_event_name", tVar.a);
                r rVar = bVar.f1169g.b;
                if (rVar != null) {
                    bundle.putBundle("timed_out_event_params", rVar.q());
                }
            }
            bundle.putLong("trigger_timeout", bVar.f1170h);
            t tVar2 = bVar.f1171i;
            if (tVar2 != null) {
                bundle.putString("triggered_event_name", tVar2.a);
                r rVar2 = bVar.f1171i.b;
                if (rVar2 != null) {
                    bundle.putBundle("triggered_event_params", rVar2.q());
                }
            }
            bundle.putLong("triggered_timestamp", bVar.c.c);
            bundle.putLong("time_to_live", bVar.f1172j);
            t tVar3 = bVar.f1173k;
            if (tVar3 != null) {
                bundle.putString("expired_event_name", tVar3.a);
                r rVar3 = bVar.f1173k.b;
                if (rVar3 != null) {
                    bundle.putBundle("expired_event_params", rVar3.q());
                }
            }
            arrayList.add(bundle);
        }
        return arrayList;
    }

    static boolean a0(Context context) {
        ActivityInfo receiverInfo;
        com.google.android.gms.common.internal.q.k(context);
        try {
            PackageManager packageManager = context.getPackageManager();
            return (packageManager == null || (receiverInfo = packageManager.getReceiverInfo(new ComponentName(context, "com.google.android.gms.measurement.AppMeasurementReceiver"), 0)) == null || !receiverInfo.enabled) ? false : true;
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    static final boolean b0(Bundle bundle, int i2) {
        if (bundle.getLong("_err") != 0) {
            return false;
        }
        bundle.putLong("_err", i2);
        return true;
    }

    static final boolean c0(String str) {
        com.google.android.gms.common.internal.q.k(str);
        return str.matches("^(1:\\d+:android:[a-f0-9]+|ca-app-pub-.*)$");
    }

    private final Object d0(int i2, Object obj, boolean z, boolean z2) {
        if (obj == null) {
            return null;
        }
        if ((obj instanceof Long) || (obj instanceof Double)) {
            return obj;
        }
        if (obj instanceof Integer) {
            return Long.valueOf(((Integer) obj).intValue());
        }
        if (obj instanceof Byte) {
            return Long.valueOf(((Byte) obj).byteValue());
        }
        if (obj instanceof Short) {
            return Long.valueOf(((Short) obj).shortValue());
        }
        if (obj instanceof Boolean) {
            return Long.valueOf(true != ((Boolean) obj).booleanValue() ? 0L : 1L);
        }
        if (obj instanceof Float) {
            return Double.valueOf(((Float) obj).doubleValue());
        }
        if ((obj instanceof String) || (obj instanceof Character) || (obj instanceof CharSequence)) {
            return q(String.valueOf(obj), i2, z);
        }
        if (!z2 || (!(obj instanceof Bundle[]) && !(obj instanceof Parcelable[]))) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Parcelable parcelable : (Parcelable[]) obj) {
            if (parcelable instanceof Bundle) {
                Bundle bundleI = I((Bundle) parcelable);
                if (!bundleI.isEmpty()) {
                    arrayList.add(bundleI);
                }
            }
        }
        return arrayList.toArray(new Bundle[arrayList.size()]);
    }

    private final int e0(String str) {
        if ("_ldl".equals(str)) {
            this.a.z();
            return 2048;
        }
        if ("_id".equals(str)) {
            this.a.z();
            return 256;
        }
        if (this.a.z().w(null, f3.f0) && "_lgclid".equals(str)) {
            this.a.z();
            return 100;
        }
        this.a.z();
        return 36;
    }

    private static boolean f0(Context context, String str) {
        ServiceInfo serviceInfo;
        try {
            PackageManager packageManager = context.getPackageManager();
            return (packageManager == null || (serviceInfo = packageManager.getServiceInfo(new ComponentName(context, str), 0)) == null || !serviceInfo.enabled) ? false : true;
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    private static boolean g0(String str, String[] strArr) {
        com.google.android.gms.common.internal.q.k(strArr);
        for (String str2 : strArr) {
            if (G(str, str2)) {
                return true;
            }
        }
        return false;
    }

    static boolean j0(String str) {
        com.google.android.gms.common.internal.q.g(str);
        return str.charAt(0) != '_' || str.equals("_ep");
    }

    final void A(ba baVar, String str, int i2, String str2, String str3, int i3, boolean z) {
        Bundle bundle = new Bundle();
        b0(bundle, i2);
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            bundle.putString(str2, str3);
        }
        if (i2 == 6 || i2 == 7 || i2 == 2) {
            bundle.putLong("_el", i3);
        }
        if (z) {
            baVar.b(str, "_err", bundle);
        } else {
            this.a.a();
            this.a.F().X("auto", "_err", bundle);
        }
    }

    final boolean E(String str) {
        h();
        if (com.google.android.gms.common.o.c.a(this.a.c()).a(str) == 0) {
            return true;
        }
        this.a.d().v().b("Permission not granted", str);
        return false;
    }

    final boolean H(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String strD = this.a.z().D();
        this.a.a();
        return strD.equals(str);
    }

    final Bundle I(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            for (String str : bundle.keySet()) {
                Object objS = s(str, bundle.get(str));
                if (objS == null) {
                    this.a.d().t().b("Param value can't be null", this.a.H().q(str));
                } else {
                    z(bundle2, str, objS);
                }
            }
        }
        return bundle2;
    }

    final t J(String str, String str2, Bundle bundle, String str3, long j2, boolean z, boolean z2) {
        if (TextUtils.isEmpty(str2)) {
            return null;
        }
        if (p0(str2) != 0) {
            this.a.d().o().b("Invalid conditional property event name", this.a.H().r(str2));
            throw new IllegalArgumentException();
        }
        Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
        bundle2.putString("_o", str3);
        Bundle bundleT = t(str, str2, bundle2, com.google.android.gms.common.util.f.b("_o"), false);
        if (z) {
            bundleT = I(bundleT);
        }
        com.google.android.gms.common.internal.q.k(bundleT);
        return new t(str2, new r(bundleT), str3, j2);
    }

    final boolean K(Context context, String str) {
        p3 p3VarO;
        String str2;
        Signature[] signatureArr;
        X500Principal x500Principal = new X500Principal("CN=Android Debug,O=Android,C=US");
        try {
            PackageInfo packageInfoE = com.google.android.gms.common.o.c.a(context).e(str, 64);
            if (packageInfoE == null || (signatureArr = packageInfoE.signatures) == null || signatureArr.length <= 0) {
                return true;
            }
            return ((X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(signatureArr[0].toByteArray()))).getSubjectX500Principal().equals(x500Principal);
        } catch (PackageManager.NameNotFoundException e) {
            e = e;
            p3VarO = this.a.d().o();
            str2 = "Package name not found";
            p3VarO.b(str2, e);
            return true;
        } catch (CertificateException e2) {
            e = e2;
            p3VarO = this.a.d().o();
            str2 = "Error obtaining certificate";
            p3VarO.b(str2, e);
            return true;
        }
    }

    final byte[] L(Parcelable parcelable) {
        if (parcelable == null) {
            return null;
        }
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelable.writeToParcel(parcelObtain, 0);
            return parcelObtain.marshall();
        } finally {
            parcelObtain.recycle();
        }
    }

    @EnsuresNonNull({"this.apkVersion"})
    public final int N() {
        if (this.f == null) {
            this.f = Integer.valueOf(GoogleApiAvailabilityLight.getInstance().getApkVersion(this.a.c()) / FFVoiceConst.FFVoiceEvent.FFVoice_EVENT_EOF);
        }
        return this.f.intValue();
    }

    public final int O(int i2) {
        return GoogleApiAvailabilityLight.getInstance().isGooglePlayServicesAvailable(this.a.c(), 12451000);
    }

    public final long P(long j2, long j3) {
        return (j2 + (j3 * 60000)) / 86400000;
    }

    final void Q(Bundle bundle, long j2) {
        long j3 = bundle.getLong("_et");
        if (j3 != 0) {
            this.a.d().r().b("Params already contained engagement", Long.valueOf(j3));
        }
        bundle.putLong("_et", j2 + j3);
    }

    public final void R(com.google.android.gms.internal.measurement.i1 i1Var, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("r", str);
        try {
            i1Var.W(bundle);
        } catch (RemoteException e) {
            this.a.d().r().b("Error returning string value to wrapper", e);
        }
    }

    public final void S(com.google.android.gms.internal.measurement.i1 i1Var, long j2) {
        Bundle bundle = new Bundle();
        bundle.putLong("r", j2);
        try {
            i1Var.W(bundle);
        } catch (RemoteException e) {
            this.a.d().r().b("Error returning long value to wrapper", e);
        }
    }

    public final void T(com.google.android.gms.internal.measurement.i1 i1Var, int i2) {
        Bundle bundle = new Bundle();
        bundle.putInt("r", i2);
        try {
            i1Var.W(bundle);
        } catch (RemoteException e) {
            this.a.d().r().b("Error returning int value to wrapper", e);
        }
    }

    public final void U(com.google.android.gms.internal.measurement.i1 i1Var, byte[] bArr) {
        Bundle bundle = new Bundle();
        bundle.putByteArray("r", bArr);
        try {
            i1Var.W(bundle);
        } catch (RemoteException e) {
            this.a.d().r().b("Error returning byte array to wrapper", e);
        }
    }

    public final void V(com.google.android.gms.internal.measurement.i1 i1Var, boolean z) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("r", z);
        try {
            i1Var.W(bundle);
        } catch (RemoteException e) {
            this.a.d().r().b("Error returning boolean value to wrapper", e);
        }
    }

    public final void W(com.google.android.gms.internal.measurement.i1 i1Var, Bundle bundle) {
        try {
            i1Var.W(bundle);
        } catch (RemoteException e) {
            this.a.d().r().b("Error returning bundle value to wrapper", e);
        }
    }

    public final void X(com.google.android.gms.internal.measurement.i1 i1Var, ArrayList<Bundle> arrayList) {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("r", arrayList);
        try {
            i1Var.W(bundle);
        } catch (RemoteException e) {
            this.a.d().r().b("Error returning bundle list to wrapper", e);
        }
    }

    public final URL Z(long j2, String str, String str2, long j3) {
        try {
            com.google.android.gms.common.internal.q.g(str2);
            com.google.android.gms.common.internal.q.g(str);
            String strConcat = String.format("https://www.googleadservices.com/pagead/conversion/app/deeplink?id_type=adid&sdk_version=%s&rdid=%s&bundleid=%s&retry=%s", String.format("v%s.%s", 42004L, Integer.valueOf(N())), str2, str, Long.valueOf(j3));
            if (str.equals(this.a.z().E())) {
                strConcat = strConcat.concat("&ddl_test=1");
            }
            return new URL(strConcat);
        } catch (IllegalArgumentException | MalformedURLException e) {
            this.a.d().o().b("Failed to create BOW URL for Deferred Deep Link. exception", e.getMessage());
            return null;
        }
    }

    public final long h0() {
        long j2 = this.d.get();
        synchronized (this.d) {
            if (j2 != 0) {
                this.d.compareAndSet(-1L, 1L);
                return this.d.getAndIncrement();
            }
            long jNextLong = new Random(System.nanoTime() ^ this.a.e().a()).nextLong();
            int i2 = this.e + 1;
            this.e = i2;
            return jNextLong + ((long) i2);
        }
    }

    @Override // com.google.android.gms.measurement.internal.v5
    protected final boolean i() {
        return true;
    }

    @EnsuresNonNull({"this.secureRandom"})
    final SecureRandom i0() {
        h();
        if (this.c == null) {
            this.c = new SecureRandom();
        }
        return this.c;
    }

    @Override // com.google.android.gms.measurement.internal.v5
    protected final void j() {
        h();
        SecureRandom secureRandom = new SecureRandom();
        long jNextLong = secureRandom.nextLong();
        if (jNextLong == 0) {
            jNextLong = secureRandom.nextLong();
            if (jNextLong == 0) {
                this.a.d().r().a("Utils falling back to Random for random id");
            }
        }
        this.d.set(jNextLong);
    }

    final Bundle k0(Uri uri) {
        String queryParameter;
        String queryParameter2;
        String queryParameter3;
        String queryParameter4;
        if (uri != null) {
            try {
                if (uri.isHierarchical()) {
                    queryParameter = uri.getQueryParameter("utm_campaign");
                    queryParameter2 = uri.getQueryParameter("utm_source");
                    queryParameter3 = uri.getQueryParameter("utm_medium");
                    queryParameter4 = uri.getQueryParameter("gclid");
                } else {
                    queryParameter = null;
                    queryParameter2 = null;
                    queryParameter3 = null;
                    queryParameter4 = null;
                }
                if (TextUtils.isEmpty(queryParameter) && TextUtils.isEmpty(queryParameter2) && TextUtils.isEmpty(queryParameter3) && TextUtils.isEmpty(queryParameter4)) {
                    return null;
                }
                Bundle bundle = new Bundle();
                if (!TextUtils.isEmpty(queryParameter)) {
                    bundle.putString("campaign", queryParameter);
                }
                if (!TextUtils.isEmpty(queryParameter2)) {
                    bundle.putString("source", queryParameter2);
                }
                if (!TextUtils.isEmpty(queryParameter3)) {
                    bundle.putString("medium", queryParameter3);
                }
                if (!TextUtils.isEmpty(queryParameter4)) {
                    bundle.putString("gclid", queryParameter4);
                }
                String queryParameter5 = uri.getQueryParameter("utm_term");
                if (!TextUtils.isEmpty(queryParameter5)) {
                    bundle.putString("term", queryParameter5);
                }
                String queryParameter6 = uri.getQueryParameter("utm_content");
                if (!TextUtils.isEmpty(queryParameter6)) {
                    bundle.putString("content", queryParameter6);
                }
                String queryParameter7 = uri.getQueryParameter("aclid");
                if (!TextUtils.isEmpty(queryParameter7)) {
                    bundle.putString("aclid", queryParameter7);
                }
                String queryParameter8 = uri.getQueryParameter("cp1");
                if (!TextUtils.isEmpty(queryParameter8)) {
                    bundle.putString("cp1", queryParameter8);
                }
                String queryParameter9 = uri.getQueryParameter("anid");
                if (!TextUtils.isEmpty(queryParameter9)) {
                    bundle.putString("anid", queryParameter9);
                }
                return bundle;
            } catch (UnsupportedOperationException e) {
                this.a.d().r().b("Install referrer url isn't a hierarchical URI", e);
            }
        }
        return null;
    }

    final boolean l0(String str, String str2) {
        if (str2 == null) {
            this.a.d().q().b("Name is required and can't be null. Type", str);
            return false;
        }
        if (str2.length() == 0) {
            this.a.d().q().b("Name is required and can't be empty. Type", str);
            return false;
        }
        int iCodePointAt = str2.codePointAt(0);
        if (!Character.isLetter(iCodePointAt)) {
            this.a.d().q().c("Name must start with a letter. Type, name", str, str2);
            return false;
        }
        int length = str2.length();
        int iCharCount = Character.charCount(iCodePointAt);
        while (iCharCount < length) {
            int iCodePointAt2 = str2.codePointAt(iCharCount);
            if (iCodePointAt2 != 95 && !Character.isLetterOrDigit(iCodePointAt2)) {
                this.a.d().q().c("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                return false;
            }
            iCharCount += Character.charCount(iCodePointAt2);
        }
        return true;
    }

    final boolean m0(String str, String str2) {
        if (str2 == null) {
            this.a.d().q().b("Name is required and can't be null. Type", str);
            return false;
        }
        if (str2.length() == 0) {
            this.a.d().q().b("Name is required and can't be empty. Type", str);
            return false;
        }
        int iCodePointAt = str2.codePointAt(0);
        if (!Character.isLetter(iCodePointAt)) {
            if (iCodePointAt != 95) {
                this.a.d().q().c("Name must start with a letter or _ (underscore). Type, name", str, str2);
                return false;
            }
            iCodePointAt = 95;
        }
        int length = str2.length();
        int iCharCount = Character.charCount(iCodePointAt);
        while (iCharCount < length) {
            int iCodePointAt2 = str2.codePointAt(iCharCount);
            if (iCodePointAt2 != 95 && !Character.isLetterOrDigit(iCodePointAt2)) {
                this.a.d().q().c("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                return false;
            }
            iCharCount += Character.charCount(iCodePointAt2);
        }
        return true;
    }

    final boolean n0(String str, String[] strArr, String[] strArr2, String str2) {
        if (str2 == null) {
            this.a.d().q().b("Name is required and can't be null. Type", str);
            return false;
        }
        com.google.android.gms.common.internal.q.k(str2);
        String[] strArr3 = f1174g;
        for (int i2 = 0; i2 < 3; i2++) {
            if (str2.startsWith(strArr3[i2])) {
                this.a.d().q().c("Name starts with reserved prefix. Type, name", str, str2);
                return false;
            }
        }
        if (strArr == null || !g0(str2, strArr)) {
            return true;
        }
        if (strArr2 != null && g0(str2, strArr2)) {
            return true;
        }
        this.a.d().q().c("Name is reserved. Type, name", str, str2);
        return false;
    }

    final boolean o(String str, String str2, String str3) {
        if (!TextUtils.isEmpty(str)) {
            if (c0(str)) {
                return true;
            }
            if (this.a.K()) {
                this.a.d().q().b("Invalid google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI. provided id", r3.x(str));
            }
            return false;
        }
        td.a();
        if (this.a.z().w(null, f3.h0) && !TextUtils.isEmpty(str3)) {
            return true;
        }
        if (TextUtils.isEmpty(str2)) {
            if (this.a.K()) {
                this.a.d().q().a("Missing google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI");
            }
            return false;
        }
        if (c0(str2)) {
            return true;
        }
        this.a.d().q().b("Invalid admob_app_id. Analytics disabled.", r3.x(str2));
        return false;
    }

    final boolean o0(String str, int i2, String str2) {
        if (str2 == null) {
            this.a.d().q().b("Name is required and can't be null. Type", str);
            return false;
        }
        if (str2.codePointCount(0, str2.length()) <= i2) {
            return true;
        }
        this.a.d().q().d("Name is too long. Type, maximum supported length, name", str, Integer.valueOf(i2), str2);
        return false;
    }

    final boolean p(String str, String str2, String str3, String str4) {
        boolean zIsEmpty = TextUtils.isEmpty(str);
        boolean zIsEmpty2 = TextUtils.isEmpty(str2);
        if (!zIsEmpty && !zIsEmpty2) {
            com.google.android.gms.common.internal.q.k(str);
            return !str.equals(str2);
        }
        if (zIsEmpty && zIsEmpty2) {
            if (TextUtils.isEmpty(str3) || TextUtils.isEmpty(str4)) {
                return !TextUtils.isEmpty(str4);
            }
            return !str3.equals(str4);
        }
        if (zIsEmpty) {
            return TextUtils.isEmpty(str3) || !str3.equals(str4);
        }
        if (TextUtils.isEmpty(str4)) {
            return false;
        }
        return TextUtils.isEmpty(str3) || !str3.equals(str4);
    }

    final int p0(String str) {
        if (!m0("event", str)) {
            return 2;
        }
        if (!n0("event", y5.a, y5.b, str)) {
            return 13;
        }
        this.a.z();
        return !o0("event", 40, str) ? 2 : 0;
    }

    public final String q(String str, int i2, boolean z) {
        if (str == null) {
            return null;
        }
        if (str.codePointCount(0, str.length()) <= i2) {
            return str;
        }
        if (z) {
            return String.valueOf(str.substring(0, str.offsetByCodePoints(0, i2))).concat("...");
        }
        return null;
    }

    final int q0(String str) {
        if (!m0("user property", str)) {
            return 6;
        }
        if (!n0("user property", a6.a, null, str)) {
            return 15;
        }
        this.a.z();
        return !o0("user property", 24, str) ? 6 : 0;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00ad  */
    final int r(String str, String str2, String str3, Object obj, Bundle bundle, List<String> list, boolean z, boolean z2) {
        int i2;
        int i3;
        p3 p3VarT;
        Object obj2;
        String str4;
        int size;
        h();
        if (!t0(obj)) {
            i2 = 0;
        } else {
            if (!z2) {
                return 21;
            }
            if (!g0(str3, z5.c)) {
                return 20;
            }
            r8 r8VarR = this.a.R();
            r8VarR.h();
            r8VarR.j();
            if (r8VarR.r() && r8VarR.a.G().N() < 200900) {
                return 25;
            }
            this.a.z();
            boolean z3 = obj instanceof Parcelable[];
            if (z3) {
                size = ((Parcelable[]) obj).length;
            } else if (obj instanceof ArrayList) {
                size = ((ArrayList) obj).size();
            } else {
                i2 = 0;
            }
            if (size > 200) {
                this.a.d().t().d("Parameter array is too long; discarded. Value kind, name, array length", "param", str3, Integer.valueOf(size));
                this.a.z();
                if (z3) {
                    Parcelable[] parcelableArr = (Parcelable[]) obj;
                    if (parcelableArr.length > 200) {
                        bundle.putParcelableArray(str3, (Parcelable[]) Arrays.copyOf(parcelableArr, j.d.a.e.a.a.i.g.STATUS_SUCCESS));
                    }
                } else if (obj instanceof ArrayList) {
                    ArrayList arrayList = (ArrayList) obj;
                    if (arrayList.size() > 200) {
                        bundle.putParcelableArrayList(str3, new ArrayList<>(arrayList.subList(0, j.d.a.e.a.a.i.g.STATUS_SUCCESS)));
                    }
                }
                i2 = 17;
            } else {
                i2 = 0;
            }
        }
        if ((this.a.z().w(str, f3.S) && F(str2)) || F(str3)) {
            this.a.z();
            i3 = 256;
        } else {
            this.a.z();
            i3 = 100;
        }
        if (u0("param", str3, i3, obj)) {
            return i2;
        }
        if (!z2) {
            return 4;
        }
        if (obj instanceof Bundle) {
            v0(str, str2, str3, (Bundle) obj, list, z);
        } else if (obj instanceof Parcelable[]) {
            for (Parcelable parcelable : (Parcelable[]) obj) {
                if (!(parcelable instanceof Bundle)) {
                    p3VarT = this.a.d().t();
                    obj2 = parcelable.getClass();
                    str4 = "All Parcelable[] elements must be of type Bundle. Value type, name";
                    p3VarT.c(str4, obj2, str3);
                    return 4;
                }
                v0(str, str2, str3, (Bundle) parcelable, list, z);
            }
        } else {
            if (!(obj instanceof ArrayList)) {
                return 4;
            }
            ArrayList arrayList2 = (ArrayList) obj;
            int size2 = arrayList2.size();
            for (int i4 = 0; i4 < size2; i4++) {
                Object obj3 = arrayList2.get(i4);
                if (!(obj3 instanceof Bundle)) {
                    p3VarT = this.a.d().t();
                    obj2 = obj3 != null ? obj3.getClass() : "null";
                    str4 = "All ArrayList elements must be of type Bundle. Value type, name";
                    p3VarT.c(str4, obj2, str3);
                    return 4;
                }
                v0(str, str2, str3, (Bundle) obj3, list, z);
            }
        }
        return i2;
    }

    final int r0(String str) {
        if (!l0("event param", str)) {
            return 3;
        }
        if (!n0("event param", null, null, str)) {
            return 14;
        }
        this.a.z();
        return !o0("event param", 40, str) ? 3 : 0;
    }

    final Object s(String str, Object obj) {
        int i2 = 256;
        if ("_ev".equals(str)) {
            this.a.z();
            return d0(256, obj, true, true);
        }
        if (F(str)) {
            this.a.z();
        } else {
            this.a.z();
            i2 = 100;
        }
        return d0(i2, obj, false, true);
    }

    final int s0(String str) {
        if (!m0("event param", str)) {
            return 3;
        }
        if (!n0("event param", null, null, str)) {
            return 14;
        }
        this.a.z();
        return !o0("event param", 40, str) ? 3 : 0;
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:48:0x00d4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:51:0x011e A[SYNTHETIC] */
    final Bundle t(String str, String str2, Bundle bundle, List<String> list, boolean z) {
        int i2;
        String str3;
        int i3;
        boolean zG0 = g0(str2, y5.d);
        Bundle bundle2 = new Bundle(bundle);
        int iM = this.a.z().m();
        int i4 = 0;
        for (String str4 : this.a.z().w(str, f3.X) ? new TreeSet<>(bundle.keySet()) : bundle.keySet()) {
            if (list == null || !list.contains(str4)) {
                int iR0 = z ? r0(str4) : 0;
                if (iR0 == 0) {
                    iR0 = s0(str4);
                }
                i2 = iR0;
            } else {
                i2 = 0;
            }
            if (i2 != 0) {
                w(bundle2, i2, str4, str4, i2 == 3 ? str4 : null);
                bundle2.remove(str4);
            } else {
                int iR = r(str, str2, str4, bundle.get(str4), bundle2, list, z, zG0);
                if (iR == 17) {
                    w(bundle2, 17, str4, str4, Boolean.FALSE);
                } else {
                    if (iR != 0) {
                        str3 = str4;
                        if (!"_ev".equals(str3)) {
                            w(bundle2, iR, iR == 21 ? str2 : str3, str3, bundle.get(str3));
                            bundle2.remove(str3);
                        }
                    }
                    if (j0(str3)) {
                        i3 = i4 + 1;
                        if (i3 > iM) {
                            StringBuilder sb = new StringBuilder(48);
                            sb.append("Event can't contain more than ");
                            sb.append(iM);
                            sb.append(" params");
                            this.a.d().q().c(sb.toString(), this.a.H().p(str2), this.a.H().s(bundle));
                            b0(bundle2, 5);
                            bundle2.remove(str3);
                        }
                        i4 = i3;
                    }
                }
                str3 = str4;
                if (j0(str3)) {
                    i3 = i4 + 1;
                    if (i3 > iM) {
                        StringBuilder sb2 = new StringBuilder(48);
                        sb2.append("Event can't contain more than ");
                        sb2.append(iM);
                        sb2.append(" params");
                        this.a.d().q().c(sb2.toString(), this.a.H().p(str2), this.a.H().s(bundle));
                        b0(bundle2, 5);
                        bundle2.remove(str3);
                    }
                    i4 = i3;
                }
            }
        }
        return bundle2;
    }

    final boolean t0(Object obj) {
        return (obj instanceof Parcelable[]) || (obj instanceof ArrayList) || (obj instanceof Bundle);
    }

    final void u(s3 s3Var, int i2) {
        int i3 = 0;
        for (String str : new TreeSet(s3Var.d.keySet())) {
            if (j0(str) && (i3 = i3 + 1) > i2) {
                StringBuilder sb = new StringBuilder(48);
                sb.append("Event can't contain more than ");
                sb.append(i2);
                sb.append(" params");
                this.a.d().q().c(sb.toString(), this.a.H().p(s3Var.a), this.a.H().s(s3Var.d));
                b0(s3Var.d, 5);
                s3Var.d.remove(str);
            }
        }
    }

    final boolean u0(String str, String str2, int i2, Object obj) {
        if (obj != null && !(obj instanceof Long) && !(obj instanceof Float) && !(obj instanceof Integer) && !(obj instanceof Byte) && !(obj instanceof Short) && !(obj instanceof Boolean) && !(obj instanceof Double)) {
            if (!(obj instanceof String) && !(obj instanceof Character) && !(obj instanceof CharSequence)) {
                return false;
            }
            String strValueOf = String.valueOf(obj);
            if (strValueOf.codePointCount(0, strValueOf.length()) > i2) {
                this.a.d().t().d("Value is too long; discarded. Value kind, name, value length", str, str2, Integer.valueOf(strValueOf.length()));
                return false;
            }
        }
        return true;
    }

    final void v(Bundle bundle, Bundle bundle2) {
        if (bundle2 == null) {
            return;
        }
        for (String str : bundle2.keySet()) {
            if (!bundle.containsKey(str)) {
                this.a.G().z(bundle, str, bundle2.get(str));
            }
        }
    }

    final void v0(String str, String str2, String str3, Bundle bundle, List<String> list, boolean z) {
        int i2;
        int iR;
        if (bundle == null) {
            return;
        }
        this.a.z();
        int i3 = 0;
        for (String str4 : new TreeSet(bundle.keySet())) {
            if (list == null || !list.contains(str4)) {
                int iR0 = z ? r0(str4) : 0;
                if (iR0 == 0) {
                    iR0 = s0(str4);
                }
                i2 = iR0;
            } else {
                i2 = 0;
            }
            if (i2 != 0) {
                w(bundle, i2, str4, str4, i2 == 3 ? str4 : null);
                bundle.remove(str4);
            } else {
                if (t0(bundle.get(str4))) {
                    this.a.d().t().d("Nested Bundle parameters are not allowed; discarded. event name, param name, child param name", str2, str3, str4);
                    iR = 22;
                } else {
                    iR = r(str, str2, str4, bundle.get(str4), bundle, list, z, false);
                }
                if (iR != 0 && !"_ev".equals(str4)) {
                    w(bundle, iR, str4, str4, bundle.get(str4));
                } else if (j0(str4) && !g0(str4, z5.d) && (i3 = i3 + 1) > 0) {
                    this.a.d().q().c("Item cannot contain custom parameters", this.a.H().p(str2), this.a.H().s(bundle));
                    b0(bundle, 23);
                }
                bundle.remove(str4);
            }
        }
    }

    final void w(Bundle bundle, int i2, String str, String str2, Object obj) {
        if (b0(bundle, i2)) {
            this.a.z();
            bundle.putString("_ev", q(str, 40, true));
            if (obj != null) {
                com.google.android.gms.common.internal.q.k(bundle);
                if ((obj instanceof String) || (obj instanceof CharSequence)) {
                    bundle.putLong("_el", String.valueOf(obj).length());
                }
            }
        }
    }

    final int x(String str, Object obj) {
        int iE0;
        String str2;
        if ("_ldl".equals(str)) {
            iE0 = e0(str);
            str2 = "user property referrer";
        } else {
            iE0 = e0(str);
            str2 = "user property";
        }
        return u0(str2, str, iE0, obj) ? 0 : 7;
    }

    final Object y(String str, Object obj) {
        boolean zEquals = "_ldl".equals(str);
        int iE0 = e0(str);
        return zEquals ? d0(iE0, obj, true, false) : d0(iE0, obj, false, false);
    }

    final void z(Bundle bundle, String str, Object obj) {
        if (bundle == null) {
            return;
        }
        if (obj instanceof Long) {
            bundle.putLong(str, ((Long) obj).longValue());
            return;
        }
        if (obj instanceof String) {
            bundle.putString(str, String.valueOf(obj));
            return;
        }
        if (obj instanceof Double) {
            bundle.putDouble(str, ((Double) obj).doubleValue());
        } else if (obj instanceof Bundle[]) {
            bundle.putParcelableArray(str, (Bundle[]) obj);
        } else if (str != null) {
            this.a.d().t().c("Not putting event parameter. Invalid value type. name, type", this.a.H().q(str), obj != null ? obj.getClass().getSimpleName() : null);
        }
    }
}
