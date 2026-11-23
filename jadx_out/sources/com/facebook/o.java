package com.facebook;

/* JADX INFO: loaded from: classes.dex */
public final class o extends n {
    private final x a;

    public o(x xVar, String str) {
        super(str);
        this.a = xVar;
    }

    @Override // com.facebook.n, java.lang.Throwable
    public String toString() {
        x xVar = this.a;
        q qVarB = xVar != null ? xVar.b() : null;
        StringBuilder sb = new StringBuilder();
        sb.append("{FacebookGraphResponseException: ");
        l.y.c.i.d(sb, "StringBuilder().append(\"…raphResponseException: \")");
        String message = getMessage();
        if (message != null) {
            sb.append(message);
            sb.append(" ");
        }
        if (qVarB != null) {
            sb.append("httpResponseCode: ");
            sb.append(qVarB.f());
            sb.append(", facebookErrorCode: ");
            sb.append(qVarB.b());
            sb.append(", facebookErrorType: ");
            sb.append(qVarB.d());
            sb.append(", message: ");
            sb.append(qVarB.c());
            sb.append("}");
        }
        String string = sb.toString();
        l.y.c.i.d(string, "errorStringBuilder.toString()");
        return string;
    }
}
