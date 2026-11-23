package com.google.android.gms.common;

import android.R;
import android.annotation.TargetApi;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.util.Log;
import android.util.TypedValue;
import android.widget.ProgressBar;
import androidx.fragment.app.Fragment;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.HasApiKey;
import com.google.android.gms.common.api.internal.LifecycleFragment;
import com.google.android.gms.common.api.internal.s1;
import com.google.android.gms.common.api.internal.zabw;
import com.google.android.gms.common.api.internal.zabx;
import com.google.android.gms.common.internal.zag;
import com.google.android.gms.common.util.l;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.errorprone.annotations.RestrictedInheritance;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
@RestrictedInheritance(allowedOnPath = ".*java.*/com/google/android/gms.*", allowlistAnnotations = {j.d.a.c.f.d.d.class, j.d.a.c.f.d.e.class}, explanation = "Sub classing of GMS Core's APIs are restricted to GMS Core client libs and testing fakes.", link = "go/gmscore-restrictedinheritance")
public class GoogleApiAvailability extends GoogleApiAvailabilityLight {
    public static final String GOOGLE_PLAY_SERVICES_PACKAGE = "com.google.android.gms";
    private String zac;
    private static final Object zaa = new Object();
    private static final GoogleApiAvailability zab = new GoogleApiAvailability();
    public static final int GOOGLE_PLAY_SERVICES_VERSION_CODE = GoogleApiAvailabilityLight.GOOGLE_PLAY_SERVICES_VERSION_CODE;

    public static GoogleApiAvailability getInstance() {
        return zab;
    }

    public static final Task zai(HasApiKey hasApiKey, HasApiKey... hasApiKeyArr) {
        com.google.android.gms.common.internal.q.l(hasApiKey, "Requested API must not be null.");
        for (HasApiKey hasApiKey2 : hasApiKeyArr) {
            com.google.android.gms.common.internal.q.l(hasApiKey2, "Requested API must not be null.");
        }
        ArrayList arrayList = new ArrayList(hasApiKeyArr.length + 1);
        arrayList.add(hasApiKey);
        arrayList.addAll(Arrays.asList(hasApiKeyArr));
        return com.google.android.gms.common.api.internal.g.y().B(arrayList);
    }

    public Task<Void> checkApiAvailability(GoogleApi<?> googleApi, GoogleApi<?>... googleApiArr) {
        return zai(googleApi, googleApiArr).onSuccessTask(new SuccessContinuation() { // from class: com.google.android.gms.common.q
            @Override // com.google.android.gms.tasks.SuccessContinuation
            public final Task a(Object obj) {
                int i2 = GoogleApiAvailability.GOOGLE_PLAY_SERVICES_VERSION_CODE;
                return com.google.android.gms.tasks.d.e(null);
            }
        });
    }

    public Task<Void> checkApiAvailability(HasApiKey<?> hasApiKey, HasApiKey<?>... hasApiKeyArr) {
        return zai(hasApiKey, hasApiKeyArr).onSuccessTask(new SuccessContinuation() { // from class: com.google.android.gms.common.p
            @Override // com.google.android.gms.tasks.SuccessContinuation
            public final Task a(Object obj) {
                int i2 = GoogleApiAvailability.GOOGLE_PLAY_SERVICES_VERSION_CODE;
                return com.google.android.gms.tasks.d.e(null);
            }
        });
    }

    @Override // com.google.android.gms.common.GoogleApiAvailabilityLight
    public int getClientVersion(Context context) {
        return super.getClientVersion(context);
    }

    public Dialog getErrorDialog(Activity activity, int i2, int i3) {
        return getErrorDialog(activity, i2, i3, (DialogInterface.OnCancelListener) null);
    }

    public Dialog getErrorDialog(Activity activity, int i2, int i3, DialogInterface.OnCancelListener onCancelListener) {
        return zaa(activity, i2, zag.b(activity, getErrorResolutionIntent(activity, i2, "d"), i3), onCancelListener);
    }

    public Dialog getErrorDialog(Fragment fragment, int i2, int i3) {
        return getErrorDialog(fragment, i2, i3, (DialogInterface.OnCancelListener) null);
    }

    public Dialog getErrorDialog(Fragment fragment, int i2, int i3, DialogInterface.OnCancelListener onCancelListener) {
        return zaa(fragment.q1(), i2, zag.c(fragment, getErrorResolutionIntent(fragment.q1(), i2, "d"), i3), onCancelListener);
    }

    @Override // com.google.android.gms.common.GoogleApiAvailabilityLight
    public Intent getErrorResolutionIntent(Context context, int i2, String str) {
        return super.getErrorResolutionIntent(context, i2, str);
    }

    @Override // com.google.android.gms.common.GoogleApiAvailabilityLight
    public PendingIntent getErrorResolutionPendingIntent(Context context, int i2, int i3) {
        return super.getErrorResolutionPendingIntent(context, i2, i3);
    }

