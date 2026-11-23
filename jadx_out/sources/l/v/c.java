package l.v;

/* JADX INFO: loaded from: classes.dex */
public interface c {

    public interface a extends c {
    }

    public interface b<E extends a> {
    }

    <E extends a> E c(b<E> bVar);
}
