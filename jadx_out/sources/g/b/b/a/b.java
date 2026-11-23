package g.b.b.a;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
public class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new a();
    final Handler a = null;
    g.b.b.a.a b;

    class a implements Parcelable.Creator<b> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public b createFromParcel(Parcel parcel) {
            return new b(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public b[] newArray(int i2) {
            return new b[i2];
        }
    }

    /* JADX INFO: renamed from: g.b.b.a.b$b, reason: collision with other inner class name */
    class BinderC0178b extends g.b.b.a.a.AbstractBinderC0176a {
        BinderC0178b() {
        }

        @Override // g.b.b.a.a
        public void k1(int i2, Bundle bundle) {
            b bVar = b.this;
            Handler handler = bVar.a;
            if (handler != null) {
                handler.post(bVar.new c(i2, bundle));
            } else {
                bVar.a(i2, bundle);
            }
        }
    }

    class c implements Runnable {
        final int a;
        final Bundle b;

        c(int i2, Bundle bundle) {
            this.a = i2;
            this.b = bundle;
        }

        @Override // java.lang.Runnable
        public void run() {
            b.this.a(this.a, this.b);
        }
    }

    b(Parcel parcel) {
        this.b = g.b.b.a.a.AbstractBinderC0176a.j(parcel.readStrongBinder());
    }

    protected void a(int i2, Bundle bundle) {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        synchronized (this) {
            if (this.b == null) {
                this.b = new BinderC0178b();
            }
            parcel.writeStrongBinder(this.b.asBinder());
        }
    }
}
