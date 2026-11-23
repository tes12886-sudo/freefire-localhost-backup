package m.h0.l.i;

import java.util.logging.Handler;
import java.util.logging.LogRecord;

/* JADX INFO: loaded from: classes.dex */
public final class d extends Handler {
    public static final d a = new d();

    private d() {
    }

    @Override // java.util.logging.Handler
    public void close() {
    }

    @Override // java.util.logging.Handler
    public void flush() {
    }

    @Override // java.util.logging.Handler
    public void publish(LogRecord logRecord) {
        l.y.c.i.e(logRecord, "record");
        c cVar = c.a;
        String loggerName = logRecord.getLoggerName();
        l.y.c.i.d(loggerName, "record.loggerName");
        int iB = e.b(logRecord);
        String message = logRecord.getMessage();
        l.y.c.i.d(message, "record.message");
        cVar.a(loggerName, iB, message, logRecord.getThrown());
    }
}
