package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Iterator;
import java.util.List;
import java.util.zip.GZIPOutputStream;

/* JADX INFO: loaded from: classes.dex */
public final class x9 extends m9 {
    x9(v9 v9Var) {
        super(v9Var);
    }

    static boolean C(String str) {
        return str != null && str.matches("([+-])?([0-9]+\\.?[0-9]*|[0-9]*\\.?[0-9]+)") && str.length() <= 310;
    }

    static boolean D(List<Long> list, int i2) {
        if (i2 < list.size() * 64) {
            return ((1 << (i2 % 64)) & list.get(i2 / 64).longValue()) != 0;
        }
        return false;
    }

    static List<Long> E(BitSet bitSet) {
        int length = (bitSet.length() + 63) / 64;
        ArrayList arrayList = new ArrayList(length);
        for (int i2 = 0; i2 < length; i2++) {
            long j2 = 0;
            for (int i3 = 0; i3 < 64; i3++) {
                int i4 = (i2 * 64) + i3;
                if (i4 >= bitSet.length()) {
                    break;
                }
                if (bitSet.get(i4)) {
                    j2 |= 1 << i3;
                }
            }
            arrayList.add(Long.valueOf(j2));
        }
        return arrayList;
    }

    static <Builder extends com.google.android.gms.internal.measurement.ca> Builder J(Builder builder, byte[] bArr) {
        com.google.android.gms.internal.measurement.l8 l8VarB = com.google.android.gms.internal.measurement.l8.b();
        if (l8VarB != null) {
            builder.F(bArr, l8VarB);
            return builder;
        }
        builder.O(bArr);
        return builder;
    }

    static int K(com.google.android.gms.internal.measurement.r4 r4Var, String str) {
        for (int i2 = 0; i2 < r4Var.z0(); i2++) {
            if (str.equals(r4Var.A0(i2).z())) {
                return i2;
            }
        }
        return -1;
    }

    static List<com.google.android.gms.internal.measurement.o4> L(Bundle[] bundleArr) {
        ArrayList arrayList = new ArrayList();
        for (Bundle bundle : bundleArr) {
            if (bundle != null) {
                com.google.android.gms.internal.measurement.n4 n4VarK = com.google.android.gms.internal.measurement.o4.K();
                for (String str : bundle.keySet()) {
                    com.google.android.gms.internal.measurement.n4 n4VarK2 = com.google.android.gms.internal.measurement.o4.K();
                    n4VarK2.w(str);
                    Object obj = bundle.get(str);
                    if (obj instanceof Long) {
                        n4VarK2.z(((Long) obj).longValue());
                    } else if (obj instanceof String) {
                        n4VarK2.x((String) obj);
                    } else if (obj instanceof Double) {
                        n4VarK2.B(((Double) obj).doubleValue());
                    }
                    n4VarK.E(n4VarK2);
                }
                if (n4VarK.D() > 0) {
                    arrayList.add(n4VarK.p());
                }
            }
        }
        return arrayList;
    }

    static t M(com.google.android.gms.internal.measurement.b bVar) {
        String string;
        Bundle bundle = new Bundle();
        String string2 = "app";
        for (String str : bVar.f().keySet()) {
            Object objE = bVar.e(str);
            if ("_o".equals(str) && objE != null) {
                string2 = objE.toString();
            }
            if (objE == null) {
                string = null;
            } else if (objE instanceof Long) {
                bundle.putLong(str, ((Long) objE).longValue());
            } else if (objE instanceof Double) {
                bundle.putDouble(str, ((Double) objE).doubleValue());
            } else {
                string = objE.toString();
            }
            bundle.putString(str, string);
        }
        String strB = y5.b(bVar.b());
        if (strB == null) {
            strB = bVar.b();
        }
        return new t(strB, new r(bundle), string2, bVar.a());
    }

    static final void N(com.google.android.gms.internal.measurement.j4 j4Var, String str, Object obj) {
        List<com.google.android.gms.internal.measurement.o4> listW = j4Var.w();
        int i2 = 0;
        while (true) {
            if (i2 >= listW.size()) {
                i2 = -1;
                break;
            } else if (str.equals(listW.get(i2).y())) {
                break;
            } else {
                i2++;
            }
        }
        com.google.android.gms.internal.measurement.n4 n4VarK = com.google.android.gms.internal.measurement.o4.K();
        n4VarK.w(str);
        if (obj instanceof Long) {
            n4VarK.z(((Long) obj).longValue());
        } else if (obj instanceof String) {
            n4VarK.x((String) obj);
        } else if (obj instanceof Double) {
            n4VarK.B(((Double) obj).doubleValue());
        } else if (obj instanceof Bundle[]) {
            n4VarK.G(L((Bundle[]) obj));
        }
        if (i2 >= 0) {
            j4Var.A(i2, n4VarK);
        } else {
            j4Var.C(n4VarK);
        }
    }

