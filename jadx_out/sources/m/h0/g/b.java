package m.h0.g;

import com.FF.voiceengine.FFVoiceConst;
import java.util.Arrays;
import java.util.logging.Logger;
import l.y.c.i;
import l.y.c.o;

/* JADX INFO: loaded from: classes.dex */
public final class b {
    public static final String b(long j2) {
        StringBuilder sb;
        long j3;
        StringBuilder sb2;
        long j4;
        long j5;
        String string;
        if (j2 > -999500000) {
            if (j2 > -999500) {
                if (j2 <= 0) {
                    sb2 = new StringBuilder();
                    j5 = j2 - ((long) 500);
                } else if (j2 < 999500) {
                    sb2 = new StringBuilder();
                    j5 = j2 + ((long) 500);
                } else if (j2 < 999500000) {
                    sb2 = new StringBuilder();
                    j4 = j2 + ((long) 500000);
                } else {
                    sb = new StringBuilder();
                    j3 = j2 + ((long) 500000000);
                }
                sb2.append(j5 / ((long) FFVoiceConst.FFVoiceEvent.FFVoice_EVENT_EOF));
                sb2.append(" µs");
                string = sb2.toString();
                o oVar = o.a;
                String str = String.format("%6s", Arrays.copyOf(new Object[]{string}, 1));
                i.d(str, "format(format, *args)");
                return str;
            }
            sb2 = new StringBuilder();
            j4 = j2 - ((long) 500000);
            sb2.append(j4 / ((long) 1000000));
            sb2.append(" ms");
            string = sb2.toString();
            o oVar2 = o.a;
            String str2 = String.format("%6s", Arrays.copyOf(new Object[]{string}, 1));
            i.d(str2, "format(format, *args)");
            return str2;
        }
        sb = new StringBuilder();
        j3 = j2 - ((long) 500000000);
        sb.append(j3 / ((long) 1000000000));
        sb.append(" s ");
        string = sb.toString();
        o oVar3 = o.a;
        String str3 = String.format("%6s", Arrays.copyOf(new Object[]{string}, 1));
        i.d(str3, "format(format, *args)");
        return str3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(a aVar, d dVar, String str) {
        Logger loggerA = e.f2196h.a();
        StringBuilder sb = new StringBuilder();
        sb.append(dVar.f());
        sb.append(' ');
        o oVar = o.a;
        String str2 = String.format("%-22s", Arrays.copyOf(new Object[]{str}, 1));
        i.d(str2, "format(format, *args)");
        sb.append(str2);
        sb.append(": ");
        sb.append(aVar.b());
        loggerA.fine(sb.toString());
    }
}
