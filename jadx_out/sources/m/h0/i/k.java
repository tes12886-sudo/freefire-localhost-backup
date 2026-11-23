package m.h0.i;

import java.net.ProtocolException;
import l.d0.p;
import m.a0;

/* JADX INFO: loaded from: classes.dex */
public final class k {
    public static final a d = new a(null);
    public final a0 a;
    public final int b;
    public final String c;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(l.y.c.f fVar) {
            this();
        }

        public final k a(String str) throws ProtocolException {
            a0 a0Var;
            String strSubstring;
            l.y.c.i.e(str, "statusLine");
            int i2 = 9;
            if (p.x(str, "HTTP/1.", false, 2, null)) {
                if (str.length() < 9 || str.charAt(8) != ' ') {
                    throw new ProtocolException(l.y.c.i.k("Unexpected status line: ", str));
                }
                int iCharAt = str.charAt(7) - '0';
                if (iCharAt == 0) {
                    a0Var = a0.HTTP_1_0;
                } else {
                    if (iCharAt != 1) {
                        throw new ProtocolException(l.y.c.i.k("Unexpected status line: ", str));
                    }
                    a0Var = a0.HTTP_1_1;
                }
            } else {
                if (!p.x(str, "ICY ", false, 2, null)) {
                    throw new ProtocolException(l.y.c.i.k("Unexpected status line: ", str));
                }
                a0Var = a0.HTTP_1_0;
                i2 = 4;
            }
            int i3 = i2 + 3;
            if (str.length() < i3) {
                throw new ProtocolException(l.y.c.i.k("Unexpected status line: ", str));
            }
            try {
                String strSubstring2 = str.substring(i2, i3);
                l.y.c.i.d(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
                int i4 = Integer.parseInt(strSubstring2);
                if (str.length() <= i3) {
                    strSubstring = "";
                } else {
                    if (str.charAt(i3) != ' ') {
                        throw new ProtocolException(l.y.c.i.k("Unexpected status line: ", str));
                    }
                    strSubstring = str.substring(i2 + 4);
                    l.y.c.i.d(strSubstring, "this as java.lang.String).substring(startIndex)");
                }
                return new k(a0Var, i4, strSubstring);
            } catch (NumberFormatException unused) {
                throw new ProtocolException(l.y.c.i.k("Unexpected status line: ", str));
            }
        }
    }

    public k(a0 a0Var, int i2, String str) {
        l.y.c.i.e(a0Var, "protocol");
        l.y.c.i.e(str, "message");
        this.a = a0Var;
        this.b = i2;
        this.c = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.a == a0.HTTP_1_0 ? "HTTP/1.0" : "HTTP/1.1");
        sb.append(' ');
        sb.append(this.b);
        sb.append(' ');
        sb.append(this.c);
        String string = sb.toString();
        l.y.c.i.d(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
}
