package j.d.a.c.f.c;

import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: loaded from: classes.dex */
public class a implements IInterface {
    private final IBinder a;

    protected a(IBinder iBinder, String str) {
        this.a = iBinder;
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this.a;
    }
}
