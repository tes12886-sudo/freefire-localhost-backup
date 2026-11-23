package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
final class na implements aa {
    private final da a;
    private final String b;
    private final Object[] c;
    private final int d;

    na(da daVar, String str, Object[] objArr) {
        char cCharAt;
        this.a = daVar;
        this.b = str;
        this.c = objArr;
        int i2 = 1;
        try {
            cCharAt = str.charAt(0);
        } catch (StringIndexOutOfBoundsException unused) {
            char[] charArray = str.toCharArray();
            String str2 = new String(charArray);
            try {
                try {
                    cCharAt = str2.charAt(0);
                    str = str2;
                } catch (StringIndexOutOfBoundsException unused2) {
                    char[] cArr = new char[str2.length()];
                    str2.getChars(0, str2.length(), cArr, 0);
                    String str3 = new String(cArr);
                    try {
                        cCharAt = str3.charAt(0);
                        str = str3;
                    } catch (ArrayIndexOutOfBoundsException | StringIndexOutOfBoundsException e) {
                        e = e;
                        str2 = str3;
                        throw new IllegalStateException(String.format("Failed parsing '%s' with charArray.length of %d", str2, Integer.valueOf(charArray.length)), e);
                    }
                }
            } catch (ArrayIndexOutOfBoundsException e2) {
                e = e2;
                throw new IllegalStateException(String.format("Failed parsing '%s' with charArray.length of %d", str2, Integer.valueOf(charArray.length)), e);
            } catch (StringIndexOutOfBoundsException e3) {
                e = e3;
                throw new IllegalStateException(String.format("Failed parsing '%s' with charArray.length of %d", str2, Integer.valueOf(charArray.length)), e);
            }
        }
        if (cCharAt < 55296) {
            this.d = cCharAt;
            return;
        }
        int i3 = cCharAt & 8191;
        int i4 = 13;
        while (true) {
            int i5 = i2 + 1;
            char cCharAt2 = str.charAt(i2);
            if (cCharAt2 < 55296) {
                this.d = (cCharAt2 << i4) | i3;
                return;
            } else {
                i3 |= (cCharAt2 & 8191) << i4;
                i4 += 13;
                i2 = i5;
            }
        }
    }

    final String a() {
        return this.b;
    }

    @Override // com.google.android.gms.internal.measurement.aa
    public final int b() {
        return (this.d & 1) == 1 ? 1 : 2;
    }

    final Object[] c() {
        return this.c;
    }

    @Override // com.google.android.gms.internal.measurement.aa
    public final boolean zza() {
        return (this.d & 2) == 2;
    }

    @Override // com.google.android.gms.internal.measurement.aa
    public final da zzb() {
        return this.a;
    }
}
