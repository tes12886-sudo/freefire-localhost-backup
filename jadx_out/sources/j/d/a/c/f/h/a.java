package j.d.a.c.f.h;

/* JADX INFO: loaded from: classes.dex */
enum a {
    RESPONSE_CODE_UNSPECIFIED(-999),
    SERVICE_TIMEOUT(-3),
    FEATURE_NOT_SUPPORTED(-2),
    SERVICE_DISCONNECTED(-1),
    OK(0),
    USER_CANCELED(1),
    SERVICE_UNAVAILABLE(2),
    BILLING_UNAVAILABLE(3),
    ITEM_UNAVAILABLE(4),
    DEVELOPER_ERROR(5),
    ERROR(6),
    ITEM_ALREADY_OWNED(7),
    ITEM_NOT_OWNED(8),
    EXPIRED_OFFER_TOKEN(11);

    private static final e0 p;
    private final int a;

    static {
        d0 d0Var = new d0();
        for (a aVar : values()) {
            d0Var.a(Integer.valueOf(aVar.a), aVar);
        }
        p = d0Var.b();
    }

    a(int i2) {
        this.a = i2;
    }

    static a a(int i2) {
        e0 e0Var = p;
        Integer numValueOf = Integer.valueOf(i2);
        return !e0Var.containsKey(numValueOf) ? RESPONSE_CODE_UNSPECIFIED : (a) e0Var.get(numValueOf);
    }
}
