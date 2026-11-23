package j.d.a.c.d;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.io.IOException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.annotation.concurrent.GuardedBy;

/* JADX INFO: loaded from: classes.dex */
public class d {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static int f1956h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static PendingIntent f1957i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final Executor f1958j = d0.a;
    private final Context b;
    private final v c;
    private final ScheduledExecutorService d;
    private Messenger f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private e f1959g;

    @GuardedBy("responseCallbacks")
    private final h.f.g<String, TaskCompletionSource<Bundle>> a = new h.f.g<>();
    private Messenger e = new Messenger(new c0(this, Looper.getMainLooper()));

    public d(Context context) {
        this.b = context;
        this.c = new v(context);
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1);
        scheduledThreadPoolExecutor.setKeepAliveTime(60L, TimeUnit.SECONDS);
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
        this.d = scheduledThreadPoolExecutor;
    }

    static final /* synthetic */ Bundle b(Task task) throws IOException {
        if (task.isSuccessful()) {
            return (Bundle) task.getResult();
        }
        if (Log.isLoggable("Rpc", 3)) {
            String strValueOf = String.valueOf(task.getException());
            StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 22);
            sb.append("Error making request: ");
            sb.append(strValueOf);
            Log.d("Rpc", sb.toString());
        }
        throw new IOException("SERVICE_NOT_AVAILABLE", task.getException());
    }

    static final /* synthetic */ Task c(Bundle bundle) {
        return l(bundle) ? com.google.android.gms.tasks.d.e(null) : com.google.android.gms.tasks.d.e(bundle);
    }

    private static synchronized String e() {
        int i2;
        i2 = f1956h;
        f1956h = i2 + 1;
        return Integer.toString(i2);
    }

    private static synchronized void f(Context context, Intent intent) {
        if (f1957i == null) {
            Intent intent2 = new Intent();
            intent2.setPackage("com.google.example.invalidpackage");
            f1957i = PendingIntent.getBroadcast(context, 0, intent2, 0);
        }
        intent.putExtra("app", f1957i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void g(Message message) {
        if (message != null) {
            Object obj = message.obj;
            if (obj instanceof Intent) {
                Intent intent = (Intent) obj;
                intent.setExtrasClassLoader(new e.a());
                if (intent.hasExtra("google.messenger")) {
                    Parcelable parcelableExtra = intent.getParcelableExtra("google.messenger");
                    if (parcelableExtra instanceof e) {
                        this.f1959g = (e) parcelableExtra;
                    }
                    if (parcelableExtra instanceof Messenger) {
                        this.f = (Messenger) parcelableExtra;
                    }
                }
                Intent intent2 = (Intent) message.obj;
                String action = intent2.getAction();
                if (!"com.google.android.c2dm.intent.REGISTRATION".equals(action)) {
                    if (Log.isLoggable("Rpc", 3)) {
                        String strValueOf = String.valueOf(action);
                        Log.d("Rpc", strValueOf.length() != 0 ? "Unexpected response action: ".concat(strValueOf) : new String("Unexpected response action: "));
                        return;
                    }
                    return;
                }
                String stringExtra = intent2.getStringExtra("registration_id");
                if (stringExtra == null) {
                    stringExtra = intent2.getStringExtra("unregistered");
                }
                if (stringExtra != null) {
                    Matcher matcher = Pattern.compile("\\|ID\\|([^|]+)\\|:?+(.*)").matcher(stringExtra);
                    if (!matcher.matches()) {
                        if (Log.isLoggable("Rpc", 3)) {
                            String strValueOf2 = String.valueOf(stringExtra);
                            Log.d("Rpc", strValueOf2.length() != 0 ? "Unexpected response string: ".concat(strValueOf2) : new String("Unexpected response string: "));
                            return;
                        }
                        return;
                    }
                    String strGroup = matcher.group(1);
                    String strGroup2 = matcher.group(2);
                    if (strGroup != null) {
                        Bundle extras = intent2.getExtras();
                        extras.putString("registration_id", strGroup2);
                        j(strGroup, extras);
                        return;
                    }
                    return;
                }
                String stringExtra2 = intent2.getStringExtra("error");
                if (stringExtra2 == null) {
                    String strValueOf3 = String.valueOf(intent2.getExtras());
                    StringBuilder sb = new StringBuilder(String.valueOf(strValueOf3).length() + 49);
                    sb.append("Unexpected response, no error or registration id ");
                    sb.append(strValueOf3);
                    Log.w("Rpc", sb.toString());
                    return;
                }
                if (Log.isLoggable("Rpc", 3)) {
                    String strValueOf4 = String.valueOf(stringExtra2);
                    Log.d("Rpc", strValueOf4.length() != 0 ? "Received InstanceID error ".concat(strValueOf4) : new String("Received InstanceID error "));
                }
                if (!stringExtra2.startsWith("|")) {
                    synchronized (this.a) {
                        for (int i2 = 0; i2 < this.a.size(); i2++) {
                            j(this.a.i(i2), intent2.getExtras());
                        }
                    }
                    return;
                }
                String[] strArrSplit = stringExtra2.split("\\|");
                if (strArrSplit.length <= 2 || !"ID".equals(strArrSplit[1])) {
                    String strValueOf5 = String.valueOf(stringExtra2);
                    Log.w("Rpc", strValueOf5.length() != 0 ? "Unexpected structured response ".concat(strValueOf5) : new String("Unexpected structured response "));
                    return;
                }
                String str = strArrSplit[2];
                String strSubstring = strArrSplit[3];
                if (strSubstring.startsWith(":")) {
                    strSubstring = strSubstring.substring(1);
                }
                j(str, intent2.putExtra("error", strSubstring).getExtras());
                return;
            }
        }
        Log.w("Rpc", "Dropping invalid message");
    }

    static final /* synthetic */ void i(TaskCompletionSource taskCompletionSource) {
        if (taskCompletionSource.d(new IOException("TIMEOUT"))) {
            Log.w("Rpc", "No response");
        }
    }

    private final void j(String str, Bundle bundle) {
        synchronized (this.a) {
            TaskCompletionSource<Bundle> taskCompletionSourceRemove = this.a.remove(str);
            if (taskCompletionSourceRemove != null) {
                taskCompletionSourceRemove.c(bundle);
            } else {
                String strValueOf = String.valueOf(str);
                Log.w("Rpc", strValueOf.length() != 0 ? "Missing callback for ".concat(strValueOf) : new String("Missing callback for "));
            }
        }
    }

    private static boolean l(Bundle bundle) {
        return bundle != null && bundle.containsKey("google.messenger");
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:29:0x00cc  */
    private final Task<Bundle> m(Bundle bundle) {
        final String strE = e();
        final TaskCompletionSource<Bundle> taskCompletionSource = new TaskCompletionSource<>();
        synchronized (this.a) {
            this.a.put(strE, taskCompletionSource);
        }
        Intent intent = new Intent();
        intent.setPackage("com.google.android.gms");
        intent.setAction(this.c.a() == 2 ? "com.google.iid.TOKEN_REQUEST" : "com.google.android.c2dm.intent.REGISTER");
        intent.putExtras(bundle);
        f(this.b, intent);
        StringBuilder sb = new StringBuilder(String.valueOf(strE).length() + 5);
        sb.append("|ID|");
        sb.append(strE);
        sb.append("|");
        intent.putExtra("kid", sb.toString());
        if (Log.isLoggable("Rpc", 3)) {
            String strValueOf = String.valueOf(intent.getExtras());
            StringBuilder sb2 = new StringBuilder(String.valueOf(strValueOf).length() + 8);
            sb2.append("Sending ");
            sb2.append(strValueOf);
            Log.d("Rpc", sb2.toString());
        }
        intent.putExtra("google.messenger", this.e);
        if (this.f != null || this.f1959g != null) {
            Message messageObtain = Message.obtain();
            messageObtain.obj = intent;
            try {
                Messenger messenger = this.f;
                if (messenger != null) {
                    messenger.send(messageObtain);
                } else {
                    this.f1959g.b(messageObtain);
                }
            } catch (RemoteException unused) {
                if (Log.isLoggable("Rpc", 3)) {
                    Log.d("Rpc", "Messenger failed, fallback to startService");
                }
                if (this.c.a() == 2) {
                    this.b.sendBroadcast(intent);
                } else {
                    this.b.startService(intent);
                }
            }
        } else if (this.c.a() == 2) {
            this.b.sendBroadcast(intent);
        } else {
            this.b.startService(intent);
        }
        final ScheduledFuture<?> scheduledFutureSchedule = this.d.schedule(new Runnable(taskCompletionSource) { // from class: j.d.a.c.d.y
            private final TaskCompletionSource a;

            {
                this.a = taskCompletionSource;
            }

            @Override // java.lang.Runnable
            public final void run() {
                d.i(this.a);
            }
        }, 30L, TimeUnit.SECONDS);
        taskCompletionSource.a().addOnCompleteListener(f1958j, new OnCompleteListener(this, strE, scheduledFutureSchedule) { // from class: j.d.a.c.d.b0
            private final d a;
            private final String b;
            private final ScheduledFuture c;

            {
                this.a = this;
                this.b = strE;
                this.c = scheduledFutureSchedule;
            }

            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void a(Task task) {
                this.a.k(this.b, this.c, task);
            }
        });
        return taskCompletionSource.a();
    }

    public Task<Bundle> a(final Bundle bundle) {
        if (this.c.c() >= 12000000) {
            return i.c(this.b).f(1, bundle).continueWith(f1958j, x.a);
        }
        return !(this.c.a() != 0) ? com.google.android.gms.tasks.d.d(new IOException("MISSING_INSTANCEID_SERVICE")) : m(bundle).continueWithTask(f1958j, new Continuation(this, bundle) { // from class: j.d.a.c.d.z
            private final d a;
            private final Bundle b;

            {
                this.a = this;
                this.b = bundle;
            }

            @Override // com.google.android.gms.tasks.Continuation
            public final Object a(Task task) {
                return this.a.d(this.b, task);
            }
        });
    }

    final /* synthetic */ Task d(Bundle bundle, Task task) {
        return (task.isSuccessful() && l((Bundle) task.getResult())) ? m(bundle).onSuccessTask(f1958j, a0.a) : task;
    }

    final /* synthetic */ void k(String str, ScheduledFuture scheduledFuture, Task task) {
        synchronized (this.a) {
            this.a.remove(str);
        }
        scheduledFuture.cancel(false);
    }
}
