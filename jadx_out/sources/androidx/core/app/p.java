package androidx.core.app;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class p implements Iterable<Intent> {
    private final ArrayList<Intent> a = new ArrayList<>();
    private final Context b;

    public interface a {
        Intent i();
    }

    private p(Context context) {
        this.b = context;
    }

    public static p f(Context context) {
        return new p(context);
    }

    public p b(Intent intent) {
        this.a.add(intent);
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public p c(Activity activity) {
        Intent intentI = activity instanceof a ? ((a) activity).i() : null;
        if (intentI == null) {
            intentI = g.a(activity);
        }
        if (intentI != null) {
            ComponentName component = intentI.getComponent();
            if (component == null) {
                component = intentI.resolveActivity(this.b.getPackageManager());
            }
            d(component);
            b(intentI);
        }
        return this;
    }

    public p d(ComponentName componentName) {
        int size = this.a.size();
        try {
            Context context = this.b;
            while (true) {
                Intent intentB = g.b(context, componentName);
                if (intentB == null) {
                    return this;
                }
                this.a.add(size, intentB);
                context = this.b;
                componentName = intentB.getComponent();
            }
        } catch (PackageManager.NameNotFoundException e) {
            Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
            throw new IllegalArgumentException(e);
        }
    }

    public void h() {
        j(null);
    }

    @Override // java.lang.Iterable
    @Deprecated
    public Iterator<Intent> iterator() {
        return this.a.iterator();
    }

    public void j(Bundle bundle) {
        if (this.a.isEmpty()) {
            throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
        }
        ArrayList<Intent> arrayList = this.a;
        Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[arrayList.size()]);
        intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
        if (androidx.core.content.a.k(this.b, intentArr, bundle)) {
            return;
        }
        Intent intent = new Intent(intentArr[intentArr.length - 1]);
        intent.addFlags(268435456);
        this.b.startActivity(intent);
    }
}