    static final boolean O(t tVar, ja jaVar) {
        com.google.android.gms.common.internal.q.k(tVar);
        com.google.android.gms.common.internal.q.k(jaVar);
        return (TextUtils.isEmpty(jaVar.b) && TextUtils.isEmpty(jaVar.q)) ? false : true;
    }

    static final com.google.android.gms.internal.measurement.o4 m(com.google.android.gms.internal.measurement.k4 k4Var, String str) {
        for (com.google.android.gms.internal.measurement.o4 o4Var : k4Var.x()) {
            if (o4Var.y().equals(str)) {
                return o4Var;
            }
        }
        return null;
    }

    static final Object n(com.google.android.gms.internal.measurement.k4 k4Var, String str) {
        com.google.android.gms.internal.measurement.o4 o4VarM = m(k4Var, str);
        if (o4VarM == null) {
            return null;
        }
        if (o4VarM.z()) {
            return o4VarM.A();
        }
        if (o4VarM.B()) {
            return Long.valueOf(o4VarM.C());
        }
        if (o4VarM.G()) {
            return Double.valueOf(o4VarM.H());
        }
        if (o4VarM.J() <= 0) {
            return null;
        }
        List<com.google.android.gms.internal.measurement.o4> listI = o4VarM.I();
        ArrayList arrayList = new ArrayList();
        for (com.google.android.gms.internal.measurement.o4 o4Var : listI) {
            if (o4Var != null) {
                Bundle bundle = new Bundle();
                for (com.google.android.gms.internal.measurement.o4 o4Var2 : o4Var.I()) {
                    if (o4Var2.z()) {
                        bundle.putString(o4Var2.y(), o4Var2.A());
                    } else if (o4Var2.B()) {
                        bundle.putLong(o4Var2.y(), o4Var2.C());
                    } else if (o4Var2.G()) {
                        bundle.putDouble(o4Var2.y(), o4Var2.H());
                    }
                }
                if (!bundle.isEmpty()) {
                    arrayList.add(bundle);
                }
            }
        }
        return (Bundle[]) arrayList.toArray(new Bundle[arrayList.size()]);
    }

    private final void o(StringBuilder sb, int i2, List<com.google.android.gms.internal.measurement.o4> list) {
        if (list == null) {
            return;
        }
        int i3 = i2 + 1;
        for (com.google.android.gms.internal.measurement.o4 o4Var : list) {
            if (o4Var != null) {
                q(sb, i3);
                sb.append("param {\n");
                t(sb, i3, "name", o4Var.x() ? this.a.H().q(o4Var.y()) : null);
                t(sb, i3, "string_value", o4Var.z() ? o4Var.A() : null);
                t(sb, i3, "int_value", o4Var.B() ? Long.valueOf(o4Var.C()) : null);
                t(sb, i3, "double_value", o4Var.G() ? Double.valueOf(o4Var.H()) : null);
                if (o4Var.J() > 0) {
                    o(sb, i3, o4Var.I());
                }
                q(sb, i3);
                sb.append("}\n");
            }
        }
    }

    private final void p(StringBuilder sb, int i2, com.google.android.gms.internal.measurement.j3 j3Var) {
        if (j3Var == null) {
            return;
        }
        q(sb, i2);
        sb.append("filter {\n");
        if (j3Var.B()) {
            t(sb, i2, "complement", Boolean.valueOf(j3Var.C()));
        }
        if (j3Var.D()) {
            t(sb, i2, "param_name", this.a.H().q(j3Var.E()));
        }
        if (j3Var.x()) {
            int i3 = i2 + 1;
            com.google.android.gms.internal.measurement.t3 t3VarY = j3Var.y();
            if (t3VarY != null) {
                q(sb, i3);
                sb.append("string_filter {\n");
                if (t3VarY.x()) {
                    t(sb, i3, "match_type", t3VarY.y().name());
                }
                if (t3VarY.z()) {
                    t(sb, i3, "expression", t3VarY.A());
                }
                if (t3VarY.B()) {
                    t(sb, i3, "case_sensitive", Boolean.valueOf(t3VarY.C()));
                }
                if (t3VarY.E() > 0) {
                    q(sb, i3 + 1);
                    sb.append("expression_list {\n");
                    for (String str : t3VarY.D()) {
                        q(sb, i3 + 2);
                        sb.append(str);
                        sb.append("\n");
                    }
                    sb.append("}\n");
                }
                q(sb, i3);
                sb.append("}\n");
            }
        }
        if (j3Var.z()) {
            u(sb, i2 + 1, "number_filter", j3Var.A());
        }
        q(sb, i2);
        sb.append("}\n");
    }

