package j.c.a.c.a;

/* JADX INFO: loaded from: classes.dex */
public class c {
    public static String a = "beepost-gpns";
    public static boolean b;
    public static boolean c;

    private static String a() {
        return b ? "https://testbeepost.garenanow.com" : "https://beepost.garenanow.com";
    }

    protected static String b() {
        return a() + "/api/device/tag/delete";
    }

    protected static String c() {
        return a() + "/api/device/register";
    }

    protected static String d() {
        return a() + "/api/device/tag/set";
    }
}