    public PendingIntent getErrorResolutionPendingIntent(Context context, ConnectionResult connectionResult) {
        return connectionResult.l() ? connectionResult.j() : getErrorResolutionPendingIntent(context, connectionResult.f(), 0);
    }

    @Override // com.google.android.gms.common.GoogleApiAvailabilityLight
    public final String getErrorString(int i2) {
        return super.getErrorString(i2);
    }

    @Override // com.google.android.gms.common.GoogleApiAvailabilityLight
    public int isGooglePlayServicesAvailable(Context context) {
        return super.isGooglePlayServicesAvailable(context);
    }

    @Override // com.google.android.gms.common.GoogleApiAvailabilityLight
    public int isGooglePlayServicesAvailable(Context context, int i2) {
        return super.isGooglePlayServicesAvailable(context, i2);
    }

    @Override // com.google.android.gms.common.GoogleApiAvailabilityLight
    public final boolean isUserResolvableError(int i2) {
        return super.isUserResolvableError(i2);
    }

    public Task<Void> makeGooglePlayServicesAvailable(Activity activity) {
        int i2 = GOOGLE_PLAY_SERVICES_VERSION_CODE;
        com.google.android.gms.common.internal.q.f("makeGooglePlayServicesAvailable must be called from the main thread");
        int iIsGooglePlayServicesAvailable = isGooglePlayServicesAvailable(activity, i2);
        if (iIsGooglePlayServicesAvailable == 0) {
            return com.google.android.gms.tasks.d.e(null);
        }
        s1 s1VarT = s1.t(activity);
        s1VarT.s(new ConnectionResult(iIsGooglePlayServicesAvailable, null), 0);
        return s1VarT.u();
    }

    @TargetApi(26)
    public void setDefaultNotificationChannelId(Context context, String str) {
        if (l.h()) {
            Object systemService = context.getSystemService("notification");
            com.google.android.gms.common.internal.q.k(systemService);
            com.google.android.gms.common.internal.q.k(((NotificationManager) systemService).getNotificationChannel(str));
        }
        synchronized (zaa) {
            this.zac = str;
        }
    }

    public boolean showErrorDialogFragment(Activity activity, int i2, int i3) {
        return showErrorDialogFragment(activity, i2, i3, null);
    }

    public boolean showErrorDialogFragment(Activity activity, int i2, int i3, DialogInterface.OnCancelListener onCancelListener) {
        Dialog errorDialog = getErrorDialog(activity, i2, i3, onCancelListener);
        if (errorDialog == null) {
            return false;
        }
        zad(activity, errorDialog, "GooglePlayServicesErrorDialog", onCancelListener);
        return true;
    }

    public void showErrorNotification(Context context, int i2) {
        zae(context, i2, null, getErrorResolutionPendingIntent(context, i2, 0, "n"));
    }

    public void showErrorNotification(Context context, ConnectionResult connectionResult) {
        zae(context, connectionResult.f(), null, getErrorResolutionPendingIntent(context, connectionResult));
    }