    private static final void q(StringBuilder sb, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            sb.append("  ");
        }
    }

    private static final String r(boolean z, boolean z2, boolean z3) {
        StringBuilder sb = new StringBuilder();
        if (z) {
            sb.append("Dynamic ");
        }
        if (z2) {
            sb.append("Sequence ");
        }
        if (z3) {
            sb.append("Session-Scoped ");
        }
        return sb.toString();
    }

    private static final void s(StringBuilder sb, int i2, String str, com.google.android.gms.internal.measurement.z4 z4Var) {
        if (z4Var == null) {
            return;
        }
        q(sb, 3);
        sb.append(str);
        sb.append(" {\n");
        if (z4Var.A() != 0) {
            q(sb, 4);
            sb.append("results: ");
            int i3 = 0;
            for (Long l2 : z4Var.z()) {
                int i4 = i3 + 1;
                if (i3 != 0) {
                    sb.append(", ");
                }
                sb.append(l2);
                i3 = i4;
            }
            sb.append('\n');
        }
        if (z4Var.y() != 0) {
            q(sb, 4);
            sb.append("status: ");
            int i5 = 0;
            for (Long l3 : z4Var.x()) {
                int i6 = i5 + 1;
                if (i5 != 0) {
                    sb.append(", ");
                }
                sb.append(l3);
                i5 = i6;
            }
            sb.append('\n');
        }
        if (z4Var.C() != 0) {
            q(sb, 4);
            sb.append("dynamic_filter_timestamps: {");
            int i7 = 0;
            for (com.google.android.gms.internal.measurement.i4 i4Var : z4Var.B()) {
                int i8 = i7 + 1;
                if (i7 != 0) {
                    sb.append(", ");
                }
                sb.append(i4Var.x() ? Integer.valueOf(i4Var.y()) : null);
                sb.append(":");
                sb.append(i4Var.z() ? Long.valueOf(i4Var.A()) : null);
                i7 = i8;
            }
            sb.append("}\n");
        }
        if (z4Var.G() != 0) {
            q(sb, 4);
            sb.append("sequence_filter_timestamps: {");
            int i9 = 0;
            for (com.google.android.gms.internal.measurement.b5 b5Var : z4Var.E()) {
                int i10 = i9 + 1;
                if (i9 != 0) {
                    sb.append(", ");
                }
                sb.append(b5Var.x() ? Integer.valueOf(b5Var.y()) : null);
                sb.append(": [");
                Iterator<Long> it = b5Var.z().iterator();
                int i11 = 0;
                while (it.hasNext()) {
                    long jLongValue = it.next().longValue();
                    int i12 = i11 + 1;
                    if (i11 != 0) {
                        sb.append(", ");
                    }
                    sb.append(jLongValue);
                    i11 = i12;
                }
                sb.append("]");
                i9 = i10;
            }
            sb.append("}\n");
        }
        q(sb, 3);
        sb.append("}\n");
    }

    private static final void t(StringBuilder sb, int i2, String str, Object obj) {
        if (obj == null) {
            return;
        }
        q(sb, i2 + 1);
        sb.append(str);
        sb.append(": ");
        sb.append(obj);
        sb.append('\n');
    }

    private static final void u(StringBuilder sb, int i2, String str, com.google.android.gms.internal.measurement.n3 n3Var) {
        if (n3Var == null) {
            return;
        }
        q(sb, i2);
        sb.append(str);
        sb.append(" {\n");
        if (n3Var.x()) {
            t(sb, i2, "comparison_type", n3Var.y().name());
        }
        if (n3Var.z()) {
            t(sb, i2, "match_as_float", Boolean.valueOf(n3Var.A()));
        }
        if (n3Var.B()) {
            t(sb, i2, "comparison_value", n3Var.C());
        }
        if (n3Var.D()) {
            t(sb, i2, "min_comparison_value", n3Var.E());
        }
        if (n3Var.G()) {
            t(sb, i2, "max_comparison_value", n3Var.H());
        }
        q(sb, i2);
        sb.append("}\n");
    }

    final String A(com.google.android.gms.internal.measurement.p3 p3Var) {
        if (p3Var == null) {
            return "null";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("\nproperty_filter {\n");
        if (p3Var.x()) {
            t(sb, 0, "filter_id", Integer.valueOf(p3Var.y()));
        }
        t(sb, 0, "property_name", this.a.H().r(p3Var.z()));
        String strR = r(p3Var.B(), p3Var.C(), p3Var.E());
        if (!strR.isEmpty()) {
            t(sb, 0, "filter_type", strR);
        }
        p(sb, 1, p3Var.A());
        sb.append("}\n");
        return sb.toString();
    }

    final <T extends Parcelable> T B(byte[] bArr, Parcelable.Creator<T> creator) {
        if (bArr == null) {
            return null;
        }
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.unmarshall(bArr, 0, bArr.length);
            parcelObtain.setDataPosition(0);
            return creator.createFromParcel(parcelObtain);
        } catch (com.google.android.gms.common.internal.y.b.a unused) {
            this.a.d().o().a("Failed to load parcelable from buffer");
            return null;
        } finally {
            parcelObtain.recycle();
        }
    }

    final List<Long> F(List<Long> list, List<Integer> list2) {
        int i2;
        ArrayList arrayList = new ArrayList(list);
        for (Integer num : list2) {
            if (num.intValue() < 0) {
                this.a.d().r().b("Ignoring negative bit index to be cleared", num);
            } else {
                int iIntValue = num.intValue() / 64;
                if (iIntValue >= arrayList.size()) {
                    this.a.d().r().c("Ignoring bit index greater than bitSet size", num, Integer.valueOf(arrayList.size()));
                } else {
                    arrayList.set(iIntValue, Long.valueOf(((Long) arrayList.get(iIntValue)).longValue() & ((1 << (num.intValue() % 64)) ^ (-1))));
                }
            }
        }
        int size = arrayList.size();
        int size2 = arrayList.size() - 1;
        while (true) {
            int i3 = size2;
            i2 = size;
            size = i3;
            if (size < 0 || ((Long) arrayList.get(size)).longValue() != 0) {
                break;
            }
            size2 = size - 1;
        }
        return arrayList.subList(0, i2);
    }

    final boolean G(long j2, long j3) {
        return j2 == 0 || j3 <= 0 || Math.abs(this.a.e().a() - j2) > j3;
    }

    final long H(byte[] bArr) {
        com.google.android.gms.common.internal.q.k(bArr);
        this.a.G().h();
        MessageDigest messageDigestB = ca.B();
        if (messageDigestB != null) {
            return ca.C(messageDigestB.digest(bArr));
        }
        this.a.d().o().a("Failed to get MD5");
        return 0L;
    }

    final byte[] I(byte[] bArr) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(bArr);
            gZIPOutputStream.close();
            byteArrayOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            this.a.d().o().b("Failed to gzip content", e);
            throw e;
        }
    }

    @Override // com.google.android.gms.measurement.internal.m9
    protected final boolean k() {
        return false;
    }

    final void v(com.google.android.gms.internal.measurement.c5 c5Var, Object obj) {
        com.google.android.gms.common.internal.q.k(obj);
        c5Var.z();
        c5Var.B();
        c5Var.D();
        if (obj instanceof String) {
            c5Var.y((String) obj);
            return;
        }
        if (obj instanceof Long) {
            c5Var.A(((Long) obj).longValue());
        } else if (obj instanceof Double) {
            c5Var.C(((Double) obj).doubleValue());
        } else {
            this.a.d().o().b("Ignoring invalid (type) user attribute value", obj);
        }
    }

    final void w(com.google.android.gms.internal.measurement.n4 n4Var, Object obj) {
        com.google.android.gms.common.internal.q.k(obj);
        n4Var.y();
        n4Var.A();
        n4Var.C();
        n4Var.H();
        if (obj instanceof String) {
            n4Var.x((String) obj);
            return;
        }
        if (obj instanceof Long) {
            n4Var.z(((Long) obj).longValue());
            return;
        }
        if (obj instanceof Double) {
            n4Var.B(((Double) obj).doubleValue());
        } else if (obj instanceof Bundle[]) {
            n4Var.G(L((Bundle[]) obj));
        } else {
            this.a.d().o().b("Ignoring invalid (type) event param value", obj);
        }
    }

    final com.google.android.gms.internal.measurement.k4 x(o oVar) {
        com.google.android.gms.internal.measurement.j4 j4VarI = com.google.android.gms.internal.measurement.k4.I();
        j4VarI.M(oVar.e);
        q qVar = new q(oVar.f);
        while (qVar.hasNext()) {
            String next = qVar.next();
            com.google.android.gms.internal.measurement.n4 n4VarK = com.google.android.gms.internal.measurement.o4.K();
            n4VarK.w(next);
            Object objF = oVar.f.f(next);
            com.google.android.gms.common.internal.q.k(objF);
            w(n4VarK, objF);
            j4VarI.C(n4VarK);
        }
        return j4VarI.p();
    }

    final String y(com.google.android.gms.internal.measurement.q4 q4Var) {
        if (q4Var == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("\nbatch {\n");
        for (com.google.android.gms.internal.measurement.s4 s4Var : q4Var.x()) {
            if (s4Var != null) {
                q(sb, 1);
                sb.append("bundle {\n");
                if (s4Var.a0()) {
                    t(sb, 1, "protocol_version", Integer.valueOf(s4Var.a1()));
                }
                t(sb, 1, "platform", s4Var.G1());
                if (s4Var.z()) {
                    t(sb, 1, "gmp_version", Long.valueOf(s4Var.A()));
                }
                if (s4Var.B()) {
                    t(sb, 1, "uploading_gmp_version", Long.valueOf(s4Var.C()));
                }
                if (s4Var.F0()) {
                    t(sb, 1, "dynamite_version", Long.valueOf(s4Var.G0()));
                }
                if (s4Var.W()) {
                    t(sb, 1, "config_version", Long.valueOf(s4Var.X()));
                }
                t(sb, 1, "gmp_app_id", s4Var.N());
                t(sb, 1, "admob_app_id", s4Var.E0());
                t(sb, 1, "app_id", s4Var.x());
                t(sb, 1, "app_version", s4Var.y());
                if (s4Var.U()) {
                    t(sb, 1, "app_version_major", Integer.valueOf(s4Var.V()));
                }
                t(sb, 1, "firebase_instance_id", s4Var.S());
                if (s4Var.I()) {
                    t(sb, 1, "dev_cert_hash", Long.valueOf(s4Var.J()));
                }
                t(sb, 1, "app_store", s4Var.M1());
                if (s4Var.w1()) {
                    t(sb, 1, "upload_timestamp_millis", Long.valueOf(s4Var.x1()));
                }
                if (s4Var.y1()) {
                    t(sb, 1, "start_timestamp_millis", Long.valueOf(s4Var.z1()));
                }
                if (s4Var.A1()) {
                    t(sb, 1, "end_timestamp_millis", Long.valueOf(s4Var.B1()));
                }
                if (s4Var.C1()) {
                    t(sb, 1, "previous_bundle_start_timestamp_millis", Long.valueOf(s4Var.D1()));
                }
                if (s4Var.E1()) {
                    t(sb, 1, "previous_bundle_end_timestamp_millis", Long.valueOf(s4Var.F1()));
                }
                t(sb, 1, "app_instance_id", s4Var.H());
                t(sb, 1, "resettable_device_id", s4Var.D());
                t(sb, 1, "ds_id", s4Var.B0());
                if (s4Var.E()) {
                    t(sb, 1, "limited_ad_tracking", Boolean.valueOf(s4Var.G()));
                }
                t(sb, 1, "os_version", s4Var.H1());
                t(sb, 1, "device_model", s4Var.I1());
                t(sb, 1, "user_default_language", s4Var.J1());
                if (s4Var.K1()) {
                    t(sb, 1, "time_zone_offset_minutes", Integer.valueOf(s4Var.L1()));
                }
                if (s4Var.K()) {
                    t(sb, 1, "bundle_sequential_index", Integer.valueOf(s4Var.L()));
                }
                if (s4Var.P()) {
                    t(sb, 1, "service_upload", Boolean.valueOf(s4Var.Q()));
                }
                t(sb, 1, "health_monitor", s4Var.M());
                if (!this.a.z().w(null, f3.t0) && s4Var.Y() && s4Var.Z() != 0) {
                    t(sb, 1, "android_id", Long.valueOf(s4Var.Z()));
                }
                if (s4Var.C0()) {
                    t(sb, 1, "retry_counter", Integer.valueOf(s4Var.D0()));
                }
                if (s4Var.I0()) {
                    t(sb, 1, "consent_signals", s4Var.J0());
                }
                List<com.google.android.gms.internal.measurement.d5> listT1 = s4Var.t1();
                if (listT1 != null) {
                    for (com.google.android.gms.internal.measurement.d5 d5Var : listT1) {
                        if (d5Var != null) {
                            q(sb, 2);
                            sb.append("user_property {\n");
                            t(sb, 2, "set_timestamp_millis", d5Var.x() ? Long.valueOf(d5Var.y()) : null);
                            t(sb, 2, "name", this.a.H().r(d5Var.z()));
                            t(sb, 2, "string_value", d5Var.B());
                            t(sb, 2, "int_value", d5Var.C() ? Long.valueOf(d5Var.D()) : null);
                            t(sb, 2, "double_value", d5Var.E() ? Double.valueOf(d5Var.G()) : null);
                            q(sb, 2);
                            sb.append("}\n");
                        }
                    }
                }
                List<com.google.android.gms.internal.measurement.g4> listR = s4Var.R();
                if (listR != null) {
                    for (com.google.android.gms.internal.measurement.g4 g4Var : listR) {
                        if (g4Var != null) {
                            q(sb, 2);
                            sb.append("audience_membership {\n");
                            if (g4Var.x()) {
                                t(sb, 2, "audience_id", Integer.valueOf(g4Var.y()));
                            }
                            if (g4Var.C()) {
                                t(sb, 2, "new_audience", Boolean.valueOf(g4Var.D()));
                            }
                            s(sb, 2, "current_data", g4Var.z());
                            if (g4Var.A()) {
                                s(sb, 2, "previous_data", g4Var.B());
                            }
                            q(sb, 2);
                            sb.append("}\n");
                        }
                    }
                }
                List<com.google.android.gms.internal.measurement.k4> listQ1 = s4Var.q1();
                if (listQ1 != null) {
                    for (com.google.android.gms.internal.measurement.k4 k4Var : listQ1) {
                        if (k4Var != null) {
                            q(sb, 2);
                            sb.append("event {\n");
                            t(sb, 2, "name", this.a.H().p(k4Var.A()));
                            if (k4Var.B()) {
                                t(sb, 2, "timestamp_millis", Long.valueOf(k4Var.C()));
                            }
                            if (k4Var.D()) {
                                t(sb, 2, "previous_timestamp_millis", Long.valueOf(k4Var.E()));
                            }
                            if (k4Var.G()) {
                                t(sb, 2, "count", Integer.valueOf(k4Var.H()));
                            }
                            if (k4Var.y() != 0) {
                                o(sb, 2, k4Var.x());
                            }
                            q(sb, 2);
                            sb.append("}\n");
                        }
                    }
                }
                q(sb, 1);
                sb.append("}\n");
            }
        }
        sb.append("}\n");
        return sb.toString();
    }

    final String z(com.google.android.gms.internal.measurement.h3 h3Var) {
        if (h3Var == null) {
            return "null";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("\nevent_filter {\n");
        if (h3Var.x()) {
            t(sb, 0, "filter_id", Integer.valueOf(h3Var.y()));
        }
        t(sb, 0, "event_name", this.a.H().p(h3Var.z()));
        String strR = r(h3Var.G(), h3Var.H(), h3Var.J());
        if (!strR.isEmpty()) {
            t(sb, 0, "filter_type", strR);
        }
        if (h3Var.D()) {
            u(sb, 1, "event_count_filter", h3Var.E());
        }
        if (h3Var.B() > 0) {
            sb.append("  filters {\n");
            Iterator<com.google.android.gms.internal.measurement.j3> it = h3Var.A().iterator();
            while (it.hasNext()) {
                p(sb, 2, it.next());
            }
        }
        q(sb, 1);
        sb.append("}\n}\n");
        return sb.toString();
    }
}
