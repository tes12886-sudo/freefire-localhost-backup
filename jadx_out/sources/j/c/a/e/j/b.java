package j.c.a.e.j;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ApplicationInfo;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes.dex */
public class b extends j.c.a.e.j.a {
    private int d;
    private Handler e;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Context f1928h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private ComponentName f1930j;
    IntentFilter b = new IntentFilter("com.garena.android.gpns.check");
    BroadcastReceiver c = new a();
    private int f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f1927g = "";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Runnable f1929i = new RunnableC0227b();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f1931k = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f1932l = false;

    class a extends BroadcastReceiver {
        a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            j.c.a.e.l.b.a("receive feedback!");
            b.this.i(context, intent);
        }
    }

    /* JADX INFO: renamed from: j.c.a.e.j.b$b, reason: collision with other inner class name */
    class RunnableC0227b implements Runnable {
        RunnableC0227b() {
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // java.lang.Runnable
        public void run() {
            if (b.this.d > 0) {
                j.c.a.e.l.b.a("execute final check:" + b.this.d);
                b.this.d = 1;
                Intent intent = new Intent();
                intent.putExtra("status_is_running", intent);
                intent.putExtra("query_version", b.this.f);
                intent.putExtra("component", new ComponentName(b.this.f1927g, "com.garena.android.gpns.GNotificationService"));
                b bVar = b.this;
                bVar.i(bVar.f1928h, intent);
            }
        }
    }

    public b(j.c.a.e.j.a.InterfaceC0226a interfaceC0226a) {
        this.a = interfaceC0226a;
    }

    public static boolean g(String str, String str2) {
        return str.compareTo(str2) > 0;
    }

    private void h(Context context, ComponentName componentName) {
        j.c.a.e.l.b.d("Attempt to kill:" + componentName.flattenToString());
        Intent intent = new Intent("com.garena.android.gpns.enquiry");
        intent.setPackage(componentName.getPackageName());
        intent.putExtra("_action", 2);
        context.sendBroadcast(intent);
    }

    @Override // j.c.a.e.j.a
    protected void a(Context context) {
        if (context != null) {
            this.f1928h = context;
            Intent intent = new Intent("com.garena.android.gpns.enquiry");
            intent.putExtra("_action", 1);
            intent.putExtra("component", context.getPackageName());
            int size = context.getPackageManager().queryBroadcastReceivers(intent, 64).size();
            this.d = size;
            if (size == 0) {
                this.a.a();
                return;
            }
            for (ApplicationInfo applicationInfo : context.getPackageManager().getInstalledApplications(128)) {
                Bundle bundle = applicationInfo.metaData;
                if (bundle != null) {
                    Integer numValueOf = Integer.valueOf(bundle.getInt("com.garena.sdk.push.version", -1));
                    if (numValueOf.intValue() > this.f || (numValueOf.intValue() == this.f && g(applicationInfo.packageName, this.f1927g))) {
                        j.c.a.e.l.b.a("we have a better choice now:" + applicationInfo.packageName);
                        this.f = numValueOf.intValue();
                        this.f1927g = applicationInfo.packageName;
                    } else {
                        j.c.a.e.l.b.a("service_version:" + numValueOf + " " + applicationInfo.packageName);
                    }
                }
            }
            Handler handler = new Handler(Looper.getMainLooper());
            this.e = handler;
            handler.postDelayed(this.f1929i, 10000L);
            context.getApplicationContext().registerReceiver(this.c, this.b);
            context.sendBroadcast(intent);
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0068  */
    protected void i(Context context, Intent intent) {
        StringBuilder sb;
        ComponentName componentName;
        StringBuilder sb2;
        String str;
        ComponentName componentName2;
        this.d--;
        j.c.a.e.l.b.a("receive query response on" + context.getPackageName() + " count:" + this.d);
        boolean booleanExtra = intent.getBooleanExtra("status_is_running", false);
        int intExtra = intent.getIntExtra("query_version", 0);
        ComponentName componentName3 = (ComponentName) intent.getParcelableExtra("component");
        StringBuilder sb3 = new StringBuilder();
        sb3.append("responder: ");
        sb3.append(componentName3);
        sb3.append(" v:");
        sb3.append(intExtra);
        sb3.append(booleanExtra ? " running" : " not running");
        j.c.a.e.l.b.a(sb3.toString());
        if (!booleanExtra) {
            int i2 = this.f1931k;
            if (intExtra > i2) {
                if (this.f1932l && (componentName = this.f1930j) != null) {
                    h(context, componentName);
                }
                this.f1930j = componentName3;
                sb = new StringBuilder();
            } else if (intExtra == i2) {
                if (this.f1930j == null) {
                    this.f1930j = componentName3;
                    sb = new StringBuilder();
                } else if (g(componentName3.getPackageName(), this.f1930j.getPackageName())) {
                    if (this.f1932l) {
                        h(context, this.f1930j);
                    }
                    this.f1930j = componentName3;
                    sb = new StringBuilder();
                }
            }
            sb.append("c winner is:");
            sb.append(this.f1930j.flattenToString());
            j.c.a.e.l.b.a(sb.toString());
            this.f1931k = intExtra;
            this.f1932l = false;
        } else if (intExtra >= 4) {
            if (intExtra > this.f1931k) {
                if (this.f1932l && (componentName2 = this.f1930j) != null) {
                    h(context, componentName2);
                }
                this.f1931k = intExtra;
                this.f1930j = componentName3;
                sb2 = new StringBuilder();
                str = "a winner is:";
            } else if (g(componentName3.getPackageName(), this.f1930j.getPackageName())) {
                if (this.f1932l) {
                    h(context, this.f1930j);
                    this.f1932l = false;
                }
                this.f1931k = intExtra;
                this.f1930j = componentName3;
                sb2 = new StringBuilder();
                str = "b winner is:";
            } else {
                h(context, componentName3);
            }
            sb2.append(str);
            sb2.append(this.f1930j.flattenToString());
            j.c.a.e.l.b.a(sb2.toString());
            this.f1932l = true;
        } else {
            h(context, componentName3);
        }
        if (this.d == 0) {
            j.c.a.e.l.b.d("get all feedback");
            this.e.removeCallbacks(this.f1929i);
            if (!this.f1932l) {
                j.c.a.e.l.b.d("no service running");
                if (this.f1931k <= 0 || context.getPackageName().equals(this.f1930j.getPackageName())) {
                    j.c.a.e.l.b.d("I am the candidate to run " + context.getPackageName());
                    this.a.a();
                } else {
                    j.c.a.e.l.b.d("found a better candidate rather than myself " + context.getPackageName());
                    j.c.a.e.l.b.d("start & bind service:" + this.f1930j.flattenToString());
                    Intent intent2 = new Intent();
                    intent2.setComponent(this.f1930j);
                    context.startService(intent2);
                }
                this.a = null;
                context.getApplicationContext().unregisterReceiver(this.c);
                this.e = null;
                this.f1928h = null;
            }
            j.c.a.e.l.b.d("start & bind service:" + this.f1930j.flattenToString());
            this.a.b(this.f1930j);
            this.a = null;
            context.getApplicationContext().unregisterReceiver(this.c);
            this.e = null;
            this.f1928h = null;
        }
    }
}