    final Dialog zaa(Context context, int i2, zag zagVar, DialogInterface.OnCancelListener onCancelListener) {
        if (i2 == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        AlertDialog.Builder builder = "Theme.Dialog.Alert".equals(context.getResources().getResourceEntryName(typedValue.resourceId)) ? new AlertDialog.Builder(context, 5) : null;
        if (builder == null) {
            builder = new AlertDialog.Builder(context);
        }
        builder.setMessage(com.google.android.gms.common.internal.e0.d(context, i2));
        if (onCancelListener != null) {
            builder.setOnCancelListener(onCancelListener);
        }
        String strC = com.google.android.gms.common.internal.e0.c(context, i2);
        if (strC != null) {
            builder.setPositiveButton(strC, zagVar);
        }
        String strG = com.google.android.gms.common.internal.e0.g(context, i2);
        if (strG != null) {
            builder.setTitle(strG);
        }
        Log.w("GoogleApiAvailability", String.format("Creating dialog for Google Play services availability issue. ConnectionResult=%s", Integer.valueOf(i2)), new IllegalArgumentException());
        return builder.create();
    }

    public final Dialog zab(Activity activity, DialogInterface.OnCancelListener onCancelListener) {
        ProgressBar progressBar = new ProgressBar(activity, null, R.attr.progressBarStyleLarge);
        progressBar.setIndeterminate(true);
        progressBar.setVisibility(0);
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        builder.setView(progressBar);
        builder.setMessage(com.google.android.gms.common.internal.e0.d(activity, 18));
        builder.setPositiveButton("", (DialogInterface.OnClickListener) null);
        AlertDialog alertDialogCreate = builder.create();
        zad(activity, alertDialogCreate, "GooglePlayServicesUpdatingDialog", onCancelListener);
        return alertDialogCreate;
    }

    public final zabx zac(Context context, zabw zabwVar) {
        IntentFilter intentFilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
        intentFilter.addDataScheme("package");
        zabx zabxVar = new zabx(zabwVar);
        j.d.a.c.f.d.h.m(context, zabxVar, intentFilter);
        zabxVar.a(context);
        if (isUninstalledAppPossiblyUpdating(context, "com.google.android.gms")) {
            return zabxVar;
        }
        zabwVar.a();
        zabxVar.b();
        return null;
    }

    final void zad(Activity activity, Dialog dialog, String str, DialogInterface.OnCancelListener onCancelListener) {
        try {
            if (activity instanceof androidx.fragment.app.e) {
                j.W1(dialog, onCancelListener).V1(((androidx.fragment.app.e) activity).s(), str);
                return;
            }
        } catch (NoClassDefFoundError unused) {
        }
        b.a(dialog, onCancelListener).show(activity.getFragmentManager(), str);
    }

    @TargetApi(20)
    final void zae(Context context, int i2, String str, PendingIntent pendingIntent) {
        int i3;
        String str2;
        Log.w("GoogleApiAvailability", String.format("GMS core API Availability. ConnectionResult=%s, tag=%s", Integer.valueOf(i2), null), new IllegalArgumentException());
        if (i2 == 18) {
            zaf(context);
            return;
        }
        if (pendingIntent == null) {
            if (i2 == 6) {
                Log.w("GoogleApiAvailability", "Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead.");
                return;
            }
            return;
        }
        String strF = com.google.android.gms.common.internal.e0.f(context, i2);
        String strE = com.google.android.gms.common.internal.e0.e(context, i2);
        Resources resources = context.getResources();
        Object systemService = context.getSystemService("notification");
        com.google.android.gms.common.internal.q.k(systemService);
        NotificationManager notificationManager = (NotificationManager) systemService;
        androidx.core.app.i.e eVar = new androidx.core.app.i.e(context);
        eVar.q(true);
        eVar.f(true);
        eVar.k(strF);
        androidx.core.app.i.c cVar = new androidx.core.app.i.c();
        cVar.h(strE);
        eVar.x(cVar);
        if (com.google.android.gms.common.util.i.c(context)) {
            com.google.android.gms.common.internal.q.n(l.e());
            eVar.u(context.getApplicationInfo().icon);
            eVar.s(2);
            if (com.google.android.gms.common.util.i.d(context)) {
                eVar.a(j.d.a.c.c.a.a, resources.getString(j.d.a.c.c.b.f1955o), pendingIntent);
            } else {
                eVar.i(pendingIntent);
            }
        } else {
            eVar.u(R.drawable.stat_sys_warning);
            eVar.y(resources.getString(j.d.a.c.c.b.f1948h));
            eVar.B(System.currentTimeMillis());
            eVar.i(pendingIntent);
            eVar.j(strE);
        }
        if (l.h()) {
            com.google.android.gms.common.internal.q.n(l.h());
            synchronized (zaa) {
                str2 = this.zac;
            }
            if (str2 == null) {
                str2 = "com.google.android.gms.availability";
                NotificationChannel notificationChannel = notificationManager.getNotificationChannel("com.google.android.gms.availability");
                String strB = com.google.android.gms.common.internal.e0.b(context);
                if (notificationChannel == null) {
                    notificationChannel = new NotificationChannel("com.google.android.gms.availability", strB, 4);
                } else if (!strB.contentEquals(notificationChannel.getName())) {
                    notificationChannel.setName(strB);
                }
                notificationManager.createNotificationChannel(notificationChannel);
            }
            eVar.g(str2);
        }
        Notification notificationB = eVar.b();
        if (i2 == 1 || i2 == 2 || i2 == 3) {
            g.b.set(false);
            i3 = 10436;
        } else {
            i3 = 39789;
        }
        notificationManager.notify(i3, notificationB);
    }

    final void zaf(Context context) {
        new r(this, context).sendEmptyMessageDelayed(1, 120000L);
    }

    public final boolean zag(Activity activity, LifecycleFragment lifecycleFragment, int i2, int i3, DialogInterface.OnCancelListener onCancelListener) {
        Dialog dialogZaa = zaa(activity, i2, zag.d(lifecycleFragment, getErrorResolutionIntent(activity, i2, "d"), 2), onCancelListener);
        if (dialogZaa == null) {
            return false;
        }
        zad(activity, dialogZaa, "GooglePlayServicesErrorDialog", onCancelListener);
        return true;
    }

    public final boolean zah(Context context, ConnectionResult connectionResult, int i2) {
        PendingIntent errorResolutionPendingIntent;
        if (com.google.android.gms.common.o.a.a(context) || (errorResolutionPendingIntent = getErrorResolutionPendingIntent(context, connectionResult)) == null) {
            return false;
        }
        zae(context, connectionResult.f(), null, PendingIntent.getActivity(context, 0, GoogleApiActivity.a(context, errorResolutionPendingIntent, i2, true), j.d.a.c.f.d.i.a | 134217728));
        return true;
    }
}
