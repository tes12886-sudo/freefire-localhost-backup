package j.d.d;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes.dex */
public final class p extends k {
    private final Object a;

    public p(Boolean bool) {
        j.d.d.z.a.b(bool);
        this.a = bool;
    }

    public p(Number number) {
        j.d.d.z.a.b(number);
        this.a = number;
    }

    public p(String str) {
        j.d.d.z.a.b(str);
        this.a = str;
    }

    private static boolean w(p pVar) {
        Object obj = pVar.a;
        if (!(obj instanceof Number)) {
            return false;
        }
        Number number = (Number) obj;
        return (number instanceof BigInteger) || (number instanceof Long) || (number instanceof Integer) || (number instanceof Short) || (number instanceof Byte);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || p.class != obj.getClass()) {
            return false;
        }
        p pVar = (p) obj;
        if (this.a == null) {
            return pVar.a == null;
        }
        if (w(this) && w(pVar)) {
            return u().longValue() == pVar.u().longValue();
        }
        Object obj2 = this.a;
        if (!(obj2 instanceof Number) || !(pVar.a instanceof Number)) {
            return obj2.equals(pVar.a);
        }
        double dDoubleValue = u().doubleValue();
        double dDoubleValue2 = pVar.u().doubleValue();
        if (dDoubleValue != dDoubleValue2) {
            return Double.isNaN(dDoubleValue) && Double.isNaN(dDoubleValue2);
        }
        return true;
    }

    @Override // j.d.d.k
    public String f() {
        if (x()) {
            return u().toString();
        }
        return v() ? ((Boolean) this.a).toString() : (String) this.a;
    }

    public int hashCode() {
        long jDoubleToLongBits;
        if (this.a == null) {
            return 31;
        }
        if (w(this)) {
            jDoubleToLongBits = u().longValue();
        } else {
            Object obj = this.a;
            if (!(obj instanceof Number)) {
                return obj.hashCode();
            }
            jDoubleToLongBits = Double.doubleToLongBits(u().doubleValue());
        }
        return (int) ((jDoubleToLongBits >>> 32) ^ jDoubleToLongBits);
    }

    public boolean q() {
        return v() ? ((Boolean) this.a).booleanValue() : Boolean.parseBoolean(f());
    }

    public double r() {
        return x() ? u().doubleValue() : Double.parseDouble(f());
    }

    public int s() {
        return x() ? u().intValue() : Integer.parseInt(f());
    }

    public long t() {
        return x() ? u().longValue() : Long.parseLong(f());
    }

    public Number u() {
        Object obj = this.a;
        return obj instanceof String ? new j.d.d.z.g((String) this.a) : (Number) obj;
    }

    public boolean v() {
        return this.a instanceof Boolean;
    }

    public boolean x() {
        return this.a instanceof Number;
    }

    public boolean y() {
        return this.a instanceof String;
    }
}
