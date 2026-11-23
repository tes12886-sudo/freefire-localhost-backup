package j.g.a.a.a.y;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class a {
    private final C0253a a;

    /* JADX INFO: renamed from: j.g.a.a.a.y.a$a, reason: collision with other inner class name */
    private static class C0253a {
        private final Set<Application.ActivityLifecycleCallbacks> a = new HashSet();
        private final Application b;

        /* JADX INFO: renamed from: j.g.a.a.a.y.a$a$a, reason: collision with other inner class name */
        class C0254a implements Application.ActivityLifecycleCallbacks {
            final /* synthetic */ b a;

            C0254a(C0253a c0253a, b bVar) {
                this.a = bVar;
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityCreated(Activity activity, Bundle bundle) {
                this.a.a(activity, bundle);
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityDestroyed(Activity activity) {
                this.a.b(activity);
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityPaused(Activity activity) {
                this.a.c(activity);
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityResumed(Activity activity) {
                this.a.d(activity);
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
                this.a.e(activity, bundle);
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityStarted(Activity activity) {
                this.a.f(activity);
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityStopped(Activity activity) {
                this.a.g(activity);
            }
        }

        C0253a(Application application) {
            this.b = application;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean b(b bVar) {
            Application application = this.b;
            if (application == null) {
                return false;
            }
            C0254a c0254a = new C0254a(this, bVar);
            application.registerActivityLifecycleCallbacks(c0254a);
            this.a.add(c0254a);
            return true;
        }
    }

    public static abstract class b {
        public void a(Activity activity, Bundle bundle) {
        }

        public void b(Activity activity) {
        }

        public void c(Activity activity) {
        }

        public void d(Activity activity) {
        }

        public void e(Activity activity, Bundle bundle) {
        }

        public abstract void f(Activity activity);

        public void g(Activity activity) {
        }
    }

    public a(Context context) {
        this.a = new C0253a((Application) context.getApplicationContext());
    }

    public boolean a(b bVar) {
        C0253a c0253a = this.a;
        return c0253a != null && c0253a.b(bVar);
    }
}
