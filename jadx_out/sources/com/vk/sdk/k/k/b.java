package com.vk.sdk.k.k;

import android.os.Parcelable;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.ParameterizedType;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
class b {
    private static Object a(JSONArray jSONArray, Class cls) throws JSONException {
        Object objNewInstance = Array.newInstance(cls.getComponentType(), jSONArray.length());
        Class<?> componentType = cls.getComponentType();
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            try {
                Object objOpt = jSONArray.opt(i2);
                if (g.class.isAssignableFrom(componentType) && (objOpt instanceof JSONObject)) {
                    objOpt = ((g) componentType.newInstance()).c((JSONObject) objOpt);
                }
                Array.set(objNewInstance, i2, objOpt);
            } catch (IllegalAccessException e) {
                throw new JSONException(e.getMessage());
            } catch (IllegalArgumentException e2) {
                throw new JSONException(e2.getMessage());
            } catch (InstantiationException e3) {
                throw new JSONException(e3.getMessage());
            }
        }
        return objNewInstance;
    }

    public static boolean b(JSONObject jSONObject, String str) {
        return jSONObject != null && jSONObject.optInt(str, 0) == 1;
    }

    public static int c(JSONObject jSONObject, String str) {
        if (jSONObject == null) {
            return 0;
        }
        return jSONObject.optInt(str, 0);
    }

    /* JADX WARN: Code duplicated, block: B:79:0x017e  */
    public static <T> T d(T t, JSONObject jSONObject) throws JSONException {
        s sVar;
        if (jSONObject.has("response")) {
            jSONObject = jSONObject.optJSONObject("response");
        }
        if (jSONObject == null) {
            return t;
        }
        for (Field field : t.getClass().getFields()) {
            boolean z = true;
            field.setAccessible(true);
            String name = field.getName();
            Class<?> type = field.getType();
            Object objOpt = jSONObject.opt(name);
            if (objOpt != null) {
                try {
                    if (type.isPrimitive() && (objOpt instanceof Number)) {
                        Number number = (Number) objOpt;
                        if (type.equals(Integer.TYPE)) {
                            field.setInt(t, number.intValue());
                        } else if (type.equals(Long.TYPE)) {
                            field.setLong(t, number.longValue());
                        } else if (type.equals(Float.TYPE)) {
                            field.setFloat(t, number.floatValue());
                        } else if (type.equals(Double.TYPE)) {
                            field.setDouble(t, number.doubleValue());
                        } else if (type.equals(Boolean.TYPE)) {
                            if (number.intValue() != 1) {
                                z = false;
                            }
                            field.setBoolean(t, z);
                        } else if (type.equals(Short.TYPE)) {
                            field.setShort(t, number.shortValue());
                        } else if (type.equals(Byte.TYPE)) {
                            field.setByte(t, number.byteValue());
                        }
                    } else {
                        Object obj = field.get(t);
                        if (!objOpt.getClass().equals(type)) {
                            if (type.isArray() && (objOpt instanceof JSONArray)) {
                                objOpt = a((JSONArray) objOpt, type);
                            } else if (u.class.isAssignableFrom(type) && (objOpt instanceof JSONArray)) {
                                objOpt = type.getConstructor(JSONArray.class).newInstance((JSONArray) objOpt);
                            } else if (r.class.isAssignableFrom(type) && (objOpt instanceof JSONArray)) {
                                objOpt = type.getConstructor(JSONArray.class).newInstance((JSONArray) objOpt);
                            } else if (s.class.equals(type)) {
                                Class cls = (Class) ((ParameterizedType) field.getGenericType()).getActualTypeArguments()[0];
                                if (g.class.isAssignableFrom(cls) && Parcelable.class.isAssignableFrom(cls) && a.class.isAssignableFrom(cls)) {
                                    if (objOpt instanceof JSONArray) {
                                        sVar = new s((JSONArray) objOpt, cls);
                                    } else if (objOpt instanceof JSONObject) {
                                        sVar = new s((JSONObject) objOpt, cls);
                                    } else {
                                        objOpt = obj;
                                    }
                                    objOpt = sVar;
                                } else {
                                    objOpt = obj;
                                }
                            } else if (g.class.isAssignableFrom(type) && (objOpt instanceof JSONObject)) {
                                objOpt = ((g) type.newInstance()).c((JSONObject) objOpt);
                            } else {
                                objOpt = obj;
                            }
                        }
                        field.set(t, objOpt);
                    }
                } catch (IllegalAccessException e) {
                    throw new JSONException(e.getMessage());
                } catch (InstantiationException e2) {
                    throw new JSONException(e2.getMessage());
                } catch (NoSuchMethodError e3) {
                    throw new JSONException(e3.getMessage());
                } catch (NoSuchMethodException e4) {
                    throw new JSONException(e4.getMessage());
                } catch (InvocationTargetException e5) {
                    throw new JSONException(e5.getMessage());
                }
            }
        }
        return t;
    }
}
