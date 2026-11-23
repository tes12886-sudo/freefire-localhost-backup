package com.facebook.internal;

import android.content.Intent;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class e implements com.facebook.j {
    private final Map<Integer, a> a = new HashMap();
    public static final b c = new b(null);
    private static final Map<Integer, a> b = new HashMap();

    public interface a {
        boolean a(int i2, Intent intent);
    }

    public static final class b {
        private b() {
        }

        public /* synthetic */ b(l.y.c.f fVar) {
            this();
        }

        private final synchronized a b(int i2) {
            return (a) e.b.get(Integer.valueOf(i2));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean d(int i2, int i3, Intent intent) {
            a aVarB = b(i2);
            if (aVarB != null) {
                return aVarB.a(i3, intent);
            }
            return false;
        }

        public final synchronized void c(int i2, a aVar) {
            l.y.c.i.e(aVar, "callback");
            if (e.b.containsKey(Integer.valueOf(i2))) {
                return;
            }
            e.b.put(Integer.valueOf(i2), aVar);
        }
    }

    public enum c {
        Login(0),
        Share(1),
        Message(2),
        /* JADX INFO: Fake field, exist only in values array */
        Like(3),
        GameRequest(4),
        /* JADX INFO: Fake field, exist only in values array */
        AppGroupCreate(5),
        /* JADX INFO: Fake field, exist only in values array */
        AppGroupJoin(6),
        /* JADX INFO: Fake field, exist only in values array */
        AppInvite(7),
        /* JADX INFO: Fake field, exist only in values array */
        DeviceShare(8),
        /* JADX INFO: Fake field, exist only in values array */
        GamingFriendFinder(9),
        /* JADX INFO: Fake field, exist only in values array */
        GamingGroupIntegration(10),
        /* JADX INFO: Fake field, exist only in values array */
        Referral(11),
        /* JADX INFO: Fake field, exist only in values array */
        GamingContextCreate(12),
        /* JADX INFO: Fake field, exist only in values array */
        GamingContextSwitch(13),
        /* JADX INFO: Fake field, exist only in values array */
        GamingContextChoose(14),
        /* JADX INFO: Fake field, exist only in values array */
        TournamentShareDialog(15);

        private final int a;

        c(int i2) {
            this.a = i2;
        }

        public final int a() {
            return com.facebook.r.k() + this.a;
        }
    }

    public static final synchronized void d(int i2, a aVar) {
        c.c(i2, aVar);
    }

    @Override // com.facebook.j
    public boolean a(int i2, int i3, Intent intent) {
        a aVar = this.a.get(Integer.valueOf(i2));
        return aVar != null ? aVar.a(i3, intent) : c.d(i2, i3, intent);
    }

    public final void c(int i2, a aVar) {
        l.y.c.i.e(aVar, "callback");
        this.a.put(Integer.valueOf(i2), aVar);
    }
}
