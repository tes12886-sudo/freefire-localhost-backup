package j.d.a.c.g.b;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.q;
import com.google.android.gms.common.internal.s0;

/* JADX INFO: loaded from: classes.dex */
public class a extends com.google.android.gms.common.internal.g<g> implements j.d.a.c.g.g {
    public static final /* synthetic */ int K = 0;
    private final boolean G;
    private final com.google.android.gms.common.internal.d H;
    private final Bundle I;
    private final Integer J;

    public a(Context context, Looper looper, boolean z, com.google.android.gms.common.internal.d dVar, Bundle bundle, com.google.android.gms.common.api.e.b bVar, com.google.android.gms.common.api.e.c cVar) {
        super(context, looper, 44, dVar, bVar, cVar);
        this.G = true;
        this.H = dVar;
        this.I = bundle;
        this.J = dVar.i();
    }

    public static Bundle r0(com.google.android.gms.common.internal.d dVar) {
        dVar.h();
        Integer numI = dVar.i();
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.google.android.gms.signin.internal.clientRequestedAccount", dVar.a());
        if (numI != null) {
            bundle.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", numI.intValue());
        }
        bundle.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", false);
        bundle.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", false);
        bundle.putString("com.google.android.gms.signin.internal.serverClientId", null);
        bundle.putBoolean("com.google.android.gms.signin.internal.usePromptModeForAuthCode", true);
        bundle.putBoolean("com.google.android.gms.signin.internal.forceCodeForRefreshToken", false);
        bundle.putString("com.google.android.gms.signin.internal.hostedDomain", null);
        bundle.putString("com.google.android.gms.signin.internal.logSessionId", null);
        bundle.putBoolean("com.google.android.gms.signin.internal.waitForAccessTokenRefresh", false);
        return bundle;
    }

    @Override // com.google.android.gms.common.internal.c
    protected final Bundle F() {
        if (!D().getPackageName().equals(this.H.f())) {
            this.I.putString("com.google.android.gms.signin.internal.realClientPackageName", this.H.f());
        }
        return this.I;
    }

    @Override // com.google.android.gms.common.internal.c
    protected final String J() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    @Override // com.google.android.gms.common.internal.c
    protected final String K() {
        return "com.google.android.gms.signin.service.START";
    }

    @Override // j.d.a.c.g.g
    public final void b() {
        r(new com.google.android.gms.common.internal.c.d());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // j.d.a.c.g.g
    public final void j(f fVar) {
        q.l(fVar, "Expecting a valid ISignInCallbacks");
        try {
            Account accountC = this.H.c();
            GoogleSignInAccount googleSignInAccountC = "<<default account>>".equals(accountC.name) ? com.google.android.gms.auth.api.signin.internal.c.b(D()).c() : null;
            Integer num = this.J;
            q.k(num);
            ((g) I()).q1(new j(1, new s0(accountC, num.intValue(), googleSignInAccountC)), fVar);
        } catch (RemoteException e) {
            Log.w("SignInClientImpl", "Remote service probably died when signIn is called");
            try {
                fVar.g0(new l(1, new ConnectionResult(8, null), null));
            } catch (RemoteException unused) {
                Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e);
            }
        }
    }

    @Override // com.google.android.gms.common.internal.c, com.google.android.gms.common.api.a.f
    public final int k() {
        return 12451000;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // j.d.a.c.g.g
    public final void o(com.google.android.gms.common.internal.j jVar, boolean z) {
        try {
            g gVar = (g) I();
            Integer num = this.J;
            q.k(num);
            gVar.p1(jVar, num.intValue(), z);
        } catch (RemoteException unused) {
            Log.w("SignInClientImpl", "Remote service probably died when saveDefaultAccount is called");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // j.d.a.c.g.g
    public final void p() {
        try {
            g gVar = (g) I();
            Integer num = this.J;
            q.k(num);
            gVar.c1(num.intValue());
        } catch (RemoteException unused) {
            Log.w("SignInClientImpl", "Remote service probably died when clearAccountFromSessionStore is called");
        }
    }

    @Override // com.google.android.gms.common.internal.c, com.google.android.gms.common.api.a.f
    public final boolean u() {
        return this.G;
    }

    @Override // com.google.android.gms.common.internal.c
    protected final /* synthetic */ IInterface x(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        return iInterfaceQueryLocalInterface instanceof g ? (g) iInterfaceQueryLocalInterface : new g(iBinder);
    }
}
