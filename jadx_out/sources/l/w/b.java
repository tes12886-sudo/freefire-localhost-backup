package l.w;

import l.d0.q;
import l.y.c.i;

/* JADX INFO: loaded from: classes.dex */
public final class b {
    public static final a a;

    /* JADX WARN: Code duplicated, block: B:35:0x00c0 A[Catch: ClassCastException -> 0x00c5, ClassNotFoundException -> 0x00fb, TRY_ENTER, TryCatch #2 {ClassCastException -> 0x00c5, blocks: (B:35:0x00c0, B:38:0x00c7, B:39:0x00cc), top: B:62:0x00be, outer: #7 }] */
    /* JADX WARN: Code duplicated, block: B:38:0x00c7 A[Catch: ClassCastException -> 0x00c5, ClassNotFoundException -> 0x00fb, TryCatch #2 {ClassCastException -> 0x00c5, blocks: (B:35:0x00c0, B:38:0x00c7, B:39:0x00cc), top: B:62:0x00be, outer: #7 }] */
    /* JADX WARN: Code duplicated, block: B:66:0x00b1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    static {
        a aVar;
        Object objNewInstance;
        int iA = a();
        if (iA >= 65544 || iA < 65536) {
            try {
                Object objNewInstance2 = Class.forName("l.w.e.a").newInstance();
                i.d(objNewInstance2, "forName(\"kotlin.internal…entations\").newInstance()");
                try {
                    try {
                        if (objNewInstance2 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.internal.PlatformImplementations");
                        }
                        aVar = (a) objNewInstance2;
                    } catch (ClassNotFoundException unused) {
                        if (iA < 65543) {
                            try {
                                objNewInstance = Class.forName("l.w.d.a").newInstance();
                                i.d(objNewInstance, "forName(\"kotlin.internal…entations\").newInstance()");
                                try {
                                    try {
                                        if (objNewInstance == null) {
                                            throw new NullPointerException("null cannot be cast to non-null type kotlin.internal.PlatformImplementations");
                                        }
                                        aVar = (a) objNewInstance;
                                    } catch (ClassCastException e) {
                                        ClassLoader classLoader = objNewInstance.getClass().getClassLoader();
                                        ClassLoader classLoader2 = a.class.getClassLoader();
                                        if (i.a(classLoader, classLoader2)) {
                                            throw e;
                                        }
                                        throw new ClassNotFoundException("Instance class was loaded from a different classloader: " + classLoader + ", base type classloader: " + classLoader2, e);
                                    }
                                } catch (ClassNotFoundException unused2) {
                                    aVar = new a();
                                }
                            } catch (ClassNotFoundException unused3) {
                                Object objNewInstance3 = Class.forName("kotlin.internal.JRE7PlatformImplementations").newInstance();
                                i.d(objNewInstance3, "forName(\"kotlin.internal…entations\").newInstance()");
                                try {
                                    if (objNewInstance3 == null) {
                                        throw new NullPointerException("null cannot be cast to non-null type kotlin.internal.PlatformImplementations");
                                    }
                                    aVar = (a) objNewInstance3;
                                } catch (ClassCastException e2) {
                                    ClassLoader classLoader3 = objNewInstance3.getClass().getClassLoader();
                                    ClassLoader classLoader4 = a.class.getClassLoader();
                                    if (i.a(classLoader3, classLoader4)) {
                                        throw e2;
                                    }
                                    throw new ClassNotFoundException("Instance class was loaded from a different classloader: " + classLoader3 + ", base type classloader: " + classLoader4, e2);
                                }
                            }
                        } else {
                            objNewInstance = Class.forName("l.w.d.a").newInstance();
                            i.d(objNewInstance, "forName(\"kotlin.internal…entations\").newInstance()");
                            if (objNewInstance == null) {
                                throw new NullPointerException("null cannot be cast to non-null type kotlin.internal.PlatformImplementations");
                            }
                            aVar = (a) objNewInstance;
                        }
                    }
                } catch (ClassCastException e3) {
                    ClassLoader classLoader5 = objNewInstance2.getClass().getClassLoader();
                    ClassLoader classLoader6 = a.class.getClassLoader();
                    if (i.a(classLoader5, classLoader6)) {
                        throw e3;
                    }
                    throw new ClassNotFoundException("Instance class was loaded from a different classloader: " + classLoader5 + ", base type classloader: " + classLoader6, e3);
                }
            } catch (ClassNotFoundException unused4) {
                Object objNewInstance4 = Class.forName("kotlin.internal.JRE8PlatformImplementations").newInstance();
                i.d(objNewInstance4, "forName(\"kotlin.internal…entations\").newInstance()");
                try {
                    if (objNewInstance4 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.internal.PlatformImplementations");
                    }
                    aVar = (a) objNewInstance4;
                } catch (ClassCastException e4) {
                    ClassLoader classLoader7 = objNewInstance4.getClass().getClassLoader();
                    ClassLoader classLoader8 = a.class.getClassLoader();
                    if (i.a(classLoader7, classLoader8)) {
                        throw e4;
                    }
                    throw new ClassNotFoundException("Instance class was loaded from a different classloader: " + classLoader7 + ", base type classloader: " + classLoader8, e4);
                }
            }
        } else if (iA < 65543 || iA < 65536) {
            objNewInstance = Class.forName("l.w.d.a").newInstance();
            i.d(objNewInstance, "forName(\"kotlin.internal…entations\").newInstance()");
            if (objNewInstance == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.internal.PlatformImplementations");
            }
            aVar = (a) objNewInstance;
        } else {
            aVar = new a();
        }
        a = aVar;
    }

    private static final int a() {
        String property = System.getProperty("java.specification.version");
        if (property == null) {
            return 65542;
        }
        int iM = q.M(property, '.', 0, false, 6, null);
        if (iM < 0) {
            try {
                return Integer.parseInt(property) * 65536;
            } catch (NumberFormatException unused) {
                return 65542;
            }
        }
        int i2 = iM + 1;
        int iM2 = q.M(property, '.', i2, false, 4, null);
        if (iM2 < 0) {
            iM2 = property.length();
        }
        String strSubstring = property.substring(0, iM);
        i.d(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        String strSubstring2 = property.substring(i2, iM2);
        i.d(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
        try {
            return (Integer.parseInt(strSubstring) * 65536) + Integer.parseInt(strSubstring2);
        } catch (NumberFormatException unused2) {
            return 65542;
        }
    }
}
