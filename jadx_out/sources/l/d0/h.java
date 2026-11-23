package l.d0;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes.dex */
public class h {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Object] */
    public static <T> void a(Appendable appendable, T t, l.y.b.l<? super T, ? extends CharSequence> lVar) {
        CharSequence charSequenceValueOf;
        l.y.c.i.e(appendable, "<this>");
        if (lVar == null) {
            if (!(t == 0 ? true : t instanceof CharSequence)) {
                if (t instanceof Character) {
                    appendable.append(((Character) t).charValue());
                    return;
                }
                charSequenceValueOf = String.valueOf((Object) t);
            }
            appendable.append(charSequenceValueOf);
        }
        t = (T) lVar.c(t);
        charSequenceValueOf = (CharSequence) t;
        appendable.append(charSequenceValueOf);
    }
}
