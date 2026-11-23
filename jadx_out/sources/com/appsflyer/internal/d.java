package com.appsflyer.internal;

/* JADX INFO: loaded from: classes.dex */
public class d {
    public static final int AppsFlyerConversionListener = 0;
    private static int AppsFlyerLib = 1;
    private static int onAppOpenAttribution;
    private static Object onAttributionFailure;
    public static byte[] onConversionDataFail;
    private static long onConversionDataSuccess;
    private static Object onDeepLinking;
    public static byte[] onDeepLinkingNative;
    public static final byte[] onValidateInApp = null;
    private static int onValidateInAppFailure;

    /* JADX WARN: Code duplicated, block: B:12:0x005d  */
    /* JADX WARN: Code duplicated, block: B:14:0x0063  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0063 -> B:15:0x0073). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$c(int r8, int r9, short r10) {
        /*
            int r0 = com.appsflyer.internal.d.onValidateInAppFailure
            r1 = r0 | 53
            int r1 = r1 << 1
            r0 = r0 ^ 53
            int r1 = r1 - r0
            int r0 = r1 % 128
            com.appsflyer.internal.d.AppsFlyerLib = r0
            int r1 = r1 % 2
            int r8 = r8 + 1
            byte[] r1 = com.appsflyer.internal.d.onValidateInApp
            int r9 = -r9
            r2 = r9 | 993(0x3e1, float:1.391E-42)
            int r2 = r2 << 1
            r9 = r9 ^ 993(0x3e1, float:1.391E-42)
            int r2 = r2 - r9
            int r9 = -r10
            r9 = r9 ^ (-1)
            int r9 = 119 - r9
            int r9 = r9 + (-1)
            byte[] r10 = new byte[r8]
            r3 = 6
            if (r1 != 0) goto L2a
            r4 = 45
            goto L2b
        L2a:
            r4 = 6
        L2b:
            r5 = 0
            if (r4 == r3) goto L47
            r9 = r0 ^ 69
            r3 = r0 & 69
            int r3 = r3 << 1
            int r9 = r9 + r3
            int r3 = r9 % 128
            com.appsflyer.internal.d.onValidateInAppFailure = r3
            int r9 = r9 % 2
            int r0 = r0 + 99
            int r9 = r0 % 128
            com.appsflyer.internal.d.onValidateInAppFailure = r9
            int r0 = r0 % 2
            r0 = 0
            r9 = r8
            r3 = r2
            goto L73
        L47:
            r0 = 0
            r7 = r9
            r9 = r8
            r8 = r7
        L4b:
            int r2 = r2 + 1
            byte r3 = (byte) r8
            r10[r0] = r3
            r3 = r0 ^ 118(0x76, float:1.65E-43)
            r0 = r0 & 118(0x76, float:1.65E-43)
            int r0 = r0 << 1
            int r3 = r3 + r0
            int r3 = r3 + (-116)
            int r3 = r3 + (-1)
            if (r3 != r9) goto L63
            java.lang.String r8 = new java.lang.String
            r8.<init>(r10, r5)
            return r8
        L63:
            r0 = r1[r2]
            int r4 = com.appsflyer.internal.d.AppsFlyerLib
            int r4 = r4 + 65
            int r6 = r4 % 128
            com.appsflyer.internal.d.onValidateInAppFailure = r6
            int r4 = r4 % 2
            r7 = r2
            r2 = r0
            r0 = r3
            r3 = r7
        L73:
            int r2 = -r2
            int r2 = -r2
            r2 = r2 ^ (-1)
            int r8 = r8 - r2
            int r8 = r8 + (-1)
            int r2 = com.appsflyer.internal.d.onValidateInAppFailure
            int r2 = r2 + 24
            int r2 = r2 + (-1)
            int r4 = r2 % 128
            com.appsflyer.internal.d.AppsFlyerLib = r4
            int r2 = r2 % 2
            r2 = r3
            goto L4b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.d.$$c(int, int, short):java.lang.String");
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 63831. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    static {
        /*
            Method dump skipped, instruction units count: 6383
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.d.<clinit>():void");
    }

    private d() {
    }

    public static int AFInAppEventType(Object obj) throws Throwable {
        Object obj2;
        int i2 = AppsFlyerLib;
        int i3 = (i2 ^ 45) + ((i2 & 45) << 1);
        onValidateInAppFailure = i3 % 128;
        if ((i3 % 2 != 0 ? 'H' : (char) 0) != 0) {
            obj2 = onDeepLinking;
            Object obj3 = null;
            super.hashCode();
        } else {
            obj2 = onDeepLinking;
        }
        int i4 = (onValidateInAppFailure + 66) - 1;
        AppsFlyerLib = i4 % 128;
        int i5 = i4 % 2;
        try {
            Object[] objArr = {obj};
            byte[] bArr = onValidateInApp;
            return ((Integer) Class.forName($$c((byte) (-bArr[427]), (short) 643, bArr[11]), true, (ClassLoader) onAttributionFailure).getMethod($$c(bArr[642], (short) 386, (byte) (-bArr[111])), Object.class).invoke(obj2, objArr)).intValue();
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    static void init$0() {
        int i2;
        int i3 = onValidateInAppFailure;
        int i4 = ((i3 | 91) << 1) - (i3 ^ 91);
        AppsFlyerLib = i4 % 128;
        if (!(i4 % 2 == 0)) {
            byte[] bArr = new byte[1012];
            System.arraycopy("\u0005õ\u001f\u008b÷\u0015ëÍ;\u0006¿\u00143ñ\u0000ÿ\róÿå%\u0002\u0005ÿß!þóü\f÷\u0015ëÍ>õ\rùÇ%&ú\u0001ñ\b\u0012ý\u0000ó\t\u0006Í/\u0000üýúþ\u0013õ\u0006ÿ\fþÂ2\u000f\u0000\u0003ó\u0006\rì\r½:\u0005\u0006ñ\rüó\u000bÃ5ÀR÷\u0015ëÍ@û\u0006¿\u00147ûñÝ3ñ\u0000ÿ\r\rö\u000eýúûÊA\u0004»\u00143ô\u0003øÀ2ï\r\u0001ö\u0006ÿ÷\u0015ëÍ;\u0006¿\u00147ûñÜ1\u0000ï\u0018Ð%\u0002\u0005ÿß!þóü\fý\u000b\nó\u0002ÃE\u0006ú\u0001ñ\bÁ\u001b%ß\u0018\b\u0002\u0003\u0007Ë!\u0013Ë)õ\u0012\u0000Ù#ò\u0003\u0001\róü\u0003â/÷\u0000\rþ\u000fÒ#\u0003ù\u000eÑ%\tû÷\u000bñþ\u000fÏ\u001e\u0002\u0005ýß%\tóü\u0003ý\u000b\nó\u0002ÃE\u0006ú\u0001ñ\bÁ\u0016!\u0013Î#\u0003ù\fõ\u0001ú\u0004þ\u0002\u0005ýý\u000b\nó\u0002ÃE\u0006ú\u0001ñ\bÁ\u0014\u001f\u0012òß!\u0013Ë)õ\u0012\u0000Ù#ò\u0003\u0001\rþ\u000fÏ,õ\u0001Þ\u001e\u0002\u0005ýß%\t\u0006õõ\u0005\u0003%Ó/\u0000Õ1ï\t\u0006à%÷õë\u0007é\bF\u0001±Fû\u000b\u0000öÿ\u0002\b\b\u00adLù\u0001\u000eµë\u0006ê\bë\u0004ì\bë\bè\b\fþÁ3\u000f\u0000\u0003ó\u0006\rì\r¼;\u0005\u0006ñ\rüó\u000bÂ4Â\u0000÷\u0015ëÍ>õ\rùÇ\u0015)õ\u0012\u0000Ù#ò\u0003\u0001\r\rö\u000eýúûÊ3\u000f\u0000¾\u0013/\u0000×%\u0003óÿ\u000b\u0007þ\u000fÑ3üñ\rüó\u000bç!û\u0003ï\u0006þß%\tóþ\u0011û\u0003\u00074\fþÂ2\u000f\u0000\u0003ó\u0006\rì\r½:\u0005\u0006ñ\rüó\u000bÃ3Ë÷\u0015ëÍ;\u0006¿\u0016\u001d\u0013íè%\u0002\u0005ÿß!þóü\f\u0003ò\u0003à!\u0013\rö\u000eýúûÊHóü\u0012·\u001d\u001a\u0014Ì1ï\t\u0006÷\u0015ëÍ;\u0006¿\u00147ûñÜ1\u0000ï\u0018Ö&ÿü\u0005ÿß!þóü\f\rö\u000eýúûÊA\u0004»\u0017)\bó\týÿÿø\t\u0006þ\u000fÙ\u0014\u0017Ó\u001a\u0014Ê,õ\u0001øþ\u0007þ\u000fÏ)õ\u0012\u0000Ù#ò\u0003\u0001\r5ý\u0013íÎ5ý\u0013íÎ\u0001\u0007ù\u000fñ\u0005\u0005\u001a\u0014ú\u0001û\u0003óò\u001bï\u000f\u0000õ\rþ\u000fÒþñ\u0007\u0014ê\u0005\u0006ó\u0013õ\rïç\u001dù\u0010ï\u0011\u0007×\u0011\u0013ôÝ'ù\bø\t\u0006ÿ\t\u0003\u0004ò4\fþÂ2\u000f\u0000\u0003ó\u0006\rì\r½:\u0005\u0006ñ\rüó\u000bÃ2Ì÷\u0015ëÍ;\u0006¿Fù\u0003ô\u0005\tþ\u000fÜ\"ý\u0001õ\r\u0002\u0005þ\u000fÍ!\u0011üý\tÿñë\u0011\u0013ô\fþÂ2\u000f\u0000\u0003ó\u0006\rì\r½:\u0005\u0006ñ\rüó\u000bÃ3Â\u0000\rö\u000eýúûÊ3\u000f\u0000¾\u0013\"\u0011õ\ró\u000b\u0005Û\u0014\nóü\u0003ë\u000b\tðê\u0017÷\u0015ëÍ;\u0006¿\u0018#\u0003ùê&ÿü\u0005ÿß!þóü\fþ\ré\u001b÷\u000bñ÷\u0015ëÍ;\u0006¿\u001b\u0006ö3ë\u0002\u000b\u0004õ\u0006ÿ\rö\u000eýúûÊFñ\u0013üº&\u0011\u0013üá\u001fõ\u0003\u0007ñ\u0013ôä\u001d\n\u0001þ\u000fÕ%û\u000bõø\u000bÕ/\u0000üýúþ\u0013õ\u0006ÿ÷\u0015ëÍ;\u0006¿\u0018#\u0003ùõ\u0012\u0001Õ%ö\u0001\u0013×\u0017ë\u0003í\b\u0012ý\u0000ó\t\u0006à\u0015\u0004øè\u001c\u0003\u0000ý\n÷\u0015ëÍ;\u0006¿\u0018#\u0003ùß!\u000eð\u000f÷\u0007\u0004û\u0003ûÓ7ûñÜ1\u0000ï\u0018\u0003ò\u0003ß)õ\u0012\u0000\fþÁ3\u000f\u0000\u0003ó\u0006\rì\rûï\u000fó\u0013õ\rïç\u001dù\u0010ï\u0011\u0007Ë%\tóþ\u0011û\u0003÷ü\u000e÷\u0015ëÍ;\u0006¿\u001b%\u0002\u0005ÿß!þóü\f".getBytes("ISO-8859-1"), 0, bArr, 0, 1012);
            onValidateInApp = bArr;
            i2 = 237;
        } else {
            byte[] bArr2 = new byte[1012];
            System.arraycopy("\u0005õ\u001f\u008b÷\u0015ëÍ;\u0006¿\u00143ñ\u0000ÿ\róÿå%\u0002\u0005ÿß!þóü\f÷\u0015ëÍ>õ\rùÇ%&ú\u0001ñ\b\u0012ý\u0000ó\t\u0006Í/\u0000üýúþ\u0013õ\u0006ÿ\fþÂ2\u000f\u0000\u0003ó\u0006\rì\r½:\u0005\u0006ñ\rüó\u000bÃ5ÀR÷\u0015ëÍ@û\u0006¿\u00147ûñÝ3ñ\u0000ÿ\r\rö\u000eýúûÊA\u0004»\u00143ô\u0003øÀ2ï\r\u0001ö\u0006ÿ÷\u0015ëÍ;\u0006¿\u00147ûñÜ1\u0000ï\u0018Ð%\u0002\u0005ÿß!þóü\fý\u000b\nó\u0002ÃE\u0006ú\u0001ñ\bÁ\u001b%ß\u0018\b\u0002\u0003\u0007Ë!\u0013Ë)õ\u0012\u0000Ù#ò\u0003\u0001\róü\u0003â/÷\u0000\rþ\u000fÒ#\u0003ù\u000eÑ%\tû÷\u000bñþ\u000fÏ\u001e\u0002\u0005ýß%\tóü\u0003ý\u000b\nó\u0002ÃE\u0006ú\u0001ñ\bÁ\u0016!\u0013Î#\u0003ù\fõ\u0001ú\u0004þ\u0002\u0005ýý\u000b\nó\u0002ÃE\u0006ú\u0001ñ\bÁ\u0014\u001f\u0012òß!\u0013Ë)õ\u0012\u0000Ù#ò\u0003\u0001\rþ\u000fÏ,õ\u0001Þ\u001e\u0002\u0005ýß%\t\u0006õõ\u0005\u0003%Ó/\u0000Õ1ï\t\u0006à%÷õë\u0007é\bF\u0001±Fû\u000b\u0000öÿ\u0002\b\b\u00adLù\u0001\u000eµë\u0006ê\bë\u0004ì\bë\bè\b\fþÁ3\u000f\u0000\u0003ó\u0006\rì\r¼;\u0005\u0006ñ\rüó\u000bÂ4Â\u0000÷\u0015ëÍ>õ\rùÇ\u0015)õ\u0012\u0000Ù#ò\u0003\u0001\r\rö\u000eýúûÊ3\u000f\u0000¾\u0013/\u0000×%\u0003óÿ\u000b\u0007þ\u000fÑ3üñ\rüó\u000bç!û\u0003ï\u0006þß%\tóþ\u0011û\u0003\u00074\fþÂ2\u000f\u0000\u0003ó\u0006\rì\r½:\u0005\u0006ñ\rüó\u000bÃ3Ë÷\u0015ëÍ;\u0006¿\u0016\u001d\u0013íè%\u0002\u0005ÿß!þóü\f\u0003ò\u0003à!\u0013\rö\u000eýúûÊHóü\u0012·\u001d\u001a\u0014Ì1ï\t\u0006÷\u0015ëÍ;\u0006¿\u00147ûñÜ1\u0000ï\u0018Ö&ÿü\u0005ÿß!þóü\f\rö\u000eýúûÊA\u0004»\u0017)\bó\týÿÿø\t\u0006þ\u000fÙ\u0014\u0017Ó\u001a\u0014Ê,õ\u0001øþ\u0007þ\u000fÏ)õ\u0012\u0000Ù#ò\u0003\u0001\r5ý\u0013íÎ5ý\u0013íÎ\u0001\u0007ù\u000fñ\u0005\u0005\u001a\u0014ú\u0001û\u0003óò\u001bï\u000f\u0000õ\rþ\u000fÒþñ\u0007\u0014ê\u0005\u0006ó\u0013õ\rïç\u001dù\u0010ï\u0011\u0007×\u0011\u0013ôÝ'ù\bø\t\u0006ÿ\t\u0003\u0004ò4\fþÂ2\u000f\u0000\u0003ó\u0006\rì\r½:\u0005\u0006ñ\rüó\u000bÃ2Ì÷\u0015ëÍ;\u0006¿Fù\u0003ô\u0005\tþ\u000fÜ\"ý\u0001õ\r\u0002\u0005þ\u000fÍ!\u0011üý\tÿñë\u0011\u0013ô\fþÂ2\u000f\u0000\u0003ó\u0006\rì\r½:\u0005\u0006ñ\rüó\u000bÃ3Â\u0000\rö\u000eýúûÊ3\u000f\u0000¾\u0013\"\u0011õ\ró\u000b\u0005Û\u0014\nóü\u0003ë\u000b\tðê\u0017÷\u0015ëÍ;\u0006¿\u0018#\u0003ùê&ÿü\u0005ÿß!þóü\fþ\ré\u001b÷\u000bñ÷\u0015ëÍ;\u0006¿\u001b\u0006ö3ë\u0002\u000b\u0004õ\u0006ÿ\rö\u000eýúûÊFñ\u0013üº&\u0011\u0013üá\u001fõ\u0003\u0007ñ\u0013ôä\u001d\n\u0001þ\u000fÕ%û\u000bõø\u000bÕ/\u0000üýúþ\u0013õ\u0006ÿ÷\u0015ëÍ;\u0006¿\u0018#\u0003ùõ\u0012\u0001Õ%ö\u0001\u0013×\u0017ë\u0003í\b\u0012ý\u0000ó\t\u0006à\u0015\u0004øè\u001c\u0003\u0000ý\n÷\u0015ëÍ;\u0006¿\u0018#\u0003ùß!\u000eð\u000f÷\u0007\u0004û\u0003ûÓ7ûñÜ1\u0000ï\u0018\u0003ò\u0003ß)õ\u0012\u0000\fþÁ3\u000f\u0000\u0003ó\u0006\rì\rûï\u000fó\u0013õ\rïç\u001dù\u0010ï\u0011\u0007Ë%\tóþ\u0011û\u0003÷ü\u000e÷\u0015ëÍ;\u0006¿\u001b%\u0002\u0005ÿß!þóü\f".getBytes("ISO-8859-1"), 0, bArr2, 0, 1012);
            onValidateInApp = bArr2;
            i2 = 20953;
        }
        AppsFlyerConversionListener = i2;
    }

    public static int values(int i2) throws Throwable {
        Object obj;
        int i3 = onValidateInAppFailure;
        int i4 = ((i3 | 33) << 1) - (i3 ^ 33);
        AppsFlyerLib = i4 % 128;
        if (!(i4 % 2 == 0)) {
            obj = onDeepLinking;
        } else {
            obj = onDeepLinking;
            int i5 = 18 / 0;
        }
        int i6 = (i3 + 56) - 1;
        AppsFlyerLib = i6 % 128;
        int i7 = i6 % 2;
        try {
            Object[] objArr = {Integer.valueOf(i2)};
            byte[] bArr = onValidateInApp;
            int iIntValue = ((Integer) Class.forName($$c((byte) (-bArr[427]), (short) 643, bArr[11]), true, (ClassLoader) onAttributionFailure).getMethod($$c(bArr[9], (short) 220, bArr[42]), Integer.TYPE).invoke(obj, objArr)).intValue();
            int i8 = onValidateInAppFailure;
            int i9 = (i8 ^ 125) + ((i8 & 125) << 1);
            AppsFlyerLib = i9 % 128;
            if ((i9 % 2 == 0 ? 'V' : (char) 3) == 3) {
                return iIntValue;
            }
            Object[] objArr2 = null;
            int length = objArr2.length;
            return iIntValue;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public static Object values(char c, int i2, int i3) throws Throwable {
        int i4 = AppsFlyerLib;
        int i5 = (i4 ^ 109) + ((i4 & 109) << 1);
        int i6 = i5 % 128;
        onValidateInAppFailure = i6;
        int i7 = i5 % 2;
        Object obj = onDeepLinking;
        int i8 = (i6 + 36) - 1;
        AppsFlyerLib = i8 % 128;
        int i9 = i8 % 2;
        try {
            Object[] objArr = {Character.valueOf(c), Integer.valueOf(i2), Integer.valueOf(i3)};
            byte[] bArr = onValidateInApp;
            Class<?> cls = Class.forName($$c((byte) (-bArr[427]), (short) 643, bArr[11]), true, (ClassLoader) onAttributionFailure);
            String str$$c = $$c(bArr[66], (short) 692, (byte) (-bArr[111]));
            Class<?> cls2 = Integer.TYPE;
            Object objInvoke = cls.getMethod(str$$c, Character.TYPE, cls2, cls2).invoke(obj, objArr);
            int i10 = AppsFlyerLib;
            int i11 = (i10 ^ 13) + ((i10 & 13) << 1);
            onValidateInAppFailure = i11 % 128;
            int i12 = i11 % 2;
            return objInvoke;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }
}
