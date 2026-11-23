package l.y;

import l.y.c.c;
import l.y.c.i;

/* JADX INFO: loaded from: classes.dex */
public final class a {
    public static final <T> Class<T> a(l.b0.a<T> aVar) {
        String name;
        i.e(aVar, "<this>");
        Class<T> cls = (Class<T>) ((c) aVar).b();
        if (!cls.isPrimitive() || (name = cls.getName()) == null) {
            return cls;
        }
        switch (name.hashCode()) {
            case -1325958191:
                return !name.equals("double") ? cls : Double.class;
            case 104431:
                return !name.equals("int") ? cls : Integer.class;
            case 3039496:
                return !name.equals("byte") ? cls : Byte.class;
            case 3052374:
                return !name.equals("char") ? cls : Character.class;
            case 3327612:
                return !name.equals("long") ? cls : Long.class;
            case 3625364:
                return !name.equals("void") ? cls : Void.class;
            case 64711720:
                return !name.equals("boolean") ? cls : Boolean.class;
            case 97526364:
                return !name.equals("float") ? cls : Float.class;
            case 109413500:
                return !name.equals("short") ? cls : Short.class;
            default:
                return cls;
        }
    }
}
