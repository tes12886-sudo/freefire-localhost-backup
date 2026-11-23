package com.google.android.datatransport.cct;

import com.google.android.datatransport.h.g;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class c implements g {
    static final String c = e.a("hts/frbslgiggolai.o/0clgbthfra=snpoo", "tp:/ieaeogn.ogepscmvc/o/ac?omtjo_rt3");
    static final String d;
    private static final String e;
    private static final Set<com.google.android.datatransport.b> f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final c f833g;
    private final String a;
    private final String b;

    static {
        String strA = e.a("hts/frbslgigp.ogepscmv/ieo/eaybtho", "tp:/ieaeogn-agolai.o/1frlglgc/aclg");
        d = strA;
        String strA2 = e.a("AzSCki82AwsLzKd5O8zo", "IayckHiZRO1EFl1aGoK");
        e = strA2;
        f = Collections.unmodifiableSet(new HashSet(Arrays.asList(com.google.android.datatransport.b.b("proto"), com.google.android.datatransport.b.b("json"))));
        f833g = new c(strA, strA2);
    }

    public c(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public static c e(byte[] bArr) {
        String str = new String(bArr, Charset.forName("UTF-8"));
        if (!str.startsWith("1$")) {
            throw new IllegalArgumentException("Version marker missing from extras");
        }
        String[] strArrSplit = str.substring(2).split(Pattern.quote("\\"), 2);
        if (strArrSplit.length != 2) {
            throw new IllegalArgumentException("Extra is not a valid encoded LegacyFlgDestination");
        }
        String str2 = strArrSplit[0];
        if (str2.isEmpty()) {
            throw new IllegalArgumentException("Missing endpoint in CCTDestination extras");
        }
        String str3 = strArrSplit[1];
        if (str3.isEmpty()) {
            str3 = null;
        }
        return new c(str2, str3);
    }

    @Override // com.google.android.datatransport.h.g
    public Set<com.google.android.datatransport.b> a() {
        return f;
    }

    @Override // com.google.android.datatransport.h.f
    public String b() {
        return "cct";
    }

    @Override // com.google.android.datatransport.h.f
    public byte[] c() {
        return d();
    }

    public byte[] d() {
        String str = this.b;
        if (str == null && this.a == null) {
            return null;
        }
        Object[] objArr = new Object[4];
        objArr[0] = "1$";
        objArr[1] = this.a;
        objArr[2] = "\\";
        if (str == null) {
            str = "";
        }
        objArr[3] = str;
        return String.format("%s%s%s%s", objArr).getBytes(Charset.forName("UTF-8"));
    }

    public String f() {
        return this.b;
    }

    public String g() {
        return this.a;
    }
}
