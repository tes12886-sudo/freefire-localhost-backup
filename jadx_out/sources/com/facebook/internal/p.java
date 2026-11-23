package com.facebook.internal;

import android.R;
import com.appff.haptic.base.Utils;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class p {
    public static final p b = new p();
    private static final Map<b, String[]> a = new HashMap();

    public interface a {
        void a(boolean z);
    }

    public enum b {
        Unknown(-1),
        Core(0),
        AppEvents(65536),
        CodelessEvents(65792),
        RestrictiveDataFiltering(66048),
        AAM(66304),
        PrivacyProtection(66560),
        SuggestedEvents(66561),
        IntelligentIntegrity(66562),
        ModelRequest(66563),
        EventDeactivation(66816),
        OnDeviceEventProcessing(67072),
        OnDevicePostInstallEventProcessing(67073),
        IapLogging(67328),
        IapLoggingLib2(67329),
        Instrument(131072),
        CrashReport(131328),
        CrashShield(131329),
        ThreadCheck(131330),
        ErrorReport(131584),
        AnrReport(131840),
        Monitoring(196608),
        ServiceUpdateCompliance(196864),
        Login(16777216),
        ChromeCustomTabsPrefetching(R.attr.theme),
        IgnoreAppSwitchToLoggedOut(R.id.background),
        BypassAppSwitch(R.style.Animation),
        Share(33554432),
        Places(50331648);

        public static final a O = new a(null);
        private final int a;

        public static final class a {
            private a() {
            }

            public /* synthetic */ a(l.y.c.f fVar) {
                this();
            }

            public final b a(int i2) {
                for (b bVar : b.values()) {
                    if (bVar.a == i2) {
                        return bVar;
                    }
                }
                return b.Unknown;
            }
        }

        b(int i2) {
            this.a = i2;
        }

        public final b c() {
            a aVar;
            int i2;
            int i3;
            int i4 = this.a;
            if ((i4 & Utils.MAX_STRENGTH_VALUE) > 0) {
                aVar = O;
                i3 = i4 & (-256);
            } else {
                if ((65280 & i4) > 0) {
                    aVar = O;
                    i2 = -65536;
                } else {
                    if ((16711680 & i4) <= 0) {
                        return O.a(0);
                    }
                    aVar = O;
                    i2 = -16777216;
                }
                i3 = i4 & i2;
            }
            return aVar.a(i3);
        }

        public final String d() {
            return "FBSDKFeature" + this;
        }

        @Override // java.lang.Enum
        public String toString() {
            switch (q.a[ordinal()]) {
                case 1:
                    return "CoreKit";
                case 2:
                    return "AppEvents";
                case 3:
                    return "CodelessEvents";
                case 4:
                    return "RestrictiveDataFiltering";
                case 5:
                    return "Instrument";
                case 6:
                    return "CrashReport";
                case 7:
                    return "CrashShield";
                case 8:
                    return "ThreadCheck";
                case 9:
                    return "ErrorReport";
                case 10:
                    return "AnrReport";
                case 11:
                    return "AAM";
                case 12:
                    return "PrivacyProtection";
                case 13:
                    return "SuggestedEvents";
                case 14:
                    return "IntelligentIntegrity";
                case 15:
                    return "ModelRequest";
                case 16:
                    return "EventDeactivation";
                case 17:
                    return "OnDeviceEventProcessing";
                case 18:
                    return "OnDevicePostInstallEventProcessing";
                case 19:
                    return "IAPLogging";
                case 20:
                    return "IAPLoggingLib2";
                case 21:
                    return "Monitoring";
                case 22:
                    return "ServiceUpdateCompliance";
                case 23:
                    return "LoginKit";
                case 24:
                    return "ChromeCustomTabsPrefetching";
                case 25:
                    return "IgnoreAppSwitchToLoggedOut";
                case 26:
                    return "BypassAppSwitch";
                case 27:
                    return "ShareKit";
                case 28:
                    return "PlacesKit";
                default:
                    return "unknown";
            }
        }
    }

    public static final class c implements s.a {
        final /* synthetic */ a a;
        final /* synthetic */ b b;

        c(a aVar, b bVar) {
            this.a = aVar;
            this.b = bVar;
        }

        @Override // com.facebook.internal.s.a
        public void a() {
            this.a.a(p.g(this.b));
        }
    }

    private p() {
    }

    public static final void a(b bVar, a aVar) {
        l.y.c.i.e(bVar, "feature");
        l.y.c.i.e(aVar, "callback");
        s.j(new c(aVar, bVar));
    }

    private final boolean b(b bVar) {
        switch (r.a[bVar.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
                return false;
            default:
                return true;
        }
    }

    public static final void c(b bVar) {
        l.y.c.i.e(bVar, "feature");
        com.facebook.r.f().getSharedPreferences("com.facebook.internal.FEATURE_MANAGER", 0).edit().putString(bVar.d(), com.facebook.r.u()).apply();
    }

    public static final b d(String str) {
        l.y.c.i.e(str, "className");
        b.f();
        for (Map.Entry<b, String[]> entry : a.entrySet()) {
            b key = entry.getKey();
            for (String str2 : entry.getValue()) {
                if (l.d0.p.x(str, str2, false, 2, null)) {
                    return key;
                }
            }
        }
        return b.Unknown;
    }

    private final boolean e(b bVar) {
        return s.f(bVar.d(), com.facebook.r.g(), b(bVar));
    }

    private final synchronized void f() {
        Map<b, String[]> map = a;
        if (map.isEmpty()) {
            map.put(b.AAM, new String[]{"com.facebook.appevents.aam."});
            map.put(b.CodelessEvents, new String[]{"com.facebook.appevents.codeless."});
            map.put(b.ErrorReport, new String[]{"com.facebook.internal.instrument.errorreport."});
            map.put(b.AnrReport, new String[]{"com.facebook.internal.instrument.anrreport."});
            map.put(b.PrivacyProtection, new String[]{"com.facebook.appevents.ml."});
            map.put(b.SuggestedEvents, new String[]{"com.facebook.appevents.suggestedevents."});
            map.put(b.RestrictiveDataFiltering, new String[]{"com.facebook.appevents.restrictivedatafilter.RestrictiveDataManager"});
            map.put(b.IntelligentIntegrity, new String[]{"com.facebook.appevents.integrity.IntegrityManager"});
            map.put(b.EventDeactivation, new String[]{"com.facebook.appevents.eventdeactivation."});
            map.put(b.OnDeviceEventProcessing, new String[]{"com.facebook.appevents.ondeviceprocessing."});
            map.put(b.IapLogging, new String[]{"com.facebook.appevents.iap."});
            map.put(b.Monitoring, new String[]{"com.facebook.internal.logging.monitor"});
        }
    }

    public static final boolean g(b bVar) {
        l.y.c.i.e(bVar, "feature");
        if (b.Unknown == bVar) {
            return false;
        }
        if (b.Core == bVar) {
            return true;
        }
        String string = com.facebook.r.f().getSharedPreferences("com.facebook.internal.FEATURE_MANAGER", 0).getString(bVar.d(), null);
        if (string != null && l.y.c.i.a(string, com.facebook.r.u())) {
            return false;
        }
        b bVarC = bVar.c();
        if (bVarC == bVar) {
            return b.e(bVar);
        }
        return g(bVarC) && b.e(bVar);
    }
}
