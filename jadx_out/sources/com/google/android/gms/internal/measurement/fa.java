package com.google.android.gms.internal.measurement;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

/* JADX INFO: loaded from: classes.dex */
final class fa {
    static String a(da daVar, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(str);
        c(daVar, sb, 0);
        return sb.toString();
    }

    static final void b(StringBuilder sb, int i2, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                b(sb, i2, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                b(sb, i2, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb.append('\n');
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            sb.append(' ');
        }
        sb.append(str);
        if (obj instanceof String) {
            sb.append(": \"");
            sb.append(bb.a(z7.r((String) obj)));
            sb.append('\"');
            return;
        }
        if (obj instanceof z7) {
            sb.append(": \"");
            sb.append(bb.a((z7) obj));
            sb.append('\"');
            return;
        }
        if (obj instanceof z8) {
            sb.append(" {");
            c((z8) obj, sb, i2 + 2);
            sb.append("\n");
            while (i3 < i2) {
                sb.append(' ');
                i3++;
            }
            sb.append("}");
            return;
        }
        if (!(obj instanceof Map.Entry)) {
            sb.append(": ");
            sb.append(obj.toString());
            return;
        }
        sb.append(" {");
        Map.Entry entry = (Map.Entry) obj;
        int i5 = i2 + 2;
        b(sb, i5, "key", entry.getKey());
        b(sb, i5, "value", entry.getValue());
        sb.append("\n");
        while (i3 < i2) {
            sb.append(' ');
            i3++;
        }
        sb.append("}");
    }

    private static void c(da daVar, StringBuilder sb, int i2) {
        Object obj;
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        TreeSet<String> treeSet = new TreeSet();
        for (Method method : daVar.getClass().getDeclaredMethods()) {
            map2.put(method.getName(), method);
            if (method.getParameterTypes().length == 0) {
                map.put(method.getName(), method);
                if (method.getName().startsWith("get")) {
                    treeSet.add(method.getName());
                }
            }
        }
        for (String str : treeSet) {
            String strSubstring = str.startsWith("get") ? str.substring(3) : str;
            if (strSubstring.endsWith("List") && !strSubstring.endsWith("OrBuilderList") && !strSubstring.equals("List")) {
                String strValueOf = String.valueOf(strSubstring.substring(0, 1).toLowerCase());
                String strValueOf2 = String.valueOf(strSubstring.substring(1, strSubstring.length() - 4));
                String strConcat = strValueOf2.length() != 0 ? strValueOf.concat(strValueOf2) : new String(strValueOf);
                Method method2 = (Method) map.get(str);
                if (method2 != null && method2.getReturnType().equals(List.class)) {
                    b(sb, i2, d(strConcat), z8.k(method2, daVar, new Object[0]));
                }
            }
            if (strSubstring.endsWith("Map") && !strSubstring.equals("Map")) {
                String strValueOf3 = String.valueOf(strSubstring.substring(0, 1).toLowerCase());
                String strValueOf4 = String.valueOf(strSubstring.substring(1, strSubstring.length() - 3));
                String strConcat2 = strValueOf4.length() != 0 ? strValueOf3.concat(strValueOf4) : new String(strValueOf3);
                Method method3 = (Method) map.get(str);
                if (method3 != null && method3.getReturnType().equals(Map.class) && !method3.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method3.getModifiers())) {
                    b(sb, i2, d(strConcat2), z8.k(method3, daVar, new Object[0]));
                }
            }
            String strValueOf5 = String.valueOf(strSubstring);
            if (((Method) map2.get(strValueOf5.length() != 0 ? "set".concat(strValueOf5) : new String("set"))) != null) {
                if (strSubstring.endsWith("Bytes")) {
                    String strValueOf6 = String.valueOf(strSubstring.substring(0, strSubstring.length() - 5));
                    if (!map.containsKey(strValueOf6.length() != 0 ? "get".concat(strValueOf6) : new String("get"))) {
                    }
                }
                String strValueOf7 = String.valueOf(strSubstring.substring(0, 1).toLowerCase());
                String strValueOf8 = String.valueOf(strSubstring.substring(1));
                String strConcat3 = strValueOf8.length() != 0 ? strValueOf7.concat(strValueOf8) : new String(strValueOf7);
                String strValueOf9 = String.valueOf(strSubstring);
                Method method4 = (Method) map.get(strValueOf9.length() != 0 ? "get".concat(strValueOf9) : new String("get"));
                String strValueOf10 = String.valueOf(strSubstring);
                Method method5 = (Method) map.get(strValueOf10.length() != 0 ? "has".concat(strValueOf10) : new String("has"));
                if (method4 != null) {
                    Object objK = z8.k(method4, daVar, new Object[0]);
                    if (method5 == null) {
                        if (objK instanceof Boolean) {
                            if (((Boolean) objK).booleanValue()) {
                                b(sb, i2, d(strConcat3), objK);
                            }
                        } else if (objK instanceof Integer) {
                            if (((Integer) objK).intValue() != 0) {
                                b(sb, i2, d(strConcat3), objK);
                            }
                        } else if (objK instanceof Float) {
                            if (((Float) objK).floatValue() != 0.0f) {
                                b(sb, i2, d(strConcat3), objK);
                            }
                        } else if (!(objK instanceof Double)) {
                            if (objK instanceof String) {
                                obj = "";
                            } else if (objK instanceof z7) {
                                obj = z7.b;
                            } else if (objK instanceof da) {
                                if (objK != ((da) objK).h()) {
                                    b(sb, i2, d(strConcat3), objK);
                                }
                            } else if (!(objK instanceof Enum) || ((Enum) objK).ordinal() != 0) {
                                b(sb, i2, d(strConcat3), objK);
                            }
                            if (!objK.equals(obj)) {
                                b(sb, i2, d(strConcat3), objK);
                            }
                        } else if (((Double) objK).doubleValue() != 0.0d) {
                            b(sb, i2, d(strConcat3), objK);
                        }
                    } else if (((Boolean) z8.k(method5, daVar, new Object[0])).booleanValue()) {
                        b(sb, i2, d(strConcat3), objK);
                    }
                }
            }
        }
        if (daVar instanceof x8) {
            q8 q8Var = ((x8) daVar).zza;
            throw null;
        }
        eb ebVar = ((z8) daVar).zzc;
        if (ebVar != null) {
            ebVar.g(sb, i2);
        }
    }

    private static final String d(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < str.length(); i2++) {
            char cCharAt = str.charAt(i2);
            if (Character.isUpperCase(cCharAt)) {
                sb.append("_");
            }
            sb.append(Character.toLowerCase(cCharAt));
        }
        return sb.toString();
    }
}
