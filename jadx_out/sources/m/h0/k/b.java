package m.h0.k;

/* JADX INFO: loaded from: classes.dex */
public enum b {
    NO_ERROR(0),
    PROTOCOL_ERROR(1),
    INTERNAL_ERROR(2),
    FLOW_CONTROL_ERROR(3),
    SETTINGS_TIMEOUT(4),
    STREAM_CLOSED(5),
    FRAME_SIZE_ERROR(6),
    REFUSED_STREAM(7),
    CANCEL(8),
    COMPRESSION_ERROR(9),
    CONNECT_ERROR(10),
    ENHANCE_YOUR_CALM(11),
    INADEQUATE_SECURITY(12),
    HTTP_1_1_REQUIRED(13);

    public static final a b = new a(null);
    private final int a;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(l.y.c.f fVar) {
            this();
        }

        public final b a(int i2) {
            for (b bVar : b.values()) {
                if (bVar.c() == i2) {
                    return bVar;
                }
            }
            return null;
        }
    }

    b(int i2) {
        this.a = i2;
    }

    public final int c() {
        return this.a;
    }
}
